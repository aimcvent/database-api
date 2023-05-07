package fr.aimcvent.database.api.query.part;

import fr.aimcvent.database.api.query.Query;

public interface FromPart extends Part
{
    String table();

    FromPart set(String table);

    FromPart set(String table, String alias);

    FromPart set(Query query, String alias);
}
