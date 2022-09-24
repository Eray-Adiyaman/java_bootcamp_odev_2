public class Main {
    public static void main(String[] args) {

        //TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
       // teacherCreditManager.calculate();


        CreditUI creditUI = new CreditUI();
        //creditUI.CreditCalculate(teacherCreditManager);
        creditUI.CreditCalculate(new TeacherCreditManager());
        creditUI.CreditCalculate(new AgricultureCreditManager());
    }
}