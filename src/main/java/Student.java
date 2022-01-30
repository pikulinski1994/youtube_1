public class Student {

    String Name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        Name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

