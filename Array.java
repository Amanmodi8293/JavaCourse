package COM.MODI;
public class Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
        int start = 2;
        int end = 6;

        int[] subArray = getSubArray(arr, start, end);
        int secondHighest = findSecondHighest(subArray);

        System.out.println("Sub array: ");
        for (int i = 0; i < subArray.length; i++) {
            System.out.print(subArray[i] + " ");
        }
        System.out.println("\n2nd Highest element: " + secondHighest);
    }

    public static int[] getSubArray(int[] arr, int start, int end) {
        int[] subArray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            subArray[i - start] = arr[i];
        }
        return subArray;
    }

    public static int findSecondHighest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}