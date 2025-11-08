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
 * A representation of the literals of the enumeration '<em><b>Data Flow Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specifies the flow direction of the data. Valid values are:
 *                 inbound, outbound, bi-directional, and unknown. Direction is relative to the service.
 *                 Inbound flow states that data enters the service. Outbound flow states that data
 *                 leaves the service. Bi-directional states that data flows both ways, and unknown
 *                 states that the direction is not known.
 * <!-- end-model-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getDataFlowType1()
 * @model extendedMetaData="name='dataFlowType'"
 * @generated
 */
@ProviderType
public enum DataFlowType1 implements Enumerator {
	/**
	 * The '<em><b>Inbound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Data that enters a service.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #INBOUND_VALUE
	 * @generated
	 * @ordered
	 */
	INBOUND(0, "inbound", "inbound"),

	/**
	 * The '<em><b>Outbound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data that exits a service.
	 * <!-- end-model-doc -->
	 * @see #OUTBOUND_VALUE
	 * @generated
	 * @ordered
	 */
	OUTBOUND(1, "outbound", "outbound"),

	/**
	 * The '<em><b>Bi Directional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data flows in and out of the service.
	 * <!-- end-model-doc -->
	 * @see #BI_DIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	BI_DIRECTIONAL(2, "biDirectional", "bi-directional"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The directional flow of data is not known.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(3, "unknown", "unknown");

	/**
	 * The '<em><b>Inbound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Data that enters a service.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #INBOUND
	 * @model name="inbound"
	 * @generated
	 * @ordered
	 */
	public static final int INBOUND_VALUE = 0;

	/**
	 * The '<em><b>Outbound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data that exits a service.
	 * <!-- end-model-doc -->
	 * @see #OUTBOUND
	 * @model name="outbound"
	 * @generated
	 * @ordered
	 */
	public static final int OUTBOUND_VALUE = 1;

	/**
	 * The '<em><b>Bi Directional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data flows in and out of the service.
	 * <!-- end-model-doc -->
	 * @see #BI_DIRECTIONAL
	 * @model name="biDirectional" literal="bi-directional"
	 * @generated
	 * @ordered
	 */
	public static final int BI_DIRECTIONAL_VALUE = 2;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The directional flow of data is not known.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Data Flow Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataFlowType1[] VALUES_ARRAY =
		new DataFlowType1[] {
			INBOUND,
			OUTBOUND,
			BI_DIRECTIONAL,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Flow Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataFlowType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Flow Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataFlowType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataFlowType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Flow Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataFlowType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataFlowType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Flow Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataFlowType1 get(int value) {
		switch (value) {
			case INBOUND_VALUE: return INBOUND;
			case OUTBOUND_VALUE: return OUTBOUND;
			case BI_DIRECTIONAL_VALUE: return BI_DIRECTIONAL;
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
	private DataFlowType1(int value, String name, String literal) {
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
	
} //DataFlowType1
