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
 * A representation of the literals of the enumeration '<em><b>Type Type3</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getTypeType3()
 * @model extendedMetaData="name='Type_._3_._type'"
 * @generated
 */
@ProviderType
public enum TypeType3 implements Enumerator {
	/**
	 * The '<em><b>Excimer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCIMER_VALUE
	 * @generated
	 * @ordered
	 */
	EXCIMER(0, "Excimer", "Excimer"),

	/**
	 * The '<em><b>Gas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAS(1, "Gas", "Gas"),

	/**
	 * The '<em><b>Metal Vapor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAL_VAPOR_VALUE
	 * @generated
	 * @ordered
	 */
	METAL_VAPOR(2, "MetalVapor", "MetalVapor"),

	/**
	 * The '<em><b>Solid State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLID_STATE(3, "SolidState", "SolidState"),

	/**
	 * The '<em><b>Dye</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYE_VALUE
	 * @generated
	 * @ordered
	 */
	DYE(4, "Dye", "Dye"),

	/**
	 * The '<em><b>Semiconductor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMICONDUCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	SEMICONDUCTOR(5, "Semiconductor", "Semiconductor"),

	/**
	 * The '<em><b>Free Electron</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_ELECTRON_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_ELECTRON(6, "FreeElectron", "FreeElectron"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "Other", "Other");

	/**
	 * The '<em><b>Excimer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCIMER
	 * @model name="Excimer"
	 * @generated
	 * @ordered
	 */
	public static final int EXCIMER_VALUE = 0;

	/**
	 * The '<em><b>Gas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS
	 * @model name="Gas"
	 * @generated
	 * @ordered
	 */
	public static final int GAS_VALUE = 1;

	/**
	 * The '<em><b>Metal Vapor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAL_VAPOR
	 * @model name="MetalVapor"
	 * @generated
	 * @ordered
	 */
	public static final int METAL_VAPOR_VALUE = 2;

	/**
	 * The '<em><b>Solid State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID_STATE
	 * @model name="SolidState"
	 * @generated
	 * @ordered
	 */
	public static final int SOLID_STATE_VALUE = 3;

	/**
	 * The '<em><b>Dye</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYE
	 * @model name="Dye"
	 * @generated
	 * @ordered
	 */
	public static final int DYE_VALUE = 4;

	/**
	 * The '<em><b>Semiconductor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMICONDUCTOR
	 * @model name="Semiconductor"
	 * @generated
	 * @ordered
	 */
	public static final int SEMICONDUCTOR_VALUE = 5;

	/**
	 * The '<em><b>Free Electron</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_ELECTRON
	 * @model name="FreeElectron"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_ELECTRON_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type Type3</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType3[] VALUES_ARRAY =
		new TypeType3[] {
			EXCIMER,
			GAS,
			METAL_VAPOR,
			SOLID_STATE,
			DYE,
			SEMICONDUCTOR,
			FREE_ELECTRON,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type3</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType3> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type3</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType3 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType3 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type3</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType3 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType3 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type3</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType3 get(int value) {
		switch (value) {
			case EXCIMER_VALUE: return EXCIMER;
			case GAS_VALUE: return GAS;
			case METAL_VAPOR_VALUE: return METAL_VAPOR;
			case SOLID_STATE_VALUE: return SOLID_STATE;
			case DYE_VALUE: return DYE;
			case SEMICONDUCTOR_VALUE: return SEMICONDUCTOR;
			case FREE_ELECTRON_VALUE: return FREE_ELECTRON;
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
	private TypeType3(int value, String name, String literal) {
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
	
} //TypeType3
