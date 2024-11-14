package interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFiles {

	public static void main(String[] args) throws IOException {


		File f=new File("./samplefile.txt");
		if(!f.exists()) {
			System.out.println(f.createNewFile());
		}

		FileReader fr=new FileReader(f);//file reader need the input of file location
		BufferedReader br=new BufferedReader(fr);//buffered reader need th einpout reader so use filereader 

		/*
		 * //count no of line in file String line=new String();//store the lines in line
		 * empty int linecount=0;
		 * 
		 * while((line = br.readLine())!= null) {// while is used becoz we dont' know
		 * the ending count and check each line and increment until the line is null
		 * linecount++; }
		 * 
		 * System.out.println("no of lines in file:"+linecount);
		 */



		//find lengthy line in text file

		/* String line=new String();//store the lines in line empty

		  String lengthyline=new String();//empty while((line=br.readLine())!=null) {
		  if(line.length()>lengthyline.length()){ lengthyline=line; } }

		  System.out.println("lengthyline is:"+lengthyline);*/


		//word count in the text file

		/*
		 * String line=new String();//store the lines in line empty int wordcount=0;
		 * 
		 * 
		 * while((line=br.readLine())!=null) {//in each line split the words and count
		 * wordcount+=line.split(" ").length;
		 * 
		 * }
		 * 
		 * System.out.println("wordcount is:"+wordcount);
		 */



		//occurence on given word or target word in text file

		/*
		 * String line=new String();//store the lines in line empty String
		 * targetword="Selenium"; int count=0;
		 * 
		 * while((line=br.readLine())!=null) {//in each line split the words and count
		 * String[] words=line.split(" "); for (String w : words) {
		 * if(w.equals(targetword)) count++; }
		 * 
		 * }
		 * 
		 * System.out.println("targetword occurences is:"+count);
		 */



		//update existing text into uppercase and write into the same file

		
		  String line=new String();//store the lines in line empty String up=new
		  String up=new String();// to store uppercase
		  
		  
		  while((line=br.readLine())!=null) {//in each line split the words and count
		  up=up+line.toUpperCase()+"\n";
		  
		  
		  } 
		  up=up.substring(0, up.lastIndexOf("\n"));//remove extra line 
		  System.out.println(up);
		  
		  BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		  
		  bw.write(up); System.out.println("updated");
		 








		br.close();
	}

}
