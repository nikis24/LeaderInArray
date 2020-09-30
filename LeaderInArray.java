/* Program to find Leader’s in an array 
(A Number is a Leader if no other number in the
 later part of the array Is greater than it )*/

public class LeaderInArray {
    //Function to check condition that no element should be greater at right of lead. 

    void printArray(int arr[], int n){
        for(int i = 0; i < n; i++){
            int j;
            for( j = i + 1; j < n; j++){
                if(arr[i]< arr[j]) //If this condition found loop will break.
                break;
            }
            if(j == n) //pointer reaches at end it will print result.
            System.out.println(arr[i]+" ");
        }
    }
    //Main Function
    public static void main(String[] args){
        LeaderInArray lead = new LeaderInArray();
        int arr[] = {21,47,8,56,34,60,4,2};
        int n = arr.length;
        lead.printArray(arr, n);
    }
}
