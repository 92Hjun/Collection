package studentproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseMgr {

	Scanner sc = new Scanner(System.in);

	ArrayList<Professor> professors = new ArrayList<>();
	ArrayList<Student> students = new ArrayList<>();
	ArrayList<Course> courses = new ArrayList<>();
	Professor loginedProfessor = null;
	Student loginedStudent = null;

	public CourseMgr() {
	}

	public void joinProfessor() throws Exception { // 교수 회원가입

		Professor professor = new Professor();
		int no = 0;
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("professor.sav"));
		System.out.println("교수님의 회원가입을 시작합니다.");
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("소속학과를 입력해주세요.");
		String part = sc.nextLine();
		System.out.println("직급을 입력해주세요.");
		String position = sc.nextLine();
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String pwd = sc.nextLine();

		professor.setNo(++no);
		professor.setName(name);
		professor.setPart(part);
		professor.setPosition(position);
		professor.setId(id);
		professor.setPwd(pwd);

		professors.add(professor);
		oos.writeObject(professors);
		System.out.println("회원가입이 성공적으로 되었습니다.");
		oos.close();

	}

	public void joinStudent() throws Exception { // 학생 회원가입
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.sav"));
		Student sd = new Student();
		int no2 = 0;
		System.out.println("학생의 회원가입을 시작합니다.");
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("소속학과를 입력해주세요.");
		String part = sc.nextLine();
		System.out.println("학년을 입력해주세요.");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String pwd = sc.nextLine();

		sd.setNo(no2++);
		sd.setId(id);
		sd.setPwd(pwd);
		sd.setName(name);
		sd.setGrade(grade);
		sd.setPart(part);

		students.add(sd);
		oos.writeObject(students);
		System.out.println("회원가입이 성공적으로 되었습니다.");
		oos.close();

	}

	public void loginedProfessor() throws Exception {// 교수 로그인

		System.out.println("교수님 로그인을 시작합니다.");
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String pwd = sc.nextLine();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("professor.sav"));
		ArrayList<Professor> professor = (ArrayList<Professor>) ois.readObject();
		for (Professor p : professor) {
			if (p.getId().equals(id) && p.getPwd().equals(pwd)) {
				System.out.println(p.getName() + "님 환영합니다.");
				loginedProfessor = p;

			}
		}
		ois.close();
	}

	public void professorLogout() { // 교수 로그아웃
		System.out.println("로그아웃이 완료되었습니다.");
		loginedProfessor = null;

	}

	public void loginedStudent() throws Exception { // 학생 로그인

		System.out.println("학생의 로그인을 시작합니다.");
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String pwd = sc.nextLine();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.sav"));
		ArrayList<Student> student = (ArrayList<Student>) ois.readObject();
		for (Student s : student) {

			if (s.getId().equals(id) && s.getPwd().equals(pwd)) {
				System.out.println(s.getName() + "님 환영합니다.");
				loginedStudent = s;
			}

		}
		ois.close();
	}

	public void studentLogout() { // 학생로그아웃

		System.out.println("로그아웃이 완료되었습니다.");
		loginedStudent = null;

	}

	public void generalComments() throws Exception { // 교육과정 등록

		if (loginedProfessor != null) {

			Course cs = new Course();
			System.out.println("교육과정 등록을 시작합니다.");
			System.out.println("과목 코드를 입력해 주세요.");
			cs.setCode(sc.nextLine());
			System.out.println("과목명을 입력해 주세요.");
			cs.setPartName(sc.nextLine());
			System.out.println("수강 인원을 정해주세요.");
			cs.setMax(Integer.parseInt(sc.nextLine()));
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("course.sav"));
			cs.setProfessor(loginedProfessor);
			courses.add(cs);
			oos.writeObject(courses);
			System.out.println("교육과정이 등록되었습니다.");

		} else {

			System.out.println("로그인 해주세요...");

		}
	}

	public void displayGeneralComments() throws Exception { // 수강신청 인원 조회

		if (loginedProfessor != null) {

			System.out.println("수강신청 인원을 조회합니다.");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("course.sav"));
			ArrayList<Course> course = (ArrayList<Course>) ois.readObject();
			System.out.println("학번    학년     학과     이름");
			for (Course c : course) {

				for (Student s : c.getStudent()) {
					System.out.printf(" %d	 %d	 %s    %s\n", s.getNo(), s.getGrade(), s.getPart(), s.getName());
				}

			}
			ois.close();
		} else {

			System.out.println("로그인 해주세요...");

		}
	}

	public void displayProfessor() throws Exception { // 자신이 개설한 과정 조회

		if (loginedProfessor != null) {

			System.out.println("개설한 과정을 조회합니다.");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("course.sav"));
			ArrayList<Course> course = (ArrayList<Course>) ois.readObject();
			System.out.println("과목코드   과목명   수강신청인원   최대수강인원수  교수명");

			for (Course c : course) {

				if (c.getProfessor().getName().equals(loginedProfessor.getName())) {

					System.out.printf("%s	   %s		%d		 %d	   %s\n", c.getCode(), c.getPartName(), c.getNow(),
							c.getMax(), c.getProfessor().getName());

				}

			}

			ois.close();
		} else {

			System.out.println("로그인 해주세요...");

		}
	}

	public void displayApply() throws Exception { // 수강신청항목조회

		if (loginedStudent != null) {
			
			System.out.println("수강신청항목을 조회합니다.");
			System.out.println("과목코드   과목명   수강신청인원   최대수강인원수  교수명");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("course.sav"));
			ArrayList<Course> course = (ArrayList<Course>) ois.readObject();
			
			
			for (Course c : course) {
				System.out.printf("%s	   %s	%d		 %d	   %s\n", c.getCode(), c.getPartName(), c.getNow(),
						c.getMax(), c.getProfessor().getName());
			}
			ois.close();
			
			
		} else {

			System.out.println("로그인 해주세요...");

		}
	}

	public void apply() throws Exception {
		if (loginedStudent != null) { // 수강신청

			System.out.println("수강신청할 과목의 과목코드를 입력해주세요.");
			String code = sc.nextLine();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("course.sav"));
			ArrayList<Course> course = (ArrayList<Course>) ois.readObject();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("course.sav"));
			
			
			for (Course c : course) {
					if (c.getStudent().contains(loginedStudent)) {
						System.out.println("이미 수강신청된 입니다.");
					}
					if (c.getCode().equals(code)) {
	
						System.out.println("수강신청이 완료되었습니다.");
						c.getStudent().add(loginedStudent);
						oos.writeObject(course);
					}
				
			}
			ois.close();
			oos.close();
		} else {

			System.out.println("로그인 해주세요...");

		}
	}

	public void studentApply() throws Exception {
		if (loginedStudent != null) {

			System.out.println("수강신청항목을 조회합니다...");
			System.out.println("이름을 입력해주세요...");
			String name = sc.nextLine();
			System.out.println("과목코드   과목명   수강신청인원   최대수강인원수  교수명");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("course.sav"));
			ArrayList<Course> course = (ArrayList<Course>) ois.readObject();

			for (Course c : course) {
				for (Student s : c.getStudent()) {
					if (s.getName().equals(name)) {

						System.out.printf("%s	   %s	%d		 %d	   %s\n", c.getCode(), c.getPartName(), c.getNow(),
								c.getMax(), c.getProfessor().getName());

					}
				}
			}
			ois.close();
		} else {
			System.out.println("로그인 해주세요...");
		}
	}
}
