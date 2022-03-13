package dev.thedocruby.mcereal;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.configurate.ConfigurateException;
import org.spongepowered.configurate.serialize.SerializationException;

import java.util.List;

public interface Serializer {
    void load() throws ConfigurateException;
    void save() throws ConfigurateException;

    @Nullable <T> T get(String[] path, Class<T> type) throws SerializationException;
    @Nullable <T> List<T> getList(String[] path, Class<T> type) throws SerializationException;
    @Nullable String getString(String[] path);

    @Nullable <T> T get(String[] path, Class<T> type, T defaultValue) throws SerializationException;
    @Nullable <T> List<T> getList(String[] path, Class<T> type, List<T> defaultValue) throws SerializationException;
    @Nullable String getString(String[] path, String defaultValue);

    <T> void set(String[] path, Class<T> type, @Nullable T value) throws SerializationException;
    <T> void setList(String[] path, Class<T> type, @Nullable List<T> value) throws SerializationException;
    void setString(String[] path, @Nullable String value) throws SerializationException;
}
