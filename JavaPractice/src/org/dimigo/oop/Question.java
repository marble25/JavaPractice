/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author		: user
 * @version		: 1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] prob={"세상에서 가장 못생긴 사람은?", "세상에서 가장 잘생긴 사람은?", "내 앞에 있는 바보는?"};
		String[] answer={"강지훈", "김종윤", "오준용"};
		for(int i=0;i<prob.length;i++)
		{
			System.out.println(prob[i]);
			String getanswer = scanner.nextLine();
			if(answer[i].equals(getanswer))
			{
				System.out.println("정답입니다");
			}
			else
			{
				System.out.println("오답입니다.");
			}
		}
	}
}
