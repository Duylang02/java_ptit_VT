package javanew;
import java.util.Scanner;
public class BASIC007 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++)
        {
            int year = sc.nextInt();
            Leap y = new Leap(year);
            y.checkLeap();
        }
    }
}
class Leap{
    private int year;
    
    public Leap(int year)
    {
        this.year = year;
    }
    public void checkLeap()
    {
        if(year % 100 == 0)
        {
            if(year % 400 ==0)
            {
                System.out.println(this.year + " : Leap-year");
            }else{
                System.out.println(this.year + " : Non Leap-year");
            }
        }else if(year %4 == 0)
        {
            System.out.println(this.year + " : Leap-year");
        }else{
            System.out.println(this.year + " : Non Leap-year");
        }
    }
}