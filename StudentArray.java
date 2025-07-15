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