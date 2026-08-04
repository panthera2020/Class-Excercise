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


    @Test
    public void testIfInputAnArrayOfNumbersIGetAnArrayOfNumbersThatContainsEvenNumbersOnly(){
    //Given
    int[] numbers = {2,3,12,8,1};

    //When
    int [] excectedArrayOfEvenNumbers = EvenNumbersAndCount.getArrayOfEvenNumbersIn(numbers);

    int [] actualArrayOfEvenNumbers = {2,12,8};

    //Check
    assertArrayEquals(excectedArrayOfEvenNumbers, actualArrayOfEvenNumbers);
    }

    @Test
    public void testIfInputAnArrayOfNumbersIGetAnArrayOfNumbersThatContainsEvenNumbersAndTheCountOfTheEvenNumbers(){
    //Given 
    int[] numbers = {2,3,12,8,1};

    //When
    int [] expectedResult = EvenNumbersAndCount.getArrayOfEvenNumbersAndCountIn(numbers);

    int [] actualResult = {2,12,8,3};

    //Check
    assertArrayEquals(expectedResult, actualResult);
    
    }

}
