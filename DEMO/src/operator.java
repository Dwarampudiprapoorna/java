
public class operator {
public static void main(String[]args)
{
	
	int a=9;
	int b=5;
	//arthematic operator//
	System.out.println(a-b);
	System.out.println(a*b);
	{
		//unary operator//
		int z=a++;
		System.out.println("the output is z:"+z);
		int x=--a;
		System.out.println("the value is x:"+x);
		int y=++a; 
		//logical operator//
		System.out.println("the no is y:"+y);
		int p=a&b;
		System.out.println("the value is:"+p);
		int s=a/b;
		System.out.println("the value is:"+s);
		//Assignment operator
		int m ;
		System.out.println(m=5);
		System.out.println(m+=1);//m=m+1==5+1=6
		System.out.println(m*=3);//m=m*3==6*3=18
		System.out.println(m-=2);//m=m-2==18-2=16
		System.out.println(m/=4);//m=m/1==16/4=4
		//Ternary operator
		int c=25;
		System.out.println("ternary operator");
		c=(20==c)?1:0;
		System.out.println("value of c is:"+c);
		
		
	
		
			

		
		
	

		
				
	
		
		
		
		
	}
}
}
