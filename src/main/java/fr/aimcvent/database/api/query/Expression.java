package fr.aimcvent.database.api.query;

import fr.aimcvent.database.api.query.part.ClausePart;

public interface Expression
{
    String alias(String column, String alias);

    String is(String column, String param);

    String isNull(String column);

    String isNotNull(String column);

    String equals(String column, String param);

    String in(String column, String param);

    String in(String column, QueryBuilder query);

    String lt(String column, String param);

    String lte(String column, String param);

    String gt(String column, String param);

    String gte(String column, String param);

    String diff(String column, String param);

    String andX(String... clauses);
    String orX(String... clauses);

    String excluded(String excluded);

    ClausePart clause();

    InsertRaw insertRaw(String column, String value);
}
