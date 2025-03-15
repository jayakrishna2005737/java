public class BillingSystem
{
    public static void main(String[] args)
    {
        int i;
        int[] customerid={101,102,103,104,105};
        String[] customername={"customer1","customer2","customer3","customer4","customer5"};
        String[] customervehicle={"bike","cycle","lorry","list","bus"};
        for(i=0;i<5;i++)
        {
            System.out.println(customername[i]);
            System.out.println(customervehicle[i]);
            System.out.println(customerid[i]);
        }
    }
}