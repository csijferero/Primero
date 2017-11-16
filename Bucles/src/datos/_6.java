package datos;

public class _6 {

	public static void main(String[] args) {

		int producto = 0;
		int num = 1;

		for (int i = 1; i <= 10; i++) {

			producto = num * i;
			System.out.println(num + "x" + i + "=" + producto);
			if (i == 10 && num < 10) {
				num += 1;
				i = 0;
				System.out.println("---------------------------------------");

			}
		}
	}
}
