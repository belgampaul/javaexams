Choice E
========

Compilation fails.

 
Notes
>Q8.java:12: error: cannot find symbol set.pollFirst();

The set variable is of type **Set**. The set interface does not declare pollFirst() or ceiling() methods. Those belong 
to NavigableSet interface implemented by TreeSet. 


