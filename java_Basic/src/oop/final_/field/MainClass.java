package oop.final_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
//		kim.nation = "미국"; (x)
//		kim.name = "김마이클"; (x)
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation = "영국"; (x)
//		park.name = "박영국"; (x)
		
		// final로 선언된 변수는 절대 바뀔 수 없는 불변의 값으로 인식되기 때문에
		// 할당 행위 자체가 성립되지 않는다.
		
	}

}
