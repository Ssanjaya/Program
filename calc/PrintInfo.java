import java.util.Scanner;

public class PrintInfo {
    Scanner sc = new Scanner(System.in);
    public void print(){
        System.out.println("===========================");
        System.out.println("   Welcome to Calculator   ");
        System.out.println("===========================");

    }
        public void outputMethod(){
        String expression , again;
        int result;
        do{
            Calc calcobj = new Calc();
            System.out.println("Enter the Expression ");
            expression = sc.nextLine();
            InfixToPostfix obj =new InfixToPostfix();
            String sample = InfixToPostfix.infixToPostfix(expression);
            result=calcobj.evaluate(sample);
            System.out.println();
            System.out.println("The result : "+ result);
            System.out.println("Would you like to evauate the another expression [Y/N]");
            again = sc.nextLine();
            {
                System.out.println("Enter either y or n");
            }
            System.out.println();
        }while(again.equalsIgnoreCase("y"));
        }
    }

