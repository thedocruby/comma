/*
 * Copyright (C) 2022 Dr. Rubisco
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
 */

package dev.thedocruby.mcereal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.configurate.serialize.SerializationException;

import java.util.List;
import java.util.Map;

public class AnnotatedMCerealizer extends MCerealizer{

    public AnnotatedMCerealizer(String filePath) {
        super(filePath);
    }

    @Nullable
    public String getComment(String[] path) {
        return rootNode.node((Object[]) path).comment();
    }

    public void setString(String[] path, @Nullable String value, @Nullable String comment) throws SerializationException {
        rootNode.node((Object[]) path).act(node -> {
            node.set(value);
            node.comment(comment);
        });
    }

    public void setBoolean(String[] path, boolean value, @Nullable String comment) throws SerializationException {
        rootNode.node((Object[]) path).act(node -> {
            node.set(value);
            node.comment(comment);
        });
    }

    public void setInt(String[] path, int value, @Nullable String comment) throws SerializationException {
        rootNode.node((Object[]) path).act(node -> {
            node.set(value);
            node.comment(comment);
        });
    }

    public void setLong(String[] path, long value, @Nullable String comment) throws SerializationException {
        rootNode.node((Object[]) path).act(node -> {
            node.set(value);
            node.comment(comment);
        });
    }

    public void setFloat(String[] path, float value, @Nullable String comment) throws SerializationException {
        rootNode.node((Object[]) path).act(node -> {
            node.set(value);
            node.comment(comment);
        });
    }

    public void setDouble(String[] path, double value, @Nullable String comment) throws SerializationException {
        rootNode.node((Object[]) path).act(node -> {
            node.set(value);
            node.comment(comment);
        });
    }

    public <T> void setList(String[] path, Class<T> type, @Nullable List<T> value, @Nullable String comment) throws SerializationException {
        rootNode.node((Object[]) path).act(node -> {
            node.setList(type, value);
            node.comment(comment);
        });
    }

    public <T> void set(String[] path, Class<T> type, @Nullable T value, @Nullable String comment) throws SerializationException {
        rootNode.node((Object[]) path).act(node -> {
            node.set(type, value);
            node.comment(comment);
        });
    }

    public void setComment(String[] path, String comment){
        rootNode.node((Object[]) path).comment(comment);
    }

    public void setCommentIfAbsent(String[] path, @NotNull String comment){
        rootNode.node((Object[]) path).commentIfAbsent(comment);
    }

    public void setComments(Map<String[], String> comments){
        if (comments == null || comments.isEmpty()) return;
        comments.forEach((path, comment) -> this.rootNode.node((Object[]) path).comment(comment));
    }

    public void setCommentsIfAbsent(Map<String[], @NotNull String> comments){
        if (comments == null || comments.isEmpty()) return;
        comments.forEach((path, comment) -> rootNode.node((Object[]) path).commentIfAbsent(comment));
    }
}
