
public class TrappedRainWater {

    public static int trappedWater(int arr[]) {
        //calculate rightMax 
        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        //calculate leftMax 
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        int trappedWater = 0;
        //loop
        for (int i = 0; i < arr.length; i++) {
            // waterlevel = min(rightMax,leftMax)
            int waterlevel = Math.min(rightMax[i], leftMax[i]);
            //trappedWater += waterlevel -height[i]
            trappedWater += waterlevel - arr[i];

        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("total amount of trapped water:" + trappedWater(arr));
    }
}
