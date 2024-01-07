class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printall(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class OOPS1 {
    public static void main(String args[]) {
        Student str = new Student();
        str.printInfo("Harsh");
        str.printInfo(20);
        str.printall("Harshit", 23);

    }
}