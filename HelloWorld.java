/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author werwe
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 2147483647;
        int y = 1;
        int sum = x + y;
        String helloMessage = "        hi mr. wombat ";
        System.out.println("Hello World, we are trying to get the lowest value of the int data type by adding 1 to the highest number because its memory size is 16 bits");
        System.out.println("the sum of " + x + " + " + y + " equals: " + sum);
        // strings are immutable (can't trim (= removes all spaces before and after)or change them) so we can't change the value of string instances, so we make a "copy" of the words in helloMessage and trim that copy.
        String trimmedString = helloMessage.trim();
        System.out.println(trimmedString);
        String replacedString = helloMessage.replace("wombat", "crocodile");
        
        System.out.print(replacedString);
        
 
    }

}
