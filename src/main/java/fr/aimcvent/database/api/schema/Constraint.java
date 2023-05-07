package fr.aimcvent.database.api.schema;

public interface Constraint {

    String name();

    Constraint name(String name);

    Constraint type(Type type);

    Constraint in(String... columns);

    References references(String table, String... columns);

    Constraint table(Table table);

    Constraint drop();

    boolean isDrop();

    Constraint alter();

    boolean isAlter();

    enum Type {
        FOREIGN_KEY("fk"),
        UNIQUE("uniq");

        private String alias;

        Type(String alias) {
            this.alias = alias;
        }

        public String alias() {
            return this.alias;
        }
    }
}
