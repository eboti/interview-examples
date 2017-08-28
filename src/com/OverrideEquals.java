package com;

public class OverrideEquals {

	public static void main(String[] args){

		new OverrideEquals().asdf();
	}
	
	public void asdf(){
		Person p = new Person();
		System.out.println(p.hashCode());
		p.setFirstName("Joe");
		System.out.println(p.getFirstName().hashCode());
		
	}
	
	public class Person{
		private int id;
		private String firstName;
		private String lastName;
		
		
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result
					+ ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + id;
			result = prime * result
					+ ((lastName == null) ? 0 : lastName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (id != other.id)
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			return true;
		}

		private OverrideEquals getOuterType() {
			return OverrideEquals.this;
		}

//		@Override
//		public boolean equals(Object obj) {
//			
//			if (obj == this){
//				return true;
//			}
//			
//			if (obj == null || obj.getClass() != this.getClass()){
//				return false;
//			}
//						
//			Person guest = (Person) obj;
//	        return id == guest.id
//	                && (firstName == guest.firstName 
//	                     || (firstName != null && firstName.equals(guest.getFirstName())))
//	                && (lastName == guest.lastName 
//	                     || (lastName != null && lastName .equals(guest.getLastName())));
//		}
		
//		@Override
//		public int hashCode() {
//			return super.hashCode();
//		}
		
		
		
		
	}
}
