/**
 * * disjoint :- Use this property to solve th progrm friends
 * * Question :- Find if two people are firend or not suppose {1,2,3,4} , if(1,2) are friends and (1,4 )are friends then
 * *(1,2,4) are friends  
 */

import java.util.*;
public class disjoint {

    static int rank[];
    static int parent[];
    static int n;
    disjoint(int n)
    {
        rank = new int[n];
        parent= new int[n];
        this.n=n;
        for(int i=0;i<n;i++)
        {
            parent[i]=i;

        }
    }
    // * new Find  which reduces time Complexity
    public int findNew(int x)
    {
        if(parent[x]!=x)
        {
            parent[x]=findNew(parent[x]);
        }
        return parent[x];
        //* Basically over here we are reducing the path and making one single parent 
    }
    public int find(int x)
    {
        if(parent[x]==x)return x;

        return find(parent[x]);
    }
    public void union (int x,int y)
    {
        int rootX =find(x);
        int rootY =find(y);

        if(x==y)
        return;
        if(rank[rootX]<rank[rootY])
        {
            parent[rootX]=rootY;
        }
        else if(rank[rootX]>rank[rootY])
        {
            parent[rootY]=rootX;
        }
        else
        {
            parent[rootX]=rootY;
            rank[rootY]+=1;
        }
    }
    public boolean isfriends(int x,int y)
    {
        int rootX=findNew(x);
        int rootY=findNew(y);
        if(rootX==rootY)return true;
        return false;
    }
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        disjoint ds = new disjoint(n);
        ds.union(1,7);
        System.out.println("Are Friends :- "+ds.isfriends(0, 7));
    }
}