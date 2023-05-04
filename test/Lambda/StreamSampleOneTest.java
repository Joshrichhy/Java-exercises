package Lambda;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamSampleOneTest {
    @Test
    void testThatMapReturnsElementOfAListMultiplyingEachElementByTwo(){
        List <Integer> numbers = List.of(1, 2,3,4,5);
       var result =  StreamSampleOne.mapMethod(numbers);
       var expected = List.of(2,4,6,8,10);
       assertEquals(result, expected);

    }

}