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
 * A representation of the literals of the enumeration '<em><b>Impact Analysis Responses Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *                 The rationale of why the impact analysis state was asserted.
 *             
 * <!-- end-model-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getImpactAnalysisResponsesType()
 * @model extendedMetaData="name='impactAnalysisResponsesType'"
 * @generated
 */
@ProviderType
public enum ImpactAnalysisResponsesType implements Enumerator {
	/**
	 * The '<em><b>Can Not Fix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can not fix
	 * <!-- end-model-doc -->
	 * @see #CAN_NOT_FIX_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_NOT_FIX(0, "canNotFix", "can_not_fix"),

	/**
	 * The '<em><b>Will Not Fix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will not fix
	 * <!-- end-model-doc -->
	 * @see #WILL_NOT_FIX_VALUE
	 * @generated
	 * @ordered
	 */
	WILL_NOT_FIX(1, "willNotFix", "will_not_fix"),

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update to a different revision or release
	 * <!-- end-model-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(2, "update", "update"),

	/**
	 * The '<em><b>Rollback</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revert to a previous revision or release
	 * <!-- end-model-doc -->
	 * @see #ROLLBACK_VALUE
	 * @generated
	 * @ordered
	 */
	ROLLBACK(3, "rollback", "rollback"),

	/**
	 * The '<em><b>Workaround Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is a workaround available
	 * <!-- end-model-doc -->
	 * @see #WORKAROUND_AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	WORKAROUND_AVAILABLE(4, "workaroundAvailable", "workaround_available");

	/**
	 * The '<em><b>Can Not Fix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can not fix
	 * <!-- end-model-doc -->
	 * @see #CAN_NOT_FIX
	 * @model name="canNotFix" literal="can_not_fix"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_NOT_FIX_VALUE = 0;

	/**
	 * The '<em><b>Will Not Fix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will not fix
	 * <!-- end-model-doc -->
	 * @see #WILL_NOT_FIX
	 * @model name="willNotFix" literal="will_not_fix"
	 * @generated
	 * @ordered
	 */
	public static final int WILL_NOT_FIX_VALUE = 1;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update to a different revision or release
	 * <!-- end-model-doc -->
	 * @see #UPDATE
	 * @model name="update"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 2;

	/**
	 * The '<em><b>Rollback</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revert to a previous revision or release
	 * <!-- end-model-doc -->
	 * @see #ROLLBACK
	 * @model name="rollback"
	 * @generated
	 * @ordered
	 */
	public static final int ROLLBACK_VALUE = 3;

	/**
	 * The '<em><b>Workaround Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is a workaround available
	 * <!-- end-model-doc -->
	 * @see #WORKAROUND_AVAILABLE
	 * @model name="workaroundAvailable" literal="workaround_available"
	 * @generated
	 * @ordered
	 */
	public static final int WORKAROUND_AVAILABLE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Impact Analysis Responses Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImpactAnalysisResponsesType[] VALUES_ARRAY =
		new ImpactAnalysisResponsesType[] {
			CAN_NOT_FIX,
			WILL_NOT_FIX,
			UPDATE,
			ROLLBACK,
			WORKAROUND_AVAILABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Impact Analysis Responses Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImpactAnalysisResponsesType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Impact Analysis Responses Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisResponsesType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactAnalysisResponsesType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Analysis Responses Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisResponsesType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactAnalysisResponsesType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Analysis Responses Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisResponsesType get(int value) {
		switch (value) {
			case CAN_NOT_FIX_VALUE: return CAN_NOT_FIX;
			case WILL_NOT_FIX_VALUE: return WILL_NOT_FIX;
			case UPDATE_VALUE: return UPDATE;
			case ROLLBACK_VALUE: return ROLLBACK;
			case WORKAROUND_AVAILABLE_VALUE: return WORKAROUND_AVAILABLE;
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
	private ImpactAnalysisResponsesType(int value, String name, String literal) {
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
	
} //ImpactAnalysisResponsesType
