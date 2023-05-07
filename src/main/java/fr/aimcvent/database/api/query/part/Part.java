package fr.aimcvent.database.api.query.part;

public interface Part
{
    int position();

    default boolean repeatable()
    {
        return true;
    }
}
