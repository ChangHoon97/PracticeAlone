package Day0202;

public class RepetitionEx1 {

	public static void main(String[] args) {
		for(int i= 1;i<10;i++) {
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		int[] arr = {10,20,30,40,50};
		
		//arr에 저장된 값이 하나하나 tmp에 저장된다
		// 10 -> 20 -> 30 ....
		for(int tmp : arr) {
			System.out.println(tmp);
		}

	}

}
