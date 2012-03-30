/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "nation", schema = "PUBLIC")
public class NationRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.cubrid.demodb.tables.records.NationRecord> {

	private static final long serialVersionUID = 1114832197;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setCode(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CODE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "code", unique = true, nullable = false, length = 3)
	public java.lang.String getCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CODE);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.cubrid.demodb.tables.records.ParticipantRecord> fetchParticipantList() {
		return create()
			.selectFrom(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT)
			.where(org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT.NATION_CODE.equal(getValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CODE)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "name", nullable = false, precision = 40)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setContinent(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CONTINENT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "continent", precision = 10)
	public java.lang.String getContinent() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CONTINENT);
	}

	/**
	 * An uncommented item
	 */
	public void setCapital(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CAPITAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "capital", precision = 30)
	public java.lang.String getCapital() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Nation.NATION.CAPITAL);
	}

	/**
	 * Create a detached NationRecord
	 */
	public NationRecord() {
		super(org.jooq.examples.cubrid.demodb.tables.Nation.NATION);
	}
}
