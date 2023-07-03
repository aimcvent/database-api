package fr.aimcvent.database.api.repository;

import java.util.List;
import java.util.Optional;

public interface InternalRepository {
    <T> List<T> all(Class<T> entity);

    <T> Optional<T> of(Class<T> entity, Object id);

    <T> int count(Class<T> entity);
}
