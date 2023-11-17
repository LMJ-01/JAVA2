package chap17;

import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		TreeSet<Integer> Lotto_num = new TreeSet<Integer>();
		
		while(Lotto_num.size() < 6) {
			int num =(int)(Math.random() * 45) + 1;
			Lotto_num.add(num);
		}
		System.out.println(Lotto_num);
	}

}
