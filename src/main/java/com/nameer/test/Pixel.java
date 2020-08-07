package com.nameer.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pixel {
    @Autowired //auto wire wires internal components automatically
    @Qualifier("non") //here were using Qualifier for specifying Component
    private CPU processor;
    public void pixelDisplay(){
        System.out.println("pixel Displaying");
        processor.print();
    }


}
