package ru.hh.school.resource;

import javax.ws.rs.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Path("/")
public class FrontendResource {
    String pathToResources = "src/main/resources/vanillajs/";

    @GET
    @Path("/")
    public FileInputStream loadHtml() {
        File html = new File(pathToResources + "index.html");
        try {
            return new FileInputStream(html);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GET
    @Path("/node_modules/todomvc-app-css/index.css")
    public FileInputStream loadIndexCss() {
        File css = new File(pathToResources + "node_modules/todomvc-app-css/index.css");
        try {
            return new FileInputStream(css);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GET
    @Path("/node_modules/todomvc-common/base.css")
    public FileInputStream loadBaseCss() {
        File css = new File(pathToResources + "node_modules/todomvc-common/base.css");
        try {
            return new FileInputStream(css);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GET
    @Path("/dist/bundle.js")
    public FileInputStream loadBundleJs() {
        File css = new File(pathToResources + "dist/bundle.js");
        try {
            return new FileInputStream(css);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GET
    @Path("/node_modules/todomvc-common/base.js")
    public FileInputStream loadBaseJs() {
        File css = new File(pathToResources + "node_modules/todomvc-common/base.js");
        try {
            return new FileInputStream(css);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GET
    @Path("/js/{script}")
    public FileInputStream loadJs(@PathParam("script") String script) {
        File css = new File(pathToResources + "js/" + script);
        try {
            return new FileInputStream(css);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
