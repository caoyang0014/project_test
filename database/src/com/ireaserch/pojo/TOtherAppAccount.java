package com.ireaserch.pojo;

import java.io.Serializable;

/**
 * Model class of 其他APP数量表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class TOtherAppAccount implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 自增id. */
	private Integer id;

	/** APP名称. */
	private String appName;

	/** 总数量. */
	private Long totalAccount;

	/**
	 * Constructor.
	 */
	public TOtherAppAccount() {
	}

	/**
	 * Set the 自增id.
	 * 
	 * @param id
	 *            自增id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the 自增id.
	 * 
	 * @return 自增id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Set the APP名称.
	 * 
	 * @param appName
	 *            APP名称
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * Get the APP名称.
	 * 
	 * @return APP名称
	 */
	public String getAppName() {
		return this.appName;
	}

	/**
	 * Set the 总数量.
	 * 
	 * @param totalAccount
	 *            总数量
	 */
	public void setTotalAccount(Long totalAccount) {
		this.totalAccount = totalAccount;
	}

	/**
	 * Get the 总数量.
	 * 
	 * @return 总数量
	 */
	public Long getTotalAccount() {
		return this.totalAccount;
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
		TOtherAppAccount other = (TOtherAppAccount) obj;
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
