package task3;

class Employee extends Sortable{
	public Employee(String n, double s, int day, int month, int year) {
		name = n;
		salary = s;
		hireday = day;
		hiremonth = month;
		hireyear = year;
	}

	public void print() {
		System.out.println(name + " " + salary + " " + hireYear());
	}

	public void raiseSalary(double byPercent) {
		salary *= 1 + byPercent / 100;
	}

	public int hireYear() {
		return hireyear;
	}
	
	@Override
	public int compareTo(Sortable other) {
		Employee otherEmployee = (Employee) other;
		if (this.salary < otherEmployee.salary)
			return -1;
		if (this.salary > otherEmployee.salary)
			return 1;
		return 0;
	}

	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;
}