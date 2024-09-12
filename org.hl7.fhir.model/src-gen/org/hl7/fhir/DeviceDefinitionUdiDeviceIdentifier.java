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
 * A representation of the model object '<em><b>Device Definition Udi Device Identifier</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getMarketDistribution <em>Market Distribution</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionUdiDeviceIdentifier()
 * @model extendedMetaData="name='DeviceDefinition.UdiDeviceIdentifier' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceDefinitionUdiDeviceIdentifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Device Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier that is to be associated with every Device that references this DeviceDefintiion for the issuer and jurisdiction provided in the DeviceDefinition.udiDeviceIdentifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Identifier</em>' containment reference.
	 * @see #setDeviceIdentifier(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionUdiDeviceIdentifier_DeviceIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDeviceIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getDeviceIdentifier <em>Device Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Identifier</em>' containment reference.
	 * @see #getDeviceIdentifier()
	 * @generated
	 */
	void setDeviceIdentifier(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that assigns the identifier algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionUdiDeviceIdentifier_Issuer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='issuer' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getIssuer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(Uri value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The jurisdiction to which the deviceIdentifier applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionUdiDeviceIdentifier_Jurisdiction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getJurisdiction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(Uri value);

	/**
	 * Returns the value of the '<em><b>Market Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionMarketDistribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates where and when the device is available on the market.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Market Distribution</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionUdiDeviceIdentifier_MarketDistribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='marketDistribution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionMarketDistribution> getMarketDistribution();

} // DeviceDefinitionUdiDeviceIdentifier
