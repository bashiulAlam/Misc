package com.groovy.testPackage;

/**
 * Created by Sabab on 8/29/2017.
 */

import spock.util.EmbeddedSpecRunner;
import com.groovy.testPackage.*;

public class main {

    public static void main(String[] args) {

        EmbeddedSpecRunner embeddedSpecRunner = new EmbeddedSpecRunner();
        embeddedSpecRunner.runClass(MyClass.class);

        System.out.println("Project executed...");
    }
}
