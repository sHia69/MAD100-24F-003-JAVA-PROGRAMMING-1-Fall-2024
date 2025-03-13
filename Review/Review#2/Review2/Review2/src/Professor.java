public class Professor {
          private String name;
          private int age;
          private String dateOfBirth;
          private int id;
          private String email;
          private String address;
          private String printing;
          private String officeHours;

          public Professor(String name, int age, String dateOfBirth, int id, String email, String address,
                              String printing, String officeHours) {
                    this.name = name;
                    this.age = age;
                    this.dateOfBirth = dateOfBirth;
                    this.id = id;
                    this.email = email;
                    this.address = address;
                    this.printing = printing;
                    this.officeHours = officeHours;
          }

          public String getName() {
                    return name;
          }

          public int getAge() {
                    return age;
          }

          public String getDateOfBirth() {
                    return dateOfBirth;
          }

          public int getId() {
                    return id;
          }

          public String getEmail() {
                    return email;
          }

          public String getAddress() {
                    return address;
          }

          public String getPrinting() {
                    return printing;
          }

          public String getOfficeHours() {
                    return officeHours;
          }
}