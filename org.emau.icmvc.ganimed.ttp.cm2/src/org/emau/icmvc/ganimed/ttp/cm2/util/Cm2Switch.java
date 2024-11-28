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
package org.emau.icmvc.ganimed.ttp.cm2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package
 * @generated
 */
public class Cm2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cm2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cm2Switch() {
		if (modelPackage == null) {
			modelPackage = Cm2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Cm2Package.ABSTRACT_MAP: {
				AbstractMap abstractMap = (AbstractMap)theEObject;
				T result = caseAbstractMap(abstractMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_ALIAS: {
				AddAlias addAlias = (AddAlias)theEObject;
				T result = caseAddAlias(addAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_ALIAS_RESPONSE: {
				AddAliasResponse addAliasResponse = (AddAliasResponse)theEObject;
				T result = caseAddAliasResponse(addAliasResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_CONSENT: {
				AddConsent addConsent = (AddConsent)theEObject;
				T result = caseAddConsent(addConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_CONSENT_OPT_OUT: {
				AddConsentOptOut addConsentOptOut = (AddConsentOptOut)theEObject;
				T result = caseAddConsentOptOut(addConsentOptOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_CONSENT_OPT_OUT_RESPONSE: {
				AddConsentOptOutResponse addConsentOptOutResponse = (AddConsentOptOutResponse)theEObject;
				T result = caseAddConsentOptOutResponse(addConsentOptOutResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_CONSENT_RESPONSE: {
				AddConsentResponse addConsentResponse = (AddConsentResponse)theEObject;
				T result = caseAddConsentResponse(addConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_SCAN_TO_CONSENT: {
				AddScanToConsent addScanToConsent = (AddScanToConsent)theEObject;
				T result = caseAddScanToConsent(addScanToConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_SCAN_TO_CONSENT_RESPONSE: {
				AddScanToConsentResponse addScanToConsentResponse = (AddScanToConsentResponse)theEObject;
				T result = caseAddScanToConsentResponse(addScanToConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_SIGNER_ID_TO_CONSENT: {
				AddSignerIdToConsent addSignerIdToConsent = (AddSignerIdToConsent)theEObject;
				T result = caseAddSignerIdToConsent(addSignerIdToConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_SIGNER_ID_TO_CONSENT_RESPONSE: {
				AddSignerIdToConsentResponse addSignerIdToConsentResponse = (AddSignerIdToConsentResponse)theEObject;
				T result = caseAddSignerIdToConsentResponse(addSignerIdToConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID: {
				AddSignerIdToSignerId addSignerIdToSignerId = (AddSignerIdToSignerId)theEObject;
				T result = caseAddSignerIdToSignerId(addSignerIdToSignerId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE: {
				AddSignerIdToSignerIdResponse addSignerIdToSignerIdResponse = (AddSignerIdToSignerIdResponse)theEObject;
				T result = caseAddSignerIdToSignerIdResponse(addSignerIdToSignerIdResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ASSIGNED_MODULE_DTO: {
				AssignedModuleDTO assignedModuleDTO = (AssignedModuleDTO)theEObject;
				T result = caseAssignedModuleDTO(assignedModuleDTO);
				if (result == null) result = caseFhirIdDTO(assignedModuleDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ASSIGNED_POLICY_DTO: {
				AssignedPolicyDTO assignedPolicyDTO = (AssignedPolicyDTO)theEObject;
				T result = caseAssignedPolicyDTO(assignedPolicyDTO);
				if (result == null) result = caseFhirIdDTO(assignedPolicyDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CHILDREN_TYPE: {
				ChildrenType childrenType = (ChildrenType)theEObject;
				T result = caseChildrenType(childrenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CONSENT_DATE_VALUES_DTO: {
				ConsentDateValuesDTO consentDateValuesDTO = (ConsentDateValuesDTO)theEObject;
				T result = caseConsentDateValuesDTO(consentDateValuesDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CONSENT_DTO: {
				ConsentDTO consentDTO = (ConsentDTO)theEObject;
				T result = caseConsentDTO(consentDTO);
				if (result == null) result = caseConsentLightDTO(consentDTO);
				if (result == null) result = caseFhirIdDTO(consentDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CONSENT_KEY_DTO: {
				ConsentKeyDTO consentKeyDTO = (ConsentKeyDTO)theEObject;
				T result = caseConsentKeyDTO(consentKeyDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CONSENT_LIGHT_DTO: {
				ConsentLightDTO consentLightDTO = (ConsentLightDTO)theEObject;
				T result = caseConsentLightDTO(consentLightDTO);
				if (result == null) result = caseFhirIdDTO(consentLightDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CONSENT_SCAN_DTO: {
				ConsentScanDTO consentScanDTO = (ConsentScanDTO)theEObject;
				T result = caseConsentScanDTO(consentScanDTO);
				if (result == null) result = caseFhirIdDTO(consentScanDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CONSENT_TEMPLATE_DTO: {
				ConsentTemplateDTO consentTemplateDTO = (ConsentTemplateDTO)theEObject;
				T result = caseConsentTemplateDTO(consentTemplateDTO);
				if (result == null) result = caseFhirIdDTO(consentTemplateDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CONSENT_TEMPLATE_KEY_DTO: {
				ConsentTemplateKeyDTO consentTemplateKeyDTO = (ConsentTemplateKeyDTO)theEObject;
				T result = caseConsentTemplateKeyDTO(consentTemplateKeyDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.CONSENT_TEMPLATE_STRUCTURE_DTO: {
				ConsentTemplateStructureDTO consentTemplateStructureDTO = (ConsentTemplateStructureDTO)theEObject;
				T result = caseConsentTemplateStructureDTO(consentTemplateStructureDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER: {
				CountConsentsForDomainWithFilter countConsentsForDomainWithFilter = (CountConsentsForDomainWithFilter)theEObject;
				T result = caseCountConsentsForDomainWithFilter(countConsentsForDomainWithFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE: {
				CountConsentsForDomainWithFilterResponse countConsentsForDomainWithFilterResponse = (CountConsentsForDomainWithFilterResponse)theEObject;
				T result = caseCountConsentsForDomainWithFilterResponse(countConsentsForDomainWithFilterResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.COUNT_SIGNED_POLICIES: {
				CountSignedPolicies countSignedPolicies = (CountSignedPolicies)theEObject;
				T result = caseCountSignedPolicies(countSignedPolicies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.COUNT_SIGNED_POLICIES_RESPONSE: {
				CountSignedPoliciesResponse countSignedPoliciesResponse = (CountSignedPoliciesResponse)theEObject;
				T result = caseCountSignedPoliciesResponse(countSignedPoliciesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.DEACTIVATE_ALIAS: {
				DeactivateAlias deactivateAlias = (DeactivateAlias)theEObject;
				T result = caseDeactivateAlias(deactivateAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.DEACTIVATE_ALIAS_RESPONSE: {
				DeactivateAliasResponse deactivateAliasResponse = (DeactivateAliasResponse)theEObject;
				T result = caseDeactivateAliasResponse(deactivateAliasResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.DOMAIN_DTO: {
				DomainDTO domainDTO = (DomainDTO)theEObject;
				T result = caseDomainDTO(domainDTO);
				if (result == null) result = caseFhirIdDTO(domainDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.DUPLICATE_ENTRY_EXCEPTION: {
				DuplicateEntryException duplicateEntryException = (DuplicateEntryException)theEObject;
				T result = caseDuplicateEntryException(duplicateEntryException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ENTRY_TYPE: {
				EntryType entryType = (EntryType)theEObject;
				T result = caseEntryType(entryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ENTRY_TYPE1: {
				EntryType1 entryType1 = (EntryType1)theEObject;
				T result = caseEntryType1(entryType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ENTRY_TYPE2: {
				EntryType2 entryType2 = (EntryType2)theEObject;
				T result = caseEntryType2(entryType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ENTRY_TYPE3: {
				EntryType3 entryType3 = (EntryType3)theEObject;
				T result = caseEntryType3(entryType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ENTRY_TYPE4: {
				EntryType4 entryType4 = (EntryType4)theEObject;
				T result = caseEntryType4(entryType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.EXPIRATION_PROPERTIES_DTO: {
				ExpirationPropertiesDTO expirationPropertiesDTO = (ExpirationPropertiesDTO)theEObject;
				T result = caseExpirationPropertiesDTO(expirationPropertiesDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.FHIR_ID_DTO: {
				FhirIdDTO fhirIdDTO = (FhirIdDTO)theEObject;
				T result = caseFhirIdDTO(fhirIdDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.FREE_TEXT_DEF_DTO: {
				FreeTextDefDTO freeTextDefDTO = (FreeTextDefDTO)theEObject;
				T result = caseFreeTextDefDTO(freeTextDefDTO);
				if (result == null) result = caseFhirIdDTO(freeTextDefDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.FREE_TEXT_VAL_DTO: {
				FreeTextValDTO freeTextValDTO = (FreeTextValDTO)theEObject;
				T result = caseFreeTextValDTO(freeTextValDTO);
				if (result == null) result = caseFhirIdDTO(freeTextValDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALIASES_FOR_SIGNER_ID: {
				GetAliasesForSignerId getAliasesForSignerId = (GetAliasesForSignerId)theEObject;
				T result = caseGetAliasesForSignerId(getAliasesForSignerId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALIASES_FOR_SIGNER_ID_RESPONSE: {
				GetAliasesForSignerIdResponse getAliasesForSignerIdResponse = (GetAliasesForSignerIdResponse)theEObject;
				T result = caseGetAliasesForSignerIdResponse(getAliasesForSignerIdResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALIASES_FOR_SIGNER_IDS: {
				GetAliasesForSignerIds getAliasesForSignerIds = (GetAliasesForSignerIds)theEObject;
				T result = caseGetAliasesForSignerIds(getAliasesForSignerIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALIASES_FOR_SIGNER_IDS_RESPONSE: {
				GetAliasesForSignerIdsResponse getAliasesForSignerIdsResponse = (GetAliasesForSignerIdsResponse)theEObject;
				T result = caseGetAliasesForSignerIdsResponse(getAliasesForSignerIdsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR: {
				GetAllConsentedIdsFor getAllConsentedIdsFor = (GetAllConsentedIdsFor)theEObject;
				T result = caseGetAllConsentedIdsFor(getAllConsentedIdsFor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR_RESPONSE: {
				GetAllConsentedIdsForResponse getAllConsentedIdsForResponse = (GetAllConsentedIdsForResponse)theEObject;
				T result = caseGetAllConsentedIdsForResponse(getAllConsentedIdsForResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE: {
				GetAllConsentsForConsentTemplate getAllConsentsForConsentTemplate = (GetAllConsentsForConsentTemplate)theEObject;
				T result = caseGetAllConsentsForConsentTemplate(getAllConsentsForConsentTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE: {
				GetAllConsentsForConsentTemplateResponse getAllConsentsForConsentTemplateResponse = (GetAllConsentsForConsentTemplateResponse)theEObject;
				T result = caseGetAllConsentsForConsentTemplateResponse(getAllConsentsForConsentTemplateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTS_FOR_DOMAIN: {
				GetAllConsentsForDomain getAllConsentsForDomain = (GetAllConsentsForDomain)theEObject;
				T result = caseGetAllConsentsForDomain(getAllConsentsForDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE: {
				GetAllConsentsForDomainResponse getAllConsentsForDomainResponse = (GetAllConsentsForDomainResponse)theEObject;
				T result = caseGetAllConsentsForDomainResponse(getAllConsentsForDomainResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN: {
				GetAllConsentsForDomainWithoutScan getAllConsentsForDomainWithoutScan = (GetAllConsentsForDomainWithoutScan)theEObject;
				T result = caseGetAllConsentsForDomainWithoutScan(getAllConsentsForDomainWithoutScan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE: {
				GetAllConsentsForDomainWithoutScanResponse getAllConsentsForDomainWithoutScanResponse = (GetAllConsentsForDomainWithoutScanResponse)theEObject;
				T result = caseGetAllConsentsForDomainWithoutScanResponse(getAllConsentsForDomainWithoutScanResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTS_FOR_SIGNER_IDS: {
				GetAllConsentsForSignerIds getAllConsentsForSignerIds = (GetAllConsentsForSignerIds)theEObject;
				T result = caseGetAllConsentsForSignerIds(getAllConsentsForSignerIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE: {
				GetAllConsentsForSignerIdsResponse getAllConsentsForSignerIdsResponse = (GetAllConsentsForSignerIdsResponse)theEObject;
				T result = caseGetAllConsentsForSignerIdsResponse(getAllConsentsForSignerIdsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_IDS_FOR_SIGNER_ID_TYPE: {
				GetAllIdsForSignerIdType getAllIdsForSignerIdType = (GetAllIdsForSignerIdType)theEObject;
				T result = caseGetAllIdsForSignerIdType(getAllIdsForSignerIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE: {
				GetAllIdsForSignerIdTypeResponse getAllIdsForSignerIdTypeResponse = (GetAllIdsForSignerIdTypeResponse)theEObject;
				T result = caseGetAllIdsForSignerIdTypeResponse(getAllIdsForSignerIdTypeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT: {
				GetConsent getConsent = (GetConsent)theEObject;
				T result = caseGetConsent(getConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_DATES: {
				GetConsentDates getConsentDates = (GetConsentDates)theEObject;
				T result = caseGetConsentDates(getConsentDates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_DATES_RESPONSE: {
				GetConsentDatesResponse getConsentDatesResponse = (GetConsentDatesResponse)theEObject;
				T result = caseGetConsentDatesResponse(getConsentDatesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_LIGHT: {
				GetConsentLight getConsentLight = (GetConsentLight)theEObject;
				T result = caseGetConsentLight(getConsentLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_LIGHT_RESPONSE: {
				GetConsentLightResponse getConsentLightResponse = (GetConsentLightResponse)theEObject;
				T result = caseGetConsentLightResponse(getConsentLightResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_RESPONSE: {
				GetConsentResponse getConsentResponse = (GetConsentResponse)theEObject;
				T result = caseGetConsentResponse(getConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENTS_FOR_DOMAIN_PAGINATED: {
				GetConsentsForDomainPaginated getConsentsForDomainPaginated = (GetConsentsForDomainPaginated)theEObject;
				T result = caseGetConsentsForDomainPaginated(getConsentsForDomainPaginated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE: {
				GetConsentsForDomainPaginatedResponse getConsentsForDomainPaginatedResponse = (GetConsentsForDomainPaginatedResponse)theEObject;
				T result = caseGetConsentsForDomainPaginatedResponse(getConsentsForDomainPaginatedResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE: {
				GetConsentStatusType getConsentStatusType = (GetConsentStatusType)theEObject;
				T result = caseGetConsentStatusType(getConsentStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING: {
				GetConsentStatusTypeFromExcludingToExcluding getConsentStatusTypeFromExcludingToExcluding = (GetConsentStatusTypeFromExcludingToExcluding)theEObject;
				T result = caseGetConsentStatusTypeFromExcludingToExcluding(getConsentStatusTypeFromExcludingToExcluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE: {
				GetConsentStatusTypeFromExcludingToExcludingResponse getConsentStatusTypeFromExcludingToExcludingResponse = (GetConsentStatusTypeFromExcludingToExcludingResponse)theEObject;
				T result = caseGetConsentStatusTypeFromExcludingToExcludingResponse(getConsentStatusTypeFromExcludingToExcludingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING: {
				GetConsentStatusTypeFromExcludingToIncluding getConsentStatusTypeFromExcludingToIncluding = (GetConsentStatusTypeFromExcludingToIncluding)theEObject;
				T result = caseGetConsentStatusTypeFromExcludingToIncluding(getConsentStatusTypeFromExcludingToIncluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE: {
				GetConsentStatusTypeFromExcludingToIncludingResponse getConsentStatusTypeFromExcludingToIncludingResponse = (GetConsentStatusTypeFromExcludingToIncludingResponse)theEObject;
				T result = caseGetConsentStatusTypeFromExcludingToIncludingResponse(getConsentStatusTypeFromExcludingToIncludingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING: {
				GetConsentStatusTypeFromIncludingToExcluding getConsentStatusTypeFromIncludingToExcluding = (GetConsentStatusTypeFromIncludingToExcluding)theEObject;
				T result = caseGetConsentStatusTypeFromIncludingToExcluding(getConsentStatusTypeFromIncludingToExcluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE: {
				GetConsentStatusTypeFromIncludingToExcludingResponse getConsentStatusTypeFromIncludingToExcludingResponse = (GetConsentStatusTypeFromIncludingToExcludingResponse)theEObject;
				T result = caseGetConsentStatusTypeFromIncludingToExcludingResponse(getConsentStatusTypeFromIncludingToExcludingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING: {
				GetConsentStatusTypeFromIncludingToIncluding getConsentStatusTypeFromIncludingToIncluding = (GetConsentStatusTypeFromIncludingToIncluding)theEObject;
				T result = caseGetConsentStatusTypeFromIncludingToIncluding(getConsentStatusTypeFromIncludingToIncluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE: {
				GetConsentStatusTypeFromIncludingToIncludingResponse getConsentStatusTypeFromIncludingToIncludingResponse = (GetConsentStatusTypeFromIncludingToIncludingResponse)theEObject;
				T result = caseGetConsentStatusTypeFromIncludingToIncludingResponse(getConsentStatusTypeFromIncludingToIncludingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_STATUS_TYPE_RESPONSE: {
				GetConsentStatusTypeResponse getConsentStatusTypeResponse = (GetConsentStatusTypeResponse)theEObject;
				T result = caseGetConsentStatusTypeResponse(getConsentStatusTypeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_TEMPLATE: {
				GetConsentTemplate getConsentTemplate = (GetConsentTemplate)theEObject;
				T result = caseGetConsentTemplate(getConsentTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CONSENT_TEMPLATE_RESPONSE: {
				GetConsentTemplateResponse getConsentTemplateResponse = (GetConsentTemplateResponse)theEObject;
				T result = caseGetConsentTemplateResponse(getConsentTemplateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT: {
				GetCurrentConsentForSignerIdsAndCT getCurrentConsentForSignerIdsAndCT = (GetCurrentConsentForSignerIdsAndCT)theEObject;
				T result = caseGetCurrentConsentForSignerIdsAndCT(getCurrentConsentForSignerIdsAndCT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE: {
				GetCurrentConsentForSignerIdsAndCTResponse getCurrentConsentForSignerIdsAndCTResponse = (GetCurrentConsentForSignerIdsAndCTResponse)theEObject;
				T result = caseGetCurrentConsentForSignerIdsAndCTResponse(getCurrentConsentForSignerIdsAndCTResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE: {
				GetCurrentConsentTemplate getCurrentConsentTemplate = (GetCurrentConsentTemplate)theEObject;
				T result = caseGetCurrentConsentTemplate(getCurrentConsentTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE_RESPONSE: {
				GetCurrentConsentTemplateResponse getCurrentConsentTemplateResponse = (GetCurrentConsentTemplateResponse)theEObject;
				T result = caseGetCurrentConsentTemplateResponse(getCurrentConsentTemplateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS: {
				GetCurrentPolicyStatesForSignerIds getCurrentPolicyStatesForSignerIds = (GetCurrentPolicyStatesForSignerIds)theEObject;
				T result = caseGetCurrentPolicyStatesForSignerIds(getCurrentPolicyStatesForSignerIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE: {
				GetCurrentPolicyStatesForSignerIdsResponse getCurrentPolicyStatesForSignerIdsResponse = (GetCurrentPolicyStatesForSignerIdsResponse)theEObject;
				T result = caseGetCurrentPolicyStatesForSignerIdsResponse(getCurrentPolicyStatesForSignerIdsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_DOMAIN: {
				GetDomain getDomain = (GetDomain)theEObject;
				T result = caseGetDomain(getDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_DOMAIN_RESPONSE: {
				GetDomainResponse getDomainResponse = (GetDomainResponse)theEObject;
				T result = caseGetDomainResponse(getDomainResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID: {
				GetMappedTemplatesForSignerId getMappedTemplatesForSignerId = (GetMappedTemplatesForSignerId)theEObject;
				T result = caseGetMappedTemplatesForSignerId(getMappedTemplatesForSignerId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE: {
				GetMappedTemplatesForSignerIdResponse getMappedTemplatesForSignerIdResponse = (GetMappedTemplatesForSignerIdResponse)theEObject;
				T result = caseGetMappedTemplatesForSignerIdResponse(getMappedTemplatesForSignerIdResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_MODULE: {
				GetModule getModule = (GetModule)theEObject;
				T result = caseGetModule(getModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_MODULE_RESPONSE: {
				GetModuleResponse getModuleResponse = (GetModuleResponse)theEObject;
				T result = caseGetModuleResponse(getModuleResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_OBJECT_BY_FHIR_ID: {
				GetObjectByFhirID getObjectByFhirID = (GetObjectByFhirID)theEObject;
				T result = caseGetObjectByFhirID(getObjectByFhirID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_OBJECT_BY_FHIR_ID_RESPONSE: {
				GetObjectByFhirIDResponse getObjectByFhirIDResponse = (GetObjectByFhirIDResponse)theEObject;
				T result = caseGetObjectByFhirIDResponse(getObjectByFhirIDResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_POLICY: {
				GetPolicy getPolicy = (GetPolicy)theEObject;
				T result = caseGetPolicy(getPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_POLICY_RESPONSE: {
				GetPolicyResponse getPolicyResponse = (GetPolicyResponse)theEObject;
				T result = caseGetPolicyResponse(getPolicyResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS: {
				GetPolicyStatesForPolicyAndSignerIds getPolicyStatesForPolicyAndSignerIds = (GetPolicyStatesForPolicyAndSignerIds)theEObject;
				T result = caseGetPolicyStatesForPolicyAndSignerIds(getPolicyStatesForPolicyAndSignerIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE: {
				GetPolicyStatesForPolicyAndSignerIdsResponse getPolicyStatesForPolicyAndSignerIdsResponse = (GetPolicyStatesForPolicyAndSignerIdsResponse)theEObject;
				T result = caseGetPolicyStatesForPolicyAndSignerIdsResponse(getPolicyStatesForPolicyAndSignerIdsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS: {
				GetPolicyStatesForPolicyNameAndSignerIds getPolicyStatesForPolicyNameAndSignerIds = (GetPolicyStatesForPolicyNameAndSignerIds)theEObject;
				T result = caseGetPolicyStatesForPolicyNameAndSignerIds(getPolicyStatesForPolicyNameAndSignerIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE: {
				GetPolicyStatesForPolicyNameAndSignerIdsResponse getPolicyStatesForPolicyNameAndSignerIdsResponse = (GetPolicyStatesForPolicyNameAndSignerIdsResponse)theEObject;
				T result = caseGetPolicyStatesForPolicyNameAndSignerIdsResponse(getPolicyStatesForPolicyNameAndSignerIdsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_POLICY_STATES_FOR_SIGNER_IDS: {
				GetPolicyStatesForSignerIds getPolicyStatesForSignerIds = (GetPolicyStatesForSignerIds)theEObject;
				T result = caseGetPolicyStatesForSignerIds(getPolicyStatesForSignerIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE: {
				GetPolicyStatesForSignerIdsResponse getPolicyStatesForSignerIdsResponse = (GetPolicyStatesForSignerIdsResponse)theEObject;
				T result = caseGetPolicyStatesForSignerIdsResponse(getPolicyStatesForSignerIdsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_QC_HISTORY_FOR_CONSENT: {
				GetQCHistoryForConsent getQCHistoryForConsent = (GetQCHistoryForConsent)theEObject;
				T result = caseGetQCHistoryForConsent(getQCHistoryForConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_QC_HISTORY_FOR_CONSENT_RESPONSE: {
				GetQCHistoryForConsentResponse getQCHistoryForConsentResponse = (GetQCHistoryForConsentResponse)theEObject;
				T result = caseGetQCHistoryForConsentResponse(getQCHistoryForConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM: {
				GetQCProblemHistoryForQCProblem getQCProblemHistoryForQCProblem = (GetQCProblemHistoryForQCProblem)theEObject;
				T result = caseGetQCProblemHistoryForQCProblem(getQCProblemHistoryForQCProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE: {
				GetQCProblemHistoryForQCProblemResponse getQCProblemHistoryForQCProblemResponse = (GetQCProblemHistoryForQCProblemResponse)theEObject;
				T result = caseGetQCProblemHistoryForQCProblemResponse(getQCProblemHistoryForQCProblemResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_SIGNER_IDS_FOR_ALIAS: {
				GetSignerIdsForAlias getSignerIdsForAlias = (GetSignerIdsForAlias)theEObject;
				T result = caseGetSignerIdsForAlias(getSignerIdsForAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_SIGNER_IDS_FOR_ALIAS_RESPONSE: {
				GetSignerIdsForAliasResponse getSignerIdsForAliasResponse = (GetSignerIdsForAliasResponse)theEObject;
				T result = caseGetSignerIdsForAliasResponse(getSignerIdsForAliasResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_SIGNER_ID_TYPE: {
				GetSignerIdType getSignerIdType = (GetSignerIdType)theEObject;
				T result = caseGetSignerIdType(getSignerIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_SIGNER_ID_TYPE_RESPONSE: {
				GetSignerIdTypeResponse getSignerIdTypeResponse = (GetSignerIdTypeResponse)theEObject;
				T result = caseGetSignerIdTypeResponse(getSignerIdTypeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES: {
				GetTemplatesWithPolicies getTemplatesWithPolicies = (GetTemplatesWithPolicies)theEObject;
				T result = caseGetTemplatesWithPolicies(getTemplatesWithPolicies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES_RESPONSE: {
				GetTemplatesWithPoliciesResponse getTemplatesWithPoliciesResponse = (GetTemplatesWithPoliciesResponse)theEObject;
				T result = caseGetTemplatesWithPoliciesResponse(getTemplatesWithPoliciesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.HASH_MAP: {
				HashMap hashMap = (HashMap)theEObject;
				T result = caseHashMap(hashMap);
				if (result == null) result = caseAbstractMap(hashMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.ILLEGAL_ARGUMENT_EXCEPTION: {
				org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException illegalArgumentException = (org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException)theEObject;
				T result = caseIllegalArgumentException(illegalArgumentException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.INCONSISTENT_STATUS_EXCEPTION: {
				InconsistentStatusException inconsistentStatusException = (InconsistentStatusException)theEObject;
				T result = caseInconsistentStatusException(inconsistentStatusException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.INTERNAL_EXCEPTION: {
				InternalException internalException = (InternalException)theEObject;
				T result = caseInternalException(internalException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.INVALID_FREE_TEXT_EXCEPTION: {
				InvalidFreeTextException invalidFreeTextException = (InvalidFreeTextException)theEObject;
				T result = caseInvalidFreeTextException(invalidFreeTextException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.INVALID_PARAMETER_EXCEPTION: {
				InvalidParameterException invalidParameterException = (InvalidParameterException)theEObject;
				T result = caseInvalidParameterException(invalidParameterException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.INVALID_VERSION_EXCEPTION: {
				InvalidVersionException invalidVersionException = (InvalidVersionException)theEObject;
				T result = caseInvalidVersionException(invalidVersionException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED: {
				IsConsented isConsented = (IsConsented)theEObject;
				T result = caseIsConsented(isConsented);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING: {
				IsConsentedFromExcludingToExcluding isConsentedFromExcludingToExcluding = (IsConsentedFromExcludingToExcluding)theEObject;
				T result = caseIsConsentedFromExcludingToExcluding(isConsentedFromExcludingToExcluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE: {
				IsConsentedFromExcludingToExcludingResponse isConsentedFromExcludingToExcludingResponse = (IsConsentedFromExcludingToExcludingResponse)theEObject;
				T result = caseIsConsentedFromExcludingToExcludingResponse(isConsentedFromExcludingToExcludingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING: {
				IsConsentedFromExcludingToIncluding isConsentedFromExcludingToIncluding = (IsConsentedFromExcludingToIncluding)theEObject;
				T result = caseIsConsentedFromExcludingToIncluding(isConsentedFromExcludingToIncluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE: {
				IsConsentedFromExcludingToIncludingResponse isConsentedFromExcludingToIncludingResponse = (IsConsentedFromExcludingToIncludingResponse)theEObject;
				T result = caseIsConsentedFromExcludingToIncludingResponse(isConsentedFromExcludingToIncludingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING: {
				IsConsentedFromIncludingToExcluding isConsentedFromIncludingToExcluding = (IsConsentedFromIncludingToExcluding)theEObject;
				T result = caseIsConsentedFromIncludingToExcluding(isConsentedFromIncludingToExcluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE: {
				IsConsentedFromIncludingToExcludingResponse isConsentedFromIncludingToExcludingResponse = (IsConsentedFromIncludingToExcludingResponse)theEObject;
				T result = caseIsConsentedFromIncludingToExcludingResponse(isConsentedFromIncludingToExcludingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING: {
				IsConsentedFromIncludingToIncluding isConsentedFromIncludingToIncluding = (IsConsentedFromIncludingToIncluding)theEObject;
				T result = caseIsConsentedFromIncludingToIncluding(isConsentedFromIncludingToIncluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE: {
				IsConsentedFromIncludingToIncludingResponse isConsentedFromIncludingToIncludingResponse = (IsConsentedFromIncludingToIncludingResponse)theEObject;
				T result = caseIsConsentedFromIncludingToIncludingResponse(isConsentedFromIncludingToIncludingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.IS_CONSENTED_RESPONSE: {
				IsConsentedResponse isConsentedResponse = (IsConsentedResponse)theEObject;
				T result = caseIsConsentedResponse(isConsentedResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_CONSENT_TEMPLATES: {
				ListConsentTemplates listConsentTemplates = (ListConsentTemplates)theEObject;
				T result = caseListConsentTemplates(listConsentTemplates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_CONSENT_TEMPLATES_RESPONSE: {
				ListConsentTemplatesResponse listConsentTemplatesResponse = (ListConsentTemplatesResponse)theEObject;
				T result = caseListConsentTemplatesResponse(listConsentTemplatesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_CURRENT_CONSENT_TEMPLATES: {
				ListCurrentConsentTemplates listCurrentConsentTemplates = (ListCurrentConsentTemplates)theEObject;
				T result = caseListCurrentConsentTemplates(listCurrentConsentTemplates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE: {
				ListCurrentConsentTemplatesResponse listCurrentConsentTemplatesResponse = (ListCurrentConsentTemplatesResponse)theEObject;
				T result = caseListCurrentConsentTemplatesResponse(listCurrentConsentTemplatesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_DOMAINS: {
				ListDomains listDomains = (ListDomains)theEObject;
				T result = caseListDomains(listDomains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_DOMAINS_RESPONSE: {
				ListDomainsResponse listDomainsResponse = (ListDomainsResponse)theEObject;
				T result = caseListDomainsResponse(listDomainsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_MODULES: {
				ListModules listModules = (ListModules)theEObject;
				T result = caseListModules(listModules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_MODULES_RESPONSE: {
				ListModulesResponse listModulesResponse = (ListModulesResponse)theEObject;
				T result = caseListModulesResponse(listModulesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_POLICIES: {
				ListPolicies listPolicies = (ListPolicies)theEObject;
				T result = caseListPolicies(listPolicies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_POLICIES_RESPONSE: {
				ListPoliciesResponse listPoliciesResponse = (ListPoliciesResponse)theEObject;
				T result = caseListPoliciesResponse(listPoliciesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_SIGNER_ID_TYPES: {
				ListSignerIdTypes listSignerIdTypes = (ListSignerIdTypes)theEObject;
				T result = caseListSignerIdTypes(listSignerIdTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.LIST_SIGNER_ID_TYPES_RESPONSE: {
				ListSignerIdTypesResponse listSignerIdTypesResponse = (ListSignerIdTypesResponse)theEObject;
				T result = caseListSignerIdTypesResponse(listSignerIdTypesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.MANDATORY_FIELDS_EXCEPTION: {
				MandatoryFieldsException mandatoryFieldsException = (MandatoryFieldsException)theEObject;
				T result = caseMandatoryFieldsException(mandatoryFieldsException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.MISSING_REQUIRED_OBJECT_EXCEPTION: {
				MissingRequiredObjectException missingRequiredObjectException = (MissingRequiredObjectException)theEObject;
				T result = caseMissingRequiredObjectException(missingRequiredObjectException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.MODULE_DTO: {
				ModuleDTO moduleDTO = (ModuleDTO)theEObject;
				T result = caseModuleDTO(moduleDTO);
				if (result == null) result = caseFhirIdDTO(moduleDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.MODULE_EXPIRATIONS_TYPE: {
				ModuleExpirationsType moduleExpirationsType = (ModuleExpirationsType)theEObject;
				T result = caseModuleExpirationsType(moduleExpirationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.MODULE_KEY_DTO: {
				ModuleKeyDTO moduleKeyDTO = (ModuleKeyDTO)theEObject;
				T result = caseModuleKeyDTO(moduleKeyDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.MODULE_KEY_DTO_ARRAY: {
				ModuleKeyDTOArray moduleKeyDTOArray = (ModuleKeyDTOArray)theEObject;
				T result = caseModuleKeyDTOArray(moduleKeyDTOArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.MODULE_STATE_DTO: {
				ModuleStateDTO moduleStateDTO = (ModuleStateDTO)theEObject;
				T result = caseModuleStateDTO(moduleStateDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.MODULE_STATES_TYPE: {
				ModuleStatesType moduleStatesType = (ModuleStatesType)theEObject;
				T result = caseModuleStatesType(moduleStatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.POLICY_DTO: {
				PolicyDTO policyDTO = (PolicyDTO)theEObject;
				T result = casePolicyDTO(policyDTO);
				if (result == null) result = caseFhirIdDTO(policyDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.POLICY_EXPIRATIONS_TYPE: {
				PolicyExpirationsType policyExpirationsType = (PolicyExpirationsType)theEObject;
				T result = casePolicyExpirationsType(policyExpirationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.POLICY_KEY_DTO: {
				PolicyKeyDTO policyKeyDTO = (PolicyKeyDTO)theEObject;
				T result = casePolicyKeyDTO(policyKeyDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.QCDTO: {
				Qcdto qcdto = (Qcdto)theEObject;
				T result = caseQcdto(qcdto);
				if (result == null) result = caseFhirIdDTO(qcdto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.QC_HISTORY_DTO: {
				QcHistoryDTO qcHistoryDTO = (QcHistoryDTO)theEObject;
				T result = caseQcHistoryDTO(qcHistoryDTO);
				if (result == null) result = caseQcdto(qcHistoryDTO);
				if (result == null) result = caseFhirIdDTO(qcHistoryDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.QC_PROBLEM_DTO: {
				QcProblemDTO qcProblemDTO = (QcProblemDTO)theEObject;
				T result = caseQcProblemDTO(qcProblemDTO);
				if (result == null) result = caseFhirIdDTO(qcProblemDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.QC_PROBLEM_HISTORY_DTO: {
				QcProblemHistoryDTO qcProblemHistoryDTO = (QcProblemHistoryDTO)theEObject;
				T result = caseQcProblemHistoryDTO(qcProblemHistoryDTO);
				if (result == null) result = caseQcProblemDTO(qcProblemHistoryDTO);
				if (result == null) result = caseFhirIdDTO(qcProblemHistoryDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.QC_PROBLEM_TYPE: {
				QCProblemType qcProblemType = (QCProblemType)theEObject;
				T result = caseQCProblemType(qcProblemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.QC_PROBLEM_TYPE_ACTION: {
				QCProblemTypeAction qcProblemTypeAction = (QCProblemTypeAction)theEObject;
				T result = caseQCProblemTypeAction(qcProblemTypeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.QC_TYPE: {
				QCType qcType = (QCType)theEObject;
				T result = caseQCType(qcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.REFUSE_CONSENT: {
				RefuseConsent refuseConsent = (RefuseConsent)theEObject;
				T result = caseRefuseConsent(refuseConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.REFUSE_CONSENT_RESPONSE: {
				RefuseConsentResponse refuseConsentResponse = (RefuseConsentResponse)theEObject;
				T result = caseRefuseConsentResponse(refuseConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT: {
				RemoveScanFromConsent removeScanFromConsent = (RemoveScanFromConsent)theEObject;
				T result = caseRemoveScanFromConsent(removeScanFromConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT_RESPONSE: {
				RemoveScanFromConsentResponse removeScanFromConsentResponse = (RemoveScanFromConsentResponse)theEObject;
				T result = caseRemoveScanFromConsentResponse(removeScanFromConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.REQUIREMENTS_NOT_FULLFILLED_EXCEPTION: {
				RequirementsNotFullfilledException requirementsNotFullfilledException = (RequirementsNotFullfilledException)theEObject;
				T result = caseRequirementsNotFullfilledException(requirementsNotFullfilledException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE: {
				ReturnType returnType = (ReturnType)theEObject;
				T result = caseReturnType(returnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE1: {
				ReturnType1 returnType1 = (ReturnType1)theEObject;
				T result = caseReturnType1(returnType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE2: {
				ReturnType2 returnType2 = (ReturnType2)theEObject;
				T result = caseReturnType2(returnType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE3: {
				ReturnType3 returnType3 = (ReturnType3)theEObject;
				T result = caseReturnType3(returnType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE4: {
				ReturnType4 returnType4 = (ReturnType4)theEObject;
				T result = caseReturnType4(returnType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE5: {
				ReturnType5 returnType5 = (ReturnType5)theEObject;
				T result = caseReturnType5(returnType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE6: {
				ReturnType6 returnType6 = (ReturnType6)theEObject;
				T result = caseReturnType6(returnType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE7: {
				ReturnType7 returnType7 = (ReturnType7)theEObject;
				T result = caseReturnType7(returnType7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE8: {
				ReturnType8 returnType8 = (ReturnType8)theEObject;
				T result = caseReturnType8(returnType8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE9: {
				ReturnType9 returnType9 = (ReturnType9)theEObject;
				T result = caseReturnType9(returnType9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE10: {
				ReturnType10 returnType10 = (ReturnType10)theEObject;
				T result = caseReturnType10(returnType10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE11: {
				ReturnType11 returnType11 = (ReturnType11)theEObject;
				T result = caseReturnType11(returnType11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE12: {
				ReturnType12 returnType12 = (ReturnType12)theEObject;
				T result = caseReturnType12(returnType12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE13: {
				ReturnType13 returnType13 = (ReturnType13)theEObject;
				T result = caseReturnType13(returnType13);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE14: {
				ReturnType14 returnType14 = (ReturnType14)theEObject;
				T result = caseReturnType14(returnType14);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE15: {
				ReturnType15 returnType15 = (ReturnType15)theEObject;
				T result = caseReturnType15(returnType15);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE16: {
				ReturnType16 returnType16 = (ReturnType16)theEObject;
				T result = caseReturnType16(returnType16);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE17: {
				ReturnType17 returnType17 = (ReturnType17)theEObject;
				T result = caseReturnType17(returnType17);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE18: {
				ReturnType18 returnType18 = (ReturnType18)theEObject;
				T result = caseReturnType18(returnType18);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE19: {
				ReturnType19 returnType19 = (ReturnType19)theEObject;
				T result = caseReturnType19(returnType19);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE20: {
				ReturnType20 returnType20 = (ReturnType20)theEObject;
				T result = caseReturnType20(returnType20);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE21: {
				ReturnType21 returnType21 = (ReturnType21)theEObject;
				T result = caseReturnType21(returnType21);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE22: {
				ReturnType22 returnType22 = (ReturnType22)theEObject;
				T result = caseReturnType22(returnType22);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.RETURN_TYPE23: {
				ReturnType23 returnType23 = (ReturnType23)theEObject;
				T result = caseReturnType23(returnType23);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.SET_QC_FOR_CONSENT: {
				SetQCForConsent setQCForConsent = (SetQCForConsent)theEObject;
				T result = caseSetQCForConsent(setQCForConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.SET_QC_FOR_CONSENT_RESPONSE: {
				SetQCForConsentResponse setQCForConsentResponse = (SetQCForConsentResponse)theEObject;
				T result = caseSetQCForConsentResponse(setQCForConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.SIGNED_POLICY_DTO: {
				SignedPolicyDTO signedPolicyDTO = (SignedPolicyDTO)theEObject;
				T result = caseSignedPolicyDTO(signedPolicyDTO);
				if (result == null) result = caseFhirIdDTO(signedPolicyDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.SIGNER_ID_DTO: {
				SignerIdDTO signerIdDTO = (SignerIdDTO)theEObject;
				T result = caseSignerIdDTO(signerIdDTO);
				if (result == null) result = caseFhirIdDTO(signerIdDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.SIGNER_ID_DTO_ARRAY: {
				SignerIdDTOArray signerIdDTOArray = (SignerIdDTOArray)theEObject;
				T result = caseSignerIdDTOArray(signerIdDTOArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.SIGNER_ID_TYPE_DTO: {
				SignerIdTypeDTO signerIdTypeDTO = (SignerIdTypeDTO)theEObject;
				T result = caseSignerIdTypeDTO(signerIdTypeDTO);
				if (result == null) result = caseFhirIdDTO(signerIdTypeDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_ALIAS_EXCEPTION: {
				UnknownAliasException unknownAliasException = (UnknownAliasException)theEObject;
				T result = caseUnknownAliasException(unknownAliasException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_CONSENT_EXCEPTION: {
				UnknownConsentException unknownConsentException = (UnknownConsentException)theEObject;
				T result = caseUnknownConsentException(unknownConsentException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_CONSENT_TEMPLATE_EXCEPTION: {
				UnknownConsentTemplateException unknownConsentTemplateException = (UnknownConsentTemplateException)theEObject;
				T result = caseUnknownConsentTemplateException(unknownConsentTemplateException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_DOMAIN_EXCEPTION: {
				UnknownDomainException unknownDomainException = (UnknownDomainException)theEObject;
				T result = caseUnknownDomainException(unknownDomainException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_FHIR_ID_OBJECT_EXCEPTION: {
				UnknownFhirIdObjectException unknownFhirIdObjectException = (UnknownFhirIdObjectException)theEObject;
				T result = caseUnknownFhirIdObjectException(unknownFhirIdObjectException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_ID_EXCEPTION: {
				UnknownIDException unknownIDException = (UnknownIDException)theEObject;
				T result = caseUnknownIDException(unknownIDException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_MODULE_EXCEPTION: {
				UnknownModuleException unknownModuleException = (UnknownModuleException)theEObject;
				T result = caseUnknownModuleException(unknownModuleException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_POLICY_EXCEPTION: {
				UnknownPolicyException unknownPolicyException = (UnknownPolicyException)theEObject;
				T result = caseUnknownPolicyException(unknownPolicyException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_SIGNER_ID_EXCEPTION: {
				UnknownSignerIdException unknownSignerIdException = (UnknownSignerIdException)theEObject;
				T result = caseUnknownSignerIdException(unknownSignerIdException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UNKNOWN_SIGNER_ID_TYPE_EXCEPTION: {
				UnknownSignerIdTypeException unknownSignerIdTypeException = (UnknownSignerIdTypeException)theEObject;
				T result = caseUnknownSignerIdTypeException(unknownSignerIdTypeException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UPDATE_CONSENT_IN_USE: {
				UpdateConsentInUse updateConsentInUse = (UpdateConsentInUse)theEObject;
				T result = caseUpdateConsentInUse(updateConsentInUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.UPDATE_CONSENT_IN_USE_RESPONSE: {
				UpdateConsentInUseResponse updateConsentInUseResponse = (UpdateConsentInUseResponse)theEObject;
				T result = caseUpdateConsentInUseResponse(updateConsentInUseResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.VALIDATE_CONSENT: {
				ValidateConsent validateConsent = (ValidateConsent)theEObject;
				T result = caseValidateConsent(validateConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.VALIDATE_CONSENT_RESPONSE: {
				ValidateConsentResponse validateConsentResponse = (ValidateConsentResponse)theEObject;
				T result = caseValidateConsentResponse(validateConsentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cm2Package.VALID_FROM_PROPERTIES_DTO: {
				ValidFromPropertiesDTO validFromPropertiesDTO = (ValidFromPropertiesDTO)theEObject;
				T result = caseValidFromPropertiesDTO(validFromPropertiesDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMap(AbstractMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAlias(AddAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Alias Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Alias Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAliasResponse(AddAliasResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddConsent(AddConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Consent Opt Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Consent Opt Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddConsentOptOut(AddConsentOptOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Consent Opt Out Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Consent Opt Out Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddConsentOptOutResponse(AddConsentOptOutResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddConsentResponse(AddConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Scan To Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Scan To Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddScanToConsent(AddScanToConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Scan To Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Scan To Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddScanToConsentResponse(AddScanToConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Signer Id To Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Signer Id To Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSignerIdToConsent(AddSignerIdToConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Signer Id To Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Signer Id To Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSignerIdToConsentResponse(AddSignerIdToConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Signer Id To Signer Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Signer Id To Signer Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSignerIdToSignerId(AddSignerIdToSignerId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Signer Id To Signer Id Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Signer Id To Signer Id Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSignerIdToSignerIdResponse(AddSignerIdToSignerIdResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Module DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Module DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedModuleDTO(AssignedModuleDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Policy DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Policy DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedPolicyDTO(AssignedPolicyDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Children Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Children Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildrenType(ChildrenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Date Values DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Date Values DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentDateValuesDTO(ConsentDateValuesDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentDTO(ConsentDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Key DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Key DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentKeyDTO(ConsentKeyDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Light DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Light DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentLightDTO(ConsentLightDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Scan DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Scan DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentScanDTO(ConsentScanDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Template DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Template DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentTemplateDTO(ConsentTemplateDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Template Key DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Template Key DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentTemplateKeyDTO(ConsentTemplateKeyDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Template Structure DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Template Structure DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentTemplateStructureDTO(ConsentTemplateStructureDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Consents For Domain With Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Consents For Domain With Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountConsentsForDomainWithFilter(CountConsentsForDomainWithFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Consents For Domain With Filter Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Consents For Domain With Filter Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountConsentsForDomainWithFilterResponse(CountConsentsForDomainWithFilterResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Signed Policies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Signed Policies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountSignedPolicies(CountSignedPolicies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Signed Policies Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Signed Policies Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountSignedPoliciesResponse(CountSignedPoliciesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deactivate Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deactivate Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeactivateAlias(DeactivateAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deactivate Alias Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deactivate Alias Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeactivateAliasResponse(DeactivateAliasResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainDTO(DomainDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duplicate Entry Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duplicate Entry Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuplicateEntryException(DuplicateEntryException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType(EntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType1(EntryType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType2(EntryType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType3(EntryType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType4(EntryType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expiration Properties DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expiration Properties DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpirationPropertiesDTO(ExpirationPropertiesDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fhir Id DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fhir Id DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFhirIdDTO(FhirIdDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Text Def DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Text Def DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeTextDefDTO(FreeTextDefDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Text Val DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Text Val DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeTextValDTO(FreeTextValDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Aliases For Signer Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Aliases For Signer Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAliasesForSignerId(GetAliasesForSignerId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Aliases For Signer Id Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Aliases For Signer Id Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAliasesForSignerIdResponse(GetAliasesForSignerIdResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Aliases For Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Aliases For Signer Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAliasesForSignerIds(GetAliasesForSignerIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Aliases For Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Aliases For Signer Ids Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAliasesForSignerIdsResponse(GetAliasesForSignerIdsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consented Ids For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consented Ids For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentedIdsFor(GetAllConsentedIdsFor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consented Ids For Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consented Ids For Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentedIdsForResponse(GetAllConsentedIdsForResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consents For Consent Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consents For Consent Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentsForConsentTemplate(GetAllConsentsForConsentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consents For Consent Template Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consents For Consent Template Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentsForConsentTemplateResponse(GetAllConsentsForConsentTemplateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consents For Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consents For Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentsForDomain(GetAllConsentsForDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consents For Domain Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consents For Domain Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentsForDomainResponse(GetAllConsentsForDomainResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consents For Domain Without Scan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consents For Domain Without Scan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentsForDomainWithoutScan(GetAllConsentsForDomainWithoutScan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consents For Domain Without Scan Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consents For Domain Without Scan Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentsForDomainWithoutScanResponse(GetAllConsentsForDomainWithoutScanResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consents For Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consents For Signer Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentsForSignerIds(GetAllConsentsForSignerIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Consents For Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Consents For Signer Ids Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllConsentsForSignerIdsResponse(GetAllConsentsForSignerIdsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Ids For Signer Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Ids For Signer Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllIdsForSignerIdType(GetAllIdsForSignerIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Ids For Signer Id Type Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Ids For Signer Id Type Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllIdsForSignerIdTypeResponse(GetAllIdsForSignerIdTypeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsent(GetConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Dates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Dates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentDates(GetConsentDates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Dates Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Dates Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentDatesResponse(GetConsentDatesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentLight(GetConsentLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Light Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Light Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentLightResponse(GetConsentLightResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentResponse(GetConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consents For Domain Paginated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consents For Domain Paginated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentsForDomainPaginated(GetConsentsForDomainPaginated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consents For Domain Paginated Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consents For Domain Paginated Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentsForDomainPaginatedResponse(GetConsentsForDomainPaginatedResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusType(GetConsentStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type From Excluding To Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type From Excluding To Excluding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeFromExcludingToExcluding(GetConsentStatusTypeFromExcludingToExcluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type From Excluding To Excluding Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type From Excluding To Excluding Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeFromExcludingToExcludingResponse(GetConsentStatusTypeFromExcludingToExcludingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type From Excluding To Including</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type From Excluding To Including</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeFromExcludingToIncluding(GetConsentStatusTypeFromExcludingToIncluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type From Excluding To Including Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type From Excluding To Including Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeFromExcludingToIncludingResponse(GetConsentStatusTypeFromExcludingToIncludingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type From Including To Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type From Including To Excluding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeFromIncludingToExcluding(GetConsentStatusTypeFromIncludingToExcluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type From Including To Excluding Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type From Including To Excluding Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeFromIncludingToExcludingResponse(GetConsentStatusTypeFromIncludingToExcludingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type From Including To Including</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type From Including To Including</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeFromIncludingToIncluding(GetConsentStatusTypeFromIncludingToIncluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type From Including To Including Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type From Including To Including Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeFromIncludingToIncludingResponse(GetConsentStatusTypeFromIncludingToIncludingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Status Type Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Status Type Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentStatusTypeResponse(GetConsentStatusTypeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentTemplate(GetConsentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Consent Template Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Consent Template Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConsentTemplateResponse(GetConsentTemplateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Current Consent For Signer Ids And CT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Current Consent For Signer Ids And CT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCurrentConsentForSignerIdsAndCT(GetCurrentConsentForSignerIdsAndCT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Current Consent For Signer Ids And CT Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Current Consent For Signer Ids And CT Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCurrentConsentForSignerIdsAndCTResponse(GetCurrentConsentForSignerIdsAndCTResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Current Consent Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Current Consent Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCurrentConsentTemplate(GetCurrentConsentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Current Consent Template Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Current Consent Template Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCurrentConsentTemplateResponse(GetCurrentConsentTemplateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Current Policy States For Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Current Policy States For Signer Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCurrentPolicyStatesForSignerIds(GetCurrentPolicyStatesForSignerIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Current Policy States For Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Current Policy States For Signer Ids Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCurrentPolicyStatesForSignerIdsResponse(GetCurrentPolicyStatesForSignerIdsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDomain(GetDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Domain Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Domain Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDomainResponse(GetDomainResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Mapped Templates For Signer Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Mapped Templates For Signer Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetMappedTemplatesForSignerId(GetMappedTemplatesForSignerId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Mapped Templates For Signer Id Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Mapped Templates For Signer Id Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetMappedTemplatesForSignerIdResponse(GetMappedTemplatesForSignerIdResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetModule(GetModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Module Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Module Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetModuleResponse(GetModuleResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object By Fhir ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object By Fhir ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetObjectByFhirID(GetObjectByFhirID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object By Fhir ID Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object By Fhir ID Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetObjectByFhirIDResponse(GetObjectByFhirIDResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPolicy(GetPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Policy Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Policy Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPolicyResponse(GetPolicyResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Policy States For Policy And Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Policy States For Policy And Signer Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPolicyStatesForPolicyAndSignerIds(GetPolicyStatesForPolicyAndSignerIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Policy States For Policy And Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Policy States For Policy And Signer Ids Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPolicyStatesForPolicyAndSignerIdsResponse(GetPolicyStatesForPolicyAndSignerIdsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Policy States For Policy Name And Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Policy States For Policy Name And Signer Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPolicyStatesForPolicyNameAndSignerIds(GetPolicyStatesForPolicyNameAndSignerIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Policy States For Policy Name And Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Policy States For Policy Name And Signer Ids Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPolicyStatesForPolicyNameAndSignerIdsResponse(GetPolicyStatesForPolicyNameAndSignerIdsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Policy States For Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Policy States For Signer Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPolicyStatesForSignerIds(GetPolicyStatesForSignerIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Policy States For Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Policy States For Signer Ids Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPolicyStatesForSignerIdsResponse(GetPolicyStatesForSignerIdsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get QC History For Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get QC History For Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetQCHistoryForConsent(GetQCHistoryForConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get QC History For Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get QC History For Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetQCHistoryForConsentResponse(GetQCHistoryForConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get QC Problem History For QC Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get QC Problem History For QC Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetQCProblemHistoryForQCProblem(GetQCProblemHistoryForQCProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get QC Problem History For QC Problem Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get QC Problem History For QC Problem Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetQCProblemHistoryForQCProblemResponse(GetQCProblemHistoryForQCProblemResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Signer Ids For Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Signer Ids For Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetSignerIdsForAlias(GetSignerIdsForAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Signer Ids For Alias Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Signer Ids For Alias Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetSignerIdsForAliasResponse(GetSignerIdsForAliasResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Signer Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Signer Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetSignerIdType(GetSignerIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Signer Id Type Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Signer Id Type Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetSignerIdTypeResponse(GetSignerIdTypeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Templates With Policies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Templates With Policies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTemplatesWithPolicies(GetTemplatesWithPolicies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Templates With Policies Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Templates With Policies Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTemplatesWithPoliciesResponse(GetTemplatesWithPoliciesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashMap(HashMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Illegal Argument Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Illegal Argument Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIllegalArgumentException(org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inconsistent Status Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inconsistent Status Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInconsistentStatusException(InconsistentStatusException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalException(InternalException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Free Text Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Free Text Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidFreeTextException(InvalidFreeTextException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Parameter Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Parameter Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidParameterException(InvalidParameterException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Version Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Version Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidVersionException(InvalidVersionException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsented(IsConsented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented From Excluding To Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented From Excluding To Excluding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedFromExcludingToExcluding(IsConsentedFromExcludingToExcluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented From Excluding To Excluding Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented From Excluding To Excluding Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedFromExcludingToExcludingResponse(IsConsentedFromExcludingToExcludingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented From Excluding To Including</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented From Excluding To Including</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedFromExcludingToIncluding(IsConsentedFromExcludingToIncluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented From Excluding To Including Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented From Excluding To Including Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedFromExcludingToIncludingResponse(IsConsentedFromExcludingToIncludingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented From Including To Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented From Including To Excluding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedFromIncludingToExcluding(IsConsentedFromIncludingToExcluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented From Including To Excluding Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented From Including To Excluding Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedFromIncludingToExcludingResponse(IsConsentedFromIncludingToExcludingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented From Including To Including</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented From Including To Including</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedFromIncludingToIncluding(IsConsentedFromIncludingToIncluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented From Including To Including Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented From Including To Including Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedFromIncludingToIncludingResponse(IsConsentedFromIncludingToIncludingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Consented Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Consented Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsConsentedResponse(IsConsentedResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Consent Templates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Consent Templates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListConsentTemplates(ListConsentTemplates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Consent Templates Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Consent Templates Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListConsentTemplatesResponse(ListConsentTemplatesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Current Consent Templates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Current Consent Templates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListCurrentConsentTemplates(ListCurrentConsentTemplates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Current Consent Templates Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Current Consent Templates Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListCurrentConsentTemplatesResponse(ListCurrentConsentTemplatesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Domains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Domains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListDomains(ListDomains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Domains Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Domains Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListDomainsResponse(ListDomainsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListModules(ListModules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Modules Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Modules Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListModulesResponse(ListModulesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Policies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Policies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListPolicies(ListPolicies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Policies Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Policies Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListPoliciesResponse(ListPoliciesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Signer Id Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Signer Id Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListSignerIdTypes(ListSignerIdTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Signer Id Types Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Signer Id Types Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListSignerIdTypesResponse(ListSignerIdTypesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Fields Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Fields Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryFieldsException(MandatoryFieldsException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missing Required Object Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missing Required Object Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissingRequiredObjectException(MissingRequiredObjectException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDTO(ModuleDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Expirations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Expirations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleExpirationsType(ModuleExpirationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Key DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Key DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleKeyDTO(ModuleKeyDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Key DTO Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Key DTO Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleKeyDTOArray(ModuleKeyDTOArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module State DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module State DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleStateDTO(ModuleStateDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module States Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module States Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleStatesType(ModuleStatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyDTO(PolicyDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Expirations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Expirations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyExpirationsType(PolicyExpirationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Key DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Key DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyKeyDTO(PolicyKeyDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qcdto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qcdto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQcdto(Qcdto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qc History DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qc History DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQcHistoryDTO(QcHistoryDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qc Problem DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qc Problem DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQcProblemDTO(QcProblemDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qc Problem History DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qc Problem History DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQcProblemHistoryDTO(QcProblemHistoryDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QC Problem Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QC Problem Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQCProblemType(QCProblemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QC Problem Type Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QC Problem Type Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQCProblemTypeAction(QCProblemTypeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QC Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QC Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQCType(QCType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refuse Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refuse Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefuseConsent(RefuseConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refuse Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refuse Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefuseConsentResponse(RefuseConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Scan From Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Scan From Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveScanFromConsent(RemoveScanFromConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Scan From Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Scan From Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveScanFromConsentResponse(RemoveScanFromConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Not Fullfilled Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Not Fullfilled Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsNotFullfilledException(RequirementsNotFullfilledException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType1(ReturnType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType2(ReturnType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType3(ReturnType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType4(ReturnType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType5(ReturnType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType6(ReturnType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType7(ReturnType7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType8(ReturnType8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType9(ReturnType9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType10(ReturnType10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType11(ReturnType11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType12(ReturnType12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType13(ReturnType13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type14</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type14</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType14(ReturnType14 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type15</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type15</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType15(ReturnType15 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType16(ReturnType16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type17</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type17</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType17(ReturnType17 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type18</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type18</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType18(ReturnType18 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type19</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type19</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType19(ReturnType19 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type20</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type20</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType20(ReturnType20 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type21</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type21</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType21(ReturnType21 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type22</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type22</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType22(ReturnType22 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type23</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type23</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType23(ReturnType23 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set QC For Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set QC For Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetQCForConsent(SetQCForConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set QC For Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set QC For Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetQCForConsentResponse(SetQCForConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Policy DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Policy DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedPolicyDTO(SignedPolicyDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signer Id DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signer Id DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignerIdDTO(SignerIdDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signer Id DTO Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signer Id DTO Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignerIdDTOArray(SignerIdDTOArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signer Id Type DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signer Id Type DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignerIdTypeDTO(SignerIdTypeDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Alias Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Alias Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownAliasException(UnknownAliasException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Consent Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Consent Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownConsentException(UnknownConsentException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Consent Template Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Consent Template Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownConsentTemplateException(UnknownConsentTemplateException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Domain Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Domain Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownDomainException(UnknownDomainException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Fhir Id Object Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Fhir Id Object Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownFhirIdObjectException(UnknownFhirIdObjectException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown ID Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown ID Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownIDException(UnknownIDException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Module Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Module Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownModuleException(UnknownModuleException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Policy Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Policy Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownPolicyException(UnknownPolicyException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Signer Id Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Signer Id Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownSignerIdException(UnknownSignerIdException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Signer Id Type Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Signer Id Type Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownSignerIdTypeException(UnknownSignerIdTypeException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Consent In Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Consent In Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateConsentInUse(UpdateConsentInUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Consent In Use Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Consent In Use Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateConsentInUseResponse(UpdateConsentInUseResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidateConsent(ValidateConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate Consent Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidateConsentResponse(ValidateConsentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid From Properties DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid From Properties DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidFromPropertiesDTO(ValidFromPropertiesDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Cm2Switch
