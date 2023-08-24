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
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if(a>b && b>c) {
			max = a; mid = b; min = c;
		} else if(a>c && c>b) {
			max = a; mid = c; min = b;
		} else if(b>a && a>c) {
			max = b; mid = a; min = c;
		} else if(b>c && c>a) {
			max = b; mid = c; min = a;
		} else if(c>a && a>b) {
			max = c; mid = a; min = b;
		} else if(c>b && b>a) {
			
			max = c; mid = b; min = a;}
			System.out.println("가장 큰 값: " + max);
			System.out.println("가장 중간 값: " + mid);
			System.out.println("가장 작은 값: " + min);
		
		sc.close();
		
	}

}
