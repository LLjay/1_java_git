package Test8;

public class User {
	
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + "  " + password + "  " + name + "  " + age + "  " + gender
				+ "  " + phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	@Override
//	public boolean equals(Object obj) {
//		return super.equals(obj);
//	}

	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
//	
	public boolean equals(Object obj) {
		boolean isEquals = false;
		// 이거 없이
		
		if (obj instanceof User) {
			User tmpUser = ((User)obj);
			if (this.getName().equals(tmpUser.getName()) &&
				this.getId().equals(tmpUser.getId()) &&
				this.getPassword().equals(tmpUser.getPassword()) &&
				this.getAge() == tmpUser.getAge() &&
				this.getGender() == tmpUser.getGender() &&
				this.getPhone().equals(tmpUser.getPhone())) {
				isEquals = true; // return true; 하고
			}
		}
		
		return isEquals; // return false; 해도 되는데
		// 나중에 코드가 복잡해지면 중간중간 return을 넣어서 반환할 때
		// 매번 어디서 return 하는지 찾아줘야 함
		// 정보 가공?
		// 정보 변경이 쭉 있어도 나중에 처음 설정한 값으로 반환해주는 방식이 활용하기 좋음
		
	}

	public Object clone() {
		User newUser = new User(this.id, this.password, this.name, this.age, this.gender, this.phone);
		return newUser;
	}
	// 객체를 참조변수로 받아 어떻게 반환값이 다른 것으로 바꿀 수 있느냐
	
}
