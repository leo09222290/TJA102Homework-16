package com.hw16.Homework5;

public class method {
	public void starSquare(int weight, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < weight; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void rangAvg() {
		int sum = 0;
		int arr1[] = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			int num = (int) (Math.random() * 101);
			sum += num;
			arr1[i]=num;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println((double)sum / arr1.length);

	}

	public int maxElement(int x[][]) {
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;

	}

	public void genAuthCode() {
		System.out.println("本次產生的隨機驗證碼為:");
		for (int i = 0; i <= 8; i++) {
			int num = (int) (Math.random() * 3);
			// A-Z(65-90) a-z(97-122) 0-9(48-57) (ASCII)先分三組
			if (num == 0) {
				int i1 = (int) (Math.random() * (90 - 65 + 1)) + 65;
				char c1 = (char) i1;
				System.out.print(c1);
			} else if (num == 1) {
				int i1 = (int) (Math.random() * (122 - 97 + 1)) + 97;
				char c1 = (char) i1;
				System.out.print(c1);
			} else if (num == 2) {
				int i1 = (int) (Math.random() * (57 - 48 + 1)) + 48;
				char c1 = (char) i1;
				System.out.print(c1);
			}
		}

	}
}
