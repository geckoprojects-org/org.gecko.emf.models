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
 * A representation of the literals of the enumeration '<em><b>Impact Analysis State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *                 Declares the current state of an occurrence of a vulnerability, after automated or manual analysis.
 *             
 * <!-- end-model-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getImpactAnalysisStateType()
 * @model extendedMetaData="name='impactAnalysisStateType'"
 * @generated
 */
@ProviderType
public enum ImpactAnalysisStateType implements Enumerator {
	/**
	 * The '<em><b>Resolved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability has been remediated.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #RESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED(0, "resolved", "resolved"),

	/**
	 * The '<em><b>Resolved With Pedigree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability has been remediated and evidence of the changes are provided in the affected
	 *                         components pedigree containing verifiable commit history and/or diff(s).
	 *                     
	 * <!-- end-model-doc -->
	 * @see #RESOLVED_WITH_PEDIGREE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED_WITH_PEDIGREE(1, "resolvedWithPedigree", "resolved_with_pedigree"),

	/**
	 * The '<em><b>Exploitable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability may be directly or indirectly exploitable.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #EXPLOITABLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLOITABLE(2, "exploitable", "exploitable"),

	/**
	 * The '<em><b>In Triage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability is being investigated.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #IN_TRIAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IN_TRIAGE(3, "inTriage", "in_triage"),

	/**
	 * The '<em><b>False Positive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability is not specific to the component or service and was falsely identified or associated.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #FALSE_POSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	FALSE_POSITIVE(4, "falsePositive", "false_positive"),

	/**
	 * The '<em><b>Not Affected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The component or service is not affected by the vulnerability. Justification should be specified
	 *                         for all not_affected cases.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #NOT_AFFECTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_AFFECTED(5, "notAffected", "not_affected");

	/**
	 * The '<em><b>Resolved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability has been remediated.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #RESOLVED
	 * @model name="resolved"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_VALUE = 0;

	/**
	 * The '<em><b>Resolved With Pedigree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability has been remediated and evidence of the changes are provided in the affected
	 *                         components pedigree containing verifiable commit history and/or diff(s).
	 *                     
	 * <!-- end-model-doc -->
	 * @see #RESOLVED_WITH_PEDIGREE
	 * @model name="resolvedWithPedigree" literal="resolved_with_pedigree"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_WITH_PEDIGREE_VALUE = 1;

	/**
	 * The '<em><b>Exploitable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability may be directly or indirectly exploitable.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #EXPLOITABLE
	 * @model name="exploitable"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLOITABLE_VALUE = 2;

	/**
	 * The '<em><b>In Triage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability is being investigated.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #IN_TRIAGE
	 * @model name="inTriage" literal="in_triage"
	 * @generated
	 * @ordered
	 */
	public static final int IN_TRIAGE_VALUE = 3;

	/**
	 * The '<em><b>False Positive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerability is not specific to the component or service and was falsely identified or associated.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #FALSE_POSITIVE
	 * @model name="falsePositive" literal="false_positive"
	 * @generated
	 * @ordered
	 */
	public static final int FALSE_POSITIVE_VALUE = 4;

	/**
	 * The '<em><b>Not Affected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The component or service is not affected by the vulnerability. Justification should be specified
	 *                         for all not_affected cases.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #NOT_AFFECTED
	 * @model name="notAffected" literal="not_affected"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_AFFECTED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Impact Analysis State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImpactAnalysisStateType[] VALUES_ARRAY =
		new ImpactAnalysisStateType[] {
			RESOLVED,
			RESOLVED_WITH_PEDIGREE,
			EXPLOITABLE,
			IN_TRIAGE,
			FALSE_POSITIVE,
			NOT_AFFECTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Impact Analysis State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImpactAnalysisStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Impact Analysis State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactAnalysisStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Analysis State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactAnalysisStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Analysis State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisStateType get(int value) {
		switch (value) {
			case RESOLVED_VALUE: return RESOLVED;
			case RESOLVED_WITH_PEDIGREE_VALUE: return RESOLVED_WITH_PEDIGREE;
			case EXPLOITABLE_VALUE: return EXPLOITABLE;
			case IN_TRIAGE_VALUE: return IN_TRIAGE;
			case FALSE_POSITIVE_VALUE: return FALSE_POSITIVE;
			case NOT_AFFECTED_VALUE: return NOT_AFFECTED;
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
	private ImpactAnalysisStateType(int value, String name, String literal) {
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
	
} //ImpactAnalysisStateType
