/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi.calculator;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class BMICALCULATOR {
 
    public static void main(String[] args) throws Exception {
        BodyMassIndex();
    }
 
    private static void BodyMassIndex() throws Exception {
        
        System.out.print("Masukan Berat badan anda : ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Masukan Tinggi badan anda : ");
        float height = s.nextFloat();
         
        // multiplication by 100*100 for cm to m conversion
        float bmi = (100*100*weight)/(height*height);
         
        System.out.println("Hasil anda adalah: "+bmi);
        printBMICategory(bmi);
         
    }
     
    // Prints BMI category
    private static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("KURUS");
        }else if (bmi < 30) {
            System.out.println("NORMAL");
        }else if (bmi < 40) {
            System.out.println("GEMUK");
        }else {
            System.out.println("OBESITAS");
        }
    }
}
