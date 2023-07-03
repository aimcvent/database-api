package fr.aimcvent.database.api.repository.dql.part;

public interface SelectDQLPart extends DQLPart {
    SelectDQLPart add(String... column);
}
