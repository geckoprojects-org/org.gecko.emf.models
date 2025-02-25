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
package org.openmicroscopy.ome;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pulse Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getPulseType()
 * @model extendedMetaData="name='Pulse_._type'"
 * @generated
 */
@ProviderType
public enum PulseType implements Enumerator {
	/**
	 * The '<em><b>CW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CW_VALUE
	 * @generated
	 * @ordered
	 */
	CW(0, "CW", "CW"),

	/**
	 * The '<em><b>Single</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(1, "Single", "Single"),

	/**
	 * The '<em><b>QSwitched</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QSWITCHED_VALUE
	 * @generated
	 * @ordered
	 */
	QSWITCHED(2, "QSwitched", "QSwitched"),

	/**
	 * The '<em><b>Repetitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPETITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	REPETITIVE(3, "Repetitive", "Repetitive"),

	/**
	 * The '<em><b>Mode Locked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	MODE_LOCKED(4, "ModeLocked", "ModeLocked"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "Other", "Other");

	/**
	 * The '<em><b>CW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CW_VALUE = 0;

	/**
	 * The '<em><b>Single</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @model name="Single"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 1;

	/**
	 * The '<em><b>QSwitched</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QSWITCHED
	 * @model name="QSwitched"
	 * @generated
	 * @ordered
	 */
	public static final int QSWITCHED_VALUE = 2;

	/**
	 * The '<em><b>Repetitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPETITIVE
	 * @model name="Repetitive"
	 * @generated
	 * @ordered
	 */
	public static final int REPETITIVE_VALUE = 3;

	/**
	 * The '<em><b>Mode Locked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_LOCKED
	 * @model name="ModeLocked"
	 * @generated
	 * @ordered
	 */
	public static final int MODE_LOCKED_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Pulse Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PulseType[] VALUES_ARRAY =
		new PulseType[] {
			CW,
			SINGLE,
			QSWITCHED,
			REPETITIVE,
			MODE_LOCKED,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Pulse Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PulseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pulse Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PulseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PulseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pulse Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PulseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PulseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pulse Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PulseType get(int value) {
		switch (value) {
			case CW_VALUE: return CW;
			case SINGLE_VALUE: return SINGLE;
			case QSWITCHED_VALUE: return QSWITCHED;
			case REPETITIVE_VALUE: return REPETITIVE;
			case MODE_LOCKED_VALUE: return MODE_LOCKED;
			case OTHER_VALUE: return OTHER;
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
	private PulseType(int value, String name, String literal) {
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
	
} //PulseType
