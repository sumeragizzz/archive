package jaxrs.linebot.resource;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

@ApplicationPath("api")
public class LineBotResourceConfig extends ResourceConfig {

    public LineBotResourceConfig() {
        packages(LineBotResourceConfig.class.getPackage().getName());
        property(ServerProperties.PROVIDER_SCANNING_RECURSIVE, false);
    }

}
