package corp;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class HelloWorld2Test {

    @Test
    void test() {

        var helloWorld = new HelloWorld();
        assertThat("Hello world").isEqualTo(helloWorld.helloWorld());
    }

//    @Test
//    void test2() {
//        var helloWorld = new HelloWorld();
//        assertThat("Hello w0rld").isEqualTo(helloWorld.helloWorld());
//    }
//
//    @Test
//    void test3() {
//        var helloWorld = new HelloWorld();
//        assertThat("Hello world").isEqualTo(helloWorld.helloWorld());
//    }
}
