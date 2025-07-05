class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        } 
        result.add(map.size());
        
        for(int i = k; i < n; i++){
            if(map.get(arr[i - k]) == 1){
                map.remove(arr[i - k]);
            }else{
                map.put(arr[i - k], map.get(arr[i - k])- 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            result.add(map.size());
        }
        return result;
    }
}
