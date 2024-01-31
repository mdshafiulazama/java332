class ParameterConsructor{
int id;
String name;
public ParameterConsructor(int x, String y) {id=x;name=y;}
void show(){System.out.println(id+" "+name);}
public static void main(String [] args)
{
ParameterConsructor c1 = new ParameterConsructor(132,"Md Shafiul Azam");
ParameterConsructor c2 = new ParameterConsructor(124,"Faysal Ahmed");
c1.show();
c2.show();
}
}