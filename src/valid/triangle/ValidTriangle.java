/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valid.triangle;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class ValidTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
           int A=input.nextInt();
        int B=input.nextInt();
       
        if(B>A)
            System.out.println("<");
        else if(B<A)
            System.out.println(">");               
        }
        t--;
    }
    
}
