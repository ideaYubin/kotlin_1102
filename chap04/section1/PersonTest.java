package chap04.section1;

public class PersonTest {
    //멤버 필드
    private String name;
    private int age;

    public PersonTest(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
