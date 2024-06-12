package itmo.lab3;

public class Study {
    private String course;
    @Override
    public String toString() {
        return "Study{" +
                "course='" + course + '\'' +
                '}';
    }

    public Study(){

    }
    public Study(String course){
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }

}
