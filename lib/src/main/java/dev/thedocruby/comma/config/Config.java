package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.structure.ConfigClass;
import dev.thedocruby.mcereal.MCerealizer;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.configurate.ConfigurateException;

public class Config<C extends ConfigClass> {
    @Getter @NotNull
    protected String modId;
    @Getter @NotNull
    protected String savePath;
    protected MCerealizer serializer;

    protected Config(@NotNull ConfigBuilder builder, @NotNull Class<C> configClass) throws IllegalArgumentException {
        this.modId = builder.modId;
        this.savePath = builder.savePath;
        this.serializer = new MCerealizer(this.savePath);
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
