/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    public void setfullname(String fullname){
        this.fullname = fullname;
    }
    
    public String getfullname(){
        return(fullname);
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
         if(age>=16){
            System.out.println("You can drive");
            return true;
        } else {
            System.out.println("You have to  wait" + (16-age) + " years to start driving.");
            return false;
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        double taxes = 0.3;
        double salary = hourlyWage * unpaidHours;
        double totalPay = salary - (salary * taxes);
        return totalPay;
    }
    
    public void setUnpaidHours(double hours){
        this.unpaidHours = hours;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        double payment = calculatePay();
        System.out.println(fullname + " has received a wire transfer of" + payment + " CAD");
        setUnpaidHours(0.0);
    }
}