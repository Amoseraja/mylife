package com.bookstore;





import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name="mycamu")
public class detail {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    public detail( @NotNull(message = "Name cannot be null") String name, Long univereid, Long cousefee,
			Long salary, String username, String password, String email, String dob, String department, String semester,
			String gender, String courseName, byte[] profilePicture, String role) {
		super();
		
		this.name = name;
		this.univereid = univereid;
		this.cousefee = cousefee;
		this.salary = salary;
		this.username = username;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.department = department;
		this.semester = semester;
		this.gender = gender;
		this.courseName = courseName;
		this.profilePicture = profilePicture;
		this.role = role;
	}

		public detail() {
			super();
		}

		@NotNull(message = "Name cannot be null")
	    private String name;
	    
	    private Long univereid;
	    private Long cousefee;
	    private Long salary;
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getUnivereid() {
			return univereid;
		}

		public void setUnivereid(Long univereid) {
			this.univereid = univereid;
		}

		public Long getCousefee() {
			return cousefee;
		}

		public void setCousefee(Long cousefee) {
			this.cousefee = cousefee;
		}

		public Long getSalary() {
			return salary;
		}

		public void setSalary(Long salary) {
			this.salary = salary;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getSemester() {
			return semester;
		}

		public void setSemester(String semester) {
			this.semester = semester;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public byte[] getProfilePicture() {
			return profilePicture;
		}

		public void setProfilePicture(byte[] profilePicture) {
			this.profilePicture = profilePicture;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public BigDecimal getBalacane() {
			return balacane;
		}

		public void setBalacane(BigDecimal balacane) {
			this.balacane = balacane;
		}

		public int getAttendce() {
			return attendce;
		}

		public void setAttendce(int attendce) {
			this.attendce = attendce;
		}

		private String username;  // Changed to lowercase 'u' to follow naming conventions
	    
	    private String password;
	    
	    private String email;
	    
	    private String dob;  // Changed to String to store date of birth properly
	    
	    private String department;  // Corrected the spelling
	    
	    private String semester;  // Changed to lowercase
	    
	    private String gender;
	    
	    private String courseName;  // Changed to camel case
	    
	    @Lob  // Annotation for large objects
	    @Column(columnDefinition = "LONGBLOB")
	    private byte[] profilePicture;  // Changed to byte array for BLOB storage

		private String role;
		 private BigDecimal balacane;
		 private int attendce;
		 public String getPythonprogram() {
			return pythonprogram;
		}

		public void setPythonprogram(String pythonprogram) {
			this.pythonprogram = pythonprogram;
		}

		public String getJavaprogram() {
			return javaprogram;
		}

		public void setJavaprogram(String javaprogram) {
			this.javaprogram = javaprogram;
		}

		public String getSpringbootprogram() {
			return Springbootprogram;
		}

		public void setSpringbootprogram(String springbootprogram) {
			Springbootprogram = springbootprogram;
		}

		public String getSpringprogram() {
			return Springprogram;
		}

		public void setSpringprogram(String springprogram) {
			Springprogram = springprogram;
		}

		public String getMysql() {
			return mysql;
		}

		public void setMysql(String mysql) {
			this.mysql = mysql;
		}

		public String getReactjs() {
			return reactjs;
		}

		public void setReactjs(String reactjs) {
			this.reactjs = reactjs;
		}

		private String pythonprogram;
		 private String javaprogram;
		 private String Springbootprogram;
		 private String Springprogram;
		 private String mysql;
		 private String reactjs;
}