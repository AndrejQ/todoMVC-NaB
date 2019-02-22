package ru.hh.school;

import org.glassfish.jersey.server.mvc.mustache.MustacheMvcFeature;
import ru.hh.nab.starter.NabApplication;


public class Application {
    public static void main(String[] args) {
        NabApplication.builder()
                .configureJersey(ApplicationJerseyConfig.class)
                .registerProperty(MustacheMvcFeature.TEMPLATE_BASE_PATH, "vanilla-es6")
                .registerResources(MustacheMvcFeature.class)
                .bindToRoot()
                .build().run(ApplicationConfig.class);
    }
}
