package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.structure.ConfigClass;
import dev.thedocruby.mcereal.MCereal;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.configurate.ConfigurateException;

import java.security.InvalidParameterException;

public class CommaConfig<C extends ConfigClass> implements Config{
    @Getter @NotNull
    protected String modId;
    @Getter @NotNull
    protected String savePath;
    protected MCereal serializer;
    protected Class<C> configClass;

    protected CommaConfig(@NotNull ConfigBuilder<C> builder, @NotNull Class<C> configClass) throws InvalidParameterException {
        this.modId = builder.modId;
        this.savePath = builder.savePath;
        this.serializer = new MCereal(this.savePath);
        this.configClass = configClass;
    }

    public void load() {
        try {
            serializer.load();
        } catch (ConfigurateException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try {
            serializer.save();
        } catch (ConfigurateException e) {
            e.printStackTrace();
        }
    }
}
