
import java.util.Arrays;


public class TwoSum {
    public static void main(String[] args) {
        /* 
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = new int[2];
        int remain;
        for(int i = 0; i < nums.length; i++){
            result[0] = i;
            remain = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(remain == nums[j]){
                    result[1] = j;
                    System.out.println(Arrays.toString(result));    // 31 ms
                    
                }
            }
        } 
       */
        int[] nums = {3,2,4};
        int target = 6;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(Arrays.toString(new int[]{i,j}));  // 38 ms
                }
            }
        }     
    }
}
