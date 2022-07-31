package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class "+ klass.getNumber() +".";
    }

    public String introduceWith(Student jerry) {
        if (jerry.getKlass().getNumber() == this.getKlass().getNumber()) {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach "+ jerry.getName() +".";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach " + jerry.getName() + ".";
    }
}
