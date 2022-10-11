//import java.util.Scanner;
//import java.util.Stack;
//
//public class Scientific {
//    Stack<String> stack = new Stack<>();
//    private final static String LOG="log";
////    private final static String THETA="Θ";
//    private final static String SIN="sin";
//    private final static String COS="cos";
//    private final static String TAN="tan";
//    private final static String PIE="π";
//    private final static String SQRT="√";
//    private final static String COSEC="cosec";
//    private final static String SEC="sec";
//    private final static String COT="cot";
//    private final static String PERCENTAGE="%";
//
//    public void scientificCalculator(String str){
//        String [] operatorArray = str.split(" ");
//        String operand1;
////        String operand2;
//        double result;
//        String token;
//        for (int i = 0 ; i < operatorArray.length ; i ++)
//        {
//            token = operatorArray[i];
//            if(isOpertor(token))
//            {
////                operand2= stack.pop();
//                operand1= stack.pop();
//                result =evaluateOperation(token,operand1);
//                stack.push(String.valueOf(result));
//            }
//            else
//                stack.push(String.valueOf(Integer.parseInt(token)));
//        }
////        return result;
//
//
//    }
//    private double evaluateOperation(String operator , String opr1 ){
//        int oper = Integer.parseInt(opr1);
//        return switch (operator) {
//            case LOG ->Math.log(oper);
////            case THETA -> opr1 - opr2;
//            case SIN -> Math.sin(oper);
//            case COS -> Math.cos(oper);
//            case TAN -> Math.tan(oper);
//            case PIE -> Math.PI;
//            case SQRT -> Math.sqrt(oper);
//            case COSEC -> 1/(Math.cos(oper));
//            case SEC -> 1/(Math.sin(oper));
//            case COT -> 1/(Math.tan(oper));
//            case PERCENTAGE -> oper/100;
//            default -> 0;
//        };
//    }
//    public boolean isOpertor(String token){
//        return (token.equals("log") || token.equals("Θ") || token.equals("sin") || token.equals("π")|| token.equals("cos")|| token.equals("tan")|| token.equals("cosec")|| token.equals("√") || token.equals("sec") || token.equals("cot") || token.equals("%"));
//    }
//}
