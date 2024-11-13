import java.util.ArrayList;
import java.util.List;

/**
 * Класс создает объект типа студент и заносит его в список.
 */
public class Students {
    private List<String> students = new ArrayList<>();

    /**
     * Метод для создания и добавления нового студента в список.
     *
     * @param name Принимает параметр имя Студента.
     */
    public void addNewStudent(String name) {
        students.add(name);
    }

    /**
     * Метод для объединения двух списков содержащих студентов.
     *
     * @param group Принимает в качестве параметра список List<String>.
     */
    public void mergingLists(List<String> group) {
        students.addAll(group);
    }

    /**
     * Метод для удаления студента.
     *
     * @param name Принимает в качестве параметра имя студента.
     */
    public void removeStudent(String name) {
        students.remove(name);
    }

    /**
     * Метод проверяет есть ли совпадения имени в списке.
     *
     * @param name Принимает в качестве параметра имя студента.
     */
    public void checkNameRepeat(String name) {
        if (students.contains(name)) {
            System.out.println("Студент с именем " + name + " есть в группе");
        } else {
            System.out.println("Студента с именем " + name + " нет в группе");
        }
    }

    /**
     * Метод сравнивает все имена студентов из списков.
     *
     * @param student Принимает в качестве параметра список List<String>.
     */
    public void checkNameInLists(List<String> student) {
        if (students.containsAll(student)) {
            System.out.println("Все имена студентов в группах совпадают");
        } else {
            System.out.println("Не все имена студентов в группах совпадают");
        }
    }

    /**
     * Метод указывает сколько студентов содержится в списке.
     *
     * @return Возвращает количество студентов в списке.
     */
    public String getStudentsValue() {
        return "Количество студентов в группе - " + students.size();
    }

    /**
     * Метод для проверки списка на пустоту.
     */
    public void checkEmpty() {
        if (students.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("В списке есть имена студентов");
        }
    }

    /**
     * Метод для очистки всего списка.
     */
    public void clearList() {
        students.clear();
    }

    public List<String> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Студенты группы " + students;
    }
}
