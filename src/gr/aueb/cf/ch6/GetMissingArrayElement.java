package gr.aueb.cf.ch6;

public class GetMissingArrayElement {

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};

        System.out.println("Missing number from array arr1: "+getMissing(arr));

    }

    public static int getMissing(int[] arr)
    {
        int n = arr.length+1;
        int sum = n * (n+1) / 2;
        int restSum = 0;
        for (int i = 0; i < arr.length; i++) {
            restSum += arr[i];
        }
        int missingNumber = sum - restSum;
        return missingNumber;
    }
}
