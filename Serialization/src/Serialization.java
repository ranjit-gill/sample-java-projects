import java.io.*;
import java.io.Serializable;

public class Serialization {
	public static void main(String[] args) {
		String fileName="employee.txt";
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Self Learning");
		emp.setSalary(5000);
		
		//serialize to file
		try {
			SerializationUtil.serialize(emp, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		Employee empNew = null;
		try {
			empNew = (Employee) SerializationUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empNew);
	}
	
}

 class Employee implements Serializable {

	//private static final long serialVersionUID = -6470090944414208496L;
	
	private String name;
	private int id;
	 private int salary;

	
	@Override
	public String toString(){
		return "Employee{name="+name+",id="+id+",salary="+salary+"}";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


}
 
  class SerializationUtil {

		
		public static Object deserialize(String fileName) throws IOException,
				ClassNotFoundException {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			ois.close();
			return obj;
		}

		
		public static void serialize(Object obj, String fileName)
				throws IOException {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);

			fos.close();
		}
  }

