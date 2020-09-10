package hakerrank.interviewprep.arrays;

/**
 * given 6*6 2d array
 * max hour glass sum
 * the challenge failed for couple of test cases for initial value of sum =0 since the value at any place range from -9<= a[i][j] <= so -9*7= -63 is the
 * max negative value so assign -64 to sum
 */
public class TwoDArrayDS {

    static int getHourglassMaxSum (int [][] arr){
        int m_sum =-64;
        for(int i =0; i<4;i++){
            for(int j=0;j<4;j++){
            int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                                arr[i+1][j+1]+
                   arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

            if(sum>m_sum)
                m_sum=sum;

            }
        }
    return m_sum;
    }

    public static void main(String[] args) {
        int arr[][]=new int[][]{
                {-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0 ,0, 8, 6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}};
        System.out.println(getHourglassMaxSum(arr));



    }
}
