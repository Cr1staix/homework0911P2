import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Students studentsGroupA = new Students();
        studentsGroupA.addNewStudent("Вася");
        studentsGroupA.addNewStudent("Дима");
        studentsGroupA.addNewStudent("Петя");
        studentsGroupA.addNewStudent("Ксюша");
        studentsGroupA.addNewStudent("Валера");


        Students studentsGroupB = new Students();
        studentsGroupB.addNewStudent("Боб");
        studentsGroupB.addNewStudent("Джон");
        studentsGroupB.addNewStudent("Джесика");


        studentsGroupA.mergingLists(studentsGroupB.getStudents());
        System.out.println(studentsGroupA);


        studentsGroupA.removeStudent("Боб");
        studentsGroupA.removeStudent(studentsGroupA.getStudents().get(0));
        System.out.println(studentsGroupA);


        studentsGroupA.checkNameRepeat("Боб");
        studentsGroupA.checkNameRepeat("Валера");


        Students studentsGroupC = new Students();
        studentsGroupC.addNewStudent("Боб");
        studentsGroupC.addNewStudent("Джон");
        studentsGroupC.addNewStudent("Джесика");
        studentsGroupB.checkNameInLists(studentsGroupC.getStudents());


        System.out.println(studentsGroupA.getStudentsValue());
        studentsGroupC.checkEmpty();
        studentsGroupC.clearList();
        System.out.println(studentsGroupC);
    }
}