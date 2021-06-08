import java.util.*;
public class Program
{
     public static void main(String []args)
     {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        String a=str.substring(n/2)+str.substring(0,n/2);
        System.out.println(a);
        String space="";
        for(int i=0;i<n;i++)
        space+=" ";
        for(int i=0;i<n;i++)
        {
            System.out.println(space.substring(i,n-1)+a.substring(0,i+1));
        }
     }
}
