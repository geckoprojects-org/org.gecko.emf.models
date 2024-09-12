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
package org.isotc211._2005.gmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MD Pixel Orientation Code Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.isotc211._2005.gmd.GMDPackage#getMDPixelOrientationCodeType()
 * @model extendedMetaData="name='MD_PixelOrientationCode_Type'"
 * @generated
 */
@ProviderType
public enum MDPixelOrientationCodeType implements Enumerator {
	/**
	 * The '<em><b>Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(0, "center", "center"),

	/**
	 * The '<em><b>Lower Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_LEFT(1, "lowerLeft", "lowerLeft"),

	/**
	 * The '<em><b>Lower Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_RIGHT(2, "lowerRight", "lowerRight"),

	/**
	 * The '<em><b>Upper Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_RIGHT(3, "upperRight", "upperRight"),

	/**
	 * The '<em><b>Upper Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_LEFT(4, "upperLeft", "upperLeft");

	/**
	 * The '<em><b>Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model name="center"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 0;

	/**
	 * The '<em><b>Lower Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_LEFT
	 * @model name="lowerLeft"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_LEFT_VALUE = 1;

	/**
	 * The '<em><b>Lower Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_RIGHT
	 * @model name="lowerRight"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_RIGHT_VALUE = 2;

	/**
	 * The '<em><b>Upper Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_RIGHT
	 * @model name="upperRight"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_RIGHT_VALUE = 3;

	/**
	 * The '<em><b>Upper Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_LEFT
	 * @model name="upperLeft"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_LEFT_VALUE = 4;

	/**
	 * An array of all the '<em><b>MD Pixel Orientation Code Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MDPixelOrientationCodeType[] VALUES_ARRAY =
		new MDPixelOrientationCodeType[] {
			CENTER,
			LOWER_LEFT,
			LOWER_RIGHT,
			UPPER_RIGHT,
			UPPER_LEFT,
		};

	/**
	 * A public read-only list of all the '<em><b>MD Pixel Orientation Code Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MDPixelOrientationCodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MD Pixel Orientation Code Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MDPixelOrientationCodeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MDPixelOrientationCodeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MD Pixel Orientation Code Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MDPixelOrientationCodeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MDPixelOrientationCodeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MD Pixel Orientation Code Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MDPixelOrientationCodeType get(int value) {
		switch (value) {
			case CENTER_VALUE: return CENTER;
			case LOWER_LEFT_VALUE: return LOWER_LEFT;
			case LOWER_RIGHT_VALUE: return LOWER_RIGHT;
			case UPPER_RIGHT_VALUE: return UPPER_RIGHT;
			case UPPER_LEFT_VALUE: return UPPER_LEFT;
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
	private MDPixelOrientationCodeType(int value, String name, String literal) {
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
	
} //MDPixelOrientationCodeType
