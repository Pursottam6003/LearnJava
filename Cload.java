class Cload
{
String pname;
int qty;
int price;
Cload (int prodqty,String prodname,int prodprice)
{
pname=prodname;
qty=prodqty;
price=prodprice;
}

Cload(int q,String p1name)
{
pname=p1name;
price=q;
qty=price/10;
}

Cload(String ppname,int pprice)
{
pname=ppname;
price=((int)(pprice-(0.1)));
}
void print()
{
System.out.println("Product Name : "+pname);
System.out.println("Quantity	  : "+qty);
System.out.println("Price	  : "+price);
}
public static void main(String args[])
{
Cload prods;
prods=new Cload(10,"Apples",10);
prods.print();
prods=new Cload(10,"Oranes");
prods.print();
prods=new Cload("Grapes",25);
prods.print();
}
}