import java.util.Scanner;

//Time complexity=O(n)

public class RemoveElement {
	public static int remove(int nums[],int val) {
		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[index++]=nums[i];
				System.out.print(nums[i]+" ");
			}
		}
		return index; 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nums[]= {1,2,3,4,3,2,4};
		System.out.println("Enter the val to be removed");
		int val=sc.nextInt();
		 remove(nums,val);
	}

}
