import java.util.*;

public class EmployeeManagement{
	int empId;
	String empName;
	double salary;
	String joiningDate;
	String department;

	
	EmployeeManagement(int empId, String empName, double salary, String joiningDate, String department){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.department = department;
		
	}
	
	
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		List <EmployeeManagement> empList = new ArrayList<>();
		
		
		while(true){
			System.out.println("=============Employee Management System=============");
			System.out.println("1. Add Employee");
			System.out.println("2. Remove Employee");
			System.out.println("3. Search Employee By ID");
			System.out.println("4. Update Salary");
			System.out.println("5. Display  All Employees");
			System.out.println("6. Sort By Salary");
			System.out.println("7. Group Employee By Depatment");
			System.out.println("8. Sort By Joining Date ");
			System.out.println("9. Exit");
			System.out.println("Enter your Choice: ");
			
			
			int userInput = sc.nextInt();
				switch(userInput){
					case 1:
						System.out.println("Enter Employee ID: ");
						int empId = sc.nextInt();
				
						System.out.println("Enter Employee Name: ");
						String empName=sc.next();
						
						System.out.println("Enter Employee Salary: ");
						double salary = sc.nextDouble();
						
						System.out.println("Enter Employee Joining Date: ");
						String joiningDate = sc.next();
						
						System.out.println("Enter Employee Department: ");
						String department = sc.next();
						empList.add(new EmployeeManagement(empId, empName, salary, joiningDate, department));									
						break;
					
					case 2:
						System.out.println("Enter Employee ID: ");
						int userEmpId = sc.nextInt();
						EmployeeManagement empToRemove = null;
						for(EmployeeManagement emp : empList){
							if(emp.empId == userEmpId){
								empToRemove = emp;
								break;															
							}
							else{
								System.out.println("Employee not found");
							}
							
						}
						if(empToRemove != null){
							empList.remove(empToRemove);
							System.out.println("Employee Removed Successfully");
							
						}
						break;
					
					case 3:
						System.out.println("Enter Employee ID: ");
						int searchEmpId = sc.nextInt();
						for(EmployeeManagement emp : empList){
							if(emp.empId == searchEmpId){
								System.out.println("Employee found");
								break;				
								
							}
							else{
								System.out.println("Employee not found");
							}
						}
						break;
					
					case 4:
						System.out.println("Enter Employee ID to Update Salary: ");
						int user_empId = sc.nextInt();
						for(EmployeeManagement emp : empList){
							if(emp.empId == user_empId){
								System.out.println("Enter Salary to Update: ");
								double salaryToUpdate= sc.nextDouble();
								emp.salary = salaryToUpdate;
								break;								
								
							}
							else{
								System.out.println("Employee not found");
							}
						}						
						break;
						
					case 5:
						for(EmployeeManagement emp : empList){
							System.out.println("Employee ID: " + emp.empId);
							System.out.println("Employee Name: " + emp.empName);
							System.out.println("Employee Salary: " + emp.salary);
							System.out.println("Employee Joining Date: " + emp.joiningDate);
							System.out.println("Employee Department " + emp.department);
							System.out.println("--------------------------------------------");
							
						}
						break;
						
					case 6:
						for(int i = 0; i < empList.size()-1; i++) {

							for(int j = i+1; j < empList.size(); j++) {
								if(empList.get(i).salary > empList.get(j).salary) {
								EmployeeManagement temp = empList.get(i);
									empList.set(i, empList.get(j));
									empList.set(j, temp);
								}							
							}
						}
						for(EmployeeManagement emp : empList) {

							System.out.println("Employee Id: " + emp.empId + "\nEmployee Salary: " +emp.salary);
						}

						break;
					case 7:
					
						break; 
					case 9:
						System.exit(0);
						break;
					
					default:
						System.out.println("Invalid Input");
						
				}
		}
	

		
	}
	
		
		
}
	

	


	
