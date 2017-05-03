package safeVarargs;

import java.util.ArrayList;
import java.util.List;
 
public class SafeVarargsAnnotation {
 
 public static void main(String[] args) {
 
  // Scenario 1 -
  // Prior to Java 7, usage of code without @SafeVarargs
  withoutSafeVarargsAnnotation();
 
  // Scenario 2 - 
  // After Java 7, usage of code with @SafeVarargs
  withSafeVarargsAnnotation();  
 
 }
 
 private static void withoutSafeVarargsAnnotation() {
 
  List< Integer > listOfIntegers1 = new ArrayList< >();
  listOfIntegers1.add(1);
  listOfIntegers1.add(2);
  listOfIntegers1.add(3);
  listOfIntegers1.add(4);
  
  List< Integer > listOfIntegers2 = new ArrayList< >();
  listOfIntegers2.add(1);
  
  String[] str1 = {"one","two"};
  String[] str2 = {"one","two"};
  
  Integer[] int1 = {1,2};
  Integer[] int2 = {1,2};
 
  List< Float > listOfFloats = new ArrayList< >();
  listOfFloats.add(3.0f);  
  listOfFloats.add(1.0f);  
  listOfFloats.add(2.0f);  
  listOfFloats.add(3.2f);
 
  // Calling of a method that takes in a generic type of 
  // variable arguments without usage of @SafeVarargs
  // It generates a warning for the developer for the type safety as 
  // Type safety: A generic array of List< ? extends Number&Comparable< ? > > 
  // is created for a varargs parameter
  displaywithoutSafeVarargs(listOfIntegers1 , listOfIntegers2); 
  displaywithoutSafeVarargs(str1,str2);
  displaywithoutSafeVarargs(int1,int2);
  
  addAll(new ArrayList<String>(),   // fine 
        new String[] { 
           "Leonardo da Vinci", 
           "Vasco de Gama" 
        } 
   ); 

  String[] strings = method_1("bad", "karma");
  
  print(int1,int2);
  
 }
 
 @SafeVarargs
public static <T> void print(T ...args) {
	  for (T t : args) {
	      System.out.println(t);
	  }
	}
 
 static <T> T[] method_1(T t1, T t2) { 
     return method_2(t1, t2);                        // unchecked warning 
 } 
 static <T> T[] method_2( T... args) { 
     return args; 
 } 
 
 public static <E> void addAll(List<E> list, E[] array) { 
	  for (E element : array) list.add(element); 
	}
 
 private static <T> void displaywithoutSafeVarargs(Integer[] ...ints) {
	// TODO Auto-generated method stub
	
}

// Also throws a warning for 
 // Type safety: Potential heap pollution via varargs parameter lists
 private static <T> void displaywithoutSafeVarargs(String[] ...args) {
	// TODO Auto-generated method stub
	
}

private static < T > void displaywithoutSafeVarargs(T ...lists) {
 
  for(T element : lists) { 
 
   System.out.println("Display of elements without @SafeVarargs Annotation");
   System.out.println(element.getClass().getName() + ": " + element);
 
  }
 
 }
 
 
 private static void withSafeVarargsAnnotation() {
 
  List< Integer > listOfIntegers = new ArrayList< >();
  listOfIntegers.add(1);
  listOfIntegers.add(2);
  listOfIntegers.add(3);
  listOfIntegers.add(4);
 
  List< Float > listOfFloats = new ArrayList< >();
  listOfFloats.add(3.0f);  
  listOfFloats.add(1.0f);  
  listOfFloats.add(2.0f);  
  listOfFloats.add(3.2f);
 
  displaywithSafeVarargs(listOfIntegers , listOfFloats);
 
 }
 
 // With usage of @SafeVarargs the Type Safety warning has been 
 // supressed
 @SafeVarargs
 private static < T > void displaywithSafeVarargs(T... lists) {
 
  System.out.println();
  for(T element : lists) { 
 
   System.out.println("Display of elements with @SafeVarargs Annotation");
   System.out.println(element.getClass().getName() + ": " + element);
 
  }
 
 }}