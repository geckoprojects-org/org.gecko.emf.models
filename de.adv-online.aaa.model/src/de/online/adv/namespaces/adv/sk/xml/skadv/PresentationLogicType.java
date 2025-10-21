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
 * A representation of the literals of the enumeration '<em><b>Presentation Logic Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Diese Aufzählungswerte wählen für den <i>SymbologyCatalog </i>einen Modus aus, welcher die Durchführung der Präsentation beeinflusst. Der Modus betrifft u.a. die Behandlung von Präsentationsobjekten und den Umgang mit Unterführungsrelationen und zIndex.
 * 
 * Nach dem Stand der Erkenntnis im Mai 2016 gibt es folgende Abweichungen bei der Präsentation von ATKIS gegenüber den anderen Modellen:
 * 
 * 1. In ATKIS werden die Präsentationsobjekte implizit ausgegeben. D.h. es gibt keine expliziten Regeln dafür. Bei den anderen sind die Präsentationsobjekte in die Regeln explizit eingearbeitet.
 * 
 * 2. In ATKIS sind die Effekte der Unterführungsrelationen auf die Darstellungspriorität (zIndex) explizit in die Regeln eingearbeitet. In den anderen Fällen greift ein impliziter Mechanismus, der eine übergeordnete Schichtung der Prioritäten vorsieht.
 * 
 * Obwohl sich die Unterschiede nur auf ATKIS beziehen, werden alle Modelle mit ihrem Namen repräsentiert.
 * 
 * Ziel der Harmonisierung ist eine einheitliche Behandlung; es steht aber noch nicht fest auf welche Art und Weise. Nach der Harmonisierung sollen das Attribut "presentationLogic" und der vorliegende Typ entfallen.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPresentationLogicType()
 * @model extendedMetaData="name='PresentationLogicType'"
 * @generated
 */
@ProviderType
public enum PresentationLogicType implements Enumerator {
	/**
	 * The '<em><b>ALKIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALKIS_VALUE
	 * @generated
	 * @ordered
	 */
	ALKIS(0, "ALKIS", "ALKIS"),

	/**
	 * The '<em><b>AFIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFIS_VALUE
	 * @generated
	 * @ordered
	 */
	AFIS(1, "AFIS", "AFIS"),

	/**
	 * The '<em><b>ATKIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATKIS_VALUE
	 * @generated
	 * @ordered
	 */
	ATKIS(2, "ATKIS", "ATKIS"),

	/**
	 * The '<em><b>Web SK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_SK_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_SK(3, "WebSK", "WebSK"),

	/**
	 * The '<em><b>Harmonized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARMONIZED_VALUE
	 * @generated
	 * @ordered
	 */
	HARMONIZED(4, "harmonized", "harmonized");

	/**
	 * The '<em><b>ALKIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALKIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALKIS_VALUE = 0;

	/**
	 * The '<em><b>AFIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFIS_VALUE = 1;

	/**
	 * The '<em><b>ATKIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATKIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATKIS_VALUE = 2;

	/**
	 * The '<em><b>Web SK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_SK
	 * @model name="WebSK"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_SK_VALUE = 3;

	/**
	 * The '<em><b>Harmonized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARMONIZED
	 * @model name="harmonized"
	 * @generated
	 * @ordered
	 */
	public static final int HARMONIZED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Presentation Logic Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PresentationLogicType[] VALUES_ARRAY =
		new PresentationLogicType[] {
			ALKIS,
			AFIS,
			ATKIS,
			WEB_SK,
			HARMONIZED,
		};

	/**
	 * A public read-only list of all the '<em><b>Presentation Logic Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PresentationLogicType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Presentation Logic Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PresentationLogicType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresentationLogicType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presentation Logic Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PresentationLogicType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresentationLogicType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presentation Logic Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PresentationLogicType get(int value) {
		switch (value) {
			case ALKIS_VALUE: return ALKIS;
			case AFIS_VALUE: return AFIS;
			case ATKIS_VALUE: return ATKIS;
			case WEB_SK_VALUE: return WEB_SK;
			case HARMONIZED_VALUE: return HARMONIZED;
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
	private PresentationLogicType(int value, String name, String literal) {
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
	
} //PresentationLogicType
