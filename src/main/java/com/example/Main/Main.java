package com.example.Main;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("**********");
        builder.enableIntents(GatewayIntent.GUILD_MESSAGES);
        builder.addEventListeners(new MessageListener());
        builder.build();
    }
}
