package fr.aimcvent.database.api.repository.annotation;

import fr.aimcvent.database.api.repository.DefaultRepository;
import fr.aimcvent.database.api.repository.Repository;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Entity {
    Class<? extends Repository> repository() default DefaultRepository.class;
}
