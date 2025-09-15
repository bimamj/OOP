public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge <= 30 && newAge >= 18) {
            if (newAge > 30) {
                age = 30;
            } else {
                age = newAge;
            }
        } else {
            System.out.println("Age is not in the appropriate range of 18-30");
        }

    }
}
