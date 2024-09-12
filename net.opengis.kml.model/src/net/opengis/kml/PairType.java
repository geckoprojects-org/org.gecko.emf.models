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
 * A representation of the model object '<em><b>Pair Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.PairType#getKey <em>Key</em>}</li>
 *   <li>{@link net.opengis.kml.PairType#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link net.opengis.kml.PairType#getAbstractStyleSelectorGroupGroup <em>Abstract Style Selector Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PairType#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}</li>
 *   <li>{@link net.opengis.kml.PairType#getPairSimpleExtensionGroupGroup <em>Pair Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PairType#getPairSimpleExtensionGroup <em>Pair Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.PairType#getPairObjectExtensionGroupGroup <em>Pair Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PairType#getPairObjectExtensionGroup <em>Pair Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getPairType()
 * @model extendedMetaData="name='PairType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PairType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.StyleStateEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see net.opengis.kml.StyleStateEnumType
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(StyleStateEnumType)
	 * @see net.opengis.kml.KMLPackage#getPairType_Key()
	 * @model default="normal" unsettable="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleStateEnumType getKey();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PairType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see net.opengis.kml.StyleStateEnumType
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	void setKey(StyleStateEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.PairType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(StyleStateEnumType)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.PairType#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(StyleStateEnumType)
	 * @generated
	 */
	boolean isSetKey();

	/**
	 * Returns the value of the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Url</em>' attribute.
	 * @see #setStyleUrl(String)
	 * @see net.opengis.kml.KMLPackage#getPairType_StyleUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='styleUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleUrl();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PairType#getStyleUrl <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Url</em>' attribute.
	 * @see #getStyleUrl()
	 * @generated
	 */
	void setStyleUrl(String value);

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPairType_AbstractStyleSelectorGroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractStyleSelectorGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractStyleSelectorGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getPairType_AbstractStyleSelectorGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractStyleSelectorGroup' namespace='##targetNamespace' group='AbstractStyleSelectorGroup:group'"
	 * @generated
	 */
	AbstractStyleSelectorType getAbstractStyleSelectorGroup();

	/**
	 * Returns the value of the '<em><b>Pair Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPairType_PairSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PairSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPairSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Pair Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPairType_PairSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PairSimpleExtensionGroup' namespace='##targetNamespace' group='PairSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getPairSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Pair Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPairType_PairObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PairObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPairObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Pair Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getPairType_PairObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PairObjectExtensionGroup' namespace='##targetNamespace' group='PairObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getPairObjectExtensionGroup();

} // PairType
