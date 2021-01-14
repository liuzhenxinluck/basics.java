package collection;

public class Student {
            String usrename;
            int age;
    public Student(){

    };
    public Student(String name, int age) {
        this.usrename= name;
        this.age = age;
    }

    public String getUsrename() {
        return usrename;
    }

    public void setUsrename(String usrename) {
        this.usrename = usrename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
