package fr.aimcvent.database.api.repository;

public interface ResultSetMapping {

    Class<?> entity();

    ResultSetMapping column(String field, String alias);

    ResultSet end();
}
