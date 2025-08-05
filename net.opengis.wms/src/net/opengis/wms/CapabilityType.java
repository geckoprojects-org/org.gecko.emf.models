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
 * A representation of the model object '<em><b>Capability Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.CapabilityType#getRequest <em>Request</em>}</li>
 *   <li>{@link net.opengis.wms.CapabilityType#getException <em>Exception</em>}</li>
 *   <li>{@link net.opengis.wms.CapabilityType#getExtendedCapabilitiesGroup <em>Extended Capabilities Group</em>}</li>
 *   <li>{@link net.opengis.wms.CapabilityType#getExtendedCapabilities <em>Extended Capabilities</em>}</li>
 *   <li>{@link net.opengis.wms.CapabilityType#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getCapabilityType()
 * @model extendedMetaData="name='Capability_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CapabilityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Available WMS Operations are listed in a Request element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(RequestType)
	 * @see net.opengis.wms.WMSPackage#getCapabilityType_Request()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Request' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestType getRequest();

	/**
	 * Sets the value of the '{@link net.opengis.wms.CapabilityType#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(RequestType value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An Exception element indicates which error-reporting formats are
	 *         supported.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(ExceptionType)
	 * @see net.opengis.wms.WMSPackage#getCapabilityType_Exception()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Exception' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionType getException();

	/**
	 * Sets the value of the '{@link net.opengis.wms.CapabilityType#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(ExceptionType value);

	/**
	 * Returns the value of the '<em><b>Extended Capabilities Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Individual service providers may use this element to report extended
	 *         capabilities.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Capabilities Group</em>' attribute list.
	 * @see net.opengis.wms.WMSPackage#getCapabilityType_ExtendedCapabilitiesGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_ExtendedCapabilities:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExtendedCapabilitiesGroup();

	/**
	 * Returns the value of the '<em><b>Extended Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Individual service providers may use this element to report extended
	 *         capabilities.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Capabilities</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getCapabilityType_ExtendedCapabilities()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_ExtendedCapabilities' namespace='##targetNamespace' group='_ExtendedCapabilities:group'"
	 * @generated
	 */
	EList<EObject> getExtendedCapabilities();

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Nested list of zero or more map Layers offered by this server.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference.
	 * @see #setLayer(LayerType)
	 * @see net.opengis.wms.WMSPackage#getCapabilityType_Layer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Layer' namespace='##targetNamespace'"
	 * @generated
	 */
	LayerType getLayer();

	/**
	 * Sets the value of the '{@link net.opengis.wms.CapabilityType#getLayer <em>Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' containment reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(LayerType value);

} // CapabilityType
