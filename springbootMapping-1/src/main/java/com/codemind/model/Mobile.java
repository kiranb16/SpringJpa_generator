package com.codemind.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobile_table")
public class Mobile {
	@Id
	
	  @GeneratedValue(strategy = GenerationType.IDENTITY,
	  generator = "mobile_generator")
	  
	  @SequenceGenerator(name = "mobile_generator", sequenceName =
	  "mobile_sequence_table", initialValue = 1, allocationSize = 1)
	 
	int mobId;
	String mobName;

	public Mobile() {

	}

	public Mobile(int mobId, String mobName) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
	}

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", mobName=" + mobName + "]";
	}

}
