import java.util.Arrays;

//Time Complexity= O(m + n)

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=nums1.length-1;
        m--;
        n--;

        while(k>=0){

            if(m >= 0 && n>= 0 && nums1[m] <= nums2[n]){
                nums1[k--] = nums2[n--];
            }
            else if(m>=0){
                nums1[k--] = nums1[m--];
            }
            else{
                nums1[k--] = nums2[n--];
            }
        }
	}
	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
	    merge(nums1, m, nums2, n); 
	    System.out.println(Arrays.toString(nums1)); 
	}

}
