package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int distance = 10;
		String car = "고속버스";
		int pay=0;
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance+"km");
		System.out.println("차종 : "+car);
		switch(car)
		{
		case "고속버스":
			pay=850;
			pay+=300*((distance-1)/10);
			break;
		case "경차":
			pay=300;
			pay+=200*((distance-1)/10);
			break;
		case "그 외":
			pay=600;
			pay+=200*((distance-1)/10);
			break;
		}
		System.out.println("통행료 : "+pay+"원");
	}
}
