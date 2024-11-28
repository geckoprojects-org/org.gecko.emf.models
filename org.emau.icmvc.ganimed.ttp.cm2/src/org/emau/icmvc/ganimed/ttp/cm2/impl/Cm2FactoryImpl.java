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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cm2FactoryImpl extends EFactoryImpl implements Cm2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cm2Factory init() {
		try {
			Cm2Factory theCm2Factory = (Cm2Factory)EPackage.Registry.INSTANCE.getEFactory(Cm2Package.eNS_URI);
			if (theCm2Factory != null) {
				return theCm2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cm2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cm2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Cm2Package.ADD_ALIAS: return createAddAlias();
			case Cm2Package.ADD_ALIAS_RESPONSE: return createAddAliasResponse();
			case Cm2Package.ADD_CONSENT: return createAddConsent();
			case Cm2Package.ADD_CONSENT_OPT_OUT: return createAddConsentOptOut();
			case Cm2Package.ADD_CONSENT_OPT_OUT_RESPONSE: return createAddConsentOptOutResponse();
			case Cm2Package.ADD_CONSENT_RESPONSE: return createAddConsentResponse();
			case Cm2Package.ADD_SCAN_TO_CONSENT: return createAddScanToConsent();
			case Cm2Package.ADD_SCAN_TO_CONSENT_RESPONSE: return createAddScanToConsentResponse();
			case Cm2Package.ADD_SIGNER_ID_TO_CONSENT: return createAddSignerIdToConsent();
			case Cm2Package.ADD_SIGNER_ID_TO_CONSENT_RESPONSE: return createAddSignerIdToConsentResponse();
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID: return createAddSignerIdToSignerId();
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE: return createAddSignerIdToSignerIdResponse();
			case Cm2Package.ASSIGNED_MODULE_DTO: return createAssignedModuleDTO();
			case Cm2Package.ASSIGNED_POLICY_DTO: return createAssignedPolicyDTO();
			case Cm2Package.CHILDREN_TYPE: return createChildrenType();
			case Cm2Package.CONSENT_DATE_VALUES_DTO: return createConsentDateValuesDTO();
			case Cm2Package.CONSENT_DTO: return createConsentDTO();
			case Cm2Package.CONSENT_KEY_DTO: return createConsentKeyDTO();
			case Cm2Package.CONSENT_LIGHT_DTO: return createConsentLightDTO();
			case Cm2Package.CONSENT_SCAN_DTO: return createConsentScanDTO();
			case Cm2Package.CONSENT_TEMPLATE_DTO: return createConsentTemplateDTO();
			case Cm2Package.CONSENT_TEMPLATE_KEY_DTO: return createConsentTemplateKeyDTO();
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO: return createConsentTemplateStructureDTO();
			case Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER: return createCountConsentsForDomainWithFilter();
			case Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE: return createCountConsentsForDomainWithFilterResponse();
			case Cm2Package.COUNT_SIGNED_POLICIES: return createCountSignedPolicies();
			case Cm2Package.COUNT_SIGNED_POLICIES_RESPONSE: return createCountSignedPoliciesResponse();
			case Cm2Package.DEACTIVATE_ALIAS: return createDeactivateAlias();
			case Cm2Package.DEACTIVATE_ALIAS_RESPONSE: return createDeactivateAliasResponse();
			case Cm2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Cm2Package.DOMAIN_DTO: return createDomainDTO();
			case Cm2Package.DUPLICATE_ENTRY_EXCEPTION: return createDuplicateEntryException();
			case Cm2Package.ENTRY_TYPE: return createEntryType();
			case Cm2Package.ENTRY_TYPE1: return createEntryType1();
			case Cm2Package.ENTRY_TYPE2: return createEntryType2();
			case Cm2Package.ENTRY_TYPE3: return createEntryType3();
			case Cm2Package.ENTRY_TYPE4: return createEntryType4();
			case Cm2Package.EXPIRATION_PROPERTIES_DTO: return createExpirationPropertiesDTO();
			case Cm2Package.FREE_TEXT_DEF_DTO: return createFreeTextDefDTO();
			case Cm2Package.FREE_TEXT_VAL_DTO: return createFreeTextValDTO();
			case Cm2Package.GET_ALIASES_FOR_SIGNER_ID: return createGetAliasesForSignerId();
			case Cm2Package.GET_ALIASES_FOR_SIGNER_ID_RESPONSE: return createGetAliasesForSignerIdResponse();
			case Cm2Package.GET_ALIASES_FOR_SIGNER_IDS: return createGetAliasesForSignerIds();
			case Cm2Package.GET_ALIASES_FOR_SIGNER_IDS_RESPONSE: return createGetAliasesForSignerIdsResponse();
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR: return createGetAllConsentedIdsFor();
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR_RESPONSE: return createGetAllConsentedIdsForResponse();
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE: return createGetAllConsentsForConsentTemplate();
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE: return createGetAllConsentsForConsentTemplateResponse();
			case Cm2Package.GET_ALL_CONSENTS_FOR_DOMAIN: return createGetAllConsentsForDomain();
			case Cm2Package.GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE: return createGetAllConsentsForDomainResponse();
			case Cm2Package.GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN: return createGetAllConsentsForDomainWithoutScan();
			case Cm2Package.GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE: return createGetAllConsentsForDomainWithoutScanResponse();
			case Cm2Package.GET_ALL_CONSENTS_FOR_SIGNER_IDS: return createGetAllConsentsForSignerIds();
			case Cm2Package.GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE: return createGetAllConsentsForSignerIdsResponse();
			case Cm2Package.GET_ALL_IDS_FOR_SIGNER_ID_TYPE: return createGetAllIdsForSignerIdType();
			case Cm2Package.GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE: return createGetAllIdsForSignerIdTypeResponse();
			case Cm2Package.GET_CONSENT: return createGetConsent();
			case Cm2Package.GET_CONSENT_DATES: return createGetConsentDates();
			case Cm2Package.GET_CONSENT_DATES_RESPONSE: return createGetConsentDatesResponse();
			case Cm2Package.GET_CONSENT_LIGHT: return createGetConsentLight();
			case Cm2Package.GET_CONSENT_LIGHT_RESPONSE: return createGetConsentLightResponse();
			case Cm2Package.GET_CONSENT_RESPONSE: return createGetConsentResponse();
			case Cm2Package.GET_CONSENTS_FOR_DOMAIN_PAGINATED: return createGetConsentsForDomainPaginated();
			case Cm2Package.GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE: return createGetConsentsForDomainPaginatedResponse();
			case Cm2Package.GET_CONSENT_STATUS_TYPE: return createGetConsentStatusType();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING: return createGetConsentStatusTypeFromExcludingToExcluding();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE: return createGetConsentStatusTypeFromExcludingToExcludingResponse();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING: return createGetConsentStatusTypeFromExcludingToIncluding();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE: return createGetConsentStatusTypeFromExcludingToIncludingResponse();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING: return createGetConsentStatusTypeFromIncludingToExcluding();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE: return createGetConsentStatusTypeFromIncludingToExcludingResponse();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING: return createGetConsentStatusTypeFromIncludingToIncluding();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE: return createGetConsentStatusTypeFromIncludingToIncludingResponse();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_RESPONSE: return createGetConsentStatusTypeResponse();
			case Cm2Package.GET_CONSENT_TEMPLATE: return createGetConsentTemplate();
			case Cm2Package.GET_CONSENT_TEMPLATE_RESPONSE: return createGetConsentTemplateResponse();
			case Cm2Package.GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT: return createGetCurrentConsentForSignerIdsAndCT();
			case Cm2Package.GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE: return createGetCurrentConsentForSignerIdsAndCTResponse();
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE: return createGetCurrentConsentTemplate();
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE_RESPONSE: return createGetCurrentConsentTemplateResponse();
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS: return createGetCurrentPolicyStatesForSignerIds();
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE: return createGetCurrentPolicyStatesForSignerIdsResponse();
			case Cm2Package.GET_DOMAIN: return createGetDomain();
			case Cm2Package.GET_DOMAIN_RESPONSE: return createGetDomainResponse();
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID: return createGetMappedTemplatesForSignerId();
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE: return createGetMappedTemplatesForSignerIdResponse();
			case Cm2Package.GET_MODULE: return createGetModule();
			case Cm2Package.GET_MODULE_RESPONSE: return createGetModuleResponse();
			case Cm2Package.GET_OBJECT_BY_FHIR_ID: return createGetObjectByFhirID();
			case Cm2Package.GET_OBJECT_BY_FHIR_ID_RESPONSE: return createGetObjectByFhirIDResponse();
			case Cm2Package.GET_POLICY: return createGetPolicy();
			case Cm2Package.GET_POLICY_RESPONSE: return createGetPolicyResponse();
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS: return createGetPolicyStatesForPolicyAndSignerIds();
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE: return createGetPolicyStatesForPolicyAndSignerIdsResponse();
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS: return createGetPolicyStatesForPolicyNameAndSignerIds();
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE: return createGetPolicyStatesForPolicyNameAndSignerIdsResponse();
			case Cm2Package.GET_POLICY_STATES_FOR_SIGNER_IDS: return createGetPolicyStatesForSignerIds();
			case Cm2Package.GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE: return createGetPolicyStatesForSignerIdsResponse();
			case Cm2Package.GET_QC_HISTORY_FOR_CONSENT: return createGetQCHistoryForConsent();
			case Cm2Package.GET_QC_HISTORY_FOR_CONSENT_RESPONSE: return createGetQCHistoryForConsentResponse();
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM: return createGetQCProblemHistoryForQCProblem();
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE: return createGetQCProblemHistoryForQCProblemResponse();
			case Cm2Package.GET_SIGNER_IDS_FOR_ALIAS: return createGetSignerIdsForAlias();
			case Cm2Package.GET_SIGNER_IDS_FOR_ALIAS_RESPONSE: return createGetSignerIdsForAliasResponse();
			case Cm2Package.GET_SIGNER_ID_TYPE: return createGetSignerIdType();
			case Cm2Package.GET_SIGNER_ID_TYPE_RESPONSE: return createGetSignerIdTypeResponse();
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES: return createGetTemplatesWithPolicies();
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES_RESPONSE: return createGetTemplatesWithPoliciesResponse();
			case Cm2Package.HASH_MAP: return createHashMap();
			case Cm2Package.ILLEGAL_ARGUMENT_EXCEPTION: return createIllegalArgumentException();
			case Cm2Package.INCONSISTENT_STATUS_EXCEPTION: return createInconsistentStatusException();
			case Cm2Package.INTERNAL_EXCEPTION: return createInternalException();
			case Cm2Package.INVALID_FREE_TEXT_EXCEPTION: return createInvalidFreeTextException();
			case Cm2Package.INVALID_PARAMETER_EXCEPTION: return createInvalidParameterException();
			case Cm2Package.INVALID_VERSION_EXCEPTION: return createInvalidVersionException();
			case Cm2Package.IS_CONSENTED: return createIsConsented();
			case Cm2Package.IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING: return createIsConsentedFromExcludingToExcluding();
			case Cm2Package.IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE: return createIsConsentedFromExcludingToExcludingResponse();
			case Cm2Package.IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING: return createIsConsentedFromExcludingToIncluding();
			case Cm2Package.IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE: return createIsConsentedFromExcludingToIncludingResponse();
			case Cm2Package.IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING: return createIsConsentedFromIncludingToExcluding();
			case Cm2Package.IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE: return createIsConsentedFromIncludingToExcludingResponse();
			case Cm2Package.IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING: return createIsConsentedFromIncludingToIncluding();
			case Cm2Package.IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE: return createIsConsentedFromIncludingToIncludingResponse();
			case Cm2Package.IS_CONSENTED_RESPONSE: return createIsConsentedResponse();
			case Cm2Package.LABEL: return createLabel();
			case Cm2Package.LIST_CONSENT_TEMPLATES: return createListConsentTemplates();
			case Cm2Package.LIST_CONSENT_TEMPLATES_RESPONSE: return createListConsentTemplatesResponse();
			case Cm2Package.LIST_CURRENT_CONSENT_TEMPLATES: return createListCurrentConsentTemplates();
			case Cm2Package.LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE: return createListCurrentConsentTemplatesResponse();
			case Cm2Package.LIST_DOMAINS: return createListDomains();
			case Cm2Package.LIST_DOMAINS_RESPONSE: return createListDomainsResponse();
			case Cm2Package.LIST_MODULES: return createListModules();
			case Cm2Package.LIST_MODULES_RESPONSE: return createListModulesResponse();
			case Cm2Package.LIST_POLICIES: return createListPolicies();
			case Cm2Package.LIST_POLICIES_RESPONSE: return createListPoliciesResponse();
			case Cm2Package.LIST_SIGNER_ID_TYPES: return createListSignerIdTypes();
			case Cm2Package.LIST_SIGNER_ID_TYPES_RESPONSE: return createListSignerIdTypesResponse();
			case Cm2Package.MANDATORY_FIELDS_EXCEPTION: return createMandatoryFieldsException();
			case Cm2Package.MISSING_REQUIRED_OBJECT_EXCEPTION: return createMissingRequiredObjectException();
			case Cm2Package.MODULE_DTO: return createModuleDTO();
			case Cm2Package.MODULE_EXPIRATIONS_TYPE: return createModuleExpirationsType();
			case Cm2Package.MODULE_KEY_DTO: return createModuleKeyDTO();
			case Cm2Package.MODULE_KEY_DTO_ARRAY: return createModuleKeyDTOArray();
			case Cm2Package.MODULE_STATE_DTO: return createModuleStateDTO();
			case Cm2Package.MODULE_STATES_TYPE: return createModuleStatesType();
			case Cm2Package.POLICY_DTO: return createPolicyDTO();
			case Cm2Package.POLICY_EXPIRATIONS_TYPE: return createPolicyExpirationsType();
			case Cm2Package.POLICY_KEY_DTO: return createPolicyKeyDTO();
			case Cm2Package.QCDTO: return createQcdto();
			case Cm2Package.QC_HISTORY_DTO: return createQcHistoryDTO();
			case Cm2Package.QC_PROBLEM_DTO: return createQcProblemDTO();
			case Cm2Package.QC_PROBLEM_HISTORY_DTO: return createQcProblemHistoryDTO();
			case Cm2Package.QC_PROBLEM_TYPE: return createQCProblemType();
			case Cm2Package.QC_PROBLEM_TYPE_ACTION: return createQCProblemTypeAction();
			case Cm2Package.QC_TYPE: return createQCType();
			case Cm2Package.REFUSE_CONSENT: return createRefuseConsent();
			case Cm2Package.REFUSE_CONSENT_RESPONSE: return createRefuseConsentResponse();
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT: return createRemoveScanFromConsent();
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT_RESPONSE: return createRemoveScanFromConsentResponse();
			case Cm2Package.REQUIREMENTS_NOT_FULLFILLED_EXCEPTION: return createRequirementsNotFullfilledException();
			case Cm2Package.RETURN_TYPE: return createReturnType();
			case Cm2Package.RETURN_TYPE1: return createReturnType1();
			case Cm2Package.RETURN_TYPE2: return createReturnType2();
			case Cm2Package.RETURN_TYPE3: return createReturnType3();
			case Cm2Package.RETURN_TYPE4: return createReturnType4();
			case Cm2Package.RETURN_TYPE5: return createReturnType5();
			case Cm2Package.RETURN_TYPE6: return createReturnType6();
			case Cm2Package.RETURN_TYPE7: return createReturnType7();
			case Cm2Package.RETURN_TYPE8: return createReturnType8();
			case Cm2Package.RETURN_TYPE9: return createReturnType9();
			case Cm2Package.RETURN_TYPE10: return createReturnType10();
			case Cm2Package.RETURN_TYPE11: return createReturnType11();
			case Cm2Package.RETURN_TYPE12: return createReturnType12();
			case Cm2Package.RETURN_TYPE13: return createReturnType13();
			case Cm2Package.RETURN_TYPE14: return createReturnType14();
			case Cm2Package.RETURN_TYPE15: return createReturnType15();
			case Cm2Package.RETURN_TYPE16: return createReturnType16();
			case Cm2Package.RETURN_TYPE17: return createReturnType17();
			case Cm2Package.RETURN_TYPE18: return createReturnType18();
			case Cm2Package.RETURN_TYPE19: return createReturnType19();
			case Cm2Package.RETURN_TYPE20: return createReturnType20();
			case Cm2Package.RETURN_TYPE21: return createReturnType21();
			case Cm2Package.RETURN_TYPE22: return createReturnType22();
			case Cm2Package.RETURN_TYPE23: return createReturnType23();
			case Cm2Package.SET_QC_FOR_CONSENT: return createSetQCForConsent();
			case Cm2Package.SET_QC_FOR_CONSENT_RESPONSE: return createSetQCForConsentResponse();
			case Cm2Package.SIGNED_POLICY_DTO: return createSignedPolicyDTO();
			case Cm2Package.SIGNER_ID_DTO: return createSignerIdDTO();
			case Cm2Package.SIGNER_ID_DTO_ARRAY: return createSignerIdDTOArray();
			case Cm2Package.SIGNER_ID_TYPE_DTO: return createSignerIdTypeDTO();
			case Cm2Package.UNKNOWN_ALIAS_EXCEPTION: return createUnknownAliasException();
			case Cm2Package.UNKNOWN_CONSENT_EXCEPTION: return createUnknownConsentException();
			case Cm2Package.UNKNOWN_CONSENT_TEMPLATE_EXCEPTION: return createUnknownConsentTemplateException();
			case Cm2Package.UNKNOWN_DOMAIN_EXCEPTION: return createUnknownDomainException();
			case Cm2Package.UNKNOWN_FHIR_ID_OBJECT_EXCEPTION: return createUnknownFhirIdObjectException();
			case Cm2Package.UNKNOWN_ID_EXCEPTION: return createUnknownIDException();
			case Cm2Package.UNKNOWN_MODULE_EXCEPTION: return createUnknownModuleException();
			case Cm2Package.UNKNOWN_POLICY_EXCEPTION: return createUnknownPolicyException();
			case Cm2Package.UNKNOWN_SIGNER_ID_EXCEPTION: return createUnknownSignerIdException();
			case Cm2Package.UNKNOWN_SIGNER_ID_TYPE_EXCEPTION: return createUnknownSignerIdTypeException();
			case Cm2Package.UPDATE_CONSENT_IN_USE: return createUpdateConsentInUse();
			case Cm2Package.UPDATE_CONSENT_IN_USE_RESPONSE: return createUpdateConsentInUseResponse();
			case Cm2Package.VALIDATE_CONSENT: return createValidateConsent();
			case Cm2Package.VALIDATE_CONSENT_RESPONSE: return createValidateConsentResponse();
			case Cm2Package.VALID_FROM_PROPERTIES_DTO: return createValidFromPropertiesDTO();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Cm2Package.CONSENT_STATUS:
				return createConsentStatusFromString(eDataType, initialValue);
			case Cm2Package.CONSENT_STATUS_TYPE:
				return createConsentStatusTypeFromString(eDataType, initialValue);
			case Cm2Package.CONSENT_TEMPLATE_TYPE:
				return createConsentTemplateTypeFromString(eDataType, initialValue);
			case Cm2Package.FREE_TEXT_TYPE:
				return createFreeTextTypeFromString(eDataType, initialValue);
			case Cm2Package.QC_PROBLEM_STATUS:
				return createQcProblemStatusFromString(eDataType, initialValue);
			case Cm2Package.QC_PROBLEM_TYPE_ERROR:
				return createQcProblemTypeErrorFromString(eDataType, initialValue);
			case Cm2Package.QC_PROBLEM_TYPE_FIELD:
				return createQcProblemTypeFieldFromString(eDataType, initialValue);
			case Cm2Package.QC_PROBLEM_TYPE_OCCURRENCE:
				return createQcProblemTypeOccurrenceFromString(eDataType, initialValue);
			case Cm2Package.QC_TYPE_STATUS:
				return createQcTypeStatusFromString(eDataType, initialValue);
			case Cm2Package.CONSENT_STATUS_OBJECT:
				return createConsentStatusObjectFromString(eDataType, initialValue);
			case Cm2Package.CONSENT_STATUS_TYPE_OBJECT:
				return createConsentStatusTypeObjectFromString(eDataType, initialValue);
			case Cm2Package.CONSENT_TEMPLATE_TYPE_OBJECT:
				return createConsentTemplateTypeObjectFromString(eDataType, initialValue);
			case Cm2Package.FREE_TEXT_TYPE_OBJECT:
				return createFreeTextTypeObjectFromString(eDataType, initialValue);
			case Cm2Package.QC_PROBLEM_STATUS_OBJECT:
				return createQcProblemStatusObjectFromString(eDataType, initialValue);
			case Cm2Package.QC_PROBLEM_TYPE_ERROR_OBJECT:
				return createQcProblemTypeErrorObjectFromString(eDataType, initialValue);
			case Cm2Package.QC_PROBLEM_TYPE_FIELD_OBJECT:
				return createQcProblemTypeFieldObjectFromString(eDataType, initialValue);
			case Cm2Package.QC_PROBLEM_TYPE_OCCURRENCE_OBJECT:
				return createQcProblemTypeOccurrenceObjectFromString(eDataType, initialValue);
			case Cm2Package.QC_TYPE_STATUS_OBJECT:
				return createQcTypeStatusObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Cm2Package.CONSENT_STATUS:
				return convertConsentStatusToString(eDataType, instanceValue);
			case Cm2Package.CONSENT_STATUS_TYPE:
				return convertConsentStatusTypeToString(eDataType, instanceValue);
			case Cm2Package.CONSENT_TEMPLATE_TYPE:
				return convertConsentTemplateTypeToString(eDataType, instanceValue);
			case Cm2Package.FREE_TEXT_TYPE:
				return convertFreeTextTypeToString(eDataType, instanceValue);
			case Cm2Package.QC_PROBLEM_STATUS:
				return convertQcProblemStatusToString(eDataType, instanceValue);
			case Cm2Package.QC_PROBLEM_TYPE_ERROR:
				return convertQcProblemTypeErrorToString(eDataType, instanceValue);
			case Cm2Package.QC_PROBLEM_TYPE_FIELD:
				return convertQcProblemTypeFieldToString(eDataType, instanceValue);
			case Cm2Package.QC_PROBLEM_TYPE_OCCURRENCE:
				return convertQcProblemTypeOccurrenceToString(eDataType, instanceValue);
			case Cm2Package.QC_TYPE_STATUS:
				return convertQcTypeStatusToString(eDataType, instanceValue);
			case Cm2Package.CONSENT_STATUS_OBJECT:
				return convertConsentStatusObjectToString(eDataType, instanceValue);
			case Cm2Package.CONSENT_STATUS_TYPE_OBJECT:
				return convertConsentStatusTypeObjectToString(eDataType, instanceValue);
			case Cm2Package.CONSENT_TEMPLATE_TYPE_OBJECT:
				return convertConsentTemplateTypeObjectToString(eDataType, instanceValue);
			case Cm2Package.FREE_TEXT_TYPE_OBJECT:
				return convertFreeTextTypeObjectToString(eDataType, instanceValue);
			case Cm2Package.QC_PROBLEM_STATUS_OBJECT:
				return convertQcProblemStatusObjectToString(eDataType, instanceValue);
			case Cm2Package.QC_PROBLEM_TYPE_ERROR_OBJECT:
				return convertQcProblemTypeErrorObjectToString(eDataType, instanceValue);
			case Cm2Package.QC_PROBLEM_TYPE_FIELD_OBJECT:
				return convertQcProblemTypeFieldObjectToString(eDataType, instanceValue);
			case Cm2Package.QC_PROBLEM_TYPE_OCCURRENCE_OBJECT:
				return convertQcProblemTypeOccurrenceObjectToString(eDataType, instanceValue);
			case Cm2Package.QC_TYPE_STATUS_OBJECT:
				return convertQcTypeStatusObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddAlias createAddAlias() {
		AddAliasImpl addAlias = new AddAliasImpl();
		return addAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddAliasResponse createAddAliasResponse() {
		AddAliasResponseImpl addAliasResponse = new AddAliasResponseImpl();
		return addAliasResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConsent createAddConsent() {
		AddConsentImpl addConsent = new AddConsentImpl();
		return addConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConsentOptOut createAddConsentOptOut() {
		AddConsentOptOutImpl addConsentOptOut = new AddConsentOptOutImpl();
		return addConsentOptOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConsentOptOutResponse createAddConsentOptOutResponse() {
		AddConsentOptOutResponseImpl addConsentOptOutResponse = new AddConsentOptOutResponseImpl();
		return addConsentOptOutResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConsentResponse createAddConsentResponse() {
		AddConsentResponseImpl addConsentResponse = new AddConsentResponseImpl();
		return addConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddScanToConsent createAddScanToConsent() {
		AddScanToConsentImpl addScanToConsent = new AddScanToConsentImpl();
		return addScanToConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddScanToConsentResponse createAddScanToConsentResponse() {
		AddScanToConsentResponseImpl addScanToConsentResponse = new AddScanToConsentResponseImpl();
		return addScanToConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSignerIdToConsent createAddSignerIdToConsent() {
		AddSignerIdToConsentImpl addSignerIdToConsent = new AddSignerIdToConsentImpl();
		return addSignerIdToConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSignerIdToConsentResponse createAddSignerIdToConsentResponse() {
		AddSignerIdToConsentResponseImpl addSignerIdToConsentResponse = new AddSignerIdToConsentResponseImpl();
		return addSignerIdToConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSignerIdToSignerId createAddSignerIdToSignerId() {
		AddSignerIdToSignerIdImpl addSignerIdToSignerId = new AddSignerIdToSignerIdImpl();
		return addSignerIdToSignerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSignerIdToSignerIdResponse createAddSignerIdToSignerIdResponse() {
		AddSignerIdToSignerIdResponseImpl addSignerIdToSignerIdResponse = new AddSignerIdToSignerIdResponseImpl();
		return addSignerIdToSignerIdResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignedModuleDTO createAssignedModuleDTO() {
		AssignedModuleDTOImpl assignedModuleDTO = new AssignedModuleDTOImpl();
		return assignedModuleDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignedPolicyDTO createAssignedPolicyDTO() {
		AssignedPolicyDTOImpl assignedPolicyDTO = new AssignedPolicyDTOImpl();
		return assignedPolicyDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildrenType createChildrenType() {
		ChildrenTypeImpl childrenType = new ChildrenTypeImpl();
		return childrenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentDateValuesDTO createConsentDateValuesDTO() {
		ConsentDateValuesDTOImpl consentDateValuesDTO = new ConsentDateValuesDTOImpl();
		return consentDateValuesDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentDTO createConsentDTO() {
		ConsentDTOImpl consentDTO = new ConsentDTOImpl();
		return consentDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentKeyDTO createConsentKeyDTO() {
		ConsentKeyDTOImpl consentKeyDTO = new ConsentKeyDTOImpl();
		return consentKeyDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentLightDTO createConsentLightDTO() {
		ConsentLightDTOImpl consentLightDTO = new ConsentLightDTOImpl();
		return consentLightDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentScanDTO createConsentScanDTO() {
		ConsentScanDTOImpl consentScanDTO = new ConsentScanDTOImpl();
		return consentScanDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateDTO createConsentTemplateDTO() {
		ConsentTemplateDTOImpl consentTemplateDTO = new ConsentTemplateDTOImpl();
		return consentTemplateDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateKeyDTO createConsentTemplateKeyDTO() {
		ConsentTemplateKeyDTOImpl consentTemplateKeyDTO = new ConsentTemplateKeyDTOImpl();
		return consentTemplateKeyDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateStructureDTO createConsentTemplateStructureDTO() {
		ConsentTemplateStructureDTOImpl consentTemplateStructureDTO = new ConsentTemplateStructureDTOImpl();
		return consentTemplateStructureDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountConsentsForDomainWithFilter createCountConsentsForDomainWithFilter() {
		CountConsentsForDomainWithFilterImpl countConsentsForDomainWithFilter = new CountConsentsForDomainWithFilterImpl();
		return countConsentsForDomainWithFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountConsentsForDomainWithFilterResponse createCountConsentsForDomainWithFilterResponse() {
		CountConsentsForDomainWithFilterResponseImpl countConsentsForDomainWithFilterResponse = new CountConsentsForDomainWithFilterResponseImpl();
		return countConsentsForDomainWithFilterResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountSignedPolicies createCountSignedPolicies() {
		CountSignedPoliciesImpl countSignedPolicies = new CountSignedPoliciesImpl();
		return countSignedPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountSignedPoliciesResponse createCountSignedPoliciesResponse() {
		CountSignedPoliciesResponseImpl countSignedPoliciesResponse = new CountSignedPoliciesResponseImpl();
		return countSignedPoliciesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeactivateAlias createDeactivateAlias() {
		DeactivateAliasImpl deactivateAlias = new DeactivateAliasImpl();
		return deactivateAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeactivateAliasResponse createDeactivateAliasResponse() {
		DeactivateAliasResponseImpl deactivateAliasResponse = new DeactivateAliasResponseImpl();
		return deactivateAliasResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainDTO createDomainDTO() {
		DomainDTOImpl domainDTO = new DomainDTOImpl();
		return domainDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DuplicateEntryException createDuplicateEntryException() {
		DuplicateEntryExceptionImpl duplicateEntryException = new DuplicateEntryExceptionImpl();
		return duplicateEntryException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType1 createEntryType1() {
		EntryType1Impl entryType1 = new EntryType1Impl();
		return entryType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType2 createEntryType2() {
		EntryType2Impl entryType2 = new EntryType2Impl();
		return entryType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType3 createEntryType3() {
		EntryType3Impl entryType3 = new EntryType3Impl();
		return entryType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType4 createEntryType4() {
		EntryType4Impl entryType4 = new EntryType4Impl();
		return entryType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpirationPropertiesDTO createExpirationPropertiesDTO() {
		ExpirationPropertiesDTOImpl expirationPropertiesDTO = new ExpirationPropertiesDTOImpl();
		return expirationPropertiesDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeTextDefDTO createFreeTextDefDTO() {
		FreeTextDefDTOImpl freeTextDefDTO = new FreeTextDefDTOImpl();
		return freeTextDefDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeTextValDTO createFreeTextValDTO() {
		FreeTextValDTOImpl freeTextValDTO = new FreeTextValDTOImpl();
		return freeTextValDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAliasesForSignerId createGetAliasesForSignerId() {
		GetAliasesForSignerIdImpl getAliasesForSignerId = new GetAliasesForSignerIdImpl();
		return getAliasesForSignerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAliasesForSignerIdResponse createGetAliasesForSignerIdResponse() {
		GetAliasesForSignerIdResponseImpl getAliasesForSignerIdResponse = new GetAliasesForSignerIdResponseImpl();
		return getAliasesForSignerIdResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAliasesForSignerIds createGetAliasesForSignerIds() {
		GetAliasesForSignerIdsImpl getAliasesForSignerIds = new GetAliasesForSignerIdsImpl();
		return getAliasesForSignerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAliasesForSignerIdsResponse createGetAliasesForSignerIdsResponse() {
		GetAliasesForSignerIdsResponseImpl getAliasesForSignerIdsResponse = new GetAliasesForSignerIdsResponseImpl();
		return getAliasesForSignerIdsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentedIdsFor createGetAllConsentedIdsFor() {
		GetAllConsentedIdsForImpl getAllConsentedIdsFor = new GetAllConsentedIdsForImpl();
		return getAllConsentedIdsFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentedIdsForResponse createGetAllConsentedIdsForResponse() {
		GetAllConsentedIdsForResponseImpl getAllConsentedIdsForResponse = new GetAllConsentedIdsForResponseImpl();
		return getAllConsentedIdsForResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForConsentTemplate createGetAllConsentsForConsentTemplate() {
		GetAllConsentsForConsentTemplateImpl getAllConsentsForConsentTemplate = new GetAllConsentsForConsentTemplateImpl();
		return getAllConsentsForConsentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForConsentTemplateResponse createGetAllConsentsForConsentTemplateResponse() {
		GetAllConsentsForConsentTemplateResponseImpl getAllConsentsForConsentTemplateResponse = new GetAllConsentsForConsentTemplateResponseImpl();
		return getAllConsentsForConsentTemplateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForDomain createGetAllConsentsForDomain() {
		GetAllConsentsForDomainImpl getAllConsentsForDomain = new GetAllConsentsForDomainImpl();
		return getAllConsentsForDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForDomainResponse createGetAllConsentsForDomainResponse() {
		GetAllConsentsForDomainResponseImpl getAllConsentsForDomainResponse = new GetAllConsentsForDomainResponseImpl();
		return getAllConsentsForDomainResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForDomainWithoutScan createGetAllConsentsForDomainWithoutScan() {
		GetAllConsentsForDomainWithoutScanImpl getAllConsentsForDomainWithoutScan = new GetAllConsentsForDomainWithoutScanImpl();
		return getAllConsentsForDomainWithoutScan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForDomainWithoutScanResponse createGetAllConsentsForDomainWithoutScanResponse() {
		GetAllConsentsForDomainWithoutScanResponseImpl getAllConsentsForDomainWithoutScanResponse = new GetAllConsentsForDomainWithoutScanResponseImpl();
		return getAllConsentsForDomainWithoutScanResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForSignerIds createGetAllConsentsForSignerIds() {
		GetAllConsentsForSignerIdsImpl getAllConsentsForSignerIds = new GetAllConsentsForSignerIdsImpl();
		return getAllConsentsForSignerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForSignerIdsResponse createGetAllConsentsForSignerIdsResponse() {
		GetAllConsentsForSignerIdsResponseImpl getAllConsentsForSignerIdsResponse = new GetAllConsentsForSignerIdsResponseImpl();
		return getAllConsentsForSignerIdsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllIdsForSignerIdType createGetAllIdsForSignerIdType() {
		GetAllIdsForSignerIdTypeImpl getAllIdsForSignerIdType = new GetAllIdsForSignerIdTypeImpl();
		return getAllIdsForSignerIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllIdsForSignerIdTypeResponse createGetAllIdsForSignerIdTypeResponse() {
		GetAllIdsForSignerIdTypeResponseImpl getAllIdsForSignerIdTypeResponse = new GetAllIdsForSignerIdTypeResponseImpl();
		return getAllIdsForSignerIdTypeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsent createGetConsent() {
		GetConsentImpl getConsent = new GetConsentImpl();
		return getConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentDates createGetConsentDates() {
		GetConsentDatesImpl getConsentDates = new GetConsentDatesImpl();
		return getConsentDates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentDatesResponse createGetConsentDatesResponse() {
		GetConsentDatesResponseImpl getConsentDatesResponse = new GetConsentDatesResponseImpl();
		return getConsentDatesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentLight createGetConsentLight() {
		GetConsentLightImpl getConsentLight = new GetConsentLightImpl();
		return getConsentLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentLightResponse createGetConsentLightResponse() {
		GetConsentLightResponseImpl getConsentLightResponse = new GetConsentLightResponseImpl();
		return getConsentLightResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentResponse createGetConsentResponse() {
		GetConsentResponseImpl getConsentResponse = new GetConsentResponseImpl();
		return getConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentsForDomainPaginated createGetConsentsForDomainPaginated() {
		GetConsentsForDomainPaginatedImpl getConsentsForDomainPaginated = new GetConsentsForDomainPaginatedImpl();
		return getConsentsForDomainPaginated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentsForDomainPaginatedResponse createGetConsentsForDomainPaginatedResponse() {
		GetConsentsForDomainPaginatedResponseImpl getConsentsForDomainPaginatedResponse = new GetConsentsForDomainPaginatedResponseImpl();
		return getConsentsForDomainPaginatedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusType createGetConsentStatusType() {
		GetConsentStatusTypeImpl getConsentStatusType = new GetConsentStatusTypeImpl();
		return getConsentStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromExcludingToExcluding createGetConsentStatusTypeFromExcludingToExcluding() {
		GetConsentStatusTypeFromExcludingToExcludingImpl getConsentStatusTypeFromExcludingToExcluding = new GetConsentStatusTypeFromExcludingToExcludingImpl();
		return getConsentStatusTypeFromExcludingToExcluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromExcludingToExcludingResponse createGetConsentStatusTypeFromExcludingToExcludingResponse() {
		GetConsentStatusTypeFromExcludingToExcludingResponseImpl getConsentStatusTypeFromExcludingToExcludingResponse = new GetConsentStatusTypeFromExcludingToExcludingResponseImpl();
		return getConsentStatusTypeFromExcludingToExcludingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromExcludingToIncluding createGetConsentStatusTypeFromExcludingToIncluding() {
		GetConsentStatusTypeFromExcludingToIncludingImpl getConsentStatusTypeFromExcludingToIncluding = new GetConsentStatusTypeFromExcludingToIncludingImpl();
		return getConsentStatusTypeFromExcludingToIncluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromExcludingToIncludingResponse createGetConsentStatusTypeFromExcludingToIncludingResponse() {
		GetConsentStatusTypeFromExcludingToIncludingResponseImpl getConsentStatusTypeFromExcludingToIncludingResponse = new GetConsentStatusTypeFromExcludingToIncludingResponseImpl();
		return getConsentStatusTypeFromExcludingToIncludingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromIncludingToExcluding createGetConsentStatusTypeFromIncludingToExcluding() {
		GetConsentStatusTypeFromIncludingToExcludingImpl getConsentStatusTypeFromIncludingToExcluding = new GetConsentStatusTypeFromIncludingToExcludingImpl();
		return getConsentStatusTypeFromIncludingToExcluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromIncludingToExcludingResponse createGetConsentStatusTypeFromIncludingToExcludingResponse() {
		GetConsentStatusTypeFromIncludingToExcludingResponseImpl getConsentStatusTypeFromIncludingToExcludingResponse = new GetConsentStatusTypeFromIncludingToExcludingResponseImpl();
		return getConsentStatusTypeFromIncludingToExcludingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromIncludingToIncluding createGetConsentStatusTypeFromIncludingToIncluding() {
		GetConsentStatusTypeFromIncludingToIncludingImpl getConsentStatusTypeFromIncludingToIncluding = new GetConsentStatusTypeFromIncludingToIncludingImpl();
		return getConsentStatusTypeFromIncludingToIncluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromIncludingToIncludingResponse createGetConsentStatusTypeFromIncludingToIncludingResponse() {
		GetConsentStatusTypeFromIncludingToIncludingResponseImpl getConsentStatusTypeFromIncludingToIncludingResponse = new GetConsentStatusTypeFromIncludingToIncludingResponseImpl();
		return getConsentStatusTypeFromIncludingToIncludingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeResponse createGetConsentStatusTypeResponse() {
		GetConsentStatusTypeResponseImpl getConsentStatusTypeResponse = new GetConsentStatusTypeResponseImpl();
		return getConsentStatusTypeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentTemplate createGetConsentTemplate() {
		GetConsentTemplateImpl getConsentTemplate = new GetConsentTemplateImpl();
		return getConsentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentTemplateResponse createGetConsentTemplateResponse() {
		GetConsentTemplateResponseImpl getConsentTemplateResponse = new GetConsentTemplateResponseImpl();
		return getConsentTemplateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentConsentForSignerIdsAndCT createGetCurrentConsentForSignerIdsAndCT() {
		GetCurrentConsentForSignerIdsAndCTImpl getCurrentConsentForSignerIdsAndCT = new GetCurrentConsentForSignerIdsAndCTImpl();
		return getCurrentConsentForSignerIdsAndCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentConsentForSignerIdsAndCTResponse createGetCurrentConsentForSignerIdsAndCTResponse() {
		GetCurrentConsentForSignerIdsAndCTResponseImpl getCurrentConsentForSignerIdsAndCTResponse = new GetCurrentConsentForSignerIdsAndCTResponseImpl();
		return getCurrentConsentForSignerIdsAndCTResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentConsentTemplate createGetCurrentConsentTemplate() {
		GetCurrentConsentTemplateImpl getCurrentConsentTemplate = new GetCurrentConsentTemplateImpl();
		return getCurrentConsentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentConsentTemplateResponse createGetCurrentConsentTemplateResponse() {
		GetCurrentConsentTemplateResponseImpl getCurrentConsentTemplateResponse = new GetCurrentConsentTemplateResponseImpl();
		return getCurrentConsentTemplateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentPolicyStatesForSignerIds createGetCurrentPolicyStatesForSignerIds() {
		GetCurrentPolicyStatesForSignerIdsImpl getCurrentPolicyStatesForSignerIds = new GetCurrentPolicyStatesForSignerIdsImpl();
		return getCurrentPolicyStatesForSignerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentPolicyStatesForSignerIdsResponse createGetCurrentPolicyStatesForSignerIdsResponse() {
		GetCurrentPolicyStatesForSignerIdsResponseImpl getCurrentPolicyStatesForSignerIdsResponse = new GetCurrentPolicyStatesForSignerIdsResponseImpl();
		return getCurrentPolicyStatesForSignerIdsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDomain createGetDomain() {
		GetDomainImpl getDomain = new GetDomainImpl();
		return getDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDomainResponse createGetDomainResponse() {
		GetDomainResponseImpl getDomainResponse = new GetDomainResponseImpl();
		return getDomainResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetMappedTemplatesForSignerId createGetMappedTemplatesForSignerId() {
		GetMappedTemplatesForSignerIdImpl getMappedTemplatesForSignerId = new GetMappedTemplatesForSignerIdImpl();
		return getMappedTemplatesForSignerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetMappedTemplatesForSignerIdResponse createGetMappedTemplatesForSignerIdResponse() {
		GetMappedTemplatesForSignerIdResponseImpl getMappedTemplatesForSignerIdResponse = new GetMappedTemplatesForSignerIdResponseImpl();
		return getMappedTemplatesForSignerIdResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetModule createGetModule() {
		GetModuleImpl getModule = new GetModuleImpl();
		return getModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetModuleResponse createGetModuleResponse() {
		GetModuleResponseImpl getModuleResponse = new GetModuleResponseImpl();
		return getModuleResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetObjectByFhirID createGetObjectByFhirID() {
		GetObjectByFhirIDImpl getObjectByFhirID = new GetObjectByFhirIDImpl();
		return getObjectByFhirID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetObjectByFhirIDResponse createGetObjectByFhirIDResponse() {
		GetObjectByFhirIDResponseImpl getObjectByFhirIDResponse = new GetObjectByFhirIDResponseImpl();
		return getObjectByFhirIDResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicy createGetPolicy() {
		GetPolicyImpl getPolicy = new GetPolicyImpl();
		return getPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyResponse createGetPolicyResponse() {
		GetPolicyResponseImpl getPolicyResponse = new GetPolicyResponseImpl();
		return getPolicyResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForPolicyAndSignerIds createGetPolicyStatesForPolicyAndSignerIds() {
		GetPolicyStatesForPolicyAndSignerIdsImpl getPolicyStatesForPolicyAndSignerIds = new GetPolicyStatesForPolicyAndSignerIdsImpl();
		return getPolicyStatesForPolicyAndSignerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForPolicyAndSignerIdsResponse createGetPolicyStatesForPolicyAndSignerIdsResponse() {
		GetPolicyStatesForPolicyAndSignerIdsResponseImpl getPolicyStatesForPolicyAndSignerIdsResponse = new GetPolicyStatesForPolicyAndSignerIdsResponseImpl();
		return getPolicyStatesForPolicyAndSignerIdsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForPolicyNameAndSignerIds createGetPolicyStatesForPolicyNameAndSignerIds() {
		GetPolicyStatesForPolicyNameAndSignerIdsImpl getPolicyStatesForPolicyNameAndSignerIds = new GetPolicyStatesForPolicyNameAndSignerIdsImpl();
		return getPolicyStatesForPolicyNameAndSignerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForPolicyNameAndSignerIdsResponse createGetPolicyStatesForPolicyNameAndSignerIdsResponse() {
		GetPolicyStatesForPolicyNameAndSignerIdsResponseImpl getPolicyStatesForPolicyNameAndSignerIdsResponse = new GetPolicyStatesForPolicyNameAndSignerIdsResponseImpl();
		return getPolicyStatesForPolicyNameAndSignerIdsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForSignerIds createGetPolicyStatesForSignerIds() {
		GetPolicyStatesForSignerIdsImpl getPolicyStatesForSignerIds = new GetPolicyStatesForSignerIdsImpl();
		return getPolicyStatesForSignerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForSignerIdsResponse createGetPolicyStatesForSignerIdsResponse() {
		GetPolicyStatesForSignerIdsResponseImpl getPolicyStatesForSignerIdsResponse = new GetPolicyStatesForSignerIdsResponseImpl();
		return getPolicyStatesForSignerIdsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetQCHistoryForConsent createGetQCHistoryForConsent() {
		GetQCHistoryForConsentImpl getQCHistoryForConsent = new GetQCHistoryForConsentImpl();
		return getQCHistoryForConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetQCHistoryForConsentResponse createGetQCHistoryForConsentResponse() {
		GetQCHistoryForConsentResponseImpl getQCHistoryForConsentResponse = new GetQCHistoryForConsentResponseImpl();
		return getQCHistoryForConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetQCProblemHistoryForQCProblem createGetQCProblemHistoryForQCProblem() {
		GetQCProblemHistoryForQCProblemImpl getQCProblemHistoryForQCProblem = new GetQCProblemHistoryForQCProblemImpl();
		return getQCProblemHistoryForQCProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetQCProblemHistoryForQCProblemResponse createGetQCProblemHistoryForQCProblemResponse() {
		GetQCProblemHistoryForQCProblemResponseImpl getQCProblemHistoryForQCProblemResponse = new GetQCProblemHistoryForQCProblemResponseImpl();
		return getQCProblemHistoryForQCProblemResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetSignerIdsForAlias createGetSignerIdsForAlias() {
		GetSignerIdsForAliasImpl getSignerIdsForAlias = new GetSignerIdsForAliasImpl();
		return getSignerIdsForAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetSignerIdsForAliasResponse createGetSignerIdsForAliasResponse() {
		GetSignerIdsForAliasResponseImpl getSignerIdsForAliasResponse = new GetSignerIdsForAliasResponseImpl();
		return getSignerIdsForAliasResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetSignerIdType createGetSignerIdType() {
		GetSignerIdTypeImpl getSignerIdType = new GetSignerIdTypeImpl();
		return getSignerIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetSignerIdTypeResponse createGetSignerIdTypeResponse() {
		GetSignerIdTypeResponseImpl getSignerIdTypeResponse = new GetSignerIdTypeResponseImpl();
		return getSignerIdTypeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTemplatesWithPolicies createGetTemplatesWithPolicies() {
		GetTemplatesWithPoliciesImpl getTemplatesWithPolicies = new GetTemplatesWithPoliciesImpl();
		return getTemplatesWithPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTemplatesWithPoliciesResponse createGetTemplatesWithPoliciesResponse() {
		GetTemplatesWithPoliciesResponseImpl getTemplatesWithPoliciesResponse = new GetTemplatesWithPoliciesResponseImpl();
		return getTemplatesWithPoliciesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashMap createHashMap() {
		HashMapImpl hashMap = new HashMapImpl();
		return hashMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException createIllegalArgumentException() {
		IllegalArgumentExceptionImpl illegalArgumentException = new IllegalArgumentExceptionImpl();
		return illegalArgumentException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InconsistentStatusException createInconsistentStatusException() {
		InconsistentStatusExceptionImpl inconsistentStatusException = new InconsistentStatusExceptionImpl();
		return inconsistentStatusException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalException createInternalException() {
		InternalExceptionImpl internalException = new InternalExceptionImpl();
		return internalException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidFreeTextException createInvalidFreeTextException() {
		InvalidFreeTextExceptionImpl invalidFreeTextException = new InvalidFreeTextExceptionImpl();
		return invalidFreeTextException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidParameterException createInvalidParameterException() {
		InvalidParameterExceptionImpl invalidParameterException = new InvalidParameterExceptionImpl();
		return invalidParameterException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidVersionException createInvalidVersionException() {
		InvalidVersionExceptionImpl invalidVersionException = new InvalidVersionExceptionImpl();
		return invalidVersionException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsented createIsConsented() {
		IsConsentedImpl isConsented = new IsConsentedImpl();
		return isConsented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromExcludingToExcluding createIsConsentedFromExcludingToExcluding() {
		IsConsentedFromExcludingToExcludingImpl isConsentedFromExcludingToExcluding = new IsConsentedFromExcludingToExcludingImpl();
		return isConsentedFromExcludingToExcluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromExcludingToExcludingResponse createIsConsentedFromExcludingToExcludingResponse() {
		IsConsentedFromExcludingToExcludingResponseImpl isConsentedFromExcludingToExcludingResponse = new IsConsentedFromExcludingToExcludingResponseImpl();
		return isConsentedFromExcludingToExcludingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromExcludingToIncluding createIsConsentedFromExcludingToIncluding() {
		IsConsentedFromExcludingToIncludingImpl isConsentedFromExcludingToIncluding = new IsConsentedFromExcludingToIncludingImpl();
		return isConsentedFromExcludingToIncluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromExcludingToIncludingResponse createIsConsentedFromExcludingToIncludingResponse() {
		IsConsentedFromExcludingToIncludingResponseImpl isConsentedFromExcludingToIncludingResponse = new IsConsentedFromExcludingToIncludingResponseImpl();
		return isConsentedFromExcludingToIncludingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromIncludingToExcluding createIsConsentedFromIncludingToExcluding() {
		IsConsentedFromIncludingToExcludingImpl isConsentedFromIncludingToExcluding = new IsConsentedFromIncludingToExcludingImpl();
		return isConsentedFromIncludingToExcluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromIncludingToExcludingResponse createIsConsentedFromIncludingToExcludingResponse() {
		IsConsentedFromIncludingToExcludingResponseImpl isConsentedFromIncludingToExcludingResponse = new IsConsentedFromIncludingToExcludingResponseImpl();
		return isConsentedFromIncludingToExcludingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromIncludingToIncluding createIsConsentedFromIncludingToIncluding() {
		IsConsentedFromIncludingToIncludingImpl isConsentedFromIncludingToIncluding = new IsConsentedFromIncludingToIncludingImpl();
		return isConsentedFromIncludingToIncluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromIncludingToIncludingResponse createIsConsentedFromIncludingToIncludingResponse() {
		IsConsentedFromIncludingToIncludingResponseImpl isConsentedFromIncludingToIncludingResponse = new IsConsentedFromIncludingToIncludingResponseImpl();
		return isConsentedFromIncludingToIncludingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedResponse createIsConsentedResponse() {
		IsConsentedResponseImpl isConsentedResponse = new IsConsentedResponseImpl();
		return isConsentedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListConsentTemplates createListConsentTemplates() {
		ListConsentTemplatesImpl listConsentTemplates = new ListConsentTemplatesImpl();
		return listConsentTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListConsentTemplatesResponse createListConsentTemplatesResponse() {
		ListConsentTemplatesResponseImpl listConsentTemplatesResponse = new ListConsentTemplatesResponseImpl();
		return listConsentTemplatesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListCurrentConsentTemplates createListCurrentConsentTemplates() {
		ListCurrentConsentTemplatesImpl listCurrentConsentTemplates = new ListCurrentConsentTemplatesImpl();
		return listCurrentConsentTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListCurrentConsentTemplatesResponse createListCurrentConsentTemplatesResponse() {
		ListCurrentConsentTemplatesResponseImpl listCurrentConsentTemplatesResponse = new ListCurrentConsentTemplatesResponseImpl();
		return listCurrentConsentTemplatesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListDomains createListDomains() {
		ListDomainsImpl listDomains = new ListDomainsImpl();
		return listDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListDomainsResponse createListDomainsResponse() {
		ListDomainsResponseImpl listDomainsResponse = new ListDomainsResponseImpl();
		return listDomainsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListModules createListModules() {
		ListModulesImpl listModules = new ListModulesImpl();
		return listModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListModulesResponse createListModulesResponse() {
		ListModulesResponseImpl listModulesResponse = new ListModulesResponseImpl();
		return listModulesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListPolicies createListPolicies() {
		ListPoliciesImpl listPolicies = new ListPoliciesImpl();
		return listPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListPoliciesResponse createListPoliciesResponse() {
		ListPoliciesResponseImpl listPoliciesResponse = new ListPoliciesResponseImpl();
		return listPoliciesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListSignerIdTypes createListSignerIdTypes() {
		ListSignerIdTypesImpl listSignerIdTypes = new ListSignerIdTypesImpl();
		return listSignerIdTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListSignerIdTypesResponse createListSignerIdTypesResponse() {
		ListSignerIdTypesResponseImpl listSignerIdTypesResponse = new ListSignerIdTypesResponseImpl();
		return listSignerIdTypesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryFieldsException createMandatoryFieldsException() {
		MandatoryFieldsExceptionImpl mandatoryFieldsException = new MandatoryFieldsExceptionImpl();
		return mandatoryFieldsException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissingRequiredObjectException createMissingRequiredObjectException() {
		MissingRequiredObjectExceptionImpl missingRequiredObjectException = new MissingRequiredObjectExceptionImpl();
		return missingRequiredObjectException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleDTO createModuleDTO() {
		ModuleDTOImpl moduleDTO = new ModuleDTOImpl();
		return moduleDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleExpirationsType createModuleExpirationsType() {
		ModuleExpirationsTypeImpl moduleExpirationsType = new ModuleExpirationsTypeImpl();
		return moduleExpirationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleKeyDTO createModuleKeyDTO() {
		ModuleKeyDTOImpl moduleKeyDTO = new ModuleKeyDTOImpl();
		return moduleKeyDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleKeyDTOArray createModuleKeyDTOArray() {
		ModuleKeyDTOArrayImpl moduleKeyDTOArray = new ModuleKeyDTOArrayImpl();
		return moduleKeyDTOArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleStateDTO createModuleStateDTO() {
		ModuleStateDTOImpl moduleStateDTO = new ModuleStateDTOImpl();
		return moduleStateDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleStatesType createModuleStatesType() {
		ModuleStatesTypeImpl moduleStatesType = new ModuleStatesTypeImpl();
		return moduleStatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyDTO createPolicyDTO() {
		PolicyDTOImpl policyDTO = new PolicyDTOImpl();
		return policyDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyExpirationsType createPolicyExpirationsType() {
		PolicyExpirationsTypeImpl policyExpirationsType = new PolicyExpirationsTypeImpl();
		return policyExpirationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyKeyDTO createPolicyKeyDTO() {
		PolicyKeyDTOImpl policyKeyDTO = new PolicyKeyDTOImpl();
		return policyKeyDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qcdto createQcdto() {
		QcdtoImpl qcdto = new QcdtoImpl();
		return qcdto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcHistoryDTO createQcHistoryDTO() {
		QcHistoryDTOImpl qcHistoryDTO = new QcHistoryDTOImpl();
		return qcHistoryDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcProblemDTO createQcProblemDTO() {
		QcProblemDTOImpl qcProblemDTO = new QcProblemDTOImpl();
		return qcProblemDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcProblemHistoryDTO createQcProblemHistoryDTO() {
		QcProblemHistoryDTOImpl qcProblemHistoryDTO = new QcProblemHistoryDTOImpl();
		return qcProblemHistoryDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCProblemType createQCProblemType() {
		QCProblemTypeImpl qcProblemType = new QCProblemTypeImpl();
		return qcProblemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCProblemTypeAction createQCProblemTypeAction() {
		QCProblemTypeActionImpl qcProblemTypeAction = new QCProblemTypeActionImpl();
		return qcProblemTypeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCType createQCType() {
		QCTypeImpl qcType = new QCTypeImpl();
		return qcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefuseConsent createRefuseConsent() {
		RefuseConsentImpl refuseConsent = new RefuseConsentImpl();
		return refuseConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefuseConsentResponse createRefuseConsentResponse() {
		RefuseConsentResponseImpl refuseConsentResponse = new RefuseConsentResponseImpl();
		return refuseConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveScanFromConsent createRemoveScanFromConsent() {
		RemoveScanFromConsentImpl removeScanFromConsent = new RemoveScanFromConsentImpl();
		return removeScanFromConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveScanFromConsentResponse createRemoveScanFromConsentResponse() {
		RemoveScanFromConsentResponseImpl removeScanFromConsentResponse = new RemoveScanFromConsentResponseImpl();
		return removeScanFromConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsNotFullfilledException createRequirementsNotFullfilledException() {
		RequirementsNotFullfilledExceptionImpl requirementsNotFullfilledException = new RequirementsNotFullfilledExceptionImpl();
		return requirementsNotFullfilledException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType1 createReturnType1() {
		ReturnType1Impl returnType1 = new ReturnType1Impl();
		return returnType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType2 createReturnType2() {
		ReturnType2Impl returnType2 = new ReturnType2Impl();
		return returnType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType3 createReturnType3() {
		ReturnType3Impl returnType3 = new ReturnType3Impl();
		return returnType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType4 createReturnType4() {
		ReturnType4Impl returnType4 = new ReturnType4Impl();
		return returnType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType5 createReturnType5() {
		ReturnType5Impl returnType5 = new ReturnType5Impl();
		return returnType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType6 createReturnType6() {
		ReturnType6Impl returnType6 = new ReturnType6Impl();
		return returnType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType7 createReturnType7() {
		ReturnType7Impl returnType7 = new ReturnType7Impl();
		return returnType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType8 createReturnType8() {
		ReturnType8Impl returnType8 = new ReturnType8Impl();
		return returnType8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType9 createReturnType9() {
		ReturnType9Impl returnType9 = new ReturnType9Impl();
		return returnType9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType10 createReturnType10() {
		ReturnType10Impl returnType10 = new ReturnType10Impl();
		return returnType10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType11 createReturnType11() {
		ReturnType11Impl returnType11 = new ReturnType11Impl();
		return returnType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType12 createReturnType12() {
		ReturnType12Impl returnType12 = new ReturnType12Impl();
		return returnType12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType13 createReturnType13() {
		ReturnType13Impl returnType13 = new ReturnType13Impl();
		return returnType13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType14 createReturnType14() {
		ReturnType14Impl returnType14 = new ReturnType14Impl();
		return returnType14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType15 createReturnType15() {
		ReturnType15Impl returnType15 = new ReturnType15Impl();
		return returnType15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType16 createReturnType16() {
		ReturnType16Impl returnType16 = new ReturnType16Impl();
		return returnType16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType17 createReturnType17() {
		ReturnType17Impl returnType17 = new ReturnType17Impl();
		return returnType17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType18 createReturnType18() {
		ReturnType18Impl returnType18 = new ReturnType18Impl();
		return returnType18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType19 createReturnType19() {
		ReturnType19Impl returnType19 = new ReturnType19Impl();
		return returnType19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType20 createReturnType20() {
		ReturnType20Impl returnType20 = new ReturnType20Impl();
		return returnType20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType21 createReturnType21() {
		ReturnType21Impl returnType21 = new ReturnType21Impl();
		return returnType21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType22 createReturnType22() {
		ReturnType22Impl returnType22 = new ReturnType22Impl();
		return returnType22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType23 createReturnType23() {
		ReturnType23Impl returnType23 = new ReturnType23Impl();
		return returnType23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetQCForConsent createSetQCForConsent() {
		SetQCForConsentImpl setQCForConsent = new SetQCForConsentImpl();
		return setQCForConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetQCForConsentResponse createSetQCForConsentResponse() {
		SetQCForConsentResponseImpl setQCForConsentResponse = new SetQCForConsentResponseImpl();
		return setQCForConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignedPolicyDTO createSignedPolicyDTO() {
		SignedPolicyDTOImpl signedPolicyDTO = new SignedPolicyDTOImpl();
		return signedPolicyDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignerIdDTO createSignerIdDTO() {
		SignerIdDTOImpl signerIdDTO = new SignerIdDTOImpl();
		return signerIdDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignerIdDTOArray createSignerIdDTOArray() {
		SignerIdDTOArrayImpl signerIdDTOArray = new SignerIdDTOArrayImpl();
		return signerIdDTOArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignerIdTypeDTO createSignerIdTypeDTO() {
		SignerIdTypeDTOImpl signerIdTypeDTO = new SignerIdTypeDTOImpl();
		return signerIdTypeDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownAliasException createUnknownAliasException() {
		UnknownAliasExceptionImpl unknownAliasException = new UnknownAliasExceptionImpl();
		return unknownAliasException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownConsentException createUnknownConsentException() {
		UnknownConsentExceptionImpl unknownConsentException = new UnknownConsentExceptionImpl();
		return unknownConsentException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownConsentTemplateException createUnknownConsentTemplateException() {
		UnknownConsentTemplateExceptionImpl unknownConsentTemplateException = new UnknownConsentTemplateExceptionImpl();
		return unknownConsentTemplateException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownDomainException createUnknownDomainException() {
		UnknownDomainExceptionImpl unknownDomainException = new UnknownDomainExceptionImpl();
		return unknownDomainException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownFhirIdObjectException createUnknownFhirIdObjectException() {
		UnknownFhirIdObjectExceptionImpl unknownFhirIdObjectException = new UnknownFhirIdObjectExceptionImpl();
		return unknownFhirIdObjectException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownIDException createUnknownIDException() {
		UnknownIDExceptionImpl unknownIDException = new UnknownIDExceptionImpl();
		return unknownIDException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownModuleException createUnknownModuleException() {
		UnknownModuleExceptionImpl unknownModuleException = new UnknownModuleExceptionImpl();
		return unknownModuleException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownPolicyException createUnknownPolicyException() {
		UnknownPolicyExceptionImpl unknownPolicyException = new UnknownPolicyExceptionImpl();
		return unknownPolicyException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownSignerIdException createUnknownSignerIdException() {
		UnknownSignerIdExceptionImpl unknownSignerIdException = new UnknownSignerIdExceptionImpl();
		return unknownSignerIdException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownSignerIdTypeException createUnknownSignerIdTypeException() {
		UnknownSignerIdTypeExceptionImpl unknownSignerIdTypeException = new UnknownSignerIdTypeExceptionImpl();
		return unknownSignerIdTypeException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateConsentInUse createUpdateConsentInUse() {
		UpdateConsentInUseImpl updateConsentInUse = new UpdateConsentInUseImpl();
		return updateConsentInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateConsentInUseResponse createUpdateConsentInUseResponse() {
		UpdateConsentInUseResponseImpl updateConsentInUseResponse = new UpdateConsentInUseResponseImpl();
		return updateConsentInUseResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidateConsent createValidateConsent() {
		ValidateConsentImpl validateConsent = new ValidateConsentImpl();
		return validateConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidateConsentResponse createValidateConsentResponse() {
		ValidateConsentResponseImpl validateConsentResponse = new ValidateConsentResponseImpl();
		return validateConsentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidFromPropertiesDTO createValidFromPropertiesDTO() {
		ValidFromPropertiesDTOImpl validFromPropertiesDTO = new ValidFromPropertiesDTOImpl();
		return validFromPropertiesDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatus createConsentStatusFromString(EDataType eDataType, String initialValue) {
		ConsentStatus result = ConsentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatusType createConsentStatusTypeFromString(EDataType eDataType, String initialValue) {
		ConsentStatusType result = ConsentStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentTemplateType createConsentTemplateTypeFromString(EDataType eDataType, String initialValue) {
		ConsentTemplateType result = ConsentTemplateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentTemplateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeTextType createFreeTextTypeFromString(EDataType eDataType, String initialValue) {
		FreeTextType result = FreeTextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreeTextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcProblemStatus createQcProblemStatusFromString(EDataType eDataType, String initialValue) {
		QcProblemStatus result = QcProblemStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcProblemStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcProblemTypeError createQcProblemTypeErrorFromString(EDataType eDataType, String initialValue) {
		QcProblemTypeError result = QcProblemTypeError.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcProblemTypeErrorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcProblemTypeField createQcProblemTypeFieldFromString(EDataType eDataType, String initialValue) {
		QcProblemTypeField result = QcProblemTypeField.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcProblemTypeFieldToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcProblemTypeOccurrence createQcProblemTypeOccurrenceFromString(EDataType eDataType, String initialValue) {
		QcProblemTypeOccurrence result = QcProblemTypeOccurrence.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcProblemTypeOccurrenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcTypeStatus createQcTypeStatusFromString(EDataType eDataType, String initialValue) {
		QcTypeStatus result = QcTypeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcTypeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatus createConsentStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentStatusFromString(Cm2Package.eINSTANCE.getConsentStatus(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentStatusToString(Cm2Package.eINSTANCE.getConsentStatus(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatusType createConsentStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentStatusTypeFromString(Cm2Package.eINSTANCE.getConsentStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentStatusTypeToString(Cm2Package.eINSTANCE.getConsentStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentTemplateType createConsentTemplateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentTemplateTypeFromString(Cm2Package.eINSTANCE.getConsentTemplateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentTemplateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentTemplateTypeToString(Cm2Package.eINSTANCE.getConsentTemplateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeTextType createFreeTextTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFreeTextTypeFromString(Cm2Package.eINSTANCE.getFreeTextType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreeTextTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFreeTextTypeToString(Cm2Package.eINSTANCE.getFreeTextType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcProblemStatus createQcProblemStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createQcProblemStatusFromString(Cm2Package.eINSTANCE.getQcProblemStatus(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcProblemStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQcProblemStatusToString(Cm2Package.eINSTANCE.getQcProblemStatus(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcProblemTypeError createQcProblemTypeErrorObjectFromString(EDataType eDataType, String initialValue) {
		return createQcProblemTypeErrorFromString(Cm2Package.eINSTANCE.getQcProblemTypeError(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcProblemTypeErrorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQcProblemTypeErrorToString(Cm2Package.eINSTANCE.getQcProblemTypeError(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcProblemTypeField createQcProblemTypeFieldObjectFromString(EDataType eDataType, String initialValue) {
		return createQcProblemTypeFieldFromString(Cm2Package.eINSTANCE.getQcProblemTypeField(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcProblemTypeFieldObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQcProblemTypeFieldToString(Cm2Package.eINSTANCE.getQcProblemTypeField(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcProblemTypeOccurrence createQcProblemTypeOccurrenceObjectFromString(EDataType eDataType, String initialValue) {
		return createQcProblemTypeOccurrenceFromString(Cm2Package.eINSTANCE.getQcProblemTypeOccurrence(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcProblemTypeOccurrenceObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQcProblemTypeOccurrenceToString(Cm2Package.eINSTANCE.getQcProblemTypeOccurrence(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcTypeStatus createQcTypeStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createQcTypeStatusFromString(Cm2Package.eINSTANCE.getQcTypeStatus(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQcTypeStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQcTypeStatusToString(Cm2Package.eINSTANCE.getQcTypeStatus(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cm2Package getCm2Package() {
		return (Cm2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cm2Package getPackage() {
		return Cm2Package.eINSTANCE;
	}

} //Cm2FactoryImpl
