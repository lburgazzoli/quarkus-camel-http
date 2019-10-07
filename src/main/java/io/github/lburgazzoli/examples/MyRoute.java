package io.github.lburgazzoli.examples;

import org.apache.camel.builder.RouteBuilder;

public class MyRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("platform-http:/platform-http/hello?httpMethodRestrict=GET")
            .setBody(simple("Hello ${header.name}"));
    }
}