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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontWeight <em>Font Weight</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFontType1()
 * @model extendedMetaData="name='FontType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FontType1 extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name der Schriftart, z.B. "Times".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see #setFontFamily(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFontType1_FontFamily()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='fontFamily' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(String value);

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.FontStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Schriftstil kann die Werte "italic", "normal", "oblique" annehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FontStyleType
	 * @see #isSetFontStyle()
	 * @see #unsetFontStyle()
	 * @see #setFontStyle(FontStyleType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFontType1_FontStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='fontStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	FontStyleType getFontStyle();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FontStyleType
	 * @see #isSetFontStyle()
	 * @see #unsetFontStyle()
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(FontStyleType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(FontStyleType)
	 * @generated
	 */
	void unsetFontStyle();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontStyle <em>Font Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Style</em>' attribute is set.
	 * @see #unsetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(FontStyleType)
	 * @generated
	 */
	boolean isSetFontStyle();

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.FontWeightType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Schriftgewicht kann "normal" oder "bold" sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FontWeightType
	 * @see #isSetFontWeight()
	 * @see #unsetFontWeight()
	 * @see #setFontWeight(FontWeightType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFontType1_FontWeight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='fontWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	FontWeightType getFontWeight();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FontWeightType
	 * @see #isSetFontWeight()
	 * @see #unsetFontWeight()
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(FontWeightType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontWeight()
	 * @see #getFontWeight()
	 * @see #setFontWeight(FontWeightType)
	 * @generated
	 */
	void unsetFontWeight();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1#getFontWeight <em>Font Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Weight</em>' attribute is set.
	 * @see #unsetFontWeight()
	 * @see #getFontWeight()
	 * @see #setFontWeight(FontWeightType)
	 * @generated
	 */
	boolean isSetFontWeight();

} // FontType1
