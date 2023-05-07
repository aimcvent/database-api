package fr.aimcvent.database.api.schema;

public interface References {
    References onDelete(Delete delete);

    References table(String table);

    References columns(String... columns);



    Constraint constraints();

    enum Delete {
        RESTRICT,
        CASCADE,
        SET_NULL
    }
}
