package fr.aimcvent.database.api.exception;

public class PrimaryNotFoundException extends DatabaseException {
    public PrimaryNotFoundException()
    {
        super();
    }

    public PrimaryNotFoundException(String message)
    {
        super(message);
    }

    public PrimaryNotFoundException(Throwable throwable)
    {
        super(throwable);
    }

    public PrimaryNotFoundException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

    public PrimaryNotFoundException(
            String message,
            Throwable throwable,
            boolean fillStackTrace,
            boolean keepSuppressedException
    ) {
        super(message, throwable, fillStackTrace, keepSuppressedException);
    }
}
