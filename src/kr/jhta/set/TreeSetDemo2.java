package kr.jhta.set;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<>();
		students.add(new Student("홍길동", 100));
		students.add(new Student("김유신", 70));
		students.add(new Student("강감찬", 60));
		students.add(new Student("이순신", 40));
		students.add(new Student("유관순", 90));
		// students.add(new Student("윤봉길", 90)); 저장되지 않는다. 2진트리(TreeSet은 Set을 implements 받아 구현된객체이므로 중복저장이 되지않는다.)
		System.out.println(students);
		
		Student winner = students.last();
		System.out.println(winner);
	}

	public static class Student implements Comparable<Student>{
		private String name;
		private int score;

		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public int getScore() {
			return score;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", score=" + score + "]";
		}

		@Override
		// compareTo는 int값으로 현시점에 있는 객체의 int값에 다른 other의 int값을 뺀후 음수면 왼쪽으로 0이면 제자리 양수면 오른쪽으로
		// 옮기는 성질이있다. Comparable을 implements 하면 compareTo가 무조건 재정의 되어있어야한다.
		public int compareTo(Student other) {
			int result = score - other.score;
			 
			return result;
		}

	}
}
