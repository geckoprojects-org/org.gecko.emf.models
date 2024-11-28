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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ConfigPackage.eNS_URI, genModel = "/model/gicsService.genmodel", genModelSourceLocations = {"model/gicsService.genmodel","org.emau.icmvc.ganimed.ttp.cm2/model/gicsService.genmodel"}, ecore="/model/config.ecore", ecoreSourceLocations="/model/config.ecore")
public interface ConfigPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ttp.ganimed.icmvc.emau.org/cm2/config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ApplicationConfigImpl <em>Application Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ApplicationConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getApplicationConfig()
	 * @generated
	 */
	int APPLICATION_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Template Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG__TEMPLATE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Chromedriver Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG__CHROMEDRIVER_PATH = 1;

	/**
	 * The feature id for the '<em><b>Enable Chrome Pdf Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT = 2;

	/**
	 * The number of structural features of the '<em>Application Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Application Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl <em>Check Consent Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getCheckConsentConfig()
	 * @generated
	 */
	int CHECK_CONSENT_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Id Matching Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ignore Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSENT_CONFIG__REQUEST_DATE = 2;

	/**
	 * The feature id for the '<em><b>Unknown State Is Considered As Decline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE = 3;

	/**
	 * The feature id for the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSENT_CONFIG__USE_ALIASES = 4;

	/**
	 * The feature id for the '<em><b>Use Historical Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA = 5;

	/**
	 * The number of structural features of the '<em>Check Consent Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSENT_CONFIG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Check Consent Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSENT_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl <em>Domain Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getDomainConfig()
	 * @generated
	 */
	int DOMAIN_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Quality Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONFIG__QUALITY_CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONFIG__STATISTIC = 1;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONFIG__POLICIES = 2;

	/**
	 * The feature id for the '<em><b>Scans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONFIG__SCANS = 3;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONFIG__NOTIFICATIONS = 4;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONFIG__APPLICATION = 5;

	/**
	 * The number of structural features of the '<em>Domain Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONFIG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Domain Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.EntryTypeImpl <em>Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.EntryTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.FilterTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.NotificationsConfigImpl <em>Notifications Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.NotificationsConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getNotificationsConfig()
	 * @generated
	 */
	int NOTIFICATIONS_CONFIG = 5;

	/**
	 * The feature id for the '<em><b>Send From Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_CONFIG__SEND_FROM_WEB = 0;

	/**
	 * The number of structural features of the '<em>Notifications Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Notifications Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl <em>Pagination Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getPaginationConfig()
	 * @generated
	 */
	int PAGINATION_CONFIG = 6;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__END_DATE = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Filter Fields Are Treated As Conjunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Filter Is Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE = 3;

	/**
	 * The feature id for the '<em><b>First Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__FIRST_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__PAGE_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Sort Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__SORT_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Sort Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__SORT_IS_ASCENDING = 7;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__START_DATE = 8;

	/**
	 * The feature id for the '<em><b>Template Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__TEMPLATE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG__USE_ALIASES = 10;

	/**
	 * The number of structural features of the '<em>Pagination Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Pagination Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.DocumentRootImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Domain Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Domain Config1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN_CONFIG1 = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PoliciesConfigImpl <em>Policies Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.PoliciesConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getPoliciesConfig()
	 * @generated
	 */
	int POLICIES_CONFIG = 8;

	/**
	 * The feature id for the '<em><b>Permanent Revoke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_CONFIG__PERMANENT_REVOKE = 0;

	/**
	 * The feature id for the '<em><b>Take Highest Version Instead Of Newest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST = 1;

	/**
	 * The feature id for the '<em><b>Take Most Specific Validity Instead Of Shortest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST = 2;

	/**
	 * The number of structural features of the '<em>Policies Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Policies Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.QualityControlConfigImpl <em>Quality Control Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.QualityControlConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getQualityControlConfig()
	 * @generated
	 */
	int QUALITY_CONTROL_CONFIG = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONTROL_CONFIG__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Problem Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONTROL_CONFIG__PROBLEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Problem Type Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Default Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONTROL_CONFIG__DEFAULT_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Quality Control Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONTROL_CONFIG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Quality Control Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONTROL_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ScansConfigImpl <em>Scans Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ScansConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getScansConfig()
	 * @generated
	 */
	int SCANS_CONFIG = 10;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_CONFIG__MANDATORY = 0;

	/**
	 * The feature id for the '<em><b>Size Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_CONFIG__SIZE_LIMIT = 1;

	/**
	 * The number of structural features of the '<em>Scans Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scans Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.StatisticConfigImpl <em>Statistic Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.StatisticConfigImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getStatisticConfig()
	 * @generated
	 */
	int STATISTIC_CONFIG = 11;

	/**
	 * The feature id for the '<em><b>Calculate Document Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Calculate Policy Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Statistic Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statistic Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField <em>Consent Field</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getConsentField()
	 * @generated
	 */
	int CONSENT_FIELD = 12;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType <em>Id Matching Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getIdMatchingType()
	 * @generated
	 */
	int ID_MATCHING_TYPE = 13;

	/**
	 * The meta object id for the '<em>Consent Field Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getConsentFieldObject()
	 * @generated
	 */
	int CONSENT_FIELD_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Id Matching Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getIdMatchingTypeObject()
	 * @generated
	 */
	int ID_MATCHING_TYPE_OBJECT = 15;


	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig <em>Application Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig
	 * @generated
	 */
	EClass getApplicationConfig();

	/**
	 * Returns the meta object for the attribute list '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#getTemplateTypes <em>Template Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Template Types</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#getTemplateTypes()
	 * @see #getApplicationConfig()
	 * @generated
	 */
	EAttribute getApplicationConfig_TemplateTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#getChromedriverPath <em>Chromedriver Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chromedriver Path</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#getChromedriverPath()
	 * @see #getApplicationConfig()
	 * @generated
	 */
	EAttribute getApplicationConfig_ChromedriverPath();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#isEnableChromePdfExport <em>Enable Chrome Pdf Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Chrome Pdf Export</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig#isEnableChromePdfExport()
	 * @see #getApplicationConfig()
	 * @generated
	 */
	EAttribute getApplicationConfig_EnableChromePdfExport();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig <em>Check Consent Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Consent Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig
	 * @generated
	 */
	EClass getCheckConsentConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getIdMatchingType <em>Id Matching Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Matching Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getIdMatchingType()
	 * @see #getCheckConsentConfig()
	 * @generated
	 */
	EAttribute getCheckConsentConfig_IdMatchingType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isIgnoreVersionNumber <em>Ignore Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Version Number</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isIgnoreVersionNumber()
	 * @see #getCheckConsentConfig()
	 * @generated
	 */
	EAttribute getCheckConsentConfig_IgnoreVersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getRequestDate <em>Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getRequestDate()
	 * @see #getCheckConsentConfig()
	 * @generated
	 */
	EAttribute getCheckConsentConfig_RequestDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUnknownStateIsConsideredAsDecline <em>Unknown State Is Considered As Decline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown State Is Considered As Decline</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUnknownStateIsConsideredAsDecline()
	 * @see #getCheckConsentConfig()
	 * @generated
	 */
	EAttribute getCheckConsentConfig_UnknownStateIsConsideredAsDecline();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseAliases <em>Use Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseAliases()
	 * @see #getCheckConsentConfig()
	 * @generated
	 */
	EAttribute getCheckConsentConfig_UseAliases();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseHistoricalData <em>Use Historical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Historical Data</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseHistoricalData()
	 * @see #getCheckConsentConfig()
	 * @generated
	 */
	EAttribute getCheckConsentConfig_UseHistoricalData();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig <em>Domain Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig
	 * @generated
	 */
	EClass getDomainConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getQualityControl <em>Quality Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quality Control</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getQualityControl()
	 * @see #getDomainConfig()
	 * @generated
	 */
	EReference getDomainConfig_QualityControl();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistic</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getStatistic()
	 * @see #getDomainConfig()
	 * @generated
	 */
	EReference getDomainConfig_Statistic();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getPolicies()
	 * @see #getDomainConfig()
	 * @generated
	 */
	EReference getDomainConfig_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getScans <em>Scans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scans</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getScans()
	 * @see #getDomainConfig()
	 * @generated
	 */
	EReference getDomainConfig_Scans();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notifications</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getNotifications()
	 * @see #getDomainConfig()
	 * @generated
	 */
	EReference getDomainConfig_Notifications();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig#getApplication()
	 * @see #getDomainConfig()
	 * @generated
	 */
	EReference getDomainConfig_Application();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.EntryType
	 * @generated
	 */
	EClass getEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getKey()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getValue()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Value();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.config.FilterType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.FilterType#getEntry()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Entry();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig <em>Notifications Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifications Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig
	 * @generated
	 */
	EClass getNotificationsConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig#isSendFromWeb <em>Send From Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send From Web</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig#isSendFromWeb()
	 * @see #getNotificationsConfig()
	 * @generated
	 */
	EAttribute getNotificationsConfig_SendFromWeb();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig <em>Pagination Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig
	 * @generated
	 */
	EClass getPaginationConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getEndDate()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_EndDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFilter()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EReference getPaginationConfig_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterFieldsAreTreatedAsConjunction <em>Filter Fields Are Treated As Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Fields Are Treated As Conjunction</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterFieldsAreTreatedAsConjunction()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_FilterFieldsAreTreatedAsConjunction();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterIsCaseSensitive <em>Filter Is Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Is Case Sensitive</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isFilterIsCaseSensitive()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_FilterIsCaseSensitive();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFirstEntry <em>First Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Entry</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getFirstEntry()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_FirstEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getPageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Size</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getPageSize()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_PageSize();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getSortField <em>Sort Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Field</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getSortField()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_SortField();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isSortIsAscending <em>Sort Is Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Is Ascending</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isSortIsAscending()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_SortIsAscending();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getStartDate()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getTemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#getTemplateType()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_TemplateType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isUseAliases <em>Use Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig#isUseAliases()
	 * @see #getPaginationConfig()
	 * @generated
	 */
	EAttribute getPaginationConfig_UseAliases();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getDomainConfig <em>Domain Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getDomainConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DomainConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getDomainConfig1 <em>Domain Config1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Config1</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot#getDomainConfig1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DomainConfig1();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig <em>Policies Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policies Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig
	 * @generated
	 */
	EClass getPoliciesConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isPermanentRevoke <em>Permanent Revoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permanent Revoke</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isPermanentRevoke()
	 * @see #getPoliciesConfig()
	 * @generated
	 */
	EAttribute getPoliciesConfig_PermanentRevoke();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeHighestVersionInsteadOfNewest <em>Take Highest Version Instead Of Newest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Take Highest Version Instead Of Newest</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeHighestVersionInsteadOfNewest()
	 * @see #getPoliciesConfig()
	 * @generated
	 */
	EAttribute getPoliciesConfig_TakeHighestVersionInsteadOfNewest();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeMostSpecificValidityInsteadOfShortest <em>Take Most Specific Validity Instead Of Shortest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Take Most Specific Validity Instead Of Shortest</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig#isTakeMostSpecificValidityInsteadOfShortest()
	 * @see #getPoliciesConfig()
	 * @generated
	 */
	EAttribute getPoliciesConfig_TakeMostSpecificValidityInsteadOfShortest();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig <em>Quality Control Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Control Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig
	 * @generated
	 */
	EClass getQualityControlConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getType()
	 * @see #getQualityControlConfig()
	 * @generated
	 */
	EReference getQualityControlConfig_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getProblemType <em>Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problem Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getProblemType()
	 * @see #getQualityControlConfig()
	 * @generated
	 */
	EReference getQualityControlConfig_ProblemType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getProblemTypeAction <em>Problem Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problem Type Action</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getProblemTypeAction()
	 * @see #getQualityControlConfig()
	 * @generated
	 */
	EReference getQualityControlConfig_ProblemTypeAction();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getDefaultType <em>Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getDefaultType()
	 * @see #getQualityControlConfig()
	 * @generated
	 */
	EAttribute getQualityControlConfig_DefaultType();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig <em>Scans Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scans Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig
	 * @generated
	 */
	EClass getScansConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#isMandatory()
	 * @see #getScansConfig()
	 * @generated
	 */
	EAttribute getScansConfig_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#getSizeLimit <em>Size Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Limit</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig#getSizeLimit()
	 * @see #getScansConfig()
	 * @generated
	 */
	EAttribute getScansConfig_SizeLimit();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig <em>Statistic Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig
	 * @generated
	 */
	EClass getStatisticConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculateDocumentDetails <em>Calculate Document Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculate Document Details</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculateDocumentDetails()
	 * @see #getStatisticConfig()
	 * @generated
	 */
	EAttribute getStatisticConfig_CalculateDocumentDetails();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculatePolicyDetails <em>Calculate Policy Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculate Policy Details</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig#isCalculatePolicyDetails()
	 * @see #getStatisticConfig()
	 * @generated
	 */
	EAttribute getStatisticConfig_CalculatePolicyDetails();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField <em>Consent Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Field</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
	 * @generated
	 */
	EEnum getConsentField();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType <em>Id Matching Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Id Matching Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType
	 * @generated
	 */
	EEnum getIdMatchingType();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField <em>Consent Field Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Consent Field Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField"
	 *        extendedMetaData="name='consentField:Object' baseType='consentField'"
	 * @generated
	 */
	EDataType getConsentFieldObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType <em>Id Matching Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Matching Type Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType"
	 *        extendedMetaData="name='idMatchingType:Object' baseType='idMatchingType'"
	 * @generated
	 */
	EDataType getIdMatchingTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ApplicationConfigImpl <em>Application Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ApplicationConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getApplicationConfig()
		 * @generated
		 */
		EClass APPLICATION_CONFIG = eINSTANCE.getApplicationConfig();

		/**
		 * The meta object literal for the '<em><b>Template Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIG__TEMPLATE_TYPES = eINSTANCE.getApplicationConfig_TemplateTypes();

		/**
		 * The meta object literal for the '<em><b>Chromedriver Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIG__CHROMEDRIVER_PATH = eINSTANCE.getApplicationConfig_ChromedriverPath();

		/**
		 * The meta object literal for the '<em><b>Enable Chrome Pdf Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT = eINSTANCE.getApplicationConfig_EnableChromePdfExport();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl <em>Check Consent Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getCheckConsentConfig()
		 * @generated
		 */
		EClass CHECK_CONSENT_CONFIG = eINSTANCE.getCheckConsentConfig();

		/**
		 * The meta object literal for the '<em><b>Id Matching Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE = eINSTANCE.getCheckConsentConfig_IdMatchingType();

		/**
		 * The meta object literal for the '<em><b>Ignore Version Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER = eINSTANCE.getCheckConsentConfig_IgnoreVersionNumber();

		/**
		 * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSENT_CONFIG__REQUEST_DATE = eINSTANCE.getCheckConsentConfig_RequestDate();

		/**
		 * The meta object literal for the '<em><b>Unknown State Is Considered As Decline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE = eINSTANCE.getCheckConsentConfig_UnknownStateIsConsideredAsDecline();

		/**
		 * The meta object literal for the '<em><b>Use Aliases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSENT_CONFIG__USE_ALIASES = eINSTANCE.getCheckConsentConfig_UseAliases();

		/**
		 * The meta object literal for the '<em><b>Use Historical Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA = eINSTANCE.getCheckConsentConfig_UseHistoricalData();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl <em>Domain Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.DomainConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getDomainConfig()
		 * @generated
		 */
		EClass DOMAIN_CONFIG = eINSTANCE.getDomainConfig();

		/**
		 * The meta object literal for the '<em><b>Quality Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONFIG__QUALITY_CONTROL = eINSTANCE.getDomainConfig_QualityControl();

		/**
		 * The meta object literal for the '<em><b>Statistic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONFIG__STATISTIC = eINSTANCE.getDomainConfig_Statistic();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONFIG__POLICIES = eINSTANCE.getDomainConfig_Policies();

		/**
		 * The meta object literal for the '<em><b>Scans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONFIG__SCANS = eINSTANCE.getDomainConfig_Scans();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONFIG__NOTIFICATIONS = eINSTANCE.getDomainConfig_Notifications();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONFIG__APPLICATION = eINSTANCE.getDomainConfig_Application();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.EntryTypeImpl <em>Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.EntryTypeImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getEntryType()
		 * @generated
		 */
		EClass ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__KEY = eINSTANCE.getEntryType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__VALUE = eINSTANCE.getEntryType_Value();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.FilterTypeImpl <em>Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.FilterTypeImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getFilterType()
		 * @generated
		 */
		EClass FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__ENTRY = eINSTANCE.getFilterType_Entry();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.NotificationsConfigImpl <em>Notifications Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.NotificationsConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getNotificationsConfig()
		 * @generated
		 */
		EClass NOTIFICATIONS_CONFIG = eINSTANCE.getNotificationsConfig();

		/**
		 * The meta object literal for the '<em><b>Send From Web</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATIONS_CONFIG__SEND_FROM_WEB = eINSTANCE.getNotificationsConfig_SendFromWeb();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl <em>Pagination Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.PaginationConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getPaginationConfig()
		 * @generated
		 */
		EClass PAGINATION_CONFIG = eINSTANCE.getPaginationConfig();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__END_DATE = eINSTANCE.getPaginationConfig_EndDate();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINATION_CONFIG__FILTER = eINSTANCE.getPaginationConfig_Filter();

		/**
		 * The meta object literal for the '<em><b>Filter Fields Are Treated As Conjunction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION = eINSTANCE.getPaginationConfig_FilterFieldsAreTreatedAsConjunction();

		/**
		 * The meta object literal for the '<em><b>Filter Is Case Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE = eINSTANCE.getPaginationConfig_FilterIsCaseSensitive();

		/**
		 * The meta object literal for the '<em><b>First Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__FIRST_ENTRY = eINSTANCE.getPaginationConfig_FirstEntry();

		/**
		 * The meta object literal for the '<em><b>Page Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__PAGE_SIZE = eINSTANCE.getPaginationConfig_PageSize();

		/**
		 * The meta object literal for the '<em><b>Sort Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__SORT_FIELD = eINSTANCE.getPaginationConfig_SortField();

		/**
		 * The meta object literal for the '<em><b>Sort Is Ascending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__SORT_IS_ASCENDING = eINSTANCE.getPaginationConfig_SortIsAscending();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__START_DATE = eINSTANCE.getPaginationConfig_StartDate();

		/**
		 * The meta object literal for the '<em><b>Template Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__TEMPLATE_TYPE = eINSTANCE.getPaginationConfig_TemplateType();

		/**
		 * The meta object literal for the '<em><b>Use Aliases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_CONFIG__USE_ALIASES = eINSTANCE.getPaginationConfig_UseAliases();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.DocumentRootImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Domain Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOMAIN_CONFIG = eINSTANCE.getDocumentRoot_DomainConfig();

		/**
		 * The meta object literal for the '<em><b>Domain Config1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOMAIN_CONFIG1 = eINSTANCE.getDocumentRoot_DomainConfig1();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PoliciesConfigImpl <em>Policies Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.PoliciesConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getPoliciesConfig()
		 * @generated
		 */
		EClass POLICIES_CONFIG = eINSTANCE.getPoliciesConfig();

		/**
		 * The meta object literal for the '<em><b>Permanent Revoke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICIES_CONFIG__PERMANENT_REVOKE = eINSTANCE.getPoliciesConfig_PermanentRevoke();

		/**
		 * The meta object literal for the '<em><b>Take Highest Version Instead Of Newest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST = eINSTANCE.getPoliciesConfig_TakeHighestVersionInsteadOfNewest();

		/**
		 * The meta object literal for the '<em><b>Take Most Specific Validity Instead Of Shortest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST = eINSTANCE.getPoliciesConfig_TakeMostSpecificValidityInsteadOfShortest();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.QualityControlConfigImpl <em>Quality Control Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.QualityControlConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getQualityControlConfig()
		 * @generated
		 */
		EClass QUALITY_CONTROL_CONFIG = eINSTANCE.getQualityControlConfig();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CONTROL_CONFIG__TYPE = eINSTANCE.getQualityControlConfig_Type();

		/**
		 * The meta object literal for the '<em><b>Problem Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CONTROL_CONFIG__PROBLEM_TYPE = eINSTANCE.getQualityControlConfig_ProblemType();

		/**
		 * The meta object literal for the '<em><b>Problem Type Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION = eINSTANCE.getQualityControlConfig_ProblemTypeAction();

		/**
		 * The meta object literal for the '<em><b>Default Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_CONTROL_CONFIG__DEFAULT_TYPE = eINSTANCE.getQualityControlConfig_DefaultType();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ScansConfigImpl <em>Scans Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ScansConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getScansConfig()
		 * @generated
		 */
		EClass SCANS_CONFIG = eINSTANCE.getScansConfig();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCANS_CONFIG__MANDATORY = eINSTANCE.getScansConfig_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Size Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCANS_CONFIG__SIZE_LIMIT = eINSTANCE.getScansConfig_SizeLimit();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.StatisticConfigImpl <em>Statistic Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.StatisticConfigImpl
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getStatisticConfig()
		 * @generated
		 */
		EClass STATISTIC_CONFIG = eINSTANCE.getStatisticConfig();

		/**
		 * The meta object literal for the '<em><b>Calculate Document Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS = eINSTANCE.getStatisticConfig_CalculateDocumentDetails();

		/**
		 * The meta object literal for the '<em><b>Calculate Policy Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS = eINSTANCE.getStatisticConfig_CalculatePolicyDetails();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField <em>Consent Field</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getConsentField()
		 * @generated
		 */
		EEnum CONSENT_FIELD = eINSTANCE.getConsentField();

		/**
		 * The meta object literal for the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType <em>Id Matching Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getIdMatchingType()
		 * @generated
		 */
		EEnum ID_MATCHING_TYPE = eINSTANCE.getIdMatchingType();

		/**
		 * The meta object literal for the '<em>Consent Field Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getConsentFieldObject()
		 * @generated
		 */
		EDataType CONSENT_FIELD_OBJECT = eINSTANCE.getConsentFieldObject();

		/**
		 * The meta object literal for the '<em>Id Matching Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType
		 * @see org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl#getIdMatchingTypeObject()
		 * @generated
		 */
		EDataType ID_MATCHING_TYPE_OBJECT = eINSTANCE.getIdMatchingTypeObject();

	}

} //ConfigPackage
