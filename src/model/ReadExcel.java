package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;


public class ReadExcel {
	
	BufferedReader buffRead = null;
	String line = null;
	String splitBy = ",";
	String[] data = null;
	
	public ReadExcel() throws IOException{
	}
	
	public void importCSVFile() throws IOException
	{	
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(null);
		File file = null;
		if(returnVal == JFileChooser.APPROVE_OPTION) {
		file = chooser.getSelectedFile(); // path to image
		}
		
		try {
			buffRead = new BufferedReader(new FileReader(file));
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
	
}
