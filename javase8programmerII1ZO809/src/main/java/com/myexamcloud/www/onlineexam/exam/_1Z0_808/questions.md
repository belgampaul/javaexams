Topic : Working with Inheritance
================================
**Question 1 of 30:**
```
Given

 1.   interface A{
 2. 
 3.       int groupID = 10;
 4. 
 5.       default boolean equals(Object obj){
 6.           return this.groupID == ((A)obj).groupID;
 7.       } 
 8. 
 9.       static void print(){
 10.         System.out.println("A");
 11.     }
 12.} 
Which is true about above code? 

```

Select any one of given answer :
- Choice A Above code compiles fine
- Choice B Code fails to compile since interface can't has any non abstract method
- Choice C Compilation fails due to error at line 5
- Choice D Compilation fails due to error at line 6

Topic : Working with Selected classes from the Java API
=======================================================
**Question 2 of 30:**
```
Which of the following will print current date and time? 

```

Select any one of given answer :
- Choice A System.out.print(new LocalTime().now());
- Choice B System.out.print(new LocalTime());
- Choice C System.out.println(Instant.now());
- Choice D System.out.println(new Instant().now());
- Choice E None of above.

Topic : Working with Selected classes from the Java API
=======================================================
**Question 3 of 30:**
```
Code: 

 1.   import java.time.LocalDate;
 2.   import java.time.Period;
 3. 
 4.   public class MyExamCloudOCAJP8 {
 5.       public static void main(String[] args) {
 6.           LocalDate date = LocalDate.of(2015, 3, 24);
 7.           Period p = Period.ofDays(2);
 8.           System.out.println(date.plus(p));
 9.       }
 10.} 
What is the output? 

```

Select any one of given answer :
- Choice A 2015-04-26
- Choice B 2015-03-26
- Choice C 2015-02-27
- Choice D Compilation fails due to error at line 6
- Choice E Compilation fails due to error at line 8

Topic : Using Loop Constructs
=============================
**Question 4 of 30:**
```
Code: 

 1.   import java.util.ArrayList;
 2.   import java.util.List;
 3. 
 4.   public class MyExamCloudOCAJP8{
 5. 
 6.       public static void main(String[] args){
 7.           List<Integer> list = new ArrayList<Integer>();
 8.           list.add(1);
 9.           list.add(2);
 10.         list.add(3);
 11.         for(int x : list) {
 12.             System.out.print(x + " ");
 13.             break;
 14.         }
 15.     }
 16.} 
What is the output? 

```

Select any one of given answer :
- Choice A 123
- Choice B 12
- Choice C 1
- Choice D The code will not compile due to error at line 7
- Choice E The code will not compile due to error at line 11

Topic : Working with Inheritance
================================
**Question 5 of 30:**
```
Given

 1.   interface A{
 2. 
 3.       int groupID = 10;
 4. 
 5.       default boolean equals(Object obj){
 6.           return this.groupID == ((A)obj).groupID;
 7.       } 
 8. 
 9.       static void print(){
 10.         System.out.println("A");
 11.     }
 12.} 
Which is true about above code? 

```

Select any one of given answer :
- Choice A Above code compiles fine
- Choice B Code fails to compile since interface can't has any non abstract method
- Choice C Compilation fails due to error at line 5
- Choice D Compilation fails due to error at line 6

Topic : Creating and Using Arrays
=================================
**Question 6 of 30:**
```
Code: 

 1. public class MyExamCloudOCAJP8 {
 2. 
 3.     public static void main(String[] args){
 4.         Integer array[] = new Integer[0]; 
 5.         System.out.println(array[0]); 
 6.     }
 7. } 
What is the output? 

```

Select any one of given answer :
- Choice A 0
- Choice B Null
- Choice C NegativeArraySizeException
- Choice D ArrayIndexOutOfBoundsException
- Choice E Compilation fails.

Topic : Working with Methods and Encapsulation
==============================================
**Question 7 of 30:**
```
public void print(){
     System.out.println("default");
 } 
Which of the following correctly overload above method? 

```

Select any one of given answer :
- Choice A private int print(int x){ return x; }
- Choice B public String print(){ return "default"; }
- Choice C public abstract void print(){ System.out.println("default"); }
- Choice D void print(){ System.out.println("Non public"); }
- Choice E None of above

Topic : Working with Selected classes from the Java API
=======================================================
**Question 8 of 30:**
```
Consider following three statements 
 
 I.   Function interface should contain only one method. 
 II.  Function interface should contain only one method and it should be an abstract method. 
 III. Functional interface can have more than one method. 
 Which is/are true?
```

Select any one of given answer :
- Choice A Only I
- Choice B Only II
- Choice C Only III
- Choice D Only I and III
- Choice E Only II and III

Topic : Working With Java Data Types
====================================
**Question 9 of 30:**
```
Code: 

 1. public class MyExamCloudOCAJP8{
 2.     public static void main(String[] args){
 3.         int x = 3;
 4.         int y = ++x * 4 / x-- + --x;
 5.         System.out.println("y + x is " + (y + x));
 6.     }
 7. } 
What is the output? 

```

Select any one of given answer :
- Choice A y + x is 7
- Choice B y + x is 10
- Choice C y + x is 9
- Choice D y + x is 8
- Choice E Compilation fails

Topic : Working With Java Data Types
====================================
**Question 10 of 30:**
```
Code: 

 1. public class MyExamCloudOCAJP8 {
 2. 
 3.     static int y = 10;
 4. 
 5.     public static void main(String[] args){
 6.         int y;
 7.         System.out.println(y+MyExamCloudOCAJP8.y);
 8.     }
 9. } 
What is the output? 

```

Select any one of given answer :
- Choice A 10
- Choice B 11
- Choice C 20
- Choice D NullPointerException
- Choice E Compilation error

Topic : Working with Selected classes from the Java API
=======================================================
**Question 11 of 30:**
```
Code: 

 1.   public class MyExamCloudOCAJP8{
 2. 
 3.       public static void main(String[] args){
 4.           String str = "1Z0";
 5.           StringBuilder sb = new StringBuilder("-");
 6.           sb.append("808");
 7.           str.concat(sb.toString());
 8.           System.out.println(str);
 9.       }
 10.} 
Which is the output? 

```

Select any one of given answer :
- Choice A 1Z0
- Choice B 1Z0-808
- Choice C An exception will be thrown
- Choice D Compilation fails due to error at line 6
- Choice E Compilation fails due to error at line 7

Topic : Working With Java Data Types
====================================
**Question 12 of 30:**
```
Which of the following is valid identifier? 

```

Select any one of given answer :
- Choice A 2DPoint
- Choice B $ocajp
- Choice C new
- Choice D java@elabs
- Choice E $*coffee

Topic : Working with Inheritance
================================
**Question 13 of 30:**
```
Given

 1. public class MyExamCloudOCAJP8{
 2.     public static void main(String[] args){
 3.         Object numObj = new Integer(2);
 4.         String str = (String) numObj;
 5.         System.out.println(str);
 6. 
 7.     }
 8. } 
Which is true about above code? 

```

Select any one of given answer :
- Choice A 2
- Choice B Null
- Choice C ClassCastException
- Choice D IllegalArgumentException
- Choice E NumberFormatException

Topic : Working with Methods and Encapsulation
==============================================
**Question 14 of 30:**
```
Code: 

 1.   public class A {
 2. 
 3.       int y;
 4. 
 5.       public A(int x){
 6.           y = x;
 7.       }
 8. 
 9.       public void print(){
 10.         System.out.println(y);
 11.     }
 12. }
 13. 
 14. 
 15. public class B extends A{
 16.     //constructor for this class
 17. } 
Which of the following can be used as the constructor for the class B? 

```

Select any one of given answer :
- Choice A public B(){ super(); }
- Choice B public B(int x){ this(x); }
- Choice C public B(int x){ System.out.println(x); super(x); }
- Choice D public B(int x){ super(x); }
- Choice E public A(){ super(); }

Topic : Working with Selected classes from the Java API
=======================================================
**Question 15 of 30:**
```
Code: 

 1.   import java.time.LocalDate;
 2. 
 3.   public class MyExamCloudOCAJP8{
 4.       public static void main(String[] args) { 
 5.           LocalDate date = LocalDate.parse("2014-12-30");
 6.           date = date.plusDays(2);
 7.           date.plusHours(12);
 8.           System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
 9.       }
 10. } 
What is the output? 

```

Select any one of given answer :
- Choice A 2015 JANUARY 1
- Choice B 2015 JANUARY 2
- Choice C 2014 JANUARY 3
- Choice D An exception is thrown
- Choice E Compilation fails

Topic : Working With Java Data Types
====================================
**Question 16 of 30:**
```
Code: 

 1. public class MyExamCloudOCAJP8 {
 2.     public static void main(String[] args) {
 3.         Integer one, two;
 4.         one = new Integer(1);
 5.         two = new Integer(2);
 6.         one = two;
 7.         one = null;
 8.     }
 9. } 
At line 8, which of the following/s eligible for garbage collection? 

```

Select any one of given answer :
- Choice A 1 and 2
- Choice B 1 only
- Choice C 2 only
- Choice D None of above
- Choice E Compilation fails

Topic : Working with Selected classes from the Java API
=======================================================
**Question 17 of 30:**
```
Consider following interface
 
 interface Runnable{
     public void run();
 } 
 Which of the following will create instance of Runnable type?
```

Select any one of given answer :
- Choice A Runnable run = () -> System.out.println("1Z0-808");
- Choice B Runnable run = () -> { System.out.println("1Z0-808");}
- Choice C Runnable run = new () -> System.out.println("1Z0-808");
- Choice D Runnable run = > System.out.println("1Z0-808");
- Choice E None of above

Topic : Java Basics
===================
**Question 18 of 30:**
```
Which of the following is true about java source code files? 

```

Select any one of given answer :
- Choice A Each source file can contain only one class.
- Choice B The file name must match the class name including case, and have a .java extension.
- Choice C Each source file can contain only one public class.
- Choice D All of above.
- Choice E None of above.

Topic : Using Operators and Decision Constructs
===============================================
**Question 19 of 30:**
```
Code: 

 1.   public class MyExamCloudOCAJP8{
 2.       public static void main(String[] args){
 3.           String y = "Y";
 4.           final String n = "N";
 5.           String in = "y";
 6. 
 7.           switch(in.toUpperCase()){
 8.               case y : System.out.print("Yes"); 
 9.               case n : System.out.print("No");break;
 10.             default : System.out.print("Y/N");
 11.         }
 12.     }
 13.} 
What is the output? 

```

Select any one of given answer :
- Choice A Yes
- Choice B No
- Choice C YesNo
- Choice D Y/N
- Choice E The code will not compile due to error at line 8

Topic : Java Basics
===================
**Question 20 of 30:**
```
Which of the followings can be considered as enhancements in java 8?

I.   Support for the Lambda Expression.
II.  Multiple inheritances.
III. Default methods in abstract classes.
IV.  Date and Time API 

```

Select any one of given answer :
- Choice A Only I.
- Choice B Only III.
- Choice C Only I and II.
- Choice D Only I and IV.
- Choice E Only I, III and IV.

Topic : Handling Exceptions
===========================
**Question 21 of 30:**
```
Code: 

 public static void main(String[] args){
     Float number = Float.valueOf(args[0]);
 } 
Which of the following exceptions possible with above statement? 
[ Choose two ]
```

Select all correct answers :
- Choice A ParseException
- Choice B ArrayIndexOutOfBoundsException
- Choice C NumberFormatException
- Choice D IOException
- Choice E IllegalArgumentException

Topic : Working with Inheritance
================================
**Question 22 of 30:**
```
Code: 

 public interface A{
     void print();
 } 
Which of the following correctly override interface method A? 

```

Select any one of given answer :
- Choice A void print(){ System.out.println("A implemented"); }
- Choice B public void print(){ System.out.println("A implemented"); }
- Choice C String print(){ return "A implemented"; }
- Choice D public String print(){ return "A implemented"; }
- Choice E public abstract void print(){ System.out.println("A implemented"); }

Topic : Java Basics
===================
**Question 23 of 30:**
```
Which of the following can be use to run java code after compiling source code with file name, "MyFirst.java"? 

```

Select any one of given answer :
- Choice A javac MyFirst.class
- Choice B java MyFirst.class
- Choice C java MyFirst.java
- Choice D javac MyFirst
- Choice E java MyFirst

Topic : Java Basics
===================
**Question 24 of 30:**
```
Code: 

 1.   public class MyExamCloudOCAJP8 {
 2. 
 3.       public static void main(String[] a) {
 4. 
 5.           Integer arr[] = {1,2,3,4};
 6.           arr[1] = null; 
 7.           for(Integer a : arr){
 8.               System.out.print(a);
 9.           }
 10.     }
 11.} 
What is the output? 

```

Select any one of given answer :
- Choice A 1234
- Choice B 1024
- Choice C 1Null234
- Choice D 1 followed by a NullPointerException
- Choice E Compilation fails.

Topic : Working with Selected classes from the Java API
=======================================================
**Question 25 of 30:**
```
Given
 
 1.   public interface A<R> extends B{
 2.       static void method(){
 3.       }
 4.   }
 5.
 6.   public interface B<T> {
 7.       public void print(T t);
 8.
 9.       static void print(){
 10.     }
 11.  }
 12.
 13.    public interface C{
 14.     void methodC(String s);
 15.       }
 16.
 17.  public interface D<T> extends A,B,C{
 18.     default void printer(T t){
 19.     }
 20.    }   
 Which of the interfaces can be considered as functional interface/s?
```

Select any one of given answer :
- Choice A Only interface A.
- Choice B Only interface B.
- Choice C Only interfaces A and B.
- Choice D Only interfaces A, B and C.
- Choice E All four interface are functional interface

Topic : Working with Selected classes from the Java API
=======================================================
**Question 26 of 30:**
```
Code:
 
 1.   import java.util.ArrayList;
 2.   import java.util.List;
 3.
 4.   public class MyExamCloudOCAJP8{
 5.
 6.       public static void main(String[] args){
 7.           List<Integer> list = new ArrayList<>();
 8.           list.add(1); list.add(11);
 9.           list.add(30); list.add(9);
 10.         list.removeIf(e -> e%2 != 0);
 11.         System.out.println(list);
 12.     }
 13.} 
 Which is the output?
```

Select any one of given answer :
- Choice A [1, 11, 9]
- Choice B [30]
- Choice C []
- Choice D Compilation fails due to error at line 7.
- Choice E Compilation fails due to error at line 10.

Topic : Working with Methods and Encapsulation
==============================================
**Question 27 of 30:**
```
Code: 

 1. package epractizelabs;
 2. 
 3. public class A {
 4.     protected int y = 15;
 5. }


 6.   package elab;
 7. 
 8.   import epractizelabs.A;
 9. 
 10. public class B extends A{
 11.     int y = 10;
 12.     public void print(){
 13.         A a = new A();
 14.         System.out.println(a.y + y);
 15.     }
 16. } 
What is the output? 

```

Select any one of given answer :
- Choice A 20
- Choice B 25
- Choice C 30
- Choice D Compilation fails due to error at line 14
- Choice E Compilation fails due to multiple errors

Topic : Working With Java Data Types
====================================
**Question 28 of 30:**
```
Which of the following will convert following string to a primitive float? 

               String str = "1.2"; 

```

Select any one of given answer :
- Choice A Float.parseFloat(str);
- Choice B Float.valueOf(str);
- Choice C Float.value(str);
- Choice D Float.parse(str);
- Choice E None of above

Topic : Working with Selected classes from the Java API
=======================================================
**Question 29 of 30:**
```
"You have a list orders of PurchaseOrder objects, each with a date, a Customer and a state. You want filter list in various ways" 
 Which of the following in built functional interface you are going to use for above?
```

Select any one of given answer :
- Choice A UnaryOperator<T>
- Choice B Consumer<T>
- Choice C Supplier<T>
- Choice D Predicate<T>

Topic : Working with Inheritance
================================
**Question 30 of 30:**
```
Which of the following method can include in an interface? 

```

Select any one of given answer :
- Choice A static void print(){ System.out.println("interface"); }
- Choice B static abstract void print();
- Choice C default abstract void print();
- Choice D default string toString(){ return "a"; }
- Choice E None of above

