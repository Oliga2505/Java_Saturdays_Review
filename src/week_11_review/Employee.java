package week_11_review;

public class Employee extends Person {

    private String employeeId, jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmplyeeId (employeeId);
        setJobTitle ( jobTitle);
        setSalary ( salary);
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmplyeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if(jobTitle == null){
            System.out.println("Cannot be ");
            System.exit(1);
        }

        if(jobTitle.isEmpty()) {
            System.out.println("Cannot be empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("Cannot be less than 0");
            System.exit(1);
        }
        if (salary == 0) ;
        System.err.println("Cannot be 0");
        System.exit(1);

        this.salary = salary;
    }

        public void work(){
            System.out.println(getName() + "is working" );

        }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +

                super.toString() +
               ", emplyeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}






