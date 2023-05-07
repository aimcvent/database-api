package fr.aimcvent.database.api.schema;

public interface Transactions {
    Schema begin();

    Schema commit();

    Schema rollback();
}
