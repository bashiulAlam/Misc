package main.groovy
import util.StringUtil

/**
 * Created by Sabab on 8/28/2017.
 */
class Sample extends GroovyTestCase {

    void stringConcat() {
        def a = "test"
        def b = "execute"

        def result = a + b
        assertToString('testexecute', result)
    }

    def stringUtil = new StringUtil()
    void testConcatenation() {
        def result = stringUtil.concat(['Luke', 'John'], '-')
        assertToString('Luke-John', result)
    }
    void testConcatenationWithEmptyList () {
        def result = stringUtil.concat([], ',')
        assertEquals('', result)
    }
}
