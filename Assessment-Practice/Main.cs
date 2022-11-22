using System;

public class Main
{
	public static void Main()
	{
	    int n=Convert.ToInt32(Console.ReadLine());
	    int c=0,tmp=n,rem;
	    while(n>0)
	    {
	        c++;
	        n/=10;
	    }
	    if(c%2!=0)
	    {
	        int rev=0;
	        Console.WriteLine(tmp);
	        while(tmp!=0)
	        {
	            rem=tmp%10;
	            rev=(rev*10)+rem;
	            tmp=tmp/10;
	        }
	        Console.WriteLine(rev);
	    }
	    else
	    {
	        int sh=0,ec=c/2,fh=0,cnt=c/2;
	        while(c!=ec)
	        {
	            rem=tmp%10;
	            sh=(sh*10)+rem;
	            tmp/=10;
	            c--;
	        }
	        while(c!=0)
	        {
	            rem=tmp%10;
	            fh=(fh*10)+rem;
	            tmp/=10;
	            c--;
	        }
	        while(cnt>0)
	        {
	            fh*=10;
	            cnt--;
	        }
	        Console.WriteLine(fh+sh);
	    }
	}
}
