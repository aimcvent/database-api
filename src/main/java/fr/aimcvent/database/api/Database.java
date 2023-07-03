package fr.aimcvent.database.api;

import fr.aimcvent.database.api.exception.DatabaseException;
import fr.aimcvent.database.api.query.Expression;
import fr.aimcvent.database.api.query.Query;
import fr.aimcvent.database.api.query.QueryBuilder;
import fr.aimcvent.database.api.repository.ORM;
import fr.aimcvent.database.api.schema.Schema;

import java.util.List;

public interface Database
{
    ORM orm();

    void connect() throws DatabaseException;

    void reconnect() throws DatabaseException;

    void disconnect() throws DatabaseException;

    Expression expr();

    Schema schema();

    QueryBuilder query(String table);

    QueryBuilder query(String table, String alias);

    List<Result> results(Query query, Object... params) throws DatabaseException;

    void execute(Schema schema) throws DatabaseException;

    void execute(Query query, Object... params) throws DatabaseException;
}
