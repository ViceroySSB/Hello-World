/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;
import java.util.Scanner;
/**
 *
 * @author Ogdvenstroodle
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("What is your name?");
        Scanner personName = new Scanner(System.in);
        String name = personName.next();
        System.out.println("Hello " + name + "!");
        System.out.println("HI WORLD!");
    }
    
}
