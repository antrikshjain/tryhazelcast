/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tryhz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class App
{

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    public String getGreeting()
    {
        return "Hello World";
    }

}
