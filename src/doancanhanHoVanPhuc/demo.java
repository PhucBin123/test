package doancanhanHoVanPhuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

interface Iemployee {
	double countofsalary();
}

abstract class hospitalstaff implements Iemployee {

	int ID;
	private int Age;
	String Name;
	private String Gender;
	private String Birthday;
	private String Birthplace;
	private String People;
	private String Address;
	private String Phonenumber;
	private double Basicsalary;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public String getBirthplace() {
		return Birthplace;
	}

	public void setBirthplace(String birthplace) {
		Birthplace = birthplace;
	}

	public String getPeople() {
		return People;
	}

	public void setPeople(String people) {
		People = people;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}

	public double getBasicsalary() {
		return Basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		Basicsalary = basicsalary;
	}

	public hospitalstaff(int iD, int age, String name, String gender, String birthday, String birthplace, String people,
			String Address, String phonenumber, double basicsalary) {
		super();
		ID = iD;
		Age = age;
		Name = name;
		Gender = gender;
		Birthday = birthday;
		Birthplace = birthplace;
		People = people;
		Address = Address;
		Phonenumber = phonenumber;
		Basicsalary = basicsalary;
	}

	hospitalstaff() {
		this.ID = 0;
		this.Age = 0;
		this.Name = "";
		this.Gender = "";
		this.Birthday = "";
		this.Birthplace = "";
		this.People = "";
		this.Address = "";
		this.Phonenumber = "";
		this.Basicsalary = 0;

	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID: ");
		this.setID(sc.nextInt());
		sc.nextLine();

		System.out.print("Age: ");
		this.setAge(sc.nextInt());
		sc.nextLine();

		System.out.print("Name: ");
		this.setName(sc.nextLine());

		System.out.print("Gender: ");
		this.setGender(sc.nextLine());

		System.out.print("Birthday: ");
		this.setBirthday(sc.nextLine());

		System.out.print("Birthplace: ");
		this.setBirthplace(sc.nextLine());

		System.out.print("People: ");
		this.setPeople(sc.nextLine());

		System.out.print("Address: ");
		this.setAddress(sc.nextLine());

		System.out.print("Phonenumber: ");
		this.setPhonenumber(sc.nextLine());

		System.out.print("Basicsalary: ");
		this.setBasicsalary(sc.nextDouble());

	}

	void output() {
		System.out.println("ID:" + this.getID());
		System.out.println("Age:" + this.getAge());
		System.out.println("Name:" + this.getName());
		System.out.println("Gender:" + this.getGender());
		System.out.println("Birthday:" + this.getBirthday());
		System.out.println("Birthplace:" + this.getBirthplace());
		System.out.println("People:" + this.getPeople());
		System.out.println("Address:" + this.getAddress());
		System.out.println("Phonenumber:" + this.getPhonenumber());
		System.out.println("Basicsalary:" + this.getBasicsalary());

	}

	public abstract double countofsalary();

}

class Doctor extends hospitalstaff {
	private String Level;
	private String Office;
	private double Salarybonus;

	public String getLevel() {
		return Level;
	}

	public void setLevel(String Level) {
		Level = Level;
	}

	public String getOffice() {
		return Office;
	}

	public void setOffice(String Office) {
		Office = Office;
	}

	public double getSalarybonus() {
		return Salarybonus;
	}

	public void setSalarybonus(double salarybonus) {
		Salarybonus = salarybonus;
	}

	public Doctor() {

	}

	public Doctor(int iD, int age, String name, String gender, String birthday, String birthplace, String people,
			String Address, String phonenumber, double basicsalary, String level, String office, double salarybonus) {
		super(iD, age, name, gender, birthday, birthplace, people, Address, phonenumber, basicsalary);
		Level = level;
		Office = office;
		Salarybonus = salarybonus;
	}

	@Override
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);

		System.out.print("Level: ");
		this.setLevel(sc.nextLine());

		System.out.print("Office: ");
		this.setOffice(sc.nextLine());

		System.out.print("Salarybonus: ");
		this.setSalarybonus(sc.nextDouble());
		sc.nextLine();
	}

	void output() {
		super.output();
		System.out.println("Level: " + this.getLevel());
		System.out.println("Office: " + this.getOffice());
		System.out.println("Salarybonus: " + this.getSalarybonus());

	}

	@Override
	public double countofsalary() {
		double salary = 0;
		salary = this.getBasicsalary() + this.getSalarybonus();
		return salary;

	}
}

class Nurse extends hospitalstaff {

	private int Overtimesalary;
	private String Office;

	public int getOvertimesalary() {
		return Overtimesalary;
	}

	public void setOvertimesalary(int overtimesalary) {
		Overtimesalary = overtimesalary;
	}

	public String getOffice() {
		return Office;
	}

	public void setOffice(String office) {
		Office = office;
	}

	public Nurse() {

	}

	public Nurse(int iD, int age, String name, String gender, String birthday, String birthplace, String people,
			String Address, String phonenumber, double basicsalary, int overtimesalary, String office) {
		super(iD, age, name, gender, birthday, birthplace, people, Address, phonenumber, basicsalary);
		Overtimesalary = overtimesalary;
		Office = office;
	}

	@Override
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);

		System.out.print("Overtimesalary: ");
		this.setOvertimesalary(sc.nextInt());

		System.out.print("Office: ");
		this.setOffice(sc.nextLine());
	}

	void output() {
		super.output();
		System.out.println("Overtimesalary:" + this.getOvertimesalary());
		System.out.println("Office:" + this.getOffice());

	}

	@Override
	public double countofsalary() {
		double salary = 0;
		salary = this.getBasicsalary() + this.getOvertimesalary();
		return salary;

	}

}

class Interns extends hospitalstaff {
	private int Allowances;
	private String Yearsofstudy;

	public int getAllowances() {
		return Allowances;
	}

	public void setAllowances(int allowances) {
		Allowances = allowances;
	}

	public String getYearsofstudy() {
		return Yearsofstudy;
	}

	public void setYearsofstudy(String yearsofstudy) {
		Yearsofstudy = yearsofstudy;
	}

	public Interns() {

	}

	public Interns(int iD, int age, String name, String gender, String birthday, String birthplace, String people,
			String Address, String phonenumber, double basicsalary, int allowances, String yearsofstudy) {
		super(iD, age, name, gender, birthday, birthplace, people, Address, phonenumber, basicsalary);
		Allowances = allowances;
		Yearsofstudy = yearsofstudy;
	}

	@Override
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);

		System.out.print("Allowances: ");
		this.setAllowances(sc.nextInt());

		System.out.print("Yearsofstudy: ");
		this.setYearsofstudy(sc.nextLine());
	}

	void output() {
		super.output();
		System.out.println("Allowances:" + this.getAllowances());
		System.out.println("Yearsofstudy:" + this.getYearsofstudy());

	}

	@Override
	public double countofsalary() {
		double salary = 0;
		salary = this.getBasicsalary() + this.getAllowances();
		return salary;

	}

}

class hospitalstaffList {

	hospitalstaff stList[] = new hospitalstaff[100];
	int n = 0;

	public hospitalstaffList() {
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter the number of employees you want to import: ");
			n = sc.nextInt();
		} while (n < 1 || n > 100);

		for (int i = 0; i < n; i++) {
			int nhanvien;
			do {
				System.out.println("Enter the employee type (1.Doctor / 2.Nurse / 3.Interns): ");
				nhanvien = sc.nextInt();

			} while (nhanvien < 1 || nhanvien > 3);

			if (nhanvien == 1) {
				Doctor bs = new Doctor();
				bs.input();
				stList[i] = bs;
			} else if (nhanvien == 2) {
				Nurse yt = new Nurse();
				yt.input();
				stList[i] = yt;
			} else if (nhanvien == 3) {
				Interns tts = new Interns();
				tts.input();
				stList[i] = tts;
			} else {
				System.out.println("Incorrect input program error !!!");
				break;
			}
		}
	}

	void output() {
		for (int i = 0; i < n; i++) {
			stList[i].output();
		}
	}

	double countofsalary() {
		double salary = 0;
		for (int i = 0; i < n; i++) {
			salary += stList[i].countofsalary();
		}
		return salary;
	}

	void sumsalary() {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + stList[i].countofsalary();
		}
		System.out.println("Total salary of all employee:" + sum);
	}

	void sort() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (stList[j].countofsalary() < stList[j + 1].countofsalary()) {
					hospitalstaff temp = stList[j];
					stList[j] = stList[j + 1];
					stList[j + 1] = temp;
				}
			}
		}
	}

	void search(int timkiem) {
		for (int i = 0; i < n; i++) {
			if (stList[i].ID == timkiem) {
				stList[i].output();
				break;
			}
		}
	}

	void update() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee ID to update: ");
		int updateId = sc.nextInt();
		boolean found = false;

		for (int i = 0; i < n; i++) {
			if (stList[i].getID() == updateId) {
				found = true;
				System.out.println("Enter new information for the employee with ID " + updateId + ":");
				stList[i].input();

				System.out.println("Employee information after update:");
				stList[i].output();
				break;
			}
		}

		if (!found) {
			System.out.println("No employee ID found " + updateId);
		}
	}

	void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee ID to delete: ");
		int deleteId = sc.nextInt();
		boolean found = false;

		for (int i = 0; i < n; i++) {
			if (stList[i].getID() == deleteId) {
				found = true;
				System.out.println("Employee information needs to be delete:");
				stList[i].output();
				for (int j = i; j < n - 1; j++) {
					stList[j] = stList[j + 1];
				}
				stList[n - 1] = null;
				n--;
				System.out.println("Employee have ID " + deleteId + " Has  been delete:");
				break;
			}
		}

		if (!found) {
			System.out.println("No employee ID found " + deleteId);
		}
	}

	void find() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the employee you want to search for: ");
		String findName = sc.nextLine();
		boolean found = false;

		System.out.println("Information employee need to believe:");

		for (int i = 0; i < n; i++) {
			if (stList[i].getName().equalsIgnoreCase(findName)) {
				found = true;
				stList[i].output();
			}
		}

		if (!found) {
			System.out.println("No name employee found '" + findName + "'");
		}
	}

	void the_best_staff_of_file() throws IOException {
		File f = new File("D:\\Doancanhan.txt");
		FileWriter fw = new FileWriter(f);
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (stList[j].countofsalary() < stList[j + 1].countofsalary()) {
					hospitalstaff temp = stList[j];
					stList[j] = stList[j + 1];
					stList[j + 1] = temp;
				}
			}
		}
		try {
			fw.write("===Employees with the highest total salary===\n");
			fw.write(stList[0].ID + " " + stList[0].Name + " " + stList[0].countofsalary() + "\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		fw.close();
		System.out.println("Recorded file successfully!!!");
	}
}

public class demo {
	public static void main(String[] args) throws IOException {
		hospitalstaffList list = new hospitalstaffList();
		list.input();

		Scanner sc = new Scanner(System.in);
		int chucnang;

		while (true) {
			System.out.println("\n--------\n");
			System.out.println("1.Export array.");
			System.out.println("2.Sort salary from high to low.");
			System.out.println("3.Print the employee with the highest salary and save it to the file.");
			System.out.println("4.Search employee by ID.");
			System.out.println("5.Update employee information.");
			System.out.println("6.Delete employee.");
			System.out.println("7.Search for employee by name.");
			System.out.println("8.Calculate the total of all employee salary.");
			System.out.println("9.Thoat khoi chuong trinh");

			System.out.println("ENTER FUNCTION:");
			chucnang = sc.nextInt();
			sc.nextLine();
			switch (chucnang) {
			case 1:
				System.out.println("Export array:");
				list.output();
				break;
			case 2:
				System.out.println("Nextwork after sort from high to low according to salary:");
				list.sort();
				list.output();
				break;
			case 3:
				list.sort();
				System.out.println("The employee with the highest salary is:");
				list.the_best_staff_of_file();
				break;
			case 4:
				int timkiem;
				System.out.println("Enter the employee ID you want to find:");
				timkiem = sc.nextInt();
				list.search(timkiem);
				break;
			case 5:
				System.out.println("Update employee information:");
				list.update();
				break;
			case 6:
				System.out.println("Delete employee:");
				list.delete();
				break;
			case 7:
				System.out.println("Search for employee:");
				list.find();
				break;
			case 8:
				list.sumsalary();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("This function does not exist");
			}
		}
	}
}