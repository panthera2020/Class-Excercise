public class EvenNumbersAndCount{

	public static int getCountOfEvenNumbersIn(int [] arrayOfNumbers){
        int evenCounter = 0;

        for(int index = 0; index < arrayOfNumbers.length; index++){
            if(arrayOfNumbers[index] % 2 == 0){
                evenCounter++;        
            }
    }

    return evenCounter;
    }

    public static int[] getArrayOfEvenNumbersIn(int [] arrayOfNumbers){
        int [] arrayOfEvenNumbers = new int[getCountOfEvenNumbersIn(arrayOfNumbers)];
        int count = 0;
        int individualNumbers = 0;

        for(int index = 0; index < arrayOfNumbers.length; index++){
            if(arrayOfNumbers[index] % 2 == 0){
                    if(count < arrayOfEvenNumbers.length){
                       arrayOfEvenNumbers[count] = arrayOfNumbers[index]; 
                       count++;       
                    }
            }        
        }
    return arrayOfEvenNumbers;
    }

    public static int[] getArrayOfEvenNumbersAndCountIn(int[] arrayOfNumbers){
        int [] arrayOfEvenNumbersAndCount = new int[getCountOfEvenNumbersIn(arrayOfNumbers) + 1];

        arrayOfEvenNumbersAndCount[arrayOfEvenNumbersAndCount.length - 1] = getCountOfEvenNumbersIn(arrayOfNumbers);

        int[] arrayOfEvenNumbers = getArrayOfEvenNumbersIn(arrayOfNumbers);
        
        int count = 0;

        for(int index = 0; index < arrayOfEvenNumbersAndCount.length - 1; index++){
            arrayOfEvenNumbersAndCount[index] = arrayOfEvenNumbers[count];
            count++;
        }

    return arrayOfEvenNumbersAndCount;
    }

}

