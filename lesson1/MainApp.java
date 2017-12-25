package lesson1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1)Вывести на экран все четные цифры от 1 до 100
		// 2)Вывести на экран все четные цифры от 1 до 100 используя только конструкцию
		// for
		// 3)Посчитать сумму цифр от 20 до 200
		// 4)Пройти циклом от 1 до 12 и вывести название месяца, соответсвующее числу

		// 1 задача
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// --------------------------------------------------------------------------//
		System.out.println("// --------------------------------------------------------------------------//");
		// 2 задача
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);// Напишите тут ваш код
		}
		// --------------------------------------------------------------------------//
		System.out.println("// --------------------------------------------------------------------------//");
		// 3 задача
		int s = 0;
		for (int i = 0; i <= 100; i++) {
			s = s + i;
		}
		System.out.println(s);
		// --------------------------------------------------------------------------//
		System.out.println("// --------------------------------------------------------------------------//");
		// 4 задача
		String mounth_1 = "Jan";
		String mounth_2 = "Feb";
		String mounth_3 = "Mar";
		String mounth_4 = "Apr";
		String mounth_5 = "May";
		String mounth_6 = "Jun";
		String mounth_7 = "Jul";
		String mounth_8 = "Aug";
		String mounth_9 = "Sen";
		String mounth_10 = "Okt";
		String mounth_11 = "Nov";
		String mounth_12 = "Dec";

		for (int i = 0; i <= 12; i++) {
			if (i == 1) {
				// System.out.println(mounth_1);
			} else if (i == 2) {
				// System.out.println(mounth_2);
			} else if (i == 3) {
				// System.out.println(mounth_3);
			} else if (i == 4) {
				// System.out.println(mounth_4);
			} else if (i == 5) {
				// System.out.println(mounth_5);
			} else if (i == 6) {
				// System.out.println(mounth_6);
			} else if (i == 7) {
				// System.out.println(mounth_7);
			} else if (i == 8) {
				// System.out.println(mounth_8);
			} else if (i == 9) {
				// System.out.println(mounth_9);
			} else if (i == 10) {
				// System.out.println(mounth_10);
			} else if (i == 11) {
				// System.out.println(mounth_11);
			} else if (i == 12) {
				// System.out.println(mounth_12);
			}
		}

		String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec" };
		for (int i = 0; i < month.length; i++) {
			System.out.println(month[i]);
		}
	}

}
