public class Compute {
 public static void main(String[] args) {
 double num1 = Double.parseDouble(args[0]);
 double num2 = Double.parseDouble(args[2]);
 switch (args[1]) {
           case "+":  System.out.println("Result of " + num1 +" " + args[1] + " "+ num2 +" is " + (int)(num1+num2));
                    break;
           case "-":  System.out.println("Result of "+num1  +" "+ args[1]+" "+num2 +" is "+(int)(num1-num2));;
                    break;
           case "*":  System.out.println("Result of "+num1  +" "+ args[1]+" "+num2 +" is "+(int)(num1*num2));
                    break;
           case "/":  System.out.println("Result of "+num1  +" "+ args[1]+" "+num2 +" is "+(num1/num2));;
                    break;
        }

 }
}
