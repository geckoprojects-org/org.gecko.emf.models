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
 * A representation of the literals of the enumeration '<em><b>Contrast Method Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getContrastMethodType()
 * @model extendedMetaData="name='ContrastMethod_._type'"
 * @generated
 */
@ProviderType
public enum ContrastMethodType implements Enumerator {
	/**
	 * The '<em><b>Brightfield</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIGHTFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	BRIGHTFIELD(0, "Brightfield", "Brightfield"),

	/**
	 * The '<em><b>Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	PHASE(1, "Phase", "Phase"),

	/**
	 * The '<em><b>DIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIC_VALUE
	 * @generated
	 * @ordered
	 */
	DIC(2, "DIC", "DIC"),

	/**
	 * The '<em><b>Hoffman Modulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOFFMAN_MODULATION_VALUE
	 * @generated
	 * @ordered
	 */
	HOFFMAN_MODULATION(3, "HoffmanModulation", "HoffmanModulation"),

	/**
	 * The '<em><b>Oblique Illumination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIQUE_ILLUMINATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBLIQUE_ILLUMINATION(4, "ObliqueIllumination", "ObliqueIllumination"),

	/**
	 * The '<em><b>Polarized Light</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLARIZED_LIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	POLARIZED_LIGHT(5, "PolarizedLight", "PolarizedLight"),

	/**
	 * The '<em><b>Darkfield</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	DARKFIELD(6, "Darkfield", "Darkfield"),

	/**
	 * The '<em><b>Fluorescence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENCE_VALUE
	 * @generated
	 * @ordered
	 */
	FLUORESCENCE(7, "Fluorescence", "Fluorescence"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(8, "Other", "Other");

	/**
	 * The '<em><b>Brightfield</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIGHTFIELD
	 * @model name="Brightfield"
	 * @generated
	 * @ordered
	 */
	public static final int BRIGHTFIELD_VALUE = 0;

	/**
	 * The '<em><b>Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASE
	 * @model name="Phase"
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_VALUE = 1;

	/**
	 * The '<em><b>DIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIC_VALUE = 2;

	/**
	 * The '<em><b>Hoffman Modulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOFFMAN_MODULATION
	 * @model name="HoffmanModulation"
	 * @generated
	 * @ordered
	 */
	public static final int HOFFMAN_MODULATION_VALUE = 3;

	/**
	 * The '<em><b>Oblique Illumination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIQUE_ILLUMINATION
	 * @model name="ObliqueIllumination"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIQUE_ILLUMINATION_VALUE = 4;

	/**
	 * The '<em><b>Polarized Light</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLARIZED_LIGHT
	 * @model name="PolarizedLight"
	 * @generated
	 * @ordered
	 */
	public static final int POLARIZED_LIGHT_VALUE = 5;

	/**
	 * The '<em><b>Darkfield</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKFIELD
	 * @model name="Darkfield"
	 * @generated
	 * @ordered
	 */
	public static final int DARKFIELD_VALUE = 6;

	/**
	 * The '<em><b>Fluorescence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENCE
	 * @model name="Fluorescence"
	 * @generated
	 * @ordered
	 */
	public static final int FLUORESCENCE_VALUE = 7;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 8;

	/**
	 * An array of all the '<em><b>Contrast Method Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContrastMethodType[] VALUES_ARRAY =
		new ContrastMethodType[] {
			BRIGHTFIELD,
			PHASE,
			DIC,
			HOFFMAN_MODULATION,
			OBLIQUE_ILLUMINATION,
			POLARIZED_LIGHT,
			DARKFIELD,
			FLUORESCENCE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Contrast Method Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContrastMethodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contrast Method Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContrastMethodType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContrastMethodType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contrast Method Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContrastMethodType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContrastMethodType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contrast Method Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContrastMethodType get(int value) {
		switch (value) {
			case BRIGHTFIELD_VALUE: return BRIGHTFIELD;
			case PHASE_VALUE: return PHASE;
			case DIC_VALUE: return DIC;
			case HOFFMAN_MODULATION_VALUE: return HOFFMAN_MODULATION;
			case OBLIQUE_ILLUMINATION_VALUE: return OBLIQUE_ILLUMINATION;
			case POLARIZED_LIGHT_VALUE: return POLARIZED_LIGHT;
			case DARKFIELD_VALUE: return DARKFIELD;
			case FLUORESCENCE_VALUE: return FLUORESCENCE;
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
	private ContrastMethodType(int value, String name, String literal) {
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
	
} //ContrastMethodType
