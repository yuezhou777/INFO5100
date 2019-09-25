public class Assignment2 {

    // Assignment Test
    public static void main(String[] args) {
        Assignment2 a2 = new Assignment2();

        // Employee information for test
        Employee e1 = new Employee(1, "Leonard", 35, 4200);
        Employee e2 = new Employee(2, "Sheldon", 21, 2000);
        Employee e3 = new Employee(3, "P3nny", 39, 7899.90);
        Employee e4 = new Employee(5, "Howard", 55, 3800);
        Employee e5 = new Employee(15, "Rajesh", 43, 9200);
        Employee[] emArr = {e1, e2, e3, e4, e5};

        // Employee String array
        String[] emStrArr = new String[]{
            // id, firstname, age, salary
                "1,Leonard,35,4200",
                "2,Sheldon,21,2000",
                "3,Penny,39,7899.90",
                "5,Howard,55,3800",
                "15,Rajesh,43,9200",
                "6,Amy,27,4000",
                "7,Yue,60,7240.99"
        };

        // Test methods
        // Q1
        System.out.println("Q1");
        double salarySum = a2.salaryGreaterThanFiveThousand(emArr);
        System.out.println(salarySum);
        System.out.println("--------------------------");

        // Q2
        System.out.println("Q2");
        a2.fizzBuzz(e3);
        a2.fizzBuzz(e4);
        a2.fizzBuzz(e5);
        System.out.println("--------------------------");

        // Q3
        System.out.println("Q3");
        double tax1 = a2.calculateTax(e1);
        double tax2 = a2.calculateTax(e2);
        double tax3 = a2.calculateTax(e3);
        System.out.println(tax1);
        System.out.println(tax2);
        System.out.println(tax3);
        System.out.println("--------------------------");

        // Q4
        System.out.println("Q4");
        a2.swap(e4, e5);
        System.out.println("--------------------------");

        // Q5
        System.out.println("Q5");
        int employeeNum = a2.employeesAgeGreaterThan50(emArr);
        System.out.println(employeeNum);
        System.out.println("--------------------------");

        // Q6
        System.out.println("Q6");
        a2.reverseFirstName(e5);
        System.out.println("--------------------------");

        // Q7
        
        System.out.println("Q7");
        a2.isContainDigit(e3);
        a2.isContainDigit(e4);
        System.out.println("--------------------------");
        

        // Q8
        System.out.println("Q8");
        a2.tripleSalary(e4);
        System.out.println("--------------------------");

        // Q9
        System.out.println("Q9");
        a2.createEmployees(emStrArr);
        System.out.println("--------------------------");
        
    }


    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public double salaryGreaterThanFiveThousand(Employee[] employees) {
        // @TODO
        double salarySum = 0;
        for(int i=0; i<employees.length; i++){
            double salary = employees[i].getSalary();
            if(salary > 5000){
                salarySum += salary;
            }
        }
        return salarySum;
    }

    
    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public void fizzBuzz(Employee employee) {
        // @TODO
        int id = employee.getId();
        if(id % 3 == 0){
            System.out.print("Fizz");
            if(id % 5 == 0){
                System.out.print("Buzz");
            }
            System.out.println();
        }
    }

    
    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public double calculateTax(Employee employee) {
        // @TODO
        double salary = employee.getSalary();
        double tax = 0.0;
        if(salary <= 2500){
            tax = salary * 0.1;
        }else if(salary <= 5000){
            tax = salary * 0.25;
        }else{
            tax = salary * 0.35;
        }
        return tax;
    }
    
    
    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {

        double salary1 = firstEmployee.getSalary();
        double salary2 = secondEmployee.getSalary();

        // @TODO
        System.out.println("First Employee Salary: " + salary1);
        System.out.println("Second Employee Salary: " + salary2);

        double temp = 0.0;
        temp = salary1;
        salary1 = salary2;
        salary2 = temp;

        System.out.println("First Employee Salary: " + salary1);
        System.out.println("Second Employee Salary: " + salary2);
    }

    
    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
        // @TODO
        int employeeNum = 0;
        for(int i=0; i<employees.length; i++){
            int age = employees[i].getAge();
            if(age > 50){
                employeeNum ++;
            }
        }
        return employeeNum;
    }

    
    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public void reverseFirstName(Employee employee) {
        // @TODO
        String name = employee.getFirstName();
        StringBuffer nameRev = new StringBuffer(name);
        nameRev.reverse();
        System.out.println(nameRev);
    }


    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
    */

    
    public void isContainDigit(Employee employee) {
        // @TODO
        String name = employee.getFirstName();
        boolean hasDigit = false;
        for(int i = 0; i < name.length(); i++){
            if(Character.isDigit(name.charAt(i))){
                hasDigit = true;
                break;
            }
        }
        System.out.println(hasDigit);
    }
    

     /*
        Write a method to raise an employee's salary to three times of his/her original salary.
        Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
        DO NOT change the input in this method.
        Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
        Call this new method.
     */
    public void tripleSalary(Employee employee) {
        // @TODO
        employee.raiseSalary(300);
    }
    
    
    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public Employee[] createEmployees(String[] employeesStr) {

        Employee[] employees = new Employee[employeesStr.length];

        for(int i = 0; i < employeesStr.length; i++){
            String tempStr = employeesStr[i];
            String[] tempArr = tempStr.split(",");

            int idConvert = Integer.parseInt(tempArr[0]);
            String nameConvert = tempArr[1];
            int ageConvert = Integer.parseInt(tempArr[2]);
            double salaryConvert = Double.parseDouble(tempArr[3]);

            Employee newEmployee = new Employee(idConvert, nameConvert, ageConvert, salaryConvert);
            employees[i] = newEmployee;
            
        }
        return employees;
    }

}

