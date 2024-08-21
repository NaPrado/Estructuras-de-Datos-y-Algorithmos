import ar.edu.itba.Levenshtein;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestA {
    @Test
    void test1(){
        Assertions.assertEquals(6,Levenshtein.distance("exkusa","ex-amigo"));
    }
}
