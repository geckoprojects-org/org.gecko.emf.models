/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.xoev.xfamilie.baukasten._1.baukasten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Familienstand</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFamilienstand()
 * @model extendedMetaData="name='familienstand'"
 * @generated
 */
@ProviderType
public enum Familienstand implements Enumerator {
	/**
	 * The '<em><b>EA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EA_VALUE
	 * @generated
	 * @ordered
	 */
	EA(0, "EA", "EA"),

	/**
	 * The '<em><b>GS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GS_VALUE
	 * @generated
	 * @ordered
	 */
	GS(1, "GS", "GS"),

	/**
	 * The '<em><b>LA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_VALUE
	 * @generated
	 * @ordered
	 */
	LA(2, "LA", "LA"),

	/**
	 * The '<em><b>LD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LD_VALUE
	 * @generated
	 * @ordered
	 */
	LD(3, "LD", "LD"),

	/**
	 * The '<em><b>LE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE_VALUE
	 * @generated
	 * @ordered
	 */
	LE(4, "LE", "LE"),

	/**
	 * The '<em><b>LP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LP_VALUE
	 * @generated
	 * @ordered
	 */
	LP(5, "LP", "LP"),

	/**
	 * The '<em><b>LV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LV_VALUE
	 * @generated
	 * @ordered
	 */
	LV(6, "LV", "LV"),

	/**
	 * The '<em><b>NB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NB_VALUE
	 * @generated
	 * @ordered
	 */
	NB(7, "NB", "NB"),

	/**
	 * The '<em><b>VH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VH_VALUE
	 * @generated
	 * @ordered
	 */
	VH(8, "VH", "VH"),

	/**
	 * The '<em><b>VW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VW_VALUE
	 * @generated
	 * @ordered
	 */
	VW(9, "VW", "VW");

	/**
	 * The '<em><b>EA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EA_VALUE = 0;

	/**
	 * The '<em><b>GS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GS_VALUE = 1;

	/**
	 * The '<em><b>LA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LA_VALUE = 2;

	/**
	 * The '<em><b>LD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LD_VALUE = 3;

	/**
	 * The '<em><b>LE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LE_VALUE = 4;

	/**
	 * The '<em><b>LP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LP_VALUE = 5;

	/**
	 * The '<em><b>LV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LV_VALUE = 6;

	/**
	 * The '<em><b>NB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NB_VALUE = 7;

	/**
	 * The '<em><b>VH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VH_VALUE = 8;

	/**
	 * The '<em><b>VW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VW_VALUE = 9;

	/**
	 * An array of all the '<em><b>Familienstand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Familienstand[] VALUES_ARRAY =
		new Familienstand[] {
			EA,
			GS,
			LA,
			LD,
			LE,
			LP,
			LV,
			NB,
			VH,
			VW,
		};

	/**
	 * A public read-only list of all the '<em><b>Familienstand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Familienstand> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Familienstand</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Familienstand get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Familienstand result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Familienstand</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Familienstand getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Familienstand result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Familienstand</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Familienstand get(int value) {
		switch (value) {
			case EA_VALUE: return EA;
			case GS_VALUE: return GS;
			case LA_VALUE: return LA;
			case LD_VALUE: return LD;
			case LE_VALUE: return LE;
			case LP_VALUE: return LP;
			case LV_VALUE: return LV;
			case NB_VALUE: return NB;
			case VH_VALUE: return VH;
			case VW_VALUE: return VW;
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
	private Familienstand(int value, String name, String literal) {
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
	
} //Familienstand
