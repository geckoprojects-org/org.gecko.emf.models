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
 * A representation of the literals of the enumeration '<em><b>Pixel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The number size/kind used to represent a pixel
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getPixelType()
 * @model extendedMetaData="name='PixelType'"
 * @generated
 */
@ProviderType
public enum PixelType implements Enumerator {
	/**
	 * The '<em><b>Int8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8 bit signed integer.
	 * <!-- end-model-doc -->
	 * @see #INT8_VALUE
	 * @generated
	 * @ordered
	 */
	INT8(0, "int8", "int8"),

	/**
	 * The '<em><b>Int16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16 bit signed integer.
	 * <!-- end-model-doc -->
	 * @see #INT16_VALUE
	 * @generated
	 * @ordered
	 */
	INT16(1, "int16", "int16"),

	/**
	 * The '<em><b>Int32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32 bit signed integer.
	 * <!-- end-model-doc -->
	 * @see #INT32_VALUE
	 * @generated
	 * @ordered
	 */
	INT32(2, "int32", "int32"),

	/**
	 * The '<em><b>Uint8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8 bit unsigned integer.
	 * <!-- end-model-doc -->
	 * @see #UINT8_VALUE
	 * @generated
	 * @ordered
	 */
	UINT8(3, "uint8", "uint8"),

	/**
	 * The '<em><b>Uint16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16 bit unsigned integer.
	 * <!-- end-model-doc -->
	 * @see #UINT16_VALUE
	 * @generated
	 * @ordered
	 */
	UINT16(4, "uint16", "uint16"),

	/**
	 * The '<em><b>Uint32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32 bit unsigned integer.
	 * <!-- end-model-doc -->
	 * @see #UINT32_VALUE
	 * @generated
	 * @ordered
	 */
	UINT32(5, "uint32", "uint32"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * single-precision floating point.
	 * <!-- end-model-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(6, "float", "float"),

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * double-precision floating point.
	 * <!-- end-model-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(7, "double", "double"),

	/**
	 * The '<em><b>Complex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * complex single-precision floating point.
	 * <!-- end-model-doc -->
	 * @see #COMPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEX(8, "complex", "complex"),

	/**
	 * The '<em><b>Double Complex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * complex double-precision floating point.
	 * <!-- end-model-doc -->
	 * @see #DOUBLE_COMPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_COMPLEX(9, "doubleComplex", "double-complex"),

	/**
	 * The '<em><b>Bit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bit mask.
	 * <!-- end-model-doc -->
	 * @see #BIT_VALUE
	 * @generated
	 * @ordered
	 */
	BIT(10, "bit", "bit");

	/**
	 * The '<em><b>Int8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8 bit signed integer.
	 * <!-- end-model-doc -->
	 * @see #INT8
	 * @model name="int8"
	 * @generated
	 * @ordered
	 */
	public static final int INT8_VALUE = 0;

	/**
	 * The '<em><b>Int16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16 bit signed integer.
	 * <!-- end-model-doc -->
	 * @see #INT16
	 * @model name="int16"
	 * @generated
	 * @ordered
	 */
	public static final int INT16_VALUE = 1;

	/**
	 * The '<em><b>Int32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32 bit signed integer.
	 * <!-- end-model-doc -->
	 * @see #INT32
	 * @model name="int32"
	 * @generated
	 * @ordered
	 */
	public static final int INT32_VALUE = 2;

	/**
	 * The '<em><b>Uint8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8 bit unsigned integer.
	 * <!-- end-model-doc -->
	 * @see #UINT8
	 * @model name="uint8"
	 * @generated
	 * @ordered
	 */
	public static final int UINT8_VALUE = 3;

	/**
	 * The '<em><b>Uint16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16 bit unsigned integer.
	 * <!-- end-model-doc -->
	 * @see #UINT16
	 * @model name="uint16"
	 * @generated
	 * @ordered
	 */
	public static final int UINT16_VALUE = 4;

	/**
	 * The '<em><b>Uint32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32 bit unsigned integer.
	 * <!-- end-model-doc -->
	 * @see #UINT32
	 * @model name="uint32"
	 * @generated
	 * @ordered
	 */
	public static final int UINT32_VALUE = 5;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * single-precision floating point.
	 * <!-- end-model-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 6;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * double-precision floating point.
	 * <!-- end-model-doc -->
	 * @see #DOUBLE
	 * @model name="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 7;

	/**
	 * The '<em><b>Complex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * complex single-precision floating point.
	 * <!-- end-model-doc -->
	 * @see #COMPLEX
	 * @model name="complex"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEX_VALUE = 8;

	/**
	 * The '<em><b>Double Complex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * complex double-precision floating point.
	 * <!-- end-model-doc -->
	 * @see #DOUBLE_COMPLEX
	 * @model name="doubleComplex" literal="double-complex"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_COMPLEX_VALUE = 9;

	/**
	 * The '<em><b>Bit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bit mask.
	 * <!-- end-model-doc -->
	 * @see #BIT
	 * @model name="bit"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_VALUE = 10;

	/**
	 * An array of all the '<em><b>Pixel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PixelType[] VALUES_ARRAY =
		new PixelType[] {
			INT8,
			INT16,
			INT32,
			UINT8,
			UINT16,
			UINT32,
			FLOAT,
			DOUBLE,
			COMPLEX,
			DOUBLE_COMPLEX,
			BIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Pixel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PixelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pixel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PixelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PixelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pixel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PixelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PixelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pixel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PixelType get(int value) {
		switch (value) {
			case INT8_VALUE: return INT8;
			case INT16_VALUE: return INT16;
			case INT32_VALUE: return INT32;
			case UINT8_VALUE: return UINT8;
			case UINT16_VALUE: return UINT16;
			case UINT32_VALUE: return UINT32;
			case FLOAT_VALUE: return FLOAT;
			case DOUBLE_VALUE: return DOUBLE;
			case COMPLEX_VALUE: return COMPLEX;
			case DOUBLE_COMPLEX_VALUE: return DOUBLE_COMPLEX;
			case BIT_VALUE: return BIT;
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
	private PixelType(int value, String name, String literal) {
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
	
} //PixelType
