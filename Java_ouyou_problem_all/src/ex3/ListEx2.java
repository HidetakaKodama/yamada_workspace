package ex3;

import java.util.ArrayList;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("りんご");
		list.add("みかん");
		list.add("ぶどう");
		System.out.println("要素の数は" + list.size() + "です");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
