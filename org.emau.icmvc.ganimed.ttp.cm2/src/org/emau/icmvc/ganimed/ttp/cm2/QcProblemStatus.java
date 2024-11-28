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
package org.emau.icmvc.ganimed.ttp.cm2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qc Problem Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemStatus()
 * @model extendedMetaData="name='qcProblemStatus'"
 * @generated
 */
@ProviderType
public enum QcProblemStatus implements Enumerator {
	/**
	 * The '<em><b>OPENEXTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENEXTERN_VALUE
	 * @generated
	 * @ordered
	 */
	OPENEXTERN(0, "OPENEXTERN", "OPEN_EXTERN"),

	/**
	 * The '<em><b>OPENINTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENINTERN_VALUE
	 * @generated
	 * @ordered
	 */
	OPENINTERN(1, "OPENINTERN", "OPEN_INTERN"),

	/**
	 * The '<em><b>CANCELEDEXTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELEDEXTERN_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELEDEXTERN(2, "CANCELEDEXTERN", "CANCELED_EXTERN"),

	/**
	 * The '<em><b>CANCELEDINTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELEDINTERN_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELEDINTERN(3, "CANCELEDINTERN", "CANCELED_INTERN"),

	/**
	 * The '<em><b>CLOSEDEXTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEDEXTERN_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSEDEXTERN(4, "CLOSEDEXTERN", "CLOSED_EXTERN"),

	/**
	 * The '<em><b>CLOSEDINTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEDINTERN_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSEDINTERN(5, "CLOSEDINTERN", "CLOSED_INTERN"),

	/**
	 * The '<em><b>DELETEDINTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETEDINTERN_VALUE
	 * @generated
	 * @ordered
	 */
	DELETEDINTERN(6, "DELETEDINTERN", "DELETED_INTERN");

	/**
	 * The '<em><b>OPENEXTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENEXTERN
	 * @model literal="OPEN_EXTERN"
	 * @generated
	 * @ordered
	 */
	public static final int OPENEXTERN_VALUE = 0;

	/**
	 * The '<em><b>OPENINTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENINTERN
	 * @model literal="OPEN_INTERN"
	 * @generated
	 * @ordered
	 */
	public static final int OPENINTERN_VALUE = 1;

	/**
	 * The '<em><b>CANCELEDEXTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELEDEXTERN
	 * @model literal="CANCELED_EXTERN"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELEDEXTERN_VALUE = 2;

	/**
	 * The '<em><b>CANCELEDINTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELEDINTERN
	 * @model literal="CANCELED_INTERN"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELEDINTERN_VALUE = 3;

	/**
	 * The '<em><b>CLOSEDEXTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEDEXTERN
	 * @model literal="CLOSED_EXTERN"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSEDEXTERN_VALUE = 4;

	/**
	 * The '<em><b>CLOSEDINTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEDINTERN
	 * @model literal="CLOSED_INTERN"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSEDINTERN_VALUE = 5;

	/**
	 * The '<em><b>DELETEDINTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETEDINTERN
	 * @model literal="DELETED_INTERN"
	 * @generated
	 * @ordered
	 */
	public static final int DELETEDINTERN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Qc Problem Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QcProblemStatus[] VALUES_ARRAY =
		new QcProblemStatus[] {
			OPENEXTERN,
			OPENINTERN,
			CANCELEDEXTERN,
			CANCELEDINTERN,
			CLOSEDEXTERN,
			CLOSEDINTERN,
			DELETEDINTERN,
		};

	/**
	 * A public read-only list of all the '<em><b>Qc Problem Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QcProblemStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Qc Problem Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QcProblemStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qc Problem Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QcProblemStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qc Problem Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemStatus get(int value) {
		switch (value) {
			case OPENEXTERN_VALUE: return OPENEXTERN;
			case OPENINTERN_VALUE: return OPENINTERN;
			case CANCELEDEXTERN_VALUE: return CANCELEDEXTERN;
			case CANCELEDINTERN_VALUE: return CANCELEDINTERN;
			case CLOSEDEXTERN_VALUE: return CLOSEDEXTERN;
			case CLOSEDINTERN_VALUE: return CLOSEDINTERN;
			case DELETEDINTERN_VALUE: return DELETEDINTERN;
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
	private QcProblemStatus(int value, String name, String literal) {
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
	
} //QcProblemStatus
