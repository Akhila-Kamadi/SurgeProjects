/**Question:
 * Create a calculator which takes input from user and perform basic mathematical operations.
 */
import java.util.Scanner;

class Calculator{
    float add2Numbers(float a, float b){
        return a+b;
    }
    float subtract2Numbers(float a, float b){
        return a-b;
    }
    float multiply2Numbers(float a, float b){
        return a*b;
    }
    float divide2Numbers(float a, float b){
        return a/b;
    }
    float mod2Numbers(float a, float b){
        return a%b;
    }
}

public class July21 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number");
        float num2 = sc.nextFloat();
        System.out.println("Enter operator to perform an operation");
        String operator = sc.next();
        float ans;
        switch (operator){
            case "+":{
                ans = calc.add2Numbers(num1,num2);
                System.out.println("Addition of "+num1+" + "+num2+" = "+ans);
                break;
            }
            case "-":{
                ans = calc.subtract2Numbers(num1,num2);
                System.out.println("Subtraction of "+num1+" - "+num2+" = "+ans);
            }
            case "*":{
                ans = calc.multiply2Numbers(num1,num2);
                System.out.println("Multiplication of "+num1+" * "+num2+" = "+ans);
            }
            case "/":{
                if(num2==0){
                    System.out.println("A number can't be divided by zero. Please give another input.");
                }
                else {
                    ans = calc.divide2Numbers(num1, num2);
                    System.out.println("Division of " + num1 + " / " + num2 + " = " + ans);
                }
                break;
            }
            case "%":{
                if(num2==0){
                    System.out.println("A number can't be divided/mod by zero. Please give another input.");
                }
                else {
                    ans = calc.mod2Numbers(num1, num2);
                    System.out.println("Modulus of " + num1 + " % " + num2 + " = " + ans);
                }
                break;
            }
            default:
                System.out.println("Enter valid operator");
                break;
        }
        if(num2!=0 && !operator.equals("/") && !operator.equals("%")){
            System.out.println("Thanks for using my Calculator. Visit again :)");
        }
    }
}
