package leetcode.string;

import java.util.Stack;

public class InToPostFix {
    public static void main(String[] args) {

        String in = "1+3+4*5+(6^7)*8/9/10*11+12";
        in ="1+2+3*(45/3)-1";
//        String post = intopost(in);
//        evaluatePostFix(post);
        inFixEvaluation(in);

    }



    static  String intopost(String in ) {

        char[] chars = in.toCharArray();
        int len = chars.length;
        Stack<Character> stack = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = 0; i < len; i++) {
            if (isDigit(chars[i])) {
                i = i - 1;
                int num = 0;
                while (i+1<len && isDigit(chars[i + 1])) {
                    num = num * 10 + (chars[i + 1] - '0');
                    i++;
                }
                postfix.push(num + "");
            } else if (isOperator(chars[i])) {

                if (stack.isEmpty())
                    stack.push(chars[i]);

                else if (precedence(stack.peek()) < precedence(chars[i])) {
                    stack.push(chars[i]);
                } else if (precedence(stack.peek()) >= precedence(chars[i])) {
                    postfix.push(stack.pop() + "");
                    i--;
                    // so the loop resume from the same position
                }
            } else if (chars[i] == '(') {
                stack.push('(');
            } else {
                //close brace

                while (stack.peek() != '('){
                    postfix.push(stack.pop() + "");
                }


                //pop the brace
                stack.pop();


            }
        }
        if(stack.isEmpty()==false){
            while(stack.isEmpty()==false){
                postfix.push(stack.pop()+"");
            }
        }

        int stackLength = postfix.size();

        String arr[] = new String[stackLength];

        for (int i = stackLength - 1; i >= 0; i--)
            arr[i] = postfix.pop();

        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append(s);
        }
        return builder.toString();
    }

    static boolean isDigit(char c){
        int a = c - '0';
        return  a>=0 && a<=9;
//        return  c>= 'A' && c<= 'Z';

    }


    static boolean isOperator(char c){

        return  c=='+' || c=='-' || c=='*'|| c=='/' || c=='^';
    }


    static int precedence (char c){

        switch (c){
            case '^':
                return 3;
            case '*','/':
                return  2;
            case '+','-'
                :
                    return 1;
            default:
                return  0;
        }

    }

    static int evalute(int a , int b , char op){

        switch (op) {
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '^':
                return (int) Math.pow(a, b);

            default:
                return 0;
        }


    }

    static void   evaluatePostFix(String postfix){
        char  [] chars =    postfix.toCharArray();
        Stack<Integer> values  = new Stack<>();

        for(int i =0;i< chars.length;i++){

            if(isDigit(chars[i])){
                values.push(chars[i]-'0');
            }
            if(isOperator(chars[i])){
                     int a  =  values.pop();
                     int b =  values.pop();
                     int res = evalute(b,a,chars[i]);
                     values.push(res);
            }
            }
        while(values.isEmpty()==false)
            System.out.println(values.pop());
    }




    static void   inFixEvaluation(String infix){
        char  [] chars =    infix.toCharArray();
        Stack<Integer> values  = new Stack<>();
        Stack<Character> operators  = new Stack<>();

        int len = chars.length;
        for(int i =0;i< chars.length;i++){

            if(chars[i]==' ')
                continue;

            if(isDigit(chars[i])){
                i--;
                int num =0;
                while(i+1<len && isDigit(chars[i+1])){
                    num = num*10 ;
                    num += chars[i+1]-'0';
                    i++;
                }
                values.push(num);
            }else if(isOperator(chars[i])){
                //
                if(operators.isEmpty()){
                    operators.push(chars[i]);
                }else if (precedence(operators.peek())<precedence(chars[i])){
                    operators.push(chars[i]);
                }else if(precedence(operators.peek())>= precedence(chars[i])){
                    while(operators.isEmpty()==false && precedence(operators.peek())>=precedence(chars[i])){
                        int a = values.pop();
                        int b = values.pop();
                        int res = evalute(b,a,operators.pop());
                        values.push(res);
                    }
                    operators.push(chars[i]);
                }
            }else if (chars[i]=='('){
                operators.push(chars[i]);
            }else {
               // chars[i]== ')'
                while(operators.peek()!='(')
                {
                    char op = operators.pop();
                    int a = values.pop();
                    int b = values.pop();
                    int result = evalute(b,a,op);
                    values.push(result);
                }
                operators.pop();



            }




        }
        while(operators.isEmpty()==false) {
            int a = values.pop();
            int b = values.pop();
            int res = evalute(b,a,operators.pop());
            values.push(res);
        }
        System.out.println("and the result ");

        while (values.isEmpty()==false)
            System.out.println(values.pop());

    }








}



