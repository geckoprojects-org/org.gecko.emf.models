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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Neighbor Sel Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Dieser Aufzählungstyp steuert, wie die Randliniengeometrie bei RelateTopology zustande kommt.
 * 
 * "selected": Genau die Begrenzungslinien zu den ausgewählten Nachbarn
 * 
 * "notSelected": Genau die komplementären Begrenzungslinien
 * 
 * "noNeighbor": Alle Randlinien, die keinen Nachbarn haben
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getNeighborSelModeType()
 * @model extendedMetaData="name='NeighborSelModeType'"
 * @generated
 */
@ProviderType
public enum NeighborSelModeType implements Enumerator {
	/**
	 * The '<em><b>Selected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTED(0, "selected", "selected"),

	/**
	 * The '<em><b>Not Selected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SELECTED(1, "notSelected", "notSelected"),

	/**
	 * The '<em><b>No Neighbor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_NEIGHBOR_VALUE
	 * @generated
	 * @ordered
	 */
	NO_NEIGHBOR(2, "noNeighbor", "noNeighbor");

	/**
	 * The '<em><b>Selected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTED
	 * @model name="selected"
	 * @generated
	 * @ordered
	 */
	public static final int SELECTED_VALUE = 0;

	/**
	 * The '<em><b>Not Selected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SELECTED
	 * @model name="notSelected"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SELECTED_VALUE = 1;

	/**
	 * The '<em><b>No Neighbor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_NEIGHBOR
	 * @model name="noNeighbor"
	 * @generated
	 * @ordered
	 */
	public static final int NO_NEIGHBOR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Neighbor Sel Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NeighborSelModeType[] VALUES_ARRAY =
		new NeighborSelModeType[] {
			SELECTED,
			NOT_SELECTED,
			NO_NEIGHBOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Neighbor Sel Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NeighborSelModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Neighbor Sel Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeighborSelModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NeighborSelModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Neighbor Sel Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeighborSelModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NeighborSelModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Neighbor Sel Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeighborSelModeType get(int value) {
		switch (value) {
			case SELECTED_VALUE: return SELECTED;
			case NOT_SELECTED_VALUE: return NOT_SELECTED;
			case NO_NEIGHBOR_VALUE: return NO_NEIGHBOR;
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
	private NeighborSelModeType(int value, String name, String literal) {
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
	
} //NeighborSelModeType
