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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Verhaeltnisjugendlichhze</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getVerhaeltnisjugendlichhze()
 * @model extendedMetaData="name='verhaeltnisjugendlichhze'"
 * @generated
 */
@ProviderType
public enum Verhaeltnisjugendlichhze implements Enumerator {
	/**
	 * The '<em><b>Jm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JM_VALUE
	 * @generated
	 * @ordered
	 */
	JM(0, "jm", "jm"),

	/**
	 * The '<em><b>Jv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JV_VALUE
	 * @generated
	 * @ordered
	 */
	JV(1, "jv", "jv"),

	/**
	 * The '<em><b>Mu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MU_VALUE
	 * @generated
	 * @ordered
	 */
	MU(2, "mu", "mu"),

	/**
	 * The '<em><b>Pf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PF_VALUE
	 * @generated
	 * @ordered
	 */
	PF(3, "pf", "pf"),

	/**
	 * The '<em><b>Un</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UN_VALUE
	 * @generated
	 * @ordered
	 */
	UN(4, "un", "un"),

	/**
	 * The '<em><b>Va</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA_VALUE
	 * @generated
	 * @ordered
	 */
	VA(5, "va", "va"),

	/**
	 * The '<em><b>Vo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VO_VALUE
	 * @generated
	 * @ordered
	 */
	VO(6, "vo", "vo");

	/**
	 * The '<em><b>Jm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JM
	 * @model name="jm"
	 * @generated
	 * @ordered
	 */
	public static final int JM_VALUE = 0;

	/**
	 * The '<em><b>Jv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JV
	 * @model name="jv"
	 * @generated
	 * @ordered
	 */
	public static final int JV_VALUE = 1;

	/**
	 * The '<em><b>Mu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MU
	 * @model name="mu"
	 * @generated
	 * @ordered
	 */
	public static final int MU_VALUE = 2;

	/**
	 * The '<em><b>Pf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PF
	 * @model name="pf"
	 * @generated
	 * @ordered
	 */
	public static final int PF_VALUE = 3;

	/**
	 * The '<em><b>Un</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UN
	 * @model name="un"
	 * @generated
	 * @ordered
	 */
	public static final int UN_VALUE = 4;

	/**
	 * The '<em><b>Va</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA
	 * @model name="va"
	 * @generated
	 * @ordered
	 */
	public static final int VA_VALUE = 5;

	/**
	 * The '<em><b>Vo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VO
	 * @model name="vo"
	 * @generated
	 * @ordered
	 */
	public static final int VO_VALUE = 6;

	/**
	 * An array of all the '<em><b>Verhaeltnisjugendlichhze</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Verhaeltnisjugendlichhze[] VALUES_ARRAY =
		new Verhaeltnisjugendlichhze[] {
			JM,
			JV,
			MU,
			PF,
			UN,
			VA,
			VO,
		};

	/**
	 * A public read-only list of all the '<em><b>Verhaeltnisjugendlichhze</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Verhaeltnisjugendlichhze> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Verhaeltnisjugendlichhze</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Verhaeltnisjugendlichhze get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Verhaeltnisjugendlichhze result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Verhaeltnisjugendlichhze</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Verhaeltnisjugendlichhze getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Verhaeltnisjugendlichhze result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Verhaeltnisjugendlichhze</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Verhaeltnisjugendlichhze get(int value) {
		switch (value) {
			case JM_VALUE: return JM;
			case JV_VALUE: return JV;
			case MU_VALUE: return MU;
			case PF_VALUE: return PF;
			case UN_VALUE: return UN;
			case VA_VALUE: return VA;
			case VO_VALUE: return VO;
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
	private Verhaeltnisjugendlichhze(int value, String name, String literal) {
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
	
} //Verhaeltnisjugendlichhze
