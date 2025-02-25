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
 * A representation of the literals of the enumeration '<em><b>Correction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getCorrectionType()
 * @model extendedMetaData="name='Correction_._type'"
 * @generated
 */
@ProviderType
public enum CorrectionType implements Enumerator {
	/**
	 * The '<em><b>UV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UV_VALUE
	 * @generated
	 * @ordered
	 */
	UV(0, "UV", "UV"),

	/**
	 * The '<em><b>Plan Apo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_APO_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN_APO(1, "PlanApo", "PlanApo"),

	/**
	 * The '<em><b>Plan Fluor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_FLUOR_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN_FLUOR(2, "PlanFluor", "PlanFluor"),

	/**
	 * The '<em><b>Super Fluor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPER_FLUOR_VALUE
	 * @generated
	 * @ordered
	 */
	SUPER_FLUOR(3, "SuperFluor", "SuperFluor"),

	/**
	 * The '<em><b>Violet Corrected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLET_CORRECTED_VALUE
	 * @generated
	 * @ordered
	 */
	VIOLET_CORRECTED(4, "VioletCorrected", "VioletCorrected"),

	/**
	 * The '<em><b>Achro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACHRO_VALUE
	 * @generated
	 * @ordered
	 */
	ACHRO(5, "Achro", "Achro"),

	/**
	 * The '<em><b>Achromat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACHROMAT_VALUE
	 * @generated
	 * @ordered
	 */
	ACHROMAT(6, "Achromat", "Achromat"),

	/**
	 * The '<em><b>Fluor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUOR_VALUE
	 * @generated
	 * @ordered
	 */
	FLUOR(7, "Fluor", "Fluor"),

	/**
	 * The '<em><b>Fl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FL_VALUE
	 * @generated
	 * @ordered
	 */
	FL(8, "Fl", "Fl"),

	/**
	 * The '<em><b>Fluar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUAR_VALUE
	 * @generated
	 * @ordered
	 */
	FLUAR(9, "Fluar", "Fluar"),

	/**
	 * The '<em><b>Neofluar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEOFLUAR_VALUE
	 * @generated
	 * @ordered
	 */
	NEOFLUAR(10, "Neofluar", "Neofluar"),

	/**
	 * The '<em><b>Fluotar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUOTAR_VALUE
	 * @generated
	 * @ordered
	 */
	FLUOTAR(11, "Fluotar", "Fluotar"),

	/**
	 * The '<em><b>Apo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APO_VALUE
	 * @generated
	 * @ordered
	 */
	APO(12, "Apo", "Apo"),

	/**
	 * The '<em><b>Plan Neofluar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_NEOFLUAR_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN_NEOFLUAR(13, "PlanNeofluar", "PlanNeofluar"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(14, "Other", "Other");

	/**
	 * The '<em><b>UV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UV_VALUE = 0;

	/**
	 * The '<em><b>Plan Apo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_APO
	 * @model name="PlanApo"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_APO_VALUE = 1;

	/**
	 * The '<em><b>Plan Fluor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_FLUOR
	 * @model name="PlanFluor"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_FLUOR_VALUE = 2;

	/**
	 * The '<em><b>Super Fluor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPER_FLUOR
	 * @model name="SuperFluor"
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_FLUOR_VALUE = 3;

	/**
	 * The '<em><b>Violet Corrected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLET_CORRECTED
	 * @model name="VioletCorrected"
	 * @generated
	 * @ordered
	 */
	public static final int VIOLET_CORRECTED_VALUE = 4;

	/**
	 * The '<em><b>Achro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACHRO
	 * @model name="Achro"
	 * @generated
	 * @ordered
	 */
	public static final int ACHRO_VALUE = 5;

	/**
	 * The '<em><b>Achromat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACHROMAT
	 * @model name="Achromat"
	 * @generated
	 * @ordered
	 */
	public static final int ACHROMAT_VALUE = 6;

	/**
	 * The '<em><b>Fluor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUOR
	 * @model name="Fluor"
	 * @generated
	 * @ordered
	 */
	public static final int FLUOR_VALUE = 7;

	/**
	 * The '<em><b>Fl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FL
	 * @model name="Fl"
	 * @generated
	 * @ordered
	 */
	public static final int FL_VALUE = 8;

	/**
	 * The '<em><b>Fluar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUAR
	 * @model name="Fluar"
	 * @generated
	 * @ordered
	 */
	public static final int FLUAR_VALUE = 9;

	/**
	 * The '<em><b>Neofluar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEOFLUAR
	 * @model name="Neofluar"
	 * @generated
	 * @ordered
	 */
	public static final int NEOFLUAR_VALUE = 10;

	/**
	 * The '<em><b>Fluotar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUOTAR
	 * @model name="Fluotar"
	 * @generated
	 * @ordered
	 */
	public static final int FLUOTAR_VALUE = 11;

	/**
	 * The '<em><b>Apo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APO
	 * @model name="Apo"
	 * @generated
	 * @ordered
	 */
	public static final int APO_VALUE = 12;

	/**
	 * The '<em><b>Plan Neofluar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_NEOFLUAR
	 * @model name="PlanNeofluar"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_NEOFLUAR_VALUE = 13;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 14;

	/**
	 * An array of all the '<em><b>Correction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CorrectionType[] VALUES_ARRAY =
		new CorrectionType[] {
			UV,
			PLAN_APO,
			PLAN_FLUOR,
			SUPER_FLUOR,
			VIOLET_CORRECTED,
			ACHRO,
			ACHROMAT,
			FLUOR,
			FL,
			FLUAR,
			NEOFLUAR,
			FLUOTAR,
			APO,
			PLAN_NEOFLUAR,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Correction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CorrectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Correction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CorrectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CorrectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Correction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CorrectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CorrectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Correction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CorrectionType get(int value) {
		switch (value) {
			case UV_VALUE: return UV;
			case PLAN_APO_VALUE: return PLAN_APO;
			case PLAN_FLUOR_VALUE: return PLAN_FLUOR;
			case SUPER_FLUOR_VALUE: return SUPER_FLUOR;
			case VIOLET_CORRECTED_VALUE: return VIOLET_CORRECTED;
			case ACHRO_VALUE: return ACHRO;
			case ACHROMAT_VALUE: return ACHROMAT;
			case FLUOR_VALUE: return FLUOR;
			case FL_VALUE: return FL;
			case FLUAR_VALUE: return FLUAR;
			case NEOFLUAR_VALUE: return NEOFLUAR;
			case FLUOTAR_VALUE: return FLUOTAR;
			case APO_VALUE: return APO;
			case PLAN_NEOFLUAR_VALUE: return PLAN_NEOFLUAR;
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
	private CorrectionType(int value, String name, String literal) {
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
	
} //CorrectionType
