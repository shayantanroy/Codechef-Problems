package covidrun;
import java.util.*;

public class Crun {

    
	public static void main (String[] args) throws java.lang.Exception{ 
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int count=0;
			int n=sc.nextInt();
			int k=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(y>n) {
				System.out.print("NO");
				
			}else {
				for(int i=0;i<n;i++) {
					if((x+k*i)%n==y) {
					System.out.print("YES");
					count=1;
					break;
				}
				}
			
			if(count==0)
				System.out.print("NO");
			}
		}
}
}

