package src;
public class CourseTime {
    private int startHour;
    private String dayOfWeek;
    private int durationInHours;
    private Classroom classroom;

    // Assuming Classroom is an inner class or you can define it in a separate file
    public static class Classroom {
        // Define the properties and methods of Classroom class here
    }

    public String toString(){
        String output = "Classroom: "+classroom +"\n";
        output+= "Scheduled Time: "+dayOfWeek+ " " +startHour+"\n";
        output+= "Duration: "+durationInHours+"\n";
        return output;
    }
    public CourseTime(int startHour, String dayOfWeek,
                       Classroom classroom){
        this.startHour=startHour;
        this.dayOfWeek=dayOfWeek;
        this.durationInHours=1;
        this.classroom=classroom;
    }

    public  CourseTime(int startHour, String dayOfWeek,
                       int durationInHours,
                       Classroom classroom){
        this.startHour=startHour;
        this.dayOfWeek=dayOfWeek;
        this.durationInHours=durationInHours;
        this.classroom=classroom;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}