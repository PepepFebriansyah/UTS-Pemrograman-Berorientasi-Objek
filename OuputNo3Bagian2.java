/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class OuputNo3Bagian2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result1 = sum(100, 100);
        System.out.println(result1);
        
        System.out.println(sum(200, 200));
        
        System.out.println(hitung(100,"+",100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "salah", 100));
    }
    
    static int sum(int value1,int value2) {
        int total = value1 + value2;
        return total;
    }
    static int hitung(int value1, String operasi,int value2) {
        switch(operasi){
            case "+":
                return (value1 + value2);
            case "-":   
                return (value1 - value2);
        }
        return 0;
    }
 }
