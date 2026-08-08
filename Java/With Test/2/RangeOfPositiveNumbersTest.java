import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeOfPositiveNumbersTest {

    @Test
    void testThatWhenAnArrayOfNumbersIsInputedItReturnsTheLargestNumber(){
    //Given
    int[] numbers = {2,5,1,9,7};
    
    //When
    int expectedLargestNumber = RangeOfPositiveNumbers.largestNumberIn(numbers);
    
    int actualLargestNumber = 9;
    
    //Check
    assertEquals(expectedLargestNumber, actualLargestNumber);
    }
    
    @Test
    void testThatWhenAnArrayOfNumbersIsInputedItReturnsTheSmallestNumber(){
    // Given
    int[] numbers = {-2, -1, 5, 10, 7};
    
    //When
    int expectedSmallestNumber = RangeOfPositiveNumbers.smallestNumberIn(numbers);
    
    int actualSmallestNumber = -2;
    
    //Check
    assertEquals(expectedSmallestNumber, actualSmallestNumber);
    }


     @Test
    void testThatWhenAnArrayOfNumbersIsInputedItReturnsTheSmallestPositiveNumber(){
    // Given
    int[] numbers = {-2, -1, 5, 10, 7};
    
    //When
    int expectedSmallestPositiveNumber = RangeOfPositiveNumbers.smallestPositiveNumberIn(numbers);
    
    int actualSmallestPositiveNumber = 5;
    
    //Check
    assertEquals(expectedSmallestPositiveNumber, actualSmallestPositiveNumber);
    }
    
    
    @Test
    void testThatWhenAnArrayOfNumbersIsInputedItReturnsRangeOfPositiveNumbers(){
    //Given
    int [] numbers = {-2, -1, 5, 10, 7};
    
    //When
    int expectedRangeOfNumbers = RangeOfPositiveNumbers.rangeOfPositiveNumbersIn(numbers);
    
    int actualRangeOfNumbers = 5;
    
    //Check
    assertEquals(expectedRangeOfNumbers, actualRangeOfNumbers);
    }

}
