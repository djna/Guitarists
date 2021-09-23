package org.djna.guitarists;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.djna.guitarists.data.GuitaristList;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class Main {
    static final String siteListUrl =  "http://localhost:8080/Guitarists.json";

    static final Logger theLogger = LogManager.getLogger("Weather");
    public static void main(String[] args) {
        theLogger.info("Application Started");

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        GuitaristList guitarists = client.target(siteListUrl)
                .request(MediaType.APPLICATION_JSON)
                .get(GuitaristList.class);


        theLogger.info("Got {}", guitarists);

    }
}	
