package com.ireaserch.pojo;

import java.io.Serializable;

/**
 * Model class of �û���.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class TUser implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ����id. */
	private Integer id;

	/** �û���. */
	private String username;

	/** ����. */
	private String password;

	/** �ǳ�. */
	private String nickname;

	/** gender. */
	private Integer gender;

	/** ��˾. */
	private String company;

	/** ����. */
	private String email;

	/** �������. */
	private Integer birthYear;

	/** �����·�. */
	private Integer birthMonth;

	/** ��������. */
	private Integer birthDay;

	/**
	 * Constructor.
	 */
	public TUser() {
	}

	/**
	 * Set the ����id.
	 * 
	 * @param id
	 *            ����id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the ����id.
	 * 
	 * @return ����id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Set the �û���.
	 * 
	 * @param username
	 *            �û���
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Get the �û���.
	 * 
	 * @return �û���
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Set the ����.
	 * 
	 * @param password
	 *            ����
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Get the ����.
	 * 
	 * @return ����
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Set the �ǳ�.
	 * 
	 * @param nickname
	 *            �ǳ�
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * Get the �ǳ�.
	 * 
	 * @return �ǳ�
	 */
	public String getNickname() {
		return this.nickname;
	}

	/**
	 * Set the gender.
	 * 
	 * @param gender
	 *            gender
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * Get the gender.
	 * 
	 * @return gender
	 */
	public Integer getGender() {
		return this.gender;
	}

	/**
	 * Set the ��˾.
	 * 
	 * @param company
	 *            ��˾
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * Get the ��˾.
	 * 
	 * @return ��˾
	 */
	public String getCompany() {
		return this.company;
	}

	/**
	 * Set the ����.
	 * 
	 * @param email
	 *            ����
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the ����.
	 * 
	 * @return ����
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Set the �������.
	 * 
	 * @param birthYear
	 *            �������
	 */
	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Get the �������.
	 * 
	 * @return �������
	 */
	public Integer getBirthYear() {
		return this.birthYear;
	}

	/**
	 * Set the �����·�.
	 * 
	 * @param birthMonth
	 *            �����·�
	 */
	public void setBirthMonth(Integer birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * Get the �����·�.
	 * 
	 * @return �����·�
	 */
	public Integer getBirthMonth() {
		return this.birthMonth;
	}

	/**
	 * Set the ��������.
	 * 
	 * @param birthDay
	 *            ��������
	 */
	public void setBirthDay(Integer birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * Get the ��������.
	 * 
	 * @return ��������
	 */
	public Integer getBirthDay() {
		return this.birthDay;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TUser other = (TUser) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}