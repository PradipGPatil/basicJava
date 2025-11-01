package recordProject;

public class TestStudent {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			Student s = new Student("s11" + i, switch (i) {
			case 1 -> "pradip";
			case 2 -> "pankaj";
			case 3 -> "reshma";
			case 4 -> "ranjni";
			default -> "unknow";
			}

					, "30/12/94", "java");
			System.out.println(s);
		}
		
		for (int i = 1; i < 5; i++) {
			LPAStudent s = new LPAStudent("s11" + i, switch (i) {
			case 1 -> "pradip";
			case 2 -> "pankaj";
			case 3 -> "reshma";
			case 4 -> "ranjni";
			default -> "unknow";
			}

					, "30/12/94", "java");
			System.out.println(s);
		}
		System.out.println("-----");
		Student pojoStudent=new Student("s22", "Raj", "12/12/1985", "master java");
		
		LPAStudent recordStudent=new LPAStudent("s23", "mATT", "12/12/1985", "master java");
		System.out.println(pojoStudent);
		System.out.println("--");
		System.out.println(recordStudent);
		
		System.out.println();
		System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassList());
		System.out.println(recordStudent.name()+" is taking "+recordStudent.classList());
	}
}
