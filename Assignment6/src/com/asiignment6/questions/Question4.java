package com.asiignment6.questions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		double max = 0.0;
		double min=0.0;
		int value = 0,value1=0;
		List<String> list = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new FileReader("randomdata.txt"));
			String line = null;
			while (scanner.hasNext()) {
				line = scanner.nextLine();
				list.add(line);
			}
			for (int i = 0; i < list.size(); i++) {
				value = Double.compare(Double.parseDouble(list.get(i)), max);
				if (value > 0) {
					max = Double.parseDouble(list.get(i));
				}
			}
			for (int i = 0; i < list.size(); i++) {
				value1 = Double.compare(Double.parseDouble(list.get(i)), min);
				if (value1!= 0) {
					min = Double.parseDouble(list.get(i));
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(max);
		System.out.println(min);

	}

}
