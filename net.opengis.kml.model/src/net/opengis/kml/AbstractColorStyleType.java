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
package net.opengis.kml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Color Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractColorStyleType#getColor <em>Color</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractColorStyleType#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleSimpleExtensionGroupGroup <em>Abstract Color Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleSimpleExtensionGroup <em>Abstract Color Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleObjectExtensionGroupGroup <em>Abstract Color Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleObjectExtensionGroup <em>Abstract Color Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractColorStyleType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractColorStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractColorStyleType extends AbstractSubStyleType {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getAbstractColorStyleType_Color()
	 * @model default="ffffffff" unsettable="true" dataType="net.opengis.kml.ColorType"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractColorStyleType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #getColor()
	 * @generated
	 */
	void setColor(byte[] value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractColorStyleType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractColorStyleType#getColor <em>Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color</em>' attribute is set.
	 * @see #unsetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	boolean isSetColor();

	/**
	 * Returns the value of the '<em><b>Color Mode</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.ColorModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Mode</em>' attribute.
	 * @see net.opengis.kml.ColorModeEnumType
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #setColorMode(ColorModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getAbstractColorStyleType_ColorMode()
	 * @model default="normal" unsettable="true"
	 *        extendedMetaData="kind='element' name='colorMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorModeEnumType getColorMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractColorStyleType#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Mode</em>' attribute.
	 * @see net.opengis.kml.ColorModeEnumType
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @generated
	 */
	void setColorMode(ColorModeEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractColorStyleType#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorModeEnumType)
	 * @generated
	 */
	void unsetColorMode();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractColorStyleType#getColorMode <em>Color Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color Mode</em>' attribute is set.
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorModeEnumType)
	 * @generated
	 */
	boolean isSetColorMode();

	/**
	 * Returns the value of the '<em><b>Abstract Color Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Color Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractColorStyleType_AbstractColorStyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractColorStyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractColorStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Color Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Color Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractColorStyleType_AbstractColorStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractColorStyleSimpleExtensionGroup' namespace='##targetNamespace' group='AbstractColorStyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractColorStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Color Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Color Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractColorStyleType_AbstractColorStyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractColorStyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractColorStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Color Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Color Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractColorStyleType_AbstractColorStyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractColorStyleObjectExtensionGroup' namespace='##targetNamespace' group='AbstractColorStyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractColorStyleObjectExtensionGroup();

} // AbstractColorStyleType
