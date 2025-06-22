package com.hw16;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		 */
		int arr1[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		int avg = sum / arr1.length;
		System.out.println("平均值為:" + avg);
		System.out.print("大於平均值的元素:");
		// 分隔線
		System.out.println();
		System.out.println("------------------我是分隔線---------------------");
		// 分隔線
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > avg) {
				System.out.print(arr1[i] + " ");
			}
		}
		// 分隔線
		System.out.println();
		System.out.println("------------------我是分隔線---------------------");
		// 分隔線
		/*
		 * 請建立一個字串,經過程式執行後,輸入結果是反過來的 例如String s = “Hello World”,執行結果即為dlroW olleH
		 * (提示:String方法,陣列)
		 */
		String s = "Hello World";
		String s2 = "";
		// String s1[] = new String[] {};
		for (int i = s.length() - 1; i > 0; i--) {
			s2 += s.charAt(i);
		}
		System.out.println(s2);
		// 分隔線
		System.out.println("------------------我是分隔線---------------------");
		// 分隔線
		/*
		 * 3. 有個字串陣列如下 (八大行星): {“mercury”, “venus”, “earth”, “mars”, “jupiter”,
		 * “saturn”, “uranus”, “neptune”} 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		 * (提示:字元比對,String方法)
		 */
		int count = 0;
		String planet[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		for (int i = 0; i < planet.length; i++) {
			for (int j = 0; j < planet[i].length(); j++) {

				if (planet[i].charAt(j) == 'a' || planet[i].charAt(j) == 'e' || planet[i].charAt(j) == 'i'
						|| planet[i].charAt(j) == 'o' || planet[i].charAt(j) == 'u') {
					count++;
				}
			}
		}
		System.out.println(count + "個母音");
		// 分隔線
		System.out.println("------------------我是分隔線---------------------");
		// 分隔線

		/*
		 * 4. 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個, 其員工編號與身上現金列表如下:
		 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
		 * 員工編號: 25 19 27 共 3 人!」 (提示:Scanner,二維陣列)
		 */
		String employeeId[] = { "25", "32", "8", "19", "27" };
		int money[] = { 2500, 800, 500, 1000, 1200 };
		int count4 = 0;
		System.out.println("請輸入欲借金額:");
		int num = sc.nextInt();
		System.out.print("員工編號:" + " ");
		for (int i = 0; i < money.length; i++) {
			if (money[i] >= num) {
				System.out.print(employeeId[i] + " ");
				count4++;
			}
		}
		System.out.println("共:" + count4 + "人");
		// 分隔線
		System.out.println("------------------我是分隔線---------------------");
		// 分隔線
		/*
		 * 5.請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天 例:輸入 1984 9 8
		 * 三個號碼後,程式會顯示「輸入的日期為該年第252天」 (提示1:Scanner,陣列) (提示2:需將閏年條件加入)
		 * (提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		 */
		System.out.println("請輸入西元yyyy年:");
		int y = sc.nextInt();
		System.out.println("請輸入月份:");
		int m = sc.nextInt();
		int d;
		System.out.println("請輸入日期:");
		//其實這邊用陣列有點多此一舉
		int daysArry[] = { 28, 29, 30, 31 };
		while (true) {
			d = sc.nextInt();
			if (d <= 0) {
				System.out.println("日期沒有負數!");
			} else {
				if (m == 2 && d > 29) {
					System.out.println("輸入錯誤 本月不超過29天!");
				} else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d > 31) {
					System.out.println("輸入錯誤 本月不超過31天!");
				} else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
					System.out.println("輸入錯誤 本月不超過30天!");
				} else {
					break;
				}
			}
		}
		int days = 0;
		switch (m) {
		case 12:
			days += daysArry[2];
		case 11:
			days += daysArry[3];
		case 10:
			days += daysArry[2];
		case 9:
			days += daysArry[3];
		case 8:
			days += daysArry[3];
		case 7:
			days += daysArry[2];
		case 6:
			days += daysArry[3];
		case 5:
			days += daysArry[2];
		case 4:
			days += daysArry[3];
		case 3:
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				days += daysArry[1];
			} else {
				days += daysArry[0];
			}
		case 2:
			days += daysArry[3];
		case 1:
			days += d;
			break;
		default:
		}
		System.out.println("共" + days + "天");
		// 分隔線
		System.out.println("------------------我是分隔線---------------------");
		// 分隔線
		/*
		 * 6. 班上有8位同學,他們進行了6次考試結果如下: 請算出每位同學考最高分的次數 (提示:二維陣列)
		 */

		int arr2[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int countMax[] = new int[8];

		for (int i1 = 0; i1 < arr2.length; i1++) {
			int max = arr2[i1][0];
			int index = 0;
			for (int j = 0; j < arr2[i1].length; j++) {
				if (max < arr2[i1][j]) {
					max = arr2[i1][j];
					index = j;
				}
			}
			countMax[index]++;
		}
		for (int i2 = 0; i2 < countMax.length; i2++) {
			System.out.println("第 " + (i2 + 1) + " 位學生考最高分次數: " + countMax[i2]);
		}
	}
}
