package com.ireaserch.pojo;

import java.io.Serializable;

/**
 * Model class of ����ؼ��ֱ�.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class TCrowdKeywords implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ����ID. */
	private Integer crowdId;

	/** �ؼ��ֶ�. */
	private String keyword;

	/**
	 * Constructor.
	 */
	public TCrowdKeywords() {
	}

	/**
	 * Set the ����ID.
	 * 
	 * @param crowdId
	 *            ����ID
	 */
	public void setCrowdId(Integer crowdId) {
		this.crowdId = crowdId;
	}

	/**
	 * Get the ����ID.
	 * 
	 * @return ����ID
	 */
	public Integer getCrowdId() {
		return this.crowdId;
	}

	/**
	 * Set the �ؼ��ֶ�.
	 * 
	 * @param keyword
	 *            �ؼ��ֶ�
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * Get the �ؼ��ֶ�.
	 * 
	 * @return �ؼ��ֶ�
	 */
	public String getKeyword() {
		return this.keyword;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crowdId == null) ? 0 : crowdId.hashCode());
		result = prime * result + ((keyword == null) ? 0 : keyword.hashCode());
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
		TCrowdKeywords other = (TCrowdKeywords) obj;
		if (crowdId == null) {
			if (other.crowdId != null) {
				return false;
			}
		} else if (!crowdId.equals(other.crowdId)) {
			return false;
		}
		if (keyword == null) {
			if (other.keyword != null) {
				return false;
			}
		} else if (!keyword.equals(other.keyword)) {
			return false;
		}
		return true;
	}

}
