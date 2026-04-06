// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 1
// Filename: Converter.java (inside tempconvert package)

package mte3.tempconvert;
import java.util.Scanner;

public class Converter {
    
    private static class CelsiusToFahrenheit implements TempConvert {

        @Override
        public double convert(double temp) {    return temp * 9.0 / 5.0 + 32;    }
        
    } // CelciusToFahrenheit closed

    

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter temperature (for conversion): ");

            // (part 1) conversion from C to F
            double value = scanner.nextDouble();
            TempConvert celsiusToFahrenheit = new CelsiusToFahrenheit();
            System.out.println("C to F: " + celsiusToFahrenheit.convert(value));
            
            
            // (part 2) conversion from F to C
            TempConvert cToF = new TempConvert() {
                @Override
                public double convert(double f) {
                    return (f-32)*5.0/9.0;
                }
            };
            System.out.println("CtoF: " + cToF.convert(value));
            
            
            // (part 3) conversion from F to K
            TempConvert FToK = f -> (f-32)*5.0/9.0+273.15; 
            System.out.println("FtoK: " + FToK.convert(value));
            


        }  // try { } block closed

    } // main () method closed

} // Converter { } class closed