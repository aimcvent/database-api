package fr.aimcvent.database.api.repository;

public interface Cache {
    boolean has(Object entity);

    boolean has(Class<?> entity, Object... ids);

    Object of(Object entity);

    Object of(Class<?> entity, Object... ids);

    Cache add(Object entity);

    Cache remove(Object entity);
}
