class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length==1){
            result.add(List.of(strs[0]));
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
/*
char[] arr1 = strs[i].toCharArray();
            Arrays.sort(arr1);
            List<String> subResult = new ArrayList<>();
            for(int j=0;j<strs.length;j++){
                char[] arr2 = strs[i].toCharArray();
                Arrays.sort(arr2);
                if((i!=j) && (arr1.length==arr2.length) && (new String(arr1).equals(new String(arr2)))){
                    subResult.add(new String(arr1));
                    subResult.add(new String(arr2));
                } else{
                    subResult.add(new String(arr1));
                }
            }
            result.add(subResult);
*/