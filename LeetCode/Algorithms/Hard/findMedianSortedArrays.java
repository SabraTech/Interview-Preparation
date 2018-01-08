public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> all = new ArrayList<Integer>();
        double ans = 0;
        for(int i : nums1){
            all.add(i);
        }
        for(int i : nums2){
            all.add(i);
        }
        Collections.sort(all);
        int n = all.size();
        if(n % 2 == 0){
            ans = (all.get(n/2-1) + all.get(n/2))/2.0;
            return ans;
        }else{
            ans = all.get(n/2);
            return ans;
        }

    }
}
