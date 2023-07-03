package fr.aimcvent.database.api.repository;

public class DefaultRepository<T> extends AbstractRepository<T> {
    protected DefaultRepository(ORM orm, Class<T> entity) {
        super(orm, entity);
    }
}
