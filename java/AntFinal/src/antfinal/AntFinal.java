/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antfinal;

import java.util.Scanner;

/**
 *
 * @author SpiritDayvid
 */
public class AntFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       int second = 1;
       int x = 1;
       int y =1;
       int lx = 1;
       int ly = 1;
       
       if (number == 1)
           System.out.println("x, y = " + x + "," + y );
       
       else{
           
           major :{   while( number != second)
       {
           
           firstUp :
           {     y++;
                second ++;
                ly=y;
                if (number == second)
                {
                    System.out.println("x, y = " + x + "," + y );
                    break major;
                }
           }    
           
           
           firstRight :
               for ( ; x<(lx +1); x++, second++)
               {
                   

                   
                   if (second == number)
                {
                    System.out.println("x, y = " + x + "," + y );
                    break major;
                }
                   
               }
               if (second == number)
                {
                    break major;
                }
           
           
               down :
               {
               ly = y;
               for(; y >1; )
               {
                   y--;
                   second++;
                 if (second == number)
                {
                    System.out.println("x, y = " + x + "," + y );
                    break major;
                }  
               }
               if (second == number)
                {
                    System.out.println("x, y = " + x + "," + y );
                    break major;
                }
               }
           
               secondRight :
               {
               lx = x;
               x++;
               second ++;
               if (second == number)
                {
                    System.out.println("x, y = " + x + "," + y );
                    break major;
                }
               }
           
               secondUp :
               {
               for (; y<(ly+1);)
               {
                   y++;
                   second++;
                   if (second == number)
                {
                    System.out.println("x, y = " + x + "," + y );
                    break major;
                }
               }
               if (second == number)
                {
                    break major;
                }
               
               }
           
               left :
               {
               for(; x>1;)
               {
                   x--;
                   second++;
                   if (second == number)
                {
                    System.out.println("x, y = " + x + "," + y );
                    break major;
                }
                   
                          
                }
               }
       }  

    }
       }
}
}
    
    

