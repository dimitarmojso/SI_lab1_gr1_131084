class Course{
	List<Student> students = new ArrayList<Student>();
	
	public boolean addStudent(Student student){
    		if (student==null || studentList.contains(student)) { 
		        return false;
    		}
    		studentList.add(student);
    	return true;
	}
}