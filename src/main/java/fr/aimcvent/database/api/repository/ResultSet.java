package fr.aimcvent.database.api.repository;

public interface ResultSet {
    ResultSetMapping start(Class<?> entity, String alias);
}
