/**
 * Created by Sabab on 5/10/2016.
 */
import spock.lang.Specification

class Test extends  Specification {

    def "should return 2 from first element of list"() {
        given:
        List<Integer> list = new ArrayList<>()
        when:
        list.add(2)
        then:
        2 == list.get(0)
    }

    def "should return Role.USER when asked for role"() {
        given:
        List list = Stub()
        list.size() >> 3
        expect:
        // let's see if this works
        list.size() == 3
    }

    def "specifying side effects"() {
        given:
        List list = Stub()
        list.size() >> { println "Size method has been invoked" }
    }

    def "specifying that exception should be thrown"() {
        given:
        List list = Stub()
        list.size() >> { throw new IllegalStateException() }
    }

    def "should return different values"() {
        given:
        List list = Stub()
        list.size() >>> [1, 2, 3]
    }

    def "what will happen?"() {
        given:
        List list = Stub()
        list.get() >> 0
        expect:
        list.get(0) == 0
    }


}
