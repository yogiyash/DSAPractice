package gfg.string;

import lc.array.ArraysHelper;

/**Given a string S. The task is to print all permutations of a given string.
 * ABC
 * ABCD
 */
public class PermutationOfString {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4};
        interate("",arr);


    }


static void interate(String fixed,int remaining[] ){
    int len = remaining.length;
    if(len==0){
        System.out.println(fixed);
        return;
    }else  if(len ==1){
        interate(fixed+remaining[0],new int[0]);
    }else{

    for(int i =0;i< len;i++){
        String nf=fixed+remaining[i];
        int [] arr = new int[len-1];

        int pointer = 0;
        for(int j =0;j<len;j++){
            if(j==i)
                continue;
            arr[pointer++]=remaining[j];

        }
        interate(nf,arr);
    }
    }

}

/**
 * Only recursion way
* */
static void permutation(String str,int fixed,int len) {

    if (fixed == len)
        System.out.println(str);

    char[] arr = str.toCharArray();

    for (int i = 0; i < len; i++) {

    }
}


static  char[] swap(char arr[],int to, int from) {
    char temp = arr[to];
    arr[to] = arr[from];
    arr[from] = arr[to];
    return arr;
}






}