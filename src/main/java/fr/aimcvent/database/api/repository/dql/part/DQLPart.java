package fr.aimcvent.database.api.repository.dql.part;

import fr.aimcvent.database.api.query.part.Part;

public interface DQLPart {
    Part toSQL();
}
