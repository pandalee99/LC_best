import java.util.ArrayList;
import java.util.List;

public class t78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int all=list.size();
            for(int j=0;j<all;j++){
                List temp=new ArrayList<>(list.get(j));
                temp.add(nums[i]);
                list.add(temp);
            }
        }
        return list;
    }
}
