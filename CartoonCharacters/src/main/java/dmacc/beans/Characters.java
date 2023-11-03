package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Characters {
		@Id
		@GeneratedValue
		private long id;
		private String firstName;
		private String lastName;
		private String cartoon;
		private int age;
		@Autowired
		private Address address;
		
		public Characters() {
			super();
			// TODO Auto-generated constructor stub
			this.cartoon = "Scooby-Doo";
		}
		
		public Characters(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Characters(String firstName, String lastName, String cartoon, int age) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.cartoon = cartoon;
			this.age = age;
		}
		public Characters(long id, String firstName, String lastName, String cartoon, int age) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.cartoon = cartoon;
			this.age = age;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
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

		public String getCartoon() {
			return cartoon;
		}

		public void setCartoon(String cartoon) {
			this.cartoon = cartoon;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Character [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", cartoon="
					+ cartoon + ", age=" + age + ", address=" + address + "]";
		}

		
}
