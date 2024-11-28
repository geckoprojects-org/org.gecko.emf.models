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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package
 * @generated
 */
@ProviderType
public interface Cm2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cm2Factory eINSTANCE = org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Alias</em>'.
	 * @generated
	 */
	AddAlias createAddAlias();

	/**
	 * Returns a new object of class '<em>Add Alias Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Alias Response</em>'.
	 * @generated
	 */
	AddAliasResponse createAddAliasResponse();

	/**
	 * Returns a new object of class '<em>Add Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Consent</em>'.
	 * @generated
	 */
	AddConsent createAddConsent();

	/**
	 * Returns a new object of class '<em>Add Consent Opt Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Consent Opt Out</em>'.
	 * @generated
	 */
	AddConsentOptOut createAddConsentOptOut();

	/**
	 * Returns a new object of class '<em>Add Consent Opt Out Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Consent Opt Out Response</em>'.
	 * @generated
	 */
	AddConsentOptOutResponse createAddConsentOptOutResponse();

	/**
	 * Returns a new object of class '<em>Add Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Consent Response</em>'.
	 * @generated
	 */
	AddConsentResponse createAddConsentResponse();

	/**
	 * Returns a new object of class '<em>Add Scan To Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Scan To Consent</em>'.
	 * @generated
	 */
	AddScanToConsent createAddScanToConsent();

	/**
	 * Returns a new object of class '<em>Add Scan To Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Scan To Consent Response</em>'.
	 * @generated
	 */
	AddScanToConsentResponse createAddScanToConsentResponse();

	/**
	 * Returns a new object of class '<em>Add Signer Id To Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Signer Id To Consent</em>'.
	 * @generated
	 */
	AddSignerIdToConsent createAddSignerIdToConsent();

	/**
	 * Returns a new object of class '<em>Add Signer Id To Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Signer Id To Consent Response</em>'.
	 * @generated
	 */
	AddSignerIdToConsentResponse createAddSignerIdToConsentResponse();

	/**
	 * Returns a new object of class '<em>Add Signer Id To Signer Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Signer Id To Signer Id</em>'.
	 * @generated
	 */
	AddSignerIdToSignerId createAddSignerIdToSignerId();

	/**
	 * Returns a new object of class '<em>Add Signer Id To Signer Id Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Signer Id To Signer Id Response</em>'.
	 * @generated
	 */
	AddSignerIdToSignerIdResponse createAddSignerIdToSignerIdResponse();

	/**
	 * Returns a new object of class '<em>Assigned Module DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assigned Module DTO</em>'.
	 * @generated
	 */
	AssignedModuleDTO createAssignedModuleDTO();

	/**
	 * Returns a new object of class '<em>Assigned Policy DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assigned Policy DTO</em>'.
	 * @generated
	 */
	AssignedPolicyDTO createAssignedPolicyDTO();

	/**
	 * Returns a new object of class '<em>Children Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Children Type</em>'.
	 * @generated
	 */
	ChildrenType createChildrenType();

	/**
	 * Returns a new object of class '<em>Consent Date Values DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Date Values DTO</em>'.
	 * @generated
	 */
	ConsentDateValuesDTO createConsentDateValuesDTO();

	/**
	 * Returns a new object of class '<em>Consent DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent DTO</em>'.
	 * @generated
	 */
	ConsentDTO createConsentDTO();

	/**
	 * Returns a new object of class '<em>Consent Key DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Key DTO</em>'.
	 * @generated
	 */
	ConsentKeyDTO createConsentKeyDTO();

	/**
	 * Returns a new object of class '<em>Consent Light DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Light DTO</em>'.
	 * @generated
	 */
	ConsentLightDTO createConsentLightDTO();

	/**
	 * Returns a new object of class '<em>Consent Scan DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Scan DTO</em>'.
	 * @generated
	 */
	ConsentScanDTO createConsentScanDTO();

	/**
	 * Returns a new object of class '<em>Consent Template DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Template DTO</em>'.
	 * @generated
	 */
	ConsentTemplateDTO createConsentTemplateDTO();

	/**
	 * Returns a new object of class '<em>Consent Template Key DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Template Key DTO</em>'.
	 * @generated
	 */
	ConsentTemplateKeyDTO createConsentTemplateKeyDTO();

	/**
	 * Returns a new object of class '<em>Consent Template Structure DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Template Structure DTO</em>'.
	 * @generated
	 */
	ConsentTemplateStructureDTO createConsentTemplateStructureDTO();

	/**
	 * Returns a new object of class '<em>Count Consents For Domain With Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Consents For Domain With Filter</em>'.
	 * @generated
	 */
	CountConsentsForDomainWithFilter createCountConsentsForDomainWithFilter();

	/**
	 * Returns a new object of class '<em>Count Consents For Domain With Filter Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Consents For Domain With Filter Response</em>'.
	 * @generated
	 */
	CountConsentsForDomainWithFilterResponse createCountConsentsForDomainWithFilterResponse();

	/**
	 * Returns a new object of class '<em>Count Signed Policies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Signed Policies</em>'.
	 * @generated
	 */
	CountSignedPolicies createCountSignedPolicies();

	/**
	 * Returns a new object of class '<em>Count Signed Policies Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Signed Policies Response</em>'.
	 * @generated
	 */
	CountSignedPoliciesResponse createCountSignedPoliciesResponse();

	/**
	 * Returns a new object of class '<em>Deactivate Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deactivate Alias</em>'.
	 * @generated
	 */
	DeactivateAlias createDeactivateAlias();

	/**
	 * Returns a new object of class '<em>Deactivate Alias Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deactivate Alias Response</em>'.
	 * @generated
	 */
	DeactivateAliasResponse createDeactivateAliasResponse();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Domain DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain DTO</em>'.
	 * @generated
	 */
	DomainDTO createDomainDTO();

	/**
	 * Returns a new object of class '<em>Duplicate Entry Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duplicate Entry Exception</em>'.
	 * @generated
	 */
	DuplicateEntryException createDuplicateEntryException();

	/**
	 * Returns a new object of class '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Type</em>'.
	 * @generated
	 */
	EntryType createEntryType();

	/**
	 * Returns a new object of class '<em>Entry Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Type1</em>'.
	 * @generated
	 */
	EntryType1 createEntryType1();

	/**
	 * Returns a new object of class '<em>Entry Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Type2</em>'.
	 * @generated
	 */
	EntryType2 createEntryType2();

	/**
	 * Returns a new object of class '<em>Entry Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Type3</em>'.
	 * @generated
	 */
	EntryType3 createEntryType3();

	/**
	 * Returns a new object of class '<em>Entry Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Type4</em>'.
	 * @generated
	 */
	EntryType4 createEntryType4();

	/**
	 * Returns a new object of class '<em>Expiration Properties DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expiration Properties DTO</em>'.
	 * @generated
	 */
	ExpirationPropertiesDTO createExpirationPropertiesDTO();

	/**
	 * Returns a new object of class '<em>Free Text Def DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Text Def DTO</em>'.
	 * @generated
	 */
	FreeTextDefDTO createFreeTextDefDTO();

	/**
	 * Returns a new object of class '<em>Free Text Val DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Text Val DTO</em>'.
	 * @generated
	 */
	FreeTextValDTO createFreeTextValDTO();

	/**
	 * Returns a new object of class '<em>Get Aliases For Signer Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Aliases For Signer Id</em>'.
	 * @generated
	 */
	GetAliasesForSignerId createGetAliasesForSignerId();

	/**
	 * Returns a new object of class '<em>Get Aliases For Signer Id Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Aliases For Signer Id Response</em>'.
	 * @generated
	 */
	GetAliasesForSignerIdResponse createGetAliasesForSignerIdResponse();

	/**
	 * Returns a new object of class '<em>Get Aliases For Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Aliases For Signer Ids</em>'.
	 * @generated
	 */
	GetAliasesForSignerIds createGetAliasesForSignerIds();

	/**
	 * Returns a new object of class '<em>Get Aliases For Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Aliases For Signer Ids Response</em>'.
	 * @generated
	 */
	GetAliasesForSignerIdsResponse createGetAliasesForSignerIdsResponse();

	/**
	 * Returns a new object of class '<em>Get All Consented Ids For</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consented Ids For</em>'.
	 * @generated
	 */
	GetAllConsentedIdsFor createGetAllConsentedIdsFor();

	/**
	 * Returns a new object of class '<em>Get All Consented Ids For Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consented Ids For Response</em>'.
	 * @generated
	 */
	GetAllConsentedIdsForResponse createGetAllConsentedIdsForResponse();

	/**
	 * Returns a new object of class '<em>Get All Consents For Consent Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consents For Consent Template</em>'.
	 * @generated
	 */
	GetAllConsentsForConsentTemplate createGetAllConsentsForConsentTemplate();

	/**
	 * Returns a new object of class '<em>Get All Consents For Consent Template Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consents For Consent Template Response</em>'.
	 * @generated
	 */
	GetAllConsentsForConsentTemplateResponse createGetAllConsentsForConsentTemplateResponse();

	/**
	 * Returns a new object of class '<em>Get All Consents For Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consents For Domain</em>'.
	 * @generated
	 */
	GetAllConsentsForDomain createGetAllConsentsForDomain();

	/**
	 * Returns a new object of class '<em>Get All Consents For Domain Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consents For Domain Response</em>'.
	 * @generated
	 */
	GetAllConsentsForDomainResponse createGetAllConsentsForDomainResponse();

	/**
	 * Returns a new object of class '<em>Get All Consents For Domain Without Scan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consents For Domain Without Scan</em>'.
	 * @generated
	 */
	GetAllConsentsForDomainWithoutScan createGetAllConsentsForDomainWithoutScan();

	/**
	 * Returns a new object of class '<em>Get All Consents For Domain Without Scan Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consents For Domain Without Scan Response</em>'.
	 * @generated
	 */
	GetAllConsentsForDomainWithoutScanResponse createGetAllConsentsForDomainWithoutScanResponse();

	/**
	 * Returns a new object of class '<em>Get All Consents For Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consents For Signer Ids</em>'.
	 * @generated
	 */
	GetAllConsentsForSignerIds createGetAllConsentsForSignerIds();

	/**
	 * Returns a new object of class '<em>Get All Consents For Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Consents For Signer Ids Response</em>'.
	 * @generated
	 */
	GetAllConsentsForSignerIdsResponse createGetAllConsentsForSignerIdsResponse();

	/**
	 * Returns a new object of class '<em>Get All Ids For Signer Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Ids For Signer Id Type</em>'.
	 * @generated
	 */
	GetAllIdsForSignerIdType createGetAllIdsForSignerIdType();

	/**
	 * Returns a new object of class '<em>Get All Ids For Signer Id Type Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Ids For Signer Id Type Response</em>'.
	 * @generated
	 */
	GetAllIdsForSignerIdTypeResponse createGetAllIdsForSignerIdTypeResponse();

	/**
	 * Returns a new object of class '<em>Get Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent</em>'.
	 * @generated
	 */
	GetConsent createGetConsent();

	/**
	 * Returns a new object of class '<em>Get Consent Dates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Dates</em>'.
	 * @generated
	 */
	GetConsentDates createGetConsentDates();

	/**
	 * Returns a new object of class '<em>Get Consent Dates Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Dates Response</em>'.
	 * @generated
	 */
	GetConsentDatesResponse createGetConsentDatesResponse();

	/**
	 * Returns a new object of class '<em>Get Consent Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Light</em>'.
	 * @generated
	 */
	GetConsentLight createGetConsentLight();

	/**
	 * Returns a new object of class '<em>Get Consent Light Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Light Response</em>'.
	 * @generated
	 */
	GetConsentLightResponse createGetConsentLightResponse();

	/**
	 * Returns a new object of class '<em>Get Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Response</em>'.
	 * @generated
	 */
	GetConsentResponse createGetConsentResponse();

	/**
	 * Returns a new object of class '<em>Get Consents For Domain Paginated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consents For Domain Paginated</em>'.
	 * @generated
	 */
	GetConsentsForDomainPaginated createGetConsentsForDomainPaginated();

	/**
	 * Returns a new object of class '<em>Get Consents For Domain Paginated Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consents For Domain Paginated Response</em>'.
	 * @generated
	 */
	GetConsentsForDomainPaginatedResponse createGetConsentsForDomainPaginatedResponse();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type</em>'.
	 * @generated
	 */
	GetConsentStatusType createGetConsentStatusType();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type From Excluding To Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type From Excluding To Excluding</em>'.
	 * @generated
	 */
	GetConsentStatusTypeFromExcludingToExcluding createGetConsentStatusTypeFromExcludingToExcluding();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type From Excluding To Excluding Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type From Excluding To Excluding Response</em>'.
	 * @generated
	 */
	GetConsentStatusTypeFromExcludingToExcludingResponse createGetConsentStatusTypeFromExcludingToExcludingResponse();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type From Excluding To Including</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type From Excluding To Including</em>'.
	 * @generated
	 */
	GetConsentStatusTypeFromExcludingToIncluding createGetConsentStatusTypeFromExcludingToIncluding();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type From Excluding To Including Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type From Excluding To Including Response</em>'.
	 * @generated
	 */
	GetConsentStatusTypeFromExcludingToIncludingResponse createGetConsentStatusTypeFromExcludingToIncludingResponse();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type From Including To Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type From Including To Excluding</em>'.
	 * @generated
	 */
	GetConsentStatusTypeFromIncludingToExcluding createGetConsentStatusTypeFromIncludingToExcluding();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type From Including To Excluding Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type From Including To Excluding Response</em>'.
	 * @generated
	 */
	GetConsentStatusTypeFromIncludingToExcludingResponse createGetConsentStatusTypeFromIncludingToExcludingResponse();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type From Including To Including</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type From Including To Including</em>'.
	 * @generated
	 */
	GetConsentStatusTypeFromIncludingToIncluding createGetConsentStatusTypeFromIncludingToIncluding();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type From Including To Including Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type From Including To Including Response</em>'.
	 * @generated
	 */
	GetConsentStatusTypeFromIncludingToIncludingResponse createGetConsentStatusTypeFromIncludingToIncludingResponse();

	/**
	 * Returns a new object of class '<em>Get Consent Status Type Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Status Type Response</em>'.
	 * @generated
	 */
	GetConsentStatusTypeResponse createGetConsentStatusTypeResponse();

	/**
	 * Returns a new object of class '<em>Get Consent Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Template</em>'.
	 * @generated
	 */
	GetConsentTemplate createGetConsentTemplate();

	/**
	 * Returns a new object of class '<em>Get Consent Template Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Consent Template Response</em>'.
	 * @generated
	 */
	GetConsentTemplateResponse createGetConsentTemplateResponse();

	/**
	 * Returns a new object of class '<em>Get Current Consent For Signer Ids And CT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Current Consent For Signer Ids And CT</em>'.
	 * @generated
	 */
	GetCurrentConsentForSignerIdsAndCT createGetCurrentConsentForSignerIdsAndCT();

	/**
	 * Returns a new object of class '<em>Get Current Consent For Signer Ids And CT Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Current Consent For Signer Ids And CT Response</em>'.
	 * @generated
	 */
	GetCurrentConsentForSignerIdsAndCTResponse createGetCurrentConsentForSignerIdsAndCTResponse();

	/**
	 * Returns a new object of class '<em>Get Current Consent Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Current Consent Template</em>'.
	 * @generated
	 */
	GetCurrentConsentTemplate createGetCurrentConsentTemplate();

	/**
	 * Returns a new object of class '<em>Get Current Consent Template Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Current Consent Template Response</em>'.
	 * @generated
	 */
	GetCurrentConsentTemplateResponse createGetCurrentConsentTemplateResponse();

	/**
	 * Returns a new object of class '<em>Get Current Policy States For Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Current Policy States For Signer Ids</em>'.
	 * @generated
	 */
	GetCurrentPolicyStatesForSignerIds createGetCurrentPolicyStatesForSignerIds();

	/**
	 * Returns a new object of class '<em>Get Current Policy States For Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Current Policy States For Signer Ids Response</em>'.
	 * @generated
	 */
	GetCurrentPolicyStatesForSignerIdsResponse createGetCurrentPolicyStatesForSignerIdsResponse();

	/**
	 * Returns a new object of class '<em>Get Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Domain</em>'.
	 * @generated
	 */
	GetDomain createGetDomain();

	/**
	 * Returns a new object of class '<em>Get Domain Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Domain Response</em>'.
	 * @generated
	 */
	GetDomainResponse createGetDomainResponse();

	/**
	 * Returns a new object of class '<em>Get Mapped Templates For Signer Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Mapped Templates For Signer Id</em>'.
	 * @generated
	 */
	GetMappedTemplatesForSignerId createGetMappedTemplatesForSignerId();

	/**
	 * Returns a new object of class '<em>Get Mapped Templates For Signer Id Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Mapped Templates For Signer Id Response</em>'.
	 * @generated
	 */
	GetMappedTemplatesForSignerIdResponse createGetMappedTemplatesForSignerIdResponse();

	/**
	 * Returns a new object of class '<em>Get Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Module</em>'.
	 * @generated
	 */
	GetModule createGetModule();

	/**
	 * Returns a new object of class '<em>Get Module Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Module Response</em>'.
	 * @generated
	 */
	GetModuleResponse createGetModuleResponse();

	/**
	 * Returns a new object of class '<em>Get Object By Fhir ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Object By Fhir ID</em>'.
	 * @generated
	 */
	GetObjectByFhirID createGetObjectByFhirID();

	/**
	 * Returns a new object of class '<em>Get Object By Fhir ID Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Object By Fhir ID Response</em>'.
	 * @generated
	 */
	GetObjectByFhirIDResponse createGetObjectByFhirIDResponse();

	/**
	 * Returns a new object of class '<em>Get Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Policy</em>'.
	 * @generated
	 */
	GetPolicy createGetPolicy();

	/**
	 * Returns a new object of class '<em>Get Policy Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Policy Response</em>'.
	 * @generated
	 */
	GetPolicyResponse createGetPolicyResponse();

	/**
	 * Returns a new object of class '<em>Get Policy States For Policy And Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Policy States For Policy And Signer Ids</em>'.
	 * @generated
	 */
	GetPolicyStatesForPolicyAndSignerIds createGetPolicyStatesForPolicyAndSignerIds();

	/**
	 * Returns a new object of class '<em>Get Policy States For Policy And Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Policy States For Policy And Signer Ids Response</em>'.
	 * @generated
	 */
	GetPolicyStatesForPolicyAndSignerIdsResponse createGetPolicyStatesForPolicyAndSignerIdsResponse();

	/**
	 * Returns a new object of class '<em>Get Policy States For Policy Name And Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Policy States For Policy Name And Signer Ids</em>'.
	 * @generated
	 */
	GetPolicyStatesForPolicyNameAndSignerIds createGetPolicyStatesForPolicyNameAndSignerIds();

	/**
	 * Returns a new object of class '<em>Get Policy States For Policy Name And Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Policy States For Policy Name And Signer Ids Response</em>'.
	 * @generated
	 */
	GetPolicyStatesForPolicyNameAndSignerIdsResponse createGetPolicyStatesForPolicyNameAndSignerIdsResponse();

	/**
	 * Returns a new object of class '<em>Get Policy States For Signer Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Policy States For Signer Ids</em>'.
	 * @generated
	 */
	GetPolicyStatesForSignerIds createGetPolicyStatesForSignerIds();

	/**
	 * Returns a new object of class '<em>Get Policy States For Signer Ids Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Policy States For Signer Ids Response</em>'.
	 * @generated
	 */
	GetPolicyStatesForSignerIdsResponse createGetPolicyStatesForSignerIdsResponse();

	/**
	 * Returns a new object of class '<em>Get QC History For Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get QC History For Consent</em>'.
	 * @generated
	 */
	GetQCHistoryForConsent createGetQCHistoryForConsent();

	/**
	 * Returns a new object of class '<em>Get QC History For Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get QC History For Consent Response</em>'.
	 * @generated
	 */
	GetQCHistoryForConsentResponse createGetQCHistoryForConsentResponse();

	/**
	 * Returns a new object of class '<em>Get QC Problem History For QC Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get QC Problem History For QC Problem</em>'.
	 * @generated
	 */
	GetQCProblemHistoryForQCProblem createGetQCProblemHistoryForQCProblem();

	/**
	 * Returns a new object of class '<em>Get QC Problem History For QC Problem Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get QC Problem History For QC Problem Response</em>'.
	 * @generated
	 */
	GetQCProblemHistoryForQCProblemResponse createGetQCProblemHistoryForQCProblemResponse();

	/**
	 * Returns a new object of class '<em>Get Signer Ids For Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Signer Ids For Alias</em>'.
	 * @generated
	 */
	GetSignerIdsForAlias createGetSignerIdsForAlias();

	/**
	 * Returns a new object of class '<em>Get Signer Ids For Alias Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Signer Ids For Alias Response</em>'.
	 * @generated
	 */
	GetSignerIdsForAliasResponse createGetSignerIdsForAliasResponse();

	/**
	 * Returns a new object of class '<em>Get Signer Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Signer Id Type</em>'.
	 * @generated
	 */
	GetSignerIdType createGetSignerIdType();

	/**
	 * Returns a new object of class '<em>Get Signer Id Type Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Signer Id Type Response</em>'.
	 * @generated
	 */
	GetSignerIdTypeResponse createGetSignerIdTypeResponse();

	/**
	 * Returns a new object of class '<em>Get Templates With Policies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Templates With Policies</em>'.
	 * @generated
	 */
	GetTemplatesWithPolicies createGetTemplatesWithPolicies();

	/**
	 * Returns a new object of class '<em>Get Templates With Policies Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Templates With Policies Response</em>'.
	 * @generated
	 */
	GetTemplatesWithPoliciesResponse createGetTemplatesWithPoliciesResponse();

	/**
	 * Returns a new object of class '<em>Hash Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash Map</em>'.
	 * @generated
	 */
	HashMap createHashMap();

	/**
	 * Returns a new object of class '<em>Illegal Argument Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Illegal Argument Exception</em>'.
	 * @generated
	 */
	IllegalArgumentException createIllegalArgumentException();

	/**
	 * Returns a new object of class '<em>Inconsistent Status Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inconsistent Status Exception</em>'.
	 * @generated
	 */
	InconsistentStatusException createInconsistentStatusException();

	/**
	 * Returns a new object of class '<em>Internal Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Exception</em>'.
	 * @generated
	 */
	InternalException createInternalException();

	/**
	 * Returns a new object of class '<em>Invalid Free Text Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Free Text Exception</em>'.
	 * @generated
	 */
	InvalidFreeTextException createInvalidFreeTextException();

	/**
	 * Returns a new object of class '<em>Invalid Parameter Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Parameter Exception</em>'.
	 * @generated
	 */
	InvalidParameterException createInvalidParameterException();

	/**
	 * Returns a new object of class '<em>Invalid Version Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Version Exception</em>'.
	 * @generated
	 */
	InvalidVersionException createInvalidVersionException();

	/**
	 * Returns a new object of class '<em>Is Consented</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented</em>'.
	 * @generated
	 */
	IsConsented createIsConsented();

	/**
	 * Returns a new object of class '<em>Is Consented From Excluding To Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented From Excluding To Excluding</em>'.
	 * @generated
	 */
	IsConsentedFromExcludingToExcluding createIsConsentedFromExcludingToExcluding();

	/**
	 * Returns a new object of class '<em>Is Consented From Excluding To Excluding Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented From Excluding To Excluding Response</em>'.
	 * @generated
	 */
	IsConsentedFromExcludingToExcludingResponse createIsConsentedFromExcludingToExcludingResponse();

	/**
	 * Returns a new object of class '<em>Is Consented From Excluding To Including</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented From Excluding To Including</em>'.
	 * @generated
	 */
	IsConsentedFromExcludingToIncluding createIsConsentedFromExcludingToIncluding();

	/**
	 * Returns a new object of class '<em>Is Consented From Excluding To Including Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented From Excluding To Including Response</em>'.
	 * @generated
	 */
	IsConsentedFromExcludingToIncludingResponse createIsConsentedFromExcludingToIncludingResponse();

	/**
	 * Returns a new object of class '<em>Is Consented From Including To Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented From Including To Excluding</em>'.
	 * @generated
	 */
	IsConsentedFromIncludingToExcluding createIsConsentedFromIncludingToExcluding();

	/**
	 * Returns a new object of class '<em>Is Consented From Including To Excluding Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented From Including To Excluding Response</em>'.
	 * @generated
	 */
	IsConsentedFromIncludingToExcludingResponse createIsConsentedFromIncludingToExcludingResponse();

	/**
	 * Returns a new object of class '<em>Is Consented From Including To Including</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented From Including To Including</em>'.
	 * @generated
	 */
	IsConsentedFromIncludingToIncluding createIsConsentedFromIncludingToIncluding();

	/**
	 * Returns a new object of class '<em>Is Consented From Including To Including Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented From Including To Including Response</em>'.
	 * @generated
	 */
	IsConsentedFromIncludingToIncludingResponse createIsConsentedFromIncludingToIncludingResponse();

	/**
	 * Returns a new object of class '<em>Is Consented Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Consented Response</em>'.
	 * @generated
	 */
	IsConsentedResponse createIsConsentedResponse();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>List Consent Templates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Consent Templates</em>'.
	 * @generated
	 */
	ListConsentTemplates createListConsentTemplates();

	/**
	 * Returns a new object of class '<em>List Consent Templates Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Consent Templates Response</em>'.
	 * @generated
	 */
	ListConsentTemplatesResponse createListConsentTemplatesResponse();

	/**
	 * Returns a new object of class '<em>List Current Consent Templates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Current Consent Templates</em>'.
	 * @generated
	 */
	ListCurrentConsentTemplates createListCurrentConsentTemplates();

	/**
	 * Returns a new object of class '<em>List Current Consent Templates Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Current Consent Templates Response</em>'.
	 * @generated
	 */
	ListCurrentConsentTemplatesResponse createListCurrentConsentTemplatesResponse();

	/**
	 * Returns a new object of class '<em>List Domains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Domains</em>'.
	 * @generated
	 */
	ListDomains createListDomains();

	/**
	 * Returns a new object of class '<em>List Domains Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Domains Response</em>'.
	 * @generated
	 */
	ListDomainsResponse createListDomainsResponse();

	/**
	 * Returns a new object of class '<em>List Modules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Modules</em>'.
	 * @generated
	 */
	ListModules createListModules();

	/**
	 * Returns a new object of class '<em>List Modules Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Modules Response</em>'.
	 * @generated
	 */
	ListModulesResponse createListModulesResponse();

	/**
	 * Returns a new object of class '<em>List Policies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Policies</em>'.
	 * @generated
	 */
	ListPolicies createListPolicies();

	/**
	 * Returns a new object of class '<em>List Policies Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Policies Response</em>'.
	 * @generated
	 */
	ListPoliciesResponse createListPoliciesResponse();

	/**
	 * Returns a new object of class '<em>List Signer Id Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Signer Id Types</em>'.
	 * @generated
	 */
	ListSignerIdTypes createListSignerIdTypes();

	/**
	 * Returns a new object of class '<em>List Signer Id Types Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Signer Id Types Response</em>'.
	 * @generated
	 */
	ListSignerIdTypesResponse createListSignerIdTypesResponse();

	/**
	 * Returns a new object of class '<em>Mandatory Fields Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Fields Exception</em>'.
	 * @generated
	 */
	MandatoryFieldsException createMandatoryFieldsException();

	/**
	 * Returns a new object of class '<em>Missing Required Object Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Missing Required Object Exception</em>'.
	 * @generated
	 */
	MissingRequiredObjectException createMissingRequiredObjectException();

	/**
	 * Returns a new object of class '<em>Module DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module DTO</em>'.
	 * @generated
	 */
	ModuleDTO createModuleDTO();

	/**
	 * Returns a new object of class '<em>Module Expirations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Expirations Type</em>'.
	 * @generated
	 */
	ModuleExpirationsType createModuleExpirationsType();

	/**
	 * Returns a new object of class '<em>Module Key DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Key DTO</em>'.
	 * @generated
	 */
	ModuleKeyDTO createModuleKeyDTO();

	/**
	 * Returns a new object of class '<em>Module Key DTO Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Key DTO Array</em>'.
	 * @generated
	 */
	ModuleKeyDTOArray createModuleKeyDTOArray();

	/**
	 * Returns a new object of class '<em>Module State DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module State DTO</em>'.
	 * @generated
	 */
	ModuleStateDTO createModuleStateDTO();

	/**
	 * Returns a new object of class '<em>Module States Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module States Type</em>'.
	 * @generated
	 */
	ModuleStatesType createModuleStatesType();

	/**
	 * Returns a new object of class '<em>Policy DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy DTO</em>'.
	 * @generated
	 */
	PolicyDTO createPolicyDTO();

	/**
	 * Returns a new object of class '<em>Policy Expirations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Expirations Type</em>'.
	 * @generated
	 */
	PolicyExpirationsType createPolicyExpirationsType();

	/**
	 * Returns a new object of class '<em>Policy Key DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Key DTO</em>'.
	 * @generated
	 */
	PolicyKeyDTO createPolicyKeyDTO();

	/**
	 * Returns a new object of class '<em>Qcdto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qcdto</em>'.
	 * @generated
	 */
	Qcdto createQcdto();

	/**
	 * Returns a new object of class '<em>Qc History DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qc History DTO</em>'.
	 * @generated
	 */
	QcHistoryDTO createQcHistoryDTO();

	/**
	 * Returns a new object of class '<em>Qc Problem DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qc Problem DTO</em>'.
	 * @generated
	 */
	QcProblemDTO createQcProblemDTO();

	/**
	 * Returns a new object of class '<em>Qc Problem History DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qc Problem History DTO</em>'.
	 * @generated
	 */
	QcProblemHistoryDTO createQcProblemHistoryDTO();

	/**
	 * Returns a new object of class '<em>QC Problem Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QC Problem Type</em>'.
	 * @generated
	 */
	QCProblemType createQCProblemType();

	/**
	 * Returns a new object of class '<em>QC Problem Type Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QC Problem Type Action</em>'.
	 * @generated
	 */
	QCProblemTypeAction createQCProblemTypeAction();

	/**
	 * Returns a new object of class '<em>QC Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QC Type</em>'.
	 * @generated
	 */
	QCType createQCType();

	/**
	 * Returns a new object of class '<em>Refuse Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refuse Consent</em>'.
	 * @generated
	 */
	RefuseConsent createRefuseConsent();

	/**
	 * Returns a new object of class '<em>Refuse Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refuse Consent Response</em>'.
	 * @generated
	 */
	RefuseConsentResponse createRefuseConsentResponse();

	/**
	 * Returns a new object of class '<em>Remove Scan From Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Scan From Consent</em>'.
	 * @generated
	 */
	RemoveScanFromConsent createRemoveScanFromConsent();

	/**
	 * Returns a new object of class '<em>Remove Scan From Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Scan From Consent Response</em>'.
	 * @generated
	 */
	RemoveScanFromConsentResponse createRemoveScanFromConsentResponse();

	/**
	 * Returns a new object of class '<em>Requirements Not Fullfilled Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Not Fullfilled Exception</em>'.
	 * @generated
	 */
	RequirementsNotFullfilledException createRequirementsNotFullfilledException();

	/**
	 * Returns a new object of class '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type</em>'.
	 * @generated
	 */
	ReturnType createReturnType();

	/**
	 * Returns a new object of class '<em>Return Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type1</em>'.
	 * @generated
	 */
	ReturnType1 createReturnType1();

	/**
	 * Returns a new object of class '<em>Return Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type2</em>'.
	 * @generated
	 */
	ReturnType2 createReturnType2();

	/**
	 * Returns a new object of class '<em>Return Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type3</em>'.
	 * @generated
	 */
	ReturnType3 createReturnType3();

	/**
	 * Returns a new object of class '<em>Return Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type4</em>'.
	 * @generated
	 */
	ReturnType4 createReturnType4();

	/**
	 * Returns a new object of class '<em>Return Type5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type5</em>'.
	 * @generated
	 */
	ReturnType5 createReturnType5();

	/**
	 * Returns a new object of class '<em>Return Type6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type6</em>'.
	 * @generated
	 */
	ReturnType6 createReturnType6();

	/**
	 * Returns a new object of class '<em>Return Type7</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type7</em>'.
	 * @generated
	 */
	ReturnType7 createReturnType7();

	/**
	 * Returns a new object of class '<em>Return Type8</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type8</em>'.
	 * @generated
	 */
	ReturnType8 createReturnType8();

	/**
	 * Returns a new object of class '<em>Return Type9</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type9</em>'.
	 * @generated
	 */
	ReturnType9 createReturnType9();

	/**
	 * Returns a new object of class '<em>Return Type10</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type10</em>'.
	 * @generated
	 */
	ReturnType10 createReturnType10();

	/**
	 * Returns a new object of class '<em>Return Type11</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type11</em>'.
	 * @generated
	 */
	ReturnType11 createReturnType11();

	/**
	 * Returns a new object of class '<em>Return Type12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type12</em>'.
	 * @generated
	 */
	ReturnType12 createReturnType12();

	/**
	 * Returns a new object of class '<em>Return Type13</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type13</em>'.
	 * @generated
	 */
	ReturnType13 createReturnType13();

	/**
	 * Returns a new object of class '<em>Return Type14</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type14</em>'.
	 * @generated
	 */
	ReturnType14 createReturnType14();

	/**
	 * Returns a new object of class '<em>Return Type15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type15</em>'.
	 * @generated
	 */
	ReturnType15 createReturnType15();

	/**
	 * Returns a new object of class '<em>Return Type16</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type16</em>'.
	 * @generated
	 */
	ReturnType16 createReturnType16();

	/**
	 * Returns a new object of class '<em>Return Type17</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type17</em>'.
	 * @generated
	 */
	ReturnType17 createReturnType17();

	/**
	 * Returns a new object of class '<em>Return Type18</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type18</em>'.
	 * @generated
	 */
	ReturnType18 createReturnType18();

	/**
	 * Returns a new object of class '<em>Return Type19</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type19</em>'.
	 * @generated
	 */
	ReturnType19 createReturnType19();

	/**
	 * Returns a new object of class '<em>Return Type20</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type20</em>'.
	 * @generated
	 */
	ReturnType20 createReturnType20();

	/**
	 * Returns a new object of class '<em>Return Type21</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type21</em>'.
	 * @generated
	 */
	ReturnType21 createReturnType21();

	/**
	 * Returns a new object of class '<em>Return Type22</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type22</em>'.
	 * @generated
	 */
	ReturnType22 createReturnType22();

	/**
	 * Returns a new object of class '<em>Return Type23</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type23</em>'.
	 * @generated
	 */
	ReturnType23 createReturnType23();

	/**
	 * Returns a new object of class '<em>Set QC For Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set QC For Consent</em>'.
	 * @generated
	 */
	SetQCForConsent createSetQCForConsent();

	/**
	 * Returns a new object of class '<em>Set QC For Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set QC For Consent Response</em>'.
	 * @generated
	 */
	SetQCForConsentResponse createSetQCForConsentResponse();

	/**
	 * Returns a new object of class '<em>Signed Policy DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signed Policy DTO</em>'.
	 * @generated
	 */
	SignedPolicyDTO createSignedPolicyDTO();

	/**
	 * Returns a new object of class '<em>Signer Id DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signer Id DTO</em>'.
	 * @generated
	 */
	SignerIdDTO createSignerIdDTO();

	/**
	 * Returns a new object of class '<em>Signer Id DTO Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signer Id DTO Array</em>'.
	 * @generated
	 */
	SignerIdDTOArray createSignerIdDTOArray();

	/**
	 * Returns a new object of class '<em>Signer Id Type DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signer Id Type DTO</em>'.
	 * @generated
	 */
	SignerIdTypeDTO createSignerIdTypeDTO();

	/**
	 * Returns a new object of class '<em>Unknown Alias Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Alias Exception</em>'.
	 * @generated
	 */
	UnknownAliasException createUnknownAliasException();

	/**
	 * Returns a new object of class '<em>Unknown Consent Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Consent Exception</em>'.
	 * @generated
	 */
	UnknownConsentException createUnknownConsentException();

	/**
	 * Returns a new object of class '<em>Unknown Consent Template Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Consent Template Exception</em>'.
	 * @generated
	 */
	UnknownConsentTemplateException createUnknownConsentTemplateException();

	/**
	 * Returns a new object of class '<em>Unknown Domain Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Domain Exception</em>'.
	 * @generated
	 */
	UnknownDomainException createUnknownDomainException();

	/**
	 * Returns a new object of class '<em>Unknown Fhir Id Object Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Fhir Id Object Exception</em>'.
	 * @generated
	 */
	UnknownFhirIdObjectException createUnknownFhirIdObjectException();

	/**
	 * Returns a new object of class '<em>Unknown ID Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown ID Exception</em>'.
	 * @generated
	 */
	UnknownIDException createUnknownIDException();

	/**
	 * Returns a new object of class '<em>Unknown Module Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Module Exception</em>'.
	 * @generated
	 */
	UnknownModuleException createUnknownModuleException();

	/**
	 * Returns a new object of class '<em>Unknown Policy Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Policy Exception</em>'.
	 * @generated
	 */
	UnknownPolicyException createUnknownPolicyException();

	/**
	 * Returns a new object of class '<em>Unknown Signer Id Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Signer Id Exception</em>'.
	 * @generated
	 */
	UnknownSignerIdException createUnknownSignerIdException();

	/**
	 * Returns a new object of class '<em>Unknown Signer Id Type Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Signer Id Type Exception</em>'.
	 * @generated
	 */
	UnknownSignerIdTypeException createUnknownSignerIdTypeException();

	/**
	 * Returns a new object of class '<em>Update Consent In Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Consent In Use</em>'.
	 * @generated
	 */
	UpdateConsentInUse createUpdateConsentInUse();

	/**
	 * Returns a new object of class '<em>Update Consent In Use Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Consent In Use Response</em>'.
	 * @generated
	 */
	UpdateConsentInUseResponse createUpdateConsentInUseResponse();

	/**
	 * Returns a new object of class '<em>Validate Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Consent</em>'.
	 * @generated
	 */
	ValidateConsent createValidateConsent();

	/**
	 * Returns a new object of class '<em>Validate Consent Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Consent Response</em>'.
	 * @generated
	 */
	ValidateConsentResponse createValidateConsentResponse();

	/**
	 * Returns a new object of class '<em>Valid From Properties DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid From Properties DTO</em>'.
	 * @generated
	 */
	ValidFromPropertiesDTO createValidFromPropertiesDTO();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Cm2Package getCm2Package();

} //Cm2Factory
