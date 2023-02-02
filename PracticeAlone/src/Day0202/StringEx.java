package Day0202;

public class StringEx {

	public static void main(String[] args) {
		String str = "abcde";
		
		//charAt 사용
		char ch = str.charAt(3);
		System.out.println(ch);
		
		//substring 사용 1<= str <4
		String tmp =str.substring(1,4);
		System.out.println(tmp);
		
		//equals 는 대소문자를 구분한다.
		boolean ask = str.equals("abcDe");
		System.out.println(ask);
		
		
		//equalsIgnoreCase는 대소문자 구별X
		ask = str.equalsIgnoreCase("AbCdE");
		System.out.println(ask);

		String str2 = "2";
		int num1 = Integer.parseInt(str2);
		System.out.println(7 +num1);
	}

}
