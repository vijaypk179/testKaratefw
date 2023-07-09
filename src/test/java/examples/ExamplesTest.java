package examples;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

class ExamplesTest {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:examples")
                .outputCucumberJson(true)
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

//    @Karate.Test
//    Karate testSystemProperty() {
//        return Karate.run("classpath:examples/users/users.feature")
//                .tags("@testrun");
////                .karateEnv("e2e")
////                .systemProperty("foo", "bar");
//    }


}
