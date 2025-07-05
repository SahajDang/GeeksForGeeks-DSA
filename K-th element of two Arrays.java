// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int s) {
        // code here
        int m = a.length;
        int n = b.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int result[] = new int[m + n];
        while(i < m && j < n){
            if(a[i] < b[j]){
                result[k++] = a[i++];
                
            }else{
                result[k++] = b[j++];
            }
        }
        while(i < m){
            result[k++] = a[i++];
        }
        while(j < n){
            result[k++] = b[j++];
        }
        int value = 0;
        for(int x = 1; x <= result.length; x++){
            if(x == s){
                value = result[x - 1];
            }
        }
        return value;
    }
}
