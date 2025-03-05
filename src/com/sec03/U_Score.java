package com.sec03;

public class U_Score {
	private String name;
	private int koreanScore;
	private int mathScore;
	private int engScore;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public int getKoreanScore() {
		return koreanScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getMathScore() {
		return mathScore;
	}


	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getEngScore() {
		return engScore;
	}
	
	public int getTot() {
		return this.getKoreanScore()+this.getMathScore()+this.getEngScore();
	}
	public double getAvg() {
		return this.getTot() / 3;
	}
	
	@Override
	public String toString() {
		return String.format(
				"[이름 = %s, 국어 = %d, 수학 = %d, 영어 = %d, 총점 = %d, 평균 = %.2f]",
				getName(), getKoreanScore(), getMathScore(), getEngScore(), getTot(), getAvg());
	}
	public static void main(String[] args) {
		U_Score s1 = new U_Score();
		U_Score s2 = new U_Score();
		U_Score s3 = new U_Score();
		
		s1.setName("홍길동");
		s1.setKoreanScore(100);
		s1.setMathScore(100);
		s1.setEngScore(100);
		
		s2.setName("정길동");
		s2.setKoreanScore(90);
		s2.setMathScore(90);
		s2.setEngScore(90);
		
		s3.setName("최길동");
		s3.setKoreanScore(80);
		s3.setMathScore(80);
		s3.setEngScore(80);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//이름만 출력
		System.out.printf("%s %s %s\n", s1.getName(),s2.getName(), s3.getName() );
		//전체 총점
		int tot = s1.getTot() + s2.getTot() + s3.getTot();
		System.out.printf("total = %d\n", tot);
		
		

	}

}
