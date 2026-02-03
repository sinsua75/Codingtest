class Solution {
    public int solution(int[] arr1, int[] arr2) {

        if(arr1.length < arr2.length) return -1;
        if(arr1.length > arr2.length) return 1;

        int temp = 0;
        int temp2 = 0;

        for(int i = 0; i < arr1.length; i++){
            temp += arr1[i];
            temp2 += arr2[i];
        }

        if(temp > temp2) return 1;
        if(temp < temp2) return -1;
        return 0;
    }
}
