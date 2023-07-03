package fr.aimcvent.database.api.repository.dql.part;

public interface FromDQLPart extends DQLPart {
    Class<?> entity();

    FromDQLPart set(Class<?> entity, String alias);
}
