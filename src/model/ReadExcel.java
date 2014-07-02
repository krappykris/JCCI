package model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadExcel {
	String csvToRead = null;
	BufferedReader buffRead = null;
	String line = null;
	String splitBy = ",";
	String[] data = null;
	
	public ReadExcel() throws IOException{
		csvToRead = "/Users/Kris/Documents/carmel.csv";
		try {
			buffRead = new BufferedReader(new FileReader(csvToRead));
			while((line = buffRead.readLine())!=null){
				data = line.split(splitBy);
				if(data.length != 0){
					for(int i=0;i<data.length;i++){
						System.out.print("("+data[i]+")");
					}
					System.out.println();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) throws IOException{
		ReadExcel object = new ReadExcel();
	}
}
