package studentproject;

import java.util.Scanner;

public class CourseApp {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		CourseMgr cm = new CourseMgr();

		while (true) {

			System.out.println("------------------------------------------------------");
			System.out.println("      학사 프로그램을 시작합니다. 로그인해주세요.");
			System.out.println("	   1. 학생회원가입    2.교수회원가입    ");
			System.out.println("	3. 교수로그인    4.학생로그인       0.종료    ");
			System.out.println("-------------------------------------------------------");
			System.out.print("메뉴를 입력해 주세요>");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) { // 학생 회원가입

				cm.joinStudent();

			} else if (menu == 2) { // 교수회원가입.

				cm.joinProfessor();

			} else if (menu == 3) { // 교수 로그인

				cm.loginedProfessor();

				while (true) {

					System.out.println("------------------------------------------------------------------");
					System.out.println("1. 교육과정 등록 2. 수강신청 인원조회 3. 개설과정조회  0. 로그아웃");
					System.out.println("------------------------------------------------------------------");
					System.out.print("메뉴를 선택해 주세요>");
					int menu2 = Integer.parseInt(sc.nextLine());

					if (menu2 == 1) { // 교육과정등록

						cm.generalComments();

					} else if (menu2 == 2) { // 수강신청 인원조회

						cm.displayGeneralComments();

					} else if (menu2 == 3) { // 개설과정 조회

						cm.displayProfessor();

					} else if (menu2 == 0) { // 나가기
						cm.professorLogout();
						break;
					}
				}
			} else if (menu == 4) { // 학생 로그인

				cm.loginedStudent();

				while (true) {

					System.out.println("---------------------------------------------------------------------------");
					System.out.println("1. 수강신청항목조회   2.수강신청   3. 수강신청조회   4. 로그아웃  0. 나가기");
					System.out.println("---------------------------------------------------------------------------");
					System.out.print("메뉴를 선택해 주세요>");
					int menu3 = Integer.parseInt(sc.nextLine());

					if (menu3 == 1) { // 수강신청항목조회

						cm.displayApply();

					} else if (menu3 == 2) { // 수강신청

						cm.apply();

					} else if (menu3 == 3) { // 수강신청조회

						cm.studentApply();

					} else if (menu3 == 4) { // 로그아웃

						cm.studentLogout();

					} else if (menu3 == 0) { // 나가기

						break;

					}

				}
			} else if (menu == 0) { // 종료

				break;

			}
		}
		sc.close();
	}
}
