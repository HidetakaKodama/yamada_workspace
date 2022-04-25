package ex3;

import java.util.HashMap;
import java.util.Scanner;

public class ListEx4 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("cat","猫");
		map.put("dog","犬");
		map.put("rabbit","うさぎ");
		map.put("bear","熊");

		System.out.println("英語で動物の名前を入力してください -> ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		String animal = map.get(name);
		System.out.println("「" + animal + "」です");
	}
}
