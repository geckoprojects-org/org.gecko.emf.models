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
 * A representation of the literals of the enumeration '<em><b>Type Type Item1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getTypeTypeItem1()
 * @model extendedMetaData="name='Type_._type_._item'"
 * @generated
 */
@ProviderType
public enum TypeTypeItem1 implements Enumerator {
	/**
	 * The '<em><b>FRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAP_VALUE
	 * @generated
	 * @ordered
	 */
	FRAP(0, "FRAP", "FRAP"),

	/**
	 * The '<em><b>FLIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIP_VALUE
	 * @generated
	 * @ordered
	 */
	FLIP(1, "FLIP", "FLIP"),

	/**
	 * The '<em><b>Inverse FRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE_FRAP_VALUE
	 * @generated
	 * @ordered
	 */
	INVERSE_FRAP(2, "InverseFRAP", "InverseFRAP"),

	/**
	 * The '<em><b>Photoablation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTOABLATION_VALUE
	 * @generated
	 * @ordered
	 */
	PHOTOABLATION(3, "Photoablation", "Photoablation"),

	/**
	 * The '<em><b>Photoactivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTOACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	PHOTOACTIVATION(4, "Photoactivation", "Photoactivation"),

	/**
	 * The '<em><b>Uncaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCAGING_VALUE
	 * @generated
	 * @ordered
	 */
	UNCAGING(5, "Uncaging", "Uncaging"),

	/**
	 * The '<em><b>Optical Trapping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTICAL_TRAPPING_VALUE
	 * @generated
	 * @ordered
	 */
	OPTICAL_TRAPPING(6, "OpticalTrapping", "OpticalTrapping"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "Other", "Other");

	/**
	 * The '<em><b>FRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRAP_VALUE = 0;

	/**
	 * The '<em><b>FLIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLIP_VALUE = 1;

	/**
	 * The '<em><b>Inverse FRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE_FRAP
	 * @model name="InverseFRAP"
	 * @generated
	 * @ordered
	 */
	public static final int INVERSE_FRAP_VALUE = 2;

	/**
	 * The '<em><b>Photoablation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTOABLATION
	 * @model name="Photoablation"
	 * @generated
	 * @ordered
	 */
	public static final int PHOTOABLATION_VALUE = 3;

	/**
	 * The '<em><b>Photoactivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTOACTIVATION
	 * @model name="Photoactivation"
	 * @generated
	 * @ordered
	 */
	public static final int PHOTOACTIVATION_VALUE = 4;

	/**
	 * The '<em><b>Uncaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCAGING
	 * @model name="Uncaging"
	 * @generated
	 * @ordered
	 */
	public static final int UNCAGING_VALUE = 5;

	/**
	 * The '<em><b>Optical Trapping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTICAL_TRAPPING
	 * @model name="OpticalTrapping"
	 * @generated
	 * @ordered
	 */
	public static final int OPTICAL_TRAPPING_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type Type Item1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeTypeItem1[] VALUES_ARRAY =
		new TypeTypeItem1[] {
			FRAP,
			FLIP,
			INVERSE_FRAP,
			PHOTOABLATION,
			PHOTOACTIVATION,
			UNCAGING,
			OPTICAL_TRAPPING,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type Item1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeTypeItem1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type Item1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeTypeItem1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeTypeItem1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type Item1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeTypeItem1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeTypeItem1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type Item1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeTypeItem1 get(int value) {
		switch (value) {
			case FRAP_VALUE: return FRAP;
			case FLIP_VALUE: return FLIP;
			case INVERSE_FRAP_VALUE: return INVERSE_FRAP;
			case PHOTOABLATION_VALUE: return PHOTOABLATION;
			case PHOTOACTIVATION_VALUE: return PHOTOACTIVATION;
			case UNCAGING_VALUE: return UNCAGING;
			case OPTICAL_TRAPPING_VALUE: return OPTICAL_TRAPPING;
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
	private TypeTypeItem1(int value, String name, String literal) {
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
	
} //TypeTypeItem1
