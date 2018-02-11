class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	    permute(nums, 0, ans);
	    return ans;
    }


void permute(int[] num, int start, List<List<Integer>> result) {

	if (start >= num.length) {
		ArrayList<Integer> item = convertArrayToList(num);
		result.add(item);
	}

	for (int j = start; j <= num.length - 1; j++) {
		swap(num, start, j);
		permute(num, start + 1, result);
		swap(num, start, j);
	}
}

private ArrayList<Integer> convertArrayToList(int[] num) {
	ArrayList<Integer> item = new ArrayList<Integer>();
	for (int h = 0; h < num.length; h++) {
		item.add(num[h]);
	}
	return item;
}

private void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}
}