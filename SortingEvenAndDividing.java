public class SortingEvenAndDividing{

    public static void main(String [] args){

     
        int [] myIntArray = new int[50];

        for (int i=0; i< myIntArray.length; i++){
            myIntArray[i] = i+1;
            if (myIntArray[i] %2 ==0){
                System.out.println("Element " + i + ", value is " + myIntArray[i]);
            }
            if (myIntArray[i] %11==0){
                System.out.println("Element " + i + ", value is " + myIntArray[i]);
            }
        }
    }
    }
    
