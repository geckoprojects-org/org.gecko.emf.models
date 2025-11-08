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
 * A representation of the literals of the enumeration '<em><b>Impact Analysis Affected Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *                 The vulnerability status of a given version or range of versions of a product. The statuses
 *                 'affected' and 'unaffected' indicate that the version is affected or unaffected by the vulnerability.
 *                 The status 'unknown' indicates that it is unknown or unspecified whether the given version is affected.
 *                 There can be many reasons for an 'unknown' status, including that an investigation has not been
 *                 undertaken or that a vendor has not disclosed the status.
 *             
 * <!-- end-model-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getImpactAnalysisAffectedStatusType()
 * @model extendedMetaData="name='impactAnalysisAffectedStatusType'"
 * @generated
 */
@ProviderType
public enum ImpactAnalysisAffectedStatusType implements Enumerator {
	/**
	 * The '<em><b>Affected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version is affected by the vulnerability.
	 * <!-- end-model-doc -->
	 * @see #AFFECTED_VALUE
	 * @generated
	 * @ordered
	 */
	AFFECTED(0, "affected", "affected"),

	/**
	 * The '<em><b>Unaffected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version is not affected by the vulnerability.
	 * <!-- end-model-doc -->
	 * @see #UNAFFECTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNAFFECTED(1, "unaffected", "unaffected"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is unknown (or unspecified) whether the given version is affected.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(2, "unknown", "unknown");

	/**
	 * The '<em><b>Affected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version is affected by the vulnerability.
	 * <!-- end-model-doc -->
	 * @see #AFFECTED
	 * @model name="affected"
	 * @generated
	 * @ordered
	 */
	public static final int AFFECTED_VALUE = 0;

	/**
	 * The '<em><b>Unaffected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version is not affected by the vulnerability.
	 * <!-- end-model-doc -->
	 * @see #UNAFFECTED
	 * @model name="unaffected"
	 * @generated
	 * @ordered
	 */
	public static final int UNAFFECTED_VALUE = 1;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is unknown (or unspecified) whether the given version is affected.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Impact Analysis Affected Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImpactAnalysisAffectedStatusType[] VALUES_ARRAY =
		new ImpactAnalysisAffectedStatusType[] {
			AFFECTED,
			UNAFFECTED,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Impact Analysis Affected Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImpactAnalysisAffectedStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Impact Analysis Affected Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisAffectedStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactAnalysisAffectedStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Analysis Affected Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisAffectedStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactAnalysisAffectedStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Analysis Affected Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisAffectedStatusType get(int value) {
		switch (value) {
			case AFFECTED_VALUE: return AFFECTED;
			case UNAFFECTED_VALUE: return UNAFFECTED;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private ImpactAnalysisAffectedStatusType(int value, String name, String literal) {
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
	
} //ImpactAnalysisAffectedStatusType
