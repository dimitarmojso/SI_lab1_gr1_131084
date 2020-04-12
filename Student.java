class Student {
	String index;
	String firstName;
	String lastName;
	
	int labPoints[] = [10, 9, 10, 8, 10];

	public Student(index, firstName, lastName) {
		index = index;
		firstname = firstName;
		lastName = lastName;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public double getAverage() {
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<labPoints.length; i++) {
			sum += labPoints[i];
		}
		
		return average = sum / labPoints.length;	
	}

	public boolean hasSignature() {
		boolean hasSignature = false;
		int count = 0;
		
		for(int i=0; i<labPoints.length; i++) {
			count++;
		}
		
		if(count > 8) {
			hasSignature = true;
		}
		
		return hasSignature;
	}
}