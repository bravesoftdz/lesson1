package lesson1;

public class task4 {

	public static void main(String[] args) {
		// 1.4 Пройти циклом от 1 до 12 и вывести название месяца,
		// соответсвующее числу

		String mounth_1 = "January";
		String mounth_2 = "February";
		String mounth_3 = "March";
		String mounth_4 = "April";
		String mounth_5 = "May";
		String mounth_6 = "June";
		String mounth_7 = "July";
		String mounth_8 = "August";
		String mounth_9 = "September";
		String mounth_10 = "October";
		String mounth_11 = "November";
		String mounth_12 = "December";

		for (int i = 0; i <= 12; i++) {
			if (i == 1) {
				System.out.println(i + ". " + mounth_1);
			} else if (i == 2) {
				System.out.println(i + ". " + mounth_2);
			} else if (i == 3) {
				System.out.println(i + ". " + mounth_3);
			} else if (i == 4) {
				System.out.println(i + ". " + mounth_4);
			} else if (i == 5) {
				System.out.println(i + ". " + mounth_5);
			} else if (i == 6) {
				System.out.println(i + ". " + mounth_6);
			} else if (i == 7) {
				System.out.println(i + ". " + mounth_7);
			} else if (i == 8) {
				System.out.println(i + ". " + mounth_8);
			} else if (i == 9) {
				System.out.println(i + ". " + mounth_9);
			} else if (i == 10) {
				System.out.println(i + "." + mounth_10);
			} else if (i == 11) {
				System.out.println(i + "." + mounth_11);
			} else if (i == 12) {
				System.out.println(i + "." + mounth_12);
			}
		}

	}

}
