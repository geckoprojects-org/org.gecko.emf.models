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
package de.dwd.cdc.forecast.pointforecast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Product ID Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductIDType()
 * @model extendedMetaData="name='ProductID_._type'"
 * @generated
 */
@ProviderType
public enum ProductIDType implements Enumerator {
	/**
	 * The '<em><b>EZMOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EZMOS_VALUE
	 * @generated
	 * @ordered
	 */
	EZMOS(0, "EZMOS", "EZ_MOS"),

	/**
	 * The '<em><b>ICONMOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICONMOS_VALUE
	 * @generated
	 * @ordered
	 */
	ICONMOS(1, "ICONMOS", "ICON_MOS"),

	/**
	 * The '<em><b>MOSMIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOSMIX_VALUE
	 * @generated
	 * @ordered
	 */
	MOSMIX(2, "MOSMIX", "MOSMIX"),

	/**
	 * The '<em><b>COSMODEEPSEMOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSMODEEPSEMOS_VALUE
	 * @generated
	 * @ordered
	 */
	COSMODEEPSEMOS(3, "COSMODEEPSEMOS", "COSMO_DE_EPS_EMOS"),

	/**
	 * The '<em><b>MODELMIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODELMIX_VALUE
	 * @generated
	 * @ordered
	 */
	MODELMIX(4, "MODELMIX", "MODELMIX"),

	/**
	 * The '<em><b>GPTMOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPTMOS_VALUE
	 * @generated
	 * @ordered
	 */
	GPTMOS(5, "GPTMOS", "GPTMOS"),

	/**
	 * The '<em><b>ICONDMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICONDMO_VALUE
	 * @generated
	 * @ordered
	 */
	ICONDMO(6, "ICONDMO", "ICON_DMO"),

	/**
	 * The '<em><b>ICONNESTDMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICONNESTDMO_VALUE
	 * @generated
	 * @ordered
	 */
	ICONNESTDMO(7, "ICONNESTDMO", "ICON_NEST_DMO"),

	/**
	 * The '<em><b>DMOPTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMOPTP_VALUE
	 * @generated
	 * @ordered
	 */
	DMOPTP(8, "DMOPTP", "DMOPTP");

	/**
	 * The '<em><b>EZMOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EZMOS
	 * @model literal="EZ_MOS"
	 * @generated
	 * @ordered
	 */
	public static final int EZMOS_VALUE = 0;

	/**
	 * The '<em><b>ICONMOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICONMOS
	 * @model literal="ICON_MOS"
	 * @generated
	 * @ordered
	 */
	public static final int ICONMOS_VALUE = 1;

	/**
	 * The '<em><b>MOSMIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOSMIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOSMIX_VALUE = 2;

	/**
	 * The '<em><b>COSMODEEPSEMOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSMODEEPSEMOS
	 * @model literal="COSMO_DE_EPS_EMOS"
	 * @generated
	 * @ordered
	 */
	public static final int COSMODEEPSEMOS_VALUE = 3;

	/**
	 * The '<em><b>MODELMIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODELMIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODELMIX_VALUE = 4;

	/**
	 * The '<em><b>GPTMOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPTMOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPTMOS_VALUE = 5;

	/**
	 * The '<em><b>ICONDMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICONDMO
	 * @model literal="ICON_DMO"
	 * @generated
	 * @ordered
	 */
	public static final int ICONDMO_VALUE = 6;

	/**
	 * The '<em><b>ICONNESTDMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICONNESTDMO
	 * @model literal="ICON_NEST_DMO"
	 * @generated
	 * @ordered
	 */
	public static final int ICONNESTDMO_VALUE = 7;

	/**
	 * The '<em><b>DMOPTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMOPTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DMOPTP_VALUE = 8;

	/**
	 * An array of all the '<em><b>Product ID Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductIDType[] VALUES_ARRAY =
		new ProductIDType[] {
			EZMOS,
			ICONMOS,
			MOSMIX,
			COSMODEEPSEMOS,
			MODELMIX,
			GPTMOS,
			ICONDMO,
			ICONNESTDMO,
			DMOPTP,
		};

	/**
	 * A public read-only list of all the '<em><b>Product ID Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProductIDType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Product ID Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductIDType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductIDType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product ID Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductIDType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductIDType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product ID Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductIDType get(int value) {
		switch (value) {
			case EZMOS_VALUE: return EZMOS;
			case ICONMOS_VALUE: return ICONMOS;
			case MOSMIX_VALUE: return MOSMIX;
			case COSMODEEPSEMOS_VALUE: return COSMODEEPSEMOS;
			case MODELMIX_VALUE: return MODELMIX;
			case GPTMOS_VALUE: return GPTMOS;
			case ICONDMO_VALUE: return ICONDMO;
			case ICONNESTDMO_VALUE: return ICONNESTDMO;
			case DMOPTP_VALUE: return DMOPTP;
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
	private ProductIDType(int value, String name, String literal) {
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
	
} //ProductIDType
