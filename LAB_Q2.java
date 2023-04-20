package array;

/*Problem 2: 

Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.*/
public class LAB_Q2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 8, 10};
        int[] arr2 = {2, 4, 5, 6, 8, 10};
        int[] arr3 = {3, 4, 6, 7, 8, 10};
        
        int i = 0, j = 0, k = 0;
        
        while(i < arr1.length && j < arr2.length && k < arr3.length) {
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
    }
}