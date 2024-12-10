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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddAlias <em>Add Alias</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddAliasResponse <em>Add Alias Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsent <em>Add Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentOptOut <em>Add Consent Opt Out</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentOptOutResponse <em>Add Consent Opt Out Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentResponse <em>Add Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddScanToConsent <em>Add Scan To Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddScanToConsentResponse <em>Add Scan To Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToConsent <em>Add Signer Id To Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToConsentResponse <em>Add Signer Id To Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToSignerId <em>Add Signer Id To Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToSignerIdResponse <em>Add Signer Id To Signer Id Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountConsentsForDomainWithFilter <em>Count Consents For Domain With Filter</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountConsentsForDomainWithFilterResponse <em>Count Consents For Domain With Filter Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountSignedPolicies <em>Count Signed Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountSignedPoliciesResponse <em>Count Signed Policies Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeactivateAlias <em>Deactivate Alias</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeactivateAliasResponse <em>Deactivate Alias Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDuplicateEntryException <em>Duplicate Entry Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerId <em>Get Aliases For Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIdResponse <em>Get Aliases For Signer Id Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIds <em>Get Aliases For Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIdsResponse <em>Get Aliases For Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentedIdsFor <em>Get All Consented Ids For</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentedIdsForResponse <em>Get All Consented Ids For Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForConsentTemplate <em>Get All Consents For Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForConsentTemplateResponse <em>Get All Consents For Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomain <em>Get All Consents For Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainResponse <em>Get All Consents For Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainWithoutScan <em>Get All Consents For Domain Without Scan</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainWithoutScanResponse <em>Get All Consents For Domain Without Scan Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForSignerIds <em>Get All Consents For Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForSignerIdsResponse <em>Get All Consents For Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllIdsForSignerIdType <em>Get All Ids For Signer Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllIdsForSignerIdTypeResponse <em>Get All Ids For Signer Id Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsent <em>Get Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentDates <em>Get Consent Dates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentDatesResponse <em>Get Consent Dates Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentLight <em>Get Consent Light</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentLightResponse <em>Get Consent Light Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentResponse <em>Get Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentsForDomainPaginated <em>Get Consents For Domain Paginated</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentsForDomainPaginatedResponse <em>Get Consents For Domain Paginated Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusType <em>Get Consent Status Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToExcluding <em>Get Consent Status Type From Excluding To Excluding</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToExcludingResponse <em>Get Consent Status Type From Excluding To Excluding Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToIncluding <em>Get Consent Status Type From Excluding To Including</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToIncludingResponse <em>Get Consent Status Type From Excluding To Including Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToExcluding <em>Get Consent Status Type From Including To Excluding</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToExcludingResponse <em>Get Consent Status Type From Including To Excluding Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToIncluding <em>Get Consent Status Type From Including To Including</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToIncludingResponse <em>Get Consent Status Type From Including To Including Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeResponse <em>Get Consent Status Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentTemplate <em>Get Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentTemplateResponse <em>Get Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentForSignerIdsAndCT <em>Get Current Consent For Signer Ids And CT</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentForSignerIdsAndCTResponse <em>Get Current Consent For Signer Ids And CT Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentTemplate <em>Get Current Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentTemplateResponse <em>Get Current Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentPolicyStatesForSignerIds <em>Get Current Policy States For Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentPolicyStatesForSignerIdsResponse <em>Get Current Policy States For Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetDomain <em>Get Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetDomainResponse <em>Get Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetMappedTemplatesForSignerId <em>Get Mapped Templates For Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetMappedTemplatesForSignerIdResponse <em>Get Mapped Templates For Signer Id Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetModule <em>Get Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetModuleResponse <em>Get Module Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetObjectByFhirID <em>Get Object By Fhir ID</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetObjectByFhirIDResponse <em>Get Object By Fhir ID Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicy <em>Get Policy</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyResponse <em>Get Policy Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyAndSignerIds <em>Get Policy States For Policy And Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyAndSignerIdsResponse <em>Get Policy States For Policy And Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyNameAndSignerIds <em>Get Policy States For Policy Name And Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyNameAndSignerIdsResponse <em>Get Policy States For Policy Name And Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForSignerIds <em>Get Policy States For Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForSignerIdsResponse <em>Get Policy States For Signer Ids Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCHistoryForConsent <em>Get QC History For Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCHistoryForConsentResponse <em>Get QC History For Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCProblemHistoryForQCProblem <em>Get QC Problem History For QC Problem</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCProblemHistoryForQCProblemResponse <em>Get QC Problem History For QC Problem Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdsForAlias <em>Get Signer Ids For Alias</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdsForAliasResponse <em>Get Signer Ids For Alias Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdType <em>Get Signer Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdTypeResponse <em>Get Signer Id Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetTemplatesWithPolicies <em>Get Templates With Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetTemplatesWithPoliciesResponse <em>Get Templates With Policies Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIllegalArgumentException <em>Illegal Argument Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInconsistentStatusException <em>Inconsistent Status Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInternalException <em>Internal Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidFreeTextException <em>Invalid Free Text Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidParameterException <em>Invalid Parameter Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidVersionException <em>Invalid Version Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsented <em>Is Consented</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToExcluding <em>Is Consented From Excluding To Excluding</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToExcludingResponse <em>Is Consented From Excluding To Excluding Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToIncluding <em>Is Consented From Excluding To Including</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToIncludingResponse <em>Is Consented From Excluding To Including Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToExcluding <em>Is Consented From Including To Excluding</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToExcludingResponse <em>Is Consented From Including To Excluding Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToIncluding <em>Is Consented From Including To Including</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToIncludingResponse <em>Is Consented From Including To Including Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedResponse <em>Is Consented Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListConsentTemplates <em>List Consent Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListConsentTemplatesResponse <em>List Consent Templates Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListCurrentConsentTemplates <em>List Current Consent Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListCurrentConsentTemplatesResponse <em>List Current Consent Templates Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListDomains <em>List Domains</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListDomainsResponse <em>List Domains Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListModules <em>List Modules</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListModulesResponse <em>List Modules Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListPolicies <em>List Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListPoliciesResponse <em>List Policies Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListSignerIdTypes <em>List Signer Id Types</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListSignerIdTypesResponse <em>List Signer Id Types Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMandatoryFieldsException <em>Mandatory Fields Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMissingRequiredObjectException <em>Missing Required Object Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRefuseConsent <em>Refuse Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRefuseConsentResponse <em>Refuse Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRemoveScanFromConsent <em>Remove Scan From Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRemoveScanFromConsentResponse <em>Remove Scan From Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRequirementsNotFullfilledException <em>Requirements Not Fullfilled Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getSetQCForConsent <em>Set QC For Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getSetQCForConsentResponse <em>Set QC For Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownAliasException <em>Unknown Alias Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownConsentException <em>Unknown Consent Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownConsentTemplateException <em>Unknown Consent Template Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownDomainException <em>Unknown Domain Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownFhirIdObjectException <em>Unknown Fhir Id Object Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownIDException <em>Unknown ID Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownModuleException <em>Unknown Module Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownPolicyException <em>Unknown Policy Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownSignerIdException <em>Unknown Signer Id Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownSignerIdTypeException <em>Unknown Signer Id Type Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentInUse <em>Update Consent In Use</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentInUseResponse <em>Update Consent In Use Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getValidateConsent <em>Validate Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getValidateConsentResponse <em>Validate Consent Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentTemplate <em>Add Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentTemplateResponse <em>Add Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddModule <em>Add Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddModuleResponse <em>Add Module Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddDomain <em>Add Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddDomainResponse <em>Add Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddPolicy <em>Add Policy</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddPolicyResponse <em>Add Policy Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdType <em>Add Signer Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdTypeResponse <em>Add Signer Id Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteConsentTemplate <em>Delete Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteConsentTemplateResponse <em>Delete Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteDomain <em>Delete Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteDomainResponse <em>Delete Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteModule <em>Delete Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteModuleResponse <em>Delete Module Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeletePolicy <em>Delete Policy</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeletePolicyResponse <em>Delete Policy Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteSignerIdType <em>Delete Signer Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteSignerIdTypeResponse <em>Delete Signer Id Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentTemplate <em>Update Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentTemplateResponse <em>Update Consent Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentTemplateInUse <em>Update Consent Template In Use</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentTemplateInUseResponse <em>Update Consent Template In Use Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateDomain <em>Update Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateDomainResponse <em>Update Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateDomainInUse <em>Update Domain In Use</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateDomainInUseResponse <em>Update Domain In Use Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateModule <em>Update Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateModuleResponse <em>Update Module Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateModuleInUse <em>Update Module In Use</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateModuleInUseResponse <em>Update Module In Use Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdatePolicy <em>Update Policy</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdatePolicyResponse <em>Update Policy Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdatePolicyInUse <em>Update Policy In Use</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdatePolicyInUseResponse <em>Update Policy In Use Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseAllForDomain <em>Finalise All For Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseAllForDomainResponse <em>Finalise All For Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseDomain <em>Finalise Domain</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseDomainResponse <em>Finalise Domain Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseModule <em>Finalise Module</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseModuleResponse <em>Finalise Module Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinalisePolicy <em>Finalise Policy</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinalisePolicyResponse <em>Finalise Policy Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseTemplate <em>Finalise Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseTemplateResponse <em>Finalise Template Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFreeTextConverterStringException <em>Free Text Converter String Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIllegalCompositionException <em>Illegal Composition Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidPropertiesException <em>Invalid Properties Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getObjectInUseException <em>Object In Use Exception</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateSignerIdType <em>Update Signer Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateSignerIdTypeResponse <em>Update Signer Id Type Response</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getVersionConverterClassException <em>Version Converter Class Exception</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Add Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Alias</em>' containment reference.
	 * @see #setAddAlias(AddAlias)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddAlias()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	AddAlias getAddAlias();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddAlias <em>Add Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Alias</em>' containment reference.
	 * @see #getAddAlias()
	 * @generated
	 */
	void setAddAlias(AddAlias value);

	/**
	 * Returns the value of the '<em><b>Add Alias Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Alias Response</em>' containment reference.
	 * @see #setAddAliasResponse(AddAliasResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddAliasResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddAliasResponse getAddAliasResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddAliasResponse <em>Add Alias Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Alias Response</em>' containment reference.
	 * @see #getAddAliasResponse()
	 * @generated
	 */
	void setAddAliasResponse(AddAliasResponse value);

	/**
	 * Returns the value of the '<em><b>Add Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Consent</em>' containment reference.
	 * @see #setAddConsent(AddConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	AddConsent getAddConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsent <em>Add Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Consent</em>' containment reference.
	 * @see #getAddConsent()
	 * @generated
	 */
	void setAddConsent(AddConsent value);

	/**
	 * Returns the value of the '<em><b>Add Consent Opt Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Consent Opt Out</em>' containment reference.
	 * @see #setAddConsentOptOut(AddConsentOptOut)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddConsentOptOut()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addConsentOptOut' namespace='##targetNamespace'"
	 * @generated
	 */
	AddConsentOptOut getAddConsentOptOut();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentOptOut <em>Add Consent Opt Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Consent Opt Out</em>' containment reference.
	 * @see #getAddConsentOptOut()
	 * @generated
	 */
	void setAddConsentOptOut(AddConsentOptOut value);

	/**
	 * Returns the value of the '<em><b>Add Consent Opt Out Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Consent Opt Out Response</em>' containment reference.
	 * @see #setAddConsentOptOutResponse(AddConsentOptOutResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddConsentOptOutResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addConsentOptOutResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddConsentOptOutResponse getAddConsentOptOutResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentOptOutResponse <em>Add Consent Opt Out Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Consent Opt Out Response</em>' containment reference.
	 * @see #getAddConsentOptOutResponse()
	 * @generated
	 */
	void setAddConsentOptOutResponse(AddConsentOptOutResponse value);

	/**
	 * Returns the value of the '<em><b>Add Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Consent Response</em>' containment reference.
	 * @see #setAddConsentResponse(AddConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddConsentResponse getAddConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentResponse <em>Add Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Consent Response</em>' containment reference.
	 * @see #getAddConsentResponse()
	 * @generated
	 */
	void setAddConsentResponse(AddConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Add Scan To Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Scan To Consent</em>' containment reference.
	 * @see #setAddScanToConsent(AddScanToConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddScanToConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addScanToConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	AddScanToConsent getAddScanToConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddScanToConsent <em>Add Scan To Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Scan To Consent</em>' containment reference.
	 * @see #getAddScanToConsent()
	 * @generated
	 */
	void setAddScanToConsent(AddScanToConsent value);

	/**
	 * Returns the value of the '<em><b>Add Scan To Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Scan To Consent Response</em>' containment reference.
	 * @see #setAddScanToConsentResponse(AddScanToConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddScanToConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addScanToConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddScanToConsentResponse getAddScanToConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddScanToConsentResponse <em>Add Scan To Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Scan To Consent Response</em>' containment reference.
	 * @see #getAddScanToConsentResponse()
	 * @generated
	 */
	void setAddScanToConsentResponse(AddScanToConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Add Signer Id To Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Signer Id To Consent</em>' containment reference.
	 * @see #setAddSignerIdToConsent(AddSignerIdToConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddSignerIdToConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addSignerIdToConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	AddSignerIdToConsent getAddSignerIdToConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToConsent <em>Add Signer Id To Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Signer Id To Consent</em>' containment reference.
	 * @see #getAddSignerIdToConsent()
	 * @generated
	 */
	void setAddSignerIdToConsent(AddSignerIdToConsent value);

	/**
	 * Returns the value of the '<em><b>Add Signer Id To Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Signer Id To Consent Response</em>' containment reference.
	 * @see #setAddSignerIdToConsentResponse(AddSignerIdToConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddSignerIdToConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addSignerIdToConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddSignerIdToConsentResponse getAddSignerIdToConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToConsentResponse <em>Add Signer Id To Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Signer Id To Consent Response</em>' containment reference.
	 * @see #getAddSignerIdToConsentResponse()
	 * @generated
	 */
	void setAddSignerIdToConsentResponse(AddSignerIdToConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Add Signer Id To Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Signer Id To Signer Id</em>' containment reference.
	 * @see #setAddSignerIdToSignerId(AddSignerIdToSignerId)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddSignerIdToSignerId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addSignerIdToSignerId' namespace='##targetNamespace'"
	 * @generated
	 */
	AddSignerIdToSignerId getAddSignerIdToSignerId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToSignerId <em>Add Signer Id To Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Signer Id To Signer Id</em>' containment reference.
	 * @see #getAddSignerIdToSignerId()
	 * @generated
	 */
	void setAddSignerIdToSignerId(AddSignerIdToSignerId value);

	/**
	 * Returns the value of the '<em><b>Add Signer Id To Signer Id Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Signer Id To Signer Id Response</em>' containment reference.
	 * @see #setAddSignerIdToSignerIdResponse(AddSignerIdToSignerIdResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddSignerIdToSignerIdResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addSignerIdToSignerIdResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddSignerIdToSignerIdResponse getAddSignerIdToSignerIdResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdToSignerIdResponse <em>Add Signer Id To Signer Id Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Signer Id To Signer Id Response</em>' containment reference.
	 * @see #getAddSignerIdToSignerIdResponse()
	 * @generated
	 */
	void setAddSignerIdToSignerIdResponse(AddSignerIdToSignerIdResponse value);

	/**
	 * Returns the value of the '<em><b>Count Consents For Domain With Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Consents For Domain With Filter</em>' containment reference.
	 * @see #setCountConsentsForDomainWithFilter(CountConsentsForDomainWithFilter)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_CountConsentsForDomainWithFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='countConsentsForDomainWithFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	CountConsentsForDomainWithFilter getCountConsentsForDomainWithFilter();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountConsentsForDomainWithFilter <em>Count Consents For Domain With Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Consents For Domain With Filter</em>' containment reference.
	 * @see #getCountConsentsForDomainWithFilter()
	 * @generated
	 */
	void setCountConsentsForDomainWithFilter(CountConsentsForDomainWithFilter value);

	/**
	 * Returns the value of the '<em><b>Count Consents For Domain With Filter Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Consents For Domain With Filter Response</em>' containment reference.
	 * @see #setCountConsentsForDomainWithFilterResponse(CountConsentsForDomainWithFilterResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_CountConsentsForDomainWithFilterResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='countConsentsForDomainWithFilterResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CountConsentsForDomainWithFilterResponse getCountConsentsForDomainWithFilterResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountConsentsForDomainWithFilterResponse <em>Count Consents For Domain With Filter Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Consents For Domain With Filter Response</em>' containment reference.
	 * @see #getCountConsentsForDomainWithFilterResponse()
	 * @generated
	 */
	void setCountConsentsForDomainWithFilterResponse(CountConsentsForDomainWithFilterResponse value);

	/**
	 * Returns the value of the '<em><b>Count Signed Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Signed Policies</em>' containment reference.
	 * @see #setCountSignedPolicies(CountSignedPolicies)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_CountSignedPolicies()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='countSignedPolicies' namespace='##targetNamespace'"
	 * @generated
	 */
	CountSignedPolicies getCountSignedPolicies();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountSignedPolicies <em>Count Signed Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Signed Policies</em>' containment reference.
	 * @see #getCountSignedPolicies()
	 * @generated
	 */
	void setCountSignedPolicies(CountSignedPolicies value);

	/**
	 * Returns the value of the '<em><b>Count Signed Policies Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Signed Policies Response</em>' containment reference.
	 * @see #setCountSignedPoliciesResponse(CountSignedPoliciesResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_CountSignedPoliciesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='countSignedPoliciesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CountSignedPoliciesResponse getCountSignedPoliciesResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getCountSignedPoliciesResponse <em>Count Signed Policies Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Signed Policies Response</em>' containment reference.
	 * @see #getCountSignedPoliciesResponse()
	 * @generated
	 */
	void setCountSignedPoliciesResponse(CountSignedPoliciesResponse value);

	/**
	 * Returns the value of the '<em><b>Deactivate Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deactivate Alias</em>' containment reference.
	 * @see #setDeactivateAlias(DeactivateAlias)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeactivateAlias()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deactivateAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	DeactivateAlias getDeactivateAlias();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeactivateAlias <em>Deactivate Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deactivate Alias</em>' containment reference.
	 * @see #getDeactivateAlias()
	 * @generated
	 */
	void setDeactivateAlias(DeactivateAlias value);

	/**
	 * Returns the value of the '<em><b>Deactivate Alias Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deactivate Alias Response</em>' containment reference.
	 * @see #setDeactivateAliasResponse(DeactivateAliasResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeactivateAliasResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deactivateAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeactivateAliasResponse getDeactivateAliasResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeactivateAliasResponse <em>Deactivate Alias Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deactivate Alias Response</em>' containment reference.
	 * @see #getDeactivateAliasResponse()
	 * @generated
	 */
	void setDeactivateAliasResponse(DeactivateAliasResponse value);

	/**
	 * Returns the value of the '<em><b>Duplicate Entry Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicate Entry Exception</em>' containment reference.
	 * @see #setDuplicateEntryException(DuplicateEntryException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DuplicateEntryException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DuplicateEntryException' namespace='##targetNamespace'"
	 * @generated
	 */
	DuplicateEntryException getDuplicateEntryException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDuplicateEntryException <em>Duplicate Entry Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duplicate Entry Exception</em>' containment reference.
	 * @see #getDuplicateEntryException()
	 * @generated
	 */
	void setDuplicateEntryException(DuplicateEntryException value);

	/**
	 * Returns the value of the '<em><b>Get Aliases For Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Aliases For Signer Id</em>' containment reference.
	 * @see #setGetAliasesForSignerId(GetAliasesForSignerId)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAliasesForSignerId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAliasesForSignerId' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAliasesForSignerId getGetAliasesForSignerId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerId <em>Get Aliases For Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Aliases For Signer Id</em>' containment reference.
	 * @see #getGetAliasesForSignerId()
	 * @generated
	 */
	void setGetAliasesForSignerId(GetAliasesForSignerId value);

	/**
	 * Returns the value of the '<em><b>Get Aliases For Signer Id Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Aliases For Signer Id Response</em>' containment reference.
	 * @see #setGetAliasesForSignerIdResponse(GetAliasesForSignerIdResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAliasesForSignerIdResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAliasesForSignerIdResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAliasesForSignerIdResponse getGetAliasesForSignerIdResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIdResponse <em>Get Aliases For Signer Id Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Aliases For Signer Id Response</em>' containment reference.
	 * @see #getGetAliasesForSignerIdResponse()
	 * @generated
	 */
	void setGetAliasesForSignerIdResponse(GetAliasesForSignerIdResponse value);

	/**
	 * Returns the value of the '<em><b>Get Aliases For Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Aliases For Signer Ids</em>' containment reference.
	 * @see #setGetAliasesForSignerIds(GetAliasesForSignerIds)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAliasesForSignerIds()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAliasesForSignerIds' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAliasesForSignerIds getGetAliasesForSignerIds();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIds <em>Get Aliases For Signer Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Aliases For Signer Ids</em>' containment reference.
	 * @see #getGetAliasesForSignerIds()
	 * @generated
	 */
	void setGetAliasesForSignerIds(GetAliasesForSignerIds value);

	/**
	 * Returns the value of the '<em><b>Get Aliases For Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Aliases For Signer Ids Response</em>' containment reference.
	 * @see #setGetAliasesForSignerIdsResponse(GetAliasesForSignerIdsResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAliasesForSignerIdsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAliasesForSignerIdsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAliasesForSignerIdsResponse getGetAliasesForSignerIdsResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAliasesForSignerIdsResponse <em>Get Aliases For Signer Ids Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Aliases For Signer Ids Response</em>' containment reference.
	 * @see #getGetAliasesForSignerIdsResponse()
	 * @generated
	 */
	void setGetAliasesForSignerIdsResponse(GetAliasesForSignerIdsResponse value);

	/**
	 * Returns the value of the '<em><b>Get All Consented Ids For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consented Ids For</em>' containment reference.
	 * @see #setGetAllConsentedIdsFor(GetAllConsentedIdsFor)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentedIdsFor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentedIdsFor' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentedIdsFor getGetAllConsentedIdsFor();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentedIdsFor <em>Get All Consented Ids For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consented Ids For</em>' containment reference.
	 * @see #getGetAllConsentedIdsFor()
	 * @generated
	 */
	void setGetAllConsentedIdsFor(GetAllConsentedIdsFor value);

	/**
	 * Returns the value of the '<em><b>Get All Consented Ids For Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consented Ids For Response</em>' containment reference.
	 * @see #setGetAllConsentedIdsForResponse(GetAllConsentedIdsForResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentedIdsForResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentedIdsForResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentedIdsForResponse getGetAllConsentedIdsForResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentedIdsForResponse <em>Get All Consented Ids For Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consented Ids For Response</em>' containment reference.
	 * @see #getGetAllConsentedIdsForResponse()
	 * @generated
	 */
	void setGetAllConsentedIdsForResponse(GetAllConsentedIdsForResponse value);

	/**
	 * Returns the value of the '<em><b>Get All Consents For Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consents For Consent Template</em>' containment reference.
	 * @see #setGetAllConsentsForConsentTemplate(GetAllConsentsForConsentTemplate)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentsForConsentTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentsForConsentTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentsForConsentTemplate getGetAllConsentsForConsentTemplate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForConsentTemplate <em>Get All Consents For Consent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consents For Consent Template</em>' containment reference.
	 * @see #getGetAllConsentsForConsentTemplate()
	 * @generated
	 */
	void setGetAllConsentsForConsentTemplate(GetAllConsentsForConsentTemplate value);

	/**
	 * Returns the value of the '<em><b>Get All Consents For Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consents For Consent Template Response</em>' containment reference.
	 * @see #setGetAllConsentsForConsentTemplateResponse(GetAllConsentsForConsentTemplateResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentsForConsentTemplateResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentsForConsentTemplateResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentsForConsentTemplateResponse getGetAllConsentsForConsentTemplateResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForConsentTemplateResponse <em>Get All Consents For Consent Template Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consents For Consent Template Response</em>' containment reference.
	 * @see #getGetAllConsentsForConsentTemplateResponse()
	 * @generated
	 */
	void setGetAllConsentsForConsentTemplateResponse(GetAllConsentsForConsentTemplateResponse value);

	/**
	 * Returns the value of the '<em><b>Get All Consents For Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consents For Domain</em>' containment reference.
	 * @see #setGetAllConsentsForDomain(GetAllConsentsForDomain)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentsForDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentsForDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentsForDomain getGetAllConsentsForDomain();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomain <em>Get All Consents For Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consents For Domain</em>' containment reference.
	 * @see #getGetAllConsentsForDomain()
	 * @generated
	 */
	void setGetAllConsentsForDomain(GetAllConsentsForDomain value);

	/**
	 * Returns the value of the '<em><b>Get All Consents For Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consents For Domain Response</em>' containment reference.
	 * @see #setGetAllConsentsForDomainResponse(GetAllConsentsForDomainResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentsForDomainResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentsForDomainResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentsForDomainResponse getGetAllConsentsForDomainResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainResponse <em>Get All Consents For Domain Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consents For Domain Response</em>' containment reference.
	 * @see #getGetAllConsentsForDomainResponse()
	 * @generated
	 */
	void setGetAllConsentsForDomainResponse(GetAllConsentsForDomainResponse value);

	/**
	 * Returns the value of the '<em><b>Get All Consents For Domain Without Scan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consents For Domain Without Scan</em>' containment reference.
	 * @see #setGetAllConsentsForDomainWithoutScan(GetAllConsentsForDomainWithoutScan)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentsForDomainWithoutScan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentsForDomainWithoutScan' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentsForDomainWithoutScan getGetAllConsentsForDomainWithoutScan();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainWithoutScan <em>Get All Consents For Domain Without Scan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consents For Domain Without Scan</em>' containment reference.
	 * @see #getGetAllConsentsForDomainWithoutScan()
	 * @generated
	 */
	void setGetAllConsentsForDomainWithoutScan(GetAllConsentsForDomainWithoutScan value);

	/**
	 * Returns the value of the '<em><b>Get All Consents For Domain Without Scan Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consents For Domain Without Scan Response</em>' containment reference.
	 * @see #setGetAllConsentsForDomainWithoutScanResponse(GetAllConsentsForDomainWithoutScanResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentsForDomainWithoutScanResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentsForDomainWithoutScanResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentsForDomainWithoutScanResponse getGetAllConsentsForDomainWithoutScanResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForDomainWithoutScanResponse <em>Get All Consents For Domain Without Scan Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consents For Domain Without Scan Response</em>' containment reference.
	 * @see #getGetAllConsentsForDomainWithoutScanResponse()
	 * @generated
	 */
	void setGetAllConsentsForDomainWithoutScanResponse(GetAllConsentsForDomainWithoutScanResponse value);

	/**
	 * Returns the value of the '<em><b>Get All Consents For Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consents For Signer Ids</em>' containment reference.
	 * @see #setGetAllConsentsForSignerIds(GetAllConsentsForSignerIds)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentsForSignerIds()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentsForSignerIds' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentsForSignerIds getGetAllConsentsForSignerIds();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForSignerIds <em>Get All Consents For Signer Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consents For Signer Ids</em>' containment reference.
	 * @see #getGetAllConsentsForSignerIds()
	 * @generated
	 */
	void setGetAllConsentsForSignerIds(GetAllConsentsForSignerIds value);

	/**
	 * Returns the value of the '<em><b>Get All Consents For Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Consents For Signer Ids Response</em>' containment reference.
	 * @see #setGetAllConsentsForSignerIdsResponse(GetAllConsentsForSignerIdsResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllConsentsForSignerIdsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllConsentsForSignerIdsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllConsentsForSignerIdsResponse getGetAllConsentsForSignerIdsResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllConsentsForSignerIdsResponse <em>Get All Consents For Signer Ids Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Consents For Signer Ids Response</em>' containment reference.
	 * @see #getGetAllConsentsForSignerIdsResponse()
	 * @generated
	 */
	void setGetAllConsentsForSignerIdsResponse(GetAllConsentsForSignerIdsResponse value);

	/**
	 * Returns the value of the '<em><b>Get All Ids For Signer Id Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Ids For Signer Id Type</em>' containment reference.
	 * @see #setGetAllIdsForSignerIdType(GetAllIdsForSignerIdType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllIdsForSignerIdType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllIdsForSignerIdType' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllIdsForSignerIdType getGetAllIdsForSignerIdType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllIdsForSignerIdType <em>Get All Ids For Signer Id Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Ids For Signer Id Type</em>' containment reference.
	 * @see #getGetAllIdsForSignerIdType()
	 * @generated
	 */
	void setGetAllIdsForSignerIdType(GetAllIdsForSignerIdType value);

	/**
	 * Returns the value of the '<em><b>Get All Ids For Signer Id Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Ids For Signer Id Type Response</em>' containment reference.
	 * @see #setGetAllIdsForSignerIdTypeResponse(GetAllIdsForSignerIdTypeResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetAllIdsForSignerIdTypeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getAllIdsForSignerIdTypeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAllIdsForSignerIdTypeResponse getGetAllIdsForSignerIdTypeResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetAllIdsForSignerIdTypeResponse <em>Get All Ids For Signer Id Type Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All Ids For Signer Id Type Response</em>' containment reference.
	 * @see #getGetAllIdsForSignerIdTypeResponse()
	 * @generated
	 */
	void setGetAllIdsForSignerIdTypeResponse(GetAllIdsForSignerIdTypeResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent</em>' containment reference.
	 * @see #setGetConsent(GetConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsent getGetConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsent <em>Get Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent</em>' containment reference.
	 * @see #getGetConsent()
	 * @generated
	 */
	void setGetConsent(GetConsent value);

	/**
	 * Returns the value of the '<em><b>Get Consent Dates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Dates</em>' containment reference.
	 * @see #setGetConsentDates(GetConsentDates)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentDates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentDates' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentDates getGetConsentDates();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentDates <em>Get Consent Dates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Dates</em>' containment reference.
	 * @see #getGetConsentDates()
	 * @generated
	 */
	void setGetConsentDates(GetConsentDates value);

	/**
	 * Returns the value of the '<em><b>Get Consent Dates Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Dates Response</em>' containment reference.
	 * @see #setGetConsentDatesResponse(GetConsentDatesResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentDatesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentDatesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentDatesResponse getGetConsentDatesResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentDatesResponse <em>Get Consent Dates Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Dates Response</em>' containment reference.
	 * @see #getGetConsentDatesResponse()
	 * @generated
	 */
	void setGetConsentDatesResponse(GetConsentDatesResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Light</em>' containment reference.
	 * @see #setGetConsentLight(GetConsentLight)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentLight()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentLight' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentLight getGetConsentLight();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentLight <em>Get Consent Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Light</em>' containment reference.
	 * @see #getGetConsentLight()
	 * @generated
	 */
	void setGetConsentLight(GetConsentLight value);

	/**
	 * Returns the value of the '<em><b>Get Consent Light Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Light Response</em>' containment reference.
	 * @see #setGetConsentLightResponse(GetConsentLightResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentLightResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentLightResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentLightResponse getGetConsentLightResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentLightResponse <em>Get Consent Light Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Light Response</em>' containment reference.
	 * @see #getGetConsentLightResponse()
	 * @generated
	 */
	void setGetConsentLightResponse(GetConsentLightResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Response</em>' containment reference.
	 * @see #setGetConsentResponse(GetConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentResponse getGetConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentResponse <em>Get Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Response</em>' containment reference.
	 * @see #getGetConsentResponse()
	 * @generated
	 */
	void setGetConsentResponse(GetConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consents For Domain Paginated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consents For Domain Paginated</em>' containment reference.
	 * @see #setGetConsentsForDomainPaginated(GetConsentsForDomainPaginated)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentsForDomainPaginated()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentsForDomainPaginated' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentsForDomainPaginated getGetConsentsForDomainPaginated();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentsForDomainPaginated <em>Get Consents For Domain Paginated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consents For Domain Paginated</em>' containment reference.
	 * @see #getGetConsentsForDomainPaginated()
	 * @generated
	 */
	void setGetConsentsForDomainPaginated(GetConsentsForDomainPaginated value);

	/**
	 * Returns the value of the '<em><b>Get Consents For Domain Paginated Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consents For Domain Paginated Response</em>' containment reference.
	 * @see #setGetConsentsForDomainPaginatedResponse(GetConsentsForDomainPaginatedResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentsForDomainPaginatedResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentsForDomainPaginatedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentsForDomainPaginatedResponse getGetConsentsForDomainPaginatedResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentsForDomainPaginatedResponse <em>Get Consents For Domain Paginated Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consents For Domain Paginated Response</em>' containment reference.
	 * @see #getGetConsentsForDomainPaginatedResponse()
	 * @generated
	 */
	void setGetConsentsForDomainPaginatedResponse(GetConsentsForDomainPaginatedResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type</em>' containment reference.
	 * @see #setGetConsentStatusType(GetConsentStatusType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusType' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusType getGetConsentStatusType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusType <em>Get Consent Status Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type</em>' containment reference.
	 * @see #getGetConsentStatusType()
	 * @generated
	 */
	void setGetConsentStatusType(GetConsentStatusType value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type From Excluding To Excluding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type From Excluding To Excluding</em>' containment reference.
	 * @see #setGetConsentStatusTypeFromExcludingToExcluding(GetConsentStatusTypeFromExcludingToExcluding)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeFromExcludingToExcluding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeFromExcludingToExcluding' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeFromExcludingToExcluding getGetConsentStatusTypeFromExcludingToExcluding();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToExcluding <em>Get Consent Status Type From Excluding To Excluding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type From Excluding To Excluding</em>' containment reference.
	 * @see #getGetConsentStatusTypeFromExcludingToExcluding()
	 * @generated
	 */
	void setGetConsentStatusTypeFromExcludingToExcluding(GetConsentStatusTypeFromExcludingToExcluding value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type From Excluding To Excluding Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type From Excluding To Excluding Response</em>' containment reference.
	 * @see #setGetConsentStatusTypeFromExcludingToExcludingResponse(GetConsentStatusTypeFromExcludingToExcludingResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeFromExcludingToExcludingResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeFromExcludingToExcludingResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeFromExcludingToExcludingResponse getGetConsentStatusTypeFromExcludingToExcludingResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToExcludingResponse <em>Get Consent Status Type From Excluding To Excluding Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type From Excluding To Excluding Response</em>' containment reference.
	 * @see #getGetConsentStatusTypeFromExcludingToExcludingResponse()
	 * @generated
	 */
	void setGetConsentStatusTypeFromExcludingToExcludingResponse(GetConsentStatusTypeFromExcludingToExcludingResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type From Excluding To Including</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type From Excluding To Including</em>' containment reference.
	 * @see #setGetConsentStatusTypeFromExcludingToIncluding(GetConsentStatusTypeFromExcludingToIncluding)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeFromExcludingToIncluding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeFromExcludingToIncluding' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeFromExcludingToIncluding getGetConsentStatusTypeFromExcludingToIncluding();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToIncluding <em>Get Consent Status Type From Excluding To Including</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type From Excluding To Including</em>' containment reference.
	 * @see #getGetConsentStatusTypeFromExcludingToIncluding()
	 * @generated
	 */
	void setGetConsentStatusTypeFromExcludingToIncluding(GetConsentStatusTypeFromExcludingToIncluding value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type From Excluding To Including Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type From Excluding To Including Response</em>' containment reference.
	 * @see #setGetConsentStatusTypeFromExcludingToIncludingResponse(GetConsentStatusTypeFromExcludingToIncludingResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeFromExcludingToIncludingResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeFromExcludingToIncludingResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeFromExcludingToIncludingResponse getGetConsentStatusTypeFromExcludingToIncludingResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromExcludingToIncludingResponse <em>Get Consent Status Type From Excluding To Including Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type From Excluding To Including Response</em>' containment reference.
	 * @see #getGetConsentStatusTypeFromExcludingToIncludingResponse()
	 * @generated
	 */
	void setGetConsentStatusTypeFromExcludingToIncludingResponse(GetConsentStatusTypeFromExcludingToIncludingResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type From Including To Excluding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type From Including To Excluding</em>' containment reference.
	 * @see #setGetConsentStatusTypeFromIncludingToExcluding(GetConsentStatusTypeFromIncludingToExcluding)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeFromIncludingToExcluding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeFromIncludingToExcluding' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeFromIncludingToExcluding getGetConsentStatusTypeFromIncludingToExcluding();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToExcluding <em>Get Consent Status Type From Including To Excluding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type From Including To Excluding</em>' containment reference.
	 * @see #getGetConsentStatusTypeFromIncludingToExcluding()
	 * @generated
	 */
	void setGetConsentStatusTypeFromIncludingToExcluding(GetConsentStatusTypeFromIncludingToExcluding value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type From Including To Excluding Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type From Including To Excluding Response</em>' containment reference.
	 * @see #setGetConsentStatusTypeFromIncludingToExcludingResponse(GetConsentStatusTypeFromIncludingToExcludingResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeFromIncludingToExcludingResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeFromIncludingToExcludingResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeFromIncludingToExcludingResponse getGetConsentStatusTypeFromIncludingToExcludingResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToExcludingResponse <em>Get Consent Status Type From Including To Excluding Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type From Including To Excluding Response</em>' containment reference.
	 * @see #getGetConsentStatusTypeFromIncludingToExcludingResponse()
	 * @generated
	 */
	void setGetConsentStatusTypeFromIncludingToExcludingResponse(GetConsentStatusTypeFromIncludingToExcludingResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type From Including To Including</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type From Including To Including</em>' containment reference.
	 * @see #setGetConsentStatusTypeFromIncludingToIncluding(GetConsentStatusTypeFromIncludingToIncluding)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeFromIncludingToIncluding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeFromIncludingToIncluding' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeFromIncludingToIncluding getGetConsentStatusTypeFromIncludingToIncluding();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToIncluding <em>Get Consent Status Type From Including To Including</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type From Including To Including</em>' containment reference.
	 * @see #getGetConsentStatusTypeFromIncludingToIncluding()
	 * @generated
	 */
	void setGetConsentStatusTypeFromIncludingToIncluding(GetConsentStatusTypeFromIncludingToIncluding value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type From Including To Including Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type From Including To Including Response</em>' containment reference.
	 * @see #setGetConsentStatusTypeFromIncludingToIncludingResponse(GetConsentStatusTypeFromIncludingToIncludingResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeFromIncludingToIncludingResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeFromIncludingToIncludingResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeFromIncludingToIncludingResponse getGetConsentStatusTypeFromIncludingToIncludingResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeFromIncludingToIncludingResponse <em>Get Consent Status Type From Including To Including Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type From Including To Including Response</em>' containment reference.
	 * @see #getGetConsentStatusTypeFromIncludingToIncludingResponse()
	 * @generated
	 */
	void setGetConsentStatusTypeFromIncludingToIncludingResponse(GetConsentStatusTypeFromIncludingToIncludingResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent Status Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Status Type Response</em>' containment reference.
	 * @see #setGetConsentStatusTypeResponse(GetConsentStatusTypeResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentStatusTypeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentStatusTypeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentStatusTypeResponse getGetConsentStatusTypeResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentStatusTypeResponse <em>Get Consent Status Type Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Status Type Response</em>' containment reference.
	 * @see #getGetConsentStatusTypeResponse()
	 * @generated
	 */
	void setGetConsentStatusTypeResponse(GetConsentStatusTypeResponse value);

	/**
	 * Returns the value of the '<em><b>Get Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Template</em>' containment reference.
	 * @see #setGetConsentTemplate(GetConsentTemplate)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentTemplate getGetConsentTemplate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentTemplate <em>Get Consent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Template</em>' containment reference.
	 * @see #getGetConsentTemplate()
	 * @generated
	 */
	void setGetConsentTemplate(GetConsentTemplate value);

	/**
	 * Returns the value of the '<em><b>Get Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Consent Template Response</em>' containment reference.
	 * @see #setGetConsentTemplateResponse(GetConsentTemplateResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetConsentTemplateResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConsentTemplateResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConsentTemplateResponse getGetConsentTemplateResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetConsentTemplateResponse <em>Get Consent Template Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Consent Template Response</em>' containment reference.
	 * @see #getGetConsentTemplateResponse()
	 * @generated
	 */
	void setGetConsentTemplateResponse(GetConsentTemplateResponse value);

	/**
	 * Returns the value of the '<em><b>Get Current Consent For Signer Ids And CT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Current Consent For Signer Ids And CT</em>' containment reference.
	 * @see #setGetCurrentConsentForSignerIdsAndCT(GetCurrentConsentForSignerIdsAndCT)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetCurrentConsentForSignerIdsAndCT()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getCurrentConsentForSignerIdsAndCT' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCurrentConsentForSignerIdsAndCT getGetCurrentConsentForSignerIdsAndCT();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentForSignerIdsAndCT <em>Get Current Consent For Signer Ids And CT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Current Consent For Signer Ids And CT</em>' containment reference.
	 * @see #getGetCurrentConsentForSignerIdsAndCT()
	 * @generated
	 */
	void setGetCurrentConsentForSignerIdsAndCT(GetCurrentConsentForSignerIdsAndCT value);

	/**
	 * Returns the value of the '<em><b>Get Current Consent For Signer Ids And CT Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Current Consent For Signer Ids And CT Response</em>' containment reference.
	 * @see #setGetCurrentConsentForSignerIdsAndCTResponse(GetCurrentConsentForSignerIdsAndCTResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetCurrentConsentForSignerIdsAndCTResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getCurrentConsentForSignerIdsAndCTResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCurrentConsentForSignerIdsAndCTResponse getGetCurrentConsentForSignerIdsAndCTResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentForSignerIdsAndCTResponse <em>Get Current Consent For Signer Ids And CT Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Current Consent For Signer Ids And CT Response</em>' containment reference.
	 * @see #getGetCurrentConsentForSignerIdsAndCTResponse()
	 * @generated
	 */
	void setGetCurrentConsentForSignerIdsAndCTResponse(GetCurrentConsentForSignerIdsAndCTResponse value);

	/**
	 * Returns the value of the '<em><b>Get Current Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Current Consent Template</em>' containment reference.
	 * @see #setGetCurrentConsentTemplate(GetCurrentConsentTemplate)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetCurrentConsentTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getCurrentConsentTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCurrentConsentTemplate getGetCurrentConsentTemplate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentTemplate <em>Get Current Consent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Current Consent Template</em>' containment reference.
	 * @see #getGetCurrentConsentTemplate()
	 * @generated
	 */
	void setGetCurrentConsentTemplate(GetCurrentConsentTemplate value);

	/**
	 * Returns the value of the '<em><b>Get Current Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Current Consent Template Response</em>' containment reference.
	 * @see #setGetCurrentConsentTemplateResponse(GetCurrentConsentTemplateResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetCurrentConsentTemplateResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getCurrentConsentTemplateResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCurrentConsentTemplateResponse getGetCurrentConsentTemplateResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentConsentTemplateResponse <em>Get Current Consent Template Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Current Consent Template Response</em>' containment reference.
	 * @see #getGetCurrentConsentTemplateResponse()
	 * @generated
	 */
	void setGetCurrentConsentTemplateResponse(GetCurrentConsentTemplateResponse value);

	/**
	 * Returns the value of the '<em><b>Get Current Policy States For Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Current Policy States For Signer Ids</em>' containment reference.
	 * @see #setGetCurrentPolicyStatesForSignerIds(GetCurrentPolicyStatesForSignerIds)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetCurrentPolicyStatesForSignerIds()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getCurrentPolicyStatesForSignerIds' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCurrentPolicyStatesForSignerIds getGetCurrentPolicyStatesForSignerIds();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentPolicyStatesForSignerIds <em>Get Current Policy States For Signer Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Current Policy States For Signer Ids</em>' containment reference.
	 * @see #getGetCurrentPolicyStatesForSignerIds()
	 * @generated
	 */
	void setGetCurrentPolicyStatesForSignerIds(GetCurrentPolicyStatesForSignerIds value);

	/**
	 * Returns the value of the '<em><b>Get Current Policy States For Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Current Policy States For Signer Ids Response</em>' containment reference.
	 * @see #setGetCurrentPolicyStatesForSignerIdsResponse(GetCurrentPolicyStatesForSignerIdsResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetCurrentPolicyStatesForSignerIdsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getCurrentPolicyStatesForSignerIdsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCurrentPolicyStatesForSignerIdsResponse getGetCurrentPolicyStatesForSignerIdsResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetCurrentPolicyStatesForSignerIdsResponse <em>Get Current Policy States For Signer Ids Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Current Policy States For Signer Ids Response</em>' containment reference.
	 * @see #getGetCurrentPolicyStatesForSignerIdsResponse()
	 * @generated
	 */
	void setGetCurrentPolicyStatesForSignerIdsResponse(GetCurrentPolicyStatesForSignerIdsResponse value);

	/**
	 * Returns the value of the '<em><b>Get Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Domain</em>' containment reference.
	 * @see #setGetDomain(GetDomain)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDomain getGetDomain();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetDomain <em>Get Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Domain</em>' containment reference.
	 * @see #getGetDomain()
	 * @generated
	 */
	void setGetDomain(GetDomain value);

	/**
	 * Returns the value of the '<em><b>Get Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Domain Response</em>' containment reference.
	 * @see #setGetDomainResponse(GetDomainResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetDomainResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getDomainResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDomainResponse getGetDomainResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetDomainResponse <em>Get Domain Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Domain Response</em>' containment reference.
	 * @see #getGetDomainResponse()
	 * @generated
	 */
	void setGetDomainResponse(GetDomainResponse value);

	/**
	 * Returns the value of the '<em><b>Get Mapped Templates For Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Mapped Templates For Signer Id</em>' containment reference.
	 * @see #setGetMappedTemplatesForSignerId(GetMappedTemplatesForSignerId)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetMappedTemplatesForSignerId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getMappedTemplatesForSignerId' namespace='##targetNamespace'"
	 * @generated
	 */
	GetMappedTemplatesForSignerId getGetMappedTemplatesForSignerId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetMappedTemplatesForSignerId <em>Get Mapped Templates For Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Mapped Templates For Signer Id</em>' containment reference.
	 * @see #getGetMappedTemplatesForSignerId()
	 * @generated
	 */
	void setGetMappedTemplatesForSignerId(GetMappedTemplatesForSignerId value);

	/**
	 * Returns the value of the '<em><b>Get Mapped Templates For Signer Id Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Mapped Templates For Signer Id Response</em>' containment reference.
	 * @see #setGetMappedTemplatesForSignerIdResponse(GetMappedTemplatesForSignerIdResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetMappedTemplatesForSignerIdResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getMappedTemplatesForSignerIdResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetMappedTemplatesForSignerIdResponse getGetMappedTemplatesForSignerIdResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetMappedTemplatesForSignerIdResponse <em>Get Mapped Templates For Signer Id Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Mapped Templates For Signer Id Response</em>' containment reference.
	 * @see #getGetMappedTemplatesForSignerIdResponse()
	 * @generated
	 */
	void setGetMappedTemplatesForSignerIdResponse(GetMappedTemplatesForSignerIdResponse value);

	/**
	 * Returns the value of the '<em><b>Get Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Module</em>' containment reference.
	 * @see #setGetModule(GetModule)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetModule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getModule' namespace='##targetNamespace'"
	 * @generated
	 */
	GetModule getGetModule();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetModule <em>Get Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Module</em>' containment reference.
	 * @see #getGetModule()
	 * @generated
	 */
	void setGetModule(GetModule value);

	/**
	 * Returns the value of the '<em><b>Get Module Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Module Response</em>' containment reference.
	 * @see #setGetModuleResponse(GetModuleResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetModuleResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getModuleResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetModuleResponse getGetModuleResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetModuleResponse <em>Get Module Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Module Response</em>' containment reference.
	 * @see #getGetModuleResponse()
	 * @generated
	 */
	void setGetModuleResponse(GetModuleResponse value);

	/**
	 * Returns the value of the '<em><b>Get Object By Fhir ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Object By Fhir ID</em>' containment reference.
	 * @see #setGetObjectByFhirID(GetObjectByFhirID)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetObjectByFhirID()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getObjectByFhirID' namespace='##targetNamespace'"
	 * @generated
	 */
	GetObjectByFhirID getGetObjectByFhirID();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetObjectByFhirID <em>Get Object By Fhir ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Object By Fhir ID</em>' containment reference.
	 * @see #getGetObjectByFhirID()
	 * @generated
	 */
	void setGetObjectByFhirID(GetObjectByFhirID value);

	/**
	 * Returns the value of the '<em><b>Get Object By Fhir ID Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Object By Fhir ID Response</em>' containment reference.
	 * @see #setGetObjectByFhirIDResponse(GetObjectByFhirIDResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetObjectByFhirIDResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getObjectByFhirIDResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetObjectByFhirIDResponse getGetObjectByFhirIDResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetObjectByFhirIDResponse <em>Get Object By Fhir ID Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Object By Fhir ID Response</em>' containment reference.
	 * @see #getGetObjectByFhirIDResponse()
	 * @generated
	 */
	void setGetObjectByFhirIDResponse(GetObjectByFhirIDResponse value);

	/**
	 * Returns the value of the '<em><b>Get Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Policy</em>' containment reference.
	 * @see #setGetPolicy(GetPolicy)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetPolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	GetPolicy getGetPolicy();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicy <em>Get Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Policy</em>' containment reference.
	 * @see #getGetPolicy()
	 * @generated
	 */
	void setGetPolicy(GetPolicy value);

	/**
	 * Returns the value of the '<em><b>Get Policy Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Policy Response</em>' containment reference.
	 * @see #setGetPolicyResponse(GetPolicyResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetPolicyResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getPolicyResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetPolicyResponse getGetPolicyResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyResponse <em>Get Policy Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Policy Response</em>' containment reference.
	 * @see #getGetPolicyResponse()
	 * @generated
	 */
	void setGetPolicyResponse(GetPolicyResponse value);

	/**
	 * Returns the value of the '<em><b>Get Policy States For Policy And Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Policy States For Policy And Signer Ids</em>' containment reference.
	 * @see #setGetPolicyStatesForPolicyAndSignerIds(GetPolicyStatesForPolicyAndSignerIds)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetPolicyStatesForPolicyAndSignerIds()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getPolicyStatesForPolicyAndSignerIds' namespace='##targetNamespace'"
	 * @generated
	 */
	GetPolicyStatesForPolicyAndSignerIds getGetPolicyStatesForPolicyAndSignerIds();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyAndSignerIds <em>Get Policy States For Policy And Signer Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Policy States For Policy And Signer Ids</em>' containment reference.
	 * @see #getGetPolicyStatesForPolicyAndSignerIds()
	 * @generated
	 */
	void setGetPolicyStatesForPolicyAndSignerIds(GetPolicyStatesForPolicyAndSignerIds value);

	/**
	 * Returns the value of the '<em><b>Get Policy States For Policy And Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Policy States For Policy And Signer Ids Response</em>' containment reference.
	 * @see #setGetPolicyStatesForPolicyAndSignerIdsResponse(GetPolicyStatesForPolicyAndSignerIdsResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetPolicyStatesForPolicyAndSignerIdsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getPolicyStatesForPolicyAndSignerIdsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetPolicyStatesForPolicyAndSignerIdsResponse getGetPolicyStatesForPolicyAndSignerIdsResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyAndSignerIdsResponse <em>Get Policy States For Policy And Signer Ids Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Policy States For Policy And Signer Ids Response</em>' containment reference.
	 * @see #getGetPolicyStatesForPolicyAndSignerIdsResponse()
	 * @generated
	 */
	void setGetPolicyStatesForPolicyAndSignerIdsResponse(GetPolicyStatesForPolicyAndSignerIdsResponse value);

	/**
	 * Returns the value of the '<em><b>Get Policy States For Policy Name And Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Policy States For Policy Name And Signer Ids</em>' containment reference.
	 * @see #setGetPolicyStatesForPolicyNameAndSignerIds(GetPolicyStatesForPolicyNameAndSignerIds)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIds()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getPolicyStatesForPolicyNameAndSignerIds' namespace='##targetNamespace'"
	 * @generated
	 */
	GetPolicyStatesForPolicyNameAndSignerIds getGetPolicyStatesForPolicyNameAndSignerIds();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyNameAndSignerIds <em>Get Policy States For Policy Name And Signer Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Policy States For Policy Name And Signer Ids</em>' containment reference.
	 * @see #getGetPolicyStatesForPolicyNameAndSignerIds()
	 * @generated
	 */
	void setGetPolicyStatesForPolicyNameAndSignerIds(GetPolicyStatesForPolicyNameAndSignerIds value);

	/**
	 * Returns the value of the '<em><b>Get Policy States For Policy Name And Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Policy States For Policy Name And Signer Ids Response</em>' containment reference.
	 * @see #setGetPolicyStatesForPolicyNameAndSignerIdsResponse(GetPolicyStatesForPolicyNameAndSignerIdsResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetPolicyStatesForPolicyNameAndSignerIdsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getPolicyStatesForPolicyNameAndSignerIdsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetPolicyStatesForPolicyNameAndSignerIdsResponse getGetPolicyStatesForPolicyNameAndSignerIdsResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForPolicyNameAndSignerIdsResponse <em>Get Policy States For Policy Name And Signer Ids Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Policy States For Policy Name And Signer Ids Response</em>' containment reference.
	 * @see #getGetPolicyStatesForPolicyNameAndSignerIdsResponse()
	 * @generated
	 */
	void setGetPolicyStatesForPolicyNameAndSignerIdsResponse(GetPolicyStatesForPolicyNameAndSignerIdsResponse value);

	/**
	 * Returns the value of the '<em><b>Get Policy States For Signer Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Policy States For Signer Ids</em>' containment reference.
	 * @see #setGetPolicyStatesForSignerIds(GetPolicyStatesForSignerIds)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetPolicyStatesForSignerIds()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getPolicyStatesForSignerIds' namespace='##targetNamespace'"
	 * @generated
	 */
	GetPolicyStatesForSignerIds getGetPolicyStatesForSignerIds();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForSignerIds <em>Get Policy States For Signer Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Policy States For Signer Ids</em>' containment reference.
	 * @see #getGetPolicyStatesForSignerIds()
	 * @generated
	 */
	void setGetPolicyStatesForSignerIds(GetPolicyStatesForSignerIds value);

	/**
	 * Returns the value of the '<em><b>Get Policy States For Signer Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Policy States For Signer Ids Response</em>' containment reference.
	 * @see #setGetPolicyStatesForSignerIdsResponse(GetPolicyStatesForSignerIdsResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetPolicyStatesForSignerIdsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getPolicyStatesForSignerIdsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetPolicyStatesForSignerIdsResponse getGetPolicyStatesForSignerIdsResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetPolicyStatesForSignerIdsResponse <em>Get Policy States For Signer Ids Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Policy States For Signer Ids Response</em>' containment reference.
	 * @see #getGetPolicyStatesForSignerIdsResponse()
	 * @generated
	 */
	void setGetPolicyStatesForSignerIdsResponse(GetPolicyStatesForSignerIdsResponse value);

	/**
	 * Returns the value of the '<em><b>Get QC History For Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get QC History For Consent</em>' containment reference.
	 * @see #setGetQCHistoryForConsent(GetQCHistoryForConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetQCHistoryForConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getQCHistoryForConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	GetQCHistoryForConsent getGetQCHistoryForConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCHistoryForConsent <em>Get QC History For Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get QC History For Consent</em>' containment reference.
	 * @see #getGetQCHistoryForConsent()
	 * @generated
	 */
	void setGetQCHistoryForConsent(GetQCHistoryForConsent value);

	/**
	 * Returns the value of the '<em><b>Get QC History For Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get QC History For Consent Response</em>' containment reference.
	 * @see #setGetQCHistoryForConsentResponse(GetQCHistoryForConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetQCHistoryForConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getQCHistoryForConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetQCHistoryForConsentResponse getGetQCHistoryForConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCHistoryForConsentResponse <em>Get QC History For Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get QC History For Consent Response</em>' containment reference.
	 * @see #getGetQCHistoryForConsentResponse()
	 * @generated
	 */
	void setGetQCHistoryForConsentResponse(GetQCHistoryForConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Get QC Problem History For QC Problem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get QC Problem History For QC Problem</em>' containment reference.
	 * @see #setGetQCProblemHistoryForQCProblem(GetQCProblemHistoryForQCProblem)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetQCProblemHistoryForQCProblem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getQCProblemHistoryForQCProblem' namespace='##targetNamespace'"
	 * @generated
	 */
	GetQCProblemHistoryForQCProblem getGetQCProblemHistoryForQCProblem();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCProblemHistoryForQCProblem <em>Get QC Problem History For QC Problem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get QC Problem History For QC Problem</em>' containment reference.
	 * @see #getGetQCProblemHistoryForQCProblem()
	 * @generated
	 */
	void setGetQCProblemHistoryForQCProblem(GetQCProblemHistoryForQCProblem value);

	/**
	 * Returns the value of the '<em><b>Get QC Problem History For QC Problem Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get QC Problem History For QC Problem Response</em>' containment reference.
	 * @see #setGetQCProblemHistoryForQCProblemResponse(GetQCProblemHistoryForQCProblemResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetQCProblemHistoryForQCProblemResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getQCProblemHistoryForQCProblemResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetQCProblemHistoryForQCProblemResponse getGetQCProblemHistoryForQCProblemResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetQCProblemHistoryForQCProblemResponse <em>Get QC Problem History For QC Problem Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get QC Problem History For QC Problem Response</em>' containment reference.
	 * @see #getGetQCProblemHistoryForQCProblemResponse()
	 * @generated
	 */
	void setGetQCProblemHistoryForQCProblemResponse(GetQCProblemHistoryForQCProblemResponse value);

	/**
	 * Returns the value of the '<em><b>Get Signer Ids For Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Signer Ids For Alias</em>' containment reference.
	 * @see #setGetSignerIdsForAlias(GetSignerIdsForAlias)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetSignerIdsForAlias()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getSignerIdsForAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	GetSignerIdsForAlias getGetSignerIdsForAlias();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdsForAlias <em>Get Signer Ids For Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Signer Ids For Alias</em>' containment reference.
	 * @see #getGetSignerIdsForAlias()
	 * @generated
	 */
	void setGetSignerIdsForAlias(GetSignerIdsForAlias value);

	/**
	 * Returns the value of the '<em><b>Get Signer Ids For Alias Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Signer Ids For Alias Response</em>' containment reference.
	 * @see #setGetSignerIdsForAliasResponse(GetSignerIdsForAliasResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetSignerIdsForAliasResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getSignerIdsForAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetSignerIdsForAliasResponse getGetSignerIdsForAliasResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdsForAliasResponse <em>Get Signer Ids For Alias Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Signer Ids For Alias Response</em>' containment reference.
	 * @see #getGetSignerIdsForAliasResponse()
	 * @generated
	 */
	void setGetSignerIdsForAliasResponse(GetSignerIdsForAliasResponse value);

	/**
	 * Returns the value of the '<em><b>Get Signer Id Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Signer Id Type</em>' containment reference.
	 * @see #setGetSignerIdType(GetSignerIdType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetSignerIdType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getSignerIdType' namespace='##targetNamespace'"
	 * @generated
	 */
	GetSignerIdType getGetSignerIdType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdType <em>Get Signer Id Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Signer Id Type</em>' containment reference.
	 * @see #getGetSignerIdType()
	 * @generated
	 */
	void setGetSignerIdType(GetSignerIdType value);

	/**
	 * Returns the value of the '<em><b>Get Signer Id Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Signer Id Type Response</em>' containment reference.
	 * @see #setGetSignerIdTypeResponse(GetSignerIdTypeResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetSignerIdTypeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getSignerIdTypeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetSignerIdTypeResponse getGetSignerIdTypeResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetSignerIdTypeResponse <em>Get Signer Id Type Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Signer Id Type Response</em>' containment reference.
	 * @see #getGetSignerIdTypeResponse()
	 * @generated
	 */
	void setGetSignerIdTypeResponse(GetSignerIdTypeResponse value);

	/**
	 * Returns the value of the '<em><b>Get Templates With Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Templates With Policies</em>' containment reference.
	 * @see #setGetTemplatesWithPolicies(GetTemplatesWithPolicies)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetTemplatesWithPolicies()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getTemplatesWithPolicies' namespace='##targetNamespace'"
	 * @generated
	 */
	GetTemplatesWithPolicies getGetTemplatesWithPolicies();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetTemplatesWithPolicies <em>Get Templates With Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Templates With Policies</em>' containment reference.
	 * @see #getGetTemplatesWithPolicies()
	 * @generated
	 */
	void setGetTemplatesWithPolicies(GetTemplatesWithPolicies value);

	/**
	 * Returns the value of the '<em><b>Get Templates With Policies Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Templates With Policies Response</em>' containment reference.
	 * @see #setGetTemplatesWithPoliciesResponse(GetTemplatesWithPoliciesResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_GetTemplatesWithPoliciesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getTemplatesWithPoliciesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetTemplatesWithPoliciesResponse getGetTemplatesWithPoliciesResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getGetTemplatesWithPoliciesResponse <em>Get Templates With Policies Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Templates With Policies Response</em>' containment reference.
	 * @see #getGetTemplatesWithPoliciesResponse()
	 * @generated
	 */
	void setGetTemplatesWithPoliciesResponse(GetTemplatesWithPoliciesResponse value);

	/**
	 * Returns the value of the '<em><b>Illegal Argument Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illegal Argument Exception</em>' containment reference.
	 * @see #setIllegalArgumentException(org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IllegalArgumentException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IllegalArgumentException' namespace='##targetNamespace'"
	 * @generated
	 */
	org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException getIllegalArgumentException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIllegalArgumentException <em>Illegal Argument Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illegal Argument Exception</em>' containment reference.
	 * @see #getIllegalArgumentException()
	 * @generated
	 */
	void setIllegalArgumentException(org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException value);

	/**
	 * Returns the value of the '<em><b>Inconsistent Status Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inconsistent Status Exception</em>' containment reference.
	 * @see #setInconsistentStatusException(InconsistentStatusException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_InconsistentStatusException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InconsistentStatusException' namespace='##targetNamespace'"
	 * @generated
	 */
	InconsistentStatusException getInconsistentStatusException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInconsistentStatusException <em>Inconsistent Status Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inconsistent Status Exception</em>' containment reference.
	 * @see #getInconsistentStatusException()
	 * @generated
	 */
	void setInconsistentStatusException(InconsistentStatusException value);

	/**
	 * Returns the value of the '<em><b>Internal Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Exception</em>' containment reference.
	 * @see #setInternalException(InternalException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_InternalException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InternalException' namespace='##targetNamespace'"
	 * @generated
	 */
	InternalException getInternalException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInternalException <em>Internal Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Exception</em>' containment reference.
	 * @see #getInternalException()
	 * @generated
	 */
	void setInternalException(InternalException value);

	/**
	 * Returns the value of the '<em><b>Invalid Free Text Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Free Text Exception</em>' containment reference.
	 * @see #setInvalidFreeTextException(InvalidFreeTextException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_InvalidFreeTextException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvalidFreeTextException' namespace='##targetNamespace'"
	 * @generated
	 */
	InvalidFreeTextException getInvalidFreeTextException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidFreeTextException <em>Invalid Free Text Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Free Text Exception</em>' containment reference.
	 * @see #getInvalidFreeTextException()
	 * @generated
	 */
	void setInvalidFreeTextException(InvalidFreeTextException value);

	/**
	 * Returns the value of the '<em><b>Invalid Parameter Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Parameter Exception</em>' containment reference.
	 * @see #setInvalidParameterException(InvalidParameterException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_InvalidParameterException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvalidParameterException' namespace='##targetNamespace'"
	 * @generated
	 */
	InvalidParameterException getInvalidParameterException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidParameterException <em>Invalid Parameter Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Parameter Exception</em>' containment reference.
	 * @see #getInvalidParameterException()
	 * @generated
	 */
	void setInvalidParameterException(InvalidParameterException value);

	/**
	 * Returns the value of the '<em><b>Invalid Version Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Version Exception</em>' containment reference.
	 * @see #setInvalidVersionException(InvalidVersionException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_InvalidVersionException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvalidVersionException' namespace='##targetNamespace'"
	 * @generated
	 */
	InvalidVersionException getInvalidVersionException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidVersionException <em>Invalid Version Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Version Exception</em>' containment reference.
	 * @see #getInvalidVersionException()
	 * @generated
	 */
	void setInvalidVersionException(InvalidVersionException value);

	/**
	 * Returns the value of the '<em><b>Is Consented</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented</em>' containment reference.
	 * @see #setIsConsented(IsConsented)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsented()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsented' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsented getIsConsented();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsented <em>Is Consented</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented</em>' containment reference.
	 * @see #getIsConsented()
	 * @generated
	 */
	void setIsConsented(IsConsented value);

	/**
	 * Returns the value of the '<em><b>Is Consented From Excluding To Excluding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented From Excluding To Excluding</em>' containment reference.
	 * @see #setIsConsentedFromExcludingToExcluding(IsConsentedFromExcludingToExcluding)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedFromExcludingToExcluding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedFromExcludingToExcluding' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedFromExcludingToExcluding getIsConsentedFromExcludingToExcluding();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToExcluding <em>Is Consented From Excluding To Excluding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented From Excluding To Excluding</em>' containment reference.
	 * @see #getIsConsentedFromExcludingToExcluding()
	 * @generated
	 */
	void setIsConsentedFromExcludingToExcluding(IsConsentedFromExcludingToExcluding value);

	/**
	 * Returns the value of the '<em><b>Is Consented From Excluding To Excluding Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented From Excluding To Excluding Response</em>' containment reference.
	 * @see #setIsConsentedFromExcludingToExcludingResponse(IsConsentedFromExcludingToExcludingResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedFromExcludingToExcludingResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedFromExcludingToExcludingResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedFromExcludingToExcludingResponse getIsConsentedFromExcludingToExcludingResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToExcludingResponse <em>Is Consented From Excluding To Excluding Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented From Excluding To Excluding Response</em>' containment reference.
	 * @see #getIsConsentedFromExcludingToExcludingResponse()
	 * @generated
	 */
	void setIsConsentedFromExcludingToExcludingResponse(IsConsentedFromExcludingToExcludingResponse value);

	/**
	 * Returns the value of the '<em><b>Is Consented From Excluding To Including</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented From Excluding To Including</em>' containment reference.
	 * @see #setIsConsentedFromExcludingToIncluding(IsConsentedFromExcludingToIncluding)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedFromExcludingToIncluding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedFromExcludingToIncluding' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedFromExcludingToIncluding getIsConsentedFromExcludingToIncluding();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToIncluding <em>Is Consented From Excluding To Including</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented From Excluding To Including</em>' containment reference.
	 * @see #getIsConsentedFromExcludingToIncluding()
	 * @generated
	 */
	void setIsConsentedFromExcludingToIncluding(IsConsentedFromExcludingToIncluding value);

	/**
	 * Returns the value of the '<em><b>Is Consented From Excluding To Including Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented From Excluding To Including Response</em>' containment reference.
	 * @see #setIsConsentedFromExcludingToIncludingResponse(IsConsentedFromExcludingToIncludingResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedFromExcludingToIncludingResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedFromExcludingToIncludingResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedFromExcludingToIncludingResponse getIsConsentedFromExcludingToIncludingResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromExcludingToIncludingResponse <em>Is Consented From Excluding To Including Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented From Excluding To Including Response</em>' containment reference.
	 * @see #getIsConsentedFromExcludingToIncludingResponse()
	 * @generated
	 */
	void setIsConsentedFromExcludingToIncludingResponse(IsConsentedFromExcludingToIncludingResponse value);

	/**
	 * Returns the value of the '<em><b>Is Consented From Including To Excluding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented From Including To Excluding</em>' containment reference.
	 * @see #setIsConsentedFromIncludingToExcluding(IsConsentedFromIncludingToExcluding)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedFromIncludingToExcluding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedFromIncludingToExcluding' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedFromIncludingToExcluding getIsConsentedFromIncludingToExcluding();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToExcluding <em>Is Consented From Including To Excluding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented From Including To Excluding</em>' containment reference.
	 * @see #getIsConsentedFromIncludingToExcluding()
	 * @generated
	 */
	void setIsConsentedFromIncludingToExcluding(IsConsentedFromIncludingToExcluding value);

	/**
	 * Returns the value of the '<em><b>Is Consented From Including To Excluding Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented From Including To Excluding Response</em>' containment reference.
	 * @see #setIsConsentedFromIncludingToExcludingResponse(IsConsentedFromIncludingToExcludingResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedFromIncludingToExcludingResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedFromIncludingToExcludingResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedFromIncludingToExcludingResponse getIsConsentedFromIncludingToExcludingResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToExcludingResponse <em>Is Consented From Including To Excluding Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented From Including To Excluding Response</em>' containment reference.
	 * @see #getIsConsentedFromIncludingToExcludingResponse()
	 * @generated
	 */
	void setIsConsentedFromIncludingToExcludingResponse(IsConsentedFromIncludingToExcludingResponse value);

	/**
	 * Returns the value of the '<em><b>Is Consented From Including To Including</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented From Including To Including</em>' containment reference.
	 * @see #setIsConsentedFromIncludingToIncluding(IsConsentedFromIncludingToIncluding)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedFromIncludingToIncluding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedFromIncludingToIncluding' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedFromIncludingToIncluding getIsConsentedFromIncludingToIncluding();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToIncluding <em>Is Consented From Including To Including</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented From Including To Including</em>' containment reference.
	 * @see #getIsConsentedFromIncludingToIncluding()
	 * @generated
	 */
	void setIsConsentedFromIncludingToIncluding(IsConsentedFromIncludingToIncluding value);

	/**
	 * Returns the value of the '<em><b>Is Consented From Including To Including Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented From Including To Including Response</em>' containment reference.
	 * @see #setIsConsentedFromIncludingToIncludingResponse(IsConsentedFromIncludingToIncludingResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedFromIncludingToIncludingResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedFromIncludingToIncludingResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedFromIncludingToIncludingResponse getIsConsentedFromIncludingToIncludingResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedFromIncludingToIncludingResponse <em>Is Consented From Including To Including Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented From Including To Including Response</em>' containment reference.
	 * @see #getIsConsentedFromIncludingToIncludingResponse()
	 * @generated
	 */
	void setIsConsentedFromIncludingToIncludingResponse(IsConsentedFromIncludingToIncludingResponse value);

	/**
	 * Returns the value of the '<em><b>Is Consented Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consented Response</em>' containment reference.
	 * @see #setIsConsentedResponse(IsConsentedResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IsConsentedResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isConsentedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	IsConsentedResponse getIsConsentedResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIsConsentedResponse <em>Is Consented Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consented Response</em>' containment reference.
	 * @see #getIsConsentedResponse()
	 * @generated
	 */
	void setIsConsentedResponse(IsConsentedResponse value);

	/**
	 * Returns the value of the '<em><b>List Consent Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Consent Templates</em>' containment reference.
	 * @see #setListConsentTemplates(ListConsentTemplates)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListConsentTemplates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listConsentTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	ListConsentTemplates getListConsentTemplates();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListConsentTemplates <em>List Consent Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Consent Templates</em>' containment reference.
	 * @see #getListConsentTemplates()
	 * @generated
	 */
	void setListConsentTemplates(ListConsentTemplates value);

	/**
	 * Returns the value of the '<em><b>List Consent Templates Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Consent Templates Response</em>' containment reference.
	 * @see #setListConsentTemplatesResponse(ListConsentTemplatesResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListConsentTemplatesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listConsentTemplatesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ListConsentTemplatesResponse getListConsentTemplatesResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListConsentTemplatesResponse <em>List Consent Templates Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Consent Templates Response</em>' containment reference.
	 * @see #getListConsentTemplatesResponse()
	 * @generated
	 */
	void setListConsentTemplatesResponse(ListConsentTemplatesResponse value);

	/**
	 * Returns the value of the '<em><b>List Current Consent Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Current Consent Templates</em>' containment reference.
	 * @see #setListCurrentConsentTemplates(ListCurrentConsentTemplates)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListCurrentConsentTemplates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listCurrentConsentTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	ListCurrentConsentTemplates getListCurrentConsentTemplates();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListCurrentConsentTemplates <em>List Current Consent Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Current Consent Templates</em>' containment reference.
	 * @see #getListCurrentConsentTemplates()
	 * @generated
	 */
	void setListCurrentConsentTemplates(ListCurrentConsentTemplates value);

	/**
	 * Returns the value of the '<em><b>List Current Consent Templates Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Current Consent Templates Response</em>' containment reference.
	 * @see #setListCurrentConsentTemplatesResponse(ListCurrentConsentTemplatesResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListCurrentConsentTemplatesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listCurrentConsentTemplatesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ListCurrentConsentTemplatesResponse getListCurrentConsentTemplatesResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListCurrentConsentTemplatesResponse <em>List Current Consent Templates Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Current Consent Templates Response</em>' containment reference.
	 * @see #getListCurrentConsentTemplatesResponse()
	 * @generated
	 */
	void setListCurrentConsentTemplatesResponse(ListCurrentConsentTemplatesResponse value);

	/**
	 * Returns the value of the '<em><b>List Domains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Domains</em>' containment reference.
	 * @see #setListDomains(ListDomains)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListDomains()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listDomains' namespace='##targetNamespace'"
	 * @generated
	 */
	ListDomains getListDomains();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListDomains <em>List Domains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Domains</em>' containment reference.
	 * @see #getListDomains()
	 * @generated
	 */
	void setListDomains(ListDomains value);

	/**
	 * Returns the value of the '<em><b>List Domains Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Domains Response</em>' containment reference.
	 * @see #setListDomainsResponse(ListDomainsResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListDomainsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listDomainsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ListDomainsResponse getListDomainsResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListDomainsResponse <em>List Domains Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Domains Response</em>' containment reference.
	 * @see #getListDomainsResponse()
	 * @generated
	 */
	void setListDomainsResponse(ListDomainsResponse value);

	/**
	 * Returns the value of the '<em><b>List Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Modules</em>' containment reference.
	 * @see #setListModules(ListModules)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListModules()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listModules' namespace='##targetNamespace'"
	 * @generated
	 */
	ListModules getListModules();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListModules <em>List Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Modules</em>' containment reference.
	 * @see #getListModules()
	 * @generated
	 */
	void setListModules(ListModules value);

	/**
	 * Returns the value of the '<em><b>List Modules Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Modules Response</em>' containment reference.
	 * @see #setListModulesResponse(ListModulesResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListModulesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listModulesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ListModulesResponse getListModulesResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListModulesResponse <em>List Modules Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Modules Response</em>' containment reference.
	 * @see #getListModulesResponse()
	 * @generated
	 */
	void setListModulesResponse(ListModulesResponse value);

	/**
	 * Returns the value of the '<em><b>List Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Policies</em>' containment reference.
	 * @see #setListPolicies(ListPolicies)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListPolicies()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listPolicies' namespace='##targetNamespace'"
	 * @generated
	 */
	ListPolicies getListPolicies();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListPolicies <em>List Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Policies</em>' containment reference.
	 * @see #getListPolicies()
	 * @generated
	 */
	void setListPolicies(ListPolicies value);

	/**
	 * Returns the value of the '<em><b>List Policies Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Policies Response</em>' containment reference.
	 * @see #setListPoliciesResponse(ListPoliciesResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListPoliciesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listPoliciesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ListPoliciesResponse getListPoliciesResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListPoliciesResponse <em>List Policies Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Policies Response</em>' containment reference.
	 * @see #getListPoliciesResponse()
	 * @generated
	 */
	void setListPoliciesResponse(ListPoliciesResponse value);

	/**
	 * Returns the value of the '<em><b>List Signer Id Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Signer Id Types</em>' containment reference.
	 * @see #setListSignerIdTypes(ListSignerIdTypes)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListSignerIdTypes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listSignerIdTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListSignerIdTypes getListSignerIdTypes();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListSignerIdTypes <em>List Signer Id Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Signer Id Types</em>' containment reference.
	 * @see #getListSignerIdTypes()
	 * @generated
	 */
	void setListSignerIdTypes(ListSignerIdTypes value);

	/**
	 * Returns the value of the '<em><b>List Signer Id Types Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Signer Id Types Response</em>' containment reference.
	 * @see #setListSignerIdTypesResponse(ListSignerIdTypesResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ListSignerIdTypesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listSignerIdTypesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ListSignerIdTypesResponse getListSignerIdTypesResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getListSignerIdTypesResponse <em>List Signer Id Types Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Signer Id Types Response</em>' containment reference.
	 * @see #getListSignerIdTypesResponse()
	 * @generated
	 */
	void setListSignerIdTypesResponse(ListSignerIdTypesResponse value);

	/**
	 * Returns the value of the '<em><b>Mandatory Fields Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Fields Exception</em>' containment reference.
	 * @see #setMandatoryFieldsException(MandatoryFieldsException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_MandatoryFieldsException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MandatoryFieldsException' namespace='##targetNamespace'"
	 * @generated
	 */
	MandatoryFieldsException getMandatoryFieldsException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMandatoryFieldsException <em>Mandatory Fields Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Fields Exception</em>' containment reference.
	 * @see #getMandatoryFieldsException()
	 * @generated
	 */
	void setMandatoryFieldsException(MandatoryFieldsException value);

	/**
	 * Returns the value of the '<em><b>Missing Required Object Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Required Object Exception</em>' containment reference.
	 * @see #setMissingRequiredObjectException(MissingRequiredObjectException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_MissingRequiredObjectException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MissingRequiredObjectException' namespace='##targetNamespace'"
	 * @generated
	 */
	MissingRequiredObjectException getMissingRequiredObjectException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getMissingRequiredObjectException <em>Missing Required Object Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Required Object Exception</em>' containment reference.
	 * @see #getMissingRequiredObjectException()
	 * @generated
	 */
	void setMissingRequiredObjectException(MissingRequiredObjectException value);

	/**
	 * Returns the value of the '<em><b>Refuse Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refuse Consent</em>' containment reference.
	 * @see #setRefuseConsent(RefuseConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_RefuseConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refuseConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	RefuseConsent getRefuseConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRefuseConsent <em>Refuse Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refuse Consent</em>' containment reference.
	 * @see #getRefuseConsent()
	 * @generated
	 */
	void setRefuseConsent(RefuseConsent value);

	/**
	 * Returns the value of the '<em><b>Refuse Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refuse Consent Response</em>' containment reference.
	 * @see #setRefuseConsentResponse(RefuseConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_RefuseConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refuseConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RefuseConsentResponse getRefuseConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRefuseConsentResponse <em>Refuse Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refuse Consent Response</em>' containment reference.
	 * @see #getRefuseConsentResponse()
	 * @generated
	 */
	void setRefuseConsentResponse(RefuseConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Remove Scan From Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Scan From Consent</em>' containment reference.
	 * @see #setRemoveScanFromConsent(RemoveScanFromConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_RemoveScanFromConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeScanFromConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveScanFromConsent getRemoveScanFromConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRemoveScanFromConsent <em>Remove Scan From Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Scan From Consent</em>' containment reference.
	 * @see #getRemoveScanFromConsent()
	 * @generated
	 */
	void setRemoveScanFromConsent(RemoveScanFromConsent value);

	/**
	 * Returns the value of the '<em><b>Remove Scan From Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Scan From Consent Response</em>' containment reference.
	 * @see #setRemoveScanFromConsentResponse(RemoveScanFromConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_RemoveScanFromConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeScanFromConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveScanFromConsentResponse getRemoveScanFromConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRemoveScanFromConsentResponse <em>Remove Scan From Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Scan From Consent Response</em>' containment reference.
	 * @see #getRemoveScanFromConsentResponse()
	 * @generated
	 */
	void setRemoveScanFromConsentResponse(RemoveScanFromConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Requirements Not Fullfilled Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements Not Fullfilled Exception</em>' containment reference.
	 * @see #setRequirementsNotFullfilledException(RequirementsNotFullfilledException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_RequirementsNotFullfilledException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequirementsNotFullfilledException' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementsNotFullfilledException getRequirementsNotFullfilledException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getRequirementsNotFullfilledException <em>Requirements Not Fullfilled Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements Not Fullfilled Exception</em>' containment reference.
	 * @see #getRequirementsNotFullfilledException()
	 * @generated
	 */
	void setRequirementsNotFullfilledException(RequirementsNotFullfilledException value);

	/**
	 * Returns the value of the '<em><b>Set QC For Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set QC For Consent</em>' containment reference.
	 * @see #setSetQCForConsent(SetQCForConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_SetQCForConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setQCForConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	SetQCForConsent getSetQCForConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getSetQCForConsent <em>Set QC For Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set QC For Consent</em>' containment reference.
	 * @see #getSetQCForConsent()
	 * @generated
	 */
	void setSetQCForConsent(SetQCForConsent value);

	/**
	 * Returns the value of the '<em><b>Set QC For Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set QC For Consent Response</em>' containment reference.
	 * @see #setSetQCForConsentResponse(SetQCForConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_SetQCForConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setQCForConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	SetQCForConsentResponse getSetQCForConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getSetQCForConsentResponse <em>Set QC For Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set QC For Consent Response</em>' containment reference.
	 * @see #getSetQCForConsentResponse()
	 * @generated
	 */
	void setSetQCForConsentResponse(SetQCForConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Unknown Alias Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Alias Exception</em>' containment reference.
	 * @see #setUnknownAliasException(UnknownAliasException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownAliasException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownAliasException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownAliasException getUnknownAliasException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownAliasException <em>Unknown Alias Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Alias Exception</em>' containment reference.
	 * @see #getUnknownAliasException()
	 * @generated
	 */
	void setUnknownAliasException(UnknownAliasException value);

	/**
	 * Returns the value of the '<em><b>Unknown Consent Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Consent Exception</em>' containment reference.
	 * @see #setUnknownConsentException(UnknownConsentException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownConsentException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownConsentException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownConsentException getUnknownConsentException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownConsentException <em>Unknown Consent Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Consent Exception</em>' containment reference.
	 * @see #getUnknownConsentException()
	 * @generated
	 */
	void setUnknownConsentException(UnknownConsentException value);

	/**
	 * Returns the value of the '<em><b>Unknown Consent Template Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Consent Template Exception</em>' containment reference.
	 * @see #setUnknownConsentTemplateException(UnknownConsentTemplateException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownConsentTemplateException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownConsentTemplateException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownConsentTemplateException getUnknownConsentTemplateException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownConsentTemplateException <em>Unknown Consent Template Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Consent Template Exception</em>' containment reference.
	 * @see #getUnknownConsentTemplateException()
	 * @generated
	 */
	void setUnknownConsentTemplateException(UnknownConsentTemplateException value);

	/**
	 * Returns the value of the '<em><b>Unknown Domain Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Domain Exception</em>' containment reference.
	 * @see #setUnknownDomainException(UnknownDomainException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownDomainException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownDomainException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownDomainException getUnknownDomainException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownDomainException <em>Unknown Domain Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Domain Exception</em>' containment reference.
	 * @see #getUnknownDomainException()
	 * @generated
	 */
	void setUnknownDomainException(UnknownDomainException value);

	/**
	 * Returns the value of the '<em><b>Unknown Fhir Id Object Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Fhir Id Object Exception</em>' containment reference.
	 * @see #setUnknownFhirIdObjectException(UnknownFhirIdObjectException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownFhirIdObjectException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownFhirIdObjectException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownFhirIdObjectException getUnknownFhirIdObjectException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownFhirIdObjectException <em>Unknown Fhir Id Object Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Fhir Id Object Exception</em>' containment reference.
	 * @see #getUnknownFhirIdObjectException()
	 * @generated
	 */
	void setUnknownFhirIdObjectException(UnknownFhirIdObjectException value);

	/**
	 * Returns the value of the '<em><b>Unknown ID Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown ID Exception</em>' containment reference.
	 * @see #setUnknownIDException(UnknownIDException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownIDException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownIDException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownIDException getUnknownIDException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownIDException <em>Unknown ID Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown ID Exception</em>' containment reference.
	 * @see #getUnknownIDException()
	 * @generated
	 */
	void setUnknownIDException(UnknownIDException value);

	/**
	 * Returns the value of the '<em><b>Unknown Module Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Module Exception</em>' containment reference.
	 * @see #setUnknownModuleException(UnknownModuleException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownModuleException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownModuleException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownModuleException getUnknownModuleException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownModuleException <em>Unknown Module Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Module Exception</em>' containment reference.
	 * @see #getUnknownModuleException()
	 * @generated
	 */
	void setUnknownModuleException(UnknownModuleException value);

	/**
	 * Returns the value of the '<em><b>Unknown Policy Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Policy Exception</em>' containment reference.
	 * @see #setUnknownPolicyException(UnknownPolicyException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownPolicyException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownPolicyException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownPolicyException getUnknownPolicyException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownPolicyException <em>Unknown Policy Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Policy Exception</em>' containment reference.
	 * @see #getUnknownPolicyException()
	 * @generated
	 */
	void setUnknownPolicyException(UnknownPolicyException value);

	/**
	 * Returns the value of the '<em><b>Unknown Signer Id Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Signer Id Exception</em>' containment reference.
	 * @see #setUnknownSignerIdException(UnknownSignerIdException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownSignerIdException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownSignerIdException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownSignerIdException getUnknownSignerIdException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownSignerIdException <em>Unknown Signer Id Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Signer Id Exception</em>' containment reference.
	 * @see #getUnknownSignerIdException()
	 * @generated
	 */
	void setUnknownSignerIdException(UnknownSignerIdException value);

	/**
	 * Returns the value of the '<em><b>Unknown Signer Id Type Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Signer Id Type Exception</em>' containment reference.
	 * @see #setUnknownSignerIdTypeException(UnknownSignerIdTypeException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UnknownSignerIdTypeException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnknownSignerIdTypeException' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownSignerIdTypeException getUnknownSignerIdTypeException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUnknownSignerIdTypeException <em>Unknown Signer Id Type Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Signer Id Type Exception</em>' containment reference.
	 * @see #getUnknownSignerIdTypeException()
	 * @generated
	 */
	void setUnknownSignerIdTypeException(UnknownSignerIdTypeException value);

	/**
	 * Returns the value of the '<em><b>Update Consent In Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Consent In Use</em>' containment reference.
	 * @see #setUpdateConsentInUse(UpdateConsentInUse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateConsentInUse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='updateConsentInUse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateConsentInUse getUpdateConsentInUse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentInUse <em>Update Consent In Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Consent In Use</em>' containment reference.
	 * @see #getUpdateConsentInUse()
	 * @generated
	 */
	void setUpdateConsentInUse(UpdateConsentInUse value);

	/**
	 * Returns the value of the '<em><b>Update Consent In Use Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Consent In Use Response</em>' containment reference.
	 * @see #setUpdateConsentInUseResponse(UpdateConsentInUseResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateConsentInUseResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='updateConsentInUseResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateConsentInUseResponse getUpdateConsentInUseResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentInUseResponse <em>Update Consent In Use Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Consent In Use Response</em>' containment reference.
	 * @see #getUpdateConsentInUseResponse()
	 * @generated
	 */
	void setUpdateConsentInUseResponse(UpdateConsentInUseResponse value);

	/**
	 * Returns the value of the '<em><b>Validate Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Consent</em>' containment reference.
	 * @see #setValidateConsent(ValidateConsent)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ValidateConsent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validateConsent' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidateConsent getValidateConsent();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getValidateConsent <em>Validate Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Consent</em>' containment reference.
	 * @see #getValidateConsent()
	 * @generated
	 */
	void setValidateConsent(ValidateConsent value);

	/**
	 * Returns the value of the '<em><b>Validate Consent Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Consent Response</em>' containment reference.
	 * @see #setValidateConsentResponse(ValidateConsentResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ValidateConsentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validateConsentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidateConsentResponse getValidateConsentResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getValidateConsentResponse <em>Validate Consent Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Consent Response</em>' containment reference.
	 * @see #getValidateConsentResponse()
	 * @generated
	 */
	void setValidateConsentResponse(ValidateConsentResponse value);

	/**
	 * Returns the value of the '<em><b>Add Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Consent Template</em>' containment reference.
	 * @see #setAddConsentTemplate(AddConsentTemplate)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddConsentTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	AddConsentTemplate getAddConsentTemplate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentTemplate <em>Add Consent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Consent Template</em>' containment reference.
	 * @see #getAddConsentTemplate()
	 * @generated
	 */
	void setAddConsentTemplate(AddConsentTemplate value);

	/**
	 * Returns the value of the '<em><b>Add Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Consent Template Response</em>' containment reference.
	 * @see #setAddConsentTemplateResponse(AddConsentTemplateResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddConsentTemplateResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddConsentTemplateResponse getAddConsentTemplateResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddConsentTemplateResponse <em>Add Consent Template Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Consent Template Response</em>' containment reference.
	 * @see #getAddConsentTemplateResponse()
	 * @generated
	 */
	void setAddConsentTemplateResponse(AddConsentTemplateResponse value);

	/**
	 * Returns the value of the '<em><b>Add Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Module</em>' containment reference.
	 * @see #setAddModule(AddModule)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddModule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	AddModule getAddModule();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddModule <em>Add Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Module</em>' containment reference.
	 * @see #getAddModule()
	 * @generated
	 */
	void setAddModule(AddModule value);

	/**
	 * Returns the value of the '<em><b>Add Module Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Module Response</em>' containment reference.
	 * @see #setAddModuleResponse(AddModuleResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddModuleResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddModuleResponse getAddModuleResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddModuleResponse <em>Add Module Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Module Response</em>' containment reference.
	 * @see #getAddModuleResponse()
	 * @generated
	 */
	void setAddModuleResponse(AddModuleResponse value);

	/**
	 * Returns the value of the '<em><b>Add Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Domain</em>' containment reference.
	 * @see #setAddDomain(AddDomain)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	AddDomain getAddDomain();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddDomain <em>Add Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Domain</em>' containment reference.
	 * @see #getAddDomain()
	 * @generated
	 */
	void setAddDomain(AddDomain value);

	/**
	 * Returns the value of the '<em><b>Add Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Domain Response</em>' containment reference.
	 * @see #setAddDomainResponse(AddDomainResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddDomainResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddDomainResponse getAddDomainResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddDomainResponse <em>Add Domain Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Domain Response</em>' containment reference.
	 * @see #getAddDomainResponse()
	 * @generated
	 */
	void setAddDomainResponse(AddDomainResponse value);

	/**
	 * Returns the value of the '<em><b>Add Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Policy</em>' containment reference.
	 * @see #setAddPolicy(AddPolicy)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddPolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	AddPolicy getAddPolicy();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddPolicy <em>Add Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Policy</em>' containment reference.
	 * @see #getAddPolicy()
	 * @generated
	 */
	void setAddPolicy(AddPolicy value);

	/**
	 * Returns the value of the '<em><b>Add Policy Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Policy Response</em>' containment reference.
	 * @see #setAddPolicyResponse(AddPolicyResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddPolicyResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddPolicyResponse getAddPolicyResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddPolicyResponse <em>Add Policy Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Policy Response</em>' containment reference.
	 * @see #getAddPolicyResponse()
	 * @generated
	 */
	void setAddPolicyResponse(AddPolicyResponse value);

	/**
	 * Returns the value of the '<em><b>Add Signer Id Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Signer Id Type</em>' containment reference.
	 * @see #setAddSignerIdType(AddSignerIdType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddSignerIdType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	AddSignerIdType getAddSignerIdType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdType <em>Add Signer Id Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Signer Id Type</em>' containment reference.
	 * @see #getAddSignerIdType()
	 * @generated
	 */
	void setAddSignerIdType(AddSignerIdType value);

	/**
	 * Returns the value of the '<em><b>Add Signer Id Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Signer Id Type Response</em>' containment reference.
	 * @see #setAddSignerIdTypeResponse(AddSignerIdTypeResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_AddSignerIdTypeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddSignerIdTypeResponse getAddSignerIdTypeResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getAddSignerIdTypeResponse <em>Add Signer Id Type Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Signer Id Type Response</em>' containment reference.
	 * @see #getAddSignerIdTypeResponse()
	 * @generated
	 */
	void setAddSignerIdTypeResponse(AddSignerIdTypeResponse value);

	/**
	 * Returns the value of the '<em><b>Delete Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Consent Template</em>' containment reference.
	 * @see #setDeleteConsentTemplate(DeleteConsentTemplate)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeleteConsentTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteConsentTemplate getDeleteConsentTemplate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteConsentTemplate <em>Delete Consent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Consent Template</em>' containment reference.
	 * @see #getDeleteConsentTemplate()
	 * @generated
	 */
	void setDeleteConsentTemplate(DeleteConsentTemplate value);

	/**
	 * Returns the value of the '<em><b>Delete Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Consent Template Response</em>' containment reference.
	 * @see #setDeleteConsentTemplateResponse(DeleteConsentTemplateResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeleteConsentTemplateResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteConsentTemplateResponse getDeleteConsentTemplateResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteConsentTemplateResponse <em>Delete Consent Template Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Consent Template Response</em>' containment reference.
	 * @see #getDeleteConsentTemplateResponse()
	 * @generated
	 */
	void setDeleteConsentTemplateResponse(DeleteConsentTemplateResponse value);

	/**
	 * Returns the value of the '<em><b>Delete Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Domain</em>' containment reference.
	 * @see #setDeleteDomain(DeleteDomain)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeleteDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteDomain getDeleteDomain();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteDomain <em>Delete Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Domain</em>' containment reference.
	 * @see #getDeleteDomain()
	 * @generated
	 */
	void setDeleteDomain(DeleteDomain value);

	/**
	 * Returns the value of the '<em><b>Delete Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Domain Response</em>' containment reference.
	 * @see #setDeleteDomainResponse(DeleteDomainResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeleteDomainResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteDomainResponse getDeleteDomainResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteDomainResponse <em>Delete Domain Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Domain Response</em>' containment reference.
	 * @see #getDeleteDomainResponse()
	 * @generated
	 */
	void setDeleteDomainResponse(DeleteDomainResponse value);

	/**
	 * Returns the value of the '<em><b>Delete Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Module</em>' containment reference.
	 * @see #setDeleteModule(DeleteModule)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeleteModule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteModule getDeleteModule();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteModule <em>Delete Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Module</em>' containment reference.
	 * @see #getDeleteModule()
	 * @generated
	 */
	void setDeleteModule(DeleteModule value);

	/**
	 * Returns the value of the '<em><b>Delete Module Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Module Response</em>' containment reference.
	 * @see #setDeleteModuleResponse(DeleteModuleResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeleteModuleResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteModuleResponse getDeleteModuleResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteModuleResponse <em>Delete Module Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Module Response</em>' containment reference.
	 * @see #getDeleteModuleResponse()
	 * @generated
	 */
	void setDeleteModuleResponse(DeleteModuleResponse value);

	/**
	 * Returns the value of the '<em><b>Delete Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Policy</em>' containment reference.
	 * @see #setDeletePolicy(DeletePolicy)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeletePolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	DeletePolicy getDeletePolicy();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeletePolicy <em>Delete Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Policy</em>' containment reference.
	 * @see #getDeletePolicy()
	 * @generated
	 */
	void setDeletePolicy(DeletePolicy value);

	/**
	 * Returns the value of the '<em><b>Delete Policy Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Policy Response</em>' containment reference.
	 * @see #setDeletePolicyResponse(DeletePolicyResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeletePolicyResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeletePolicyResponse getDeletePolicyResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeletePolicyResponse <em>Delete Policy Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Policy Response</em>' containment reference.
	 * @see #getDeletePolicyResponse()
	 * @generated
	 */
	void setDeletePolicyResponse(DeletePolicyResponse value);

	/**
	 * Returns the value of the '<em><b>Delete Signer Id Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Signer Id Type</em>' containment reference.
	 * @see #setDeleteSignerIdType(DeleteSignerIdType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeleteSignerIdType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteSignerIdType getDeleteSignerIdType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteSignerIdType <em>Delete Signer Id Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Signer Id Type</em>' containment reference.
	 * @see #getDeleteSignerIdType()
	 * @generated
	 */
	void setDeleteSignerIdType(DeleteSignerIdType value);

	/**
	 * Returns the value of the '<em><b>Delete Signer Id Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Signer Id Type Response</em>' containment reference.
	 * @see #setDeleteSignerIdTypeResponse(DeleteSignerIdTypeResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_DeleteSignerIdTypeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteSignerIdTypeResponse getDeleteSignerIdTypeResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getDeleteSignerIdTypeResponse <em>Delete Signer Id Type Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Signer Id Type Response</em>' containment reference.
	 * @see #getDeleteSignerIdTypeResponse()
	 * @generated
	 */
	void setDeleteSignerIdTypeResponse(DeleteSignerIdTypeResponse value);

	/**
	 * Returns the value of the '<em><b>Update Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Consent Template</em>' containment reference.
	 * @see #setUpdateConsentTemplate(UpdateConsentTemplate)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateConsentTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateConsentTemplate getUpdateConsentTemplate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentTemplate <em>Update Consent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Consent Template</em>' containment reference.
	 * @see #getUpdateConsentTemplate()
	 * @generated
	 */
	void setUpdateConsentTemplate(UpdateConsentTemplate value);

	/**
	 * Returns the value of the '<em><b>Update Consent Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Consent Template Response</em>' containment reference.
	 * @see #setUpdateConsentTemplateResponse(UpdateConsentTemplateResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateConsentTemplateResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateConsentTemplateResponse getUpdateConsentTemplateResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentTemplateResponse <em>Update Consent Template Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Consent Template Response</em>' containment reference.
	 * @see #getUpdateConsentTemplateResponse()
	 * @generated
	 */
	void setUpdateConsentTemplateResponse(UpdateConsentTemplateResponse value);

	/**
	 * Returns the value of the '<em><b>Update Consent Template In Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Consent Template In Use</em>' containment reference.
	 * @see #setUpdateConsentTemplateInUse(UpdateConsentTemplateInUse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateConsentTemplateInUse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateConsentTemplateInUse getUpdateConsentTemplateInUse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentTemplateInUse <em>Update Consent Template In Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Consent Template In Use</em>' containment reference.
	 * @see #getUpdateConsentTemplateInUse()
	 * @generated
	 */
	void setUpdateConsentTemplateInUse(UpdateConsentTemplateInUse value);

	/**
	 * Returns the value of the '<em><b>Update Consent Template In Use Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Consent Template In Use Response</em>' containment reference.
	 * @see #setUpdateConsentTemplateInUseResponse(UpdateConsentTemplateInUseResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateConsentTemplateInUseResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateConsentTemplateInUseResponse getUpdateConsentTemplateInUseResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateConsentTemplateInUseResponse <em>Update Consent Template In Use Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Consent Template In Use Response</em>' containment reference.
	 * @see #getUpdateConsentTemplateInUseResponse()
	 * @generated
	 */
	void setUpdateConsentTemplateInUseResponse(UpdateConsentTemplateInUseResponse value);

	/**
	 * Returns the value of the '<em><b>Update Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Domain</em>' containment reference.
	 * @see #setUpdateDomain(UpdateDomain)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateDomain getUpdateDomain();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateDomain <em>Update Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Domain</em>' containment reference.
	 * @see #getUpdateDomain()
	 * @generated
	 */
	void setUpdateDomain(UpdateDomain value);

	/**
	 * Returns the value of the '<em><b>Update Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Domain Response</em>' containment reference.
	 * @see #setUpdateDomainResponse(UpdateDomainResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateDomainResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateDomainResponse getUpdateDomainResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateDomainResponse <em>Update Domain Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Domain Response</em>' containment reference.
	 * @see #getUpdateDomainResponse()
	 * @generated
	 */
	void setUpdateDomainResponse(UpdateDomainResponse value);

	/**
	 * Returns the value of the '<em><b>Update Domain In Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Domain In Use</em>' containment reference.
	 * @see #setUpdateDomainInUse(UpdateDomainInUse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateDomainInUse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateDomainInUse getUpdateDomainInUse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateDomainInUse <em>Update Domain In Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Domain In Use</em>' containment reference.
	 * @see #getUpdateDomainInUse()
	 * @generated
	 */
	void setUpdateDomainInUse(UpdateDomainInUse value);

	/**
	 * Returns the value of the '<em><b>Update Domain In Use Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Domain In Use Response</em>' containment reference.
	 * @see #setUpdateDomainInUseResponse(UpdateDomainInUseResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateDomainInUseResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateDomainInUseResponse getUpdateDomainInUseResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateDomainInUseResponse <em>Update Domain In Use Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Domain In Use Response</em>' containment reference.
	 * @see #getUpdateDomainInUseResponse()
	 * @generated
	 */
	void setUpdateDomainInUseResponse(UpdateDomainInUseResponse value);

	/**
	 * Returns the value of the '<em><b>Update Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Module</em>' containment reference.
	 * @see #setUpdateModule(UpdateModule)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateModule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateModule getUpdateModule();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateModule <em>Update Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Module</em>' containment reference.
	 * @see #getUpdateModule()
	 * @generated
	 */
	void setUpdateModule(UpdateModule value);

	/**
	 * Returns the value of the '<em><b>Update Module Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Module Response</em>' containment reference.
	 * @see #setUpdateModuleResponse(UpdateModuleResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateModuleResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateModuleResponse getUpdateModuleResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateModuleResponse <em>Update Module Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Module Response</em>' containment reference.
	 * @see #getUpdateModuleResponse()
	 * @generated
	 */
	void setUpdateModuleResponse(UpdateModuleResponse value);

	/**
	 * Returns the value of the '<em><b>Update Module In Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Module In Use</em>' containment reference.
	 * @see #setUpdateModuleInUse(UpdateModuleInUse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateModuleInUse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateModuleInUse getUpdateModuleInUse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateModuleInUse <em>Update Module In Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Module In Use</em>' containment reference.
	 * @see #getUpdateModuleInUse()
	 * @generated
	 */
	void setUpdateModuleInUse(UpdateModuleInUse value);

	/**
	 * Returns the value of the '<em><b>Update Module In Use Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Module In Use Response</em>' containment reference.
	 * @see #setUpdateModuleInUseResponse(UpdateModuleInUseResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateModuleInUseResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateModuleInUseResponse getUpdateModuleInUseResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateModuleInUseResponse <em>Update Module In Use Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Module In Use Response</em>' containment reference.
	 * @see #getUpdateModuleInUseResponse()
	 * @generated
	 */
	void setUpdateModuleInUseResponse(UpdateModuleInUseResponse value);

	/**
	 * Returns the value of the '<em><b>Update Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Policy</em>' containment reference.
	 * @see #setUpdatePolicy(UpdatePolicy)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdatePolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdatePolicy getUpdatePolicy();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdatePolicy <em>Update Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Policy</em>' containment reference.
	 * @see #getUpdatePolicy()
	 * @generated
	 */
	void setUpdatePolicy(UpdatePolicy value);

	/**
	 * Returns the value of the '<em><b>Update Policy Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Policy Response</em>' containment reference.
	 * @see #setUpdatePolicyResponse(UpdatePolicyResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdatePolicyResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdatePolicyResponse getUpdatePolicyResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdatePolicyResponse <em>Update Policy Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Policy Response</em>' containment reference.
	 * @see #getUpdatePolicyResponse()
	 * @generated
	 */
	void setUpdatePolicyResponse(UpdatePolicyResponse value);

	/**
	 * Returns the value of the '<em><b>Update Policy In Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Policy In Use</em>' containment reference.
	 * @see #setUpdatePolicyInUse(UpdatePolicyInUse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdatePolicyInUse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdatePolicyInUse getUpdatePolicyInUse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdatePolicyInUse <em>Update Policy In Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Policy In Use</em>' containment reference.
	 * @see #getUpdatePolicyInUse()
	 * @generated
	 */
	void setUpdatePolicyInUse(UpdatePolicyInUse value);

	/**
	 * Returns the value of the '<em><b>Update Policy In Use Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Policy In Use Response</em>' containment reference.
	 * @see #setUpdatePolicyInUseResponse(UpdatePolicyInUseResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdatePolicyInUseResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdatePolicyInUseResponse getUpdatePolicyInUseResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdatePolicyInUseResponse <em>Update Policy In Use Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Policy In Use Response</em>' containment reference.
	 * @see #getUpdatePolicyInUseResponse()
	 * @generated
	 */
	void setUpdatePolicyInUseResponse(UpdatePolicyInUseResponse value);

	/**
	 * Returns the value of the '<em><b>Finalise All For Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise All For Domain</em>' containment reference.
	 * @see #setFinaliseAllForDomain(FinaliseAllForDomain)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinaliseAllForDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	FinaliseAllForDomain getFinaliseAllForDomain();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseAllForDomain <em>Finalise All For Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise All For Domain</em>' containment reference.
	 * @see #getFinaliseAllForDomain()
	 * @generated
	 */
	void setFinaliseAllForDomain(FinaliseAllForDomain value);

	/**
	 * Returns the value of the '<em><b>Finalise All For Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise All For Domain Response</em>' containment reference.
	 * @see #setFinaliseAllForDomainResponse(FinaliseAllForDomainResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinaliseAllForDomainResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FinaliseAllForDomainResponse getFinaliseAllForDomainResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseAllForDomainResponse <em>Finalise All For Domain Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise All For Domain Response</em>' containment reference.
	 * @see #getFinaliseAllForDomainResponse()
	 * @generated
	 */
	void setFinaliseAllForDomainResponse(FinaliseAllForDomainResponse value);

	/**
	 * Returns the value of the '<em><b>Finalise Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Domain</em>' containment reference.
	 * @see #setFinaliseDomain(FinaliseDomain)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinaliseDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	FinaliseDomain getFinaliseDomain();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseDomain <em>Finalise Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Domain</em>' containment reference.
	 * @see #getFinaliseDomain()
	 * @generated
	 */
	void setFinaliseDomain(FinaliseDomain value);

	/**
	 * Returns the value of the '<em><b>Finalise Domain Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Domain Response</em>' containment reference.
	 * @see #setFinaliseDomainResponse(FinaliseDomainResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinaliseDomainResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FinaliseDomainResponse getFinaliseDomainResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseDomainResponse <em>Finalise Domain Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Domain Response</em>' containment reference.
	 * @see #getFinaliseDomainResponse()
	 * @generated
	 */
	void setFinaliseDomainResponse(FinaliseDomainResponse value);

	/**
	 * Returns the value of the '<em><b>Finalise Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Module</em>' containment reference.
	 * @see #setFinaliseModule(FinaliseModule)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinaliseModule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	FinaliseModule getFinaliseModule();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseModule <em>Finalise Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Module</em>' containment reference.
	 * @see #getFinaliseModule()
	 * @generated
	 */
	void setFinaliseModule(FinaliseModule value);

	/**
	 * Returns the value of the '<em><b>Finalise Module Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Module Response</em>' containment reference.
	 * @see #setFinaliseModuleResponse(FinaliseModuleResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinaliseModuleResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FinaliseModuleResponse getFinaliseModuleResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseModuleResponse <em>Finalise Module Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Module Response</em>' containment reference.
	 * @see #getFinaliseModuleResponse()
	 * @generated
	 */
	void setFinaliseModuleResponse(FinaliseModuleResponse value);

	/**
	 * Returns the value of the '<em><b>Finalise Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Policy</em>' containment reference.
	 * @see #setFinalisePolicy(FinalisePolicy)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinalisePolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	FinalisePolicy getFinalisePolicy();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinalisePolicy <em>Finalise Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Policy</em>' containment reference.
	 * @see #getFinalisePolicy()
	 * @generated
	 */
	void setFinalisePolicy(FinalisePolicy value);

	/**
	 * Returns the value of the '<em><b>Finalise Policy Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Policy Response</em>' containment reference.
	 * @see #setFinalisePolicyResponse(FinalisePolicyResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinalisePolicyResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FinalisePolicyResponse getFinalisePolicyResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinalisePolicyResponse <em>Finalise Policy Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Policy Response</em>' containment reference.
	 * @see #getFinalisePolicyResponse()
	 * @generated
	 */
	void setFinalisePolicyResponse(FinalisePolicyResponse value);

	/**
	 * Returns the value of the '<em><b>Finalise Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Template</em>' containment reference.
	 * @see #setFinaliseTemplate(FinaliseTemplate)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinaliseTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	FinaliseTemplate getFinaliseTemplate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseTemplate <em>Finalise Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Template</em>' containment reference.
	 * @see #getFinaliseTemplate()
	 * @generated
	 */
	void setFinaliseTemplate(FinaliseTemplate value);

	/**
	 * Returns the value of the '<em><b>Finalise Template Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalise Template Response</em>' containment reference.
	 * @see #setFinaliseTemplateResponse(FinaliseTemplateResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FinaliseTemplateResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FinaliseTemplateResponse getFinaliseTemplateResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFinaliseTemplateResponse <em>Finalise Template Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalise Template Response</em>' containment reference.
	 * @see #getFinaliseTemplateResponse()
	 * @generated
	 */
	void setFinaliseTemplateResponse(FinaliseTemplateResponse value);

	/**
	 * Returns the value of the '<em><b>Free Text Converter String Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Text Converter String Exception</em>' containment reference.
	 * @see #setFreeTextConverterStringException(FreeTextConverterStringException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_FreeTextConverterStringException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	FreeTextConverterStringException getFreeTextConverterStringException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getFreeTextConverterStringException <em>Free Text Converter String Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Text Converter String Exception</em>' containment reference.
	 * @see #getFreeTextConverterStringException()
	 * @generated
	 */
	void setFreeTextConverterStringException(FreeTextConverterStringException value);

	/**
	 * Returns the value of the '<em><b>Illegal Composition Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illegal Composition Exception</em>' containment reference.
	 * @see #setIllegalCompositionException(IllegalCompositionException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_IllegalCompositionException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	IllegalCompositionException getIllegalCompositionException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getIllegalCompositionException <em>Illegal Composition Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illegal Composition Exception</em>' containment reference.
	 * @see #getIllegalCompositionException()
	 * @generated
	 */
	void setIllegalCompositionException(IllegalCompositionException value);

	/**
	 * Returns the value of the '<em><b>Invalid Properties Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Properties Exception</em>' containment reference.
	 * @see #setInvalidPropertiesException(InvalidPropertiesException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_InvalidPropertiesException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	InvalidPropertiesException getInvalidPropertiesException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getInvalidPropertiesException <em>Invalid Properties Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Properties Exception</em>' containment reference.
	 * @see #getInvalidPropertiesException()
	 * @generated
	 */
	void setInvalidPropertiesException(InvalidPropertiesException value);

	/**
	 * Returns the value of the '<em><b>Object In Use Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object In Use Exception</em>' containment reference.
	 * @see #setObjectInUseException(ObjectInUseException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_ObjectInUseException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectInUseException getObjectInUseException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getObjectInUseException <em>Object In Use Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object In Use Exception</em>' containment reference.
	 * @see #getObjectInUseException()
	 * @generated
	 */
	void setObjectInUseException(ObjectInUseException value);

	/**
	 * Returns the value of the '<em><b>Update Signer Id Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Signer Id Type</em>' containment reference.
	 * @see #setUpdateSignerIdType(UpdateSignerIdType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateSignerIdType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateSignerIdType getUpdateSignerIdType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateSignerIdType <em>Update Signer Id Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Signer Id Type</em>' containment reference.
	 * @see #getUpdateSignerIdType()
	 * @generated
	 */
	void setUpdateSignerIdType(UpdateSignerIdType value);

	/**
	 * Returns the value of the '<em><b>Update Signer Id Type Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Signer Id Type Response</em>' containment reference.
	 * @see #setUpdateSignerIdTypeResponse(UpdateSignerIdTypeResponse)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_UpdateSignerIdTypeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAliasResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateSignerIdTypeResponse getUpdateSignerIdTypeResponse();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getUpdateSignerIdTypeResponse <em>Update Signer Id Type Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Signer Id Type Response</em>' containment reference.
	 * @see #getUpdateSignerIdTypeResponse()
	 * @generated
	 */
	void setUpdateSignerIdTypeResponse(UpdateSignerIdTypeResponse value);

	/**
	 * Returns the value of the '<em><b>Version Converter Class Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Converter Class Exception</em>' containment reference.
	 * @see #setVersionConverterClassException(VersionConverterClassException)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDocumentRoot_VersionConverterClassException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionConverterClassException getVersionConverterClassException();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot#getVersionConverterClassException <em>Version Converter Class Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Converter Class Exception</em>' containment reference.
	 * @see #getVersionConverterClassException()
	 * @generated
	 */
	void setVersionConverterClassException(VersionConverterClassException value);

} // DocumentRoot
