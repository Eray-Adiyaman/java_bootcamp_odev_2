public class Main {
    public static void main(String[] args) {

        //primitives are value types
        int num1=10;
        int num2 =20;
        num2=num1; //value change
        num1=30;
        System.out.println(num2);

        //arrays are ref types
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{4,5,6};
        nums2=nums1; //ref change
        nums1[0] = 10;
        System.out.println(nums2[0]);//will print 10 because its referancing first array now.



    }
}