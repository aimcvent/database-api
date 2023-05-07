package fr.aimcvent.database.api.schema;

import fr.aimcvent.database.api.query.Order;

public interface IndexColumn {
    IndexColumn order(Order order);

    IndexColumn orderNullable(Index.Nullable nullable);
}
