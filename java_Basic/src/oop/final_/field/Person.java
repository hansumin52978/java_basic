package oop.final_.field;

public class Person {
	
	//final 변수는 불변의 값을 의미합니다.
    //그렇기 때문에 반드시 초기화가 필요합니다.
    //초기화는 직접 하는 방법과, 생성자를 이용하는 방법이 있습니다.
	
	// final String nation; (X)
	final String nation = "대한민국"; 
	final String name;
	int age;
	
	// 직접 초기화 하는 방식 말고도 이런 방식도 있다.
	public Person(String name) {
		this.name = name;
	// final 필드를 직접 초기화 하는 방식 말고, 객체가 생성될 때 동시 초기화 할 수 있게
	// 생성자에 필드 초기화 로직을 작성할 수도 있다.
	// 그럼 이제 객체가 생성될 때 전달한 값이 절대 바뀌지 않는 불변의 값으로 지정될 것이다.
	}
}
