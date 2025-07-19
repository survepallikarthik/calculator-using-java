import java.util.Scanner;
 class Calculator {
    public static void main(String[] args) {
        boolean response =true;
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to the Java Calculator!");
        while(response){
              
        double  firstnumber=getnumber(s);
        char operation=getoperation(s);
        double  secondnumber=getnumber(s);
        double result =getresult(operation,firstnumber,secondnumber);
        if(result==secondnumber)continue;
        System.out.println("Result is " + result);
         response =getresponse(s);
         if(!response){
            System.out.println("Thank you for visiting our calculator!");
         }
        }
        s.close();
    }
    public static double getnumber(Scanner s)
    {
        while(true){
        try {
          
                System.out.println("Enter a number");
                double value=s.nextDouble();
                return value;       
            }
            
         catch (Exception e) {
           System.out.println("You have entered an invalid number. Please enter a valid number.");
           s.next();
            
        }
           
        }

        }
         public static char getoperation(Scanner s)
         {
            while (true) {
                System.out.println("Enter the operation (+, -, *, /):");
                char input=s.next().charAt(0);
                if( input =='+' || input=='-'|| input=='*' || input=='/')
                {
                    return input;
                }
                else
                {
                    System.out.println("You have entered the wrong input. Please try again.");                  
                }
            }

         }
         public static double getresult(char operation,double value , double value1)
         {
            switch(operation)
            {
                case '+':
                   return value+value1;
                case '-':
                return value-value1;
                case '*':
                return value*value1;
                case '/':
                {
                    if(value1!=0)
                    {
                        return value/value1;
                    }
                    else
                    {
                        System.out.println("Division error: cannot divide by zero.");

                        return value1;
                    }        
                }
                default:
                    System.out.println(" invalid operation");
                    return 0;
                  }
         }
         public static boolean getresponse(Scanner s)
         { 
            while (true) {
                System.out.println("Do you want to perform another calculation ? (yes/no)");
                 String  input =s.next();
                 if(input.equalsIgnoreCase("yes"))
                 {
                    return true;

                 }
                 else if(input.equalsIgnoreCase("no"))
                 {
                   return false;
                 }
                 else
                 {
                    System.out.println("You have entered an invalid response. Please enter 'yes' or 'no'.");
                 }
                
            }

         }

        }
    

