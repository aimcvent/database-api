package fr.aimcvent.database.api.schema;

import java.util.List;

public interface Schema {
    List<Object> requests();

    Table table(String table);

    Column column(String column);

    Index index(String index);

    IndexColumn indexColumn(String column);

    Function function(String name);

    Constraint constraints(Constraint.Type type);

    Transactions transactions();

    boolean hasTransaction();
}
