import java.util.*;
public class array
{
    
    public static void main(String[] args)
     {
        int flag=0,mid=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
            int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("enter element\t");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]);

        System.out.println("\n\nenter the number u want to search : ");
        int num=sc.nextInt();

            //BINARY SEARCH
            int s=0,l=n-1;
        while(s<=l)
        {
            mid=(s+l)/2;
            if(num>a[mid])
                s=mid+1;
            else if(num<a[mid])
                l=mid-1;
            else{
                flag=1;
                break;
            }
            
        }
        if(flag==1)
            System.out.println("item found at : "+(mid+1));
        else
            System.out.println("item not found");
	}
}