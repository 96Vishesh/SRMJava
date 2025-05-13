interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class Triangle implements Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int... marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int totalMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public int totalMarks(int bonus) {
        return totalMarks() + bonus;
    }

    public int totalMarks(int bonus, int subjectCount) {
        int sum = 0;
        for (int i = 0; i < subjectCount && i < marks.length; i++) {
            sum += marks[i];
        }
        return sum + bonus;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks());
    }
}

public class shapes {
    public static void main(String[] args) {
        Student student = new Student("Vishesh", 101, 85, 90, 78);
        student.display();
        System.out.println("Total Marks with Bonus (10): " + student.totalMarks(10));
        System.out.println("Total Marks for first 2 subjects with Bonus (5): " + student.totalMarks(5, 2));
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape triangle = new Triangle(6, 3);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Square Area: " + square.area());
        System.out.println("Triangle Area: " + triangle.area());
    }
}
