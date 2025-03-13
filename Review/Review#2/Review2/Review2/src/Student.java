public class Student {
          private String name;
          private int age;
          private String dateOfBirth;
          private String email;
          private String address;
          private String studentID;
          private String major;

          public Student(String name, int age, String dateOfBirth, String email, String address,
                              String studentID, String major) {
                    this.name = name;
                    this.age = age;
                    this.dateOfBirth = dateOfBirth;
                    this.email = email;
                    this.address = address;
                    this.studentID = studentID;
                    this.major = major;
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

          public String getDateOfBirth() {
                    return dateOfBirth;
          }


          public String getEmail() {
                    return email;
          }

          public String getAddress() {
                    return address;
          }

          public String getStudentID() {
                    return studentID;
          }

          public String getMajor() {
                    return major;
          }
}