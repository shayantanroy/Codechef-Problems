package graphimplementation;

import java.util.LinkedList;
import java.util.*;

public class GraphImplementation {
	private LinkedList<Integer> adj[];
	
	public GraphImplementation(int vertex) {
		adj=new LinkedList[vertex];
		for(int i=0;i<vertex;i++) {
			adj[i]=new LinkedList<Integer>();
	
	
		}
	}
	
	public void addEdge(int source,int destination) {
		
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public  void bfs(int source) {
		
		boolean vis[]=new boolean[adj.length];
		Queue<Integer> q=new LinkedList<>();
		
		q.add(source);
		vis[source]=true;
		while(!q.isEmpty()) {
			int current=q.poll();
	
			for(int neighbour:adj[current]) {
				if( !vis[neighbour]) {
					vis[neighbour]=true;
					q.add(neighbour);
					
					
				}
				
			}
			System.out.println(current);
		
			
		}
		
	

	}
	public void dfs(int source) {
		boolean vis[]=new boolean[adj.length];
		Stack<Integer>s=new Stack<>();
		s.push(source);
		vis[source]=true;
		
		while(!s.isEmpty()) {
			int curr=s.pop();
			for(int j:adj[curr])
				if(!vis[j]) {
					vis[j]=true;
					s.push(j);
				}
			System.out.println(curr);
		}
		
	}
	

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vertex=sc.nextInt();
		int edges=sc.nextInt();
		
		GraphImplementation g=new GraphImplementation (vertex);
		
		for(int i=0;i<edges;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
		
		
		g.addEdge(source, destination);
		}
			int source=sc.nextInt();
			System.out.println();
			g.bfs(source);
			
	}

}
