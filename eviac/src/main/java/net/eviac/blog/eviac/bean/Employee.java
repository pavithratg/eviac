package net.eviac.blog.eviac.bean;

import java.util.Date;

/**
 * 
 * 'Employee' Java Bean class will be used by the XML based configuration to
 * provide its mapping details.
 *
 */
public class Employee {

	private int id;
	private String name;
	private String role;
	private Date insertTime;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

}
