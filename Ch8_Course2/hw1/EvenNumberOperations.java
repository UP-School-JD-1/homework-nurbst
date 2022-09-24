package Ch8_course2_hw1;

import java.util.function.Consumer;

public class EvenNumberOperations {

	private static int sum = 0;
	private static int multiply = 1;
	private static int[] squared = new int[5];

	public static void main(String[] args) {
		Consumer<Integer> calculator = i -> System.out.println(i + " ");
		doEvenNumberOperation(calculator, 10);

		System.out.println();

		doEvenNumberOperation(i -> sum += i, 10);
		System.out.println(sum);

		System.out.println();

		doEvenNumberOperation(i -> multiply *= i, 10);
		System.out.println(multiply);

		System.out.println();

		doEvenNumberOperation(i -> squared[i / 2 - 1] = i * i, 10);
		for (int j : squared) {

			System.out.println(j + " ");
		}

	}

	public static void doEvenNumberOperation(Consumer<Integer> consumer, int n) {

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				consumer.accept(i);
			}

		}
	}
}