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
 * A representation of the literals of the enumeration '<em><b>Medicationrequest Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getMedicationrequestStatusEnum()
 * @model extendedMetaData="name='MedicationrequestStatusEnum'"
 * @generated
 */
@ProviderType
public enum MedicationrequestStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Active</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Active
	 * <!-- end-model-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(0, "active", "active"),

	/**
	 * The '<em><b>On Hold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On Hold
	 * <!-- end-model-doc -->
	 * @see #ON_HOLD_VALUE
	 * @generated
	 * @ordered
	 */
	ON_HOLD(1, "onHold", "on-hold"),

	/**
	 * The '<em><b>Ended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ended
	 * <!-- end-model-doc -->
	 * @see #ENDED_VALUE
	 * @generated
	 * @ordered
	 */
	ENDED(2, "ended", "ended"),

	/**
	 * The '<em><b>Stopped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stopped
	 * <!-- end-model-doc -->
	 * @see #STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	STOPPED(3, "stopped", "stopped"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completed
	 * <!-- end-model-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(4, "completed", "completed"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(5, "cancelled", "cancelled"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(6, "enteredInError", "entered-in-error"),

	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Draft
	 * <!-- end-model-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(7, "draft", "draft"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(8, "unknown", "unknown");

	/**
	 * The '<em><b>Active</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Active
	 * <!-- end-model-doc -->
	 * @see #ACTIVE
	 * @model name="active"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 0;

	/**
	 * The '<em><b>On Hold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On Hold
	 * <!-- end-model-doc -->
	 * @see #ON_HOLD
	 * @model name="onHold" literal="on-hold"
	 * @generated
	 * @ordered
	 */
	public static final int ON_HOLD_VALUE = 1;

	/**
	 * The '<em><b>Ended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ended
	 * <!-- end-model-doc -->
	 * @see #ENDED
	 * @model name="ended"
	 * @generated
	 * @ordered
	 */
	public static final int ENDED_VALUE = 2;

	/**
	 * The '<em><b>Stopped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stopped
	 * <!-- end-model-doc -->
	 * @see #STOPPED
	 * @model name="stopped"
	 * @generated
	 * @ordered
	 */
	public static final int STOPPED_VALUE = 3;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completed
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 4;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 5;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 6;

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Draft
	 * <!-- end-model-doc -->
	 * @see #DRAFT
	 * @model name="draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 7;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 8;

	/**
	 * An array of all the '<em><b>Medicationrequest Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MedicationrequestStatusEnum[] VALUES_ARRAY =
		new MedicationrequestStatusEnum[] {
			ACTIVE,
			ON_HOLD,
			ENDED,
			STOPPED,
			COMPLETED,
			CANCELLED,
			ENTERED_IN_ERROR,
			DRAFT,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Medicationrequest Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MedicationrequestStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Medicationrequest Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationrequestStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationrequestStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medicationrequest Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationrequestStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationrequestStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medicationrequest Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationrequestStatusEnum get(int value) {
		switch (value) {
			case ACTIVE_VALUE: return ACTIVE;
			case ON_HOLD_VALUE: return ON_HOLD;
			case ENDED_VALUE: return ENDED;
			case STOPPED_VALUE: return STOPPED;
			case COMPLETED_VALUE: return COMPLETED;
			case CANCELLED_VALUE: return CANCELLED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
			case DRAFT_VALUE: return DRAFT;
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
	private MedicationrequestStatusEnum(int value, String name, String literal) {
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
	
} //MedicationrequestStatusEnum
