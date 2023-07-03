package fr.aimcvent.database.api.repository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractRepository<T> implements Repository<T> {
    protected final Class<T> entity;
    protected final ORM orm;

    protected AbstractRepository(ORM orm, Class<T> entity) {
        this.entity = entity;
        this.orm = orm;
    }

    @Override
    public List<T> all() {
        return this.orm.repositories().internal().all(this.entity);
    }

    @Override
    public Optional<T> of(Object id) {
        return this.orm.repositories().internal().of(this.entity, id);
    }

    @Override
    public int count() {
        return this.orm.repositories().internal().count(this.entity);
    }
}
