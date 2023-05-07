package fr.aimcvent.database.api;

import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;

public interface DatabaseService extends Service, WithConfiguration {
    Database database();
}
