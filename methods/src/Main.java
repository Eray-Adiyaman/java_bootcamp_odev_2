public class Main {
    public static void main(String[] args) {

        findNum();


    }

    public static void findNum() {
        int[] nums = new int[]{1, 2, 5, 7, 9, 0};
        int numToFind = 7;
        boolean exist = false;

        for (int num : nums) {
            if (num == numToFind) {
                exist = true;
                break;
            }
        }
        if (exist) {
            giveMessage("This number " + numToFind + " exist in this array");
        } else {
            giveMessage("This number " + numToFind + " does not exist in this array");
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);

    }

}