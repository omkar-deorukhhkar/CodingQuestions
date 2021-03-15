import java.util.Scanner;

class MajorityElement{

    void isMajority(int [] numArray, int arraySize){
        int count = 0;
        int container = numArray[0];

        for(int i=0; i<arraySize; i++){
            if(numArray[i] == container){
                count += 1;
            }
            else{
                if(count > 0){
                    count -= 1;
                }
                else{
                    container = numArray[i];
                    count += 1;
                }
            }
        }

        count = 0;
        for(int i=0; i<arraySize; i++){
            if(numArray[i]==container){
                count++;
            }
        }

        if(count > arraySize/2){
            System.out.println("Maximum Element is " + container);
        }
        else{
            System.out.println("No Maximum Element");
        }
    }

    public static void main(String[] args) {
        int arraySize;
        int[] numArray = new int[100];

        Scanner scan = new Scanner(System.in);

        arraySize = scan.nextInt();

        for(int i=0; i<arraySize; i++){
            numArray[i] = scan.nextInt();
        }

        MajorityElement me = new MajorityElement();
        me.isMajority(numArray, arraySize);

    }
}