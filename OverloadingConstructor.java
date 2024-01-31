class OverloadingConstructor{
int id;
String name;
int age;
public OverloadingConstructor(int x, String y) {id=x;name=y;}
public OverloadingConstructor(int x, String y, int z) {id=x;name=y;age=z;}
void show(){System.out.println(id+" "+name+" "+age);}
public static void main(String [] args)
{
OverloadingConstructor c1 = new OverloadingConstructor(132,"Md Shafiul Azam");
OverloadingConstructor c2 = new OverloadingConstructor(102,"Anayet",22);
c1.show();
c2.show();
}
}