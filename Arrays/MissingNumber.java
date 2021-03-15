import  java.util.Scanner;

class MissingNumber{

    public static void main(String[] args) {
        int arraySize = Integer.MAX_VALUE/100;
        int[] numberArray = new int[arraySize];

        Scanner scan = new Scanner(System.in);

        arraySize = scan.nextInt();
        int arraySum = 0;
        int numberSum = 0;

        for(int i=1 ; i< arraySize; i++){
            numberArray[i] = scan.nextInt();
            arraySum = arraySum ^ numberArray[i];
        }

        for(int i=1 ; i< arraySize+1; i++){
            numberSum = numberSum ^ i;
        }
        scan.close();

        System.out.println(arraySum ^ numberSum);
    }
}