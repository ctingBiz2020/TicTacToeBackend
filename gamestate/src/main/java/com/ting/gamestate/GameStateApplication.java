package com.ting.gamestate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GameStateApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameStateApplication.class, args);
    }

}
