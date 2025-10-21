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
 * A representation of the literals of the enumeration '<em><b>Vertical Alignment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * VerticalAlignment ist ein Aufzählungstyp, der die vertikale Ausrichtung von Text steuert.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getVerticalAlignmentType()
 * @model extendedMetaData="name='VerticalAlignmentType'"
 * @generated
 */
@ProviderType
public enum VerticalAlignmentType implements Enumerator {
	/**
	 * The '<em><b>Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtung am oberen Abschluss der Zeichen des Texts bei PointLabel und LineLabel.
	 * <!-- end-model-doc -->
	 * @see #TOP_VALUE
	 * @generated
	 * @ordered
	 */
	TOP(0, "top", "top"),

	/**
	 * The '<em><b>Half</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtung an der Mittellinie der Zeichen des Texts bei PointLabel und LineLabel.
	 * <!-- end-model-doc -->
	 * @see #HALF_VALUE
	 * @generated
	 * @ordered
	 */
	HALF(1, "half", "half"),

	/**
	 * The '<em><b>Base</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtung an der Grundlinie der Zeichen des Texts bei PointLabel und LineLabel.
	 * <!-- end-model-doc -->
	 * @see #BASE_VALUE
	 * @generated
	 * @ordered
	 */
	BASE(2, "base", "base"),

	/**
	 * The '<em><b>Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtung am unteren Abschluss der Zeichen des Texts bei PointLabel und LineLabel.
	 * <!-- end-model-doc -->
	 * @see #BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM(3, "bottom", "bottom");

	/**
	 * The '<em><b>Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtung am oberen Abschluss der Zeichen des Texts bei PointLabel und LineLabel.
	 * <!-- end-model-doc -->
	 * @see #TOP
	 * @model name="top"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_VALUE = 0;

	/**
	 * The '<em><b>Half</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtung an der Mittellinie der Zeichen des Texts bei PointLabel und LineLabel.
	 * <!-- end-model-doc -->
	 * @see #HALF
	 * @model name="half"
	 * @generated
	 * @ordered
	 */
	public static final int HALF_VALUE = 1;

	/**
	 * The '<em><b>Base</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtung an der Grundlinie der Zeichen des Texts bei PointLabel und LineLabel.
	 * <!-- end-model-doc -->
	 * @see #BASE
	 * @model name="base"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VALUE = 2;

	/**
	 * The '<em><b>Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtung am unteren Abschluss der Zeichen des Texts bei PointLabel und LineLabel.
	 * <!-- end-model-doc -->
	 * @see #BOTTOM
	 * @model name="bottom"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Vertical Alignment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VerticalAlignmentType[] VALUES_ARRAY =
		new VerticalAlignmentType[] {
			TOP,
			HALF,
			BASE,
			BOTTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Vertical Alignment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VerticalAlignmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vertical Alignment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VerticalAlignmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerticalAlignmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vertical Alignment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VerticalAlignmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerticalAlignmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vertical Alignment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VerticalAlignmentType get(int value) {
		switch (value) {
			case TOP_VALUE: return TOP;
			case HALF_VALUE: return HALF;
			case BASE_VALUE: return BASE;
			case BOTTOM_VALUE: return BOTTOM;
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
	private VerticalAlignmentType(int value, String name, String literal) {
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
	
} //VerticalAlignmentType
