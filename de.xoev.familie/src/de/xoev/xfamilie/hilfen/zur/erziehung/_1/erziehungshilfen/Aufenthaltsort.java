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
 * A representation of the literals of the enumeration '<em><b>Aufenthaltsort</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAufenthaltsort()
 * @model extendedMetaData="name='aufenthaltsort'"
 * @generated
 */
@ProviderType
public enum Aufenthaltsort implements Enumerator {
	/**
	 * The '<em><b>Eiha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIHA_VALUE
	 * @generated
	 * @ordered
	 */
	EIHA(0, "eiha", "eiha"),

	/**
	 * The '<em><b>Elha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELHA_VALUE
	 * @generated
	 * @ordered
	 */
	ELHA(1, "elha", "elha"),

	/**
	 * The '<em><b>Juhi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUHI_VALUE
	 * @generated
	 * @ordered
	 */
	JUHI(2, "juhi", "juhi"),

	/**
	 * The '<em><b>Krha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KRHA_VALUE
	 * @generated
	 * @ordered
	 */
	KRHA(3, "krha", "krha"),

	/**
	 * The '<em><b>Soau</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOAU_VALUE
	 * @generated
	 * @ordered
	 */
	SOAU(4, "soau", "soau");

	/**
	 * The '<em><b>Eiha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIHA
	 * @model name="eiha"
	 * @generated
	 * @ordered
	 */
	public static final int EIHA_VALUE = 0;

	/**
	 * The '<em><b>Elha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELHA
	 * @model name="elha"
	 * @generated
	 * @ordered
	 */
	public static final int ELHA_VALUE = 1;

	/**
	 * The '<em><b>Juhi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUHI
	 * @model name="juhi"
	 * @generated
	 * @ordered
	 */
	public static final int JUHI_VALUE = 2;

	/**
	 * The '<em><b>Krha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KRHA
	 * @model name="krha"
	 * @generated
	 * @ordered
	 */
	public static final int KRHA_VALUE = 3;

	/**
	 * The '<em><b>Soau</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOAU
	 * @model name="soau"
	 * @generated
	 * @ordered
	 */
	public static final int SOAU_VALUE = 4;

	/**
	 * An array of all the '<em><b>Aufenthaltsort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Aufenthaltsort[] VALUES_ARRAY =
		new Aufenthaltsort[] {
			EIHA,
			ELHA,
			JUHI,
			KRHA,
			SOAU,
		};

	/**
	 * A public read-only list of all the '<em><b>Aufenthaltsort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Aufenthaltsort> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aufenthaltsort</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Aufenthaltsort get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Aufenthaltsort result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aufenthaltsort</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Aufenthaltsort getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Aufenthaltsort result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aufenthaltsort</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Aufenthaltsort get(int value) {
		switch (value) {
			case EIHA_VALUE: return EIHA;
			case ELHA_VALUE: return ELHA;
			case JUHI_VALUE: return JUHI;
			case KRHA_VALUE: return KRHA;
			case SOAU_VALUE: return SOAU;
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
	private Aufenthaltsort(int value, String name, String literal) {
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
	
} //Aufenthaltsort
