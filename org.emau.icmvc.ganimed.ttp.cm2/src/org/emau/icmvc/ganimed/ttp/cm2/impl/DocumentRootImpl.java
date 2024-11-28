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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

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
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter;
import org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse;
import org.emau.icmvc.ganimed.ttp.cm2.CountSignedPolicies;
import org.emau.icmvc.ganimed.ttp.cm2.CountSignedPoliciesResponse;
import org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias;
import org.emau.icmvc.ganimed.ttp.cm2.DeactivateAliasResponse;
import org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot;
import org.emau.icmvc.ganimed.ttp.cm2.DuplicateEntryException;
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
import org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent;
import org.emau.icmvc.ganimed.ttp.cm2.RefuseConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent;
import org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.RequirementsNotFullfilledException;
import org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent;
import org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsentResponse;
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
import org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent;
import org.emau.icmvc.ganimed.ttp.cm2.ValidateConsentResponse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddAlias <em>Add Alias</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddAliasResponse <em>Add Alias Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddConsent <em>Add Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddConsentOptOut <em>Add Consent Opt Out</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddConsentOptOutResponse <em>Add Consent Opt Out Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddConsentResponse <em>Add Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddScanToConsent <em>Add Scan To Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddScanToConsentResponse <em>Add Scan To Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddSignerIdToConsent <em>Add Signer Id To Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddSignerIdToConsentResponse <em>Add Signer Id To Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddSignerIdToSignerId <em>Add Signer Id To Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getAddSignerIdToSignerIdResponse <em>Add Signer Id To Signer Id Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getCountConsentsForDomainWithFilter <em>Count Consents For Domain With Filter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getCountConsentsForDomainWithFilterResponse <em>Count Consents For Domain With Filter Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getCountSignedPolicies <em>Count Signed Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getCountSignedPoliciesResponse <em>Count Signed Policies Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getDeactivateAlias <em>Deactivate Alias</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getDeactivateAliasResponse <em>Deactivate Alias Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getDuplicateEntryException <em>Duplicate Entry Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAliasesForSignerId <em>Get Aliases For Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAliasesForSignerIdResponse <em>Get Aliases For Signer Id Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAliasesForSignerIds <em>Get Aliases For Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAliasesForSignerIdsResponse <em>Get Aliases For Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentedIdsFor <em>Get All Consented Ids For</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentedIdsForResponse <em>Get All Consented Ids For Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentsForConsentTemplate <em>Get All Consents For Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentsForConsentTemplateResponse <em>Get All Consents For Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentsForDomain <em>Get All Consents For Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentsForDomainResponse <em>Get All Consents For Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentsForDomainWithoutScan <em>Get All Consents For Domain Without Scan</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentsForDomainWithoutScanResponse <em>Get All Consents For Domain Without Scan Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentsForSignerIds <em>Get All Consents For Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllConsentsForSignerIdsResponse <em>Get All Consents For Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllIdsForSignerIdType <em>Get All Ids For Signer Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetAllIdsForSignerIdTypeResponse <em>Get All Ids For Signer Id Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsent <em>Get Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentDates <em>Get Consent Dates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentDatesResponse <em>Get Consent Dates Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentLight <em>Get Consent Light</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentLightResponse <em>Get Consent Light Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentResponse <em>Get Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentsForDomainPaginated <em>Get Consents For Domain Paginated</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentsForDomainPaginatedResponse <em>Get Consents For Domain Paginated Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusType <em>Get Consent Status Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeFromExcludingToExcluding <em>Get Consent Status Type From Excluding To Excluding</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeFromExcludingToExcludingResponse <em>Get Consent Status Type From Excluding To Excluding Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeFromExcludingToIncluding <em>Get Consent Status Type From Excluding To Including</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeFromExcludingToIncludingResponse <em>Get Consent Status Type From Excluding To Including Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeFromIncludingToExcluding <em>Get Consent Status Type From Including To Excluding</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeFromIncludingToExcludingResponse <em>Get Consent Status Type From Including To Excluding Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeFromIncludingToIncluding <em>Get Consent Status Type From Including To Including</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeFromIncludingToIncludingResponse <em>Get Consent Status Type From Including To Including Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentStatusTypeResponse <em>Get Consent Status Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentTemplate <em>Get Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetConsentTemplateResponse <em>Get Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetCurrentConsentForSignerIdsAndCT <em>Get Current Consent For Signer Ids And CT</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetCurrentConsentForSignerIdsAndCTResponse <em>Get Current Consent For Signer Ids And CT Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetCurrentConsentTemplate <em>Get Current Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetCurrentConsentTemplateResponse <em>Get Current Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetCurrentPolicyStatesForSignerIds <em>Get Current Policy States For Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetCurrentPolicyStatesForSignerIdsResponse <em>Get Current Policy States For Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetDomain <em>Get Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetDomainResponse <em>Get Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetMappedTemplatesForSignerId <em>Get Mapped Templates For Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetMappedTemplatesForSignerIdResponse <em>Get Mapped Templates For Signer Id Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetModule <em>Get Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetModuleResponse <em>Get Module Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetObjectByFhirID <em>Get Object By Fhir ID</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetObjectByFhirIDResponse <em>Get Object By Fhir ID Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetPolicy <em>Get Policy</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetPolicyResponse <em>Get Policy Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetPolicyStatesForPolicyAndSignerIds <em>Get Policy States For Policy And Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetPolicyStatesForPolicyAndSignerIdsResponse <em>Get Policy States For Policy And Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetPolicyStatesForPolicyNameAndSignerIds <em>Get Policy States For Policy Name And Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetPolicyStatesForPolicyNameAndSignerIdsResponse <em>Get Policy States For Policy Name And Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetPolicyStatesForSignerIds <em>Get Policy States For Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetPolicyStatesForSignerIdsResponse <em>Get Policy States For Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetQCHistoryForConsent <em>Get QC History For Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetQCHistoryForConsentResponse <em>Get QC History For Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetQCProblemHistoryForQCProblem <em>Get QC Problem History For QC Problem</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetQCProblemHistoryForQCProblemResponse <em>Get QC Problem History For QC Problem Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetSignerIdsForAlias <em>Get Signer Ids For Alias</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetSignerIdsForAliasResponse <em>Get Signer Ids For Alias Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetSignerIdType <em>Get Signer Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetSignerIdTypeResponse <em>Get Signer Id Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetTemplatesWithPolicies <em>Get Templates With Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getGetTemplatesWithPoliciesResponse <em>Get Templates With Policies Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIllegalArgumentException <em>Illegal Argument Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getInconsistentStatusException <em>Inconsistent Status Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getInternalException <em>Internal Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getInvalidFreeTextException <em>Invalid Free Text Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getInvalidParameterException <em>Invalid Parameter Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getInvalidVersionException <em>Invalid Version Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsented <em>Is Consented</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedFromExcludingToExcluding <em>Is Consented From Excluding To Excluding</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedFromExcludingToExcludingResponse <em>Is Consented From Excluding To Excluding Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedFromExcludingToIncluding <em>Is Consented From Excluding To Including</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedFromExcludingToIncludingResponse <em>Is Consented From Excluding To Including Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedFromIncludingToExcluding <em>Is Consented From Including To Excluding</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedFromIncludingToExcludingResponse <em>Is Consented From Including To Excluding Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedFromIncludingToIncluding <em>Is Consented From Including To Including</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedFromIncludingToIncludingResponse <em>Is Consented From Including To Including Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getIsConsentedResponse <em>Is Consented Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListConsentTemplates <em>List Consent Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListConsentTemplatesResponse <em>List Consent Templates Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListCurrentConsentTemplates <em>List Current Consent Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListCurrentConsentTemplatesResponse <em>List Current Consent Templates Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListDomains <em>List Domains</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListDomainsResponse <em>List Domains Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListModules <em>List Modules</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListModulesResponse <em>List Modules Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListPolicies <em>List Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListPoliciesResponse <em>List Policies Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListSignerIdTypes <em>List Signer Id Types</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getListSignerIdTypesResponse <em>List Signer Id Types Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getMandatoryFieldsException <em>Mandatory Fields Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getMissingRequiredObjectException <em>Missing Required Object Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getRefuseConsent <em>Refuse Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getRefuseConsentResponse <em>Refuse Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getRemoveScanFromConsent <em>Remove Scan From Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getRemoveScanFromConsentResponse <em>Remove Scan From Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getRequirementsNotFullfilledException <em>Requirements Not Fullfilled Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getSetQCForConsent <em>Set QC For Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getSetQCForConsentResponse <em>Set QC For Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownAliasException <em>Unknown Alias Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownConsentException <em>Unknown Consent Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownConsentTemplateException <em>Unknown Consent Template Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownDomainException <em>Unknown Domain Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownFhirIdObjectException <em>Unknown Fhir Id Object Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownIDException <em>Unknown ID Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownModuleException <em>Unknown Module Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownPolicyException <em>Unknown Policy Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownSignerIdException <em>Unknown Signer Id Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUnknownSignerIdTypeException <em>Unknown Signer Id Type Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUpdateConsentInUse <em>Update Consent In Use</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getUpdateConsentInUseResponse <em>Update Consent In Use Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getValidateConsent <em>Validate Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DocumentRootImpl#getValidateConsentResponse <em>Validate Consent Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Cm2Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Cm2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Cm2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddAlias getAddAlias() {
		return (AddAlias)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddAlias(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddAlias(AddAlias newAddAlias, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddAlias(), newAddAlias, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddAlias(AddAlias newAddAlias) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddAlias(), newAddAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddAliasResponse getAddAliasResponse() {
		return (AddAliasResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddAliasResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddAliasResponse(AddAliasResponse newAddAliasResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddAliasResponse(), newAddAliasResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddAliasResponse(AddAliasResponse newAddAliasResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddAliasResponse(), newAddAliasResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConsent getAddConsent() {
		return (AddConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddConsent(AddConsent newAddConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddConsent(), newAddConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddConsent(AddConsent newAddConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddConsent(), newAddConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConsentOptOut getAddConsentOptOut() {
		return (AddConsentOptOut)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentOptOut(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddConsentOptOut(AddConsentOptOut newAddConsentOptOut, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentOptOut(), newAddConsentOptOut, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddConsentOptOut(AddConsentOptOut newAddConsentOptOut) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentOptOut(), newAddConsentOptOut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConsentOptOutResponse getAddConsentOptOutResponse() {
		return (AddConsentOptOutResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentOptOutResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddConsentOptOutResponse(AddConsentOptOutResponse newAddConsentOptOutResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentOptOutResponse(), newAddConsentOptOutResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddConsentOptOutResponse(AddConsentOptOutResponse newAddConsentOptOutResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentOptOutResponse(), newAddConsentOptOutResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConsentResponse getAddConsentResponse() {
		return (AddConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddConsentResponse(AddConsentResponse newAddConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentResponse(), newAddConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddConsentResponse(AddConsentResponse newAddConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddConsentResponse(), newAddConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddScanToConsent getAddScanToConsent() {
		return (AddScanToConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddScanToConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddScanToConsent(AddScanToConsent newAddScanToConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddScanToConsent(), newAddScanToConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddScanToConsent(AddScanToConsent newAddScanToConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddScanToConsent(), newAddScanToConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddScanToConsentResponse getAddScanToConsentResponse() {
		return (AddScanToConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddScanToConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddScanToConsentResponse(AddScanToConsentResponse newAddScanToConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddScanToConsentResponse(), newAddScanToConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddScanToConsentResponse(AddScanToConsentResponse newAddScanToConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddScanToConsentResponse(), newAddScanToConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSignerIdToConsent getAddSignerIdToConsent() {
		return (AddSignerIdToConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddSignerIdToConsent(AddSignerIdToConsent newAddSignerIdToConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToConsent(), newAddSignerIdToConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddSignerIdToConsent(AddSignerIdToConsent newAddSignerIdToConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToConsent(), newAddSignerIdToConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSignerIdToConsentResponse getAddSignerIdToConsentResponse() {
		return (AddSignerIdToConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddSignerIdToConsentResponse(AddSignerIdToConsentResponse newAddSignerIdToConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToConsentResponse(), newAddSignerIdToConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddSignerIdToConsentResponse(AddSignerIdToConsentResponse newAddSignerIdToConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToConsentResponse(), newAddSignerIdToConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSignerIdToSignerId getAddSignerIdToSignerId() {
		return (AddSignerIdToSignerId)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToSignerId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddSignerIdToSignerId(AddSignerIdToSignerId newAddSignerIdToSignerId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToSignerId(), newAddSignerIdToSignerId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddSignerIdToSignerId(AddSignerIdToSignerId newAddSignerIdToSignerId) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToSignerId(), newAddSignerIdToSignerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSignerIdToSignerIdResponse getAddSignerIdToSignerIdResponse() {
		return (AddSignerIdToSignerIdResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToSignerIdResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddSignerIdToSignerIdResponse(AddSignerIdToSignerIdResponse newAddSignerIdToSignerIdResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToSignerIdResponse(), newAddSignerIdToSignerIdResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddSignerIdToSignerIdResponse(AddSignerIdToSignerIdResponse newAddSignerIdToSignerIdResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_AddSignerIdToSignerIdResponse(), newAddSignerIdToSignerIdResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountConsentsForDomainWithFilter getCountConsentsForDomainWithFilter() {
		return (CountConsentsForDomainWithFilter)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_CountConsentsForDomainWithFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountConsentsForDomainWithFilter(CountConsentsForDomainWithFilter newCountConsentsForDomainWithFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_CountConsentsForDomainWithFilter(), newCountConsentsForDomainWithFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountConsentsForDomainWithFilter(CountConsentsForDomainWithFilter newCountConsentsForDomainWithFilter) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_CountConsentsForDomainWithFilter(), newCountConsentsForDomainWithFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountConsentsForDomainWithFilterResponse getCountConsentsForDomainWithFilterResponse() {
		return (CountConsentsForDomainWithFilterResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_CountConsentsForDomainWithFilterResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountConsentsForDomainWithFilterResponse(CountConsentsForDomainWithFilterResponse newCountConsentsForDomainWithFilterResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_CountConsentsForDomainWithFilterResponse(), newCountConsentsForDomainWithFilterResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountConsentsForDomainWithFilterResponse(CountConsentsForDomainWithFilterResponse newCountConsentsForDomainWithFilterResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_CountConsentsForDomainWithFilterResponse(), newCountConsentsForDomainWithFilterResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountSignedPolicies getCountSignedPolicies() {
		return (CountSignedPolicies)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_CountSignedPolicies(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountSignedPolicies(CountSignedPolicies newCountSignedPolicies, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_CountSignedPolicies(), newCountSignedPolicies, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountSignedPolicies(CountSignedPolicies newCountSignedPolicies) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_CountSignedPolicies(), newCountSignedPolicies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountSignedPoliciesResponse getCountSignedPoliciesResponse() {
		return (CountSignedPoliciesResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_CountSignedPoliciesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountSignedPoliciesResponse(CountSignedPoliciesResponse newCountSignedPoliciesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_CountSignedPoliciesResponse(), newCountSignedPoliciesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountSignedPoliciesResponse(CountSignedPoliciesResponse newCountSignedPoliciesResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_CountSignedPoliciesResponse(), newCountSignedPoliciesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeactivateAlias getDeactivateAlias() {
		return (DeactivateAlias)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_DeactivateAlias(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeactivateAlias(DeactivateAlias newDeactivateAlias, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_DeactivateAlias(), newDeactivateAlias, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeactivateAlias(DeactivateAlias newDeactivateAlias) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_DeactivateAlias(), newDeactivateAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeactivateAliasResponse getDeactivateAliasResponse() {
		return (DeactivateAliasResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_DeactivateAliasResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeactivateAliasResponse(DeactivateAliasResponse newDeactivateAliasResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_DeactivateAliasResponse(), newDeactivateAliasResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeactivateAliasResponse(DeactivateAliasResponse newDeactivateAliasResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_DeactivateAliasResponse(), newDeactivateAliasResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DuplicateEntryException getDuplicateEntryException() {
		return (DuplicateEntryException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_DuplicateEntryException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuplicateEntryException(DuplicateEntryException newDuplicateEntryException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_DuplicateEntryException(), newDuplicateEntryException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuplicateEntryException(DuplicateEntryException newDuplicateEntryException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_DuplicateEntryException(), newDuplicateEntryException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAliasesForSignerId getGetAliasesForSignerId() {
		return (GetAliasesForSignerId)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAliasesForSignerId(GetAliasesForSignerId newGetAliasesForSignerId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerId(), newGetAliasesForSignerId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAliasesForSignerId(GetAliasesForSignerId newGetAliasesForSignerId) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerId(), newGetAliasesForSignerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAliasesForSignerIdResponse getGetAliasesForSignerIdResponse() {
		return (GetAliasesForSignerIdResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIdResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAliasesForSignerIdResponse(GetAliasesForSignerIdResponse newGetAliasesForSignerIdResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIdResponse(), newGetAliasesForSignerIdResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAliasesForSignerIdResponse(GetAliasesForSignerIdResponse newGetAliasesForSignerIdResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIdResponse(), newGetAliasesForSignerIdResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAliasesForSignerIds getGetAliasesForSignerIds() {
		return (GetAliasesForSignerIds)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIds(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAliasesForSignerIds(GetAliasesForSignerIds newGetAliasesForSignerIds, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIds(), newGetAliasesForSignerIds, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAliasesForSignerIds(GetAliasesForSignerIds newGetAliasesForSignerIds) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIds(), newGetAliasesForSignerIds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAliasesForSignerIdsResponse getGetAliasesForSignerIdsResponse() {
		return (GetAliasesForSignerIdsResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIdsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAliasesForSignerIdsResponse(GetAliasesForSignerIdsResponse newGetAliasesForSignerIdsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIdsResponse(), newGetAliasesForSignerIdsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAliasesForSignerIdsResponse(GetAliasesForSignerIdsResponse newGetAliasesForSignerIdsResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAliasesForSignerIdsResponse(), newGetAliasesForSignerIdsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentedIdsFor getGetAllConsentedIdsFor() {
		return (GetAllConsentedIdsFor)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentedIdsFor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentedIdsFor(GetAllConsentedIdsFor newGetAllConsentedIdsFor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentedIdsFor(), newGetAllConsentedIdsFor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentedIdsFor(GetAllConsentedIdsFor newGetAllConsentedIdsFor) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentedIdsFor(), newGetAllConsentedIdsFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentedIdsForResponse getGetAllConsentedIdsForResponse() {
		return (GetAllConsentedIdsForResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentedIdsForResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentedIdsForResponse(GetAllConsentedIdsForResponse newGetAllConsentedIdsForResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentedIdsForResponse(), newGetAllConsentedIdsForResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentedIdsForResponse(GetAllConsentedIdsForResponse newGetAllConsentedIdsForResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentedIdsForResponse(), newGetAllConsentedIdsForResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForConsentTemplate getGetAllConsentsForConsentTemplate() {
		return (GetAllConsentsForConsentTemplate)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForConsentTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentsForConsentTemplate(GetAllConsentsForConsentTemplate newGetAllConsentsForConsentTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForConsentTemplate(), newGetAllConsentsForConsentTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentsForConsentTemplate(GetAllConsentsForConsentTemplate newGetAllConsentsForConsentTemplate) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForConsentTemplate(), newGetAllConsentsForConsentTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForConsentTemplateResponse getGetAllConsentsForConsentTemplateResponse() {
		return (GetAllConsentsForConsentTemplateResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForConsentTemplateResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentsForConsentTemplateResponse(GetAllConsentsForConsentTemplateResponse newGetAllConsentsForConsentTemplateResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForConsentTemplateResponse(), newGetAllConsentsForConsentTemplateResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentsForConsentTemplateResponse(GetAllConsentsForConsentTemplateResponse newGetAllConsentsForConsentTemplateResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForConsentTemplateResponse(), newGetAllConsentsForConsentTemplateResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForDomain getGetAllConsentsForDomain() {
		return (GetAllConsentsForDomain)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentsForDomain(GetAllConsentsForDomain newGetAllConsentsForDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomain(), newGetAllConsentsForDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentsForDomain(GetAllConsentsForDomain newGetAllConsentsForDomain) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomain(), newGetAllConsentsForDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForDomainResponse getGetAllConsentsForDomainResponse() {
		return (GetAllConsentsForDomainResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentsForDomainResponse(GetAllConsentsForDomainResponse newGetAllConsentsForDomainResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainResponse(), newGetAllConsentsForDomainResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentsForDomainResponse(GetAllConsentsForDomainResponse newGetAllConsentsForDomainResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainResponse(), newGetAllConsentsForDomainResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForDomainWithoutScan getGetAllConsentsForDomainWithoutScan() {
		return (GetAllConsentsForDomainWithoutScan)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainWithoutScan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentsForDomainWithoutScan(GetAllConsentsForDomainWithoutScan newGetAllConsentsForDomainWithoutScan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainWithoutScan(), newGetAllConsentsForDomainWithoutScan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentsForDomainWithoutScan(GetAllConsentsForDomainWithoutScan newGetAllConsentsForDomainWithoutScan) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainWithoutScan(), newGetAllConsentsForDomainWithoutScan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForDomainWithoutScanResponse getGetAllConsentsForDomainWithoutScanResponse() {
		return (GetAllConsentsForDomainWithoutScanResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainWithoutScanResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentsForDomainWithoutScanResponse(GetAllConsentsForDomainWithoutScanResponse newGetAllConsentsForDomainWithoutScanResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainWithoutScanResponse(), newGetAllConsentsForDomainWithoutScanResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentsForDomainWithoutScanResponse(GetAllConsentsForDomainWithoutScanResponse newGetAllConsentsForDomainWithoutScanResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForDomainWithoutScanResponse(), newGetAllConsentsForDomainWithoutScanResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForSignerIds getGetAllConsentsForSignerIds() {
		return (GetAllConsentsForSignerIds)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForSignerIds(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentsForSignerIds(GetAllConsentsForSignerIds newGetAllConsentsForSignerIds, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForSignerIds(), newGetAllConsentsForSignerIds, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentsForSignerIds(GetAllConsentsForSignerIds newGetAllConsentsForSignerIds) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForSignerIds(), newGetAllConsentsForSignerIds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllConsentsForSignerIdsResponse getGetAllConsentsForSignerIdsResponse() {
		return (GetAllConsentsForSignerIdsResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForSignerIdsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllConsentsForSignerIdsResponse(GetAllConsentsForSignerIdsResponse newGetAllConsentsForSignerIdsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForSignerIdsResponse(), newGetAllConsentsForSignerIdsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllConsentsForSignerIdsResponse(GetAllConsentsForSignerIdsResponse newGetAllConsentsForSignerIdsResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllConsentsForSignerIdsResponse(), newGetAllConsentsForSignerIdsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllIdsForSignerIdType getGetAllIdsForSignerIdType() {
		return (GetAllIdsForSignerIdType)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllIdsForSignerIdType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllIdsForSignerIdType(GetAllIdsForSignerIdType newGetAllIdsForSignerIdType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllIdsForSignerIdType(), newGetAllIdsForSignerIdType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllIdsForSignerIdType(GetAllIdsForSignerIdType newGetAllIdsForSignerIdType) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllIdsForSignerIdType(), newGetAllIdsForSignerIdType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAllIdsForSignerIdTypeResponse getGetAllIdsForSignerIdTypeResponse() {
		return (GetAllIdsForSignerIdTypeResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetAllIdsForSignerIdTypeResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAllIdsForSignerIdTypeResponse(GetAllIdsForSignerIdTypeResponse newGetAllIdsForSignerIdTypeResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetAllIdsForSignerIdTypeResponse(), newGetAllIdsForSignerIdTypeResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetAllIdsForSignerIdTypeResponse(GetAllIdsForSignerIdTypeResponse newGetAllIdsForSignerIdTypeResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetAllIdsForSignerIdTypeResponse(), newGetAllIdsForSignerIdTypeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsent getGetConsent() {
		return (GetConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsent(GetConsent newGetConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsent(), newGetConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsent(GetConsent newGetConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsent(), newGetConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentDates getGetConsentDates() {
		return (GetConsentDates)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentDates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentDates(GetConsentDates newGetConsentDates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentDates(), newGetConsentDates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentDates(GetConsentDates newGetConsentDates) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentDates(), newGetConsentDates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentDatesResponse getGetConsentDatesResponse() {
		return (GetConsentDatesResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentDatesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentDatesResponse(GetConsentDatesResponse newGetConsentDatesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentDatesResponse(), newGetConsentDatesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentDatesResponse(GetConsentDatesResponse newGetConsentDatesResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentDatesResponse(), newGetConsentDatesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentLight getGetConsentLight() {
		return (GetConsentLight)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentLight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentLight(GetConsentLight newGetConsentLight, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentLight(), newGetConsentLight, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentLight(GetConsentLight newGetConsentLight) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentLight(), newGetConsentLight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentLightResponse getGetConsentLightResponse() {
		return (GetConsentLightResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentLightResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentLightResponse(GetConsentLightResponse newGetConsentLightResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentLightResponse(), newGetConsentLightResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentLightResponse(GetConsentLightResponse newGetConsentLightResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentLightResponse(), newGetConsentLightResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentResponse getGetConsentResponse() {
		return (GetConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentResponse(GetConsentResponse newGetConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentResponse(), newGetConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentResponse(GetConsentResponse newGetConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentResponse(), newGetConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentsForDomainPaginated getGetConsentsForDomainPaginated() {
		return (GetConsentsForDomainPaginated)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentsForDomainPaginated(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentsForDomainPaginated(GetConsentsForDomainPaginated newGetConsentsForDomainPaginated, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentsForDomainPaginated(), newGetConsentsForDomainPaginated, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentsForDomainPaginated(GetConsentsForDomainPaginated newGetConsentsForDomainPaginated) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentsForDomainPaginated(), newGetConsentsForDomainPaginated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentsForDomainPaginatedResponse getGetConsentsForDomainPaginatedResponse() {
		return (GetConsentsForDomainPaginatedResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentsForDomainPaginatedResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentsForDomainPaginatedResponse(GetConsentsForDomainPaginatedResponse newGetConsentsForDomainPaginatedResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentsForDomainPaginatedResponse(), newGetConsentsForDomainPaginatedResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentsForDomainPaginatedResponse(GetConsentsForDomainPaginatedResponse newGetConsentsForDomainPaginatedResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentsForDomainPaginatedResponse(), newGetConsentsForDomainPaginatedResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusType getGetConsentStatusType() {
		return (GetConsentStatusType)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusType(GetConsentStatusType newGetConsentStatusType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusType(), newGetConsentStatusType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusType(GetConsentStatusType newGetConsentStatusType) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusType(), newGetConsentStatusType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromExcludingToExcluding getGetConsentStatusTypeFromExcludingToExcluding() {
		return (GetConsentStatusTypeFromExcludingToExcluding)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToExcluding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeFromExcludingToExcluding(GetConsentStatusTypeFromExcludingToExcluding newGetConsentStatusTypeFromExcludingToExcluding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToExcluding(), newGetConsentStatusTypeFromExcludingToExcluding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeFromExcludingToExcluding(GetConsentStatusTypeFromExcludingToExcluding newGetConsentStatusTypeFromExcludingToExcluding) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToExcluding(), newGetConsentStatusTypeFromExcludingToExcluding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromExcludingToExcludingResponse getGetConsentStatusTypeFromExcludingToExcludingResponse() {
		return (GetConsentStatusTypeFromExcludingToExcludingResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToExcludingResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeFromExcludingToExcludingResponse(GetConsentStatusTypeFromExcludingToExcludingResponse newGetConsentStatusTypeFromExcludingToExcludingResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToExcludingResponse(), newGetConsentStatusTypeFromExcludingToExcludingResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeFromExcludingToExcludingResponse(GetConsentStatusTypeFromExcludingToExcludingResponse newGetConsentStatusTypeFromExcludingToExcludingResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToExcludingResponse(), newGetConsentStatusTypeFromExcludingToExcludingResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromExcludingToIncluding getGetConsentStatusTypeFromExcludingToIncluding() {
		return (GetConsentStatusTypeFromExcludingToIncluding)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToIncluding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeFromExcludingToIncluding(GetConsentStatusTypeFromExcludingToIncluding newGetConsentStatusTypeFromExcludingToIncluding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToIncluding(), newGetConsentStatusTypeFromExcludingToIncluding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeFromExcludingToIncluding(GetConsentStatusTypeFromExcludingToIncluding newGetConsentStatusTypeFromExcludingToIncluding) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToIncluding(), newGetConsentStatusTypeFromExcludingToIncluding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromExcludingToIncludingResponse getGetConsentStatusTypeFromExcludingToIncludingResponse() {
		return (GetConsentStatusTypeFromExcludingToIncludingResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToIncludingResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeFromExcludingToIncludingResponse(GetConsentStatusTypeFromExcludingToIncludingResponse newGetConsentStatusTypeFromExcludingToIncludingResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToIncludingResponse(), newGetConsentStatusTypeFromExcludingToIncludingResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeFromExcludingToIncludingResponse(GetConsentStatusTypeFromExcludingToIncludingResponse newGetConsentStatusTypeFromExcludingToIncludingResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromExcludingToIncludingResponse(), newGetConsentStatusTypeFromExcludingToIncludingResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromIncludingToExcluding getGetConsentStatusTypeFromIncludingToExcluding() {
		return (GetConsentStatusTypeFromIncludingToExcluding)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToExcluding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeFromIncludingToExcluding(GetConsentStatusTypeFromIncludingToExcluding newGetConsentStatusTypeFromIncludingToExcluding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToExcluding(), newGetConsentStatusTypeFromIncludingToExcluding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeFromIncludingToExcluding(GetConsentStatusTypeFromIncludingToExcluding newGetConsentStatusTypeFromIncludingToExcluding) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToExcluding(), newGetConsentStatusTypeFromIncludingToExcluding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromIncludingToExcludingResponse getGetConsentStatusTypeFromIncludingToExcludingResponse() {
		return (GetConsentStatusTypeFromIncludingToExcludingResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToExcludingResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeFromIncludingToExcludingResponse(GetConsentStatusTypeFromIncludingToExcludingResponse newGetConsentStatusTypeFromIncludingToExcludingResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToExcludingResponse(), newGetConsentStatusTypeFromIncludingToExcludingResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeFromIncludingToExcludingResponse(GetConsentStatusTypeFromIncludingToExcludingResponse newGetConsentStatusTypeFromIncludingToExcludingResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToExcludingResponse(), newGetConsentStatusTypeFromIncludingToExcludingResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromIncludingToIncluding getGetConsentStatusTypeFromIncludingToIncluding() {
		return (GetConsentStatusTypeFromIncludingToIncluding)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToIncluding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeFromIncludingToIncluding(GetConsentStatusTypeFromIncludingToIncluding newGetConsentStatusTypeFromIncludingToIncluding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToIncluding(), newGetConsentStatusTypeFromIncludingToIncluding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeFromIncludingToIncluding(GetConsentStatusTypeFromIncludingToIncluding newGetConsentStatusTypeFromIncludingToIncluding) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToIncluding(), newGetConsentStatusTypeFromIncludingToIncluding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeFromIncludingToIncludingResponse getGetConsentStatusTypeFromIncludingToIncludingResponse() {
		return (GetConsentStatusTypeFromIncludingToIncludingResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToIncludingResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeFromIncludingToIncludingResponse(GetConsentStatusTypeFromIncludingToIncludingResponse newGetConsentStatusTypeFromIncludingToIncludingResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToIncludingResponse(), newGetConsentStatusTypeFromIncludingToIncludingResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeFromIncludingToIncludingResponse(GetConsentStatusTypeFromIncludingToIncludingResponse newGetConsentStatusTypeFromIncludingToIncludingResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeFromIncludingToIncludingResponse(), newGetConsentStatusTypeFromIncludingToIncludingResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentStatusTypeResponse getGetConsentStatusTypeResponse() {
		return (GetConsentStatusTypeResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentStatusTypeResponse(GetConsentStatusTypeResponse newGetConsentStatusTypeResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeResponse(), newGetConsentStatusTypeResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentStatusTypeResponse(GetConsentStatusTypeResponse newGetConsentStatusTypeResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentStatusTypeResponse(), newGetConsentStatusTypeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentTemplate getGetConsentTemplate() {
		return (GetConsentTemplate)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentTemplate(GetConsentTemplate newGetConsentTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentTemplate(), newGetConsentTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentTemplate(GetConsentTemplate newGetConsentTemplate) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentTemplate(), newGetConsentTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConsentTemplateResponse getGetConsentTemplateResponse() {
		return (GetConsentTemplateResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentTemplateResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConsentTemplateResponse(GetConsentTemplateResponse newGetConsentTemplateResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentTemplateResponse(), newGetConsentTemplateResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConsentTemplateResponse(GetConsentTemplateResponse newGetConsentTemplateResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetConsentTemplateResponse(), newGetConsentTemplateResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentConsentForSignerIdsAndCT getGetCurrentConsentForSignerIdsAndCT() {
		return (GetCurrentConsentForSignerIdsAndCT)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentForSignerIdsAndCT(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCurrentConsentForSignerIdsAndCT(GetCurrentConsentForSignerIdsAndCT newGetCurrentConsentForSignerIdsAndCT, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentForSignerIdsAndCT(), newGetCurrentConsentForSignerIdsAndCT, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCurrentConsentForSignerIdsAndCT(GetCurrentConsentForSignerIdsAndCT newGetCurrentConsentForSignerIdsAndCT) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentForSignerIdsAndCT(), newGetCurrentConsentForSignerIdsAndCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentConsentForSignerIdsAndCTResponse getGetCurrentConsentForSignerIdsAndCTResponse() {
		return (GetCurrentConsentForSignerIdsAndCTResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentForSignerIdsAndCTResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCurrentConsentForSignerIdsAndCTResponse(GetCurrentConsentForSignerIdsAndCTResponse newGetCurrentConsentForSignerIdsAndCTResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentForSignerIdsAndCTResponse(), newGetCurrentConsentForSignerIdsAndCTResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCurrentConsentForSignerIdsAndCTResponse(GetCurrentConsentForSignerIdsAndCTResponse newGetCurrentConsentForSignerIdsAndCTResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentForSignerIdsAndCTResponse(), newGetCurrentConsentForSignerIdsAndCTResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentConsentTemplate getGetCurrentConsentTemplate() {
		return (GetCurrentConsentTemplate)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCurrentConsentTemplate(GetCurrentConsentTemplate newGetCurrentConsentTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentTemplate(), newGetCurrentConsentTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCurrentConsentTemplate(GetCurrentConsentTemplate newGetCurrentConsentTemplate) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentTemplate(), newGetCurrentConsentTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentConsentTemplateResponse getGetCurrentConsentTemplateResponse() {
		return (GetCurrentConsentTemplateResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentTemplateResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCurrentConsentTemplateResponse(GetCurrentConsentTemplateResponse newGetCurrentConsentTemplateResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentTemplateResponse(), newGetCurrentConsentTemplateResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCurrentConsentTemplateResponse(GetCurrentConsentTemplateResponse newGetCurrentConsentTemplateResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentConsentTemplateResponse(), newGetCurrentConsentTemplateResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentPolicyStatesForSignerIds getGetCurrentPolicyStatesForSignerIds() {
		return (GetCurrentPolicyStatesForSignerIds)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentPolicyStatesForSignerIds(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCurrentPolicyStatesForSignerIds(GetCurrentPolicyStatesForSignerIds newGetCurrentPolicyStatesForSignerIds, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentPolicyStatesForSignerIds(), newGetCurrentPolicyStatesForSignerIds, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCurrentPolicyStatesForSignerIds(GetCurrentPolicyStatesForSignerIds newGetCurrentPolicyStatesForSignerIds) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentPolicyStatesForSignerIds(), newGetCurrentPolicyStatesForSignerIds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCurrentPolicyStatesForSignerIdsResponse getGetCurrentPolicyStatesForSignerIdsResponse() {
		return (GetCurrentPolicyStatesForSignerIdsResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentPolicyStatesForSignerIdsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCurrentPolicyStatesForSignerIdsResponse(GetCurrentPolicyStatesForSignerIdsResponse newGetCurrentPolicyStatesForSignerIdsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentPolicyStatesForSignerIdsResponse(), newGetCurrentPolicyStatesForSignerIdsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCurrentPolicyStatesForSignerIdsResponse(GetCurrentPolicyStatesForSignerIdsResponse newGetCurrentPolicyStatesForSignerIdsResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetCurrentPolicyStatesForSignerIdsResponse(), newGetCurrentPolicyStatesForSignerIdsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDomain getGetDomain() {
		return (GetDomain)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDomain(GetDomain newGetDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetDomain(), newGetDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetDomain(GetDomain newGetDomain) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetDomain(), newGetDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDomainResponse getGetDomainResponse() {
		return (GetDomainResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetDomainResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDomainResponse(GetDomainResponse newGetDomainResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetDomainResponse(), newGetDomainResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetDomainResponse(GetDomainResponse newGetDomainResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetDomainResponse(), newGetDomainResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetMappedTemplatesForSignerId getGetMappedTemplatesForSignerId() {
		return (GetMappedTemplatesForSignerId)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetMappedTemplatesForSignerId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetMappedTemplatesForSignerId(GetMappedTemplatesForSignerId newGetMappedTemplatesForSignerId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetMappedTemplatesForSignerId(), newGetMappedTemplatesForSignerId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetMappedTemplatesForSignerId(GetMappedTemplatesForSignerId newGetMappedTemplatesForSignerId) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetMappedTemplatesForSignerId(), newGetMappedTemplatesForSignerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetMappedTemplatesForSignerIdResponse getGetMappedTemplatesForSignerIdResponse() {
		return (GetMappedTemplatesForSignerIdResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetMappedTemplatesForSignerIdResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetMappedTemplatesForSignerIdResponse(GetMappedTemplatesForSignerIdResponse newGetMappedTemplatesForSignerIdResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetMappedTemplatesForSignerIdResponse(), newGetMappedTemplatesForSignerIdResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetMappedTemplatesForSignerIdResponse(GetMappedTemplatesForSignerIdResponse newGetMappedTemplatesForSignerIdResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetMappedTemplatesForSignerIdResponse(), newGetMappedTemplatesForSignerIdResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetModule getGetModule() {
		return (GetModule)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetModule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetModule(GetModule newGetModule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetModule(), newGetModule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetModule(GetModule newGetModule) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetModule(), newGetModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetModuleResponse getGetModuleResponse() {
		return (GetModuleResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetModuleResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetModuleResponse(GetModuleResponse newGetModuleResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetModuleResponse(), newGetModuleResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetModuleResponse(GetModuleResponse newGetModuleResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetModuleResponse(), newGetModuleResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetObjectByFhirID getGetObjectByFhirID() {
		return (GetObjectByFhirID)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetObjectByFhirID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetObjectByFhirID(GetObjectByFhirID newGetObjectByFhirID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetObjectByFhirID(), newGetObjectByFhirID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetObjectByFhirID(GetObjectByFhirID newGetObjectByFhirID) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetObjectByFhirID(), newGetObjectByFhirID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetObjectByFhirIDResponse getGetObjectByFhirIDResponse() {
		return (GetObjectByFhirIDResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetObjectByFhirIDResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetObjectByFhirIDResponse(GetObjectByFhirIDResponse newGetObjectByFhirIDResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetObjectByFhirIDResponse(), newGetObjectByFhirIDResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetObjectByFhirIDResponse(GetObjectByFhirIDResponse newGetObjectByFhirIDResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetObjectByFhirIDResponse(), newGetObjectByFhirIDResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicy getGetPolicy() {
		return (GetPolicy)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPolicy(GetPolicy newGetPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicy(), newGetPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPolicy(GetPolicy newGetPolicy) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicy(), newGetPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyResponse getGetPolicyResponse() {
		return (GetPolicyResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPolicyResponse(GetPolicyResponse newGetPolicyResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyResponse(), newGetPolicyResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPolicyResponse(GetPolicyResponse newGetPolicyResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyResponse(), newGetPolicyResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForPolicyAndSignerIds getGetPolicyStatesForPolicyAndSignerIds() {
		return (GetPolicyStatesForPolicyAndSignerIds)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyAndSignerIds(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPolicyStatesForPolicyAndSignerIds(GetPolicyStatesForPolicyAndSignerIds newGetPolicyStatesForPolicyAndSignerIds, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyAndSignerIds(), newGetPolicyStatesForPolicyAndSignerIds, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPolicyStatesForPolicyAndSignerIds(GetPolicyStatesForPolicyAndSignerIds newGetPolicyStatesForPolicyAndSignerIds) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyAndSignerIds(), newGetPolicyStatesForPolicyAndSignerIds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForPolicyAndSignerIdsResponse getGetPolicyStatesForPolicyAndSignerIdsResponse() {
		return (GetPolicyStatesForPolicyAndSignerIdsResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyAndSignerIdsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPolicyStatesForPolicyAndSignerIdsResponse(GetPolicyStatesForPolicyAndSignerIdsResponse newGetPolicyStatesForPolicyAndSignerIdsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyAndSignerIdsResponse(), newGetPolicyStatesForPolicyAndSignerIdsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPolicyStatesForPolicyAndSignerIdsResponse(GetPolicyStatesForPolicyAndSignerIdsResponse newGetPolicyStatesForPolicyAndSignerIdsResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyAndSignerIdsResponse(), newGetPolicyStatesForPolicyAndSignerIdsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForPolicyNameAndSignerIds getGetPolicyStatesForPolicyNameAndSignerIds() {
		return (GetPolicyStatesForPolicyNameAndSignerIds)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIds(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPolicyStatesForPolicyNameAndSignerIds(GetPolicyStatesForPolicyNameAndSignerIds newGetPolicyStatesForPolicyNameAndSignerIds, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIds(), newGetPolicyStatesForPolicyNameAndSignerIds, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPolicyStatesForPolicyNameAndSignerIds(GetPolicyStatesForPolicyNameAndSignerIds newGetPolicyStatesForPolicyNameAndSignerIds) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIds(), newGetPolicyStatesForPolicyNameAndSignerIds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForPolicyNameAndSignerIdsResponse getGetPolicyStatesForPolicyNameAndSignerIdsResponse() {
		return (GetPolicyStatesForPolicyNameAndSignerIdsResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIdsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPolicyStatesForPolicyNameAndSignerIdsResponse(GetPolicyStatesForPolicyNameAndSignerIdsResponse newGetPolicyStatesForPolicyNameAndSignerIdsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIdsResponse(), newGetPolicyStatesForPolicyNameAndSignerIdsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPolicyStatesForPolicyNameAndSignerIdsResponse(GetPolicyStatesForPolicyNameAndSignerIdsResponse newGetPolicyStatesForPolicyNameAndSignerIdsResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIdsResponse(), newGetPolicyStatesForPolicyNameAndSignerIdsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForSignerIds getGetPolicyStatesForSignerIds() {
		return (GetPolicyStatesForSignerIds)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForSignerIds(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPolicyStatesForSignerIds(GetPolicyStatesForSignerIds newGetPolicyStatesForSignerIds, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForSignerIds(), newGetPolicyStatesForSignerIds, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPolicyStatesForSignerIds(GetPolicyStatesForSignerIds newGetPolicyStatesForSignerIds) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForSignerIds(), newGetPolicyStatesForSignerIds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPolicyStatesForSignerIdsResponse getGetPolicyStatesForSignerIdsResponse() {
		return (GetPolicyStatesForSignerIdsResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForSignerIdsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPolicyStatesForSignerIdsResponse(GetPolicyStatesForSignerIdsResponse newGetPolicyStatesForSignerIdsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForSignerIdsResponse(), newGetPolicyStatesForSignerIdsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPolicyStatesForSignerIdsResponse(GetPolicyStatesForSignerIdsResponse newGetPolicyStatesForSignerIdsResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetPolicyStatesForSignerIdsResponse(), newGetPolicyStatesForSignerIdsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetQCHistoryForConsent getGetQCHistoryForConsent() {
		return (GetQCHistoryForConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetQCHistoryForConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetQCHistoryForConsent(GetQCHistoryForConsent newGetQCHistoryForConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetQCHistoryForConsent(), newGetQCHistoryForConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetQCHistoryForConsent(GetQCHistoryForConsent newGetQCHistoryForConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetQCHistoryForConsent(), newGetQCHistoryForConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetQCHistoryForConsentResponse getGetQCHistoryForConsentResponse() {
		return (GetQCHistoryForConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetQCHistoryForConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetQCHistoryForConsentResponse(GetQCHistoryForConsentResponse newGetQCHistoryForConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetQCHistoryForConsentResponse(), newGetQCHistoryForConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetQCHistoryForConsentResponse(GetQCHistoryForConsentResponse newGetQCHistoryForConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetQCHistoryForConsentResponse(), newGetQCHistoryForConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetQCProblemHistoryForQCProblem getGetQCProblemHistoryForQCProblem() {
		return (GetQCProblemHistoryForQCProblem)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetQCProblemHistoryForQCProblem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetQCProblemHistoryForQCProblem(GetQCProblemHistoryForQCProblem newGetQCProblemHistoryForQCProblem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetQCProblemHistoryForQCProblem(), newGetQCProblemHistoryForQCProblem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetQCProblemHistoryForQCProblem(GetQCProblemHistoryForQCProblem newGetQCProblemHistoryForQCProblem) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetQCProblemHistoryForQCProblem(), newGetQCProblemHistoryForQCProblem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetQCProblemHistoryForQCProblemResponse getGetQCProblemHistoryForQCProblemResponse() {
		return (GetQCProblemHistoryForQCProblemResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetQCProblemHistoryForQCProblemResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetQCProblemHistoryForQCProblemResponse(GetQCProblemHistoryForQCProblemResponse newGetQCProblemHistoryForQCProblemResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetQCProblemHistoryForQCProblemResponse(), newGetQCProblemHistoryForQCProblemResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetQCProblemHistoryForQCProblemResponse(GetQCProblemHistoryForQCProblemResponse newGetQCProblemHistoryForQCProblemResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetQCProblemHistoryForQCProblemResponse(), newGetQCProblemHistoryForQCProblemResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetSignerIdsForAlias getGetSignerIdsForAlias() {
		return (GetSignerIdsForAlias)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdsForAlias(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetSignerIdsForAlias(GetSignerIdsForAlias newGetSignerIdsForAlias, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdsForAlias(), newGetSignerIdsForAlias, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetSignerIdsForAlias(GetSignerIdsForAlias newGetSignerIdsForAlias) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdsForAlias(), newGetSignerIdsForAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetSignerIdsForAliasResponse getGetSignerIdsForAliasResponse() {
		return (GetSignerIdsForAliasResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdsForAliasResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetSignerIdsForAliasResponse(GetSignerIdsForAliasResponse newGetSignerIdsForAliasResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdsForAliasResponse(), newGetSignerIdsForAliasResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetSignerIdsForAliasResponse(GetSignerIdsForAliasResponse newGetSignerIdsForAliasResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdsForAliasResponse(), newGetSignerIdsForAliasResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetSignerIdType getGetSignerIdType() {
		return (GetSignerIdType)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetSignerIdType(GetSignerIdType newGetSignerIdType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdType(), newGetSignerIdType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetSignerIdType(GetSignerIdType newGetSignerIdType) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdType(), newGetSignerIdType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetSignerIdTypeResponse getGetSignerIdTypeResponse() {
		return (GetSignerIdTypeResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdTypeResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetSignerIdTypeResponse(GetSignerIdTypeResponse newGetSignerIdTypeResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdTypeResponse(), newGetSignerIdTypeResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetSignerIdTypeResponse(GetSignerIdTypeResponse newGetSignerIdTypeResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetSignerIdTypeResponse(), newGetSignerIdTypeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTemplatesWithPolicies getGetTemplatesWithPolicies() {
		return (GetTemplatesWithPolicies)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetTemplatesWithPolicies(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetTemplatesWithPolicies(GetTemplatesWithPolicies newGetTemplatesWithPolicies, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetTemplatesWithPolicies(), newGetTemplatesWithPolicies, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetTemplatesWithPolicies(GetTemplatesWithPolicies newGetTemplatesWithPolicies) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetTemplatesWithPolicies(), newGetTemplatesWithPolicies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTemplatesWithPoliciesResponse getGetTemplatesWithPoliciesResponse() {
		return (GetTemplatesWithPoliciesResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_GetTemplatesWithPoliciesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetTemplatesWithPoliciesResponse(GetTemplatesWithPoliciesResponse newGetTemplatesWithPoliciesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_GetTemplatesWithPoliciesResponse(), newGetTemplatesWithPoliciesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetTemplatesWithPoliciesResponse(GetTemplatesWithPoliciesResponse newGetTemplatesWithPoliciesResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_GetTemplatesWithPoliciesResponse(), newGetTemplatesWithPoliciesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException getIllegalArgumentException() {
		return (org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IllegalArgumentException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIllegalArgumentException(org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException newIllegalArgumentException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IllegalArgumentException(), newIllegalArgumentException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIllegalArgumentException(org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException newIllegalArgumentException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IllegalArgumentException(), newIllegalArgumentException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InconsistentStatusException getInconsistentStatusException() {
		return (InconsistentStatusException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_InconsistentStatusException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInconsistentStatusException(InconsistentStatusException newInconsistentStatusException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_InconsistentStatusException(), newInconsistentStatusException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInconsistentStatusException(InconsistentStatusException newInconsistentStatusException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_InconsistentStatusException(), newInconsistentStatusException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalException getInternalException() {
		return (InternalException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_InternalException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalException(InternalException newInternalException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_InternalException(), newInternalException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalException(InternalException newInternalException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_InternalException(), newInternalException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidFreeTextException getInvalidFreeTextException() {
		return (InvalidFreeTextException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_InvalidFreeTextException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvalidFreeTextException(InvalidFreeTextException newInvalidFreeTextException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_InvalidFreeTextException(), newInvalidFreeTextException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidFreeTextException(InvalidFreeTextException newInvalidFreeTextException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_InvalidFreeTextException(), newInvalidFreeTextException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidParameterException getInvalidParameterException() {
		return (InvalidParameterException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_InvalidParameterException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvalidParameterException(InvalidParameterException newInvalidParameterException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_InvalidParameterException(), newInvalidParameterException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidParameterException(InvalidParameterException newInvalidParameterException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_InvalidParameterException(), newInvalidParameterException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidVersionException getInvalidVersionException() {
		return (InvalidVersionException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_InvalidVersionException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvalidVersionException(InvalidVersionException newInvalidVersionException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_InvalidVersionException(), newInvalidVersionException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidVersionException(InvalidVersionException newInvalidVersionException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_InvalidVersionException(), newInvalidVersionException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsented getIsConsented() {
		return (IsConsented)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsented(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsented(IsConsented newIsConsented, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsented(), newIsConsented, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsented(IsConsented newIsConsented) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsented(), newIsConsented);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromExcludingToExcluding getIsConsentedFromExcludingToExcluding() {
		return (IsConsentedFromExcludingToExcluding)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToExcluding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedFromExcludingToExcluding(IsConsentedFromExcludingToExcluding newIsConsentedFromExcludingToExcluding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToExcluding(), newIsConsentedFromExcludingToExcluding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedFromExcludingToExcluding(IsConsentedFromExcludingToExcluding newIsConsentedFromExcludingToExcluding) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToExcluding(), newIsConsentedFromExcludingToExcluding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromExcludingToExcludingResponse getIsConsentedFromExcludingToExcludingResponse() {
		return (IsConsentedFromExcludingToExcludingResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToExcludingResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedFromExcludingToExcludingResponse(IsConsentedFromExcludingToExcludingResponse newIsConsentedFromExcludingToExcludingResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToExcludingResponse(), newIsConsentedFromExcludingToExcludingResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedFromExcludingToExcludingResponse(IsConsentedFromExcludingToExcludingResponse newIsConsentedFromExcludingToExcludingResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToExcludingResponse(), newIsConsentedFromExcludingToExcludingResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromExcludingToIncluding getIsConsentedFromExcludingToIncluding() {
		return (IsConsentedFromExcludingToIncluding)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToIncluding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedFromExcludingToIncluding(IsConsentedFromExcludingToIncluding newIsConsentedFromExcludingToIncluding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToIncluding(), newIsConsentedFromExcludingToIncluding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedFromExcludingToIncluding(IsConsentedFromExcludingToIncluding newIsConsentedFromExcludingToIncluding) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToIncluding(), newIsConsentedFromExcludingToIncluding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromExcludingToIncludingResponse getIsConsentedFromExcludingToIncludingResponse() {
		return (IsConsentedFromExcludingToIncludingResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToIncludingResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedFromExcludingToIncludingResponse(IsConsentedFromExcludingToIncludingResponse newIsConsentedFromExcludingToIncludingResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToIncludingResponse(), newIsConsentedFromExcludingToIncludingResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedFromExcludingToIncludingResponse(IsConsentedFromExcludingToIncludingResponse newIsConsentedFromExcludingToIncludingResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromExcludingToIncludingResponse(), newIsConsentedFromExcludingToIncludingResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromIncludingToExcluding getIsConsentedFromIncludingToExcluding() {
		return (IsConsentedFromIncludingToExcluding)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToExcluding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedFromIncludingToExcluding(IsConsentedFromIncludingToExcluding newIsConsentedFromIncludingToExcluding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToExcluding(), newIsConsentedFromIncludingToExcluding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedFromIncludingToExcluding(IsConsentedFromIncludingToExcluding newIsConsentedFromIncludingToExcluding) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToExcluding(), newIsConsentedFromIncludingToExcluding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromIncludingToExcludingResponse getIsConsentedFromIncludingToExcludingResponse() {
		return (IsConsentedFromIncludingToExcludingResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToExcludingResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedFromIncludingToExcludingResponse(IsConsentedFromIncludingToExcludingResponse newIsConsentedFromIncludingToExcludingResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToExcludingResponse(), newIsConsentedFromIncludingToExcludingResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedFromIncludingToExcludingResponse(IsConsentedFromIncludingToExcludingResponse newIsConsentedFromIncludingToExcludingResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToExcludingResponse(), newIsConsentedFromIncludingToExcludingResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromIncludingToIncluding getIsConsentedFromIncludingToIncluding() {
		return (IsConsentedFromIncludingToIncluding)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToIncluding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedFromIncludingToIncluding(IsConsentedFromIncludingToIncluding newIsConsentedFromIncludingToIncluding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToIncluding(), newIsConsentedFromIncludingToIncluding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedFromIncludingToIncluding(IsConsentedFromIncludingToIncluding newIsConsentedFromIncludingToIncluding) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToIncluding(), newIsConsentedFromIncludingToIncluding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedFromIncludingToIncludingResponse getIsConsentedFromIncludingToIncludingResponse() {
		return (IsConsentedFromIncludingToIncludingResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToIncludingResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedFromIncludingToIncludingResponse(IsConsentedFromIncludingToIncludingResponse newIsConsentedFromIncludingToIncludingResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToIncludingResponse(), newIsConsentedFromIncludingToIncludingResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedFromIncludingToIncludingResponse(IsConsentedFromIncludingToIncludingResponse newIsConsentedFromIncludingToIncludingResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedFromIncludingToIncludingResponse(), newIsConsentedFromIncludingToIncludingResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsConsentedResponse getIsConsentedResponse() {
		return (IsConsentedResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsentedResponse(IsConsentedResponse newIsConsentedResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedResponse(), newIsConsentedResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConsentedResponse(IsConsentedResponse newIsConsentedResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_IsConsentedResponse(), newIsConsentedResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListConsentTemplates getListConsentTemplates() {
		return (ListConsentTemplates)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListConsentTemplates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListConsentTemplates(ListConsentTemplates newListConsentTemplates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListConsentTemplates(), newListConsentTemplates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListConsentTemplates(ListConsentTemplates newListConsentTemplates) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListConsentTemplates(), newListConsentTemplates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListConsentTemplatesResponse getListConsentTemplatesResponse() {
		return (ListConsentTemplatesResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListConsentTemplatesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListConsentTemplatesResponse(ListConsentTemplatesResponse newListConsentTemplatesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListConsentTemplatesResponse(), newListConsentTemplatesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListConsentTemplatesResponse(ListConsentTemplatesResponse newListConsentTemplatesResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListConsentTemplatesResponse(), newListConsentTemplatesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListCurrentConsentTemplates getListCurrentConsentTemplates() {
		return (ListCurrentConsentTemplates)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListCurrentConsentTemplates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListCurrentConsentTemplates(ListCurrentConsentTemplates newListCurrentConsentTemplates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListCurrentConsentTemplates(), newListCurrentConsentTemplates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListCurrentConsentTemplates(ListCurrentConsentTemplates newListCurrentConsentTemplates) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListCurrentConsentTemplates(), newListCurrentConsentTemplates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListCurrentConsentTemplatesResponse getListCurrentConsentTemplatesResponse() {
		return (ListCurrentConsentTemplatesResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListCurrentConsentTemplatesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListCurrentConsentTemplatesResponse(ListCurrentConsentTemplatesResponse newListCurrentConsentTemplatesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListCurrentConsentTemplatesResponse(), newListCurrentConsentTemplatesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListCurrentConsentTemplatesResponse(ListCurrentConsentTemplatesResponse newListCurrentConsentTemplatesResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListCurrentConsentTemplatesResponse(), newListCurrentConsentTemplatesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListDomains getListDomains() {
		return (ListDomains)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListDomains(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListDomains(ListDomains newListDomains, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListDomains(), newListDomains, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListDomains(ListDomains newListDomains) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListDomains(), newListDomains);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListDomainsResponse getListDomainsResponse() {
		return (ListDomainsResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListDomainsResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListDomainsResponse(ListDomainsResponse newListDomainsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListDomainsResponse(), newListDomainsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListDomainsResponse(ListDomainsResponse newListDomainsResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListDomainsResponse(), newListDomainsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListModules getListModules() {
		return (ListModules)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListModules(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListModules(ListModules newListModules, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListModules(), newListModules, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListModules(ListModules newListModules) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListModules(), newListModules);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListModulesResponse getListModulesResponse() {
		return (ListModulesResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListModulesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListModulesResponse(ListModulesResponse newListModulesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListModulesResponse(), newListModulesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListModulesResponse(ListModulesResponse newListModulesResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListModulesResponse(), newListModulesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListPolicies getListPolicies() {
		return (ListPolicies)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListPolicies(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListPolicies(ListPolicies newListPolicies, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListPolicies(), newListPolicies, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListPolicies(ListPolicies newListPolicies) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListPolicies(), newListPolicies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListPoliciesResponse getListPoliciesResponse() {
		return (ListPoliciesResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListPoliciesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListPoliciesResponse(ListPoliciesResponse newListPoliciesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListPoliciesResponse(), newListPoliciesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListPoliciesResponse(ListPoliciesResponse newListPoliciesResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListPoliciesResponse(), newListPoliciesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListSignerIdTypes getListSignerIdTypes() {
		return (ListSignerIdTypes)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListSignerIdTypes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListSignerIdTypes(ListSignerIdTypes newListSignerIdTypes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListSignerIdTypes(), newListSignerIdTypes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListSignerIdTypes(ListSignerIdTypes newListSignerIdTypes) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListSignerIdTypes(), newListSignerIdTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListSignerIdTypesResponse getListSignerIdTypesResponse() {
		return (ListSignerIdTypesResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ListSignerIdTypesResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListSignerIdTypesResponse(ListSignerIdTypesResponse newListSignerIdTypesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ListSignerIdTypesResponse(), newListSignerIdTypesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListSignerIdTypesResponse(ListSignerIdTypesResponse newListSignerIdTypesResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ListSignerIdTypesResponse(), newListSignerIdTypesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryFieldsException getMandatoryFieldsException() {
		return (MandatoryFieldsException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_MandatoryFieldsException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandatoryFieldsException(MandatoryFieldsException newMandatoryFieldsException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_MandatoryFieldsException(), newMandatoryFieldsException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatoryFieldsException(MandatoryFieldsException newMandatoryFieldsException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_MandatoryFieldsException(), newMandatoryFieldsException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissingRequiredObjectException getMissingRequiredObjectException() {
		return (MissingRequiredObjectException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_MissingRequiredObjectException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissingRequiredObjectException(MissingRequiredObjectException newMissingRequiredObjectException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_MissingRequiredObjectException(), newMissingRequiredObjectException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMissingRequiredObjectException(MissingRequiredObjectException newMissingRequiredObjectException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_MissingRequiredObjectException(), newMissingRequiredObjectException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefuseConsent getRefuseConsent() {
		return (RefuseConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_RefuseConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefuseConsent(RefuseConsent newRefuseConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_RefuseConsent(), newRefuseConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefuseConsent(RefuseConsent newRefuseConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_RefuseConsent(), newRefuseConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefuseConsentResponse getRefuseConsentResponse() {
		return (RefuseConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_RefuseConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefuseConsentResponse(RefuseConsentResponse newRefuseConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_RefuseConsentResponse(), newRefuseConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefuseConsentResponse(RefuseConsentResponse newRefuseConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_RefuseConsentResponse(), newRefuseConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveScanFromConsent getRemoveScanFromConsent() {
		return (RemoveScanFromConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_RemoveScanFromConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveScanFromConsent(RemoveScanFromConsent newRemoveScanFromConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_RemoveScanFromConsent(), newRemoveScanFromConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveScanFromConsent(RemoveScanFromConsent newRemoveScanFromConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_RemoveScanFromConsent(), newRemoveScanFromConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveScanFromConsentResponse getRemoveScanFromConsentResponse() {
		return (RemoveScanFromConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_RemoveScanFromConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveScanFromConsentResponse(RemoveScanFromConsentResponse newRemoveScanFromConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_RemoveScanFromConsentResponse(), newRemoveScanFromConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveScanFromConsentResponse(RemoveScanFromConsentResponse newRemoveScanFromConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_RemoveScanFromConsentResponse(), newRemoveScanFromConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsNotFullfilledException getRequirementsNotFullfilledException() {
		return (RequirementsNotFullfilledException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_RequirementsNotFullfilledException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirementsNotFullfilledException(RequirementsNotFullfilledException newRequirementsNotFullfilledException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_RequirementsNotFullfilledException(), newRequirementsNotFullfilledException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementsNotFullfilledException(RequirementsNotFullfilledException newRequirementsNotFullfilledException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_RequirementsNotFullfilledException(), newRequirementsNotFullfilledException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetQCForConsent getSetQCForConsent() {
		return (SetQCForConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_SetQCForConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetQCForConsent(SetQCForConsent newSetQCForConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_SetQCForConsent(), newSetQCForConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetQCForConsent(SetQCForConsent newSetQCForConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_SetQCForConsent(), newSetQCForConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetQCForConsentResponse getSetQCForConsentResponse() {
		return (SetQCForConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_SetQCForConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetQCForConsentResponse(SetQCForConsentResponse newSetQCForConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_SetQCForConsentResponse(), newSetQCForConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetQCForConsentResponse(SetQCForConsentResponse newSetQCForConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_SetQCForConsentResponse(), newSetQCForConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownAliasException getUnknownAliasException() {
		return (UnknownAliasException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownAliasException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownAliasException(UnknownAliasException newUnknownAliasException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownAliasException(), newUnknownAliasException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownAliasException(UnknownAliasException newUnknownAliasException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownAliasException(), newUnknownAliasException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownConsentException getUnknownConsentException() {
		return (UnknownConsentException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownConsentException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownConsentException(UnknownConsentException newUnknownConsentException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownConsentException(), newUnknownConsentException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownConsentException(UnknownConsentException newUnknownConsentException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownConsentException(), newUnknownConsentException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownConsentTemplateException getUnknownConsentTemplateException() {
		return (UnknownConsentTemplateException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownConsentTemplateException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownConsentTemplateException(UnknownConsentTemplateException newUnknownConsentTemplateException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownConsentTemplateException(), newUnknownConsentTemplateException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownConsentTemplateException(UnknownConsentTemplateException newUnknownConsentTemplateException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownConsentTemplateException(), newUnknownConsentTemplateException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownDomainException getUnknownDomainException() {
		return (UnknownDomainException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownDomainException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownDomainException(UnknownDomainException newUnknownDomainException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownDomainException(), newUnknownDomainException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownDomainException(UnknownDomainException newUnknownDomainException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownDomainException(), newUnknownDomainException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownFhirIdObjectException getUnknownFhirIdObjectException() {
		return (UnknownFhirIdObjectException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownFhirIdObjectException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownFhirIdObjectException(UnknownFhirIdObjectException newUnknownFhirIdObjectException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownFhirIdObjectException(), newUnknownFhirIdObjectException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownFhirIdObjectException(UnknownFhirIdObjectException newUnknownFhirIdObjectException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownFhirIdObjectException(), newUnknownFhirIdObjectException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownIDException getUnknownIDException() {
		return (UnknownIDException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownIDException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownIDException(UnknownIDException newUnknownIDException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownIDException(), newUnknownIDException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownIDException(UnknownIDException newUnknownIDException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownIDException(), newUnknownIDException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownModuleException getUnknownModuleException() {
		return (UnknownModuleException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownModuleException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownModuleException(UnknownModuleException newUnknownModuleException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownModuleException(), newUnknownModuleException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownModuleException(UnknownModuleException newUnknownModuleException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownModuleException(), newUnknownModuleException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownPolicyException getUnknownPolicyException() {
		return (UnknownPolicyException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownPolicyException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownPolicyException(UnknownPolicyException newUnknownPolicyException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownPolicyException(), newUnknownPolicyException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownPolicyException(UnknownPolicyException newUnknownPolicyException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownPolicyException(), newUnknownPolicyException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownSignerIdException getUnknownSignerIdException() {
		return (UnknownSignerIdException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownSignerIdException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownSignerIdException(UnknownSignerIdException newUnknownSignerIdException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownSignerIdException(), newUnknownSignerIdException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownSignerIdException(UnknownSignerIdException newUnknownSignerIdException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownSignerIdException(), newUnknownSignerIdException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownSignerIdTypeException getUnknownSignerIdTypeException() {
		return (UnknownSignerIdTypeException)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UnknownSignerIdTypeException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownSignerIdTypeException(UnknownSignerIdTypeException newUnknownSignerIdTypeException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UnknownSignerIdTypeException(), newUnknownSignerIdTypeException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownSignerIdTypeException(UnknownSignerIdTypeException newUnknownSignerIdTypeException) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UnknownSignerIdTypeException(), newUnknownSignerIdTypeException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateConsentInUse getUpdateConsentInUse() {
		return (UpdateConsentInUse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UpdateConsentInUse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateConsentInUse(UpdateConsentInUse newUpdateConsentInUse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UpdateConsentInUse(), newUpdateConsentInUse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateConsentInUse(UpdateConsentInUse newUpdateConsentInUse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UpdateConsentInUse(), newUpdateConsentInUse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateConsentInUseResponse getUpdateConsentInUseResponse() {
		return (UpdateConsentInUseResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_UpdateConsentInUseResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateConsentInUseResponse(UpdateConsentInUseResponse newUpdateConsentInUseResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_UpdateConsentInUseResponse(), newUpdateConsentInUseResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateConsentInUseResponse(UpdateConsentInUseResponse newUpdateConsentInUseResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_UpdateConsentInUseResponse(), newUpdateConsentInUseResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidateConsent getValidateConsent() {
		return (ValidateConsent)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ValidateConsent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateConsent(ValidateConsent newValidateConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ValidateConsent(), newValidateConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateConsent(ValidateConsent newValidateConsent) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ValidateConsent(), newValidateConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidateConsentResponse getValidateConsentResponse() {
		return (ValidateConsentResponse)getMixed().get(Cm2Package.eINSTANCE.getDocumentRoot_ValidateConsentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateConsentResponse(ValidateConsentResponse newValidateConsentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Cm2Package.eINSTANCE.getDocumentRoot_ValidateConsentResponse(), newValidateConsentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateConsentResponse(ValidateConsentResponse newValidateConsentResponse) {
		((FeatureMap.Internal)getMixed()).set(Cm2Package.eINSTANCE.getDocumentRoot_ValidateConsentResponse(), newValidateConsentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Cm2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Cm2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS:
				return basicSetAddAlias(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS_RESPONSE:
				return basicSetAddAliasResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT:
				return basicSetAddConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT:
				return basicSetAddConsentOptOut(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT_RESPONSE:
				return basicSetAddConsentOptOutResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_RESPONSE:
				return basicSetAddConsentResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT:
				return basicSetAddScanToConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT_RESPONSE:
				return basicSetAddScanToConsentResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT:
				return basicSetAddSignerIdToConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT_RESPONSE:
				return basicSetAddSignerIdToConsentResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID:
				return basicSetAddSignerIdToSignerId(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE:
				return basicSetAddSignerIdToSignerIdResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER:
				return basicSetCountConsentsForDomainWithFilter(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE:
				return basicSetCountConsentsForDomainWithFilterResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES:
				return basicSetCountSignedPolicies(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES_RESPONSE:
				return basicSetCountSignedPoliciesResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS:
				return basicSetDeactivateAlias(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS_RESPONSE:
				return basicSetDeactivateAliasResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__DUPLICATE_ENTRY_EXCEPTION:
				return basicSetDuplicateEntryException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID:
				return basicSetGetAliasesForSignerId(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID_RESPONSE:
				return basicSetGetAliasesForSignerIdResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS:
				return basicSetGetAliasesForSignerIds(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS_RESPONSE:
				return basicSetGetAliasesForSignerIdsResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR:
				return basicSetGetAllConsentedIdsFor(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR_RESPONSE:
				return basicSetGetAllConsentedIdsForResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE:
				return basicSetGetAllConsentsForConsentTemplate(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE:
				return basicSetGetAllConsentsForConsentTemplateResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN:
				return basicSetGetAllConsentsForDomain(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE:
				return basicSetGetAllConsentsForDomainResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN:
				return basicSetGetAllConsentsForDomainWithoutScan(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE:
				return basicSetGetAllConsentsForDomainWithoutScanResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS:
				return basicSetGetAllConsentsForSignerIds(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE:
				return basicSetGetAllConsentsForSignerIdsResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE:
				return basicSetGetAllIdsForSignerIdType(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE:
				return basicSetGetAllIdsForSignerIdTypeResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT:
				return basicSetGetConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES:
				return basicSetGetConsentDates(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES_RESPONSE:
				return basicSetGetConsentDatesResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT:
				return basicSetGetConsentLight(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT_RESPONSE:
				return basicSetGetConsentLightResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_RESPONSE:
				return basicSetGetConsentResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED:
				return basicSetGetConsentsForDomainPaginated(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE:
				return basicSetGetConsentsForDomainPaginatedResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE:
				return basicSetGetConsentStatusType(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING:
				return basicSetGetConsentStatusTypeFromExcludingToExcluding(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				return basicSetGetConsentStatusTypeFromExcludingToExcludingResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING:
				return basicSetGetConsentStatusTypeFromExcludingToIncluding(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				return basicSetGetConsentStatusTypeFromExcludingToIncludingResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING:
				return basicSetGetConsentStatusTypeFromIncludingToExcluding(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				return basicSetGetConsentStatusTypeFromIncludingToExcludingResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING:
				return basicSetGetConsentStatusTypeFromIncludingToIncluding(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				return basicSetGetConsentStatusTypeFromIncludingToIncludingResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_RESPONSE:
				return basicSetGetConsentStatusTypeResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE:
				return basicSetGetConsentTemplate(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE_RESPONSE:
				return basicSetGetConsentTemplateResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT:
				return basicSetGetCurrentConsentForSignerIdsAndCT(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE:
				return basicSetGetCurrentConsentForSignerIdsAndCTResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE:
				return basicSetGetCurrentConsentTemplate(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE_RESPONSE:
				return basicSetGetCurrentConsentTemplateResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS:
				return basicSetGetCurrentPolicyStatesForSignerIds(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				return basicSetGetCurrentPolicyStatesForSignerIdsResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN:
				return basicSetGetDomain(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN_RESPONSE:
				return basicSetGetDomainResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID:
				return basicSetGetMappedTemplatesForSignerId(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE:
				return basicSetGetMappedTemplatesForSignerIdResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE:
				return basicSetGetModule(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE_RESPONSE:
				return basicSetGetModuleResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID:
				return basicSetGetObjectByFhirID(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID_RESPONSE:
				return basicSetGetObjectByFhirIDResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY:
				return basicSetGetPolicy(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_RESPONSE:
				return basicSetGetPolicyResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS:
				return basicSetGetPolicyStatesForPolicyAndSignerIds(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE:
				return basicSetGetPolicyStatesForPolicyAndSignerIdsResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS:
				return basicSetGetPolicyStatesForPolicyNameAndSignerIds(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE:
				return basicSetGetPolicyStatesForPolicyNameAndSignerIdsResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS:
				return basicSetGetPolicyStatesForSignerIds(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				return basicSetGetPolicyStatesForSignerIdsResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT:
				return basicSetGetQCHistoryForConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT_RESPONSE:
				return basicSetGetQCHistoryForConsentResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM:
				return basicSetGetQCProblemHistoryForQCProblem(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE:
				return basicSetGetQCProblemHistoryForQCProblemResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS:
				return basicSetGetSignerIdsForAlias(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS_RESPONSE:
				return basicSetGetSignerIdsForAliasResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE:
				return basicSetGetSignerIdType(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE_RESPONSE:
				return basicSetGetSignerIdTypeResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES:
				return basicSetGetTemplatesWithPolicies(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES_RESPONSE:
				return basicSetGetTemplatesWithPoliciesResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__ILLEGAL_ARGUMENT_EXCEPTION:
				return basicSetIllegalArgumentException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__INCONSISTENT_STATUS_EXCEPTION:
				return basicSetInconsistentStatusException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__INTERNAL_EXCEPTION:
				return basicSetInternalException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__INVALID_FREE_TEXT_EXCEPTION:
				return basicSetInvalidFreeTextException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__INVALID_PARAMETER_EXCEPTION:
				return basicSetInvalidParameterException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__INVALID_VERSION_EXCEPTION:
				return basicSetInvalidVersionException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED:
				return basicSetIsConsented(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING:
				return basicSetIsConsentedFromExcludingToExcluding(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				return basicSetIsConsentedFromExcludingToExcludingResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING:
				return basicSetIsConsentedFromExcludingToIncluding(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				return basicSetIsConsentedFromExcludingToIncludingResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING:
				return basicSetIsConsentedFromIncludingToExcluding(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				return basicSetIsConsentedFromIncludingToExcludingResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING:
				return basicSetIsConsentedFromIncludingToIncluding(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				return basicSetIsConsentedFromIncludingToIncludingResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_RESPONSE:
				return basicSetIsConsentedResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES:
				return basicSetListConsentTemplates(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES_RESPONSE:
				return basicSetListConsentTemplatesResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES:
				return basicSetListCurrentConsentTemplates(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE:
				return basicSetListCurrentConsentTemplatesResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS:
				return basicSetListDomains(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS_RESPONSE:
				return basicSetListDomainsResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES:
				return basicSetListModules(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES_RESPONSE:
				return basicSetListModulesResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES:
				return basicSetListPolicies(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES_RESPONSE:
				return basicSetListPoliciesResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES:
				return basicSetListSignerIdTypes(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES_RESPONSE:
				return basicSetListSignerIdTypesResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__MANDATORY_FIELDS_EXCEPTION:
				return basicSetMandatoryFieldsException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__MISSING_REQUIRED_OBJECT_EXCEPTION:
				return basicSetMissingRequiredObjectException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT:
				return basicSetRefuseConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT_RESPONSE:
				return basicSetRefuseConsentResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT:
				return basicSetRemoveScanFromConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT_RESPONSE:
				return basicSetRemoveScanFromConsentResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__REQUIREMENTS_NOT_FULLFILLED_EXCEPTION:
				return basicSetRequirementsNotFullfilledException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT:
				return basicSetSetQCForConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT_RESPONSE:
				return basicSetSetQCForConsentResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ALIAS_EXCEPTION:
				return basicSetUnknownAliasException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_EXCEPTION:
				return basicSetUnknownConsentException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_TEMPLATE_EXCEPTION:
				return basicSetUnknownConsentTemplateException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_DOMAIN_EXCEPTION:
				return basicSetUnknownDomainException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_FHIR_ID_OBJECT_EXCEPTION:
				return basicSetUnknownFhirIdObjectException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ID_EXCEPTION:
				return basicSetUnknownIDException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_MODULE_EXCEPTION:
				return basicSetUnknownModuleException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_POLICY_EXCEPTION:
				return basicSetUnknownPolicyException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_EXCEPTION:
				return basicSetUnknownSignerIdException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_TYPE_EXCEPTION:
				return basicSetUnknownSignerIdTypeException(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE:
				return basicSetUpdateConsentInUse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE_RESPONSE:
				return basicSetUpdateConsentInUseResponse(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT:
				return basicSetValidateConsent(null, msgs);
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT_RESPONSE:
				return basicSetValidateConsentResponse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Cm2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Cm2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS:
				return getAddAlias();
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS_RESPONSE:
				return getAddAliasResponse();
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT:
				return getAddConsent();
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT:
				return getAddConsentOptOut();
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT_RESPONSE:
				return getAddConsentOptOutResponse();
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_RESPONSE:
				return getAddConsentResponse();
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT:
				return getAddScanToConsent();
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT_RESPONSE:
				return getAddScanToConsentResponse();
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT:
				return getAddSignerIdToConsent();
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT_RESPONSE:
				return getAddSignerIdToConsentResponse();
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID:
				return getAddSignerIdToSignerId();
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE:
				return getAddSignerIdToSignerIdResponse();
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER:
				return getCountConsentsForDomainWithFilter();
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE:
				return getCountConsentsForDomainWithFilterResponse();
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES:
				return getCountSignedPolicies();
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES_RESPONSE:
				return getCountSignedPoliciesResponse();
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS:
				return getDeactivateAlias();
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS_RESPONSE:
				return getDeactivateAliasResponse();
			case Cm2Package.DOCUMENT_ROOT__DUPLICATE_ENTRY_EXCEPTION:
				return getDuplicateEntryException();
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID:
				return getGetAliasesForSignerId();
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID_RESPONSE:
				return getGetAliasesForSignerIdResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS:
				return getGetAliasesForSignerIds();
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS_RESPONSE:
				return getGetAliasesForSignerIdsResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR:
				return getGetAllConsentedIdsFor();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR_RESPONSE:
				return getGetAllConsentedIdsForResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE:
				return getGetAllConsentsForConsentTemplate();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE:
				return getGetAllConsentsForConsentTemplateResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN:
				return getGetAllConsentsForDomain();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE:
				return getGetAllConsentsForDomainResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN:
				return getGetAllConsentsForDomainWithoutScan();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE:
				return getGetAllConsentsForDomainWithoutScanResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS:
				return getGetAllConsentsForSignerIds();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE:
				return getGetAllConsentsForSignerIdsResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE:
				return getGetAllIdsForSignerIdType();
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE:
				return getGetAllIdsForSignerIdTypeResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT:
				return getGetConsent();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES:
				return getGetConsentDates();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES_RESPONSE:
				return getGetConsentDatesResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT:
				return getGetConsentLight();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT_RESPONSE:
				return getGetConsentLightResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_RESPONSE:
				return getGetConsentResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED:
				return getGetConsentsForDomainPaginated();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE:
				return getGetConsentsForDomainPaginatedResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE:
				return getGetConsentStatusType();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING:
				return getGetConsentStatusTypeFromExcludingToExcluding();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				return getGetConsentStatusTypeFromExcludingToExcludingResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING:
				return getGetConsentStatusTypeFromExcludingToIncluding();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				return getGetConsentStatusTypeFromExcludingToIncludingResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING:
				return getGetConsentStatusTypeFromIncludingToExcluding();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				return getGetConsentStatusTypeFromIncludingToExcludingResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING:
				return getGetConsentStatusTypeFromIncludingToIncluding();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				return getGetConsentStatusTypeFromIncludingToIncludingResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_RESPONSE:
				return getGetConsentStatusTypeResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE:
				return getGetConsentTemplate();
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE_RESPONSE:
				return getGetConsentTemplateResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT:
				return getGetCurrentConsentForSignerIdsAndCT();
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE:
				return getGetCurrentConsentForSignerIdsAndCTResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE:
				return getGetCurrentConsentTemplate();
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE_RESPONSE:
				return getGetCurrentConsentTemplateResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS:
				return getGetCurrentPolicyStatesForSignerIds();
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				return getGetCurrentPolicyStatesForSignerIdsResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN:
				return getGetDomain();
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN_RESPONSE:
				return getGetDomainResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID:
				return getGetMappedTemplatesForSignerId();
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE:
				return getGetMappedTemplatesForSignerIdResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE:
				return getGetModule();
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE_RESPONSE:
				return getGetModuleResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID:
				return getGetObjectByFhirID();
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID_RESPONSE:
				return getGetObjectByFhirIDResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY:
				return getGetPolicy();
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_RESPONSE:
				return getGetPolicyResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS:
				return getGetPolicyStatesForPolicyAndSignerIds();
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE:
				return getGetPolicyStatesForPolicyAndSignerIdsResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS:
				return getGetPolicyStatesForPolicyNameAndSignerIds();
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE:
				return getGetPolicyStatesForPolicyNameAndSignerIdsResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS:
				return getGetPolicyStatesForSignerIds();
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				return getGetPolicyStatesForSignerIdsResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT:
				return getGetQCHistoryForConsent();
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT_RESPONSE:
				return getGetQCHistoryForConsentResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM:
				return getGetQCProblemHistoryForQCProblem();
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE:
				return getGetQCProblemHistoryForQCProblemResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS:
				return getGetSignerIdsForAlias();
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS_RESPONSE:
				return getGetSignerIdsForAliasResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE:
				return getGetSignerIdType();
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE_RESPONSE:
				return getGetSignerIdTypeResponse();
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES:
				return getGetTemplatesWithPolicies();
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES_RESPONSE:
				return getGetTemplatesWithPoliciesResponse();
			case Cm2Package.DOCUMENT_ROOT__ILLEGAL_ARGUMENT_EXCEPTION:
				return getIllegalArgumentException();
			case Cm2Package.DOCUMENT_ROOT__INCONSISTENT_STATUS_EXCEPTION:
				return getInconsistentStatusException();
			case Cm2Package.DOCUMENT_ROOT__INTERNAL_EXCEPTION:
				return getInternalException();
			case Cm2Package.DOCUMENT_ROOT__INVALID_FREE_TEXT_EXCEPTION:
				return getInvalidFreeTextException();
			case Cm2Package.DOCUMENT_ROOT__INVALID_PARAMETER_EXCEPTION:
				return getInvalidParameterException();
			case Cm2Package.DOCUMENT_ROOT__INVALID_VERSION_EXCEPTION:
				return getInvalidVersionException();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED:
				return getIsConsented();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING:
				return getIsConsentedFromExcludingToExcluding();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				return getIsConsentedFromExcludingToExcludingResponse();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING:
				return getIsConsentedFromExcludingToIncluding();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				return getIsConsentedFromExcludingToIncludingResponse();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING:
				return getIsConsentedFromIncludingToExcluding();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				return getIsConsentedFromIncludingToExcludingResponse();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING:
				return getIsConsentedFromIncludingToIncluding();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				return getIsConsentedFromIncludingToIncludingResponse();
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_RESPONSE:
				return getIsConsentedResponse();
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES:
				return getListConsentTemplates();
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES_RESPONSE:
				return getListConsentTemplatesResponse();
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES:
				return getListCurrentConsentTemplates();
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE:
				return getListCurrentConsentTemplatesResponse();
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS:
				return getListDomains();
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS_RESPONSE:
				return getListDomainsResponse();
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES:
				return getListModules();
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES_RESPONSE:
				return getListModulesResponse();
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES:
				return getListPolicies();
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES_RESPONSE:
				return getListPoliciesResponse();
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES:
				return getListSignerIdTypes();
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES_RESPONSE:
				return getListSignerIdTypesResponse();
			case Cm2Package.DOCUMENT_ROOT__MANDATORY_FIELDS_EXCEPTION:
				return getMandatoryFieldsException();
			case Cm2Package.DOCUMENT_ROOT__MISSING_REQUIRED_OBJECT_EXCEPTION:
				return getMissingRequiredObjectException();
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT:
				return getRefuseConsent();
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT_RESPONSE:
				return getRefuseConsentResponse();
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT:
				return getRemoveScanFromConsent();
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT_RESPONSE:
				return getRemoveScanFromConsentResponse();
			case Cm2Package.DOCUMENT_ROOT__REQUIREMENTS_NOT_FULLFILLED_EXCEPTION:
				return getRequirementsNotFullfilledException();
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT:
				return getSetQCForConsent();
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT_RESPONSE:
				return getSetQCForConsentResponse();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ALIAS_EXCEPTION:
				return getUnknownAliasException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_EXCEPTION:
				return getUnknownConsentException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_TEMPLATE_EXCEPTION:
				return getUnknownConsentTemplateException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_DOMAIN_EXCEPTION:
				return getUnknownDomainException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_FHIR_ID_OBJECT_EXCEPTION:
				return getUnknownFhirIdObjectException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ID_EXCEPTION:
				return getUnknownIDException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_MODULE_EXCEPTION:
				return getUnknownModuleException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_POLICY_EXCEPTION:
				return getUnknownPolicyException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_EXCEPTION:
				return getUnknownSignerIdException();
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_TYPE_EXCEPTION:
				return getUnknownSignerIdTypeException();
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE:
				return getUpdateConsentInUse();
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE_RESPONSE:
				return getUpdateConsentInUseResponse();
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT:
				return getValidateConsent();
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT_RESPONSE:
				return getValidateConsentResponse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Cm2Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS:
				setAddAlias((AddAlias)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS_RESPONSE:
				setAddAliasResponse((AddAliasResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT:
				setAddConsent((AddConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT:
				setAddConsentOptOut((AddConsentOptOut)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT_RESPONSE:
				setAddConsentOptOutResponse((AddConsentOptOutResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_RESPONSE:
				setAddConsentResponse((AddConsentResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT:
				setAddScanToConsent((AddScanToConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT_RESPONSE:
				setAddScanToConsentResponse((AddScanToConsentResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT:
				setAddSignerIdToConsent((AddSignerIdToConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT_RESPONSE:
				setAddSignerIdToConsentResponse((AddSignerIdToConsentResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID:
				setAddSignerIdToSignerId((AddSignerIdToSignerId)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE:
				setAddSignerIdToSignerIdResponse((AddSignerIdToSignerIdResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER:
				setCountConsentsForDomainWithFilter((CountConsentsForDomainWithFilter)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE:
				setCountConsentsForDomainWithFilterResponse((CountConsentsForDomainWithFilterResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES:
				setCountSignedPolicies((CountSignedPolicies)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES_RESPONSE:
				setCountSignedPoliciesResponse((CountSignedPoliciesResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS:
				setDeactivateAlias((DeactivateAlias)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS_RESPONSE:
				setDeactivateAliasResponse((DeactivateAliasResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__DUPLICATE_ENTRY_EXCEPTION:
				setDuplicateEntryException((DuplicateEntryException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID:
				setGetAliasesForSignerId((GetAliasesForSignerId)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID_RESPONSE:
				setGetAliasesForSignerIdResponse((GetAliasesForSignerIdResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS:
				setGetAliasesForSignerIds((GetAliasesForSignerIds)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS_RESPONSE:
				setGetAliasesForSignerIdsResponse((GetAliasesForSignerIdsResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR:
				setGetAllConsentedIdsFor((GetAllConsentedIdsFor)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR_RESPONSE:
				setGetAllConsentedIdsForResponse((GetAllConsentedIdsForResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE:
				setGetAllConsentsForConsentTemplate((GetAllConsentsForConsentTemplate)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE:
				setGetAllConsentsForConsentTemplateResponse((GetAllConsentsForConsentTemplateResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN:
				setGetAllConsentsForDomain((GetAllConsentsForDomain)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE:
				setGetAllConsentsForDomainResponse((GetAllConsentsForDomainResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN:
				setGetAllConsentsForDomainWithoutScan((GetAllConsentsForDomainWithoutScan)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE:
				setGetAllConsentsForDomainWithoutScanResponse((GetAllConsentsForDomainWithoutScanResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS:
				setGetAllConsentsForSignerIds((GetAllConsentsForSignerIds)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE:
				setGetAllConsentsForSignerIdsResponse((GetAllConsentsForSignerIdsResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE:
				setGetAllIdsForSignerIdType((GetAllIdsForSignerIdType)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE:
				setGetAllIdsForSignerIdTypeResponse((GetAllIdsForSignerIdTypeResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT:
				setGetConsent((GetConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES:
				setGetConsentDates((GetConsentDates)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES_RESPONSE:
				setGetConsentDatesResponse((GetConsentDatesResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT:
				setGetConsentLight((GetConsentLight)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT_RESPONSE:
				setGetConsentLightResponse((GetConsentLightResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_RESPONSE:
				setGetConsentResponse((GetConsentResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED:
				setGetConsentsForDomainPaginated((GetConsentsForDomainPaginated)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE:
				setGetConsentsForDomainPaginatedResponse((GetConsentsForDomainPaginatedResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE:
				setGetConsentStatusType((GetConsentStatusType)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING:
				setGetConsentStatusTypeFromExcludingToExcluding((GetConsentStatusTypeFromExcludingToExcluding)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				setGetConsentStatusTypeFromExcludingToExcludingResponse((GetConsentStatusTypeFromExcludingToExcludingResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING:
				setGetConsentStatusTypeFromExcludingToIncluding((GetConsentStatusTypeFromExcludingToIncluding)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				setGetConsentStatusTypeFromExcludingToIncludingResponse((GetConsentStatusTypeFromExcludingToIncludingResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING:
				setGetConsentStatusTypeFromIncludingToExcluding((GetConsentStatusTypeFromIncludingToExcluding)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				setGetConsentStatusTypeFromIncludingToExcludingResponse((GetConsentStatusTypeFromIncludingToExcludingResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING:
				setGetConsentStatusTypeFromIncludingToIncluding((GetConsentStatusTypeFromIncludingToIncluding)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				setGetConsentStatusTypeFromIncludingToIncludingResponse((GetConsentStatusTypeFromIncludingToIncludingResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_RESPONSE:
				setGetConsentStatusTypeResponse((GetConsentStatusTypeResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE:
				setGetConsentTemplate((GetConsentTemplate)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE_RESPONSE:
				setGetConsentTemplateResponse((GetConsentTemplateResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT:
				setGetCurrentConsentForSignerIdsAndCT((GetCurrentConsentForSignerIdsAndCT)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE:
				setGetCurrentConsentForSignerIdsAndCTResponse((GetCurrentConsentForSignerIdsAndCTResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE:
				setGetCurrentConsentTemplate((GetCurrentConsentTemplate)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE_RESPONSE:
				setGetCurrentConsentTemplateResponse((GetCurrentConsentTemplateResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS:
				setGetCurrentPolicyStatesForSignerIds((GetCurrentPolicyStatesForSignerIds)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				setGetCurrentPolicyStatesForSignerIdsResponse((GetCurrentPolicyStatesForSignerIdsResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN:
				setGetDomain((GetDomain)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN_RESPONSE:
				setGetDomainResponse((GetDomainResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID:
				setGetMappedTemplatesForSignerId((GetMappedTemplatesForSignerId)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE:
				setGetMappedTemplatesForSignerIdResponse((GetMappedTemplatesForSignerIdResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE:
				setGetModule((GetModule)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE_RESPONSE:
				setGetModuleResponse((GetModuleResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID:
				setGetObjectByFhirID((GetObjectByFhirID)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID_RESPONSE:
				setGetObjectByFhirIDResponse((GetObjectByFhirIDResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY:
				setGetPolicy((GetPolicy)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_RESPONSE:
				setGetPolicyResponse((GetPolicyResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS:
				setGetPolicyStatesForPolicyAndSignerIds((GetPolicyStatesForPolicyAndSignerIds)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE:
				setGetPolicyStatesForPolicyAndSignerIdsResponse((GetPolicyStatesForPolicyAndSignerIdsResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS:
				setGetPolicyStatesForPolicyNameAndSignerIds((GetPolicyStatesForPolicyNameAndSignerIds)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE:
				setGetPolicyStatesForPolicyNameAndSignerIdsResponse((GetPolicyStatesForPolicyNameAndSignerIdsResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS:
				setGetPolicyStatesForSignerIds((GetPolicyStatesForSignerIds)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				setGetPolicyStatesForSignerIdsResponse((GetPolicyStatesForSignerIdsResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT:
				setGetQCHistoryForConsent((GetQCHistoryForConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT_RESPONSE:
				setGetQCHistoryForConsentResponse((GetQCHistoryForConsentResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM:
				setGetQCProblemHistoryForQCProblem((GetQCProblemHistoryForQCProblem)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE:
				setGetQCProblemHistoryForQCProblemResponse((GetQCProblemHistoryForQCProblemResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS:
				setGetSignerIdsForAlias((GetSignerIdsForAlias)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS_RESPONSE:
				setGetSignerIdsForAliasResponse((GetSignerIdsForAliasResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE:
				setGetSignerIdType((GetSignerIdType)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE_RESPONSE:
				setGetSignerIdTypeResponse((GetSignerIdTypeResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES:
				setGetTemplatesWithPolicies((GetTemplatesWithPolicies)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES_RESPONSE:
				setGetTemplatesWithPoliciesResponse((GetTemplatesWithPoliciesResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__ILLEGAL_ARGUMENT_EXCEPTION:
				setIllegalArgumentException((org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__INCONSISTENT_STATUS_EXCEPTION:
				setInconsistentStatusException((InconsistentStatusException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__INTERNAL_EXCEPTION:
				setInternalException((InternalException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__INVALID_FREE_TEXT_EXCEPTION:
				setInvalidFreeTextException((InvalidFreeTextException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__INVALID_PARAMETER_EXCEPTION:
				setInvalidParameterException((InvalidParameterException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__INVALID_VERSION_EXCEPTION:
				setInvalidVersionException((InvalidVersionException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED:
				setIsConsented((IsConsented)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING:
				setIsConsentedFromExcludingToExcluding((IsConsentedFromExcludingToExcluding)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				setIsConsentedFromExcludingToExcludingResponse((IsConsentedFromExcludingToExcludingResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING:
				setIsConsentedFromExcludingToIncluding((IsConsentedFromExcludingToIncluding)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				setIsConsentedFromExcludingToIncludingResponse((IsConsentedFromExcludingToIncludingResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING:
				setIsConsentedFromIncludingToExcluding((IsConsentedFromIncludingToExcluding)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				setIsConsentedFromIncludingToExcludingResponse((IsConsentedFromIncludingToExcludingResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING:
				setIsConsentedFromIncludingToIncluding((IsConsentedFromIncludingToIncluding)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				setIsConsentedFromIncludingToIncludingResponse((IsConsentedFromIncludingToIncludingResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_RESPONSE:
				setIsConsentedResponse((IsConsentedResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES:
				setListConsentTemplates((ListConsentTemplates)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES_RESPONSE:
				setListConsentTemplatesResponse((ListConsentTemplatesResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES:
				setListCurrentConsentTemplates((ListCurrentConsentTemplates)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE:
				setListCurrentConsentTemplatesResponse((ListCurrentConsentTemplatesResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS:
				setListDomains((ListDomains)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS_RESPONSE:
				setListDomainsResponse((ListDomainsResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES:
				setListModules((ListModules)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES_RESPONSE:
				setListModulesResponse((ListModulesResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES:
				setListPolicies((ListPolicies)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES_RESPONSE:
				setListPoliciesResponse((ListPoliciesResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES:
				setListSignerIdTypes((ListSignerIdTypes)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES_RESPONSE:
				setListSignerIdTypesResponse((ListSignerIdTypesResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__MANDATORY_FIELDS_EXCEPTION:
				setMandatoryFieldsException((MandatoryFieldsException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__MISSING_REQUIRED_OBJECT_EXCEPTION:
				setMissingRequiredObjectException((MissingRequiredObjectException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT:
				setRefuseConsent((RefuseConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT_RESPONSE:
				setRefuseConsentResponse((RefuseConsentResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT:
				setRemoveScanFromConsent((RemoveScanFromConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT_RESPONSE:
				setRemoveScanFromConsentResponse((RemoveScanFromConsentResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__REQUIREMENTS_NOT_FULLFILLED_EXCEPTION:
				setRequirementsNotFullfilledException((RequirementsNotFullfilledException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT:
				setSetQCForConsent((SetQCForConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT_RESPONSE:
				setSetQCForConsentResponse((SetQCForConsentResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ALIAS_EXCEPTION:
				setUnknownAliasException((UnknownAliasException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_EXCEPTION:
				setUnknownConsentException((UnknownConsentException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_TEMPLATE_EXCEPTION:
				setUnknownConsentTemplateException((UnknownConsentTemplateException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_DOMAIN_EXCEPTION:
				setUnknownDomainException((UnknownDomainException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_FHIR_ID_OBJECT_EXCEPTION:
				setUnknownFhirIdObjectException((UnknownFhirIdObjectException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ID_EXCEPTION:
				setUnknownIDException((UnknownIDException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_MODULE_EXCEPTION:
				setUnknownModuleException((UnknownModuleException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_POLICY_EXCEPTION:
				setUnknownPolicyException((UnknownPolicyException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_EXCEPTION:
				setUnknownSignerIdException((UnknownSignerIdException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_TYPE_EXCEPTION:
				setUnknownSignerIdTypeException((UnknownSignerIdTypeException)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE:
				setUpdateConsentInUse((UpdateConsentInUse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE_RESPONSE:
				setUpdateConsentInUseResponse((UpdateConsentInUseResponse)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT:
				setValidateConsent((ValidateConsent)newValue);
				return;
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT_RESPONSE:
				setValidateConsentResponse((ValidateConsentResponse)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Cm2Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Cm2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Cm2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS:
				setAddAlias((AddAlias)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS_RESPONSE:
				setAddAliasResponse((AddAliasResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT:
				setAddConsent((AddConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT:
				setAddConsentOptOut((AddConsentOptOut)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT_RESPONSE:
				setAddConsentOptOutResponse((AddConsentOptOutResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_RESPONSE:
				setAddConsentResponse((AddConsentResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT:
				setAddScanToConsent((AddScanToConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT_RESPONSE:
				setAddScanToConsentResponse((AddScanToConsentResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT:
				setAddSignerIdToConsent((AddSignerIdToConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT_RESPONSE:
				setAddSignerIdToConsentResponse((AddSignerIdToConsentResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID:
				setAddSignerIdToSignerId((AddSignerIdToSignerId)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE:
				setAddSignerIdToSignerIdResponse((AddSignerIdToSignerIdResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER:
				setCountConsentsForDomainWithFilter((CountConsentsForDomainWithFilter)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE:
				setCountConsentsForDomainWithFilterResponse((CountConsentsForDomainWithFilterResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES:
				setCountSignedPolicies((CountSignedPolicies)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES_RESPONSE:
				setCountSignedPoliciesResponse((CountSignedPoliciesResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS:
				setDeactivateAlias((DeactivateAlias)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS_RESPONSE:
				setDeactivateAliasResponse((DeactivateAliasResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__DUPLICATE_ENTRY_EXCEPTION:
				setDuplicateEntryException((DuplicateEntryException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID:
				setGetAliasesForSignerId((GetAliasesForSignerId)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID_RESPONSE:
				setGetAliasesForSignerIdResponse((GetAliasesForSignerIdResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS:
				setGetAliasesForSignerIds((GetAliasesForSignerIds)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS_RESPONSE:
				setGetAliasesForSignerIdsResponse((GetAliasesForSignerIdsResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR:
				setGetAllConsentedIdsFor((GetAllConsentedIdsFor)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR_RESPONSE:
				setGetAllConsentedIdsForResponse((GetAllConsentedIdsForResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE:
				setGetAllConsentsForConsentTemplate((GetAllConsentsForConsentTemplate)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE:
				setGetAllConsentsForConsentTemplateResponse((GetAllConsentsForConsentTemplateResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN:
				setGetAllConsentsForDomain((GetAllConsentsForDomain)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE:
				setGetAllConsentsForDomainResponse((GetAllConsentsForDomainResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN:
				setGetAllConsentsForDomainWithoutScan((GetAllConsentsForDomainWithoutScan)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE:
				setGetAllConsentsForDomainWithoutScanResponse((GetAllConsentsForDomainWithoutScanResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS:
				setGetAllConsentsForSignerIds((GetAllConsentsForSignerIds)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE:
				setGetAllConsentsForSignerIdsResponse((GetAllConsentsForSignerIdsResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE:
				setGetAllIdsForSignerIdType((GetAllIdsForSignerIdType)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE:
				setGetAllIdsForSignerIdTypeResponse((GetAllIdsForSignerIdTypeResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT:
				setGetConsent((GetConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES:
				setGetConsentDates((GetConsentDates)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES_RESPONSE:
				setGetConsentDatesResponse((GetConsentDatesResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT:
				setGetConsentLight((GetConsentLight)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT_RESPONSE:
				setGetConsentLightResponse((GetConsentLightResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_RESPONSE:
				setGetConsentResponse((GetConsentResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED:
				setGetConsentsForDomainPaginated((GetConsentsForDomainPaginated)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE:
				setGetConsentsForDomainPaginatedResponse((GetConsentsForDomainPaginatedResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE:
				setGetConsentStatusType((GetConsentStatusType)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING:
				setGetConsentStatusTypeFromExcludingToExcluding((GetConsentStatusTypeFromExcludingToExcluding)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				setGetConsentStatusTypeFromExcludingToExcludingResponse((GetConsentStatusTypeFromExcludingToExcludingResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING:
				setGetConsentStatusTypeFromExcludingToIncluding((GetConsentStatusTypeFromExcludingToIncluding)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				setGetConsentStatusTypeFromExcludingToIncludingResponse((GetConsentStatusTypeFromExcludingToIncludingResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING:
				setGetConsentStatusTypeFromIncludingToExcluding((GetConsentStatusTypeFromIncludingToExcluding)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				setGetConsentStatusTypeFromIncludingToExcludingResponse((GetConsentStatusTypeFromIncludingToExcludingResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING:
				setGetConsentStatusTypeFromIncludingToIncluding((GetConsentStatusTypeFromIncludingToIncluding)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				setGetConsentStatusTypeFromIncludingToIncludingResponse((GetConsentStatusTypeFromIncludingToIncludingResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_RESPONSE:
				setGetConsentStatusTypeResponse((GetConsentStatusTypeResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE:
				setGetConsentTemplate((GetConsentTemplate)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE_RESPONSE:
				setGetConsentTemplateResponse((GetConsentTemplateResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT:
				setGetCurrentConsentForSignerIdsAndCT((GetCurrentConsentForSignerIdsAndCT)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE:
				setGetCurrentConsentForSignerIdsAndCTResponse((GetCurrentConsentForSignerIdsAndCTResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE:
				setGetCurrentConsentTemplate((GetCurrentConsentTemplate)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE_RESPONSE:
				setGetCurrentConsentTemplateResponse((GetCurrentConsentTemplateResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS:
				setGetCurrentPolicyStatesForSignerIds((GetCurrentPolicyStatesForSignerIds)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				setGetCurrentPolicyStatesForSignerIdsResponse((GetCurrentPolicyStatesForSignerIdsResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN:
				setGetDomain((GetDomain)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN_RESPONSE:
				setGetDomainResponse((GetDomainResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID:
				setGetMappedTemplatesForSignerId((GetMappedTemplatesForSignerId)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE:
				setGetMappedTemplatesForSignerIdResponse((GetMappedTemplatesForSignerIdResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE:
				setGetModule((GetModule)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE_RESPONSE:
				setGetModuleResponse((GetModuleResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID:
				setGetObjectByFhirID((GetObjectByFhirID)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID_RESPONSE:
				setGetObjectByFhirIDResponse((GetObjectByFhirIDResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY:
				setGetPolicy((GetPolicy)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_RESPONSE:
				setGetPolicyResponse((GetPolicyResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS:
				setGetPolicyStatesForPolicyAndSignerIds((GetPolicyStatesForPolicyAndSignerIds)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE:
				setGetPolicyStatesForPolicyAndSignerIdsResponse((GetPolicyStatesForPolicyAndSignerIdsResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS:
				setGetPolicyStatesForPolicyNameAndSignerIds((GetPolicyStatesForPolicyNameAndSignerIds)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE:
				setGetPolicyStatesForPolicyNameAndSignerIdsResponse((GetPolicyStatesForPolicyNameAndSignerIdsResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS:
				setGetPolicyStatesForSignerIds((GetPolicyStatesForSignerIds)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				setGetPolicyStatesForSignerIdsResponse((GetPolicyStatesForSignerIdsResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT:
				setGetQCHistoryForConsent((GetQCHistoryForConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT_RESPONSE:
				setGetQCHistoryForConsentResponse((GetQCHistoryForConsentResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM:
				setGetQCProblemHistoryForQCProblem((GetQCProblemHistoryForQCProblem)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE:
				setGetQCProblemHistoryForQCProblemResponse((GetQCProblemHistoryForQCProblemResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS:
				setGetSignerIdsForAlias((GetSignerIdsForAlias)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS_RESPONSE:
				setGetSignerIdsForAliasResponse((GetSignerIdsForAliasResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE:
				setGetSignerIdType((GetSignerIdType)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE_RESPONSE:
				setGetSignerIdTypeResponse((GetSignerIdTypeResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES:
				setGetTemplatesWithPolicies((GetTemplatesWithPolicies)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES_RESPONSE:
				setGetTemplatesWithPoliciesResponse((GetTemplatesWithPoliciesResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__ILLEGAL_ARGUMENT_EXCEPTION:
				setIllegalArgumentException((org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__INCONSISTENT_STATUS_EXCEPTION:
				setInconsistentStatusException((InconsistentStatusException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__INTERNAL_EXCEPTION:
				setInternalException((InternalException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__INVALID_FREE_TEXT_EXCEPTION:
				setInvalidFreeTextException((InvalidFreeTextException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__INVALID_PARAMETER_EXCEPTION:
				setInvalidParameterException((InvalidParameterException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__INVALID_VERSION_EXCEPTION:
				setInvalidVersionException((InvalidVersionException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED:
				setIsConsented((IsConsented)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING:
				setIsConsentedFromExcludingToExcluding((IsConsentedFromExcludingToExcluding)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				setIsConsentedFromExcludingToExcludingResponse((IsConsentedFromExcludingToExcludingResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING:
				setIsConsentedFromExcludingToIncluding((IsConsentedFromExcludingToIncluding)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				setIsConsentedFromExcludingToIncludingResponse((IsConsentedFromExcludingToIncludingResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING:
				setIsConsentedFromIncludingToExcluding((IsConsentedFromIncludingToExcluding)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				setIsConsentedFromIncludingToExcludingResponse((IsConsentedFromIncludingToExcludingResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING:
				setIsConsentedFromIncludingToIncluding((IsConsentedFromIncludingToIncluding)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				setIsConsentedFromIncludingToIncludingResponse((IsConsentedFromIncludingToIncludingResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_RESPONSE:
				setIsConsentedResponse((IsConsentedResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES:
				setListConsentTemplates((ListConsentTemplates)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES_RESPONSE:
				setListConsentTemplatesResponse((ListConsentTemplatesResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES:
				setListCurrentConsentTemplates((ListCurrentConsentTemplates)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE:
				setListCurrentConsentTemplatesResponse((ListCurrentConsentTemplatesResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS:
				setListDomains((ListDomains)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS_RESPONSE:
				setListDomainsResponse((ListDomainsResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES:
				setListModules((ListModules)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES_RESPONSE:
				setListModulesResponse((ListModulesResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES:
				setListPolicies((ListPolicies)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES_RESPONSE:
				setListPoliciesResponse((ListPoliciesResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES:
				setListSignerIdTypes((ListSignerIdTypes)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES_RESPONSE:
				setListSignerIdTypesResponse((ListSignerIdTypesResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__MANDATORY_FIELDS_EXCEPTION:
				setMandatoryFieldsException((MandatoryFieldsException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__MISSING_REQUIRED_OBJECT_EXCEPTION:
				setMissingRequiredObjectException((MissingRequiredObjectException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT:
				setRefuseConsent((RefuseConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT_RESPONSE:
				setRefuseConsentResponse((RefuseConsentResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT:
				setRemoveScanFromConsent((RemoveScanFromConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT_RESPONSE:
				setRemoveScanFromConsentResponse((RemoveScanFromConsentResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__REQUIREMENTS_NOT_FULLFILLED_EXCEPTION:
				setRequirementsNotFullfilledException((RequirementsNotFullfilledException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT:
				setSetQCForConsent((SetQCForConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT_RESPONSE:
				setSetQCForConsentResponse((SetQCForConsentResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ALIAS_EXCEPTION:
				setUnknownAliasException((UnknownAliasException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_EXCEPTION:
				setUnknownConsentException((UnknownConsentException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_TEMPLATE_EXCEPTION:
				setUnknownConsentTemplateException((UnknownConsentTemplateException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_DOMAIN_EXCEPTION:
				setUnknownDomainException((UnknownDomainException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_FHIR_ID_OBJECT_EXCEPTION:
				setUnknownFhirIdObjectException((UnknownFhirIdObjectException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ID_EXCEPTION:
				setUnknownIDException((UnknownIDException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_MODULE_EXCEPTION:
				setUnknownModuleException((UnknownModuleException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_POLICY_EXCEPTION:
				setUnknownPolicyException((UnknownPolicyException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_EXCEPTION:
				setUnknownSignerIdException((UnknownSignerIdException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_TYPE_EXCEPTION:
				setUnknownSignerIdTypeException((UnknownSignerIdTypeException)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE:
				setUpdateConsentInUse((UpdateConsentInUse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE_RESPONSE:
				setUpdateConsentInUseResponse((UpdateConsentInUseResponse)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT:
				setValidateConsent((ValidateConsent)null);
				return;
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT_RESPONSE:
				setValidateConsentResponse((ValidateConsentResponse)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Cm2Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Cm2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Cm2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS:
				return getAddAlias() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_ALIAS_RESPONSE:
				return getAddAliasResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT:
				return getAddConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT:
				return getAddConsentOptOut() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_OPT_OUT_RESPONSE:
				return getAddConsentOptOutResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_CONSENT_RESPONSE:
				return getAddConsentResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT:
				return getAddScanToConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_SCAN_TO_CONSENT_RESPONSE:
				return getAddScanToConsentResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT:
				return getAddSignerIdToConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_CONSENT_RESPONSE:
				return getAddSignerIdToConsentResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID:
				return getAddSignerIdToSignerId() != null;
			case Cm2Package.DOCUMENT_ROOT__ADD_SIGNER_ID_TO_SIGNER_ID_RESPONSE:
				return getAddSignerIdToSignerIdResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER:
				return getCountConsentsForDomainWithFilter() != null;
			case Cm2Package.DOCUMENT_ROOT__COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE:
				return getCountConsentsForDomainWithFilterResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES:
				return getCountSignedPolicies() != null;
			case Cm2Package.DOCUMENT_ROOT__COUNT_SIGNED_POLICIES_RESPONSE:
				return getCountSignedPoliciesResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS:
				return getDeactivateAlias() != null;
			case Cm2Package.DOCUMENT_ROOT__DEACTIVATE_ALIAS_RESPONSE:
				return getDeactivateAliasResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__DUPLICATE_ENTRY_EXCEPTION:
				return getDuplicateEntryException() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID:
				return getGetAliasesForSignerId() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_ID_RESPONSE:
				return getGetAliasesForSignerIdResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS:
				return getGetAliasesForSignerIds() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALIASES_FOR_SIGNER_IDS_RESPONSE:
				return getGetAliasesForSignerIdsResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR:
				return getGetAllConsentedIdsFor() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTED_IDS_FOR_RESPONSE:
				return getGetAllConsentedIdsForResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE:
				return getGetAllConsentsForConsentTemplate() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE_RESPONSE:
				return getGetAllConsentsForConsentTemplateResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN:
				return getGetAllConsentsForDomain() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_RESPONSE:
				return getGetAllConsentsForDomainResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN:
				return getGetAllConsentsForDomainWithoutScan() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_DOMAIN_WITHOUT_SCAN_RESPONSE:
				return getGetAllConsentsForDomainWithoutScanResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS:
				return getGetAllConsentsForSignerIds() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_CONSENTS_FOR_SIGNER_IDS_RESPONSE:
				return getGetAllConsentsForSignerIdsResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE:
				return getGetAllIdsForSignerIdType() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_ALL_IDS_FOR_SIGNER_ID_TYPE_RESPONSE:
				return getGetAllIdsForSignerIdTypeResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT:
				return getGetConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES:
				return getGetConsentDates() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_DATES_RESPONSE:
				return getGetConsentDatesResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT:
				return getGetConsentLight() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_LIGHT_RESPONSE:
				return getGetConsentLightResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_RESPONSE:
				return getGetConsentResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED:
				return getGetConsentsForDomainPaginated() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENTS_FOR_DOMAIN_PAGINATED_RESPONSE:
				return getGetConsentsForDomainPaginatedResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE:
				return getGetConsentStatusType() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING:
				return getGetConsentStatusTypeFromExcludingToExcluding() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				return getGetConsentStatusTypeFromExcludingToExcludingResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING:
				return getGetConsentStatusTypeFromExcludingToIncluding() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				return getGetConsentStatusTypeFromExcludingToIncludingResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING:
				return getGetConsentStatusTypeFromIncludingToExcluding() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				return getGetConsentStatusTypeFromIncludingToExcludingResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING:
				return getGetConsentStatusTypeFromIncludingToIncluding() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				return getGetConsentStatusTypeFromIncludingToIncludingResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_STATUS_TYPE_RESPONSE:
				return getGetConsentStatusTypeResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE:
				return getGetConsentTemplate() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CONSENT_TEMPLATE_RESPONSE:
				return getGetConsentTemplateResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT:
				return getGetCurrentConsentForSignerIdsAndCT() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_FOR_SIGNER_IDS_AND_CT_RESPONSE:
				return getGetCurrentConsentForSignerIdsAndCTResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE:
				return getGetCurrentConsentTemplate() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_CONSENT_TEMPLATE_RESPONSE:
				return getGetCurrentConsentTemplateResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS:
				return getGetCurrentPolicyStatesForSignerIds() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				return getGetCurrentPolicyStatesForSignerIdsResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN:
				return getGetDomain() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_DOMAIN_RESPONSE:
				return getGetDomainResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID:
				return getGetMappedTemplatesForSignerId() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_MAPPED_TEMPLATES_FOR_SIGNER_ID_RESPONSE:
				return getGetMappedTemplatesForSignerIdResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE:
				return getGetModule() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_MODULE_RESPONSE:
				return getGetModuleResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID:
				return getGetObjectByFhirID() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_OBJECT_BY_FHIR_ID_RESPONSE:
				return getGetObjectByFhirIDResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY:
				return getGetPolicy() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_RESPONSE:
				return getGetPolicyResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS:
				return getGetPolicyStatesForPolicyAndSignerIds() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS_RESPONSE:
				return getGetPolicyStatesForPolicyAndSignerIdsResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS:
				return getGetPolicyStatesForPolicyNameAndSignerIds() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE:
				return getGetPolicyStatesForPolicyNameAndSignerIdsResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS:
				return getGetPolicyStatesForSignerIds() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_POLICY_STATES_FOR_SIGNER_IDS_RESPONSE:
				return getGetPolicyStatesForSignerIdsResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT:
				return getGetQCHistoryForConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_HISTORY_FOR_CONSENT_RESPONSE:
				return getGetQCHistoryForConsentResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM:
				return getGetQCProblemHistoryForQCProblem() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM_RESPONSE:
				return getGetQCProblemHistoryForQCProblemResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS:
				return getGetSignerIdsForAlias() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_IDS_FOR_ALIAS_RESPONSE:
				return getGetSignerIdsForAliasResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE:
				return getGetSignerIdType() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_SIGNER_ID_TYPE_RESPONSE:
				return getGetSignerIdTypeResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES:
				return getGetTemplatesWithPolicies() != null;
			case Cm2Package.DOCUMENT_ROOT__GET_TEMPLATES_WITH_POLICIES_RESPONSE:
				return getGetTemplatesWithPoliciesResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__ILLEGAL_ARGUMENT_EXCEPTION:
				return getIllegalArgumentException() != null;
			case Cm2Package.DOCUMENT_ROOT__INCONSISTENT_STATUS_EXCEPTION:
				return getInconsistentStatusException() != null;
			case Cm2Package.DOCUMENT_ROOT__INTERNAL_EXCEPTION:
				return getInternalException() != null;
			case Cm2Package.DOCUMENT_ROOT__INVALID_FREE_TEXT_EXCEPTION:
				return getInvalidFreeTextException() != null;
			case Cm2Package.DOCUMENT_ROOT__INVALID_PARAMETER_EXCEPTION:
				return getInvalidParameterException() != null;
			case Cm2Package.DOCUMENT_ROOT__INVALID_VERSION_EXCEPTION:
				return getInvalidVersionException() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED:
				return getIsConsented() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING:
				return getIsConsentedFromExcludingToExcluding() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_EXCLUDING_RESPONSE:
				return getIsConsentedFromExcludingToExcludingResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING:
				return getIsConsentedFromExcludingToIncluding() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_EXCLUDING_TO_INCLUDING_RESPONSE:
				return getIsConsentedFromExcludingToIncludingResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING:
				return getIsConsentedFromIncludingToExcluding() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_EXCLUDING_RESPONSE:
				return getIsConsentedFromIncludingToExcludingResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING:
				return getIsConsentedFromIncludingToIncluding() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_FROM_INCLUDING_TO_INCLUDING_RESPONSE:
				return getIsConsentedFromIncludingToIncludingResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__IS_CONSENTED_RESPONSE:
				return getIsConsentedResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES:
				return getListConsentTemplates() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_CONSENT_TEMPLATES_RESPONSE:
				return getListConsentTemplatesResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES:
				return getListCurrentConsentTemplates() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_CURRENT_CONSENT_TEMPLATES_RESPONSE:
				return getListCurrentConsentTemplatesResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS:
				return getListDomains() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_DOMAINS_RESPONSE:
				return getListDomainsResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES:
				return getListModules() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_MODULES_RESPONSE:
				return getListModulesResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES:
				return getListPolicies() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_POLICIES_RESPONSE:
				return getListPoliciesResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES:
				return getListSignerIdTypes() != null;
			case Cm2Package.DOCUMENT_ROOT__LIST_SIGNER_ID_TYPES_RESPONSE:
				return getListSignerIdTypesResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__MANDATORY_FIELDS_EXCEPTION:
				return getMandatoryFieldsException() != null;
			case Cm2Package.DOCUMENT_ROOT__MISSING_REQUIRED_OBJECT_EXCEPTION:
				return getMissingRequiredObjectException() != null;
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT:
				return getRefuseConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__REFUSE_CONSENT_RESPONSE:
				return getRefuseConsentResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT:
				return getRemoveScanFromConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__REMOVE_SCAN_FROM_CONSENT_RESPONSE:
				return getRemoveScanFromConsentResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__REQUIREMENTS_NOT_FULLFILLED_EXCEPTION:
				return getRequirementsNotFullfilledException() != null;
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT:
				return getSetQCForConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__SET_QC_FOR_CONSENT_RESPONSE:
				return getSetQCForConsentResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ALIAS_EXCEPTION:
				return getUnknownAliasException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_EXCEPTION:
				return getUnknownConsentException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_CONSENT_TEMPLATE_EXCEPTION:
				return getUnknownConsentTemplateException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_DOMAIN_EXCEPTION:
				return getUnknownDomainException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_FHIR_ID_OBJECT_EXCEPTION:
				return getUnknownFhirIdObjectException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_ID_EXCEPTION:
				return getUnknownIDException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_MODULE_EXCEPTION:
				return getUnknownModuleException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_POLICY_EXCEPTION:
				return getUnknownPolicyException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_EXCEPTION:
				return getUnknownSignerIdException() != null;
			case Cm2Package.DOCUMENT_ROOT__UNKNOWN_SIGNER_ID_TYPE_EXCEPTION:
				return getUnknownSignerIdTypeException() != null;
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE:
				return getUpdateConsentInUse() != null;
			case Cm2Package.DOCUMENT_ROOT__UPDATE_CONSENT_IN_USE_RESPONSE:
				return getUpdateConsentInUseResponse() != null;
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT:
				return getValidateConsent() != null;
			case Cm2Package.DOCUMENT_ROOT__VALIDATE_CONSENT_RESPONSE:
				return getValidateConsentResponse() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
