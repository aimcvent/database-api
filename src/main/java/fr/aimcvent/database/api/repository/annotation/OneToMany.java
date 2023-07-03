package fr.aimcvent.database.api.repository.annotation;

import fr.aimcvent.database.api.repository.Fetch;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface OneToMany {
    Class<?> entity();

    String field() default "";
}
