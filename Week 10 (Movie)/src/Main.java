package src;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Classroom a0341 = new Classroom("A0341");
        Classroom a0346 = new Classroom("A0346", 40,
                100, true);
        a0346.getRoomNumber();
        a0341.getRoomNumber();
        a0341.setNumberOfSeats(49);
        a0341.setComputerLab(true);
        a0341.setAreaInMetersSquared(120);
        System.out.println(a0341);
        System.out.println(a0346);
        //System.out.println(a0341.roomNumber);
        System.out.println(a0341.getRoomNumber());
        //a0341.areaInMetersSquared = 5;


        Professor franco = new Professor("Franco Iacobacci",36,194,
                new String[]{"Bachelors CS","Computer Systems Networking"},
                "fiacobacci@stclaircollege.ca");
    }
}