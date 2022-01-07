public class AscendingSorting{

    public static void main(String [] args){

            int [] myIntArray = {64,83,13,244,345,76,7,8,9,10,19,18,17,16,15,11,12,13,14,20,29,28,27,26,25,24,23,22,21,30,99,92,94,96,90,111,432,478,222,40,41,42,43,44,45,46,47,48,49,50};

        for (int i=0; i<myIntArray.length; i++){
            boolean flag = true;
            int temp;
            while(flag){
                flag =  false;

                for (int j=0; j<myIntArray.length-1; j++){
                    if (myIntArray[j] > myIntArray[j+1]){
                        temp = myIntArray[j];
                        myIntArray[j] = myIntArray[j+1];
                        myIntArray[j+1] = temp;
                        flag = true;
                    }
                }
            }
        }


        //System.out.println("**********************************");


        for (int i=0; i< myIntArray.length; i++){
            System.out.println("Element " + i + " , values is " + myIntArray[i]);
        }
        }
    }
    
