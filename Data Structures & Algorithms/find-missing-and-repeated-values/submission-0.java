class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> data = new ArrayList<>();
        int[] result = new int[2];
        int r = grid.length;
        for(int i = 0; i < r; i++){
            int c = grid[i].length;
            for(int j = 0; j < c; j++){
                data.add(grid[i][j]);
                freq.put(grid[i][j], freq.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        
        Collections.sort(data);
        for(int i = 1; i <= data.size(); i++){
            if(!data.contains(i)){
                result[1] = i;
                break;
            }
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() > 1){
                result[0] = entry.getKey();
                break;
            }
        }

        return result;
    }
}