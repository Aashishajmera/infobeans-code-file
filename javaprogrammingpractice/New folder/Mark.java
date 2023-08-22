
import java.util.Scanner;

//POJO Playin old java object
class DataClass // POJO Class
{
	private String name;
	private String fname;
	private String mname;
	private int sem;
	private String branch;
	private String corse;
	private int year;
	private int total;
	private int roll;
	private int physics;
	private int chemistry;
	private int math;
	private int hindi;
	private int english;
	private double per;

	public DataClass() {

	}

	public DataClass(String name, String fname, String mname, int sem, String branch, String corse, int year, int roll,
			int physics, int chemistry, int math, int hindi, int english) {
		this.name = name;
		this.fname = fname;
		this.mname = mname;
		this.sem = sem;
		this.branch = branch;
		this.corse = corse;
		this.year = year;
		// this.total = total;
		this.roll = roll;
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
		this.hindi = hindi;
		this.english = english;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFatherName(String fname) {
		this.fname = fname;
	}

	public void setMotherName(String mname) {
		this.mname = mname;
	}

	public void setCorse(String corse) {
		this.corse = corse;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public void setTotel() {
		this.total = getphysics() + getchemistry() + getmath() + gethindi() + getenglish();
	}

	public void setPer() {
		this.per = getTotal() / 5.0;
	}

	public int getRollNumber() {
		return this.roll;
	}

	public String getName() {
		return this.name;
	}

	public String getFName() {
		return this.fname;
	}

	public String getMName() {
		return this.mname;
	}

	public String getCorse() {
		return this.corse;
	}

	public String getBranch() {
		return this.branch;
	}

	public int getSem() {
		return this.sem;
	}

	public int getYear() {
		return this.year;
	}

	public int getphysics() {
		return this.physics;
	}

	public int getchemistry() {
		return this.chemistry;
	}

	public int getmath() {
		return this.math;
	}

	public int gethindi() {
		return this.hindi;
	}

	public int getenglish() {
		return this.english;
	}

	public double getPer() {
		return this.per;
	}

	public int getTotal() {
		return this.total;
	}

}

class Operation // BL Class
{
	int i = 0, n;

	public void choice(DataClass student[], int n, Operation ob2) {
		Scanner sc = new Scanner(System.in);
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		int choice, searchRoll;
		boolean flag;
		String searchName;
		do {
			flag = true;
			System.out.println("\n\t\t\t\t\t     Your Choice are ");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\t\t 1 For Search by Roll Number");
			System.out.println("\t\t\t\t 2 For Search by Name");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\n\n\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\t\t 3 For Search by Division");
			System.out.println("\t\t\t\t 4 For All MarkSheet");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.println("\n\t\t-------------------------------");
			System.out.println("\t\t 5 For Exit");
			System.out.println("\t\t-------------------------------");
			System.out.println("\n\n\t\t\t\t\t     Enter Your Choice");
			choice = sc.nextInt();
			sc.nextLine();
			System.out.println(
					" ____________________________________________________________________________________________________________________");
			switch (choice) {
				case 1:
					System.out.println("\t\t---------------------------");
					System.out.print("\t\t  Enter Roll number : ");
					searchRoll = sc.nextInt();
					System.out.println("\t\t---------------------------");
					for (int i = 0; i < n; i++) {
						if (student[i].getRollNumber() == searchRoll) {
							ob2.printMarksheet(student, i);
							flag = false;
							break;
						}
					}
					if (flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      Enter Roll Number Is Not exist : ");
						System.out.println("\t\t  --------------------------------------------------------------------"
								+ resetColor);
					}
					break;
				case 2:
					System.out.println("\t\t---------------------------");
					System.out.print("\t\t  Enter Your Name : ");
					searchName = sc.nextLine();
					System.out.println("\t\t---------------------------");

					for (int i = 0; i < n; i++) {
						if (student[i].getName().equals(searchName)) {
							ob2.printMarksheet(student, i);
							flag = false;
						}
					}
					if (flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      Enter Name Is Not exist : ");
						System.out.println("\t\t  --------------------------------------------------------------------"
								+ resetColor);
					}
					break;
				case 3:
					ob2.searchDivision(student, n, ob2);
					break;
				case 4:
					for (int i = 0; i < n; i++) {
						ob2.printMarksheet(student, i);
					}
					break;
			}
		} while (choice != 5);
	}

	public void searchDivision(DataClass student[], int n, Operation ob2) {
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		int choice;
		do {
			flag = true;
			System.out.println("\n\t\t\t\t\t     Your Choice are ");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\t\t 1 For First Division");
			System.out.println("\t\t\t\t\t 2 For Second Division");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\n\n\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\t\t 3 For Third Division");
			System.out.println("\t\t\t\t\t 6 For Back");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.println("\n\n\t\t\t\t\t     Enter Your Choice");
			choice = sc.nextInt();
			System.out.println(
					" ____________________________________________________________________________________________________________________");
			switch (choice) {
				case 1:
					for (int i = 0; i < n; i++) {
						if (student[i].getPer() >= 60 && student[i].getPer() <= 100 && student[i].getphysics() > 33
								&& student[i].getchemistry() > 33 && student[i].getmath() > 33
								&& student[i].gethindi() > 33 && student[i].getenglish() > 33) {
							ob2.printMarksheet(student, i);
							flag = false;
						}
					}
					if (flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      First Division student Not aveleval");
						System.out.println("\t\t  --------------------------------------------------------------------"
								+ resetColor);
					}
					break;
				case 2:
					for (int i = 0; i < n; i++) {
						if (student[i].getPer() >= 45 && student[i].getPer() < 60 && student[i].getphysics() > 33
								&& student[i].getchemistry() > 33 && student[i].getmath() > 33
								&& student[i].gethindi() > 33 && student[i].getenglish() > 33) {
							ob2.printMarksheet(student, i);
							flag = false;
						}
					}
					if (flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      Second Division student Not aveleval");
						System.out.println("\t\t  --------------------------------------------------------------------"
								+ resetColor);
					}
					break;
				case 3:
					for (int i = 0; i < n; i++) {
						if (student[i].getPer() >= 33 && student[i].getPer() < 45 && student[i].getphysics() > 33
								&& student[i].getchemistry() > 33 && student[i].getmath() > 33
								&& student[i].gethindi() > 33 && student[i].getenglish() > 33) {
							ob2.printMarksheet(student, i);
							flag = false;
						}
					}
					if (flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      Third Division student Not aveleval");
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------"
										+ resetColor);
					}
			}
		} while (choice != 6);
	}

	public void printMarksheet(DataClass ref[], int i) {
		Operation ob = new Operation();
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out.println("\t\t   |");

		System.out.println("\t\t   |\t\t\t\tBU BHOPAL   \n\t\t   |                                                   ");
		System.out.println("\t\t   |\tName  : " + ref[i].getName() + "\t\t\t\t\tBranch : " + ref[i].getBranch());
		System.out.println("\t\t   |\tFName : " + ref[i].getFName() + "\t\t\t\t\tSem    : " + ref[i].getSem() + "th");
		System.out.println("\t\t   |\tMName : " + ref[i].getMName() + "\t\t\t\t\tYear   : " + ref[i].getYear());
		System.out.println(
				"\t\t   |\tRoll  : " + ref[i].getRollNumber() + "\t\t\t\t\tCourse : " + ref[i].getCorse() + "\n");
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out.println("\t\t   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark");
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out.println("\t\t   |\tBCA100       Physics        100            33            " + ref[i].getphysics());
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out
				.println("\t\t   |\tBCA101       Chemistry      100            33            " + ref[i].getchemistry());
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out.println("\t\t   |\tBCA102       Math           100            33            " + ref[i].getmath());
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out.println("\t\t   |\tBCA103       Hindi          100            33            " + ref[i].gethindi());
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out.println("\t\t   |\tBCA104       English        100            33            " + ref[i].getenglish());
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out.println("\t\t   |\n\t\t   |");
		ob.division(ref, i);
		System.out.println("\t\t   |\n\t\t   |\n\t\t   |\n\t\t   |");
		System.out.println("\t\t   --------------------------------------------------------------------");
		System.out.println(
				" ____________________________________________________________________________________________________________________");
	}

	public void division(DataClass ref[], int i) {
		if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
				&& ref[i].getenglish() < 33) {
			System.out.println("   \t\t   |\tFail in All sub");
		} else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33
				&& ref[i].gethindi() < 33)
				|| (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33
						&& ref[i].getmath() < 33 & ref[i].getenglish() < 33)
				|| (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
						&& ref[i].getenglish() < 33)
				|| (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33
						&& ref[i].getenglish() < 33)
				|| (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
						&& ref[i].getenglish() < 33)) {
			System.out.println("   \t\t   |\tStatus     : Fail");
			if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33
					&& ref[i].gethindi() < 33) {
				System.out.println("   \t\t   |\tFail in phycics,getchemistry(),mathes,Hindi");
			} else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33
					&& ref[i].getmath() < 33 & ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in phycics,chemistry,mathes,enlish");
			} else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
					&& ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in phycics,mathes,hindi,enlish");
			} else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33
					&& ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in phycics,chemistry,hindi,enlish");
			} else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
					&& ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in chemistry,mathes,hindi,enlish");
			}
		} else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33) ||
				(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) ||
				(ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||
				(ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||
				(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) ||
				(ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
				(ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
				(ref[i].getphysics() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
				(ref[i].getenglish() < 33 && ref[i].getmath() < 33 && ref[i].getchemistry() < 33) ||
				(ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33)) {
			System.out.println("   \t\t   |\tStatus     : Fail");
			if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33) {
				System.out.println("   \t\t   |\tFail in physics,chemistry,mathes");
			} else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) {
				System.out.println("   \t\t   |\tFail in physics,chemistry,Hindi");
			} else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) {
				System.out.println("   \t\t   |\tFail in physics,mathes,hindi");
			} else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) {
				System.out.println("   \t\t   |\tFail in chemistry,mathes,hindi");
			} else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in physics,chemistry,enlish");
			} else if (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in chemistry,Hindi,enlish");
			} else if (ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in mathes,Hindi,enlish");
			} else if (ref[i].getphysics() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in physics,Hindi,english");
			} else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in chemistry,mathes,enlish");
			} else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in physics,mathes,enlish");
			}
		} else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33)
				|| (ref[i].getphysics() < 33 && ref[i].getmath() < 33) ||
				(ref[i].getphysics() < 33 && ref[i].gethindi() < 33)
				|| (ref[i].getphysics() < 33 && ref[i].getenglish() < 33) ||
				(ref[i].getchemistry() < 33 && ref[i].getmath() < 33)
				|| (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) ||
				(ref[i].getchemistry() < 33 && ref[i].getenglish() < 33)
				|| (ref[i].getmath() < 33 && ref[i].getenglish() < 33) ||
				(ref[i].getmath() < 33 && ref[i].gethindi() < 33)
				|| (ref[i].gethindi() < 33 && ref[i].getenglish() < 33)) {
			System.out.println("   \t\t   |\tStatus     : Supply in two Subject");
			if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33) {
				System.out.println("   \t\t   |\tFail in physics,chemistry");
			} else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33) {
				System.out.println("   \t\t   |\tFail in physics,getmath()es");
			} else if (ref[i].getphysics() < 33 && ref[i].gethindi() < 33) {
				System.out.println("   \t\t   |\tFail in physics,gethindi()");
			} else if (ref[i].getphysics() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in physics,english");
			} else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33) {
				System.out.println("   \t\t   |\tFail in chemistry,getmath()es");
			} else if (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) {
				System.out.println("   \t\t   |\tFail in chemistry,Hindi");
			} else if (ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in chemistry,english");
			} else if (ref[i].getmath() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in Mathes,English");
			} else if (ref[i].getmath() < 33 && ref[i].gethindi() < 33) {
				System.out.println("   \t\t   |\tFail in Mathes,Hindi");
			} else if (ref[i].gethindi() < 33 && ref[i].getenglish() < 33) {
				System.out.println("   \t\t   |\tFail in Hindi,English");
			}
		} else if (ref[i].getphysics() < 33 || ref[i].getchemistry() < 33 || ref[i].getmath() < 33
				|| ref[i].gethindi() < 33 || ref[i].getenglish() < 33) {
			System.out.println("   \t\t   |\tStatus     : Supply in a Subject");
			if (ref[i].getphysics() < 33) {
				System.out.println("   \t\t   |\tFail in physics");
			} else if (ref[i].getchemistry() < 33) {
				System.out.println("   \t\t   |\tFail in chemistry");
			} else if (ref[i].getmath() < 33) {
				System.out.println("   \t\t   |\tFail in mathes");
			} else if (ref[i].gethindi() < 33) {
				System.out.println("   \t\t   |\tFail in hindi");
			} else if (ref[i].getenglish() < 33) {
				System.out.println("   \t\t|\tFail in English");
			}
		} else {
			System.out.println("   \t\t   |\tPercentage : " + ref[i].getPer());
			if (ref[i].getPer() >= 60) {
				System.out.println("   \t\t   |\tStatuse    : Pass");
				System.out.println("   \t\t   |\tPass in first division");
			} else if (ref[i].getPer() >= 45) {
				System.out.println("   \t\t   |\tStatuse : Pass");
				System.out.println("   \t\t   |\tPass in Second division");
			} else {
				System.out.println("   \t\t   |\tStatuse : Pass");
				System.out.println("   \t\t   |\tPass in Third division");
			}
		}
	}

	public int takeRoll(DataClass student[], int i, Operation ob2) {
		Scanner sc = new Scanner(System.in);
		boolean flag;
		int roll;
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		do {
			roll = sc.nextInt();
			flag = false;
			for (int j = 0; i > 0 && j < i; j++) {
				if (student[j].getRollNumber() == roll) {
					System.out.println(
							color + "\t\t  --------------------------------------------------------------------");
					System.out.println("\t\t      Duplicate Roll Number ");
					System.out.println(
							"\t\t  --------------------------------------------------------------------" + resetColor);
					System.out.print("\t\t  Enter Agean Roll number : ");
					flag = true;
				}
			}
		} while (flag);
		return roll;
	}

	public int takeMark() {
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		Scanner sc = new Scanner(System.in);
		int mark;
		do {
			mark = sc.nextInt();
			if (mark < 0 || mark > 100) {
				System.out
						.println(color + "\t\t  --------------------------------------------------------------------");
				System.out.println("\t\t      Invalide marks of Please enter Agen mark!");
				System.out.println(
						"\t\t  --------------------------------------------------------------------" + resetColor);
			}
		} while (mark < 0 || mark > 100);
		return mark;
	}

	public int takeYear() {
		Scanner sc = new Scanner(System.in);
		int year;
		do {
			year = sc.nextInt();
			if (year <= 0 || year >= 5) {
				System.out.println("\t\t      Please Enter Valide Year");
			}
		} while (year <= 0 || year >= 5);
		return year;
	}

	public int takeSem(int year) {
		Scanner sc = new Scanner(System.in);
		int sem = 0;
		switch (year) {
			case 1:
				do {
					sem = sc.nextInt();
					if (sem != 1 && sem != 2) {
						System.out.println("\t\t      Please Enter Valide Sem");
					}
				} while (sem != 1 && sem != 2);
				break;
			case 2:
				do {
					sem = sc.nextInt();
					if (sem != 3 && sem != 4) {
						System.out.println("\t\t      Please Enter Valide Sem");
					}
				} while (sem != 3 && sem != 4);
				break;
			case 3:
				do {
					sem = sc.nextInt();
					if (sem != 5 && sem != 6) {
						System.out.println("\t\t      Please Enter Valide Sem");
					}
				} while (sem != 5 && sem != 6);
				break;
			case 4:
				do {
					sem = sc.nextInt();
					if (sem != 7 && sem != 8) {
						System.out.println("\t\t      Please Enter Valide Sem");
					}
				} while (sem != 7 && sem != 8);
		}
		return sem;
	}

	public void takeInput(int n, DataClass student[], Operation ob2) {
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		Scanner sc = new Scanner(System.in);
		Mark ob = new Mark();
		String corse, name, fname, mname, branch;

		int physics, chemistry, math, hindi, english, year, roll, sem;

		for (; i < n; i++) {
			// student[i] = new DataClass();
			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Roll number : ");
			roll = ob2.takeRoll(student, i, ob2);
			System.out.println("\t\t-------------------------------");

			// sc.nextLine();
			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your name : ");
			name = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your Father name : ");
			fname = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");

			System.out.print("\t\t  Enter Your Mother Name : ");
			mname = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Course name : ");
			corse = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your Branch name : ");
			branch = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your year : ");
			year = ob2.takeYear();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your Sem : ");
			sem = ob2.takeSem(year);
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of phycics : ");
			physics = ob2.takeMark();
			System.out.println("\t\t-------------------------------");
			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of chemistry : ");
			chemistry = ob2.takeMark();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of mathes : ");
			math = ob2.takeMark();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of Hindi : ");
			hindi = ob2.takeMark();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of English : ");
			english = ob2.takeMark();
			System.out.println("\t\t-------------------------------");

			student[i] = new DataClass(name, fname, mname, sem, branch, corse, year, roll, physics, chemistry, math,
					hindi, english);
			// student[i].setTotel();
			student[i].setPer();

			System.out.println(
					" ____________________________________________________________________________________________________________________");
		}
	}

	public void opChoice(Operation ob) {
		Scanner sc = new Scanner(System.in);
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";

		Operation ob1 = new Operation();
		DataClass[] student = new DataClass[100];

		int choice, num = 0;
		String id, pass;
		do {
			System.out.print("Enter User id : ");
			id = sc.nextLine();
			System.out.print("Enter Password : ");
			pass = sc.nextLine();
			if (id.equals("Sohan") && pass.equals("2002")) {
				do {
					System.out.println("\n\t\t\t\t\t     Your Choice are ");
					System.out.print("\t\t-----------------------");
					System.out.println("\t\t\t\t-----------------------");
					System.out.print("\t\t 1 For Insart Data");

					System.out.println("\t\t\t\t 2 For Search Record");
					System.out.print("\t\t-----------------------");
					System.out.println("\t\t\t\t-----------------------\n\n");
					System.out.print("\t\t-----------------------");
					System.out.println("\t\t\t\t-----------------------");
					System.out.print("\t\t 3 For Update Record");
					System.out.println("\t\t\t\t 50 For Home Screen");
					System.out.print("\t\t-----------------------");
					System.out.println("\t\t\t\t-----------------------\n\n");
					System.out.println("\n\t\t\t\t\t     Enter Your Choice");
					choice = sc.nextInt();
					System.out.println(
							" ____________________________________________________________________________________________________________________");
					switch (choice) {
						case 1:
							if (i == 0) {
								System.out.println("\t\t-------------------------------");
								System.out.print("\t\t  Enter number of student : ");
								n = sc.nextInt();
								System.out.println("\t\t-------------------------------");
								ob.takeInput(n, student, ob1);
							} else {
								System.out.println(color
										+ "\t\t  --------------------------------------------------------------------");
								System.out.println(
										"\t\t      Sum student Data allreday exisit please choose Update Record choices : ");
								System.out.println(
										"\t\t  --------------------------------------------------------------------"
												+ resetColor);
							}
							break;
						case 2:
							if (i != 0) {
								ob1.choice(student, n, ob1);
							} else {
								System.out.println(color
										+ "\t\t  --------------------------------------------------------------------");
								System.out
										.println("\t\t      Student data not aveleval please  insert sum student data");
								System.out.println(
										"\t\t  --------------------------------------------------------------------"
												+ resetColor);

							}
							break;
						case 3:
							if (i != 0) {
								System.out.print("\nHow many student data enter");
								num = sc.nextInt();
								n += num;
								ob.takeInput(n, student, ob1);
							} else {
								System.out.println(color
										+ "\t\t  --------------------------------------------------------------------");
								System.out.print(
										"\t\t      please enter sum student data then you can update the record : \n");
								System.out.println(
										"\t\t  --------------------------------------------------------------------"
												+ resetColor);
							}
							break;
						case 50:
							System.exit(0);
					}
				} while (choice != 50);
			} else {
				System.out.println("Please enter valide id password");
			}
		} while (id != "Sohan" && pass != "2002");
	}

}

class Mark // Clinte Class
{
	static int i = 0, n = 0;

	public static void main(String[] args) {

		Operation ob = new Operation();
		ob.opChoice(ob);
	}
}