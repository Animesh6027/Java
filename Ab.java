// import java.util.*;
// class FirstJavaProgram {
//     public static void main(String args[]) {
//         System.out.println("India got independence in 1947");
//         int num1 = 5;
//         int num2 = 9;
//         int num3 = 17;
//         int Sum = num1 + num2 + num3;
//         System.out.println("Sum is: " + Sum);
        
//     }
// }  

// class Ab(){
//     public static void main(String[] args)
// }

// class Ab
// {
//     void Main()
//     {
//         System.out.println("Working");
//     }
//     public static void main(String args[]){
//         System.out.println("main function");

//         Main obj=new Main();
//         obj.mainain();
//     }
// }
// import java.util.*;

// class Ab {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         try (// int a=15;
//         Scanner b = new Scanner(System.in)) {
//             int a=b.nextInt();
//             if(a%2==0) {
//                 System.out.println("This number is even.");
//                 {
//                     if(a%8==0){
//                         System.out.println("This is divisible by 8");
//                     }else {
//                         System.out.println("Not divisible by 8");
//                     }
//                 } 
//              } else if(a%2!=0) {
//                     System.out.println("This number is odd.");
//                     {
//                         if(a%3==0){
//                             System.out.println("This is divisible by 3");
//                         }else {
//                             System.out.println("Not Divisible.");
//                         }
//                     }
//                 }
//         } 
//         }
//     }

// public class Output {
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int n = s.nextInt();
//         int[] a = new int[n];
//         int i = 0;
//         System.out.println("Enter elements: ");
//         for(int b:a){
//             a[i]=s.nextInt();
//             i++;
//         }
//         System.out.println("Enter searching element");
//         int search=s.nextInt();
//         boolean flag=false;
//         for(int b:a){
//             if(b==search){
//                 flag=true;
//                 break;
//             }
//         }
//         if(flag){
//             System.out.println("Successful");
//         }else{
//             System.out.println("Unsuccessful");
//         }
//     }
// }

// public class Ab {
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter no of rows for mat. A");
//         int ra=s.nextInt();
//         System.out.println("Enter no of cols for mat. A");
//         int ca=s.nextInt();
//         int[][] a=new int[ra][ca];
//         System.out.println("Enter elements: ");
//         for(int i=0;i<ra;i++){
//             for(int j=0;j<ca;j++){
//                 a[i][j]=s.nextInt();
//             }
//         }
//         System.out.println("Enter no of rows for mat B");
//         int rb=s.nextInt();
//         System.out.println("Enter no of cols for mat B");
//         int cb=s.nextInt();
//         int[][] b=new int[rb][cb];
//         System.out.println("Enter elements:");
//         for(int i=0;i<rb;i++){
//             for(int j=0;j<cb;j++){
//                 b[i][j]=s.nextInt();
//             }
//         }
//         int[][] c=new int[ra][cb];
//         for(int i=0;i<ra;i++){
//             for(int j=0;j<cb;j++){
//                 for(int k=0;k<ca;k++){
//                     c[i][j]+=a[i][k] * b[k][j];
//                 }
//             }
//         }
//         for(int[] p:c){
//             for (int x:p){
//                 System.out.println(x);
//             }
//         }
//         s.close();
//     }
// }


// public class Ab {
//     public static void main(String[] args){
//         String s1="abcd";
//         String s2="abcd";
//         String s3=new String("abcd");
//         String s4=new String("abcd");
//         System.out.println(s1==s2);
//         System.out.println(s3==s4);
//         System.out.println(s1.equals(s4));
//         System.out.println(s1.toUpperCase());
//         System.out.println(s2.toLowerCase());
//         String s6="HELLO";
//         String s7="forget";
//         System.out.println(s6.toLowerCase());
//     }
    
// }


// public class Ab {

//     public static void main(String[] args) {
//         StringBuilder s =new StringBuilder("hello");
//         System.out.println(s.capacity());
//         System.out.println(s.charAt( 1));
//         System.out.println(s.append(" java"));
//         System.out.println(s.insert( 1, " xyz"));
//         System.out.println(s.delete( 0, 2));
//         System.out.println(s.reverse());
//         System.out.println(s.replace( 0, 2, " pqr"));
//     }
// }

// import java.util.Scanner;

// public class Ab {

//     public static void main(String[] args){
//         int n=1000;
//         for(int i=1;i*i*i<=n;i++){
//            int r=i*i*i;
//             System.out.print(i + " ");
//         }
//     }
// }


// class base{
//     void add(int a, int b){
//         int c;
//         c=a+b;
//         System.out.println(c);
//     }
// }
// public class Ab extends base{
// void sub(int d,int e){
//     int f;
//     f=d-e;
//     System.out.println(f);
// }
// public static void main(String[] args){
//     Ab m = new Ab();
//     m.add(2,2);
//     m.sub(4,2);
// }
// }


// class base {
//     int a,b;
//     base(int x, int y){
//         a=x;
//         b=y;
//     }
//     void display(){
//         System.out.println(a + " " + b);
//     }
// }
// public class Ab extends base{
//     int num;
//     Ab(int x, int y, int z){
//         super(x,y);
//         num=z;
//         num=num+x+y;
//     }
//     void display(){
//         System.out.println(num);
//     }
//     public static void main(String[] args){
//         Ab m = new Ab();
//         m.display();
//     }
    
// }


// abstract class pqr{
//     abstract void show();
//     abstract void display1();
//     void display(){
//     System.out.println("Hello");
//     }}
//     abstract class ab extends pqr{
//     void show(){
//     System.out.println("Java");
//     }}
//     class xyz extends ab{
//     void display1(){
//     System.out.println("xyz class");
//     }
//     public static void main(String[] args){
//     xyz m=new xyz();
//     m.show();
//     m.display();
//     m.display1();
//     }}


// interface cd 
// {
// static final int a=10;
// public abstract void add(int x, int y);
// }
// class xy
// {
// void sub(int p, int q)
// {
// int r;
// r=p-q;
// System.out.println(r);
// }
// }
// class ab extends xy implements cd
// {
// public void add(int x, int y)
// {
// int c;
// c=x+y;
// System.out.println(c);
// }
// public static void main(String[] args){
// ab m=new ab();
// m.add(2,2);
// m.sub(4,2);
// }
// }

// interface pq {
//     public abstract void add();
//     }
//     interface xy {
//     public abstract void add();
//     }
//     class Ab implements pq,xy{
//     public void add(int x, int y){
//     int c;
//     c=x+y;
//     System.out.println(c);
//     }
//     public static void main(String[] args){
//     Ab m=new Ab();
//     m.add(2,2);
//     }
//     }

// interface abc {
//     default void show(){
//         System.out.println("abc interface");
//     }
// }
// interface def {
//     default void display() {
//         System.out.println("def interface");
//     }
// }
// class Ab implements abc, def {
//     void hello() {
//         System.out.println("xyz class");
//     }
//     public static void main(String[] args) {
//         Ab m=new Ab();
//         m.show();
//         m.display();
//         m.hello();
//     }
// }

// class abc{
// }
// class Ab extends abc{
//     public static void main(String[] args) {
//         abc x=new abc();
//         Ab  m= new Ab();
//         System.out.println(m instanceof Ab);
//         System.out.println(x instanceof abc);
//         System.out.println(m instanceof abc);
//         System.out.println(x instanceof Ab);
//     }
//     }

// Non-static class--------------------
// class Ab {
//     int a =10;
//     static int b=20;
//     private int c=30;
//     void outer() {
//         System.out.println("Outer class");
//     }
//     class inner {
//         void sum() {
//             int d;
//             d=a+b+c;
//             System.out.println(d);
//         }
//     }
//     public static void main(String[] args) {
//         Ab m=new Ab();
//         Ab.inner n=m.new inner();
//         n.sum();
//         m.outer();
//     }
// }

// Static class----------------
// class Ab {
//     static int a =10;
//     static int b=20;
//     static int c=30;
//     static class inner {
//         void sum() {
//             int d;
//             d=a+b+c;
//             System.out.print("The result is: ");
//             System.out.println(d);
//         }
//     }
//     public static void main(String[] args) {
//         Ab.inner n=new Ab.inner();
//         n.sum();
//     }
// }

// interface a{
//     void show();
// }
// class abc implements a {
//     public void show(){
//         System.out.println("Show function");
//     }
// }
// class Ab{
//     public static void main(String[] args) {
//         a m=new abc();
//         m.show();
//     }
// }

// Anonymous class----------------
// interface abc{
//     void show();
// }
// class Ab{
//     public static void main(String[] args) {
//         abc m=new abc()
//         {
//         public void show() {
//             System.out.println("Show function!");
//         }
//     };
//     m.show();
// }
// }


// abstract class abc{
//     abstract void show();
// }
// class Ab{
//     public static void main(String[] args) {
//         abc m=new abc()
//         {
//         public void show() {
//             System.out.println("Show function!");
//         }
//     };
//     m.show();
// }
// }


// Lambda Function-------------

// interface abc {
//     public void show();
// }
// public class Ab{
//     public static void main(String[] args) {
//         int width=10;
//         int length=10;
//         abc area=()->{  // here () represents the function--that there is some function/method is present
//             System.out.println(width*length);
//         };  // Here we use this semi-colon to close abc area (area is a reference to interface abc-- it is not an object)
//         area.show();
//     }
// }

// class Ab{
//     int x=10;
//     void show1(){
//         class localclass{
//             void show2(){
//                 System.out.println(x);
//             }
//         }
//         localclass b=new localclass();
//         b.show2();
//     }
//     public static void main(String[] args){ 
//         Ab obj=new Ab();
//         obj.show1();
//     }
// }

// interface Adable 
// {
// int add(int a,int b);
// }
// public class Ab{
// public static void main(String[] args){
// Adable ad1=(a,b)->(a+b);
// System.out.println(ad1.add(10,20));
// Adable ad2=(int a, int b)->(a*b);
// System.out.println(ad2.add(10,30));
// }
// }

// class A extends Thread
// {
// A(){
// super("user");
// }
// public void run(){
// try{
// for(int i=1;i<=5;i++){
// System.out.println((Thread.currentThread()).getName()+"thread here.");
// Thread.sleep(1000);
// }
// }
// catch(InterruptedException e){}
// }}
// public class Ab{
// public static void main(String[] args){
// A ta=new A();
// ta.start();
// try {
// for(int i=1;i<=5;i++){
// System.out.println((Thread.currentThread()).getName()+"thread here.");
// Thread.sleep(1000);
// }
// }
// catch(InterruptedException e){}
// }}

// class ab implements Runnable {
//     Thread t;
//     ab()
//     {
//     t=new Thread(this, "user");
//     t.start();
//     }
//     public void run(){
//     try
//     {
//     for(int i =1;i<=3;i++){
//     System.out.println((Thread.currentThread()).getName()+"thread here.");
//     Thread.sleep(1000);
//     }}
//     catch(Exception e){}
//     }}
//     class runnableInterface{
//     public static void main(String[] args){
//     ab ta=new ab();
//     try{
//     for(int i=0;i<=3;i++){
//     System.out.println((Thread.currentThread()).getName()+"thread here.");
//     Thread.sleep(1000);
//     }
//     }
//     catch(Exception e){}
//     }
//     }

// class Ab
// {
// public static void main(String[] args)
// {
// Runnable r=()->{
// for(int i=1;i<=3;i++){
// System.out.println(Thread.currentThread().getName()+"="+i);
// }
// };
// Thread t1=new Thread(r);
// Thread t2=new Thread(r);
// Thread t3=new Thread(r);
// t1.start();
// t2.start();
// t3.start();
// }
// }

// class Myexception extends Exception
// {
// public void MyException(int i){
// System.out.println("you "+i+" entered It exceeding the limit");
// }
// }
// public class Ab
// {
// public void show(int i) throws Myexception{
// if(i>100)
// throw new Myexception(i);
// else
// System.out.println(+i+" is less than 100 it is ok");
// }
// public static void main(String args[])
// {
// int i = Integer.parseInt(args[0]);
// int j=Integer.parseInt(args[1]);
// Ab t=new Ab();
// try
// {
// t.show(i);
// t.show(j);
// }
// catch(Myexception e)
// {
// //System.out.println("catched exception is" + e);
// }
// }
// }

// import java.io.*;
// class Ab{
// public static void main(String[] args){
// FileOutputStream file=null;
// byte b[]={'x','y','z'};
// try{
// file=new FileOutputStream("D:\\input.txt");
// file.write(b);
// file.close();
// }
// catch(Exception e)
// {
// System.out.println(e);
// }
// }
// }

// import java.io.*;

// public class Ab {
//     public static void main(String[] args) {
//         byte[] buf = {88, 66, 54, 69, 21};
//         ByteArrayInputStream barray = new ByteArrayInputStream(buf);
//         int b = 0;
//         while ((b = barray.read()) != -1) {
//             char ch = (char) b;
//             System.out.println("Char: " + ch);
//         }
//     }
// }
