
public class ma_n {

    private String name;
    private int age;
    private String location;
    private String type;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ma_n(final String name, final int age, final String location, final String type ){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }


    public String toString() {
        return " | " +type+ " | Name = " + name + " || Age =" + age + " | Address = " + location + " |";

    }
    public String toString2() {
        return "He is a "+type+"\r" ;

    }


}
