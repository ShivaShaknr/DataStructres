import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        quickSort(arr1, 0, n-1);
        printArr(arr1);

    }

    public static void printArr(int arr1[]) {
        int n = arr1.length;
        for (int k = 0; k < n; k++) {
            System.out.print(arr1[k] + " ");
        }
    }

    public static int[] Selection(int arr1[]) {
        int n = arr1.length;
        int i = 0;
        while (i != n) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr1[min_index] > arr1[j]) {
                    min_index = j;
                }
            }
            int temp = arr1[min_index];
            arr1[min_index] = arr1[i];
            arr1[i] = temp;
            i++;
        }
        return arr1;
    }
    public static int[] Bubble(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[i]<arr1[j]){
                   int temp = arr1[i];
                   arr1[i]=arr1[j];
                   arr1[j]=temp;
                }
            }
        }
        return arr1;
    }
    public static int[] Insertion(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=i;j>0;j--){
                if(arr1[j]<arr1[j-1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j-1];
                    arr1[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        return arr1;
    }
    public static int[] mergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    public static int[] merge(int first[],int second[]){
        int joined[] = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
                joined[k++]=first[i++];
            }
            else{
                joined[k++]=second[j++];
            }
        }
        while(i<first.length){
            joined[k++]=first[i++];
        }
        while(j<second.length){
            joined[k++]=second[j++];
        }
        return joined;
    }

    public static void quickSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = (start+end)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

            }
            quickSort(arr, low, end);
            quickSort(arr, start, high);
        }
    }
     


