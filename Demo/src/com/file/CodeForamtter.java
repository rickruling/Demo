package com.file;

import java.io.*;

public class CodeForamtter {
	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		try {
			inputStream = new FileReader(
					"C:\\Users\\vishnu\\Documents\\TechVillaFiles\\code.txt");
			outputStream = new FileWriter(
					"C:\\Users\\vishnu\\Documents\\TechVillaFiles\\code.html");

			int c;
			char ch;
			outputStream.write("<h3>Source Code</h3><div class=\"description\">");
			while ((c = inputStream.read()) != -1) {
				ch=(char)c;	
				if(ch=='<')
				{
					outputStream.write("&lt");
				}
				else if(ch=='>')
				{
					outputStream.write("&gt");
				}
				else if(ch=='\n')
				{
					outputStream.write("<br/>");
				}
				else if(ch=='/')
					{
						if((c = inputStream.read())=='/')
						{
							outputStream.write("<div class=\"hint\"> //");
							while((c = inputStream.read()) != '\n')
							{
								outputStream.write(c);
							}
							outputStream.write("</div>");
						}
						else
						{
							outputStream.write('/');
							outputStream.write(c);
						}
					}
				else{
					outputStream.write((int)ch);
				}
				System.out.print(ch);
			}
			outputStream.write("</div>");
		}

		
		finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
