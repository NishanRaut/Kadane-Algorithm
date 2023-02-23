import java.util.Scanner;

public class Kadane{
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int length,i,number,sum=0,csum=0; 
        System.out.println("Enter the length of an array: ");
        length=input.nextInt();
        int arr []=new int[length];
        System.out.println("Enter Numnber: ");
        for(i=0;i<length;i++){
            number=input.nextInt();
            arr[i]=number;
        }
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>0){
                if(sum>csum){
                    csum=sum;
                }
            }
            else{
                sum=0;
            }
        }
        System.out.println(csum);
    }
}