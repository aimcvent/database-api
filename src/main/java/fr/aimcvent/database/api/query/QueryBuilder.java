package fr.aimcvent.database.api.query;

import fr.aimcvent.database.api.query.part.ClausePart;

public interface QueryBuilder
{
    QueryBuilder select(String... columns);

    QueryBuilder select(QueryBuilder query, String alias);

    QueryBuilder insert(String... columns);

    QueryBuilder insert(InsertRaw... columns);

    QueryBuilder insert(int count, String... columns);

    QueryBuilder insert(int count, InsertRaw... columns);

    QueryBuilder update();

    QueryBuilder delete();

    QueryBuilder set(String expression);

    QueryBuilder from(String table);

    QueryBuilder from(String table, String alias);

    QueryBuilder from(QueryBuilder query, String alias);

    QueryBuilder join(String table, String alias, String condition);

    QueryBuilder join(QueryBuilder query, String alias, String condition);

    QueryBuilder join(Join join, String table, String alias, String condition);

    QueryBuilder join(Join join, QueryBuilder query, String alias, String condition);

    QueryBuilder where(String where);

    QueryBuilder where(Clause clause, String closeWhere);

    QueryBuilder where(ClausePart wherePart);

    QueryBuilder where(Clause clause, ClausePart wherePart);

    QueryBuilder groupBy(String... columns);

    QueryBuilder having(String where);

    QueryBuilder having(Clause clause, String closeWhere);

    QueryBuilder having(ClausePart wherePart);

    QueryBuilder having(Clause clause, ClausePart wherePart);

    QueryBuilder orderBy(String column);

    QueryBuilder orderBy(String column, Order order);

    QueryBuilder limit(int limit);

    QueryBuilder limit(int limit, int offset);

    QueryBuilder onConflict(String... columns);

    QueryBuilder doUpdate(String expression);

    QueryBuilder doNothing();

    ClausePart create();

    Expression expr();

    Query build();
}
