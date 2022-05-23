package lab4e1;

public class Person {

		String name;
		float age;
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		public Person(String name, float age) {
			super();
			this.name = name;
			this.age = age;
		}
		
	

}
