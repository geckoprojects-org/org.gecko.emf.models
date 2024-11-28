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
 * A representation of the literals of the enumeration '<em><b>Qc Problem Type Error</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemTypeError()
 * @model extendedMetaData="name='qcProblemTypeError'"
 * @generated
 */
@ProviderType
public enum QcProblemTypeError implements Enumerator {
	/**
	 * The '<em><b>MISSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	MISSING(0, "MISSING", "MISSING"),

	/**
	 * The '<em><b>MISSINGPART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSINGPART_VALUE
	 * @generated
	 * @ordered
	 */
	MISSINGPART(1, "MISSINGPART", "MISSING_PART"),

	/**
	 * The '<em><b>ILLEGIBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILLEGIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	ILLEGIBLE(2, "ILLEGIBLE", "ILLEGIBLE"),

	/**
	 * The '<em><b>WRONGPARTICIPANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONGPARTICIPANT_VALUE
	 * @generated
	 * @ordered
	 */
	WRONGPARTICIPANT(3, "WRONGPARTICIPANT", "WRONG_PARTICIPANT"),

	/**
	 * The '<em><b>INCONSISTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	INCONSISTENT(4, "INCONSISTENT", "INCONSISTENT"),

	/**
	 * The '<em><b>IMPLAUSIBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLAUSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLAUSIBLE(5, "IMPLAUSIBLE", "IMPLAUSIBLE"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "OTHER", "OTHER");

	/**
	 * The '<em><b>MISSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MISSING_VALUE = 0;

	/**
	 * The '<em><b>MISSINGPART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSINGPART
	 * @model literal="MISSING_PART"
	 * @generated
	 * @ordered
	 */
	public static final int MISSINGPART_VALUE = 1;

	/**
	 * The '<em><b>ILLEGIBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILLEGIBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ILLEGIBLE_VALUE = 2;

	/**
	 * The '<em><b>WRONGPARTICIPANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONGPARTICIPANT
	 * @model literal="WRONG_PARTICIPANT"
	 * @generated
	 * @ordered
	 */
	public static final int WRONGPARTICIPANT_VALUE = 3;

	/**
	 * The '<em><b>INCONSISTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCONSISTENT_VALUE = 4;

	/**
	 * The '<em><b>IMPLAUSIBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLAUSIBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPLAUSIBLE_VALUE = 5;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Qc Problem Type Error</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QcProblemTypeError[] VALUES_ARRAY =
		new QcProblemTypeError[] {
			MISSING,
			MISSINGPART,
			ILLEGIBLE,
			WRONGPARTICIPANT,
			INCONSISTENT,
			IMPLAUSIBLE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Qc Problem Type Error</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QcProblemTypeError> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Qc Problem Type Error</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemTypeError get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QcProblemTypeError result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qc Problem Type Error</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemTypeError getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QcProblemTypeError result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qc Problem Type Error</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemTypeError get(int value) {
		switch (value) {
			case MISSING_VALUE: return MISSING;
			case MISSINGPART_VALUE: return MISSINGPART;
			case ILLEGIBLE_VALUE: return ILLEGIBLE;
			case WRONGPARTICIPANT_VALUE: return WRONGPARTICIPANT;
			case INCONSISTENT_VALUE: return INCONSISTENT;
			case IMPLAUSIBLE_VALUE: return IMPLAUSIBLE;
			case OTHER_VALUE: return OTHER;
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
	private QcProblemTypeError(int value, String name, String literal) {
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
	
} //QcProblemTypeError
