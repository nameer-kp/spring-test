package com.nameer.test;
import org.springframework.stereotype.Component;
@Component("cpu")
public class Snapdragon implements CPU {

    public void print() {
        System.out.println("Processor Running");
    }
}
