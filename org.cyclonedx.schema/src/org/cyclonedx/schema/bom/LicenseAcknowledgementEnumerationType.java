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
package org.cyclonedx.schema.bom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>License Acknowledgement Enumeration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseAcknowledgementEnumerationType()
 * @model extendedMetaData="name='licenseAcknowledgementEnumerationType'"
 * @generated
 */
@ProviderType
public enum LicenseAcknowledgementEnumerationType implements Enumerator {
	/**
	 * The '<em><b>Declared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Declared licenses represent the initial intentions of authors regarding
	 *                             the licensing terms of their code.
	 *                         
	 * <!-- end-model-doc -->
	 * @see #DECLARED_VALUE
	 * @generated
	 * @ordered
	 */
	DECLARED(0, "declared", "declared"),

	/**
	 * The '<em><b>Concluded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Concluded licenses are verified and confirmed.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CONCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	CONCLUDED(1, "concluded", "concluded");

	/**
	 * The '<em><b>Declared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Declared licenses represent the initial intentions of authors regarding
	 *                             the licensing terms of their code.
	 *                         
	 * <!-- end-model-doc -->
	 * @see #DECLARED
	 * @model name="declared"
	 * @generated
	 * @ordered
	 */
	public static final int DECLARED_VALUE = 0;

	/**
	 * The '<em><b>Concluded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Concluded licenses are verified and confirmed.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CONCLUDED
	 * @model name="concluded"
	 * @generated
	 * @ordered
	 */
	public static final int CONCLUDED_VALUE = 1;

	/**
	 * An array of all the '<em><b>License Acknowledgement Enumeration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LicenseAcknowledgementEnumerationType[] VALUES_ARRAY =
		new LicenseAcknowledgementEnumerationType[] {
			DECLARED,
			CONCLUDED,
		};

	/**
	 * A public read-only list of all the '<em><b>License Acknowledgement Enumeration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LicenseAcknowledgementEnumerationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>License Acknowledgement Enumeration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseAcknowledgementEnumerationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LicenseAcknowledgementEnumerationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>License Acknowledgement Enumeration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseAcknowledgementEnumerationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LicenseAcknowledgementEnumerationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>License Acknowledgement Enumeration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseAcknowledgementEnumerationType get(int value) {
		switch (value) {
			case DECLARED_VALUE: return DECLARED;
			case CONCLUDED_VALUE: return CONCLUDED;
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
	private LicenseAcknowledgementEnumerationType(int value, String name, String literal) {
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
	
} //LicenseAcknowledgementEnumerationType
