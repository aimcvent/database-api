package fr.aimcvent.database.api.schema;

public interface Column {

    String name();

    Column name(String name);

    Column type(String type);

    Column primary();

    Column nullable();

    Column def(Object def);

    Column alter();

    boolean isAlter();

    Column drop();

    boolean isDrop();
}
