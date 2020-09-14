package com.konasl.test
import com.konasl.utils.StringUtility
import org.slf4j.Logger
import org.slf4j.LoggerFactory;

/**
 * Created by Sabab on 5/6/2016.
 */
class JavaTest extends GroovyTestCase {

    private static Logger logger = LoggerFactory.getLogger(JavaTest.class)

    def stringUtil = new StringUtility()
    void testConcatenation() {
        logger.info("test started")
        def result = stringUtil.concat(['Luke', 'John'], '-')
        assertToString('Luke-John', result)

        if (assertToString('Luke-John', result))
            logger.debug("case passed")
        else
            logger.error("case failed")
    }
    void testConcatenationWithEmptyList() {
        def result = stringUtil.concat([], ',')
        assertEquals('', result)
    }
}
