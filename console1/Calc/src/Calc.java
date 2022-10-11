import java.util.Stack;

public class Calc {
    private final static String ADD="+";
    private final static String SUB="-";
    private final static String MUL="*";
    private final static String DIV="/";
    private final static String LOG="ln";
    //    private final static String THETA="Θ";
    private final static String SIN="sin";
    private final static String COS="cos";
    private final static String TAN="tan";
    private final static String PIE="π";
    private final static String SQRT="√";
    private final static String COSEC="cosec";
    private final static String SEC="sec";
    private final static String COT="cot";
    private final static String PERCENTAGE="%";
     Stack<String> stack;
    public Calc(){
        stack = new Stack<>();
    }

    public double evaluate(String expression){
        String [] operatorArray = expression.split(" ");
        String operand1;
        String operand2;
        double result = 0;
        String token;
        for (String s : operatorArray) {
            token = s;
            if (isOpertor(token)) {
                operand2 = stack.pop();
                operand1 = stack.pop();
                result = evaluateOperation(token, operand1, operand2);
                stack.push(String.valueOf(result));
            } else
                stack.push(String.valueOf(Integer.parseInt(token)));
        }
        return  result;


    }
    public boolean isOpertor(String token){
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") ||token.equals("log") || token.equals("Θ") || token.equals("sin") || token.equals("π")|| token.equals("cos")|| token.equals("tan")|| token.equals("cosec")|| token.equals("√") || token.equals("sec") || token.equals("cot") || token.equals("%"));
    }
    private double evaluateOperation(String operator , String opr1 , String opr2){
        int oper1 = Integer.parseInt(opr1);
        int oper2 = Integer.parseInt(opr2);
        return switch (operator) {
            case ADD -> oper1 + oper2;
            case SUB -> oper1 - oper2;
            case MUL -> oper1 * oper2;
            case DIV -> oper1 / oper2;
            case LOG ->Math.log(oper1);
//            case THETA -> opr1 - opr2;
            case SIN -> Math.sin(oper1);
            case COS -> Math.cos(oper1);
            case TAN -> Math.tan(oper1);
            case PIE -> Math.PI;
            case SQRT -> Math.sqrt(oper1);
            case COSEC -> 1/(Math.cos(oper1));
            case SEC -> 1/(Math.sin(oper1));
            case COT -> 1/(Math.tan(oper1));
            case PERCENTAGE -> oper1/100;
            default -> 0;
        };
    }

}
