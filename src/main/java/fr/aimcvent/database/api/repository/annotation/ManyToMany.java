package fr.aimcvent.database.api.repository.annotation;

import fr.aimcvent.database.api.repository.Fetch;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface ManyToMany {
    Class<?> entity();

    String table();

    String column();

    String selfColumn();
}
