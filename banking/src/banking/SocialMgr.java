package banking;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class SocialMgr implements Serializable {

	Scanner sc = new Scanner(System.in);
	Social social = new Social();
	ArrayList<Social> socialList = new ArrayList<>();
	Customer customer = new Customer();

	public SocialMgr() {
	}

	public void enrollmentSocial() throws Exception {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("social.sav", true));
		boolean is = false;
		System.out.println("주민등록을 시작합니다.");
		System.out.print("이름을 입력해 주세요.");
		social.setName(sc.nextLine());

		System.out.print("거주지를 입력해 주세요.");
		social.setAdd(sc.nextLine());

		System.out.print("생년월일을 입력해주세요.");
		social.setBirth(sc.nextLine());

		// 이름에 해쉬코드 값으로 생년월일 뒤에 붙혀서 주민번호를 생성한다.
		int code = social.getName().hashCode();
		String no = Integer.toString(code);

		for (Social s : customer.getSocialList()) {
			// 만약에 등록되어 있는 주민들중 같은 주민번호가 있으면 is 를 true값으로 변환시킨다.
			is = s.getNo().substring(7, 14).equals(no.substring(0, 7));

		}

		System.out.println(is);
		// is 가 false면 주민등록을 시키고 true면 이미 등록되어 있다고 화면에 조회해준다.
		if (!is) {

			social.setNo(social.getBirth() + "-" + no.substring(0, 7));
			socialList.add(social);
			customer.setSocialList(socialList);

			oos.writeObject(socialList);
			oos.close();

			System.out.println("성공적으로 등록되었습니다.");
		} else {
			System.out.println("이미 등록되어있는 주민입니다.");
		}
	}

}
