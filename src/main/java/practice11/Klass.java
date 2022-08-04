package practice11;


public class Klass {
    private final int number;

    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void setLeader(Student student) {
        this.leader = student;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() == this) {
            this.leader = student;
            System.out.println("I am Tom. I know Jerry become Leader of Class 2.");
        }else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        System.out.println("I am Tom. I know Jerry has joined Class 2.");
    }

    public boolean isIn (Student student) {
        return this.equals(student.getKlass());
    }

}
