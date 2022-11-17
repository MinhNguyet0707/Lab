import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Menber implements NhapThongTin{
private int id;
private String name;
private String dob;
private String job;

public Menber() {
	super();
}
public Menber(int id, String name, String dob, String job) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
	this.job = job;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}

@Override
public String toString() {
	return "Menber [id=" + id + ", name=" + name + ", dob=" + dob + ", job=" + job + "]";
}
@Override
public void nhapThongTin() {
	 System.out.print("Nhập id ");
     this.id = new Scanner(System.in).nextInt();
	 System.out.print("Nhập họ và tên : ");
	        this.name = new Scanner(System.in).nextLine();
	        System.out.print("Nhập địa chỉ: ");
	        this.dob= new Scanner(System.in).nextLine();
	        System.out.print("Nhập công việc : ");
	        this.job = new Scanner(System.in).nextLine();
}


}
