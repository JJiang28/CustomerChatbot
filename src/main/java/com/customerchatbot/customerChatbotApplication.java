package com.customerchatbot;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class customerChatbotApplication extends Application<customerChatbotConfiguration> {

    public static void main(final String[] args) throws Exception {
        new customerChatbotApplication().run(args);
    }

    @Override
    public String getName() {
        return "customerChatbot";
    }

    @Override
    public void initialize(final Bootstrap<customerChatbotConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final customerChatbotConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
