package hospital;

import java.util.ArrayList;
import java.util.Scanner;

import facade.UIData;
import mgr.Manageable;

public class Patient implements Manageable, UIData {

	static ArrayList<Patient> patiList = new ArrayList<Patient>();
	// 이름, 성별, 생년월일, 주민번호 뒷자리, 나이(개월수) , 전화번호, 주소
	// 김해연 여 020301 4251235 2 010-7309-9570 풍덕천동
	
	String name;
	String gender;
	String birth;
	String rrn;
	int age;
	String phone;
	String adress;

	@Override
	public void read(Scanner sc) {
		// 김해연 여 020301 4251235 2 010-7309-9570 풍덕천동

		name = sc.next();
		gender = sc.next();
		birth = sc.next();
		rrn = sc.next();
		age = sc.nextInt();
		phone = sc.next();
		adress = sc.next();

	}

	@Override
	public void print() {
		System.out.format("%s %s %s %s %d세 %s %s\n", name, gender, birth, rrn, age, phone, adress);
	}

	// 이름, 생년월일, 주민번호 뒷자리로 환자를 검색할 수 있음
	@Override
	public boolean matches(String kwd) {
		if (name.equals(kwd))
			return true;
		if (birth.equals(kwd))
			return true;
		if (rrn.equals(kwd))
			return true;
		return false;
	}

	@Override
	public void set(Object[] uitexts) {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] getUITexts() {
		// TODO Auto-generated method stub
		String[] texts = new String[7];
		texts[0] = name;
		texts[1] = gender;
		texts[2] = birth;
		texts[3] = rrn;
		texts[4] = "" + age;
		texts[5] = phone;
		texts[6] = adress;
		return texts;
	}

}
