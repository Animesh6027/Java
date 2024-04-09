abstract class pqr{
abstract void show();
abstract void display1();
void display(){
System.out.println("Hello");
}}
abstract class ab extends pqr{
void show(){
System.out.println("Java");
}}
class xyz extends ab{
void display1(){
System.out.println("xyz class");
}
public static void main(String[] args){
xyz m=new xyz();
m.show();
m.display();
m.display1();
}}