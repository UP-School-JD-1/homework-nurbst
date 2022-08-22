package Ch13;

public class Reader{
	String readerName;
	int readerAge;
	char sex;
	
	Book book;
	
	public String getName() {
		return readerName;
	}
	
	public void setName(String readerName) {
		this.readerName = readerName;
	}
	
	public int getAge() {
		return readerAge;
	}
	
	public void setAge(int readerAge) {
		this.readerAge = readerAge;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	public Reader(String readerName , int readerAge, char sex) {
		this.readerName=readerName;
		this.readerAge=readerAge;
		this.sex=sex;
		
	}
	
	
	public Reader() {
		
	}
	
	
	public String Read (Book book) {
		return readerName;
		
	}
	
	
	
}