import java.util.Scanner;

public class myclass {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
     int choice = 0;
     int Age,Basic_Salary;
     String name,Gender,status,id_number; 
while (choice != 3){
System.out.println();
System.out.println("======================");
System.out.println("GIKONDO PRODUCTION" );
System.out.println("======================");
 
   System.out.println("PRESS 1 FOR A.Cooking Oil production " );
   System.out.println("PRESS 2 FOR b.Soap Production "); 
   System.out.println("PRESS 3 FOR Exit ");
   System.out.println("----------------------");
   
     
System.out.println("Enter your choice ");
 choice = input.nextInt();
if (choice==1)
System.out.println("you chose :Cooking Oil production");
if (choice==2)
System.out.println("you chose :Soap Production ");

switch (choice) {
   
 //employed to produce cooking oil  
   
    case 1:
      System.out.println("Enter name of Employee ");
         name = input.next();
      System.out.println("Enter Id number ");
          id_number = input.next();
     
 System.out.println("Enter Gender (Male/Female):");
 Gender = input.next();

while(!Gender.equalsIgnoreCase("Male")&&
      !Gender.equalsIgnoreCase("Female")){
System.out.println("Invalid input!,Enter Gender Male or Female");
     Gender = input.next();
}
 System.out.println("Enter Age");
           Age = input.nextInt();

while(Age < 18|| Age > 100) {
 System.out.println("Invalid Age!,Enter an Age between 18 and 100:");
Age = input.nextInt(); }
 
 

     System.out.println("Enter Marital status (single/married):");
           status = input.next();
     
 while(!status.equalsIgnoreCase("single")&&
      !status.equalsIgnoreCase("married")){
System.out.println("Invalid input!,Enter Gender single or Married");
     status= input.next();
}


     System.out.println("Enter Basic Salary ");
           Basic_Salary = input.nextInt();
   
double TA,HRA,upkeep;
if(Basic_Salary>=5000) {
TA = Basic_Salary*110.0/100;
HRA = Basic_Salary*20.0/100;
upkeep = 500; }
 
else if(Basic_Salary>=3000) { 
TA = Basic_Salary*100.0/100;
HRA = Basic_Salary*15.0/100;
upkeep = 400; }

else{ 
TA = Basic_Salary*90.0/100;
HRA = Basic_Salary*10.0/100;
upkeep = 300; }

double Total_Allowence = TA + HRA + upkeep;
double grossSalary = Basic_Salary + Total_Allowence;

System.out.println("======EMPLOYEE DETAILS========");

System.out.println("\nName:"+name );
System.out.println("Id Number:"+id_number);
System.out.println("Gender:"+Gender);
System.out.println("Age:"+Age);
System.out.println("Marital status:"+status);

System.out.println("Production Unit:Cooking Oil production");
System.out.println("Basic Salary:"+Basic_Salary);
System.out.println("Total Allowances:"+Total_Allowence);
System.out.println("Gross Salary:"+grossSalary);
System.out.println("\nEmployee processed successfully!");

break;

    // Those employed to produce soap
    
     case 2:
     System.out.println("Enter name of Employee ");
          name = input.next();
      System.out.println("Enter Id number ");
          id_number = input.next();
     
System.out.println("Enter Gender (Male/Female):");
            Gender = input.next();

 while(!Gender.equalsIgnoreCase("Male")&&
      !Gender.equalsIgnoreCase("Female")){
  System.out.println("Invalid input!,Enter Gender Male or Female");
     Gender = input.next();
 }

  
     System.out.println("Enter Age ");
            Age = input.nextInt();

  while(Age < 18|| Age > 100) {
    System.out.println("Invalid Age!,Enter an Age between 18 and 100:");
     Age = input.nextInt(); }
 


       System.out.println("Enter Marital status (single/married):");
          status = input.next();
 
while(!status.equalsIgnoreCase("single")&&
      !status.equalsIgnoreCase("married")){
System.out.println("Invalid input!,Enter Gender single or Married");
     status= input.next();
}

     System.out.println("Enter Basic Salary ");
         Basic_Salary = input.nextInt();

 
if(Basic_Salary>=5000) {
TA = Basic_Salary*100.0/100;
HRA = Basic_Salary*10.0/100;
upkeep = 300; }
 
else if(Basic_Salary>=3000) { 
TA = Basic_Salary*90.0/100;
HRA = Basic_Salary*10.0/100;
upkeep = 200; }

else{ 
TA = Basic_Salary*70.0/100;
HRA = Basic_Salary*5.0/100;
upkeep = 100; }

Total_Allowence = TA + HRA + upkeep;
grossSalary = Basic_Salary + Total_Allowence;

System.out.println("======EMPLOYEE DETAILS========");

System.out.println("\nName:"+name );
System.out.println("Id Number:"+id_number);
System.out.println("Gender:"+Gender);
System.out.println("Age:"+Age);
System.out.println("Marital status:"+status);

System.out.println("Production Unit:Soap Production");
System.out.println("Basic Salary:"+Basic_Salary);
System.out.println("Total Allowances:"+Total_Allowence);
System.out.println("Gross Salary:"+grossSalary);
System.out.println("\nEmployee processed successfully!");
 break;
 
 case 3:
   System.out.println("thank you for using GIKONDO PRODUCTION!");
  break;

 default:
   System.out.println();
   System.out.println();
   System.out.println("Invalid choice! please enter 1,2,or,3.");
 break;
}


 }
       


}
    }