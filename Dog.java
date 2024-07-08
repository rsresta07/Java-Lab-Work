class Animal {
    private String color="White";
    public void display(){
        System.out.println(color);
    }
}
public class Dog extends Animal{
    private String color="Brown";
    public void display() {
        super.display();
        System.out.println(color);
    }
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.display();
    }
}