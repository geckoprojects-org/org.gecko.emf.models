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
package org.emau.icmvc.ganimed.ttp.cm2.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Id Matching Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getIdMatchingType()
 * @model extendedMetaData="name='idMatchingType'"
 * @generated
 */
@ProviderType
public enum IdMatchingType implements Enumerator {
	/**
	 * The '<em><b>ATLEASTONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATLEASTONE_VALUE
	 * @generated
	 * @ordered
	 */
	ATLEASTONE(0, "ATLEASTONE", "AT_LEAST_ONE"),

	/**
	 * The '<em><b>ATLEASTALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATLEASTALL_VALUE
	 * @generated
	 * @ordered
	 */
	ATLEASTALL(1, "ATLEASTALL", "AT_LEAST_ALL"),

	/**
	 * The '<em><b>EXACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACT_VALUE
	 * @generated
	 * @ordered
	 */
	EXACT(2, "EXACT", "EXACT");

	/**
	 * The '<em><b>ATLEASTONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATLEASTONE
	 * @model literal="AT_LEAST_ONE"
	 * @generated
	 * @ordered
	 */
	public static final int ATLEASTONE_VALUE = 0;

	/**
	 * The '<em><b>ATLEASTALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATLEASTALL
	 * @model literal="AT_LEAST_ALL"
	 * @generated
	 * @ordered
	 */
	public static final int ATLEASTALL_VALUE = 1;

	/**
	 * The '<em><b>EXACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXACT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Id Matching Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdMatchingType[] VALUES_ARRAY =
		new IdMatchingType[] {
			ATLEASTONE,
			ATLEASTALL,
			EXACT,
		};

	/**
	 * A public read-only list of all the '<em><b>Id Matching Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdMatchingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Id Matching Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdMatchingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdMatchingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Id Matching Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdMatchingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdMatchingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Id Matching Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdMatchingType get(int value) {
		switch (value) {
			case ATLEASTONE_VALUE: return ATLEASTONE;
			case ATLEASTALL_VALUE: return ATLEASTALL;
			case EXACT_VALUE: return EXACT;
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
	private IdMatchingType(int value, String name, String literal) {
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
	
} //IdMatchingType
