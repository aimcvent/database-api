package fr.aimcvent.database.api.query.part;

import fr.aimcvent.database.api.query.Order;

public interface OrderByPart extends Part
{
    OrderByPart add(String column);

    OrderByPart add(String column, Order order);
}
