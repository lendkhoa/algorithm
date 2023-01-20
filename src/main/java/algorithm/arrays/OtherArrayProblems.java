package algorithm.arrays;

public class OtherArrayProblems {
    public static boolean nonDecreasingArray(int[] arr) {
        if(arr.length <= 1) return true;
        int move = 1;
        for(int i = 0; i < arr.length - 1; i++) {
            if(move < 1 && i != arr.length - 2) return false;
            if(arr[i] <= arr[i + 1]) continue;
            if(arr[i] > arr[i + 1]) {
                // decrease 1st
                move -= 1;
            }
        }
        return move == 0 ? true : false;
    }
}
