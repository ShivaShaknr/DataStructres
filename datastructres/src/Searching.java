import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(linearSearch(arr1, target));
        System.out.println(binarySearch(arr1, 0, n, target));
        
    }
    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[],int low,int high,int target){
        int mid = (low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr, low, mid-1, target);
        }
        else if (arr[mid]<target){
             return binarySearch(arr, mid+1, high, target);
        }
        return -1;
            
        }
    }
    

