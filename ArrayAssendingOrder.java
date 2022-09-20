package com.velocity;
//Program for sorting array in assending order
public class ArrayAssendingOrder {
	public static void main(String[] args) {
		int a[]= {12,41,13,81,7,1};
		int temp;
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("assending order");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
		}
	}