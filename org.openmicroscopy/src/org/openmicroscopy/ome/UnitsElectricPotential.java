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
 * A representation of the literals of the enumeration '<em><b>Units Electric Potential</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The units used to represent an electric potential
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getUnitsElectricPotential()
 * @model extendedMetaData="name='UnitsElectricPotential'"
 * @generated
 */
@ProviderType
public enum UnitsElectricPotential implements Enumerator {
	/**
	 * The '<em><b>YV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottavolt unit.
	 * <!-- end-model-doc -->
	 * @see #YV_VALUE
	 * @generated
	 * @ordered
	 */
	YV(0, "YV", "YV"),

	/**
	 * The '<em><b>ZV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettavolt unit.
	 * <!-- end-model-doc -->
	 * @see #ZV_VALUE
	 * @generated
	 * @ordered
	 */
	ZV(1, "ZV", "ZV"),

	/**
	 * The '<em><b>EV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exavolt unit.
	 * <!-- end-model-doc -->
	 * @see #EV_VALUE
	 * @generated
	 * @ordered
	 */
	EV(2, "EV", "EV"),

	/**
	 * The '<em><b>PV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petavolt unit.
	 * <!-- end-model-doc -->
	 * @see #PV_VALUE
	 * @generated
	 * @ordered
	 */
	PV(3, "PV", "PV"),

	/**
	 * The '<em><b>TV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * teravolt unit.
	 * <!-- end-model-doc -->
	 * @see #TV_VALUE
	 * @generated
	 * @ordered
	 */
	TV(4, "TV", "TV"),

	/**
	 * The '<em><b>GV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigavolt unit.
	 * <!-- end-model-doc -->
	 * @see #GV_VALUE
	 * @generated
	 * @ordered
	 */
	GV(5, "GV", "GV"),

	/**
	 * The '<em><b>MV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megavolt unit.
	 * <!-- end-model-doc -->
	 * @see #MV_VALUE
	 * @generated
	 * @ordered
	 */
	MV(6, "MV", "MV"),

	/**
	 * The '<em><b>KV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilovolt unit.
	 * <!-- end-model-doc -->
	 * @see #KV_VALUE
	 * @generated
	 * @ordered
	 */
	KV(7, "kV", "kV"),

	/**
	 * The '<em><b>HV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectovolt unit.
	 * <!-- end-model-doc -->
	 * @see #HV_VALUE
	 * @generated
	 * @ordered
	 */
	HV(8, "hV", "hV"),

	/**
	 * The '<em><b>Da V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decavolt unit.
	 * <!-- end-model-doc -->
	 * @see #DA_V_VALUE
	 * @generated
	 * @ordered
	 */
	DA_V(9, "daV", "daV"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * volt unit.
	 * <!-- end-model-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(10, "V", "V"),

	/**
	 * The '<em><b>DV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decivolt unit.
	 * <!-- end-model-doc -->
	 * @see #DV_VALUE
	 * @generated
	 * @ordered
	 */
	DV(11, "dV", "dV"),

	/**
	 * The '<em><b>CV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centivolt unit.
	 * <!-- end-model-doc -->
	 * @see #CV_VALUE
	 * @generated
	 * @ordered
	 */
	CV(12, "cV", "cV"),

	/**
	 * The '<em><b>MV1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millivolt unit.
	 * <!-- end-model-doc -->
	 * @see #MV1_VALUE
	 * @generated
	 * @ordered
	 */
	MV1(13, "mV1", "mV"),

	/**
	 * The '<em><b>ΜV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * microvolt unit.
	 * <!-- end-model-doc -->
	 * @see #ΜV_VALUE
	 * @generated
	 * @ordered
	 */
	ΜV(14, "µV", "\u00b5V"),

	/**
	 * The '<em><b>NV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanovolt unit.
	 * <!-- end-model-doc -->
	 * @see #NV_VALUE
	 * @generated
	 * @ordered
	 */
	NV(15, "nV", "nV"),

	/**
	 * The '<em><b>PV1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picovolt unit.
	 * <!-- end-model-doc -->
	 * @see #PV1_VALUE
	 * @generated
	 * @ordered
	 */
	PV1(16, "pV1", "pV"),

	/**
	 * The '<em><b>FV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtovolt unit.
	 * <!-- end-model-doc -->
	 * @see #FV_VALUE
	 * @generated
	 * @ordered
	 */
	FV(17, "fV", "fV"),

	/**
	 * The '<em><b>AV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attovolt unit.
	 * <!-- end-model-doc -->
	 * @see #AV_VALUE
	 * @generated
	 * @ordered
	 */
	AV(18, "aV", "aV"),

	/**
	 * The '<em><b>ZV1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptovolt unit.
	 * <!-- end-model-doc -->
	 * @see #ZV1_VALUE
	 * @generated
	 * @ordered
	 */
	ZV1(19, "zV1", "zV"),

	/**
	 * The '<em><b>YV1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctovolt unit.
	 * <!-- end-model-doc -->
	 * @see #YV1_VALUE
	 * @generated
	 * @ordered
	 */
	YV1(20, "yV1", "yV");

	/**
	 * The '<em><b>YV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottavolt unit.
	 * <!-- end-model-doc -->
	 * @see #YV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YV_VALUE = 0;

	/**
	 * The '<em><b>ZV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettavolt unit.
	 * <!-- end-model-doc -->
	 * @see #ZV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZV_VALUE = 1;

	/**
	 * The '<em><b>EV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exavolt unit.
	 * <!-- end-model-doc -->
	 * @see #EV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EV_VALUE = 2;

	/**
	 * The '<em><b>PV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petavolt unit.
	 * <!-- end-model-doc -->
	 * @see #PV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PV_VALUE = 3;

	/**
	 * The '<em><b>TV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * teravolt unit.
	 * <!-- end-model-doc -->
	 * @see #TV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TV_VALUE = 4;

	/**
	 * The '<em><b>GV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigavolt unit.
	 * <!-- end-model-doc -->
	 * @see #GV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GV_VALUE = 5;

	/**
	 * The '<em><b>MV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megavolt unit.
	 * <!-- end-model-doc -->
	 * @see #MV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MV_VALUE = 6;

	/**
	 * The '<em><b>KV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilovolt unit.
	 * <!-- end-model-doc -->
	 * @see #KV
	 * @model name="kV"
	 * @generated
	 * @ordered
	 */
	public static final int KV_VALUE = 7;

	/**
	 * The '<em><b>HV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectovolt unit.
	 * <!-- end-model-doc -->
	 * @see #HV
	 * @model name="hV"
	 * @generated
	 * @ordered
	 */
	public static final int HV_VALUE = 8;

	/**
	 * The '<em><b>Da V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decavolt unit.
	 * <!-- end-model-doc -->
	 * @see #DA_V
	 * @model name="daV"
	 * @generated
	 * @ordered
	 */
	public static final int DA_V_VALUE = 9;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * volt unit.
	 * <!-- end-model-doc -->
	 * @see #V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 10;

	/**
	 * The '<em><b>DV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decivolt unit.
	 * <!-- end-model-doc -->
	 * @see #DV
	 * @model name="dV"
	 * @generated
	 * @ordered
	 */
	public static final int DV_VALUE = 11;

	/**
	 * The '<em><b>CV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centivolt unit.
	 * <!-- end-model-doc -->
	 * @see #CV
	 * @model name="cV"
	 * @generated
	 * @ordered
	 */
	public static final int CV_VALUE = 12;

	/**
	 * The '<em><b>MV1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millivolt unit.
	 * <!-- end-model-doc -->
	 * @see #MV1
	 * @model name="mV1" literal="mV"
	 * @generated
	 * @ordered
	 */
	public static final int MV1_VALUE = 13;

	/**
	 * The '<em><b>ΜV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * microvolt unit.
	 * <!-- end-model-doc -->
	 * @see #ΜV
	 * @model name="µV"
	 * @generated
	 * @ordered
	 */
	public static final int ΜV_VALUE = 14;

	/**
	 * The '<em><b>NV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanovolt unit.
	 * <!-- end-model-doc -->
	 * @see #NV
	 * @model name="nV"
	 * @generated
	 * @ordered
	 */
	public static final int NV_VALUE = 15;

	/**
	 * The '<em><b>PV1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picovolt unit.
	 * <!-- end-model-doc -->
	 * @see #PV1
	 * @model name="pV1" literal="pV"
	 * @generated
	 * @ordered
	 */
	public static final int PV1_VALUE = 16;

	/**
	 * The '<em><b>FV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtovolt unit.
	 * <!-- end-model-doc -->
	 * @see #FV
	 * @model name="fV"
	 * @generated
	 * @ordered
	 */
	public static final int FV_VALUE = 17;

	/**
	 * The '<em><b>AV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attovolt unit.
	 * <!-- end-model-doc -->
	 * @see #AV
	 * @model name="aV"
	 * @generated
	 * @ordered
	 */
	public static final int AV_VALUE = 18;

	/**
	 * The '<em><b>ZV1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptovolt unit.
	 * <!-- end-model-doc -->
	 * @see #ZV1
	 * @model name="zV1" literal="zV"
	 * @generated
	 * @ordered
	 */
	public static final int ZV1_VALUE = 19;

	/**
	 * The '<em><b>YV1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctovolt unit.
	 * <!-- end-model-doc -->
	 * @see #YV1
	 * @model name="yV1" literal="yV"
	 * @generated
	 * @ordered
	 */
	public static final int YV1_VALUE = 20;

	/**
	 * An array of all the '<em><b>Units Electric Potential</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsElectricPotential[] VALUES_ARRAY =
		new UnitsElectricPotential[] {
			YV,
			ZV,
			EV,
			PV,
			TV,
			GV,
			MV,
			KV,
			HV,
			DA_V,
			V,
			DV,
			CV,
			MV1,
			ΜV,
			NV,
			PV1,
			FV,
			AV,
			ZV1,
			YV1,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Electric Potential</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsElectricPotential> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Electric Potential</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsElectricPotential get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsElectricPotential result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Electric Potential</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsElectricPotential getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsElectricPotential result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Electric Potential</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsElectricPotential get(int value) {
		switch (value) {
			case YV_VALUE: return YV;
			case ZV_VALUE: return ZV;
			case EV_VALUE: return EV;
			case PV_VALUE: return PV;
			case TV_VALUE: return TV;
			case GV_VALUE: return GV;
			case MV_VALUE: return MV;
			case KV_VALUE: return KV;
			case HV_VALUE: return HV;
			case DA_V_VALUE: return DA_V;
			case V_VALUE: return V;
			case DV_VALUE: return DV;
			case CV_VALUE: return CV;
			case MV1_VALUE: return MV1;
			case ΜV_VALUE: return ΜV;
			case NV_VALUE: return NV;
			case PV1_VALUE: return PV1;
			case FV_VALUE: return FV;
			case AV_VALUE: return AV;
			case ZV1_VALUE: return ZV1;
			case YV1_VALUE: return YV1;
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
	private UnitsElectricPotential(int value, String name, String literal) {
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
	
} //UnitsElectricPotential
