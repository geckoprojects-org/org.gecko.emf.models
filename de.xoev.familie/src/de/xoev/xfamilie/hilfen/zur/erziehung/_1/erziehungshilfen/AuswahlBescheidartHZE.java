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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Auswahl Bescheidart HZE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAuswahlBescheidartHZE()
 * @model extendedMetaData="name='auswahlBescheidartHZE'"
 * @generated
 */
@ProviderType
public enum AuswahlBescheidartHZE implements Enumerator {
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
	_03(2, "_03", "03");

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
	 * An array of all the '<em><b>Auswahl Bescheidart HZE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuswahlBescheidartHZE[] VALUES_ARRAY =
		new AuswahlBescheidartHZE[] {
			_01,
			_02,
			_03,
		};

	/**
	 * A public read-only list of all the '<em><b>Auswahl Bescheidart HZE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuswahlBescheidartHZE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Auswahl Bescheidart HZE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuswahlBescheidartHZE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuswahlBescheidartHZE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auswahl Bescheidart HZE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuswahlBescheidartHZE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuswahlBescheidartHZE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auswahl Bescheidart HZE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuswahlBescheidartHZE get(int value) {
		switch (value) {
			case _01_VALUE: return _01;
			case _02_VALUE: return _02;
			case _03_VALUE: return _03;
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
	private AuswahlBescheidartHZE(int value, String name, String literal) {
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
	
} //AuswahlBescheidartHZE
