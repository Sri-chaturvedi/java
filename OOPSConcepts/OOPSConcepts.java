/*
=====================================================================================
📘 PROGRAM NAME  : Complete OOPS Concepts in Java
📂 PACKAGE       : OOPS.Concepts
💡 TOPIC         : Encapsulation, Inheritance, Polymorphism, Abstraction, Constructors, etc.
✍️ AUTHOR        : Srijendra Nath Chaturvedi
📅 DESCRIPTION   :
   This program demonstrates ALL major Object-Oriented Programming concepts in Java
   through simple, understandable, and executable examples.

=====================================================================================
🎯 OOPS CONCEPTS COVERED:
1️⃣ CLASS & OBJECT
2️⃣ CONSTRUCTORS (Default, Parameterized, Copy)
3️⃣ 'THIS' KEYWORD
4️⃣ INHERITANCE (Single, Multilevel, Hierarchical)
5️⃣ POLYMORPHISM (Compile-time + Runtime)
6️⃣ ENCAPSULATION
7️⃣ ABSTRACTION (Abstract Class + Interface)
8️⃣ STATIC Keyword
9️⃣ ACCESS MODIFIERS (Public, Private, Protected, Default)
=====================================================================================
*/

package OOPSConcepts;

// ===============================================
// 1️⃣ CLASS & OBJECT + CONSTRUCTORS
// ===============================================
class Student {
    String name;
    int age;

    // 🔹 Default Constructor
    Student() {
        System.out.println("Default Constructor Called");
    }

    // 🔹 Parameterized Constructor
    Student(String name, int age) {
        this.name = name;  // using 'this' keyword
        this.age = age;
    }

    // 🔹 Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // 🔹 Method
    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}


// ===============================================
// 2️⃣ 'THIS' KEYWORD EXAMPLE
// ===============================================
class ThisExample {
    int x;

    ThisExample(int x) {
        this.x = x;  // 'this' refers to current object
    }

    void show() {
        System.out.println("Value of x: " + x);
    }
}


// ===============================================
// 3️⃣ INHERITANCE EXAMPLES
// ===============================================

// 🔸 Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats food 🍎");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks 🐶");
    }
}

// 🔸 Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps softly 🐾");
    }
}

// 🔸 Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows 🐱");
    }
}


// ===============================================
// 4️⃣ POLYMORPHISM
// ===============================================

// 🔹 Compile-time Polymorphism (Method Overloading)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// 🔹 Runtime Polymorphism (Method Overriding)
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key 🚗");
    }
}


// ===============================================
// 5️⃣ ENCAPSULATION
// ===============================================
class Account {
    private String username;
    private double balance;

    // Getter and Setter methods (data hidden)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
    }

    void showDetails() {
        System.out.println("Account Holder: " + username + ", Balance: ₹" + balance);
    }
}


// ===============================================
// 6️⃣ ABSTRACTION (ABSTRACT CLASS & INTERFACE)
// ===============================================

// 🔹 Abstract Class Example
abstract class Shape {
    abstract void calculateArea(); // Abstract method (no body)

    void displayShape() {
        System.out.println("This is a geometric shape 🔷");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}

class Rectangle extends Shape {
    double length = 6, width = 4;

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area = " + area);
    }
}

// 🔹 Interface Example
interface AnimalActions {
    void eat();
    void sleep();
}

class Lion implements AnimalActions {
    public void eat() {
        System.out.println("Lion eats meat 🦁");
    }
    public void sleep() {
        System.out.println("Lion sleeps 12 hours a day 😴");
    }
}


// ===============================================
// 7️⃣ STATIC KEYWORD EXAMPLE
// ===============================================
class StaticExample {
    static int count = 0; // shared across all objects
    String name;

    StaticExample(String name) {
        this.name = name;
        count++;
    }

    static void showCount() {
        System.out.println("Total Objects Created: " + count);
    }
}


// ===============================================
// 🚀 MAIN CLASS — DRIVER CODE
// ===============================================
public class OOPSConcepts {
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("🧱 CLASS, OBJECT & CONSTRUCTORS");
        System.out.println("==============================================");
        Student s1 = new Student("Aman", 21);
        Student s2 = new Student(s1); // copy constructor
        s1.display();
        s2.display();

        System.out.println("\n==============================================");
        System.out.println("🔹 THIS KEYWORD");
        System.out.println("==============================================");
        ThisExample t = new ThisExample(42);
        t.show();

        System.out.println("\n==============================================");
        System.out.println("🐾 INHERITANCE (Single, Multilevel, Hierarchical)");
        System.out.println("==============================================");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println("\n==============================================");
        System.out.println("⚙️ POLYMORPHISM");
        System.out.println("==============================================");
        Calculator calc = new Calculator();
        System.out.println("add(2, 3) = " + calc.add(2, 3));
        System.out.println("add(2.5, 3.7) = " + calc.add(2.5, 3.7));
        System.out.println("add(2, 3, 4) = " + calc.add(2, 3, 4));

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        v1.start();
        v2.start();

        System.out.println("\n==============================================");
        System.out.println("🔐 ENCAPSULATION");
        System.out.println("==============================================");
        Account acc = new Account();
        acc.setUsername("ShreeChaturvedi");
        acc.setBalance(10000);
        acc.showDetails();

        System.out.println("\n==============================================");
        System.out.println("🧩 ABSTRACTION (Abstract Class & Interface)");
        System.out.println("==============================================");
        Shape s = new Circle();
        s.displayShape();
        s.calculateArea();

        Shape r = new Rectangle();
        r.displayShape();
        r.calculateArea();

        Lion l = new Lion();
        l.eat();
        l.sleep();

        System.out.println("\n==============================================");
        System.out.println("🧮 STATIC KEYWORD");
        System.out.println("==============================================");
        StaticExample e1 = new StaticExample("One");
        StaticExample e2 = new StaticExample("Two");
        StaticExample.showCount();

        System.out.println("\n✅ All OOP Concepts Demonstrated Successfully!");
    }
}
