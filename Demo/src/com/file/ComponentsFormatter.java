package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ComponentsFormatter {
	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		try {
			inputStream = new FileReader(
					"C:\\Users\\vishnu\\Documents\\TechVillaFiles\\components.txt");
			outputStream = new FileWriter(
					"C:\\Users\\vishnu\\Documents\\TechVillaFiles\\components.html");

			int c;
			char ch;
			outputStream.write("<h3>Components Required</h3>");
			outputStream.write("<ul><li>->&nbsp");
			while ((c = inputStream.read()) != -1) {
				ch=(char)c;	
				if(ch=='\n')
				{
					outputStream.write("</li><li>->&nbsp");
				}
				else
				{
					outputStream.write(c);
				}
				System.out.print(ch);
			}
			outputStream.write("</li></ul>");
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
