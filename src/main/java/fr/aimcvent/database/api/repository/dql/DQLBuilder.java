package fr.aimcvent.database.api.repository.dql;

import fr.aimcvent.database.api.query.Clause;
import fr.aimcvent.database.api.query.Expression;
import fr.aimcvent.database.api.query.Join;
import fr.aimcvent.database.api.query.Order;
import fr.aimcvent.database.api.query.part.ClausePart;

public interface DQLBuilder<T> {
    DQLBuilder<T> select(String... alias);

    DQLBuilder<T> from(Class<?> entity, String alias);

    DQLBuilder<T> join(Class<?> entity, String alias, String condition);

    DQLBuilder<T> join(Join join, Class<?> entity, String alias, String condition);

    DQLBuilder<T> join(Join join, String table, String alias, String condition);

    DQLBuilder<T> where(String where);

    DQLBuilder<T> where(Clause clause, String closeWhere);

    DQLBuilder<T> where(ClausePart wherePart);

    DQLBuilder<T> where(Clause clause, ClausePart wherePart);

    DQLBuilder<T> groupBy(String... columns);

    DQLBuilder<T> having(String where);

    DQLBuilder<T> having(Clause clause, String closeWhere);

    DQLBuilder<T> having(ClausePart wherePart);

    DQLBuilder<T> having(Clause clause, ClausePart wherePart);

    DQLBuilder<T> orderBy(String column);

    DQLBuilder<T> orderBy(String column, Order order);

    DQLBuilder<T> limit(int limit);

    DQLBuilder<T> limit(int limit, int offset);

    ClausePart create();

    Expression expr();

    DQL<T> build();
}
