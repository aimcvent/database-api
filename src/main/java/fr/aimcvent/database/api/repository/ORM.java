package fr.aimcvent.database.api.repository;

import fr.aimcvent.database.api.Database;
import fr.aimcvent.database.api.repository.dql.DQLBuilder;

public interface ORM {

    Database database();

    <T> DQLBuilder<T> create(Class<?> entity, String alias);

    <E> Collection<E> newCollection(Class<E> entity, Object parent);

    <E> Collection<E> newCollection(Class<E> entity, Object parent, Fetch fetch);

    ResultSet newResultSet();

    <T> Hydration<T> hydration();

    Cache cache();

    Repositories repositories();

    ORM persist(Object entity);

    ORM delete(Object entity);

    ORM flush();
}
