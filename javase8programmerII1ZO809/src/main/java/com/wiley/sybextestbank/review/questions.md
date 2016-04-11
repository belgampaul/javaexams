Arithmetic Operations with rational numbers
===========================================
**30205**
```
Which are true statements about the following code? (Choose all that apply) 
 
 1: public class I { 
 2:  
 3:   int ii; 
 4:   public void i() { 
 5:   
 6:     for (int i = 0; i < 5; i++) { 
 7:    
 8:     } 
 9: } }
```


- 1 int j = i; can be inserted at line 2.
- 2 int j = i; can be inserted at line 5.
- 3 int j = i; can be inserted at line 7.
- 4 int j = ii; can be inserted at line 2.
- 5 int j = ii; can be inserted at line 5.
- 6 The code does not compile.

Answer: *3;5*

Arithmetic Operations with rational numbers
===========================================
**30190**
```
Given the following definitions, which of the following could be added to collection of type List<Whale>? (Choose all that apply) 
 
 public interface HasTail {}; 
 public class Mammal {} 
 public class Whale extends Mammal implements HasTail {} 
 public class Narwhal extends Whale {}
```


- 1 new HasTail()
- 2 new Mammal()
- 3 new Whale()
- 4 new Narwhal()
- 5 new Object()
- 6 null

Answer: *3;4;6*

Arithmetic Operations with rational numbers
===========================================
**30086**
```
Which of the following are true of the following code? (Choose all that apply) 
 
 1: public class Giraffe { 
 2:  public int height; 
 3:  public int getHeight() { 
 4:    return height; 
 5:  } 
 6:  public void setHeight(int height) { 
 7:    this.height = height; 
 8:  } 
 9: }
```


- 1 This class currently exhibits data encapsulation.
- 2 This class currently exhibits immutability.
- 3 Making line 2 private would exhibit data encapsulation.
- 4 Making line 2 private would exhibit immutability.
- 5 Making line 2 private and removing lines 6–8 would exhibit data encapsulation.
- 6 Making line 2 private and removing lines 6–8 would exhibit immutability

Answer: *3;5;6*

Arithmetic Operations with rational numbers
===========================================
**30121**
```
Which of the following are true statements? (Choose all that apply)
```


- 1 For a String, capacity would be a redundant property.
- 2 For a StringBuilder, capacity would be a redundant property.
- 3 An empty String has a length of zero.
- 4 An empty String has a length of one.
- 5 A StringBuilder's length is sometimes greater than its capacity.
- 6 A StringBuilder's length is never greater than its capacity.

Answer: *1;3;6*

Arithmetic Operations with rational numbers
===========================================
**30201**
```
The following code appears in a file named Flight.java. What is the result of compiling this source file? 
 
 1:  public class Flight {  
 2:      private FlightNumber number;  
 3:   
 4:      public Flight(FlightNumber number) {  
 5:          this.number = number;  
 6:      } } 
 7:  public class FlightNumber {  
 8:     public int value;  
 9:     public String code; }
```


- 1 The code compiles successfully and two bytecode files are generated: Flight.class and FlightNumber.class.
- 2 The code compiles successfully and one bytecode file is generated: Flight.class.
- 3 A compiler error occurs on line 2.
- 4 A compiler error occurs on line 4.
- 5 A compiler error occurs on line 7.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30050**
```
Which of the following are included as a result of this code? (Choose all that apply) 
 
 3: String s = "Hello"; 
 4: String t = new String(s); 
 5: if ("Hello".equal(s)) System.out.println("one"); 
 6: if (t == s) System.out.println("two"); 
 7: if (t.equal(s)) System.out.println("three"); 
 8: if ("Hello" == s) System.out.println("four"); 
 9: if ("Hello" == t) System.out.println("five");
```


- 1 one
- 2 two
- 3 three
- 4 four
- 5 five
- 6 The code does not compile.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30116**
```
What is the result of the following code snippet? 
 
 3: String tiger = "Tiger"; 
 4: String lion = "Lion"; 
 5: final String statement = 250 > 338 ? lion : tiger = " is Bigger"; 
 6: System.out.println(statement);
```


- 1 Tiger
- 2 Lion
- 3 Tiger is Bigger
- 4 Lion is Bigger
- 5 is Bigger
- 6 The code will not compile because of line 5.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30083**
```
What is the output of the following program? 
 
 1: public class Supper {  
 2:   public static void eat() throws IOException {  
 3:     try {  
 4:       System.out.print("1");  
 5:       throw new IOException();  
 6:     }catch(IOException e) {  
 7:       System.out.println("2");  
 8:       throw e;  
 9:     }finally {  
 10:       System.out.println("3");  
 11:     }  
 12:   }  
 13:   public static void main(String [] args) {  
 14:     eat();  
 15:     System.out.println("4");  
 16:   }  
 17: }
```


- 1 1234
- 2 12 and a stack trace for IOException
- 3 123 and a stack trace for IOException
- 4 1234 and a stack trace for IOException
- 5 The code does not compile.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30144**
```
Which of the following are supported by Java? (Choose all that apply)
```


- 1 Encapsulation
- 2 Indentation changing the meaning of code
- 3 Inheritance
- 4 Operator overloading
- 5 Platform independence
- 6 Pointers

Answer: *1;3;5*

Arithmetic Operations with rational numbers
===========================================
**30191**
```
What is the output of the following code? 
 
 LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33); 
 DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:MM"); 
 System.out.println(d.format(f));
```


- 1 11:05
- 2 11:22
- 3 22:05
- 4 22:33
- 5 The code does not compile.
- 6 A runtime exception is thrown.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30099**
```
Which of the following can fill in the blank to make this code compile? (Choose all that apply) 
 
 public class ExceptionLogger {  
   public static void logException(RuntimeException e) {  
     System.out.println("Logging " + e);  
   }  
   public static void main(String [] args) {  
     logException(new __________________);  
   }  
 } 
```


- 1 Error()
- 2 Exception()
- 3 java.io.IOException()
- 4 NullPointerException()
- 5 RuntimeException()

Answer: *4;5*

Arithmetic Operations with rational numbers
===========================================
**30068**
```
What is the result of the following code? 
 
 public class Letters { 
 { System.out.print("a"); } 
 public Letters() { 
   { System.out.print("b"); } 
 } 
 { System.out.print("c"); } 
 public static void main(String[] args) { 
   Letters a = new Letters(); 
   { System.out.print("d"); } 
 } }
```


- 1 abcd
- 2 acbd
- 3 bacd
- 4 bdac
- 5 dbad
- 6 The code does not compile.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30128**
```
What is the result of the following code snippet? 
 
 3: int x = 10; 
 4: switch(x % 4.) { 
 5:   default: System.out.print("Not divisible by 4"); 
 6:   case 0: System.out.print("Divisible by 4"); 
 7: }
```


- 1 Not divisible by 4
- 2 Divisible by 4
- 3 Not divisible by 4Divisible by 4
- 4 The code does not output any text.
- 5 The code will not compile because of line 4.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30225**
```
What could be the output of the following code given that e() could have any implementation? 
 
 public static void main(String[] args) { 
   System.out.print("a"); 
   try { 
     System.out.print("b"); 
     e(); 
   } 
   System.out.print("c"); 
 } 
 private static void e() { 
  // code omitted 
 }
```


- 1 a
- 2 ab
- 3 abc
- 4 abc followed by a stack trace
- 5 ab followed by a stack trace
- 6 None of the above; the code does not compile as is.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30216**
```
What is the result of the following code? 
 
 1: public class PrintIntegers { 
 2:   public static void main(String[] args) { 
 3:     int y = -2; 
 4:     do System.out.print(++y + " ");  
 5:     while(y <= 5); 
 6: } }
```


- 1 –2 –1 0 1 2 3 4 5
- 2 –2 –1 0 1 2 3 4
- 3 –1 0 1 2 3 4 5 6
- 4 –1 0 1 2 3 4 5
- 5 The code will not compile because of line 5.
- 6 The code contains an infinite loop and does not terminate.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30127**
```
Which lambda can replace the MySecret class? (Choose all that apply) 
 
 interface Secret { 
   String test(String a, String b); 
 } 
 
 class MySecret implements Secret { 
   public String test(String a, String b) { 
     return a + b; 
   } 
 }
```


- 1 caller((a, b) -> a + b);
- 2 caller((String a, b) -> a + b);
- 3 caller((String a, String b) -> a + b);
- 4 caller((a, b) , a + b);
- 5 caller((String a, b) , a + b);
- 6 caller((String a, String b) , a + b);

Answer: *1;3*

Arithmetic Operations with rational numbers
===========================================
**30078**
```
Suppose we have the following class named ShowDate. Which one of the following statements is true? 
 
 1:  import java.util.Date;  
 2:  public class ShowDate {  
 3:      public static void main(String [] args) {  
 4:          Date a = new Date();  
 5:          Date b = new Date();  
 6:          Date c = a;  
 7:          System.out.println(c.toString());  
 8:          a = null;  
 9:         c = null;  
 10:     } }
```


- 1 The Date object from line 4 is eligible for garbage collection immediately following line 6.
- 2 The Date object from line 4 is eligible for garbage collection immediately following line 8.
- 3 The Date object from line 4 is eligible for garbage collection immediately following line 9.
- 4 The code does not compile.
- 5 The code throws an exception.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30133**
```
Which of the following lines compile? (Choose all that apply) 
 
  11: StringBuilder s1 = new StringBuilder(); 
  12: StringBuilder s2 = new StringBuilder(5); 
  13: StringBuilder s3 = new StringBuilder(6.0); 
  14: StringBuilder s4 = new StringBuilder("b"); 
  15: StringBuilder s5 = new StringBuilder(false);
```


- 1 Line 11
- 2 Line 12
- 3 Line 13
- 4 Line 14
- 5 Line 15

Answer: *1;2;4*

Arithmetic Operations with rational numbers
===========================================
**30227**
```
Which methods will compile if inserted into Joey? (Choose all that apply) 
 
 class CanNotHopException extends Exception {} 
 class Kangaroo { 
   public void hop() throws CanNotHopException { } 
 } 
 class Joey extends Kangaroo { 
   // INSERT CODE HERE 
 }
```


- 1 public void hop() {}
- 2 public void hop() throws Exception {}
- 3 public void hop() throws CanNotHopException {}
- 4 public void hop() throws RuntimeException {}
- 5 None of these

Answer: *1;3;4*

Arithmetic Operations with rational numbers
===========================================
**30173**
```
Which of the following compile? (Choose all that apply)
```


- 1 public void swim(int... distance) {}
- 2 public void swim(int... distance, int time) {}
- 3 public void swim(int time, int... distance) {}
- 4 public void swim(int... distance, int,,, time) {}
- 5 public void swim(int time, ...int distance) {}

Answer: *1;3*

Arithmetic Operations with rational numbers
===========================================
**30137**
```
Which creates an object with the current hours, minutes, and seconds?
```


- 1 new LocalDate();
- 2 new LocalTime();
- 3 LocalDate.current();
- 4 LocalTime.current();
- 5 LocalDate.now();
- 6 LocalTime.now();

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30152**
```
What is the result of the following program? 
 
 1: public class Egret { 
 2:   private String color; 
 3:   public void Egret() { 
 4:   Egret("white"); 
 5:  } 
 6:  public void Egret(String color) { 
 7:    color = color; 
 8:  } 
 9: public static void main(String[] args) { 
 10:  Egret e = new Egret(); 
 11:  System.out.println("Color:" + e.color); 
 12: }}
```


- 1 Color:
- 2 Color:null
- 3 Color:White
- 4 Compiler error on line 4
- 5 Compiler error on line 10
- 6 Compiler error another line

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30219**
```
What is the result of the following code? 
 
 1:  public class MessageLogger { 
 2:    public static void log(String s) { 
 3:      System.out.print("s"); 
 4:    } 
 5:    public static void log(int i) { 
 6:      System.out.print("i"); 
 7:    } 
 8:    public static void log(double d) { 
 9:      System.out.print("d"); 
 10:   } 
 11:   public static void main(String[] args) { 
 12:     short s = 123; 
 13:     log(s); 
 14:     log(25.0); 
 15:     log("hello"); 
 16:   } }
```


- 1 dds
- 2 dis
- 3 ids
- 4 iis
- 5 The code does not compile.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30193**
```
What is the result of the following code? 
 
 4: String numbers = "2468"; 
 5: int total = 0; 
 6: total += numbers.indexOf("6"); 
 7: total += numbers.length(); 
 8: char ch = numbers.charAt(4); 
 9: System.out.println(total + " " + ch);
```


- 1 5 8
- 2 6 8
- 3 7 8
- 4 8 8
- 5 An exception is thrown.
- 6 The code does not compile.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30214**
```
What is the output of the following code? 
 
 1: public class Fish { 
 2:   private static String getColor() { return "Yellow"; } 
 3:   public static void main(String[] args) { 
 4:     new Pufferfish().printDescription(); 
 5:   } 
 6: } 
 7: class Pufferfish extends Fish { 
 8:   protected static String getColor() { return "Green"; } 
 9:    public void printDescription() { 
 10:    System.out.println(super.getColor()+","+this.getColor()+","+getColor()); 
 11:   } 
 12: }
```


- 1 Yellow,Green,Green
- 2 Yellow,Green,Yellow
- 3 Green,Yellow,Green
- 4 Green,Green,Green
- 5 The code will not compile because of line 8.
- 6 The code will not compile because of line 10.
- 7 The code compiles but throws an exception at runtime.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30075**
```
What is the output of the following snippet? 
 
 12: int a = 123; 
 13: int b = 0; 
 14: try { 
 15:   System.out.print(a / b); 
 16:   System.out.print("1"); 
 17: } catch (RuntimeException e) { 
 18:   System.out.print("2"); 
 19: } catch (ArithmeticException e) { 
 20:   System.out.print("3"); 
 21: } finally { 
 22:   System.out.print("4"); 
 23: }
```


- 1 14
- 2 2
- 3 24
- 4 3
- 5 34
- 6 The code does not compile.
- 7 An uncaught exception is thrown.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30148**
```
Which of the following statements can be inserted in the blank so that the code will compile successfully? (Choose all that apply) 
 
 public interface WalksOn4Legs {} 
 public abstract class Mammal { 
   public int numberOfOffspring; 
 } 
 public class Antelope extends Mammal implements WalksOn4Legs {} 
 public class ParkRanger { 
   public void noteNewOffspring(Mammal mammal) { mammal.numberOfOffspring++; } 
   public static void main(String[] args) { 
     new ParkRanger().noteNewOffspring(___________); 
   } 
 }
```


- 1 new Mammal()
- 2 new Antelope()
- 3 new WalksOn4Legs()
- 4 (Mammal)new Object()
- 5 (Mammal)new String()
- 6 null

Answer: *2;4;6*

Arithmetic Operations with rational numbers
===========================================
**30123**
```
What is the result of the following? 
 
 6: String[] lizards = {"iguana", "gecko"}; 
 7: List<String> list = Arrays.asList(lizards); 
 8: list.set(1, ""); 
 9: System.out.println(list);
```


- 1 [iguana]
- 2 [iguana, ]
- 3 [iguana, gecko]
- 4 An exception is thrown on line 8.
- 5 An exception is thrown on line 9.
- 6 The code does not compile.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30059**
```
Which of the following are true? (Choose all that apply)
```


- 1 All String literals are automatically instantiated into a String object.
- 2 The StringBuilder and StringBuffer classes define the same public methods.
- 3 A StringBuilder object is immutable.
- 4 A StringBuilder object cannot change its length once it is instantiated.
- 5 A String object cannot change its length once it is instantiated.

Answer: *1;2;5*

Arithmetic Operations with rational numbers
===========================================
**30108**
```
What is the result of this code? 
 
 public class HowMany { 
   public int add(int one, int two) { 
     return one + two; 
   } 
   public static void main(String[] args) { 
     HowMany h = new HowMany(); 
     int result = h.add(2, 3); 
     System.out.println(result); 
   } 
 }
```


- 1 2
- 2 3
- 3 5
- 4 The code does not compile.
- 5 An exception is thrown.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30179**
```
What is the output when new PrayingMantis("green") is called? 
 
 1: abstract class Insect { 
 2:   public Insect(int age) { System.out.println("1"); } 
 3:   public Insect(String color) { this(5); System.out.println("2"); } 
 4: } 
 5: public class PrayingMantis extends Insect { 
 6:   public PrayingMantis(String color) { 
 7:     System.out.println("3"); 
 8: } 
 9: }
```


- 1 123
- 2 13
- 3 The code will not compile because of line 1.
- 4 The code will not compile because of line 3.
- 5 The code will not compile because of line 7.
- 6 The code compiles but throws an exception at runtime.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30053**
```
What is the result of the following code? 
 
 3: StringBuilder b = new StringBuilder(); 
 4: b.append("maybe").insert(2, "sh").insert(5, "xy"); 
 5: System.out.println(b.toString());
```


- 1 mashyxybe
- 2 mashybexy
- 3 mayshbxye
- 4 mayshxybe
- 5 An exception is thrown.
- 6 The code does not compile.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30170**
```
What is the result of the following code snippet? 
 
 3: int x = 10 % 2 + 1; 
 4: switch(x) { 
 5:   case: 0 System.out.print("Too High"); break; 
 6:   case: 1 System.out.print("Just Right"); break; 
 7:   default: System.out.print("Too Low"); 
 8: }
```


- 1 Too High
- 2 Just Right
- 3 Too Low
- 4 JustRightTooLow
- 5 The code will not compile because of line 3.
- 6 The code will not compile because of lines 5 and 6.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30164**
```
What is the result of the following? 
 
 3: int[] times [] = new int[3][3]; 
 4: for (int i = 0; i < times.length; i++)  
 5:   for (int j = 0; j < times.length; j++)  
 6:       times[i, j] = i*j; 
 7:     System.out.println(times[2, 2]);
```


- 1 1
- 2 4
- 3 1 printed 4 times
- 4 4 printed 3 times
- 5 An exception is thrown.
- 6 The code fails to compile because of line 3.
- 7 The code fails to compile for another reason.

Answer: *7*

Arithmetic Operations with rational numbers
===========================================
**30195**
```
Given the following two classes, which of the following statements will compile when inserted on line 2? (Choose all that apply) 
 
 1: package lilypad; 
 2: public class Frog {  } 
 
 1: package lilypad; 
 2:  // INSERT CODE HERE 
 3: public class Tadpole { 
 4:   private Frog parent; 
 5: }
```


- 1 import Frog;
- 2 import lilypad.Frog;
- 3 import lilypad.Tadpole;
- 4 import static lilypad.Tadpole;
- 5 static import lilypad.Tadpole;
- 6 The code compiles without any code additions.

Answer: *2;3;6*

Arithmetic Operations with rational numbers
===========================================
**30066**
```
Which exception will the following throw? 
 
 int[] nums = new int[] { 1, 4, 6}; 
 Object p = nums; 
 String[] two = (String[]) p; 
 System.out.println(two[two.length]);
```


- 1 ArrayIndexOutOfBoundsException
- 2 ClassCastException
- 3 IllegalArgumentException
- 4 NumberFormatException
- 5 None of the above

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30149**
```
What is the result of this code? 
 
 class Toy{  
   private boolean containsIce = false; 
   public boolean containsIce() { 
     return containsIce; 
   } 
   public void removeIce() { 
     this.containsIce = true; 
   } 
 } 
 public class Otter { 
   private static void play(Toy toy) { 
     toy.removeIce(); 
   } 
   public static void main(String[] args) { 
     Toy toy = new Toy(); 
     Otter.play(toy); 
     System.out.println(toy.containsIce()); 
   } 
 }
```


- 1 false
- 2 true
- 3 There is one compiler error.
- 4 There are two compiler errors.
- 5 There are three compiler errors.
- 6 An exception is thrown.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30162**
```
What is the result of the following code? 
 
 1: public class DoubleLoopSample { 
 2:   public static void main(String[] args) { 
 3:     char c = 'a'; 
 4:     for(int i=1; i<= 3; i++) 
 5:       for(int j=0; j<= 2; j++) System.out.print(c++); 
 6: } }
```


- 1 abcdefghi
- 2 bcdefghij
- 3 abcdef
- 4 abcabcabc
- 5 The code will not compile.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30146**
```
What is the result of the following code assuming garbage collection runs on line 6? 
 
 1: public class Caterpillar { 
 2:  public static void main(String[] args) { 
 3:    Caterpillar c1 = new Caterpillar(); 
 4:    Caterpillar c2 = new Caterpillar(); 
 5:    c1 = c2;  c2 = null; 
 6:    // garbage collection runs 
 7:    c1 = null; 
 8:  } 
 9:  protected void finalize(Object obj) { 
 10:    System.out.println("becomes a butterfly"); 
 11:  } }
```


- 1 "becomes a butterfly" is never printed.
- 2 "becomes a butterfly" is printed exactly once.
- 3 "becomes a butterfly" is printed exactly twice.
- 4 The code fails compilation on line 3.
- 5 The code fails compilation on line 9.
- 6 The code fails compilation on another line.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30163**
```
What is the output of the following code? 
 
 LocalDate d = LocalDate.of(2015, 5); 
 Period p = Period.of(1, 2, 3); 
 d = d.minus(p); 
 DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); 
 System.out.println(f.format(d));
```


- 1 3/7/14 11:22 AM
- 2 6/7/14 11:22 AM
- 3 5/10/15 11:22 AM
- 4 6/10/15 11:22 AM
- 5 The code does not compile.
- 6 A runtime exception is thrown.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30158**
```
What is the result of the following code? 
 
 public class Lion { 
   Lion l = new Lion(); 
   static void public main(String[] args) { 
     new Lion(); 
   } 
   public void roar() { 
     Lion l = new Lion(); 
     if ( l == l) { 
       System.out.println("roar!"); 
     } } }
```


- 1 Outputs nothing
- 2 Outputs roar!
- 3 The program never terminates.
- 4 The code does not compile.
- 5 The code throws an exception.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30184**
```
Which of the following are ordered from smallest to largest? (Choose all that apply)
```


- 1 byte, int, short, long
- 2 byte, short, int, long
- 3 short, byte, int, long
- 4 short, int, byte, long
- 5 double, float
- 6 float, double

Answer: *2;6*

Arithmetic Operations with rational numbers
===========================================
**30112**
```
Which of the following are true? (Choose all that apply) 
 
 StringBuilder b = new StringBuilder("1"); 
 StringBuilder c = b.append("2"); 
 b.append("234"); 
 c.deleteCharAt(1); 
 System.out.println("Equals? " + (b == c)); 
 System.out.println("B=" + b); 
 System.out.println("C=" + c);
```


- 1 The output contains Equals? true.
- 2 The output contains Equals? false.
- 3 The output contains B=1234.
- 4 The output contains B=234.
- 5 The output contains C=1234.
- 6 The output contains C=2.
- 7 The code does not compile.

Answer: *1;3;5*

Arithmetic Operations with rational numbers
===========================================
**30056**
```
Which methods will compile if inserted into Joey? (Choose all that apply) 
 
 class Kangaroo { 
   public void hop() { } 
 } 
 class Joey extends Kangaroo { 
   // INSERT CODE HERE 
 }
```


- 1 public void hop() {}
- 2 public void hop() throws Exception {}
- 3 public void hop() throws IOException {}
- 4 public void hop() throws RuntimeException {}
- 5 None of these

Answer: *1;4*

Arithmetic Operations with rational numbers
===========================================
**30174**
```
What is the result of the following class? 
 
 1: import java.util.function.*; 
 2:  
 3: public class Panda { 
 4:   int age; 
 5:   public static void main(String[] args) { 
 6:     Panda p1 = new Panda(); 
 7:     p1.age = 1; 
 8:     check(p1, p -> {p.age < 5}); 
 9:   } 
 10:   private static void check(Panda panda, Predicate<Panda> pred) { 
 11:     String result = pred.test(panda) ? "match" : "not match";  
 12:     System.out.print(result); 
 13: } }
```


- 1 match
- 2 not match
- 3 Compiler error on line 8
- 4 Compiler error on line 10
- 5 Compile error on line 11
- 6 A runtime exception is thrown.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30177**
```
Which of these lines compile? (Choose all that apply) 
 
 1: public class Rich { 
 2: public void money() { 
 3:   int _million = 1_000_000; 
 4:   double aThousand = 1_000_.00; 
 5:   double 100 = 100; 
 6:   int hundred = 100.00; 
 7:   float ten = 10d; 
 8:   short one = 1; 
 9: } }
```


- 1 3
- 2 4
- 3 5
- 4 6
- 5 7
- 6 8

Answer: *1;6*

Arithmetic Operations with rational numbers
===========================================
**30104**
```
What is the result of compiling this class? 
 
 1: public class Frog { 
 2:   public int Frog() { return 0; } 
 3:   private List<Integer> legs; 
 4:   public Frog() { 
 5:     legs = new ArrayList<Integer>(); 
 6:      for (int i = 0; i < 4; i++) { 
 7:       legs.add(i); 
 8:  } } }
```


- 1 The code compiles successfully.
- 2 The first compiler error occurs on line 2.
- 3 The first compiler error occurs on line 3.
- 4 The first compiler error occurs on line 4.
- 5 The first compiler error occurs on line 5.
- 6 The first compiler error occurs on line 6.
- 7 The first compiler error occurs on line 7.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30161**
```
What is the output of the following code? 
 
 1: interface CanClimb { int maxHeight(); } 
 2: interface HasClaws { boolean isSharp(); } 
 3: public class Koala implements CanClimb, HasClaws { 
 4:   public boolean isSharp() { return true; } 
 5:   public int maxHeight() { return 15; } 
 6:   public static void main(String[] args) { 
 7:     Object koala = new Koala(); 
 8:     CanClimb canClimb = (CanClimb)koala; 
 9:     HasClaws hasClaws = (HasClaws)canClimb; 
 10:     System.out.print(canClimb.maxHeight()); 
 11:     System.out.print(hasClaws.isSharp()); 
 12:   } 
 13: }
```


- 1 true15
- 2 15true
- 3 The code will not compile because of line 7.
- 4 The code will not compile because of line 8.
- 5 The code will not compile because of line 9.
- 6 The code compiles but throws an exception at runtime.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30183**
```
What is the result of compiling the following code? (Choose all that apply) 
 
 1: abstract class Mammal { 
 2:   public abstract int getAge(); 
 3: } 
 4: abstract class Animal { 
 5:   public int getAge(); 
 6: } 
 7: abstract interface Herbivore {} 
 8: public class HoneyBadger extends Mammal, Animal implements Herbivore { 
 9:   int getAge() { return 5; } 
 10: }
```


- 1 The code compiles without issue.
- 2 The code will not compile because of line 2.
- 3 The code will not compile because of line 5.
- 4 The code will not compile because of line 8.
- 5 The code will not compile because of line 9.
- 6 The code compiles but throws an exception at runtime.

Answer: *3;4;5*

Arithmetic Operations with rational numbers
===========================================
**30135**
```
What is the result of the following code snippet? 
 
 3: for(int i=0; i<5; i++) { 
 4:   System.out.print(1); 
 5:   if(i<2) continue; 
 6:   else break; 
 7: }
```


- 1 1
- 2 11
- 3 111
- 4 1111
- 5 11111
- 6 The code produces no output.
- 7 The code will not compile because of line 5.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30199**
```
Which of the following are true statements? (Choose all that apply)
```


- 1 Garbage collection runs when System.gc() is called.
- 2 finalize() is called if an object is garbage collected.
- 3 finalize() is always called on an object.
- 4 finalize() can be called twice on the same object.
- 5 finalize() can be called twice for the same class.

Answer: *2;5*

Arithmetic Operations with rational numbers
===========================================
**30114**
```
What is the result of the following code snippet? 
 
 3: int x = 4; 
 4: if(x <= 5 ^ x == 4) 
 5:   System.out.print("Low"); 
 6: else if(x==4)  
 7:   System.out.print("Match"); 
 8:   if(x>1) System.out.print("High");
```


- 1 Low
- 2 Match
- 3 High
- 4 LowHigh
- 5 MatchHigh
- 6 The code will not compile because of line 4.
- 7 The code will not compile because of line 8.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30160**
```
When does the String object instantiated on line 3 become eligible for garbage collection? 
 
 1:  public class ReturnDemo { 
 2:   public static String getName() { 
 3:     String temp = new String("Jane Doe"); 
 4:     return temp; 
 5:  } 
 6:  public static void main(String [] args) { 
 7:   String result; 
 8:   result = getName(); 
 9:   System.out.println(result); 
 10:    result = null; 
 11:    System.gc(); 
 12:  }  
 13: } 
```


- 1 Immediately after line 4
- 2 Immediately after line 5
- 3 Immediately after line 9
- 4 Immediately after line 10
- 5 Immediately after line 11
- 6 Immediately after line 12
- 7 The code does not compile.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30106**
```
Which of the following are true about the enhanced for loop? (Choose all that apply)
```


- 1 The terms must be compile-time constant values.
- 2 Can be used to iterate over arrays
- 3 Can be used to iterate over List objects
- 4 The data type of the reference on the left-hand side must exactly match the data type of the elements on the right-hand side.
- 5 Allows access to the built-in counter of the current loop position

Answer: *2;3*

Arithmetic Operations with rational numbers
===========================================
**30189**
```
Given the following code, which of the statements are true? (Choose all that apply) 
 
 1: package animal; 
 2: public class Frog { 
 3:   ______ void ribbit() { } 
 4: } 
 
 1: package _____; 
 2: import animal.*; 
 3: public class Tadpole extends Frog { 
 4:   public static void main(String[] args) { 
 5:     Tadpole t = new Tadpole(); 
 6:     t.ribbit(); 
 11:   } }
```


- 1 If Tadpole is in package animal, t.ribbit() will compile if given default access.
- 2 If Tadpole is in package animal, t.ribbit() will compile if given protected access.
- 3 If Tadpole is in package animal, t.ribbit() will compile if given private access.
- 4 If Tadpole is in package baby, t.ribbit() will compile if given default access.
- 5 If Tadpole is in package baby, t.ribbit() will compile if given protected access.
- 6 If Tadpole is in package baby, t.ribbit() will compile if given private access.

Answer: *1;2;5*

Arithmetic Operations with rational numbers
===========================================
**30132**
```
Which of the following lists is a correct sequence for catching exceptions? (Choose all that apply)
```


- 1 ArrayIndexOutOfBoundsException, IOException, RuntimeException
- 2 ArrayIndexOutOfBoundsException, Exception, IOException
- 3 Exception, IOException, ArrayIndexOutOfBoundsException
- 4 Exception, ArrayIndexOutOfBoundsException,  IOException
- 5 IOException, RuntimeException, ArrayIndexOutOfBoundsException
- 6 IOException, ArrayIndexOutOfBoundsException, Exception

Answer: *1;6*

Arithmetic Operations with rational numbers
===========================================
**30091**
```
What is the result of the following program? 
 
 1: public class Egret { 
 2:  private String color; 
 3:  public Egret(String color) { 
 4:    color = color; 
 5:  } 
 6:  public static void main(String[] args) { 
 7:  Egret e = new Egret(); 
 8:   System.out.println("Color:" + e.color); 
 9: } }
```


- 1 Color:
- 2 Color:null
- 3 Color:White
- 4 Compiler error on line 4
- 5 Compiler error on line 7
- 6 Compiler error another line

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30203**
```
Which statements are true for a traditional try statement (not a try-with-resources statement)? (Choose all that apply)
```


- 1 If a try statement has a catch clause, it is required to have a finally clause.
- 2 If a try statement does not have a catch clause, it is required to have a finally clause.
- 3 If a try statement has a finally clause, it is required to have exactly one catch clause.
- 4 If a try statement has a finally clause, it is required to have at least one catch clause.
- 5 A try statement can exist without a catch or finally clause.
- 6 A try statement can have both a catch and a finally clause.

Answer: *2;6*

Arithmetic Operations with rational numbers
===========================================
**30100**
```
What could be the output of the following code given that e() could be left with a blank implementation or have a one-line implementation that throws any type of exception? 
 
 public static void main(String[] args) { 
   System.out.print("a"); 
   try { 
     System.out.print("b"); 
     e(); 
   } finally { 
     System.out.print("c");  
   } 
   System.out.print("d"); 
 } 
 private static void e() { 
  // code omitted 
 }
```


- 1 ab
- 2 abc
- 3 abd
- 4 abcd
- 5 abc followed by a stack trace
- 6 None of the above; the code does not compile as is.

Answer: *4;5*

Arithmetic Operations with rational numbers
===========================================
**30087**
```
What is the output of the following code? 
 
 LocalDate date = LocalDate.of(2018, Month.APRIL, 30).plusMonths(-1) 
                           .plusYears(20); 
 System.out.println(date.getYear() + " " + date.getMonth() + " " 
                    + date.getDayOfMonth()); 
   
```


- 1 2018 MARCH 30
- 2 2018 APRIL 30
- 3 2018 MAY 30
- 4 2038 MARCH 30
- 5 2038 APRIL 30
- 6 2038 MAY 30

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30138**
```
Which statements are true? (Choose all that apply)
```


- 1 If a try block contains System.exit(0), the finally block will run.
- 2 If a try block contains System.exit(0), the finally block will not run.
- 3 If a catch block contains System.exit(0), the finally block will run.
- 4 If a catch block contains System.exit(0), the finally block will not run.
- 5 A try block will not compile containing System.exit(0).

Answer: *2;4*

Arithmetic Operations with rational numbers
===========================================
**30092**
```
The following code appears in a file named Plant.java. What is the result of compiling this source file? 
 
     1:  public class Plant { 
     2:    public boolean flowering; 
     3:    public Leaf [] leaves;  
     4:  } 
     5:  class Leaf { 
     6:    public String color; 
     7:    public int length; }
```


- 1 The code compiles successfully and two bytecode files are generated: Plant.class and Leaf.class.
- 2 The code compiles successfully and one bytecode file is generated: Plant.class.
- 3 A compiler error occurs on line 1.
- 4 A compiler error occurs on line 3.
- 5 A compiler error occurs on line 5.
- 6 A compiler error occurs on another line.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30175**
```
Given the following code, which statements are true? (Choose all that apply) 
 
 import static java.lang.System.out; 
 class Flower { } 
 public class Bee { 
   void pollinate(Flower flower) { out.println(1); } 
   void pollinate(Flower... flower) { out.println(2); } 
   void pollinate(int... numFlowers) {  out.println(3); } 
   void pollinate(Integer numFlowers) { out.println(4); } 
   void pollinate(String s) { out.println(5); } 
   void pollinate(Object obj) { out.println(6); } 
 }
```


- 1 Calling pollinate(new Flower()) prints 1.
- 2 Calling pollinate(new Flower()) prints 2.
- 3 Calling pollinate(1)) prints 3.
- 4 Calling pollinate(1)) prints 4.
- 5 Calling pollinate("flower")) prints 5.
- 6 Calling pollinate("flower")) prints 6.

Answer: *1;4;5*

Arithmetic Operations with rational numbers
===========================================
**30097**
```
What is the output of the following code? 
 
 1: interface HasHindLegs { 
 2:   int getLegLength(); 
 3: } 
 4: interface CanHop extends HasHindLegs { 
 5:   public void hop(); 
 6: } 
 7: public class Rabbit implements CanHop { 
 8:   int getLegLength() { return 5; } 
 9:   public void hop() { System.out.println("Hop"); } 
 10:   public static void main(String[] args) { 
 11:    new Rabbit().hop(); 
 12:  } 
 13: }
```


- 1 Hop
- 2 No output
- 3 The code will not compile because of line 4.
- 4 The code will not compile because of line 7.
- 5 The code will not compile because of line 8.
- 6 The code compiles but throws an exception at runtime.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30168**
```
Which of the following lambda expressions can be passed to a function of Predicate<String> type? (Choose all that apply)
```


- 1 check(s -> s.isEmpty());
- 2 check(s --> s.isEmpty());
- 3 check((String s) -> s.isEmpty());
- 4 check((String s) --> s.isEmpty());
- 5 check((StringBuilder s) -> s.isEmpty());
- 6 check((StringBuilder s) --> s.isEmpty());

Answer: *1;3*

Arithmetic Operations with rational numbers
===========================================
**30172**
```
Which of the following compile? (Choose all that apply)
```


- 1 List<Integer> l1 = new ArrayList();
- 2 List<Integer> l2 = new ArrayList<>();
- 3 List<Integer> l3 = new ArrayList<Integer>();
- 4 List<> l4 = new ArrayList<Integer>();
- 5 List<Integer> l5 = new List<Integer>();
- 6 ArrayList<int> l6 = new List<int>();

Answer: *1;2;3*

Arithmetic Operations with rational numbers
===========================================
**30210**
```
Which of the following can fill in the blank to make the code compile? (Choose all that apply) 
 
 class LimpException extends Exception{} 
 class HurtException extends LimpException{} 
 public void run() { 
   try { 
     split(); 
   }catch(HurtException e) { 
 
   } catch(____________ e) { 
   } 
 } 
 private void split() throws HurtException {}
```


- 1 Exception
- 2 HurtException
- 3 IOException
- 4 LimpException
- 5 RuntimeException

Answer: *1;5*

Arithmetic Operations with rational numbers
===========================================
**30155**
```
What is the result of compiling the following code? 
 
 1: interface CanSwim { 
 2:   public static int SPEED; 
 3:   public void swim(); 
 4: } 
 5: public class MantaRay implements CanSwim { 
 6:   public void swim() { System.out.println("MantaRay is swimming: "+SPEED); } 
 7: }
```


- 1 The code compiles without issue.
- 2 The code will not compile because of line 2.
- 3 The code will not compile because of line 3.
- 4 The code will not compile because of line 5.
- 5 The code will not compile because of line 6.
- 6 The code compiles but throws an exception at runtime.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30057**
```
What is the output when new BlackRhino() is called? 
 
 public class Rhinoceros { 
   public Rhinoceros() { System.out.print("1"); } 
 } 
 public class BlackRhino extends Rhinoceros { 
   public BlackRhino(int age) { System.out.print("2"); } 
   public BlackRhino() { 
     this(5); 
     System.out.print("3"); 
  } 
 }
```


- 1 123
- 2 132
- 3 12
- 4 13
- 5 This code does not compile.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30224**
```
What is the result of the following code? (Choose all that apply) 
 
 1:   class Sparrow extends Bird { } 
 2:   public abstract class Bird { 
 3:   public static void main(String[] args) { 
 4:   Bird b = new Sparrow(); 
 5:   Sparrow s = new Sparrow(); 
 6:   if (b == s) {   System.out.println("=="); } 
 7:   if (b.equals(s)) { 
 8:   System.out.println("bird"); 
 9:   Sparrow s1 = new Sparrow();  
 10:  } 
 11:  if (b.equals(s1)) 
 12:  System.out.println("sparrow"); 
 13:  } }
```


- 1 Nothing is output.
- 2 ==
- 3 bird
- 4 sparrows
- 5 The code does not compile.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30157**
```
How many of the following lines give a compiler error? 
 
 1: public class _C { 
 2:  String s = null; 
 3:  static int 123; 
 4:  void char = 'a'; 
 5:  byte b1 = 2; 
 6:  int c1$ = b1; 
 7:  short s1 = c1$; 
 8:  long e_2 = c1$; }
```


- 1 1
- 2 2
- 3 3
- 4 4
- 5 5

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30084**
```
What is the output of the following code? 
 
 LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33); 
 Period p = Period.of(1, 2, 3); 
 d = d.minus(p); 
 DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); 
 System.out.println(d.format(f));
```


- 1 3/7/14 11:22 AM
- 2 6/7/14 11:22 AM
- 3 5/10/15 11:22 AM
- 4 6/10/15 11:22 AM
- 5 The code does not compile.
- 6 A runtime exception is thrown.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30058**
```
Suppose we have the following classes named InventoryItem and Order. Which one of the following statements inserted at line 2 of the Order class will make the Order class compile successfully? 
 
 1:  package com.abc.products;  
 2:  public class InventoryItem { } 
 
 1:  package com.abc.orders;  
 2:  // INSERT CODE HERE 
 3:  public class Order {  
 4:      InventoryItem [] items;  }
```


- 1 import com.abc.products;
- 2 import com.abc.products.*;
- 3 import static com.abc.products;
- 4 import com.abc.products.InventoryItem.*;
- 5 Nothing; the class compiles as is.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30134**
```
Which of the following can fill in the blank on line 5 to make the code compile? (Choose all that apply) 
 
 1: package x.y; 
 2: public class Movie { 
 3:   private String title; 
 4:   protected String rating; 
 5:   int length; 
 6:   public String description; 
 7: } 
 
 1: package x.y; 
 2: public class MovieTheater { 
 3:   private Movie movie = new Movie(); 
 4:   public MovieTheater() { 
 5:     _________________________ 
 6: } }
```


- 1 movie.title = "Office Space";
- 2 movie.rating = "R";
- 3 movie.length = 89;
- 4 movie.description = "Comedy";
- 5 None of the above

Answer: *2;3;4*

Arithmetic Operations with rational numbers
===========================================
**30067**
```
What is the output of the following code? (Choose all that apply) 
 
 1: class Car { 
 2:   public int velocity = 10; 
 3: } 
 
 1: public class TestDrive { 
 2:   public static void go(Car c) { 
 3:    c.velocity += 10; 
 4:   } 
 5:   public static void main(String[] args) { 
 6:     Car porsche = new Car(); 
 7:     go(porsche); 
 8:  
 9:     Car stolen = porsche; 
 10:    go(stolen); 
 11: 
 12:    System.out.println(porsche.velocity); 
 13:   } 
 14: }
```


- 1 0
- 2 10
- 3 20
- 4 30
- 5 40
- 6 The code does not compile.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30185**
```
What is the output of the following code snippet? 
 
 3: int j = 1; 
 4: for(int i=0; i<4 && j<3; ++i) { 
 5:   ++j; 
 6:   System.out.print(i+j); 
 7: }
```


- 1 0213
- 2 24
- 3 6
- 4 13
- 5 The code will not compile because of line 4.
- 6 The code contains an infinite loop and does not terminate.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30096**
```
Which is the result of the following? 
 
 14: List<String> numbers = new ArrayList<>(); 
 15: numbers.add("4"); numbers.add("7"); 
 16: numbers.set(1, "5"); 
 17: numbers.add("8"); 
 18: numbers.remove(0); 
 19: for (String number : numbers) System.out.print(number);
```


- 1 48
- 2 58
- 3 478
- 4 578
- 5 78
- 6 An exception is thrown.
- 7 The code does not compile.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30113**
```
Which of the following are unchecked exceptions? (Choose all that apply)
```


- 1 ArithmeticException
- 2 ClassCastException
- 3 FileNotFoundException
- 4 NoClassDefFoundError
- 5 StackOverflowError

Answer: *1;2*

Arithmetic Operations with rational numbers
===========================================
**30115**
```
What is the output of the following snippet? 
 
 12: int a = 123; 
 13: int b = 0; 
 14: try { 
 15:   System.out.print(a / b); 
 16:   System.out.print("1"); 
 17: } catch (ArithmeticException e) { 
 18:   System.out.print("2"); 
 19: } catch (RuntimeException r) { 
 20:   System.out.print("3"); 
 21: } finally { 
 22:   System.out.print("4"); 
 23: }
```


- 1 14
- 2 2
- 3 24
- 4 234
- 5 The code does not compile.
- 6 An uncaught exception is thrown.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30194**
```
Which of the following lists is a correct sequence for catching exceptions? (Choose all that apply)
```


- 1 NumberFormatException, ClassCastException, RuntimeException
- 2 NumberFormatException, RuntimeException, ClassCastException
- 3 RuntimeException, NumberFormatException, ClassCastException
- 4 RuntimeException, NumberFormatException, Exception
- 5 NumberFormatException, Exception, RuntimeException
- 6 NumberFormatException, RuntimeException, Exception

Answer: *1;6*

Arithmetic Operations with rational numbers
===========================================
**30109**
```
Determine the output of the following code when executed with the command: 
 
 java HelloWorld hello world goodbye  
 1:  public static class HelloWorld { 
 2:    public static void main(String [] args) { 
 3:      System.out.println(args[1] + " " + args[2]); 
 4: } } 
```


- 1 hello world
- 2 world goodbye
- 3 null null
- 4 An ArrayIndexOutOfBoundsOccurs at runtime.
- 5 Does not compile
- 6 Throws a different exception

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30187**
```
What is true of the following code? (Choose all that apply) 
 
 1: public class Deer { 
 2:   private void freeze() { stayStill(); } 
 3:   public static void inTheHeadlights() { freeze(); } 
 4:   private static void stayStill() { } 
 5: } 
 6: public class Car { 
 7:   public static void drive(Deer deer) { 
 8:     deer.inTheHeadlights(); 
 9:   } }
```


- 1 Line 2 does not compile.
- 2 Line 3 does not compile.
- 3 Line 4 does not compile.
- 4 Line 8 does not compile.
- 5 The code compiles and runs without exception if Car.drive(null) is called.
- 6 The code compiles but throws an exception if Car.drive(null) is called.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30110**
```
What is the result of the following code? 
 
 1: interface Climb { 
 2:   boolean isTooHigh(int height, int limit); 
 3: } 
 4:  
 5: public class Climber { 
 6:   public static void main(Strin[] args) { 
 7:     check((h, l) -> h > l, 5); 
 8:   } 
 9:   private static void check(Climb climb, int height) { 
 10:    if (climb.isTooHigh(height, "max"))  
 11:      System.out.println("too high"); 
 12:    else  
 13:      System.out.println("ok"); 
 14:  } 
 15: }
```


- 1 ok
- 2 too high
- 3 Compiler error on line 7
- 4 Compiler error on line 10
- 5 Compiler error on a different line
- 6 A runtime exception is thrown.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30142**
```
What is the result of the following code snippet? 
 
 3: String[] values = {"one","two","three"}; 
 4: for(int index = 0; index < values.length; index++) 
 5:     System.out.print(values[index]); 
 6:     System.out.print(index);
```


- 1 onetwothree
- 2 onetwothree2
- 3 one0two1three2
- 4 The code will not compile because of line 4.
- 5 The code will not compile because of line 6.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30223**
```
Which exception will the following throw? 
 
 int[] nums = new int[] { 1, 4, 6}; 
 Object p = nums; 
 int[] two = (int[]) p; 
 System.out.println(two[two.length]);
```


- 1 ArrayIndexOutOfBoundsException
- 2 ClassCastException
- 3 IllegalArgumentException
- 4 NumberFormatException
- 5 None of the above

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30150**
```
Given the following class definitions, which method signature could appear in a subclass of Albatross? (Choose all that apply) 
 
 public abstract class SeaBird { 
   public abstract void fly(int height); 
 } 
 public abstract class Albatross { 
   abstract Long fly(); 
 }
```


- 1 private abstract void fly(int height)
- 2 protected void fly(int height)
- 3 public Number fly()
- 4 Long fly()
- 5 protected Long fly()

Answer: *2;4;5*

Arithmetic Operations with rational numbers
===========================================
**30169**
```
Which of the following pairs compiles and runs a Java program? (Choose all that apply)
```


- 1 javac Zoo
- 2 javac Zoo.class
- 3 javac Zoo.java
- 4 java Zoo
- 5 java Zoo.class
- 6 java Zoo.java

Answer: *3;4*

Arithmetic Operations with rational numbers
===========================================
**30226**
```
What is the result of following code? 
 
 String s = "a"; 
 s += 1; 
 s.concat(s); 
 s.concat("."); 
 System.out.println(s);
```


- 1 a
- 2 a1
- 3 a1a
- 4 a1a.
- 5 An exception is thrown.
- 6 The code does not compile.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30088**
```
What is the result of the following code? 
 
 1: public class PrintCharacters { 
 2:   public static void main(String[] args) { 
 3:    char value = 'c'; 
 4:    do System.out.print(value++); 
 5:    while (value <= 'f'); 
 6: } }
```


- 1 cde
- 2 cdef
- 3 def
- 4 defg
- 5 The code will not compile because of line 4.
- 6 The code will not compile because of line 5.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30082**
```
Which of the following are correct differences between abstract class and interfaces? (Choose all that apply)
```


- 1 Abstract classes can declare static methods, but interfaces cannot.
- 2 Interfaces can declare public static final variables, but abstract classes cannot.
- 3 An interface may extend another interface but not an abstract class.
- 4 Interfaces support multiple inheritance, whereas abstract classes support single inheritance.
- 5 An abstract class can be declared in a separate file, whereas an interface must be bundled within an existing class file.
- 6 Only abstract classes can include abstract methods.

Answer: *3;4*

Arithmetic Operations with rational numbers
===========================================
**30141**
```
What is the output when new Hippopotamus() is called? 
 
 1: class Mammal { 
 2:   public Mammal(int age) { System.out.println("1"); } 
 3: } 
 4: public class Hippopotamus extends Mammal { 
 5:   public Hippopotamus() { System.out.println("2"); } 
 6: }
```


- 1 12
- 2 1
- 3 2
- 4 The code will not compile because of line 2.
- 5 The code will not compile because of line 5.
- 6 The code will compile but produce an error at runtime

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30202**
```
Which of the following are true about ternary operators? (Choose all that apply)
```


- 1 The left-hand side of the expression must evaluate to a boolean expression or numeric value of 0 or 1 at runtime.
- 2 The data types of the two expressions on the right-hand side of the equation must match or be able to be numerically promoted to one another.
- 3 All ternary operators can be rewritten as if-then-else statement.
- 4 If the expression on the left-hand side evaluates to true, then the rightmost expression will not be evaluated.
- 5 The terms must be compile-time constant values.

Answer: *3;4*

Arithmetic Operations with rational numbers
===========================================
**30147**
```
What gets printed when running the following snippet? 
 
 public static void main(String[] args) { 
   int i = 0; 
   try { 
     i += 1; 
     e(); 
     i += 2; 
   } finally { 
     i += 8; 
   }catch (Exception e) { 
     i += 4; 
   } 
   System.out.print(i); 
 } 
 private static void e() { 
   throws new IllegalArgumentException(); 
 }
```


- 1 1
- 2 9
- 3 11
- 4 13
- 5 The code does not compile.
- 6 An exception is thrown.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30063**
```
Which of the following is a reference variable (and not a primitive)? (Choose all that apply)
```


- 1 int[] ints;
- 2 long[] longs;
- 3 String[] strings;
- 4 Object[] objects;
- 5 None of the above

Answer: *1;2;3;4*

Arithmetic Operations with rational numbers
===========================================
**30081**
```
What is the output of the following program? 
 
 1:  public class Image {  
 2:    public int width, height;  
 3:    public void showImage() throws Exception {  
 4:      if(width < 0 || height < 0)   
 5:        throw new Exception("invalid image size");  
 6:      else  
 7:        System.out.print("1");  
 8:    }  
 9:    public static void main(String [] args) {  
 10:     Image image = new Image();  
 11:     image.width = -10;  
 12:     try {  
 13:       image.showImage();  
 14:       System.out.print("2");  
 15:     }catch(Exception e) {  
 16:       System.out.print("3");  
 17:     }  
 18:     System.out.print("4");  
 19:   }  
 20: }
```


- 1 124
- 2 234
- 3 34
- 4 3 and a stack trace for Exception
- 5 34 and a stack trace for Exception
- 6 The code does not compile.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30206**
```
What is the result of the following? 
 
 List<String> fish = new ArrayList<>(); 
 fish.add("goldfish"); fish.add("minnow"); 
 fish.remove("goldfish"); fish.remove("shark"); 
 System.out.println(fish.size());
```


- 1 0
- 2 1
- 3 2
- 4 An exception is thrown.
- 5 The code does not compile.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30136**
```
What is the output of the following program? 
 
 1: public class ExceptionTest { 
 2:   public static void main(String[] args) { 
 3:     String ref = null; 
 4:       try { 
 5:         System.out.print(ref.toString()); 
 6:         System.out.print("a"); 
 7:       } catch (NumberFormatException e) { 
 8:         System.out.print("b"); 
 9:       } finally { 
 10:        System.out.print("c"); 
 11:     } 
 12:      System.out.print("d"); 
 13:  } }
```


- 1 acd
- 2 bcd
- 3 bc and the stack trace for a NullPointerException
- 4 c and the stack trace for a NullPointerException
- 5 cd and the stack trace for a NullPointerException
- 6 The code does not compile.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30153**
```
What is the result of the following code snippet? 
 
 3: int x = 9; 
 4: long y = x * (long) (++x); 
 5: System.out.println(y);
```


- 1 –1
- 2 9
- 3 81
- 4 90
- 5 The code will not compile because of line 4.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30117**
```
What is the result of the following code assuming garbage collection runs on line 6? 
 
 1: public class Caterpillar { 
 2:  public static void main(String[] args) { 
 3:    Caterpillar c1 = new Caterpillar(); 
 4:    Caterpillar c2 = new Caterpillar(); 
 5:    c1 = c2;  c2 = null; 
 6:    // garbage collection runs 
 7:    c1 = null; 
 8:  } 
 9:  protected void finalize() { 
 10:    System.out.println("becomes a butterfly"); 
 11:  } }
```


- 1 "becomes a butterfly" is never printed.
- 2 "becomes a butterfly" is printed exactly once.
- 3 "becomes a butterfly" is printed exactly twice.
- 4 The code fails compilation on line 3.
- 5 The code fails compilation on line 9.
- 6 The code fails compilation on another line.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30064**
```
What is the result of the following code snippet? 
 
 3: int x = 5; 
 4: while(x >= 0) { 
 5:  int y = 3; 
 6:  while (y > 0) { 
 7:    if(x<2) continue; 
 8:    x--; y--; 
 9:    System.out.print(x*y+" "); 
 10:  } 
 11: }
```


- 1 42 31 20 12
- 2 6 4 2 3
- 3 8 3 0 2
- 4 The code will not compile because of line 6.
- 5 The code will not compile because of line 7.
- 6 The code contains an infinite loop and does not terminate.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30151**
```
What is the result of the following code? 
 
 1: public class Counts { 
 2:  private boolean b; 
 3:  public static void main(String[] args) { 
 4:    Counts c = new Counts(); 
 5:    int one, two = 0; 
 6:    if (c.b) { 
 7:      System.out.println(one); } } }
```


- 1 Compiler error on line 5
- 2 Compiler error on line 6
- 3 Compiler error on line 7
- 4 Compiles successfully and prints 0
- 5 Compiles successfully and prints null
- 6 Compiles successfully with no output

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30118**
```
Which of the following correctly overload this method? (Choose all that apply) 
 
 public void buzz() { }
```


- 1 private void buzz(String sound) { }
- 2 public final void buzz() { }
- 3 public static void buzz() { }
- 4 public static void buzz(int... time) { }
- 5 public void buzz(boolean softly) { }
- 6 public void buzzLouder() { }

Answer: *1;4;5*

Arithmetic Operations with rational numbers
===========================================
**30131**
```
Which lambda can replace the MySecret class? (Choose all that apply) 
 interface Secret { 
   int number(); 
 } 
 
 class MySecret implements Secret { 
   public int number() { 
     return 5; 
   } 
}
```


- 1 caller( -> 5);
- 2 caller(x -> 5);
- 3 caller(() -> 5);
- 4 caller((x) -> 5);
- 5 caller(() -> {5});
- 6 caller(() -> { return 5;});

Answer: *3;6*

Arithmetic Operations with rational numbers
===========================================
**30055**
```
What is the result of the following code snippet? 
 
 3: int x = 10, y = 3; 
 4: if(x % y == 2) 
 5:  System.out.print("two"); 
 6:  System.out.print(x%y); 
 7: if(x % y == 1) System.out.print("one");
```


- 1 two
- 2 two1
- 3 two2
- 4 one
- 5 1one
- 6 The code will not compile because of line 6.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30156**
```
What is the result of the following code? (Choose all that apply) 
 
 public class Cardinal { 
   static int number; 
   Cardinal() { number++; } 
   public static void main(String[] args) { 
   Cardinal c1 = new Cardinal(); 
   if (c1 == null) { 
   Cardinal c2 = new Cardinal(); 
   } else { 
   Cardinal c2 = new Cardinal(); 
   } 
   Cardinal c2 = new Cardinal(); 
   System.out.println(c1.number); 
 } 
 package bird;  
 }
```


- 1 0
- 2 1
- 3 2
- 4 3
- 5 4
- 6 The code does not compile.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30122**
```
Which of the following imports can be inserted to make the Robot class compile? (Choose all that apply) 
 
 package util; 
 public interface Ports { 
  int RIGHT_MOTOR = 1; 
   int LEFT_MOTOR = 2; 
 } 
 package robot; 
   // INSERT CODE HERE 
 public class Robot { 
   Robot(int motor1, int motor2) { } 
   public static void main(String[] args) { 
     Robot robbie = new Robot(Ports.RIGHT_MOTOR, LEFT_MOTOR);  
   } 
 }
```


- 1 import static util.Ports.*;
- 2 import static util.Ports.*; import util.*;
- 3 import static util.Ports;
- 4 static import util.Ports.*;
- 5 static import util.Ports.*; import util.*;
- 6 static import util.Ports;

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30062**
```
What is the result of this code? 
 
 1: public class C { 
 2:   String seq = "c"; 
 3:   { seq += "g"; } 
 4:   public C() { 
 5:     this("abc"); 
 6:     seq += "y"; 
 7:   } 
 8:   public C(String s) { 
 9:     seq += "e"; 
 10:  } 
 11:  { seq += "z"; } 
 12:   public static void main(String[] args) { 
 13:     C c = new C(); 
 14:    System.out.println(c.seq); 
 15:   } }
```


- 1 ceygz
- 2 cgeyz
- 3 cgyez
- 4 cgzey
- 5 cgzye
- 6 cyegz
- 7 The code does not compile.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30182**
```
How many checked exceptions are declared in this code? 
 
 class One extends Exception { } 
 class Two extends One { } 
 class Three extends Error { } 
 class Four extends RuntimeException { } 
 class Five extends Four { }
```


- 1 1
- 2 2
- 3 3
- 4 4
- 5 5

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30124**
```
What is the result of the following code? (Choose all that apply) 
 
 public class Cardinal { 
   static int number; 
   Cardinal() { number++; } 
   public static void main(String[] args) { 
   Cardinal c1 = new Cardinal(); 
   if (c1 == null) { 
   Cardinal c2 = new Cardinal(); 
   } else { 
   Cardinal c2 = new Cardinal(); 
   } 
   Cardinal c2 = new Cardinal(); 
   System.out.println(c1.number); 
 } }
```


- 1 0
- 2 1
- 3 2
- 4 3
- 5 4
- 6 The code does not compile.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30188**
```
Which of the following are true statements about interface methods? (Choose all that apply)
```


- 1 They can be declared abstract, static, or default.
- 2 They are assumed to be protected.
- 3 They can be overridden with an abstract method in an abstract class that implements the interface.
- 4 A class can implement two interfaces that declare the same abstract method.
- 5 A class can implement two interfaces that declare the same default method without overriding it.
- 6 If an interface method is marked abstract, then it cannot be marked static or default.

Answer: *1;3;4;6*

Arithmetic Operations with rational numbers
===========================================
**30085**
```
Which of the following statements about objects and references are true in Java? (Choose all that apply)
```


- 1 All objects in Java are accessed via a reference.
- 2 By casting an object to a superclass reference, you permanently lose access to methods defined in the subclass.
- 3 The type of the object determines which properties exist within the object in memory.
- 4 The type of the reference to the object determines which methods and variables are accessible to the Java program.
- 5 By casting an object to a subclass reference, you may add new attributes to the object in memory.

Answer: *1;3;4*

Arithmetic Operations with rational numbers
===========================================
**30101**
```
What is the output of the following code? 
 
 1: public abstract class BigCat { 
 2:   protected final void purr() { System.out.println("BigCat purrs!"); } 
 3:   public static void main(String[] args) { 
 4:     BigCat bigCat = new Ocelot(); 
 5:     bigCat.purr(); 
 6:   } 
 7: } 
 8: class Ocelot extends BigCat { 
 9:   protected final void purr() { System.out.println("Ocelot purrs!"); } 
 10: }
```


- 1 BigCat purrs!
- 2 Ocelot purrs!
- 3 The code will not compile because of line 4.
- 4 The code will not compile because of line 5.
- 5 The code will not compile because of line 9.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30089**
```
 Which is true of the following code? (Choose all that apply) 
 
 1: package abc; 
 2: import java.math.*; 
 3: public class W { 
 4:   public void method() { } 
 5:   int a; 
 6: }
```


- 1 The code will not compile if line 1 is removed.
- 2 The code will not compile if line 2 is removed.
- 3 The code will not compile if line 3 is removed.
- 4 The code will not compile if line 4 is removed.
- 5 The code will not compile if line 5 is removed.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30048**
```
What is the result of the following code? 
 
 4: String numbers = "2468"; 
 5: int total = 0; 
 6: total += numbers.indexOf("6"); 
 7: total += numbers.indexOf("9"); 
 8: char ch = numbers.charAt(3); 
 9: System.out.println(total + " " + ch);
```


- 1 1 6
- 2 1 8
- 3 2 6
- 4 2 8
- 5 An exception is thrown.
- 6 The code does not compile.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30178**
```
What is the result of the following code? 
 
 1: public class ModSample { 
 2:    public static void main(String[] args) { 
 3:     int y = 4; 
 4:     int x = 10 - ++y / 5; 
 5:     System.out.println(x % y); 
 6: } }
```


- 1 4
- 2 0
- 3 7
- 4 5
- 5 The answer cannot be determined until runtime.
- 6 The code will not compile because of line 4.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30181**
```
What does the following output? 
 
 List numberList = Arrays.asList(5, 10, -5, -10); 
 Collections.sort(numberList); 
 int five = Collections.binarySearch(numberList, 5); 
 int four = Collections.binarySearch(numberList, 4); 
 System.out.println(five + four);
```


- 1 –2
- 2 –1
- 3 0
- 4 1
- 5 2
- 6 An exception is thrown.
- 7 The code doesn't compile.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30197**
```
Given this array declaration, which of the following statements are valid array indexes? 
 
 int[][] numbers = {{1,2}, {3}, {4,5,6}};
```


- 1 numbers[0][1]
- 2 numbers[0][2]
- 3 numbers[1][0]
- 4 numbers[1][1]
- 5 numbers[2][0]
- 6 numbers[3][1]

Answer: *1;3;5*

Arithmetic Operations with rational numbers
===========================================
**30159**
```
What is the output when new Buffalo() is called? 
 
 1: class Animal { 
 2:   public Animal(int age) { System.out.println("1"); this(); } 
 3:   public Animal() { System.out.println("2"); } 
 4: } 
 5: public class Buffalo extends Animal { 
 6:   public Buffalo() { 
 7:    System.out.println("3"); 
 8:  } 
 9: }
```


- 1 123
- 2 213
- 3 3
- 4 23
- 5 The code will not compile because of line 2.
- 6 The code will not compile because of line 7.
- 7 It compiles but throws an exception at runtime.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30071**
```
What does the following code output when run as java Duck Duck Goose? 
 
 public class Duck { 
   public void main(String[] args) { 
     for (int i = 1; i <= args.length; i++)  
      System.out.println(args[i]);  } }
```


- 1 Duck Goose
- 2 Duck ArrayIndexOutOfBoundsException
- 3 Goose
- 4 Goose ArrayIndexOutOfBoundsException
- 5 None of the above

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30222**
```
What is the result of this code? (Choose all that apply) 
 
 public class Change { 
   public static void change(int size, StringBuilder s) { 
     s.append("b"); 
     size++; 
   } 
   public static void main(String[] args) { 
     int size = 2; 
     StringBuilder s1 = new StringBuilder("s1"); 
     change(size, s1); 
     System.out.println("s1 = " + s1); 
     System.out.println("size = " + size); 
   } 
 }
```


- 1 s1 = s1
- 2 s1 = s1b
- 3 size = 2
- 4 size = 3
- 5 The code does not compile.
- 6 An exception is thrown.

Answer: *2;3*

Arithmetic Operations with rational numbers
===========================================
**30072**
```
What is the result of the following code? 
 
 1: interface Climb { 
 2:   boolean isTooHigh(int height, int limit); 
 3: } 
 4:  
 5: public class Climber { 
 6:   public static void main(String[] args) { 
 7:     check((h, l) -> h > l, 5); 
 8:   } 
 9:   private static void check(Climb climb, int height) { 
 10:    if (climb.isTooHigh(height, 10))  
 11:      System.out.println("too high"); 
 12:    else  
 13:      System.out.println("ok"); 
 14:  } 
 15: }
```


- 1 ok
- 2 too high
- 3 Compiler error on line 7
- 4 Compiler error on line 10
- 5 Compiler error on a different line
- 6 A runtime exception is thrown.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30208**
```
Which lines in Tadpole give a compiler error? (Choose all that apply) 
 
 1: package animal; 
 2: public class Frog { 
 3:   protected void ribbit() { } 
 4:   void jump() { } 
 5: } 
 
 1: package other; 
 2: import animal.*; 
 3: public class Tadpole extends Frog { 
 4:   public static void main(String[] args) { 
 5:     Tadpole t = new Tadpole(); 
 6:     t.ribbit(); 
 7:     t.jump(); 
 8:     Frog f = new Tadpole(); 
 9:     f.ribbit(); 
 10:    f.jump(); 
 11:   } }
```


- 1 5
- 2 6
- 3 7
- 4 8
- 5 9
- 6 10

Answer: *3;5;6*

Arithmetic Operations with rational numbers
===========================================
**30061**
```
Which of the following are true statements? (Choose all that apply)
```


- 1 Java allows extending from multiple classes directly.
- 2 Java allows implementing multiple interfaces directly.
- 3 Java code compiled on Unix must be recompiled to run on Windows.
- 4 Java supports method overloading.
- 5 Java supports operator overloading.

Answer: *2;4*

Arithmetic Operations with rational numbers
===========================================
**30102**
```
What is the output of the following program? 
 
 1:  public class ColorPicker { 
 2:    public void pickColor() { 
 3:      try { 
 4:        System.out.print("A"); 
 5:        fail(); 
 6:      } catch (NullPointerException e) { 
 7:        System.out.print("B"); 
 8:      } finally { 
 9:        System.out.print("C"); 
 10:     } 
 11:   } 
 12:   public void fail() { 
 13:     throw new ArithmeticException(); 
 14:   } 
 15:   public static void main(String[] args) { 
 16:     new ColorPicker().pickColor(); 
 17:     System.out.print("D"); 
 18:   } 
 19: }
```


- 1 ABCD
- 2 ABD
- 3 A and a stack trace for ArithmeticException
- 4 AC and a stack trace for ArithmeticException
- 5 ACD and a stack trace for ArithmeticException

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30060**
```
What is the result of the following code? 
 
 public class Deer { 
   static int count; 
   static { count = 0; } 
    
   Deer() { 
     count++; 
   } 
   
   public static void main(String[] args) { 
     count++; 
     Deer mother = new Deer(); 
     Deer father = new Deer(); 
     Deer fawn = new Deer(); 
     System.out.println(father.count); 
   } 
 }
```


- 1 0
- 2 1
- 3 2
- 4 3
- 5 4
- 6 5
- 7 The code does not compile.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30107**
```
Which of the following lambda expressions can be passed to a function of Predicate<String> type? (Choose all that apply)
```


- 1 check(() -> s.isEmpty());
- 2 check(s -> s.isEmpty());
- 3 check(String s -> s.isEmpty());
- 4 check((String s) -> s.isEmpty());
- 5 check((s1) -> s.isEmpty());
- 6 check((s1, s2) -> s1.isEmpty());

Answer: *2;4*

Arithmetic Operations with rational numbers
===========================================
**30165**
```
Which of the following exist in Java? (Choose all that apply)
```


- 1 NullPointerError
- 2 NullPointerException
- 3 IOError
- 4 IOException
- 5 StackOverflowError
- 6 StackOverflowException

Answer: *2;4;5*

Arithmetic Operations with rational numbers
===========================================
**30143**
```
What is the result of this code? 
 
 public class Chicken { 
   private void layEggs(int... eggs) { 
     System.out.print("many " + eggs[0] + " "); 
   } 
   private void layEggs(int eggs) { 
     System.out.print("one " + eggs + " "); 
   } 
   public static void main(String[] args) { 
     Chicken c = new Chicken(); 
     c.layEggs(1, 2); 
     c.layEggs(3); 
     c.layEggs(new Integer(2)); 
   } 
 }
```


- 1 many 1 one 3 one 2
- 2 many 2 one 3 one 2
- 3 many 1 many 3 one 2
- 4 many 2 one 3 many 2
- 5 The code does not compile.
- 6 An exception is thrown.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**30090**
```
What is the result of the following code snippet? 
 
 3: int x = 10 % 2; 
 4: int y = 3 / 5 + ++x; 
 5: int z += 4 * x; 
 6: System.out.print(x+","+y+","+z);
```


- 1 0,1,0
- 2 1,1,4
- 3 2,1,8
- 4 0,2,1
- 5 The code will not compile because of line 4.
- 6 The code will not compile because of line 5.

Answer: *6*

Arithmetic Operations with rational numbers
===========================================
**30111**
```
What is the result of the following code? 
 
 public class A { 
   private int i = 6; 
   private int j = i; 
   public A() { 
     i = 5; 
   } 
    public static void main(String[] args) { 
      A a = new A(); 
      System.out.println(a.i + a.j); 
  } }
```


- 1 55
- 2 56
- 3 66
- 4 10
- 5 11
- 6 12
- 7 The code does not compile.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30171**
```
Which of the following are checked exceptions? (Choose all that apply)
```


- 1 ArithmeticException
- 2 ClassCastException
- 3 java.io.IOException
- 4 NoClassDefFoundError
- 5 StackOverflowError

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30176**
```
Which exception will the following throw? 
 
 int[] nums = new int[] { 1, 0, 2 }; 
 Object p = nums; 
 int[] two = (int[]) p; 
 System.out.println(10 / two[2]);
```


- 1 ArrayIndexOutOfBoundsException
- 2 ClassCastException
- 3 IllegalArgumentException
- 4 NumberFormatException
- 5 None of the above

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30073**
```
What is the result of the following code snippet? 
 
 3: String year = "Senior"; 
 4: switch(year) { 
 5:   case "Freshman" : default: case "Sophomore" : 
 6:   case "Junior" : System.out.print("See you next year"); break; 
 7:   case "Senior" : System.out.print("Congratulations"); 
 8: }
```


- 1 See you next year
- 2 Congratulations
- 3 See you next yearCongratulations
- 4 The code does not output any text.
- 5 The code will not compile because of line 4.
- 6 The code will not compile because of line 5.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30218**
```
Which of the following are included in the output of this code? (Choose all that apply) 
 
 3: String s = new String("Hello"); 
 4: String t = new String(s); 
 5: if ("Hello".equals(s)) System.out.println("one"); 
 6: if (t == s) System.out.println("two"); 
 7: if (t.equals(s)) System.out.println("three"); 
 8: if ("Hello" == s) System.out.println("four"); 
 9: if ("Hello" == t) System.out.println("five");
```


- 1 one
- 2 two
- 3 three
- 4 four
- 5 five
- 6 The code does not compile.

Answer: *1;3*

Arithmetic Operations with rational numbers
===========================================
**30154**
```
What is the result of the following? 
 
 3: int[] times [] = new int[3][3]; 
 4: for (int i = 0; i < times.length; i++)  
 5:   for (int j = 0; j < times.length; j++)  
 6:      times[i][j] = i*j; 7: System.out.println(times[2][3]); 
```


- 1 1
- 2 4
- 3 1 printed 4 times
- 4 4 printed 3 times
- 5 An exception is thrown.
- 6 The code fails to compile because of line 3.
- 7 The code fails to compile for another reason.

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**30126**
```
Which of the following exceptions are always thrown programmatically? (Choose all that apply)
```


- 1 ArrayIndexOutOfBounds
- 2 ExceptionInInitializerError
- 3 java.io.IOException()
- 4 NullPointerException()
- 5 NumberFormatException

Answer: *3;5*

Arithmetic Operations with rational numbers
===========================================
**30207**
```
What is the output of the following code? 
 
 LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33); 
 Period p = Period.of(1, 2, 3); 
 d.minus(p); 
 DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); 
 System.out.println(f.format(d));
```


- 1 3/7/14 11:22 AM
- 2 6/7/14 11:22 AM
- 3 5/10/15 11:22 AM
- 4 6/10/15 11:22 AM
- 5 The code does not compile.
- 6 A runtime exception is thrown.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30070**
```
 Which are true of the following code? (Choose all that apply) 
 
 1: package aquarium; 
 2: public class Water { 
 3: public String toString() { return ""; } } 
 
 1: package aquarium; 
 2: public class Shark { 
 3:  static int numFins; 
 4:  static Water water; 
 5:  public static void Main(String[] args) { 
 6:    String s1 = water.toString(); 
 7:    String s2 = numFins.toString();   } }
```


- 1 Shark.java needs an additional import to compile.
- 2 water.toString() does not compile.
- 3 numFins.toString() does not compile.
- 4 Water.java does not compile.
- 5 java Shark will run the program and produce no output.
- 6 The code compiles as is.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30074**
```
What is the result of the following code? 
 
 1:  public class BytePrinter { 
 2:    public void print(byte b) { 
 3:      System.out.print("byte"); 
 4:    } 
 5:    public void print(Byte b) { 
 6:      System.out.print("Byte"); 
 7:    } 
 8:    public void print(int i) { 
 9:      System.out.print("int"); 
 10:   } 
 11:   public static void main(String[] args) { 
 12:     BytePrinter printer = new BytePrinter(); 
 13:     short x = 10; 
 14:     byte y = 12; 
 15:     printer.print(x); 
 16:     printer.print(y); 
 17:   } 
 18: }
```


- 1 byteint
- 2 intbyte
- 3 Compiler error on line 5
- 4 Compiler error on line 15
- 5 Compiler error on line 16

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**30065**
```
What is the result of the following class? 
 
 1: import java.util.function.*; 
 2:  
 3: public class Panda { 
 4:   int age; 
 5:   public static void main(String[] args) { 
 6:     Panda p1 = new Panda(); 
 7:     p1.age = 1; 
 8:     check(p1, Panda p -> p.age < 5); 
 9:   } 
 10:   private static void check(Panda panda, Predicate<Panda> pred) { 
 11:     String result = pred.test(panda) ? "match" : "not match";  
 12:     System.out.print(result); 
 13: } }
```


- 1 match
- 2 not match
- 3 Compiler error on line 8
- 4 Compiler error on line 10
- 5 Compile error on line 11
- 6 A runtime exception is thrown.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**30221**
```
In which order can you assemble the following statements in to make a valid Java program? (Choose all that apply) 
 
A: /* hello world */ 
B: ArrayList list; 
C: import java.util.*; 
D: package abc; 
E: public class Builder { 
F: public void method() { }
```


- 1 A, D, E, B, F
- 2 A, D, C, E, F, B
- 3 D, A, E, B, F
- 4 D, A, E, F, B
- 5 D, C, A, E, B, F
- 6 D, C, A, E, F, B

Answer: *2;5;6*

Arithmetic Operations with rational numbers
===========================================
**30139**
```
Which of the following are true? (Choose all that apply) 
 
 StringBuilder s1 = new StringBuilder("meow"); 
 StringBuilder s2 = new StringBuilder("meow"); 
 if (s1 == s2) System.out.println("one"); 
 if (s1.equals(s2)) System.out.println("two"); 
 if (s1 == "meow") System.out.println("three"); 
 if (s1.toString() == "meow") System.out.println("four");
```


- 1 The code compiles.
- 2 The code does not compile.
- 3 If statements that do not compile are removed, the output contains one.
- 4 If statements that do not compile are removed, the output contains two.
- 5 If statements that do not compile are removed, the output contains three.
- 6 If statements that do not compile are removed, the output contains four.

Answer: *2;4*

Arithmetic Operations with rational numbers
===========================================
**30211**
```
Which are true of the following code? 
 
 1: public class C { 
 2:   String seq = "c"; 
 3:   static { seq += "g"; } 
 4:   { seq += "z"; } 
 5:   public static void main(String[] args) { 
 6:     C c1 = new C(); 
 7:     C c2 = new C(); 
 8:     System.out.println(c1.seq); 
 9:   } }
```


- 1 The code compiles and outputs gzz.
- 2 The code compiles and outputs gzgz.
- 3 If the lines that do not compile are removed, the code outputs cg.
- 4 If the lines that do not compile are removed, the code outputs cz.
- 5 If the lines that do not compile are removed, the code outputs cgzz.
- 6 If the lines that do not compile are removed, the code outputs cgzz.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**30186**
```
Which of the following statements about objects and references are true in Java? (Choose all that apply)
```


- 1 By explicitly casting an object to a subclass, you can gain access to methods and variables that were hidden from access.
- 2 If you compare two distinct references to the same object with ==, the result will evaluate to false.
- 3 All objects in memory can be referenced using a reference of type java.lang.Object.
- 4 When you create an object in Java, you get direct access to the object in memory.
- 5 Removing all references to an object deletes the object from memory.

Answer: *1;3*

Arithmetic Operations with rational numbers
===========================================
**30120**
```
What is the result of this code? 
 
 public class Cub { 
   private String name; 
   private double weight; 
   public Cub(double weight) { 
     this.weight = weight; 
     this("", weight); 
   } 
   public Cub(String name, double weight) { 
     weight = weight; 
     this.name = name; 
   } 
   public static void main(String[] args) { 
     Cub cub = new Cub(44); 
     System.out.println(cub.weight + "" + cub.name); 
   } 
 }
```


- 1 0
- 2 0 null
- 3 44
- 4 44 null
- 5 44.0
- 6 44.0 null
- 7 The code does not compile.

Answer: *7*

