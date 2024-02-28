package Collection_Set;

public class Member {
	private String name;
	private int age;
	private String id;
	
	public Member() {
		super();
	}

	public Member(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		String str = name + age + id;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean isTrue = false;
		
		if (obj instanceof Member) {
			Member mem = (Member)obj;
			
			if (this.getName().equals(mem.getName()) &&
					this.getAge() == mem.getAge() &&
					this.getId().equals(mem.getId())) {
				isTrue = true;
			}
		}
		
		return isTrue;
	}
	
	

}
