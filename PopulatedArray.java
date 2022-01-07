public class PopulatedArray{

	public static void main(String [] args){


        int [] myIntArray = {64,83,13,244,345,76,7,8,9,10,19,18,17,16,15,11,12,13,14,20,29,28,27,26,25,24,23,22,21,30,99,92,94,96,90,111,432,478,222,40,41,42,43,44,45,46,47,48,49,50};

        for (int i=0; i< myIntArray.length; i++){
            myIntArray[i] +=1;
        }
        for (int i=0; i< myIntArray.length; i++){
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
		}
	}
