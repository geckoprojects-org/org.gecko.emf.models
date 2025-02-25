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
 * A representation of the literals of the enumeration '<em><b>Dimension Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getDimensionOrderType()
 * @model extendedMetaData="name='DimensionOrder_._type'"
 * @generated
 */
@ProviderType
public enum DimensionOrderType implements Enumerator {
	/**
	 * The '<em><b>XYZCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYZCT_VALUE
	 * @generated
	 * @ordered
	 */
	XYZCT(0, "XYZCT", "XYZCT"),

	/**
	 * The '<em><b>XYZTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYZTC_VALUE
	 * @generated
	 * @ordered
	 */
	XYZTC(1, "XYZTC", "XYZTC"),

	/**
	 * The '<em><b>XYCTZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYCTZ_VALUE
	 * @generated
	 * @ordered
	 */
	XYCTZ(2, "XYCTZ", "XYCTZ"),

	/**
	 * The '<em><b>XYCZT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYCZT_VALUE
	 * @generated
	 * @ordered
	 */
	XYCZT(3, "XYCZT", "XYCZT"),

	/**
	 * The '<em><b>XYTCZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYTCZ_VALUE
	 * @generated
	 * @ordered
	 */
	XYTCZ(4, "XYTCZ", "XYTCZ"),

	/**
	 * The '<em><b>XYTZC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYTZC_VALUE
	 * @generated
	 * @ordered
	 */
	XYTZC(5, "XYTZC", "XYTZC");

	/**
	 * The '<em><b>XYZCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYZCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XYZCT_VALUE = 0;

	/**
	 * The '<em><b>XYZTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYZTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XYZTC_VALUE = 1;

	/**
	 * The '<em><b>XYCTZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYCTZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XYCTZ_VALUE = 2;

	/**
	 * The '<em><b>XYCZT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYCZT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XYCZT_VALUE = 3;

	/**
	 * The '<em><b>XYTCZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYTCZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XYTCZ_VALUE = 4;

	/**
	 * The '<em><b>XYTZC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYTZC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XYTZC_VALUE = 5;

	/**
	 * An array of all the '<em><b>Dimension Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DimensionOrderType[] VALUES_ARRAY =
		new DimensionOrderType[] {
			XYZCT,
			XYZTC,
			XYCTZ,
			XYCZT,
			XYTCZ,
			XYTZC,
		};

	/**
	 * A public read-only list of all the '<em><b>Dimension Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DimensionOrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dimension Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DimensionOrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DimensionOrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dimension Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DimensionOrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DimensionOrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dimension Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DimensionOrderType get(int value) {
		switch (value) {
			case XYZCT_VALUE: return XYZCT;
			case XYZTC_VALUE: return XYZTC;
			case XYCTZ_VALUE: return XYCTZ;
			case XYCZT_VALUE: return XYCZT;
			case XYTCZ_VALUE: return XYTCZ;
			case XYTZC_VALUE: return XYTZC;
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
	private DimensionOrderType(int value, String name, String literal) {
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
	
} //DimensionOrderType
