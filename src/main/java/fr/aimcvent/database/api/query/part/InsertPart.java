package fr.aimcvent.database.api.query.part;

import fr.aimcvent.database.api.query.InsertRaw;

public interface InsertPart extends Part
{
    InsertPart add(String... columns);
    InsertPart add(InsertRaw... columns);

    InsertPart add(int count, String... columns);
    InsertPart add(int count, InsertRaw... columns);
}
