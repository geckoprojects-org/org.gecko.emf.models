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
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Request Order Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ServiceRequestOrderDetail#getParameterFocus <em>Parameter Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.ServiceRequestOrderDetail#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getServiceRequestOrderDetail()
 * @model extendedMetaData="name='ServiceRequest.OrderDetail' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceRequestOrderDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Parameter Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the context of the order details by reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Focus</em>' containment reference.
	 * @see #setParameterFocus(CodeableReference)
	 * @see org.hl7.fhir.FHIRPackage#getServiceRequestOrderDetail_ParameterFocus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterFocus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getParameterFocus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ServiceRequestOrderDetail#getParameterFocus <em>Parameter Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Focus</em>' containment reference.
	 * @see #getParameterFocus()
	 * @generated
	 */
	void setParameterFocus(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ServiceRequestParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter details for the service being requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getServiceRequestOrderDetail_Parameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceRequestParameter> getParameter();

} // ServiceRequestOrderDetail
