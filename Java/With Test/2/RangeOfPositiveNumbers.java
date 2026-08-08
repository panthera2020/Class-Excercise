public class RangeOfPositiveNumbers{
    
    public static int largestNumberIn(int [] arrayOfNumbers){
        int largest = arrayOfNumbers[0];
        
        for(int indexAt = 1; indexAt < arrayOfNumbers.length; indexAt++){
            if(arrayOfNumbers[indexAt] > largest){
                largest = arrayOfNumbers[indexAt];
            }
        }
        return largest;
    }

    public static int smallestNumberIn(int [] arrayOfNumbers){
        int smallest = arrayOfNumbers[0];
        
        for(int indexAt = 1; indexAt < arrayOfNumbers.length; indexAt++){
            if(arrayOfNumbers[indexAt] < smallest){
                smallest = arrayOfNumbers[indexAt];
                }
        }

    return smallest;
    }

    public static int smallestPositiveNumberIn(int [] arrayOfNumbers){
        int smallest = smallestNumberIn(arrayOfNumbers);
        
        for(int indexAt = 0; indexAt < arrayOfNumbers.length; indexAt++){
            if(arrayOfNumbers[indexAt] >= 0){
                smallest = arrayOfNumbers[indexAt];
            }
        }
        
        for(int indexAt = 0; indexAt < arrayOfNumbers.length; indexAt++){
            if(arrayOfNumbers[indexAt] < smallest && arrayOfNumbers[indexAt] > 0){
                smallest = arrayOfNumbers[indexAt];
            }
        }
        
        return smallest;
    }
    
    public static int rangeOfPositiveNumbersIn(int [] arrayOfNumbers){
    return largestNumberIn(arrayOfNumbers) - smallestPositiveNumberIn(arrayOfNumbers);
    }

}
