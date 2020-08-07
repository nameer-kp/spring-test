package com.nameer.test;

import org.springframework.stereotype.Component;

@Component("non")
public class Mediatec implements CPU{
    @Override
    public void print() {
        System.out.println("mediatec is running");
    }
}
