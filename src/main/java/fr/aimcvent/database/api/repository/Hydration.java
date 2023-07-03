package fr.aimcvent.database.api.repository;

import fr.aimcvent.database.api.Result;

import java.util.List;

public interface Hydration<T> {
    List<T> hydrate(Result result, ResultSet mapping);
}
