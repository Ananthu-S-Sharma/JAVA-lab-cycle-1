import java.util.Scanner;
 class employee {
    int Empid;
    String Name;
    double Salary;
    String Address;
    employee(int no, String na, double sal, String add) {
        this.Empid = no;
        this.Name = na;
        this.Salary = sal;
        this.Address = add;
    }
}
 class Teacher extends employee{
 String dept;
 String subject;
 
 Teacher(int no, String na, double sal, String add, String dep, String sub){
     super(no,na,sal,add);
     this.dept= dep;
     this.subject=sub;
 }
    
 void display(){
    System.out.println("Employee id: "+Empid);
    System.out.println("Name: "+Name);
    System.out.println("Salary: "+Salary);
    System.out.println("Address: "+Address);
    System.out.println("Department: "+dept);
    System.out.println("Subject: "+subject);
 }
 public static void main(String[] args) {
    System.out.println("\nEnter the No. of Employee's");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    Teacher arr[]=new Teacher[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter Employee id: ");
        int Empid=sc.nextInt();
        System.out.println("\nEnter Employee Name: ");
        String Name=sc.next();
        System.out.println("\nEnter Salary: ");
        double Salary=sc.nextDouble();
        System.out.println("\nEnter Address: ");
        String Address=sc.next();
        System.out.println("\nEnter department: ");
        String dept=sc.next();
        System.out.println("\nEnter Subject: ");
        String subject=sc.next();
        arr[i]=new Teacher(Empid,Name,Salary,Address,dept,subject);
    

    }
    System.out.println("\n********Informations of all the employee's");
    for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 }
 sc1.close();
 }


}

