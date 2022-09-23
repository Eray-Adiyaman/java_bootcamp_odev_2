public class Main {
    public static void main(String[] args) {
      int num =  sum(5,3);
      System.out.println(num);
      System.out.println(giveName());
    }

    public static void add(){
        System.out.println("Added");
    }

    public static void delete(){
        System.out.println("Deleted");
    }

    public static void update(){
        System.out.println("Updated");
    }

    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public  static String giveName(){
        return "Eray";
    }
}