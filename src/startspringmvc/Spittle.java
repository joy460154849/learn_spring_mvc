package startspringmvc;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spittle {
	
	private  Long id;
	private  String message;
	private  Date time;
	private Double latitude;
	private Double longitude;
	@NotNull
	@Size(min=5,max=16)
	private String userName;
	@NotNull
	@Size(min=5,max=16)
	private String firstName;
	private String lastName;
	@NotNull
	private String email;
	@NotNull
	@Size(min=5,max=16)
	private String passsword;
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Long getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	public Date getTime() {
		return time;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Spittle other = (Spittle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Spittle(String message, Date time, Double latitude, Double longitude) {
		super();
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Spittle(String message, Date time) {
		super();
		this.message = message;
		this.time = time;
	}
	public Spittle() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	
	
}
