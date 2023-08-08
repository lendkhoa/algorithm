package algorithm.twoPointers;

public class TrapWater {

    public int maxVolume(int[] crossSection) {
        if(crossSection.length <= 1) return 0;

        int n = crossSection.length;
        int maxLeft = crossSection[0];
        int maxRight = crossSection[n-1];

        int left = 0;
        int right = n - 1;
        int res = 0;

        while(left < right) {
            if(maxLeft < maxRight) {
                left += 1;
                maxLeft = Math.max(maxLeft, crossSection[left]);
                res += maxLeft - crossSection[left];
            } else {
                right -=1;
                maxRight = Math.max(maxRight, crossSection[right]);
                res += maxRight - crossSection[right];
            }
        }

        return res;
    }
}
