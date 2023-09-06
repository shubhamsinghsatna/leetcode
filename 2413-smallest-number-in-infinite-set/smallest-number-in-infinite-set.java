class SmallestInfiniteSet {
    PriorityQueue<Integer> q;
    public SmallestInfiniteSet() {
        q = new PriorityQueue<Integer>();//this PriorityQueue stores in asceding order
        for(int i = 1 ; i <= 1000; i ++){
            q.add(i);
        }
    }
    
    public int popSmallest() {
        return q.poll();//just return the first element
    }
    
    public void addBack(int num) {
        if(!q.contains(num)){
            q.add(num);//check if not present then add the num
        }
    }
}