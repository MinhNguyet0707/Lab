import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Menber> menberList = new ArrayList<>();

	public static void main(String[] args) {
		inputMenBer();
		showMenber();

	}
	public static void inputMenBer() {
		int nhapM;
		do {
			System.out.print("Xin mời nhập số lượng MenBer mới muốn thêm: ");
			nhapM = new Scanner(System.in).nextInt();
			if (nhapM <= 3) {
				System.out.println("nhập tối thiểu là 3 menber");
			} else {
				break;
			}

		} while (true);

		for (int i = 0; i < nhapM; i++) {
			Menber menber = new Menber();
			menber.nhapThongTin();
			saveMenBer(menber);
		}
	}

	    public static void saveMenBer(Menber menber) {
	        menberList.add(menber);
	    }

	    public static void showMenber() {
	        for(Menber menbers: menberList) {
	        	System.out.println(menbers);
	        }
	    }
}
