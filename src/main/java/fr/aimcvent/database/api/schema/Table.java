package fr.aimcvent.database.api.schema;

public interface Table {

    String name();

    Table name(String name);

    Table column(Column column);

    Table primary(String... columns);

    Table constraints(Constraint constraints);

    Table constraints(References references);

    Table drop();

    Table alter();
}
