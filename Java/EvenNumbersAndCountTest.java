import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenNumbersAndCountTest {

    @Test
    public void testIfIInputAnArrayTheNumberOfEvenNumbersInTheArray(){
    //Given
    int[] numbers = {1,2,3,4,5};

    //When
    int expectedCountOfEvenNumbers = EvenNumbersAndCount.getCountOfEvenNumbersIn(numbers);

    int actualCountOfEvenNumbers = 2;

    //Check
    assertEquals(expectedCountOfEvenNumbers, actualCountOfEvenNumbers);
    
    }

}
