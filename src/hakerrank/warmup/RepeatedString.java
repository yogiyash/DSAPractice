package hakerrank.warmup;

/**
 *
 * Lilah has a string,
 *
 * , of lowercase English letters that she repeated infinitely many times.
 *
 * Given an integer,
 * , find and print the number of letter a's in the first
 *
 * letters of Lilah's infinite string.
 *
 * For example, if the string
 * and , the substring we consider is , the first characters of her infinite string. There are occurrences of a in the substring.
 *
 *
 */
public class RepeatedString {


    public static void main(String[] args) {
        System.out.println(repeatedString("aba",10));
        System.out.println(repeatedString("a",1000000000000l));

    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int len = s.length();

      /*  if(len ==1 && n==1){
            return s.charAt(0)=='a'?1:0;
        }*/

        boolean superset = len<n;
        long count =0;
        for(int i=0;i<((superset)?len:n);i++){
                if(s.charAt(i)=='a'){
                    count++;
                }
        }

        if(superset){
            long times = n/len;
            count*=times;
            //remaining
            long sub= n%len;
            if(sub>0){
                for(int i=0;i<sub;i++) {
                    if (s.charAt(i) == 'a') {
                        count++;
                    }
                }

            }
        }
        return count;
    }

}
