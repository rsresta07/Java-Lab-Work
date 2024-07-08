public class student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("Name="+stu1.name);
        System.out.println("Roll="+stu1.roll);
        System.out.println("Name="+stu1.age);
        System.out.println("Name="+stu1.address);
    }

    public static class Student{
        String name, address;
        int age, roll;
        public void infostu(){
            System.out.println("Name="+name);
            System.out.println("Roll="+roll);
            System.out.println("Name="+age);
            System.out.println("Name="+address);
        }
    }
}    
