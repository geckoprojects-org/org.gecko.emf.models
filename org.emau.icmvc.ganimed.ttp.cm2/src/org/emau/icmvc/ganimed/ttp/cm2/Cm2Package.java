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
package org.emau.icmvc.ganimed.ttp.cm2;


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
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Factory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = Cm2Package.eNS_URI, genModel = "/model/gicsService.genmodel", genModelSourceLocations = {"model/gicsService.genmodel","org.emau.icmvc.ganimed.ttp.cm2/model/gicsService.genmodel"}, ecore="/model/cm2.ecore", ecoreSourceLocations="/model/cm2.ecore")
public interface Cm2Package extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cm2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cm2.ttp.ganimed.icmvc.emau.org/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cm2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cm2Package eINSTANCE = org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AbstractMapImpl <em>Abstract Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AbstractMapImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAbstractMap()
	 * @generated
	 */
	int ABSTRACT_MAP = 0;

	/**
	 * The number of structural features of the '<em>Abstract Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddAliasImpl <em>Add Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddAliasImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddAlias()
	 * @generated
	 */
	int ADD_ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALIAS__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Original Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALIAS__ORIGINAL_SIGNER_ID = 1;

	/**
	 * The feature id for the '<em><b>Alias Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALIAS__ALIAS_SIGNER_ID = 2;

	/**
	 * The number of structural features of the '<em>Add Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALIAS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Add Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddAliasResponseImpl <em>Add Alias Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddAliasResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddAliasResponse()
	 * @generated
	 */
	int ADD_ALIAS_RESPONSE = 2;

	/**
	 * The number of structural features of the '<em>Add Alias Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALIAS_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Add Alias Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALIAS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentImpl <em>Add Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddConsent()
	 * @generated
	 */
	int ADD_CONSENT = 3;

	/**
	 * The feature id for the '<em><b>Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT__CONSENT = 0;

	/**
	 * The number of structural features of the '<em>Add Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Add Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentOptOutImpl <em>Add Consent Opt Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentOptOutImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddConsentOptOut()
	 * @generated
	 */
	int ADD_CONSENT_OPT_OUT = 4;

	/**
	 * The feature id for the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_OPT_OUT__CONSENT_TEMPLATE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_OPT_OUT__SIGNER_IDS = 1;

	/**
	 * The number of structural features of the '<em>Add Consent Opt Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_OPT_OUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Add Consent Opt Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_OPT_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentOptOutResponseImpl <em>Add Consent Opt Out Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentOptOutResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddConsentOptOutResponse()
	 * @generated
	 */
	int ADD_CONSENT_OPT_OUT_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_OPT_OUT_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Add Consent Opt Out Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_OPT_OUT_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Add Consent Opt Out Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_OPT_OUT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentResponseImpl <em>Add Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddConsentResponse()
	 * @generated
	 */
	int ADD_CONSENT_RESPONSE = 6;

	/**
	 * The number of structural features of the '<em>Add Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Add Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddScanToConsentImpl <em>Add Scan To Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddScanToConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddScanToConsent()
	 * @generated
	 */
	int ADD_SCAN_TO_CONSENT = 7;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCAN_TO_CONSENT__CONSENT_KEY = 0;

	/**
	 * The feature id for the '<em><b>Scan Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCAN_TO_CONSENT__SCAN_BASE64 = 1;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCAN_TO_CONSENT__FILE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCAN_TO_CONSENT__FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Add Scan To Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCAN_TO_CONSENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Add Scan To Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCAN_TO_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddScanToConsentResponseImpl <em>Add Scan To Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddScanToConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddScanToConsentResponse()
	 * @generated
	 */
	int ADD_SCAN_TO_CONSENT_RESPONSE = 8;

	/**
	 * The number of structural features of the '<em>Add Scan To Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCAN_TO_CONSENT_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Add Scan To Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCAN_TO_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToConsentImpl <em>Add Signer Id To Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddSignerIdToConsent()
	 * @generated
	 */
	int ADD_SIGNER_ID_TO_CONSENT = 9;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_CONSENT__CONSENT_KEY = 0;

	/**
	 * The feature id for the '<em><b>Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_CONSENT__SIGNER_ID = 1;

	/**
	 * The number of structural features of the '<em>Add Signer Id To Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_CONSENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Add Signer Id To Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToConsentResponseImpl <em>Add Signer Id To Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddSignerIdToConsentResponse()
	 * @generated
	 */
	int ADD_SIGNER_ID_TO_CONSENT_RESPONSE = 10;

	/**
	 * The number of structural features of the '<em>Add Signer Id To Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_CONSENT_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Add Signer Id To Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToSignerIdImpl <em>Add Signer Id To Signer Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToSignerIdImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddSignerIdToSignerId()
	 * @generated
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID = 11;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Existent Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID = 1;

	/**
	 * The feature id for the '<em><b>New Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID = 2;

	/**
	 * The number of structural features of the '<em>Add Signer Id To Signer Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Add Signer Id To Signer Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToSignerIdResponseImpl <em>Add Signer Id To Signer Id Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToSignerIdResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAddSignerIdToSignerIdResponse()
	 * @generated
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE = 12;

	/**
	 * The number of structural features of the '<em>Add Signer Id To Signer Id Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Add Signer Id To Signer Id Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FhirIdDTOImpl <em>Fhir Id DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.FhirIdDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getFhirIdDTO()
	 * @generated
	 */
	int FHIR_ID_DTO = 39;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FHIR_ID_DTO__FHIR_ID = 0;

	/**
	 * The number of structural features of the '<em>Fhir Id DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FHIR_ID_DTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fhir Id DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FHIR_ID_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl <em>Assigned Module DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedModuleDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAssignedModuleDTO()
	 * @generated
	 */
	int ASSIGNED_MODULE_DTO = 13;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Consent Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__DEFAULT_CONSENT_STATUS = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Checkboxes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__DISPLAY_CHECKBOXES = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__MANDATORY = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__MODULE = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__ORDER_NUMBER = FHIR_ID_DTO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO__PARENT = FHIR_ID_DTO_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Assigned Module DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Assigned Module DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_MODULE_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedPolicyDTOImpl <em>Assigned Policy DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedPolicyDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getAssignedPolicyDTO()
	 * @generated
	 */
	int ASSIGNED_POLICY_DTO = 14;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_POLICY_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_POLICY_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_POLICY_DTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_POLICY_DTO__POLICY = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assigned Policy DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_POLICY_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Assigned Policy DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_POLICY_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ChildrenTypeImpl <em>Children Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ChildrenTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getChildrenType()
	 * @generated
	 */
	int CHILDREN_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Children Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Children Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDateValuesDTOImpl <em>Consent Date Values DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDateValuesDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentDateValuesDTO()
	 * @generated
	 */
	int CONSENT_DATE_VALUES_DTO = 16;

	/**
	 * The feature id for the '<em><b>Consent Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DATE_VALUES_DTO__CONSENT_EXPIRATION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Gics Consent Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DATE_VALUES_DTO__GICS_CONSENT_DATE = 1;

	/**
	 * The feature id for the '<em><b>Legal Consent Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DATE_VALUES_DTO__LEGAL_CONSENT_DATE = 2;

	/**
	 * The feature id for the '<em><b>Max Policy Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DATE_VALUES_DTO__MAX_POLICY_EXPIRATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Module Expirations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS = 4;

	/**
	 * The feature id for the '<em><b>Policy Expirations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS = 5;

	/**
	 * The number of structural features of the '<em>Consent Date Values DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DATE_VALUES_DTO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Consent Date Values DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DATE_VALUES_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl <em>Consent Light DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentLightDTO()
	 * @generated
	 */
	int CONSENT_LIGHT_DTO = 19;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consent Dates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__CONSENT_DATES = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__CREATION_DATE = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Patient Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__KEY = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Module States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__MODULE_STATES = FHIR_ID_DTO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Patient Signature Is From Guardian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN = FHIR_ID_DTO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Patient Signing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__PATIENT_SIGNING_DATE = FHIR_ID_DTO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Patient Signing Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__PATIENT_SIGNING_PLACE = FHIR_ID_DTO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Physician Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__PHYSICIAN_ID = FHIR_ID_DTO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Physician Signing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_DATE = FHIR_ID_DTO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physician Signing Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_PLACE = FHIR_ID_DTO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Quality Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__QUALITY_CONTROL = FHIR_ID_DTO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Template Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__TEMPLATE_TYPE = FHIR_ID_DTO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__UPDATE_DATE = FHIR_ID_DTO_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__VALID_FROM_DATE = FHIR_ID_DTO_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Valid From Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Consent Light DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Consent Light DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_LIGHT_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDTOImpl <em>Consent DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentDTO()
	 * @generated
	 */
	int CONSENT_DTO = 17;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__FHIR_ID = CONSENT_LIGHT_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__COMMENT = CONSENT_LIGHT_DTO__COMMENT;

	/**
	 * The feature id for the '<em><b>Consent Dates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__CONSENT_DATES = CONSENT_LIGHT_DTO__CONSENT_DATES;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__CREATION_DATE = CONSENT_LIGHT_DTO__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__EXPIRATION_PROPERTIES = CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__EXTERN_PROPERTIES = CONSENT_LIGHT_DTO__EXTERN_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Has Patient Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__HAS_PATIENT_SIGNATURE = CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__KEY = CONSENT_LIGHT_DTO__KEY;

	/**
	 * The feature id for the '<em><b>Module States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__MODULE_STATES = CONSENT_LIGHT_DTO__MODULE_STATES;

	/**
	 * The feature id for the '<em><b>Patient Signature Is From Guardian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN = CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN;

	/**
	 * The feature id for the '<em><b>Patient Signing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__PATIENT_SIGNING_DATE = CONSENT_LIGHT_DTO__PATIENT_SIGNING_DATE;

	/**
	 * The feature id for the '<em><b>Patient Signing Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__PATIENT_SIGNING_PLACE = CONSENT_LIGHT_DTO__PATIENT_SIGNING_PLACE;

	/**
	 * The feature id for the '<em><b>Physician Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__PHYSICIAN_ID = CONSENT_LIGHT_DTO__PHYSICIAN_ID;

	/**
	 * The feature id for the '<em><b>Physician Signing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__PHYSICIAN_SIGNING_DATE = CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_DATE;

	/**
	 * The feature id for the '<em><b>Physician Signing Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__PHYSICIAN_SIGNING_PLACE = CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_PLACE;

	/**
	 * The feature id for the '<em><b>Quality Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__QUALITY_CONTROL = CONSENT_LIGHT_DTO__QUALITY_CONTROL;

	/**
	 * The feature id for the '<em><b>Template Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__TEMPLATE_TYPE = CONSENT_LIGHT_DTO__TEMPLATE_TYPE;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__UPDATE_DATE = CONSENT_LIGHT_DTO__UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__VALID_FROM_DATE = CONSENT_LIGHT_DTO__VALID_FROM_DATE;

	/**
	 * The feature id for the '<em><b>Valid From Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__VALID_FROM_PROPERTIES = CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Free Text Vals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__FREE_TEXT_VALS = CONSENT_LIGHT_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Patient Signature Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__PATIENT_SIGNATURE_BASE64 = CONSENT_LIGHT_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physician Signature Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__PHYSICIAN_SIGNATURE_BASE64 = CONSENT_LIGHT_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO__SCANS = CONSENT_LIGHT_DTO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Consent DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO_FEATURE_COUNT = CONSENT_LIGHT_DTO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Consent DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_DTO_OPERATION_COUNT = CONSENT_LIGHT_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentKeyDTOImpl <em>Consent Key DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentKeyDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentKeyDTO()
	 * @generated
	 */
	int CONSENT_KEY_DTO = 18;

	/**
	 * The feature id for the '<em><b>Consent Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_KEY_DTO__CONSENT_DATE = 0;

	/**
	 * The feature id for the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY = 1;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_KEY_DTO__SIGNER_IDS = 2;

	/**
	 * The number of structural features of the '<em>Consent Key DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_KEY_DTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Consent Key DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_KEY_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentScanDTOImpl <em>Consent Scan DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentScanDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentScanDTO()
	 * @generated
	 */
	int CONSENT_SCAN_DTO = 20;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_SCAN_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_SCAN_DTO__BASE64 = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_SCAN_DTO__CONSENT_KEY = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_SCAN_DTO__FILE_NAME = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_SCAN_DTO__FILE_TYPE = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upload Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_SCAN_DTO__UPLOAD_DATE = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Consent Scan DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_SCAN_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Consent Scan DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_SCAN_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl <em>Consent Template DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentTemplateDTO()
	 * @generated
	 */
	int CONSENT_TEMPLATE_DTO = 21;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Assigned Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__ASSIGNED_MODULES = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__CREATION_DATE = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Finalised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__FINALISED = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__FOOTER = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Free Text Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__FREE_TEXT_DEFS = FHIR_ID_DTO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__HEADER = FHIR_ID_DTO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__KEY = FHIR_ID_DTO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__LABEL = FHIR_ID_DTO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mapped Consent Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__MAPPED_CONSENT_TEMPLATES = FHIR_ID_DTO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Mapped Objection Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__MAPPED_OBJECTION_TEMPLATES = FHIR_ID_DTO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Mapped Opt Out Consent Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__MAPPED_OPT_OUT_CONSENT_TEMPLATES = FHIR_ID_DTO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Mapped Refusal Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__MAPPED_REFUSAL_TEMPLATES = FHIR_ID_DTO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Mapped Revocation Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__MAPPED_REVOCATION_TEMPLATES = FHIR_ID_DTO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Scan Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__SCAN_BASE64 = FHIR_ID_DTO_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Scan File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__SCAN_FILE_TYPE = FHIR_ID_DTO_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__STRUCTURE = FHIR_ID_DTO_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__TITLE = FHIR_ID_DTO_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__TYPE = FHIR_ID_DTO_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__UPDATE_DATE = FHIR_ID_DTO_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Valid From Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Version Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO__VERSION_LABEL = FHIR_ID_DTO_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Consent Template DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Consent Template DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateKeyDTOImpl <em>Consent Template Key DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateKeyDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentTemplateKeyDTO()
	 * @generated
	 */
	int CONSENT_TEMPLATE_KEY_DTO = 22;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_KEY_DTO__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_KEY_DTO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_KEY_DTO__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Consent Template Key DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_KEY_DTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Consent Template Key DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_KEY_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateStructureDTOImpl <em>Consent Template Structure DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateStructureDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentTemplateStructureDTO()
	 * @generated
	 */
	int CONSENT_TEMPLATE_STRUCTURE_DTO = 23;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>First Level Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_STRUCTURE_DTO__FIRST_LEVEL_MODULES = 1;

	/**
	 * The number of structural features of the '<em>Consent Template Structure DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_STRUCTURE_DTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Consent Template Structure DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_TEMPLATE_STRUCTURE_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.CountConsentsForDomainWithFilterImpl <em>Count Consents For Domain With Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.CountConsentsForDomainWithFilterImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getCountConsentsForDomainWithFilter()
	 * @generated
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER = 24;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER__CONFIG = 1;

	/**
	 * The number of structural features of the '<em>Count Consents For Domain With Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Count Consents For Domain With Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.CountConsentsForDomainWithFilterResponseImpl <em>Count Consents For Domain With Filter Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.CountConsentsForDomainWithFilterResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getCountConsentsForDomainWithFilterResponse()
	 * @generated
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE = 25;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Count Consents For Domain With Filter Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Count Consents For Domain With Filter Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.CountSignedPoliciesImpl <em>Count Signed Policies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.CountSignedPoliciesImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getCountSignedPolicies()
	 * @generated
	 */
	int COUNT_SIGNED_POLICIES = 26;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_SIGNED_POLICIES__DOMAIN_NAME = 0;

	/**
	 * The number of structural features of the '<em>Count Signed Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_SIGNED_POLICIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Count Signed Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_SIGNED_POLICIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.CountSignedPoliciesResponseImpl <em>Count Signed Policies Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.CountSignedPoliciesResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getCountSignedPoliciesResponse()
	 * @generated
	 */
	int COUNT_SIGNED_POLICIES_RESPONSE = 27;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_SIGNED_POLICIES_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Count Signed Policies Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_SIGNED_POLICIES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Count Signed Policies Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_SIGNED_POLICIES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DeactivateAliasImpl <em>Deactivate Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.DeactivateAliasImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getDeactivateAlias()
	 * @generated
	 */
	int DEACTIVATE_ALIAS = 28;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_ALIAS__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Original Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID = 1;

	/**
	 * The feature id for the '<em><b>Alias Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_ALIAS__ALIAS_SIGNER_ID = 2;

	/**
	 * The number of structural features of the '<em>Deactivate Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_ALIAS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Deactivate Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_ALIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DeactivateAliasResponseImpl <em>Deactivate Alias Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.DeactivateAliasResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getDeactivateAliasResponse()
	 * @generated
	 */
	int DEACTIVATE_ALIAS_RESPONSE = 29;

	/**
	 * The number of structural features of the '<em>Deactivate Alias Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_ALIAS_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Deactivate Alias Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEACTIVATE_ALIAS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 30;

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
	 * The feature id for the '<em><b>Add Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Add Alias Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_ALIAS_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Add Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_CONSENT = 5;

	/**
	 * The feature id for the '<em><b>Add Consent Opt Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT = 6;

	/**
	 * The feature id for the '<em><b>Add Consent Opt Out Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT_RESPONSE = 7;

	/**
	 * The feature id for the '<em><b>Add Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_CONSENT_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Add Scan To Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT = 9;

	/**
	 * The feature id for the '<em><b>Add Scan To Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Add Signer Id To Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT = 11;

	/**
	 * The feature id for the '<em><b>Add Signer Id To Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Add Signer Id To Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID = 13;

	/**
	 * The feature id for the '<em><b>Add Signer Id To Signer Id Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE = 14;

	/**
	 * The feature id for the '<em><b>Count Consents For Domain With Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER = 15;

	/**
	 * The feature id for the '<em><b>Count Consents For Domain With Filter Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE = 16;

	/**
	 * The feature id for the '<em><b>Count Signed Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNT_SIGNED_POLICIES = 17;

	/**
	 * The feature id for the '<em><b>Count Signed Policies Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNT_SIGNED_POLICIES_RESPONSE = 18;

	/**
	 * The feature id for the '<em><b>Deactivate Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEACTIVATE_ALIAS = 19;

	/**
	 * The feature id for the '<em><b>Deactivate Alias Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEACTIVATE_ALIAS_RESPONSE = 20;

	/**
	 * The feature id for the '<em><b>Duplicate Entry Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DUPLICATE_ENTRY_EXCEPTION = 21;

	/**
	 * The feature id for the '<em><b>Get Aliases For Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID = 22;

	/**
	 * The feature id for the '<em><b>Get Aliases For Signer Id Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID_RESPONSE = 23;

	/**
	 * The feature id for the '<em><b>Get Aliases For Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS = 24;

	/**
	 * The feature id for the '<em><b>Get Aliases For Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS_RESPONSE = 25;

	/**
	 * The feature id for the '<em><b>Get All Consented Ids For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR = 26;

	/**
	 * The feature id for the '<em><b>Get All Consented Ids For Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR_RESPONSE = 27;

	/**
	 * The feature id for the '<em><b>Get All Consents For Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE = 28;

	/**
	 * The feature id for the '<em><b>Get All Consents For Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE = 29;

	/**
	 * The feature id for the '<em><b>Get All Consents For Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN = 30;

	/**
	 * The feature id for the '<em><b>Get All Consents For Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE = 31;

	/**
	 * The feature id for the '<em><b>Get All Consents For Domain Without Scan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN = 32;

	/**
	 * The feature id for the '<em><b>Get All Consents For Domain Without Scan Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE = 33;

	/**
	 * The feature id for the '<em><b>Get All Consents For Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS = 34;

	/**
	 * The feature id for the '<em><b>Get All Consents For Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE = 35;

	/**
	 * The feature id for the '<em><b>Get All Ids For Signer Id Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Get All Ids For Signer Id Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE = 37;

	/**
	 * The feature id for the '<em><b>Get Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT = 38;

	/**
	 * The feature id for the '<em><b>Get Consent Dates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_DATES = 39;

	/**
	 * The feature id for the '<em><b>Get Consent Dates Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_DATES_RESPONSE = 40;

	/**
	 * The feature id for the '<em><b>Get Consent Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_LIGHT = 41;

	/**
	 * The feature id for the '<em><b>Get Consent Light Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_LIGHT_RESPONSE = 42;

	/**
	 * The feature id for the '<em><b>Get Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_RESPONSE = 43;

	/**
	 * The feature id for the '<em><b>Get Consents For Domain Paginated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED = 44;

	/**
	 * The feature id for the '<em><b>Get Consents For Domain Paginated Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE = 45;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type From Excluding To Excluding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING = 47;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type From Excluding To Excluding Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE = 48;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type From Excluding To Including</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING = 49;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type From Excluding To Including Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE = 50;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type From Including To Excluding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING = 51;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type From Including To Excluding Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE = 52;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type From Including To Including</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING = 53;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type From Including To Including Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE = 54;

	/**
	 * The feature id for the '<em><b>Get Consent Status Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_RESPONSE = 55;

	/**
	 * The feature id for the '<em><b>Get Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_TEMPLATE = 56;

	/**
	 * The feature id for the '<em><b>Get Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONSENT_TEMPLATE_RESPONSE = 57;

	/**
	 * The feature id for the '<em><b>Get Current Consent For Signer Ids And CT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT = 58;

	/**
	 * The feature id for the '<em><b>Get Current Consent For Signer Ids And CT Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE = 59;

	/**
	 * The feature id for the '<em><b>Get Current Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE = 60;

	/**
	 * The feature id for the '<em><b>Get Current Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE_RESPONSE = 61;

	/**
	 * The feature id for the '<em><b>Get Current Policy States For Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS = 62;

	/**
	 * The feature id for the '<em><b>Get Current Policy States For Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE = 63;

	/**
	 * The feature id for the '<em><b>Get Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_DOMAIN = 64;

	/**
	 * The feature id for the '<em><b>Get Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_DOMAIN_RESPONSE = 65;

	/**
	 * The feature id for the '<em><b>Get Mapped Templates For Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID = 66;

	/**
	 * The feature id for the '<em><b>Get Mapped Templates For Signer Id Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE = 67;

	/**
	 * The feature id for the '<em><b>Get Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_MODULE = 68;

	/**
	 * The feature id for the '<em><b>Get Module Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_MODULE_RESPONSE = 69;

	/**
	 * The feature id for the '<em><b>Get Object By Fhir ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID = 70;

	/**
	 * The feature id for the '<em><b>Get Object By Fhir ID Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID_RESPONSE = 71;

	/**
	 * The feature id for the '<em><b>Get Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_POLICY = 72;

	/**
	 * The feature id for the '<em><b>Get Policy Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_POLICY_RESPONSE = 73;

	/**
	 * The feature id for the '<em><b>Get Policy States For Policy And Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS = 74;

	/**
	 * The feature id for the '<em><b>Get Policy States For Policy And Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE = 75;

	/**
	 * The feature id for the '<em><b>Get Policy States For Policy Name And Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS = 76;

	/**
	 * The feature id for the '<em><b>Get Policy States For Policy Name And Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE = 77;

	/**
	 * The feature id for the '<em><b>Get Policy States For Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS = 78;

	/**
	 * The feature id for the '<em><b>Get Policy States For Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE = 79;

	/**
	 * The feature id for the '<em><b>Get QC History For Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT = 80;

	/**
	 * The feature id for the '<em><b>Get QC History For Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT_RESPONSE = 81;

	/**
	 * The feature id for the '<em><b>Get QC Problem History For QC Problem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM = 82;

	/**
	 * The feature id for the '<em><b>Get QC Problem History For QC Problem Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE = 83;

	/**
	 * The feature id for the '<em><b>Get Signer Ids For Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS = 84;

	/**
	 * The feature id for the '<em><b>Get Signer Ids For Alias Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS_RESPONSE = 85;

	/**
	 * The feature id for the '<em><b>Get Signer Id Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_SIGNER_ID_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Get Signer Id Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_SIGNER_ID_TYPE_RESPONSE = 87;

	/**
	 * The feature id for the '<em><b>Get Templates With Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES = 88;

	/**
	 * The feature id for the '<em><b>Get Templates With Policies Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES_RESPONSE = 89;

	/**
	 * The feature id for the '<em><b>Illegal Argument Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ILLEGAL_ARGUMENT_EXCEPTION = 90;

	/**
	 * The feature id for the '<em><b>Inconsistent Status Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCONSISTENT_STATUS_EXCEPTION = 91;

	/**
	 * The feature id for the '<em><b>Internal Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERNAL_EXCEPTION = 92;

	/**
	 * The feature id for the '<em><b>Invalid Free Text Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVALID_FREE_TEXT_EXCEPTION = 93;

	/**
	 * The feature id for the '<em><b>Invalid Parameter Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVALID_PARAMETER_EXCEPTION = 94;

	/**
	 * The feature id for the '<em><b>Invalid Version Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVALID_VERSION_EXCEPTION = 95;

	/**
	 * The feature id for the '<em><b>Is Consented</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED = 96;

	/**
	 * The feature id for the '<em><b>Is Consented From Excluding To Excluding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING = 97;

	/**
	 * The feature id for the '<em><b>Is Consented From Excluding To Excluding Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE = 98;

	/**
	 * The feature id for the '<em><b>Is Consented From Excluding To Including</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING = 99;

	/**
	 * The feature id for the '<em><b>Is Consented From Excluding To Including Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE = 100;

	/**
	 * The feature id for the '<em><b>Is Consented From Including To Excluding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING = 101;

	/**
	 * The feature id for the '<em><b>Is Consented From Including To Excluding Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE = 102;

	/**
	 * The feature id for the '<em><b>Is Consented From Including To Including</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING = 103;

	/**
	 * The feature id for the '<em><b>Is Consented From Including To Including Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE = 104;

	/**
	 * The feature id for the '<em><b>Is Consented Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_CONSENTED_RESPONSE = 105;

	/**
	 * The feature id for the '<em><b>List Consent Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES = 106;

	/**
	 * The feature id for the '<em><b>List Consent Templates Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES_RESPONSE = 107;

	/**
	 * The feature id for the '<em><b>List Current Consent Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES = 108;

	/**
	 * The feature id for the '<em><b>List Current Consent Templates Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE = 109;

	/**
	 * The feature id for the '<em><b>List Domains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_DOMAINS = 110;

	/**
	 * The feature id for the '<em><b>List Domains Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_DOMAINS_RESPONSE = 111;

	/**
	 * The feature id for the '<em><b>List Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_MODULES = 112;

	/**
	 * The feature id for the '<em><b>List Modules Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_MODULES_RESPONSE = 113;

	/**
	 * The feature id for the '<em><b>List Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_POLICIES = 114;

	/**
	 * The feature id for the '<em><b>List Policies Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_POLICIES_RESPONSE = 115;

	/**
	 * The feature id for the '<em><b>List Signer Id Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES = 116;

	/**
	 * The feature id for the '<em><b>List Signer Id Types Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES_RESPONSE = 117;

	/**
	 * The feature id for the '<em><b>Mandatory Fields Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MANDATORY_FIELDS_EXCEPTION = 118;

	/**
	 * The feature id for the '<em><b>Missing Required Object Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MISSING_REQUIRED_OBJECT_EXCEPTION = 119;

	/**
	 * The feature id for the '<em><b>Refuse Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFUSE_CONSENT = 120;

	/**
	 * The feature id for the '<em><b>Refuse Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFUSE_CONSENT_RESPONSE = 121;

	/**
	 * The feature id for the '<em><b>Remove Scan From Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT = 122;

	/**
	 * The feature id for the '<em><b>Remove Scan From Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT_RESPONSE = 123;

	/**
	 * The feature id for the '<em><b>Requirements Not Fullfilled Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIREMENTS_NOT_FULLFILLED_EXCEPTION = 124;

	/**
	 * The feature id for the '<em><b>Set QC For Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SET_QC_FOR_CONSENT = 125;

	/**
	 * The feature id for the '<em><b>Set QC For Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SET_QC_FOR_CONSENT_RESPONSE = 126;

	/**
	 * The feature id for the '<em><b>Unknown Alias Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_ALIAS_EXCEPTION = 127;

	/**
	 * The feature id for the '<em><b>Unknown Consent Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_CONSENT_EXCEPTION = 128;

	/**
	 * The feature id for the '<em><b>Unknown Consent Template Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_CONSENT_TEMPLATE_EXCEPTION = 129;

	/**
	 * The feature id for the '<em><b>Unknown Domain Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_DOMAIN_EXCEPTION = 130;

	/**
	 * The feature id for the '<em><b>Unknown Fhir Id Object Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_FHIR_ID_OBJECT_EXCEPTION = 131;

	/**
	 * The feature id for the '<em><b>Unknown ID Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_ID_EXCEPTION = 132;

	/**
	 * The feature id for the '<em><b>Unknown Module Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_MODULE_EXCEPTION = 133;

	/**
	 * The feature id for the '<em><b>Unknown Policy Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_POLICY_EXCEPTION = 134;

	/**
	 * The feature id for the '<em><b>Unknown Signer Id Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_EXCEPTION = 135;

	/**
	 * The feature id for the '<em><b>Unknown Signer Id Type Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_TYPE_EXCEPTION = 136;

	/**
	 * The feature id for the '<em><b>Update Consent In Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE = 137;

	/**
	 * The feature id for the '<em><b>Update Consent In Use Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE_RESPONSE = 138;

	/**
	 * The feature id for the '<em><b>Validate Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE_CONSENT = 139;

	/**
	 * The feature id for the '<em><b>Validate Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE_CONSENT_RESPONSE = 140;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 141;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl <em>Domain DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.DomainDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getDomainDTO()
	 * @generated
	 */
	int DOMAIN_DTO = 31;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__CONFIG = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__CREATION_DATE = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ct Version Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__CT_VERSION_CONVERTER = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__EXPIRATION_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Finalised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__FINALISED = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__LABEL = FHIR_ID_DTO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__LOGO = FHIR_ID_DTO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Module Version Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__MODULE_VERSION_CONVERTER = FHIR_ID_DTO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__NAME = FHIR_ID_DTO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Policy Version Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__POLICY_VERSION_CONVERTER = FHIR_ID_DTO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Signer Id Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__SIGNER_ID_TYPES = FHIR_ID_DTO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO__UPDATE_DATE = FHIR_ID_DTO_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Domain DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Domain DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DuplicateEntryExceptionImpl <em>Duplicate Entry Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.DuplicateEntryExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getDuplicateEntryException()
	 * @generated
	 */
	int DUPLICATE_ENTRY_EXCEPTION = 32;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATE_ENTRY_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Duplicate Entry Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATE_ENTRY_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Duplicate Entry Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATE_ENTRY_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.EntryTypeImpl <em>Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.EntryTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
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
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.EntryType1Impl <em>Entry Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.EntryType1Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getEntryType1()
	 * @generated
	 */
	int ENTRY_TYPE1 = 34;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE1__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE1__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.EntryType2Impl <em>Entry Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.EntryType2Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getEntryType2()
	 * @generated
	 */
	int ENTRY_TYPE2 = 35;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE2__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE2__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.EntryType3Impl <em>Entry Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.EntryType3Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getEntryType3()
	 * @generated
	 */
	int ENTRY_TYPE3 = 36;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE3__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE3__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE3_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.EntryType4Impl <em>Entry Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.EntryType4Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getEntryType4()
	 * @generated
	 */
	int ENTRY_TYPE4 = 37;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE4__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE4__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE4_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE4_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ExpirationPropertiesDTOImpl <em>Expiration Properties DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ExpirationPropertiesDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getExpirationPropertiesDTO()
	 * @generated
	 */
	int EXPIRATION_PROPERTIES_DTO = 38;

	/**
	 * The feature id for the '<em><b>Fixed Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPIRATION_PROPERTIES_DTO__FIXED_EXPIRATION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Valid Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPIRATION_PROPERTIES_DTO__VALID_PERIOD = 1;

	/**
	 * The number of structural features of the '<em>Expiration Properties DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPIRATION_PROPERTIES_DTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expiration Properties DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPIRATION_PROPERTIES_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl <em>Free Text Def DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getFreeTextDefDTO()
	 * @generated
	 */
	int FREE_TEXT_DEF_DTO = 40;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Converter String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__CONVERTER_STRING = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__CREATION_DATE = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Finalised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__FINALISED = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__LABEL = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__NAME = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__POS = FHIR_ID_DTO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__REQUIRED = FHIR_ID_DTO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__TYPE = FHIR_ID_DTO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO__UPDATE_DATE = FHIR_ID_DTO_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Free Text Def DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Free Text Def DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_DEF_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextValDTOImpl <em>Free Text Val DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextValDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getFreeTextValDTO()
	 * @generated
	 */
	int FREE_TEXT_VAL_DTO = 41;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_VAL_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Free Text Def Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_VAL_DTO__FREE_TEXT_DEF_NAME = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_VAL_DTO__VALUE = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Free Text Val DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_VAL_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Free Text Val DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_VAL_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAliasesForSignerIdImpl <em>Get Aliases For Signer Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAliasesForSignerIdImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAliasesForSignerId()
	 * @generated
	 */
	int GET_ALIASES_FOR_SIGNER_ID = 42;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_ID__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Original Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_ID__ORIGINAL_SIGNER_ID = 1;

	/**
	 * The number of structural features of the '<em>Get Aliases For Signer Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get Aliases For Signer Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAliasesForSignerIdResponseImpl <em>Get Aliases For Signer Id Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAliasesForSignerIdResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAliasesForSignerIdResponse()
	 * @generated
	 */
	int GET_ALIASES_FOR_SIGNER_ID_RESPONSE = 43;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_ID_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Aliases For Signer Id Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_ID_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Aliases For Signer Id Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_ID_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAliasesForSignerIdsImpl <em>Get Aliases For Signer Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAliasesForSignerIdsImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAliasesForSignerIds()
	 * @generated
	 */
	int GET_ALIASES_FOR_SIGNER_IDS = 44;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_IDS__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Original Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_IDS__ORIGINAL_SIGNER_IDS = 1;

	/**
	 * The number of structural features of the '<em>Get Aliases For Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_IDS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get Aliases For Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAliasesForSignerIdsResponseImpl <em>Get Aliases For Signer Ids Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAliasesForSignerIdsResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAliasesForSignerIdsResponse()
	 * @generated
	 */
	int GET_ALIASES_FOR_SIGNER_IDS_RESPONSE = 45;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_IDS_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Aliases For Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_IDS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Aliases For Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALIASES_FOR_SIGNER_IDS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentedIdsForImpl <em>Get All Consented Ids For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentedIdsForImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentedIdsFor()
	 * @generated
	 */
	int GET_ALL_CONSENTED_IDS_FOR = 46;

	/**
	 * The feature id for the '<em><b>Signer Id Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTED_IDS_FOR__SIGNER_ID_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTED_IDS_FOR__CONFIG = 2;

	/**
	 * The number of structural features of the '<em>Get All Consented Ids For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTED_IDS_FOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Get All Consented Ids For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTED_IDS_FOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentedIdsForResponseImpl <em>Get All Consented Ids For Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentedIdsForResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentedIdsForResponse()
	 * @generated
	 */
	int GET_ALL_CONSENTED_IDS_FOR_RESPONSE = 47;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTED_IDS_FOR_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get All Consented Ids For Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTED_IDS_FOR_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Consented Ids For Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTED_IDS_FOR_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForConsentTemplateImpl <em>Get All Consents For Consent Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForConsentTemplateImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentsForConsentTemplate()
	 * @generated
	 */
	int GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE = 48;

	/**
	 * The feature id for the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY = 0;

	/**
	 * The number of structural features of the '<em>Get All Consents For Consent Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Consents For Consent Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForConsentTemplateResponseImpl <em>Get All Consents For Consent Template Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForConsentTemplateResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentsForConsentTemplateResponse()
	 * @generated
	 */
	int GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE = 49;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get All Consents For Consent Template Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Consents For Consent Template Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForDomainImpl <em>Get All Consents For Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForDomainImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentsForDomain()
	 * @generated
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN = 50;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN__DOMAIN_NAME = 0;

	/**
	 * The number of structural features of the '<em>Get All Consents For Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Consents For Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForDomainResponseImpl <em>Get All Consents For Domain Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForDomainResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentsForDomainResponse()
	 * @generated
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE = 51;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get All Consents For Domain Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Consents For Domain Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForDomainWithoutScanImpl <em>Get All Consents For Domain Without Scan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForDomainWithoutScanImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentsForDomainWithoutScan()
	 * @generated
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN = 52;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN__DOMAIN_NAME = 0;

	/**
	 * The number of structural features of the '<em>Get All Consents For Domain Without Scan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Consents For Domain Without Scan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForDomainWithoutScanResponseImpl <em>Get All Consents For Domain Without Scan Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForDomainWithoutScanResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentsForDomainWithoutScanResponse()
	 * @generated
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE = 53;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get All Consents For Domain Without Scan Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Consents For Domain Without Scan Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForSignerIdsImpl <em>Get All Consents For Signer Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForSignerIdsImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentsForSignerIds()
	 * @generated
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS = 54;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS__SIGNER_IDS = 1;

	/**
	 * The feature id for the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS__USE_ALIASES = 2;

	/**
	 * The number of structural features of the '<em>Get All Consents For Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Get All Consents For Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForSignerIdsResponseImpl <em>Get All Consents For Signer Ids Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForSignerIdsResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllConsentsForSignerIdsResponse()
	 * @generated
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE = 55;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get All Consents For Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Consents For Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllIdsForSignerIdTypeImpl <em>Get All Ids For Signer Id Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllIdsForSignerIdTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllIdsForSignerIdType()
	 * @generated
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Signer Id Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE__SIGNER_ID_TYPE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Get All Ids For Signer Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get All Ids For Signer Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllIdsForSignerIdTypeResponseImpl <em>Get All Ids For Signer Id Type Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllIdsForSignerIdTypeResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetAllIdsForSignerIdTypeResponse()
	 * @generated
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE = 57;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get All Ids For Signer Id Type Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Ids For Signer Id Type Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentImpl <em>Get Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsent()
	 * @generated
	 */
	int GET_CONSENT = 58;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT__CONSENT_KEY = 0;

	/**
	 * The number of structural features of the '<em>Get Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentDatesImpl <em>Get Consent Dates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentDatesImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentDates()
	 * @generated
	 */
	int GET_CONSENT_DATES = 59;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_DATES__CONSENT_KEY = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Dates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_DATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Dates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_DATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentDatesResponseImpl <em>Get Consent Dates Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentDatesResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentDatesResponse()
	 * @generated
	 */
	int GET_CONSENT_DATES_RESPONSE = 60;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_DATES_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Dates Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_DATES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Dates Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_DATES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentLightImpl <em>Get Consent Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentLightImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentLight()
	 * @generated
	 */
	int GET_CONSENT_LIGHT = 61;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_LIGHT__CONSENT_KEY = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_LIGHT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_LIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentLightResponseImpl <em>Get Consent Light Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentLightResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentLightResponse()
	 * @generated
	 */
	int GET_CONSENT_LIGHT_RESPONSE = 62;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_LIGHT_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Light Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_LIGHT_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Light Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_LIGHT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentResponseImpl <em>Get Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentResponse()
	 * @generated
	 */
	int GET_CONSENT_RESPONSE = 63;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentsForDomainPaginatedImpl <em>Get Consents For Domain Paginated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentsForDomainPaginatedImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentsForDomainPaginated()
	 * @generated
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED = 64;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED__CONFIG = 1;

	/**
	 * The number of structural features of the '<em>Get Consents For Domain Paginated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get Consents For Domain Paginated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentsForDomainPaginatedResponseImpl <em>Get Consents For Domain Paginated Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentsForDomainPaginatedResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentsForDomainPaginatedResponse()
	 * @generated
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE = 65;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consents For Domain Paginated Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consents For Domain Paginated Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeImpl <em>Get Consent Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusType()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE__POLICY_KEY = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE__CONFIG = 2;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Get Consent Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToExcludingImpl <em>Get Consent Status Type From Excluding To Excluding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToExcludingImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeFromExcludingToExcluding()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING = 67;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__POLICY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__VERSION_FROM = 3;

	/**
	 * The feature id for the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__VERSION_TO = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type From Excluding To Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Get Consent Status Type From Excluding To Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToExcludingResponseImpl <em>Get Consent Status Type From Excluding To Excluding Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToExcludingResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeFromExcludingToExcludingResponse()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE = 68;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type From Excluding To Excluding Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Status Type From Excluding To Excluding Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingImpl <em>Get Consent Status Type From Excluding To Including</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeFromExcludingToIncluding()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING = 69;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM = 3;

	/**
	 * The feature id for the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type From Excluding To Including</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Get Consent Status Type From Excluding To Including</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingResponseImpl <em>Get Consent Status Type From Excluding To Including Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeFromExcludingToIncludingResponse()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE = 70;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type From Excluding To Including Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Status Type From Excluding To Including Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromIncludingToExcludingImpl <em>Get Consent Status Type From Including To Excluding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromIncludingToExcludingImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeFromIncludingToExcluding()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING = 71;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__POLICY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__VERSION_FROM = 3;

	/**
	 * The feature id for the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__VERSION_TO = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type From Including To Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Get Consent Status Type From Including To Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromIncludingToExcludingResponseImpl <em>Get Consent Status Type From Including To Excluding Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromIncludingToExcludingResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeFromIncludingToExcludingResponse()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE = 72;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type From Including To Excluding Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Status Type From Including To Excluding Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromIncludingToIncludingImpl <em>Get Consent Status Type From Including To Including</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromIncludingToIncludingImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeFromIncludingToIncluding()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING = 73;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__POLICY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__VERSION_FROM = 3;

	/**
	 * The feature id for the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__VERSION_TO = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type From Including To Including</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Get Consent Status Type From Including To Including</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromIncludingToIncludingResponseImpl <em>Get Consent Status Type From Including To Including Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromIncludingToIncludingResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeFromIncludingToIncludingResponse()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE = 74;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type From Including To Including Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Status Type From Including To Including Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeResponseImpl <em>Get Consent Status Type Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentStatusTypeResponse()
	 * @generated
	 */
	int GET_CONSENT_STATUS_TYPE_RESPONSE = 75;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Status Type Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Status Type Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_STATUS_TYPE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentTemplateImpl <em>Get Consent Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentTemplateImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentTemplate()
	 * @generated
	 */
	int GET_CONSENT_TEMPLATE = 76;

	/**
	 * The feature id for the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_TEMPLATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentTemplateResponseImpl <em>Get Consent Template Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentTemplateResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetConsentTemplateResponse()
	 * @generated
	 */
	int GET_CONSENT_TEMPLATE_RESPONSE = 77;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_TEMPLATE_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Consent Template Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_TEMPLATE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Consent Template Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONSENT_TEMPLATE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentForSignerIdsAndCTImpl <em>Get Current Consent For Signer Ids And CT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentForSignerIdsAndCTImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetCurrentConsentForSignerIdsAndCT()
	 * @generated
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT = 78;

	/**
	 * The feature id for the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT__CONSENT_TEMPLATE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT__SIGNER_IDS = 1;

	/**
	 * The feature id for the '<em><b>Ignore Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT__IGNORE_VERSION_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT__USE_ALIASES = 3;

	/**
	 * The number of structural features of the '<em>Get Current Consent For Signer Ids And CT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Get Current Consent For Signer Ids And CT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentForSignerIdsAndCTResponseImpl <em>Get Current Consent For Signer Ids And CT Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentForSignerIdsAndCTResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetCurrentConsentForSignerIdsAndCTResponse()
	 * @generated
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE = 79;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Current Consent For Signer Ids And CT Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Current Consent For Signer Ids And CT Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentTemplateImpl <em>Get Current Consent Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentTemplateImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetCurrentConsentTemplate()
	 * @generated
	 */
	int GET_CURRENT_CONSENT_TEMPLATE = 80;

	/**
	 * The feature id for the '<em><b>Consent Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_TEMPLATE__CONSENT_TEMPLATE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_TEMPLATE__DOMAIN_NAME = 1;

	/**
	 * The number of structural features of the '<em>Get Current Consent Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get Current Consent Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentTemplateResponseImpl <em>Get Current Consent Template Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentTemplateResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetCurrentConsentTemplateResponse()
	 * @generated
	 */
	int GET_CURRENT_CONSENT_TEMPLATE_RESPONSE = 81;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_TEMPLATE_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Current Consent Template Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_TEMPLATE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Current Consent Template Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_CONSENT_TEMPLATE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentPolicyStatesForSignerIdsImpl <em>Get Current Policy States For Signer Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentPolicyStatesForSignerIdsImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetCurrentPolicyStatesForSignerIds()
	 * @generated
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS = 82;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG = 2;

	/**
	 * The number of structural features of the '<em>Get Current Policy States For Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Get Current Policy States For Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentPolicyStatesForSignerIdsResponseImpl <em>Get Current Policy States For Signer Ids Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentPolicyStatesForSignerIdsResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetCurrentPolicyStatesForSignerIdsResponse()
	 * @generated
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE = 83;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Current Policy States For Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Current Policy States For Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetDomainImpl <em>Get Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetDomainImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetDomain()
	 * @generated
	 */
	int GET_DOMAIN = 84;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DOMAIN__DOMAIN_NAME = 0;

	/**
	 * The number of structural features of the '<em>Get Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetDomainResponseImpl <em>Get Domain Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetDomainResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetDomainResponse()
	 * @generated
	 */
	int GET_DOMAIN_RESPONSE = 85;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DOMAIN_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Domain Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DOMAIN_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Domain Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DOMAIN_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetMappedTemplatesForSignerIdImpl <em>Get Mapped Templates For Signer Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetMappedTemplatesForSignerIdImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetMappedTemplatesForSignerId()
	 * @generated
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID = 86;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ct Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__CT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID = 2;

	/**
	 * The feature id for the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__USE_ALIASES = 3;

	/**
	 * The number of structural features of the '<em>Get Mapped Templates For Signer Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Get Mapped Templates For Signer Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetMappedTemplatesForSignerIdResponseImpl <em>Get Mapped Templates For Signer Id Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetMappedTemplatesForSignerIdResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetMappedTemplatesForSignerIdResponse()
	 * @generated
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE = 87;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Mapped Templates For Signer Id Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Mapped Templates For Signer Id Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetModuleImpl <em>Get Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetModuleImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetModule()
	 * @generated
	 */
	int GET_MODULE = 88;

	/**
	 * The feature id for the '<em><b>Module Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MODULE__MODULE_KEY = 0;

	/**
	 * The number of structural features of the '<em>Get Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MODULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetModuleResponseImpl <em>Get Module Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetModuleResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetModuleResponse()
	 * @generated
	 */
	int GET_MODULE_RESPONSE = 89;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MODULE_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Module Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MODULE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Module Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MODULE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetObjectByFhirIDImpl <em>Get Object By Fhir ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetObjectByFhirIDImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetObjectByFhirID()
	 * @generated
	 */
	int GET_OBJECT_BY_FHIR_ID = 90;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_OBJECT_BY_FHIR_ID__CLAZZ = 0;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_OBJECT_BY_FHIR_ID__FHIR_ID = 1;

	/**
	 * The number of structural features of the '<em>Get Object By Fhir ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_OBJECT_BY_FHIR_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get Object By Fhir ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_OBJECT_BY_FHIR_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetObjectByFhirIDResponseImpl <em>Get Object By Fhir ID Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetObjectByFhirIDResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetObjectByFhirIDResponse()
	 * @generated
	 */
	int GET_OBJECT_BY_FHIR_ID_RESPONSE = 91;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_OBJECT_BY_FHIR_ID_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Object By Fhir ID Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_OBJECT_BY_FHIR_ID_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Object By Fhir ID Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_OBJECT_BY_FHIR_ID_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyImpl <em>Get Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetPolicy()
	 * @generated
	 */
	int GET_POLICY = 92;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY__POLICY_KEY = 0;

	/**
	 * The number of structural features of the '<em>Get Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyResponseImpl <em>Get Policy Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetPolicyResponse()
	 * @generated
	 */
	int GET_POLICY_RESPONSE = 93;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Policy Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Policy Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyAndSignerIdsImpl <em>Get Policy States For Policy And Signer Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyAndSignerIdsImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetPolicyStatesForPolicyAndSignerIds()
	 * @generated
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS = 94;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY = 0;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__SIGNER_IDS = 1;

	/**
	 * The feature id for the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__USE_ALIASES = 2;

	/**
	 * The number of structural features of the '<em>Get Policy States For Policy And Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Get Policy States For Policy And Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyAndSignerIdsResponseImpl <em>Get Policy States For Policy And Signer Ids Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyAndSignerIdsResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetPolicyStatesForPolicyAndSignerIdsResponse()
	 * @generated
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE = 95;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Policy States For Policy And Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Policy States For Policy And Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyNameAndSignerIdsImpl <em>Get Policy States For Policy Name And Signer Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyNameAndSignerIdsImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetPolicyStatesForPolicyNameAndSignerIds()
	 * @generated
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS = 96;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS__POLICY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS__SIGNER_IDS = 2;

	/**
	 * The feature id for the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS__USE_ALIASES = 3;

	/**
	 * The number of structural features of the '<em>Get Policy States For Policy Name And Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Get Policy States For Policy Name And Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyNameAndSignerIdsResponseImpl <em>Get Policy States For Policy Name And Signer Ids Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyNameAndSignerIdsResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetPolicyStatesForPolicyNameAndSignerIdsResponse()
	 * @generated
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE = 97;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Policy States For Policy Name And Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Policy States For Policy Name And Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForSignerIdsImpl <em>Get Policy States For Signer Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForSignerIdsImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetPolicyStatesForSignerIds()
	 * @generated
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS = 98;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS = 1;

	/**
	 * The feature id for the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS__USE_ALIASES = 2;

	/**
	 * The number of structural features of the '<em>Get Policy States For Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Get Policy States For Signer Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForSignerIdsResponseImpl <em>Get Policy States For Signer Ids Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForSignerIdsResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetPolicyStatesForSignerIdsResponse()
	 * @generated
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE = 99;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Policy States For Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Policy States For Signer Ids Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCHistoryForConsentImpl <em>Get QC History For Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCHistoryForConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetQCHistoryForConsent()
	 * @generated
	 */
	int GET_QC_HISTORY_FOR_CONSENT = 100;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_HISTORY_FOR_CONSENT__CONSENT_KEY = 0;

	/**
	 * The number of structural features of the '<em>Get QC History For Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_HISTORY_FOR_CONSENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get QC History For Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_HISTORY_FOR_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCHistoryForConsentResponseImpl <em>Get QC History For Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCHistoryForConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetQCHistoryForConsentResponse()
	 * @generated
	 */
	int GET_QC_HISTORY_FOR_CONSENT_RESPONSE = 101;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_HISTORY_FOR_CONSENT_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get QC History For Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_HISTORY_FOR_CONSENT_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get QC History For Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_HISTORY_FOR_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCProblemHistoryForQCProblemImpl <em>Get QC Problem History For QC Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCProblemHistoryForQCProblemImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetQCProblemHistoryForQCProblem()
	 * @generated
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM = 102;

	/**
	 * The feature id for the '<em><b>Qc Problem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY = 1;

	/**
	 * The number of structural features of the '<em>Get QC Problem History For QC Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get QC Problem History For QC Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCProblemHistoryForQCProblemResponseImpl <em>Get QC Problem History For QC Problem Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCProblemHistoryForQCProblemResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetQCProblemHistoryForQCProblemResponse()
	 * @generated
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE = 103;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get QC Problem History For QC Problem Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get QC Problem History For QC Problem Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetSignerIdsForAliasImpl <em>Get Signer Ids For Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetSignerIdsForAliasImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetSignerIdsForAlias()
	 * @generated
	 */
	int GET_SIGNER_IDS_FOR_ALIAS = 104;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_IDS_FOR_ALIAS__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Alias Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_IDS_FOR_ALIAS__ALIAS_SIGNER_ID = 1;

	/**
	 * The number of structural features of the '<em>Get Signer Ids For Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_IDS_FOR_ALIAS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get Signer Ids For Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_IDS_FOR_ALIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetSignerIdsForAliasResponseImpl <em>Get Signer Ids For Alias Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetSignerIdsForAliasResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetSignerIdsForAliasResponse()
	 * @generated
	 */
	int GET_SIGNER_IDS_FOR_ALIAS_RESPONSE = 105;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_IDS_FOR_ALIAS_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Signer Ids For Alias Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_IDS_FOR_ALIAS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Signer Ids For Alias Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_IDS_FOR_ALIAS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetSignerIdTypeImpl <em>Get Signer Id Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetSignerIdTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetSignerIdType()
	 * @generated
	 */
	int GET_SIGNER_ID_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_ID_TYPE__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Signer Id Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_ID_TYPE__SIGNER_ID_TYPE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Get Signer Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_ID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get Signer Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_ID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetSignerIdTypeResponseImpl <em>Get Signer Id Type Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetSignerIdTypeResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetSignerIdTypeResponse()
	 * @generated
	 */
	int GET_SIGNER_ID_TYPE_RESPONSE = 107;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_ID_TYPE_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Signer Id Type Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_ID_TYPE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Signer Id Type Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SIGNER_ID_TYPE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetTemplatesWithPoliciesImpl <em>Get Templates With Policies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetTemplatesWithPoliciesImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetTemplatesWithPolicies()
	 * @generated
	 */
	int GET_TEMPLATES_WITH_POLICIES = 108;

	/**
	 * The feature id for the '<em><b>Policy Key DT Os</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TEMPLATES_WITH_POLICIES__POLICY_KEY_DT_OS = 0;

	/**
	 * The number of structural features of the '<em>Get Templates With Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TEMPLATES_WITH_POLICIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Templates With Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TEMPLATES_WITH_POLICIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetTemplatesWithPoliciesResponseImpl <em>Get Templates With Policies Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.GetTemplatesWithPoliciesResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getGetTemplatesWithPoliciesResponse()
	 * @generated
	 */
	int GET_TEMPLATES_WITH_POLICIES_RESPONSE = 109;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TEMPLATES_WITH_POLICIES_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Get Templates With Policies Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TEMPLATES_WITH_POLICIES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Templates With Policies Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TEMPLATES_WITH_POLICIES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.HashMapImpl <em>Hash Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.HashMapImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getHashMap()
	 * @generated
	 */
	int HASH_MAP = 110;

	/**
	 * The number of structural features of the '<em>Hash Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_MAP_FEATURE_COUNT = ABSTRACT_MAP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hash Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_MAP_OPERATION_COUNT = ABSTRACT_MAP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IllegalArgumentExceptionImpl <em>Illegal Argument Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IllegalArgumentExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIllegalArgumentException()
	 * @generated
	 */
	int ILLEGAL_ARGUMENT_EXCEPTION = 111;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL_ARGUMENT_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Illegal Argument Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL_ARGUMENT_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Illegal Argument Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL_ARGUMENT_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.InconsistentStatusExceptionImpl <em>Inconsistent Status Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.InconsistentStatusExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getInconsistentStatusException()
	 * @generated
	 */
	int INCONSISTENT_STATUS_EXCEPTION = 112;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENT_STATUS_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Inconsistent Status Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENT_STATUS_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inconsistent Status Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENT_STATUS_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.InternalExceptionImpl <em>Internal Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.InternalExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getInternalException()
	 * @generated
	 */
	int INTERNAL_EXCEPTION = 113;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Internal Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Internal Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.InvalidFreeTextExceptionImpl <em>Invalid Free Text Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.InvalidFreeTextExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getInvalidFreeTextException()
	 * @generated
	 */
	int INVALID_FREE_TEXT_EXCEPTION = 114;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_FREE_TEXT_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Invalid Free Text Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_FREE_TEXT_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Invalid Free Text Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_FREE_TEXT_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.InvalidParameterExceptionImpl <em>Invalid Parameter Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.InvalidParameterExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getInvalidParameterException()
	 * @generated
	 */
	int INVALID_PARAMETER_EXCEPTION = 115;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Invalid Parameter Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Invalid Parameter Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.InvalidVersionExceptionImpl <em>Invalid Version Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.InvalidVersionExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getInvalidVersionException()
	 * @generated
	 */
	int INVALID_VERSION_EXCEPTION = 116;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_VERSION_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Invalid Version Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_VERSION_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Invalid Version Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_VERSION_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedImpl <em>Is Consented</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsented()
	 * @generated
	 */
	int IS_CONSENTED = 117;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED__POLICY_KEY = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED__CONFIG = 2;

	/**
	 * The number of structural features of the '<em>Is Consented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Is Consented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromExcludingToExcludingImpl <em>Is Consented From Excluding To Excluding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromExcludingToExcludingImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedFromExcludingToExcluding()
	 * @generated
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING = 118;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__POLICY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__VERSION_FROM = 3;

	/**
	 * The feature id for the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__VERSION_TO = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Is Consented From Excluding To Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Is Consented From Excluding To Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromExcludingToExcludingResponseImpl <em>Is Consented From Excluding To Excluding Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromExcludingToExcludingResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedFromExcludingToExcludingResponse()
	 * @generated
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE = 119;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Is Consented From Excluding To Excluding Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Is Consented From Excluding To Excluding Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromExcludingToIncludingImpl <em>Is Consented From Excluding To Including</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromExcludingToIncludingImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedFromExcludingToIncluding()
	 * @generated
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING = 120;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM = 3;

	/**
	 * The feature id for the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Is Consented From Excluding To Including</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Is Consented From Excluding To Including</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromExcludingToIncludingResponseImpl <em>Is Consented From Excluding To Including Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromExcludingToIncludingResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedFromExcludingToIncludingResponse()
	 * @generated
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE = 121;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Is Consented From Excluding To Including Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Is Consented From Excluding To Including Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromIncludingToExcludingImpl <em>Is Consented From Including To Excluding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromIncludingToExcludingImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedFromIncludingToExcluding()
	 * @generated
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING = 122;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__POLICY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__VERSION_FROM = 3;

	/**
	 * The feature id for the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__VERSION_TO = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Is Consented From Including To Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Is Consented From Including To Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromIncludingToExcludingResponseImpl <em>Is Consented From Including To Excluding Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromIncludingToExcludingResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedFromIncludingToExcludingResponse()
	 * @generated
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE = 123;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Is Consented From Including To Excluding Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Is Consented From Including To Excluding Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromIncludingToIncludingImpl <em>Is Consented From Including To Including</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromIncludingToIncludingImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedFromIncludingToIncluding()
	 * @generated
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING = 124;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__SIGNER_IDS = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__POLICY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__VERSION_FROM = 3;

	/**
	 * The feature id for the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__VERSION_TO = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Is Consented From Including To Including</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Is Consented From Including To Including</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromIncludingToIncludingResponseImpl <em>Is Consented From Including To Including Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedFromIncludingToIncludingResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedFromIncludingToIncludingResponse()
	 * @generated
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE = 125;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Is Consented From Including To Including Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Is Consented From Including To Including Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedResponseImpl <em>Is Consented Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.IsConsentedResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getIsConsentedResponse()
	 * @generated
	 */
	int IS_CONSENTED_RESPONSE = 126;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Is Consented Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Is Consented Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CONSENTED_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.LabelImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 127;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LANG = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListConsentTemplatesImpl <em>List Consent Templates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListConsentTemplatesImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListConsentTemplates()
	 * @generated
	 */
	int LIST_CONSENT_TEMPLATES = 128;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONSENT_TEMPLATES__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Only Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONSENT_TEMPLATES__ONLY_FINAL = 1;

	/**
	 * The number of structural features of the '<em>List Consent Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONSENT_TEMPLATES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>List Consent Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONSENT_TEMPLATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListConsentTemplatesResponseImpl <em>List Consent Templates Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListConsentTemplatesResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListConsentTemplatesResponse()
	 * @generated
	 */
	int LIST_CONSENT_TEMPLATES_RESPONSE = 129;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONSENT_TEMPLATES_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>List Consent Templates Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONSENT_TEMPLATES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Consent Templates Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONSENT_TEMPLATES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListCurrentConsentTemplatesImpl <em>List Current Consent Templates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListCurrentConsentTemplatesImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListCurrentConsentTemplates()
	 * @generated
	 */
	int LIST_CURRENT_CONSENT_TEMPLATES = 130;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CURRENT_CONSENT_TEMPLATES__DOMAIN_NAME = 0;

	/**
	 * The number of structural features of the '<em>List Current Consent Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CURRENT_CONSENT_TEMPLATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Current Consent Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CURRENT_CONSENT_TEMPLATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListCurrentConsentTemplatesResponseImpl <em>List Current Consent Templates Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListCurrentConsentTemplatesResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListCurrentConsentTemplatesResponse()
	 * @generated
	 */
	int LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE = 131;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>List Current Consent Templates Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Current Consent Templates Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListDomainsImpl <em>List Domains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListDomainsImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListDomains()
	 * @generated
	 */
	int LIST_DOMAINS = 132;

	/**
	 * The number of structural features of the '<em>List Domains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DOMAINS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List Domains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DOMAINS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListDomainsResponseImpl <em>List Domains Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListDomainsResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListDomainsResponse()
	 * @generated
	 */
	int LIST_DOMAINS_RESPONSE = 133;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DOMAINS_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>List Domains Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DOMAINS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Domains Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DOMAINS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListModulesImpl <em>List Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListModulesImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListModules()
	 * @generated
	 */
	int LIST_MODULES = 134;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MODULES__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Only Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MODULES__ONLY_FINAL = 1;

	/**
	 * The number of structural features of the '<em>List Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MODULES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>List Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MODULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListModulesResponseImpl <em>List Modules Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListModulesResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListModulesResponse()
	 * @generated
	 */
	int LIST_MODULES_RESPONSE = 135;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MODULES_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>List Modules Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MODULES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Modules Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MODULES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListPoliciesImpl <em>List Policies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListPoliciesImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListPolicies()
	 * @generated
	 */
	int LIST_POLICIES = 136;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_POLICIES__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Only Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_POLICIES__ONLY_FINAL = 1;

	/**
	 * The number of structural features of the '<em>List Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_POLICIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>List Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_POLICIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListPoliciesResponseImpl <em>List Policies Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListPoliciesResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListPoliciesResponse()
	 * @generated
	 */
	int LIST_POLICIES_RESPONSE = 137;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_POLICIES_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>List Policies Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_POLICIES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Policies Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_POLICIES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListSignerIdTypesImpl <em>List Signer Id Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListSignerIdTypesImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListSignerIdTypes()
	 * @generated
	 */
	int LIST_SIGNER_ID_TYPES = 138;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SIGNER_ID_TYPES__DOMAIN_NAME = 0;

	/**
	 * The number of structural features of the '<em>List Signer Id Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SIGNER_ID_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Signer Id Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SIGNER_ID_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ListSignerIdTypesResponseImpl <em>List Signer Id Types Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ListSignerIdTypesResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getListSignerIdTypesResponse()
	 * @generated
	 */
	int LIST_SIGNER_ID_TYPES_RESPONSE = 139;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SIGNER_ID_TYPES_RESPONSE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>List Signer Id Types Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SIGNER_ID_TYPES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Signer Id Types Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SIGNER_ID_TYPES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.MandatoryFieldsExceptionImpl <em>Mandatory Fields Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.MandatoryFieldsExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getMandatoryFieldsException()
	 * @generated
	 */
	int MANDATORY_FIELDS_EXCEPTION = 140;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FIELDS_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Mandatory Fields Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FIELDS_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mandatory Fields Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FIELDS_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.MissingRequiredObjectExceptionImpl <em>Missing Required Object Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.MissingRequiredObjectExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getMissingRequiredObjectException()
	 * @generated
	 */
	int MISSING_REQUIRED_OBJECT_EXCEPTION = 141;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_REQUIRED_OBJECT_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Missing Required Object Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_REQUIRED_OBJECT_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Missing Required Object Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_REQUIRED_OBJECT_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl <em>Module DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getModuleDTO()
	 * @generated
	 */
	int MODULE_DTO = 142;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Assigned Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__ASSIGNED_POLICIES = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__CREATION_DATE = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Finalised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__FINALISED = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__KEY = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__LABEL = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Short Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__SHORT_TEXT = FHIR_ID_DTO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__TEXT = FHIR_ID_DTO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__TITLE = FHIR_ID_DTO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO__UPDATE_DATE = FHIR_ID_DTO_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Module DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Module DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleExpirationsTypeImpl <em>Module Expirations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleExpirationsTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getModuleExpirationsType()
	 * @generated
	 */
	int MODULE_EXPIRATIONS_TYPE = 143;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXPIRATIONS_TYPE__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Module Expirations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXPIRATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module Expirations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXPIRATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleKeyDTOImpl <em>Module Key DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleKeyDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getModuleKeyDTO()
	 * @generated
	 */
	int MODULE_KEY_DTO = 144;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_KEY_DTO__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_KEY_DTO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_KEY_DTO__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Module Key DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_KEY_DTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module Key DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_KEY_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleKeyDTOArrayImpl <em>Module Key DTO Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleKeyDTOArrayImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getModuleKeyDTOArray()
	 * @generated
	 */
	int MODULE_KEY_DTO_ARRAY = 145;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_KEY_DTO_ARRAY__ITEM = 0;

	/**
	 * The number of structural features of the '<em>Module Key DTO Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_KEY_DTO_ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module Key DTO Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_KEY_DTO_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleStateDTOImpl <em>Module State DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleStateDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getModuleStateDTO()
	 * @generated
	 */
	int MODULE_STATE_DTO = 146;

	/**
	 * The feature id for the '<em><b>Consent State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATE_DTO__CONSENT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATE_DTO__KEY = 1;

	/**
	 * The feature id for the '<em><b>Policy Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATE_DTO__POLICY_KEYS = 2;

	/**
	 * The number of structural features of the '<em>Module State DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATE_DTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module State DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATE_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleStatesTypeImpl <em>Module States Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleStatesTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getModuleStatesType()
	 * @generated
	 */
	int MODULE_STATES_TYPE = 147;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATES_TYPE__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Module States Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module States Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.PolicyDTOImpl <em>Policy DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.PolicyDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getPolicyDTO()
	 * @generated
	 */
	int POLICY_DTO = 148;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO__CREATION_DATE = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Finalised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO__FINALISED = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO__KEY = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO__LABEL = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO__UPDATE_DATE = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Policy DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Policy DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.PolicyExpirationsTypeImpl <em>Policy Expirations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.PolicyExpirationsTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getPolicyExpirationsType()
	 * @generated
	 */
	int POLICY_EXPIRATIONS_TYPE = 149;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_EXPIRATIONS_TYPE__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Policy Expirations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_EXPIRATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policy Expirations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_EXPIRATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.PolicyKeyDTOImpl <em>Policy Key DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.PolicyKeyDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getPolicyKeyDTO()
	 * @generated
	 */
	int POLICY_KEY_DTO = 150;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_KEY_DTO__DOMAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_KEY_DTO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_KEY_DTO__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Policy Key DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_KEY_DTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Policy Key DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_KEY_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcdtoImpl <em>Qcdto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.QcdtoImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcdto()
	 * @generated
	 */
	int QCDTO = 151;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO__DATE = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO__EXTERN_PROPERTIES = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inspector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO__INSPECTOR = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO__PROBLEMS = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO__TYPE = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Qcdto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Qcdto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCDTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcHistoryDTOImpl <em>Qc History DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.QcHistoryDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcHistoryDTO()
	 * @generated
	 */
	int QC_HISTORY_DTO = 152;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__FHIR_ID = QCDTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__COMMENT = QCDTO__COMMENT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__DATE = QCDTO__DATE;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__EXTERN_PROPERTIES = QCDTO__EXTERN_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Inspector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__INSPECTOR = QCDTO__INSPECTOR;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__PROBLEMS = QCDTO__PROBLEMS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__TYPE = QCDTO__TYPE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__END_DATE = QCDTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO__START_DATE = QCDTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qc History DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO_FEATURE_COUNT = QCDTO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qc History DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_HISTORY_DTO_OPERATION_COUNT = QCDTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl <em>Qc Problem DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemDTO()
	 * @generated
	 */
	int QC_PROBLEM_DTO = 153;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment Extern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__COMMENT_EXTERN = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment Intern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__COMMENT_INTERN = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__CREATED_AT = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Form Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__FORM_VALUE = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__REF = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scan Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__SCAN_VALUE = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__STATUS = FHIR_ID_DTO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO__UPDATED_AT = FHIR_ID_DTO_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Qc Problem DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Qc Problem DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemHistoryDTOImpl <em>Qc Problem History DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemHistoryDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemHistoryDTO()
	 * @generated
	 */
	int QC_PROBLEM_HISTORY_DTO = 154;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__FHIR_ID = QC_PROBLEM_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment Extern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__COMMENT_EXTERN = QC_PROBLEM_DTO__COMMENT_EXTERN;

	/**
	 * The feature id for the '<em><b>Comment Intern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__COMMENT_INTERN = QC_PROBLEM_DTO__COMMENT_INTERN;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__CREATED_AT = QC_PROBLEM_DTO__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Form Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__FORM_VALUE = QC_PROBLEM_DTO__FORM_VALUE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__REF = QC_PROBLEM_DTO__REF;

	/**
	 * The feature id for the '<em><b>Scan Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__SCAN_VALUE = QC_PROBLEM_DTO__SCAN_VALUE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__STATUS = QC_PROBLEM_DTO__STATUS;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__UPDATED_AT = QC_PROBLEM_DTO__UPDATED_AT;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__END_DATE = QC_PROBLEM_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO__START_DATE = QC_PROBLEM_DTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qc Problem History DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO_FEATURE_COUNT = QC_PROBLEM_DTO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qc Problem History DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_HISTORY_DTO_OPERATION_COUNT = QC_PROBLEM_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeImpl <em>QC Problem Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQCProblemType()
	 * @generated
	 */
	int QC_PROBLEM_TYPE = 155;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE__ERROR = 2;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE__FIELD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE__OCCURRENCE = 5;

	/**
	 * The number of structural features of the '<em>QC Problem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>QC Problem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeActionImpl <em>QC Problem Type Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeActionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQCProblemTypeAction()
	 * @generated
	 */
	int QC_PROBLEM_TYPE_ACTION = 156;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE_ACTION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE_ACTION__ID = 1;

	/**
	 * The number of structural features of the '<em>QC Problem Type Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE_ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>QC Problem Type Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_PROBLEM_TYPE_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCTypeImpl <em>QC Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.QCTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQCType()
	 * @generated
	 */
	int QC_TYPE = 157;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_TYPE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_TYPE__STATUS = 2;

	/**
	 * The number of structural features of the '<em>QC Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>QC Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RefuseConsentImpl <em>Refuse Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.RefuseConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getRefuseConsent()
	 * @generated
	 */
	int REFUSE_CONSENT = 158;

	/**
	 * The feature id for the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE_CONSENT__CONSENT_TEMPLATE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE_CONSENT__SIGNER_IDS = 1;

	/**
	 * The number of structural features of the '<em>Refuse Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE_CONSENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Refuse Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RefuseConsentResponseImpl <em>Refuse Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.RefuseConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getRefuseConsentResponse()
	 * @generated
	 */
	int REFUSE_CONSENT_RESPONSE = 159;

	/**
	 * The number of structural features of the '<em>Refuse Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE_CONSENT_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Refuse Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RemoveScanFromConsentImpl <em>Remove Scan From Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.RemoveScanFromConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getRemoveScanFromConsent()
	 * @generated
	 */
	int REMOVE_SCAN_FROM_CONSENT = 160;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY = 0;

	/**
	 * The feature id for the '<em><b>Fhir Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SCAN_FROM_CONSENT__FHIR_ID = 1;

	/**
	 * The number of structural features of the '<em>Remove Scan From Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SCAN_FROM_CONSENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Remove Scan From Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SCAN_FROM_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RemoveScanFromConsentResponseImpl <em>Remove Scan From Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.RemoveScanFromConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getRemoveScanFromConsentResponse()
	 * @generated
	 */
	int REMOVE_SCAN_FROM_CONSENT_RESPONSE = 161;

	/**
	 * The number of structural features of the '<em>Remove Scan From Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SCAN_FROM_CONSENT_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Remove Scan From Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SCAN_FROM_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RequirementsNotFullfilledExceptionImpl <em>Requirements Not Fullfilled Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.RequirementsNotFullfilledExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getRequirementsNotFullfilledException()
	 * @generated
	 */
	int REQUIREMENTS_NOT_FULLFILLED_EXCEPTION = 162;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_NOT_FULLFILLED_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Requirements Not Fullfilled Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_NOT_FULLFILLED_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Not Fullfilled Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_NOT_FULLFILLED_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnTypeImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 163;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__DOMAINS = 0;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType1Impl <em>Return Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType1Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType1()
	 * @generated
	 */
	int RETURN_TYPE1 = 164;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE1__MODULES = 0;

	/**
	 * The number of structural features of the '<em>Return Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType2Impl <em>Return Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType2Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType2()
	 * @generated
	 */
	int RETURN_TYPE2 = 165;

	/**
	 * The feature id for the '<em><b>Signer Id Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE2__SIGNER_ID_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Return Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType3Impl <em>Return Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType3Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType3()
	 * @generated
	 */
	int RETURN_TYPE3 = 166;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE3__POLICIES = 0;

	/**
	 * The number of structural features of the '<em>Return Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType4Impl <em>Return Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType4Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType4()
	 * @generated
	 */
	int RETURN_TYPE4 = 167;

	/**
	 * The feature id for the '<em><b>Current Consent Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE4__CURRENT_CONSENT_TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>Return Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE4_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType5Impl <em>Return Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType5Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType5()
	 * @generated
	 */
	int RETURN_TYPE5 = 168;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE5__TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>Return Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE5_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE5_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType6Impl <em>Return Type6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType6Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType6()
	 * @generated
	 */
	int RETURN_TYPE6 = 169;

	/**
	 * The feature id for the '<em><b>Consent Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE6__CONSENT_IDS = 0;

	/**
	 * The number of structural features of the '<em>Return Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE6_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE6_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType7Impl <em>Return Type7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType7Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType7()
	 * @generated
	 */
	int RETURN_TYPE7 = 170;

	/**
	 * The feature id for the '<em><b>Consents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE7__CONSENTS = 0;

	/**
	 * The number of structural features of the '<em>Return Type7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE7_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE7_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType8Impl <em>Return Type8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType8Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType8()
	 * @generated
	 */
	int RETURN_TYPE8 = 171;

	/**
	 * The feature id for the '<em><b>Consents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE8__CONSENTS = 0;

	/**
	 * The number of structural features of the '<em>Return Type8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE8_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE8_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType9Impl <em>Return Type9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType9Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType9()
	 * @generated
	 */
	int RETURN_TYPE9 = 172;

	/**
	 * The feature id for the '<em><b>Signed Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE9__SIGNED_POLICIES = 0;

	/**
	 * The number of structural features of the '<em>Return Type9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE9_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE9_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType10Impl <em>Return Type10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType10Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType10()
	 * @generated
	 */
	int RETURN_TYPE10 = 173;

	/**
	 * The feature id for the '<em><b>Consents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE10__CONSENTS = 0;

	/**
	 * The number of structural features of the '<em>Return Type10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE10_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE10_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType11Impl <em>Return Type11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType11Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType11()
	 * @generated
	 */
	int RETURN_TYPE11 = 174;

	/**
	 * The feature id for the '<em><b>Signed Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE11__SIGNED_POLICIES = 0;

	/**
	 * The number of structural features of the '<em>Return Type11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE11_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE11_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType12Impl <em>Return Type12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType12Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType12()
	 * @generated
	 */
	int RETURN_TYPE12 = 175;

	/**
	 * The feature id for the '<em><b>Signed Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE12__SIGNED_POLICIES = 0;

	/**
	 * The number of structural features of the '<em>Return Type12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE12_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE12_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType13Impl <em>Return Type13</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType13Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType13()
	 * @generated
	 */
	int RETURN_TYPE13 = 176;

	/**
	 * The feature id for the '<em><b>Signed Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE13__SIGNED_POLICIES = 0;

	/**
	 * The number of structural features of the '<em>Return Type13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE13_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE13_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType14Impl <em>Return Type14</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType14Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType14()
	 * @generated
	 */
	int RETURN_TYPE14 = 177;

	/**
	 * The feature id for the '<em><b>Qc Histories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE14__QC_HISTORIES = 0;

	/**
	 * The number of structural features of the '<em>Return Type14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE14_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE14_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType15Impl <em>Return Type15</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType15Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType15()
	 * @generated
	 */
	int RETURN_TYPE15 = 178;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE15__SIGNER_IDS = 0;

	/**
	 * The number of structural features of the '<em>Return Type15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE15_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE15_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType16Impl <em>Return Type16</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType16Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType16()
	 * @generated
	 */
	int RETURN_TYPE16 = 179;

	/**
	 * The feature id for the '<em><b>Consent Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE16__CONSENT_TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>Return Type16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE16_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE16_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType17Impl <em>Return Type17</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType17Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType17()
	 * @generated
	 */
	int RETURN_TYPE17 = 180;

	/**
	 * The feature id for the '<em><b>Qc Problem Histories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE17__QC_PROBLEM_HISTORIES = 0;

	/**
	 * The number of structural features of the '<em>Return Type17</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE17_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type17</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE17_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType18Impl <em>Return Type18</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType18Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType18()
	 * @generated
	 */
	int RETURN_TYPE18 = 181;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE18__TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>Return Type18</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE18_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type18</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE18_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType19Impl <em>Return Type19</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType19Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType19()
	 * @generated
	 */
	int RETURN_TYPE19 = 182;

	/**
	 * The feature id for the '<em><b>Consents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE19__CONSENTS = 0;

	/**
	 * The number of structural features of the '<em>Return Type19</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE19_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type19</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE19_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType20Impl <em>Return Type20</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType20Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType20()
	 * @generated
	 */
	int RETURN_TYPE20 = 183;

	/**
	 * The feature id for the '<em><b>Signer Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE20__SIGNER_IDS = 0;

	/**
	 * The number of structural features of the '<em>Return Type20</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE20_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type20</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE20_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType21Impl <em>Return Type21</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType21Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType21()
	 * @generated
	 */
	int RETURN_TYPE21 = 184;

	/**
	 * The feature id for the '<em><b>Consents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE21__CONSENTS = 0;

	/**
	 * The number of structural features of the '<em>Return Type21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE21_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE21_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType22Impl <em>Return Type22</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType22Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType22()
	 * @generated
	 */
	int RETURN_TYPE22 = 185;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE22__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Return Type22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE22_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE22_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType23Impl <em>Return Type23</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType23Impl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getReturnType23()
	 * @generated
	 */
	int RETURN_TYPE23 = 186;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE23__ALIASES = 0;

	/**
	 * The number of structural features of the '<em>Return Type23</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE23_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type23</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE23_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SetQCForConsentImpl <em>Set QC For Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.SetQCForConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getSetQCForConsent()
	 * @generated
	 */
	int SET_QC_FOR_CONSENT = 187;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QC_FOR_CONSENT__CONSENT_KEY = 0;

	/**
	 * The feature id for the '<em><b>Qc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QC_FOR_CONSENT__QC = 1;

	/**
	 * The number of structural features of the '<em>Set QC For Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QC_FOR_CONSENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Set QC For Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QC_FOR_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SetQCForConsentResponseImpl <em>Set QC For Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.SetQCForConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getSetQCForConsentResponse()
	 * @generated
	 */
	int SET_QC_FOR_CONSENT_RESPONSE = 188;

	/**
	 * The number of structural features of the '<em>Set QC For Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QC_FOR_CONSENT_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Set QC For Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QC_FOR_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignedPolicyDTOImpl <em>Signed Policy DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.SignedPolicyDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getSignedPolicyDTO()
	 * @generated
	 */
	int SIGNED_POLICY_DTO = 189;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_POLICY_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_POLICY_DTO__CONSENT_KEY = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_POLICY_DTO__POLICY_KEY = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_POLICY_DTO__STATUS = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signed Policy DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_POLICY_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Signed Policy DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_POLICY_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdDTOImpl <em>Signer Id DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getSignerIdDTO()
	 * @generated
	 */
	int SIGNER_ID_DTO = 190;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO__CREATION_DATE = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO__ID = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO__ID_TYPE = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO__ORDER_NUMBER = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signer Id DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Signer Id DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdDTOArrayImpl <em>Signer Id DTO Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdDTOArrayImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getSignerIdDTOArray()
	 * @generated
	 */
	int SIGNER_ID_DTO_ARRAY = 191;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO_ARRAY__ITEM = 0;

	/**
	 * The number of structural features of the '<em>Signer Id DTO Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO_ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signer Id DTO Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_DTO_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdTypeDTOImpl <em>Signer Id Type DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdTypeDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getSignerIdTypeDTO()
	 * @generated
	 */
	int SIGNER_ID_TYPE_DTO = 192;

	/**
	 * The feature id for the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_TYPE_DTO__FHIR_ID = FHIR_ID_DTO__FHIR_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_TYPE_DTO__COMMENT = FHIR_ID_DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Create Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_TYPE_DTO__CREATE_TIMESTAMP = FHIR_ID_DTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_TYPE_DTO__LABEL = FHIR_ID_DTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_TYPE_DTO__NAME = FHIR_ID_DTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Update Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_TYPE_DTO__UPDATE_TIMESTAMP = FHIR_ID_DTO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Signer Id Type DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_TYPE_DTO_FEATURE_COUNT = FHIR_ID_DTO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Signer Id Type DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNER_ID_TYPE_DTO_OPERATION_COUNT = FHIR_ID_DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownAliasExceptionImpl <em>Unknown Alias Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownAliasExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownAliasException()
	 * @generated
	 */
	int UNKNOWN_ALIAS_EXCEPTION = 193;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_ALIAS_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Alias Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_ALIAS_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Alias Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_ALIAS_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownConsentExceptionImpl <em>Unknown Consent Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownConsentExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownConsentException()
	 * @generated
	 */
	int UNKNOWN_CONSENT_EXCEPTION = 194;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_CONSENT_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Consent Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_CONSENT_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Consent Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_CONSENT_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownConsentTemplateExceptionImpl <em>Unknown Consent Template Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownConsentTemplateExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownConsentTemplateException()
	 * @generated
	 */
	int UNKNOWN_CONSENT_TEMPLATE_EXCEPTION = 195;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_CONSENT_TEMPLATE_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Consent Template Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_CONSENT_TEMPLATE_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Consent Template Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_CONSENT_TEMPLATE_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownDomainExceptionImpl <em>Unknown Domain Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownDomainExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownDomainException()
	 * @generated
	 */
	int UNKNOWN_DOMAIN_EXCEPTION = 196;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_DOMAIN_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Domain Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_DOMAIN_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Domain Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_DOMAIN_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownFhirIdObjectExceptionImpl <em>Unknown Fhir Id Object Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownFhirIdObjectExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownFhirIdObjectException()
	 * @generated
	 */
	int UNKNOWN_FHIR_ID_OBJECT_EXCEPTION = 197;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_FHIR_ID_OBJECT_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Fhir Id Object Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_FHIR_ID_OBJECT_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Fhir Id Object Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_FHIR_ID_OBJECT_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownIDExceptionImpl <em>Unknown ID Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownIDExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownIDException()
	 * @generated
	 */
	int UNKNOWN_ID_EXCEPTION = 198;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_ID_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown ID Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_ID_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown ID Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_ID_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownModuleExceptionImpl <em>Unknown Module Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownModuleExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownModuleException()
	 * @generated
	 */
	int UNKNOWN_MODULE_EXCEPTION = 199;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_MODULE_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Module Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_MODULE_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Module Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_MODULE_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownPolicyExceptionImpl <em>Unknown Policy Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownPolicyExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownPolicyException()
	 * @generated
	 */
	int UNKNOWN_POLICY_EXCEPTION = 200;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_POLICY_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Policy Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_POLICY_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Policy Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_POLICY_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownSignerIdExceptionImpl <em>Unknown Signer Id Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownSignerIdExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownSignerIdException()
	 * @generated
	 */
	int UNKNOWN_SIGNER_ID_EXCEPTION = 201;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SIGNER_ID_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Signer Id Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SIGNER_ID_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Signer Id Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SIGNER_ID_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownSignerIdTypeExceptionImpl <em>Unknown Signer Id Type Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UnknownSignerIdTypeExceptionImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUnknownSignerIdTypeException()
	 * @generated
	 */
	int UNKNOWN_SIGNER_ID_TYPE_EXCEPTION = 202;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SIGNER_ID_TYPE_EXCEPTION__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Unknown Signer Id Type Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SIGNER_ID_TYPE_EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Signer Id Type Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SIGNER_ID_TYPE_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateConsentInUseImpl <em>Update Consent In Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateConsentInUseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUpdateConsentInUse()
	 * @generated
	 */
	int UPDATE_CONSENT_IN_USE = 203;

	/**
	 * The feature id for the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_CONSENT_IN_USE__CONSENT_KEY = 0;

	/**
	 * The feature id for the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_CONSENT_IN_USE__EXTERN_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_CONSENT_IN_USE__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Scan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_CONSENT_IN_USE__SCAN = 3;

	/**
	 * The number of structural features of the '<em>Update Consent In Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_CONSENT_IN_USE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Update Consent In Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_CONSENT_IN_USE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateConsentInUseResponseImpl <em>Update Consent In Use Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateConsentInUseResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getUpdateConsentInUseResponse()
	 * @generated
	 */
	int UPDATE_CONSENT_IN_USE_RESPONSE = 204;

	/**
	 * The number of structural features of the '<em>Update Consent In Use Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_CONSENT_IN_USE_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Update Consent In Use Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_CONSENT_IN_USE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ValidateConsentImpl <em>Validate Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ValidateConsentImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getValidateConsent()
	 * @generated
	 */
	int VALIDATE_CONSENT = 205;

	/**
	 * The feature id for the '<em><b>Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONSENT__CONSENT = 0;

	/**
	 * The feature id for the '<em><b>Allow Revoke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONSENT__ALLOW_REVOKE = 1;

	/**
	 * The feature id for the '<em><b>Validate Scan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONSENT__VALIDATE_SCAN = 2;

	/**
	 * The number of structural features of the '<em>Validate Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONSENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Validate Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONSENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ValidateConsentResponseImpl <em>Validate Consent Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ValidateConsentResponseImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getValidateConsentResponse()
	 * @generated
	 */
	int VALIDATE_CONSENT_RESPONSE = 206;

	/**
	 * The number of structural features of the '<em>Validate Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONSENT_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Validate Consent Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONSENT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ValidFromPropertiesDTOImpl <em>Valid From Properties DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.ValidFromPropertiesDTOImpl
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getValidFromPropertiesDTO()
	 * @generated
	 */
	int VALID_FROM_PROPERTIES_DTO = 207;

	/**
	 * The feature id for the '<em><b>Fixed Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_FROM_PROPERTIES_DTO__FIXED_VALID_FROM_DATE = 0;

	/**
	 * The feature id for the '<em><b>Invalid Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_FROM_PROPERTIES_DTO__INVALID_PERIOD = 1;

	/**
	 * The number of structural features of the '<em>Valid From Properties DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_FROM_PROPERTIES_DTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Valid From Properties DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_FROM_PROPERTIES_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus <em>Consent Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentStatus()
	 * @generated
	 */
	int CONSENT_STATUS = 208;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType <em>Consent Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentStatusType()
	 * @generated
	 */
	int CONSENT_STATUS_TYPE = 209;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType <em>Consent Template Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentTemplateType()
	 * @generated
	 */
	int CONSENT_TEMPLATE_TYPE = 210;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextType <em>Free Text Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getFreeTextType()
	 * @generated
	 */
	int FREE_TEXT_TYPE = 211;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus <em>Qc Problem Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemStatus()
	 * @generated
	 */
	int QC_PROBLEM_STATUS = 212;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError <em>Qc Problem Type Error</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemTypeError()
	 * @generated
	 */
	int QC_PROBLEM_TYPE_ERROR = 213;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField <em>Qc Problem Type Field</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemTypeField()
	 * @generated
	 */
	int QC_PROBLEM_TYPE_FIELD = 214;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence <em>Qc Problem Type Occurrence</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemTypeOccurrence()
	 * @generated
	 */
	int QC_PROBLEM_TYPE_OCCURRENCE = 215;

	/**
	 * The meta object id for the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus <em>Qc Type Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcTypeStatus()
	 * @generated
	 */
	int QC_TYPE_STATUS = 216;

	/**
	 * The meta object id for the '<em>Consent Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentStatusObject()
	 * @generated
	 */
	int CONSENT_STATUS_OBJECT = 217;

	/**
	 * The meta object id for the '<em>Consent Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentStatusTypeObject()
	 * @generated
	 */
	int CONSENT_STATUS_TYPE_OBJECT = 218;

	/**
	 * The meta object id for the '<em>Consent Template Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getConsentTemplateTypeObject()
	 * @generated
	 */
	int CONSENT_TEMPLATE_TYPE_OBJECT = 219;

	/**
	 * The meta object id for the '<em>Free Text Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextType
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getFreeTextTypeObject()
	 * @generated
	 */
	int FREE_TEXT_TYPE_OBJECT = 220;

	/**
	 * The meta object id for the '<em>Qc Problem Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemStatusObject()
	 * @generated
	 */
	int QC_PROBLEM_STATUS_OBJECT = 221;

	/**
	 * The meta object id for the '<em>Qc Problem Type Error Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemTypeErrorObject()
	 * @generated
	 */
	int QC_PROBLEM_TYPE_ERROR_OBJECT = 222;

	/**
	 * The meta object id for the '<em>Qc Problem Type Field Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemTypeFieldObject()
	 * @generated
	 */
	int QC_PROBLEM_TYPE_FIELD_OBJECT = 223;

	/**
	 * The meta object id for the '<em>Qc Problem Type Occurrence Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcProblemTypeOccurrenceObject()
	 * @generated
	 */
	int QC_PROBLEM_TYPE_OCCURRENCE_OBJECT = 224;

	/**
	 * The meta object id for the '<em>Qc Type Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus
	 * @see org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl#getQcTypeStatusObject()
	 * @generated
	 */
	int QC_TYPE_STATUS_OBJECT = 225;


	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AbstractMap <em>Abstract Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Map</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AbstractMap
	 * @generated
	 */
	EClass getAbstractMap();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddAlias <em>Add Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Alias</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddAlias
	 * @generated
	 */
	EClass getAddAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AddAlias#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddAlias#getDomainName()
	 * @see #getAddAlias()
	 * @generated
	 */
	EAttribute getAddAlias_DomainName();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddAlias#getOriginalSignerId <em>Original Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddAlias#getOriginalSignerId()
	 * @see #getAddAlias()
	 * @generated
	 */
	EReference getAddAlias_OriginalSignerId();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddAlias#getAliasSignerId <em>Alias Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddAlias#getAliasSignerId()
	 * @see #getAddAlias()
	 * @generated
	 */
	EReference getAddAlias_AliasSignerId();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddAliasResponse <em>Add Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Alias Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddAliasResponse
	 * @generated
	 */
	EClass getAddAliasResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsent <em>Add Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsent
	 * @generated
	 */
	EClass getAddConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsent#getConsent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsent#getConsent()
	 * @see #getAddConsent()
	 * @generated
	 */
	EReference getAddConsent_Consent();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut <em>Add Consent Opt Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Consent Opt Out</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut
	 * @generated
	 */
	EClass getAddConsentOptOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut#getConsentTemplateKey <em>Consent Template Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Template Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut#getConsentTemplateKey()
	 * @see #getAddConsentOptOut()
	 * @generated
	 */
	EReference getAddConsentOptOut_ConsentTemplateKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut#getSignerIds()
	 * @see #getAddConsentOptOut()
	 * @generated
	 */
	EReference getAddConsentOptOut_SignerIds();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse <em>Add Consent Opt Out Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Consent Opt Out Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse
	 * @generated
	 */
	EClass getAddConsentOptOutResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse#getReturn()
	 * @see #getAddConsentOptOutResponse()
	 * @generated
	 */
	EReference getAddConsentOptOutResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentResponse <em>Add Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentResponse
	 * @generated
	 */
	EClass getAddConsentResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent <em>Add Scan To Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Scan To Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent
	 * @generated
	 */
	EClass getAddScanToConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getConsentKey()
	 * @see #getAddScanToConsent()
	 * @generated
	 */
	EReference getAddScanToConsent_ConsentKey();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getScanBase64 <em>Scan Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan Base64</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getScanBase64()
	 * @see #getAddScanToConsent()
	 * @generated
	 */
	EAttribute getAddScanToConsent_ScanBase64();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getFileType()
	 * @see #getAddScanToConsent()
	 * @generated
	 */
	EAttribute getAddScanToConsent_FileType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent#getFileName()
	 * @see #getAddScanToConsent()
	 * @generated
	 */
	EAttribute getAddScanToConsent_FileName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsentResponse <em>Add Scan To Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Scan To Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsentResponse
	 * @generated
	 */
	EClass getAddScanToConsentResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent <em>Add Signer Id To Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Signer Id To Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent
	 * @generated
	 */
	EClass getAddSignerIdToConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent#getConsentKey()
	 * @see #getAddSignerIdToConsent()
	 * @generated
	 */
	EReference getAddSignerIdToConsent_ConsentKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent#getSignerId <em>Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent#getSignerId()
	 * @see #getAddSignerIdToConsent()
	 * @generated
	 */
	EReference getAddSignerIdToConsent_SignerId();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsentResponse <em>Add Signer Id To Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Signer Id To Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsentResponse
	 * @generated
	 */
	EClass getAddSignerIdToConsentResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId <em>Add Signer Id To Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Signer Id To Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId
	 * @generated
	 */
	EClass getAddSignerIdToSignerId();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getDomainName()
	 * @see #getAddSignerIdToSignerId()
	 * @generated
	 */
	EAttribute getAddSignerIdToSignerId_DomainName();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getExistentSignerId <em>Existent Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Existent Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getExistentSignerId()
	 * @see #getAddSignerIdToSignerId()
	 * @generated
	 */
	EReference getAddSignerIdToSignerId_ExistentSignerId();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getNewSignerId <em>New Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getNewSignerId()
	 * @see #getAddSignerIdToSignerId()
	 * @generated
	 */
	EReference getAddSignerIdToSignerId_NewSignerId();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerIdResponse <em>Add Signer Id To Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Signer Id To Signer Id Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerIdResponse
	 * @generated
	 */
	EClass getAddSignerIdToSignerIdResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO <em>Assigned Module DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assigned Module DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO
	 * @generated
	 */
	EClass getAssignedModuleDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getComment()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EAttribute getAssignedModuleDTO_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDefaultConsentStatus <em>Default Consent Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Consent Status</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDefaultConsentStatus()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EAttribute getAssignedModuleDTO_DefaultConsentStatus();

	/**
	 * Returns the meta object for the attribute list '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDisplayCheckboxes <em>Display Checkboxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Display Checkboxes</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getDisplayCheckboxes()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EAttribute getAssignedModuleDTO_DisplayCheckboxes();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getExpirationProperties <em>Expiration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expiration Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getExpirationProperties()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EReference getAssignedModuleDTO_ExpirationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getExternProperties()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EAttribute getAssignedModuleDTO_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#isMandatory()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EAttribute getAssignedModuleDTO_Mandatory();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getModule()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EReference getAssignedModuleDTO_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getOrderNumber <em>Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Number</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getOrderNumber()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EAttribute getAssignedModuleDTO_OrderNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO#getParent()
	 * @see #getAssignedModuleDTO()
	 * @generated
	 */
	EReference getAssignedModuleDTO_Parent();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO <em>Assigned Policy DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assigned Policy DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO
	 * @generated
	 */
	EClass getAssignedPolicyDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getComment()
	 * @see #getAssignedPolicyDTO()
	 * @generated
	 */
	EAttribute getAssignedPolicyDTO_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getExpirationProperties <em>Expiration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expiration Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getExpirationProperties()
	 * @see #getAssignedPolicyDTO()
	 * @generated
	 */
	EReference getAssignedPolicyDTO_ExpirationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getExternProperties()
	 * @see #getAssignedPolicyDTO()
	 * @generated
	 */
	EAttribute getAssignedPolicyDTO_ExternProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO#getPolicy()
	 * @see #getAssignedPolicyDTO()
	 * @generated
	 */
	EReference getAssignedPolicyDTO_Policy();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ChildrenType <em>Children Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Children Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ChildrenType
	 * @generated
	 */
	EClass getChildrenType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ChildrenType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ChildrenType#getEntry()
	 * @see #getChildrenType()
	 * @generated
	 */
	EReference getChildrenType_Entry();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO <em>Consent Date Values DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Date Values DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO
	 * @generated
	 */
	EClass getConsentDateValuesDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getConsentExpirationDate <em>Consent Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consent Expiration Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getConsentExpirationDate()
	 * @see #getConsentDateValuesDTO()
	 * @generated
	 */
	EAttribute getConsentDateValuesDTO_ConsentExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getGicsConsentDate <em>Gics Consent Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gics Consent Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getGicsConsentDate()
	 * @see #getConsentDateValuesDTO()
	 * @generated
	 */
	EAttribute getConsentDateValuesDTO_GicsConsentDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getLegalConsentDate <em>Legal Consent Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legal Consent Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getLegalConsentDate()
	 * @see #getConsentDateValuesDTO()
	 * @generated
	 */
	EAttribute getConsentDateValuesDTO_LegalConsentDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getMaxPolicyExpirationDate <em>Max Policy Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Policy Expiration Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getMaxPolicyExpirationDate()
	 * @see #getConsentDateValuesDTO()
	 * @generated
	 */
	EAttribute getConsentDateValuesDTO_MaxPolicyExpirationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getModuleExpirations <em>Module Expirations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Expirations</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getModuleExpirations()
	 * @see #getConsentDateValuesDTO()
	 * @generated
	 */
	EReference getConsentDateValuesDTO_ModuleExpirations();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getPolicyExpirations <em>Policy Expirations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Expirations</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getPolicyExpirations()
	 * @see #getConsentDateValuesDTO()
	 * @generated
	 */
	EReference getConsentDateValuesDTO_PolicyExpirations();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO <em>Consent DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO
	 * @generated
	 */
	EClass getConsentDTO();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getFreeTextVals <em>Free Text Vals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Free Text Vals</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getFreeTextVals()
	 * @see #getConsentDTO()
	 * @generated
	 */
	EReference getConsentDTO_FreeTextVals();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getPatientSignatureBase64 <em>Patient Signature Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Signature Base64</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getPatientSignatureBase64()
	 * @see #getConsentDTO()
	 * @generated
	 */
	EAttribute getConsentDTO_PatientSignatureBase64();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getPhysicianSignatureBase64 <em>Physician Signature Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physician Signature Base64</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getPhysicianSignatureBase64()
	 * @see #getConsentDTO()
	 * @generated
	 */
	EAttribute getConsentDTO_PhysicianSignatureBase64();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getScans <em>Scans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scans</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO#getScans()
	 * @see #getConsentDTO()
	 * @generated
	 */
	EReference getConsentDTO_Scans();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO <em>Consent Key DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Key DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO
	 * @generated
	 */
	EClass getConsentKeyDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getConsentDate <em>Consent Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consent Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getConsentDate()
	 * @see #getConsentKeyDTO()
	 * @generated
	 */
	EAttribute getConsentKeyDTO_ConsentDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getConsentTemplateKey <em>Consent Template Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Template Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getConsentTemplateKey()
	 * @see #getConsentKeyDTO()
	 * @generated
	 */
	EReference getConsentKeyDTO_ConsentTemplateKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getSignerIds()
	 * @see #getConsentKeyDTO()
	 * @generated
	 */
	EReference getConsentKeyDTO_SignerIds();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO <em>Consent Light DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Light DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO
	 * @generated
	 */
	EClass getConsentLightDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getComment()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getConsentDates <em>Consent Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Dates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getConsentDates()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EReference getConsentLightDTO_ConsentDates();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getCreationDate()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_CreationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getExpirationProperties <em>Expiration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expiration Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getExpirationProperties()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EReference getConsentLightDTO_ExpirationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getExternProperties()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isHasPatientSignature <em>Has Patient Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Patient Signature</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isHasPatientSignature()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_HasPatientSignature();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getKey()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EReference getConsentLightDTO_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getModuleStates <em>Module States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module States</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getModuleStates()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EReference getConsentLightDTO_ModuleStates();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isPatientSignatureIsFromGuardian <em>Patient Signature Is From Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Signature Is From Guardian</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#isPatientSignatureIsFromGuardian()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_PatientSignatureIsFromGuardian();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPatientSigningDate <em>Patient Signing Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Signing Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPatientSigningDate()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_PatientSigningDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPatientSigningPlace <em>Patient Signing Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Signing Place</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPatientSigningPlace()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_PatientSigningPlace();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianId <em>Physician Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physician Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianId()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_PhysicianId();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianSigningDate <em>Physician Signing Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physician Signing Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianSigningDate()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_PhysicianSigningDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianSigningPlace <em>Physician Signing Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physician Signing Place</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getPhysicianSigningPlace()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_PhysicianSigningPlace();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getQualityControl <em>Quality Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quality Control</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getQualityControl()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EReference getConsentLightDTO_QualityControl();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getTemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getTemplateType()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_TemplateType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getUpdateDate()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_UpdateDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getValidFromDate()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EAttribute getConsentLightDTO_ValidFromDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getValidFromProperties <em>Valid From Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid From Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO#getValidFromProperties()
	 * @see #getConsentLightDTO()
	 * @generated
	 */
	EReference getConsentLightDTO_ValidFromProperties();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO <em>Consent Scan DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Scan DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO
	 * @generated
	 */
	EClass getConsentScanDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getBase64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base64</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getBase64()
	 * @see #getConsentScanDTO()
	 * @generated
	 */
	EAttribute getConsentScanDTO_Base64();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getConsentKey()
	 * @see #getConsentScanDTO()
	 * @generated
	 */
	EReference getConsentScanDTO_ConsentKey();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getFileName()
	 * @see #getConsentScanDTO()
	 * @generated
	 */
	EAttribute getConsentScanDTO_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getFileType()
	 * @see #getConsentScanDTO()
	 * @generated
	 */
	EAttribute getConsentScanDTO_FileType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getUploadDate <em>Upload Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upload Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO#getUploadDate()
	 * @see #getConsentScanDTO()
	 * @generated
	 */
	EAttribute getConsentScanDTO_UploadDate();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO <em>Consent Template DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Template DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO
	 * @generated
	 */
	EClass getConsentTemplateDTO();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getAssignedModules <em>Assigned Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigned Modules</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getAssignedModules()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_AssignedModules();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getComment()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getCreationDate()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_CreationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getExpirationProperties <em>Expiration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expiration Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getExpirationProperties()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_ExpirationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getExternProperties()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#isFinalised <em>Finalised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#isFinalised()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_Finalised();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getFooter()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_Footer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getFreeTextDefs <em>Free Text Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Free Text Defs</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getFreeTextDefs()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_FreeTextDefs();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getHeader()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getKey()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getLabel()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedConsentTemplates <em>Mapped Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Consent Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedConsentTemplates()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_MappedConsentTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedObjectionTemplates <em>Mapped Objection Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Objection Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedObjectionTemplates()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_MappedObjectionTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedOptOutConsentTemplates <em>Mapped Opt Out Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Opt Out Consent Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedOptOutConsentTemplates()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_MappedOptOutConsentTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedRefusalTemplates <em>Mapped Refusal Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Refusal Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedRefusalTemplates()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_MappedRefusalTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedRevocationTemplates <em>Mapped Revocation Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Revocation Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getMappedRevocationTemplates()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_MappedRevocationTemplates();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getScanBase64 <em>Scan Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan Base64</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getScanBase64()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_ScanBase64();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getScanFileType <em>Scan File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan File Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getScanFileType()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_ScanFileType();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getStructure()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_Structure();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getTitle()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getType()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getUpdateDate()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_UpdateDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getValidFromProperties <em>Valid From Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid From Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getValidFromProperties()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EReference getConsentTemplateDTO_ValidFromProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getVersionLabel <em>Version Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO#getVersionLabel()
	 * @see #getConsentTemplateDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateDTO_VersionLabel();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO <em>Consent Template Key DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Template Key DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO
	 * @generated
	 */
	EClass getConsentTemplateKeyDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO#getDomainName()
	 * @see #getConsentTemplateKeyDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateKeyDTO_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO#getName()
	 * @see #getConsentTemplateKeyDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateKeyDTO_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO#getVersion()
	 * @see #getConsentTemplateKeyDTO()
	 * @generated
	 */
	EAttribute getConsentTemplateKeyDTO_Version();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO <em>Consent Template Structure DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent Template Structure DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO
	 * @generated
	 */
	EClass getConsentTemplateStructureDTO();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Children</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO#getChildren()
	 * @see #getConsentTemplateStructureDTO()
	 * @generated
	 */
	EReference getConsentTemplateStructureDTO_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO#getFirstLevelModules <em>First Level Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>First Level Modules</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO#getFirstLevelModules()
	 * @see #getConsentTemplateStructureDTO()
	 * @generated
	 */
	EReference getConsentTemplateStructureDTO_FirstLevelModules();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter <em>Count Consents For Domain With Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Consents For Domain With Filter</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter
	 * @generated
	 */
	EClass getCountConsentsForDomainWithFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter#getDomainName()
	 * @see #getCountConsentsForDomainWithFilter()
	 * @generated
	 */
	EAttribute getCountConsentsForDomainWithFilter_DomainName();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter#getConfig()
	 * @see #getCountConsentsForDomainWithFilter()
	 * @generated
	 */
	EReference getCountConsentsForDomainWithFilter_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse <em>Count Consents For Domain With Filter Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Consents For Domain With Filter Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse
	 * @generated
	 */
	EClass getCountConsentsForDomainWithFilterResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse#getReturn()
	 * @see #getCountConsentsForDomainWithFilterResponse()
	 * @generated
	 */
	EAttribute getCountConsentsForDomainWithFilterResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.CountSignedPolicies <em>Count Signed Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Signed Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountSignedPolicies
	 * @generated
	 */
	EClass getCountSignedPolicies();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.CountSignedPolicies#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountSignedPolicies#getDomainName()
	 * @see #getCountSignedPolicies()
	 * @generated
	 */
	EAttribute getCountSignedPolicies_DomainName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.CountSignedPoliciesResponse <em>Count Signed Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Signed Policies Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountSignedPoliciesResponse
	 * @generated
	 */
	EClass getCountSignedPoliciesResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.CountSignedPoliciesResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountSignedPoliciesResponse#getReturn()
	 * @see #getCountSignedPoliciesResponse()
	 * @generated
	 */
	EAttribute getCountSignedPoliciesResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias <em>Deactivate Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deactivate Alias</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias
	 * @generated
	 */
	EClass getDeactivateAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias#getDomainName()
	 * @see #getDeactivateAlias()
	 * @generated
	 */
	EAttribute getDeactivateAlias_DomainName();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias#getOriginalSignerId <em>Original Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias#getOriginalSignerId()
	 * @see #getDeactivateAlias()
	 * @generated
	 */
	EReference getDeactivateAlias_OriginalSignerId();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias#getAliasSignerId <em>Alias Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias#getAliasSignerId()
	 * @see #getDeactivateAlias()
	 * @generated
	 */
	EReference getDeactivateAlias_AliasSignerId();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeactivateAliasResponse <em>Deactivate Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deactivate Alias Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeactivateAliasResponse
	 * @generated
	 */
	EClass getDeactivateAliasResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddAlias <em>Add Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Alias</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddAlias()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddAlias();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddAliasResponse <em>Add Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Alias Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddAliasResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddAliasResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsent <em>Add Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentOptOut <em>Add Consent Opt Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Consent Opt Out</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentOptOut()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddConsentOptOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentOptOutResponse <em>Add Consent Opt Out Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Consent Opt Out Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentOptOutResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddConsentOptOutResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentResponse <em>Add Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddScanToConsent <em>Add Scan To Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Scan To Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddScanToConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddScanToConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddScanToConsentResponse <em>Add Scan To Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Scan To Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddScanToConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddScanToConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToConsent <em>Add Signer Id To Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Signer Id To Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddSignerIdToConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToConsentResponse <em>Add Signer Id To Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Signer Id To Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddSignerIdToConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToSignerId <em>Add Signer Id To Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Signer Id To Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToSignerId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddSignerIdToSignerId();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToSignerIdResponse <em>Add Signer Id To Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Signer Id To Signer Id Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToSignerIdResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddSignerIdToSignerIdResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountConsentsForDomainWithFilter <em>Count Consents For Domain With Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count Consents For Domain With Filter</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountConsentsForDomainWithFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CountConsentsForDomainWithFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountConsentsForDomainWithFilterResponse <em>Count Consents For Domain With Filter Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count Consents For Domain With Filter Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountConsentsForDomainWithFilterResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CountConsentsForDomainWithFilterResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountSignedPolicies <em>Count Signed Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count Signed Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountSignedPolicies()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CountSignedPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountSignedPoliciesResponse <em>Count Signed Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count Signed Policies Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountSignedPoliciesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CountSignedPoliciesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeactivateAlias <em>Deactivate Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deactivate Alias</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeactivateAlias()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeactivateAlias();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeactivateAliasResponse <em>Deactivate Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deactivate Alias Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeactivateAliasResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeactivateAliasResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDuplicateEntryException <em>Duplicate Entry Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duplicate Entry Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDuplicateEntryException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DuplicateEntryException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerId <em>Get Aliases For Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Aliases For Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAliasesForSignerId();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIdResponse <em>Get Aliases For Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Aliases For Signer Id Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIdResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAliasesForSignerIdResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIds <em>Get Aliases For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Aliases For Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIds()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAliasesForSignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIdsResponse <em>Get Aliases For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Aliases For Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIdsResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAliasesForSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentedIdsFor <em>Get All Consented Ids For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consented Ids For</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentedIdsFor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentedIdsFor();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentedIdsForResponse <em>Get All Consented Ids For Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consented Ids For Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentedIdsForResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentedIdsForResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForConsentTemplate <em>Get All Consents For Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consents For Consent Template</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForConsentTemplate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentsForConsentTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForConsentTemplateResponse <em>Get All Consents For Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consents For Consent Template Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForConsentTemplateResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentsForConsentTemplateResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomain <em>Get All Consents For Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consents For Domain</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentsForDomain();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainResponse <em>Get All Consents For Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consents For Domain Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentsForDomainResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainWithoutScan <em>Get All Consents For Domain Without Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consents For Domain Without Scan</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainWithoutScan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentsForDomainWithoutScan();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainWithoutScanResponse <em>Get All Consents For Domain Without Scan Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consents For Domain Without Scan Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainWithoutScanResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentsForDomainWithoutScanResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForSignerIds <em>Get All Consents For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consents For Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForSignerIds()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentsForSignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForSignerIdsResponse <em>Get All Consents For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Consents For Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForSignerIdsResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllConsentsForSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllIdsForSignerIdType <em>Get All Ids For Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Ids For Signer Id Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllIdsForSignerIdType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllIdsForSignerIdType();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllIdsForSignerIdTypeResponse <em>Get All Ids For Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get All Ids For Signer Id Type Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllIdsForSignerIdTypeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetAllIdsForSignerIdTypeResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsent <em>Get Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentDates <em>Get Consent Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Dates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentDates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentDates();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentDatesResponse <em>Get Consent Dates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Dates Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentDatesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentDatesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentLight <em>Get Consent Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Light</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentLight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentLight();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentLightResponse <em>Get Consent Light Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Light Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentLightResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentLightResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentResponse <em>Get Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentsForDomainPaginated <em>Get Consents For Domain Paginated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consents For Domain Paginated</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentsForDomainPaginated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentsForDomainPaginated();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentsForDomainPaginatedResponse <em>Get Consents For Domain Paginated Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consents For Domain Paginated Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentsForDomainPaginatedResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentsForDomainPaginatedResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusType <em>Get Consent Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusType();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToExcluding <em>Get Consent Status Type From Excluding To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type From Excluding To Excluding</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToExcluding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeFromExcludingToExcluding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToExcludingResponse <em>Get Consent Status Type From Excluding To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type From Excluding To Excluding Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToExcludingResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeFromExcludingToExcludingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToIncluding <em>Get Consent Status Type From Excluding To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type From Excluding To Including</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToIncluding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeFromExcludingToIncluding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToIncludingResponse <em>Get Consent Status Type From Excluding To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type From Excluding To Including Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToIncludingResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeFromExcludingToIncludingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToExcluding <em>Get Consent Status Type From Including To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type From Including To Excluding</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToExcluding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeFromIncludingToExcluding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToExcludingResponse <em>Get Consent Status Type From Including To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type From Including To Excluding Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToExcludingResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeFromIncludingToExcludingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToIncluding <em>Get Consent Status Type From Including To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type From Including To Including</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToIncluding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeFromIncludingToIncluding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToIncludingResponse <em>Get Consent Status Type From Including To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type From Including To Including Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToIncludingResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeFromIncludingToIncludingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeResponse <em>Get Consent Status Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Status Type Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentStatusTypeResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentTemplate <em>Get Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Template</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentTemplate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentTemplateResponse <em>Get Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Consent Template Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentTemplateResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConsentTemplateResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentForSignerIdsAndCT <em>Get Current Consent For Signer Ids And CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Current Consent For Signer Ids And CT</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentForSignerIdsAndCT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCurrentConsentForSignerIdsAndCT();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentForSignerIdsAndCTResponse <em>Get Current Consent For Signer Ids And CT Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Current Consent For Signer Ids And CT Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentForSignerIdsAndCTResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCurrentConsentForSignerIdsAndCTResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentTemplate <em>Get Current Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Current Consent Template</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentTemplate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCurrentConsentTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentTemplateResponse <em>Get Current Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Current Consent Template Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentTemplateResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCurrentConsentTemplateResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentPolicyStatesForSignerIds <em>Get Current Policy States For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Current Policy States For Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentPolicyStatesForSignerIds()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCurrentPolicyStatesForSignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentPolicyStatesForSignerIdsResponse <em>Get Current Policy States For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Current Policy States For Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentPolicyStatesForSignerIdsResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCurrentPolicyStatesForSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetDomain <em>Get Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Domain</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetDomain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetDomain();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetDomainResponse <em>Get Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Domain Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetDomainResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetDomainResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetMappedTemplatesForSignerId <em>Get Mapped Templates For Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Mapped Templates For Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetMappedTemplatesForSignerId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetMappedTemplatesForSignerId();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetMappedTemplatesForSignerIdResponse <em>Get Mapped Templates For Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Mapped Templates For Signer Id Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetMappedTemplatesForSignerIdResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetMappedTemplatesForSignerIdResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetModule <em>Get Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Module</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetModule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetModuleResponse <em>Get Module Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Module Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetModuleResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetModuleResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetObjectByFhirID <em>Get Object By Fhir ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Object By Fhir ID</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetObjectByFhirID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetObjectByFhirID();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetObjectByFhirIDResponse <em>Get Object By Fhir ID Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Object By Fhir ID Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetObjectByFhirIDResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetObjectByFhirIDResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicy <em>Get Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Policy</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyResponse <em>Get Policy Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Policy Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPolicyResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyAndSignerIds <em>Get Policy States For Policy And Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Policy States For Policy And Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyAndSignerIds()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPolicyStatesForPolicyAndSignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyAndSignerIdsResponse <em>Get Policy States For Policy And Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Policy States For Policy And Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyAndSignerIdsResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPolicyStatesForPolicyAndSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyNameAndSignerIds <em>Get Policy States For Policy Name And Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Policy States For Policy Name And Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyNameAndSignerIds()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyNameAndSignerIdsResponse <em>Get Policy States For Policy Name And Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Policy States For Policy Name And Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyNameAndSignerIdsResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForSignerIds <em>Get Policy States For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Policy States For Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForSignerIds()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPolicyStatesForSignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForSignerIdsResponse <em>Get Policy States For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Policy States For Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForSignerIdsResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPolicyStatesForSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCHistoryForConsent <em>Get QC History For Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get QC History For Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCHistoryForConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetQCHistoryForConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCHistoryForConsentResponse <em>Get QC History For Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get QC History For Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCHistoryForConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetQCHistoryForConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCProblemHistoryForQCProblem <em>Get QC Problem History For QC Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get QC Problem History For QC Problem</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCProblemHistoryForQCProblem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetQCProblemHistoryForQCProblem();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCProblemHistoryForQCProblemResponse <em>Get QC Problem History For QC Problem Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get QC Problem History For QC Problem Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCProblemHistoryForQCProblemResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetQCProblemHistoryForQCProblemResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdsForAlias <em>Get Signer Ids For Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Signer Ids For Alias</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdsForAlias()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetSignerIdsForAlias();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdsForAliasResponse <em>Get Signer Ids For Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Signer Ids For Alias Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdsForAliasResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetSignerIdsForAliasResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdType <em>Get Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Signer Id Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetSignerIdType();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdTypeResponse <em>Get Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Signer Id Type Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdTypeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetSignerIdTypeResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetTemplatesWithPolicies <em>Get Templates With Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Templates With Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetTemplatesWithPolicies()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetTemplatesWithPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetTemplatesWithPoliciesResponse <em>Get Templates With Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Templates With Policies Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetTemplatesWithPoliciesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetTemplatesWithPoliciesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIllegalArgumentException <em>Illegal Argument Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Illegal Argument Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIllegalArgumentException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IllegalArgumentException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInconsistentStatusException <em>Inconsistent Status Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inconsistent Status Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInconsistentStatusException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InconsistentStatusException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInternalException <em>Internal Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInternalException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InternalException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidFreeTextException <em>Invalid Free Text Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invalid Free Text Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidFreeTextException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InvalidFreeTextException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidParameterException <em>Invalid Parameter Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invalid Parameter Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidParameterException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InvalidParameterException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidVersionException <em>Invalid Version Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invalid Version Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidVersionException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InvalidVersionException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsented <em>Is Consented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsented()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsented();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToExcluding <em>Is Consented From Excluding To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented From Excluding To Excluding</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToExcluding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedFromExcludingToExcluding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToExcludingResponse <em>Is Consented From Excluding To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented From Excluding To Excluding Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToExcludingResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedFromExcludingToExcludingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToIncluding <em>Is Consented From Excluding To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented From Excluding To Including</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToIncluding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedFromExcludingToIncluding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToIncludingResponse <em>Is Consented From Excluding To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented From Excluding To Including Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToIncludingResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedFromExcludingToIncludingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToExcluding <em>Is Consented From Including To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented From Including To Excluding</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToExcluding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedFromIncludingToExcluding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToExcludingResponse <em>Is Consented From Including To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented From Including To Excluding Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToExcludingResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedFromIncludingToExcludingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToIncluding <em>Is Consented From Including To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented From Including To Including</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToIncluding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedFromIncludingToIncluding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToIncludingResponse <em>Is Consented From Including To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented From Including To Including Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToIncludingResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedFromIncludingToIncludingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedResponse <em>Is Consented Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Consented Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsConsentedResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListConsentTemplates <em>List Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Consent Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListConsentTemplates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListConsentTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListConsentTemplatesResponse <em>List Consent Templates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Consent Templates Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListConsentTemplatesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListConsentTemplatesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListCurrentConsentTemplates <em>List Current Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Current Consent Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListCurrentConsentTemplates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListCurrentConsentTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListCurrentConsentTemplatesResponse <em>List Current Consent Templates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Current Consent Templates Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListCurrentConsentTemplatesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListCurrentConsentTemplatesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListDomains <em>List Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Domains</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListDomains()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListDomains();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListDomainsResponse <em>List Domains Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Domains Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListDomainsResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListDomainsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListModules <em>List Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Modules</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListModules()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListModules();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListModulesResponse <em>List Modules Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Modules Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListModulesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListModulesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListPolicies <em>List Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListPolicies()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListPoliciesResponse <em>List Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Policies Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListPoliciesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListPoliciesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListSignerIdTypes <em>List Signer Id Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Signer Id Types</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListSignerIdTypes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListSignerIdTypes();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListSignerIdTypesResponse <em>List Signer Id Types Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Signer Id Types Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListSignerIdTypesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListSignerIdTypesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMandatoryFieldsException <em>Mandatory Fields Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mandatory Fields Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMandatoryFieldsException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MandatoryFieldsException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMissingRequiredObjectException <em>Missing Required Object Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Missing Required Object Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMissingRequiredObjectException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MissingRequiredObjectException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRefuseConsent <em>Refuse Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refuse Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRefuseConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RefuseConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRefuseConsentResponse <em>Refuse Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refuse Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRefuseConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RefuseConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRemoveScanFromConsent <em>Remove Scan From Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Scan From Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRemoveScanFromConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoveScanFromConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRemoveScanFromConsentResponse <em>Remove Scan From Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Scan From Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRemoveScanFromConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoveScanFromConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRequirementsNotFullfilledException <em>Requirements Not Fullfilled Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements Not Fullfilled Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRequirementsNotFullfilledException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequirementsNotFullfilledException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getSetQCForConsent <em>Set QC For Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set QC For Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getSetQCForConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SetQCForConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getSetQCForConsentResponse <em>Set QC For Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set QC For Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getSetQCForConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SetQCForConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownAliasException <em>Unknown Alias Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Alias Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownAliasException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownAliasException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownConsentException <em>Unknown Consent Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Consent Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownConsentException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownConsentException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownConsentTemplateException <em>Unknown Consent Template Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Consent Template Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownConsentTemplateException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownConsentTemplateException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownDomainException <em>Unknown Domain Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Domain Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownDomainException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownDomainException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownFhirIdObjectException <em>Unknown Fhir Id Object Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Fhir Id Object Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownFhirIdObjectException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownFhirIdObjectException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownIDException <em>Unknown ID Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown ID Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownIDException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownIDException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownModuleException <em>Unknown Module Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Module Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownModuleException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownModuleException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownPolicyException <em>Unknown Policy Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Policy Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownPolicyException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownPolicyException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownSignerIdException <em>Unknown Signer Id Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Signer Id Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownSignerIdException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownSignerIdException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownSignerIdTypeException <em>Unknown Signer Id Type Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Signer Id Type Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownSignerIdTypeException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnknownSignerIdTypeException();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentInUse <em>Update Consent In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Consent In Use</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentInUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateConsentInUse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentInUseResponse <em>Update Consent In Use Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Consent In Use Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentInUseResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateConsentInUseResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getValidateConsent <em>Validate Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getValidateConsent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidateConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getValidateConsentResponse <em>Validate Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getValidateConsentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidateConsentResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO <em>Domain DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO
	 * @generated
	 */
	EClass getDomainDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getComment()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getConfig()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EReference getDomainDTO_Config();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getCreationDate()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getCtVersionConverter <em>Ct Version Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Version Converter</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getCtVersionConverter()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_CtVersionConverter();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getExpirationProperties <em>Expiration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expiration Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getExpirationProperties()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EReference getDomainDTO_ExpirationProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getExternProperties()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#isFinalised <em>Finalised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#isFinalised()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_Finalised();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getLabel()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getLogo <em>Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getLogo()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_Logo();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getModuleVersionConverter <em>Module Version Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Version Converter</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getModuleVersionConverter()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_ModuleVersionConverter();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getName()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getPolicyVersionConverter <em>Policy Version Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Version Converter</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getPolicyVersionConverter()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_PolicyVersionConverter();

	/**
	 * Returns the meta object for the attribute list '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getSignerIdTypes <em>Signer Id Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Signer Id Types</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getSignerIdTypes()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_SignerIdTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO#getUpdateDate()
	 * @see #getDomainDTO()
	 * @generated
	 */
	EAttribute getDomainDTO_UpdateDate();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.DuplicateEntryException <em>Duplicate Entry Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duplicate Entry Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DuplicateEntryException
	 * @generated
	 */
	EClass getDuplicateEntryException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.DuplicateEntryException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DuplicateEntryException#getMessage()
	 * @see #getDuplicateEntryException()
	 * @generated
	 */
	EAttribute getDuplicateEntryException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType
	 * @generated
	 */
	EClass getEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType#getKey()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType#getValue()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Value();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType1 <em>Entry Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type1</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType1
	 * @generated
	 */
	EClass getEntryType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType1#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType1#getKey()
	 * @see #getEntryType1()
	 * @generated
	 */
	EReference getEntryType1_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType1#getValue()
	 * @see #getEntryType1()
	 * @generated
	 */
	EReference getEntryType1_Value();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType2 <em>Entry Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type2</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType2
	 * @generated
	 */
	EClass getEntryType2();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType2#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType2#getKey()
	 * @see #getEntryType2()
	 * @generated
	 */
	EReference getEntryType2_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType2#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType2#getValue()
	 * @see #getEntryType2()
	 * @generated
	 */
	EReference getEntryType2_Value();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType3 <em>Entry Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type3</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType3
	 * @generated
	 */
	EClass getEntryType3();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType3#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType3#getKey()
	 * @see #getEntryType3()
	 * @generated
	 */
	EReference getEntryType3_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType3#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType3#getValue()
	 * @see #getEntryType3()
	 * @generated
	 */
	EReference getEntryType3_Value();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType4 <em>Entry Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type4</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType4
	 * @generated
	 */
	EClass getEntryType4();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType4#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType4#getKey()
	 * @see #getEntryType4()
	 * @generated
	 */
	EReference getEntryType4_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType4#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType4#getValue()
	 * @see #getEntryType4()
	 * @generated
	 */
	EAttribute getEntryType4_Value();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO <em>Expiration Properties DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expiration Properties DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO
	 * @generated
	 */
	EClass getExpirationPropertiesDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO#getFixedExpirationDate <em>Fixed Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Expiration Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO#getFixedExpirationDate()
	 * @see #getExpirationPropertiesDTO()
	 * @generated
	 */
	EAttribute getExpirationPropertiesDTO_FixedExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO#getValidPeriod <em>Valid Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Period</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO#getValidPeriod()
	 * @see #getExpirationPropertiesDTO()
	 * @generated
	 */
	EAttribute getExpirationPropertiesDTO_ValidPeriod();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO <em>Fhir Id DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fhir Id DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO
	 * @generated
	 */
	EClass getFhirIdDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO#getFhirID <em>Fhir ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fhir ID</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO#getFhirID()
	 * @see #getFhirIdDTO()
	 * @generated
	 */
	EAttribute getFhirIdDTO_FhirID();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO <em>Free Text Def DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text Def DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO
	 * @generated
	 */
	EClass getFreeTextDefDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getComment()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getConverterString <em>Converter String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter String</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getConverterString()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_ConverterString();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getCreationDate()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getExternProperties()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#isFinalised <em>Finalised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#isFinalised()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_Finalised();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getLabel()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getName()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getPos()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_Pos();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#isRequired()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getType()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO#getUpdateDate()
	 * @see #getFreeTextDefDTO()
	 * @generated
	 */
	EAttribute getFreeTextDefDTO_UpdateDate();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO <em>Free Text Val DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text Val DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO
	 * @generated
	 */
	EClass getFreeTextValDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO#getFreeTextDefName <em>Free Text Def Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Text Def Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO#getFreeTextDefName()
	 * @see #getFreeTextValDTO()
	 * @generated
	 */
	EAttribute getFreeTextValDTO_FreeTextDefName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO#getValue()
	 * @see #getFreeTextValDTO()
	 * @generated
	 */
	EAttribute getFreeTextValDTO_Value();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId <em>Get Aliases For Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Aliases For Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId
	 * @generated
	 */
	EClass getGetAliasesForSignerId();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId#getDomainName()
	 * @see #getGetAliasesForSignerId()
	 * @generated
	 */
	EAttribute getGetAliasesForSignerId_DomainName();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId#getOriginalSignerId <em>Original Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId#getOriginalSignerId()
	 * @see #getGetAliasesForSignerId()
	 * @generated
	 */
	EReference getGetAliasesForSignerId_OriginalSignerId();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdResponse <em>Get Aliases For Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Aliases For Signer Id Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdResponse
	 * @generated
	 */
	EClass getGetAliasesForSignerIdResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdResponse#getReturn()
	 * @see #getGetAliasesForSignerIdResponse()
	 * @generated
	 */
	EReference getGetAliasesForSignerIdResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds <em>Get Aliases For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Aliases For Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds
	 * @generated
	 */
	EClass getGetAliasesForSignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds#getDomainName()
	 * @see #getGetAliasesForSignerIds()
	 * @generated
	 */
	EAttribute getGetAliasesForSignerIds_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds#getOriginalSignerIds <em>Original Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Original Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds#getOriginalSignerIds()
	 * @see #getGetAliasesForSignerIds()
	 * @generated
	 */
	EReference getGetAliasesForSignerIds_OriginalSignerIds();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse <em>Get Aliases For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Aliases For Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse
	 * @generated
	 */
	EClass getGetAliasesForSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse#getReturn()
	 * @see #getGetAliasesForSignerIdsResponse()
	 * @generated
	 */
	EReference getGetAliasesForSignerIdsResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor <em>Get All Consented Ids For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consented Ids For</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor
	 * @generated
	 */
	EClass getGetAllConsentedIdsFor();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor#getSignerIdTypeName <em>Signer Id Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signer Id Type Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor#getSignerIdTypeName()
	 * @see #getGetAllConsentedIdsFor()
	 * @generated
	 */
	EAttribute getGetAllConsentedIdsFor_SignerIdTypeName();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor#getPolicyKey()
	 * @see #getGetAllConsentedIdsFor()
	 * @generated
	 */
	EReference getGetAllConsentedIdsFor_PolicyKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor#getConfig()
	 * @see #getGetAllConsentedIdsFor()
	 * @generated
	 */
	EReference getGetAllConsentedIdsFor_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse <em>Get All Consented Ids For Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consented Ids For Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse
	 * @generated
	 */
	EClass getGetAllConsentedIdsForResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse#getReturn()
	 * @see #getGetAllConsentedIdsForResponse()
	 * @generated
	 */
	EReference getGetAllConsentedIdsForResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplate <em>Get All Consents For Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consents For Consent Template</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplate
	 * @generated
	 */
	EClass getGetAllConsentsForConsentTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplate#getConsentTemplateKey <em>Consent Template Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Template Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplate#getConsentTemplateKey()
	 * @see #getGetAllConsentsForConsentTemplate()
	 * @generated
	 */
	EReference getGetAllConsentsForConsentTemplate_ConsentTemplateKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse <em>Get All Consents For Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consents For Consent Template Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse
	 * @generated
	 */
	EClass getGetAllConsentsForConsentTemplateResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse#getReturn()
	 * @see #getGetAllConsentsForConsentTemplateResponse()
	 * @generated
	 */
	EReference getGetAllConsentsForConsentTemplateResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomain <em>Get All Consents For Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consents For Domain</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomain
	 * @generated
	 */
	EClass getGetAllConsentsForDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomain#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomain#getDomainName()
	 * @see #getGetAllConsentsForDomain()
	 * @generated
	 */
	EAttribute getGetAllConsentsForDomain_DomainName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainResponse <em>Get All Consents For Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consents For Domain Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainResponse
	 * @generated
	 */
	EClass getGetAllConsentsForDomainResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainResponse#getReturn()
	 * @see #getGetAllConsentsForDomainResponse()
	 * @generated
	 */
	EReference getGetAllConsentsForDomainResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScan <em>Get All Consents For Domain Without Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consents For Domain Without Scan</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScan
	 * @generated
	 */
	EClass getGetAllConsentsForDomainWithoutScan();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScan#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScan#getDomainName()
	 * @see #getGetAllConsentsForDomainWithoutScan()
	 * @generated
	 */
	EAttribute getGetAllConsentsForDomainWithoutScan_DomainName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScanResponse <em>Get All Consents For Domain Without Scan Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consents For Domain Without Scan Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScanResponse
	 * @generated
	 */
	EClass getGetAllConsentsForDomainWithoutScanResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScanResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScanResponse#getReturn()
	 * @see #getGetAllConsentsForDomainWithoutScanResponse()
	 * @generated
	 */
	EReference getGetAllConsentsForDomainWithoutScanResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds <em>Get All Consents For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consents For Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds
	 * @generated
	 */
	EClass getGetAllConsentsForSignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds#getDomainName()
	 * @see #getGetAllConsentsForSignerIds()
	 * @generated
	 */
	EAttribute getGetAllConsentsForSignerIds_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds#getSignerIds()
	 * @see #getGetAllConsentsForSignerIds()
	 * @generated
	 */
	EReference getGetAllConsentsForSignerIds_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds#isUseAliases <em>Use Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds#isUseAliases()
	 * @see #getGetAllConsentsForSignerIds()
	 * @generated
	 */
	EAttribute getGetAllConsentsForSignerIds_UseAliases();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIdsResponse <em>Get All Consents For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Consents For Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIdsResponse
	 * @generated
	 */
	EClass getGetAllConsentsForSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIdsResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIdsResponse#getReturn()
	 * @see #getGetAllConsentsForSignerIdsResponse()
	 * @generated
	 */
	EReference getGetAllConsentsForSignerIdsResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType <em>Get All Ids For Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Ids For Signer Id Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType
	 * @generated
	 */
	EClass getGetAllIdsForSignerIdType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType#getDomainName()
	 * @see #getGetAllIdsForSignerIdType()
	 * @generated
	 */
	EAttribute getGetAllIdsForSignerIdType_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType#getSignerIdTypeName <em>Signer Id Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signer Id Type Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType#getSignerIdTypeName()
	 * @see #getGetAllIdsForSignerIdType()
	 * @generated
	 */
	EAttribute getGetAllIdsForSignerIdType_SignerIdTypeName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdTypeResponse <em>Get All Ids For Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Ids For Signer Id Type Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdTypeResponse
	 * @generated
	 */
	EClass getGetAllIdsForSignerIdTypeResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdTypeResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdTypeResponse#getReturn()
	 * @see #getGetAllIdsForSignerIdTypeResponse()
	 * @generated
	 */
	EReference getGetAllIdsForSignerIdTypeResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsent <em>Get Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsent
	 * @generated
	 */
	EClass getGetConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsent#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsent#getConsentKey()
	 * @see #getGetConsent()
	 * @generated
	 */
	EReference getGetConsent_ConsentKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentDates <em>Get Consent Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Dates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentDates
	 * @generated
	 */
	EClass getGetConsentDates();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentDates#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentDates#getConsentKey()
	 * @see #getGetConsentDates()
	 * @generated
	 */
	EReference getGetConsentDates_ConsentKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentDatesResponse <em>Get Consent Dates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Dates Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentDatesResponse
	 * @generated
	 */
	EClass getGetConsentDatesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentDatesResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentDatesResponse#getReturn()
	 * @see #getGetConsentDatesResponse()
	 * @generated
	 */
	EReference getGetConsentDatesResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentLight <em>Get Consent Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Light</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentLight
	 * @generated
	 */
	EClass getGetConsentLight();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentLight#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentLight#getConsentKey()
	 * @see #getGetConsentLight()
	 * @generated
	 */
	EReference getGetConsentLight_ConsentKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentLightResponse <em>Get Consent Light Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Light Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentLightResponse
	 * @generated
	 */
	EClass getGetConsentLightResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentLightResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentLightResponse#getReturn()
	 * @see #getGetConsentLightResponse()
	 * @generated
	 */
	EReference getGetConsentLightResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentResponse <em>Get Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentResponse
	 * @generated
	 */
	EClass getGetConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentResponse#getReturn()
	 * @see #getGetConsentResponse()
	 * @generated
	 */
	EReference getGetConsentResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated <em>Get Consents For Domain Paginated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consents For Domain Paginated</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated
	 * @generated
	 */
	EClass getGetConsentsForDomainPaginated();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated#getDomainName()
	 * @see #getGetConsentsForDomainPaginated()
	 * @generated
	 */
	EAttribute getGetConsentsForDomainPaginated_DomainName();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated#getConfig()
	 * @see #getGetConsentsForDomainPaginated()
	 * @generated
	 */
	EReference getGetConsentsForDomainPaginated_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginatedResponse <em>Get Consents For Domain Paginated Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consents For Domain Paginated Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginatedResponse
	 * @generated
	 */
	EClass getGetConsentsForDomainPaginatedResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginatedResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginatedResponse#getReturn()
	 * @see #getGetConsentsForDomainPaginatedResponse()
	 * @generated
	 */
	EReference getGetConsentsForDomainPaginatedResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType <em>Get Consent Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType
	 * @generated
	 */
	EClass getGetConsentStatusType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getSignerIds()
	 * @see #getGetConsentStatusType()
	 * @generated
	 */
	EReference getGetConsentStatusType_SignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getPolicyKey()
	 * @see #getGetConsentStatusType()
	 * @generated
	 */
	EReference getGetConsentStatusType_PolicyKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getConfig()
	 * @see #getGetConsentStatusType()
	 * @generated
	 */
	EReference getGetConsentStatusType_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding <em>Get Consent Status Type From Excluding To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type From Excluding To Excluding</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding
	 * @generated
	 */
	EClass getGetConsentStatusTypeFromExcludingToExcluding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getSignerIds()
	 * @see #getGetConsentStatusTypeFromExcludingToExcluding()
	 * @generated
	 */
	EReference getGetConsentStatusTypeFromExcludingToExcluding_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getDomainName()
	 * @see #getGetConsentStatusTypeFromExcludingToExcluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToExcluding_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getPolicyName()
	 * @see #getGetConsentStatusTypeFromExcludingToExcluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToExcluding_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getVersionFrom <em>Version From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version From</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getVersionFrom()
	 * @see #getGetConsentStatusTypeFromExcludingToExcluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToExcluding_VersionFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getVersionTo <em>Version To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version To</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getVersionTo()
	 * @see #getGetConsentStatusTypeFromExcludingToExcluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToExcluding_VersionTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getConfig()
	 * @see #getGetConsentStatusTypeFromExcludingToExcluding()
	 * @generated
	 */
	EReference getGetConsentStatusTypeFromExcludingToExcluding_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcludingResponse <em>Get Consent Status Type From Excluding To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type From Excluding To Excluding Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcludingResponse
	 * @generated
	 */
	EClass getGetConsentStatusTypeFromExcludingToExcludingResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcludingResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcludingResponse#getReturn()
	 * @see #getGetConsentStatusTypeFromExcludingToExcludingResponse()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToExcludingResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding <em>Get Consent Status Type From Excluding To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type From Excluding To Including</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding
	 * @generated
	 */
	EClass getGetConsentStatusTypeFromExcludingToIncluding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getSignerIds()
	 * @see #getGetConsentStatusTypeFromExcludingToIncluding()
	 * @generated
	 */
	EReference getGetConsentStatusTypeFromExcludingToIncluding_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getDomainName()
	 * @see #getGetConsentStatusTypeFromExcludingToIncluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToIncluding_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getPolicyName()
	 * @see #getGetConsentStatusTypeFromExcludingToIncluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToIncluding_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getVersionFrom <em>Version From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version From</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getVersionFrom()
	 * @see #getGetConsentStatusTypeFromExcludingToIncluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToIncluding_VersionFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getVersionTo <em>Version To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version To</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getVersionTo()
	 * @see #getGetConsentStatusTypeFromExcludingToIncluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToIncluding_VersionTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding#getConfig()
	 * @see #getGetConsentStatusTypeFromExcludingToIncluding()
	 * @generated
	 */
	EReference getGetConsentStatusTypeFromExcludingToIncluding_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncludingResponse <em>Get Consent Status Type From Excluding To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type From Excluding To Including Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncludingResponse
	 * @generated
	 */
	EClass getGetConsentStatusTypeFromExcludingToIncludingResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncludingResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncludingResponse#getReturn()
	 * @see #getGetConsentStatusTypeFromExcludingToIncludingResponse()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromExcludingToIncludingResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding <em>Get Consent Status Type From Including To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type From Including To Excluding</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding
	 * @generated
	 */
	EClass getGetConsentStatusTypeFromIncludingToExcluding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getSignerIds()
	 * @see #getGetConsentStatusTypeFromIncludingToExcluding()
	 * @generated
	 */
	EReference getGetConsentStatusTypeFromIncludingToExcluding_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getDomainName()
	 * @see #getGetConsentStatusTypeFromIncludingToExcluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToExcluding_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getPolicyName()
	 * @see #getGetConsentStatusTypeFromIncludingToExcluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToExcluding_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getVersionFrom <em>Version From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version From</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getVersionFrom()
	 * @see #getGetConsentStatusTypeFromIncludingToExcluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToExcluding_VersionFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getVersionTo <em>Version To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version To</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getVersionTo()
	 * @see #getGetConsentStatusTypeFromIncludingToExcluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToExcluding_VersionTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding#getConfig()
	 * @see #getGetConsentStatusTypeFromIncludingToExcluding()
	 * @generated
	 */
	EReference getGetConsentStatusTypeFromIncludingToExcluding_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcludingResponse <em>Get Consent Status Type From Including To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type From Including To Excluding Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcludingResponse
	 * @generated
	 */
	EClass getGetConsentStatusTypeFromIncludingToExcludingResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcludingResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcludingResponse#getReturn()
	 * @see #getGetConsentStatusTypeFromIncludingToExcludingResponse()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToExcludingResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding <em>Get Consent Status Type From Including To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type From Including To Including</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding
	 * @generated
	 */
	EClass getGetConsentStatusTypeFromIncludingToIncluding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getSignerIds()
	 * @see #getGetConsentStatusTypeFromIncludingToIncluding()
	 * @generated
	 */
	EReference getGetConsentStatusTypeFromIncludingToIncluding_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getDomainName()
	 * @see #getGetConsentStatusTypeFromIncludingToIncluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToIncluding_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getPolicyName()
	 * @see #getGetConsentStatusTypeFromIncludingToIncluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToIncluding_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getVersionFrom <em>Version From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version From</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getVersionFrom()
	 * @see #getGetConsentStatusTypeFromIncludingToIncluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToIncluding_VersionFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getVersionTo <em>Version To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version To</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getVersionTo()
	 * @see #getGetConsentStatusTypeFromIncludingToIncluding()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToIncluding_VersionTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding#getConfig()
	 * @see #getGetConsentStatusTypeFromIncludingToIncluding()
	 * @generated
	 */
	EReference getGetConsentStatusTypeFromIncludingToIncluding_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncludingResponse <em>Get Consent Status Type From Including To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type From Including To Including Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncludingResponse
	 * @generated
	 */
	EClass getGetConsentStatusTypeFromIncludingToIncludingResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncludingResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncludingResponse#getReturn()
	 * @see #getGetConsentStatusTypeFromIncludingToIncludingResponse()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeFromIncludingToIncludingResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeResponse <em>Get Consent Status Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Status Type Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeResponse
	 * @generated
	 */
	EClass getGetConsentStatusTypeResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeResponse#getReturn()
	 * @see #getGetConsentStatusTypeResponse()
	 * @generated
	 */
	EAttribute getGetConsentStatusTypeResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate <em>Get Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Template</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate
	 * @generated
	 */
	EClass getGetConsentTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate#getConsentTemplateKey <em>Consent Template Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Template Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate#getConsentTemplateKey()
	 * @see #getGetConsentTemplate()
	 * @generated
	 */
	EReference getGetConsentTemplate_ConsentTemplateKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplateResponse <em>Get Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Consent Template Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplateResponse
	 * @generated
	 */
	EClass getGetConsentTemplateResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplateResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplateResponse#getReturn()
	 * @see #getGetConsentTemplateResponse()
	 * @generated
	 */
	EReference getGetConsentTemplateResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT <em>Get Current Consent For Signer Ids And CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Current Consent For Signer Ids And CT</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT
	 * @generated
	 */
	EClass getGetCurrentConsentForSignerIdsAndCT();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#getConsentTemplateKey <em>Consent Template Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Template Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#getConsentTemplateKey()
	 * @see #getGetCurrentConsentForSignerIdsAndCT()
	 * @generated
	 */
	EReference getGetCurrentConsentForSignerIdsAndCT_ConsentTemplateKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#getSignerIds()
	 * @see #getGetCurrentConsentForSignerIdsAndCT()
	 * @generated
	 */
	EReference getGetCurrentConsentForSignerIdsAndCT_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isIgnoreVersionNumber <em>Ignore Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Version Number</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isIgnoreVersionNumber()
	 * @see #getGetCurrentConsentForSignerIdsAndCT()
	 * @generated
	 */
	EAttribute getGetCurrentConsentForSignerIdsAndCT_IgnoreVersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isUseAliases <em>Use Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isUseAliases()
	 * @see #getGetCurrentConsentForSignerIdsAndCT()
	 * @generated
	 */
	EAttribute getGetCurrentConsentForSignerIdsAndCT_UseAliases();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCTResponse <em>Get Current Consent For Signer Ids And CT Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Current Consent For Signer Ids And CT Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCTResponse
	 * @generated
	 */
	EClass getGetCurrentConsentForSignerIdsAndCTResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCTResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCTResponse#getReturn()
	 * @see #getGetCurrentConsentForSignerIdsAndCTResponse()
	 * @generated
	 */
	EReference getGetCurrentConsentForSignerIdsAndCTResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate <em>Get Current Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Current Consent Template</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate
	 * @generated
	 */
	EClass getGetCurrentConsentTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate#getConsentTemplateName <em>Consent Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consent Template Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate#getConsentTemplateName()
	 * @see #getGetCurrentConsentTemplate()
	 * @generated
	 */
	EAttribute getGetCurrentConsentTemplate_ConsentTemplateName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate#getDomainName()
	 * @see #getGetCurrentConsentTemplate()
	 * @generated
	 */
	EAttribute getGetCurrentConsentTemplate_DomainName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse <em>Get Current Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Current Consent Template Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse
	 * @generated
	 */
	EClass getGetCurrentConsentTemplateResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse#getReturn()
	 * @see #getGetCurrentConsentTemplateResponse()
	 * @generated
	 */
	EReference getGetCurrentConsentTemplateResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds <em>Get Current Policy States For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Current Policy States For Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds
	 * @generated
	 */
	EClass getGetCurrentPolicyStatesForSignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds#getDomainName()
	 * @see #getGetCurrentPolicyStatesForSignerIds()
	 * @generated
	 */
	EAttribute getGetCurrentPolicyStatesForSignerIds_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds#getSignerIds()
	 * @see #getGetCurrentPolicyStatesForSignerIds()
	 * @generated
	 */
	EReference getGetCurrentPolicyStatesForSignerIds_SignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds#getConfig()
	 * @see #getGetCurrentPolicyStatesForSignerIds()
	 * @generated
	 */
	EReference getGetCurrentPolicyStatesForSignerIds_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse <em>Get Current Policy States For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Current Policy States For Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse
	 * @generated
	 */
	EClass getGetCurrentPolicyStatesForSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse#getReturn()
	 * @see #getGetCurrentPolicyStatesForSignerIdsResponse()
	 * @generated
	 */
	EReference getGetCurrentPolicyStatesForSignerIdsResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetDomain <em>Get Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Domain</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetDomain
	 * @generated
	 */
	EClass getGetDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetDomain#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetDomain#getDomainName()
	 * @see #getGetDomain()
	 * @generated
	 */
	EAttribute getGetDomain_DomainName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetDomainResponse <em>Get Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Domain Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetDomainResponse
	 * @generated
	 */
	EClass getGetDomainResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetDomainResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetDomainResponse#getReturn()
	 * @see #getGetDomainResponse()
	 * @generated
	 */
	EReference getGetDomainResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId <em>Get Mapped Templates For Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Mapped Templates For Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId
	 * @generated
	 */
	EClass getGetMappedTemplatesForSignerId();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId#getDomainName()
	 * @see #getGetMappedTemplatesForSignerId()
	 * @generated
	 */
	EAttribute getGetMappedTemplatesForSignerId_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId#getCtType <em>Ct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId#getCtType()
	 * @see #getGetMappedTemplatesForSignerId()
	 * @generated
	 */
	EAttribute getGetMappedTemplatesForSignerId_CtType();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId#getSignerId <em>Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId#getSignerId()
	 * @see #getGetMappedTemplatesForSignerId()
	 * @generated
	 */
	EReference getGetMappedTemplatesForSignerId_SignerId();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId#isUseAliases <em>Use Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId#isUseAliases()
	 * @see #getGetMappedTemplatesForSignerId()
	 * @generated
	 */
	EAttribute getGetMappedTemplatesForSignerId_UseAliases();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerIdResponse <em>Get Mapped Templates For Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Mapped Templates For Signer Id Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerIdResponse
	 * @generated
	 */
	EClass getGetMappedTemplatesForSignerIdResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerIdResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerIdResponse#getReturn()
	 * @see #getGetMappedTemplatesForSignerIdResponse()
	 * @generated
	 */
	EReference getGetMappedTemplatesForSignerIdResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetModule <em>Get Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Module</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetModule
	 * @generated
	 */
	EClass getGetModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetModule#getModuleKey <em>Module Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetModule#getModuleKey()
	 * @see #getGetModule()
	 * @generated
	 */
	EReference getGetModule_ModuleKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetModuleResponse <em>Get Module Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Module Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetModuleResponse
	 * @generated
	 */
	EClass getGetModuleResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetModuleResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetModuleResponse#getReturn()
	 * @see #getGetModuleResponse()
	 * @generated
	 */
	EReference getGetModuleResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID <em>Get Object By Fhir ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Object By Fhir ID</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID
	 * @generated
	 */
	EClass getGetObjectByFhirID();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID#getClazz()
	 * @see #getGetObjectByFhirID()
	 * @generated
	 */
	EAttribute getGetObjectByFhirID_Clazz();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID#getFhirID <em>Fhir ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fhir ID</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID#getFhirID()
	 * @see #getGetObjectByFhirID()
	 * @generated
	 */
	EAttribute getGetObjectByFhirID_FhirID();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirIDResponse <em>Get Object By Fhir ID Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Object By Fhir ID Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirIDResponse
	 * @generated
	 */
	EClass getGetObjectByFhirIDResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirIDResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirIDResponse#getReturn()
	 * @see #getGetObjectByFhirIDResponse()
	 * @generated
	 */
	EReference getGetObjectByFhirIDResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicy <em>Get Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Policy</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicy
	 * @generated
	 */
	EClass getGetPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicy#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicy#getPolicyKey()
	 * @see #getGetPolicy()
	 * @generated
	 */
	EReference getGetPolicy_PolicyKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyResponse <em>Get Policy Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Policy Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyResponse
	 * @generated
	 */
	EClass getGetPolicyResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyResponse#getReturn()
	 * @see #getGetPolicyResponse()
	 * @generated
	 */
	EReference getGetPolicyResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds <em>Get Policy States For Policy And Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Policy States For Policy And Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds
	 * @generated
	 */
	EClass getGetPolicyStatesForPolicyAndSignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds#getPolicyKey()
	 * @see #getGetPolicyStatesForPolicyAndSignerIds()
	 * @generated
	 */
	EReference getGetPolicyStatesForPolicyAndSignerIds_PolicyKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds#getSignerIds()
	 * @see #getGetPolicyStatesForPolicyAndSignerIds()
	 * @generated
	 */
	EReference getGetPolicyStatesForPolicyAndSignerIds_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds#isUseAliases <em>Use Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds#isUseAliases()
	 * @see #getGetPolicyStatesForPolicyAndSignerIds()
	 * @generated
	 */
	EAttribute getGetPolicyStatesForPolicyAndSignerIds_UseAliases();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIdsResponse <em>Get Policy States For Policy And Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Policy States For Policy And Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIdsResponse
	 * @generated
	 */
	EClass getGetPolicyStatesForPolicyAndSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIdsResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIdsResponse#getReturn()
	 * @see #getGetPolicyStatesForPolicyAndSignerIdsResponse()
	 * @generated
	 */
	EReference getGetPolicyStatesForPolicyAndSignerIdsResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds <em>Get Policy States For Policy Name And Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Policy States For Policy Name And Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds
	 * @generated
	 */
	EClass getGetPolicyStatesForPolicyNameAndSignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds#getDomainName()
	 * @see #getGetPolicyStatesForPolicyNameAndSignerIds()
	 * @generated
	 */
	EAttribute getGetPolicyStatesForPolicyNameAndSignerIds_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds#getPolicyName()
	 * @see #getGetPolicyStatesForPolicyNameAndSignerIds()
	 * @generated
	 */
	EAttribute getGetPolicyStatesForPolicyNameAndSignerIds_PolicyName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds#getSignerIds()
	 * @see #getGetPolicyStatesForPolicyNameAndSignerIds()
	 * @generated
	 */
	EReference getGetPolicyStatesForPolicyNameAndSignerIds_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds#isUseAliases <em>Use Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds#isUseAliases()
	 * @see #getGetPolicyStatesForPolicyNameAndSignerIds()
	 * @generated
	 */
	EAttribute getGetPolicyStatesForPolicyNameAndSignerIds_UseAliases();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIdsResponse <em>Get Policy States For Policy Name And Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Policy States For Policy Name And Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIdsResponse
	 * @generated
	 */
	EClass getGetPolicyStatesForPolicyNameAndSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIdsResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIdsResponse#getReturn()
	 * @see #getGetPolicyStatesForPolicyNameAndSignerIdsResponse()
	 * @generated
	 */
	EReference getGetPolicyStatesForPolicyNameAndSignerIdsResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds <em>Get Policy States For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Policy States For Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds
	 * @generated
	 */
	EClass getGetPolicyStatesForSignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#getDomainName()
	 * @see #getGetPolicyStatesForSignerIds()
	 * @generated
	 */
	EAttribute getGetPolicyStatesForSignerIds_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#getSignerIds()
	 * @see #getGetPolicyStatesForSignerIds()
	 * @generated
	 */
	EReference getGetPolicyStatesForSignerIds_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#isUseAliases <em>Use Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#isUseAliases()
	 * @see #getGetPolicyStatesForSignerIds()
	 * @generated
	 */
	EAttribute getGetPolicyStatesForSignerIds_UseAliases();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIdsResponse <em>Get Policy States For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Policy States For Signer Ids Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIdsResponse
	 * @generated
	 */
	EClass getGetPolicyStatesForSignerIdsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIdsResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIdsResponse#getReturn()
	 * @see #getGetPolicyStatesForSignerIdsResponse()
	 * @generated
	 */
	EReference getGetPolicyStatesForSignerIdsResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsent <em>Get QC History For Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get QC History For Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsent
	 * @generated
	 */
	EClass getGetQCHistoryForConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsent#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsent#getConsentKey()
	 * @see #getGetQCHistoryForConsent()
	 * @generated
	 */
	EReference getGetQCHistoryForConsent_ConsentKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsentResponse <em>Get QC History For Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get QC History For Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsentResponse
	 * @generated
	 */
	EClass getGetQCHistoryForConsentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsentResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsentResponse#getReturn()
	 * @see #getGetQCHistoryForConsentResponse()
	 * @generated
	 */
	EReference getGetQCHistoryForConsentResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem <em>Get QC Problem History For QC Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get QC Problem History For QC Problem</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem
	 * @generated
	 */
	EClass getGetQCProblemHistoryForQCProblem();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem#getQcProblem <em>Qc Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qc Problem</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem#getQcProblem()
	 * @see #getGetQCProblemHistoryForQCProblem()
	 * @generated
	 */
	EReference getGetQCProblemHistoryForQCProblem_QcProblem();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem#getConsentKey()
	 * @see #getGetQCProblemHistoryForQCProblem()
	 * @generated
	 */
	EReference getGetQCProblemHistoryForQCProblem_ConsentKey();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblemResponse <em>Get QC Problem History For QC Problem Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get QC Problem History For QC Problem Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblemResponse
	 * @generated
	 */
	EClass getGetQCProblemHistoryForQCProblemResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblemResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblemResponse#getReturn()
	 * @see #getGetQCProblemHistoryForQCProblemResponse()
	 * @generated
	 */
	EReference getGetQCProblemHistoryForQCProblemResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias <em>Get Signer Ids For Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Signer Ids For Alias</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias
	 * @generated
	 */
	EClass getGetSignerIdsForAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias#getDomainName()
	 * @see #getGetSignerIdsForAlias()
	 * @generated
	 */
	EAttribute getGetSignerIdsForAlias_DomainName();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias#getAliasSignerId <em>Alias Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias Signer Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias#getAliasSignerId()
	 * @see #getGetSignerIdsForAlias()
	 * @generated
	 */
	EReference getGetSignerIdsForAlias_AliasSignerId();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAliasResponse <em>Get Signer Ids For Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Signer Ids For Alias Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAliasResponse
	 * @generated
	 */
	EClass getGetSignerIdsForAliasResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAliasResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAliasResponse#getReturn()
	 * @see #getGetSignerIdsForAliasResponse()
	 * @generated
	 */
	EReference getGetSignerIdsForAliasResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType <em>Get Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Signer Id Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType
	 * @generated
	 */
	EClass getGetSignerIdType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType#getDomainName()
	 * @see #getGetSignerIdType()
	 * @generated
	 */
	EAttribute getGetSignerIdType_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType#getSignerIdTypeName <em>Signer Id Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signer Id Type Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType#getSignerIdTypeName()
	 * @see #getGetSignerIdType()
	 * @generated
	 */
	EAttribute getGetSignerIdType_SignerIdTypeName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdTypeResponse <em>Get Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Signer Id Type Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdTypeResponse
	 * @generated
	 */
	EClass getGetSignerIdTypeResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdTypeResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdTypeResponse#getReturn()
	 * @see #getGetSignerIdTypeResponse()
	 * @generated
	 */
	EReference getGetSignerIdTypeResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPolicies <em>Get Templates With Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Templates With Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPolicies
	 * @generated
	 */
	EClass getGetTemplatesWithPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPolicies#getPolicyKeyDTOs <em>Policy Key DT Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Key DT Os</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPolicies#getPolicyKeyDTOs()
	 * @see #getGetTemplatesWithPolicies()
	 * @generated
	 */
	EReference getGetTemplatesWithPolicies_PolicyKeyDTOs();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPoliciesResponse <em>Get Templates With Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Templates With Policies Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPoliciesResponse
	 * @generated
	 */
	EClass getGetTemplatesWithPoliciesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPoliciesResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPoliciesResponse#getReturn()
	 * @see #getGetTemplatesWithPoliciesResponse()
	 * @generated
	 */
	EReference getGetTemplatesWithPoliciesResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.HashMap <em>Hash Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Map</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.HashMap
	 * @generated
	 */
	EClass getHashMap();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException <em>Illegal Argument Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Illegal Argument Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException
	 * @generated
	 */
	EClass getIllegalArgumentException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException#getMessage()
	 * @see #getIllegalArgumentException()
	 * @generated
	 */
	EAttribute getIllegalArgumentException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.InconsistentStatusException <em>Inconsistent Status Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inconsistent Status Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InconsistentStatusException
	 * @generated
	 */
	EClass getInconsistentStatusException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.InconsistentStatusException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InconsistentStatusException#getMessage()
	 * @see #getInconsistentStatusException()
	 * @generated
	 */
	EAttribute getInconsistentStatusException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.InternalException <em>Internal Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InternalException
	 * @generated
	 */
	EClass getInternalException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.InternalException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InternalException#getMessage()
	 * @see #getInternalException()
	 * @generated
	 */
	EAttribute getInternalException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidFreeTextException <em>Invalid Free Text Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Free Text Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidFreeTextException
	 * @generated
	 */
	EClass getInvalidFreeTextException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidFreeTextException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidFreeTextException#getMessage()
	 * @see #getInvalidFreeTextException()
	 * @generated
	 */
	EAttribute getInvalidFreeTextException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException <em>Invalid Parameter Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Parameter Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException
	 * @generated
	 */
	EClass getInvalidParameterException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException#getParameterName()
	 * @see #getInvalidParameterException()
	 * @generated
	 */
	EAttribute getInvalidParameterException_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException#getMessage()
	 * @see #getInvalidParameterException()
	 * @generated
	 */
	EAttribute getInvalidParameterException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidVersionException <em>Invalid Version Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Version Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidVersionException
	 * @generated
	 */
	EClass getInvalidVersionException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidVersionException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidVersionException#getMessage()
	 * @see #getInvalidVersionException()
	 * @generated
	 */
	EAttribute getInvalidVersionException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsented <em>Is Consented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsented
	 * @generated
	 */
	EClass getIsConsented();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsented#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsented#getSignerIds()
	 * @see #getIsConsented()
	 * @generated
	 */
	EReference getIsConsented_SignerIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsented#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsented#getPolicyKey()
	 * @see #getIsConsented()
	 * @generated
	 */
	EReference getIsConsented_PolicyKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsented#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsented#getConfig()
	 * @see #getIsConsented()
	 * @generated
	 */
	EReference getIsConsented_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding <em>Is Consented From Excluding To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented From Excluding To Excluding</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding
	 * @generated
	 */
	EClass getIsConsentedFromExcludingToExcluding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getSignerIds()
	 * @see #getIsConsentedFromExcludingToExcluding()
	 * @generated
	 */
	EReference getIsConsentedFromExcludingToExcluding_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getDomainName()
	 * @see #getIsConsentedFromExcludingToExcluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToExcluding_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getPolicyName()
	 * @see #getIsConsentedFromExcludingToExcluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToExcluding_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getVersionFrom <em>Version From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version From</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getVersionFrom()
	 * @see #getIsConsentedFromExcludingToExcluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToExcluding_VersionFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getVersionTo <em>Version To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version To</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getVersionTo()
	 * @see #getIsConsentedFromExcludingToExcluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToExcluding_VersionTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding#getConfig()
	 * @see #getIsConsentedFromExcludingToExcluding()
	 * @generated
	 */
	EReference getIsConsentedFromExcludingToExcluding_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse <em>Is Consented From Excluding To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented From Excluding To Excluding Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse
	 * @generated
	 */
	EClass getIsConsentedFromExcludingToExcludingResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse#isReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse#isReturn()
	 * @see #getIsConsentedFromExcludingToExcludingResponse()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToExcludingResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding <em>Is Consented From Excluding To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented From Excluding To Including</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding
	 * @generated
	 */
	EClass getIsConsentedFromExcludingToIncluding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getSignerIds()
	 * @see #getIsConsentedFromExcludingToIncluding()
	 * @generated
	 */
	EReference getIsConsentedFromExcludingToIncluding_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getDomainName()
	 * @see #getIsConsentedFromExcludingToIncluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToIncluding_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getPolicyName()
	 * @see #getIsConsentedFromExcludingToIncluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToIncluding_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getVersionFrom <em>Version From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version From</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getVersionFrom()
	 * @see #getIsConsentedFromExcludingToIncluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToIncluding_VersionFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getVersionTo <em>Version To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version To</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getVersionTo()
	 * @see #getIsConsentedFromExcludingToIncluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToIncluding_VersionTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding#getConfig()
	 * @see #getIsConsentedFromExcludingToIncluding()
	 * @generated
	 */
	EReference getIsConsentedFromExcludingToIncluding_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncludingResponse <em>Is Consented From Excluding To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented From Excluding To Including Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncludingResponse
	 * @generated
	 */
	EClass getIsConsentedFromExcludingToIncludingResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncludingResponse#isReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncludingResponse#isReturn()
	 * @see #getIsConsentedFromExcludingToIncludingResponse()
	 * @generated
	 */
	EAttribute getIsConsentedFromExcludingToIncludingResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding <em>Is Consented From Including To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented From Including To Excluding</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding
	 * @generated
	 */
	EClass getIsConsentedFromIncludingToExcluding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getSignerIds()
	 * @see #getIsConsentedFromIncludingToExcluding()
	 * @generated
	 */
	EReference getIsConsentedFromIncludingToExcluding_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getDomainName()
	 * @see #getIsConsentedFromIncludingToExcluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToExcluding_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getPolicyName()
	 * @see #getIsConsentedFromIncludingToExcluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToExcluding_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getVersionFrom <em>Version From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version From</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getVersionFrom()
	 * @see #getIsConsentedFromIncludingToExcluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToExcluding_VersionFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getVersionTo <em>Version To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version To</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getVersionTo()
	 * @see #getIsConsentedFromIncludingToExcluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToExcluding_VersionTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding#getConfig()
	 * @see #getIsConsentedFromIncludingToExcluding()
	 * @generated
	 */
	EReference getIsConsentedFromIncludingToExcluding_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcludingResponse <em>Is Consented From Including To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented From Including To Excluding Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcludingResponse
	 * @generated
	 */
	EClass getIsConsentedFromIncludingToExcludingResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcludingResponse#isReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcludingResponse#isReturn()
	 * @see #getIsConsentedFromIncludingToExcludingResponse()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToExcludingResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding <em>Is Consented From Including To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented From Including To Including</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding
	 * @generated
	 */
	EClass getIsConsentedFromIncludingToIncluding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getSignerIds()
	 * @see #getIsConsentedFromIncludingToIncluding()
	 * @generated
	 */
	EReference getIsConsentedFromIncludingToIncluding_SignerIds();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getDomainName()
	 * @see #getIsConsentedFromIncludingToIncluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToIncluding_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getPolicyName()
	 * @see #getIsConsentedFromIncludingToIncluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToIncluding_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getVersionFrom <em>Version From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version From</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getVersionFrom()
	 * @see #getIsConsentedFromIncludingToIncluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToIncluding_VersionFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getVersionTo <em>Version To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version To</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getVersionTo()
	 * @see #getIsConsentedFromIncludingToIncluding()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToIncluding_VersionTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding#getConfig()
	 * @see #getIsConsentedFromIncludingToIncluding()
	 * @generated
	 */
	EReference getIsConsentedFromIncludingToIncluding_Config();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncludingResponse <em>Is Consented From Including To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented From Including To Including Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncludingResponse
	 * @generated
	 */
	EClass getIsConsentedFromIncludingToIncludingResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncludingResponse#isReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncludingResponse#isReturn()
	 * @see #getIsConsentedFromIncludingToIncludingResponse()
	 * @generated
	 */
	EAttribute getIsConsentedFromIncludingToIncludingResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedResponse <em>Is Consented Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Consented Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedResponse
	 * @generated
	 */
	EClass getIsConsentedResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedResponse#isReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedResponse#isReturn()
	 * @see #getIsConsentedResponse()
	 * @generated
	 */
	EAttribute getIsConsentedResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.Label#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Label#getLang()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.Label#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Label#getValue()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Value();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates <em>List Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Consent Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates
	 * @generated
	 */
	EClass getListConsentTemplates();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#getDomainName()
	 * @see #getListConsentTemplates()
	 * @generated
	 */
	EAttribute getListConsentTemplates_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#isOnlyFinal <em>Only Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Final</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#isOnlyFinal()
	 * @see #getListConsentTemplates()
	 * @generated
	 */
	EAttribute getListConsentTemplates_OnlyFinal();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplatesResponse <em>List Consent Templates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Consent Templates Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplatesResponse
	 * @generated
	 */
	EClass getListConsentTemplatesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplatesResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplatesResponse#getReturn()
	 * @see #getListConsentTemplatesResponse()
	 * @generated
	 */
	EReference getListConsentTemplatesResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplates <em>List Current Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Current Consent Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplates
	 * @generated
	 */
	EClass getListCurrentConsentTemplates();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplates#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplates#getDomainName()
	 * @see #getListCurrentConsentTemplates()
	 * @generated
	 */
	EAttribute getListCurrentConsentTemplates_DomainName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplatesResponse <em>List Current Consent Templates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Current Consent Templates Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplatesResponse
	 * @generated
	 */
	EClass getListCurrentConsentTemplatesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplatesResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplatesResponse#getReturn()
	 * @see #getListCurrentConsentTemplatesResponse()
	 * @generated
	 */
	EReference getListCurrentConsentTemplatesResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListDomains <em>List Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Domains</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListDomains
	 * @generated
	 */
	EClass getListDomains();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListDomainsResponse <em>List Domains Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Domains Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListDomainsResponse
	 * @generated
	 */
	EClass getListDomainsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ListDomainsResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListDomainsResponse#getReturn()
	 * @see #getListDomainsResponse()
	 * @generated
	 */
	EReference getListDomainsResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModules <em>List Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Modules</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListModules
	 * @generated
	 */
	EClass getListModules();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModules#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListModules#getDomainName()
	 * @see #getListModules()
	 * @generated
	 */
	EAttribute getListModules_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModules#isOnlyFinal <em>Only Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Final</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListModules#isOnlyFinal()
	 * @see #getListModules()
	 * @generated
	 */
	EAttribute getListModules_OnlyFinal();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse <em>List Modules Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Modules Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse
	 * @generated
	 */
	EClass getListModulesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse#getReturn()
	 * @see #getListModulesResponse()
	 * @generated
	 */
	EReference getListModulesResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListPolicies <em>List Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListPolicies
	 * @generated
	 */
	EClass getListPolicies();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ListPolicies#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListPolicies#getDomainName()
	 * @see #getListPolicies()
	 * @generated
	 */
	EAttribute getListPolicies_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ListPolicies#isOnlyFinal <em>Only Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Final</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListPolicies#isOnlyFinal()
	 * @see #getListPolicies()
	 * @generated
	 */
	EAttribute getListPolicies_OnlyFinal();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListPoliciesResponse <em>List Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Policies Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListPoliciesResponse
	 * @generated
	 */
	EClass getListPoliciesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ListPoliciesResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListPoliciesResponse#getReturn()
	 * @see #getListPoliciesResponse()
	 * @generated
	 */
	EReference getListPoliciesResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypes <em>List Signer Id Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Signer Id Types</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypes
	 * @generated
	 */
	EClass getListSignerIdTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypes#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypes#getDomainName()
	 * @see #getListSignerIdTypes()
	 * @generated
	 */
	EAttribute getListSignerIdTypes_DomainName();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypesResponse <em>List Signer Id Types Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Signer Id Types Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypesResponse
	 * @generated
	 */
	EClass getListSignerIdTypesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypesResponse#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypesResponse#getReturn()
	 * @see #getListSignerIdTypesResponse()
	 * @generated
	 */
	EReference getListSignerIdTypesResponse_Return();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.MandatoryFieldsException <em>Mandatory Fields Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Fields Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.MandatoryFieldsException
	 * @generated
	 */
	EClass getMandatoryFieldsException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.MandatoryFieldsException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.MandatoryFieldsException#getMessage()
	 * @see #getMandatoryFieldsException()
	 * @generated
	 */
	EAttribute getMandatoryFieldsException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.MissingRequiredObjectException <em>Missing Required Object Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missing Required Object Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.MissingRequiredObjectException
	 * @generated
	 */
	EClass getMissingRequiredObjectException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.MissingRequiredObjectException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.MissingRequiredObjectException#getMessage()
	 * @see #getMissingRequiredObjectException()
	 * @generated
	 */
	EAttribute getMissingRequiredObjectException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO <em>Module DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO
	 * @generated
	 */
	EClass getModuleDTO();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getAssignedPolicies <em>Assigned Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigned Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getAssignedPolicies()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EReference getModuleDTO_AssignedPolicies();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getComment()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getCreationDate()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getExternProperties()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#isFinalised <em>Finalised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#isFinalised()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_Finalised();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getKey()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EReference getModuleDTO_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getLabel()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getShortText <em>Short Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getShortText()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_ShortText();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getText()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getTitle()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO#getUpdateDate()
	 * @see #getModuleDTO()
	 * @generated
	 */
	EAttribute getModuleDTO_UpdateDate();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleExpirationsType <em>Module Expirations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Expirations Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleExpirationsType
	 * @generated
	 */
	EClass getModuleExpirationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleExpirationsType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleExpirationsType#getEntry()
	 * @see #getModuleExpirationsType()
	 * @generated
	 */
	EReference getModuleExpirationsType_Entry();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO <em>Module Key DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Key DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO
	 * @generated
	 */
	EClass getModuleKeyDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO#getDomainName()
	 * @see #getModuleKeyDTO()
	 * @generated
	 */
	EAttribute getModuleKeyDTO_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO#getName()
	 * @see #getModuleKeyDTO()
	 * @generated
	 */
	EAttribute getModuleKeyDTO_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO#getVersion()
	 * @see #getModuleKeyDTO()
	 * @generated
	 */
	EAttribute getModuleKeyDTO_Version();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTOArray <em>Module Key DTO Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Key DTO Array</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTOArray
	 * @generated
	 */
	EClass getModuleKeyDTOArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTOArray#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTOArray#getItem()
	 * @see #getModuleKeyDTOArray()
	 * @generated
	 */
	EReference getModuleKeyDTOArray_Item();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO <em>Module State DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module State DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO
	 * @generated
	 */
	EClass getModuleStateDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getConsentState <em>Consent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consent State</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getConsentState()
	 * @see #getModuleStateDTO()
	 * @generated
	 */
	EAttribute getModuleStateDTO_ConsentState();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getKey()
	 * @see #getModuleStateDTO()
	 * @generated
	 */
	EReference getModuleStateDTO_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getPolicyKeys <em>Policy Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Keys</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getPolicyKeys()
	 * @see #getModuleStateDTO()
	 * @generated
	 */
	EReference getModuleStateDTO_PolicyKeys();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType <em>Module States Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module States Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType
	 * @generated
	 */
	EClass getModuleStatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType#getEntry()
	 * @see #getModuleStatesType()
	 * @generated
	 */
	EReference getModuleStatesType_Entry();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO <em>Policy DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO
	 * @generated
	 */
	EClass getPolicyDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getComment()
	 * @see #getPolicyDTO()
	 * @generated
	 */
	EAttribute getPolicyDTO_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getCreationDate()
	 * @see #getPolicyDTO()
	 * @generated
	 */
	EAttribute getPolicyDTO_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getExternProperties()
	 * @see #getPolicyDTO()
	 * @generated
	 */
	EAttribute getPolicyDTO_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#isFinalised <em>Finalised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#isFinalised()
	 * @see #getPolicyDTO()
	 * @generated
	 */
	EAttribute getPolicyDTO_Finalised();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getKey()
	 * @see #getPolicyDTO()
	 * @generated
	 */
	EReference getPolicyDTO_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getLabel()
	 * @see #getPolicyDTO()
	 * @generated
	 */
	EAttribute getPolicyDTO_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO#getUpdateDate()
	 * @see #getPolicyDTO()
	 * @generated
	 */
	EAttribute getPolicyDTO_UpdateDate();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyExpirationsType <em>Policy Expirations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Expirations Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyExpirationsType
	 * @generated
	 */
	EClass getPolicyExpirationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyExpirationsType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyExpirationsType#getEntry()
	 * @see #getPolicyExpirationsType()
	 * @generated
	 */
	EReference getPolicyExpirationsType_Entry();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO <em>Policy Key DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Key DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO
	 * @generated
	 */
	EClass getPolicyKeyDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO#getDomainName()
	 * @see #getPolicyKeyDTO()
	 * @generated
	 */
	EAttribute getPolicyKeyDTO_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO#getName()
	 * @see #getPolicyKeyDTO()
	 * @generated
	 */
	EAttribute getPolicyKeyDTO_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO#getVersion()
	 * @see #getPolicyKeyDTO()
	 * @generated
	 */
	EAttribute getPolicyKeyDTO_Version();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.Qcdto <em>Qcdto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qcdto</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Qcdto
	 * @generated
	 */
	EClass getQcdto();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getComment()
	 * @see #getQcdto()
	 * @generated
	 */
	EAttribute getQcdto_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getDate()
	 * @see #getQcdto()
	 * @generated
	 */
	EAttribute getQcdto_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getExternProperties()
	 * @see #getQcdto()
	 * @generated
	 */
	EAttribute getQcdto_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getInspector <em>Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inspector</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getInspector()
	 * @see #getQcdto()
	 * @generated
	 */
	EAttribute getQcdto_Inspector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getProblems()
	 * @see #getQcdto()
	 * @generated
	 */
	EReference getQcdto_Problems();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Qcdto#getType()
	 * @see #getQcdto()
	 * @generated
	 */
	EAttribute getQcdto_Type();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO <em>Qc History DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qc History DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO
	 * @generated
	 */
	EClass getQcHistoryDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO#getEndDate()
	 * @see #getQcHistoryDTO()
	 * @generated
	 */
	EAttribute getQcHistoryDTO_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO#getStartDate()
	 * @see #getQcHistoryDTO()
	 * @generated
	 */
	EAttribute getQcHistoryDTO_StartDate();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO <em>Qc Problem DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qc Problem DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO
	 * @generated
	 */
	EClass getQcProblemDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCommentExtern <em>Comment Extern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Extern</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCommentExtern()
	 * @see #getQcProblemDTO()
	 * @generated
	 */
	EAttribute getQcProblemDTO_CommentExtern();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCommentIntern <em>Comment Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Intern</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCommentIntern()
	 * @see #getQcProblemDTO()
	 * @generated
	 */
	EAttribute getQcProblemDTO_CommentIntern();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCreatedAt()
	 * @see #getQcProblemDTO()
	 * @generated
	 */
	EAttribute getQcProblemDTO_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getFormValue <em>Form Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getFormValue()
	 * @see #getQcProblemDTO()
	 * @generated
	 */
	EAttribute getQcProblemDTO_FormValue();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getRef()
	 * @see #getQcProblemDTO()
	 * @generated
	 */
	EAttribute getQcProblemDTO_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getScanValue <em>Scan Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan Value</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getScanValue()
	 * @see #getQcProblemDTO()
	 * @generated
	 */
	EAttribute getQcProblemDTO_ScanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getStatus()
	 * @see #getQcProblemDTO()
	 * @generated
	 */
	EAttribute getQcProblemDTO_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getUpdatedAt()
	 * @see #getQcProblemDTO()
	 * @generated
	 */
	EAttribute getQcProblemDTO_UpdatedAt();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO <em>Qc Problem History DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qc Problem History DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO
	 * @generated
	 */
	EClass getQcProblemHistoryDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO#getEndDate()
	 * @see #getQcProblemHistoryDTO()
	 * @generated
	 */
	EAttribute getQcProblemHistoryDTO_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO#getStartDate()
	 * @see #getQcProblemHistoryDTO()
	 * @generated
	 */
	EAttribute getQcProblemHistoryDTO_StartDate();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType <em>QC Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QC Problem Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemType
	 * @generated
	 */
	EClass getQCProblemType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getLabel()
	 * @see #getQCProblemType()
	 * @generated
	 */
	EReference getQCProblemType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getAction()
	 * @see #getQCProblemType()
	 * @generated
	 */
	EAttribute getQCProblemType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getError()
	 * @see #getQCProblemType()
	 * @generated
	 */
	EAttribute getQCProblemType_Error();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getField()
	 * @see #getQCProblemType()
	 * @generated
	 */
	EAttribute getQCProblemType_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getId()
	 * @see #getQCProblemType()
	 * @generated
	 */
	EAttribute getQCProblemType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getOccurrence()
	 * @see #getQCProblemType()
	 * @generated
	 */
	EAttribute getQCProblemType_Occurrence();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction <em>QC Problem Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QC Problem Type Action</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction
	 * @generated
	 */
	EClass getQCProblemTypeAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction#getLabel()
	 * @see #getQCProblemTypeAction()
	 * @generated
	 */
	EReference getQCProblemTypeAction_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction#getId()
	 * @see #getQCProblemTypeAction()
	 * @generated
	 */
	EAttribute getQCProblemTypeAction_Id();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.QCType <em>QC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QC Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCType
	 * @generated
	 */
	EClass getQCType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.QCType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCType#getLabel()
	 * @see #getQCType()
	 * @generated
	 */
	EReference getQCType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QCType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCType#getId()
	 * @see #getQCType()
	 * @generated
	 */
	EAttribute getQCType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.QCType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCType#getStatus()
	 * @see #getQCType()
	 * @generated
	 */
	EAttribute getQCType_Status();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent <em>Refuse Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refuse Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent
	 * @generated
	 */
	EClass getRefuseConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent#getConsentTemplateKey <em>Consent Template Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Template Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent#getConsentTemplateKey()
	 * @see #getRefuseConsent()
	 * @generated
	 */
	EReference getRefuseConsent_ConsentTemplateKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent#getSignerIds()
	 * @see #getRefuseConsent()
	 * @generated
	 */
	EReference getRefuseConsent_SignerIds();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.RefuseConsentResponse <em>Refuse Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refuse Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RefuseConsentResponse
	 * @generated
	 */
	EClass getRefuseConsentResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent <em>Remove Scan From Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Scan From Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent
	 * @generated
	 */
	EClass getRemoveScanFromConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent#getConsentKey()
	 * @see #getRemoveScanFromConsent()
	 * @generated
	 */
	EReference getRemoveScanFromConsent_ConsentKey();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent#getFhirId <em>Fhir Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fhir Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent#getFhirId()
	 * @see #getRemoveScanFromConsent()
	 * @generated
	 */
	EAttribute getRemoveScanFromConsent_FhirId();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsentResponse <em>Remove Scan From Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Scan From Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsentResponse
	 * @generated
	 */
	EClass getRemoveScanFromConsentResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.RequirementsNotFullfilledException <em>Requirements Not Fullfilled Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Not Fullfilled Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RequirementsNotFullfilledException
	 * @generated
	 */
	EClass getRequirementsNotFullfilledException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.RequirementsNotFullfilledException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RequirementsNotFullfilledException#getMessage()
	 * @see #getRequirementsNotFullfilledException()
	 * @generated
	 */
	EAttribute getRequirementsNotFullfilledException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType#getDomains()
	 * @see #getReturnType()
	 * @generated
	 */
	EReference getReturnType_Domains();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType1 <em>Return Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type1</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType1
	 * @generated
	 */
	EClass getReturnType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType1#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType1#getModules()
	 * @see #getReturnType1()
	 * @generated
	 */
	EReference getReturnType1_Modules();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType2 <em>Return Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type2</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType2
	 * @generated
	 */
	EClass getReturnType2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType2#getSignerIdTypes <em>Signer Id Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Id Types</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType2#getSignerIdTypes()
	 * @see #getReturnType2()
	 * @generated
	 */
	EReference getReturnType2_SignerIdTypes();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType3 <em>Return Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type3</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType3
	 * @generated
	 */
	EClass getReturnType3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType3#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType3#getPolicies()
	 * @see #getReturnType3()
	 * @generated
	 */
	EReference getReturnType3_Policies();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType4 <em>Return Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type4</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType4
	 * @generated
	 */
	EClass getReturnType4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType4#getCurrentConsentTemplates <em>Current Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Consent Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType4#getCurrentConsentTemplates()
	 * @see #getReturnType4()
	 * @generated
	 */
	EReference getReturnType4_CurrentConsentTemplates();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType5 <em>Return Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type5</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType5
	 * @generated
	 */
	EClass getReturnType5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType5#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType5#getTemplates()
	 * @see #getReturnType5()
	 * @generated
	 */
	EReference getReturnType5_Templates();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType6 <em>Return Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type6</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType6
	 * @generated
	 */
	EClass getReturnType6();

	/**
	 * Returns the meta object for the attribute list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType6#getConsentIds <em>Consent Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consent Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType6#getConsentIds()
	 * @see #getReturnType6()
	 * @generated
	 */
	EAttribute getReturnType6_ConsentIds();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType7 <em>Return Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type7</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType7
	 * @generated
	 */
	EClass getReturnType7();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType7#getConsents <em>Consents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consents</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType7#getConsents()
	 * @see #getReturnType7()
	 * @generated
	 */
	EReference getReturnType7_Consents();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType8 <em>Return Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type8</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType8
	 * @generated
	 */
	EClass getReturnType8();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType8#getConsents <em>Consents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consents</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType8#getConsents()
	 * @see #getReturnType8()
	 * @generated
	 */
	EReference getReturnType8_Consents();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType9 <em>Return Type9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type9</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType9
	 * @generated
	 */
	EClass getReturnType9();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType9#getSignedPolicies <em>Signed Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signed Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType9#getSignedPolicies()
	 * @see #getReturnType9()
	 * @generated
	 */
	EReference getReturnType9_SignedPolicies();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType10 <em>Return Type10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type10</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType10
	 * @generated
	 */
	EClass getReturnType10();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType10#getConsents <em>Consents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consents</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType10#getConsents()
	 * @see #getReturnType10()
	 * @generated
	 */
	EReference getReturnType10_Consents();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType11 <em>Return Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type11</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType11
	 * @generated
	 */
	EClass getReturnType11();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType11#getSignedPolicies <em>Signed Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signed Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType11#getSignedPolicies()
	 * @see #getReturnType11()
	 * @generated
	 */
	EReference getReturnType11_SignedPolicies();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType12 <em>Return Type12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type12</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType12
	 * @generated
	 */
	EClass getReturnType12();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType12#getSignedPolicies <em>Signed Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signed Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType12#getSignedPolicies()
	 * @see #getReturnType12()
	 * @generated
	 */
	EReference getReturnType12_SignedPolicies();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType13 <em>Return Type13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type13</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType13
	 * @generated
	 */
	EClass getReturnType13();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType13#getSignedPolicies <em>Signed Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signed Policies</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType13#getSignedPolicies()
	 * @see #getReturnType13()
	 * @generated
	 */
	EReference getReturnType13_SignedPolicies();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType14 <em>Return Type14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type14</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType14
	 * @generated
	 */
	EClass getReturnType14();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType14#getQcHistories <em>Qc Histories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qc Histories</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType14#getQcHistories()
	 * @see #getReturnType14()
	 * @generated
	 */
	EReference getReturnType14_QcHistories();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType15 <em>Return Type15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type15</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType15
	 * @generated
	 */
	EClass getReturnType15();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType15#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType15#getSignerIds()
	 * @see #getReturnType15()
	 * @generated
	 */
	EReference getReturnType15_SignerIds();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType16 <em>Return Type16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type16</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType16
	 * @generated
	 */
	EClass getReturnType16();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType16#getConsentTemplates <em>Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consent Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType16#getConsentTemplates()
	 * @see #getReturnType16()
	 * @generated
	 */
	EReference getReturnType16_ConsentTemplates();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType17 <em>Return Type17</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type17</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType17
	 * @generated
	 */
	EClass getReturnType17();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType17#getQcProblemHistories <em>Qc Problem Histories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qc Problem Histories</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType17#getQcProblemHistories()
	 * @see #getReturnType17()
	 * @generated
	 */
	EReference getReturnType17_QcProblemHistories();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType18 <em>Return Type18</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type18</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType18
	 * @generated
	 */
	EClass getReturnType18();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType18#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType18#getTemplates()
	 * @see #getReturnType18()
	 * @generated
	 */
	EReference getReturnType18_Templates();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType19 <em>Return Type19</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type19</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType19
	 * @generated
	 */
	EClass getReturnType19();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType19#getConsents <em>Consents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consents</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType19#getConsents()
	 * @see #getReturnType19()
	 * @generated
	 */
	EReference getReturnType19_Consents();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType20 <em>Return Type20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type20</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType20
	 * @generated
	 */
	EClass getReturnType20();

	/**
	 * Returns the meta object for the attribute list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType20#getSignerIds <em>Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Signer Ids</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType20#getSignerIds()
	 * @see #getReturnType20()
	 * @generated
	 */
	EAttribute getReturnType20_SignerIds();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType21 <em>Return Type21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type21</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType21
	 * @generated
	 */
	EClass getReturnType21();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType21#getConsents <em>Consents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consents</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType21#getConsents()
	 * @see #getReturnType21()
	 * @generated
	 */
	EReference getReturnType21_Consents();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType22 <em>Return Type22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type22</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType22
	 * @generated
	 */
	EClass getReturnType22();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType22#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType22#getEntry()
	 * @see #getReturnType22()
	 * @generated
	 */
	EReference getReturnType22_Entry();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType23 <em>Return Type23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type23</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType23
	 * @generated
	 */
	EClass getReturnType23();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType23#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aliases</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType23#getAliases()
	 * @see #getReturnType23()
	 * @generated
	 */
	EReference getReturnType23_Aliases();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent <em>Set QC For Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set QC For Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent
	 * @generated
	 */
	EClass getSetQCForConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent#getConsentKey()
	 * @see #getSetQCForConsent()
	 * @generated
	 */
	EReference getSetQCForConsent_ConsentKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent#getQc <em>Qc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qc</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent#getQc()
	 * @see #getSetQCForConsent()
	 * @generated
	 */
	EReference getSetQCForConsent_Qc();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsentResponse <em>Set QC For Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set QC For Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsentResponse
	 * @generated
	 */
	EClass getSetQCForConsentResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO <em>Signed Policy DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Policy DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO
	 * @generated
	 */
	EClass getSignedPolicyDTO();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getConsentKey()
	 * @see #getSignedPolicyDTO()
	 * @generated
	 */
	EReference getSignedPolicyDTO_ConsentKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getPolicyKey <em>Policy Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getPolicyKey()
	 * @see #getSignedPolicyDTO()
	 * @generated
	 */
	EReference getSignedPolicyDTO_PolicyKey();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getStatus()
	 * @see #getSignedPolicyDTO()
	 * @generated
	 */
	EAttribute getSignedPolicyDTO_Status();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO <em>Signer Id DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signer Id DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO
	 * @generated
	 */
	EClass getSignerIdDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getCreationDate()
	 * @see #getSignerIdDTO()
	 * @generated
	 */
	EAttribute getSignerIdDTO_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getId()
	 * @see #getSignerIdDTO()
	 * @generated
	 */
	EAttribute getSignerIdDTO_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getIdType()
	 * @see #getSignerIdDTO()
	 * @generated
	 */
	EAttribute getSignerIdDTO_IdType();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getOrderNumber <em>Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Number</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO#getOrderNumber()
	 * @see #getSignerIdDTO()
	 * @generated
	 */
	EAttribute getSignerIdDTO_OrderNumber();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTOArray <em>Signer Id DTO Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signer Id DTO Array</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTOArray
	 * @generated
	 */
	EClass getSignerIdDTOArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTOArray#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTOArray#getItem()
	 * @see #getSignerIdDTOArray()
	 * @generated
	 */
	EReference getSignerIdDTOArray_Item();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO <em>Signer Id Type DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signer Id Type DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO
	 * @generated
	 */
	EClass getSignerIdTypeDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getComment()
	 * @see #getSignerIdTypeDTO()
	 * @generated
	 */
	EAttribute getSignerIdTypeDTO_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getCreateTimestamp <em>Create Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Timestamp</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getCreateTimestamp()
	 * @see #getSignerIdTypeDTO()
	 * @generated
	 */
	EAttribute getSignerIdTypeDTO_CreateTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getLabel()
	 * @see #getSignerIdTypeDTO()
	 * @generated
	 */
	EAttribute getSignerIdTypeDTO_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getName()
	 * @see #getSignerIdTypeDTO()
	 * @generated
	 */
	EAttribute getSignerIdTypeDTO_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getUpdateTimestamp <em>Update Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Timestamp</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO#getUpdateTimestamp()
	 * @see #getSignerIdTypeDTO()
	 * @generated
	 */
	EAttribute getSignerIdTypeDTO_UpdateTimestamp();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownAliasException <em>Unknown Alias Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Alias Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownAliasException
	 * @generated
	 */
	EClass getUnknownAliasException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownAliasException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownAliasException#getMessage()
	 * @see #getUnknownAliasException()
	 * @generated
	 */
	EAttribute getUnknownAliasException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentException <em>Unknown Consent Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Consent Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentException
	 * @generated
	 */
	EClass getUnknownConsentException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentException#getMessage()
	 * @see #getUnknownConsentException()
	 * @generated
	 */
	EAttribute getUnknownConsentException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentTemplateException <em>Unknown Consent Template Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Consent Template Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentTemplateException
	 * @generated
	 */
	EClass getUnknownConsentTemplateException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentTemplateException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentTemplateException#getMessage()
	 * @see #getUnknownConsentTemplateException()
	 * @generated
	 */
	EAttribute getUnknownConsentTemplateException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownDomainException <em>Unknown Domain Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Domain Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownDomainException
	 * @generated
	 */
	EClass getUnknownDomainException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownDomainException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownDomainException#getMessage()
	 * @see #getUnknownDomainException()
	 * @generated
	 */
	EAttribute getUnknownDomainException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownFhirIdObjectException <em>Unknown Fhir Id Object Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Fhir Id Object Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownFhirIdObjectException
	 * @generated
	 */
	EClass getUnknownFhirIdObjectException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownFhirIdObjectException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownFhirIdObjectException#getMessage()
	 * @see #getUnknownFhirIdObjectException()
	 * @generated
	 */
	EAttribute getUnknownFhirIdObjectException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownIDException <em>Unknown ID Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown ID Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownIDException
	 * @generated
	 */
	EClass getUnknownIDException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownIDException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownIDException#getMessage()
	 * @see #getUnknownIDException()
	 * @generated
	 */
	EAttribute getUnknownIDException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownModuleException <em>Unknown Module Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Module Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownModuleException
	 * @generated
	 */
	EClass getUnknownModuleException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownModuleException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownModuleException#getMessage()
	 * @see #getUnknownModuleException()
	 * @generated
	 */
	EAttribute getUnknownModuleException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownPolicyException <em>Unknown Policy Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Policy Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownPolicyException
	 * @generated
	 */
	EClass getUnknownPolicyException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownPolicyException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownPolicyException#getMessage()
	 * @see #getUnknownPolicyException()
	 * @generated
	 */
	EAttribute getUnknownPolicyException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdException <em>Unknown Signer Id Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Signer Id Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdException
	 * @generated
	 */
	EClass getUnknownSignerIdException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdException#getMessage()
	 * @see #getUnknownSignerIdException()
	 * @generated
	 */
	EAttribute getUnknownSignerIdException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdTypeException <em>Unknown Signer Id Type Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Signer Id Type Exception</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdTypeException
	 * @generated
	 */
	EClass getUnknownSignerIdTypeException();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdTypeException#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdTypeException#getMessage()
	 * @see #getUnknownSignerIdTypeException()
	 * @generated
	 */
	EAttribute getUnknownSignerIdTypeException_Message();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse <em>Update Consent In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Consent In Use</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse
	 * @generated
	 */
	EClass getUpdateConsentInUse();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse#getConsentKey <em>Consent Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent Key</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse#getConsentKey()
	 * @see #getUpdateConsentInUse()
	 * @generated
	 */
	EReference getUpdateConsentInUse_ConsentKey();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse#getExternProperties <em>Extern Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extern Properties</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse#getExternProperties()
	 * @see #getUpdateConsentInUse()
	 * @generated
	 */
	EAttribute getUpdateConsentInUse_ExternProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse#getComment()
	 * @see #getUpdateConsentInUse()
	 * @generated
	 */
	EAttribute getUpdateConsentInUse_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse#getScan <em>Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scan</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse#getScan()
	 * @see #getUpdateConsentInUse()
	 * @generated
	 */
	EReference getUpdateConsentInUse_Scan();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUseResponse <em>Update Consent In Use Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Consent In Use Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUseResponse
	 * @generated
	 */
	EClass getUpdateConsentInUseResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent <em>Validate Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent
	 * @generated
	 */
	EClass getValidateConsent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#getConsent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#getConsent()
	 * @see #getValidateConsent()
	 * @generated
	 */
	EReference getValidateConsent_Consent();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isAllowRevoke <em>Allow Revoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Revoke</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isAllowRevoke()
	 * @see #getValidateConsent()
	 * @generated
	 */
	EAttribute getValidateConsent_AllowRevoke();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isValidateScan <em>Validate Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate Scan</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent#isValidateScan()
	 * @see #getValidateConsent()
	 * @generated
	 */
	EAttribute getValidateConsent_ValidateScan();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsentResponse <em>Validate Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Consent Response</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidateConsentResponse
	 * @generated
	 */
	EClass getValidateConsentResponse();

	/**
	 * Returns the meta object for class '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO <em>Valid From Properties DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid From Properties DTO</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO
	 * @generated
	 */
	EClass getValidFromPropertiesDTO();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO#getFixedValidFromDate <em>Fixed Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Valid From Date</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO#getFixedValidFromDate()
	 * @see #getValidFromPropertiesDTO()
	 * @generated
	 */
	EAttribute getValidFromPropertiesDTO_FixedValidFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO#getInvalidPeriod <em>Invalid Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Period</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO#getInvalidPeriod()
	 * @see #getValidFromPropertiesDTO()
	 * @generated
	 */
	EAttribute getValidFromPropertiesDTO_InvalidPeriod();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus <em>Consent Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Status</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @generated
	 */
	EEnum getConsentStatus();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType <em>Consent Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Status Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType
	 * @generated
	 */
	EEnum getConsentStatusType();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType <em>Consent Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Template Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @generated
	 */
	EEnum getConsentTemplateType();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextType <em>Free Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Free Text Type</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextType
	 * @generated
	 */
	EEnum getFreeTextType();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus <em>Qc Problem Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qc Problem Status</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus
	 * @generated
	 */
	EEnum getQcProblemStatus();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError <em>Qc Problem Type Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qc Problem Type Error</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError
	 * @generated
	 */
	EEnum getQcProblemTypeError();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField <em>Qc Problem Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qc Problem Type Field</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField
	 * @generated
	 */
	EEnum getQcProblemTypeField();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence <em>Qc Problem Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qc Problem Type Occurrence</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence
	 * @generated
	 */
	EEnum getQcProblemTypeOccurrence();

	/**
	 * Returns the meta object for enum '{@link org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus <em>Qc Type Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qc Type Status</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus
	 * @generated
	 */
	EEnum getQcTypeStatus();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus <em>Consent Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Consent Status Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus"
	 *        extendedMetaData="name='consentStatus:Object' baseType='consentStatus'"
	 * @generated
	 */
	EDataType getConsentStatusObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType <em>Consent Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Consent Status Type Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType"
	 *        extendedMetaData="name='consentStatusType:Object' baseType='consentStatusType'"
	 * @generated
	 */
	EDataType getConsentStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType <em>Consent Template Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Consent Template Type Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType"
	 *        extendedMetaData="name='consentTemplateType:Object' baseType='consentTemplateType'"
	 * @generated
	 */
	EDataType getConsentTemplateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextType <em>Free Text Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Free Text Type Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextType
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.FreeTextType"
	 *        extendedMetaData="name='freeTextType:Object' baseType='freeTextType'"
	 * @generated
	 */
	EDataType getFreeTextTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus <em>Qc Problem Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qc Problem Status Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus"
	 *        extendedMetaData="name='qcProblemStatus:Object' baseType='qcProblemStatus'"
	 * @generated
	 */
	EDataType getQcProblemStatusObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError <em>Qc Problem Type Error Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qc Problem Type Error Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError"
	 *        extendedMetaData="name='qcProblemTypeError:Object' baseType='qcProblemTypeError'"
	 * @generated
	 */
	EDataType getQcProblemTypeErrorObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField <em>Qc Problem Type Field Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qc Problem Type Field Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField"
	 *        extendedMetaData="name='qcProblemTypeField:Object' baseType='qcProblemTypeField'"
	 * @generated
	 */
	EDataType getQcProblemTypeFieldObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence <em>Qc Problem Type Occurrence Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qc Problem Type Occurrence Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence"
	 *        extendedMetaData="name='qcProblemTypeOccurrence:Object' baseType='qcProblemTypeOccurrence'"
	 * @generated
	 */
	EDataType getQcProblemTypeOccurrenceObject();

	/**
	 * Returns the meta object for data type '{@link org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus <em>Qc Type Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qc Type Status Object</em>'.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus
	 * @model instanceClass="org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus"
	 *        extendedMetaData="name='qcTypeStatus:Object' baseType='qcTypeStatus'"
	 * @generated
	 */
	EDataType getQcTypeStatusObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cm2Factory getCm2Factory();

} //Cm2Package
