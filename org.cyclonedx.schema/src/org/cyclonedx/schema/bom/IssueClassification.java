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
 * A representation of the literals of the enumeration '<em><b>Issue Classification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getIssueClassification()
 * @model extendedMetaData="name='issueClassification'"
 * @generated
 */
@ProviderType
public enum IssueClassification implements Enumerator {
	/**
	 * The '<em><b>Defect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fault, flaw, or bug in software
	 * <!-- end-model-doc -->
	 * @see #DEFECT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFECT(0, "defect", "defect"),

	/**
	 * The '<em><b>Enhancement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A new feature or behavior in software
	 * <!-- end-model-doc -->
	 * @see #ENHANCEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENHANCEMENT(1, "enhancement", "enhancement"),

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A special type of defect which impacts security
	 * <!-- end-model-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(2, "security", "security");

	/**
	 * The '<em><b>Defect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fault, flaw, or bug in software
	 * <!-- end-model-doc -->
	 * @see #DEFECT
	 * @model name="defect"
	 * @generated
	 * @ordered
	 */
	public static final int DEFECT_VALUE = 0;

	/**
	 * The '<em><b>Enhancement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A new feature or behavior in software
	 * <!-- end-model-doc -->
	 * @see #ENHANCEMENT
	 * @model name="enhancement"
	 * @generated
	 * @ordered
	 */
	public static final int ENHANCEMENT_VALUE = 1;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A special type of defect which impacts security
	 * <!-- end-model-doc -->
	 * @see #SECURITY
	 * @model name="security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Issue Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssueClassification[] VALUES_ARRAY =
		new IssueClassification[] {
			DEFECT,
			ENHANCEMENT,
			SECURITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Issue Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssueClassification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Classification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueClassification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueClassification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Classification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueClassification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueClassification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Classification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueClassification get(int value) {
		switch (value) {
			case DEFECT_VALUE: return DEFECT;
			case ENHANCEMENT_VALUE: return ENHANCEMENT;
			case SECURITY_VALUE: return SECURITY;
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
	private IssueClassification(int value, String name, String literal) {
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
	
} //IssueClassification
