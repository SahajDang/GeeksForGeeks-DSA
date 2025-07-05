// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
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
        int median = result.length;
        double mid = 0.0;
        if(median % 2 == 0){
            mid = (double) (result[result.length / 2] + result[(result.length / 2) - 1]) / 2;
        }else{
            mid = result[(int) Math.ceil((result.length / 2))];
        }
        return mid;
    }
}
