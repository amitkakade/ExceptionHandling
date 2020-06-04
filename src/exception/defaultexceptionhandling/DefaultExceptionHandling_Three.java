/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.defaultexceptionhandling;

/**
 *
 * @author amit
 */
public class DefaultExceptionHandling_Three {

    public static void main(String[] args) {
        doStuff();
        System.out.println(10 / 0);
        System.out.println("Executed main() method.");
    }

    public static void doStuff() {
        doMoreStuff();
        System.out.println("Executed doStuff() method.");
    }

    public static void doMoreStuff() {
        System.out.println("Executed doMoreStuff() method.");
    }
    
}
