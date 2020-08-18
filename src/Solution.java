import java.util.ArrayList;
import java.util.List;

class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> numb = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            if (numb.contains(temp)){
                numb.remove(numb.indexOf(temp));
            }else{
                numb.add(temp);
            }
        }
        return (numb.get(0));
    }
}
