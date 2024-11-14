package interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class MergeTwoFiles {

	public static void main(String[] args) throws Exception {

		File f1=new File("./File1.txt");
		File f2=new File("./File2.txt");

		BufferedReader br1=new BufferedReader(new FileReader(f1));
		BufferedReader br2=new BufferedReader(new FileReader(f2));


		String line=new String();

		String text1=new String();
		String text2=new String();


		while((line=br1.readLine())!=null){
			text1=text1+line+"\n";
		}



		while((line=br2.readLine())!=null){
			text2=text2+line+"\n";
		}

		System.out.println(text1);
		System.out.println(text2);


		String text3=text1+"\n"+text2;




		File f3=new File("./File3.txt");
		if(!f3.exists()) {
			System.out.println(f3.createNewFile());
		}

		BufferedWriter bw=new BufferedWriter(new FileWriter(f3));

		bw.write(text3); 
		System.out.println("updated");







	}

}
