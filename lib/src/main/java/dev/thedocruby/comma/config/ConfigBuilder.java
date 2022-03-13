package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.annotation.ConfigType;
import dev.thedocruby.comma.config.structure.ConfigClass;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;

public class ConfigBuilder<C extends ConfigClass> {
    @NotNull
    protected String modId = "modid";
    @NotNull
    protected String savePath = "/config/";
    @NotNull
    protected Class<C> configClass;
    protected Class<? extends CommaConfig> configType;

    public ConfigBuilder(@NotNull Class<C> configClass) {
        this.configClass = configClass;
        this.configType = configClass.getAnnotation(ConfigType.class).type().getTypeClass();
    }

    public ConfigBuilder<C> setModId(@NotNull String modId) {
        this.modId = modId;
        return this;
    }

    public ConfigBuilder<C> setSavePath(@NotNull String savePath) {
        this.savePath = savePath;
        return this;
    }

    public Config build() throws ConfigBuilderException {
        try {
            return configType.getConstructor(this.getClass(), Class.class).newInstance(this, configClass);
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new ConfigBuilderException(e);
        }
    }

    protected static class ConfigBuilderException extends Exception {
        public ConfigBuilderException() { super(); }
        public ConfigBuilderException(String message) { super(message); }
        public ConfigBuilderException(String message, Throwable cause) { super(message, cause); }
        public ConfigBuilderException(Throwable cause) { super(cause); }
    }
}
