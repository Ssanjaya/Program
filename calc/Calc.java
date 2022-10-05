import java.util.Stack;
import java.util.Scanner;
public class Calc {
    private final static char ADD='+';
    private final static char SUB='-';
    private final static char MUL='*';
    private final static char DIV='/';
     Stack<Integer> stack;
    public Calc(){
        stack = new Stack<>();
    }

    public int evaluate(String expression){
        int operand1,operand2,result=0;
        String token;
        Scanner sc = new Scanner(expression);
        while(sc.hasNext())
        {
            token = sc.next();
            if(isOpertor(token))
            {
                 operand2= stack.pop();
                operand1= stack.pop();
                result =evaluateOperation(token.charAt(0),operand1,operand2);
                stack.push(result);
            }
            else
                stack.push(Integer.parseInt(token));
        }
        return result;
    }
    public boolean isOpertor(String token){
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    }
    private int evaluateOperation(char operator , int opr1 , int opr2){
        return switch (operator) {
            case ADD -> opr1 + opr2;
            case SUB -> opr1 - opr2;
            case MUL -> opr1 * opr2;
            case DIV -> opr1 / opr2;
            default -> 0;
        };
    }

}
