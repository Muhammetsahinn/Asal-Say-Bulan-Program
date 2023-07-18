import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı girin: ");
		int sayi = scanner.nextInt();

		if (isAsal(sayi))
			System.out.println(sayi + " asal bir sayıdır.");
		else
			System.out.println(sayi + " asal bir sayı değildir.");

	}

	public static boolean isAsal(int sayi) {
		if (sayi <= 1)
			return false;

		return isAsalRecursive(sayi, sayi-1);
	}

	private static boolean isAsalRecursive(int sayi, int bolen) {
		if (bolen == 1)
			return true;

		if (sayi % bolen == 0)
			return false;

		return isAsalRecursive(sayi, bolen-1);
	}
}