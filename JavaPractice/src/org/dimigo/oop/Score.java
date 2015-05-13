/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Score
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 *
 * @author		: user
 * @version		: 1.0
 */
public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 =>");
		int kor=scanner.nextInt();
		System.out.println("수학 점수 입력 =>");
		int math=scanner.nextInt();
		System.out.println("영어 점수 입력 =>");
		int eng=scanner.nextInt();
		
		int sum=kor+eng+math;
		String s = new StringBuilder()
		.append("<<점수 출력>>\n")
		.append("\n국어 점수 : ")
		.append(kor)
		.append(" 점")
		.append("\n수학 점수 : ")
		.append(math)
		.append(" 점")
		.append("\n영어 점수 : ")
		.append(eng)
		.append(" 점")
		.append("\n총점 : ")
		.append(sum)
		.append(" 점")
		.append("\n평균 : ")
		.append(String.format("%.1f", sum/3.0))
		.append(" 점")
		.toString();
		System.out.println(s);
		scanner.close();
	}
}
