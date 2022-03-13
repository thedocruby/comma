package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.structure.ConfigClass;
import dev.thedocruby.mcereal.AnnotatedMCereal;
import org.jetbrains.annotations.NotNull;

import java.security.InvalidParameterException;

public class AnnotatedCommaConfig<C extends ConfigClass> extends BasicCommaConfig<C> implements AnnotatedConfig{
    public AnnotatedCommaConfig(@NotNull ConfigBuilder builder, @NotNull Class<C> configClass) throws InvalidParameterException {
        super(builder, configClass);
    }
}
