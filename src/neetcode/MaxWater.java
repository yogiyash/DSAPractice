package neetcode;

public class MaxWater {

    public static void main(String[] args) {
        int arr [] = new int []{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int len = height.length;

        int left = 0;
        int right = len-1;

        int max = 0;

        if(len==2){
            return Math.min(height[left],height[right]);
        }

        while(left<right){

        int area = (right-left)*Math.min(left,right);
        max = Math.max(area,max);

        if(height[left]>height[right]){
            right--;
        }else{
            left++;
        }

        }
        return max; 
    }
}
