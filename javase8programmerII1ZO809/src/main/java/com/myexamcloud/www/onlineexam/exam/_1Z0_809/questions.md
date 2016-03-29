Topic : Generics and Collections
================================
**Question 1 of 29:**
```
Given
 1. import java.util.stream.Stream;
 2.
 3. public class MyExamCloud {
 4. public static void main(String [ ] args){
 5. Stream ints = Stream.of(1,2,3);
 6. ints.forEach((Integer i) -> {System.out.print(i*2);});
 7. ints.forEach(System.out::print);
 8. }
 9. }
 What is the output?
  
```

Select any one of given answer :
- Choice A 123246
- Choice B 246123
- Choice C 246 followed by an exception.
- Choice D No output
- Choice E Compilation fails.

Topic : Exceptions and Assertions
=================================
**Question 2 of 29:**
```
Given
 1. class MyExamCloud{
 2. public static void main(String [] args){
 3. new MyExamCloud().go();
 4. }
 5. void go(){
 6. System.out.print("A ");
 7. try{
 8. run(0);
 9. System.out.print("B ");
 10. }catch (Exception e){
 11. System.out.print("C ");
 12. }finally{
 13. System.out.print("D ");
 14. }
 15. }
 16. void run (int i){
 17. try{
 18. System.out.print("E ");
 19. int x = 5/i;
 20. System.out.print("F ");
 21. }catch(NumberFormatException e2){
 22. System.out.print("G ");
 23. }finally{
 24. System.out.print("H ");
 25. }
 26. }
 27. }
 
 What will be the result?
```

Select any one of given answer :
- Choice A A E G H C D
- Choice B A E H B C D
- Choice C A E H C D
- Choice D A E H C D followed by an uncaught exception.
- Choice E Compilation fails

Topic : Generics and Collections
================================
**Question 3 of 29:**
```
Which of the following lambda can be used for String typed Comparable?
```

Select any one of given answer :
- Choice A s -> return s.length()
- Choice B s -> s.isEmpty();
- Choice C s -> s;
- Choice D s -> s.hashCode();
- Choice E None of above.

Topic : Java Concurrency
========================
**Question 4 of 29:**
```
Assume that there are two private integer variables called i and j in your class. Which of the following will prevent the memory consistency error?
  
```

Select any one of given answer :
- Choice A Public double divide(){synchronized(I,j) {return (i/j);}} Public void set(int i, int j){ synchronized(I,j) {this.i =I; this.j=j; }}
- Choice B Public double divide(){synchronized(i) {return (i/j);}} Public void set(int i, int j){ synchronized(j) {this.i =I; this.j=j; }}
- Choice C Public synchronized(this) double divide(){return (i/j);} Public synchronized(this) void set(int i, int j){ this.i =I; this.j=j; }
- Choice D Public double divide(){synchronized {return (i/j);}} Public void set(int i, int j){ synchronized {this.i =I; this.j=j; }}
- Choice E Public double divide(){synchronized(this) {return (i/j);}} Public void set(int i, int j){ synchronized(this) {this.i =I; this.j=j; }}

Topic : Java I/O Fundamentals
=============================
**Question 5 of 29:**
```
Given
 1. import java.io.Console;
 2.
 3. public class MyExamCloud {
 4. public static void main(String [ ] args){
 5. Console c = System.console();
 6. _ _ _ _ _ _ _ _ oldPassword = c.readPassword("password: ");
 7. }
 8. }
 Which of the following can be used to fill the blank?
```

Select any one of given answer :
- Choice A String
- Choice B String[]
- Choice C char[]
- Choice D Console
- Choice E None of above.

Topic : Java Concurrency
========================
**Question 6 of 29:**
```
Which of the followings is true?
```

Select any one of given answer :
- Choice A The ForkJoinTask class can't return a result.
- Choice B The ForkJoinTask is a sub class of RecursiveTask class.
- Choice C The ForkJoinTask class has only the "fork()" and "join()" methods.
- Choice D None of above.

Topic : Java File I/O (NIO.2)
=============================
**Question 7 of 29:**
```
Given
 1. import java.io.IOException;
 2. import java.nio.*;
 3. import java.nio.file.*;
 4. import java.util.*;
 5. import java.util.stream.*;
 6.
 7. public class MyExamCloud{
 8. public static void main(String[] args){
 9. try{
 10. Path path = Paths.get("input.txt");
 11. Stream stream = Files.readAllLines(path) ;
 12. stream.limit(1).forEach(System.out::print);
 13. }catch(IOException ex){
 14. System.out.println("Error!");
 15. }
 16. }
 17. }
 Content of the input.txt :
 C
 B
 A
 What is the output?
  
```

Select any one of given answer :
- Choice A CBA
- Choice B A
- Choice C C
- Choice D Error!
- Choice E Compilation fails.

Topic : Generics and Collections
================================
**Question 8 of 29:**
```
Given
 1. import java.util.Set;
 2. import java.util.TreeSet;
 3.
 4. public class MyExamCloud {
 5.
 6. public static void main(String [ ] args){
 7. Set set = new TreeSet<>();
 8. set.add("A");
 9. set.add("D");
 10. set.pollFirst();
 11. System.out.println(set.ceiling("C"));
 12. }
 13. }
 
 What is the output?
  
```

Select any one of given answer :
- Choice A D
- Choice B A
- Choice C null
- Choice D An Exception.
- Choice E Compilation fails.

Topic : Java Stream API
=======================
**Question 9 of 29:**
```
Given
 1. import java.util.Optional;
 2.
 3. public class MyExamCloud{
 4. public static void main(String[] args){
 5.
 6. String[] in = new String[3];
 7.
 8. String op1 = Optional.of(in[2]).orElse("Empty");
 9.
 10. System.out.println(op1);
 11. }
 12. }
 What is the output?
  
```

Select any one of given answer :
- Choice A Empty
- Choice B Null
- Choice C NullPointerException
- Choice D NoSuchElementException
- Choice E Compilation fails.

Topic : Java Class Design
=========================
**Question 10 of 29:**
```
Given
 1. interface I{ }
 2.
 3. abstract class A implements I{ }
 4.
 5. class B extends A { }
 6.
 7. class MyExamCloud{
 8. public static void main(String [] args){
 9. I i = new B();
 10. A a = new B();
 11.
 12. boolean t1 = i instanceof I ,t2 = a instanceof I;
 13.
 14. System.out.print(t1 +" " + t2);
 15. }
 16. }
 What is the output?
```

Select any one of given answer :
- Choice A The output will be true true
- Choice B The output will be true false
- Choice C The output will be false false
- Choice D Compilation fails due to error at line 15.
- Choice E Compilation fails due to multiple errors.

Topic : Building Database Applications with JDBC
================================================
**Question 11 of 29:**
```
Which of the following can be used to execute stored procedures that may contain both input and output parameters?
```

Select any one of given answer :
- Choice A statement
- Choice B ResultSet
- Choice C PreparedStatement
- Choice D CallableStatement
- Choice E None of above.

Topic : Java File I/O (NIO.2)
=============================
**Question 12 of 29:**
```
Given
 1. import java.util.stream.*;
 2.
 3. public class MyExamCloud{
 4. public static void main(String[] args){
 5. Stream ints = Stream.of(3,6,0,4);
 6. ints.sorted().peek(System.out::print).findFirst();
 7. }
 8. }
 What is the output?
  
```

Select any one of given answer :
- Choice A No output.
- Choice B 3604
- Choice C 3
- Choice D 0
- Choice E Compilation fails.

Topic : Java File I/O (NIO.2)
=============================
**Question 13 of 29:**
```
Given
 1. import java.io.IOException;
 2. import java.nio.file.Path;
 3. import java.nio.file.Paths;
 4.
 5. public class MyExamCloud {
 6. public static void main(String [ ] args) throws IOException{
 7. Path p1 = Paths.get("in\\new");
 8. Path p2 = Paths.get("file.txt");
 9. System.out.println(p1.resolve(p2));
 10. }
 11. }
 What is the output?
```

Select any one of given answer :
- Choice A in\new\file.txt
- Choice B new\file.txt
- Choice C file.txt
- Choice D An Exception.
- Choice E Compilation fails.

Topic : Building Database Applications with JDBC
================================================
**Question 14 of 29:**
```
Given
 1. import java.sql.Connection;
 2. import java.sql.DriverManager;
 3. import java.sql.SQLException;
 4. import java.sql.Statement;
 5.
 6. public class MyExamCloud {
 7.
 8. public static void main(String[] args) throws ClassNotFoundException, SQLException {
 9.
 10. Class.forName("com.mysql.jdbc.Driver");
 11. Connection conn = null;
 12. Statement stmt = null;
 13. String sql;
 14.
 15. conn = DriverManager.getConnection("jdbc:mysql://localhost/?" +
 16. "user=root&password=Admin123");
 17. stmt = conn.createStatement();
 18. sql = "create database db";
 19. System.out.println(stmt.executeQuery(sql));
 20. }
 21. }
 
 What is the output?
  
```

Select any one of given answer :
- Choice A True will be printed and a new database with name "db" will be created.
- Choice B False will be printed and a new database with name "db" will be created.
- Choice C False will be printed but a new database won't be created.
- Choice D An Exception.
- Choice E Compilation fails.

Topic : Building Database Applications with JDBC
================================================
**Question 15 of 29:**
```
Given
 1. import java.sql.*;
 2.
 3. public class MyExamCloud{
 4. public static void main(String[] args) throws ClassNotFoundException, SQLException {
 5. Class.forName("com.mysql.jdbc.Driver");
 6. Connection conn = null;
 7. Statement stmt = null;
 8. String sql;
 9. conn = DriverManager.getConnection("jdbc:mysql://localhost/db?" +
 10. "user=root&password=Admin123");
 11. stmt = conn.createStatement();
 12. sql = "DESC persons";
 13. ResultSet rs = stmt.executeQuery(sql);
 14. rs.first();
 15. rs.next();
 16. System.out.println(rs.getString(1));
 17. }
 18. }
 
 Consider following table structure for the person table.
 
 <img alt="" src="/onlineexam/common/getAttachmentData.html?attachmentId=8249" style="height:158px; width:479px">
 What is the output?
```

Select any one of given answer :
- Choice A LastName
- Choice B PersonID
- Choice C varchar(255)
- Choice D YES
- Choice E Compilation fails.

Topic : Java Stream API
=======================
**Question 16 of 29:**
```
Given
 1. import java.util.stream.Stream;
 2. public class MyExamCloud {
 3. public static void main(String [ ] args){
 4. Stream ints = Stream.of(1,2,3);
 5. int i = ints.skip(1).limit(1).count();
 6. System.out.println(i);
 7. }
 8. }
 What is the output?
  
```

Select any one of given answer :
- Choice A 3
- Choice B 1
- Choice C 2
- Choice D 0
- Choice E Compilation fails.

Topic : Generics and Collections
================================
**Question 17 of 29:**
```
Given
 1. import java.util.Map;
 2. import java.util.TreeMap;
 3. import java.util.HashMap;
 4.
 5. public class MyExamCloud {
 6. public static void main(String [ ] args){
 7. Map map = new HashMap<>();
 8. map.put("One",1);
 9. map.put("Two",2);
 10. map.put("Three",3);
 11. map.put("Four",4);
 12. TreeMap tmap = new TreeMap(map);
 13. System.out.println(tmap.ceilingKey("O"));
 14. }
 15. }
 
 What is the output?
```

Select any one of given answer :
- Choice A One=1
- Choice B One
- Choice C 2
- Choice D Two
- Choice E Compilation fails.

Topic : Building Database Applications with JDBC
================================================
**Question 18 of 29:**
```
Consider following steps
 1. Create a statement.
 2. Establishing a connection.
 3. Execute the query.
 4. Close the connection
 5. Process the ResultSet object.
 What is the correct order of above steps to process any SQL statement with JDBC?
```

Select any one of given answer :
- Choice A 1,2,3,4,5
- Choice B 2,1,3,5,4
- Choice C 1,2,3,5,4
- Choice D 2,1,3,4,5
- Choice E 2,5,1,3,4

Topic : Java Class Design
=========================
**Question 19 of 29:**
```
Given
 1. public class MyExamCloud {
 2. static{x = 15;}
 3. MyExamCloud(){
 4. x = 5;
 5. }
 6. static int x = 0;
 7.
 8. public static void main(String [ ] args){
 9. MyExamCloud mec = new MyExamCloud();
 10. System.out.println(x);
 11. }
 12. static{x = 10;}
 13. }
 
 What is the result?
  
```

Select any one of given answer :
- Choice A 0
- Choice B 5
- Choice C 10
- Choice D 15
- Choice E Compilation fails.

Topic : Use Java SE 8 Date/Time API
===================================
**Question 20 of 29:**
```
Given
 1. import java.time.Duration;
 2. import java.time.LocalDate;
 3.
 4. public class MyExamCloud {
 5. public static void main(String [ ] args){
 6. LocalDate ld0 = LocalDate.of(2015,1,27);
 7. LocalDate ld1 = LocalDate.of(2015,1,31);
 8. Duration due = Duration.between(ld0, ld1);
 9. System.out.println(due);
 10. }
 11. }
 
 What is the output?
```

Select any one of given answer :
- Choice A PT96H
- Choice B PT4D
- Choice C PT3D
- Choice D An Exception.
- Choice E Compilation fails.

Topic : Use Java SE 8 Date/Time API
===================================
**Question 21 of 29:**
```
Which of the following can be used to create a MonthDay instance?
```

Select any one of given answer :
- Choice A new MonthDay(10,28);
- Choice B MonthDay.get(10,28);
- Choice C MonthDay.of(10,28);
- Choice D MonthDay.of(28,Month.OCTOBER);
- Choice E None of above.

Topic : Java I/O Fundamentals
=============================
**Question 22 of 29:**
```
Given
 1. import java.io.FileReader;
 2. import java.io.IOException;
 3.
 4. public class MyExamCloud {
 5. public static void main(String [ ] args) throws IOException{
 6. FileReader fr = new FileReader("new.txt");
 7. System.out.println(fr.read());
 8. fr.close();
 9. }
 10. }
 Content of the new.txt : ABCD
 What is the output?
```

Select any one of given answer :
- Choice A ABCD
- Choice B A
- Choice C 65
- Choice D Compilation fails due to error at line 6.
- Choice E Compilation fails due multiple errors.

Topic : Exceptions and Assertions
=================================
**Question 23 of 29:**
```
Given the following set of classes:
 class Exception A extends Exception {}
 class Exception B extends A {}
 class Exception C extends B {}
 
 What is the correct sequence of catch blocks for the following try block?
 try {
 // codes
 }
  
```

Select any one of given answer :
- Choice A Catch Exception, A, B,C
- Choice B Catch Exception, C, B, and A
- Choice C Catch A, B, C, and Exception
- Choice D Catch C,B,A and Exception
- Choice E Any order.

Topic : Exceptions and Assertions
=================================
**Question 24 of 29:**
```
Given
 1. public class MyExamCloud{
 2. public static void main(String args[]){
 3. double d = 0;
 4. try{
 5. d = Double.parseDouble("6d");
 6. }
 7. System.out.print(d);
 8. catch(NumberFormatException e){
 9. System.out.print("Number Format Exception");
 10. }
 11. }
 12. }
 
 What is the output?
```

Select any one of given answer :
- Choice A 6
- Choice B 6d
- Choice C 6.0
- Choice D Number Format Exception
- Choice E Compilation fails.

Topic : Localization
====================
**Question 25 of 29:**
```
Given
 1. import java.util.*;
 2.
 3. class MyExamCloud{
 4. public static void main(String args[]){
 5. Locale ENUS = new Locale.Builder().setLanguage("en").setRegion("US").build();
 6. System.out.print(ENUS.getDisplayLanguage(new Locale("fr")));
 7. }
 8. }
 
 What is the output?
```

Select any one of given answer :
- Choice A Code will print the word "English" in English language (English).
- Choice B Code will print the word "english" in French language (anglais).
- Choice C Code will print the word "anglais" in English language (English).
- Choice D Code will print the word "french" in French language (french).
- Choice E Code will print the word "United States" in French language (Etats-Unis).

Topic : Generics and Collections
================================
**Question 26 of 29:**
```
Given
 1. import java.util.Comparator;
 2.
 3. public class MyExamCloud {
 4. public static void main(String [ ] args){
 5. Comparator comp = Comparator.nullsLast(Integer::compare);
 6. System.out.println(comp.compare(null, 10));
 7. }
 8. }
 What is the output?
```

Select any one of given answer :
- Choice A -1
- Choice B 1
- Choice C 0
- Choice D A NullPointerException.
- Choice E Compile Error at line 6      

Topic : Use Java SE 8 Date/Time API
===================================
**Question 27 of 29:**
```
Given
 1. import java.time.LocalDate;
 2. import java.time.Period;
 3.
 4. public class MyExamCloud {
 5. public static void main(String[] args){
 6. Period period = Period.of(1, 2, 1);
 7. LocalDate loc = LocalDate.of(2015, 1, 1);
 8. loc = loc.plusDays(period.getDays());
 9. System.out.println(loc);
 10. }
 11. }
 
 What is the result?
  
```

Select any one of given answer :
- Choice A 2015-01-01
- Choice B 2015-01-02
- Choice C 2015-01-03
- Choice D 2015-01-04
- Choice E Compilation fails.

Topic : Advanced Class Design
=============================
**Question 28 of 29:**
```
Which of following represents a correct abstract class?
```

Select any one of given answer :
- Choice A abstract class A{ public meth() { } }
- Choice B abstract class A{ public void meth(); }
- Choice C class A{ public void meth(); }
- Choice D final abstract class A{ public abstract void meth(); }
- Choice E None of above.

Topic : Generics and Collections
================================
**Question 29 of 29:**
```
Given
 1. import java.util.ArrayDeque;
 2.
 3. public class MyExamCloud {
 4.
 5. public static void main(String [ ] args){
 6. ArrayDeque ad = new ArrayDeque<>();
 7. ad.add(6);
 8. ad.add(2);
 9. ad.offerLast(3);
 10. ad.offer(4);
 11. ad.poll();
 12. System.out.println(ad);
 13. }
 14. }
 
 What is the output?
```

Select any one of given answer :
- Choice A [6, 2, 1]
- Choice B [6, 2, 3]
- Choice C [2, 3, 4]
- Choice D [6, 2, 3, 4]
- Choice E Compilation fails.

