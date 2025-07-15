# <p>Let's Practice: Working with array of Objects<p>
# <p>Interactive Exercise: Working with an Array of Objects<p>
## <p>Objective<p>
### <p>In this exercise, you will create a **Student Management System** in Java that:<p>
#### <p>✅ Stores multiple **Student** objects in an array.<p>
#### <p>✅ Allows users to **input student details** such as name, roll number, age, and height.<p>
#### <p>✅ Computes and displays **statistics** about students, including:<p>
#### <p>**• Average age**<p>
#### <p>**• Average height**<p>
#### <p>**• Oldest student**<p>
#### <p>**• Tallest student**<p>
### <p>By completing this exercise, you will strengthen your skills in **arrays, object-oriented programming, loops, and user input handling in Java**.<p>
## <p>Problem Statement<p>
### <p>Create a Java program that:<p>
#### <p>1️⃣ **Defines a student class** with attributes: name, roll number, age, and height.<p>
#### <p>2️⃣ **Prompts the user to enter multiple students' details**.<p>
#### <p>3️⃣ **Stores these details in an array**.<p>
#### <p>4️⃣ **Computes and displays various student statistics**.<p>
## Outputs
### Student_class
```
public class Student {
    String name;
    int rollNumber;
    int age;
    double height;

public Student(String name, int rollNumber,int age, double height){
    this.name = name;
    this.rollNumber = rollNumber;
    this.age = age;
    this.height = height;

    }
}

```
### StudentArray_Main
```
import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // step 2 :
        System.out.println("How many students do you want to enter? ");
        int numStudents = sc.nextInt();
    // step 3: 
        Student[] students = new Student[numStudents];
    // step 4 : 
        for (int i = 0 ; i< numStudents; i++){
            sc.nextLine();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Roll Number: ");
            int rollNumber = sc.nextInt();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height (in cm): ");
            double height = sc.nextDouble();
    // step 5 : 
            students[i] = new Student(name, rollNumber, age, height);
        }
    // step 6 : 
        calculateAndDisplayStatistics(students);
        sc.close();
    }
    // step 7 : 
    public static void calculateAndDisplayStatistics(Student[] students){
    int totalAge = 0;
    double totalHeight = 0.0;
    int oldestAge = students[0].age;
    double tallestHeight = students[0].height;
    String oldestStudent = students[0].name;
    String tallestStudent = students[0].name;
    for (Student student : students){
        totalAge += student.age;
        totalHeight += student.height;
    if(student.age > oldestAge){
        oldestAge = student.age;
        oldestStudent = student.name;
    }
    if(student.height > tallestHeight){
        tallestHeight = student.height;
        tallestStudent = student.name;
    }
    }
    double averageAge = (double) totalAge / students.length;
    double averageHeight = totalHeight / students.length;

    System.out.println("\n--- Statistics ---");
    System.out.println("Average Age: " + averageAge + "years");
    System.out.println("Average Height: " + averageHeight + " cm ");
    System.out.println("oldest Student: " + oldestStudent + " (Age: ) " + oldestAge + " years ");
    System.out.println(" Tallest Student: " + tallestStudent + " (Height: ) " + tallestHeight + " cm ");

    }
}
```
[githublink](https://github.com/Aromalpriyan/OOPS-Student_Management_System--13)


