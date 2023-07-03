package fr.aimcvent.database.api.repository;

public interface Repositories {
    InternalRepository internal();

    <T> Repository<T> of(Class<T> entity);
}
