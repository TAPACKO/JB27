package by.cdp.jb27_les06;

public class les06_task02 {

    public static void main(String[] args) {

        Group studentGroup = new Group(7);
        studentGroup.addStudent(new Student("Ivan", 2, 5, 4, 4));
        studentGroup.addStudent(new Student("Olga", 5, 5, 5, 5));
        studentGroup.addStudent(new Student("Vova", 4, 4, 4, 4));
        studentGroup.addStudent(new Student("Sveta", 5, 5, 4, 5));
        studentGroup.addStudent(new Student("Denis", 3, 3, 3, 3));
        studentGroup.addStudent(new Student("Vadim", 5, 5, 4, 2));
        studentGroup.addStudent(new Student("Tanya", 5, 5, 5, 5));


        System.out.println("Average mark of students group: " + studentGroup.getAverageMarkOfGroup());
        System.out.println("Number of excellent pupils in group: " + studentGroup.getNumberOfExcellentPupil());
        System.out.println("Number of students with mark '2' in group: " + studentGroup.getNumberOfStudentsWith2());

    }

}
