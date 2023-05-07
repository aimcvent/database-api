package fr.aimcvent.database.api.query.part;

import fr.aimcvent.database.api.query.Clause;

public interface ClausePart extends Part
{
    ClausePart add(String where);

    ClausePart add(Clause clause, String closeWhere);

    ClausePart add(ClausePart clausePart);

    ClausePart add(Clause clause, ClausePart clausePart);
}
