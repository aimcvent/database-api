package fr.aimcvent.database.api.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    List<T> all();

    Optional<T> of(Object id);

    int count();
}
