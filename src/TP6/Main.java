package TP6;

import java.util.Iterator;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		Iterator<Integer> it = Panel.panel1(1,5);
		for(;it.hasNext();)
			System.out.println(it.next());
		for(int i : Panel.panel2(1,5))
			System.out.println(i);

		List<Integer> l = Panel.panel(3,6);
		for(int i : l)
			System.out.println(i);
	}
}
