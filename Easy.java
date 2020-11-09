package easyandquries;

import java.util.Scanner;

public class Easy {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		
	
		}
		int i;
		for( i=0;i<a.length;i++) {
			if(a[i]>=k) {
				count++;
				a[i+1]+=(a[i]-k);
			}
			if(a[i]<k)
				
				break;
		}
		if(i==n) {
			count+=(a[n-1]-k/k);
		}
		
			
System.out.println(count+1);
	}

}
