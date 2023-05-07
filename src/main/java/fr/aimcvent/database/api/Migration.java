package fr.aimcvent.database.api;

import fr.aimcvent.database.api.schema.Schema;

public interface Migration {
    String table();

    void up(Schema schema);

    void down(Schema schema);
}
