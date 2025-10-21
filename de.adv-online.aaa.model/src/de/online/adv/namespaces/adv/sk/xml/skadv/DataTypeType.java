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
 * A representation of the literals of the enumeration '<em><b>Data Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Aufzählungstyp für grobe Datentypen.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDataTypeType()
 * @model extendedMetaData="name='DataTypeType'"
 * @generated
 */
@ProviderType
public enum DataTypeType implements Enumerator {
	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisch, Werte sind "true" oder "false".
	 * <!-- end-model-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(0, "boolean", "boolean"),

	/**
	 * The '<em><b>Numeric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerische Werte, ganzzahlig oder mit Dezimalpunkt.
	 * <!-- end-model-doc -->
	 * @see #NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC(1, "numeric", "numeric"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Texte
	 * <!-- end-model-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(2, "string", "string"),

	/**
	 * The '<em><b>Geometry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geometrie. Punkt-, Linien- und Flächengeometrie wird nicht unterschieden.
	 * <!-- end-model-doc -->
	 * @see #GEOMETRY_VALUE
	 * @generated
	 * @ordered
	 */
	GEOMETRY(3, "geometry", "geometry"),

	/**
	 * The '<em><b>Model Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inhalte des angenommenen AAA-Datenbestands in Form eines GML-Infosets. 
	 * 
	 * Zu dessen Erläuterung siehe die Dokumentation der Klasse Property.
	 * <!-- end-model-doc -->
	 * @see #MODEL_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_ITEM(4, "modelItem", "modelItem"),

	/**
	 * The '<em><b>Void</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fehlender Typ. 
	 * 
	 * Eingesetzt wird "void" nur als Typangabe für die leere Sequenz.
	 * <!-- end-model-doc -->
	 * @see #VOID_VALUE
	 * @generated
	 * @ordered
	 */
	VOID(5, "void", "void");

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisch, Werte sind "true" oder "false".
	 * <!-- end-model-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 0;

	/**
	 * The '<em><b>Numeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerische Werte, ganzzahlig oder mit Dezimalpunkt.
	 * <!-- end-model-doc -->
	 * @see #NUMERIC
	 * @model name="numeric"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_VALUE = 1;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Texte
	 * <!-- end-model-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 2;

	/**
	 * The '<em><b>Geometry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geometrie. Punkt-, Linien- und Flächengeometrie wird nicht unterschieden.
	 * <!-- end-model-doc -->
	 * @see #GEOMETRY
	 * @model name="geometry"
	 * @generated
	 * @ordered
	 */
	public static final int GEOMETRY_VALUE = 3;

	/**
	 * The '<em><b>Model Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inhalte des angenommenen AAA-Datenbestands in Form eines GML-Infosets. 
	 * 
	 * Zu dessen Erläuterung siehe die Dokumentation der Klasse Property.
	 * <!-- end-model-doc -->
	 * @see #MODEL_ITEM
	 * @model name="modelItem"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_ITEM_VALUE = 4;

	/**
	 * The '<em><b>Void</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fehlender Typ. 
	 * 
	 * Eingesetzt wird "void" nur als Typangabe für die leere Sequenz.
	 * <!-- end-model-doc -->
	 * @see #VOID
	 * @model name="void"
	 * @generated
	 * @ordered
	 */
	public static final int VOID_VALUE = 5;

	/**
	 * An array of all the '<em><b>Data Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataTypeType[] VALUES_ARRAY =
		new DataTypeType[] {
			BOOLEAN,
			NUMERIC,
			STRING,
			GEOMETRY,
			MODEL_ITEM,
			VOID,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeType get(int value) {
		switch (value) {
			case BOOLEAN_VALUE: return BOOLEAN;
			case NUMERIC_VALUE: return NUMERIC;
			case STRING_VALUE: return STRING;
			case GEOMETRY_VALUE: return GEOMETRY;
			case MODEL_ITEM_VALUE: return MODEL_ITEM;
			case VOID_VALUE: return VOID;
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
	private DataTypeType(int value, String name, String literal) {
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
	
} //DataTypeType
