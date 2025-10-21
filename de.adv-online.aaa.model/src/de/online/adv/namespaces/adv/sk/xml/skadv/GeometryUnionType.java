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
 * A representation of the literals of the enumeration '<em><b>Geometry Union Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Der Aufzählungstyp GeometryUnion belegt das Attribut "mode" in VariantGeometry. Siehe dort.
 * 
 * Der Wert steuert, wie mit Geometriemengen umgegangen wird, die entstehen, wenn der Selektionsausdruck für die Geometrie solche vorsieht.
 * 
 * Es ist zu vermuten, dass sich bei den Definitionsarbeiten weitere erforderliche Aufzählungswerte ergeben werden.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getGeometryUnionType()
 * @model extendedMetaData="name='GeometryUnionType'"
 * @generated
 */
@ProviderType
public enum GeometryUnionType implements Enumerator {
	/**
	 * The '<em><b>Standard Or Union</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Wert steht für die direkte Übernahme der Geometrie, wenn die selektierte Menge von Geometrien nur ein einziges Element enthält.
	 * Er steht für die Vereinigung der Geometrien bei Mengen mit Kardinalität >1.
	 * 
	 * Die Vereinigung erzeugt im Allgemeinen Multi-Geometrien. Allerdings sollen sich überlappende Flächen und Linien als Geometrien vereinigt werden.
	 * <!-- end-model-doc -->
	 * @see #STANDARD_OR_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_OR_UNION(0, "standardOrUnion", "standardOrUnion"),

	/**
	 * The '<em><b>Center Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Wert "centerPoint" steht für die besondere Form der Aggregation von Geometrien, bei der als Ergebnis der Schwerpunkt der Einzelgeometrien erzeugt wird.
	 * <!-- end-model-doc -->
	 * @see #CENTER_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER_POINT(1, "centerPoint", "centerPoint"),

	/**
	 * The '<em><b>AP Darstellung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Sonderwert "AP_Darstellung" bei "mode" in VariantGeometry ist eine Abkürzung für die Expression "dientZurDarstellungVonPosition". In diesem Fall entfällt die Expression. Die ermittelten Geometrien werden wie bei "standardOrUnion" behandelt.
	 * <!-- end-model-doc -->
	 * @see #AP_DARSTELLUNG_VALUE
	 * @generated
	 * @ordered
	 */
	AP_DARSTELLUNG(2, "APDarstellung", "AP_Darstellung");

	/**
	 * The '<em><b>Standard Or Union</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Wert steht für die direkte Übernahme der Geometrie, wenn die selektierte Menge von Geometrien nur ein einziges Element enthält.
	 * Er steht für die Vereinigung der Geometrien bei Mengen mit Kardinalität >1.
	 * 
	 * Die Vereinigung erzeugt im Allgemeinen Multi-Geometrien. Allerdings sollen sich überlappende Flächen und Linien als Geometrien vereinigt werden.
	 * <!-- end-model-doc -->
	 * @see #STANDARD_OR_UNION
	 * @model name="standardOrUnion"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_OR_UNION_VALUE = 0;

	/**
	 * The '<em><b>Center Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Wert "centerPoint" steht für die besondere Form der Aggregation von Geometrien, bei der als Ergebnis der Schwerpunkt der Einzelgeometrien erzeugt wird.
	 * <!-- end-model-doc -->
	 * @see #CENTER_POINT
	 * @model name="centerPoint"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_POINT_VALUE = 1;

	/**
	 * The '<em><b>AP Darstellung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Sonderwert "AP_Darstellung" bei "mode" in VariantGeometry ist eine Abkürzung für die Expression "dientZurDarstellungVonPosition". In diesem Fall entfällt die Expression. Die ermittelten Geometrien werden wie bei "standardOrUnion" behandelt.
	 * <!-- end-model-doc -->
	 * @see #AP_DARSTELLUNG
	 * @model name="APDarstellung" literal="AP_Darstellung"
	 * @generated
	 * @ordered
	 */
	public static final int AP_DARSTELLUNG_VALUE = 2;

	/**
	 * An array of all the '<em><b>Geometry Union Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GeometryUnionType[] VALUES_ARRAY =
		new GeometryUnionType[] {
			STANDARD_OR_UNION,
			CENTER_POINT,
			AP_DARSTELLUNG,
		};

	/**
	 * A public read-only list of all the '<em><b>Geometry Union Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GeometryUnionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Geometry Union Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometryUnionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeometryUnionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geometry Union Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometryUnionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeometryUnionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geometry Union Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometryUnionType get(int value) {
		switch (value) {
			case STANDARD_OR_UNION_VALUE: return STANDARD_OR_UNION;
			case CENTER_POINT_VALUE: return CENTER_POINT;
			case AP_DARSTELLUNG_VALUE: return AP_DARSTELLUNG;
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
	private GeometryUnionType(int value, String name, String literal) {
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
	
} //GeometryUnionType
