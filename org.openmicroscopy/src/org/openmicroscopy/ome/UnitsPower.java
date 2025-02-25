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
 * A representation of the literals of the enumeration '<em><b>Units Power</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The units used to represent power
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getUnitsPower()
 * @model extendedMetaData="name='UnitsPower'"
 * @generated
 */
@ProviderType
public enum UnitsPower implements Enumerator {
	/**
	 * The '<em><b>YW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottawatt unit.
	 * <!-- end-model-doc -->
	 * @see #YW_VALUE
	 * @generated
	 * @ordered
	 */
	YW(0, "YW", "YW"),

	/**
	 * The '<em><b>ZW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettawatt unit.
	 * <!-- end-model-doc -->
	 * @see #ZW_VALUE
	 * @generated
	 * @ordered
	 */
	ZW(1, "ZW", "ZW"),

	/**
	 * The '<em><b>EW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exawatt unit.
	 * <!-- end-model-doc -->
	 * @see #EW_VALUE
	 * @generated
	 * @ordered
	 */
	EW(2, "EW", "EW"),

	/**
	 * The '<em><b>PW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petawatt unit.
	 * <!-- end-model-doc -->
	 * @see #PW_VALUE
	 * @generated
	 * @ordered
	 */
	PW(3, "PW", "PW"),

	/**
	 * The '<em><b>TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terawatt unit.
	 * <!-- end-model-doc -->
	 * @see #TW_VALUE
	 * @generated
	 * @ordered
	 */
	TW(4, "TW", "TW"),

	/**
	 * The '<em><b>GW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigawatt unit.
	 * <!-- end-model-doc -->
	 * @see #GW_VALUE
	 * @generated
	 * @ordered
	 */
	GW(5, "GW", "GW"),

	/**
	 * The '<em><b>MW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megawatt unit.
	 * <!-- end-model-doc -->
	 * @see #MW_VALUE
	 * @generated
	 * @ordered
	 */
	MW(6, "MW", "MW"),

	/**
	 * The '<em><b>KW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilowatt unit.
	 * <!-- end-model-doc -->
	 * @see #KW_VALUE
	 * @generated
	 * @ordered
	 */
	KW(7, "kW", "kW"),

	/**
	 * The '<em><b>HW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectowatt unit.
	 * <!-- end-model-doc -->
	 * @see #HW_VALUE
	 * @generated
	 * @ordered
	 */
	HW(8, "hW", "hW"),

	/**
	 * The '<em><b>Da W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decawatt unit.
	 * <!-- end-model-doc -->
	 * @see #DA_W_VALUE
	 * @generated
	 * @ordered
	 */
	DA_W(9, "daW", "daW"),

	/**
	 * The '<em><b>W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * watt unit.
	 * <!-- end-model-doc -->
	 * @see #W_VALUE
	 * @generated
	 * @ordered
	 */
	W(10, "W", "W"),

	/**
	 * The '<em><b>DW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * deciwatt unit.
	 * <!-- end-model-doc -->
	 * @see #DW_VALUE
	 * @generated
	 * @ordered
	 */
	DW(11, "dW", "dW"),

	/**
	 * The '<em><b>CW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centiwatt unit.
	 * <!-- end-model-doc -->
	 * @see #CW_VALUE
	 * @generated
	 * @ordered
	 */
	CW(12, "cW", "cW"),

	/**
	 * The '<em><b>MW1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * milliwatt unit.
	 * <!-- end-model-doc -->
	 * @see #MW1_VALUE
	 * @generated
	 * @ordered
	 */
	MW1(13, "mW1", "mW"),

	/**
	 * The '<em><b>ΜW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * microwatt unit.
	 * <!-- end-model-doc -->
	 * @see #ΜW_VALUE
	 * @generated
	 * @ordered
	 */
	ΜW(14, "µW", "\u00b5W"),

	/**
	 * The '<em><b>NW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanowatt unit.
	 * <!-- end-model-doc -->
	 * @see #NW_VALUE
	 * @generated
	 * @ordered
	 */
	NW(15, "nW", "nW"),

	/**
	 * The '<em><b>PW1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picowatt unit.
	 * <!-- end-model-doc -->
	 * @see #PW1_VALUE
	 * @generated
	 * @ordered
	 */
	PW1(16, "pW1", "pW"),

	/**
	 * The '<em><b>FW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtowatt unit.
	 * <!-- end-model-doc -->
	 * @see #FW_VALUE
	 * @generated
	 * @ordered
	 */
	FW(17, "fW", "fW"),

	/**
	 * The '<em><b>AW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attowatt unit.
	 * <!-- end-model-doc -->
	 * @see #AW_VALUE
	 * @generated
	 * @ordered
	 */
	AW(18, "aW", "aW"),

	/**
	 * The '<em><b>ZW1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptowatt unit.
	 * <!-- end-model-doc -->
	 * @see #ZW1_VALUE
	 * @generated
	 * @ordered
	 */
	ZW1(19, "zW1", "zW"),

	/**
	 * The '<em><b>YW1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctowatt unit.
	 * <!-- end-model-doc -->
	 * @see #YW1_VALUE
	 * @generated
	 * @ordered
	 */
	YW1(20, "yW1", "yW");

	/**
	 * The '<em><b>YW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottawatt unit.
	 * <!-- end-model-doc -->
	 * @see #YW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YW_VALUE = 0;

	/**
	 * The '<em><b>ZW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettawatt unit.
	 * <!-- end-model-doc -->
	 * @see #ZW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZW_VALUE = 1;

	/**
	 * The '<em><b>EW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exawatt unit.
	 * <!-- end-model-doc -->
	 * @see #EW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EW_VALUE = 2;

	/**
	 * The '<em><b>PW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petawatt unit.
	 * <!-- end-model-doc -->
	 * @see #PW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PW_VALUE = 3;

	/**
	 * The '<em><b>TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terawatt unit.
	 * <!-- end-model-doc -->
	 * @see #TW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TW_VALUE = 4;

	/**
	 * The '<em><b>GW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigawatt unit.
	 * <!-- end-model-doc -->
	 * @see #GW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GW_VALUE = 5;

	/**
	 * The '<em><b>MW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megawatt unit.
	 * <!-- end-model-doc -->
	 * @see #MW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MW_VALUE = 6;

	/**
	 * The '<em><b>KW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilowatt unit.
	 * <!-- end-model-doc -->
	 * @see #KW
	 * @model name="kW"
	 * @generated
	 * @ordered
	 */
	public static final int KW_VALUE = 7;

	/**
	 * The '<em><b>HW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectowatt unit.
	 * <!-- end-model-doc -->
	 * @see #HW
	 * @model name="hW"
	 * @generated
	 * @ordered
	 */
	public static final int HW_VALUE = 8;

	/**
	 * The '<em><b>Da W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decawatt unit.
	 * <!-- end-model-doc -->
	 * @see #DA_W
	 * @model name="daW"
	 * @generated
	 * @ordered
	 */
	public static final int DA_W_VALUE = 9;

	/**
	 * The '<em><b>W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * watt unit.
	 * <!-- end-model-doc -->
	 * @see #W
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int W_VALUE = 10;

	/**
	 * The '<em><b>DW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * deciwatt unit.
	 * <!-- end-model-doc -->
	 * @see #DW
	 * @model name="dW"
	 * @generated
	 * @ordered
	 */
	public static final int DW_VALUE = 11;

	/**
	 * The '<em><b>CW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centiwatt unit.
	 * <!-- end-model-doc -->
	 * @see #CW
	 * @model name="cW"
	 * @generated
	 * @ordered
	 */
	public static final int CW_VALUE = 12;

	/**
	 * The '<em><b>MW1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * milliwatt unit.
	 * <!-- end-model-doc -->
	 * @see #MW1
	 * @model name="mW1" literal="mW"
	 * @generated
	 * @ordered
	 */
	public static final int MW1_VALUE = 13;

	/**
	 * The '<em><b>ΜW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * microwatt unit.
	 * <!-- end-model-doc -->
	 * @see #ΜW
	 * @model name="µW"
	 * @generated
	 * @ordered
	 */
	public static final int ΜW_VALUE = 14;

	/**
	 * The '<em><b>NW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanowatt unit.
	 * <!-- end-model-doc -->
	 * @see #NW
	 * @model name="nW"
	 * @generated
	 * @ordered
	 */
	public static final int NW_VALUE = 15;

	/**
	 * The '<em><b>PW1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picowatt unit.
	 * <!-- end-model-doc -->
	 * @see #PW1
	 * @model name="pW1" literal="pW"
	 * @generated
	 * @ordered
	 */
	public static final int PW1_VALUE = 16;

	/**
	 * The '<em><b>FW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtowatt unit.
	 * <!-- end-model-doc -->
	 * @see #FW
	 * @model name="fW"
	 * @generated
	 * @ordered
	 */
	public static final int FW_VALUE = 17;

	/**
	 * The '<em><b>AW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attowatt unit.
	 * <!-- end-model-doc -->
	 * @see #AW
	 * @model name="aW"
	 * @generated
	 * @ordered
	 */
	public static final int AW_VALUE = 18;

	/**
	 * The '<em><b>ZW1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptowatt unit.
	 * <!-- end-model-doc -->
	 * @see #ZW1
	 * @model name="zW1" literal="zW"
	 * @generated
	 * @ordered
	 */
	public static final int ZW1_VALUE = 19;

	/**
	 * The '<em><b>YW1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctowatt unit.
	 * <!-- end-model-doc -->
	 * @see #YW1
	 * @model name="yW1" literal="yW"
	 * @generated
	 * @ordered
	 */
	public static final int YW1_VALUE = 20;

	/**
	 * An array of all the '<em><b>Units Power</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsPower[] VALUES_ARRAY =
		new UnitsPower[] {
			YW,
			ZW,
			EW,
			PW,
			TW,
			GW,
			MW,
			KW,
			HW,
			DA_W,
			W,
			DW,
			CW,
			MW1,
			ΜW,
			NW,
			PW1,
			FW,
			AW,
			ZW1,
			YW1,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Power</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsPower> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Power</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsPower get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsPower result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Power</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsPower getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsPower result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Power</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsPower get(int value) {
		switch (value) {
			case YW_VALUE: return YW;
			case ZW_VALUE: return ZW;
			case EW_VALUE: return EW;
			case PW_VALUE: return PW;
			case TW_VALUE: return TW;
			case GW_VALUE: return GW;
			case MW_VALUE: return MW;
			case KW_VALUE: return KW;
			case HW_VALUE: return HW;
			case DA_W_VALUE: return DA_W;
			case W_VALUE: return W;
			case DW_VALUE: return DW;
			case CW_VALUE: return CW;
			case MW1_VALUE: return MW1;
			case ΜW_VALUE: return ΜW;
			case NW_VALUE: return NW;
			case PW1_VALUE: return PW1;
			case FW_VALUE: return FW;
			case AW_VALUE: return AW;
			case ZW1_VALUE: return ZW1;
			case YW1_VALUE: return YW1;
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
	private UnitsPower(int value, String name, String literal) {
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
	
} //UnitsPower
