public class trapping_Water {

    public static int trappedRainingwater(int height[]) {

        int n = height.length;

        // calculate left max boundry - array

        int leftMax[] = new int[n];

        leftMax[0] = height[0]; // jya first left ni bajuma ek pan hight vadu nahi hoi column

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundry - array

        int rightMax[] = new int[n]; // jya rightMax ne right thi start karu chu

        rightMax[n - 1] = height[n - 1];

        int trappeedWater = 0;

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappeedWater += waterLevel - height[i];

        }
        return trappeedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(trappedRainingwater(height));
    }
}
