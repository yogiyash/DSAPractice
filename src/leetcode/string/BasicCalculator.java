//package leetcode.string;
//
//import java.beans.Expression;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Stack;
//
///**
// * evaluate math expressions
// * 1. only + - operators are used
// * 2. only valid expression are provided
// * 3. expresion may have brackets
// * 4. example 3 + ( 1 + 2 ) - 1
// *
// * approach using stack
// * rules whenever a bracket is encountered put the result upto now in stack and work on calc new baby result
// * if close bracket is encountered pop from stack
// *
// *
// */
//
//
//
//
//class stacknode{
//    char val ;
//    stacknode next ;
//    stacknode top ;
//
//    void push(char  val){
//        if(top ==null){
//            top = new stacknode(val,true);
//        }else{
//            stacknode node = new stacknode(val,false);
//            node.next = top;
//            top = node;
//        }
//    }
//
//    stacknode pop(){
//       stacknode node =null;
//        if(top!=null){
//            node= top;
//            top = top.next;
//        }
//        return  node;
//    }
//
//
//    stacknode(char val,boolean isroot ){
//        super();
//        this.val = val ;
//        top = isroot?this:null;
//    }
//
//
//
//}
//
///**
// * lets say its hold expression for a bracket worth of operation
// * in other world when we encounter open bracket we create this
// */
//class optnode{
//
//    int left;
//    int right;
//    char op;
//    int operate(){
//        if(op == '-')
//            return  left-right;
//        else return  left+right;
//    }
//
//
//}
//
//
//public class BasicCalculator {
//
//
//
//
//
//
//
//    public static void main(String[] args) {
//
//       /*
//
//       * */
//        String expression = "(3+(1+2)-1)";
//
//        expression = "1+8-(3+4)-2";
//        Stack<Integer> digits = new Stack<>();
//        Stack<Character> ops = new Stack<>();
//
//        char[] chars = expression.toCharArray();
//        int  len = chars.length;
//
//
//        int  num = 0;
//
//        int i =0;
//
//        for  (i=0;i<len;i++) {
//
//            char c = chars[i];
//            if(c==' ')
//            {
//
//            }else if (isDigit(c)) {
//                i--;
//                while(i+1<len && isDigit(chars[i+1])){
//
//                    c = chars[++i];
//                    int digit = c-'0';
//                    num = num * 10 +digit;
//                }
//                digits.push(num);
//                num =0;
//
//            }else   if(isOpen(c)){
//                ops.push(c);
//            }else  if(isOperator(c)){                //push num and operators onto stack
//
//                ops.push(c);
//            }else{
//                // is closed
//                //operate until you get last opened bracket
//                char op = ops.pop();
//                int  sum =0;
//                while(isOpen(op)==false){
//                    int b= digits.pop();
//                    int a = digits.pop();
//
//                    if(op == '-'){
//                        sum += a - b;
//                    }else{
//                        //+
//                        sum += a + b;
//                    }
//                    digits.push(sum);
//                    sum=0;
//                    op= ops.pop();
//                }
//            }
//
//        }
//
//        int sum =0;
//        char op ;
//        while(ops.size()>0){
//
//                op = ops.pop();
//                int a = digits.pop();
//                int b = digits.pop();
//            if(op == '-'){
//
//                sum = a - b;
//            }else{
//                //+
//                sum = a + b;
//
//            }
//            digits.push(sum);
//        }
//
//        System.out.println(digits.pop());
//
//
//
//    }
//
//
//
//
//
//
//    static boolean flipSign(Stack<Character> ops){
//
//    }
//
//    static boolean isOperator(char c){
//        return c== '+' || c=='-';
//    }
//
//    static boolean isOpen(char c){
//        return c== '(' ;
//    }
//
//    static  boolean isClose(char c){
//        return c== ')';
//    }
//    static  boolean isDigit(char c){
//
//        return  ( c >=48 && c<= 57);
//    }
//
//
//
//
//
//
//}
