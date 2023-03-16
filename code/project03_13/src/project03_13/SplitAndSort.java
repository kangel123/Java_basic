package project03_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SplitAndSort {
	public ArrayList<String> scanAndSplit(){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		String[] str = scan.nextLine().split(" ");
		for(int i=0;i<str.length;i++) {
			list.add(str[i]);
		}
		return list;
	}
	
}
