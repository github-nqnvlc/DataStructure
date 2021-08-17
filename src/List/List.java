package List;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class List {
	int A[] = new int [10]; //Mảng A chứa dữ liệu
	int n; //Số phần tử thực tế của mảng
	
	void Nhap()
	{
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<n; i++)
		{
			System.out.print("Nhap A["+ i +"] = ");
			A[i] = rd.nextInt(50);
			//A[i] = sc.nextInt();
			System.out.println();
		}
	}
	
	void xuat()
	{
		for (int i = 0; i<n; i++)
			System.out.print(A[i]+ " ");
	}
	
	int tong()
	{
		int s=0;
		for (int i =0; i<n; i++)
			s=s+A[i];
		return s;
	}
	
	void Chen(int x, int p) //chen x vao vi tri p
	{
		n++;
		for (int i=n-1; i>p; i--)
			A[i] =A[i-1];
		A[p] = x;
	}
	
	void xoa(int p) //xoa phan tu A[p]
	{
		for (int i=p; i<n; i++)
			A[i] = A[i+1];
		n--;
		
	}
	
	void sx() // sap xep phan tu
	{
		for (int i=0; i<n-1; i++)
			for (int j=n-1; j>1; j--)
				if (A[j] < A[j-1])
				{
					int x = A[j];
					A[j] = A[j-1];
					A[j-1]= x;
				}
	}
	
	void sochan() //tim so chan
	{
		for (int i = 0; i<n; i++)
			if (A[i]%2==0)
			System.out.print(A[i] + " ");
	}
	
	void TBC() // tbc cac so chia het cho 3
	{
		int t=0;
		int d=0; 
		float tbc = 0;
		for (int i = 0; i<n; i++)
			if (A[i]%3==0)
			{
				t = t + A[i];
				d++;
			}
		if (d==0)		
			tbc = 0;
		else tbc = t/d;
		System.out.print(tbc + " ");
	}
	
	void demXY() //dem phan tu trong khoang tu X den Y
	{
		int x; int y; int d = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap x: ");
		x = sc.nextInt();
		System.out.print("\nNhap y: ");
		y= sc.nextInt();
		System.out.print("\nPhan tu trong khoang "+ x +" den " + y + " la: ");
		for (int i = 0; i<=n; i++)
			if (x<= A[i] & A[i] <= y )
			{
			d++;
			System.out.print(A[i] + " ");
			}
	
		System.out.print("\nSo phan tu trong khoang "+ x +" den " + y + " la: " + d);
	}
	
	void timkiem() //Tim X tại vi tri Y
	{
		int x; 
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap x: ");
		x = sc.nextInt();
		System.out.print("\nTim thay " + x + " tai: ");
		for (int i=0; i<n; i++)
			if (A[i]==x)
				System.out.print("A["+ i + "]; ");
	}

	
	
	public static void main(String[] args) 
	{
		List L = new List();
		L.n = 15;
		L.Nhap();
		System.out.print("\nMang vua nhap: ");
		L.xuat();
		System.out.print("\nTong mang vua nhap: "+ L.tong());
		L.Chen(1, 3);
		System.out.print("\nMang sau khi chen: ");
		L.xuat();
		L.xoa(1);
		System.out.print("\nMang sau khi xoa: ");
		L.xuat();
		L.sx();
		System.out.print("\nMang sau khi SX: ");
		L.xuat();
		System.out.print("\nPhan tu so chan: ");
		L.sochan();
		System.out.print("\nTBC so chia het cho 3: ");
		L.TBC();
		L.demXY();
		L.timkiem();
		
	}

}
