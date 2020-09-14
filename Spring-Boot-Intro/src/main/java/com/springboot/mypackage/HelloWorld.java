package com.springboot.mypackage;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sabab on 11/6/2018.
 */


public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
