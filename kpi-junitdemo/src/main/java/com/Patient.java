package com;

public class Patient {

	static String con;

	Patient(String con) {
		Patient.con = con;
	}

	public String h_check(String con, Asylum A1) {
		return A1.Health_check(con);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asylum check = (con) -> {
			return con;
		};

		Patient p1 = new Patient("Mad");
		System.out.println("Man 1 : " + p1.h_check(con, check));
		
		Patient p2 = new Patient("Mad");
		System.out.println("Man 2 : " + p2.h_check(con, check));

		Patient p3 = new Patient("Mad");
		System.out.println("Man 3 : " + p3.h_check(con, check));

		Patient p4 = new Patient("Mentally Stable");
		System.out.println("Man 4 : " + p4.h_check(con, check)+ "\n");

		Patient b1 = new Patient("Mad");
		System.out.println("Boy 1 : " + b1.h_check(con, check));

		Patient b2 = new Patient("Mentally Stable");
		System.out.println("Boy 2 : " + b2.h_check(con, check));

		Patient b3 = new Patient("Mad");
		System.out.println("Boy 3 : " + b3.h_check(con, check));

		Patient b4 = new Patient("Mad");
		System.out.println("Boy 4 : " + b4.h_check(con, check));


	}
}
