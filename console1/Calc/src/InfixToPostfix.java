import java.util.Stack;

public class InfixToPostfix {
    public static String infixToPostfix(String s){
        Stack<String> stack = new Stack<>();
        StringBuilder postfix= new StringBuilder();
        s.trim();
        String[] character = s.split(" ");

        for(String ch : character ){
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/") && !ch.equals("(") && !ch.equals(")") && !ch.equals("^") && !ch.equals("log") && !ch.equals("Θ") && !ch.equals("sin") && !ch.equals("π") && !ch.equals("cos") && !ch.equals("tan") && !ch.equals("cosec") && !ch.equals("√") && !ch.equals("sec") && !ch.equals("cot") && !ch.equals("%")){
                postfix.append(ch).append(" ");
//                System.out.println(postfix);
            }
            else if (ch.equals("(") ) {
                stack.push(ch);
            }
            else if(ch.equals(")")){
                while(!stack.isEmpty()){
                    String poppedout = stack.pop();
                    if(poppedout.equals("(")){
                        postfix.append(poppedout).append(" ");
                    }else {
                        break;
                    }
                }
            }
            else {
                if(stack.isEmpty()){
                    stack.push(ch);
                }
                else {
                    while (!stack.isEmpty()) {
                        String poppedOut = stack.pop();
                        if (poppedOut.equals("(")) {
                            stack.push(poppedOut);
                            break;
                        }
                        else if (poppedOut.equals("+") || poppedOut.equals("-") || poppedOut.equals("*") || poppedOut.equals("/") || poppedOut.equals("^") || poppedOut.equals("log") || poppedOut.equals("Θ") || poppedOut.equals("sin") || poppedOut.equals("π") || poppedOut.equals("cos") || poppedOut.equals("tan") || poppedOut.equals("cosec") || poppedOut.equals("√") || poppedOut.equals("sec") || poppedOut.equals("cot") || poppedOut.equals("%") ){
                             if(getpriority(poppedOut)<getpriority(ch)){
                                 stack.push(poppedOut);
                                 break;
                             }
                             else {
                                 postfix.append(poppedOut).append(" ");
                             }
                        }
                    }
                    stack.push(ch);
                }
            }
        }
        while (!stack.isEmpty()){
            postfix.append(stack.pop()).append(" ");
        }
//        System.out.println(""+postfix);
        return postfix.toString();

    }
    private static int getpriority(String ch){
        if(ch .equals("+") || ch.equals("-"))
            return 1;
        else
            return 2;
//        int asciiOfCh1 = (int) ch1;
//        int asciiOfCh2 = (int) ch2;
//        return (ch1 != ch2)?((asciiOfCh1 > asciiOfCh2)?true:false):false;
    }
}
