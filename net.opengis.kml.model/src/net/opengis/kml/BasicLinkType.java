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
 * A representation of the model object '<em><b>Basic Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.BasicLinkType#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.kml.BasicLinkType#getBasicLinkSimpleExtensionGroupGroup <em>Basic Link Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.BasicLinkType#getBasicLinkSimpleExtensionGroup <em>Basic Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.BasicLinkType#getBasicLinkObjectExtensionGroupGroup <em>Basic Link Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.BasicLinkType#getBasicLinkObjectExtensionGroup <em>Basic Link Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getBasicLinkType()
 * @model extendedMetaData="name='BasicLinkType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BasicLinkType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not anyURI due to $[x] substitution in
	 *       PhotoOverlay
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see net.opengis.kml.KMLPackage#getBasicLinkType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link net.opengis.kml.BasicLinkType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Basic Link Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Link Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBasicLinkType_BasicLinkSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BasicLinkSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBasicLinkSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Basic Link Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Link Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBasicLinkType_BasicLinkSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BasicLinkSimpleExtensionGroup' namespace='##targetNamespace' group='BasicLinkSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getBasicLinkSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Basic Link Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Link Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBasicLinkType_BasicLinkObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BasicLinkObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBasicLinkObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Basic Link Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Link Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getBasicLinkType_BasicLinkObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BasicLinkObjectExtensionGroup' namespace='##targetNamespace' group='BasicLinkObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getBasicLinkObjectExtensionGroup();

} // BasicLinkType
