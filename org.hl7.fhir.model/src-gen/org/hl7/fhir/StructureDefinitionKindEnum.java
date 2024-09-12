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
 * A representation of the literals of the enumeration '<em><b>Structure Definition Kind Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getStructureDefinitionKindEnum()
 * @model extendedMetaData="name='StructureDefinitionKindEnum'"
 * @generated
 */
@ProviderType
public enum StructureDefinitionKindEnum implements Enumerator {
	/**
	 * The '<em><b>Primitive Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primitive Data Type
	 * <!-- end-model-doc -->
	 * @see #PRIMITIVE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVE_TYPE(0, "primitiveType", "primitive-type"),

	/**
	 * The '<em><b>Complex Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Complex Data Type
	 * <!-- end-model-doc -->
	 * @see #COMPLEX_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEX_TYPE(1, "complexType", "complex-type"),

	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource
	 * <!-- end-model-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(2, "resource", "resource"),

	/**
	 * The '<em><b>Logical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical
	 * <!-- end-model-doc -->
	 * @see #LOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL(3, "logical", "logical");

	/**
	 * The '<em><b>Primitive Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primitive Data Type
	 * <!-- end-model-doc -->
	 * @see #PRIMITIVE_TYPE
	 * @model name="primitiveType" literal="primitive-type"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVE_TYPE_VALUE = 0;

	/**
	 * The '<em><b>Complex Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Complex Data Type
	 * <!-- end-model-doc -->
	 * @see #COMPLEX_TYPE
	 * @model name="complexType" literal="complex-type"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEX_TYPE_VALUE = 1;

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource
	 * <!-- end-model-doc -->
	 * @see #RESOURCE
	 * @model name="resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 2;

	/**
	 * The '<em><b>Logical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical
	 * <!-- end-model-doc -->
	 * @see #LOGICAL
	 * @model name="logical"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Structure Definition Kind Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructureDefinitionKindEnum[] VALUES_ARRAY =
		new StructureDefinitionKindEnum[] {
			PRIMITIVE_TYPE,
			COMPLEX_TYPE,
			RESOURCE,
			LOGICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Structure Definition Kind Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructureDefinitionKindEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Structure Definition Kind Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureDefinitionKindEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureDefinitionKindEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Definition Kind Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureDefinitionKindEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureDefinitionKindEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Definition Kind Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureDefinitionKindEnum get(int value) {
		switch (value) {
			case PRIMITIVE_TYPE_VALUE: return PRIMITIVE_TYPE;
			case COMPLEX_TYPE_VALUE: return COMPLEX_TYPE;
			case RESOURCE_VALUE: return RESOURCE;
			case LOGICAL_VALUE: return LOGICAL;
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
	private StructureDefinitionKindEnum(int value, String name, String literal) {
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
	
} //StructureDefinitionKindEnum
