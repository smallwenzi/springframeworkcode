package com.yanwen;

public class Testmain {
 public static void	main(String args[]){

	 int num=Integer.MAX_VALUE;
	 num=num+2;
	 System.out.println(num);

	 int num5=Integer.MAX_VALUE;
	 num5+=2L;
     System.out.println(num5);
	 int a=-16,b=2;
	 int c=a<<b;
	 System.out.println("c="+c);
	 c=a>>b;
	 System.out.println("c="+c);
	 c=a>>>b;
	 System.out.println("c="+c);
	 int num2=50;
	 num2=num2++ *2;
	 System.out.println(num2);

	 //long num1=100;
	// int x=num1+2;
	 int num1=68;
	 char c1=(char)num1;
	 System.out.println(c1);
	 String str="";
	 for(int x=0;x<5;x++){
	 	str+=x;
	 }
	 System.out.println(str);
	 System.out.println(inc(10)+inc(8)+inc(-10));

	 char a1='A';
	 int num3=10;
	 switch (a1){

		  case 'B':
		 	num3++;
		 case 'A':
			 num3++;
		 case 'Y':
			 num3++;
		 break;
		 default:
			 num3--;
	 }
	 System.out.println(num3);
	 int num4 = 2147483647 ;
	 long temp = num4+ 2L ;
	 System.out.println(num4) ;
	 //boolean flag = 10%2 == 1 && 10 / 3 == 0 && 1 / 0 == 0 ;
	// System.out.println(flag ? "mldn" : "yootk") ;
	 int i=9;
	 switch (i){
		 default:
		 	 System.out.println("default");

			  case 0:
			 System.out.println("zero");
			 break;
		 case 1:
			 System.out.println("1");

		 case 2:
			 System.out.println("2");

	 }
 }

 public static int inc(int temp){
 	if(temp>0){
 		return temp*2;
	}
 	return -1;
 }
}
