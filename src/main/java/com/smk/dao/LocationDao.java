package com.smk.dao;

import com.smk.model.Location;

import java.sql.Connection;
import java.util.Collection;
import java.util.Optional;

public class LocationDao implements Dao<Location, Integer>{
    private final Optional<Connection> connection;

    public LocationDao(){
        connection = JdbcConnection.getConnection();
    }
    @Override
    public Optional<Location> get(int id) {
        return Optional.empty();
    }

    @Override
    public Collection<Location> getAll() {
        return null;
    }

    @Override
    public Optional<Location> save(Location location) {
        return Optional.empty();
    }

    @Override
    public void update(Location location) {

    }

    @Override
    public void delete(Location location) {

    }

    @Override
    public Collection<Location> search(String keyword) {
        return null;
    }
}
