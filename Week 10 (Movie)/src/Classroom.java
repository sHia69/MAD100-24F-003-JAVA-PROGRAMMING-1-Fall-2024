package src;
public class Classroom {
    private double areaInMetersSquared;
    private int numberOfSeats;
    //public String roomNumber;
    private  String roomNumber;
    private boolean computerLab;

    /*
        * no-arg constructor
    public Classroom(){

    }
    */

    public Classroom(String roomNumber){
        this.roomNumber=roomNumber;
    }
    // All-arg constructor
    public Classroom(String roomNumber, int numberOfSeats,
                     double areaInMetersSquared, boolean computerLab){
        this.roomNumber=roomNumber;
        this.numberOfSeats=numberOfSeats;
        this.areaInMetersSquared=areaInMetersSquared;
        this.computerLab=computerLab;
    }

    public String getRoomNumber(){
        return this.roomNumber;
    }
    public double getAreaInMetersSquared (){
        return this.areaInMetersSquared;
    }
    public void setAreaInMetersSquared(double value){
        this.areaInMetersSquared=value;
    }
    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
    public void setNumberOfSeats(int numOfSeats){
        this.numberOfSeats=numOfSeats;
    }
    public boolean isComputerLab(){
        return this.computerLab;
    }
    public void setComputerLab(boolean compLab){
        this.computerLab=compLab;
    }
    public String toString(){
        return "Room: "+this.roomNumber+ " capacity: "+this.numberOfSeats;
    }
}





