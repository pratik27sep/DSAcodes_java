package dsalab;

import java.util.Scanner;

public class Matrix {
	int[][] a = new int[3][3];
	
	Scanner sc = new Scanner(System.in);
	
	public void createMat3x3() {
		//int[][] a = new int[3][3];
		System.out.println("Enter the Element in array");
		for(int i =0; i <a.length;i++) {
			for(int j=0; j<a.length;j++) {
				a[i][j]= sc.nextInt();
			}
		}	
	}
	
	public void displayMat() {
		//int[][] a = new int[3][3];
		System.out.println("Matrix are ");
		for(int i =0; i <a.length;i++) {
			for(int j=0; j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
	}

	public int LargeElement() {
		int temp =a[0][0] ;
		for(int i =0; i <a.length;i++) {
			for(int j=0; j<a.length;j++) {
				if(a[i][j] >= temp) {
					temp = a[i][j];	
				}
			}
		}
		return temp;
	}
	
	public int SmallestElement() {
		int temp =a[0][0] ;
		for(int i =0; i <a.length;i++) {
			for(int j=0; j<a.length;j++) {
				if(a[i][j] <= temp) {
					temp = a[i][j];	
				}
			}
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrix m = new Matrix();
		m.createMat3x3();
		m.displayMat();
		System.out.println("largest element in matrix is "+m.LargeElement());
		System.out.println("Smalest element in matrix is "+m.SmallestElement());

//		m.LargeElement();
//		m.SmallestElement();

	}

}
