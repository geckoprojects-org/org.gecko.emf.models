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
 * A representation of the literals of the enumeration '<em><b>Vertretung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getVertretung()
 * @model extendedMetaData="name='vertretung'"
 * @generated
 */
@ProviderType
public enum Vertretung implements Enumerator {
	/**
	 * The '<em><b>01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_01_VALUE
	 * @generated
	 * @ordered
	 */
	_01(0, "_01", "01"),

	/**
	 * The '<em><b>02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_02_VALUE
	 * @generated
	 * @ordered
	 */
	_02(1, "_02", "02"),

	/**
	 * The '<em><b>03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_03_VALUE
	 * @generated
	 * @ordered
	 */
	_03(2, "_03", "03"),

	/**
	 * The '<em><b>04</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_04_VALUE
	 * @generated
	 * @ordered
	 */
	_04(3, "_04", "04"),

	/**
	 * The '<em><b>05</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_05_VALUE
	 * @generated
	 * @ordered
	 */
	_05(4, "_05", "05"),

	/**
	 * The '<em><b>06</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_06_VALUE
	 * @generated
	 * @ordered
	 */
	_06(5, "_06", "06"),

	/**
	 * The '<em><b>07</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_07_VALUE
	 * @generated
	 * @ordered
	 */
	_07(6, "_07", "07");

	/**
	 * The '<em><b>01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_01
	 * @model literal="01"
	 * @generated
	 * @ordered
	 */
	public static final int _01_VALUE = 0;

	/**
	 * The '<em><b>02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_02
	 * @model literal="02"
	 * @generated
	 * @ordered
	 */
	public static final int _02_VALUE = 1;

	/**
	 * The '<em><b>03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_03
	 * @model literal="03"
	 * @generated
	 * @ordered
	 */
	public static final int _03_VALUE = 2;

	/**
	 * The '<em><b>04</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_04
	 * @model literal="04"
	 * @generated
	 * @ordered
	 */
	public static final int _04_VALUE = 3;

	/**
	 * The '<em><b>05</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_05
	 * @model literal="05"
	 * @generated
	 * @ordered
	 */
	public static final int _05_VALUE = 4;

	/**
	 * The '<em><b>06</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_06
	 * @model literal="06"
	 * @generated
	 * @ordered
	 */
	public static final int _06_VALUE = 5;

	/**
	 * The '<em><b>07</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_07
	 * @model literal="07"
	 * @generated
	 * @ordered
	 */
	public static final int _07_VALUE = 6;

	/**
	 * An array of all the '<em><b>Vertretung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Vertretung[] VALUES_ARRAY =
		new Vertretung[] {
			_01,
			_02,
			_03,
			_04,
			_05,
			_06,
			_07,
		};

	/**
	 * A public read-only list of all the '<em><b>Vertretung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Vertretung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vertretung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Vertretung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Vertretung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vertretung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Vertretung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Vertretung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vertretung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Vertretung get(int value) {
		switch (value) {
			case _01_VALUE: return _01;
			case _02_VALUE: return _02;
			case _03_VALUE: return _03;
			case _04_VALUE: return _04;
			case _05_VALUE: return _05;
			case _06_VALUE: return _06;
			case _07_VALUE: return _07;
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
	private Vertretung(int value, String name, String literal) {
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
	
} //Vertretung
