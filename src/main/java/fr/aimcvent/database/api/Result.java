package fr.aimcvent.database.api;

public interface Result
{
    <T> T of(String column);

    <T> T of(String column, T def);
}
