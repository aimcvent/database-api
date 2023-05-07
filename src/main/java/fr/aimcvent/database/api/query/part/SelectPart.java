package fr.aimcvent.database.api.query.part;

import fr.aimcvent.database.api.query.Query;

public interface SelectPart extends Part
{
    SelectPart add(String... columns);

    SelectPart add(Query query, String alias);
}
