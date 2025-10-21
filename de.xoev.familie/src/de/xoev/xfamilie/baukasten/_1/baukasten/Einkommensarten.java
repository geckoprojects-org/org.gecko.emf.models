/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.xoev.xfamilie.baukasten._1.baukasten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Einkommensarten</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEinkommensarten()
 * @model extendedMetaData="name='einkommensarten'"
 * @generated
 */
@ProviderType
public enum Einkommensarten implements Enumerator {
	/**
	 * The '<em><b>1000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1000_VALUE
	 * @generated
	 * @ordered
	 */
	_1000(0, "_1000", "1000"),

	/**
	 * The '<em><b>1100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1100_VALUE
	 * @generated
	 * @ordered
	 */
	_1100(1, "_1100", "1100"),

	/**
	 * The '<em><b>2050</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2050_VALUE
	 * @generated
	 * @ordered
	 */
	_2050(2, "_2050", "2050"),

	/**
	 * The '<em><b>2070</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2070_VALUE
	 * @generated
	 * @ordered
	 */
	_2070(3, "_2070", "2070"),

	/**
	 * The '<em><b>2140</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2140_VALUE
	 * @generated
	 * @ordered
	 */
	_2140(4, "_2140", "2140"),

	/**
	 * The '<em><b>3000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3000_VALUE
	 * @generated
	 * @ordered
	 */
	_3000(5, "_3000", "3000"),

	/**
	 * The '<em><b>6180</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_6180_VALUE
	 * @generated
	 * @ordered
	 */
	_6180(6, "_6180", "6180");

	/**
	 * The '<em><b>1000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1000
	 * @model literal="1000"
	 * @generated
	 * @ordered
	 */
	public static final int _1000_VALUE = 0;

	/**
	 * The '<em><b>1100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1100
	 * @model literal="1100"
	 * @generated
	 * @ordered
	 */
	public static final int _1100_VALUE = 1;

	/**
	 * The '<em><b>2050</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2050
	 * @model literal="2050"
	 * @generated
	 * @ordered
	 */
	public static final int _2050_VALUE = 2;

	/**
	 * The '<em><b>2070</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2070
	 * @model literal="2070"
	 * @generated
	 * @ordered
	 */
	public static final int _2070_VALUE = 3;

	/**
	 * The '<em><b>2140</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2140
	 * @model literal="2140"
	 * @generated
	 * @ordered
	 */
	public static final int _2140_VALUE = 4;

	/**
	 * The '<em><b>3000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3000
	 * @model literal="3000"
	 * @generated
	 * @ordered
	 */
	public static final int _3000_VALUE = 5;

	/**
	 * The '<em><b>6180</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_6180
	 * @model literal="6180"
	 * @generated
	 * @ordered
	 */
	public static final int _6180_VALUE = 6;

	/**
	 * An array of all the '<em><b>Einkommensarten</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Einkommensarten[] VALUES_ARRAY =
		new Einkommensarten[] {
			_1000,
			_1100,
			_2050,
			_2070,
			_2140,
			_3000,
			_6180,
		};

	/**
	 * A public read-only list of all the '<em><b>Einkommensarten</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Einkommensarten> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Einkommensarten</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Einkommensarten get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Einkommensarten result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Einkommensarten</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Einkommensarten getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Einkommensarten result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Einkommensarten</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Einkommensarten get(int value) {
		switch (value) {
			case _1000_VALUE: return _1000;
			case _1100_VALUE: return _1100;
			case _2050_VALUE: return _2050;
			case _2070_VALUE: return _2070;
			case _2140_VALUE: return _2140;
			case _3000_VALUE: return _3000;
			case _6180_VALUE: return _6180;
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
	private Einkommensarten(int value, String name, String literal) {
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
	
} //Einkommensarten
