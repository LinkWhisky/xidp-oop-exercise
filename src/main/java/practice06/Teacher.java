package practice06;

import java.util.Objects;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }
    @Override
    public String introduce() {
        if (Objects.isNull(klass)) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class "+ klass +".";
    }

}
