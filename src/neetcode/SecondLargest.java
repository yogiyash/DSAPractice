package neetcode;

public class SecondLargest {

    public static void main(String[] args) {
    int arr [] = new int []{9 ,-2, 3,4,5,-1,3,6,7,4,10,-30};

    int m = -100;
    int n = -100;

    for (int i: arr){

        if(i>m){
            n = m;
            m=i;
        }else if(i>n) {
           n = i;
        }


    }
        System.out.println(m+ ","+n);


    }




}


1  2  3

4  5  6 

7  8  9




352641879