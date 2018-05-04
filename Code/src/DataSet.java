import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
/**
 * BITS F464 Assignment 1
 * DataSet.java
 * ClassName : DataSet
 * Purpose : From given training or test data ArrayList of ArrayList of strings is created which is used later.
 * @author SSSA
 * @version 1.0 
 */
public class DataSet {
	ArrayList<ArrayList<String>> arr;
	ArrayList<String> arr1;
	
	DataSet()
	{
		arr = new ArrayList<ArrayList<String>>();
		arr1=new ArrayList<String>();
		
		int i=0;  
		
	  try{  
	    FileInputStream fin=new FileInputStream("src/adult.txt"); 
	    //Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fin));
		String line = null;
		
		while ((line = br.readLine()) != null) {
			
			line=line.replaceAll("\\s","");
			StringTokenizer st=new StringTokenizer(line,",");
			arr.add(new ArrayList<String>());
			while(st.hasMoreTokens())
			{	
				arr.get(i).add(st.nextToken());
			}
			i++;
			
		
		}
		br.close();
	  
	    
	   
	  }catch(Exception e){System.out.println(e);}  
	 }
	/*
	 * A method to put each line in ArrayList of strings from input test file.
	 * @return ArrayList of Strings with each element as line of file.
	 */
public static ArrayList<String> getInstance()
{
	ArrayList<String> instance=new ArrayList<String>();
	try{  
	    FileInputStream fin=new FileInputStream("src/adult.txt"); 
	    //Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fin));
		String line = null;
		
		while ((line = br.readLine()) != null) {
			
			instance.add(line);
	}
		
		br.close();
	  
	    
	   
	  }catch(Exception e){System.out.println(e);}  
	return instance;

}
	
}
