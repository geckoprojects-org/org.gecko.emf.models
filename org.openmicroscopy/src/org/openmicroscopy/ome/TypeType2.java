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
 * A representation of the literals of the enumeration '<em><b>Type Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getTypeType2()
 * @model extendedMetaData="name='Type_._2_._type'"
 * @generated
 */
@ProviderType
public enum TypeType2 implements Enumerator {
	/**
	 * The '<em><b>CCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CCD_VALUE
	 * @generated
	 * @ordered
	 */
	CCD(0, "CCD", "CCD"),

	/**
	 * The '<em><b>Intensified CCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTENSIFIED_CCD_VALUE
	 * @generated
	 * @ordered
	 */
	INTENSIFIED_CCD(1, "IntensifiedCCD", "IntensifiedCCD"),

	/**
	 * The '<em><b>Analog Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_VIDEO(2, "AnalogVideo", "AnalogVideo"),

	/**
	 * The '<em><b>PMT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMT_VALUE
	 * @generated
	 * @ordered
	 */
	PMT(3, "PMT", "PMT"),

	/**
	 * The '<em><b>Photodiode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTODIODE_VALUE
	 * @generated
	 * @ordered
	 */
	PHOTODIODE(4, "Photodiode", "Photodiode"),

	/**
	 * The '<em><b>Spectroscopy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTROSCOPY_VALUE
	 * @generated
	 * @ordered
	 */
	SPECTROSCOPY(5, "Spectroscopy", "Spectroscopy"),

	/**
	 * The '<em><b>Lifetime Imaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFETIME_IMAGING_VALUE
	 * @generated
	 * @ordered
	 */
	LIFETIME_IMAGING(6, "LifetimeImaging", "LifetimeImaging"),

	/**
	 * The '<em><b>Correlation Spectroscopy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRELATION_SPECTROSCOPY_VALUE
	 * @generated
	 * @ordered
	 */
	CORRELATION_SPECTROSCOPY(7, "CorrelationSpectroscopy", "CorrelationSpectroscopy"),

	/**
	 * The '<em><b>FTIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTIR_VALUE
	 * @generated
	 * @ordered
	 */
	FTIR(8, "FTIR", "FTIR"),

	/**
	 * The '<em><b>EMCCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMCCD_VALUE
	 * @generated
	 * @ordered
	 */
	EMCCD(9, "EMCCD", "EMCCD"),

	/**
	 * The '<em><b>APD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APD_VALUE
	 * @generated
	 * @ordered
	 */
	APD(10, "APD", "APD"),

	/**
	 * The '<em><b>CMOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMOS_VALUE
	 * @generated
	 * @ordered
	 */
	CMOS(11, "CMOS", "CMOS"),

	/**
	 * The '<em><b>EBCCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBCCD_VALUE
	 * @generated
	 * @ordered
	 */
	EBCCD(12, "EBCCD", "EBCCD"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(13, "Other", "Other");

	/**
	 * The '<em><b>CCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CCD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CCD_VALUE = 0;

	/**
	 * The '<em><b>Intensified CCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTENSIFIED_CCD
	 * @model name="IntensifiedCCD"
	 * @generated
	 * @ordered
	 */
	public static final int INTENSIFIED_CCD_VALUE = 1;

	/**
	 * The '<em><b>Analog Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_VIDEO
	 * @model name="AnalogVideo"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VIDEO_VALUE = 2;

	/**
	 * The '<em><b>PMT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PMT_VALUE = 3;

	/**
	 * The '<em><b>Photodiode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTODIODE
	 * @model name="Photodiode"
	 * @generated
	 * @ordered
	 */
	public static final int PHOTODIODE_VALUE = 4;

	/**
	 * The '<em><b>Spectroscopy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTROSCOPY
	 * @model name="Spectroscopy"
	 * @generated
	 * @ordered
	 */
	public static final int SPECTROSCOPY_VALUE = 5;

	/**
	 * The '<em><b>Lifetime Imaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFETIME_IMAGING
	 * @model name="LifetimeImaging"
	 * @generated
	 * @ordered
	 */
	public static final int LIFETIME_IMAGING_VALUE = 6;

	/**
	 * The '<em><b>Correlation Spectroscopy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRELATION_SPECTROSCOPY
	 * @model name="CorrelationSpectroscopy"
	 * @generated
	 * @ordered
	 */
	public static final int CORRELATION_SPECTROSCOPY_VALUE = 7;

	/**
	 * The '<em><b>FTIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTIR_VALUE = 8;

	/**
	 * The '<em><b>EMCCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMCCD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMCCD_VALUE = 9;

	/**
	 * The '<em><b>APD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APD_VALUE = 10;

	/**
	 * The '<em><b>CMOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMOS_VALUE = 11;

	/**
	 * The '<em><b>EBCCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBCCD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EBCCD_VALUE = 12;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 13;

	/**
	 * An array of all the '<em><b>Type Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType2[] VALUES_ARRAY =
		new TypeType2[] {
			CCD,
			INTENSIFIED_CCD,
			ANALOG_VIDEO,
			PMT,
			PHOTODIODE,
			SPECTROSCOPY,
			LIFETIME_IMAGING,
			CORRELATION_SPECTROSCOPY,
			FTIR,
			EMCCD,
			APD,
			CMOS,
			EBCCD,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType2 get(int value) {
		switch (value) {
			case CCD_VALUE: return CCD;
			case INTENSIFIED_CCD_VALUE: return INTENSIFIED_CCD;
			case ANALOG_VIDEO_VALUE: return ANALOG_VIDEO;
			case PMT_VALUE: return PMT;
			case PHOTODIODE_VALUE: return PHOTODIODE;
			case SPECTROSCOPY_VALUE: return SPECTROSCOPY;
			case LIFETIME_IMAGING_VALUE: return LIFETIME_IMAGING;
			case CORRELATION_SPECTROSCOPY_VALUE: return CORRELATION_SPECTROSCOPY;
			case FTIR_VALUE: return FTIR;
			case EMCCD_VALUE: return EMCCD;
			case APD_VALUE: return APD;
			case CMOS_VALUE: return CMOS;
			case EBCCD_VALUE: return EBCCD;
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
	private TypeType2(int value, String name, String literal) {
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
	
} //TypeType2
