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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Distributor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the distributor
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDDistributorType#getDistributorContact <em>Distributor Contact</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDistributorType#getDistributionOrderProcess <em>Distribution Order Process</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDistributorType#getDistributorFormat <em>Distributor Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDistributorType#getDistributorTransferOptions <em>Distributor Transfer Options</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDDistributorType()
 * @model extendedMetaData="name='MD_Distributor_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDDistributorType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Distributor Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributor Contact</em>' containment reference.
	 * @see #setDistributorContact(CIResponsiblePartyPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDistributorType_DistributorContact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='distributorContact' namespace='##targetNamespace'"
	 * @generated
	 */
	CIResponsiblePartyPropertyType getDistributorContact();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDDistributorType#getDistributorContact <em>Distributor Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distributor Contact</em>' containment reference.
	 * @see #getDistributorContact()
	 * @generated
	 */
	void setDistributorContact(CIResponsiblePartyPropertyType value);

	/**
	 * Returns the value of the '<em><b>Distribution Order Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDStandardOrderProcessPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Order Process</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDistributorType_DistributionOrderProcess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributionOrderProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDStandardOrderProcessPropertyType> getDistributionOrderProcess();

	/**
	 * Returns the value of the '<em><b>Distributor Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDFormatPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributor Format</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDistributorType_DistributorFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributorFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDFormatPropertyType> getDistributorFormat();

	/**
	 * Returns the value of the '<em><b>Distributor Transfer Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDDigitalTransferOptionsPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributor Transfer Options</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDistributorType_DistributorTransferOptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributorTransferOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDDigitalTransferOptionsPropertyType> getDistributorTransferOptions();

} // MDDistributorType
