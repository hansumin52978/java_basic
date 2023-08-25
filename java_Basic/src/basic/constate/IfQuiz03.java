package basic.constate;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

				/*
		         - 정수 3개를 입력 받습니다.
		         - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
		         
		         # max, mid, min이라는 변수를 미리 선언하셔서
		          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		          마지막에 한번에 출력하시면 되겠습니다.
		         */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("두번째 수를 입력하시오: ");
		int b = sc.nextInt();
		System.out.print("세번째 수를 입력하시오: ");
		int c = sc.nextInt();
		
		int max, mid, min;
		
		if(a>b && a>c) { // a가 max다!
			max = a;
			if(b > c) {
				mid = b; min = c;
			} else {
				mid = c; min = b;
			}
		
		} else if(b > a && b > c) { // b가 max다!
			max = b;
			if(a > c) {
				mid = a; min = c;
			} else {
				mid = c; min = a;
			}
		} else { // c가 max다!
			max = c;
			if(a > b) {
				mid = a; min = b;
			} else {
				mid = b; min = a;
			}
		}
			
		System.out.println("-------------------------");
		System.out.println("최대값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("최소값: " + min);
		
		sc.close();
		
	}

}
