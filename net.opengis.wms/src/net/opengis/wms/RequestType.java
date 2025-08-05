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
package net.opengis.wms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.RequestType#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link net.opengis.wms.RequestType#getGetMap <em>Get Map</em>}</li>
 *   <li>{@link net.opengis.wms.RequestType#getGetFeatureInfo <em>Get Feature Info</em>}</li>
 *   <li>{@link net.opengis.wms.RequestType#getExtendedOperationGroup <em>Extended Operation Group</em>}</li>
 *   <li>{@link net.opengis.wms.RequestType#getExtendedOperation <em>Extended Operation</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getRequestType()
 * @model extendedMetaData="name='Request_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RequestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Capabilities</em>' containment reference.
	 * @see #setGetCapabilities(OperationType)
	 * @see net.opengis.wms.WMSPackage#getRequestType_GetCapabilities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GetCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getGetCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.wms.RequestType#getGetCapabilities <em>Get Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Capabilities</em>' containment reference.
	 * @see #getGetCapabilities()
	 * @generated
	 */
	void setGetCapabilities(OperationType value);

	/**
	 * Returns the value of the '<em><b>Get Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Map</em>' containment reference.
	 * @see #setGetMap(OperationType)
	 * @see net.opengis.wms.WMSPackage#getRequestType_GetMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GetMap' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getGetMap();

	/**
	 * Sets the value of the '{@link net.opengis.wms.RequestType#getGetMap <em>Get Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Map</em>' containment reference.
	 * @see #getGetMap()
	 * @generated
	 */
	void setGetMap(OperationType value);

	/**
	 * Returns the value of the '<em><b>Get Feature Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Feature Info</em>' containment reference.
	 * @see #setGetFeatureInfo(OperationType)
	 * @see net.opengis.wms.WMSPackage#getRequestType_GetFeatureInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GetFeatureInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getGetFeatureInfo();

	/**
	 * Sets the value of the '{@link net.opengis.wms.RequestType#getGetFeatureInfo <em>Get Feature Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Feature Info</em>' containment reference.
	 * @see #getGetFeatureInfo()
	 * @generated
	 */
	void setGetFeatureInfo(OperationType value);

	/**
	 * Returns the value of the '<em><b>Extended Operation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Operation Group</em>' attribute list.
	 * @see net.opengis.wms.WMSPackage#getRequestType_ExtendedOperationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_ExtendedOperation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExtendedOperationGroup();

	/**
	 * Returns the value of the '<em><b>Extended Operation</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Operation</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getRequestType_ExtendedOperation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_ExtendedOperation' namespace='##targetNamespace' group='_ExtendedOperation:group'"
	 * @generated
	 */
	EList<OperationType> getExtendedOperation();

} // RequestType
