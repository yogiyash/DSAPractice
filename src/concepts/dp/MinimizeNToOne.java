package concepts.dp;

/**
 * Given an integer n return minimun steps to minimize n to 1
 * rule
 * decrement n by  1
 * if n is divisible by 2 then devide n by 2
 * if n is divisible by3 thne devide n by 3
 */
public class MinimizeNToOne {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(getMinSteps(100,new int[101]));

        System.out.println("in "+ ((System.currentTimeMillis()-start)/1000));
        start = System.currentTimeMillis();
        System.out.println(getMinSteps(100));

        System.out.println("in "+ ((System.currentTimeMillis()-start)/1000));
    }

    static int getMinSteps(int n ){

        if(n==1)
            return 0;


           int a =1001;
           int b=1001;
           int c = 1001;

           if(n%2==0){
           a =     getMinSteps(n/2);
           }

           if(n%3==0){
               b= getMinSteps(n/3);
           }

            c = getMinSteps(n-1);

           int min = a>b?b>c?c:b:a>c?c:a;
           return min +1 ;




    }

    static int getMinSteps(int n,int arr[]){

        if(n==1)
            return 0;

        if(arr[n]!=0)
            return arr[n];

        int result = getMinSteps(n-1,arr);

        if(n%2==0) {
            result = Math.min(result, getMinSteps(n / 2,arr));
        }
        if(n%3==0){
            result = Math.min(result,getMinSteps(n/3,arr));
        }

        arr[n]=result+1;
        return  arr[n];

    }


}
