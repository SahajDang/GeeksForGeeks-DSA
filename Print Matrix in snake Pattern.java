class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            if( i % 2 == 0){
                for(int j = 0; j < n; j++){
                   result.add(matrix[i][j]); 
                }
            }else{
                for(int j = n - 1; j >= 0; j--){
                    result.add(matrix[i][j]); 
                }
            }
            
        }
        return result;
    }
}
