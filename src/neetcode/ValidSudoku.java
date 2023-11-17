package neetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {


public boolean isValidSudoku(char[][] a) {
        Set<String> set = new HashSet<>();


        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(a[i][j]!='.'){
                    String row = i+"row"+a[i][j];  
                    String column = j+"column"+a[i][j];
                    String grid = (i/3)+"-"+(j/3)+"grid"+a[i][j];

                    if(!(set.add(row) && set.add(column) && set.add(grid))){
                        return false;
                    }

                }
            }
        }
        return true;

        
    }


    public static void main(String[] args) {
        for (int i = 0;i<9;i++){

            for(int j =0;j<9;j++){  
                System.out.print(" "+(i+j)+" ");

            }
            System.out.println("\n");
        }
    
        
    }
    
}
