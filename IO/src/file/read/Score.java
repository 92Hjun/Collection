package file.read;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	
	public Score() {}

	public Score(String name, int kor, int eng, int math, int total) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	
	
}
