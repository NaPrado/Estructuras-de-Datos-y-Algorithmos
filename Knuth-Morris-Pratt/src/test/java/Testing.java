import ar.edu.itba.KMP;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Testing {
    @Test
    void test1(){
        Assertions.assertEquals(2,KMP.indexOf("abracadabra".toCharArray(),"ra".toCharArray()));
    }
    @Test
    void test2(){
        Assertions.assertEquals(-1, KMP.indexOf("abracadabra".toCharArray(),"pep".toCharArray()));
    }
    @Test
    void test3(){
        Assertions.assertEquals(6,KMP.indexOf("abracadabra".toCharArray(),"dabra".toCharArray()));
    }
    @Test
    void test4(){
        Assertions.assertEquals(4,KMP.indexOf("abracadabra".toCharArray(),"c".toCharArray()));
    }
}
