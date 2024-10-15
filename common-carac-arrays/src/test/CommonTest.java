import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonTest {

    private CommonArraysClass commonArraysClass;

    @BeforeEach
    public void setUp() {
        commonArraysClass = new CommonArraysClass();
    }

    @Test
    public void commonArraysLength_is_2() {
        char[]arr1 =  new char[]{'a','e','e','e','e'};
        char[]arr2 =  new char[]{'b','b','c','e','e','g'};
        assertEquals(2,commonArraysClass.getCommonCaractersFrom2Arrays(arr1,arr2).size());
    }

    @Test
    public void commonArraysLength_is_ee() {
        char[]arr1 =  new char[]{'a','e','e','e','e'};
        char[]arr2 =  new char[]{'b','b','c','e','e','g'};
        assertEquals(List.of('e','e'),commonArraysClass.getCommonCaractersFrom2Arrays(arr1,arr2));
    }
}
