/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Temporal Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getTemporalType()
 * @model extendedMetaData="name='temporal_._type'"
 * @generated
 */
@ProviderType
public enum TemporalType implements Enumerator {
	/**
	 * The '<em><b>Dcmiperiod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCMIPERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	DCMIPERIOD(0, "dcmiperiod", "dcmiperiod"),

	/**
	 * The '<em><b>W3c Dtf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W3C_DTF_VALUE
	 * @generated
	 * @ordered
	 */
	W3C_DTF(1, "w3cDtf", "w3c-dtf"),

	/**
	 * The '<em><b>Othertemporal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERTEMPORAL_VALUE
	 * @generated
	 * @ordered
	 */
	OTHERTEMPORAL(2, "othertemporal", "othertemporal");

	/**
	 * The '<em><b>Dcmiperiod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCMIPERIOD
	 * @model name="dcmiperiod"
	 * @generated
	 * @ordered
	 */
	public static final int DCMIPERIOD_VALUE = 0;

	/**
	 * The '<em><b>W3c Dtf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W3C_DTF
	 * @model name="w3cDtf" literal="w3c-dtf"
	 * @generated
	 * @ordered
	 */
	public static final int W3C_DTF_VALUE = 1;

	/**
	 * The '<em><b>Othertemporal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERTEMPORAL
	 * @model name="othertemporal"
	 * @generated
	 * @ordered
	 */
	public static final int OTHERTEMPORAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Temporal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TemporalType[] VALUES_ARRAY =
		new TemporalType[] {
			DCMIPERIOD,
			W3C_DTF,
			OTHERTEMPORAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Temporal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TemporalType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Temporal Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TemporalType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TemporalType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TemporalType get(int value) {
		switch (value) {
			case DCMIPERIOD_VALUE: return DCMIPERIOD;
			case W3C_DTF_VALUE: return W3C_DTF;
			case OTHERTEMPORAL_VALUE: return OTHERTEMPORAL;
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
	private TemporalType(int value, String name, String literal) {
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
	
} //TemporalType
