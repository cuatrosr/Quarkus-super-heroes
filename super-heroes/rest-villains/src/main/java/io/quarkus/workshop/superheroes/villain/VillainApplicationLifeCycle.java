package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import jakarta.enterprise.event.Observes;
import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VillainApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(VillainApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("The application VILLAIN is starting with profile " + ProfileManager.getActiveProfile());
        LOGGER.info(" _   _ _ _ _       _          ___  ______ _____ ");
        LOGGER.info("| | | (_) | |     (_)        / _ \\ | ___ \\_   _|");
        LOGGER.info("| | | |_| | | __ _ _ _ __   / /_\\ \\| |_/ / | |  ");
        LOGGER.info("| | | | | | |/ _` | | '_ \\  |  _  ||  __/  | |  ");
        LOGGER.info("\\ \\_/ / | | | (_| | | | | | | | | || |    _| |_ ");
        LOGGER.info(" \\___/|_|_|_|\\__,_|_|_| |_| \\_| |_/\\_|    \\___/ ");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}
