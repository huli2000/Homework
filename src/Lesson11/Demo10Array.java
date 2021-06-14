package Lesson11;

import java.util.Arrays;

public class Demo10Array
{
public static void main(String[] args)
	{
	
		
	
	//int[]ar1 = {2,0,8,5,6,7,7,6,6,1,1,3};
	int[]ar1 = new int [10];

	for (int i = 0 ; i < ar1.length ; i++) {
	ar1[i]=(int)(Math.random()*11);
				
					System.out.print("Slot #" + i +" : " );
					System.out.println(ar1[i]);
					}
			int[]ar2 = new int [10];
			int len = 0 ;
		lbl:		for (int i=0 ; i < ar1.length; i++) 
		{
							for (int j = 0;j<len; j++ )
			{
										if (ar1[i]==ar2[j])
				{
													continue lbl;
								
				}
							
			}
							ar2[len]=ar1[i];
							len++;
		}
	}
}
