class Solution {
    public int[] replaceElements(int[] arr) {
        int tempMax = arr[arr.length-1];
        int max = arr[arr.length-1];
        arr[arr.length - 1] = -1;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = arr.length-1; j > i; j--){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            arr[i] = max;
            max = tempMax;
        }
        return arr;
    }
}