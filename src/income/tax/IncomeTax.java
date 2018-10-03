/*
 * Gavin Scott
 Wednesday october 3rd
 to calculate income tax based on the 2018 canadaian tax brackets
 */

package income.tax;

import java.util.Scanner;

/**
 *
 * @author gasco1246
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyInput = new Scanner(System.in);
        
        //variable declaration
        double income,incomeTax;
        final double LOW, MED, HIGH, RICH, MONEYBAGS;
        final double LOW_CEIL, MED_CEIL, HIGH_CEIL, RICH_CEIL, MONEYBAGS_CEIL;
        
        income  = keyInput.nextDouble();
        incomeTax = 0;
        
        LOW = 0.15;
        MED = 0.205;
        HIGH = 0.26;
        RICH = 0.29;
        MONEYBAGS = 0.33;
        
        LOW_CEIL = 46605;
        MED_CEIL = 93208;
        HIGH_CEIL = 144489;
        RICH_CEIL = 205842;
        
         //determine if income is in low bracket
        if (income < LOW_CEIL){
            incomeTax = income*LOW;
            System.out.println("You must pay $"+incomeTax);
        } 
        //determine if income is above low bracket
        else if(income >= LOW_CEIL){
            income = income-LOW_CEIL;
            incomeTax = LOW_CEIL*LOW;
            //calculate remainder to higher bracket
            if(income >= LOW_CEIL){
                
                incomeTax = incomeTax + income*MED;
                System.out.println("You must pay $"+incomeTax+" in income tax");
            //calculate remainder to lowest bracket
            }else if (income < LOW_CEIL){
            incomeTax = incomeTax+income*LOW;
            System.out.println("You must pay $"+incomeTax);
        } 
            
        }
        //copy of above if statement...constant values changed
        else if (income >= MED_CEIL){
            income = income-MED_CEIL;
            incomeTax = incomeTax + MED_CEIL*MED;
            if(income >= MED_CEIL){
                incomeTax = incomeTax + income*HIGH;
                System.out.println("You must pay $"+incomeTax+" in income tax");
            
            }else if (income < MED_CEIL){
            incomeTax = incomeTax+income*MED;
            System.out.println("You must pay $"+incomeTax);
            } 
            
        }
        //copy of above if statement...constant values changed
        else if (income >= HIGH_CEIL){
            income = income-HIGH_CEIL;
            incomeTax = incomeTax + HIGH_CEIL*HIGH;
            if(income >= HIGH_CEIL){
                incomeTax = incomeTax + income*RICH;
                System.out.println("You must pay $"+incomeTax+" in income tax");
            
            }else if (income < HIGH_CEIL){
            incomeTax = incomeTax+income*HIGH;
            System.out.println("You must pay $"+incomeTax);
            } 
            
        }
        //copy of above if statement...constant values changed
        else if (income >= RICH_CEIL){
            income = income-RICH_CEIL;
            incomeTax = incomeTax + RICH_CEIL*RICH;
            if(income >= RICH_CEIL){
                incomeTax = incomeTax + income*MONEYBAGS;
                System.out.println("You must pay $"+incomeTax+" in income tax");
            
            }else if (income < RICH_CEIL){
            incomeTax = incomeTax+income*RICH;
            System.out.println("You must pay $"+incomeTax);
            } 
            
        }
        
        
        
    }
    
}
