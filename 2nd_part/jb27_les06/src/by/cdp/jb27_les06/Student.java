package by.cdp.jb27_les06;

public class Student {

    private String name;
    private int englishMark;
    private int mathMark;
    private int chemistryMark;
    private int historyMark;

    public Student(String name, int englishMark, int mathMark, int chemistryMark, int historyMark) {
        this.name = name;
        this.englishMark = englishMark;
        this.mathMark = mathMark;
        this.chemistryMark = chemistryMark;
        this.historyMark = historyMark;
    }

    public String getName() {
        return name;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public int getMathMark() {
        return mathMark;
    }

    public int getChemistryMark() {
        return chemistryMark;
    }

    public int getHistoryMark() {
        return historyMark;
    }

    public double getAverageMark(){
        return (getEnglishMark() + getChemistryMark() + getMathMark() + getHistoryMark()) / 4;
    }
}
