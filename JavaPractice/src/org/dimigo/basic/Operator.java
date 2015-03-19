package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		double s1=(9+10)*5.8/2.0;
		String a1="사다리꼴";
		double s2=9*5.4;
		String a2="평행사변형";
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : "+s1);
		System.out.println("평행사변형 넓이 : "+s2);
		if(s1>s2)
		{
			System.out.println(a1+"이 "+a2+" 보다 "+(s1-s2)+" 더 큽니다.");
		}
		else if(s1<s2)
		{
			System.out.println(a2+"이 "+a1+" 보다 "+(s2-s1)+" 더 큽니다.");
		}
		else
		{
			System.out.println(a2+"이 "+a1+"과(와) 같습니다");
		}
	}
}
