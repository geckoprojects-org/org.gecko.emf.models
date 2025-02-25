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
 * A representation of the literals of the enumeration '<em><b>Units Time</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The units used to represent a time interval
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getUnitsTime()
 * @model extendedMetaData="name='UnitsTime'"
 * @generated
 */
@ProviderType
public enum UnitsTime implements Enumerator {
	/**
	 * The '<em><b>Ys</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #YS_VALUE
	 * @generated
	 * @ordered
	 */
	YS(0, "Ys", "Ys"),

	/**
	 * The '<em><b>Zs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZS_VALUE
	 * @generated
	 * @ordered
	 */
	ZS(1, "Zs", "Zs"),

	/**
	 * The '<em><b>Es</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #ES_VALUE
	 * @generated
	 * @ordered
	 */
	ES(2, "Es", "Es"),

	/**
	 * The '<em><b>Ps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #PS_VALUE
	 * @generated
	 * @ordered
	 */
	PS(3, "Ps", "Ps"),

	/**
	 * The '<em><b>Ts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #TS_VALUE
	 * @generated
	 * @ordered
	 */
	TS(4, "Ts", "Ts"),

	/**
	 * The '<em><b>Gs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #GS_VALUE
	 * @generated
	 * @ordered
	 */
	GS(5, "Gs", "Gs"),

	/**
	 * The '<em><b>Ms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #MS_VALUE
	 * @generated
	 * @ordered
	 */
	MS(6, "Ms", "Ms"),

	/**
	 * The '<em><b>Ks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #KS_VALUE
	 * @generated
	 * @ordered
	 */
	KS(7, "ks", "ks"),

	/**
	 * The '<em><b>Hs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #HS_VALUE
	 * @generated
	 * @ordered
	 */
	HS(8, "hs", "hs"),

	/**
	 * The '<em><b>Das</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #DAS_VALUE
	 * @generated
	 * @ordered
	 */
	DAS(9, "das", "das"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * second SI unit.
	 * <!-- end-model-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(10, "s", "s"),

	/**
	 * The '<em><b>Ds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decisecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #DS_VALUE
	 * @generated
	 * @ordered
	 */
	DS(11, "ds", "ds"),

	/**
	 * The '<em><b>Cs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centisecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #CS_VALUE
	 * @generated
	 * @ordered
	 */
	CS(12, "cs", "cs"),

	/**
	 * The '<em><b>Ms1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millisecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #MS1_VALUE
	 * @generated
	 * @ordered
	 */
	MS1(13, "ms1", "ms"),

	/**
	 * The '<em><b>Μs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * microsecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #ΜS_VALUE
	 * @generated
	 * @ordered
	 */
	ΜS(14, "µs", "\u00b5s"),

	/**
	 * The '<em><b>Ns</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #NS_VALUE
	 * @generated
	 * @ordered
	 */
	NS(15, "ns", "ns"),

	/**
	 * The '<em><b>Ps1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #PS1_VALUE
	 * @generated
	 * @ordered
	 */
	PS1(16, "ps1", "ps"),

	/**
	 * The '<em><b>Fs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #FS_VALUE
	 * @generated
	 * @ordered
	 */
	FS(17, "fs", "fs"),

	/**
	 * The '<em><b>As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #AS_VALUE
	 * @generated
	 * @ordered
	 */
	AS(18, "as", "as"),

	/**
	 * The '<em><b>Zs1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZS1_VALUE
	 * @generated
	 * @ordered
	 */
	ZS1(19, "zs1", "zs"),

	/**
	 * The '<em><b>Ys1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #YS1_VALUE
	 * @generated
	 * @ordered
	 */
	YS1(20, "ys1", "ys"),

	/**
	 * The '<em><b>Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * minute SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(21, "min", "min"),

	/**
	 * The '<em><b>H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hour SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #H_VALUE
	 * @generated
	 * @ordered
	 */
	H(22, "h", "h"),

	/**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * day SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(23, "d", "d");

	/**
	 * The '<em><b>Ys</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #YS
	 * @model name="Ys"
	 * @generated
	 * @ordered
	 */
	public static final int YS_VALUE = 0;

	/**
	 * The '<em><b>Zs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZS
	 * @model name="Zs"
	 * @generated
	 * @ordered
	 */
	public static final int ZS_VALUE = 1;

	/**
	 * The '<em><b>Es</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #ES
	 * @model name="Es"
	 * @generated
	 * @ordered
	 */
	public static final int ES_VALUE = 2;

	/**
	 * The '<em><b>Ps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #PS
	 * @model name="Ps"
	 * @generated
	 * @ordered
	 */
	public static final int PS_VALUE = 3;

	/**
	 * The '<em><b>Ts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #TS
	 * @model name="Ts"
	 * @generated
	 * @ordered
	 */
	public static final int TS_VALUE = 4;

	/**
	 * The '<em><b>Gs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #GS
	 * @model name="Gs"
	 * @generated
	 * @ordered
	 */
	public static final int GS_VALUE = 5;

	/**
	 * The '<em><b>Ms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #MS
	 * @model name="Ms"
	 * @generated
	 * @ordered
	 */
	public static final int MS_VALUE = 6;

	/**
	 * The '<em><b>Ks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #KS
	 * @model name="ks"
	 * @generated
	 * @ordered
	 */
	public static final int KS_VALUE = 7;

	/**
	 * The '<em><b>Hs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #HS
	 * @model name="hs"
	 * @generated
	 * @ordered
	 */
	public static final int HS_VALUE = 8;

	/**
	 * The '<em><b>Das</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decasecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #DAS
	 * @model name="das"
	 * @generated
	 * @ordered
	 */
	public static final int DAS_VALUE = 9;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * second SI unit.
	 * <!-- end-model-doc -->
	 * @see #S
	 * @model name="s"
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 10;

	/**
	 * The '<em><b>Ds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decisecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #DS
	 * @model name="ds"
	 * @generated
	 * @ordered
	 */
	public static final int DS_VALUE = 11;

	/**
	 * The '<em><b>Cs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centisecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #CS
	 * @model name="cs"
	 * @generated
	 * @ordered
	 */
	public static final int CS_VALUE = 12;

	/**
	 * The '<em><b>Ms1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millisecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #MS1
	 * @model name="ms1" literal="ms"
	 * @generated
	 * @ordered
	 */
	public static final int MS1_VALUE = 13;

	/**
	 * The '<em><b>Μs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * microsecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #ΜS
	 * @model name="µs"
	 * @generated
	 * @ordered
	 */
	public static final int ΜS_VALUE = 14;

	/**
	 * The '<em><b>Ns</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #NS
	 * @model name="ns"
	 * @generated
	 * @ordered
	 */
	public static final int NS_VALUE = 15;

	/**
	 * The '<em><b>Ps1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #PS1
	 * @model name="ps1" literal="ps"
	 * @generated
	 * @ordered
	 */
	public static final int PS1_VALUE = 16;

	/**
	 * The '<em><b>Fs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #FS
	 * @model name="fs"
	 * @generated
	 * @ordered
	 */
	public static final int FS_VALUE = 17;

	/**
	 * The '<em><b>As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #AS
	 * @model name="as"
	 * @generated
	 * @ordered
	 */
	public static final int AS_VALUE = 18;

	/**
	 * The '<em><b>Zs1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZS1
	 * @model name="zs1" literal="zs"
	 * @generated
	 * @ordered
	 */
	public static final int ZS1_VALUE = 19;

	/**
	 * The '<em><b>Ys1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctosecond SI unit.
	 * <!-- end-model-doc -->
	 * @see #YS1
	 * @model name="ys1" literal="ys"
	 * @generated
	 * @ordered
	 */
	public static final int YS1_VALUE = 20;

	/**
	 * The '<em><b>Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * minute SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #MIN
	 * @model name="min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 21;

	/**
	 * The '<em><b>H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hour SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #H
	 * @model name="h"
	 * @generated
	 * @ordered
	 */
	public static final int H_VALUE = 22;

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * day SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #D
	 * @model name="d"
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 23;

	/**
	 * An array of all the '<em><b>Units Time</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsTime[] VALUES_ARRAY =
		new UnitsTime[] {
			YS,
			ZS,
			ES,
			PS,
			TS,
			GS,
			MS,
			KS,
			HS,
			DAS,
			S,
			DS,
			CS,
			MS1,
			ΜS,
			NS,
			PS1,
			FS,
			AS,
			ZS1,
			YS1,
			MIN,
			H,
			D,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Time</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsTime> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Time</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsTime get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsTime result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Time</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsTime getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsTime result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Time</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsTime get(int value) {
		switch (value) {
			case YS_VALUE: return YS;
			case ZS_VALUE: return ZS;
			case ES_VALUE: return ES;
			case PS_VALUE: return PS;
			case TS_VALUE: return TS;
			case GS_VALUE: return GS;
			case MS_VALUE: return MS;
			case KS_VALUE: return KS;
			case HS_VALUE: return HS;
			case DAS_VALUE: return DAS;
			case S_VALUE: return S;
			case DS_VALUE: return DS;
			case CS_VALUE: return CS;
			case MS1_VALUE: return MS1;
			case ΜS_VALUE: return ΜS;
			case NS_VALUE: return NS;
			case PS1_VALUE: return PS1;
			case FS_VALUE: return FS;
			case AS_VALUE: return AS;
			case ZS1_VALUE: return ZS1;
			case YS1_VALUE: return YS1;
			case MIN_VALUE: return MIN;
			case H_VALUE: return H;
			case D_VALUE: return D;
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
	private UnitsTime(int value, String name, String literal) {
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
	
} //UnitsTime
