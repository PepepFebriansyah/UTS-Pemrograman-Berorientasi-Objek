/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class RecursiveMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorialLoop(10));
        System.out.println(factorialRecursive(10));
        
        loop(1000);
    }
    
    static int factorialLoop(int value) {
        int result = 1;
        
        for (int counter = 1; counter <= value; counter++){
            result *= counter;
        }
        
        return result;
    }
    
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value* factorialRecursive(value-1);
        }
    }
    
    static void loop(int value) {
        if(value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop" + value);
            loop(value -1);
        }
    }
}