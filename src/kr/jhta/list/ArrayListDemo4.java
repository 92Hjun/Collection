package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo4 {
	
	// 정적메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서 그 "성씨" 해당하는 이름을 출력하는 메소드
	// ArrayList<String> 인 list 와 String 타입의 familyName 을 전달받아서 실행하는메소드
	public static void displayNameByFamilyName(ArrayList<String> list, String familyName){
	
		// ArrayList<String> list를 String 타입 a에 1개씩 전달해준다.
		for (String a : list){
		
			// 만약에 familyName과 a의 0번부터 familyName에 문자열의 길이까지 문자가 같으면 true가 나오고 아니면 false가 나온다.
			if (familyName.equals(a.substring(0,familyName.length()))){
			
				// 위에 if 문이 true가 나오면 화면에 list를 하나씩 담은 객체 a 를 출력한다.
				System.out.println(a);
			}
		}
	}
	
	// 정적메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서 그 "성씨"에 해당하는 이름을 
	// ArrayList에 담아서 반환하는 메소드
	
	//ArrayList<String> list와 String 타입의 familyName을 전달받아서 ArrayList<String>를 반환하는 메소드.
	public static ArrayList<String> getNamesByFamilyName (ArrayList<String> list, String familyName) {
	
		//ArrayList<String> 을 반환하니까 새로운 ArrayList<String>를 생성해준다.
		ArrayList<String> name = new ArrayList<>();
		
		// ArrayList<String> list를 String 타입의 b 에 하나씩 대입해준다.
			for (String b : list) {
			
				// 만약에 familName과 0번째 부터 familyName의 길이까지의 문자열이 같으면
				if (familyName.equals(b.substring(0, familyName.length()))) {
				
					//위에 선언해준 ArrayList<String> name 에 대입을한다.
					name.add(b);
				}
			}
		
			// 대입한 name을 리턴해준다.
		return name;
	}
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("김유신");
		names.add("강감찬");	
		names.add("이순신");
		names.add("독고탁");
		names.add("남궁민수");
		names.add("김구");
		names.add("윤봉길");
		names.add("유관순");
		
		displayNameByFamilyName(names, "김");
								//출력값 김유신,김구
		
		System.out.println(getNamesByFamilyName(names, "남궁"));
												//출력값 [남궁민수]
	}
}
