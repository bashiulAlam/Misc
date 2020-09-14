package com.groovy.testPackage.specification

import spock.lang.Specification
import spock.lang.*
import com.groovy.testPackage.main

/**
 * Created by Sabab on 1/31/2017.
 */

public class MyCLass extends Specification {

    @Unroll
    def sumOfTwoNumbers() {
        when: "we add two numbers"
        def sum = 2 + 2

        then: "we verify sum"
        sum == 4
    }
}
