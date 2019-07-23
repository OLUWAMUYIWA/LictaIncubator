
package arraycomparisonreal;


public class ArrayComparisonReal {

    
    public static void main(String[] args) {
        int [] myArray = new int[]{1,2,4,6,7,9,12,13,18,20,23,24,34};
       int num1;
       int num2;
      // for (int a =1; a<myArray.length;a+=2)
      // {
      //     myArray[a] = a;
           
      // }
       
       
       int sum[] = new int[]{7,9,43,7,87,21,9,23,4,56};
       for(int i=0;i<sum.length;i++)
       {
           for(int j=0;j<myArray.length;j++)
           {
                boolean check = true;
               for(int k=j+1; k<myArray.length-(j+1);k++ )
               {
                  
                   if((myArray[j]+myArray[k])==sum[i])
                   {
                     num1 =  myArray[j];
                     num2 =  myArray[k];
                     System.out.println("The two numbers that sum up to " + sum[i] + " are " + num1 + " , " + num2 );
                     check = true;
                     break;
                     
                   }
                   else
                       check = false;
               }
               if(check== true)
                   break;
                   
           }
           System.out.println("");
       }
    
    }
    
}
