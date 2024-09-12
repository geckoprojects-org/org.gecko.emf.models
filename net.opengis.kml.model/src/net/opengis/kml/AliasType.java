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
 * A representation of the model object '<em><b>Alias Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AliasType#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link net.opengis.kml.AliasType#getSourceHref <em>Source Href</em>}</li>
 *   <li>{@link net.opengis.kml.AliasType#getAliasSimpleExtensionGroupGroup <em>Alias Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AliasType#getAliasSimpleExtensionGroup <em>Alias Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AliasType#getAliasObjectExtensionGroupGroup <em>Alias Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AliasType#getAliasObjectExtensionGroup <em>Alias Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAliasType()
 * @model extendedMetaData="name='AliasType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AliasType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Href</em>' attribute.
	 * @see #setTargetHref(String)
	 * @see net.opengis.kml.KMLPackage#getAliasType_TargetHref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='targetHref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetHref();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AliasType#getTargetHref <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Href</em>' attribute.
	 * @see #getTargetHref()
	 * @generated
	 */
	void setTargetHref(String value);

	/**
	 * Returns the value of the '<em><b>Source Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Href</em>' attribute.
	 * @see #setSourceHref(String)
	 * @see net.opengis.kml.KMLPackage#getAliasType_SourceHref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='sourceHref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceHref();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AliasType#getSourceHref <em>Source Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Href</em>' attribute.
	 * @see #getSourceHref()
	 * @generated
	 */
	void setSourceHref(String value);

	/**
	 * Returns the value of the '<em><b>Alias Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAliasType_AliasSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AliasSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAliasSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Alias Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAliasType_AliasSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AliasSimpleExtensionGroup' namespace='##targetNamespace' group='AliasSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAliasSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Alias Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAliasType_AliasObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AliasObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAliasObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Alias Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAliasType_AliasObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AliasObjectExtensionGroup' namespace='##targetNamespace' group='AliasObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAliasObjectExtensionGroup();

} // AliasType
