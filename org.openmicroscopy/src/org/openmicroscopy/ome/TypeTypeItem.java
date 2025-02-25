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
 * A representation of the literals of the enumeration '<em><b>Type Type Item</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getTypeTypeItem()
 * @model extendedMetaData="name='Type_._1_._type_._item'"
 * @generated
 */
@ProviderType
public enum TypeTypeItem implements Enumerator {
	/**
	 * The '<em><b>FP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FP_VALUE
	 * @generated
	 * @ordered
	 */
	FP(0, "FP", "FP"),

	/**
	 * The '<em><b>FRET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRET_VALUE
	 * @generated
	 * @ordered
	 */
	FRET(1, "FRET", "FRET"),

	/**
	 * The '<em><b>Time Lapse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LAPSE_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_LAPSE(2, "TimeLapse", "TimeLapse"),

	/**
	 * The '<em><b>Four DPlus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR_DPLUS_VALUE
	 * @generated
	 * @ordered
	 */
	FOUR_DPLUS(3, "FourDPlus", "FourDPlus"),

	/**
	 * The '<em><b>Screen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCREEN_VALUE
	 * @generated
	 * @ordered
	 */
	SCREEN(4, "Screen", "Screen"),

	/**
	 * The '<em><b>Immunocytochemistry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNOCYTOCHEMISTRY_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNOCYTOCHEMISTRY(5, "Immunocytochemistry", "Immunocytochemistry"),

	/**
	 * The '<em><b>Immunofluorescence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNOFLUORESCENCE_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNOFLUORESCENCE(6, "Immunofluorescence", "Immunofluorescence"),

	/**
	 * The '<em><b>FISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISH_VALUE
	 * @generated
	 * @ordered
	 */
	FISH(7, "FISH", "FISH"),

	/**
	 * The '<em><b>Electrophysiology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTROPHYSIOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTROPHYSIOLOGY(8, "Electrophysiology", "Electrophysiology"),

	/**
	 * The '<em><b>Ion Imaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ION_IMAGING_VALUE
	 * @generated
	 * @ordered
	 */
	ION_IMAGING(9, "IonImaging", "IonImaging"),

	/**
	 * The '<em><b>Colocalization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOCALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	COLOCALIZATION(10, "Colocalization", "Colocalization"),

	/**
	 * The '<em><b>PGI Documentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PGI_DOCUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PGI_DOCUMENTATION(11, "PGIDocumentation", "PGIDocumentation"),

	/**
	 * The '<em><b>Fluorescence Lifetime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENCE_LIFETIME_VALUE
	 * @generated
	 * @ordered
	 */
	FLUORESCENCE_LIFETIME(12, "FluorescenceLifetime", "FluorescenceLifetime"),

	/**
	 * The '<em><b>Spectral Imaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_IMAGING_VALUE
	 * @generated
	 * @ordered
	 */
	SPECTRAL_IMAGING(13, "SpectralImaging", "SpectralImaging"),

	/**
	 * The '<em><b>Photobleaching</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTOBLEACHING_VALUE
	 * @generated
	 * @ordered
	 */
	PHOTOBLEACHING(14, "Photobleaching", "Photobleaching"),

	/**
	 * The '<em><b>SPIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIM_VALUE
	 * @generated
	 * @ordered
	 */
	SPIM(15, "SPIM", "SPIM"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(16, "Other", "Other");

	/**
	 * The '<em><b>FP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FP_VALUE = 0;

	/**
	 * The '<em><b>FRET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRET_VALUE = 1;

	/**
	 * The '<em><b>Time Lapse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LAPSE
	 * @model name="TimeLapse"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_LAPSE_VALUE = 2;

	/**
	 * The '<em><b>Four DPlus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR_DPLUS
	 * @model name="FourDPlus"
	 * @generated
	 * @ordered
	 */
	public static final int FOUR_DPLUS_VALUE = 3;

	/**
	 * The '<em><b>Screen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCREEN
	 * @model name="Screen"
	 * @generated
	 * @ordered
	 */
	public static final int SCREEN_VALUE = 4;

	/**
	 * The '<em><b>Immunocytochemistry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNOCYTOCHEMISTRY
	 * @model name="Immunocytochemistry"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNOCYTOCHEMISTRY_VALUE = 5;

	/**
	 * The '<em><b>Immunofluorescence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNOFLUORESCENCE
	 * @model name="Immunofluorescence"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNOFLUORESCENCE_VALUE = 6;

	/**
	 * The '<em><b>FISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FISH_VALUE = 7;

	/**
	 * The '<em><b>Electrophysiology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTROPHYSIOLOGY
	 * @model name="Electrophysiology"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTROPHYSIOLOGY_VALUE = 8;

	/**
	 * The '<em><b>Ion Imaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ION_IMAGING
	 * @model name="IonImaging"
	 * @generated
	 * @ordered
	 */
	public static final int ION_IMAGING_VALUE = 9;

	/**
	 * The '<em><b>Colocalization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOCALIZATION
	 * @model name="Colocalization"
	 * @generated
	 * @ordered
	 */
	public static final int COLOCALIZATION_VALUE = 10;

	/**
	 * The '<em><b>PGI Documentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PGI_DOCUMENTATION
	 * @model name="PGIDocumentation"
	 * @generated
	 * @ordered
	 */
	public static final int PGI_DOCUMENTATION_VALUE = 11;

	/**
	 * The '<em><b>Fluorescence Lifetime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENCE_LIFETIME
	 * @model name="FluorescenceLifetime"
	 * @generated
	 * @ordered
	 */
	public static final int FLUORESCENCE_LIFETIME_VALUE = 12;

	/**
	 * The '<em><b>Spectral Imaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_IMAGING
	 * @model name="SpectralImaging"
	 * @generated
	 * @ordered
	 */
	public static final int SPECTRAL_IMAGING_VALUE = 13;

	/**
	 * The '<em><b>Photobleaching</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTOBLEACHING
	 * @model name="Photobleaching"
	 * @generated
	 * @ordered
	 */
	public static final int PHOTOBLEACHING_VALUE = 14;

	/**
	 * The '<em><b>SPIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPIM_VALUE = 15;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 16;

	/**
	 * An array of all the '<em><b>Type Type Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeTypeItem[] VALUES_ARRAY =
		new TypeTypeItem[] {
			FP,
			FRET,
			TIME_LAPSE,
			FOUR_DPLUS,
			SCREEN,
			IMMUNOCYTOCHEMISTRY,
			IMMUNOFLUORESCENCE,
			FISH,
			ELECTROPHYSIOLOGY,
			ION_IMAGING,
			COLOCALIZATION,
			PGI_DOCUMENTATION,
			FLUORESCENCE_LIFETIME,
			SPECTRAL_IMAGING,
			PHOTOBLEACHING,
			SPIM,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeTypeItem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type Item</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeTypeItem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeTypeItem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type Item</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeTypeItem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeTypeItem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type Item</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeTypeItem get(int value) {
		switch (value) {
			case FP_VALUE: return FP;
			case FRET_VALUE: return FRET;
			case TIME_LAPSE_VALUE: return TIME_LAPSE;
			case FOUR_DPLUS_VALUE: return FOUR_DPLUS;
			case SCREEN_VALUE: return SCREEN;
			case IMMUNOCYTOCHEMISTRY_VALUE: return IMMUNOCYTOCHEMISTRY;
			case IMMUNOFLUORESCENCE_VALUE: return IMMUNOFLUORESCENCE;
			case FISH_VALUE: return FISH;
			case ELECTROPHYSIOLOGY_VALUE: return ELECTROPHYSIOLOGY;
			case ION_IMAGING_VALUE: return ION_IMAGING;
			case COLOCALIZATION_VALUE: return COLOCALIZATION;
			case PGI_DOCUMENTATION_VALUE: return PGI_DOCUMENTATION;
			case FLUORESCENCE_LIFETIME_VALUE: return FLUORESCENCE_LIFETIME;
			case SPECTRAL_IMAGING_VALUE: return SPECTRAL_IMAGING;
			case PHOTOBLEACHING_VALUE: return PHOTOBLEACHING;
			case SPIM_VALUE: return SPIM;
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
	private TypeTypeItem(int value, String name, String literal) {
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
	
} //TypeTypeItem
