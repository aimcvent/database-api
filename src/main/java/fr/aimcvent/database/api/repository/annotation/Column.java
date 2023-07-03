package fr.aimcvent.database.api.repository.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface Column {
    String name() default "";

    boolean primary() default false;
}
