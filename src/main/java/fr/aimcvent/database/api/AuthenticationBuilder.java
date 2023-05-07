package fr.aimcvent.database.api;

import java.nio.charset.Charset;

public interface AuthenticationBuilder {

    AuthenticationBuilder host(String host);

    AuthenticationBuilder port(String port);

    AuthenticationBuilder database(String database);

    AuthenticationBuilder username(String username);

    AuthenticationBuilder password(String password);

    AuthenticationBuilder charset(Charset charset);

    Authentication build();
}
