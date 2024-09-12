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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kml Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.KmlType#getNetworkLinkControl <em>Network Link Control</em>}</li>
 *   <li>{@link net.opengis.kml.KmlType#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.KmlType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.kml.KmlType#getKmlSimpleExtensionGroupGroup <em>Kml Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.KmlType#getKmlSimpleExtensionGroup <em>Kml Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.KmlType#getKmlObjectExtensionGroupGroup <em>Kml Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.KmlType#getKmlObjectExtensionGroup <em>Kml Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.KmlType#getHint <em>Hint</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getKmlType()
 * @model extendedMetaData="name='KmlType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KmlType extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Link Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Control</em>' containment reference.
	 * @see #setNetworkLinkControl(NetworkLinkControlType)
	 * @see net.opengis.kml.KMLPackage#getKmlType_NetworkLinkControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkControl' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkLinkControlType getNetworkLinkControl();

	/**
	 * Sets the value of the '{@link net.opengis.kml.KmlType#getNetworkLinkControl <em>Network Link Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Link Control</em>' containment reference.
	 * @see #getNetworkLinkControl()
	 * @generated
	 */
	void setNetworkLinkControl(NetworkLinkControlType value);

	/**
	 * Returns the value of the '<em><b>Abstract Feature Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getKmlType_AbstractFeatureGroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractFeatureGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractFeatureGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getKmlType_AbstractFeatureGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureGroup' namespace='##targetNamespace' group='AbstractFeatureGroup:group'"
	 * @generated
	 */
	AbstractFeatureType getAbstractFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Kml Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kml Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getKmlType_KmlSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='KmlSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getKmlSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Kml Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kml Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getKmlType_KmlSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KmlSimpleExtensionGroup' namespace='##targetNamespace' group='KmlSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getKmlSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Kml Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kml Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getKmlType_KmlObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='KmlObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getKmlObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Kml Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kml Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getKmlType_KmlObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KmlObjectExtensionGroup' namespace='##targetNamespace' group='KmlObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getKmlObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see net.opengis.kml.KMLPackage#getKmlType_Hint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hint'"
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link net.opengis.kml.KmlType#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

} // KmlType
