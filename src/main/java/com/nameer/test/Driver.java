package com.nameer.test;

import com.nameer.test.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Pixel pixel = factory.getBean(Pixel.class);
        pixel.pixelDisplay();
    }
}
