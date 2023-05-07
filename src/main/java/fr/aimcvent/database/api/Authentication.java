package fr.aimcvent.database.api;

import java.nio.charset.Charset;

public interface Authentication
{
    String host();

    String port();

    String database();

    String username();

    String password();

    Charset charset();
}
