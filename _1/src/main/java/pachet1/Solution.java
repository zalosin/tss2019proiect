package pachet1;

public class Solution {
    public int solve(int n, int[] arr, int a, int b, int c){
        if (n > 100 || n < 1){
            throw new IllegalArgumentException("N should be between 1 and 100");
        }
        if (n != arr.length){
            throw new IllegalArgumentException("N should be the length of the array");
        }

        int i;
        int result = 0;
        for (i=0; i<n; i++){
            if (    ( arr[i] == (a+b+c) ) ||
                    ( arr[i] == (a+b-c) ) ||
                    ( arr[i] == (a-b+c) ) ||
                    ( arr[i] == (a-b-c) ) ||
                    ( arr[i] == (b-a+c) ) ||
                    ( arr[i] == (b-a-c) ) ||
                    ( arr[i] == (c-a+b) ) ||
                    ( arr[i] == (c-a-b) ) ||
                    ( arr[i] == ((-a)-b-c) )
            ){
                result++;
            }
        }
        return result;
    };
}
