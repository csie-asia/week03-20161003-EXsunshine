/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/03
 * Author: 105021057 張岳埕
 */
package hw;
import java.util.*;
public class hw04_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 1;
		while(n>0){
			sum = sum*n;
			n--;
		}
		System.out.print(sum);
	}

}