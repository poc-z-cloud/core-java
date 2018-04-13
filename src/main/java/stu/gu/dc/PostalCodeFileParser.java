package stu.gu.dc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PostalCodeFileParser {

	
	public void readPostalCodeFile(){

		String filePath="C:/Jason/Documents/OSAP/DistanceCalculation/Data/PCGEOMULTI_062017.txt";
		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(filePath));
			String strLine = null;
			int deleted = 0;
			int added = 0;
			while ((strLine = br.readLine()) != null) {
				String actionCode = strLine.substring(286,287).trim();
				if ("D".equalsIgnoreCase(actionCode)) {
					deleted++;
				}

				if ("A".equalsIgnoreCase(actionCode)) {
					added++;
				}
			}

			System.out.println("deleted:" + deleted+"; added:" + added);
			
		} catch (Throwable e) {

			e.printStackTrace();

		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	
	
	public static void main(String[] args) {
		PostalCodeFileParser obj = new PostalCodeFileParser();
		obj.readPostalCodeFile();

	}

}
