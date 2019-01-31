package by.cdp.jb27_les06;

public class Group {

    private Student[] studentGroup;
    private static int index = 0;

    public Group(int amountOfStudents) {
        studentGroup = new Student[amountOfStudents];
    }

    public void addStudent(Student student) {
        if (index < studentGroup.length) {
            studentGroup[index] = student;
            index++;
        } else {
            System.out.println("Can't add  more students. Students group is full.");
        }
    }

    public double getAverageMarkOfGroup() {
        double summ = 0;
        for (int i = 0; i < studentGroup.length; i++) {
            summ += studentGroup[i].getAverageMark();
        }
        return summ / studentGroup.length;
    }

    public int getNumberOfExcellentPupil() {
        int count = 0;
        for (int i = 0; i < studentGroup.length; i++) {
            if (studentGroup[i].getAverageMark() == 5) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfStudentsWith2() {
        int count = 0;
        for (int i = 0; i < studentGroup.length; i++) {
            if (studentGroup[i].getHistoryMark() == 2
                    || studentGroup[i].getMathMark() == 2
                    || studentGroup[i].getEnglishMark() == 2
                    || studentGroup[i].getChemistryMark() == 2) {
                count++;
            }
        }
        return count;
    }

}
