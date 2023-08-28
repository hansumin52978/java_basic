package basic.method;

/*
# 반환값, 반환 유형 (return value, return type)

1. 반환값이란 메서드의 실행 결과값을 의미합니다.

2. 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한 개만
 존재해야 합니다.
 
3. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때
 메서드 이름 앞에 반드시 반환 유형을 명시해야 합니다.
 
4. return이라는 키워드를 사용하며 return 뒤에 전달할 값을
 지정합니다. (변수, 상수)
 
5. 반환값이 있는 메서드는 호출문 자체가 하나의 값으로 처리될 수 있기 때문에
 반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도
 처리될 수 있습니다.

6. 모든 메서드가 반환값이 있는 것은 아닙니다. 메서드 실행 후에
 반환할 값이 딱히 없다면 return을 생략해도 됩니다.
 
7. 이 때는 반환유형을 메서드를 선언할 때 비워두지 마시고
 void라는 키워드를 작성해 주셔야 합니다.
 
8. 모든 메서드는 return을 만나면 강제로 메서드가 종료됩니다.
 따라서 조건 없이 return문 아래에 코드를 작성할 수 없습니다.
 void메서드에서는 return 키워드를 탈출 기능으로 사용할 수 있습니다.

*/

public class MethodExample3 {
	
	// 이렇게, 리턴값이 있는 메서드는 메서드 호출문이 곧 리턴값으로 처리될 수 있기 때문에
	// 다른 메서드의 메개값으로도 사용이 가능하다. r3를 보면 됨.
	static int add(int n1, int n2) {
		return n1 + n2;
//		System.out.println("야~~~"); (x)
	}
	
	// 여러개의 값 리턴하고 싶으면 배열에 싸서 보내셈.
	// return 여러 개 못씀. 때에 따라 return이 여러 개 들어가는 경우도 있지만
	// 메서드 호출 한 번에 하나의 값 리턴이라 생각하면 됨.
	// 그렇기 때문에 값을 여러 개 리턴하려면 배열로 포장해서 보내시라.
	static int[] operateTotal(int n1, int n2) {
		return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
	}
	
	static double[] calcArrayTotal(int [] nums) {
		int total = 0;
		for(int n : nums) {
			total += n;
		}
		double avg = total / (double)nums.length;
		return new double[] {total, avg};
	}
	
	// 모든 메서드가 반환값이 있는 것은 아닙니다. 메서드 실행 후에
	// 반환할 값이 딱히 없다면 return을 생략해도 됩니다.
	// 이 때는 반환유형을 메서드를 선언할 때 비워두지 마시고 void라는 키워드를 작성해 주어야 한다.
	static void multi(int n1, int n2) {
		int result = n1 * n2;
		System.out.printf("%d x %d = %d\n", n1, n2, result);
	}
	
	// 모든 메서드는 return을 만나면 강제로 메서드가 종료된다.
	// 따라서 조건 없이 return문 아래에 코드를 작성하실 수 없다.
	// void메서드에서만 return키워드를 탈출 기능으로 사용할 수 있다.
	// divide 메서드는 매개값 두 개를 받아서 두 수를 나눈 후 그 결과를 출력하는 메서드이다.
	// 그런데 n2에 0이 들어가면 에러가 발생할 수 있기 때문에
	// 0이 전달되면 메서드를 강제 종료를 시켜주고 싶다. 그럼 break를 사용하냐?
	// break는 switch문이나 반복문에서만 사용이 가능하다.
	// 그렇다면 return을 사용해서 강제로 종료시켜 줄 수 있다. return뒤에는 아무것도 작성하지 않아도 된다.
	// void메서드이기 때문에 반환하는 용도가 아닌 탈출 용도로 사용한다.
	static void divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("0으로 나누시면 어떡해요!");
			return;
		}
		int result = n1 /n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}
	public static void main(String[] args) {
		
		int r1 = add(3, 8); // int r1 = 11;
		int r2 = add(10, 15); // int r2 = 25;
		int r3 = add(add(4,6), add(7,8)); // int r3 = 10, 15
		System.out.println(r3);
		
		int[] totalResult = operateTotal(30, add(2,4));
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 x 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);
		
		/*
	    1. 메서드 이름은 calcArrayTotal로 정의하겠습니다.
	    2. 이 메서드는 정수 배열을 하나 전달받아서 해당 배열 내부에 있는
	    모든 정수의 합계(int)와 평균(double)을 '배열'에 담아서
	    리턴하는 메서드입니다.
	    3. 2번에 정의한 조건대로 메서드를 선언하시고, 실제로 main에서 호출해서
	    합계와 평균(소수점 둘째 자리까지)을 출력해 주세요.
	    {57, 89, 78, 91, 93, 47}
	    */
		System.out.println("--------------------------------------------------------");
		int[] numbers = {57, 89, 78, 91, 93, 47};
		double[] result = calcArrayTotal(numbers);
		System.out.printf("합계: %d, 평균: %.2f\n", (int)result[0], result[1]);
		
		System.out.println("--------------------------------------------------------");
		// multi라는 메서드는 매개값을 두 개 받는다.
		// 그리고 그 두 개의 값을 곱한 뒤에 출력하고 끝내는 메서드이다.
		// 리턴이 필요한 메서드가 아니기 때문에 return이 들어가지 않는다.
		// 그렇다면 리턴 타입은 void라고 작성해야한다.
		/*
        - 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에
         실행 결과를 변수에 저장할 수 없고, 다른 메서드의 매개값으로도
         사용이 불가능합니다.
        - 반드시 단독 호출하여 사용해야 합니다.
        - void 메서드는 단순히 동작을 지시하는 역할을 수행합니다.
        */
//		int r4 = multi(10, 7); (x)
//		System.out.println(multi(10, 7)); (x)
		multi(10, 7); 
		
		multi(add(3,4), add(4,7));
//		add(multi(4,4), multi(5,6)); (x)
		
		divide(20, 0);
	}

}
