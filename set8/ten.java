nt n,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int m=0;
		for(int i=n+1;i<k;i++)
		{int l=0;
			for(int j=1;j<=i;j++)
			{
		             	if(i%j==0)
		            	{
				l++;
			           }
			}
			if(l==2)
			{
				
		             	if(m<1)
		                       	{
			             System.out.print(i);
			             }
			             else
			            {
		                   
			            System.out.print(" ");
			            System.out.print(i);
		                   	}
		                   	m++;
			}  	
		              
		}
	}
