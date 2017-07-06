package com.ireaserch.pojo;

import java.io.Serializable;

/**
 * Model class of mac�¶��ظ��Ƴ���.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class TMonthlyMacDuplicateRemoval implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ����id. */
	private Integer id;

	/** ���. */
	private Integer year;

	/** �·�. */
	private Integer month;

	/** mac����. */
	private Long macCount;

	/**
	 * Constructor.
	 */
	public TMonthlyMacDuplicateRemoval() {
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
	 * Set the ���.
	 * 
	 * @param year
	 *            ���
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * Get the ���.
	 * 
	 * @return ���
	 */
	public Integer getYear() {
		return this.year;
	}

	/**
	 * Set the �·�.
	 * 
	 * @param month
	 *            �·�
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}

	/**
	 * Get the �·�.
	 * 
	 * @return �·�
	 */
	public Integer getMonth() {
		return this.month;
	}

	/**
	 * Set the mac����.
	 * 
	 * @param macCount
	 *            mac����
	 */
	public void setMacCount(Long macCount) {
		this.macCount = macCount;
	}

	/**
	 * Get the mac����.
	 * 
	 * @return mac����
	 */
	public Long getMacCount() {
		return this.macCount;
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
		TMonthlyMacDuplicateRemoval other = (TMonthlyMacDuplicateRemoval) obj;
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