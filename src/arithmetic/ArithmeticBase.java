/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * Modifier Ashish Patel
 * date 02/19
 */
public class ArithmeticBase 
{
    public enum Operation {"PLUS", "MINUS","MULTIPY", "DIVIDE"};
    private final Operation op;

    public ArithmeticBase(){
     
       op =op;
}
    public double calculate( double x, double y){
    return x+y;
}
   
}
