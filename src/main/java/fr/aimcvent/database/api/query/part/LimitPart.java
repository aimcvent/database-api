package fr.aimcvent.database.api.query.part;

public interface LimitPart extends Part
{
    LimitPart set(int limit);

    LimitPart set(int limit, int offset);
}
