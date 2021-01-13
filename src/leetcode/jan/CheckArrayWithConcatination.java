package leetcode.jan;

import java.util.HashSet;
import java.util.Set;

public class CheckArrayWithConcatination {



        public boolean canFormArray(int[] arr, int[][] pieces) {

            boolean result = true;
            int arr_point = 0;
            int arr_len = arr.length;

            int[] selectedPiece = null;

            Set<Integer> usedPieces = new HashSet<>();



            while(arr_point<arr_len){

                if(selectedPiece ==null ){
                    //look for new piece
                    boolean found = false ;
                    for(int i =0; i<pieces.length ;i++){
                        if(!usedPieces.contains(i)){

                            int [] piece = pieces[i];

                            if(piece[0] == arr[arr_point]){
                                //piece found
                                usedPieces.add(i);
                                selectedPiece = piece;
                                found =true;
                                break;

                            }

                        }
                    }

                    // if no matching pieces exist then return false
                    if(!found)

                    {
                        result = false ;
                        break;
                    }


                }else {

                    //parse exiting piece

                    int x = 0;
                    int len = selectedPiece.length;

                    while(x<len){

                        if(selectedPiece[x] != arr[arr_point]){
                            result = false;
                            break;

                        }else {
                            x++;
                            arr_point++;
                        }

                    }

                    // selected piece is parsed
                    selectedPiece = null;
                }


            }




            return result && (pieces.length == usedPieces.size());




    }
}
