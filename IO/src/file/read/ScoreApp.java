package file.read;

import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ScoreApp {
	public static void main(String[] args) throws Exception {
		
		ArrayList<Score> scoreList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = new FileOutputStream("score.txt");
		FileOutputStream fos2 = new FileOutputStream("ranking.txt");
		// 1. 성적정보 등록 2.성적정보 파일로 저장 3.성적순으로 파일저장 0.종료

		while (true) {
			
			System.out.println("1.성적정보 등록 2. 성적정보 파일로 저장 3.성적순으로 파일 저장 0.종료");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {

				// 이름 국어 영어 수학점수를 받아서 Score객체에 담고 ArrayList에 저장하기
				Score score = new Score();
				System.out.print("이름을 입력해 주세요>");
				score.setName(sc.nextLine());

				System.out.print("국어 점수를 입력해 주세요>");
				score.setKor(Integer.parseInt(sc.nextLine()));

				System.out.print("영어 점수를 입력해 주세요>");
				score.setEng(Integer.parseInt(sc.nextLine()));

				System.out.print("수학 점수를 입력해 주세요>");
				score.setMath(Integer.parseInt(sc.nextLine()));
				scoreList.add(score);

			} else if (menu == 2) {
				for (Score b : scoreList) {

					String text = b.getName() + "^" + b.getKor() + "^" + b.getEng() + "^" + b.getMath();
					text = text + System.lineSeparator();
					byte[] bytes = text.getBytes();

					fos.write(bytes);

				}

				// ArrayList에 저장된 성적정보를 파일로 기록하기
				// 홍길동^80^60^30
				// 김유신^40^50^70
			} else if (menu == 3) {
				DecimalFormat df = new DecimalFormat("#.##");
				Collections.sort(scoreList,(Score f1, Score f2) -> {
					
					return f2.getTotal()-f1.getTotal();
					
				});
				for (Score c : scoreList) {
					String text = "이름: "+c.getName() + " 국어: " + c.getKor() + " 영어: " + c.getEng() + " 수학: " + c.getMath() + " 총점: " + c.getTotal();
					text = text + System.lineSeparator();
					byte[] bytes = text.getBytes();
					fos2.write(bytes);
				}
			}else if (menu == 0) {
				break;
			}
		}
		sc.close();
		fos.close();
		fos2.close();
	}
}
