public class 标准快排 {
    public int[] sortArray(int[] nums) {
        return qs(nums,0,nums.length-1);
    }
    public int[] qs(int[] nums,int left, int right){
        if(left<right){
            int L=left,R=right,num=nums[L];
            while(L<R){
                while(L<R && nums[R]>num){R--;}
                if(L<R){
                    nums[L]=nums[R];
                    L++;
                }
                while(L<R && nums[L]<num){L++;}
                if(L<R){
                    nums[R]=nums[L];
                    R--;
                }
            }
            nums[L]=num;
            qs(nums,left,L-1);
            qs(nums,L+1,right);
        }
        return nums;
    }
}
