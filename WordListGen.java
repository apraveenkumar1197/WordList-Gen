import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class WordListGen
{
	
	static File file=new File("Words.txt");
	static String[] loweralpha={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static String[] upperalpha={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String[] mixalpha={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String numeric[]={"0","1","2","3","4","5","6","7","8","9"};
	static String german[]={"~","`","!","@","#","$","%","^","&","*","(",")","_","-","+","=","{","[","}","]","<",">","?","/",",",".","\\","\'",":",";","\""};
	static String[] all95={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0","~","`","!","@","#","$","%","^","&","*","(",")","_","-","+","=","{","[","}","]","<",">","?","/",",",".","\\","\'",":",";","\""," ","|"};
	static int a,b,c,d,e,f,g,h,i,j,k,l,m,n;
	static String res;
		
	public static void main(String args[]) throws IOException
	{
		Date d1=new Date(System.currentTimeMillis());
		file.createNewFile();
		FileWriter out=new FileWriter(file);
		SimpleDateFormat ft=new SimpleDateFormat("hh : mm : ss");
		System.out.println("1 : 1-4 Digits");
		System.out.println("2 : 5 Digits");
		System.out.println("3 : 6 Digits");
		System.out.println("4 : 7 Digits");
		System.out.println("5 : 8 Digits");
		System.out.println("6 : 9 Digits");
		System.out.println("7 : 10 Digits");
		System.out.println("8 : 11 Digits");
		System.out.println("9 : 12 Digits");
		System.out.println("10 : 13 Digits");
		System.out.println("Enter the Number to choose the Wordlsit type");
		Scanner scn=new Scanner(System.in);
		int ch=scn.nextInt();
		switch(ch)
		{
		case 1:
		for(a=0;a< 95;a++)
		{
		res=""+all95[a];
		out.write(res);
		}
		System.out.println("One Digit");
		for(a=0;a<95;a++)
		{
			for(b=0;b<95;b++)
			{
				res=""+all95[a]+all95[b];
				out.write(res);
			}
		}
		System.out.println("Two Digit");
		for(a=0;a<95;a++)
		{
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
						res=""+all95[a]+all95[b]+all95[c];
						out.write(res);
				}
			}
		}
		System.out.println("Three Digit");
		for(a=0;a<95;a++)
		{
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						res=""+all95[a]+all95[b]+all95[c]+all95[d];
						out.write(res);
						
					}
				}
			}
		}
		System.out.println("Four One Digit");
		out.close();
		Date d2=new Date(System.currentTimeMillis());
		System.out.println("Starting Time : "+ft.format(d1));
		System.out.println("Ending Time   : "+ft.format(d2));
		case 2:
			for(a=0;a<95;a++)
		{
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
						res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e];
						out.write(res);
						}
					}
				}
			}
		}
		case 3:
			for(a=0;a<95;a++)
			{
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
							for(f=0;f<95;f++)
							{
								res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e]+all95[f];
								out.write(res);
							}
						}
					}
				}
			}
		}
		case 4:
		for(a=0;a<95;a++)
		{
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
							for(f=0;f<95;f++)
							{
								for(g=0;g<95;g++)
								{
									res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e]+all95[f]+all95[g];
									out.write(res);
								}
							}
						}
					}
				}
			}
		}
		case 5:
		for(a=0;a<95;a++)
		{	
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
							for(f=0;f<95;f++)
							{
								for(g=0;g<95;g++)
								{
									for(h=0;h<95;h++)
									{
										res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e]+all95[f]+all95[g]+all95[h];
										out.write(res);
									}		
								}
							}
						}
					}
				}
			}
		}
		case 6:
		for(a=0;a<95;a++)
		{	
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
							for(f=0;f<95;f++)
							{
								for(g=0;g<95;g++)
								{
									for(h=0;h<95;h++)
									{
										for(i=0;i<95;i++)
										{
											res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e]+all95[f]+all95[g]+all95[h]+all95[i];
											out.write(res);
										}
									}		
								}
							}
						}
					}
				}
			}
		}
		case 7:
		for(a=0;a<95;a++)
		{	
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
							for(f=0;f<95;f++)
							{
								for(g=0;g<95;g++)
								{
									for(h=0;h<95;h++)
									{
										for(i=0;i<95;i++)
										{
											for(j=0;j<95;j++)
											{
												res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e]+all95[f]+all95[g]+all95[h]+all95[i]+all95[j];
												out.write(res);
											}
										}
									}		
								}
							}
						}
					}
				}
			}
		}
		case 8:
		for(a=0;a<95;a++)
		{	
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
							for(f=0;f<95;f++)
							{
								for(g=0;g<95;g++)
								{
									for(h=0;h<95;h++)
									{
										for(i=0;i<95;i++)
										{
											for(j=0;j<95;j++)
											{	
												for(k=0;k<95;k++)
												{
												res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e]+all95[f]+all95[g]+all95[h]+all95[i]+all95[j]+all95[k];
												out.write(res);
												}
											}
										}
									}		
								}
							}
						}
					}
				}
			}
		}
		case 9:
		for(a=0;a<95;a++)
		{	
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
							for(f=0;f<95;f++)
							{
								for(g=0;g<95;g++)
								{
									for(h=0;h<95;h++)
									{
										for(i=0;i<95;i++)
										{
											for(j=0;j<95;j++)
											{	
												for(k=0;k<95;k++)
												{
													for(l=0;l<95;l++)
													{
														res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e]+all95[f]+all95[g]+all95[h]+all95[i]+all95[j]+all95[k]+all95[l];
														out.write(res);
													}
												}
											}
										}
									}		
								}
							}
						}
					}
				}
			}
		}
		case 10:
		for(a=0;a<95;a++)
		{	
			System.out.println(all95[a]);
			for(b=0;b<95;b++)
			{
				for(c=0;c<95;c++)
				{
					for(d=0;d<95;d++)
					{
						for(e=0;e<95;e++)
						{
							for(f=0;f<95;f++)
							{
								for(g=0;g<95;g++)
								{
									for(h=0;h<95;h++)
									{
										for(i=0;i<95;i++)
										{
											for(j=0;j<95;j++)
											{	
												for(k=0;k<95;k++)
												{
													for(l=0;l<95;l++)
													{
														for(m=0;m<95;m++)
														{
															res=""+all95[a]+all95[b]+all95[c]+all95[d]+all95[e]+all95[f]+all95[g]+all95[h]+all95[i]+all95[j]+all95[k]+all95[l]+all95[m];
															out.write(res);
														}
													}
												}
											}
										}
									}		
								}
							}
						}
					}
				}
			}
		}
		
		}
	}
}