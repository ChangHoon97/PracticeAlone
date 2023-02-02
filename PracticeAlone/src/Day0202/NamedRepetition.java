package Day0202;

/**
 * @Date : 2023. 2. 2.
 * @Author : 이창훈
 * @Description :  이름 붙은 반복문
 * 
 */
public class NamedRepetition {

	public static void main(String[] args) {
		Loop1 : for(int i=2; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5) {
					break Loop1;
					//break;
					//continue Loop1;
					//continue;
				}
				System.out.println(i+"*" + j + "=" + i*j);
			}
			System.out.println();
		}

	}

}
