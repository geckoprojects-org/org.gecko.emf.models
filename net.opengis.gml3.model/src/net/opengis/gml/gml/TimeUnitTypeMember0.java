/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.gml.gml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Unit Type Member0</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.gml.gml.GMLPackage#getTimeUnitTypeMember0()
 * @model extendedMetaData="name='TimeUnitType_._member_._0'"
 * @generated
 */
@ProviderType
public enum TimeUnitTypeMember0 implements Enumerator {
	/**
	 * The '<em><b>Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR(0, "year", "year"),

	/**
	 * The '<em><b>Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH(1, "month", "month"),

	/**
	 * The '<em><b>Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(2, "day", "day"),

	/**
	 * The '<em><b>Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR(3, "hour", "hour"),

	/**
	 * The '<em><b>Minute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTE(4, "minute", "minute"),

	/**
	 * The '<em><b>Second</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND(5, "second", "second");

	/**
	 * The '<em><b>Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR
	 * @model name="year"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_VALUE = 0;

	/**
	 * The '<em><b>Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH
	 * @model name="month"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_VALUE = 1;

	/**
	 * The '<em><b>Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model name="day"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 2;

	/**
	 * The '<em><b>Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR
	 * @model name="hour"
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_VALUE = 3;

	/**
	 * The '<em><b>Minute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTE
	 * @model name="minute"
	 * @generated
	 * @ordered
	 */
	public static final int MINUTE_VALUE = 4;

	/**
	 * The '<em><b>Second</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND
	 * @model name="second"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_VALUE = 5;

	/**
	 * An array of all the '<em><b>Time Unit Type Member0</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeUnitTypeMember0[] VALUES_ARRAY =
		new TimeUnitTypeMember0[] {
			YEAR,
			MONTH,
			DAY,
			HOUR,
			MINUTE,
			SECOND,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Unit Type Member0</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeUnitTypeMember0> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Unit Type Member0</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeUnitTypeMember0 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeUnitTypeMember0 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Unit Type Member0</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeUnitTypeMember0 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeUnitTypeMember0 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Unit Type Member0</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeUnitTypeMember0 get(int value) {
		switch (value) {
			case YEAR_VALUE: return YEAR;
			case MONTH_VALUE: return MONTH;
			case DAY_VALUE: return DAY;
			case HOUR_VALUE: return HOUR;
			case MINUTE_VALUE: return MINUTE;
			case SECOND_VALUE: return SECOND;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeUnitTypeMember0(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimeUnitTypeMember0
