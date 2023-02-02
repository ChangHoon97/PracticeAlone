package Day0202;

import java.util.Scanner;

/**
 * @Date : 2023. 2. 2.
 * @Author : 이창훈
 * @Description : Continue는 반복문의 맨 끝으로 이동한다
 * 
 */
public class ContinueEx {

	public static void main(String[] args) {
		for(int i =0;i <=10;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
		
		
		
		int menu =0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" (1) square");
			System.out.println(" (2) squar root");
			System.out.println(" (3) log");
			System.out.print("원하는 메뉴를 선택하세요. (종료 :0) >> ");
			
			menu = sc.nextInt();
			
			if(menu==0) {
				System.out.println("\n프로그램을 종료합니다");
				break;
			}else if(!(1 <= menu && menu <=3)) {
				System.out.println("\n메뉴를 잘못 선택하셨습니다.\n");
				continue;
			}
			System.out.println("\n선택하신 메뉴는" + menu + "번입니다.\n");
		}
		
		sc.close();
	}

}
