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
		System.out.println("�ֹε���� �����մϴ�.");
		System.out.print("�̸��� �Է��� �ּ���.");
		social.setName(sc.nextLine());

		System.out.print("�������� �Է��� �ּ���.");
		social.setAdd(sc.nextLine());

		System.out.print("��������� �Է����ּ���.");
		social.setBirth(sc.nextLine());

		// �̸��� �ؽ��ڵ� ������ ������� �ڿ� ������ �ֹι�ȣ�� �����Ѵ�.
		int code = social.getName().hashCode();
		String no = Integer.toString(code);

		for (Social s : customer.getSocialList()) {
			// ���࿡ ��ϵǾ� �ִ� �ֹε��� ���� �ֹι�ȣ�� ������ is �� true������ ��ȯ��Ų��.
			is = s.getNo().substring(7, 14).equals(no.substring(0, 7));

		}

		System.out.println(is);
		// is �� false�� �ֹε���� ��Ű�� true�� �̹� ��ϵǾ� �ִٰ� ȭ�鿡 ��ȸ���ش�.
		if (!is) {

			social.setNo(social.getBirth() + "-" + no.substring(0, 7));
			socialList.add(social);
			customer.setSocialList(socialList);

			oos.writeObject(socialList);
			oos.close();

			System.out.println("���������� ��ϵǾ����ϴ�.");
		} else {
			System.out.println("�̹� ��ϵǾ��ִ� �ֹ��Դϴ�.");
		}
	}

}
