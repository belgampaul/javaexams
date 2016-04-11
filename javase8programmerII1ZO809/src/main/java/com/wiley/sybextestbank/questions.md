Arithmetic Operations with rational numbers
===========================================
**29902**
```
Which of the following are checked exceptions? (Choose all that apply)
```


- 1 Exception
- 2 IllegalArgumentException
- 3 IOException
- 4 NullPointerException
- 5 NumberFormatException
- 6 StackOverflowError

Answer: *1;3*

Arithmetic Operations with rational numbers
===========================================
**29887**
```
What is the output of the following code snippet? 
 
 13: System.out.print("a"); 
 14: try { 
 15:   System.out.print("b"); 
 16:   throw new IllegalArgumentException(); 
 17: } catch (RuntimeException e) { 
 18:   System.out.print("c"); 
 19: } finally { 
 20:   System.out.print("d"); 
 21: } 
 22: System.out.print("e");
```


- 1 abe
- 2 abce
- 3 abde
- 4 abcde
- 5 The code does not compile.
- 6 An uncaught exception is thrown.

Answer: *4*

Arithmetic Operations with rational numbers
===========================================
**29900**
```
Which of the following print out a date representing April 1, 2015? (Choose all that apply)
```


- 1 System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
- 2 System.out.println(LocalDate.of(2015, Month.APRIL, 1));
- 3 System.out.println(LocalDate.of(2015, 3, 1));
- 4 System.out.println(LocalDate.of(2015, 4, 1));
- 5 System.out.println(new LocalDate(2015, 3, 1));
- 6 System.out.println(new LocalDate(2015, 4, 1));

Answer: *2;4*

Arithmetic Operations with rational numbers
===========================================
**29889**
```
What is the result of the following code? 
 
 int[] array = {6,9,8}; 
 List<Integer> list = new ArrayList<>(); 
 list.add(array[0]); 
 list.add(array[2]); 
 list.set(1, array[1]); 
 list.remove(0); 
 System.out.println(list);
```


- 1 [8]
- 2 [9]
- 3 Something like [Ljava.lang.String;@160bc7c0
- 4 An exception is thrown.
- 5 The code does not compile.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**29897**
```
Which of the following statements can be inserted in the blank line so that the code will compile successfully? (Choose all that apply) 
 
 public interface CanSwim {} 
 public class Amphibian implements CanSwim {} 
 class Tadpole extends Amphibian {} 
 public class FindAllTadPole {  public static void main(String[] args) {    List<Tadpole> tadpoles = new ArrayList<Tadpole>();    for(Amphibian amphibian : tadpoles) {      ___________ tadpole = amphibian; 
 } } }
```


- 1 CanSwim
- 2 Long
- 3 Amphibian
- 4 Tadpole
- 5 Object

Answer: *1;3;5*

Arithmetic Operations with rational numbers
===========================================
**29883**
```
What is the result of the following class? 
 
 1: public class _C { 
 2:  private static int $; 
 3:  public static void main(String[] main) { 
 4:    String a_b; 
 5:    System.out.print($); 
 6:    System.out.print(a_b); 
 7:  } }
```


- 1 Compiler error on line 1
- 2 Compiler error on line 2
- 3 Compiler error on line 4
- 4 Compiler error on line 5
- 5 Compiler error on line 6
- 6 0null
- 7 nullnull

Answer: *5*

Arithmetic Operations with rational numbers
===========================================
**29895**
```
What is the output of the following program? 
 
 1: public class BearOrShark { 
 2:   public static void main(String[] args) { 
 3:     int luck = 10; 
 4:     if((luck>10 ? luck++: --luck)<10) { 
 5:       System.out.print("Bear"); 
 6:     } if(luck<10) System.out.print("Shark"); 
 7: } }
```


- 1 Bear
- 2 Shark
- 3 BearShark
- 4 The code will not compile because of line 4.
- 5 The code will not compile because of line 6.
- 6 The code compiles without issue but does not produce any output.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**29886**
```
What is the output of the following program? 
 
 1: public class FeedingSchedule { 
 2:  public static void main(String[] args) { 
 3:    boolean keepGoing = true; 
 4:    int count = 0; 
 5:    int x = 3; 
 6:    while(count++ < 3) { 
 7:      int y = (1 + 2 * count) % 3; 
 8:      switch(y) { 
 9:         default: 
 10:         case 0: x -= 1; break; 
 11:         case 1: x += 5; 
 12:      } 
 13:    } 
 14:  System.out.println(x); 
 15: } }
```


- 1 4
- 2 5
- 3 6
- 4 7
- 5 13
- 6 The code will not compile because of line 7.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**29884**
```
What is the result of the following code? 
 
 String s1 = "Java"; 
 String s2 = "Java"; 
 StringBuilder sb1 = new StringBuilder(); 
 sb1.append("Ja").append("va"); 
 System.out.println(s1 == s2); 
 System.out.println(s1.equals(s2)); 
 System.out.println(sb1.toString() == s1); 
 System.out.println(sb1.toString().equals(s1));
```


- 1 true is printed out exactly once.
- 2 true is printed out exactly twice.
- 3 true is printed out exactly three times.
- 4 true is printed out exactly four times.
- 5 The code does not compile.

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**29893**
```
What is the output of the following program? 
 
 1: public class FeedingSchedule { 
 2:  public static void main(String[] args) { 
 3:    int x = 5, j = 0; 
 4:    OUTER: for(int i=0; i<3; )  
 5:      INNER: do { 
 6:        i++; x++; 
 7:        if(x > 10) break INNER; 
 8:        x += 4; 
 9:        j++; 
 10:      } while(j <= 2); 
 11:    System.out.println(x); 
 12: } }
```


- 1 10
- 2 12
- 3 13
- 4 17
- 5 The code will not compile because of line 4.
- 6 The code will not compile because of line 6.

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**29894**
```
What is the result of the following program? 
 
 1: public class Egret { 
 2:  private String color; 
 3:   public Egret() { 
 4:     this("white"); 
 5:   } 
 6:   public Egret(String color) { 
 7:     color = color; 
 8:   } 
 9:   public static void main(String[] args) { 
 10:    Egret e = new Egret(); 
 11:    System.out.println("Color:" + e.color); 
 12:   } 
 13: }
```


- 1 Color:
- 2 Color:null
- 3 Color:White
- 4 Compiler error on line 4
- 5 Compiler error on line 10
- 6 Compiler error on line 11

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**29901**
```
Bytecode is in a file with which extension?
```


- 1 .bytecode
- 2 .bytes
- 3 .class
- 4 .exe
- 5 .javac
- 6 .java

Answer: *3*

Arithmetic Operations with rational numbers
===========================================
**29890**
```
What is the output of the following code? 
 
 1: public class Deer { 
 2:  public Deer() { System.out.print("Deer"); } 
 3:  public Deer(int age) { System.out.print("DeerAge"); } 
 4:  private boolean hasHorns() { return false; } 
 5:  public static void main(String[] args) { 
 6:    Deer deer = new Reindeer(5); 
 7:    System.out.println(","+deer.hasHorns()); 
 8:  } 
 9: } 
 10: class Reindeer extends Deer { 
 11:  public Reindeer(int age) { System.out.print("Reindeer"); } 
 12:  public boolean hasHorns() { return true; } 
 13: } 
```


- 1 DeerReindeer,false
- 2 DeerReindeer,true
- 3 ReindeerDeer,false
- 4 ReindeerDeer,true
- 5 DeerAgeReindeer,false
- 6 DeerAgeReindeer,true
- 7 The code will not compile because of line 7.
- 8 The code will not compile because of line 12.

Answer: *1*

Arithmetic Operations with rational numbers
===========================================
**29888**
```
What is the result of the following program? 
 
 1: public class MathFunctions { 
 2:   public static void addToInt(int x, int amountToAdd) { 
 3:     x = x + amountToAdd; 
 4:   } 
 5:   public static void main(String[] args) { 
 6:     int a = 15; 
 7:     int b = 10; 
 8:     MathFunctions.addToInt(a, b); 
 9:     System.out.println(a);   } }
```


- 1 10
- 2 15
- 3 25
- 4 Compiler error on line 3
- 5 Compiler error on line 8
- 6 None of the above

Answer: *2*

Arithmetic Operations with rational numbers
===========================================
**29891**
```
Which of the following statements are true? (Choose all that apply)
```


- 1 Checked exceptions are intended to be thrown by the JVM (and not the programmer).
- 2 Checked exceptions are required to be caught or declared.
- 3 Errors are intended to be thrown by the JVM (and not the programmer).
- 4 Errors are required to be caught or declared.
- 5 Runtime exceptions are intended to be thrown by the JVM (and not the programmer).
- 6 Runtime exceptions are required to be caught or declared.

Answer: *2;3*

Arithmetic Operations with rational numbers
===========================================
**29899**
```
Which of the following lines can be inserted at line 11 to print true? (Choose all that apply) 
 
 10: public static void main(String[] args) { 
 11:   // INSERT CODE HERE 
 12: } 
 13: private static boolean test(Predicate<Integer> p) { 
 14:   return p.test(5); 
 15: }
```


- 1 System.out.println(test(i -> i == 5));
- 2 System.out.println(test(i -> {i == 5;}));
- 3 System.out.println(test((i) -> i == 5));
- 4 System.out.println(test((int i) -> i == 5);
- 5 System.out.println(test((int i) -> {return i == 5;}));
- 6 System.out.println(test((i) -> {return i == 5;}));

Answer: *1;3;6*

Arithmetic Operations with rational numbers
===========================================
**29896**
```
Assuming we have a valid, non- null HenHouse object whose value is initialized by the blank line shown here, which of the following are possible outputs of this application? (Choose all that apply) 
 
 1: class Chicken {} 
 2: interface HenHouse { public java.util.List<Chicken> getChickens(); } 
 3: public class ChickenSong { 
 4:   public static void main(String[] args) { 
 5:     HenHouse house = ______________ 
 6:     Chicken chicken = house.getChickens().get(0); 
 7:     for(int i=0; i<house.getChickens().size();  
 8:       chicken = house.getChickens().get(i++)) { 
 9:       System.out.println("Cluck"); 
 10: } } }
```


- 1 The code will not compile because of line 6.
- 2 The code will not compile because of lines 7–8.
- 3 The application will compile but not produce any output.
- 4 The application will output Cluck exactly once.
- 5 The application will output Cluck more than once.
- 6 The application will compile but produce an exception at runtime.

Answer: *4;5;6*

Arithmetic Operations with rational numbers
===========================================
**29892**
```
Which are true of the following code? (Choose all that apply) 
 
 1:  import java.util.*; 
 2:  public class Grasshopper { 
 3:  public Grasshopper(String n) { 
 4:     name = n; 
 5:  } 
 6:  public static void main(String[] args) { 
 7:  Grasshopper one = new Grasshopper("g1"); 
 8:  Grasshopper two = new Grasshopper("g2"); 
 9:  one = two; 
 10: two = null; 
 11: one = null; 
 12: } 
 13: private String name; }
```


- 1 Immediately after line 9, no grasshopper objects are eligible for garbage collection.
- 2 Immediately after line 10, no grasshopper objects are eligible for garbage collection.
- 3 Immediately after line 9, only one grasshopper object is eligible for garbage collection.
- 4 Immediately after line 10, only one grasshopper object is eligible for garbage collection.
- 5 Immediately after line 11, only one grasshopper object is eligible for garbage collection.
- 6 The code compiles.
- 7 The code does not compile.

Answer: *3;4;6*

Arithmetic Operations with rational numbers
===========================================
**29898**
```
What individual changes, if any, would allow the following code to compile? (Choose all that apply) 
 
 1: public interface Animal { public default String getName() { return null; } } 
 2: interface Mammal { public default String getName() { return null; } } 
 3: abstract class Otter implements Mammal, Animal {}
```


- 1 The code compiles without issue.
- 2 Remove the default method modifier and method implementation on line 1.
- 3 Remove the default method modifier and method implementation on line 2.
- 4 Remove the default method modifier and method implementation on lines 1 and 2.
- 5 Change the return value on line 1 from null to "Animal".
- 6 Override the getName() method with an abstract method in the Otter class.
- 7 Override the getName() method with a concrete method in the Otter class.

Answer: *4;6;7*

Arithmetic Operations with rational numbers
===========================================
**29885**
```
What is the output of the following code? (Choose all that apply) 
 
 1: interface HasTail { int getTailLength(); } 
 2: abstract class Puma implements HasTail { 
 3:   protected int getTailLength() {return 4;} 
 4: } 
 5: public class Cougar extends Puma { 
 6:   public static void main(String[] args) { 
 7:  Puma puma = new Puma(); 
 8:  System.out.println(puma.getTailLength()); 
 9:  } 
 10: 
 11:  public int getTailLength(int length) {return 2;} 
 12: }
```


- 1 2
- 2 4
- 3 The code will not compile because of line 3.
- 4 The code will not compile because of line 5.
- 5 The code will not compile because of line 7.
- 6 The code will not compile because of line 11.
- 7 The output cannot be determined from the code provided.

Answer: *3;4;5*

