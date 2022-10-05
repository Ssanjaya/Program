import java.util.Stack;

public class InfixToPostfix {
    public static String infixToPostfix(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix= new StringBuilder();
        char [] character = s.toCharArray();

        for(char ch : character ){
            if(ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '(' && ch != ')' && ch != '^'){
                postfix.append(" ").append(ch);
//                System.out.println(postfix);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if(ch == ')'){
                while(!stack.isEmpty()){
                    char poppedout = stack.pop();
                    if(poppedout != '('){
                        postfix.append(" ").append(poppedout);
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
                        char poppedOut = stack.pop();
                        if (poppedOut == '(') {
                            stack.push(poppedOut);
                            break;
                        }
                        else if (poppedOut == '+' || poppedOut == '-' || poppedOut == '*' || poppedOut == '/'|| poppedOut =='^' ){
                             if(getpriority(poppedOut)<getpriority(ch)){
                                 stack.push(poppedOut);
                                 break;
                             }
                             else {
                                 postfix.append(" ").append(poppedOut);
                             }
                        }
                    }
                    stack.push(ch);
                }
            }
        }
        while (!stack.isEmpty()){
            postfix.append(" ").append(stack.pop());
        }
//        System.out.println(""+postfix);
        return postfix.toString();

    }
    private static int getpriority(char ch){
        if(ch == '+' || ch == '-')
            return 1;
        else
            return 2;
//        int asciiOfCh1 = (int) ch1;
//        int asciiOfCh2 = (int) ch2;
//        return (ch1 != ch2)?((asciiOfCh1 > asciiOfCh2)?true:false):false;
    }
}
