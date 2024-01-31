public class Student {
    int id;
    String name;

    public Student() {
        this("Saikot" , 132);
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void show() {
        System.out.println(name + " " + id);
    }

    public String HelloMsg(String msg) {
        String Msg = "Hello! I am " + name +"\n"+ "My id is " + id + ".\n" + msg + ".";
        System.out.println(Msg);
        return Msg;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Md Shafiul Azam", 15);

        s1.HelloMsg("And I am 20 Years old!");
    }
}
