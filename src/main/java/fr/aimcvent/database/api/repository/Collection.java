package fr.aimcvent.database.api.repository;

public interface Collection<E> extends Iterable<E> {

    E of(int index);

    boolean contains(E entity);

    Collection<E> add(E entity);

    Collection<E> remove(E entity);

    Collection<E> clear();

    int count();

    boolean isEmpty();

    E[] toArray();
}
