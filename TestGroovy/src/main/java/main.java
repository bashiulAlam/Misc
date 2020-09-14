package main.java;
/**
 * Created by Sabab on 8/28/2017.
 */

//import test.com.testclass.ksl;
import test.testclass.groovy.Spec;
import spock.util.EmbeddedSpecRunner;

public class main {

    public static void main(String[] args) {
        System.out.println("execution started...");
        EmbeddedSpecRunner embeddedSpecRunner = new EmbeddedSpecRunner();
        embeddedSpecRunner.runClass(Spec.class);
    }
}
