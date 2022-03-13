package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.structure.ConfigClass;
import dev.thedocruby.mcereal.AnnotatedMCerealizer;
import org.jetbrains.annotations.NotNull;

public class AnnotatedConfig<C extends ConfigClass> extends Config<C> {
    public AnnotatedConfig(@NotNull ConfigBuilder builder, @NotNull Class<C> configClass) throws IllegalArgumentException {
        super(builder, configClass);
        this.serializer = new AnnotatedMCerealizer(this.savePath);
    }
}
