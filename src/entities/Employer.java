package entities;

public class Employer {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double p;
	public double netSalary;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public double IncreaseSalary() {
		netSalary = grossSalary - tax;
		return (netSalary) +  (netSalary * p) / 100;
	}
}
