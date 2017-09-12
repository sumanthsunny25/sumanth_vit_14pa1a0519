import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private static final Exception IllegalArgumentException = null;
	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null) {
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		if(index>students.length-1 || index < 0)
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		 if(student==null) {
		 	 try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 }
		 else {
		 	 if(index<0 || index>students.length-1) {
		 		 try {
					throw IllegalArgumentException;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 	 }
		 	 else
		 		 students[index]=student;
		 }	 
	}

	@Override
	public void addFirst(Student student) {
		if(student==null) {
		 	 try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		else {
			Student []tmpStudent = new Student[students.length+1];
		 	for(int i=students.length-1;i>=0;i--){
		 		tmpStudent[i+1]=students[i];
		    }
		 	tmpStudent[0]=student;
		 	students=tmpStudent; 
		}    	 
	}

	@Override
	public void addLast(Student student) {
		if(student==null) {
		 	 try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		else {
			Student []tmpStudent = new Student[students.length+1];
		 	for(int i=students.length-1;i>=0;i--){
		 		tmpStudent[i]=students[i];
		    }
		 	tmpStudent[tmpStudent.length-1]=student;
		 	students=tmpStudent; 
		}    	 
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
