public class MultiDimensionalArray{

    public static void main(String [] args){

    //two dimensional array definition 
    int [][] myIntArray = new int [100][30];
    //printing the 2-d array
    System.out.println("The two-dimensional array: ");
    for (int i=0;i<myIntArray.length ;i++) {
        for (int j=0;j<myIntArray[i].length ;j++ ) {
            myIntArray[i][j] = j+1;
            System.out.print(myIntArray[i][j] + " ");
        }
        System.out.println(" ");
    }

    }
}
    
