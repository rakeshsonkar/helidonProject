package in.jpahibernate.mp.jpahibernate;

import java.io.IOException;
import java.util.logging.LogManager;


import io.helidon.microprofile.server.Server;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("testing by Rakesh");
		setupLogging();

        Server server = startServer();
        System.out.println(server);
	}
	static Server startServer() {
        // Server will automatically pick up configuration from
        // microprofile-config.properties
        // and Application classes annotated as @ApplicationScoped
        return Server.create().start();
    }

    /**
     * Configure logging from logging.properties file.
     */
    private static void setupLogging() throws IOException {
        // load logging configuration
        LogManager.getLogManager().readConfiguration(
                Main.class.getResourceAsStream("/logging.properties"));
    }

}
