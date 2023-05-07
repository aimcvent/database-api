package fr.aimcvent.database.api.query.part;

import fr.aimcvent.database.api.query.Join;
import fr.aimcvent.database.api.query.Query;

public interface JoinPart extends Part
{
    JoinPart add(Join join, String table, String alias, String condition);

    JoinPart add(Join join, Query query, String alias, String condition);
}
