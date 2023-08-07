import java.util.Random;
import java.util.Scanner;

public class SSKT {
	void SSKTa() {
		Random random = new Random(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);
		String veso = new String();
		do {
			System.out.print("Nhập 6 con số của tờ vé số lỏ của bạn: ");
			veso = sc.nextLine();

		} while (veso.length() < 6 || veso.length() > 6);
		System.out.println("----XỔ SỐ KIẾN THIẾT QUẢNG NAM----");
		System.out.println("Ngày 07/08/2023");
		// Giai 8;
		int min_g8 = 10, max_g8 = 99;
		int random_g8 = random.nextInt(max_g8 - min_g8 + 1) + min_g8;
		String g8 = String.valueOf(random_g8);// chuyển số ngẫu nhiên thành chuỗi
		System.out.println("Giải 8: " + g8);
		// Giai 7;
		int min_g7 = 100, max_g7 = 999;
		int random_g7 = random.nextInt(max_g7 - min_g7 + 1) + min_g7;
		String g7 = String.valueOf(random_g7);
		System.out.println("Giải 7: " + g7);
		// Giai 6;
		int min_g6 = 1000, max_g6 = 9999;
		String s1 = new String(), s2 = new String(), s3 = new String();
		int random_g6;
		for (int i = 0; i < 3; i++) {
			random_g6 = random.nextInt(max_g6 - min_g6 + 1) + min_g6;
			if(i == 0)
			{
			s1 = String.valueOf(random_g6);
			}
			if(i == 1)
			{
				s2 = String.valueOf(random_g6);
			}
			if(i == 2)
			{
				s3 = String.valueOf(random_g6);
			}
		}
		System.out.println("Giải 6: " + s1 + "  " + s2 + "  " + s3);
		//Giai 5
		int min_g5 = 1000, max_g5 = 9999;
		int random_g5 = random.nextInt(max_g5 - min_g5 + 1) + min_g5;
		String g5 = String.valueOf(random_g5);
		System.out.println("Giải 5: " + g5);
		//Giai 4
		String t1 = new String(),t2 = new String(),
				t3 = new String(),t4 = new String(),
						t5 = new String(),t6 = new String(),
								t7 = new String();
		int min_g4 = 10000, max_g4 = 99999;
		int random_g4;
		for(int i = 0 ; i < 7; i++)
		{
			random_g4 = random.nextInt(max_g4 - min_g4 + 1) + min_g4;
			if(i == 0)
			{
				t1 = String.valueOf(random_g4);
			}
			if(i == 1)
			{
				t2 = String.valueOf(random_g4);
			}
			if(i == 2)
			{
				t3 = String.valueOf(random_g4);
			}
			if(i == 3)
			{
				t4 = String.valueOf(random_g4);
			}
			if(i == 4)
			{
				t5 = String.valueOf(random_g4);
			}
			if(i == 5)
			{
				t6 = String.valueOf(random_g4);
			}
			if(i == 6)
			{
				t7 = String.valueOf(random_g4);
			}
		}
		System.out.println("Giải 4: " + t1 + "  " + t2 + "  " + t3);
		System.out.println("        " + t4 + "  " + t5 + "  " + t6);
		System.out.println("               " + t7);
		//Giai 3
		int min_g3 = 10000,max_g3 = 99999;
		String a1 = new String(),a2 = new String();
		int random_g3;
		for(int i = 0 ; i < 2 ; i++)
		{
			random_g3 = random.nextInt(max_g3 - min_g3 + 1)+ min_g3;
			if(i == 0)
			{
				a1 = String.valueOf(random_g3);
			}
			if(i == 1)
			{
				a2 = String.valueOf(random_g3);
			}
		}
		System.out.println("Giải 3: " + a1 + "  " + a2);
		//Giai 2;
		int min_g2 = 10000, max_g2 = 99999;
		int random_g2 = random.nextInt(max_g2 - min_g2 + 1) + min_g2;
		String g2 = String.valueOf(random_g2);
		System.out.println("Giải 2: " + g2);
		//Giai 1;
		int min_g1 = 10000, max_g1 = 99999;
		int random_g1 = random.nextInt(max_g1 - min_g1 + 1) + min_g1;
		String g1 = String.valueOf(random_g1);
		System.out.println("Giải 1: " + g1);
		//GiaiDB;
		int min_gdb = 100000, max_gdb = 999999;
		int random_gdb = random.nextInt(max_gdb - min_gdb + 1) + min_gdb;
		String gdb = String.valueOf(random_gdb);
		System.out.println("Giai Dac Biet: " + gdb);
		System.out.println();
		System.out.println("-------DÒ VÉ SỐ-------");
		System.out.println("Vé Số Của Bạn Là: " + veso);
		System.out.println("Kết Qủa Là:");
		String test = "123456";
		String m1 = "43675",m2 = "98778",m3 = "92252";
		if(veso.regionMatches(4, g8, 0, 2) == true)
		{
			System.out.println("Bạn Trúng Giải 8 : 100.000 VNĐ");
		}
		else if(veso.regionMatches(3, g7, 0, 3) == true)
		{
			System.out.println("Bạn Trúng Giải 7 : 200.000 VNĐ");
		}
		else if(veso.regionMatches(2,s1,0,4) || veso.regionMatches(2,s2,0,4) || veso.regionMatches(2,s3,0,4) == true)
		{
			System.out.println("Bạn Trúng Giải 6 : 400.000 VNĐ");
		}
		else if(veso.regionMatches(2, g5, 0, 4) == true)
		{
			System.out.println("Bạn Trúng Giải 5 : 1.000.000 VNĐ");
		}
		else if(veso.regionMatches(1, t1, 0, 5) || veso.regionMatches(1, t2, 0, 5) ||veso.regionMatches(1, t3, 0, 5) || veso.regionMatches(1, t4, 0, 5)
				|| veso.regionMatches(1, t5, 0, 5) || veso.regionMatches(1, t6, 0, 5) || veso.regionMatches(1, t7, 0, 5) == true)
		{
			System.out.println("Bạn Trúng Giải 4: 3.000.000 VNĐ");
		}
		else if(veso.regionMatches(1, a1, 0, 5)|| veso.regionMatches(1, a2, 0, 5) == true)
		{
			System.out.println("Bạn Trúng Giải 3: 10.000.000 VNĐ");
		}
		else if(veso.regionMatches(1, g2, 0, 5) == true)
		{
			System.out.println("Bạn Trúng Giải 2: 15.000.000 VNĐ");
		}
		else if(veso.regionMatches(1, g1, 0, 5) == true)
		{
			System.out.println("Bạn Trúng Giải 1: 30.000.000 VNĐ");
		}
		else if(veso.regionMatches(1, gdb, 1, 5) == true)
		{
			System.out.println("Bạn Trúng Giải Phụ Đặc Biệt: 50.000.000 VNĐ");
		}
		else if(veso.equals(gdb) == true)
		{
			System.out.println("Bạn Trúng Giải Đặc Biệt: 2.000.000.000 VNĐ");
		}
		else
		{
			System.out.println("Bạn Đã Trúng 1 Cái Nịt!!!");
		}
	}

	public static void main(String[] args) {
		SSKT ss = new SSKT();
		ss.SSKTa();
	}

}
