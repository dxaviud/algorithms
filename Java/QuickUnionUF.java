public class QuickUnionUF 
{
    private int[] id;
    private int[] sz;
    
    public QuickUnionUF(int N)
    {
        id = new int[N];
        sz = new int[N];
        for (int i  = 0; i < N; i++) 
        {
            id[i] = i;
            sz[i] = 1;
        }
    }
    
    private int root(int i)
    {

        while (i != id[i])
        {
            id[i] = id[id[i]];
            i = id[i];
        }
        
        return i;
    }
    
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }
    
    public void union(int p, int q)
    {
        int pRoot = root(p);
        int qRoot = root(q);
        if (pRoot == qRoot)
            return;
        if (sz[p] < sz[q])
        {
            id[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }
        else
        {
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        
    }
    
    public String toString()
    {
        String result = "Index: ";
        for (int i = 0; i < id.length; i++)
        {
            result += " " + i;
        }
        result += "\nSlots: ";
        for (int i : id)
            result += " " + i;
            
        return result;
    }
    
    public static void main(String[] args)
    {
        QuickUnionUF quickUnion = new QuickUnionUF(10);
        quickUnion.union(0,1);
        quickUnion.union(2,3);
        quickUnion.union(4,5);
        quickUnion.union(6,7);
        quickUnion.union(8,9);
        
        
        quickUnion.union(0,2); //root of 0 is 1, root of 2 is 3. Thus, root of 1 should become 3 by performing this union
        
        // quickUnion.union(3,8);
        
        System.out.println("0 and 1 connected: " + quickUnion.connected(0,1));
        System.out.println("The data structure: \n" + quickUnion);
    }
}
