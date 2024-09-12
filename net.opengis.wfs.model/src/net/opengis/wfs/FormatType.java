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
package net.opengis.wfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Format Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.wfs.WFSPackage#getFormatType()
 * @model extendedMetaData="name='format_._type'"
 * @generated
 */
@ProviderType
public enum FormatType implements Enumerator {
	/**
	 * The '<em><b>Text Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_XML(0, "textXml", "text/xml"),

	/**
	 * The '<em><b>Text Html</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_HTML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_HTML(1, "textHtml", "text/html"),

	/**
	 * The '<em><b>Text Sgml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_SGML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_SGML(2, "textSgml", "text/sgml"),

	/**
	 * The '<em><b>Text Plain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_PLAIN(3, "textPlain", "text/plain");

	/**
	 * The '<em><b>Text Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML
	 * @model name="textXml" literal="text/xml"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_XML_VALUE = 0;

	/**
	 * The '<em><b>Text Html</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_HTML
	 * @model name="textHtml" literal="text/html"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_HTML_VALUE = 1;

	/**
	 * The '<em><b>Text Sgml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_SGML
	 * @model name="textSgml" literal="text/sgml"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_SGML_VALUE = 2;

	/**
	 * The '<em><b>Text Plain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN
	 * @model name="textPlain" literal="text/plain"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_PLAIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormatType[] VALUES_ARRAY =
		new FormatType[] {
			TEXT_XML,
			TEXT_HTML,
			TEXT_SGML,
			TEXT_PLAIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatType get(int value) {
		switch (value) {
			case TEXT_XML_VALUE: return TEXT_XML;
			case TEXT_HTML_VALUE: return TEXT_HTML;
			case TEXT_SGML_VALUE: return TEXT_SGML;
			case TEXT_PLAIN_VALUE: return TEXT_PLAIN;
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
	private FormatType(int value, String name, String literal) {
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
	
} //FormatType
