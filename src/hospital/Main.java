package hospital;

import java.util.Scanner;

import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class Main {
	private static Main hospitalMain = null;
	private Main() {}
	public static Main getInstance() {
		if (hospitalMain == null)
			hospitalMain = new Main();
		return hospitalMain;
	}
	Scanner scan = new Scanner(System.in); 
	static Manager doctorMgr = new Manager();
	static Manager patientMgr = new Manager();
	public void run()
	{
		
	}
	
	public static void main(String args[]) {
		Main m = new Main();
		m.run();
	}
}
