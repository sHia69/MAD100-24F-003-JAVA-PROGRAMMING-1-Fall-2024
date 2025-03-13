public class Example2Main {
        public static void main(String[] args) {
            Classroom a0341 = new Classroom("A0341");
            Classroom a0346 = new Classroom("A0346", 40,
                    100, true);
            a0341.setNumberOfSeats(49);
            a0341.setComputerLab(true);
            a0341.setAreaInMetersSquared(120);
            Professor franco = new Professor("Franco Iacobacci",36,194,
                    new String[]{"Bachelors CS","Computer Systems Networking"},
                    "fiacobacci@stclaircollege.ca");
    
            Course mad100_003 = new Course("java Programming I", "MAD100");
            mad100_003.setProfessor(franco);
            mad100_003.setCourseTimes(new CourseTime[]{
                    new CourseTime(11, "Thursday", 2, a0341),
                    new CourseTime(11, "Friday", 3, a0341)
            });
            mad100_003.setStudents(new Student[]{
                    new Student(1,"Adam Larsh"),
                    new Student(2, "Hia"),
                    new Student(3, "Obaid")
            });
            Course mit409_001 = new Course("Linux Server Administration", "MIT409");
            mit409_001.setProfessor(franco);
            mit409_001.setCourseTimes(new CourseTime[]{
                    new CourseTime(15, "Wednesday", 2, a0346),
                    new CourseTime(14, "Thursday", 2, a0346)
            });
            mit409_001.setStudents(new Student[]{
                    new Student(1,"Sarah"),
            });
            System.out.println(mad100_003);
    
            System.out.println("--------------------------------------");
            System.out.println(mit409_001);
        }
    }