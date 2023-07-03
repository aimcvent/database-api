package fr.aimcvent.database.api.exception;

public class EntityException extends DatabaseException {
    public EntityException()
    {
        super();
    }

    public EntityException(String message)
    {
        super(message);
    }

    public EntityException(Throwable throwable)
    {
        super(throwable);
    }

    public EntityException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

    public EntityException(
            String message,
            Throwable throwable,
            boolean fillStackTrace,
            boolean keepSuppressedException
    ) {
        super(message, throwable, fillStackTrace, keepSuppressedException);
    }
}
