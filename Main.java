public class Main {
    public static void main(String[] args) {
        for (int i = 0; i != args.length; i++) {
            System.out.println(i + " " + args[i]);
        }

        Person p = new Person("Paul", "Gries", "griespau");
        Student s = new Student("Jonathan", "Calver", "calv", "12345678990");
        Object p2 = s;
        s.getStudentID();
        ((Student) p2).getStudentID();
        ((Student) p).getStudentID(); // this will crash

        System.out.println();
    }
}
