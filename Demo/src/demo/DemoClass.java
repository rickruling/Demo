package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoClass {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter two numbers");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = br.read();
		int b = br.read();
		System.out.println("The sum is "+(a+b));
	}

}
