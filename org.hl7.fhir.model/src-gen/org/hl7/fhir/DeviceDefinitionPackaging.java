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
 * A representation of the model object '<em><b>Device Definition Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionPackaging#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionPackaging#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionPackaging#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionPackaging#getDistributor <em>Distributor</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionPackaging#getUdiDeviceIdentifier <em>Udi Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionPackaging#getPackaging <em>Packaging</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionPackaging()
 * @model extendedMetaData="name='DeviceDefinition.Packaging' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceDefinitionPackaging extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier of the packaged medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionPackaging_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionPackaging#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that defines the specific type of packaging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionPackaging_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionPackaging#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of items contained in the package (devices or sub-packages).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionPackaging_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionPackaging#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Distributor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionDistributor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that distributes the packaged device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distributor</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionPackaging_Distributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionDistributor> getDistributor();

	/**
	 * Returns the value of the '<em><b>Udi Device Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique Device Identifier (UDI) Barcode string on the packaging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi Device Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionPackaging_UdiDeviceIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udiDeviceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifier();

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionPackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows packages within packages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionPackaging_Packaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionPackaging> getPackaging();

} // DeviceDefinitionPackaging
