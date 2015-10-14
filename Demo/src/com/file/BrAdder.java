package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BrAdder {

	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		try {
			inputStream = new FileReader(
					"C:\\Users\\vishnu\\Documents\\TechVillaFiles\\sample.txt");
			outputStream = new FileWriter(
					"C:\\Users\\vishnu\\Documents\\TechVillaFiles\\output.html");

			int c,flag=0;
			char ch;
			outputStream.write("<div class=\"description\">");
			while ((c = inputStream.read()) != -1) {
				ch = (char) c;
				if (ch == '\n') {
					outputStream.write("<br/>");
					if(flag==1)
					{
						outputStream.write("</li>");
						flag=0;
					}
				} 
				else if(ch =='•')
				{
					flag=1;
					outputStream.write("<li>");
				}
				else if(ch=='–')
				{
					outputStream.write("-");
				}
				else {
					outputStream.write(c);
				}
				System.out.print(ch);
			}
			outputStream.write("</div>");
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
