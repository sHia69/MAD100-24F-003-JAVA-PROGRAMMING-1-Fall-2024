public class Course {
    private Professor professor;
    private Student[] students;
    private CourseTime[] courseTimes;
    private String name;
    private String code;

    public Course (String name, String code){
        this.name=name;
        this.code=code;
    }

    public Course (String name, String code, Professor professor,
                   Student[] students, CourseTime[] courseTimes){
        this.name=name;
        this.code=code;
        this.professor=professor;
        this.students=students;
        this.courseTimes=courseTimes;
    }

    public String toString(){
        String output = ""+code + " - "+name+"\n";
        output += "Professor: "+ professor + "\n";
        output+="CourseTimes: \n";
        for (int i =0; i<courseTimes.length;i++){
            output += courseTimes[i] + "\n";
        }
        output+="Students:\n";
        for (int i =0; i<students.length;i++){
            output += students[i] + "\n";
        }
        return output;

    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public CourseTime[] getCourseTimes() {
        return courseTimes;
    }

    public void setCourseTimes(CourseTime[] courseTimes) {
        this.courseTimes = courseTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}