package concepts.dp;

public class UsingFibonacci {

    //112358.....

    public static void main(String[] args) {
    //    fib(1,1,5);
        for(int i=0;i<41;i++)
        System.out.println(dynamicFib(i,new int[i+1]));

    }

static void fib(int a ,int b , int upto ){
    if(upto==0)
        return;

    System.out.print(a);

    fib(b,a+b,upto-1);


}

static int  fib(int n ){
        if(n==0 || n==1)
            return 1 ;

        return fib(n-2)+fib(n-1);


}

static int dynamicFib(int n , int [] arr){

    if(n==0 || n==1)
        return 1 ;

    if(arr[n]>0){
        return arr[n];
    }

    else {
        arr[n]=dynamicFib(n-2,arr)+dynamicFib(n-1,arr);
        return arr[n];
    }


}


}
