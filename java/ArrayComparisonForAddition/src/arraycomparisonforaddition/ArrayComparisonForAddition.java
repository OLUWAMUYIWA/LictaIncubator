
package arraycomparisonforaddition;


public class ArrayComparisonForAddition {

  
    
    public static void main(String[] args) {
       int [] myArray = new int[100];
       int num1;
       int num2;
       for (int i =0; i<myArray.length;i++)
       { 
           myArray[i] = i;
           
       }
       
       int sum[] = new int[]{7,9,43,7,87,21,9,23,4,56};
       for(int i=0;i<sum.length;i++)
       {
           for(int j=0;j<myArray.length;j++)
           {
               for(int k=j+1; k<myArray.length-j;k++ )
               {
                   if((myArray[j]+myArray[k])==sum[i])
                   {
                     num1 =  myArray[j];
                     num2 =  myArray[k];
                     System.out.println("The two numbers that sum up to " + sum[i] + " are " + num1 + " " + num2 );
                     break;
                   }
               }
           }
           System.out.println("");
       }
       
    }
    
}
