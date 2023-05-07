package fr.aimcvent.database.api.query;

import fr.aimcvent.database.api.Result;
import fr.aimcvent.database.api.query.part.Part;

import java.util.List;

public interface Query
{
    Query append(Part... parts);

    List<Result> results(Object... params);

    void execute(Object... params);
}
