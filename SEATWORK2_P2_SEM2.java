 class SEATWORK2_P2_SEM2 {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0; 
        }
    }

   public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private String course;
    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void displayInfo() {
        System.out.println("_____ Student Information _____");
        System.out.println("Name   : " + getName());
        System.out.println("Age    : " + getAge());
        System.out.println("Course : " + getCourse());
        System.out.println("_________________________________");
    }
}

public class SEATWORK2_P2_SEM2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aejie");
        s.setAge(16);
        s.setCourse("BSIT");
        s.displayInfo();
    }
}
