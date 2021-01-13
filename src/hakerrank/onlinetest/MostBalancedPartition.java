/*
package hakerrank.onlinetest;
*/
/**
 * ? come backs to this
 * /***
 * Given an array parent refer tos parent node [-1,000,22] and size[1,2,2,1,1,1]
 * break sub directory into most balance tree
 *//*

public class MostBalancedPartition {
}


import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;



class Result {

    */
/*
 * Complete the 'mostBalancedPartition' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY parent
 *  2. INTEGER_ARRAY files_size
 *//*



    public static int mostBalancedPartition(List<Integer> parent, List<Integer> files_size) {


        int len = parent.size();

        HashMap<Integer, TreeNode> levelMap = new HashMap<>();
        for(int i =0;i<len;i++){
            Integer rootAdd = parent.get(i);
            if(rootAdd ==-1){
                TreeNode root = new TreeNode();
                levelMap.put(0, root);
            }
            else {
                TreeNode dir = levelMap.get(i);
                if(dir!=null){
                    if(dir.sub==null){
                        dir.sub = new Arraylist<TreeNode>();
                        TreeNode subdir = new TreeNode();
                        TreeNode
                    }
                }

            }




        }






    }





}

class TreeNode(){

    int position;
    int sum;
    TreeNode root;
    List<TreeNode> sub;

}

public class Solution {*/
