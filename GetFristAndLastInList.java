package java_Program;

import java.util.ArrayList;
import java.util.List;

public class GetFristAndLastInList {

	public static void getFristAndlast(List<Integer> list) {

		System.out.println("ArrayList contains: " + list);

		if (list != null && !list.isEmpty()) {

			System.out.println("frist elemnt :" + list.get(0));
			System.out.println("last eleemnt :" + list.get(list.size() - 1));
		}

	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(2);

		getFristAndlast(al);

	}
}
