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
 * A representation of the model object '<em><b>Device Definition Charge Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DeviceDefinitionChargeItem#getChargeItemCode <em>Charge Item Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionChargeItem#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionChargeItem#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionChargeItem#getUseContext <em>Use Context</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionChargeItem()
 * @model extendedMetaData="name='DeviceDefinition.ChargeItem' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceDefinitionChargeItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Charge Item Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code or reference for the charge item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item Code</em>' containment reference.
	 * @see #setChargeItemCode(CodeableReference)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionChargeItem_ChargeItemCode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='chargeItemCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getChargeItemCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionChargeItem#getChargeItemCode <em>Charge Item Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item Code</em>' containment reference.
	 * @see #getChargeItemCode()
	 * @generated
	 */
	void setChargeItemCode(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coefficient applicable to the billing code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionChargeItem_Count()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionChargeItem#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Quantity value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific time period in which this charge item applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionChargeItem_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionChargeItem#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context to which this charge item applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getDeviceDefinitionChargeItem_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUseContext();

} // DeviceDefinitionChargeItem
