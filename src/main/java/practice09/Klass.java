package practice09;

public class Klass {
    private int number;

    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() == this) {
            this.leader = student;
        }else {
            System.out.println("It is not one of us.");
        }

    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}
