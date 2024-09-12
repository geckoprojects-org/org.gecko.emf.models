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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Focal Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is or was performed on or for a patient, practitioner, device, organization, or location. For example, this can be a physical intervention on a patient like an operation, or less invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety inspection for a location, organization, or device.  This can be an accreditation procedure on a practitioner for licensing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcedureFocalDevice#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureFocalDevice#getManipulated <em>Manipulated</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getProcedureFocalDevice()
 * @model extendedMetaData="name='Procedure.FocalDevice' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProcedureFocalDevice extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of change that happened to the device during the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getProcedureFocalDevice_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureFocalDevice#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manipulated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device that was manipulated (changed) during the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manipulated</em>' containment reference.
	 * @see #setManipulated(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getProcedureFocalDevice_Manipulated()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manipulated' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManipulated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureFocalDevice#getManipulated <em>Manipulated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manipulated</em>' containment reference.
	 * @see #getManipulated()
	 * @generated
	 */
	void setManipulated(Reference value);

} // ProcedureFocalDevice
