package Homework9javacore6v1;

public class Main {

	public static void main(String[] args) {
		
		FixedSalaryWorker id1 = new FixedSalaryWorker ( " ������ " , 7500 ) ;
		HourlyWageWorker id2 = new HourlyWageWorker ( " ���� " , 120 , 50 ) ;
		
		id1.salary();
		id2.salary();
	}
	
}
