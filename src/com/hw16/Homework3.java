package com.hw16;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 1.請設計一隻程式,使用者輸入三個數字後, 輸出結果會為正三角形、等腰 三角形、其它三角形或不是三角形,如圖示結果:
		 */
//		String a1[] = new String[] { "一", "二", "三" };
//		int a2[] = new int[3];
//		for (int i = 0; i < 3; i++) {
//			System.out.println("請輸入第" + a1[i] + "個數字");
//			a2[i] = sc.nextInt();
//		}
//		int r1 = a2[0];
//		int r2 = a2[1];
//		int r3 = a2[2];
//
//		if (r1 + r2 > r3 && r2 + r3 > r1 && r1 + r3 > r2) {
//			if (r1 == r2 && r2 == r3) {
//				System.out.println("是正三角形");
//			} else if (r1 == r2 || r2 == r3 || r3 == r1) {
//				System.out.println("是等腰三角形");
//			} else if ((Math.pow(r1, 2) + Math.pow(r2, 2) == Math.pow(r3, 2))
//					|| Math.pow(r2, 2) + Math.pow(r3, 2) == Math.pow(r1, 2)
//					|| Math.pow(r1, 2) + Math.pow(r3, 2) == Math.pow(r2, 2)) {
//				System.out.println("是直角三角形");
//			} else {
//				System.out.println("其他三角形");
//			}
//		} else {
//			System.out.println("不是三角形");
//		}
//		/*
//		 * 2.請設計一隻程式,會亂數產生一個0~9的數字, 然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜 對則顯示正確訊息,如圖示結果:
//		 */
//		int j = (int) (Math.random() * 10);
//		while (true) {
//			int i = sc.nextInt();
//			if (i == j) {
//				System.out.println("猜對囉");
//				break;
//			}else {
//				System.out.println("再猜一次");
//			}
//		}
//		//2.進階題
//		int k = (int) (Math.random() * 101);
//		while (true) {
//			int i = sc.nextInt();
//			if (i == k) {
//				System.out.println("猜對囉");
//				break;
//			}else {4
//				if(i>k) {
//					System.out.println("猜大囉!再猜一次");
//				}else {
//					System.out.println("猜小囉! 再猜一次");
//				}
//				
//			}
//		}

		/*
		 * 3.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
		 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9), 畫面會顯示他可以選擇的號碼與總數,如圖:
		 * 
		 */

		int num = sc.nextInt();
		int arr1[] = new int[49];
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (!(i / 10 == num || i % 10 == num)) {
				if (count > 0 && count % 10 == 0) {
					System.out.println();
				}
				arr1[count] = i;
				count++;
				System.out.print(i + "\t");

			}
		}
		System.out.println("共:" + count + "個");
		// 3.進階題
		System.out.println("----------------6個隨機數--------------------------");
		int arr2[] = new int[6];
		boolean isExist;
		for (int i = 0; i < arr2.length; i++) {
			int data;
			do {
				data = (int) (Math.random() * (count));
				isExist = false;
				// 檢查是否重複
				for (int j1 = 0; j1 < i; j1++) {
					if (arr2[j1] == arr1[data]) {
						isExist = true;
						break;
					}
				}
			} while (isExist);

			arr2[i] = arr1[data];
			System.out.print(arr2[i] + "\t");
		}

	}
}
