public class QuickFind {

    private int[] id;
    private int N;
    private int connectedCompCount;


    QuickFind(int N) {
        this.N = N;
        this.connectedCompCount = N;
        this.id = new int[N];
        for(int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean find(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int oldId = id[p];
        int newId = id[q];
        for(int i = 0; i < N; i++) {
            if(id[i] == oldId)
                id[i] = newId;
        }
        connectedCompCount -= 1;
    }

    public int count() {
        return connectedCompCount;
    }

}
