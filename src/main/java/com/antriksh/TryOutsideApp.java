package com.antriksh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by antjain on 2/2/20.
 */
@Component
public class TryOutsideApp implements CommandLineRunner{

    @Autowired
    OutsideApp outsideApp;

    public void run(String... args)
    {
        outsideApp.m();
    }
}
