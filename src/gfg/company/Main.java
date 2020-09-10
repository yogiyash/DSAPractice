package gfg.company;

public class Main {


private static int sum =0;

    public static void main(String[] args) {


        int neg = 1;
        for(int i=1 ;i<1536;i++){

            String str = ""+i;
            int six = '6';

                System.out.println(str);
                str.chars().forEach(c-> {
                    if (c == six) {
                        sum++;
                    }



            }

            );



        }
        System.out.println(sum);
    }

}