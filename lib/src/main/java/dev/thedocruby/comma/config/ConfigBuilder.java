package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.structure.ConfigClass;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;

public class ConfigBuilder {
    @NotNull
    protected String modId;
    @NotNull
    protected String savePath = "/config/";

    public ConfigBuilder() {
        modId = "modid";
    }

    public ConfigBuilder setModId(@NotNull String modId) {
        this.modId = modId;
        return this;
    }

    public ConfigBuilder setSavePath(@NotNull String savePath) {
        this.savePath = savePath;
        return this;
    }

    public <C extends ConfigClass, T extends Config<C>> T build(@NotNull Class<T> configType, @NotNull Class<C> configClass) throws ConfigBuilderException {
        try {
            return configType.getConstructor(this.getClass(), configClass.getClass()).newInstance(this, configClass);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new ConfigBuilderException(e);
        }
    }

    private static class ConfigBuilderException extends Exception {
        public ConfigBuilderException() { super(); }
        public ConfigBuilderException(String message) { super(message); }
        public ConfigBuilderException(String message, Throwable cause) { super(message, cause); }
        public ConfigBuilderException(Throwable cause) { super(cause); }
    }
}
