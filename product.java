import java.util.Scanner;
class Details
{
int p_id;
String p_name;
int p_price;

void reads()
{
Scanner input  =new Scanner(System.in);
System.out.println("enter the product code:");
p_id=input.nextInt();
System.out.println("enter the product name:");
p_name=input.nextLine();
input.nextLine();
System.out.println("enter the product price:");
p_price=input.nextInt();
}
}
class Product
{
public static void main(String args[])
{
Details p1=new Details();
Details p2=new Details();
Details p3=new Details();
System.out.println("enter the details of product 1:");
p1.reads();
System.out.println("enter the details of product 2:");
p2.reads();
System.out.println("enter the details of product 3:");
p3.reads();

if(p1.p_price>p2.p_price)
{
if(p1.p_price>p3.p_price)
{
System.out.println("product 1 price is heighest"+p1.p_price);
}
else
{
System.out.println("product 3 price is heighest"+p3.p_price);
}
}
else
{
if(p2.p_price>p3.p_price)
{
System.out.println("product 2 price is heighest"+p2.p_price);
}
else
{
System.out.println("product 3 price is heighest"+p3.p_price);
}
}
}
}
                                                                                               1,1           Top
