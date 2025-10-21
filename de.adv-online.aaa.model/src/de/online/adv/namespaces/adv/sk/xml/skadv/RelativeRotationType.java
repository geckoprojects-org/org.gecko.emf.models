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
 * A representation of the literals of the enumeration '<em><b>Relative Rotation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Der Aufzählungstyp RelativeRotation enthält die möglichen Optionen für die Ausrichtung von Graphics entlang des Linienverlaufs.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRelativeRotationType()
 * @model extendedMetaData="name='RelativeRotationType'"
 * @generated
 */
@ProviderType
public enum RelativeRotationType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden ohne weitere Drehung platziert.
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Tangential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden so gedreht, dass ihre ursprünglich nach oben weisende Achse tangential entlang der Linie verläuft.
	 * <!-- end-model-doc -->
	 * @see #TANGENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	TANGENTIAL(1, "tangential", "tangential"),

	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden so gedreht, dass ihre ursprünglich nach oben weisende Achse in Richtung der linksseitigen Normalen zeigt.
	 * <!-- end-model-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(2, "normal", "normal"),

	/**
	 * The '<em><b>Anti Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden so gedreht, dass ihre ursprünglich nach oben weisende Achse in Richtung der rechtsseitigen Normalen zeigt.
	 * <!-- end-model-doc -->
	 * @see #ANTI_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	ANTI_NORMAL(3, "antiNormal", "antiNormal"),

	/**
	 * The '<em><b>Alternating Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden so gedreht, dass ihre ursprünglich nach oben weisende Achse im Verlauf der Linie abwechselnd in Richtung der linksseitigen Normalen und der rechtseitigen Normalen zeigt.
	 * <!-- end-model-doc -->
	 * @see #ALTERNATING_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATING_NORMAL(4, "alternatingNormal", "alternatingNormal");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden ohne weitere Drehung platziert.
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Tangential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden so gedreht, dass ihre ursprünglich nach oben weisende Achse tangential entlang der Linie verläuft.
	 * <!-- end-model-doc -->
	 * @see #TANGENTIAL
	 * @model name="tangential"
	 * @generated
	 * @ordered
	 */
	public static final int TANGENTIAL_VALUE = 1;

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden so gedreht, dass ihre ursprünglich nach oben weisende Achse in Richtung der linksseitigen Normalen zeigt.
	 * <!-- end-model-doc -->
	 * @see #NORMAL
	 * @model name="normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 2;

	/**
	 * The '<em><b>Anti Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden so gedreht, dass ihre ursprünglich nach oben weisende Achse in Richtung der rechtsseitigen Normalen zeigt.
	 * <!-- end-model-doc -->
	 * @see #ANTI_NORMAL
	 * @model name="antiNormal"
	 * @generated
	 * @ordered
	 */
	public static final int ANTI_NORMAL_VALUE = 3;

	/**
	 * The '<em><b>Alternating Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Graphics werden so gedreht, dass ihre ursprünglich nach oben weisende Achse im Verlauf der Linie abwechselnd in Richtung der linksseitigen Normalen und der rechtseitigen Normalen zeigt.
	 * <!-- end-model-doc -->
	 * @see #ALTERNATING_NORMAL
	 * @model name="alternatingNormal"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATING_NORMAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Relative Rotation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelativeRotationType[] VALUES_ARRAY =
		new RelativeRotationType[] {
			NONE,
			TANGENTIAL,
			NORMAL,
			ANTI_NORMAL,
			ALTERNATING_NORMAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Relative Rotation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelativeRotationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relative Rotation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelativeRotationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelativeRotationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relative Rotation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelativeRotationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelativeRotationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relative Rotation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelativeRotationType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case TANGENTIAL_VALUE: return TANGENTIAL;
			case NORMAL_VALUE: return NORMAL;
			case ANTI_NORMAL_VALUE: return ANTI_NORMAL;
			case ALTERNATING_NORMAL_VALUE: return ALTERNATING_NORMAL;
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
	private RelativeRotationType(int value, String name, String literal) {
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
	
} //RelativeRotationType
