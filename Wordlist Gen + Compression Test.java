import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;


public class Test
{
	static String fname="Words.txt";
	static File file=new File(fname);
	static int a,b,c,d,e,f,g,h,i,j;
	static String res;

	//Differnet collection of charset
	static String[] loweralpha={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static String[] upperalpha={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String[] mixalpha={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String numeric[]={"0","1","2","3","4","5","6","7","8","9"};
	static String german[]={"~","`","!","@","#","$","%","^","&","*","(",")","_","-","+","=","{","[","}","]","<",">","?","/",",",".","\\","\'",":",";","\""};
	static String[] all94={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0","~","`","!","@","#","$","%","^","&","*","(",")","_","-","+","=","{","[","}","]","<",">","?","/",",",".","\\","\'",":",";","\""," ","|"};
	
	
		
	public static void main(String args[]) throws IOException
	{
		int d1h,d1m,d1s,d2h,d2m,d2s,timesec = 0,count=0;
		Date d1=new Date(System.currentTimeMillis());
		file.createNewFile();
		FileWriter out=new FileWriter(file);
		SimpleDateFormat ft=new SimpleDateFormat("hh");
		SimpleDateFormat ft1=new SimpleDateFormat("mm");
		SimpleDateFormat ft2=new SimpleDateFormat("ss");

		//Wordlist Generation Parts
		for(a=0;a<95;a++)
		{
			System.out.print("\rCurrent "+all94[a]+"***\r");
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						res="\n"+all94[a]+all94[b]+all94[c]+all94[d];
						out.write(res);
						count=count+1;
						
					}
				}
			}
		}
		out.close();
		Date d2=new Date(System.currentTimeMillis());
		
		//TIME AND SPEED CALCULATIONS
		d1h=Integer.parseInt(ft.format(d1));
		d1m=Integer.parseInt(ft1.format(d1));
		d1s=Integer.parseInt(ft2.format(d1));
		d2h=Integer.parseInt(ft.format(d2));
		d2m=Integer.parseInt(ft1.format(d2));
		d2s=Integer.parseInt(ft2.format(d2));
		if(d1h!=d2h)
		{
			timesec=timesec+((d2h-d1h)*3600);
		}
		
		if(d1m!=d2m)
		{
			timesec=timesec+((d2m-d1m)*60);
		}
		if(d1s!=d2s)
		{
			timesec=timesec+(d2s-d1s);
		}
		System.out.println("Time Taken in Seconds : "+timesec+"(s)");
		System.out.println("Number of Words : "+count);
		System.out.println("Speed is : "+count/timesec+"  Words/Sec");
		Word wo=new Word();
		String zname=fname+"-zip";
		wo.compress(fname,zname);
		file.delete();
	}

	//Compressing Module
	public void compress(String filename,String zipfilename) throws IOException
	{
		System.out.println("Compression Process Initiated for File : "+filename);
		Process pro=Runtime.getRuntime().exec("7z a -t7z -aoa "+zipfilename+".7z "+filename);
		BufferedReader reader =  new BufferedReader(new InputStreamReader(pro.getInputStream()));
	
        	String line = "";
        	while((line = reader.readLine()) != null) 
			{
                	 System.out.print(line + "\n");
        		}
		try{
        		pro.waitFor(); 
		}
		catch(InterruptedException ex)
		{
	
		}
		System.out.println("Compression Ends");
	}
}
