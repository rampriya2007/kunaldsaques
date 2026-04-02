 public class a {
    // Fields — what every Student HAS
    String name;
    int age;
    String grade;

    // Constructor — runs when you do "new Student(...)"
    a(String name, int age, String grade) {
        this.name = name;   // "this.name" = the field, "name" = the parameter
        this.age = age;
        this.grade = grade;
    }

    // Getter — reads a field
    String getName() { return name; }
    int getAge() { return age; }
    String getGrade() { return grade; }

    // Setter — changes a field
    void setGrade(String grade) { this.grade = grade; }

    public static void main(String[] args) {
        a s1 = new a("Rampriya", 19, "A");
        a s2 = new a("Priya", 20, "B");
        a s3 = new a("Anitha", 18, "A");

        System.out.println(s1.getName() + " | " + s1.getAge() + " | " + s1.getGrade());
        System.out.println(s2.getName() + " | " + s2.getAge() + " | " + s2.getGrade());
        System.out.println(s3.getName() + " | " + s3.getAge() + " | " + s3.getGrade());
    }
}

