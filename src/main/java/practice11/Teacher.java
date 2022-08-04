package practice11;


import java.util.LinkedList;
import java.util.Objects;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.classes = klass;
    }

    @Override
    public String introduce() {
        if (Objects.isNull(classes)) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        String[] arrayOfClasses = new String[classes.size()];
        for (int i = 0; i < classes.size(); i++) {
            arrayOfClasses[i] = String.valueOf(classes.get(i).getNumber());
        }
        String stringOfClassed;
        stringOfClassed = String.join(", ", arrayOfClasses);
        return super.introduce() + " I am a Teacher. I teach Class "+ stringOfClassed + ".";
    }

    public String introduceWith(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return "My name is Tom. I am 21 years old. I am a Teacher. I teach "+ student.getName() +".";
            }
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }


    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }
}
