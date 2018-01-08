public class Solution {

    public void rotate(int[] arr, int k) {
	if (arr == null || arr.length==0 || k < 0) {
		throw new IllegalArgumentException("Illegal argument!");
	}

	if(k > arr.length){
		k = k % arr.length;
	}

	//length of first part
	int n = arr.length - k;

	reverse(arr, 0, n-1);
	reverse(arr, n, arr.length-1);
	reverse(arr, 0, arr.length-1);

}

public void reverse(int[] arr, int left, int right){
	if(arr == null || arr.length == 1)
		return;

	while(left < right){
		  int temp = arr[left];
		  arr[left] = arr[right];
		  arr[right] = temp;
		  left++;
		  right--;
	 }
  }
}
