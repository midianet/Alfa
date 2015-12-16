package midianet.alfa.app;

import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class Application extends ResourceConfig {

    public Application() {
        System.out.println("Application started!");
        packages("midianet.alfa");
    }

}