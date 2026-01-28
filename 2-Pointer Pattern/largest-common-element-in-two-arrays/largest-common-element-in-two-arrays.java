public class Main {
    public static int largestCommonElement(int[] arr1, int[] arr2) {
        // Write your code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0, max = -1;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                max = Math.max(max, arr1[i]);
                i++;
                j++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                i++;
            }
        }
        return max;
    }
