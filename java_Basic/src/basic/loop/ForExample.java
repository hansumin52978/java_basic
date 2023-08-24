package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			total += i;
			i++;
		}
		*/
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
		}
		System.out.println(total);
		
		//1 ~ 200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요. (for)
		for(int i=1; i<=200; i++) {
			if(i % 6 == 0 && i % 12 != 0) {
				System.out.println(i + " ");
			}
		}
		
		//1 ~ 60000까지의 정수 중 177의 배수의 개수를 구해보세요. (for)
		int count = 0;
		for(int i=1; i<=60000; i++) {
			if(i % 177 == 0) {
				count++;
			}
		}
		System.out.println("1~60000증 177의 배수의 개수:" + count + "개");
		
		// 정수를 하나 입력받아서
		// 입력받은 정수까지의 팩토리얼 값을 구하세요.
		// 팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력: ");
		int num = sc.nextInt();
		
		int fac = 1; // 팩토리얼 최종 값을 담을 변수
//		for(int i=1; i<=num; i++) {
//			fac = fac * i;
//		}
//		System.out.println(num + "!= " + fac);
		for(int i=num; i>=1; i--) {
//			fac = fac * i;
			fac *= i; // 또는 이런식으로도 나타낼 수 있다.
		}
		System.out.printf("%d!= %d\n", num, fac);
		
		sc.close();
	}

}
