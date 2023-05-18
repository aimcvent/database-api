package fr.aimcvent.database.api;

import fr.aimcvent.database.api.schema.Schema;

public interface Migration {
    default String description() {
        return null;
    }

    void up(Schema schema);

    void down(Schema schema);
}
