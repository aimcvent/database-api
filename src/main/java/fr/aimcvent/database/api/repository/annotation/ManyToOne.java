package fr.aimcvent.database.api.repository.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface ManyToOne {
    String column() default "";

    Class<?> entity();
}
