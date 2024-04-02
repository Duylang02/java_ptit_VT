public class Main {
    public static void main(String[] srgs)
    {
        Divide tmp = new Divide();
        tmp.show();
    }
}
class Divide{

    public void show()
    {
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        int sum = 0;
        int p = 108;
        while(p<200)
        {
            System.out.println(p);
            sum +=p;
            p=p+9;
            
        }
        System.out.println(sum);
    }
}