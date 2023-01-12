import java.util.Scanner;
class Commission
{
    double sales ;
    Commission(double sales)
    {
        this.sales=sales;
    }

    double commission()
    {
        if(sales<500)
        return 0.02*sales;

        else if(sales>=500 && sales< 5000)
        return 0.05*sales;

        else 
        return 0.08*sales;
    }
}

class CommissionDemo
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the sales: SR");

        double sales =sc.nextDouble();

        if(sales>=0)
        {
            Commission c = new Commission(sales);
            System.out.println("The commission is SR: "+c.commission());
            sc.close();
        }

        else
        {
        System.out.println("Invalid Input");
        sc.close();
    }
    }
}