package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args){
		int pay_month = 1700000;
		int person=3;
		int shop = 1500;
		
		long annual_income = (long)pay_month*person*shop*12;
		
		System.out.println("<< 디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d", pay_month)+"원");
		System.out.println("점포 내 직원 수 : "+person+"명");
		System.out.println("점포 수 : "+String.format("%,d", shop)+"개");
		System.out.println("연간 인건비 : "+String.format("%,d", annual_income)+"원");
	}
}
