public class t215 {
    public int findKthLargest(int[] nums, int k) {
        int[] bucket = new int [20005];
        for(int n:nums){
            bucket[n+10000]++;
        }
        for(int i=20004,sum=0;i>=0;i--){
            if((sum+=bucket[i])>=k){
                return i-10000;
            }
        }
        return 0;
    }
}
