package ex3;

import java.util.ArrayList;

public class ListEx1 {
	public static void main(String[] args) {
		Trainee yamada = new Trainee("山田");
		Trainee tanaka = new Trainee("田中");
		Trainee masuda = new Trainee("増田");

		ArrayList<Trainee>list = new ArrayList<Trainee>();
		list.add(yamada);
		list.add(tanaka);
		list.add(masuda);

		for(int i = 0; i < list.size() ; i++) {
			Trainee name = list.get(i);
			name.introduce();
		}

	}
}
