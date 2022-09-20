package com.velocity;
//Program for sorting array in dessending order
public class ArrayDessendingOrder {
	public static void main(String[] args) {
		int a[]= {2,4,3,8,7,1};
		int temp;
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Dessending order");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
		}
}
