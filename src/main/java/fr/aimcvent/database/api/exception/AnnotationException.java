package fr.aimcvent.database.api.exception;

public class AnnotationException extends DatabaseException {
    public AnnotationException()
    {
        super();
    }

    public AnnotationException(String message)
    {
        super(message);
    }

    public AnnotationException(Throwable throwable)
    {
        super(throwable);
    }

    public AnnotationException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

    public AnnotationException(
            String message,
            Throwable throwable,
            boolean fillStackTrace,
            boolean keepSuppressedException
    ) {
        super(message, throwable, fillStackTrace, keepSuppressedException);
    }
}
