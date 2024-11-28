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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage
 * @generated
 */
@ProviderType
public interface ConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigFactory eINSTANCE = org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Config</em>'.
	 * @generated
	 */
	ApplicationConfig createApplicationConfig();

	/**
	 * Returns a new object of class '<em>Check Consent Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Consent Config</em>'.
	 * @generated
	 */
	CheckConsentConfig createCheckConsentConfig();

	/**
	 * Returns a new object of class '<em>Domain Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Config</em>'.
	 * @generated
	 */
	DomainConfig createDomainConfig();

	/**
	 * Returns a new object of class '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Type</em>'.
	 * @generated
	 */
	EntryType createEntryType();

	/**
	 * Returns a new object of class '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Type</em>'.
	 * @generated
	 */
	FilterType createFilterType();

	/**
	 * Returns a new object of class '<em>Notifications Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notifications Config</em>'.
	 * @generated
	 */
	NotificationsConfig createNotificationsConfig();

	/**
	 * Returns a new object of class '<em>Pagination Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pagination Config</em>'.
	 * @generated
	 */
	PaginationConfig createPaginationConfig();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Policies Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policies Config</em>'.
	 * @generated
	 */
	PoliciesConfig createPoliciesConfig();

	/**
	 * Returns a new object of class '<em>Quality Control Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Control Config</em>'.
	 * @generated
	 */
	QualityControlConfig createQualityControlConfig();

	/**
	 * Returns a new object of class '<em>Scans Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scans Config</em>'.
	 * @generated
	 */
	ScansConfig createScansConfig();

	/**
	 * Returns a new object of class '<em>Statistic Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistic Config</em>'.
	 * @generated
	 */
	StatisticConfig createStatisticConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigPackage getConfigPackage();

} //ConfigFactory
