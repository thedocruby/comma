package dev.thedocruby.mcereal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.configurate.serialize.SerializationException;

import java.util.List;
import java.util.Map;

public interface AnnotatedSerializer extends BasicSerializer {
    @Nullable String getComment(String[] path);

    void setComment(String[] path, @Nullable String comment);
    void setCommentIfAbsent(String[] path, @NotNull String comment);
    void setComments(Map<String[], @Nullable String> comments);
    void setCommentsIfAbsent(Map<String[], @NotNull String> comments);

    <T> void set(String[] path, Class<T> type, @Nullable T value, @Nullable String comment) throws SerializationException;
    <T> void setList(String[] path, Class<T> type, @Nullable List<T> value, @Nullable String comment) throws SerializationException;
    void setString(String[] path, @Nullable String value, @Nullable String comment) throws SerializationException;

    void setBoolean(String[] path, boolean value, @Nullable String comment) throws SerializationException;
    void setInt(String[] path, int value, @Nullable String comment) throws SerializationException;
    void setLong(String[] path, long value, @Nullable String comment) throws SerializationException;
    void setFloat(String[] path, float value, @Nullable String comment) throws SerializationException;
    void setDouble(String[] path, double value, @Nullable String comment) throws SerializationException;
}
