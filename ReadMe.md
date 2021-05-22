## Recap 
Arrays - 2 D 
### In Class task
Given a below para
"Alice sits on a riverbank on a warm summer day, drowsily reading over her sister’s shoulder, when she catches sight of a White Rabbit in a waistcoat running by her. The White Rabbit pulls out a pocket watch, exclaims that he is late, and pops down a rabbit hole. Alice follows the White Rabbit down the hole and comes upon a great hallway lined with doors. She finds a small door that she opens using a key she discovers on a nearby table. Through the door, she sees a beautiful garden, and Alice begins to cry when she realizes she cannot fit through the door. She finds a bottle marked “DRINK ME” and downs the contents. She shrinks down to the right size to enter the door but cannot enter since she has left the key on the tabletop above her head. Alice discovers a cake marked “EAT ME” which causes her to grow to an inordinately large height. Still unable to enter the garden, Alice begins to cry again, and her giant tears form a pool at her feet. As she cries, Alice shrinks and falls into the pool of tears. The pool of tears becomes a sea, and as she treads water she meets a Mouse. The Mouse accompanies Alice to shore, where a number of animals stand gathered on a bank. After a “Caucus Race,” Alice scares the animals away with tales of her cat, Dinah, and finds herself alone again."

You have to find out how many times word Alice has been used
and how many words are more than 4 character long.

### Journey So far
variable, data type, classes, object 
String, Arrays, Methods, Constructor, 

## Focus today 
static, encapsulation, polymorphism. 

What is object 
instance of class, if anything get created when object is created
we can call them instance variable or method 

Rule
static members can only access other static member 
they can't access instance member;

Instance member can access both static and non static 
members. 

### Task 2
```java
// Write a class class Counter 
public class Counter {
    // add two variables
    private int instanceCounter ;
    private final static int staticCounter ;
    
    public void incrementCount(){
        instanceCounter++;
        staticCounter++;
    }
    public void printCounter(){
        System.out.println(instanceCounter);
        System.out.println(staticCounter);
    }
}
// create 2 object of Counter , obj1, obj2 
// call incrementCounter, printCounter on obj1 and 
// then call incrementCounter, printCounter on obj2
```

1. constructors can't be static
2. static members are shared among all objects, if one object modifies it
other will see modified value. 
   

### ENUM --> Enumerated Types

Let's assume we are shirt company, we should be creating 
shirt with different sizes and sizes are 
specified as XS,S, M, L, XL, XXL 

```java
class Shirt {
    
}
```

## Encapsulation 
Hiding data 
## Access modifier 
1. public 
2. private 
3. protected 
4. default 

### Overloading
You can use same method name as long as (siganture) argument different 
```java
// void printGreeting() {}   ==> printGreeting()
// void printGreeting(String name){}  ==>  printGreeting(String)
// void printGreeting(String name, int langCode) {} ==>printGreeting(String,int)
```
