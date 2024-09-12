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
 * A representation of the model object '<em><b>Device Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceVersion#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceVersion#getComponent <em>Component</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceVersion#getInstallDate <em>Install Date</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceVersion#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getDeviceVersion()
 * @model extendedMetaData="name='Device.Version' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceVersion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the device version, e.g. manufacturer, approved, internal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceVersion_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceVersion#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hardware or software module of the device to which the version applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(Identifier)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceVersion_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getComponent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceVersion#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Identifier value);

	/**
	 * Returns the value of the '<em><b>Install Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the version was installed on the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Install Date</em>' containment reference.
	 * @see #setInstallDate(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceVersion_InstallDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='installDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getInstallDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceVersion#getInstallDate <em>Install Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Date</em>' containment reference.
	 * @see #getInstallDate()
	 * @generated
	 */
	void setInstallDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceVersion_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceVersion#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.hl7.fhir.String value);

} // DeviceVersion
