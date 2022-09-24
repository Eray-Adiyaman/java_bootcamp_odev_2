public class BasicMathOps {
    public int add(int num1,int num2){
        return num1+num2;
    }

    public  int add(int... nums){
        int total =0;
        for(int num:nums){
            total+=num;
        }
        return total;
    }

}
