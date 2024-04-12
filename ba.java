interface cd 
{
static final int a=10;
public abstract void add(int x, int y);
}
class xy
{
void sub(int p, int q)
{
int r;
r=p-q;
System.out.println(r);
}
}
class ba extends xy implements cd
{
public void add(int x,int y)
{
int c;
c=x+y;
System.out.println(c);
}
public static void main(String[] args){
ba m=new ba();
m.add(2,2);
m.sub(4,2);
}
}


public class ba {
    public static void main(String[] args){
    ba m=new ba();
    ba m1=new ba();
    System.out.println(m);
    System.out.println(m1);
    System.out.println("using  tostring method of m: " + m.toString());
    System.out.println("using  hashcode method of m: " + m.hashCode());
    System.out.println("using  hashcode method of m: " + m1.hashCode());
    System.out.println("using  getClass method of m: " + m.getClass());
    System.out.println("using  equals method of m: " + m1.equals(m1));
    }
}


    