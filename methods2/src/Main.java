public class Main {
    public static void main(String[] args) {
      int num =  sum(5,3);
      System.out.println(num);
      System.out.println(giveName());
        System.out.println(sum2(1,2,3,4,5,6,7,8,9,10));
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
    public static int sum2(int... nums){
        int sum =0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public  static String giveName(){
        return "Eray";
    }
}