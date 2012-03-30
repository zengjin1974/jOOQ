/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables;

/**
 * This class is generated by jOOQ.
 */
public class Nation extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.cubrid.demodb.tables.records.NationRecord> {

	private static final long serialVersionUID = -1208304136;

	/**
	 * The singleton instance of PUBLIC.nation
	 */
	public static final org.jooq.examples.cubrid.demodb.tables.Nation NATION = new org.jooq.examples.cubrid.demodb.tables.Nation();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.cubrid.demodb.tables.records.NationRecord> __RECORD_TYPE = org.jooq.examples.cubrid.demodb.tables.records.NationRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.cubrid.demodb.tables.records.NationRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.NationRecord, java.lang.String> CODE = createField("code", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.NationRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.NationRecord, java.lang.String> CONTINENT = createField("continent", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.NationRecord, java.lang.String> CAPITAL = createField("capital", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private Nation() {
		super("nation", org.jooq.examples.cubrid.demodb.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private Nation(java.lang.String alias) {
		super(alias, org.jooq.examples.cubrid.demodb.Public.PUBLIC, org.jooq.examples.cubrid.demodb.tables.Nation.NATION);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.NationRecord> getMainKey() {
		return org.jooq.examples.cubrid.demodb.Keys.NATION__PK_NATION_CODE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.NationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.NationRecord>>asList(org.jooq.examples.cubrid.demodb.Keys.NATION__PK_NATION_CODE);
	}

	@Override
	public org.jooq.examples.cubrid.demodb.tables.Nation as(java.lang.String alias) {
		return new org.jooq.examples.cubrid.demodb.tables.Nation(alias);
	}
}
