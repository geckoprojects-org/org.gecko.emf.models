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
 * A representation of the literals of the enumeration '<em><b>Units Frequency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The units used to represent frequency
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getUnitsFrequency()
 * @model extendedMetaData="name='UnitsFrequency'"
 * @generated
 */
@ProviderType
public enum UnitsFrequency implements Enumerator {
	/**
	 * The '<em><b>YHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottahertz unit.
	 * <!-- end-model-doc -->
	 * @see #YHZ_VALUE
	 * @generated
	 * @ordered
	 */
	YHZ(0, "YHz", "YHz"),

	/**
	 * The '<em><b>ZHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettahertz unit.
	 * <!-- end-model-doc -->
	 * @see #ZHZ_VALUE
	 * @generated
	 * @ordered
	 */
	ZHZ(1, "ZHz", "ZHz"),

	/**
	 * The '<em><b>EHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exahertz unit.
	 * <!-- end-model-doc -->
	 * @see #EHZ_VALUE
	 * @generated
	 * @ordered
	 */
	EHZ(2, "EHz", "EHz"),

	/**
	 * The '<em><b>PHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petahertz unit.
	 * <!-- end-model-doc -->
	 * @see #PHZ_VALUE
	 * @generated
	 * @ordered
	 */
	PHZ(3, "PHz", "PHz"),

	/**
	 * The '<em><b>THz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terahertz unit.
	 * <!-- end-model-doc -->
	 * @see #THZ_VALUE
	 * @generated
	 * @ordered
	 */
	THZ(4, "THz", "THz"),

	/**
	 * The '<em><b>GHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigahertz unit.
	 * <!-- end-model-doc -->
	 * @see #GHZ_VALUE
	 * @generated
	 * @ordered
	 */
	GHZ(5, "GHz", "GHz"),

	/**
	 * The '<em><b>MHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megahertz unit.
	 * <!-- end-model-doc -->
	 * @see #MHZ_VALUE
	 * @generated
	 * @ordered
	 */
	MHZ(6, "MHz", "MHz"),

	/**
	 * The '<em><b>KHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilohertz unit.
	 * <!-- end-model-doc -->
	 * @see #KHZ_VALUE
	 * @generated
	 * @ordered
	 */
	KHZ(7, "kHz", "kHz"),

	/**
	 * The '<em><b>HHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectohertz unit.
	 * <!-- end-model-doc -->
	 * @see #HHZ_VALUE
	 * @generated
	 * @ordered
	 */
	HHZ(8, "hHz", "hHz"),

	/**
	 * The '<em><b>Da Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decahertz unit.
	 * <!-- end-model-doc -->
	 * @see #DA_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	DA_HZ(9, "daHz", "daHz"),

	/**
	 * The '<em><b>Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hertz unit.
	 * <!-- end-model-doc -->
	 * @see #HZ_VALUE
	 * @generated
	 * @ordered
	 */
	HZ(10, "Hz", "Hz"),

	/**
	 * The '<em><b>DHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decihertz unit.
	 * <!-- end-model-doc -->
	 * @see #DHZ_VALUE
	 * @generated
	 * @ordered
	 */
	DHZ(11, "dHz", "dHz"),

	/**
	 * The '<em><b>CHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centihertz unit.
	 * <!-- end-model-doc -->
	 * @see #CHZ_VALUE
	 * @generated
	 * @ordered
	 */
	CHZ(12, "cHz", "cHz"),

	/**
	 * The '<em><b>MHz1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millihertz unit.
	 * <!-- end-model-doc -->
	 * @see #MHZ1_VALUE
	 * @generated
	 * @ordered
	 */
	MHZ1(13, "mHz1", "mHz"),

	/**
	 * The '<em><b>ΜHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * microhertz unit.
	 * <!-- end-model-doc -->
	 * @see #ΜHZ_VALUE
	 * @generated
	 * @ordered
	 */
	ΜHZ(14, "µHz", "\u00b5Hz"),

	/**
	 * The '<em><b>NHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanohertz unit.
	 * <!-- end-model-doc -->
	 * @see #NHZ_VALUE
	 * @generated
	 * @ordered
	 */
	NHZ(15, "nHz", "nHz"),

	/**
	 * The '<em><b>PHz1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picohertz unit.
	 * <!-- end-model-doc -->
	 * @see #PHZ1_VALUE
	 * @generated
	 * @ordered
	 */
	PHZ1(16, "pHz1", "pHz"),

	/**
	 * The '<em><b>FHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtohertz unit.
	 * <!-- end-model-doc -->
	 * @see #FHZ_VALUE
	 * @generated
	 * @ordered
	 */
	FHZ(17, "fHz", "fHz"),

	/**
	 * The '<em><b>AHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attohertz unit.
	 * <!-- end-model-doc -->
	 * @see #AHZ_VALUE
	 * @generated
	 * @ordered
	 */
	AHZ(18, "aHz", "aHz"),

	/**
	 * The '<em><b>ZHz1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptohertz unit.
	 * <!-- end-model-doc -->
	 * @see #ZHZ1_VALUE
	 * @generated
	 * @ordered
	 */
	ZHZ1(19, "zHz1", "zHz"),

	/**
	 * The '<em><b>YHz1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctohertz unit.
	 * <!-- end-model-doc -->
	 * @see #YHZ1_VALUE
	 * @generated
	 * @ordered
	 */
	YHZ1(20, "yHz1", "yHz");

	/**
	 * The '<em><b>YHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottahertz unit.
	 * <!-- end-model-doc -->
	 * @see #YHZ
	 * @model name="YHz"
	 * @generated
	 * @ordered
	 */
	public static final int YHZ_VALUE = 0;

	/**
	 * The '<em><b>ZHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettahertz unit.
	 * <!-- end-model-doc -->
	 * @see #ZHZ
	 * @model name="ZHz"
	 * @generated
	 * @ordered
	 */
	public static final int ZHZ_VALUE = 1;

	/**
	 * The '<em><b>EHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exahertz unit.
	 * <!-- end-model-doc -->
	 * @see #EHZ
	 * @model name="EHz"
	 * @generated
	 * @ordered
	 */
	public static final int EHZ_VALUE = 2;

	/**
	 * The '<em><b>PHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petahertz unit.
	 * <!-- end-model-doc -->
	 * @see #PHZ
	 * @model name="PHz"
	 * @generated
	 * @ordered
	 */
	public static final int PHZ_VALUE = 3;

	/**
	 * The '<em><b>THz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terahertz unit.
	 * <!-- end-model-doc -->
	 * @see #THZ
	 * @model name="THz"
	 * @generated
	 * @ordered
	 */
	public static final int THZ_VALUE = 4;

	/**
	 * The '<em><b>GHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigahertz unit.
	 * <!-- end-model-doc -->
	 * @see #GHZ
	 * @model name="GHz"
	 * @generated
	 * @ordered
	 */
	public static final int GHZ_VALUE = 5;

	/**
	 * The '<em><b>MHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megahertz unit.
	 * <!-- end-model-doc -->
	 * @see #MHZ
	 * @model name="MHz"
	 * @generated
	 * @ordered
	 */
	public static final int MHZ_VALUE = 6;

	/**
	 * The '<em><b>KHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilohertz unit.
	 * <!-- end-model-doc -->
	 * @see #KHZ
	 * @model name="kHz"
	 * @generated
	 * @ordered
	 */
	public static final int KHZ_VALUE = 7;

	/**
	 * The '<em><b>HHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectohertz unit.
	 * <!-- end-model-doc -->
	 * @see #HHZ
	 * @model name="hHz"
	 * @generated
	 * @ordered
	 */
	public static final int HHZ_VALUE = 8;

	/**
	 * The '<em><b>Da Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decahertz unit.
	 * <!-- end-model-doc -->
	 * @see #DA_HZ
	 * @model name="daHz"
	 * @generated
	 * @ordered
	 */
	public static final int DA_HZ_VALUE = 9;

	/**
	 * The '<em><b>Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hertz unit.
	 * <!-- end-model-doc -->
	 * @see #HZ
	 * @model name="Hz"
	 * @generated
	 * @ordered
	 */
	public static final int HZ_VALUE = 10;

	/**
	 * The '<em><b>DHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decihertz unit.
	 * <!-- end-model-doc -->
	 * @see #DHZ
	 * @model name="dHz"
	 * @generated
	 * @ordered
	 */
	public static final int DHZ_VALUE = 11;

	/**
	 * The '<em><b>CHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centihertz unit.
	 * <!-- end-model-doc -->
	 * @see #CHZ
	 * @model name="cHz"
	 * @generated
	 * @ordered
	 */
	public static final int CHZ_VALUE = 12;

	/**
	 * The '<em><b>MHz1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millihertz unit.
	 * <!-- end-model-doc -->
	 * @see #MHZ1
	 * @model name="mHz1" literal="mHz"
	 * @generated
	 * @ordered
	 */
	public static final int MHZ1_VALUE = 13;

	/**
	 * The '<em><b>ΜHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * microhertz unit.
	 * <!-- end-model-doc -->
	 * @see #ΜHZ
	 * @model name="µHz"
	 * @generated
	 * @ordered
	 */
	public static final int ΜHZ_VALUE = 14;

	/**
	 * The '<em><b>NHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanohertz unit.
	 * <!-- end-model-doc -->
	 * @see #NHZ
	 * @model name="nHz"
	 * @generated
	 * @ordered
	 */
	public static final int NHZ_VALUE = 15;

	/**
	 * The '<em><b>PHz1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picohertz unit.
	 * <!-- end-model-doc -->
	 * @see #PHZ1
	 * @model name="pHz1" literal="pHz"
	 * @generated
	 * @ordered
	 */
	public static final int PHZ1_VALUE = 16;

	/**
	 * The '<em><b>FHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtohertz unit.
	 * <!-- end-model-doc -->
	 * @see #FHZ
	 * @model name="fHz"
	 * @generated
	 * @ordered
	 */
	public static final int FHZ_VALUE = 17;

	/**
	 * The '<em><b>AHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attohertz unit.
	 * <!-- end-model-doc -->
	 * @see #AHZ
	 * @model name="aHz"
	 * @generated
	 * @ordered
	 */
	public static final int AHZ_VALUE = 18;

	/**
	 * The '<em><b>ZHz1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptohertz unit.
	 * <!-- end-model-doc -->
	 * @see #ZHZ1
	 * @model name="zHz1" literal="zHz"
	 * @generated
	 * @ordered
	 */
	public static final int ZHZ1_VALUE = 19;

	/**
	 * The '<em><b>YHz1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctohertz unit.
	 * <!-- end-model-doc -->
	 * @see #YHZ1
	 * @model name="yHz1" literal="yHz"
	 * @generated
	 * @ordered
	 */
	public static final int YHZ1_VALUE = 20;

	/**
	 * An array of all the '<em><b>Units Frequency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsFrequency[] VALUES_ARRAY =
		new UnitsFrequency[] {
			YHZ,
			ZHZ,
			EHZ,
			PHZ,
			THZ,
			GHZ,
			MHZ,
			KHZ,
			HHZ,
			DA_HZ,
			HZ,
			DHZ,
			CHZ,
			MHZ1,
			ΜHZ,
			NHZ,
			PHZ1,
			FHZ,
			AHZ,
			ZHZ1,
			YHZ1,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Frequency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsFrequency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Frequency</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsFrequency get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsFrequency result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Frequency</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsFrequency getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsFrequency result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Frequency</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsFrequency get(int value) {
		switch (value) {
			case YHZ_VALUE: return YHZ;
			case ZHZ_VALUE: return ZHZ;
			case EHZ_VALUE: return EHZ;
			case PHZ_VALUE: return PHZ;
			case THZ_VALUE: return THZ;
			case GHZ_VALUE: return GHZ;
			case MHZ_VALUE: return MHZ;
			case KHZ_VALUE: return KHZ;
			case HHZ_VALUE: return HHZ;
			case DA_HZ_VALUE: return DA_HZ;
			case HZ_VALUE: return HZ;
			case DHZ_VALUE: return DHZ;
			case CHZ_VALUE: return CHZ;
			case MHZ1_VALUE: return MHZ1;
			case ΜHZ_VALUE: return ΜHZ;
			case NHZ_VALUE: return NHZ;
			case PHZ1_VALUE: return PHZ1;
			case FHZ_VALUE: return FHZ;
			case AHZ_VALUE: return AHZ;
			case ZHZ1_VALUE: return ZHZ1;
			case YHZ1_VALUE: return YHZ1;
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
	private UnitsFrequency(int value, String name, String literal) {
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
	
} //UnitsFrequency
