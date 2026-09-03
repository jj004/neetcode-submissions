class MyHashMap {

    private int[] m;

    public MyHashMap() {
        m = new int[1000001];
        Arrays.fill(m, -1);
    }
    
    public void put(int key, int value) {
        m[key] = value;
    }
    
    public int get(int key) {
        return m[key];
    }
    
    public void remove(int key) {
        m[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */