/**
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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.emau.icmvc.ganimed.ttp.cm2.AbstractMap;
import org.emau.icmvc.ganimed.ttp.cm2.AddAlias;
import org.emau.icmvc.ganimed.ttp.cm2.AddAliasResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsent;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent;
import org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerIdResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO;
import org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ChildrenType;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Factory;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentStatusType;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;
import org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter;
import org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse;
import org.emau.icmvc.ganimed.ttp.cm2.CountSignedPolicies;
import org.emau.icmvc.ganimed.ttp.cm2.CountSignedPoliciesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias;
import org.emau.icmvc.ganimed.ttp.cm2.DeactivateAliasResponse;
import org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot;
import org.emau.icmvc.ganimed.ttp.cm2.DomainDTO;
import org.emau.icmvc.ganimed.ttp.cm2.DuplicateEntryException;
import org.emau.icmvc.ganimed.ttp.cm2.EntryType;
import org.emau.icmvc.ganimed.ttp.cm2.EntryType1;
import org.emau.icmvc.ganimed.ttp.cm2.EntryType2;
import org.emau.icmvc.ganimed.ttp.cm2.EntryType3;
import org.emau.icmvc.ganimed.ttp.cm2.EntryType4;
import org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO;
import org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO;
import org.emau.icmvc.ganimed.ttp.cm2.FreeTextType;
import org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO;
import org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId;
import org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds;
import org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplate;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomain;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScan;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScanResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIdsResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdTypeResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsent;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentDates;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentDatesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentLight;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentLightResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcludingResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncludingResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcludingResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncludingResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplateResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginatedResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT;
import org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCTResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate;
import org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds;
import org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetDomain;
import org.emau.icmvc.ganimed.ttp.cm2.GetDomainResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId;
import org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerIdResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetModule;
import org.emau.icmvc.ganimed.ttp.cm2.GetModuleResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID;
import org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirIDResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicy;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIdsResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIdsResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIdsResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsent;
import org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem;
import org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblemResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType;
import org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdTypeResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias;
import org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAliasResponse;
import org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPolicies;
import org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPoliciesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.HashMap;
import org.emau.icmvc.ganimed.ttp.cm2.InconsistentStatusException;
import org.emau.icmvc.ganimed.ttp.cm2.InternalException;
import org.emau.icmvc.ganimed.ttp.cm2.InvalidFreeTextException;
import org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException;
import org.emau.icmvc.ganimed.ttp.cm2.InvalidVersionException;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsented;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncludingResponse;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcludingResponse;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncludingResponse;
import org.emau.icmvc.ganimed.ttp.cm2.IsConsentedResponse;
import org.emau.icmvc.ganimed.ttp.cm2.Label;
import org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates;
import org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplatesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplates;
import org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplatesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ListDomains;
import org.emau.icmvc.ganimed.ttp.cm2.ListDomainsResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ListModules;
import org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ListPolicies;
import org.emau.icmvc.ganimed.ttp.cm2.ListPoliciesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypes;
import org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.MandatoryFieldsException;
import org.emau.icmvc.ganimed.ttp.cm2.MissingRequiredObjectException;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleExpirationsType;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTOArray;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyExpirationsType;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.QCProblemType;
import org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction;
import org.emau.icmvc.ganimed.ttp.cm2.QCType;
import org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence;
import org.emau.icmvc.ganimed.ttp.cm2.QcTypeStatus;
import org.emau.icmvc.ganimed.ttp.cm2.Qcdto;
import org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent;
import org.emau.icmvc.ganimed.ttp.cm2.RefuseConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent;
import org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.RequirementsNotFullfilledException;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType1;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType10;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType11;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType12;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType13;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType14;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType15;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType16;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType17;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType18;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType19;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType2;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType20;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType21;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType22;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType23;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType3;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType4;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType5;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType6;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType7;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType8;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType9;
import org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent;
import org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTOArray;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownAliasException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentTemplateException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownDomainException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownFhirIdObjectException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownIDException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownModuleException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownPolicyException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdException;
import org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdTypeException;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUseResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent;
import org.emau.icmvc.ganimed.ttp.cm2.ValidateConsentResponse;

import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;

import org.emau.icmvc.ganimed.ttp.cm2.config.impl.ConfigPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cm2PackageImpl extends EPackageImpl implements Cm2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAliasResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addConsentOptOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addConsentOptOutResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addScanToConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addScanToConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSignerIdToConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSignerIdToConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSignerIdToSignerIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSignerIdToSignerIdResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignedModuleDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignedPolicyDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childrenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentDateValuesDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentKeyDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentLightDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentScanDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentTemplateDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentTemplateKeyDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentTemplateStructureDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countConsentsForDomainWithFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countConsentsForDomainWithFilterResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countSignedPoliciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countSignedPoliciesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deactivateAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deactivateAliasResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass duplicateEntryExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expirationPropertiesDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fhirIdDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeTextDefDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeTextValDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAliasesForSignerIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAliasesForSignerIdResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAliasesForSignerIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAliasesForSignerIdsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentedIdsForEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentedIdsForResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentsForConsentTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentsForConsentTemplateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentsForDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentsForDomainResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentsForDomainWithoutScanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentsForDomainWithoutScanResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentsForSignerIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllConsentsForSignerIdsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllIdsForSignerIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllIdsForSignerIdTypeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentDatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentDatesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentLightResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentsForDomainPaginatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentsForDomainPaginatedResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeFromExcludingToExcludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeFromExcludingToExcludingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeFromExcludingToIncludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeFromExcludingToIncludingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeFromIncludingToExcludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeFromIncludingToExcludingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeFromIncludingToIncludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeFromIncludingToIncludingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentStatusTypeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConsentTemplateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCurrentConsentForSignerIdsAndCTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCurrentConsentForSignerIdsAndCTResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCurrentConsentTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCurrentConsentTemplateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCurrentPolicyStatesForSignerIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCurrentPolicyStatesForSignerIdsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDomainResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getMappedTemplatesForSignerIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getMappedTemplatesForSignerIdResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getModuleResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getObjectByFhirIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getObjectByFhirIDResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPolicyResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPolicyStatesForPolicyAndSignerIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPolicyStatesForPolicyAndSignerIdsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPolicyStatesForPolicyNameAndSignerIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPolicyStatesForPolicyNameAndSignerIdsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPolicyStatesForSignerIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPolicyStatesForSignerIdsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getQCHistoryForConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getQCHistoryForConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getQCProblemHistoryForQCProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getQCProblemHistoryForQCProblemResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getSignerIdsForAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getSignerIdsForAliasResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getSignerIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getSignerIdTypeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTemplatesWithPoliciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTemplatesWithPoliciesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass illegalArgumentExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inconsistentStatusExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidFreeTextExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidParameterExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidVersionExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedFromExcludingToExcludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedFromExcludingToExcludingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedFromExcludingToIncludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedFromExcludingToIncludingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedFromIncludingToExcludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedFromIncludingToExcludingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedFromIncludingToIncludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedFromIncludingToIncludingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isConsentedResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listConsentTemplatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listConsentTemplatesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listCurrentConsentTemplatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listCurrentConsentTemplatesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listDomainsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listDomainsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listModulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listModulesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPoliciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPoliciesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listSignerIdTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listSignerIdTypesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryFieldsExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missingRequiredObjectExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleExpirationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleKeyDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleKeyDTOArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleStateDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleStatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyExpirationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyKeyDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qcdtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qcHistoryDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qcProblemDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qcProblemHistoryDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qcProblemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qcProblemTypeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refuseConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refuseConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeScanFromConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeScanFromConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsNotFullfilledExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType9EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType10EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType12EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType13EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType14EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType15EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType17EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType18EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType19EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType20EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType21EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType22EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType23EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setQCForConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setQCForConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedPolicyDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signerIdDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signerIdDTOArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signerIdTypeDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownAliasExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownConsentExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownConsentTemplateExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownDomainExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownFhirIdObjectExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownIDExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownModuleExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownPolicyExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownSignerIdExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownSignerIdTypeExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateConsentInUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateConsentInUseResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validateConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validateConsentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validFromPropertiesDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentTemplateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum freeTextTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qcProblemStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qcProblemTypeErrorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qcProblemTypeFieldEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qcProblemTypeOccurrenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qcTypeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType consentStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType consentStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType consentTemplateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType freeTextTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qcProblemStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qcProblemTypeErrorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qcProblemTypeFieldObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qcProblemTypeOccurrenceObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qcTypeStatusObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cm2PackageImpl() {
		super(eNS_URI, Cm2Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Cm2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cm2Package init() {
		if (isInited) return (Cm2Package)EPackage.Registry.INSTANCE.getEPackage(Cm2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredCm2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Cm2PackageImpl theCm2Package = registeredCm2Package instanceof Cm2PackageImpl ? (Cm2PackageImpl)registeredCm2Package : new Cm2PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(registeredPackage instanceof ConfigPackageImpl ? registeredPackage : ConfigPackage.eINSTANCE);

		// Create package meta-data objects
		theCm2Package.createPackageContents();
		theConfigPackage.createPackageContents();

		// Initialize created meta-data
		theCm2Package.initializePackageContents();
		theConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCm2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cm2Package.eNS_URI, theCm2Package);
		return theCm2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMap() {
		return abstractMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddAlias() {
		return addAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddAlias_DomainName() {
		return (EAttribute)addAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddAlias_OriginalSignerId() {
		return (EReference)addAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddAlias_AliasSignerId() {
		return (EReference)addAliasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddAliasResponse() {
		return addAliasResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddConsent() {
		return addConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddConsent_Consent() {
		return (EReference)addConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddConsentOptOut() {
		return addConsentOptOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddConsentOptOut_ConsentTemplateKey() {
		return (EReference)addConsentOptOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddConsentOptOut_SignerIds() {
		return (EReference)addConsentOptOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddConsentOptOutResponse() {
		return addConsentOptOutResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddConsentOptOutResponse_Return() {
		return (EReference)addConsentOptOutResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddConsentResponse() {
		return addConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddScanToConsent() {
		return addScanToConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddScanToConsent_ConsentKey() {
		return (EReference)addScanToConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddScanToConsent_ScanBase64() {
		return (EAttribute)addScanToConsentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddScanToConsent_FileType() {
		return (EAttribute)addScanToConsentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddScanToConsent_FileName() {
		return (EAttribute)addScanToConsentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddScanToConsentResponse() {
		return addScanToConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddSignerIdToConsent() {
		return addSignerIdToConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddSignerIdToConsent_ConsentKey() {
		return (EReference)addSignerIdToConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddSignerIdToConsent_SignerId() {
		return (EReference)addSignerIdToConsentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddSignerIdToConsentResponse() {
		return addSignerIdToConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddSignerIdToSignerId() {
		return addSignerIdToSignerIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddSignerIdToSignerId_DomainName() {
		return (EAttribute)addSignerIdToSignerIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddSignerIdToSignerId_ExistentSignerId() {
		return (EReference)addSignerIdToSignerIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddSignerIdToSignerId_NewSignerId() {
		return (EReference)addSignerIdToSignerIdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddSignerIdToSignerIdResponse() {
		return addSignerIdToSignerIdResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignedModuleDTO() {
		return assignedModuleDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignedModuleDTO_Comment() {
		return (EAttribute)assignedModuleDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignedModuleDTO_DefaultConsentStatus() {
		return (EAttribute)assignedModuleDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignedModuleDTO_DisplayCheckboxes() {
		return (EAttribute)assignedModuleDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignedModuleDTO_ExpirationProperties() {
		return (EReference)assignedModuleDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignedModuleDTO_ExternProperties() {
		return (EAttribute)assignedModuleDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignedModuleDTO_Mandatory() {
		return (EAttribute)assignedModuleDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignedModuleDTO_Module() {
		return (EReference)assignedModuleDTOEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignedModuleDTO_OrderNumber() {
		return (EAttribute)assignedModuleDTOEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignedModuleDTO_Parent() {
		return (EReference)assignedModuleDTOEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignedPolicyDTO() {
		return assignedPolicyDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignedPolicyDTO_Comment() {
		return (EAttribute)assignedPolicyDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignedPolicyDTO_ExpirationProperties() {
		return (EReference)assignedPolicyDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignedPolicyDTO_ExternProperties() {
		return (EAttribute)assignedPolicyDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignedPolicyDTO_Policy() {
		return (EReference)assignedPolicyDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildrenType() {
		return childrenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildrenType_Entry() {
		return (EReference)childrenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentDateValuesDTO() {
		return consentDateValuesDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentDateValuesDTO_ConsentExpirationDate() {
		return (EAttribute)consentDateValuesDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentDateValuesDTO_GicsConsentDate() {
		return (EAttribute)consentDateValuesDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentDateValuesDTO_LegalConsentDate() {
		return (EAttribute)consentDateValuesDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentDateValuesDTO_MaxPolicyExpirationDate() {
		return (EAttribute)consentDateValuesDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentDateValuesDTO_ModuleExpirations() {
		return (EReference)consentDateValuesDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentDateValuesDTO_PolicyExpirations() {
		return (EReference)consentDateValuesDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentDTO() {
		return consentDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentDTO_FreeTextVals() {
		return (EReference)consentDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentDTO_PatientSignatureBase64() {
		return (EAttribute)consentDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentDTO_PhysicianSignatureBase64() {
		return (EAttribute)consentDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentDTO_Scans() {
		return (EReference)consentDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentKeyDTO() {
		return consentKeyDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentKeyDTO_ConsentDate() {
		return (EAttribute)consentKeyDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentKeyDTO_ConsentTemplateKey() {
		return (EReference)consentKeyDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentKeyDTO_SignerIds() {
		return (EReference)consentKeyDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentLightDTO() {
		return consentLightDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_Comment() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentLightDTO_ConsentDates() {
		return (EReference)consentLightDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_CreationDate() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentLightDTO_ExpirationProperties() {
		return (EReference)consentLightDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_ExternProperties() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_HasPatientSignature() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentLightDTO_Key() {
		return (EReference)consentLightDTOEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentLightDTO_ModuleStates() {
		return (EReference)consentLightDTOEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_PatientSignatureIsFromGuardian() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_PatientSigningDate() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_PatientSigningPlace() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_PhysicianId() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_PhysicianSigningDate() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_PhysicianSigningPlace() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentLightDTO_QualityControl() {
		return (EReference)consentLightDTOEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_TemplateType() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_UpdateDate() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentLightDTO_ValidFromDate() {
		return (EAttribute)consentLightDTOEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentLightDTO_ValidFromProperties() {
		return (EReference)consentLightDTOEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentScanDTO() {
		return consentScanDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentScanDTO_Base64() {
		return (EAttribute)consentScanDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentScanDTO_ConsentKey() {
		return (EReference)consentScanDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentScanDTO_FileName() {
		return (EAttribute)consentScanDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentScanDTO_FileType() {
		return (EAttribute)consentScanDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentScanDTO_UploadDate() {
		return (EAttribute)consentScanDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentTemplateDTO() {
		return consentTemplateDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_AssignedModules() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_Comment() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_CreationDate() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_ExpirationProperties() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_ExternProperties() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_Finalised() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_Footer() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_FreeTextDefs() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_Header() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_Key() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_Label() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_MappedConsentTemplates() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_MappedObjectionTemplates() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_MappedOptOutConsentTemplates() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_MappedRefusalTemplates() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_MappedRevocationTemplates() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_ScanBase64() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_ScanFileType() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_Structure() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_Title() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_Type() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_UpdateDate() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateDTO_ValidFromProperties() {
		return (EReference)consentTemplateDTOEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateDTO_VersionLabel() {
		return (EAttribute)consentTemplateDTOEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentTemplateKeyDTO() {
		return consentTemplateKeyDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateKeyDTO_DomainName() {
		return (EAttribute)consentTemplateKeyDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateKeyDTO_Name() {
		return (EAttribute)consentTemplateKeyDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsentTemplateKeyDTO_Version() {
		return (EAttribute)consentTemplateKeyDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentTemplateStructureDTO() {
		return consentTemplateStructureDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateStructureDTO_Children() {
		return (EReference)consentTemplateStructureDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsentTemplateStructureDTO_FirstLevelModules() {
		return (EReference)consentTemplateStructureDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountConsentsForDomainWithFilter() {
		return countConsentsForDomainWithFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountConsentsForDomainWithFilter_DomainName() {
		return (EAttribute)countConsentsForDomainWithFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountConsentsForDomainWithFilter_Config() {
		return (EReference)countConsentsForDomainWithFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountConsentsForDomainWithFilterResponse() {
		return countConsentsForDomainWithFilterResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountConsentsForDomainWithFilterResponse_Return() {
		return (EAttribute)countConsentsForDomainWithFilterResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountSignedPolicies() {
		return countSignedPoliciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountSignedPolicies_DomainName() {
		return (EAttribute)countSignedPoliciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountSignedPoliciesResponse() {
		return countSignedPoliciesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountSignedPoliciesResponse_Return() {
		return (EAttribute)countSignedPoliciesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeactivateAlias() {
		return deactivateAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeactivateAlias_DomainName() {
		return (EAttribute)deactivateAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeactivateAlias_OriginalSignerId() {
		return (EReference)deactivateAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeactivateAlias_AliasSignerId() {
		return (EReference)deactivateAliasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeactivateAliasResponse() {
		return deactivateAliasResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddAlias() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddAliasResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddConsentOptOut() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddConsentOptOutResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddScanToConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddScanToConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddSignerIdToConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddSignerIdToConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddSignerIdToSignerId() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AddSignerIdToSignerIdResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CountConsentsForDomainWithFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CountConsentsForDomainWithFilterResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CountSignedPolicies() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CountSignedPoliciesResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DeactivateAlias() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DeactivateAliasResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DuplicateEntryException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAliasesForSignerId() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAliasesForSignerIdResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAliasesForSignerIds() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAliasesForSignerIdsResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentedIdsFor() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentedIdsForResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentsForConsentTemplate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentsForConsentTemplateResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentsForDomain() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentsForDomainResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentsForDomainWithoutScan() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentsForDomainWithoutScanResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentsForSignerIds() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllConsentsForSignerIdsResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllIdsForSignerIdType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetAllIdsForSignerIdTypeResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentDates() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentDatesResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentLight() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentLightResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentsForDomainPaginated() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentsForDomainPaginatedResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeFromExcludingToExcluding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeFromExcludingToExcludingResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeFromExcludingToIncluding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeFromExcludingToIncludingResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeFromIncludingToExcluding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeFromIncludingToExcludingResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeFromIncludingToIncluding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeFromIncludingToIncludingResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentStatusTypeResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentTemplate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConsentTemplateResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCurrentConsentForSignerIdsAndCT() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCurrentConsentForSignerIdsAndCTResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCurrentConsentTemplate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCurrentConsentTemplateResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCurrentPolicyStatesForSignerIds() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCurrentPolicyStatesForSignerIdsResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetDomain() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetDomainResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetMappedTemplatesForSignerId() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetMappedTemplatesForSignerIdResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetModule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetModuleResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetObjectByFhirID() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetObjectByFhirIDResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetPolicy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetPolicyResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetPolicyStatesForPolicyAndSignerIds() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetPolicyStatesForPolicyAndSignerIdsResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIds() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIdsResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetPolicyStatesForSignerIds() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetPolicyStatesForSignerIdsResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetQCHistoryForConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetQCHistoryForConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetQCProblemHistoryForQCProblem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetQCProblemHistoryForQCProblemResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetSignerIdsForAlias() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetSignerIdsForAliasResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetSignerIdType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetSignerIdTypeResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetTemplatesWithPolicies() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetTemplatesWithPoliciesResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IllegalArgumentException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_InconsistentStatusException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_InternalException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_InvalidFreeTextException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_InvalidParameterException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_InvalidVersionException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsented() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedFromExcludingToExcluding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedFromExcludingToExcludingResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedFromExcludingToIncluding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedFromExcludingToIncludingResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedFromIncludingToExcluding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedFromIncludingToExcludingResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedFromIncludingToIncluding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedFromIncludingToIncludingResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsConsentedResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListConsentTemplates() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListConsentTemplatesResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListCurrentConsentTemplates() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListCurrentConsentTemplatesResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListDomains() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListDomainsResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListModules() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListModulesResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListPolicies() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListPoliciesResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListSignerIdTypes() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListSignerIdTypesResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MandatoryFieldsException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MissingRequiredObjectException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RefuseConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RefuseConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RemoveScanFromConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RemoveScanFromConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RequirementsNotFullfilledException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SetQCForConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SetQCForConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownAliasException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownConsentException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownConsentTemplateException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownDomainException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownFhirIdObjectException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownIDException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownModuleException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownPolicyException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownSignerIdException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnknownSignerIdTypeException() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UpdateConsentInUse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UpdateConsentInUseResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ValidateConsent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ValidateConsentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainDTO() {
		return domainDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_Comment() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainDTO_Config() {
		return (EReference)domainDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_CreationDate() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_CtVersionConverter() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainDTO_ExpirationProperties() {
		return (EReference)domainDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_ExternProperties() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_Finalised() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_Label() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_Logo() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_ModuleVersionConverter() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_Name() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_PolicyVersionConverter() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_SignerIdTypes() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainDTO_UpdateDate() {
		return (EAttribute)domainDTOEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDuplicateEntryException() {
		return duplicateEntryExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDuplicateEntryException_Message() {
		return (EAttribute)duplicateEntryExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryType() {
		return entryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType_Key() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType_Value() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryType1() {
		return entryType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType1_Key() {
		return (EReference)entryType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType1_Value() {
		return (EReference)entryType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryType2() {
		return entryType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType2_Key() {
		return (EReference)entryType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType2_Value() {
		return (EReference)entryType2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryType3() {
		return entryType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType3_Key() {
		return (EReference)entryType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType3_Value() {
		return (EReference)entryType3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryType4() {
		return entryType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryType4_Key() {
		return (EReference)entryType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntryType4_Value() {
		return (EAttribute)entryType4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpirationPropertiesDTO() {
		return expirationPropertiesDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpirationPropertiesDTO_FixedExpirationDate() {
		return (EAttribute)expirationPropertiesDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpirationPropertiesDTO_ValidPeriod() {
		return (EAttribute)expirationPropertiesDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFhirIdDTO() {
		return fhirIdDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFhirIdDTO_FhirID() {
		return (EAttribute)fhirIdDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFreeTextDefDTO() {
		return freeTextDefDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_Comment() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_ConverterString() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_CreationDate() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_ExternProperties() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_Finalised() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_Label() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_Name() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_Pos() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_Required() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_Type() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextDefDTO_UpdateDate() {
		return (EAttribute)freeTextDefDTOEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFreeTextValDTO() {
		return freeTextValDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextValDTO_FreeTextDefName() {
		return (EAttribute)freeTextValDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeTextValDTO_Value() {
		return (EAttribute)freeTextValDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAliasesForSignerId() {
		return getAliasesForSignerIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAliasesForSignerId_DomainName() {
		return (EAttribute)getAliasesForSignerIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAliasesForSignerId_OriginalSignerId() {
		return (EReference)getAliasesForSignerIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAliasesForSignerIdResponse() {
		return getAliasesForSignerIdResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAliasesForSignerIdResponse_Return() {
		return (EReference)getAliasesForSignerIdResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAliasesForSignerIds() {
		return getAliasesForSignerIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAliasesForSignerIds_DomainName() {
		return (EAttribute)getAliasesForSignerIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAliasesForSignerIds_OriginalSignerIds() {
		return (EReference)getAliasesForSignerIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAliasesForSignerIdsResponse() {
		return getAliasesForSignerIdsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAliasesForSignerIdsResponse_Return() {
		return (EReference)getAliasesForSignerIdsResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentedIdsFor() {
		return getAllConsentedIdsForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAllConsentedIdsFor_SignerIdTypeName() {
		return (EAttribute)getAllConsentedIdsForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentedIdsFor_PolicyKey() {
		return (EReference)getAllConsentedIdsForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentedIdsFor_Config() {
		return (EReference)getAllConsentedIdsForEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentedIdsForResponse() {
		return getAllConsentedIdsForResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentedIdsForResponse_Return() {
		return (EReference)getAllConsentedIdsForResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentsForConsentTemplate() {
		return getAllConsentsForConsentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentsForConsentTemplate_ConsentTemplateKey() {
		return (EReference)getAllConsentsForConsentTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentsForConsentTemplateResponse() {
		return getAllConsentsForConsentTemplateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentsForConsentTemplateResponse_Return() {
		return (EReference)getAllConsentsForConsentTemplateResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentsForDomain() {
		return getAllConsentsForDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAllConsentsForDomain_DomainName() {
		return (EAttribute)getAllConsentsForDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentsForDomainResponse() {
		return getAllConsentsForDomainResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentsForDomainResponse_Return() {
		return (EReference)getAllConsentsForDomainResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentsForDomainWithoutScan() {
		return getAllConsentsForDomainWithoutScanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAllConsentsForDomainWithoutScan_DomainName() {
		return (EAttribute)getAllConsentsForDomainWithoutScanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentsForDomainWithoutScanResponse() {
		return getAllConsentsForDomainWithoutScanResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentsForDomainWithoutScanResponse_Return() {
		return (EReference)getAllConsentsForDomainWithoutScanResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentsForSignerIds() {
		return getAllConsentsForSignerIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAllConsentsForSignerIds_DomainName() {
		return (EAttribute)getAllConsentsForSignerIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentsForSignerIds_SignerIds() {
		return (EReference)getAllConsentsForSignerIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAllConsentsForSignerIds_UseAliases() {
		return (EAttribute)getAllConsentsForSignerIdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllConsentsForSignerIdsResponse() {
		return getAllConsentsForSignerIdsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllConsentsForSignerIdsResponse_Return() {
		return (EReference)getAllConsentsForSignerIdsResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllIdsForSignerIdType() {
		return getAllIdsForSignerIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAllIdsForSignerIdType_DomainName() {
		return (EAttribute)getAllIdsForSignerIdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetAllIdsForSignerIdType_SignerIdTypeName() {
		return (EAttribute)getAllIdsForSignerIdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAllIdsForSignerIdTypeResponse() {
		return getAllIdsForSignerIdTypeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetAllIdsForSignerIdTypeResponse_Return() {
		return (EReference)getAllIdsForSignerIdTypeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsent() {
		return getConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsent_ConsentKey() {
		return (EReference)getConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentDates() {
		return getConsentDatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentDates_ConsentKey() {
		return (EReference)getConsentDatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentDatesResponse() {
		return getConsentDatesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentDatesResponse_Return() {
		return (EReference)getConsentDatesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentLight() {
		return getConsentLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentLight_ConsentKey() {
		return (EReference)getConsentLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentLightResponse() {
		return getConsentLightResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentLightResponse_Return() {
		return (EReference)getConsentLightResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentResponse() {
		return getConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentResponse_Return() {
		return (EReference)getConsentResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentsForDomainPaginated() {
		return getConsentsForDomainPaginatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentsForDomainPaginated_DomainName() {
		return (EAttribute)getConsentsForDomainPaginatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentsForDomainPaginated_Config() {
		return (EReference)getConsentsForDomainPaginatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentsForDomainPaginatedResponse() {
		return getConsentsForDomainPaginatedResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentsForDomainPaginatedResponse_Return() {
		return (EReference)getConsentsForDomainPaginatedResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusType() {
		return getConsentStatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusType_SignerIds() {
		return (EReference)getConsentStatusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusType_PolicyKey() {
		return (EReference)getConsentStatusTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusType_Config() {
		return (EReference)getConsentStatusTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeFromExcludingToExcluding() {
		return getConsentStatusTypeFromExcludingToExcludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusTypeFromExcludingToExcluding_SignerIds() {
		return (EReference)getConsentStatusTypeFromExcludingToExcludingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToExcluding_DomainName() {
		return (EAttribute)getConsentStatusTypeFromExcludingToExcludingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToExcluding_PolicyName() {
		return (EAttribute)getConsentStatusTypeFromExcludingToExcludingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToExcluding_VersionFrom() {
		return (EAttribute)getConsentStatusTypeFromExcludingToExcludingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToExcluding_VersionTo() {
		return (EAttribute)getConsentStatusTypeFromExcludingToExcludingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusTypeFromExcludingToExcluding_Config() {
		return (EReference)getConsentStatusTypeFromExcludingToExcludingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeFromExcludingToExcludingResponse() {
		return getConsentStatusTypeFromExcludingToExcludingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToExcludingResponse_Return() {
		return (EAttribute)getConsentStatusTypeFromExcludingToExcludingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeFromExcludingToIncluding() {
		return getConsentStatusTypeFromExcludingToIncludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusTypeFromExcludingToIncluding_SignerIds() {
		return (EReference)getConsentStatusTypeFromExcludingToIncludingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToIncluding_DomainName() {
		return (EAttribute)getConsentStatusTypeFromExcludingToIncludingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToIncluding_PolicyName() {
		return (EAttribute)getConsentStatusTypeFromExcludingToIncludingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToIncluding_VersionFrom() {
		return (EAttribute)getConsentStatusTypeFromExcludingToIncludingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToIncluding_VersionTo() {
		return (EAttribute)getConsentStatusTypeFromExcludingToIncludingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusTypeFromExcludingToIncluding_Config() {
		return (EReference)getConsentStatusTypeFromExcludingToIncludingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeFromExcludingToIncludingResponse() {
		return getConsentStatusTypeFromExcludingToIncludingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromExcludingToIncludingResponse_Return() {
		return (EAttribute)getConsentStatusTypeFromExcludingToIncludingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeFromIncludingToExcluding() {
		return getConsentStatusTypeFromIncludingToExcludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusTypeFromIncludingToExcluding_SignerIds() {
		return (EReference)getConsentStatusTypeFromIncludingToExcludingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToExcluding_DomainName() {
		return (EAttribute)getConsentStatusTypeFromIncludingToExcludingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToExcluding_PolicyName() {
		return (EAttribute)getConsentStatusTypeFromIncludingToExcludingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToExcluding_VersionFrom() {
		return (EAttribute)getConsentStatusTypeFromIncludingToExcludingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToExcluding_VersionTo() {
		return (EAttribute)getConsentStatusTypeFromIncludingToExcludingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusTypeFromIncludingToExcluding_Config() {
		return (EReference)getConsentStatusTypeFromIncludingToExcludingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeFromIncludingToExcludingResponse() {
		return getConsentStatusTypeFromIncludingToExcludingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToExcludingResponse_Return() {
		return (EAttribute)getConsentStatusTypeFromIncludingToExcludingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeFromIncludingToIncluding() {
		return getConsentStatusTypeFromIncludingToIncludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusTypeFromIncludingToIncluding_SignerIds() {
		return (EReference)getConsentStatusTypeFromIncludingToIncludingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToIncluding_DomainName() {
		return (EAttribute)getConsentStatusTypeFromIncludingToIncludingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToIncluding_PolicyName() {
		return (EAttribute)getConsentStatusTypeFromIncludingToIncludingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToIncluding_VersionFrom() {
		return (EAttribute)getConsentStatusTypeFromIncludingToIncludingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToIncluding_VersionTo() {
		return (EAttribute)getConsentStatusTypeFromIncludingToIncludingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentStatusTypeFromIncludingToIncluding_Config() {
		return (EReference)getConsentStatusTypeFromIncludingToIncludingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeFromIncludingToIncludingResponse() {
		return getConsentStatusTypeFromIncludingToIncludingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeFromIncludingToIncludingResponse_Return() {
		return (EAttribute)getConsentStatusTypeFromIncludingToIncludingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentStatusTypeResponse() {
		return getConsentStatusTypeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConsentStatusTypeResponse_Return() {
		return (EAttribute)getConsentStatusTypeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentTemplate() {
		return getConsentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentTemplate_ConsentTemplateKey() {
		return (EReference)getConsentTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConsentTemplateResponse() {
		return getConsentTemplateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConsentTemplateResponse_Return() {
		return (EReference)getConsentTemplateResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCurrentConsentForSignerIdsAndCT() {
		return getCurrentConsentForSignerIdsAndCTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetCurrentConsentForSignerIdsAndCT_ConsentTemplateKey() {
		return (EReference)getCurrentConsentForSignerIdsAndCTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetCurrentConsentForSignerIdsAndCT_SignerIds() {
		return (EReference)getCurrentConsentForSignerIdsAndCTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCurrentConsentForSignerIdsAndCT_IgnoreVersionNumber() {
		return (EAttribute)getCurrentConsentForSignerIdsAndCTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCurrentConsentForSignerIdsAndCT_UseAliases() {
		return (EAttribute)getCurrentConsentForSignerIdsAndCTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCurrentConsentForSignerIdsAndCTResponse() {
		return getCurrentConsentForSignerIdsAndCTResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetCurrentConsentForSignerIdsAndCTResponse_Return() {
		return (EReference)getCurrentConsentForSignerIdsAndCTResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCurrentConsentTemplate() {
		return getCurrentConsentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCurrentConsentTemplate_ConsentTemplateName() {
		return (EAttribute)getCurrentConsentTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCurrentConsentTemplate_DomainName() {
		return (EAttribute)getCurrentConsentTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCurrentConsentTemplateResponse() {
		return getCurrentConsentTemplateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetCurrentConsentTemplateResponse_Return() {
		return (EReference)getCurrentConsentTemplateResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCurrentPolicyStatesForSignerIds() {
		return getCurrentPolicyStatesForSignerIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCurrentPolicyStatesForSignerIds_DomainName() {
		return (EAttribute)getCurrentPolicyStatesForSignerIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetCurrentPolicyStatesForSignerIds_SignerIds() {
		return (EReference)getCurrentPolicyStatesForSignerIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetCurrentPolicyStatesForSignerIds_Config() {
		return (EReference)getCurrentPolicyStatesForSignerIdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCurrentPolicyStatesForSignerIdsResponse() {
		return getCurrentPolicyStatesForSignerIdsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetCurrentPolicyStatesForSignerIdsResponse_Return() {
		return (EReference)getCurrentPolicyStatesForSignerIdsResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetDomain() {
		return getDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetDomain_DomainName() {
		return (EAttribute)getDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetDomainResponse() {
		return getDomainResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetDomainResponse_Return() {
		return (EReference)getDomainResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetMappedTemplatesForSignerId() {
		return getMappedTemplatesForSignerIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetMappedTemplatesForSignerId_DomainName() {
		return (EAttribute)getMappedTemplatesForSignerIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetMappedTemplatesForSignerId_CtType() {
		return (EAttribute)getMappedTemplatesForSignerIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetMappedTemplatesForSignerId_SignerId() {
		return (EReference)getMappedTemplatesForSignerIdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetMappedTemplatesForSignerId_UseAliases() {
		return (EAttribute)getMappedTemplatesForSignerIdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetMappedTemplatesForSignerIdResponse() {
		return getMappedTemplatesForSignerIdResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetMappedTemplatesForSignerIdResponse_Return() {
		return (EReference)getMappedTemplatesForSignerIdResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetModule() {
		return getModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetModule_ModuleKey() {
		return (EReference)getModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetModuleResponse() {
		return getModuleResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetModuleResponse_Return() {
		return (EReference)getModuleResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetObjectByFhirID() {
		return getObjectByFhirIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetObjectByFhirID_Clazz() {
		return (EAttribute)getObjectByFhirIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetObjectByFhirID_FhirID() {
		return (EAttribute)getObjectByFhirIDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetObjectByFhirIDResponse() {
		return getObjectByFhirIDResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetObjectByFhirIDResponse_Return() {
		return (EReference)getObjectByFhirIDResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPolicy() {
		return getPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicy_PolicyKey() {
		return (EReference)getPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPolicyResponse() {
		return getPolicyResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicyResponse_Return() {
		return (EReference)getPolicyResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPolicyStatesForPolicyAndSignerIds() {
		return getPolicyStatesForPolicyAndSignerIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicyStatesForPolicyAndSignerIds_PolicyKey() {
		return (EReference)getPolicyStatesForPolicyAndSignerIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicyStatesForPolicyAndSignerIds_SignerIds() {
		return (EReference)getPolicyStatesForPolicyAndSignerIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetPolicyStatesForPolicyAndSignerIds_UseAliases() {
		return (EAttribute)getPolicyStatesForPolicyAndSignerIdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPolicyStatesForPolicyAndSignerIdsResponse() {
		return getPolicyStatesForPolicyAndSignerIdsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicyStatesForPolicyAndSignerIdsResponse_Return() {
		return (EReference)getPolicyStatesForPolicyAndSignerIdsResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPolicyStatesForPolicyNameAndSignerIds() {
		return getPolicyStatesForPolicyNameAndSignerIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetPolicyStatesForPolicyNameAndSignerIds_DomainName() {
		return (EAttribute)getPolicyStatesForPolicyNameAndSignerIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetPolicyStatesForPolicyNameAndSignerIds_PolicyName() {
		return (EAttribute)getPolicyStatesForPolicyNameAndSignerIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicyStatesForPolicyNameAndSignerIds_SignerIds() {
		return (EReference)getPolicyStatesForPolicyNameAndSignerIdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetPolicyStatesForPolicyNameAndSignerIds_UseAliases() {
		return (EAttribute)getPolicyStatesForPolicyNameAndSignerIdsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPolicyStatesForPolicyNameAndSignerIdsResponse() {
		return getPolicyStatesForPolicyNameAndSignerIdsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicyStatesForPolicyNameAndSignerIdsResponse_Return() {
		return (EReference)getPolicyStatesForPolicyNameAndSignerIdsResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPolicyStatesForSignerIds() {
		return getPolicyStatesForSignerIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetPolicyStatesForSignerIds_DomainName() {
		return (EAttribute)getPolicyStatesForSignerIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicyStatesForSignerIds_SignerIds() {
		return (EReference)getPolicyStatesForSignerIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetPolicyStatesForSignerIds_UseAliases() {
		return (EAttribute)getPolicyStatesForSignerIdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetPolicyStatesForSignerIdsResponse() {
		return getPolicyStatesForSignerIdsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetPolicyStatesForSignerIdsResponse_Return() {
		return (EReference)getPolicyStatesForSignerIdsResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetQCHistoryForConsent() {
		return getQCHistoryForConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetQCHistoryForConsent_ConsentKey() {
		return (EReference)getQCHistoryForConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetQCHistoryForConsentResponse() {
		return getQCHistoryForConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetQCHistoryForConsentResponse_Return() {
		return (EReference)getQCHistoryForConsentResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetQCProblemHistoryForQCProblem() {
		return getQCProblemHistoryForQCProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetQCProblemHistoryForQCProblem_QcProblem() {
		return (EReference)getQCProblemHistoryForQCProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetQCProblemHistoryForQCProblem_ConsentKey() {
		return (EReference)getQCProblemHistoryForQCProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetQCProblemHistoryForQCProblemResponse() {
		return getQCProblemHistoryForQCProblemResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetQCProblemHistoryForQCProblemResponse_Return() {
		return (EReference)getQCProblemHistoryForQCProblemResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetSignerIdsForAlias() {
		return getSignerIdsForAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetSignerIdsForAlias_DomainName() {
		return (EAttribute)getSignerIdsForAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetSignerIdsForAlias_AliasSignerId() {
		return (EReference)getSignerIdsForAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetSignerIdsForAliasResponse() {
		return getSignerIdsForAliasResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetSignerIdsForAliasResponse_Return() {
		return (EReference)getSignerIdsForAliasResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetSignerIdType() {
		return getSignerIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetSignerIdType_DomainName() {
		return (EAttribute)getSignerIdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetSignerIdType_SignerIdTypeName() {
		return (EAttribute)getSignerIdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetSignerIdTypeResponse() {
		return getSignerIdTypeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetSignerIdTypeResponse_Return() {
		return (EReference)getSignerIdTypeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTemplatesWithPolicies() {
		return getTemplatesWithPoliciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetTemplatesWithPolicies_PolicyKeyDTOs() {
		return (EReference)getTemplatesWithPoliciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTemplatesWithPoliciesResponse() {
		return getTemplatesWithPoliciesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetTemplatesWithPoliciesResponse_Return() {
		return (EReference)getTemplatesWithPoliciesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashMap() {
		return hashMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIllegalArgumentException() {
		return illegalArgumentExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIllegalArgumentException_Message() {
		return (EAttribute)illegalArgumentExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInconsistentStatusException() {
		return inconsistentStatusExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInconsistentStatusException_Message() {
		return (EAttribute)inconsistentStatusExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalException() {
		return internalExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalException_Message() {
		return (EAttribute)internalExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvalidFreeTextException() {
		return invalidFreeTextExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvalidFreeTextException_Message() {
		return (EAttribute)invalidFreeTextExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvalidParameterException() {
		return invalidParameterExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvalidParameterException_ParameterName() {
		return (EAttribute)invalidParameterExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvalidParameterException_Message() {
		return (EAttribute)invalidParameterExceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvalidVersionException() {
		return invalidVersionExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvalidVersionException_Message() {
		return (EAttribute)invalidVersionExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsented() {
		return isConsentedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsented_SignerIds() {
		return (EReference)isConsentedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsented_PolicyKey() {
		return (EReference)isConsentedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsented_Config() {
		return (EReference)isConsentedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedFromExcludingToExcluding() {
		return isConsentedFromExcludingToExcludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsentedFromExcludingToExcluding_SignerIds() {
		return (EReference)isConsentedFromExcludingToExcludingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToExcluding_DomainName() {
		return (EAttribute)isConsentedFromExcludingToExcludingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToExcluding_PolicyName() {
		return (EAttribute)isConsentedFromExcludingToExcludingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToExcluding_VersionFrom() {
		return (EAttribute)isConsentedFromExcludingToExcludingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToExcluding_VersionTo() {
		return (EAttribute)isConsentedFromExcludingToExcludingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsentedFromExcludingToExcluding_Config() {
		return (EReference)isConsentedFromExcludingToExcludingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedFromExcludingToExcludingResponse() {
		return isConsentedFromExcludingToExcludingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToExcludingResponse_Return() {
		return (EAttribute)isConsentedFromExcludingToExcludingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedFromExcludingToIncluding() {
		return isConsentedFromExcludingToIncludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsentedFromExcludingToIncluding_SignerIds() {
		return (EReference)isConsentedFromExcludingToIncludingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToIncluding_DomainName() {
		return (EAttribute)isConsentedFromExcludingToIncludingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToIncluding_PolicyName() {
		return (EAttribute)isConsentedFromExcludingToIncludingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToIncluding_VersionFrom() {
		return (EAttribute)isConsentedFromExcludingToIncludingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToIncluding_VersionTo() {
		return (EAttribute)isConsentedFromExcludingToIncludingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsentedFromExcludingToIncluding_Config() {
		return (EReference)isConsentedFromExcludingToIncludingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedFromExcludingToIncludingResponse() {
		return isConsentedFromExcludingToIncludingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromExcludingToIncludingResponse_Return() {
		return (EAttribute)isConsentedFromExcludingToIncludingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedFromIncludingToExcluding() {
		return isConsentedFromIncludingToExcludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsentedFromIncludingToExcluding_SignerIds() {
		return (EReference)isConsentedFromIncludingToExcludingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToExcluding_DomainName() {
		return (EAttribute)isConsentedFromIncludingToExcludingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToExcluding_PolicyName() {
		return (EAttribute)isConsentedFromIncludingToExcludingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToExcluding_VersionFrom() {
		return (EAttribute)isConsentedFromIncludingToExcludingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToExcluding_VersionTo() {
		return (EAttribute)isConsentedFromIncludingToExcludingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsentedFromIncludingToExcluding_Config() {
		return (EReference)isConsentedFromIncludingToExcludingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedFromIncludingToExcludingResponse() {
		return isConsentedFromIncludingToExcludingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToExcludingResponse_Return() {
		return (EAttribute)isConsentedFromIncludingToExcludingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedFromIncludingToIncluding() {
		return isConsentedFromIncludingToIncludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsentedFromIncludingToIncluding_SignerIds() {
		return (EReference)isConsentedFromIncludingToIncludingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToIncluding_DomainName() {
		return (EAttribute)isConsentedFromIncludingToIncludingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToIncluding_PolicyName() {
		return (EAttribute)isConsentedFromIncludingToIncludingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToIncluding_VersionFrom() {
		return (EAttribute)isConsentedFromIncludingToIncludingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToIncluding_VersionTo() {
		return (EAttribute)isConsentedFromIncludingToIncludingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsConsentedFromIncludingToIncluding_Config() {
		return (EReference)isConsentedFromIncludingToIncludingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedFromIncludingToIncludingResponse() {
		return isConsentedFromIncludingToIncludingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedFromIncludingToIncludingResponse_Return() {
		return (EAttribute)isConsentedFromIncludingToIncludingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsConsentedResponse() {
		return isConsentedResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsConsentedResponse_Return() {
		return (EAttribute)isConsentedResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Lang() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Value() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListConsentTemplates() {
		return listConsentTemplatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListConsentTemplates_DomainName() {
		return (EAttribute)listConsentTemplatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListConsentTemplates_OnlyFinal() {
		return (EAttribute)listConsentTemplatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListConsentTemplatesResponse() {
		return listConsentTemplatesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListConsentTemplatesResponse_Return() {
		return (EReference)listConsentTemplatesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListCurrentConsentTemplates() {
		return listCurrentConsentTemplatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListCurrentConsentTemplates_DomainName() {
		return (EAttribute)listCurrentConsentTemplatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListCurrentConsentTemplatesResponse() {
		return listCurrentConsentTemplatesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListCurrentConsentTemplatesResponse_Return() {
		return (EReference)listCurrentConsentTemplatesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListDomains() {
		return listDomainsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListDomainsResponse() {
		return listDomainsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListDomainsResponse_Return() {
		return (EReference)listDomainsResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListModules() {
		return listModulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListModules_DomainName() {
		return (EAttribute)listModulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListModules_OnlyFinal() {
		return (EAttribute)listModulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListModulesResponse() {
		return listModulesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListModulesResponse_Return() {
		return (EReference)listModulesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListPolicies() {
		return listPoliciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListPolicies_DomainName() {
		return (EAttribute)listPoliciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListPolicies_OnlyFinal() {
		return (EAttribute)listPoliciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListPoliciesResponse() {
		return listPoliciesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListPoliciesResponse_Return() {
		return (EReference)listPoliciesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListSignerIdTypes() {
		return listSignerIdTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListSignerIdTypes_DomainName() {
		return (EAttribute)listSignerIdTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListSignerIdTypesResponse() {
		return listSignerIdTypesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListSignerIdTypesResponse_Return() {
		return (EReference)listSignerIdTypesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMandatoryFieldsException() {
		return mandatoryFieldsExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMandatoryFieldsException_Message() {
		return (EAttribute)mandatoryFieldsExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMissingRequiredObjectException() {
		return missingRequiredObjectExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMissingRequiredObjectException_Message() {
		return (EAttribute)missingRequiredObjectExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleDTO() {
		return moduleDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleDTO_AssignedPolicies() {
		return (EReference)moduleDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_Comment() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_CreationDate() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_ExternProperties() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_Finalised() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleDTO_Key() {
		return (EReference)moduleDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_Label() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_ShortText() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_Text() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_Title() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleDTO_UpdateDate() {
		return (EAttribute)moduleDTOEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleExpirationsType() {
		return moduleExpirationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleExpirationsType_Entry() {
		return (EReference)moduleExpirationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleKeyDTO() {
		return moduleKeyDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleKeyDTO_DomainName() {
		return (EAttribute)moduleKeyDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleKeyDTO_Name() {
		return (EAttribute)moduleKeyDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleKeyDTO_Version() {
		return (EAttribute)moduleKeyDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleKeyDTOArray() {
		return moduleKeyDTOArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleKeyDTOArray_Item() {
		return (EReference)moduleKeyDTOArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleStateDTO() {
		return moduleStateDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleStateDTO_ConsentState() {
		return (EAttribute)moduleStateDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleStateDTO_Key() {
		return (EReference)moduleStateDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleStateDTO_PolicyKeys() {
		return (EReference)moduleStateDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleStatesType() {
		return moduleStatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleStatesType_Entry() {
		return (EReference)moduleStatesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyDTO() {
		return policyDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDTO_Comment() {
		return (EAttribute)policyDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDTO_CreationDate() {
		return (EAttribute)policyDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDTO_ExternProperties() {
		return (EAttribute)policyDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDTO_Finalised() {
		return (EAttribute)policyDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicyDTO_Key() {
		return (EReference)policyDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDTO_Label() {
		return (EAttribute)policyDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDTO_UpdateDate() {
		return (EAttribute)policyDTOEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyExpirationsType() {
		return policyExpirationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicyExpirationsType_Entry() {
		return (EReference)policyExpirationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyKeyDTO() {
		return policyKeyDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyKeyDTO_DomainName() {
		return (EAttribute)policyKeyDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyKeyDTO_Name() {
		return (EAttribute)policyKeyDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyKeyDTO_Version() {
		return (EAttribute)policyKeyDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQcdto() {
		return qcdtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcdto_Comment() {
		return (EAttribute)qcdtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcdto_Date() {
		return (EAttribute)qcdtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcdto_ExternProperties() {
		return (EAttribute)qcdtoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcdto_Inspector() {
		return (EAttribute)qcdtoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQcdto_Problems() {
		return (EReference)qcdtoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcdto_Type() {
		return (EAttribute)qcdtoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQcHistoryDTO() {
		return qcHistoryDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcHistoryDTO_EndDate() {
		return (EAttribute)qcHistoryDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcHistoryDTO_StartDate() {
		return (EAttribute)qcHistoryDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQcProblemDTO() {
		return qcProblemDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemDTO_CommentExtern() {
		return (EAttribute)qcProblemDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemDTO_CommentIntern() {
		return (EAttribute)qcProblemDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemDTO_CreatedAt() {
		return (EAttribute)qcProblemDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemDTO_FormValue() {
		return (EAttribute)qcProblemDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemDTO_Ref() {
		return (EAttribute)qcProblemDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemDTO_ScanValue() {
		return (EAttribute)qcProblemDTOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemDTO_Status() {
		return (EAttribute)qcProblemDTOEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemDTO_UpdatedAt() {
		return (EAttribute)qcProblemDTOEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQcProblemHistoryDTO() {
		return qcProblemHistoryDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemHistoryDTO_EndDate() {
		return (EAttribute)qcProblemHistoryDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQcProblemHistoryDTO_StartDate() {
		return (EAttribute)qcProblemHistoryDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQCProblemType() {
		return qcProblemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQCProblemType_Label() {
		return (EReference)qcProblemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQCProblemType_Action() {
		return (EAttribute)qcProblemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQCProblemType_Error() {
		return (EAttribute)qcProblemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQCProblemType_Field() {
		return (EAttribute)qcProblemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQCProblemType_Id() {
		return (EAttribute)qcProblemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQCProblemType_Occurrence() {
		return (EAttribute)qcProblemTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQCProblemTypeAction() {
		return qcProblemTypeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQCProblemTypeAction_Label() {
		return (EReference)qcProblemTypeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQCProblemTypeAction_Id() {
		return (EAttribute)qcProblemTypeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQCType() {
		return qcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQCType_Label() {
		return (EReference)qcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQCType_Id() {
		return (EAttribute)qcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQCType_Status() {
		return (EAttribute)qcTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefuseConsent() {
		return refuseConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefuseConsent_ConsentTemplateKey() {
		return (EReference)refuseConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefuseConsent_SignerIds() {
		return (EReference)refuseConsentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefuseConsentResponse() {
		return refuseConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoveScanFromConsent() {
		return removeScanFromConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRemoveScanFromConsent_ConsentKey() {
		return (EReference)removeScanFromConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveScanFromConsent_FhirId() {
		return (EAttribute)removeScanFromConsentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoveScanFromConsentResponse() {
		return removeScanFromConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementsNotFullfilledException() {
		return requirementsNotFullfilledExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementsNotFullfilledException_Message() {
		return (EAttribute)requirementsNotFullfilledExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType() {
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType_Domains() {
		return (EReference)returnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType1() {
		return returnType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType1_Modules() {
		return (EReference)returnType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType2() {
		return returnType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType2_SignerIdTypes() {
		return (EReference)returnType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType3() {
		return returnType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType3_Policies() {
		return (EReference)returnType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType4() {
		return returnType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType4_CurrentConsentTemplates() {
		return (EReference)returnType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType5() {
		return returnType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType5_Templates() {
		return (EReference)returnType5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType6() {
		return returnType6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnType6_ConsentIds() {
		return (EAttribute)returnType6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType7() {
		return returnType7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType7_Consents() {
		return (EReference)returnType7EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType8() {
		return returnType8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType8_Consents() {
		return (EReference)returnType8EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType9() {
		return returnType9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType9_SignedPolicies() {
		return (EReference)returnType9EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType10() {
		return returnType10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType10_Consents() {
		return (EReference)returnType10EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType11() {
		return returnType11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType11_SignedPolicies() {
		return (EReference)returnType11EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType12() {
		return returnType12EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType12_SignedPolicies() {
		return (EReference)returnType12EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType13() {
		return returnType13EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType13_SignedPolicies() {
		return (EReference)returnType13EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType14() {
		return returnType14EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType14_QcHistories() {
		return (EReference)returnType14EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType15() {
		return returnType15EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType15_SignerIds() {
		return (EReference)returnType15EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType16() {
		return returnType16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType16_ConsentTemplates() {
		return (EReference)returnType16EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType17() {
		return returnType17EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType17_QcProblemHistories() {
		return (EReference)returnType17EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType18() {
		return returnType18EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType18_Templates() {
		return (EReference)returnType18EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType19() {
		return returnType19EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType19_Consents() {
		return (EReference)returnType19EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType20() {
		return returnType20EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnType20_SignerIds() {
		return (EAttribute)returnType20EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType21() {
		return returnType21EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType21_Consents() {
		return (EReference)returnType21EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType22() {
		return returnType22EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType22_Entry() {
		return (EReference)returnType22EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType23() {
		return returnType23EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType23_Aliases() {
		return (EReference)returnType23EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetQCForConsent() {
		return setQCForConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetQCForConsent_ConsentKey() {
		return (EReference)setQCForConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetQCForConsent_Qc() {
		return (EReference)setQCForConsentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetQCForConsentResponse() {
		return setQCForConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignedPolicyDTO() {
		return signedPolicyDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignedPolicyDTO_ConsentKey() {
		return (EReference)signedPolicyDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignedPolicyDTO_PolicyKey() {
		return (EReference)signedPolicyDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignedPolicyDTO_Status() {
		return (EAttribute)signedPolicyDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignerIdDTO() {
		return signerIdDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdDTO_CreationDate() {
		return (EAttribute)signerIdDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdDTO_Id() {
		return (EAttribute)signerIdDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdDTO_IdType() {
		return (EAttribute)signerIdDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdDTO_OrderNumber() {
		return (EAttribute)signerIdDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignerIdDTOArray() {
		return signerIdDTOArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignerIdDTOArray_Item() {
		return (EReference)signerIdDTOArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignerIdTypeDTO() {
		return signerIdTypeDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdTypeDTO_Comment() {
		return (EAttribute)signerIdTypeDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdTypeDTO_CreateTimestamp() {
		return (EAttribute)signerIdTypeDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdTypeDTO_Label() {
		return (EAttribute)signerIdTypeDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdTypeDTO_Name() {
		return (EAttribute)signerIdTypeDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignerIdTypeDTO_UpdateTimestamp() {
		return (EAttribute)signerIdTypeDTOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownAliasException() {
		return unknownAliasExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownAliasException_Message() {
		return (EAttribute)unknownAliasExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownConsentException() {
		return unknownConsentExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownConsentException_Message() {
		return (EAttribute)unknownConsentExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownConsentTemplateException() {
		return unknownConsentTemplateExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownConsentTemplateException_Message() {
		return (EAttribute)unknownConsentTemplateExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownDomainException() {
		return unknownDomainExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownDomainException_Message() {
		return (EAttribute)unknownDomainExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownFhirIdObjectException() {
		return unknownFhirIdObjectExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownFhirIdObjectException_Message() {
		return (EAttribute)unknownFhirIdObjectExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownIDException() {
		return unknownIDExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownIDException_Message() {
		return (EAttribute)unknownIDExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownModuleException() {
		return unknownModuleExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownModuleException_Message() {
		return (EAttribute)unknownModuleExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownPolicyException() {
		return unknownPolicyExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPolicyException_Message() {
		return (EAttribute)unknownPolicyExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownSignerIdException() {
		return unknownSignerIdExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownSignerIdException_Message() {
		return (EAttribute)unknownSignerIdExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownSignerIdTypeException() {
		return unknownSignerIdTypeExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownSignerIdTypeException_Message() {
		return (EAttribute)unknownSignerIdTypeExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateConsentInUse() {
		return updateConsentInUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateConsentInUse_ConsentKey() {
		return (EReference)updateConsentInUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateConsentInUse_ExternProperties() {
		return (EAttribute)updateConsentInUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateConsentInUse_Comment() {
		return (EAttribute)updateConsentInUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateConsentInUse_Scan() {
		return (EReference)updateConsentInUseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateConsentInUseResponse() {
		return updateConsentInUseResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidateConsent() {
		return validateConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidateConsent_Consent() {
		return (EReference)validateConsentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidateConsent_AllowRevoke() {
		return (EAttribute)validateConsentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidateConsent_ValidateScan() {
		return (EAttribute)validateConsentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidateConsentResponse() {
		return validateConsentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidFromPropertiesDTO() {
		return validFromPropertiesDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidFromPropertiesDTO_FixedValidFromDate() {
		return (EAttribute)validFromPropertiesDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidFromPropertiesDTO_InvalidPeriod() {
		return (EAttribute)validFromPropertiesDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentStatus() {
		return consentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentStatusType() {
		return consentStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentTemplateType() {
		return consentTemplateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFreeTextType() {
		return freeTextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQcProblemStatus() {
		return qcProblemStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQcProblemTypeError() {
		return qcProblemTypeErrorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQcProblemTypeField() {
		return qcProblemTypeFieldEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQcProblemTypeOccurrence() {
		return qcProblemTypeOccurrenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQcTypeStatus() {
		return qcTypeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConsentStatusObject() {
		return consentStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConsentStatusTypeObject() {
		return consentStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConsentTemplateTypeObject() {
		return consentTemplateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFreeTextTypeObject() {
		return freeTextTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQcProblemStatusObject() {
		return qcProblemStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQcProblemTypeErrorObject() {
		return qcProblemTypeErrorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQcProblemTypeFieldObject() {
		return qcProblemTypeFieldObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQcProblemTypeOccurrenceObject() {
		return qcProblemTypeOccurrenceObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQcTypeStatusObject() {
		return qcTypeStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cm2Factory getCm2Factory() {
		return (Cm2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractMapEClass = createEClass(ABSTRACT_MAP);

		addAliasEClass = createEClass(ADD_ALIAS);
		createEAttribute(addAliasEClass, ADD_ALIAS__DOMAIN_NAME);
		createEReference(addAliasEClass, ADD_ALIAS__ORIGINAL_SIGNER_ID);
		createEReference(addAliasEClass, ADD_ALIAS__ALIAS_SIGNER_ID);

		addAliasResponseEClass = createEClass(ADD_ALIAS_RESPONSE);

		addConsentEClass = createEClass(ADD_CONSENT);
		createEReference(addConsentEClass, ADD_CONSENT__CONSENT);

		addConsentOptOutEClass = createEClass(ADD_CONSENT_OPT_OUT);
		createEReference(addConsentOptOutEClass, ADD_CONSENT_OPT_OUT__CONSENT_TEMPLATE_KEY);
		createEReference(addConsentOptOutEClass, ADD_CONSENT_OPT_OUT__SIGNER_IDS);

		addConsentOptOutResponseEClass = createEClass(ADD_CONSENT_OPT_OUT_RESPONSE);
		createEReference(addConsentOptOutResponseEClass, ADD_CONSENT_OPT_OUT_RESPONSE__RETURN);

		addConsentResponseEClass = createEClass(ADD_CONSENT_RESPONSE);

		addScanToConsentEClass = createEClass(ADD_SCAN_TO_CONSENT);
		createEReference(addScanToConsentEClass, ADD_SCAN_TO_CONSENT__CONSENT_KEY);
		createEAttribute(addScanToConsentEClass, ADD_SCAN_TO_CONSENT__SCAN_BASE64);
		createEAttribute(addScanToConsentEClass, ADD_SCAN_TO_CONSENT__FILE_TYPE);
		createEAttribute(addScanToConsentEClass, ADD_SCAN_TO_CONSENT__FILE_NAME);

		addScanToConsentResponseEClass = createEClass(ADD_SCAN_TO_CONSENT_RESPONSE);

		addSignerIdToConsentEClass = createEClass(ADD_SIGNER_ID_TO_CONSENT);
		createEReference(addSignerIdToConsentEClass, ADD_SIGNER_ID_TO_CONSENT__CONSENT_KEY);
		createEReference(addSignerIdToConsentEClass, ADD_SIGNER_ID_TO_CONSENT__SIGNER_ID);

		addSignerIdToConsentResponseEClass = createEClass(ADD_SIGNER_ID_TO_CONSENT_RESPONSE);

		addSignerIdToSignerIdEClass = createEClass(ADD_SIGNER_ID_TO_SIGNER_ID);
		createEAttribute(addSignerIdToSignerIdEClass, ADD_SIGNER_ID_TO_SIGNER_ID__DOMAIN_NAME);
		createEReference(addSignerIdToSignerIdEClass, ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID);
		createEReference(addSignerIdToSignerIdEClass, ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID);

		addSignerIdToSignerIdResponseEClass = createEClass(ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE);

		assignedModuleDTOEClass = createEClass(ASSIGNED_MODULE_DTO);
		createEAttribute(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__COMMENT);
		createEAttribute(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__DEFAULT_CONSENT_STATUS);
		createEAttribute(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__DISPLAY_CHECKBOXES);
		createEReference(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__EXPIRATION_PROPERTIES);
		createEAttribute(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__EXTERN_PROPERTIES);
		createEAttribute(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__MANDATORY);
		createEReference(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__MODULE);
		createEAttribute(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__ORDER_NUMBER);
		createEReference(assignedModuleDTOEClass, ASSIGNED_MODULE_DTO__PARENT);

		assignedPolicyDTOEClass = createEClass(ASSIGNED_POLICY_DTO);
		createEAttribute(assignedPolicyDTOEClass, ASSIGNED_POLICY_DTO__COMMENT);
		createEReference(assignedPolicyDTOEClass, ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES);
		createEAttribute(assignedPolicyDTOEClass, ASSIGNED_POLICY_DTO__EXTERN_PROPERTIES);
		createEReference(assignedPolicyDTOEClass, ASSIGNED_POLICY_DTO__POLICY);

		childrenTypeEClass = createEClass(CHILDREN_TYPE);
		createEReference(childrenTypeEClass, CHILDREN_TYPE__ENTRY);

		consentDateValuesDTOEClass = createEClass(CONSENT_DATE_VALUES_DTO);
		createEAttribute(consentDateValuesDTOEClass, CONSENT_DATE_VALUES_DTO__CONSENT_EXPIRATION_DATE);
		createEAttribute(consentDateValuesDTOEClass, CONSENT_DATE_VALUES_DTO__GICS_CONSENT_DATE);
		createEAttribute(consentDateValuesDTOEClass, CONSENT_DATE_VALUES_DTO__LEGAL_CONSENT_DATE);
		createEAttribute(consentDateValuesDTOEClass, CONSENT_DATE_VALUES_DTO__MAX_POLICY_EXPIRATION_DATE);
		createEReference(consentDateValuesDTOEClass, CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS);
		createEReference(consentDateValuesDTOEClass, CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS);

		consentDTOEClass = createEClass(CONSENT_DTO);
		createEReference(consentDTOEClass, CONSENT_DTO__FREE_TEXT_VALS);
		createEAttribute(consentDTOEClass, CONSENT_DTO__PATIENT_SIGNATURE_BASE64);
		createEAttribute(consentDTOEClass, CONSENT_DTO__PHYSICIAN_SIGNATURE_BASE64);
		createEReference(consentDTOEClass, CONSENT_DTO__SCANS);

		consentKeyDTOEClass = createEClass(CONSENT_KEY_DTO);
		createEAttribute(consentKeyDTOEClass, CONSENT_KEY_DTO__CONSENT_DATE);
		createEReference(consentKeyDTOEClass, CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY);
		createEReference(consentKeyDTOEClass, CONSENT_KEY_DTO__SIGNER_IDS);

		consentLightDTOEClass = createEClass(CONSENT_LIGHT_DTO);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__COMMENT);
		createEReference(consentLightDTOEClass, CONSENT_LIGHT_DTO__CONSENT_DATES);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__CREATION_DATE);
		createEReference(consentLightDTOEClass, CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__EXTERN_PROPERTIES);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE);
		createEReference(consentLightDTOEClass, CONSENT_LIGHT_DTO__KEY);
		createEReference(consentLightDTOEClass, CONSENT_LIGHT_DTO__MODULE_STATES);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__PATIENT_SIGNING_DATE);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__PATIENT_SIGNING_PLACE);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__PHYSICIAN_ID);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_DATE);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_PLACE);
		createEReference(consentLightDTOEClass, CONSENT_LIGHT_DTO__QUALITY_CONTROL);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__TEMPLATE_TYPE);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__UPDATE_DATE);
		createEAttribute(consentLightDTOEClass, CONSENT_LIGHT_DTO__VALID_FROM_DATE);
		createEReference(consentLightDTOEClass, CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES);

		consentScanDTOEClass = createEClass(CONSENT_SCAN_DTO);
		createEAttribute(consentScanDTOEClass, CONSENT_SCAN_DTO__BASE64);
		createEReference(consentScanDTOEClass, CONSENT_SCAN_DTO__CONSENT_KEY);
		createEAttribute(consentScanDTOEClass, CONSENT_SCAN_DTO__FILE_NAME);
		createEAttribute(consentScanDTOEClass, CONSENT_SCAN_DTO__FILE_TYPE);
		createEAttribute(consentScanDTOEClass, CONSENT_SCAN_DTO__UPLOAD_DATE);

		consentTemplateDTOEClass = createEClass(CONSENT_TEMPLATE_DTO);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__ASSIGNED_MODULES);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__COMMENT);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__CREATION_DATE);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__EXTERN_PROPERTIES);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__FINALISED);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__FOOTER);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__FREE_TEXT_DEFS);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__HEADER);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__KEY);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__LABEL);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__MAPPED_CONSENT_TEMPLATES);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__MAPPED_OBJECTION_TEMPLATES);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__MAPPED_OPT_OUT_CONSENT_TEMPLATES);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__MAPPED_REFUSAL_TEMPLATES);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__MAPPED_REVOCATION_TEMPLATES);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__SCAN_BASE64);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__SCAN_FILE_TYPE);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__STRUCTURE);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__TITLE);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__TYPE);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__UPDATE_DATE);
		createEReference(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES);
		createEAttribute(consentTemplateDTOEClass, CONSENT_TEMPLATE_DTO__VERSION_LABEL);

		consentTemplateKeyDTOEClass = createEClass(CONSENT_TEMPLATE_KEY_DTO);
		createEAttribute(consentTemplateKeyDTOEClass, CONSENT_TEMPLATE_KEY_DTO__DOMAIN_NAME);
		createEAttribute(consentTemplateKeyDTOEClass, CONSENT_TEMPLATE_KEY_DTO__NAME);
		createEAttribute(consentTemplateKeyDTOEClass, CONSENT_TEMPLATE_KEY_DTO__VERSION);

		consentTemplateStructureDTOEClass = createEClass(CONSENT_TEMPLATE_STRUCTURE_DTO);
		createEReference(consentTemplateStructureDTOEClass, CONSENT_TEMPLATE_STRUCTURE_DTO__CHILDREN);
		createEReference(consentTemplateStructureDTOEClass, CONSENT_TEMPLATE_STRUCTURE_DTO__FIRST_LEVEL_MODULES);

		countConsentsForDomainWithFilterEClass = createEClass(COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER);
		createEAttribute(countConsentsForDomainWithFilterEClass, COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER__DOMAIN_NAME);
		createEReference(countConsentsForDomainWithFilterEClass, COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER__CONFIG);

		countConsentsForDomainWithFilterResponseEClass = createEClass(COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE);
		createEAttribute(countConsentsForDomainWithFilterResponseEClass, COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE__RETURN);

		countSignedPoliciesEClass = createEClass(COUNT_SIGNED_POLICIES);
		createEAttribute(countSignedPoliciesEClass, COUNT_SIGNED_POLICIES__DOMAIN_NAME);

		countSignedPoliciesResponseEClass = createEClass(COUNT_SIGNED_POLICIES_RESPONSE);
		createEAttribute(countSignedPoliciesResponseEClass, COUNT_SIGNED_POLICIES_RESPONSE__RETURN);

		deactivateAliasEClass = createEClass(DEACTIVATE_ALIAS);
		createEAttribute(deactivateAliasEClass, DEACTIVATE_ALIAS__DOMAIN_NAME);
		createEReference(deactivateAliasEClass, DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID);
		createEReference(deactivateAliasEClass, DEACTIVATE_ALIAS__ALIAS_SIGNER_ID);

		deactivateAliasResponseEClass = createEClass(DEACTIVATE_ALIAS_RESPONSE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_ALIAS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_ALIAS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_CONSENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COUNT_SIGNED_POLICIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COUNT_SIGNED_POLICIES_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEACTIVATE_ALIAS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEACTIVATE_ALIAS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DUPLICATE_ENTRY_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_DATES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_DATES_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_LIGHT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_LIGHT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_TEMPLATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONSENT_TEMPLATE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DOMAIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DOMAIN_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_MODULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_MODULE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_POLICY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_POLICY_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_SIGNER_ID_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_SIGNER_ID_TYPE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ILLEGAL_ARGUMENT_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INCONSISTENT_STATUS_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERNAL_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INVALID_FREE_TEXT_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INVALID_PARAMETER_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INVALID_VERSION_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_CONSENTED_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_DOMAINS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_DOMAINS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_MODULES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_MODULES_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_POLICIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_POLICIES_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MANDATORY_FIELDS_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MISSING_REQUIRED_OBJECT_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFUSE_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFUSE_CONSENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIREMENTS_NOT_FULLFILLED_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SET_QC_FOR_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SET_QC_FOR_CONSENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_ALIAS_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_CONSENT_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_CONSENT_TEMPLATE_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_DOMAIN_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_FHIR_ID_OBJECT_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_ID_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_MODULE_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_POLICY_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_TYPE_EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATE_CONSENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATE_CONSENT_RESPONSE);

		domainDTOEClass = createEClass(DOMAIN_DTO);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__COMMENT);
		createEReference(domainDTOEClass, DOMAIN_DTO__CONFIG);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__CREATION_DATE);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__CT_VERSION_CONVERTER);
		createEReference(domainDTOEClass, DOMAIN_DTO__EXPIRATION_PROPERTIES);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__EXTERN_PROPERTIES);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__FINALISED);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__LABEL);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__LOGO);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__MODULE_VERSION_CONVERTER);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__NAME);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__POLICY_VERSION_CONVERTER);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__SIGNER_ID_TYPES);
		createEAttribute(domainDTOEClass, DOMAIN_DTO__UPDATE_DATE);

		duplicateEntryExceptionEClass = createEClass(DUPLICATE_ENTRY_EXCEPTION);
		createEAttribute(duplicateEntryExceptionEClass, DUPLICATE_ENTRY_EXCEPTION__MESSAGE);

		entryTypeEClass = createEClass(ENTRY_TYPE);
		createEReference(entryTypeEClass, ENTRY_TYPE__KEY);
		createEReference(entryTypeEClass, ENTRY_TYPE__VALUE);

		entryType1EClass = createEClass(ENTRY_TYPE1);
		createEReference(entryType1EClass, ENTRY_TYPE1__KEY);
		createEReference(entryType1EClass, ENTRY_TYPE1__VALUE);

		entryType2EClass = createEClass(ENTRY_TYPE2);
		createEReference(entryType2EClass, ENTRY_TYPE2__KEY);
		createEReference(entryType2EClass, ENTRY_TYPE2__VALUE);

		entryType3EClass = createEClass(ENTRY_TYPE3);
		createEReference(entryType3EClass, ENTRY_TYPE3__KEY);
		createEReference(entryType3EClass, ENTRY_TYPE3__VALUE);

		entryType4EClass = createEClass(ENTRY_TYPE4);
		createEReference(entryType4EClass, ENTRY_TYPE4__KEY);
		createEAttribute(entryType4EClass, ENTRY_TYPE4__VALUE);

		expirationPropertiesDTOEClass = createEClass(EXPIRATION_PROPERTIES_DTO);
		createEAttribute(expirationPropertiesDTOEClass, EXPIRATION_PROPERTIES_DTO__FIXED_EXPIRATION_DATE);
		createEAttribute(expirationPropertiesDTOEClass, EXPIRATION_PROPERTIES_DTO__VALID_PERIOD);

		fhirIdDTOEClass = createEClass(FHIR_ID_DTO);
		createEAttribute(fhirIdDTOEClass, FHIR_ID_DTO__FHIR_ID);

		freeTextDefDTOEClass = createEClass(FREE_TEXT_DEF_DTO);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__COMMENT);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__CONVERTER_STRING);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__CREATION_DATE);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__EXTERN_PROPERTIES);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__FINALISED);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__LABEL);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__NAME);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__POS);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__REQUIRED);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__TYPE);
		createEAttribute(freeTextDefDTOEClass, FREE_TEXT_DEF_DTO__UPDATE_DATE);

		freeTextValDTOEClass = createEClass(FREE_TEXT_VAL_DTO);
		createEAttribute(freeTextValDTOEClass, FREE_TEXT_VAL_DTO__FREE_TEXT_DEF_NAME);
		createEAttribute(freeTextValDTOEClass, FREE_TEXT_VAL_DTO__VALUE);

		getAliasesForSignerIdEClass = createEClass(GET_ALIASES_FOR_SIGNER_ID);
		createEAttribute(getAliasesForSignerIdEClass, GET_ALIASES_FOR_SIGNER_ID__DOMAIN_NAME);
		createEReference(getAliasesForSignerIdEClass, GET_ALIASES_FOR_SIGNER_ID__ORIGINAL_SIGNER_ID);

		getAliasesForSignerIdResponseEClass = createEClass(GET_ALIASES_FOR_SIGNER_ID_RESPONSE);
		createEReference(getAliasesForSignerIdResponseEClass, GET_ALIASES_FOR_SIGNER_ID_RESPONSE__RETURN);

		getAliasesForSignerIdsEClass = createEClass(GET_ALIASES_FOR_SIGNER_IDS);
		createEAttribute(getAliasesForSignerIdsEClass, GET_ALIASES_FOR_SIGNER_IDS__DOMAIN_NAME);
		createEReference(getAliasesForSignerIdsEClass, GET_ALIASES_FOR_SIGNER_IDS__ORIGINAL_SIGNER_IDS);

		getAliasesForSignerIdsResponseEClass = createEClass(GET_ALIASES_FOR_SIGNER_IDS_RESPONSE);
		createEReference(getAliasesForSignerIdsResponseEClass, GET_ALIASES_FOR_SIGNER_IDS_RESPONSE__RETURN);

		getAllConsentedIdsForEClass = createEClass(GET_ALL_CONSENTED_IDS_FOR);
		createEAttribute(getAllConsentedIdsForEClass, GET_ALL_CONSENTED_IDS_FOR__SIGNER_ID_TYPE_NAME);
		createEReference(getAllConsentedIdsForEClass, GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY);
		createEReference(getAllConsentedIdsForEClass, GET_ALL_CONSENTED_IDS_FOR__CONFIG);

		getAllConsentedIdsForResponseEClass = createEClass(GET_ALL_CONSENTED_IDS_FOR_RESPONSE);
		createEReference(getAllConsentedIdsForResponseEClass, GET_ALL_CONSENTED_IDS_FOR_RESPONSE__RETURN);

		getAllConsentsForConsentTemplateEClass = createEClass(GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE);
		createEReference(getAllConsentsForConsentTemplateEClass, GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY);

		getAllConsentsForConsentTemplateResponseEClass = createEClass(GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE);
		createEReference(getAllConsentsForConsentTemplateResponseEClass, GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE__RETURN);

		getAllConsentsForDomainEClass = createEClass(GET_ALL_CONSENTS_FOR_DOMAIN);
		createEAttribute(getAllConsentsForDomainEClass, GET_ALL_CONSENTS_FOR_DOMAIN__DOMAIN_NAME);

		getAllConsentsForDomainResponseEClass = createEClass(GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE);
		createEReference(getAllConsentsForDomainResponseEClass, GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE__RETURN);

		getAllConsentsForDomainWithoutScanEClass = createEClass(GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN);
		createEAttribute(getAllConsentsForDomainWithoutScanEClass, GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN__DOMAIN_NAME);

		getAllConsentsForDomainWithoutScanResponseEClass = createEClass(GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE);
		createEReference(getAllConsentsForDomainWithoutScanResponseEClass, GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE__RETURN);

		getAllConsentsForSignerIdsEClass = createEClass(GET_ALL_CONSENTS_FOR_SIGNER_IDS);
		createEAttribute(getAllConsentsForSignerIdsEClass, GET_ALL_CONSENTS_FOR_SIGNER_IDS__DOMAIN_NAME);
		createEReference(getAllConsentsForSignerIdsEClass, GET_ALL_CONSENTS_FOR_SIGNER_IDS__SIGNER_IDS);
		createEAttribute(getAllConsentsForSignerIdsEClass, GET_ALL_CONSENTS_FOR_SIGNER_IDS__USE_ALIASES);

		getAllConsentsForSignerIdsResponseEClass = createEClass(GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE);
		createEReference(getAllConsentsForSignerIdsResponseEClass, GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE__RETURN);

		getAllIdsForSignerIdTypeEClass = createEClass(GET_ALL_IDS_FOR_SIGNER_ID_TYPE);
		createEAttribute(getAllIdsForSignerIdTypeEClass, GET_ALL_IDS_FOR_SIGNER_ID_TYPE__DOMAIN_NAME);
		createEAttribute(getAllIdsForSignerIdTypeEClass, GET_ALL_IDS_FOR_SIGNER_ID_TYPE__SIGNER_ID_TYPE_NAME);

		getAllIdsForSignerIdTypeResponseEClass = createEClass(GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE);
		createEReference(getAllIdsForSignerIdTypeResponseEClass, GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE__RETURN);

		getConsentEClass = createEClass(GET_CONSENT);
		createEReference(getConsentEClass, GET_CONSENT__CONSENT_KEY);

		getConsentDatesEClass = createEClass(GET_CONSENT_DATES);
		createEReference(getConsentDatesEClass, GET_CONSENT_DATES__CONSENT_KEY);

		getConsentDatesResponseEClass = createEClass(GET_CONSENT_DATES_RESPONSE);
		createEReference(getConsentDatesResponseEClass, GET_CONSENT_DATES_RESPONSE__RETURN);

		getConsentLightEClass = createEClass(GET_CONSENT_LIGHT);
		createEReference(getConsentLightEClass, GET_CONSENT_LIGHT__CONSENT_KEY);

		getConsentLightResponseEClass = createEClass(GET_CONSENT_LIGHT_RESPONSE);
		createEReference(getConsentLightResponseEClass, GET_CONSENT_LIGHT_RESPONSE__RETURN);

		getConsentResponseEClass = createEClass(GET_CONSENT_RESPONSE);
		createEReference(getConsentResponseEClass, GET_CONSENT_RESPONSE__RETURN);

		getConsentsForDomainPaginatedEClass = createEClass(GET_CONSENTS_FOR_DOMAIN_PAGINATED);
		createEAttribute(getConsentsForDomainPaginatedEClass, GET_CONSENTS_FOR_DOMAIN_PAGINATED__DOMAIN_NAME);
		createEReference(getConsentsForDomainPaginatedEClass, GET_CONSENTS_FOR_DOMAIN_PAGINATED__CONFIG);

		getConsentsForDomainPaginatedResponseEClass = createEClass(GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE);
		createEReference(getConsentsForDomainPaginatedResponseEClass, GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE__RETURN);

		getConsentStatusTypeEClass = createEClass(GET_CONSENT_STATUS_TYPE);
		createEReference(getConsentStatusTypeEClass, GET_CONSENT_STATUS_TYPE__SIGNER_IDS);
		createEReference(getConsentStatusTypeEClass, GET_CONSENT_STATUS_TYPE__POLICY_KEY);
		createEReference(getConsentStatusTypeEClass, GET_CONSENT_STATUS_TYPE__CONFIG);

		getConsentStatusTypeFromExcludingToExcludingEClass = createEClass(GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING);
		createEReference(getConsentStatusTypeFromExcludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__SIGNER_IDS);
		createEAttribute(getConsentStatusTypeFromExcludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__DOMAIN_NAME);
		createEAttribute(getConsentStatusTypeFromExcludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__POLICY_NAME);
		createEAttribute(getConsentStatusTypeFromExcludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__VERSION_FROM);
		createEAttribute(getConsentStatusTypeFromExcludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__VERSION_TO);
		createEReference(getConsentStatusTypeFromExcludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING__CONFIG);

		getConsentStatusTypeFromExcludingToExcludingResponseEClass = createEClass(GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE);
		createEAttribute(getConsentStatusTypeFromExcludingToExcludingResponseEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE__RETURN);

		getConsentStatusTypeFromExcludingToIncludingEClass = createEClass(GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING);
		createEReference(getConsentStatusTypeFromExcludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS);
		createEAttribute(getConsentStatusTypeFromExcludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME);
		createEAttribute(getConsentStatusTypeFromExcludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME);
		createEAttribute(getConsentStatusTypeFromExcludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM);
		createEAttribute(getConsentStatusTypeFromExcludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO);
		createEReference(getConsentStatusTypeFromExcludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG);

		getConsentStatusTypeFromExcludingToIncludingResponseEClass = createEClass(GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE);
		createEAttribute(getConsentStatusTypeFromExcludingToIncludingResponseEClass, GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE__RETURN);

		getConsentStatusTypeFromIncludingToExcludingEClass = createEClass(GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING);
		createEReference(getConsentStatusTypeFromIncludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__SIGNER_IDS);
		createEAttribute(getConsentStatusTypeFromIncludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__DOMAIN_NAME);
		createEAttribute(getConsentStatusTypeFromIncludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__POLICY_NAME);
		createEAttribute(getConsentStatusTypeFromIncludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__VERSION_FROM);
		createEAttribute(getConsentStatusTypeFromIncludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__VERSION_TO);
		createEReference(getConsentStatusTypeFromIncludingToExcludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING__CONFIG);

		getConsentStatusTypeFromIncludingToExcludingResponseEClass = createEClass(GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE);
		createEAttribute(getConsentStatusTypeFromIncludingToExcludingResponseEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE__RETURN);

		getConsentStatusTypeFromIncludingToIncludingEClass = createEClass(GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING);
		createEReference(getConsentStatusTypeFromIncludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__SIGNER_IDS);
		createEAttribute(getConsentStatusTypeFromIncludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__DOMAIN_NAME);
		createEAttribute(getConsentStatusTypeFromIncludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__POLICY_NAME);
		createEAttribute(getConsentStatusTypeFromIncludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__VERSION_FROM);
		createEAttribute(getConsentStatusTypeFromIncludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__VERSION_TO);
		createEReference(getConsentStatusTypeFromIncludingToIncludingEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING__CONFIG);

		getConsentStatusTypeFromIncludingToIncludingResponseEClass = createEClass(GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE);
		createEAttribute(getConsentStatusTypeFromIncludingToIncludingResponseEClass, GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE__RETURN);

		getConsentStatusTypeResponseEClass = createEClass(GET_CONSENT_STATUS_TYPE_RESPONSE);
		createEAttribute(getConsentStatusTypeResponseEClass, GET_CONSENT_STATUS_TYPE_RESPONSE__RETURN);

		getConsentTemplateEClass = createEClass(GET_CONSENT_TEMPLATE);
		createEReference(getConsentTemplateEClass, GET_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY);

		getConsentTemplateResponseEClass = createEClass(GET_CONSENT_TEMPLATE_RESPONSE);
		createEReference(getConsentTemplateResponseEClass, GET_CONSENT_TEMPLATE_RESPONSE__RETURN);

		getCurrentConsentForSignerIdsAndCTEClass = createEClass(GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT);
		createEReference(getCurrentConsentForSignerIdsAndCTEClass, GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT__CONSENT_TEMPLATE_KEY);
		createEReference(getCurrentConsentForSignerIdsAndCTEClass, GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT__SIGNER_IDS);
		createEAttribute(getCurrentConsentForSignerIdsAndCTEClass, GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT__IGNORE_VERSION_NUMBER);
		createEAttribute(getCurrentConsentForSignerIdsAndCTEClass, GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT__USE_ALIASES);

		getCurrentConsentForSignerIdsAndCTResponseEClass = createEClass(GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE);
		createEReference(getCurrentConsentForSignerIdsAndCTResponseEClass, GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE__RETURN);

		getCurrentConsentTemplateEClass = createEClass(GET_CURRENT_CONSENT_TEMPLATE);
		createEAttribute(getCurrentConsentTemplateEClass, GET_CURRENT_CONSENT_TEMPLATE__CONSENT_TEMPLATE_NAME);
		createEAttribute(getCurrentConsentTemplateEClass, GET_CURRENT_CONSENT_TEMPLATE__DOMAIN_NAME);

		getCurrentConsentTemplateResponseEClass = createEClass(GET_CURRENT_CONSENT_TEMPLATE_RESPONSE);
		createEReference(getCurrentConsentTemplateResponseEClass, GET_CURRENT_CONSENT_TEMPLATE_RESPONSE__RETURN);

		getCurrentPolicyStatesForSignerIdsEClass = createEClass(GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS);
		createEAttribute(getCurrentPolicyStatesForSignerIdsEClass, GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME);
		createEReference(getCurrentPolicyStatesForSignerIdsEClass, GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS);
		createEReference(getCurrentPolicyStatesForSignerIdsEClass, GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG);

		getCurrentPolicyStatesForSignerIdsResponseEClass = createEClass(GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE);
		createEReference(getCurrentPolicyStatesForSignerIdsResponseEClass, GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE__RETURN);

		getDomainEClass = createEClass(GET_DOMAIN);
		createEAttribute(getDomainEClass, GET_DOMAIN__DOMAIN_NAME);

		getDomainResponseEClass = createEClass(GET_DOMAIN_RESPONSE);
		createEReference(getDomainResponseEClass, GET_DOMAIN_RESPONSE__RETURN);

		getMappedTemplatesForSignerIdEClass = createEClass(GET_MAPPED_TEMPLATES_FOR_SIGNER_ID);
		createEAttribute(getMappedTemplatesForSignerIdEClass, GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__DOMAIN_NAME);
		createEAttribute(getMappedTemplatesForSignerIdEClass, GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__CT_TYPE);
		createEReference(getMappedTemplatesForSignerIdEClass, GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID);
		createEAttribute(getMappedTemplatesForSignerIdEClass, GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__USE_ALIASES);

		getMappedTemplatesForSignerIdResponseEClass = createEClass(GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE);
		createEReference(getMappedTemplatesForSignerIdResponseEClass, GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE__RETURN);

		getModuleEClass = createEClass(GET_MODULE);
		createEReference(getModuleEClass, GET_MODULE__MODULE_KEY);

		getModuleResponseEClass = createEClass(GET_MODULE_RESPONSE);
		createEReference(getModuleResponseEClass, GET_MODULE_RESPONSE__RETURN);

		getObjectByFhirIDEClass = createEClass(GET_OBJECT_BY_FHIR_ID);
		createEAttribute(getObjectByFhirIDEClass, GET_OBJECT_BY_FHIR_ID__CLAZZ);
		createEAttribute(getObjectByFhirIDEClass, GET_OBJECT_BY_FHIR_ID__FHIR_ID);

		getObjectByFhirIDResponseEClass = createEClass(GET_OBJECT_BY_FHIR_ID_RESPONSE);
		createEReference(getObjectByFhirIDResponseEClass, GET_OBJECT_BY_FHIR_ID_RESPONSE__RETURN);

		getPolicyEClass = createEClass(GET_POLICY);
		createEReference(getPolicyEClass, GET_POLICY__POLICY_KEY);

		getPolicyResponseEClass = createEClass(GET_POLICY_RESPONSE);
		createEReference(getPolicyResponseEClass, GET_POLICY_RESPONSE__RETURN);

		getPolicyStatesForPolicyAndSignerIdsEClass = createEClass(GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS);
		createEReference(getPolicyStatesForPolicyAndSignerIdsEClass, GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY);
		createEReference(getPolicyStatesForPolicyAndSignerIdsEClass, GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__SIGNER_IDS);
		createEAttribute(getPolicyStatesForPolicyAndSignerIdsEClass, GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__USE_ALIASES);

		getPolicyStatesForPolicyAndSignerIdsResponseEClass = createEClass(GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE);
		createEReference(getPolicyStatesForPolicyAndSignerIdsResponseEClass, GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE__RETURN);

		getPolicyStatesForPolicyNameAndSignerIdsEClass = createEClass(GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS);
		createEAttribute(getPolicyStatesForPolicyNameAndSignerIdsEClass, GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS__DOMAIN_NAME);
		createEAttribute(getPolicyStatesForPolicyNameAndSignerIdsEClass, GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS__POLICY_NAME);
		createEReference(getPolicyStatesForPolicyNameAndSignerIdsEClass, GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS__SIGNER_IDS);
		createEAttribute(getPolicyStatesForPolicyNameAndSignerIdsEClass, GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS__USE_ALIASES);

		getPolicyStatesForPolicyNameAndSignerIdsResponseEClass = createEClass(GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE);
		createEReference(getPolicyStatesForPolicyNameAndSignerIdsResponseEClass, GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN);

		getPolicyStatesForSignerIdsEClass = createEClass(GET_POLICY_STATES_FOR_SIGNER_IDS);
		createEAttribute(getPolicyStatesForSignerIdsEClass, GET_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME);
		createEReference(getPolicyStatesForSignerIdsEClass, GET_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS);
		createEAttribute(getPolicyStatesForSignerIdsEClass, GET_POLICY_STATES_FOR_SIGNER_IDS__USE_ALIASES);

		getPolicyStatesForSignerIdsResponseEClass = createEClass(GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE);
		createEReference(getPolicyStatesForSignerIdsResponseEClass, GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE__RETURN);

		getQCHistoryForConsentEClass = createEClass(GET_QC_HISTORY_FOR_CONSENT);
		createEReference(getQCHistoryForConsentEClass, GET_QC_HISTORY_FOR_CONSENT__CONSENT_KEY);

		getQCHistoryForConsentResponseEClass = createEClass(GET_QC_HISTORY_FOR_CONSENT_RESPONSE);
		createEReference(getQCHistoryForConsentResponseEClass, GET_QC_HISTORY_FOR_CONSENT_RESPONSE__RETURN);

		getQCProblemHistoryForQCProblemEClass = createEClass(GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM);
		createEReference(getQCProblemHistoryForQCProblemEClass, GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM);
		createEReference(getQCProblemHistoryForQCProblemEClass, GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY);

		getQCProblemHistoryForQCProblemResponseEClass = createEClass(GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE);
		createEReference(getQCProblemHistoryForQCProblemResponseEClass, GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE__RETURN);

		getSignerIdsForAliasEClass = createEClass(GET_SIGNER_IDS_FOR_ALIAS);
		createEAttribute(getSignerIdsForAliasEClass, GET_SIGNER_IDS_FOR_ALIAS__DOMAIN_NAME);
		createEReference(getSignerIdsForAliasEClass, GET_SIGNER_IDS_FOR_ALIAS__ALIAS_SIGNER_ID);

		getSignerIdsForAliasResponseEClass = createEClass(GET_SIGNER_IDS_FOR_ALIAS_RESPONSE);
		createEReference(getSignerIdsForAliasResponseEClass, GET_SIGNER_IDS_FOR_ALIAS_RESPONSE__RETURN);

		getSignerIdTypeEClass = createEClass(GET_SIGNER_ID_TYPE);
		createEAttribute(getSignerIdTypeEClass, GET_SIGNER_ID_TYPE__DOMAIN_NAME);
		createEAttribute(getSignerIdTypeEClass, GET_SIGNER_ID_TYPE__SIGNER_ID_TYPE_NAME);

		getSignerIdTypeResponseEClass = createEClass(GET_SIGNER_ID_TYPE_RESPONSE);
		createEReference(getSignerIdTypeResponseEClass, GET_SIGNER_ID_TYPE_RESPONSE__RETURN);

		getTemplatesWithPoliciesEClass = createEClass(GET_TEMPLATES_WITH_POLICIES);
		createEReference(getTemplatesWithPoliciesEClass, GET_TEMPLATES_WITH_POLICIES__POLICY_KEY_DT_OS);

		getTemplatesWithPoliciesResponseEClass = createEClass(GET_TEMPLATES_WITH_POLICIES_RESPONSE);
		createEReference(getTemplatesWithPoliciesResponseEClass, GET_TEMPLATES_WITH_POLICIES_RESPONSE__RETURN);

		hashMapEClass = createEClass(HASH_MAP);

		illegalArgumentExceptionEClass = createEClass(ILLEGAL_ARGUMENT_EXCEPTION);
		createEAttribute(illegalArgumentExceptionEClass, ILLEGAL_ARGUMENT_EXCEPTION__MESSAGE);

		inconsistentStatusExceptionEClass = createEClass(INCONSISTENT_STATUS_EXCEPTION);
		createEAttribute(inconsistentStatusExceptionEClass, INCONSISTENT_STATUS_EXCEPTION__MESSAGE);

		internalExceptionEClass = createEClass(INTERNAL_EXCEPTION);
		createEAttribute(internalExceptionEClass, INTERNAL_EXCEPTION__MESSAGE);

		invalidFreeTextExceptionEClass = createEClass(INVALID_FREE_TEXT_EXCEPTION);
		createEAttribute(invalidFreeTextExceptionEClass, INVALID_FREE_TEXT_EXCEPTION__MESSAGE);

		invalidParameterExceptionEClass = createEClass(INVALID_PARAMETER_EXCEPTION);
		createEAttribute(invalidParameterExceptionEClass, INVALID_PARAMETER_EXCEPTION__PARAMETER_NAME);
		createEAttribute(invalidParameterExceptionEClass, INVALID_PARAMETER_EXCEPTION__MESSAGE);

		invalidVersionExceptionEClass = createEClass(INVALID_VERSION_EXCEPTION);
		createEAttribute(invalidVersionExceptionEClass, INVALID_VERSION_EXCEPTION__MESSAGE);

		isConsentedEClass = createEClass(IS_CONSENTED);
		createEReference(isConsentedEClass, IS_CONSENTED__SIGNER_IDS);
		createEReference(isConsentedEClass, IS_CONSENTED__POLICY_KEY);
		createEReference(isConsentedEClass, IS_CONSENTED__CONFIG);

		isConsentedFromExcludingToExcludingEClass = createEClass(IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING);
		createEReference(isConsentedFromExcludingToExcludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__SIGNER_IDS);
		createEAttribute(isConsentedFromExcludingToExcludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__DOMAIN_NAME);
		createEAttribute(isConsentedFromExcludingToExcludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__POLICY_NAME);
		createEAttribute(isConsentedFromExcludingToExcludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__VERSION_FROM);
		createEAttribute(isConsentedFromExcludingToExcludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__VERSION_TO);
		createEReference(isConsentedFromExcludingToExcludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING__CONFIG);

		isConsentedFromExcludingToExcludingResponseEClass = createEClass(IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE);
		createEAttribute(isConsentedFromExcludingToExcludingResponseEClass, IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE__RETURN);

		isConsentedFromExcludingToIncludingEClass = createEClass(IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING);
		createEReference(isConsentedFromExcludingToIncludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS);
		createEAttribute(isConsentedFromExcludingToIncludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME);
		createEAttribute(isConsentedFromExcludingToIncludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME);
		createEAttribute(isConsentedFromExcludingToIncludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM);
		createEAttribute(isConsentedFromExcludingToIncludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO);
		createEReference(isConsentedFromExcludingToIncludingEClass, IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING__CONFIG);

		isConsentedFromExcludingToIncludingResponseEClass = createEClass(IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE);
		createEAttribute(isConsentedFromExcludingToIncludingResponseEClass, IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE__RETURN);

		isConsentedFromIncludingToExcludingEClass = createEClass(IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING);
		createEReference(isConsentedFromIncludingToExcludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__SIGNER_IDS);
		createEAttribute(isConsentedFromIncludingToExcludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__DOMAIN_NAME);
		createEAttribute(isConsentedFromIncludingToExcludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__POLICY_NAME);
		createEAttribute(isConsentedFromIncludingToExcludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__VERSION_FROM);
		createEAttribute(isConsentedFromIncludingToExcludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__VERSION_TO);
		createEReference(isConsentedFromIncludingToExcludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING__CONFIG);

		isConsentedFromIncludingToExcludingResponseEClass = createEClass(IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE);
		createEAttribute(isConsentedFromIncludingToExcludingResponseEClass, IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE__RETURN);

		isConsentedFromIncludingToIncludingEClass = createEClass(IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING);
		createEReference(isConsentedFromIncludingToIncludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__SIGNER_IDS);
		createEAttribute(isConsentedFromIncludingToIncludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__DOMAIN_NAME);
		createEAttribute(isConsentedFromIncludingToIncludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__POLICY_NAME);
		createEAttribute(isConsentedFromIncludingToIncludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__VERSION_FROM);
		createEAttribute(isConsentedFromIncludingToIncludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__VERSION_TO);
		createEReference(isConsentedFromIncludingToIncludingEClass, IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING__CONFIG);

		isConsentedFromIncludingToIncludingResponseEClass = createEClass(IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE);
		createEAttribute(isConsentedFromIncludingToIncludingResponseEClass, IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE__RETURN);

		isConsentedResponseEClass = createEClass(IS_CONSENTED_RESPONSE);
		createEAttribute(isConsentedResponseEClass, IS_CONSENTED_RESPONSE__RETURN);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__LANG);
		createEAttribute(labelEClass, LABEL__VALUE);

		listConsentTemplatesEClass = createEClass(LIST_CONSENT_TEMPLATES);
		createEAttribute(listConsentTemplatesEClass, LIST_CONSENT_TEMPLATES__DOMAIN_NAME);
		createEAttribute(listConsentTemplatesEClass, LIST_CONSENT_TEMPLATES__ONLY_FINAL);

		listConsentTemplatesResponseEClass = createEClass(LIST_CONSENT_TEMPLATES_RESPONSE);
		createEReference(listConsentTemplatesResponseEClass, LIST_CONSENT_TEMPLATES_RESPONSE__RETURN);

		listCurrentConsentTemplatesEClass = createEClass(LIST_CURRENT_CONSENT_TEMPLATES);
		createEAttribute(listCurrentConsentTemplatesEClass, LIST_CURRENT_CONSENT_TEMPLATES__DOMAIN_NAME);

		listCurrentConsentTemplatesResponseEClass = createEClass(LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE);
		createEReference(listCurrentConsentTemplatesResponseEClass, LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE__RETURN);

		listDomainsEClass = createEClass(LIST_DOMAINS);

		listDomainsResponseEClass = createEClass(LIST_DOMAINS_RESPONSE);
		createEReference(listDomainsResponseEClass, LIST_DOMAINS_RESPONSE__RETURN);

		listModulesEClass = createEClass(LIST_MODULES);
		createEAttribute(listModulesEClass, LIST_MODULES__DOMAIN_NAME);
		createEAttribute(listModulesEClass, LIST_MODULES__ONLY_FINAL);

		listModulesResponseEClass = createEClass(LIST_MODULES_RESPONSE);
		createEReference(listModulesResponseEClass, LIST_MODULES_RESPONSE__RETURN);

		listPoliciesEClass = createEClass(LIST_POLICIES);
		createEAttribute(listPoliciesEClass, LIST_POLICIES__DOMAIN_NAME);
		createEAttribute(listPoliciesEClass, LIST_POLICIES__ONLY_FINAL);

		listPoliciesResponseEClass = createEClass(LIST_POLICIES_RESPONSE);
		createEReference(listPoliciesResponseEClass, LIST_POLICIES_RESPONSE__RETURN);

		listSignerIdTypesEClass = createEClass(LIST_SIGNER_ID_TYPES);
		createEAttribute(listSignerIdTypesEClass, LIST_SIGNER_ID_TYPES__DOMAIN_NAME);

		listSignerIdTypesResponseEClass = createEClass(LIST_SIGNER_ID_TYPES_RESPONSE);
		createEReference(listSignerIdTypesResponseEClass, LIST_SIGNER_ID_TYPES_RESPONSE__RETURN);

		mandatoryFieldsExceptionEClass = createEClass(MANDATORY_FIELDS_EXCEPTION);
		createEAttribute(mandatoryFieldsExceptionEClass, MANDATORY_FIELDS_EXCEPTION__MESSAGE);

		missingRequiredObjectExceptionEClass = createEClass(MISSING_REQUIRED_OBJECT_EXCEPTION);
		createEAttribute(missingRequiredObjectExceptionEClass, MISSING_REQUIRED_OBJECT_EXCEPTION__MESSAGE);

		moduleDTOEClass = createEClass(MODULE_DTO);
		createEReference(moduleDTOEClass, MODULE_DTO__ASSIGNED_POLICIES);
		createEAttribute(moduleDTOEClass, MODULE_DTO__COMMENT);
		createEAttribute(moduleDTOEClass, MODULE_DTO__CREATION_DATE);
		createEAttribute(moduleDTOEClass, MODULE_DTO__EXTERN_PROPERTIES);
		createEAttribute(moduleDTOEClass, MODULE_DTO__FINALISED);
		createEReference(moduleDTOEClass, MODULE_DTO__KEY);
		createEAttribute(moduleDTOEClass, MODULE_DTO__LABEL);
		createEAttribute(moduleDTOEClass, MODULE_DTO__SHORT_TEXT);
		createEAttribute(moduleDTOEClass, MODULE_DTO__TEXT);
		createEAttribute(moduleDTOEClass, MODULE_DTO__TITLE);
		createEAttribute(moduleDTOEClass, MODULE_DTO__UPDATE_DATE);

		moduleExpirationsTypeEClass = createEClass(MODULE_EXPIRATIONS_TYPE);
		createEReference(moduleExpirationsTypeEClass, MODULE_EXPIRATIONS_TYPE__ENTRY);

		moduleKeyDTOEClass = createEClass(MODULE_KEY_DTO);
		createEAttribute(moduleKeyDTOEClass, MODULE_KEY_DTO__DOMAIN_NAME);
		createEAttribute(moduleKeyDTOEClass, MODULE_KEY_DTO__NAME);
		createEAttribute(moduleKeyDTOEClass, MODULE_KEY_DTO__VERSION);

		moduleKeyDTOArrayEClass = createEClass(MODULE_KEY_DTO_ARRAY);
		createEReference(moduleKeyDTOArrayEClass, MODULE_KEY_DTO_ARRAY__ITEM);

		moduleStateDTOEClass = createEClass(MODULE_STATE_DTO);
		createEAttribute(moduleStateDTOEClass, MODULE_STATE_DTO__CONSENT_STATE);
		createEReference(moduleStateDTOEClass, MODULE_STATE_DTO__KEY);
		createEReference(moduleStateDTOEClass, MODULE_STATE_DTO__POLICY_KEYS);

		moduleStatesTypeEClass = createEClass(MODULE_STATES_TYPE);
		createEReference(moduleStatesTypeEClass, MODULE_STATES_TYPE__ENTRY);

		policyDTOEClass = createEClass(POLICY_DTO);
		createEAttribute(policyDTOEClass, POLICY_DTO__COMMENT);
		createEAttribute(policyDTOEClass, POLICY_DTO__CREATION_DATE);
		createEAttribute(policyDTOEClass, POLICY_DTO__EXTERN_PROPERTIES);
		createEAttribute(policyDTOEClass, POLICY_DTO__FINALISED);
		createEReference(policyDTOEClass, POLICY_DTO__KEY);
		createEAttribute(policyDTOEClass, POLICY_DTO__LABEL);
		createEAttribute(policyDTOEClass, POLICY_DTO__UPDATE_DATE);

		policyExpirationsTypeEClass = createEClass(POLICY_EXPIRATIONS_TYPE);
		createEReference(policyExpirationsTypeEClass, POLICY_EXPIRATIONS_TYPE__ENTRY);

		policyKeyDTOEClass = createEClass(POLICY_KEY_DTO);
		createEAttribute(policyKeyDTOEClass, POLICY_KEY_DTO__DOMAIN_NAME);
		createEAttribute(policyKeyDTOEClass, POLICY_KEY_DTO__NAME);
		createEAttribute(policyKeyDTOEClass, POLICY_KEY_DTO__VERSION);

		qcdtoEClass = createEClass(QCDTO);
		createEAttribute(qcdtoEClass, QCDTO__COMMENT);
		createEAttribute(qcdtoEClass, QCDTO__DATE);
		createEAttribute(qcdtoEClass, QCDTO__EXTERN_PROPERTIES);
		createEAttribute(qcdtoEClass, QCDTO__INSPECTOR);
		createEReference(qcdtoEClass, QCDTO__PROBLEMS);
		createEAttribute(qcdtoEClass, QCDTO__TYPE);

		qcHistoryDTOEClass = createEClass(QC_HISTORY_DTO);
		createEAttribute(qcHistoryDTOEClass, QC_HISTORY_DTO__END_DATE);
		createEAttribute(qcHistoryDTOEClass, QC_HISTORY_DTO__START_DATE);

		qcProblemDTOEClass = createEClass(QC_PROBLEM_DTO);
		createEAttribute(qcProblemDTOEClass, QC_PROBLEM_DTO__COMMENT_EXTERN);
		createEAttribute(qcProblemDTOEClass, QC_PROBLEM_DTO__COMMENT_INTERN);
		createEAttribute(qcProblemDTOEClass, QC_PROBLEM_DTO__CREATED_AT);
		createEAttribute(qcProblemDTOEClass, QC_PROBLEM_DTO__FORM_VALUE);
		createEAttribute(qcProblemDTOEClass, QC_PROBLEM_DTO__REF);
		createEAttribute(qcProblemDTOEClass, QC_PROBLEM_DTO__SCAN_VALUE);
		createEAttribute(qcProblemDTOEClass, QC_PROBLEM_DTO__STATUS);
		createEAttribute(qcProblemDTOEClass, QC_PROBLEM_DTO__UPDATED_AT);

		qcProblemHistoryDTOEClass = createEClass(QC_PROBLEM_HISTORY_DTO);
		createEAttribute(qcProblemHistoryDTOEClass, QC_PROBLEM_HISTORY_DTO__END_DATE);
		createEAttribute(qcProblemHistoryDTOEClass, QC_PROBLEM_HISTORY_DTO__START_DATE);

		qcProblemTypeEClass = createEClass(QC_PROBLEM_TYPE);
		createEReference(qcProblemTypeEClass, QC_PROBLEM_TYPE__LABEL);
		createEAttribute(qcProblemTypeEClass, QC_PROBLEM_TYPE__ACTION);
		createEAttribute(qcProblemTypeEClass, QC_PROBLEM_TYPE__ERROR);
		createEAttribute(qcProblemTypeEClass, QC_PROBLEM_TYPE__FIELD);
		createEAttribute(qcProblemTypeEClass, QC_PROBLEM_TYPE__ID);
		createEAttribute(qcProblemTypeEClass, QC_PROBLEM_TYPE__OCCURRENCE);

		qcProblemTypeActionEClass = createEClass(QC_PROBLEM_TYPE_ACTION);
		createEReference(qcProblemTypeActionEClass, QC_PROBLEM_TYPE_ACTION__LABEL);
		createEAttribute(qcProblemTypeActionEClass, QC_PROBLEM_TYPE_ACTION__ID);

		qcTypeEClass = createEClass(QC_TYPE);
		createEReference(qcTypeEClass, QC_TYPE__LABEL);
		createEAttribute(qcTypeEClass, QC_TYPE__ID);
		createEAttribute(qcTypeEClass, QC_TYPE__STATUS);

		refuseConsentEClass = createEClass(REFUSE_CONSENT);
		createEReference(refuseConsentEClass, REFUSE_CONSENT__CONSENT_TEMPLATE_KEY);
		createEReference(refuseConsentEClass, REFUSE_CONSENT__SIGNER_IDS);

		refuseConsentResponseEClass = createEClass(REFUSE_CONSENT_RESPONSE);

		removeScanFromConsentEClass = createEClass(REMOVE_SCAN_FROM_CONSENT);
		createEReference(removeScanFromConsentEClass, REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY);
		createEAttribute(removeScanFromConsentEClass, REMOVE_SCAN_FROM_CONSENT__FHIR_ID);

		removeScanFromConsentResponseEClass = createEClass(REMOVE_SCAN_FROM_CONSENT_RESPONSE);

		requirementsNotFullfilledExceptionEClass = createEClass(REQUIREMENTS_NOT_FULLFILLED_EXCEPTION);
		createEAttribute(requirementsNotFullfilledExceptionEClass, REQUIREMENTS_NOT_FULLFILLED_EXCEPTION__MESSAGE);

		returnTypeEClass = createEClass(RETURN_TYPE);
		createEReference(returnTypeEClass, RETURN_TYPE__DOMAINS);

		returnType1EClass = createEClass(RETURN_TYPE1);
		createEReference(returnType1EClass, RETURN_TYPE1__MODULES);

		returnType2EClass = createEClass(RETURN_TYPE2);
		createEReference(returnType2EClass, RETURN_TYPE2__SIGNER_ID_TYPES);

		returnType3EClass = createEClass(RETURN_TYPE3);
		createEReference(returnType3EClass, RETURN_TYPE3__POLICIES);

		returnType4EClass = createEClass(RETURN_TYPE4);
		createEReference(returnType4EClass, RETURN_TYPE4__CURRENT_CONSENT_TEMPLATES);

		returnType5EClass = createEClass(RETURN_TYPE5);
		createEReference(returnType5EClass, RETURN_TYPE5__TEMPLATES);

		returnType6EClass = createEClass(RETURN_TYPE6);
		createEAttribute(returnType6EClass, RETURN_TYPE6__CONSENT_IDS);

		returnType7EClass = createEClass(RETURN_TYPE7);
		createEReference(returnType7EClass, RETURN_TYPE7__CONSENTS);

		returnType8EClass = createEClass(RETURN_TYPE8);
		createEReference(returnType8EClass, RETURN_TYPE8__CONSENTS);

		returnType9EClass = createEClass(RETURN_TYPE9);
		createEReference(returnType9EClass, RETURN_TYPE9__SIGNED_POLICIES);

		returnType10EClass = createEClass(RETURN_TYPE10);
		createEReference(returnType10EClass, RETURN_TYPE10__CONSENTS);

		returnType11EClass = createEClass(RETURN_TYPE11);
		createEReference(returnType11EClass, RETURN_TYPE11__SIGNED_POLICIES);

		returnType12EClass = createEClass(RETURN_TYPE12);
		createEReference(returnType12EClass, RETURN_TYPE12__SIGNED_POLICIES);

		returnType13EClass = createEClass(RETURN_TYPE13);
		createEReference(returnType13EClass, RETURN_TYPE13__SIGNED_POLICIES);

		returnType14EClass = createEClass(RETURN_TYPE14);
		createEReference(returnType14EClass, RETURN_TYPE14__QC_HISTORIES);

		returnType15EClass = createEClass(RETURN_TYPE15);
		createEReference(returnType15EClass, RETURN_TYPE15__SIGNER_IDS);

		returnType16EClass = createEClass(RETURN_TYPE16);
		createEReference(returnType16EClass, RETURN_TYPE16__CONSENT_TEMPLATES);

		returnType17EClass = createEClass(RETURN_TYPE17);
		createEReference(returnType17EClass, RETURN_TYPE17__QC_PROBLEM_HISTORIES);

		returnType18EClass = createEClass(RETURN_TYPE18);
		createEReference(returnType18EClass, RETURN_TYPE18__TEMPLATES);

		returnType19EClass = createEClass(RETURN_TYPE19);
		createEReference(returnType19EClass, RETURN_TYPE19__CONSENTS);

		returnType20EClass = createEClass(RETURN_TYPE20);
		createEAttribute(returnType20EClass, RETURN_TYPE20__SIGNER_IDS);

		returnType21EClass = createEClass(RETURN_TYPE21);
		createEReference(returnType21EClass, RETURN_TYPE21__CONSENTS);

		returnType22EClass = createEClass(RETURN_TYPE22);
		createEReference(returnType22EClass, RETURN_TYPE22__ENTRY);

		returnType23EClass = createEClass(RETURN_TYPE23);
		createEReference(returnType23EClass, RETURN_TYPE23__ALIASES);

		setQCForConsentEClass = createEClass(SET_QC_FOR_CONSENT);
		createEReference(setQCForConsentEClass, SET_QC_FOR_CONSENT__CONSENT_KEY);
		createEReference(setQCForConsentEClass, SET_QC_FOR_CONSENT__QC);

		setQCForConsentResponseEClass = createEClass(SET_QC_FOR_CONSENT_RESPONSE);

		signedPolicyDTOEClass = createEClass(SIGNED_POLICY_DTO);
		createEReference(signedPolicyDTOEClass, SIGNED_POLICY_DTO__CONSENT_KEY);
		createEReference(signedPolicyDTOEClass, SIGNED_POLICY_DTO__POLICY_KEY);
		createEAttribute(signedPolicyDTOEClass, SIGNED_POLICY_DTO__STATUS);

		signerIdDTOEClass = createEClass(SIGNER_ID_DTO);
		createEAttribute(signerIdDTOEClass, SIGNER_ID_DTO__CREATION_DATE);
		createEAttribute(signerIdDTOEClass, SIGNER_ID_DTO__ID);
		createEAttribute(signerIdDTOEClass, SIGNER_ID_DTO__ID_TYPE);
		createEAttribute(signerIdDTOEClass, SIGNER_ID_DTO__ORDER_NUMBER);

		signerIdDTOArrayEClass = createEClass(SIGNER_ID_DTO_ARRAY);
		createEReference(signerIdDTOArrayEClass, SIGNER_ID_DTO_ARRAY__ITEM);

		signerIdTypeDTOEClass = createEClass(SIGNER_ID_TYPE_DTO);
		createEAttribute(signerIdTypeDTOEClass, SIGNER_ID_TYPE_DTO__COMMENT);
		createEAttribute(signerIdTypeDTOEClass, SIGNER_ID_TYPE_DTO__CREATE_TIMESTAMP);
		createEAttribute(signerIdTypeDTOEClass, SIGNER_ID_TYPE_DTO__LABEL);
		createEAttribute(signerIdTypeDTOEClass, SIGNER_ID_TYPE_DTO__NAME);
		createEAttribute(signerIdTypeDTOEClass, SIGNER_ID_TYPE_DTO__UPDATE_TIMESTAMP);

		unknownAliasExceptionEClass = createEClass(UNKNOWN_ALIAS_EXCEPTION);
		createEAttribute(unknownAliasExceptionEClass, UNKNOWN_ALIAS_EXCEPTION__MESSAGE);

		unknownConsentExceptionEClass = createEClass(UNKNOWN_CONSENT_EXCEPTION);
		createEAttribute(unknownConsentExceptionEClass, UNKNOWN_CONSENT_EXCEPTION__MESSAGE);

		unknownConsentTemplateExceptionEClass = createEClass(UNKNOWN_CONSENT_TEMPLATE_EXCEPTION);
		createEAttribute(unknownConsentTemplateExceptionEClass, UNKNOWN_CONSENT_TEMPLATE_EXCEPTION__MESSAGE);

		unknownDomainExceptionEClass = createEClass(UNKNOWN_DOMAIN_EXCEPTION);
		createEAttribute(unknownDomainExceptionEClass, UNKNOWN_DOMAIN_EXCEPTION__MESSAGE);

		unknownFhirIdObjectExceptionEClass = createEClass(UNKNOWN_FHIR_ID_OBJECT_EXCEPTION);
		createEAttribute(unknownFhirIdObjectExceptionEClass, UNKNOWN_FHIR_ID_OBJECT_EXCEPTION__MESSAGE);

		unknownIDExceptionEClass = createEClass(UNKNOWN_ID_EXCEPTION);
		createEAttribute(unknownIDExceptionEClass, UNKNOWN_ID_EXCEPTION__MESSAGE);

		unknownModuleExceptionEClass = createEClass(UNKNOWN_MODULE_EXCEPTION);
		createEAttribute(unknownModuleExceptionEClass, UNKNOWN_MODULE_EXCEPTION__MESSAGE);

		unknownPolicyExceptionEClass = createEClass(UNKNOWN_POLICY_EXCEPTION);
		createEAttribute(unknownPolicyExceptionEClass, UNKNOWN_POLICY_EXCEPTION__MESSAGE);

		unknownSignerIdExceptionEClass = createEClass(UNKNOWN_SIGNER_ID_EXCEPTION);
		createEAttribute(unknownSignerIdExceptionEClass, UNKNOWN_SIGNER_ID_EXCEPTION__MESSAGE);

		unknownSignerIdTypeExceptionEClass = createEClass(UNKNOWN_SIGNER_ID_TYPE_EXCEPTION);
		createEAttribute(unknownSignerIdTypeExceptionEClass, UNKNOWN_SIGNER_ID_TYPE_EXCEPTION__MESSAGE);

		updateConsentInUseEClass = createEClass(UPDATE_CONSENT_IN_USE);
		createEReference(updateConsentInUseEClass, UPDATE_CONSENT_IN_USE__CONSENT_KEY);
		createEAttribute(updateConsentInUseEClass, UPDATE_CONSENT_IN_USE__EXTERN_PROPERTIES);
		createEAttribute(updateConsentInUseEClass, UPDATE_CONSENT_IN_USE__COMMENT);
		createEReference(updateConsentInUseEClass, UPDATE_CONSENT_IN_USE__SCAN);

		updateConsentInUseResponseEClass = createEClass(UPDATE_CONSENT_IN_USE_RESPONSE);

		validateConsentEClass = createEClass(VALIDATE_CONSENT);
		createEReference(validateConsentEClass, VALIDATE_CONSENT__CONSENT);
		createEAttribute(validateConsentEClass, VALIDATE_CONSENT__ALLOW_REVOKE);
		createEAttribute(validateConsentEClass, VALIDATE_CONSENT__VALIDATE_SCAN);

		validateConsentResponseEClass = createEClass(VALIDATE_CONSENT_RESPONSE);

		validFromPropertiesDTOEClass = createEClass(VALID_FROM_PROPERTIES_DTO);
		createEAttribute(validFromPropertiesDTOEClass, VALID_FROM_PROPERTIES_DTO__FIXED_VALID_FROM_DATE);
		createEAttribute(validFromPropertiesDTOEClass, VALID_FROM_PROPERTIES_DTO__INVALID_PERIOD);

		// Create enums
		consentStatusEEnum = createEEnum(CONSENT_STATUS);
		consentStatusTypeEEnum = createEEnum(CONSENT_STATUS_TYPE);
		consentTemplateTypeEEnum = createEEnum(CONSENT_TEMPLATE_TYPE);
		freeTextTypeEEnum = createEEnum(FREE_TEXT_TYPE);
		qcProblemStatusEEnum = createEEnum(QC_PROBLEM_STATUS);
		qcProblemTypeErrorEEnum = createEEnum(QC_PROBLEM_TYPE_ERROR);
		qcProblemTypeFieldEEnum = createEEnum(QC_PROBLEM_TYPE_FIELD);
		qcProblemTypeOccurrenceEEnum = createEEnum(QC_PROBLEM_TYPE_OCCURRENCE);
		qcTypeStatusEEnum = createEEnum(QC_TYPE_STATUS);

		// Create data types
		consentStatusObjectEDataType = createEDataType(CONSENT_STATUS_OBJECT);
		consentStatusTypeObjectEDataType = createEDataType(CONSENT_STATUS_TYPE_OBJECT);
		consentTemplateTypeObjectEDataType = createEDataType(CONSENT_TEMPLATE_TYPE_OBJECT);
		freeTextTypeObjectEDataType = createEDataType(FREE_TEXT_TYPE_OBJECT);
		qcProblemStatusObjectEDataType = createEDataType(QC_PROBLEM_STATUS_OBJECT);
		qcProblemTypeErrorObjectEDataType = createEDataType(QC_PROBLEM_TYPE_ERROR_OBJECT);
		qcProblemTypeFieldObjectEDataType = createEDataType(QC_PROBLEM_TYPE_FIELD_OBJECT);
		qcProblemTypeOccurrenceObjectEDataType = createEDataType(QC_PROBLEM_TYPE_OCCURRENCE_OBJECT);
		qcTypeStatusObjectEDataType = createEDataType(QC_TYPE_STATUS_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		ConfigPackage theConfigPackage = (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assignedModuleDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		assignedPolicyDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		consentDTOEClass.getESuperTypes().add(this.getConsentLightDTO());
		consentLightDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		consentScanDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		consentTemplateDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		domainDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		freeTextDefDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		freeTextValDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		hashMapEClass.getESuperTypes().add(this.getAbstractMap());
		moduleDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		policyDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		qcdtoEClass.getESuperTypes().add(this.getFhirIdDTO());
		qcHistoryDTOEClass.getESuperTypes().add(this.getQcdto());
		qcProblemDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		qcProblemHistoryDTOEClass.getESuperTypes().add(this.getQcProblemDTO());
		signedPolicyDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		signerIdDTOEClass.getESuperTypes().add(this.getFhirIdDTO());
		signerIdTypeDTOEClass.getESuperTypes().add(this.getFhirIdDTO());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractMapEClass, AbstractMap.class, "AbstractMap", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addAliasEClass, AddAlias.class, "AddAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddAlias_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, AddAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddAlias_OriginalSignerId(), this.getSignerIdDTO(), null, "originalSignerId", null, 1, 1, AddAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddAlias_AliasSignerId(), this.getSignerIdDTO(), null, "aliasSignerId", null, 1, 1, AddAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAliasResponseEClass, AddAliasResponse.class, "AddAliasResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addConsentEClass, AddConsent.class, "AddConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddConsent_Consent(), this.getConsentDTO(), null, "consent", null, 1, 1, AddConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addConsentOptOutEClass, AddConsentOptOut.class, "AddConsentOptOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddConsentOptOut_ConsentTemplateKey(), this.getConsentTemplateKeyDTO(), null, "consentTemplateKey", null, 1, 1, AddConsentOptOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddConsentOptOut_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, AddConsentOptOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addConsentOptOutResponseEClass, AddConsentOptOutResponse.class, "AddConsentOptOutResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddConsentOptOutResponse_Return(), this.getConsentLightDTO(), null, "return", null, 0, 1, AddConsentOptOutResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addConsentResponseEClass, AddConsentResponse.class, "AddConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addScanToConsentEClass, AddScanToConsent.class, "AddScanToConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddScanToConsent_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, AddScanToConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddScanToConsent_ScanBase64(), theXMLTypePackage.getString(), "scanBase64", null, 1, 1, AddScanToConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddScanToConsent_FileType(), theXMLTypePackage.getString(), "fileType", null, 1, 1, AddScanToConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddScanToConsent_FileName(), theXMLTypePackage.getString(), "fileName", null, 1, 1, AddScanToConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addScanToConsentResponseEClass, AddScanToConsentResponse.class, "AddScanToConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addSignerIdToConsentEClass, AddSignerIdToConsent.class, "AddSignerIdToConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddSignerIdToConsent_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, AddSignerIdToConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddSignerIdToConsent_SignerId(), this.getSignerIdDTO(), null, "signerId", null, 1, 1, AddSignerIdToConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSignerIdToConsentResponseEClass, AddSignerIdToConsentResponse.class, "AddSignerIdToConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addSignerIdToSignerIdEClass, AddSignerIdToSignerId.class, "AddSignerIdToSignerId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSignerIdToSignerId_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, AddSignerIdToSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddSignerIdToSignerId_ExistentSignerId(), this.getSignerIdDTO(), null, "existentSignerId", null, 1, 1, AddSignerIdToSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddSignerIdToSignerId_NewSignerId(), this.getSignerIdDTO(), null, "newSignerId", null, 1, 1, AddSignerIdToSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSignerIdToSignerIdResponseEClass, AddSignerIdToSignerIdResponse.class, "AddSignerIdToSignerIdResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignedModuleDTOEClass, AssignedModuleDTO.class, "AssignedModuleDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignedModuleDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignedModuleDTO_DefaultConsentStatus(), this.getConsentStatus(), "defaultConsentStatus", null, 0, 1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignedModuleDTO_DisplayCheckboxes(), this.getConsentStatusObject(), "displayCheckboxes", null, 0, -1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignedModuleDTO_ExpirationProperties(), this.getExpirationPropertiesDTO(), null, "expirationProperties", null, 0, 1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignedModuleDTO_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignedModuleDTO_Mandatory(), theXMLTypePackage.getBoolean(), "mandatory", null, 1, 1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignedModuleDTO_Module(), this.getModuleDTO(), null, "module", null, 0, 1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignedModuleDTO_OrderNumber(), theXMLTypePackage.getInt(), "orderNumber", null, 1, 1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignedModuleDTO_Parent(), this.getModuleKeyDTO(), null, "parent", null, 0, 1, AssignedModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignedPolicyDTOEClass, AssignedPolicyDTO.class, "AssignedPolicyDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignedPolicyDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, AssignedPolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignedPolicyDTO_ExpirationProperties(), this.getExpirationPropertiesDTO(), null, "expirationProperties", null, 0, 1, AssignedPolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignedPolicyDTO_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, AssignedPolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignedPolicyDTO_Policy(), this.getPolicyDTO(), null, "policy", null, 0, 1, AssignedPolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childrenTypeEClass, ChildrenType.class, "ChildrenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildrenType_Entry(), this.getEntryType2(), null, "entry", null, 0, -1, ChildrenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentDateValuesDTOEClass, ConsentDateValuesDTO.class, "ConsentDateValuesDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsentDateValuesDTO_ConsentExpirationDate(), theXMLTypePackage.getDateTime(), "consentExpirationDate", null, 0, 1, ConsentDateValuesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentDateValuesDTO_GicsConsentDate(), theXMLTypePackage.getDateTime(), "gicsConsentDate", null, 0, 1, ConsentDateValuesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentDateValuesDTO_LegalConsentDate(), theXMLTypePackage.getDateTime(), "legalConsentDate", null, 0, 1, ConsentDateValuesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentDateValuesDTO_MaxPolicyExpirationDate(), theXMLTypePackage.getDateTime(), "maxPolicyExpirationDate", null, 0, 1, ConsentDateValuesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentDateValuesDTO_ModuleExpirations(), this.getModuleExpirationsType(), null, "moduleExpirations", null, 1, 1, ConsentDateValuesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentDateValuesDTO_PolicyExpirations(), this.getPolicyExpirationsType(), null, "policyExpirations", null, 1, 1, ConsentDateValuesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentDTOEClass, ConsentDTO.class, "ConsentDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsentDTO_FreeTextVals(), this.getFreeTextValDTO(), null, "freeTextVals", null, 0, -1, ConsentDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentDTO_PatientSignatureBase64(), theXMLTypePackage.getString(), "patientSignatureBase64", null, 0, 1, ConsentDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentDTO_PhysicianSignatureBase64(), theXMLTypePackage.getString(), "physicianSignatureBase64", null, 0, 1, ConsentDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentDTO_Scans(), this.getConsentScanDTO(), null, "scans", null, 0, -1, ConsentDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentKeyDTOEClass, ConsentKeyDTO.class, "ConsentKeyDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsentKeyDTO_ConsentDate(), theXMLTypePackage.getDateTime(), "consentDate", null, 0, 1, ConsentKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentKeyDTO_ConsentTemplateKey(), this.getConsentTemplateKeyDTO(), null, "consentTemplateKey", null, 0, 1, ConsentKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentKeyDTO_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 0, -1, ConsentKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentLightDTOEClass, ConsentLightDTO.class, "ConsentLightDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsentLightDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentLightDTO_ConsentDates(), this.getConsentDateValuesDTO(), null, "consentDates", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentLightDTO_ExpirationProperties(), this.getExpirationPropertiesDTO(), null, "expirationProperties", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_HasPatientSignature(), theXMLTypePackage.getBoolean(), "hasPatientSignature", null, 1, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentLightDTO_Key(), this.getConsentKeyDTO(), null, "key", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentLightDTO_ModuleStates(), this.getModuleStatesType(), null, "moduleStates", null, 1, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_PatientSignatureIsFromGuardian(), theXMLTypePackage.getBoolean(), "patientSignatureIsFromGuardian", null, 1, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_PatientSigningDate(), theXMLTypePackage.getDateTime(), "patientSigningDate", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_PatientSigningPlace(), theXMLTypePackage.getString(), "patientSigningPlace", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_PhysicianId(), theXMLTypePackage.getString(), "physicianId", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_PhysicianSigningDate(), theXMLTypePackage.getDateTime(), "physicianSigningDate", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_PhysicianSigningPlace(), theXMLTypePackage.getString(), "physicianSigningPlace", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentLightDTO_QualityControl(), this.getQcdto(), null, "qualityControl", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_TemplateType(), this.getConsentTemplateType(), "templateType", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_UpdateDate(), theXMLTypePackage.getDateTime(), "updateDate", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentLightDTO_ValidFromDate(), theXMLTypePackage.getDateTime(), "validFromDate", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentLightDTO_ValidFromProperties(), this.getValidFromPropertiesDTO(), null, "validFromProperties", null, 0, 1, ConsentLightDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentScanDTOEClass, ConsentScanDTO.class, "ConsentScanDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsentScanDTO_Base64(), theXMLTypePackage.getString(), "base64", null, 0, 1, ConsentScanDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentScanDTO_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 0, 1, ConsentScanDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentScanDTO_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, 1, ConsentScanDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentScanDTO_FileType(), theXMLTypePackage.getString(), "fileType", null, 0, 1, ConsentScanDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentScanDTO_UploadDate(), theXMLTypePackage.getDateTime(), "uploadDate", null, 0, 1, ConsentScanDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentTemplateDTOEClass, ConsentTemplateDTO.class, "ConsentTemplateDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsentTemplateDTO_AssignedModules(), this.getAssignedModuleDTO(), null, "assignedModules", null, 0, -1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_ExpirationProperties(), this.getExpirationPropertiesDTO(), null, "expirationProperties", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_Finalised(), theXMLTypePackage.getBoolean(), "finalised", null, 1, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_Footer(), theXMLTypePackage.getString(), "footer", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_FreeTextDefs(), this.getFreeTextDefDTO(), null, "freeTextDefs", null, 0, -1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_Header(), theXMLTypePackage.getString(), "header", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_Key(), this.getConsentTemplateKeyDTO(), null, "key", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_MappedConsentTemplates(), this.getConsentTemplateKeyDTO(), null, "mappedConsentTemplates", null, 0, -1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_MappedObjectionTemplates(), this.getConsentTemplateKeyDTO(), null, "mappedObjectionTemplates", null, 0, -1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_MappedOptOutConsentTemplates(), this.getConsentTemplateKeyDTO(), null, "mappedOptOutConsentTemplates", null, 0, -1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_MappedRefusalTemplates(), this.getConsentTemplateKeyDTO(), null, "mappedRefusalTemplates", null, 0, -1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_MappedRevocationTemplates(), this.getConsentTemplateKeyDTO(), null, "mappedRevocationTemplates", null, 0, -1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_ScanBase64(), theXMLTypePackage.getString(), "scanBase64", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_ScanFileType(), theXMLTypePackage.getString(), "scanFileType", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_Structure(), this.getConsentTemplateStructureDTO(), null, "structure", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_Type(), this.getConsentTemplateType(), "type", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_UpdateDate(), theXMLTypePackage.getDateTime(), "updateDate", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateDTO_ValidFromProperties(), this.getValidFromPropertiesDTO(), null, "validFromProperties", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateDTO_VersionLabel(), theXMLTypePackage.getString(), "versionLabel", null, 0, 1, ConsentTemplateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentTemplateKeyDTOEClass, ConsentTemplateKeyDTO.class, "ConsentTemplateKeyDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsentTemplateKeyDTO_DomainName(), theXMLTypePackage.getString(), "domainName", null, 0, 1, ConsentTemplateKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateKeyDTO_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ConsentTemplateKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsentTemplateKeyDTO_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ConsentTemplateKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consentTemplateStructureDTOEClass, ConsentTemplateStructureDTO.class, "ConsentTemplateStructureDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsentTemplateStructureDTO_Children(), this.getChildrenType(), null, "children", null, 1, 1, ConsentTemplateStructureDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsentTemplateStructureDTO_FirstLevelModules(), this.getModuleKeyDTO(), null, "firstLevelModules", null, 0, -1, ConsentTemplateStructureDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countConsentsForDomainWithFilterEClass, CountConsentsForDomainWithFilter.class, "CountConsentsForDomainWithFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountConsentsForDomainWithFilter_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, CountConsentsForDomainWithFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountConsentsForDomainWithFilter_Config(), theConfigPackage.getPaginationConfig(), null, "config", null, 1, 1, CountConsentsForDomainWithFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countConsentsForDomainWithFilterResponseEClass, CountConsentsForDomainWithFilterResponse.class, "CountConsentsForDomainWithFilterResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountConsentsForDomainWithFilterResponse_Return(), theXMLTypePackage.getLong(), "return", null, 1, 1, CountConsentsForDomainWithFilterResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countSignedPoliciesEClass, CountSignedPolicies.class, "CountSignedPolicies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountSignedPolicies_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, CountSignedPolicies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countSignedPoliciesResponseEClass, CountSignedPoliciesResponse.class, "CountSignedPoliciesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountSignedPoliciesResponse_Return(), theXMLTypePackage.getLong(), "return", null, 1, 1, CountSignedPoliciesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deactivateAliasEClass, DeactivateAlias.class, "DeactivateAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeactivateAlias_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, DeactivateAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeactivateAlias_OriginalSignerId(), this.getSignerIdDTO(), null, "originalSignerId", null, 1, 1, DeactivateAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeactivateAlias_AliasSignerId(), this.getSignerIdDTO(), null, "aliasSignerId", null, 1, 1, DeactivateAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deactivateAliasResponseEClass, DeactivateAliasResponse.class, "DeactivateAliasResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddAlias(), this.getAddAlias(), null, "addAlias", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddAliasResponse(), this.getAddAliasResponse(), null, "addAliasResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddConsent(), this.getAddConsent(), null, "addConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddConsentOptOut(), this.getAddConsentOptOut(), null, "addConsentOptOut", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddConsentOptOutResponse(), this.getAddConsentOptOutResponse(), null, "addConsentOptOutResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddConsentResponse(), this.getAddConsentResponse(), null, "addConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddScanToConsent(), this.getAddScanToConsent(), null, "addScanToConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddScanToConsentResponse(), this.getAddScanToConsentResponse(), null, "addScanToConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddSignerIdToConsent(), this.getAddSignerIdToConsent(), null, "addSignerIdToConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddSignerIdToConsentResponse(), this.getAddSignerIdToConsentResponse(), null, "addSignerIdToConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddSignerIdToSignerId(), this.getAddSignerIdToSignerId(), null, "addSignerIdToSignerId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddSignerIdToSignerIdResponse(), this.getAddSignerIdToSignerIdResponse(), null, "addSignerIdToSignerIdResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CountConsentsForDomainWithFilter(), this.getCountConsentsForDomainWithFilter(), null, "countConsentsForDomainWithFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CountConsentsForDomainWithFilterResponse(), this.getCountConsentsForDomainWithFilterResponse(), null, "countConsentsForDomainWithFilterResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CountSignedPolicies(), this.getCountSignedPolicies(), null, "countSignedPolicies", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CountSignedPoliciesResponse(), this.getCountSignedPoliciesResponse(), null, "countSignedPoliciesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DeactivateAlias(), this.getDeactivateAlias(), null, "deactivateAlias", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DeactivateAliasResponse(), this.getDeactivateAliasResponse(), null, "deactivateAliasResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DuplicateEntryException(), this.getDuplicateEntryException(), null, "duplicateEntryException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAliasesForSignerId(), this.getGetAliasesForSignerId(), null, "getAliasesForSignerId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAliasesForSignerIdResponse(), this.getGetAliasesForSignerIdResponse(), null, "getAliasesForSignerIdResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAliasesForSignerIds(), this.getGetAliasesForSignerIds(), null, "getAliasesForSignerIds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAliasesForSignerIdsResponse(), this.getGetAliasesForSignerIdsResponse(), null, "getAliasesForSignerIdsResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentedIdsFor(), this.getGetAllConsentedIdsFor(), null, "getAllConsentedIdsFor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentedIdsForResponse(), this.getGetAllConsentedIdsForResponse(), null, "getAllConsentedIdsForResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentsForConsentTemplate(), this.getGetAllConsentsForConsentTemplate(), null, "getAllConsentsForConsentTemplate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentsForConsentTemplateResponse(), this.getGetAllConsentsForConsentTemplateResponse(), null, "getAllConsentsForConsentTemplateResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentsForDomain(), this.getGetAllConsentsForDomain(), null, "getAllConsentsForDomain", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentsForDomainResponse(), this.getGetAllConsentsForDomainResponse(), null, "getAllConsentsForDomainResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentsForDomainWithoutScan(), this.getGetAllConsentsForDomainWithoutScan(), null, "getAllConsentsForDomainWithoutScan", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentsForDomainWithoutScanResponse(), this.getGetAllConsentsForDomainWithoutScanResponse(), null, "getAllConsentsForDomainWithoutScanResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentsForSignerIds(), this.getGetAllConsentsForSignerIds(), null, "getAllConsentsForSignerIds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllConsentsForSignerIdsResponse(), this.getGetAllConsentsForSignerIdsResponse(), null, "getAllConsentsForSignerIdsResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllIdsForSignerIdType(), this.getGetAllIdsForSignerIdType(), null, "getAllIdsForSignerIdType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetAllIdsForSignerIdTypeResponse(), this.getGetAllIdsForSignerIdTypeResponse(), null, "getAllIdsForSignerIdTypeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsent(), this.getGetConsent(), null, "getConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentDates(), this.getGetConsentDates(), null, "getConsentDates", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentDatesResponse(), this.getGetConsentDatesResponse(), null, "getConsentDatesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentLight(), this.getGetConsentLight(), null, "getConsentLight", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentLightResponse(), this.getGetConsentLightResponse(), null, "getConsentLightResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentResponse(), this.getGetConsentResponse(), null, "getConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentsForDomainPaginated(), this.getGetConsentsForDomainPaginated(), null, "getConsentsForDomainPaginated", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentsForDomainPaginatedResponse(), this.getGetConsentsForDomainPaginatedResponse(), null, "getConsentsForDomainPaginatedResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusType(), this.getGetConsentStatusType(), null, "getConsentStatusType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeFromExcludingToExcluding(), this.getGetConsentStatusTypeFromExcludingToExcluding(), null, "getConsentStatusTypeFromExcludingToExcluding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeFromExcludingToExcludingResponse(), this.getGetConsentStatusTypeFromExcludingToExcludingResponse(), null, "getConsentStatusTypeFromExcludingToExcludingResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeFromExcludingToIncluding(), this.getGetConsentStatusTypeFromExcludingToIncluding(), null, "getConsentStatusTypeFromExcludingToIncluding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeFromExcludingToIncludingResponse(), this.getGetConsentStatusTypeFromExcludingToIncludingResponse(), null, "getConsentStatusTypeFromExcludingToIncludingResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeFromIncludingToExcluding(), this.getGetConsentStatusTypeFromIncludingToExcluding(), null, "getConsentStatusTypeFromIncludingToExcluding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeFromIncludingToExcludingResponse(), this.getGetConsentStatusTypeFromIncludingToExcludingResponse(), null, "getConsentStatusTypeFromIncludingToExcludingResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeFromIncludingToIncluding(), this.getGetConsentStatusTypeFromIncludingToIncluding(), null, "getConsentStatusTypeFromIncludingToIncluding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeFromIncludingToIncludingResponse(), this.getGetConsentStatusTypeFromIncludingToIncludingResponse(), null, "getConsentStatusTypeFromIncludingToIncludingResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentStatusTypeResponse(), this.getGetConsentStatusTypeResponse(), null, "getConsentStatusTypeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentTemplate(), this.getGetConsentTemplate(), null, "getConsentTemplate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConsentTemplateResponse(), this.getGetConsentTemplateResponse(), null, "getConsentTemplateResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCurrentConsentForSignerIdsAndCT(), this.getGetCurrentConsentForSignerIdsAndCT(), null, "getCurrentConsentForSignerIdsAndCT", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCurrentConsentForSignerIdsAndCTResponse(), this.getGetCurrentConsentForSignerIdsAndCTResponse(), null, "getCurrentConsentForSignerIdsAndCTResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCurrentConsentTemplate(), this.getGetCurrentConsentTemplate(), null, "getCurrentConsentTemplate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCurrentConsentTemplateResponse(), this.getGetCurrentConsentTemplateResponse(), null, "getCurrentConsentTemplateResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCurrentPolicyStatesForSignerIds(), this.getGetCurrentPolicyStatesForSignerIds(), null, "getCurrentPolicyStatesForSignerIds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCurrentPolicyStatesForSignerIdsResponse(), this.getGetCurrentPolicyStatesForSignerIdsResponse(), null, "getCurrentPolicyStatesForSignerIdsResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetDomain(), this.getGetDomain(), null, "getDomain", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetDomainResponse(), this.getGetDomainResponse(), null, "getDomainResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetMappedTemplatesForSignerId(), this.getGetMappedTemplatesForSignerId(), null, "getMappedTemplatesForSignerId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetMappedTemplatesForSignerIdResponse(), this.getGetMappedTemplatesForSignerIdResponse(), null, "getMappedTemplatesForSignerIdResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetModule(), this.getGetModule(), null, "getModule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetModuleResponse(), this.getGetModuleResponse(), null, "getModuleResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetObjectByFhirID(), this.getGetObjectByFhirID(), null, "getObjectByFhirID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetObjectByFhirIDResponse(), this.getGetObjectByFhirIDResponse(), null, "getObjectByFhirIDResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetPolicy(), this.getGetPolicy(), null, "getPolicy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetPolicyResponse(), this.getGetPolicyResponse(), null, "getPolicyResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetPolicyStatesForPolicyAndSignerIds(), this.getGetPolicyStatesForPolicyAndSignerIds(), null, "getPolicyStatesForPolicyAndSignerIds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetPolicyStatesForPolicyAndSignerIdsResponse(), this.getGetPolicyStatesForPolicyAndSignerIdsResponse(), null, "getPolicyStatesForPolicyAndSignerIdsResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIds(), this.getGetPolicyStatesForPolicyNameAndSignerIds(), null, "getPolicyStatesForPolicyNameAndSignerIds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIdsResponse(), this.getGetPolicyStatesForPolicyNameAndSignerIdsResponse(), null, "getPolicyStatesForPolicyNameAndSignerIdsResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetPolicyStatesForSignerIds(), this.getGetPolicyStatesForSignerIds(), null, "getPolicyStatesForSignerIds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetPolicyStatesForSignerIdsResponse(), this.getGetPolicyStatesForSignerIdsResponse(), null, "getPolicyStatesForSignerIdsResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetQCHistoryForConsent(), this.getGetQCHistoryForConsent(), null, "getQCHistoryForConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetQCHistoryForConsentResponse(), this.getGetQCHistoryForConsentResponse(), null, "getQCHistoryForConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetQCProblemHistoryForQCProblem(), this.getGetQCProblemHistoryForQCProblem(), null, "getQCProblemHistoryForQCProblem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetQCProblemHistoryForQCProblemResponse(), this.getGetQCProblemHistoryForQCProblemResponse(), null, "getQCProblemHistoryForQCProblemResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetSignerIdsForAlias(), this.getGetSignerIdsForAlias(), null, "getSignerIdsForAlias", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetSignerIdsForAliasResponse(), this.getGetSignerIdsForAliasResponse(), null, "getSignerIdsForAliasResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetSignerIdType(), this.getGetSignerIdType(), null, "getSignerIdType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetSignerIdTypeResponse(), this.getGetSignerIdTypeResponse(), null, "getSignerIdTypeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetTemplatesWithPolicies(), this.getGetTemplatesWithPolicies(), null, "getTemplatesWithPolicies", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetTemplatesWithPoliciesResponse(), this.getGetTemplatesWithPoliciesResponse(), null, "getTemplatesWithPoliciesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IllegalArgumentException(), this.getIllegalArgumentException(), null, "illegalArgumentException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InconsistentStatusException(), this.getInconsistentStatusException(), null, "inconsistentStatusException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InternalException(), this.getInternalException(), null, "internalException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InvalidFreeTextException(), this.getInvalidFreeTextException(), null, "invalidFreeTextException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InvalidParameterException(), this.getInvalidParameterException(), null, "invalidParameterException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InvalidVersionException(), this.getInvalidVersionException(), null, "invalidVersionException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsented(), this.getIsConsented(), null, "isConsented", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedFromExcludingToExcluding(), this.getIsConsentedFromExcludingToExcluding(), null, "isConsentedFromExcludingToExcluding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedFromExcludingToExcludingResponse(), this.getIsConsentedFromExcludingToExcludingResponse(), null, "isConsentedFromExcludingToExcludingResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedFromExcludingToIncluding(), this.getIsConsentedFromExcludingToIncluding(), null, "isConsentedFromExcludingToIncluding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedFromExcludingToIncludingResponse(), this.getIsConsentedFromExcludingToIncludingResponse(), null, "isConsentedFromExcludingToIncludingResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedFromIncludingToExcluding(), this.getIsConsentedFromIncludingToExcluding(), null, "isConsentedFromIncludingToExcluding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedFromIncludingToExcludingResponse(), this.getIsConsentedFromIncludingToExcludingResponse(), null, "isConsentedFromIncludingToExcludingResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedFromIncludingToIncluding(), this.getIsConsentedFromIncludingToIncluding(), null, "isConsentedFromIncludingToIncluding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedFromIncludingToIncludingResponse(), this.getIsConsentedFromIncludingToIncludingResponse(), null, "isConsentedFromIncludingToIncludingResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsConsentedResponse(), this.getIsConsentedResponse(), null, "isConsentedResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListConsentTemplates(), this.getListConsentTemplates(), null, "listConsentTemplates", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListConsentTemplatesResponse(), this.getListConsentTemplatesResponse(), null, "listConsentTemplatesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListCurrentConsentTemplates(), this.getListCurrentConsentTemplates(), null, "listCurrentConsentTemplates", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListCurrentConsentTemplatesResponse(), this.getListCurrentConsentTemplatesResponse(), null, "listCurrentConsentTemplatesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListDomains(), this.getListDomains(), null, "listDomains", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListDomainsResponse(), this.getListDomainsResponse(), null, "listDomainsResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListModules(), this.getListModules(), null, "listModules", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListModulesResponse(), this.getListModulesResponse(), null, "listModulesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListPolicies(), this.getListPolicies(), null, "listPolicies", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListPoliciesResponse(), this.getListPoliciesResponse(), null, "listPoliciesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListSignerIdTypes(), this.getListSignerIdTypes(), null, "listSignerIdTypes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListSignerIdTypesResponse(), this.getListSignerIdTypesResponse(), null, "listSignerIdTypesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MandatoryFieldsException(), this.getMandatoryFieldsException(), null, "mandatoryFieldsException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MissingRequiredObjectException(), this.getMissingRequiredObjectException(), null, "missingRequiredObjectException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RefuseConsent(), this.getRefuseConsent(), null, "refuseConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RefuseConsentResponse(), this.getRefuseConsentResponse(), null, "refuseConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoveScanFromConsent(), this.getRemoveScanFromConsent(), null, "removeScanFromConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoveScanFromConsentResponse(), this.getRemoveScanFromConsentResponse(), null, "removeScanFromConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequirementsNotFullfilledException(), this.getRequirementsNotFullfilledException(), null, "requirementsNotFullfilledException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SetQCForConsent(), this.getSetQCForConsent(), null, "setQCForConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SetQCForConsentResponse(), this.getSetQCForConsentResponse(), null, "setQCForConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownAliasException(), this.getUnknownAliasException(), null, "unknownAliasException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownConsentException(), this.getUnknownConsentException(), null, "unknownConsentException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownConsentTemplateException(), this.getUnknownConsentTemplateException(), null, "unknownConsentTemplateException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownDomainException(), this.getUnknownDomainException(), null, "unknownDomainException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownFhirIdObjectException(), this.getUnknownFhirIdObjectException(), null, "unknownFhirIdObjectException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownIDException(), this.getUnknownIDException(), null, "unknownIDException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownModuleException(), this.getUnknownModuleException(), null, "unknownModuleException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownPolicyException(), this.getUnknownPolicyException(), null, "unknownPolicyException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownSignerIdException(), this.getUnknownSignerIdException(), null, "unknownSignerIdException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnknownSignerIdTypeException(), this.getUnknownSignerIdTypeException(), null, "unknownSignerIdTypeException", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdateConsentInUse(), this.getUpdateConsentInUse(), null, "updateConsentInUse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdateConsentInUseResponse(), this.getUpdateConsentInUseResponse(), null, "updateConsentInUseResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidateConsent(), this.getValidateConsent(), null, "validateConsent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidateConsentResponse(), this.getValidateConsentResponse(), null, "validateConsentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(domainDTOEClass, DomainDTO.class, "DomainDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDTO_Config(), theConfigPackage.getDomainConfig(), null, "config", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_CtVersionConverter(), theXMLTypePackage.getString(), "ctVersionConverter", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDTO_ExpirationProperties(), this.getExpirationPropertiesDTO(), null, "expirationProperties", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_Finalised(), theXMLTypePackage.getBoolean(), "finalised", null, 1, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_Logo(), theXMLTypePackage.getString(), "logo", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_ModuleVersionConverter(), theXMLTypePackage.getString(), "moduleVersionConverter", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_PolicyVersionConverter(), theXMLTypePackage.getString(), "policyVersionConverter", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_SignerIdTypes(), theXMLTypePackage.getString(), "signerIdTypes", null, 0, -1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDTO_UpdateDate(), theXMLTypePackage.getDateTime(), "updateDate", null, 0, 1, DomainDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(duplicateEntryExceptionEClass, DuplicateEntryException.class, "DuplicateEntryException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuplicateEntryException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, DuplicateEntryException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType_Key(), this.getModuleKeyDTO(), null, "key", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Value(), this.getHashMap(), null, "value", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryType1EClass, EntryType1.class, "EntryType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType1_Key(), this.getModuleKeyDTO(), null, "key", null, 0, 1, EntryType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType1_Value(), this.getModuleStateDTO(), null, "value", null, 0, 1, EntryType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryType2EClass, EntryType2.class, "EntryType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType2_Key(), this.getModuleKeyDTO(), null, "key", null, 0, 1, EntryType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType2_Value(), this.getModuleKeyDTOArray(), null, "value", null, 0, 1, EntryType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryType3EClass, EntryType3.class, "EntryType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType3_Key(), this.getSignerIdDTO(), null, "key", null, 0, 1, EntryType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType3_Value(), this.getSignerIdDTOArray(), null, "value", null, 0, 1, EntryType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryType4EClass, EntryType4.class, "EntryType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType4_Key(), this.getModuleKeyDTO(), null, "key", null, 0, 1, EntryType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType4_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, EntryType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expirationPropertiesDTOEClass, ExpirationPropertiesDTO.class, "ExpirationPropertiesDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpirationPropertiesDTO_FixedExpirationDate(), theXMLTypePackage.getDateTime(), "fixedExpirationDate", null, 0, 1, ExpirationPropertiesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpirationPropertiesDTO_ValidPeriod(), theXMLTypePackage.getString(), "validPeriod", null, 0, 1, ExpirationPropertiesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fhirIdDTOEClass, FhirIdDTO.class, "FhirIdDTO", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFhirIdDTO_FhirID(), theXMLTypePackage.getString(), "fhirID", null, 0, 1, FhirIdDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freeTextDefDTOEClass, FreeTextDefDTO.class, "FreeTextDefDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeTextDefDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_ConverterString(), theXMLTypePackage.getString(), "converterString", null, 0, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 0, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_Finalised(), theXMLTypePackage.getBoolean(), "finalised", null, 1, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_Pos(), theXMLTypePackage.getInt(), "pos", null, 1, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_Required(), theXMLTypePackage.getBoolean(), "required", null, 1, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_Type(), this.getFreeTextType(), "type", null, 0, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextDefDTO_UpdateDate(), theXMLTypePackage.getDateTime(), "updateDate", null, 0, 1, FreeTextDefDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freeTextValDTOEClass, FreeTextValDTO.class, "FreeTextValDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeTextValDTO_FreeTextDefName(), theXMLTypePackage.getString(), "freeTextDefName", null, 0, 1, FreeTextValDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeTextValDTO_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, FreeTextValDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAliasesForSignerIdEClass, GetAliasesForSignerId.class, "GetAliasesForSignerId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAliasesForSignerId_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetAliasesForSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetAliasesForSignerId_OriginalSignerId(), this.getSignerIdDTO(), null, "originalSignerId", null, 1, 1, GetAliasesForSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAliasesForSignerIdResponseEClass, GetAliasesForSignerIdResponse.class, "GetAliasesForSignerIdResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAliasesForSignerIdResponse_Return(), this.getReturnType23(), null, "return", null, 0, 1, GetAliasesForSignerIdResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAliasesForSignerIdsEClass, GetAliasesForSignerIds.class, "GetAliasesForSignerIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAliasesForSignerIds_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetAliasesForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetAliasesForSignerIds_OriginalSignerIds(), this.getSignerIdDTO(), null, "originalSignerIds", null, 1, -1, GetAliasesForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAliasesForSignerIdsResponseEClass, GetAliasesForSignerIdsResponse.class, "GetAliasesForSignerIdsResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAliasesForSignerIdsResponse_Return(), this.getReturnType22(), null, "return", null, 1, 1, GetAliasesForSignerIdsResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentedIdsForEClass, GetAllConsentedIdsFor.class, "GetAllConsentedIdsFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAllConsentedIdsFor_SignerIdTypeName(), theXMLTypePackage.getString(), "signerIdTypeName", null, 1, 1, GetAllConsentedIdsFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetAllConsentedIdsFor_PolicyKey(), this.getPolicyKeyDTO(), null, "policyKey", null, 1, 1, GetAllConsentedIdsFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetAllConsentedIdsFor_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, GetAllConsentedIdsFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentedIdsForResponseEClass, GetAllConsentedIdsForResponse.class, "GetAllConsentedIdsForResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAllConsentedIdsForResponse_Return(), this.getReturnType6(), null, "return", null, 0, 1, GetAllConsentedIdsForResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentsForConsentTemplateEClass, GetAllConsentsForConsentTemplate.class, "GetAllConsentsForConsentTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAllConsentsForConsentTemplate_ConsentTemplateKey(), this.getConsentTemplateKeyDTO(), null, "consentTemplateKey", null, 1, 1, GetAllConsentsForConsentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentsForConsentTemplateResponseEClass, GetAllConsentsForConsentTemplateResponse.class, "GetAllConsentsForConsentTemplateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAllConsentsForConsentTemplateResponse_Return(), this.getReturnType7(), null, "return", null, 0, 1, GetAllConsentsForConsentTemplateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentsForDomainEClass, GetAllConsentsForDomain.class, "GetAllConsentsForDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAllConsentsForDomain_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetAllConsentsForDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentsForDomainResponseEClass, GetAllConsentsForDomainResponse.class, "GetAllConsentsForDomainResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAllConsentsForDomainResponse_Return(), this.getReturnType21(), null, "return", null, 0, 1, GetAllConsentsForDomainResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentsForDomainWithoutScanEClass, GetAllConsentsForDomainWithoutScan.class, "GetAllConsentsForDomainWithoutScan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAllConsentsForDomainWithoutScan_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetAllConsentsForDomainWithoutScan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentsForDomainWithoutScanResponseEClass, GetAllConsentsForDomainWithoutScanResponse.class, "GetAllConsentsForDomainWithoutScanResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAllConsentsForDomainWithoutScanResponse_Return(), this.getReturnType8(), null, "return", null, 0, 1, GetAllConsentsForDomainWithoutScanResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentsForSignerIdsEClass, GetAllConsentsForSignerIds.class, "GetAllConsentsForSignerIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAllConsentsForSignerIds_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetAllConsentsForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetAllConsentsForSignerIds_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetAllConsentsForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetAllConsentsForSignerIds_UseAliases(), theXMLTypePackage.getBoolean(), "useAliases", null, 1, 1, GetAllConsentsForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllConsentsForSignerIdsResponseEClass, GetAllConsentsForSignerIdsResponse.class, "GetAllConsentsForSignerIdsResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAllConsentsForSignerIdsResponse_Return(), this.getReturnType10(), null, "return", null, 0, 1, GetAllConsentsForSignerIdsResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllIdsForSignerIdTypeEClass, GetAllIdsForSignerIdType.class, "GetAllIdsForSignerIdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAllIdsForSignerIdType_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetAllIdsForSignerIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetAllIdsForSignerIdType_SignerIdTypeName(), theXMLTypePackage.getString(), "signerIdTypeName", null, 1, 1, GetAllIdsForSignerIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllIdsForSignerIdTypeResponseEClass, GetAllIdsForSignerIdTypeResponse.class, "GetAllIdsForSignerIdTypeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetAllIdsForSignerIdTypeResponse_Return(), this.getReturnType20(), null, "return", null, 0, 1, GetAllIdsForSignerIdTypeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentEClass, GetConsent.class, "GetConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsent_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, GetConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentDatesEClass, GetConsentDates.class, "GetConsentDates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentDates_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, GetConsentDates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentDatesResponseEClass, GetConsentDatesResponse.class, "GetConsentDatesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentDatesResponse_Return(), this.getConsentDateValuesDTO(), null, "return", null, 0, 1, GetConsentDatesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentLightEClass, GetConsentLight.class, "GetConsentLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentLight_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, GetConsentLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentLightResponseEClass, GetConsentLightResponse.class, "GetConsentLightResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentLightResponse_Return(), this.getConsentLightDTO(), null, "return", null, 0, 1, GetConsentLightResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentResponseEClass, GetConsentResponse.class, "GetConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentResponse_Return(), this.getConsentDTO(), null, "return", null, 0, 1, GetConsentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentsForDomainPaginatedEClass, GetConsentsForDomainPaginated.class, "GetConsentsForDomainPaginated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetConsentsForDomainPaginated_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetConsentsForDomainPaginated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetConsentsForDomainPaginated_Config(), theConfigPackage.getPaginationConfig(), null, "config", null, 1, 1, GetConsentsForDomainPaginated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentsForDomainPaginatedResponseEClass, GetConsentsForDomainPaginatedResponse.class, "GetConsentsForDomainPaginatedResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentsForDomainPaginatedResponse_Return(), this.getReturnType19(), null, "return", null, 0, 1, GetConsentsForDomainPaginatedResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeEClass, GetConsentStatusType.class, "GetConsentStatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentStatusType_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetConsentStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetConsentStatusType_PolicyKey(), this.getPolicyKeyDTO(), null, "policyKey", null, 1, 1, GetConsentStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetConsentStatusType_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, GetConsentStatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeFromExcludingToExcludingEClass, GetConsentStatusTypeFromExcludingToExcluding.class, "GetConsentStatusTypeFromExcludingToExcluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentStatusTypeFromExcludingToExcluding_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetConsentStatusTypeFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromExcludingToExcluding_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetConsentStatusTypeFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromExcludingToExcluding_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, GetConsentStatusTypeFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromExcludingToExcluding_VersionFrom(), theXMLTypePackage.getString(), "versionFrom", null, 1, 1, GetConsentStatusTypeFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromExcludingToExcluding_VersionTo(), theXMLTypePackage.getString(), "versionTo", null, 1, 1, GetConsentStatusTypeFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetConsentStatusTypeFromExcludingToExcluding_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, GetConsentStatusTypeFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeFromExcludingToExcludingResponseEClass, GetConsentStatusTypeFromExcludingToExcludingResponse.class, "GetConsentStatusTypeFromExcludingToExcludingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetConsentStatusTypeFromExcludingToExcludingResponse_Return(), this.getConsentStatusType(), "return", null, 0, 1, GetConsentStatusTypeFromExcludingToExcludingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeFromExcludingToIncludingEClass, GetConsentStatusTypeFromExcludingToIncluding.class, "GetConsentStatusTypeFromExcludingToIncluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentStatusTypeFromExcludingToIncluding_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetConsentStatusTypeFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromExcludingToIncluding_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetConsentStatusTypeFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromExcludingToIncluding_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, GetConsentStatusTypeFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromExcludingToIncluding_VersionFrom(), theXMLTypePackage.getString(), "versionFrom", null, 1, 1, GetConsentStatusTypeFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromExcludingToIncluding_VersionTo(), theXMLTypePackage.getString(), "versionTo", null, 1, 1, GetConsentStatusTypeFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetConsentStatusTypeFromExcludingToIncluding_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, GetConsentStatusTypeFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeFromExcludingToIncludingResponseEClass, GetConsentStatusTypeFromExcludingToIncludingResponse.class, "GetConsentStatusTypeFromExcludingToIncludingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetConsentStatusTypeFromExcludingToIncludingResponse_Return(), this.getConsentStatusType(), "return", null, 0, 1, GetConsentStatusTypeFromExcludingToIncludingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeFromIncludingToExcludingEClass, GetConsentStatusTypeFromIncludingToExcluding.class, "GetConsentStatusTypeFromIncludingToExcluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentStatusTypeFromIncludingToExcluding_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetConsentStatusTypeFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromIncludingToExcluding_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetConsentStatusTypeFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromIncludingToExcluding_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, GetConsentStatusTypeFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromIncludingToExcluding_VersionFrom(), theXMLTypePackage.getString(), "versionFrom", null, 1, 1, GetConsentStatusTypeFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromIncludingToExcluding_VersionTo(), theXMLTypePackage.getString(), "versionTo", null, 1, 1, GetConsentStatusTypeFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetConsentStatusTypeFromIncludingToExcluding_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, GetConsentStatusTypeFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeFromIncludingToExcludingResponseEClass, GetConsentStatusTypeFromIncludingToExcludingResponse.class, "GetConsentStatusTypeFromIncludingToExcludingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetConsentStatusTypeFromIncludingToExcludingResponse_Return(), this.getConsentStatusType(), "return", null, 0, 1, GetConsentStatusTypeFromIncludingToExcludingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeFromIncludingToIncludingEClass, GetConsentStatusTypeFromIncludingToIncluding.class, "GetConsentStatusTypeFromIncludingToIncluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentStatusTypeFromIncludingToIncluding_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetConsentStatusTypeFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromIncludingToIncluding_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetConsentStatusTypeFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromIncludingToIncluding_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, GetConsentStatusTypeFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromIncludingToIncluding_VersionFrom(), theXMLTypePackage.getString(), "versionFrom", null, 1, 1, GetConsentStatusTypeFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConsentStatusTypeFromIncludingToIncluding_VersionTo(), theXMLTypePackage.getString(), "versionTo", null, 1, 1, GetConsentStatusTypeFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetConsentStatusTypeFromIncludingToIncluding_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, GetConsentStatusTypeFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeFromIncludingToIncludingResponseEClass, GetConsentStatusTypeFromIncludingToIncludingResponse.class, "GetConsentStatusTypeFromIncludingToIncludingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetConsentStatusTypeFromIncludingToIncludingResponse_Return(), this.getConsentStatusType(), "return", null, 0, 1, GetConsentStatusTypeFromIncludingToIncludingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentStatusTypeResponseEClass, GetConsentStatusTypeResponse.class, "GetConsentStatusTypeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetConsentStatusTypeResponse_Return(), this.getConsentStatusType(), "return", null, 0, 1, GetConsentStatusTypeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentTemplateEClass, GetConsentTemplate.class, "GetConsentTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentTemplate_ConsentTemplateKey(), this.getConsentTemplateKeyDTO(), null, "consentTemplateKey", null, 1, 1, GetConsentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConsentTemplateResponseEClass, GetConsentTemplateResponse.class, "GetConsentTemplateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConsentTemplateResponse_Return(), this.getConsentTemplateDTO(), null, "return", null, 0, 1, GetConsentTemplateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCurrentConsentForSignerIdsAndCTEClass, GetCurrentConsentForSignerIdsAndCT.class, "GetCurrentConsentForSignerIdsAndCT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetCurrentConsentForSignerIdsAndCT_ConsentTemplateKey(), this.getConsentTemplateKeyDTO(), null, "consentTemplateKey", null, 1, 1, GetCurrentConsentForSignerIdsAndCT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetCurrentConsentForSignerIdsAndCT_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetCurrentConsentForSignerIdsAndCT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetCurrentConsentForSignerIdsAndCT_IgnoreVersionNumber(), theXMLTypePackage.getBoolean(), "ignoreVersionNumber", null, 1, 1, GetCurrentConsentForSignerIdsAndCT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetCurrentConsentForSignerIdsAndCT_UseAliases(), theXMLTypePackage.getBoolean(), "useAliases", null, 1, 1, GetCurrentConsentForSignerIdsAndCT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCurrentConsentForSignerIdsAndCTResponseEClass, GetCurrentConsentForSignerIdsAndCTResponse.class, "GetCurrentConsentForSignerIdsAndCTResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetCurrentConsentForSignerIdsAndCTResponse_Return(), this.getConsentDTO(), null, "return", null, 0, 1, GetCurrentConsentForSignerIdsAndCTResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCurrentConsentTemplateEClass, GetCurrentConsentTemplate.class, "GetCurrentConsentTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetCurrentConsentTemplate_ConsentTemplateName(), theXMLTypePackage.getString(), "consentTemplateName", null, 1, 1, GetCurrentConsentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetCurrentConsentTemplate_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetCurrentConsentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCurrentConsentTemplateResponseEClass, GetCurrentConsentTemplateResponse.class, "GetCurrentConsentTemplateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetCurrentConsentTemplateResponse_Return(), this.getConsentTemplateDTO(), null, "return", null, 0, 1, GetCurrentConsentTemplateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCurrentPolicyStatesForSignerIdsEClass, GetCurrentPolicyStatesForSignerIds.class, "GetCurrentPolicyStatesForSignerIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetCurrentPolicyStatesForSignerIds_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetCurrentPolicyStatesForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetCurrentPolicyStatesForSignerIds_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetCurrentPolicyStatesForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetCurrentPolicyStatesForSignerIds_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, GetCurrentPolicyStatesForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCurrentPolicyStatesForSignerIdsResponseEClass, GetCurrentPolicyStatesForSignerIdsResponse.class, "GetCurrentPolicyStatesForSignerIdsResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetCurrentPolicyStatesForSignerIdsResponse_Return(), this.getReturnType9(), null, "return", null, 0, 1, GetCurrentPolicyStatesForSignerIdsResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getDomainEClass, GetDomain.class, "GetDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetDomain_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getDomainResponseEClass, GetDomainResponse.class, "GetDomainResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetDomainResponse_Return(), this.getDomainDTO(), null, "return", null, 0, 1, GetDomainResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getMappedTemplatesForSignerIdEClass, GetMappedTemplatesForSignerId.class, "GetMappedTemplatesForSignerId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetMappedTemplatesForSignerId_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetMappedTemplatesForSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetMappedTemplatesForSignerId_CtType(), this.getConsentTemplateType(), "ctType", null, 1, 1, GetMappedTemplatesForSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetMappedTemplatesForSignerId_SignerId(), this.getSignerIdDTO(), null, "signerId", null, 1, 1, GetMappedTemplatesForSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetMappedTemplatesForSignerId_UseAliases(), theXMLTypePackage.getBoolean(), "useAliases", null, 1, 1, GetMappedTemplatesForSignerId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getMappedTemplatesForSignerIdResponseEClass, GetMappedTemplatesForSignerIdResponse.class, "GetMappedTemplatesForSignerIdResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetMappedTemplatesForSignerIdResponse_Return(), this.getReturnType18(), null, "return", null, 0, 1, GetMappedTemplatesForSignerIdResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getModuleEClass, GetModule.class, "GetModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetModule_ModuleKey(), this.getModuleKeyDTO(), null, "moduleKey", null, 1, 1, GetModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getModuleResponseEClass, GetModuleResponse.class, "GetModuleResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetModuleResponse_Return(), this.getModuleDTO(), null, "return", null, 0, 1, GetModuleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getObjectByFhirIDEClass, GetObjectByFhirID.class, "GetObjectByFhirID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetObjectByFhirID_Clazz(), theXMLTypePackage.getString(), "clazz", null, 1, 1, GetObjectByFhirID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetObjectByFhirID_FhirID(), theXMLTypePackage.getString(), "fhirID", null, 1, 1, GetObjectByFhirID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getObjectByFhirIDResponseEClass, GetObjectByFhirIDResponse.class, "GetObjectByFhirIDResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetObjectByFhirIDResponse_Return(), this.getFhirIdDTO(), null, "return", null, 0, 1, GetObjectByFhirIDResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPolicyEClass, GetPolicy.class, "GetPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPolicy_PolicyKey(), this.getPolicyKeyDTO(), null, "policyKey", null, 1, 1, GetPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPolicyResponseEClass, GetPolicyResponse.class, "GetPolicyResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPolicyResponse_Return(), this.getPolicyDTO(), null, "return", null, 0, 1, GetPolicyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPolicyStatesForPolicyAndSignerIdsEClass, GetPolicyStatesForPolicyAndSignerIds.class, "GetPolicyStatesForPolicyAndSignerIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPolicyStatesForPolicyAndSignerIds_PolicyKey(), this.getPolicyKeyDTO(), null, "policyKey", null, 1, 1, GetPolicyStatesForPolicyAndSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetPolicyStatesForPolicyAndSignerIds_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetPolicyStatesForPolicyAndSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetPolicyStatesForPolicyAndSignerIds_UseAliases(), theXMLTypePackage.getBoolean(), "useAliases", null, 1, 1, GetPolicyStatesForPolicyAndSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPolicyStatesForPolicyAndSignerIdsResponseEClass, GetPolicyStatesForPolicyAndSignerIdsResponse.class, "GetPolicyStatesForPolicyAndSignerIdsResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPolicyStatesForPolicyAndSignerIdsResponse_Return(), this.getReturnType11(), null, "return", null, 0, 1, GetPolicyStatesForPolicyAndSignerIdsResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPolicyStatesForPolicyNameAndSignerIdsEClass, GetPolicyStatesForPolicyNameAndSignerIds.class, "GetPolicyStatesForPolicyNameAndSignerIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetPolicyStatesForPolicyNameAndSignerIds_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetPolicyStatesForPolicyNameAndSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetPolicyStatesForPolicyNameAndSignerIds_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, GetPolicyStatesForPolicyNameAndSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetPolicyStatesForPolicyNameAndSignerIds_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetPolicyStatesForPolicyNameAndSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetPolicyStatesForPolicyNameAndSignerIds_UseAliases(), theXMLTypePackage.getBoolean(), "useAliases", null, 1, 1, GetPolicyStatesForPolicyNameAndSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPolicyStatesForPolicyNameAndSignerIdsResponseEClass, GetPolicyStatesForPolicyNameAndSignerIdsResponse.class, "GetPolicyStatesForPolicyNameAndSignerIdsResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPolicyStatesForPolicyNameAndSignerIdsResponse_Return(), this.getReturnType12(), null, "return", null, 0, 1, GetPolicyStatesForPolicyNameAndSignerIdsResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPolicyStatesForSignerIdsEClass, GetPolicyStatesForSignerIds.class, "GetPolicyStatesForSignerIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetPolicyStatesForSignerIds_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetPolicyStatesForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetPolicyStatesForSignerIds_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, GetPolicyStatesForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetPolicyStatesForSignerIds_UseAliases(), theXMLTypePackage.getBoolean(), "useAliases", null, 1, 1, GetPolicyStatesForSignerIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPolicyStatesForSignerIdsResponseEClass, GetPolicyStatesForSignerIdsResponse.class, "GetPolicyStatesForSignerIdsResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPolicyStatesForSignerIdsResponse_Return(), this.getReturnType13(), null, "return", null, 0, 1, GetPolicyStatesForSignerIdsResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getQCHistoryForConsentEClass, GetQCHistoryForConsent.class, "GetQCHistoryForConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetQCHistoryForConsent_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, GetQCHistoryForConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getQCHistoryForConsentResponseEClass, GetQCHistoryForConsentResponse.class, "GetQCHistoryForConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetQCHistoryForConsentResponse_Return(), this.getReturnType14(), null, "return", null, 0, 1, GetQCHistoryForConsentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getQCProblemHistoryForQCProblemEClass, GetQCProblemHistoryForQCProblem.class, "GetQCProblemHistoryForQCProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetQCProblemHistoryForQCProblem_QcProblem(), this.getQcProblemDTO(), null, "qcProblem", null, 1, 1, GetQCProblemHistoryForQCProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetQCProblemHistoryForQCProblem_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, GetQCProblemHistoryForQCProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getQCProblemHistoryForQCProblemResponseEClass, GetQCProblemHistoryForQCProblemResponse.class, "GetQCProblemHistoryForQCProblemResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetQCProblemHistoryForQCProblemResponse_Return(), this.getReturnType17(), null, "return", null, 0, 1, GetQCProblemHistoryForQCProblemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getSignerIdsForAliasEClass, GetSignerIdsForAlias.class, "GetSignerIdsForAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetSignerIdsForAlias_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetSignerIdsForAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetSignerIdsForAlias_AliasSignerId(), this.getSignerIdDTO(), null, "aliasSignerId", null, 1, 1, GetSignerIdsForAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getSignerIdsForAliasResponseEClass, GetSignerIdsForAliasResponse.class, "GetSignerIdsForAliasResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetSignerIdsForAliasResponse_Return(), this.getReturnType15(), null, "return", null, 0, 1, GetSignerIdsForAliasResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getSignerIdTypeEClass, GetSignerIdType.class, "GetSignerIdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetSignerIdType_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, GetSignerIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetSignerIdType_SignerIdTypeName(), theXMLTypePackage.getString(), "signerIdTypeName", null, 1, 1, GetSignerIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getSignerIdTypeResponseEClass, GetSignerIdTypeResponse.class, "GetSignerIdTypeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetSignerIdTypeResponse_Return(), this.getSignerIdTypeDTO(), null, "return", null, 0, 1, GetSignerIdTypeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTemplatesWithPoliciesEClass, GetTemplatesWithPolicies.class, "GetTemplatesWithPolicies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetTemplatesWithPolicies_PolicyKeyDTOs(), this.getPolicyKeyDTO(), null, "policyKeyDTOs", null, 1, -1, GetTemplatesWithPolicies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTemplatesWithPoliciesResponseEClass, GetTemplatesWithPoliciesResponse.class, "GetTemplatesWithPoliciesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetTemplatesWithPoliciesResponse_Return(), this.getReturnType5(), null, "return", null, 0, 1, GetTemplatesWithPoliciesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashMapEClass, HashMap.class, "HashMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(illegalArgumentExceptionEClass, org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException.class, "IllegalArgumentException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIllegalArgumentException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inconsistentStatusExceptionEClass, InconsistentStatusException.class, "InconsistentStatusException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInconsistentStatusException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, InconsistentStatusException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalExceptionEClass, InternalException.class, "InternalException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, InternalException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidFreeTextExceptionEClass, InvalidFreeTextException.class, "InvalidFreeTextException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvalidFreeTextException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, InvalidFreeTextException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidParameterExceptionEClass, InvalidParameterException.class, "InvalidParameterException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvalidParameterException_ParameterName(), theXMLTypePackage.getString(), "parameterName", null, 0, 1, InvalidParameterException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidParameterException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, InvalidParameterException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidVersionExceptionEClass, InvalidVersionException.class, "InvalidVersionException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvalidVersionException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, InvalidVersionException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedEClass, IsConsented.class, "IsConsented", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsConsented_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, IsConsented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsConsented_PolicyKey(), this.getPolicyKeyDTO(), null, "policyKey", null, 1, 1, IsConsented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsConsented_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, IsConsented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedFromExcludingToExcludingEClass, IsConsentedFromExcludingToExcluding.class, "IsConsentedFromExcludingToExcluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsConsentedFromExcludingToExcluding_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, IsConsentedFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromExcludingToExcluding_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, IsConsentedFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromExcludingToExcluding_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, IsConsentedFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromExcludingToExcluding_VersionFrom(), theXMLTypePackage.getString(), "versionFrom", null, 1, 1, IsConsentedFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromExcludingToExcluding_VersionTo(), theXMLTypePackage.getString(), "versionTo", null, 1, 1, IsConsentedFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsConsentedFromExcludingToExcluding_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, IsConsentedFromExcludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedFromExcludingToExcludingResponseEClass, IsConsentedFromExcludingToExcludingResponse.class, "IsConsentedFromExcludingToExcludingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsConsentedFromExcludingToExcludingResponse_Return(), theXMLTypePackage.getBoolean(), "return", null, 1, 1, IsConsentedFromExcludingToExcludingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedFromExcludingToIncludingEClass, IsConsentedFromExcludingToIncluding.class, "IsConsentedFromExcludingToIncluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsConsentedFromExcludingToIncluding_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, IsConsentedFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromExcludingToIncluding_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, IsConsentedFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromExcludingToIncluding_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, IsConsentedFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromExcludingToIncluding_VersionFrom(), theXMLTypePackage.getString(), "versionFrom", null, 1, 1, IsConsentedFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromExcludingToIncluding_VersionTo(), theXMLTypePackage.getString(), "versionTo", null, 1, 1, IsConsentedFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsConsentedFromExcludingToIncluding_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, IsConsentedFromExcludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedFromExcludingToIncludingResponseEClass, IsConsentedFromExcludingToIncludingResponse.class, "IsConsentedFromExcludingToIncludingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsConsentedFromExcludingToIncludingResponse_Return(), theXMLTypePackage.getBoolean(), "return", null, 1, 1, IsConsentedFromExcludingToIncludingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedFromIncludingToExcludingEClass, IsConsentedFromIncludingToExcluding.class, "IsConsentedFromIncludingToExcluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsConsentedFromIncludingToExcluding_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, IsConsentedFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromIncludingToExcluding_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, IsConsentedFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromIncludingToExcluding_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, IsConsentedFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromIncludingToExcluding_VersionFrom(), theXMLTypePackage.getString(), "versionFrom", null, 1, 1, IsConsentedFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromIncludingToExcluding_VersionTo(), theXMLTypePackage.getString(), "versionTo", null, 1, 1, IsConsentedFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsConsentedFromIncludingToExcluding_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, IsConsentedFromIncludingToExcluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedFromIncludingToExcludingResponseEClass, IsConsentedFromIncludingToExcludingResponse.class, "IsConsentedFromIncludingToExcludingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsConsentedFromIncludingToExcludingResponse_Return(), theXMLTypePackage.getBoolean(), "return", null, 1, 1, IsConsentedFromIncludingToExcludingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedFromIncludingToIncludingEClass, IsConsentedFromIncludingToIncluding.class, "IsConsentedFromIncludingToIncluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsConsentedFromIncludingToIncluding_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, IsConsentedFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromIncludingToIncluding_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, IsConsentedFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromIncludingToIncluding_PolicyName(), theXMLTypePackage.getString(), "policyName", null, 1, 1, IsConsentedFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromIncludingToIncluding_VersionFrom(), theXMLTypePackage.getString(), "versionFrom", null, 1, 1, IsConsentedFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsConsentedFromIncludingToIncluding_VersionTo(), theXMLTypePackage.getString(), "versionTo", null, 1, 1, IsConsentedFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsConsentedFromIncludingToIncluding_Config(), theConfigPackage.getCheckConsentConfig(), null, "config", null, 1, 1, IsConsentedFromIncludingToIncluding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedFromIncludingToIncludingResponseEClass, IsConsentedFromIncludingToIncludingResponse.class, "IsConsentedFromIncludingToIncludingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsConsentedFromIncludingToIncludingResponse_Return(), theXMLTypePackage.getBoolean(), "return", null, 1, 1, IsConsentedFromIncludingToIncludingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isConsentedResponseEClass, IsConsentedResponse.class, "IsConsentedResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsConsentedResponse_Return(), theXMLTypePackage.getBoolean(), "return", null, 1, 1, IsConsentedResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Lang(), theXMLTypePackage.getString(), "lang", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listConsentTemplatesEClass, ListConsentTemplates.class, "ListConsentTemplates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListConsentTemplates_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, ListConsentTemplates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListConsentTemplates_OnlyFinal(), theXMLTypePackage.getBoolean(), "onlyFinal", null, 1, 1, ListConsentTemplates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listConsentTemplatesResponseEClass, ListConsentTemplatesResponse.class, "ListConsentTemplatesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListConsentTemplatesResponse_Return(), this.getReturnType16(), null, "return", null, 0, 1, ListConsentTemplatesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listCurrentConsentTemplatesEClass, ListCurrentConsentTemplates.class, "ListCurrentConsentTemplates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListCurrentConsentTemplates_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, ListCurrentConsentTemplates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listCurrentConsentTemplatesResponseEClass, ListCurrentConsentTemplatesResponse.class, "ListCurrentConsentTemplatesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListCurrentConsentTemplatesResponse_Return(), this.getReturnType4(), null, "return", null, 0, 1, ListCurrentConsentTemplatesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listDomainsEClass, ListDomains.class, "ListDomains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listDomainsResponseEClass, ListDomainsResponse.class, "ListDomainsResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListDomainsResponse_Return(), this.getReturnType(), null, "return", null, 0, 1, ListDomainsResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listModulesEClass, ListModules.class, "ListModules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListModules_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, ListModules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListModules_OnlyFinal(), theXMLTypePackage.getBoolean(), "onlyFinal", null, 1, 1, ListModules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listModulesResponseEClass, ListModulesResponse.class, "ListModulesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListModulesResponse_Return(), this.getReturnType1(), null, "return", null, 0, 1, ListModulesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listPoliciesEClass, ListPolicies.class, "ListPolicies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListPolicies_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, ListPolicies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListPolicies_OnlyFinal(), theXMLTypePackage.getBoolean(), "onlyFinal", null, 1, 1, ListPolicies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listPoliciesResponseEClass, ListPoliciesResponse.class, "ListPoliciesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListPoliciesResponse_Return(), this.getReturnType3(), null, "return", null, 0, 1, ListPoliciesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listSignerIdTypesEClass, ListSignerIdTypes.class, "ListSignerIdTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListSignerIdTypes_DomainName(), theXMLTypePackage.getString(), "domainName", null, 1, 1, ListSignerIdTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listSignerIdTypesResponseEClass, ListSignerIdTypesResponse.class, "ListSignerIdTypesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListSignerIdTypesResponse_Return(), this.getReturnType2(), null, "return", null, 0, 1, ListSignerIdTypesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mandatoryFieldsExceptionEClass, MandatoryFieldsException.class, "MandatoryFieldsException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandatoryFieldsException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, MandatoryFieldsException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missingRequiredObjectExceptionEClass, MissingRequiredObjectException.class, "MissingRequiredObjectException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMissingRequiredObjectException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, MissingRequiredObjectException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleDTOEClass, ModuleDTO.class, "ModuleDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleDTO_AssignedPolicies(), this.getAssignedPolicyDTO(), null, "assignedPolicies", null, 0, -1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_Finalised(), theXMLTypePackage.getBoolean(), "finalised", null, 1, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleDTO_Key(), this.getModuleKeyDTO(), null, "key", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_ShortText(), theXMLTypePackage.getString(), "shortText", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDTO_UpdateDate(), theXMLTypePackage.getDateTime(), "updateDate", null, 0, 1, ModuleDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleExpirationsTypeEClass, ModuleExpirationsType.class, "ModuleExpirationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleExpirationsType_Entry(), this.getEntryType4(), null, "entry", null, 0, -1, ModuleExpirationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleKeyDTOEClass, ModuleKeyDTO.class, "ModuleKeyDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleKeyDTO_DomainName(), theXMLTypePackage.getString(), "domainName", null, 0, 1, ModuleKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleKeyDTO_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ModuleKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleKeyDTO_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ModuleKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleKeyDTOArrayEClass, ModuleKeyDTOArray.class, "ModuleKeyDTOArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleKeyDTOArray_Item(), this.getModuleKeyDTO(), null, "item", null, 0, -1, ModuleKeyDTOArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleStateDTOEClass, ModuleStateDTO.class, "ModuleStateDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleStateDTO_ConsentState(), this.getConsentStatus(), "consentState", null, 0, 1, ModuleStateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleStateDTO_Key(), this.getModuleKeyDTO(), null, "key", null, 0, 1, ModuleStateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleStateDTO_PolicyKeys(), this.getPolicyKeyDTO(), null, "policyKeys", null, 0, -1, ModuleStateDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleStatesTypeEClass, ModuleStatesType.class, "ModuleStatesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleStatesType_Entry(), this.getEntryType1(), null, "entry", null, 0, -1, ModuleStatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyDTOEClass, PolicyDTO.class, "PolicyDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, PolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDTO_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 0, 1, PolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDTO_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, PolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDTO_Finalised(), theXMLTypePackage.getBoolean(), "finalised", null, 1, 1, PolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyDTO_Key(), this.getPolicyKeyDTO(), null, "key", null, 0, 1, PolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDTO_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, PolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDTO_UpdateDate(), theXMLTypePackage.getDateTime(), "updateDate", null, 0, 1, PolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyExpirationsTypeEClass, PolicyExpirationsType.class, "PolicyExpirationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyExpirationsType_Entry(), this.getEntryType(), null, "entry", null, 0, -1, PolicyExpirationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyKeyDTOEClass, PolicyKeyDTO.class, "PolicyKeyDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyKeyDTO_DomainName(), theXMLTypePackage.getString(), "domainName", null, 0, 1, PolicyKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyKeyDTO_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PolicyKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyKeyDTO_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, PolicyKeyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qcdtoEClass, Qcdto.class, "Qcdto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQcdto_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, Qcdto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcdto_Date(), theXMLTypePackage.getDateTime(), "date", null, 0, 1, Qcdto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcdto_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 0, 1, Qcdto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcdto_Inspector(), theXMLTypePackage.getString(), "inspector", null, 0, 1, Qcdto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQcdto_Problems(), this.getQcProblemDTO(), null, "problems", null, 0, -1, Qcdto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcdto_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Qcdto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qcHistoryDTOEClass, QcHistoryDTO.class, "QcHistoryDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQcHistoryDTO_EndDate(), theXMLTypePackage.getDateTime(), "endDate", null, 0, 1, QcHistoryDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcHistoryDTO_StartDate(), theXMLTypePackage.getDateTime(), "startDate", null, 0, 1, QcHistoryDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qcProblemDTOEClass, QcProblemDTO.class, "QcProblemDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQcProblemDTO_CommentExtern(), theXMLTypePackage.getString(), "commentExtern", null, 0, 1, QcProblemDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcProblemDTO_CommentIntern(), theXMLTypePackage.getString(), "commentIntern", null, 0, 1, QcProblemDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcProblemDTO_CreatedAt(), theXMLTypePackage.getDateTime(), "createdAt", null, 0, 1, QcProblemDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcProblemDTO_FormValue(), theXMLTypePackage.getString(), "formValue", null, 0, 1, QcProblemDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcProblemDTO_Ref(), theXMLTypePackage.getString(), "ref", null, 0, 1, QcProblemDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcProblemDTO_ScanValue(), theXMLTypePackage.getString(), "scanValue", null, 0, 1, QcProblemDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcProblemDTO_Status(), this.getQcProblemStatus(), "status", null, 0, 1, QcProblemDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcProblemDTO_UpdatedAt(), theXMLTypePackage.getDateTime(), "updatedAt", null, 0, 1, QcProblemDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qcProblemHistoryDTOEClass, QcProblemHistoryDTO.class, "QcProblemHistoryDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQcProblemHistoryDTO_EndDate(), theXMLTypePackage.getDateTime(), "endDate", null, 0, 1, QcProblemHistoryDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQcProblemHistoryDTO_StartDate(), theXMLTypePackage.getDateTime(), "startDate", null, 0, 1, QcProblemHistoryDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qcProblemTypeEClass, QCProblemType.class, "QCProblemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQCProblemType_Label(), this.getLabel(), null, "label", null, 0, -1, QCProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQCProblemType_Action(), theXMLTypePackage.getIDREF(), "action", null, 0, 1, QCProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQCProblemType_Error(), this.getQcProblemTypeError(), "error", null, 0, 1, QCProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQCProblemType_Field(), this.getQcProblemTypeField(), "field", null, 0, 1, QCProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQCProblemType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, QCProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQCProblemType_Occurrence(), this.getQcProblemTypeOccurrence(), "occurrence", null, 0, 1, QCProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qcProblemTypeActionEClass, QCProblemTypeAction.class, "QCProblemTypeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQCProblemTypeAction_Label(), this.getLabel(), null, "label", null, 0, -1, QCProblemTypeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQCProblemTypeAction_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, QCProblemTypeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qcTypeEClass, QCType.class, "QCType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQCType_Label(), this.getLabel(), null, "label", null, 0, -1, QCType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQCType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, QCType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQCType_Status(), this.getQcTypeStatus(), "status", null, 0, 1, QCType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refuseConsentEClass, RefuseConsent.class, "RefuseConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefuseConsent_ConsentTemplateKey(), this.getConsentTemplateKeyDTO(), null, "consentTemplateKey", null, 1, 1, RefuseConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefuseConsent_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 1, -1, RefuseConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refuseConsentResponseEClass, RefuseConsentResponse.class, "RefuseConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeScanFromConsentEClass, RemoveScanFromConsent.class, "RemoveScanFromConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveScanFromConsent_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, RemoveScanFromConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveScanFromConsent_FhirId(), theXMLTypePackage.getString(), "fhirId", null, 1, 1, RemoveScanFromConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeScanFromConsentResponseEClass, RemoveScanFromConsentResponse.class, "RemoveScanFromConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementsNotFullfilledExceptionEClass, RequirementsNotFullfilledException.class, "RequirementsNotFullfilledException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementsNotFullfilledException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, RequirementsNotFullfilledException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnTypeEClass, ReturnType.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType_Domains(), this.getDomainDTO(), null, "domains", null, 0, -1, ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType1EClass, ReturnType1.class, "ReturnType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType1_Modules(), this.getModuleDTO(), null, "modules", null, 0, -1, ReturnType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType2EClass, ReturnType2.class, "ReturnType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType2_SignerIdTypes(), this.getSignerIdTypeDTO(), null, "signerIdTypes", null, 0, -1, ReturnType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType3EClass, ReturnType3.class, "ReturnType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType3_Policies(), this.getPolicyDTO(), null, "policies", null, 0, -1, ReturnType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType4EClass, ReturnType4.class, "ReturnType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType4_CurrentConsentTemplates(), this.getConsentTemplateDTO(), null, "currentConsentTemplates", null, 0, -1, ReturnType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType5EClass, ReturnType5.class, "ReturnType5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType5_Templates(), this.getConsentTemplateKeyDTO(), null, "templates", null, 0, -1, ReturnType5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType6EClass, ReturnType6.class, "ReturnType6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnType6_ConsentIds(), theXMLTypePackage.getString(), "consentIds", null, 0, -1, ReturnType6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType7EClass, ReturnType7.class, "ReturnType7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType7_Consents(), this.getConsentLightDTO(), null, "consents", null, 0, -1, ReturnType7.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType8EClass, ReturnType8.class, "ReturnType8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType8_Consents(), this.getConsentLightDTO(), null, "consents", null, 0, -1, ReturnType8.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType9EClass, ReturnType9.class, "ReturnType9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType9_SignedPolicies(), this.getSignedPolicyDTO(), null, "signedPolicies", null, 0, -1, ReturnType9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType10EClass, ReturnType10.class, "ReturnType10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType10_Consents(), this.getConsentLightDTO(), null, "consents", null, 0, -1, ReturnType10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType11EClass, ReturnType11.class, "ReturnType11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType11_SignedPolicies(), this.getSignedPolicyDTO(), null, "signedPolicies", null, 0, -1, ReturnType11.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType12EClass, ReturnType12.class, "ReturnType12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType12_SignedPolicies(), this.getSignedPolicyDTO(), null, "signedPolicies", null, 0, -1, ReturnType12.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType13EClass, ReturnType13.class, "ReturnType13", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType13_SignedPolicies(), this.getSignedPolicyDTO(), null, "signedPolicies", null, 0, -1, ReturnType13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType14EClass, ReturnType14.class, "ReturnType14", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType14_QcHistories(), this.getQcHistoryDTO(), null, "qcHistories", null, 0, -1, ReturnType14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType15EClass, ReturnType15.class, "ReturnType15", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType15_SignerIds(), this.getSignerIdDTO(), null, "signerIds", null, 0, -1, ReturnType15.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType16EClass, ReturnType16.class, "ReturnType16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType16_ConsentTemplates(), this.getConsentTemplateDTO(), null, "consentTemplates", null, 0, -1, ReturnType16.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType17EClass, ReturnType17.class, "ReturnType17", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType17_QcProblemHistories(), this.getQcProblemHistoryDTO(), null, "qcProblemHistories", null, 0, -1, ReturnType17.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType18EClass, ReturnType18.class, "ReturnType18", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType18_Templates(), this.getConsentTemplateKeyDTO(), null, "templates", null, 0, -1, ReturnType18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType19EClass, ReturnType19.class, "ReturnType19", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType19_Consents(), this.getConsentLightDTO(), null, "consents", null, 0, -1, ReturnType19.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType20EClass, ReturnType20.class, "ReturnType20", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnType20_SignerIds(), theXMLTypePackage.getString(), "signerIds", null, 0, -1, ReturnType20.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType21EClass, ReturnType21.class, "ReturnType21", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType21_Consents(), this.getConsentLightDTO(), null, "consents", null, 0, -1, ReturnType21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType22EClass, ReturnType22.class, "ReturnType22", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType22_Entry(), this.getEntryType3(), null, "entry", null, 0, -1, ReturnType22.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnType23EClass, ReturnType23.class, "ReturnType23", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType23_Aliases(), this.getSignerIdDTO(), null, "aliases", null, 0, -1, ReturnType23.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setQCForConsentEClass, SetQCForConsent.class, "SetQCForConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetQCForConsent_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, SetQCForConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetQCForConsent_Qc(), this.getQcdto(), null, "qc", null, 1, 1, SetQCForConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setQCForConsentResponseEClass, SetQCForConsentResponse.class, "SetQCForConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signedPolicyDTOEClass, SignedPolicyDTO.class, "SignedPolicyDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignedPolicyDTO_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 0, 1, SignedPolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignedPolicyDTO_PolicyKey(), this.getPolicyKeyDTO(), null, "policyKey", null, 0, 1, SignedPolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignedPolicyDTO_Status(), this.getConsentStatus(), "status", null, 0, 1, SignedPolicyDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signerIdDTOEClass, SignerIdDTO.class, "SignerIdDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignerIdDTO_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 0, 1, SignerIdDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignerIdDTO_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, SignerIdDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignerIdDTO_IdType(), theXMLTypePackage.getString(), "idType", null, 0, 1, SignerIdDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignerIdDTO_OrderNumber(), theXMLTypePackage.getInt(), "orderNumber", null, 1, 1, SignerIdDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signerIdDTOArrayEClass, SignerIdDTOArray.class, "SignerIdDTOArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignerIdDTOArray_Item(), this.getSignerIdDTO(), null, "item", null, 0, -1, SignerIdDTOArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signerIdTypeDTOEClass, SignerIdTypeDTO.class, "SignerIdTypeDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignerIdTypeDTO_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, SignerIdTypeDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignerIdTypeDTO_CreateTimestamp(), theXMLTypePackage.getDateTime(), "createTimestamp", null, 0, 1, SignerIdTypeDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignerIdTypeDTO_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, SignerIdTypeDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignerIdTypeDTO_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SignerIdTypeDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignerIdTypeDTO_UpdateTimestamp(), theXMLTypePackage.getDateTime(), "updateTimestamp", null, 0, 1, SignerIdTypeDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownAliasExceptionEClass, UnknownAliasException.class, "UnknownAliasException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownAliasException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownAliasException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownConsentExceptionEClass, UnknownConsentException.class, "UnknownConsentException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownConsentException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownConsentException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownConsentTemplateExceptionEClass, UnknownConsentTemplateException.class, "UnknownConsentTemplateException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownConsentTemplateException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownConsentTemplateException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownDomainExceptionEClass, UnknownDomainException.class, "UnknownDomainException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownDomainException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownDomainException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownFhirIdObjectExceptionEClass, UnknownFhirIdObjectException.class, "UnknownFhirIdObjectException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownFhirIdObjectException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownFhirIdObjectException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownIDExceptionEClass, UnknownIDException.class, "UnknownIDException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownIDException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownIDException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownModuleExceptionEClass, UnknownModuleException.class, "UnknownModuleException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownModuleException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownModuleException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownPolicyExceptionEClass, UnknownPolicyException.class, "UnknownPolicyException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownPolicyException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownPolicyException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownSignerIdExceptionEClass, UnknownSignerIdException.class, "UnknownSignerIdException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownSignerIdException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownSignerIdException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownSignerIdTypeExceptionEClass, UnknownSignerIdTypeException.class, "UnknownSignerIdTypeException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownSignerIdTypeException_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, UnknownSignerIdTypeException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateConsentInUseEClass, UpdateConsentInUse.class, "UpdateConsentInUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateConsentInUse_ConsentKey(), this.getConsentKeyDTO(), null, "consentKey", null, 1, 1, UpdateConsentInUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateConsentInUse_ExternProperties(), theXMLTypePackage.getString(), "externProperties", null, 1, 1, UpdateConsentInUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateConsentInUse_Comment(), theXMLTypePackage.getString(), "comment", null, 1, 1, UpdateConsentInUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateConsentInUse_Scan(), this.getConsentScanDTO(), null, "scan", null, 1, 1, UpdateConsentInUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateConsentInUseResponseEClass, UpdateConsentInUseResponse.class, "UpdateConsentInUseResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validateConsentEClass, ValidateConsent.class, "ValidateConsent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidateConsent_Consent(), this.getConsentDTO(), null, "consent", null, 1, 1, ValidateConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidateConsent_AllowRevoke(), theXMLTypePackage.getBoolean(), "allowRevoke", null, 1, 1, ValidateConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidateConsent_ValidateScan(), theXMLTypePackage.getBoolean(), "validateScan", null, 1, 1, ValidateConsent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validateConsentResponseEClass, ValidateConsentResponse.class, "ValidateConsentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validFromPropertiesDTOEClass, ValidFromPropertiesDTO.class, "ValidFromPropertiesDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidFromPropertiesDTO_FixedValidFromDate(), theXMLTypePackage.getDateTime(), "fixedValidFromDate", null, 0, 1, ValidFromPropertiesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidFromPropertiesDTO_InvalidPeriod(), theXMLTypePackage.getString(), "invalidPeriod", null, 0, 1, ValidFromPropertiesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(consentStatusEEnum, ConsentStatus.class, "ConsentStatus");
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.ACCEPTED);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.DECLINED);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.UNKNOWN);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.NOTASKED);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.NOTCHOSEN);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.WITHDRAWN);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.INVALIDATED);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.REFUSED);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.EXPIRED);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.OBJECTED);
		addEEnumLiteral(consentStatusEEnum, ConsentStatus.ACCEPTEDOPTOUT);

		initEEnum(consentStatusTypeEEnum, ConsentStatusType.class, "ConsentStatusType");
		addEEnumLiteral(consentStatusTypeEEnum, ConsentStatusType.ACCEPTED);
		addEEnumLiteral(consentStatusTypeEEnum, ConsentStatusType.DECLINED);
		addEEnumLiteral(consentStatusTypeEEnum, ConsentStatusType.UNKNOWN);

		initEEnum(consentTemplateTypeEEnum, ConsentTemplateType.class, "ConsentTemplateType");
		addEEnumLiteral(consentTemplateTypeEEnum, ConsentTemplateType.CONSENT);
		addEEnumLiteral(consentTemplateTypeEEnum, ConsentTemplateType.CONSENTOPTOUT);
		addEEnumLiteral(consentTemplateTypeEEnum, ConsentTemplateType.REVOCATION);
		addEEnumLiteral(consentTemplateTypeEEnum, ConsentTemplateType.OBJECTION);
		addEEnumLiteral(consentTemplateTypeEEnum, ConsentTemplateType.REFUSAL);

		initEEnum(freeTextTypeEEnum, FreeTextType.class, "FreeTextType");
		addEEnumLiteral(freeTextTypeEEnum, FreeTextType.STRING);
		addEEnumLiteral(freeTextTypeEEnum, FreeTextType.DATE);
		addEEnumLiteral(freeTextTypeEEnum, FreeTextType.INTEGER);
		addEEnumLiteral(freeTextTypeEEnum, FreeTextType.DOUBLE);
		addEEnumLiteral(freeTextTypeEEnum, FreeTextType.BOOLEAN);

		initEEnum(qcProblemStatusEEnum, QcProblemStatus.class, "QcProblemStatus");
		addEEnumLiteral(qcProblemStatusEEnum, QcProblemStatus.OPENEXTERN);
		addEEnumLiteral(qcProblemStatusEEnum, QcProblemStatus.OPENINTERN);
		addEEnumLiteral(qcProblemStatusEEnum, QcProblemStatus.CANCELEDEXTERN);
		addEEnumLiteral(qcProblemStatusEEnum, QcProblemStatus.CANCELEDINTERN);
		addEEnumLiteral(qcProblemStatusEEnum, QcProblemStatus.CLOSEDEXTERN);
		addEEnumLiteral(qcProblemStatusEEnum, QcProblemStatus.CLOSEDINTERN);
		addEEnumLiteral(qcProblemStatusEEnum, QcProblemStatus.DELETEDINTERN);

		initEEnum(qcProblemTypeErrorEEnum, QcProblemTypeError.class, "QcProblemTypeError");
		addEEnumLiteral(qcProblemTypeErrorEEnum, QcProblemTypeError.MISSING);
		addEEnumLiteral(qcProblemTypeErrorEEnum, QcProblemTypeError.MISSINGPART);
		addEEnumLiteral(qcProblemTypeErrorEEnum, QcProblemTypeError.ILLEGIBLE);
		addEEnumLiteral(qcProblemTypeErrorEEnum, QcProblemTypeError.WRONGPARTICIPANT);
		addEEnumLiteral(qcProblemTypeErrorEEnum, QcProblemTypeError.INCONSISTENT);
		addEEnumLiteral(qcProblemTypeErrorEEnum, QcProblemTypeError.IMPLAUSIBLE);
		addEEnumLiteral(qcProblemTypeErrorEEnum, QcProblemTypeError.OTHER);

		initEEnum(qcProblemTypeFieldEEnum, QcProblemTypeField.class, "QcProblemTypeField");
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.TEMPLATENAME);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.TEMPLATEVERSION);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.MODULESTATUS);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNERIDVALUE);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNATUREPARTICIPANTLOCATION);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNATUREPARTICIPANTDATE);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNATUREPARTICIPANTDIGITAL);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNATUREPARTICIPANTPAPER);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNATUREPHYSICIANLOCATION);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNATUREPHYSICIANDATE);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNATUREPHYSICIANDIGITAL);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SIGNATUREPHYSICIANPAPER);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.IDATFIRSTNAME);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.IDATLASTNAME);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.IDATBIRTHDATE);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.IDATGENDER);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.IDATBIRTHPLACE);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.IDATOTHER);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.SCAN);
		addEEnumLiteral(qcProblemTypeFieldEEnum, QcProblemTypeField.OTHER);

		initEEnum(qcProblemTypeOccurrenceEEnum, QcProblemTypeOccurrence.class, "QcProblemTypeOccurrence");
		addEEnumLiteral(qcProblemTypeOccurrenceEEnum, QcProblemTypeOccurrence.PAPER);
		addEEnumLiteral(qcProblemTypeOccurrenceEEnum, QcProblemTypeOccurrence.DIGITAL);
		addEEnumLiteral(qcProblemTypeOccurrenceEEnum, QcProblemTypeOccurrence.BOTH);

		initEEnum(qcTypeStatusEEnum, QcTypeStatus.class, "QcTypeStatus");
		addEEnumLiteral(qcTypeStatusEEnum, QcTypeStatus.VALID);
		addEEnumLiteral(qcTypeStatusEEnum, QcTypeStatus.INVALID);

		// Initialize data types
		initEDataType(consentStatusObjectEDataType, ConsentStatus.class, "ConsentStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(consentStatusTypeObjectEDataType, ConsentStatusType.class, "ConsentStatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(consentTemplateTypeObjectEDataType, ConsentTemplateType.class, "ConsentTemplateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(freeTextTypeObjectEDataType, FreeTextType.class, "FreeTextTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qcProblemStatusObjectEDataType, QcProblemStatus.class, "QcProblemStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qcProblemTypeErrorObjectEDataType, QcProblemTypeError.class, "QcProblemTypeErrorObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qcProblemTypeFieldObjectEDataType, QcProblemTypeField.class, "QcProblemTypeFieldObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qcProblemTypeOccurrenceObjectEDataType, QcProblemTypeOccurrence.class, "QcProblemTypeOccurrenceObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qcTypeStatusObjectEDataType, QcTypeStatus.class, "QcTypeStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (abstractMapEClass,
		   source,
		   new String[] {
			   "name", "abstractMap",
			   "kind", "empty"
		   });
		addAnnotation
		  (addAliasEClass,
		   source,
		   new String[] {
			   "name", "addAlias",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddAlias_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getAddAlias_OriginalSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "originalSignerId"
		   });
		addAnnotation
		  (getAddAlias_AliasSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aliasSignerId"
		   });
		addAnnotation
		  (addAliasResponseEClass,
		   source,
		   new String[] {
			   "name", "addAliasResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (addConsentEClass,
		   source,
		   new String[] {
			   "name", "addConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddConsent_Consent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consent"
		   });
		addAnnotation
		  (addConsentOptOutEClass,
		   source,
		   new String[] {
			   "name", "addConsentOptOut",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddConsentOptOut_ConsentTemplateKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentTemplateKey"
		   });
		addAnnotation
		  (getAddConsentOptOut_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (addConsentOptOutResponseEClass,
		   source,
		   new String[] {
			   "name", "addConsentOptOutResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddConsentOptOutResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (addConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "addConsentResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (addScanToConsentEClass,
		   source,
		   new String[] {
			   "name", "addScanToConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddScanToConsent_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getAddScanToConsent_ScanBase64(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scanBase64"
		   });
		addAnnotation
		  (getAddScanToConsent_FileType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fileType"
		   });
		addAnnotation
		  (getAddScanToConsent_FileName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fileName"
		   });
		addAnnotation
		  (addScanToConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "addScanToConsentResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (addSignerIdToConsentEClass,
		   source,
		   new String[] {
			   "name", "addSignerIdToConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddSignerIdToConsent_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getAddSignerIdToConsent_SignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerId"
		   });
		addAnnotation
		  (addSignerIdToConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "addSignerIdToConsentResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (addSignerIdToSignerIdEClass,
		   source,
		   new String[] {
			   "name", "addSignerIdToSignerId",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddSignerIdToSignerId_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getAddSignerIdToSignerId_ExistentSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "existentSignerId"
		   });
		addAnnotation
		  (getAddSignerIdToSignerId_NewSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "newSignerId"
		   });
		addAnnotation
		  (addSignerIdToSignerIdResponseEClass,
		   source,
		   new String[] {
			   "name", "addSignerIdToSignerIdResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (assignedModuleDTOEClass,
		   source,
		   new String[] {
			   "name", "assignedModuleDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAssignedModuleDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getAssignedModuleDTO_DefaultConsentStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "defaultConsentStatus"
		   });
		addAnnotation
		  (getAssignedModuleDTO_DisplayCheckboxes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "displayCheckboxes"
		   });
		addAnnotation
		  (getAssignedModuleDTO_ExpirationProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expirationProperties"
		   });
		addAnnotation
		  (getAssignedModuleDTO_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getAssignedModuleDTO_Mandatory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mandatory"
		   });
		addAnnotation
		  (getAssignedModuleDTO_Module(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "module"
		   });
		addAnnotation
		  (getAssignedModuleDTO_OrderNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "orderNumber"
		   });
		addAnnotation
		  (getAssignedModuleDTO_Parent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parent"
		   });
		addAnnotation
		  (assignedPolicyDTOEClass,
		   source,
		   new String[] {
			   "name", "assignedPolicyDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAssignedPolicyDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getAssignedPolicyDTO_ExpirationProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expirationProperties"
		   });
		addAnnotation
		  (getAssignedPolicyDTO_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getAssignedPolicyDTO_Policy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policy"
		   });
		addAnnotation
		  (childrenTypeEClass,
		   source,
		   new String[] {
			   "name", "children_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChildrenType_Entry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entry"
		   });
		addAnnotation
		  (consentDateValuesDTOEClass,
		   source,
		   new String[] {
			   "name", "consentDateValuesDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsentDateValuesDTO_ConsentExpirationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentExpirationDate"
		   });
		addAnnotation
		  (getConsentDateValuesDTO_GicsConsentDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gicsConsentDate"
		   });
		addAnnotation
		  (getConsentDateValuesDTO_LegalConsentDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "legalConsentDate"
		   });
		addAnnotation
		  (getConsentDateValuesDTO_MaxPolicyExpirationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maxPolicyExpirationDate"
		   });
		addAnnotation
		  (getConsentDateValuesDTO_ModuleExpirations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleExpirations"
		   });
		addAnnotation
		  (getConsentDateValuesDTO_PolicyExpirations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyExpirations"
		   });
		addAnnotation
		  (consentDTOEClass,
		   source,
		   new String[] {
			   "name", "consentDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsentDTO_FreeTextVals(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "freeTextVals"
		   });
		addAnnotation
		  (getConsentDTO_PatientSignatureBase64(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "patientSignatureBase64"
		   });
		addAnnotation
		  (getConsentDTO_PhysicianSignatureBase64(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "physicianSignatureBase64"
		   });
		addAnnotation
		  (getConsentDTO_Scans(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scans"
		   });
		addAnnotation
		  (consentKeyDTOEClass,
		   source,
		   new String[] {
			   "name", "consentKeyDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsentKeyDTO_ConsentDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentDate"
		   });
		addAnnotation
		  (getConsentKeyDTO_ConsentTemplateKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentTemplateKey"
		   });
		addAnnotation
		  (getConsentKeyDTO_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (consentLightDTOEClass,
		   source,
		   new String[] {
			   "name", "consentLightDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsentLightDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getConsentLightDTO_ConsentDates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentDates"
		   });
		addAnnotation
		  (getConsentLightDTO_CreationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creationDate"
		   });
		addAnnotation
		  (getConsentLightDTO_ExpirationProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expirationProperties"
		   });
		addAnnotation
		  (getConsentLightDTO_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getConsentLightDTO_HasPatientSignature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPatientSignature"
		   });
		addAnnotation
		  (getConsentLightDTO_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getConsentLightDTO_ModuleStates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleStates"
		   });
		addAnnotation
		  (getConsentLightDTO_PatientSignatureIsFromGuardian(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "patientSignatureIsFromGuardian"
		   });
		addAnnotation
		  (getConsentLightDTO_PatientSigningDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "patientSigningDate"
		   });
		addAnnotation
		  (getConsentLightDTO_PatientSigningPlace(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "patientSigningPlace"
		   });
		addAnnotation
		  (getConsentLightDTO_PhysicianId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "physicianId"
		   });
		addAnnotation
		  (getConsentLightDTO_PhysicianSigningDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "physicianSigningDate"
		   });
		addAnnotation
		  (getConsentLightDTO_PhysicianSigningPlace(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "physicianSigningPlace"
		   });
		addAnnotation
		  (getConsentLightDTO_QualityControl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qualityControl"
		   });
		addAnnotation
		  (getConsentLightDTO_TemplateType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templateType"
		   });
		addAnnotation
		  (getConsentLightDTO_UpdateDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateDate"
		   });
		addAnnotation
		  (getConsentLightDTO_ValidFromDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validFromDate"
		   });
		addAnnotation
		  (getConsentLightDTO_ValidFromProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validFromProperties"
		   });
		addAnnotation
		  (consentScanDTOEClass,
		   source,
		   new String[] {
			   "name", "consentScanDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsentScanDTO_Base64(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "base64"
		   });
		addAnnotation
		  (getConsentScanDTO_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getConsentScanDTO_FileName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fileName"
		   });
		addAnnotation
		  (getConsentScanDTO_FileType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fileType"
		   });
		addAnnotation
		  (getConsentScanDTO_UploadDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "uploadDate"
		   });
		addAnnotation
		  (consentStatusEEnum,
		   source,
		   new String[] {
			   "name", "consentStatus"
		   });
		addAnnotation
		  (consentStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "consentStatus:Object",
			   "baseType", "consentStatus"
		   });
		addAnnotation
		  (consentStatusTypeEEnum,
		   source,
		   new String[] {
			   "name", "consentStatusType"
		   });
		addAnnotation
		  (consentStatusTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "consentStatusType:Object",
			   "baseType", "consentStatusType"
		   });
		addAnnotation
		  (consentTemplateDTOEClass,
		   source,
		   new String[] {
			   "name", "consentTemplateDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsentTemplateDTO_AssignedModules(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "assignedModules"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getConsentTemplateDTO_CreationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creationDate"
		   });
		addAnnotation
		  (getConsentTemplateDTO_ExpirationProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expirationProperties"
		   });
		addAnnotation
		  (getConsentTemplateDTO_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Finalised(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "finalised"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Footer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "footer"
		   });
		addAnnotation
		  (getConsentTemplateDTO_FreeTextDefs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "freeTextDefs"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Header(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "header"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getConsentTemplateDTO_MappedConsentTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mappedConsentTemplates"
		   });
		addAnnotation
		  (getConsentTemplateDTO_MappedObjectionTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mappedObjectionTemplates"
		   });
		addAnnotation
		  (getConsentTemplateDTO_MappedOptOutConsentTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mappedOptOutConsentTemplates"
		   });
		addAnnotation
		  (getConsentTemplateDTO_MappedRefusalTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mappedRefusalTemplates"
		   });
		addAnnotation
		  (getConsentTemplateDTO_MappedRevocationTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mappedRevocationTemplates"
		   });
		addAnnotation
		  (getConsentTemplateDTO_ScanBase64(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scanBase64"
		   });
		addAnnotation
		  (getConsentTemplateDTO_ScanFileType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scanFileType"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Structure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "structure"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title"
		   });
		addAnnotation
		  (getConsentTemplateDTO_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type"
		   });
		addAnnotation
		  (getConsentTemplateDTO_UpdateDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateDate"
		   });
		addAnnotation
		  (getConsentTemplateDTO_ValidFromProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validFromProperties"
		   });
		addAnnotation
		  (getConsentTemplateDTO_VersionLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionLabel"
		   });
		addAnnotation
		  (consentTemplateKeyDTOEClass,
		   source,
		   new String[] {
			   "name", "consentTemplateKeyDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsentTemplateKeyDTO_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getConsentTemplateKeyDTO_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name"
		   });
		addAnnotation
		  (getConsentTemplateKeyDTO_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "version"
		   });
		addAnnotation
		  (consentTemplateStructureDTOEClass,
		   source,
		   new String[] {
			   "name", "consentTemplateStructureDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsentTemplateStructureDTO_Children(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "children"
		   });
		addAnnotation
		  (getConsentTemplateStructureDTO_FirstLevelModules(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "firstLevelModules"
		   });
		addAnnotation
		  (consentTemplateTypeEEnum,
		   source,
		   new String[] {
			   "name", "consentTemplateType"
		   });
		addAnnotation
		  (consentTemplateTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "consentTemplateType:Object",
			   "baseType", "consentTemplateType"
		   });
		addAnnotation
		  (countConsentsForDomainWithFilterEClass,
		   source,
		   new String[] {
			   "name", "countConsentsForDomainWithFilter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCountConsentsForDomainWithFilter_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getCountConsentsForDomainWithFilter_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (countConsentsForDomainWithFilterResponseEClass,
		   source,
		   new String[] {
			   "name", "countConsentsForDomainWithFilterResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCountConsentsForDomainWithFilterResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (countSignedPoliciesEClass,
		   source,
		   new String[] {
			   "name", "countSignedPolicies",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCountSignedPolicies_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (countSignedPoliciesResponseEClass,
		   source,
		   new String[] {
			   "name", "countSignedPoliciesResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCountSignedPoliciesResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (deactivateAliasEClass,
		   source,
		   new String[] {
			   "name", "deactivateAlias",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeactivateAlias_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getDeactivateAlias_OriginalSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "originalSignerId"
		   });
		addAnnotation
		  (getDeactivateAlias_AliasSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aliasSignerId"
		   });
		addAnnotation
		  (deactivateAliasResponseEClass,
		   source,
		   new String[] {
			   "name", "deactivateAliasResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_AddAlias(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addAlias",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddAliasResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addAliasResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddConsentOptOut(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addConsentOptOut",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddConsentOptOutResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addConsentOptOutResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddScanToConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addScanToConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddScanToConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addScanToConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddSignerIdToConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addSignerIdToConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddSignerIdToConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addSignerIdToConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddSignerIdToSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addSignerIdToSignerId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddSignerIdToSignerIdResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "addSignerIdToSignerIdResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CountConsentsForDomainWithFilter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "countConsentsForDomainWithFilter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CountConsentsForDomainWithFilterResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "countConsentsForDomainWithFilterResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CountSignedPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "countSignedPolicies",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CountSignedPoliciesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "countSignedPoliciesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DeactivateAlias(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deactivateAlias",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DeactivateAliasResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deactivateAliasResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DuplicateEntryException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DuplicateEntryException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAliasesForSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAliasesForSignerId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAliasesForSignerIdResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAliasesForSignerIdResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAliasesForSignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAliasesForSignerIds",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAliasesForSignerIdsResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAliasesForSignerIdsResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentedIdsFor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentedIdsFor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentedIdsForResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentedIdsForResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentsForConsentTemplate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentsForConsentTemplate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentsForConsentTemplateResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentsForConsentTemplateResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentsForDomain(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentsForDomain",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentsForDomainResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentsForDomainResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentsForDomainWithoutScan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentsForDomainWithoutScan",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentsForDomainWithoutScanResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentsForDomainWithoutScanResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentsForSignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentsForSignerIds",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllConsentsForSignerIdsResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllConsentsForSignerIdsResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllIdsForSignerIdType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllIdsForSignerIdType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetAllIdsForSignerIdTypeResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getAllIdsForSignerIdTypeResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentDates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentDates",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentDatesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentDatesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentLight(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentLight",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentLightResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentLightResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentsForDomainPaginated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentsForDomainPaginated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentsForDomainPaginatedResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentsForDomainPaginatedResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeFromExcludingToExcluding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeFromExcludingToExcluding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeFromExcludingToExcludingResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeFromExcludingToExcludingResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeFromExcludingToIncluding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeFromExcludingToIncluding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeFromExcludingToIncludingResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeFromExcludingToIncludingResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeFromIncludingToExcluding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeFromIncludingToExcluding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeFromIncludingToExcludingResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeFromIncludingToExcludingResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeFromIncludingToIncluding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeFromIncludingToIncluding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeFromIncludingToIncludingResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeFromIncludingToIncludingResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentStatusTypeResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentStatusTypeResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentTemplate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentTemplate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConsentTemplateResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConsentTemplateResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCurrentConsentForSignerIdsAndCT(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getCurrentConsentForSignerIdsAndCT",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCurrentConsentForSignerIdsAndCTResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getCurrentConsentForSignerIdsAndCTResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCurrentConsentTemplate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getCurrentConsentTemplate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCurrentConsentTemplateResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getCurrentConsentTemplateResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCurrentPolicyStatesForSignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getCurrentPolicyStatesForSignerIds",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCurrentPolicyStatesForSignerIdsResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getCurrentPolicyStatesForSignerIdsResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetDomain(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getDomain",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetDomainResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getDomainResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetMappedTemplatesForSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getMappedTemplatesForSignerId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetMappedTemplatesForSignerIdResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getMappedTemplatesForSignerIdResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetModule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getModule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetModuleResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getModuleResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetObjectByFhirID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getObjectByFhirID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetObjectByFhirIDResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getObjectByFhirIDResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getPolicy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetPolicyResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getPolicyResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetPolicyStatesForPolicyAndSignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getPolicyStatesForPolicyAndSignerIds",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetPolicyStatesForPolicyAndSignerIdsResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getPolicyStatesForPolicyAndSignerIdsResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getPolicyStatesForPolicyNameAndSignerIds",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIdsResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getPolicyStatesForPolicyNameAndSignerIdsResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetPolicyStatesForSignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getPolicyStatesForSignerIds",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetPolicyStatesForSignerIdsResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getPolicyStatesForSignerIdsResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetQCHistoryForConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getQCHistoryForConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetQCHistoryForConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getQCHistoryForConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetQCProblemHistoryForQCProblem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getQCProblemHistoryForQCProblem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetQCProblemHistoryForQCProblemResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getQCProblemHistoryForQCProblemResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetSignerIdsForAlias(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getSignerIdsForAlias",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetSignerIdsForAliasResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getSignerIdsForAliasResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetSignerIdType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getSignerIdType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetSignerIdTypeResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getSignerIdTypeResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetTemplatesWithPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getTemplatesWithPolicies",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetTemplatesWithPoliciesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getTemplatesWithPoliciesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IllegalArgumentException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IllegalArgumentException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InconsistentStatusException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InconsistentStatusException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InternalException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InternalException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InvalidFreeTextException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvalidFreeTextException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InvalidParameterException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvalidParameterException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InvalidVersionException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvalidVersionException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsented(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsented",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedFromExcludingToExcluding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedFromExcludingToExcluding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedFromExcludingToExcludingResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedFromExcludingToExcludingResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedFromExcludingToIncluding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedFromExcludingToIncluding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedFromExcludingToIncludingResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedFromExcludingToIncludingResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedFromIncludingToExcluding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedFromIncludingToExcluding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedFromIncludingToExcludingResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedFromIncludingToExcludingResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedFromIncludingToIncluding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedFromIncludingToIncluding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedFromIncludingToIncludingResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedFromIncludingToIncludingResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsConsentedResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isConsentedResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListConsentTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listConsentTemplates",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListConsentTemplatesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listConsentTemplatesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListCurrentConsentTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listCurrentConsentTemplates",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListCurrentConsentTemplatesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listCurrentConsentTemplatesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListDomains(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listDomains",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListDomainsResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listDomainsResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListModules(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listModules",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListModulesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listModulesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listPolicies",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListPoliciesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listPoliciesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListSignerIdTypes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listSignerIdTypes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ListSignerIdTypesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listSignerIdTypesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MandatoryFieldsException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MandatoryFieldsException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MissingRequiredObjectException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MissingRequiredObjectException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RefuseConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "refuseConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RefuseConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "refuseConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RemoveScanFromConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "removeScanFromConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RemoveScanFromConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "removeScanFromConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RequirementsNotFullfilledException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RequirementsNotFullfilledException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SetQCForConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "setQCForConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SetQCForConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "setQCForConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownAliasException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownAliasException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownConsentException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownConsentException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownConsentTemplateException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownConsentTemplateException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownDomainException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownDomainException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownFhirIdObjectException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownFhirIdObjectException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownIDException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownIDException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownModuleException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownModuleException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownPolicyException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownPolicyException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownSignerIdException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownSignerIdException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnknownSignerIdTypeException(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownSignerIdTypeException",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UpdateConsentInUse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateConsentInUse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UpdateConsentInUseResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateConsentInUseResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ValidateConsent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validateConsent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ValidateConsentResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validateConsentResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (domainDTOEClass,
		   source,
		   new String[] {
			   "name", "domainDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDomainDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getDomainDTO_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getDomainDTO_CreationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creationDate"
		   });
		addAnnotation
		  (getDomainDTO_CtVersionConverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ctVersionConverter"
		   });
		addAnnotation
		  (getDomainDTO_ExpirationProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expirationProperties"
		   });
		addAnnotation
		  (getDomainDTO_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getDomainDTO_Finalised(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "finalised"
		   });
		addAnnotation
		  (getDomainDTO_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getDomainDTO_Logo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logo"
		   });
		addAnnotation
		  (getDomainDTO_ModuleVersionConverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleVersionConverter"
		   });
		addAnnotation
		  (getDomainDTO_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name"
		   });
		addAnnotation
		  (getDomainDTO_PolicyVersionConverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyVersionConverter"
		   });
		addAnnotation
		  (getDomainDTO_SignerIdTypes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIdTypes"
		   });
		addAnnotation
		  (getDomainDTO_UpdateDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateDate"
		   });
		addAnnotation
		  (duplicateEntryExceptionEClass,
		   source,
		   new String[] {
			   "name", "DuplicateEntryException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDuplicateEntryException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (entryTypeEClass,
		   source,
		   new String[] {
			   "name", "entry_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntryType_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getEntryType_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value"
		   });
		addAnnotation
		  (entryType1EClass,
		   source,
		   new String[] {
			   "name", "entry_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntryType1_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getEntryType1_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value"
		   });
		addAnnotation
		  (entryType2EClass,
		   source,
		   new String[] {
			   "name", "entry_._2_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntryType2_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getEntryType2_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value"
		   });
		addAnnotation
		  (entryType3EClass,
		   source,
		   new String[] {
			   "name", "entry_._3_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntryType3_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getEntryType3_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value"
		   });
		addAnnotation
		  (entryType4EClass,
		   source,
		   new String[] {
			   "name", "entry_._4_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntryType4_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getEntryType4_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value"
		   });
		addAnnotation
		  (expirationPropertiesDTOEClass,
		   source,
		   new String[] {
			   "name", "expirationPropertiesDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExpirationPropertiesDTO_FixedExpirationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fixedExpirationDate"
		   });
		addAnnotation
		  (getExpirationPropertiesDTO_ValidPeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validPeriod"
		   });
		addAnnotation
		  (fhirIdDTOEClass,
		   source,
		   new String[] {
			   "name", "fhirIdDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFhirIdDTO_FhirID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fhirID"
		   });
		addAnnotation
		  (freeTextDefDTOEClass,
		   source,
		   new String[] {
			   "name", "freeTextDefDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFreeTextDefDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getFreeTextDefDTO_ConverterString(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "converterString"
		   });
		addAnnotation
		  (getFreeTextDefDTO_CreationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creationDate"
		   });
		addAnnotation
		  (getFreeTextDefDTO_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getFreeTextDefDTO_Finalised(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "finalised"
		   });
		addAnnotation
		  (getFreeTextDefDTO_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getFreeTextDefDTO_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name"
		   });
		addAnnotation
		  (getFreeTextDefDTO_Pos(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pos"
		   });
		addAnnotation
		  (getFreeTextDefDTO_Required(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "required"
		   });
		addAnnotation
		  (getFreeTextDefDTO_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type"
		   });
		addAnnotation
		  (getFreeTextDefDTO_UpdateDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateDate"
		   });
		addAnnotation
		  (freeTextTypeEEnum,
		   source,
		   new String[] {
			   "name", "freeTextType"
		   });
		addAnnotation
		  (freeTextTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "freeTextType:Object",
			   "baseType", "freeTextType"
		   });
		addAnnotation
		  (freeTextValDTOEClass,
		   source,
		   new String[] {
			   "name", "freeTextValDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFreeTextValDTO_FreeTextDefName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "freeTextDefName"
		   });
		addAnnotation
		  (getFreeTextValDTO_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value"
		   });
		addAnnotation
		  (getAliasesForSignerIdEClass,
		   source,
		   new String[] {
			   "name", "getAliasesForSignerId",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAliasesForSignerId_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetAliasesForSignerId_OriginalSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "originalSignerId"
		   });
		addAnnotation
		  (getAliasesForSignerIdResponseEClass,
		   source,
		   new String[] {
			   "name", "getAliasesForSignerIdResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAliasesForSignerIdResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getAliasesForSignerIdsEClass,
		   source,
		   new String[] {
			   "name", "getAliasesForSignerIds",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAliasesForSignerIds_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetAliasesForSignerIds_OriginalSignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "originalSignerIds"
		   });
		addAnnotation
		  (getAliasesForSignerIdsResponseEClass,
		   source,
		   new String[] {
			   "name", "getAliasesForSignerIdsResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAliasesForSignerIdsResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getAllConsentedIdsForEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentedIdsFor",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentedIdsFor_SignerIdTypeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIdTypeName"
		   });
		addAnnotation
		  (getGetAllConsentedIdsFor_PolicyKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyKey"
		   });
		addAnnotation
		  (getGetAllConsentedIdsFor_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getAllConsentedIdsForResponseEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentedIdsForResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentedIdsForResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getAllConsentsForConsentTemplateEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentsForConsentTemplate",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentsForConsentTemplate_ConsentTemplateKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentTemplateKey"
		   });
		addAnnotation
		  (getAllConsentsForConsentTemplateResponseEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentsForConsentTemplateResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentsForConsentTemplateResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getAllConsentsForDomainEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentsForDomain",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentsForDomain_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getAllConsentsForDomainResponseEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentsForDomainResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentsForDomainResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getAllConsentsForDomainWithoutScanEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentsForDomainWithoutScan",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentsForDomainWithoutScan_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getAllConsentsForDomainWithoutScanResponseEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentsForDomainWithoutScanResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentsForDomainWithoutScanResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getAllConsentsForSignerIdsEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentsForSignerIds",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentsForSignerIds_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetAllConsentsForSignerIds_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetAllConsentsForSignerIds_UseAliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useAliases"
		   });
		addAnnotation
		  (getAllConsentsForSignerIdsResponseEClass,
		   source,
		   new String[] {
			   "name", "getAllConsentsForSignerIdsResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllConsentsForSignerIdsResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getAllIdsForSignerIdTypeEClass,
		   source,
		   new String[] {
			   "name", "getAllIdsForSignerIdType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllIdsForSignerIdType_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetAllIdsForSignerIdType_SignerIdTypeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIdTypeName"
		   });
		addAnnotation
		  (getAllIdsForSignerIdTypeResponseEClass,
		   source,
		   new String[] {
			   "name", "getAllIdsForSignerIdTypeResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetAllIdsForSignerIdTypeResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentEClass,
		   source,
		   new String[] {
			   "name", "getConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsent_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getConsentDatesEClass,
		   source,
		   new String[] {
			   "name", "getConsentDates",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentDates_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getConsentDatesResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentDatesResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentDatesResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentLightEClass,
		   source,
		   new String[] {
			   "name", "getConsentLight",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentLight_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getConsentLightResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentLightResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentLightResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentsForDomainPaginatedEClass,
		   source,
		   new String[] {
			   "name", "getConsentsForDomainPaginated",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentsForDomainPaginated_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetConsentsForDomainPaginated_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getConsentsForDomainPaginatedResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentsForDomainPaginatedResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentsForDomainPaginatedResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentStatusTypeEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusType_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetConsentStatusType_PolicyKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyKey"
		   });
		addAnnotation
		  (getGetConsentStatusType_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getConsentStatusTypeFromExcludingToExcludingEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeFromExcludingToExcluding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToExcluding_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToExcluding_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToExcluding_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToExcluding_VersionFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionFrom"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToExcluding_VersionTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionTo"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToExcluding_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getConsentStatusTypeFromExcludingToExcludingResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeFromExcludingToExcludingResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToExcludingResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentStatusTypeFromExcludingToIncludingEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeFromExcludingToIncluding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToIncluding_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToIncluding_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToIncluding_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToIncluding_VersionFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionFrom"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToIncluding_VersionTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionTo"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToIncluding_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getConsentStatusTypeFromExcludingToIncludingResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeFromExcludingToIncludingResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromExcludingToIncludingResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentStatusTypeFromIncludingToExcludingEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeFromIncludingToExcluding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToExcluding_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToExcluding_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToExcluding_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToExcluding_VersionFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionFrom"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToExcluding_VersionTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionTo"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToExcluding_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getConsentStatusTypeFromIncludingToExcludingResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeFromIncludingToExcludingResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToExcludingResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentStatusTypeFromIncludingToIncludingEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeFromIncludingToIncluding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToIncluding_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToIncluding_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToIncluding_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToIncluding_VersionFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionFrom"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToIncluding_VersionTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionTo"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToIncluding_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getConsentStatusTypeFromIncludingToIncludingResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeFromIncludingToIncludingResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeFromIncludingToIncludingResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentStatusTypeResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentStatusTypeResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentStatusTypeResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getConsentTemplateEClass,
		   source,
		   new String[] {
			   "name", "getConsentTemplate",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentTemplate_ConsentTemplateKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentTemplateKey"
		   });
		addAnnotation
		  (getConsentTemplateResponseEClass,
		   source,
		   new String[] {
			   "name", "getConsentTemplateResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConsentTemplateResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getCurrentConsentForSignerIdsAndCTEClass,
		   source,
		   new String[] {
			   "name", "getCurrentConsentForSignerIdsAndCT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCurrentConsentForSignerIdsAndCT_ConsentTemplateKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentTemplateKey"
		   });
		addAnnotation
		  (getGetCurrentConsentForSignerIdsAndCT_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetCurrentConsentForSignerIdsAndCT_IgnoreVersionNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ignoreVersionNumber"
		   });
		addAnnotation
		  (getGetCurrentConsentForSignerIdsAndCT_UseAliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useAliases"
		   });
		addAnnotation
		  (getCurrentConsentForSignerIdsAndCTResponseEClass,
		   source,
		   new String[] {
			   "name", "getCurrentConsentForSignerIdsAndCTResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCurrentConsentForSignerIdsAndCTResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getCurrentConsentTemplateEClass,
		   source,
		   new String[] {
			   "name", "getCurrentConsentTemplate",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCurrentConsentTemplate_ConsentTemplateName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentTemplateName"
		   });
		addAnnotation
		  (getGetCurrentConsentTemplate_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getCurrentConsentTemplateResponseEClass,
		   source,
		   new String[] {
			   "name", "getCurrentConsentTemplateResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCurrentConsentTemplateResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getCurrentPolicyStatesForSignerIdsEClass,
		   source,
		   new String[] {
			   "name", "getCurrentPolicyStatesForSignerIds",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCurrentPolicyStatesForSignerIds_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetCurrentPolicyStatesForSignerIds_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetCurrentPolicyStatesForSignerIds_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (getCurrentPolicyStatesForSignerIdsResponseEClass,
		   source,
		   new String[] {
			   "name", "getCurrentPolicyStatesForSignerIdsResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCurrentPolicyStatesForSignerIdsResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getDomainEClass,
		   source,
		   new String[] {
			   "name", "getDomain",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetDomain_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getDomainResponseEClass,
		   source,
		   new String[] {
			   "name", "getDomainResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetDomainResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getMappedTemplatesForSignerIdEClass,
		   source,
		   new String[] {
			   "name", "getMappedTemplatesForSignerId",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetMappedTemplatesForSignerId_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetMappedTemplatesForSignerId_CtType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ctType"
		   });
		addAnnotation
		  (getGetMappedTemplatesForSignerId_SignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerId"
		   });
		addAnnotation
		  (getGetMappedTemplatesForSignerId_UseAliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useAliases"
		   });
		addAnnotation
		  (getMappedTemplatesForSignerIdResponseEClass,
		   source,
		   new String[] {
			   "name", "getMappedTemplatesForSignerIdResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetMappedTemplatesForSignerIdResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getModuleEClass,
		   source,
		   new String[] {
			   "name", "getModule",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetModule_ModuleKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleKey"
		   });
		addAnnotation
		  (getModuleResponseEClass,
		   source,
		   new String[] {
			   "name", "getModuleResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetModuleResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getObjectByFhirIDEClass,
		   source,
		   new String[] {
			   "name", "getObjectByFhirID",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetObjectByFhirID_Clazz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clazz"
		   });
		addAnnotation
		  (getGetObjectByFhirID_FhirID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fhirID"
		   });
		addAnnotation
		  (getObjectByFhirIDResponseEClass,
		   source,
		   new String[] {
			   "name", "getObjectByFhirIDResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetObjectByFhirIDResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getPolicyEClass,
		   source,
		   new String[] {
			   "name", "getPolicy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetPolicy_PolicyKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyKey"
		   });
		addAnnotation
		  (getPolicyResponseEClass,
		   source,
		   new String[] {
			   "name", "getPolicyResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetPolicyResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getPolicyStatesForPolicyAndSignerIdsEClass,
		   source,
		   new String[] {
			   "name", "getPolicyStatesForPolicyAndSignerIds",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyAndSignerIds_PolicyKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyKey"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyAndSignerIds_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyAndSignerIds_UseAliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useAliases"
		   });
		addAnnotation
		  (getPolicyStatesForPolicyAndSignerIdsResponseEClass,
		   source,
		   new String[] {
			   "name", "getPolicyStatesForPolicyAndSignerIdsResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyAndSignerIdsResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getPolicyStatesForPolicyNameAndSignerIdsEClass,
		   source,
		   new String[] {
			   "name", "getPolicyStatesForPolicyNameAndSignerIds",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyNameAndSignerIds_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyNameAndSignerIds_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyNameAndSignerIds_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyNameAndSignerIds_UseAliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useAliases"
		   });
		addAnnotation
		  (getPolicyStatesForPolicyNameAndSignerIdsResponseEClass,
		   source,
		   new String[] {
			   "name", "getPolicyStatesForPolicyNameAndSignerIdsResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetPolicyStatesForPolicyNameAndSignerIdsResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getPolicyStatesForSignerIdsEClass,
		   source,
		   new String[] {
			   "name", "getPolicyStatesForSignerIds",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetPolicyStatesForSignerIds_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetPolicyStatesForSignerIds_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getGetPolicyStatesForSignerIds_UseAliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useAliases"
		   });
		addAnnotation
		  (getPolicyStatesForSignerIdsResponseEClass,
		   source,
		   new String[] {
			   "name", "getPolicyStatesForSignerIdsResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetPolicyStatesForSignerIdsResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getQCHistoryForConsentEClass,
		   source,
		   new String[] {
			   "name", "getQCHistoryForConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetQCHistoryForConsent_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getQCHistoryForConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "getQCHistoryForConsentResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetQCHistoryForConsentResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getQCProblemHistoryForQCProblemEClass,
		   source,
		   new String[] {
			   "name", "getQCProblemHistoryForQCProblem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetQCProblemHistoryForQCProblem_QcProblem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qcProblem"
		   });
		addAnnotation
		  (getGetQCProblemHistoryForQCProblem_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getQCProblemHistoryForQCProblemResponseEClass,
		   source,
		   new String[] {
			   "name", "getQCProblemHistoryForQCProblemResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetQCProblemHistoryForQCProblemResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getSignerIdsForAliasEClass,
		   source,
		   new String[] {
			   "name", "getSignerIdsForAlias",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetSignerIdsForAlias_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetSignerIdsForAlias_AliasSignerId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aliasSignerId"
		   });
		addAnnotation
		  (getSignerIdsForAliasResponseEClass,
		   source,
		   new String[] {
			   "name", "getSignerIdsForAliasResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetSignerIdsForAliasResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getSignerIdTypeEClass,
		   source,
		   new String[] {
			   "name", "getSignerIdType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetSignerIdType_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getGetSignerIdType_SignerIdTypeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIdTypeName"
		   });
		addAnnotation
		  (getSignerIdTypeResponseEClass,
		   source,
		   new String[] {
			   "name", "getSignerIdTypeResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetSignerIdTypeResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (getTemplatesWithPoliciesEClass,
		   source,
		   new String[] {
			   "name", "getTemplatesWithPolicies",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetTemplatesWithPolicies_PolicyKeyDTOs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyKeyDTOs"
		   });
		addAnnotation
		  (getTemplatesWithPoliciesResponseEClass,
		   source,
		   new String[] {
			   "name", "getTemplatesWithPoliciesResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetTemplatesWithPoliciesResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (hashMapEClass,
		   source,
		   new String[] {
			   "name", "hashMap",
			   "kind", "empty"
		   });
		addAnnotation
		  (illegalArgumentExceptionEClass,
		   source,
		   new String[] {
			   "name", "IllegalArgumentException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIllegalArgumentException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (inconsistentStatusExceptionEClass,
		   source,
		   new String[] {
			   "name", "InconsistentStatusException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInconsistentStatusException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (internalExceptionEClass,
		   source,
		   new String[] {
			   "name", "InternalException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInternalException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (invalidFreeTextExceptionEClass,
		   source,
		   new String[] {
			   "name", "InvalidFreeTextException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInvalidFreeTextException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (invalidParameterExceptionEClass,
		   source,
		   new String[] {
			   "name", "InvalidParameterException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInvalidParameterException_ParameterName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameterName"
		   });
		addAnnotation
		  (getInvalidParameterException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (invalidVersionExceptionEClass,
		   source,
		   new String[] {
			   "name", "InvalidVersionException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInvalidVersionException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (isConsentedEClass,
		   source,
		   new String[] {
			   "name", "isConsented",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsented_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getIsConsented_PolicyKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyKey"
		   });
		addAnnotation
		  (getIsConsented_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (isConsentedFromExcludingToExcludingEClass,
		   source,
		   new String[] {
			   "name", "isConsentedFromExcludingToExcluding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToExcluding_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToExcluding_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToExcluding_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToExcluding_VersionFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionFrom"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToExcluding_VersionTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionTo"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToExcluding_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (isConsentedFromExcludingToExcludingResponseEClass,
		   source,
		   new String[] {
			   "name", "isConsentedFromExcludingToExcludingResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToExcludingResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (isConsentedFromExcludingToIncludingEClass,
		   source,
		   new String[] {
			   "name", "isConsentedFromExcludingToIncluding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToIncluding_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToIncluding_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToIncluding_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToIncluding_VersionFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionFrom"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToIncluding_VersionTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionTo"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToIncluding_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (isConsentedFromExcludingToIncludingResponseEClass,
		   source,
		   new String[] {
			   "name", "isConsentedFromExcludingToIncludingResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedFromExcludingToIncludingResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (isConsentedFromIncludingToExcludingEClass,
		   source,
		   new String[] {
			   "name", "isConsentedFromIncludingToExcluding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToExcluding_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToExcluding_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToExcluding_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToExcluding_VersionFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionFrom"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToExcluding_VersionTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionTo"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToExcluding_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (isConsentedFromIncludingToExcludingResponseEClass,
		   source,
		   new String[] {
			   "name", "isConsentedFromIncludingToExcludingResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToExcludingResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (isConsentedFromIncludingToIncludingEClass,
		   source,
		   new String[] {
			   "name", "isConsentedFromIncludingToIncluding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToIncluding_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToIncluding_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToIncluding_PolicyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyName"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToIncluding_VersionFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionFrom"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToIncluding_VersionTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionTo"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToIncluding_Config(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "config"
		   });
		addAnnotation
		  (isConsentedFromIncludingToIncludingResponseEClass,
		   source,
		   new String[] {
			   "name", "isConsentedFromIncludingToIncludingResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedFromIncludingToIncludingResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (isConsentedResponseEClass,
		   source,
		   new String[] {
			   "name", "isConsentedResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsConsentedResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (labelEClass,
		   source,
		   new String[] {
			   "name", "Label",
			   "kind", "empty"
		   });
		addAnnotation
		  (getLabel_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getLabel_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (listConsentTemplatesEClass,
		   source,
		   new String[] {
			   "name", "listConsentTemplates",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListConsentTemplates_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getListConsentTemplates_OnlyFinal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "onlyFinal"
		   });
		addAnnotation
		  (listConsentTemplatesResponseEClass,
		   source,
		   new String[] {
			   "name", "listConsentTemplatesResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListConsentTemplatesResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (listCurrentConsentTemplatesEClass,
		   source,
		   new String[] {
			   "name", "listCurrentConsentTemplates",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListCurrentConsentTemplates_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (listCurrentConsentTemplatesResponseEClass,
		   source,
		   new String[] {
			   "name", "listCurrentConsentTemplatesResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListCurrentConsentTemplatesResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (listDomainsEClass,
		   source,
		   new String[] {
			   "name", "listDomains",
			   "kind", "empty"
		   });
		addAnnotation
		  (listDomainsResponseEClass,
		   source,
		   new String[] {
			   "name", "listDomainsResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListDomainsResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (listModulesEClass,
		   source,
		   new String[] {
			   "name", "listModules",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListModules_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getListModules_OnlyFinal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "onlyFinal"
		   });
		addAnnotation
		  (listModulesResponseEClass,
		   source,
		   new String[] {
			   "name", "listModulesResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListModulesResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (listPoliciesEClass,
		   source,
		   new String[] {
			   "name", "listPolicies",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListPolicies_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getListPolicies_OnlyFinal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "onlyFinal"
		   });
		addAnnotation
		  (listPoliciesResponseEClass,
		   source,
		   new String[] {
			   "name", "listPoliciesResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListPoliciesResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (listSignerIdTypesEClass,
		   source,
		   new String[] {
			   "name", "listSignerIdTypes",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListSignerIdTypes_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (listSignerIdTypesResponseEClass,
		   source,
		   new String[] {
			   "name", "listSignerIdTypesResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getListSignerIdTypesResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (mandatoryFieldsExceptionEClass,
		   source,
		   new String[] {
			   "name", "MandatoryFieldsException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMandatoryFieldsException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (missingRequiredObjectExceptionEClass,
		   source,
		   new String[] {
			   "name", "MissingRequiredObjectException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMissingRequiredObjectException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (moduleDTOEClass,
		   source,
		   new String[] {
			   "name", "moduleDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleDTO_AssignedPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "assignedPolicies"
		   });
		addAnnotation
		  (getModuleDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getModuleDTO_CreationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creationDate"
		   });
		addAnnotation
		  (getModuleDTO_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getModuleDTO_Finalised(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "finalised"
		   });
		addAnnotation
		  (getModuleDTO_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getModuleDTO_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getModuleDTO_ShortText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "shortText"
		   });
		addAnnotation
		  (getModuleDTO_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text"
		   });
		addAnnotation
		  (getModuleDTO_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title"
		   });
		addAnnotation
		  (getModuleDTO_UpdateDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateDate"
		   });
		addAnnotation
		  (moduleExpirationsTypeEClass,
		   source,
		   new String[] {
			   "name", "moduleExpirations_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleExpirationsType_Entry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entry"
		   });
		addAnnotation
		  (moduleKeyDTOEClass,
		   source,
		   new String[] {
			   "name", "moduleKeyDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleKeyDTO_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getModuleKeyDTO_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name"
		   });
		addAnnotation
		  (getModuleKeyDTO_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "version"
		   });
		addAnnotation
		  (moduleKeyDTOArrayEClass,
		   source,
		   new String[] {
			   "name", "moduleKeyDTOArray",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleKeyDTOArray_Item(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "item"
		   });
		addAnnotation
		  (moduleStateDTOEClass,
		   source,
		   new String[] {
			   "name", "moduleStateDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleStateDTO_ConsentState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentState"
		   });
		addAnnotation
		  (getModuleStateDTO_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getModuleStateDTO_PolicyKeys(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyKeys"
		   });
		addAnnotation
		  (moduleStatesTypeEClass,
		   source,
		   new String[] {
			   "name", "moduleStates_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleStatesType_Entry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entry"
		   });
		addAnnotation
		  (policyDTOEClass,
		   source,
		   new String[] {
			   "name", "policyDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPolicyDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getPolicyDTO_CreationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creationDate"
		   });
		addAnnotation
		  (getPolicyDTO_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getPolicyDTO_Finalised(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "finalised"
		   });
		addAnnotation
		  (getPolicyDTO_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getPolicyDTO_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getPolicyDTO_UpdateDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateDate"
		   });
		addAnnotation
		  (policyExpirationsTypeEClass,
		   source,
		   new String[] {
			   "name", "policyExpirations_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPolicyExpirationsType_Entry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entry"
		   });
		addAnnotation
		  (policyKeyDTOEClass,
		   source,
		   new String[] {
			   "name", "policyKeyDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPolicyKeyDTO_DomainName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domainName"
		   });
		addAnnotation
		  (getPolicyKeyDTO_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name"
		   });
		addAnnotation
		  (getPolicyKeyDTO_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "version"
		   });
		addAnnotation
		  (qcdtoEClass,
		   source,
		   new String[] {
			   "name", "qcdto",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQcdto_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getQcdto_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date"
		   });
		addAnnotation
		  (getQcdto_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getQcdto_Inspector(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inspector"
		   });
		addAnnotation
		  (getQcdto_Problems(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "problems"
		   });
		addAnnotation
		  (getQcdto_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type"
		   });
		addAnnotation
		  (qcHistoryDTOEClass,
		   source,
		   new String[] {
			   "name", "qcHistoryDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQcHistoryDTO_EndDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endDate"
		   });
		addAnnotation
		  (getQcHistoryDTO_StartDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startDate"
		   });
		addAnnotation
		  (qcProblemDTOEClass,
		   source,
		   new String[] {
			   "name", "qcProblemDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQcProblemDTO_CommentExtern(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "commentExtern"
		   });
		addAnnotation
		  (getQcProblemDTO_CommentIntern(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "commentIntern"
		   });
		addAnnotation
		  (getQcProblemDTO_CreatedAt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "createdAt"
		   });
		addAnnotation
		  (getQcProblemDTO_FormValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "formValue"
		   });
		addAnnotation
		  (getQcProblemDTO_Ref(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ref"
		   });
		addAnnotation
		  (getQcProblemDTO_ScanValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scanValue"
		   });
		addAnnotation
		  (getQcProblemDTO_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status"
		   });
		addAnnotation
		  (getQcProblemDTO_UpdatedAt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updatedAt"
		   });
		addAnnotation
		  (qcProblemHistoryDTOEClass,
		   source,
		   new String[] {
			   "name", "qcProblemHistoryDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQcProblemHistoryDTO_EndDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endDate"
		   });
		addAnnotation
		  (getQcProblemHistoryDTO_StartDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startDate"
		   });
		addAnnotation
		  (qcProblemStatusEEnum,
		   source,
		   new String[] {
			   "name", "qcProblemStatus"
		   });
		addAnnotation
		  (qcProblemStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "qcProblemStatus:Object",
			   "baseType", "qcProblemStatus"
		   });
		addAnnotation
		  (qcProblemTypeEClass,
		   source,
		   new String[] {
			   "name", "QCProblemType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQCProblemType_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getQCProblemType_Action(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "action"
		   });
		addAnnotation
		  (getQCProblemType_Error(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "error"
		   });
		addAnnotation
		  (getQCProblemType_Field(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "field"
		   });
		addAnnotation
		  (getQCProblemType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getQCProblemType_Occurrence(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "occurrence"
		   });
		addAnnotation
		  (qcProblemTypeActionEClass,
		   source,
		   new String[] {
			   "name", "QCProblemTypeAction",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQCProblemTypeAction_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getQCProblemTypeAction_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (qcProblemTypeErrorEEnum,
		   source,
		   new String[] {
			   "name", "qcProblemTypeError"
		   });
		addAnnotation
		  (qcProblemTypeErrorObjectEDataType,
		   source,
		   new String[] {
			   "name", "qcProblemTypeError:Object",
			   "baseType", "qcProblemTypeError"
		   });
		addAnnotation
		  (qcProblemTypeFieldEEnum,
		   source,
		   new String[] {
			   "name", "qcProblemTypeField"
		   });
		addAnnotation
		  (qcProblemTypeFieldObjectEDataType,
		   source,
		   new String[] {
			   "name", "qcProblemTypeField:Object",
			   "baseType", "qcProblemTypeField"
		   });
		addAnnotation
		  (qcProblemTypeOccurrenceEEnum,
		   source,
		   new String[] {
			   "name", "qcProblemTypeOccurrence"
		   });
		addAnnotation
		  (qcProblemTypeOccurrenceObjectEDataType,
		   source,
		   new String[] {
			   "name", "qcProblemTypeOccurrence:Object",
			   "baseType", "qcProblemTypeOccurrence"
		   });
		addAnnotation
		  (qcTypeEClass,
		   source,
		   new String[] {
			   "name", "QCType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQCType_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getQCType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getQCType_Status(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "status"
		   });
		addAnnotation
		  (qcTypeStatusEEnum,
		   source,
		   new String[] {
			   "name", "qcTypeStatus"
		   });
		addAnnotation
		  (qcTypeStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "qcTypeStatus:Object",
			   "baseType", "qcTypeStatus"
		   });
		addAnnotation
		  (refuseConsentEClass,
		   source,
		   new String[] {
			   "name", "refuseConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRefuseConsent_ConsentTemplateKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentTemplateKey"
		   });
		addAnnotation
		  (getRefuseConsent_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (refuseConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "refuseConsentResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (removeScanFromConsentEClass,
		   source,
		   new String[] {
			   "name", "removeScanFromConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRemoveScanFromConsent_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getRemoveScanFromConsent_FhirId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fhirId"
		   });
		addAnnotation
		  (removeScanFromConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "removeScanFromConsentResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (requirementsNotFullfilledExceptionEClass,
		   source,
		   new String[] {
			   "name", "RequirementsNotFullfilledException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRequirementsNotFullfilledException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (returnTypeEClass,
		   source,
		   new String[] {
			   "name", "return_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType_Domains(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domains"
		   });
		addAnnotation
		  (returnType1EClass,
		   source,
		   new String[] {
			   "name", "return_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType1_Modules(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modules"
		   });
		addAnnotation
		  (returnType2EClass,
		   source,
		   new String[] {
			   "name", "return_._2_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType2_SignerIdTypes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIdTypes"
		   });
		addAnnotation
		  (returnType3EClass,
		   source,
		   new String[] {
			   "name", "return_._3_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType3_Policies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policies"
		   });
		addAnnotation
		  (returnType4EClass,
		   source,
		   new String[] {
			   "name", "return_._4_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType4_CurrentConsentTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "currentConsentTemplates"
		   });
		addAnnotation
		  (returnType5EClass,
		   source,
		   new String[] {
			   "name", "return_._5_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType5_Templates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templates"
		   });
		addAnnotation
		  (returnType6EClass,
		   source,
		   new String[] {
			   "name", "return_._6_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType6_ConsentIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentIds"
		   });
		addAnnotation
		  (returnType7EClass,
		   source,
		   new String[] {
			   "name", "return_._7_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType7_Consents(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consents"
		   });
		addAnnotation
		  (returnType8EClass,
		   source,
		   new String[] {
			   "name", "return_._8_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType8_Consents(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consents"
		   });
		addAnnotation
		  (returnType9EClass,
		   source,
		   new String[] {
			   "name", "return_._9_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType9_SignedPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signedPolicies"
		   });
		addAnnotation
		  (returnType10EClass,
		   source,
		   new String[] {
			   "name", "return_._10_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType10_Consents(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consents"
		   });
		addAnnotation
		  (returnType11EClass,
		   source,
		   new String[] {
			   "name", "return_._11_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType11_SignedPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signedPolicies"
		   });
		addAnnotation
		  (returnType12EClass,
		   source,
		   new String[] {
			   "name", "return_._12_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType12_SignedPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signedPolicies"
		   });
		addAnnotation
		  (returnType13EClass,
		   source,
		   new String[] {
			   "name", "return_._13_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType13_SignedPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signedPolicies"
		   });
		addAnnotation
		  (returnType14EClass,
		   source,
		   new String[] {
			   "name", "return_._14_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType14_QcHistories(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qcHistories"
		   });
		addAnnotation
		  (returnType15EClass,
		   source,
		   new String[] {
			   "name", "return_._15_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType15_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (returnType16EClass,
		   source,
		   new String[] {
			   "name", "return_._16_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType16_ConsentTemplates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentTemplates"
		   });
		addAnnotation
		  (returnType17EClass,
		   source,
		   new String[] {
			   "name", "return_._17_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType17_QcProblemHistories(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qcProblemHistories"
		   });
		addAnnotation
		  (returnType18EClass,
		   source,
		   new String[] {
			   "name", "return_._18_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType18_Templates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templates"
		   });
		addAnnotation
		  (returnType19EClass,
		   source,
		   new String[] {
			   "name", "return_._19_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType19_Consents(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consents"
		   });
		addAnnotation
		  (returnType20EClass,
		   source,
		   new String[] {
			   "name", "return_._20_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType20_SignerIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signerIds"
		   });
		addAnnotation
		  (returnType21EClass,
		   source,
		   new String[] {
			   "name", "return_._21_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType21_Consents(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consents"
		   });
		addAnnotation
		  (returnType22EClass,
		   source,
		   new String[] {
			   "name", "return_._22_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType22_Entry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entry"
		   });
		addAnnotation
		  (returnType23EClass,
		   source,
		   new String[] {
			   "name", "return_._23_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType23_Aliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "aliases"
		   });
		addAnnotation
		  (setQCForConsentEClass,
		   source,
		   new String[] {
			   "name", "setQCForConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSetQCForConsent_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getSetQCForConsent_Qc(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qc"
		   });
		addAnnotation
		  (setQCForConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "setQCForConsentResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (signedPolicyDTOEClass,
		   source,
		   new String[] {
			   "name", "signedPolicyDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignedPolicyDTO_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getSignedPolicyDTO_PolicyKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policyKey"
		   });
		addAnnotation
		  (getSignedPolicyDTO_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status"
		   });
		addAnnotation
		  (signerIdDTOEClass,
		   source,
		   new String[] {
			   "name", "signerIdDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignerIdDTO_CreationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creationDate"
		   });
		addAnnotation
		  (getSignerIdDTO_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id"
		   });
		addAnnotation
		  (getSignerIdDTO_IdType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idType"
		   });
		addAnnotation
		  (getSignerIdDTO_OrderNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "orderNumber"
		   });
		addAnnotation
		  (signerIdDTOArrayEClass,
		   source,
		   new String[] {
			   "name", "signerIdDTOArray",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignerIdDTOArray_Item(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "item"
		   });
		addAnnotation
		  (signerIdTypeDTOEClass,
		   source,
		   new String[] {
			   "name", "signerIdTypeDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignerIdTypeDTO_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getSignerIdTypeDTO_CreateTimestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "createTimestamp"
		   });
		addAnnotation
		  (getSignerIdTypeDTO_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label"
		   });
		addAnnotation
		  (getSignerIdTypeDTO_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name"
		   });
		addAnnotation
		  (getSignerIdTypeDTO_UpdateTimestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateTimestamp"
		   });
		addAnnotation
		  (unknownAliasExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownAliasException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownAliasException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownConsentExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownConsentException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownConsentException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownConsentTemplateExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownConsentTemplateException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownConsentTemplateException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownDomainExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownDomainException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownDomainException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownFhirIdObjectExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownFhirIdObjectException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownFhirIdObjectException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownIDExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownIDException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownIDException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownModuleExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownModuleException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownModuleException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownPolicyExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownPolicyException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownPolicyException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownSignerIdExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownSignerIdException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownSignerIdException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (unknownSignerIdTypeExceptionEClass,
		   source,
		   new String[] {
			   "name", "UnknownSignerIdTypeException",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownSignerIdTypeException_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "message"
		   });
		addAnnotation
		  (updateConsentInUseEClass,
		   source,
		   new String[] {
			   "name", "updateConsentInUse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUpdateConsentInUse_ConsentKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consentKey"
		   });
		addAnnotation
		  (getUpdateConsentInUse_ExternProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externProperties"
		   });
		addAnnotation
		  (getUpdateConsentInUse_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comment"
		   });
		addAnnotation
		  (getUpdateConsentInUse_Scan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scan"
		   });
		addAnnotation
		  (updateConsentInUseResponseEClass,
		   source,
		   new String[] {
			   "name", "updateConsentInUseResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (validateConsentEClass,
		   source,
		   new String[] {
			   "name", "validateConsent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getValidateConsent_Consent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "consent"
		   });
		addAnnotation
		  (getValidateConsent_AllowRevoke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allowRevoke"
		   });
		addAnnotation
		  (getValidateConsent_ValidateScan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validateScan"
		   });
		addAnnotation
		  (validateConsentResponseEClass,
		   source,
		   new String[] {
			   "name", "validateConsentResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (validFromPropertiesDTOEClass,
		   source,
		   new String[] {
			   "name", "validFromPropertiesDTO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getValidFromPropertiesDTO_FixedValidFromDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fixedValidFromDate"
		   });
		addAnnotation
		  (getValidFromPropertiesDTO_InvalidPeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "invalidPeriod"
		   });
	}

} //Cm2PackageImpl
