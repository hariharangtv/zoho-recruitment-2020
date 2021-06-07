import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        int x=0,y=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==x && j==x) ||(i==x && j==y))
                {
                    System.out.print(str.charAt(i));
                }
                else
                System.out.print(" ");
            }
            System.out.println();
            x++;
            y--;
        }
     }
}
