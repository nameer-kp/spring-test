package com.nameer.test;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component()
public class Snapdragon implements CPU {

    public void print() {
        System.out.println("SnapDragon Processor Running");
    }
}
