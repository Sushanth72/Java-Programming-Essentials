import java.util.Scanner;
class Staf
{
protected String stafId, name, ph;
protected float salary;
public Staf(String stafId, String name, float salary2, String ph)
{
super();
this.stafId = stafId;
this.name = name;
this.salary = salary2;
this.ph = ph;
}
@Override
public String toString()
{
return "Staf [stafId=" + stafId + ", name=" + name + ", salary="
+ salary + ", ph=" + ph + "]";
}
}
class Teaching extends Staf
{
private String domian, publication;
public Teaching(String stafId, String name, float salary,
String ph, String domian, String publication)
{
super(stafId, name, salary, ph);
this.domian = domian;
this.publication = publication;
}
@Override
public String toString()
{
return "Teaching [domian=" + domian + ", publication=" + publication
+ ", stafId=" + stafId + ", name=" + name + ", ph=" + ph
+ ", salary=" + salary + "]";
}
}
class Technical extends Staf
{
private String skills;
public Technical(String stafId, String name, float salary,
String ph, String skills)
{
super(stafId, name, salary, ph);
this.skills = skills;
}
@Override
public String toString()
{
return "Technical [skills=" + skills + ", stafId=" + stafId
+ ", name=" + name + ", ph=" + ph + ", salary=" + salary + "]";
}
}
class Contract extends Staf
{
private String period;
public Contract(String stafId, String name, float salary,
String ph, String period)
{
super(stafId, name, salary, ph);
this.period = period;
}
@Override
public String toString()
{
return "Contract [period=" + period + ", stafId=" + stafId
+ ", name=" + name + ", ph=" + ph + ", salary=" + salary + "]";
}
}

public class StafDemo
{
public static void main(String[] args)
{
int i,choice;
String stafId, name, ph, domain, publication, skills, period;
float salary;
int teachingCount=0, technicalCount=0, contractCount=0;
Teaching[] teachingStaf = new Teaching[10];
Contract[] contractStaf = new Contract[10];
Technical[] technicalStaf = new Technical[10];
Scanner s = new Scanner(System.in);
System.out.println("1 Teaching Staf Entry");
System.out.println("2 Technical Staf Entry");
System.out.println("3 Contract Staf Entry");
System.out.println("4 Teaching Staf Details");
System.out.println("5 Technical Staf Details");
System.out.println("6 Contract Staf Details");
System.out.println("7.Exit");
for(;;)
{
System.out.println("enter your choice");
choice = s.nextInt();
switch(choice)
{
case 1: System.out.println("Enter Teaching Details(StafId,Name,Salary,PhoneNumber,Domain,Publication)");
stafId = s.next();
name = s.next();
salary = s.nextFloat();
ph = s.next();
domain = s.next();
publication = s.next();
teachingStaf[teachingCount]= new
Teaching(stafId,name,salary,ph,domain,publication);
teachingCount++;
break;
case 2: System.out.println("Enter Technical stafDetails (StafId,Name,Salary,PhoneNumber,Skills)");

stafId = s.next();
name = s.next();
salary = s.nextFloat();
ph = s.next();
skills = s.next();
technicalStaf[technicalCount] = new Technical(stafId,name,salary,ph,skills);
technicalCount++;
break;
case 3: System.out.println("enter Contract staff details (StafId,Name,Salary, PhoneNumber, Period)");
stafId = s.next();
name = s.next();
salary = s.nextFloat();
ph = s.next();
period = s.next();
contractStaf[contractCount] = new Contract(stafId,name,salary, ph ,period);
contractCount++;
break;
case 4: System.out.println("Teaching Staf Details");
if(teachingCount==0)
{
System.out.println("No teaching staf details available");
}
else
{
for(i=0;i<teachingCount;i++)
{
System.out.println(teachingStaf[i]);
}
}
break;
case 5: System.out.println("Technical Staf Details:");
if(technicalCount==0)
{
System.out.println("No technical staf details available");
}
else
{
for(i=0;i<technicalCount;i++)

{
System.out.println(technicalStaf[i]);
}
}
break;
case 6: System.out.println("contract Staf Details:");
if(contractCount==0)
{
System.out.println("No contract staf details available");
}
else
{
for(i=0;i<contractCount;i++)
{
System.out.println(contractStaf[i]);
}
}
break;
case 7: System.exit(0);
}
}
}
}

