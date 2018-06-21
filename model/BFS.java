package game.model;

import java.io.*;
import java.util.*;

public class BFS {

	private int nbSommets; 
	private LinkedList<Integer> adjacent[];
	
	public BFS(int sommet) {
		nbSommets = sommet;
		adjacent = new LinkedList[sommet];
		
		for (int i = 0; i < sommet; ++i) {
			adjacent[i] = new LinkedList();
		}
	}
	
	public void ajouterListeSommet(int v, int w) {
		adjacent[v].add(w);
	}
	
	public void algo_bfs(int s) {
		boolean caseVisite[] = new boolean[nbSommets];
		LinkedList<Integer> queue = new LinkedList();
		
		caseVisite[s] = true;
		queue.add(s);
		
		while (queue.size() != 0) {
			s = queue.poll();
			System.out.println(s + " ");
		
			Iterator<Integer> i = adjacent[s].listIterator();
			
			while (i.hasNext()) {
				int n = i.next();
				
				if (!caseVisite[n]) {
					caseVisite[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main (String[] args) {
		BFS g = new BFS(4);
		
		g.ajouterListeSommet(0, 1);
		g.ajouterListeSommet(0, 2);
		g.ajouterListeSommet(1, 2);
		g.ajouterListeSommet(2, 0);
		g.ajouterListeSommet(2, 3);
		g.ajouterListeSommet(3, 3);
		
		System.out.println("Following the BFS");
		g.algo_bfs(2);
	}
}
