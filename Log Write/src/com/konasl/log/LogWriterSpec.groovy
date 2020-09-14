package com.konasl.log

import org.slf4j.LoggerFactory;
import spock.lang.Specification;
import org.slf4j.Logger
import spock.lang.Unroll;

/**
 * Created by Sabab on 11/12/2019.
 */
class LogWriterSpec {
    private static Logger logger = LoggerFactory.getLogger(LogWriterSpec.class);

    def setupSpec() {
        logger.info("setup spec executed");
    }

    def setup() {
        logger.info("setup method executed");
    }

    @Unroll
    def "Test"() {
        when: ""
        logger.info("In when block");
        int a = 2 + 2;

        then: ""
        logger.info("In then block");
        a == 4;
    }
}
