package leetcode.array;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 */

/**
 * scope of improvement with inch warm moment
 */
public class ContainsMaxWater {

    public static void main(String[] args) {
        int[] arr = new int[]//{1,8}
                //{1,2,1};
                {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //{2,3,4,5,18,17,6};
        System.out.println(maxArea2(arr));

    }


    static int maxArea(int[] height) {

        int maxArea = 0;
        int len = height.length;
        int left = 0;
        int right = 0;
        while (true) {

            if (right == len - 1) {

                if (left == right - 1)
                    break;
                //shrink window
                left++;

                int area = getWater(height, left, right);
                if (area > maxArea)
                    maxArea = area;

            } else {
                //expand window
                right++;
                int area = getWater(height, left, right);
                if (area > maxArea)
                    maxArea = area;
            }


        }
        return maxArea;
    }


    static int maxArea2(int[] height) {

        int maxArea = 0;
        int len = height.length;
        int left = 0;
        int right = 0;
        for (left = 0; left < len - 1; left++) {
            for (right = left + 1; right < len; right++) {
                int area = getWater(height, left, right);
                if (area > maxArea)
                    maxArea = area;
                //       System.out.println(String.format("%d %d",left,right));
            }
        }
        return maxArea;
    }

    static int getWater(int[] arr, int left, int right) {
        int width = right - left;
        int height = arr[left] < arr[right] ? arr[left] : arr[right];
        return width * height;
    }

}
