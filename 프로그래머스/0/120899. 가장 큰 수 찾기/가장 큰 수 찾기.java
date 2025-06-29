class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] arr=new int[array.length];
        for(int i=0; i<array.length; i++)
            arr[i]=array[i];
        for(int i=0; i<arr.length-1; i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i]>arr[j]){
                    int temp=0;
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;        
                }
        answer[0]=arr[arr.length-1];
        for(int i=0; i<array.length; i++)
            if(array[i]%arr[arr.length-1]==0)
                answer[1]=i;
                
        return answer;
    }
}