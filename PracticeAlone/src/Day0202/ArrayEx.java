package Day0202;

import java.util.Arrays;

/**
 * @Date : 2023. 2. 2.
 * @Author : 이창훈
 * @Description : 배열 선언 및 초기화 방법
 * 
 */
public class ArrayEx {

	public static void main(String[] args) {
		int n= 5;
		
		String[] str1 = new String[5];
		int[] nums2 = new int[] {1,2,3,4,5};
		int[] nums3 = new int[n];
		
		System.out.println(nums2);
		
		for(int i=0;i<nums2.length;i++) {
			System.out.println(nums2[i]);
		}
		
		//java.util.Arrays를 사용하여 배열 출력
		System.out.println(Arrays.toString(nums2));

		//배열의 복사
		System.arraycopy(nums2, 0, nums3, 0, nums2.length);
		//nums2[0]에서 num3[0]으로 nums2.length개의 데이터를 복사
		
		System.out.println(Arrays.toString(nums3));
		
		int[][] arr = new int[][] { {1,2,3}, {4,5,6}};
		
		int[][] arr2 = { {4,5,6}, {7,8,9} };
		
		//2차원 배열의 길이는 행의 갯수이다.
		System.out.println(arr.length);
		
		//2차원 배열의 열의 갯수 구하기
		System.out.println(arr2[0].length);
		
	}

}
