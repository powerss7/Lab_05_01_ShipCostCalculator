public class Main
{
    public static void main(String[] args)
    {
        double Price = 150;
        double shippingTax = 0.02;

        if(Price >= 100)
            System.out.println("Your total price is " + (Price + (Price * 0.02)));
        else
            System.out.println("You get free shipping, your total price is " + Price);
    }
}