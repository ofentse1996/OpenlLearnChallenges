public class StringChallenge{

		public static void main(String [] args){

			String line = "1,4,3,2,3,7,5,6,9";

			//split String delimilted by comma
			String [] myArray = line.split(",");

			int [] intArray = new int[myArray.length];

			//iterate over String array
			
			for (int i=0; i<myArray.length ;i++ ) {

				intArray[i] = Integer.parseInt(myArray[i]);
							
				System.out.println(myArray[i]);			
			}


			int temp;
			for (int i= 0;i<intArray.length  ;i++ ) {
				for (int j = i+1;j<intArray.length ; j++) {
					if(intArray[i]>intArray[j]){
						temp = intArray[i];
						intArray[i] = intArray[j];
						intArray[j] = temp;
					}
				}
			}

			System.out.println("Array Sorted in Ascending Order :");

			for (int i=0;i<intArray.length ; i++) {
				System.out.print(intArray[i]);
			
			
		}


	}
}
