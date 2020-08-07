package com.nameer.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pixel {
    @Autowired
    private CPU processor;
    public void pixelDisplay(){
        System.out.println("pixel Displaying");
        processor.print();
    }


}
