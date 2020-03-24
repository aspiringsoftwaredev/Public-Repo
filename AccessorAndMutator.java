class Student
{
	private String studentName;

	private double cgpa;

	private int matricNumber;

	public void setStudentName(String _studentName)
	{
		studentName = _studentName;
	}

	public void setCGPA(double _cgpa)
	{
		cgpa = _cgpa;
	}

	public void setMatricNumber(int _matricNumber)
	{
		matricNumber = _matricNumber;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public double getCGPA()
	{
		return cgpa;
	}

	public int getMatricNumber()
	{
		return matricNumber;
	}
}

class AccessorAndMutator
{
	public static void main(String[] args)
	{
		Student student = new Student();

		student.setStudentName("Caleb Lipan");
		student.setCGPA(4.0);
		student.setMatricNumber(2019390031);

		System.out.println(student.getStudentName());
		System.out.println(student.getCGPA());
		System.out.println(student.getMatricNumber());
	}
}
