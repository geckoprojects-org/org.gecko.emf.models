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
 * A representation of the literals of the enumeration '<em><b>Binning</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         Represents the number of pixels that are combined to form larger pixels. {used:CCD,EMCCD}
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getBinning()
 * @model extendedMetaData="name='Binning'"
 * @generated
 */
@ProviderType
public enum Binning implements Enumerator {
	/**
	 * The '<em><b>1x1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No binning.
	 * <!-- end-model-doc -->
	 * @see #_1X1_VALUE
	 * @generated
	 * @ordered
	 */
	_1X1(0, "_1x1", "1x1"),

	/**
	 * The '<em><b>2x2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2×2 binning.
	 * <!-- end-model-doc -->
	 * @see #_2X2_VALUE
	 * @generated
	 * @ordered
	 */
	_2X2(1, "_2x2", "2x2"),

	/**
	 * The '<em><b>4x4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4×4 binning.
	 * <!-- end-model-doc -->
	 * @see #_4X4_VALUE
	 * @generated
	 * @ordered
	 */
	_4X4(2, "_4x4", "4x4"),

	/**
	 * The '<em><b>8x8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8×8 binning.
	 * <!-- end-model-doc -->
	 * @see #_8X8_VALUE
	 * @generated
	 * @ordered
	 */
	_8X8(3, "_8x8", "8x8"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other binning value.
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "Other", "Other");

	/**
	 * The '<em><b>1x1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No binning.
	 * <!-- end-model-doc -->
	 * @see #_1X1
	 * @model name="_1x1" literal="1x1"
	 * @generated
	 * @ordered
	 */
	public static final int _1X1_VALUE = 0;

	/**
	 * The '<em><b>2x2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2×2 binning.
	 * <!-- end-model-doc -->
	 * @see #_2X2
	 * @model name="_2x2" literal="2x2"
	 * @generated
	 * @ordered
	 */
	public static final int _2X2_VALUE = 1;

	/**
	 * The '<em><b>4x4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4×4 binning.
	 * <!-- end-model-doc -->
	 * @see #_4X4
	 * @model name="_4x4" literal="4x4"
	 * @generated
	 * @ordered
	 */
	public static final int _4X4_VALUE = 2;

	/**
	 * The '<em><b>8x8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8×8 binning.
	 * <!-- end-model-doc -->
	 * @see #_8X8
	 * @model name="_8x8" literal="8x8"
	 * @generated
	 * @ordered
	 */
	public static final int _8X8_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other binning value.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Binning</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Binning[] VALUES_ARRAY =
		new Binning[] {
			_1X1,
			_2X2,
			_4X4,
			_8X8,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Binning</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Binning> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binning</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Binning get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Binning result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binning</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Binning getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Binning result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binning</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Binning get(int value) {
		switch (value) {
			case _1X1_VALUE: return _1X1;
			case _2X2_VALUE: return _2X2;
			case _4X4_VALUE: return _4X4;
			case _8X8_VALUE: return _8X8;
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
	private Binning(int value, String name, String literal) {
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
	
} //Binning
