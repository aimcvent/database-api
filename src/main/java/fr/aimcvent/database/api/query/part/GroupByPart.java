package fr.aimcvent.database.api.query.part;

public interface GroupByPart extends Part
{
    GroupByPart add(String... columns);
}
