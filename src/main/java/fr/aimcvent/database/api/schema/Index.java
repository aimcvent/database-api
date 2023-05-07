package fr.aimcvent.database.api.schema;

public interface Index {
    Index unique();

    Index concurrently();

    Index table(String table);

    Index method(Method method);

    Index column(IndexColumn column);

    Index drop();

    Index delete(References.Delete delete);

    enum Method {
        BTREE,
        HASH,
        GIST,
        SPGIST,
        GIN,
        BRIN
    }

    enum Nullable {
        LAST, FIRST
    }
}
