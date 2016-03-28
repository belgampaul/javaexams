Choice E
========
Compilation fails.

Output:
Error:(8, 18) java: incompatible types: incompatible parameter types in lambda expression

Notes:

```
Stream ints = Stream.of(1, 2, 3);
ints.forEach((Integer i) -> {System.out.print(i * 2);});
```

**Stream.of(1, 2, 3)** creates a stream of objects. The argument i for the lambda expression is expected to be an Object.
The code works if **ints** is declared as a **Stream<Integer>**. But then it fails with a runtime exception
```Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed```
