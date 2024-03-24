public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate current area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // Update maximum area
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer corresponding to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        // Example input
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Call the function to find the maximum area
        int maxArea = solution.maxArea(height);

        // Output the result
        System.out.println("Maximum area of the container: " + maxArea);
    }
}
