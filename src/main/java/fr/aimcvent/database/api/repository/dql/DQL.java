package fr.aimcvent.database.api.repository.dql;

import java.util.List;
import java.util.Map;

public interface DQL<T> {

    DQL<T> parameter(String key, Object param);

    DQL<T> parameters(Map<String, Object> params);

    List<T> results();
}
