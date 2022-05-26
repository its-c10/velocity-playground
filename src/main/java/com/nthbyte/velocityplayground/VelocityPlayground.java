package com.nthbyte.velocityplayground;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

import java.nio.file.Path;

@Plugin(
        id = "velocity_playground",
        name = "VelocityPlayground",
        version = "1.0-SNAPSHOT",
        description = "This is my first velocity plugin!",
        authors = {"C10"}
)
public class VelocityPlayground {

    private final ProxyServer server;
    private final Logger logger;
    private final Path dataFolderPath;

    @Inject
    public VelocityPlayground(ProxyServer server, Logger logger, @DataDirectory Path dataFolderPath){
        this.server = server;
        this.logger = logger;
        this.dataFolderPath = dataFolderPath;
        logger.info("I have made my first velocity plugin!");
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event){
        this.server.getEventManager().register(this, new PluginListener());
    }

}
