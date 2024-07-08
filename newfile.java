public class newfile {
    public static void main(String[] args) {
        Circle co1=new Circle(3,7);
        String msg= co1.display();
        System.out.println(msg);
        co1.convert_to_origin();
        System.out.println(co1.display());
    }
public static class Circle{
    int x,y;
    public Circle(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void convert_to_origin(){
        this.x=0;
        this.y=0;
    }
        public String display(){
            String str = "("+x+","+y+")";
            return str;
        }
    }
}