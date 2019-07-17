/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;
import java.util.Scanner;


        
/**
 *
 * @author DELL
 */
 
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Please enter your first name>> ");
        
        Scanner object=new Scanner (System.in);
      String  first =object.nextLine();
      
      first=first.toLowerCase();
      
      char ch0=first.charAt(0);
      
     
      if (ch0=='e'||ch0=='a'||ch0=='o'||ch0=='i'||ch0=='u')
      {
          
           char ch3 = Character.toUpperCase(ch0);
      String firstName=ch3+first.substring(1)+"ay";
        System.out.println("Your pig latin name: ");
      System.out.println(firstName);
     
      }
      
    

    
    else 
    {
        

String firstName=first.substring(1)+ch0+"ay";
char ch1 =firstName.charAt(0);
char ch3 = Character.toUpperCase(ch1);
String firstName1=ch3+first.substring(2)+ch0+"ay";
       System.out.println("Your pig latin name: ");
      System.out.println(firstName1);

}
      /////////////////////////////////////////
     
    
    }
}