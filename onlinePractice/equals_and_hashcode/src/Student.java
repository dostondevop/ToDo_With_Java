public class Student {
    private int id;
    private String name;
    private String userName;
    private Gender gender;
    private int age;
    public boolean equals(Object o) {
        if(!(o instanceof Student student)) {
            return false;
        }else if(o == this) {
            return true;
        }else {
            return  student.id = this.id &&
                    student.name.equals(this.name) &&
                    student.userName.equals(this.userName) &&
                    student.age == this.age &&
                    student.getGender() == this.gender;

        }
    }
    public Student(int id, String name, String userName, Gender gender, int age) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
