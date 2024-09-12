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
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Version Policy Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getResourceVersionPolicyEnum()
 * @model extendedMetaData="name='ResourceVersionPolicyEnum'"
 * @generated
 */
@ProviderType
public enum ResourceVersionPolicyEnum implements Enumerator {
	/**
	 * The '<em><b>No Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No VersionId Support
	 * <!-- end-model-doc -->
	 * @see #NO_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_VERSION(0, "noVersion", "no-version"),

	/**
	 * The '<em><b>Versioned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versioned
	 * <!-- end-model-doc -->
	 * @see #VERSIONED_VALUE
	 * @generated
	 * @ordered
	 */
	VERSIONED(1, "versioned", "versioned"),

	/**
	 * The '<em><b>Versioned Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VersionId tracked fully
	 * <!-- end-model-doc -->
	 * @see #VERSIONED_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	VERSIONED_UPDATE(2, "versionedUpdate", "versioned-update");

	/**
	 * The '<em><b>No Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No VersionId Support
	 * <!-- end-model-doc -->
	 * @see #NO_VERSION
	 * @model name="noVersion" literal="no-version"
	 * @generated
	 * @ordered
	 */
	public static final int NO_VERSION_VALUE = 0;

	/**
	 * The '<em><b>Versioned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versioned
	 * <!-- end-model-doc -->
	 * @see #VERSIONED
	 * @model name="versioned"
	 * @generated
	 * @ordered
	 */
	public static final int VERSIONED_VALUE = 1;

	/**
	 * The '<em><b>Versioned Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VersionId tracked fully
	 * <!-- end-model-doc -->
	 * @see #VERSIONED_UPDATE
	 * @model name="versionedUpdate" literal="versioned-update"
	 * @generated
	 * @ordered
	 */
	public static final int VERSIONED_UPDATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Resource Version Policy Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceVersionPolicyEnum[] VALUES_ARRAY =
		new ResourceVersionPolicyEnum[] {
			NO_VERSION,
			VERSIONED,
			VERSIONED_UPDATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Version Policy Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceVersionPolicyEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Version Policy Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceVersionPolicyEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceVersionPolicyEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Version Policy Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceVersionPolicyEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceVersionPolicyEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Version Policy Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceVersionPolicyEnum get(int value) {
		switch (value) {
			case NO_VERSION_VALUE: return NO_VERSION;
			case VERSIONED_VALUE: return VERSIONED;
			case VERSIONED_UPDATE_VALUE: return VERSIONED_UPDATE;
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
	private ResourceVersionPolicyEnum(int value, String name, String literal) {
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
	
} //ResourceVersionPolicyEnum
