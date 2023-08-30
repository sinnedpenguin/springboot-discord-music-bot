package com.sinnedpenguin.springbootdiscordmusicbot.configuration;

import com.sinnedpenguin.springbootdiscordmusicbot.commands.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.security.auth.login.LoginException;

@Configuration
public class BotConfiguration {

    @Value("${bot.token}")
    private String botToken;

    @Bean
    public JDA startBot() throws LoginException {
        JDA jda = JDABuilder.createDefault(botToken).build();

        CommandManager manager = new CommandManager();
        manager.add(new Play());
        manager.add(new Skip());
        manager.add(new Stop());
        manager.add(new NowPlaying());
        manager.add(new Queue());
        manager.add(new Repeat());
        jda.addEventListener(manager);

        return jda;
    }
}
