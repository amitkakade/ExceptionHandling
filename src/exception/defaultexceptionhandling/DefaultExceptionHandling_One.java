/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.defaultexceptionhandling;

/**
 * If exception is not handelled then by default there is mechanism of
 * defaultexception handling in java.
 *
 * Exception in thread "main" java.lang.ArithmeticException : => ( Name Of
 * Exception )
 *
 * / by zero => ( Description Part)
 *
 * following three lines are => ( StackTrace ) 
 * at
 * exception.defaultexceptionhandling.DefaultExceptionHandling_One.doMoreStuff(DefaultExceptionHandling_One.java:23)
 * at
 * exception.defaultexceptionhandling.DefaultExceptionHandling_One.doStuff(DefaultExceptionHandling_One.java:19)
 * at
 * exception.defaultexceptionhandling.DefaultExceptionHandling_One.main(DefaultExceptionHandling_One.java:15)
 *
 * @author amit
 */
public class DefaultExceptionHandling_One {

    public static void main(String[] args) {
        doStuff();
        System.out.println("Executed main() method.");
    }

    public static void doStuff() {
        doMoreStuff();
        System.out.println("Executed doStuff() method.");
    }

    public static void doMoreStuff() {
        System.out.println(10 / 0);
        System.out.println("Executed doMoreStuff() method.");
    }
    
}
