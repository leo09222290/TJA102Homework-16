package com.hw16;

public class hw2 {

	public static void main(String[] args) {
		// 1.
		int sum1 = 0;
		for (int i = 1; i < 1001; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}

		}
		System.out.println(sum1);
		
		// 2.
		int sum2 = 1;
		for (int i = 1; i < 11; i++) {
			sum2 = i * sum2;
		}
		System.out.println(sum2);

		// 3.
		int sum3 = 1;
		int i1 = 1;
		while (i1 < 11) {
			sum3 = i1 * sum3;
			i1++;

		}
		System.out.println(sum3);

		// 4.
		for (int i = 1; i < 11; i++) {
			System.out.print((int) Math.pow(i, 2) + " ");
		}
		System.out.println();
		
		// 5.
		int count = 1;
		for (int i = 1; i < 50; i++) {
			if (!(i / 10 == 4 || i % 10 == 4)) {
				System.out.print(i + " ");
				count++;
			}

		}
		System.out.println();
		System.out.println("共:" + count + "個");
		
		// 6.
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= (11 - i); j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
		// 7.
		for (int i = 1; i <= 6; i++) {
			switch (i) {
			case 1:
				for (int j = 1; j <= i; j++) {
					System.out.print("A");
				}
				System.out.println();
				break;

			case 2:
				for (int j = 1; j <= i; j++) {
					System.out.print("B");
				}
				System.out.println();
				break;
			case 3:
				for (int j = 1; j <= i; j++) {
					System.out.print("C");
				}
				System.out.println();
				break;
			case 4:
				for (int j = 1; j <= i; j++) {
					System.out.print("D");
				}
				System.out.println();
				break;
			case 5:
				for (int j = 1; j <= i; j++) {
					System.out.print("E");
				}
				System.out.println();
				break;
			case 6:
				for (int j = 1; j <= i; j++) {
					System.out.print("F");
				}
				System.out.println();
				break;
			}
		}

	}
}
