public class Main {

    public static void main(String[] args) {

Employee et = new Employee(3000,"Gustavo","Rock");
Employee et2 = new Employee(5000,"Gustavo","Cock");
        System.out.println(et.getSalary());
        System.out.println(et2.getSalary());
        et.raiseSalaryPercent(20);
        et2.raiseSalaryPercent(10);
        System.out.println(et.getSalary());
        System.out.println(et2.getSalary());



    }


}
