package restore;

import java.util.*;

public class NovemberLongChallengeRestore {

	 static int x=4000001;
	static boolean prime[]=new boolean[x+1];
	static ArrayList<Integer>c;
	
	public static void restore() {
		c=new ArrayList<>();
		for(int i=0;i<x;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=x; p++) 
        { 
           
            if(prime[p] == true) 
            { 
              
                for(int i = p*p; i <= x; i += p) 
                    prime[i] = false; 
            } 
        } 
          
	
        for(int i = 2; i <= x; i++) 
        { 
            if(prime[i] == true) 		
			c.add(i);
		}
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		restore();
		while(t-->0) {
			
		int n= sc.nextInt();
		int b[]=new int[n];
		ArrayList<Integer>a=new ArrayList<>();
				for(int i=0;i<n;i++) {
					b[i]=sc.nextInt();
					}
					for(int i=0;i<n;i++) {
						
					a.add(c.get(b[i]));
						}
					
		
for(int i:a) {
	System.out.print(i+" ");
}
System.out.println();
}
}
}


