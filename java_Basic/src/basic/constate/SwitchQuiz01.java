package basic.constate;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

				/*
		         - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		          다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		          연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		          연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		          결과를 말씀해 주세요.
		         */
		
		
		int a = 0;
		int b = 0;
		int result = 0;
		String op = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("연산자를 입력하세요: ");
		op = sc.next();
		System.out.print("두 번째 수를 입력하세요: ");
		b = sc.nextInt();
		
		switch (op) {
		case "+" :
			result = a + b;
			System.out.printf("%d + %d = %d", a, b, result);
			break;
		case "-" :
			result = a - b;
			System.out.printf("%d - %d = %d", a, b, result);
			break;
		case "*" :
			result = a * b;
			System.out.printf("%d * %d = %d", a, b, result);
			break;
		case "/" :
			result = a / b;
			System.out.printf("%d / %d = %d", a, b, result);
			break;
		case "%" :
			result = a % b;
			System.out.printf("%d %% %d = %d", a, b, result);
			break;
		default:
			System.out.println("잘못된 연산자 입력하셨습니다.");
			break;
		}
		

		
	}

}
