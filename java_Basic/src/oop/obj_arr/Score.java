package oop.obj_arr;

/*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.
      
     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
      
     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
public class Score {
	
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private int sci;
	private double average;
	String name;
	
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng, int mat, int sci) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
		this.name = name;
		int total =  kor + eng + mat + sci;		
		double average =  (kor + eng + mat+ sci)/4.0;
		this.total = total;
		this.average = average;
				
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void scoreInfo() {
		System.out.printf("이름: %s\n총점: %d\n평균: %.2f\n", this.name, this.total, this.average);
	}
}
