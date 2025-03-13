package src;
public class Professor {
    private String name;
    private int age;
    private double heightInCM;
    private String[] education;
    private String email;

    public Professor(){

    }
    public Professor(String name, int age,
                     double heightInCM, String[] education,
                     String email) {
        this.name = name;
        this.age = age;
        this.heightInCM = heightInCM;
        this.education = education;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeightInCM() {
        return heightInCM;
    }

    public void setHeightInCM(double heightInCM) {
        this.heightInCM = heightInCM;
    }

    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}