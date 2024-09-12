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
 * A representation of the literals of the enumeration '<em><b>Extension Context Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getExtensionContextTypeEnum()
 * @model extendedMetaData="name='ExtensionContextTypeEnum'"
 * @generated
 */
@ProviderType
public enum ExtensionContextTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Fhirpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath
	 * <!-- end-model-doc -->
	 * @see #FHIRPATH_VALUE
	 * @generated
	 * @ordered
	 */
	FHIRPATH(0, "fhirpath", "fhirpath"),

	/**
	 * The '<em><b>Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element ID
	 * <!-- end-model-doc -->
	 * @see #ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT(1, "element", "element"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension URL
	 * <!-- end-model-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(2, "extension", "extension");

	/**
	 * The '<em><b>Fhirpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath
	 * <!-- end-model-doc -->
	 * @see #FHIRPATH
	 * @model name="fhirpath"
	 * @generated
	 * @ordered
	 */
	public static final int FHIRPATH_VALUE = 0;

	/**
	 * The '<em><b>Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element ID
	 * <!-- end-model-doc -->
	 * @see #ELEMENT
	 * @model name="element"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_VALUE = 1;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension URL
	 * <!-- end-model-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Extension Context Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExtensionContextTypeEnum[] VALUES_ARRAY =
		new ExtensionContextTypeEnum[] {
			FHIRPATH,
			ELEMENT,
			EXTENSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Extension Context Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExtensionContextTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Extension Context Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExtensionContextTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExtensionContextTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Extension Context Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExtensionContextTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExtensionContextTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Extension Context Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExtensionContextTypeEnum get(int value) {
		switch (value) {
			case FHIRPATH_VALUE: return FHIRPATH;
			case ELEMENT_VALUE: return ELEMENT;
			case EXTENSION_VALUE: return EXTENSION;
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
	private ExtensionContextTypeEnum(int value, String name, String literal) {
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
	
} //ExtensionContextTypeEnum
