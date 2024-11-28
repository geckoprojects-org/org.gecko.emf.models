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
package org.emau.icmvc.ganimed.ttp.cm2.config;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistic Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculateDocumentDetails <em>Calculate Document Details</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculatePolicyDetails <em>Calculate Policy Details</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getStatisticConfig()
 * @model extendedMetaData="name='StatisticConfig' kind='empty'"
 * @generated
 */
@ProviderType
public interface StatisticConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculate Document Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculate Document Details</em>' attribute.
	 * @see #isSetCalculateDocumentDetails()
	 * @see #unsetCalculateDocumentDetails()
	 * @see #setCalculateDocumentDetails(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getStatisticConfig_CalculateDocumentDetails()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='calculate-document-details'"
	 * @generated
	 */
	boolean isCalculateDocumentDetails();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculateDocumentDetails <em>Calculate Document Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculate Document Details</em>' attribute.
	 * @see #isSetCalculateDocumentDetails()
	 * @see #unsetCalculateDocumentDetails()
	 * @see #isCalculateDocumentDetails()
	 * @generated
	 */
	void setCalculateDocumentDetails(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculateDocumentDetails <em>Calculate Document Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalculateDocumentDetails()
	 * @see #isCalculateDocumentDetails()
	 * @see #setCalculateDocumentDetails(boolean)
	 * @generated
	 */
	void unsetCalculateDocumentDetails();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculateDocumentDetails <em>Calculate Document Details</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calculate Document Details</em>' attribute is set.
	 * @see #unsetCalculateDocumentDetails()
	 * @see #isCalculateDocumentDetails()
	 * @see #setCalculateDocumentDetails(boolean)
	 * @generated
	 */
	boolean isSetCalculateDocumentDetails();

	/**
	 * Returns the value of the '<em><b>Calculate Policy Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculate Policy Details</em>' attribute.
	 * @see #isSetCalculatePolicyDetails()
	 * @see #unsetCalculatePolicyDetails()
	 * @see #setCalculatePolicyDetails(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getStatisticConfig_CalculatePolicyDetails()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='calculate-policy-details'"
	 * @generated
	 */
	boolean isCalculatePolicyDetails();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculatePolicyDetails <em>Calculate Policy Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculate Policy Details</em>' attribute.
	 * @see #isSetCalculatePolicyDetails()
	 * @see #unsetCalculatePolicyDetails()
	 * @see #isCalculatePolicyDetails()
	 * @generated
	 */
	void setCalculatePolicyDetails(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculatePolicyDetails <em>Calculate Policy Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalculatePolicyDetails()
	 * @see #isCalculatePolicyDetails()
	 * @see #setCalculatePolicyDetails(boolean)
	 * @generated
	 */
	void unsetCalculatePolicyDetails();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculatePolicyDetails <em>Calculate Policy Details</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calculate Policy Details</em>' attribute is set.
	 * @see #unsetCalculatePolicyDetails()
	 * @see #isCalculatePolicyDetails()
	 * @see #setCalculatePolicyDetails(boolean)
	 * @generated
	 */
	boolean isSetCalculatePolicyDetails();

} // StatisticConfig
