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

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.configurate.CommentedConfigurationNode;
import org.spongepowered.configurate.ConfigurateException;
import org.spongepowered.configurate.hocon.HoconConfigurationLoader;
import org.spongepowered.configurate.serialize.SerializationException;

import org.jetbrains.annotations.Nullable;
import java.nio.file.Path;
import java.util.List;

public class MCerealizer {
    @Getter @NotNull
    protected final String filePath;
    protected final HoconConfigurationLoader loader;
    protected CommentedConfigurationNode rootNode;

    public MCerealizer(String filePath) {
        this.filePath = filePath;
        this.loader = HoconConfigurationLoader.builder().path(Path.of(this.filePath)).build();
    }

    public void load() throws ConfigurateException {
        rootNode = loader.load();
    }
    
    public void save() throws ConfigurateException {
        loader.save(rootNode);
    }

    @Nullable
    public String getString(String[] path, String defaultValue) {
        return rootNode.node((Object[]) path).getString(defaultValue);
    }

    public boolean getBoolean(String[] path, boolean defaultValue) {
        return rootNode.node((Object[]) path).getBoolean(defaultValue);
    }

    public int getInt(String[] path, int defaultValue) {
        return rootNode.node((Object[]) path).getInt(defaultValue);
    }

    public long getLong(String[] path, long defaultValue) {
        return rootNode.node((Object[]) path).getLong(defaultValue);
    }

    public float getFloat(String[] path, float defaultValue) {
        return rootNode.node((Object[]) path).getFloat(defaultValue);
    }

    public double getDouble(String[] path, double defaultValue) {
        return rootNode.node((Object[]) path).getDouble(defaultValue);
    }

    @Nullable
    public <T> List<T> getList(String[] path, Class<T> type, List<T> defaultValue) throws SerializationException {
        return rootNode.node((Object[]) path).getList(type, defaultValue);
    }

    @Nullable
    public <T> T get(String[] path, Class<T> type, T defaultValue) throws SerializationException {
        return rootNode.node((Object[]) path).get(type, defaultValue);
    }

    @Nullable
    public String getString(String[] path) {
        return rootNode.node((Object[]) path).getString();
    }

    public boolean getBoolean(String[] path) {
        return rootNode.node((Object[]) path).getBoolean();
    }

    public int getInt(String[] path) {
        return rootNode.node((Object[]) path).getInt();
    }

    public long getLong(String[] path) {
        return rootNode.node((Object[]) path).getLong();
    }

    public float getFloat(String[] path) {
        return rootNode.node((Object[]) path).getFloat();
    }

    public double getDouble(String[] path) {
        return rootNode.node((Object[]) path).getDouble();
    }

    @Nullable
    public <T> List<T> getList(String[] path, Class<T> type) throws SerializationException {
        return rootNode.node((Object[]) path).getList(type);
    }

    @Nullable
    public <T> T get(String[] path, Class<T> type) throws SerializationException {
        return rootNode.node((Object[]) path).get(type);
    }

    public void setString(String[] path, @Nullable String value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setBoolean(String[] path, boolean value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setInt(String[] path, int value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setLong(String[] path, long value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setFloat(String[] path, float value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setDouble(String[] path, double value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public <T> void setList(String[] path, Class<T> type, @Nullable List<T> value) throws SerializationException {
        rootNode.node((Object[]) path).setList(type, value);
    }

    public <T> void set(String[] path, Class<T> type, @Nullable T value) throws SerializationException {
        rootNode.node((Object[]) path).set(type, value);
    }
}
