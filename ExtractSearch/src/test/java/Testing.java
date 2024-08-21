import ar.edu.itba.ExtractSearch;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Testing {
    @Test
    void test1(){
        Assertions.assertEquals(2,ExtractSearch.indexOf("abracadabra".toCharArray(),"ra".toCharArray()));
    }
    @Test
    void test2(){
        Assertions.assertEquals(-1, ExtractSearch.indexOf("abracadabra".toCharArray(),"pep".toCharArray()));
    }
    @Test
    void test3(){
        Assertions.assertEquals(6,ExtractSearch.indexOf("abracadabra".toCharArray(),"dabra".toCharArray()));
    }
    @Test
    void test4(){
        Assertions.assertEquals(4,ExtractSearch.indexOf("abracadabra".toCharArray(),"c".toCharArray()));
    }
}
