class MyHashSet {

    private int[] data;
    int index = 0;

    public MyHashSet() {
        data = new int[1000000];
        Arrays.fill(data, -1);
    }
    
    public void add(int key) {
        if(!this.contains(key)){
            data[index] = key;
            index++;
        }
    }
    
    public void remove(int key) {
        for(int i = 0; i < data.length; i++){
            if(data[i] == key){
                data[i] = -1;
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i = 0; i < data.length; i++){
            if(data[i] == key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */