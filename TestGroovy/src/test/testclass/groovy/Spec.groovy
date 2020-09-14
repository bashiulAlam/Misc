package test.testclass.groovy

import spock.lang.Specification
import spock.lang.*

import java.util.logging.Logger

/**
 * Created by Sabab on 1/31/2017.
 */

public class Spec extends Specification {
    Logger logger = new Logger(Spec.class)

    @Unroll
    def sumOfTwoNumbers() {
        when: "we add two numbers"
        def sum = 2 + 2
        System.out.println("sum : " + sum)
        logger.info("check sum" + sum)

        then: "we verify sum"
        sum == 4



    }
}
