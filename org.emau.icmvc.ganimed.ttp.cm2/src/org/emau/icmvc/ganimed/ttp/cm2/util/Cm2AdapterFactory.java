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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emau.icmvc.ganimed.ttp.cm2.AbstractMap;
import org.emau.icmvc.ganimed.ttp.cm2.AddAlias;
import org.emau.icmvc.ganimed.ttp.cm2.AddAliasResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsent;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentTemplate;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentTemplateResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddDomain;
import org.emau.icmvc.ganimed.ttp.cm2.AddDomainResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddModule;
import org.emau.icmvc.ganimed.ttp.cm2.AddModuleResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddPolicy;
import org.emau.icmvc.ganimed.ttp.cm2.AddPolicyResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent;
import org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerIdResponse;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdType;
import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdTypeResponse;
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
import org.emau.icmvc.ganimed.ttp.cm2.DeleteConsentTemplate;
import org.emau.icmvc.ganimed.ttp.cm2.DeleteConsentTemplateResponse;
import org.emau.icmvc.ganimed.ttp.cm2.DeleteDomain;
import org.emau.icmvc.ganimed.ttp.cm2.DeleteDomainResponse;
import org.emau.icmvc.ganimed.ttp.cm2.DeleteModule;
import org.emau.icmvc.ganimed.ttp.cm2.DeleteModuleResponse;
import org.emau.icmvc.ganimed.ttp.cm2.DeletePolicy;
import org.emau.icmvc.ganimed.ttp.cm2.DeletePolicyResponse;
import org.emau.icmvc.ganimed.ttp.cm2.DeleteSignerIdType;
import org.emau.icmvc.ganimed.ttp.cm2.DeleteSignerIdTypeResponse;
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
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseAllForDomain;
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseAllForDomainResponse;
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseDomain;
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseDomainResponse;
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseModule;
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseModuleResponse;
import org.emau.icmvc.ganimed.ttp.cm2.FinalisePolicy;
import org.emau.icmvc.ganimed.ttp.cm2.FinalisePolicyResponse;
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseTemplate;
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseTemplateResponse;
import org.emau.icmvc.ganimed.ttp.cm2.FreeTextConverterStringException;
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
import org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException;
import org.emau.icmvc.ganimed.ttp.cm2.InconsistentStatusException;
import org.emau.icmvc.ganimed.ttp.cm2.InternalException;
import org.emau.icmvc.ganimed.ttp.cm2.InvalidFreeTextException;
import org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException;
import org.emau.icmvc.ganimed.ttp.cm2.InvalidPropertiesException;
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
import org.emau.icmvc.ganimed.ttp.cm2.ObjectInUseException;
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
import org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplate;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateInUse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateInUseResponse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateResponse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateDomain;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUseResponse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainResponse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateModule;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUseResponse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleResponse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicy;
import org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUseResponse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyResponse;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdTypeResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent;
import org.emau.icmvc.ganimed.ttp.cm2.ValidateConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.VersionConverterClassException;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package
 * @generated
 */
public class Cm2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cm2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cm2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Cm2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cm2Switch<Adapter> modelSwitch =
		new Cm2Switch<Adapter>() {
			@Override
			public Adapter caseAbstractMap(AbstractMap object) {
				return createAbstractMapAdapter();
			}
			@Override
			public Adapter caseAddAlias(AddAlias object) {
				return createAddAliasAdapter();
			}
			@Override
			public Adapter caseAddAliasResponse(AddAliasResponse object) {
				return createAddAliasResponseAdapter();
			}
			@Override
			public Adapter caseAddConsent(AddConsent object) {
				return createAddConsentAdapter();
			}
			@Override
			public Adapter caseAddConsentOptOut(AddConsentOptOut object) {
				return createAddConsentOptOutAdapter();
			}
			@Override
			public Adapter caseAddConsentOptOutResponse(AddConsentOptOutResponse object) {
				return createAddConsentOptOutResponseAdapter();
			}
			@Override
			public Adapter caseAddConsentResponse(AddConsentResponse object) {
				return createAddConsentResponseAdapter();
			}
			@Override
			public Adapter caseAddConsentTemplate(AddConsentTemplate object) {
				return createAddConsentTemplateAdapter();
			}
			@Override
			public Adapter caseAddConsentTemplateResponse(AddConsentTemplateResponse object) {
				return createAddConsentTemplateResponseAdapter();
			}
			@Override
			public Adapter caseAddDomain(AddDomain object) {
				return createAddDomainAdapter();
			}
			@Override
			public Adapter caseAddDomainResponse(AddDomainResponse object) {
				return createAddDomainResponseAdapter();
			}
			@Override
			public Adapter caseAddModule(AddModule object) {
				return createAddModuleAdapter();
			}
			@Override
			public Adapter caseAddModuleResponse(AddModuleResponse object) {
				return createAddModuleResponseAdapter();
			}
			@Override
			public Adapter caseAddPolicy(AddPolicy object) {
				return createAddPolicyAdapter();
			}
			@Override
			public Adapter caseAddPolicyResponse(AddPolicyResponse object) {
				return createAddPolicyResponseAdapter();
			}
			@Override
			public Adapter caseAddScanToConsent(AddScanToConsent object) {
				return createAddScanToConsentAdapter();
			}
			@Override
			public Adapter caseAddScanToConsentResponse(AddScanToConsentResponse object) {
				return createAddScanToConsentResponseAdapter();
			}
			@Override
			public Adapter caseAddSignerIdType(AddSignerIdType object) {
				return createAddSignerIdTypeAdapter();
			}
			@Override
			public Adapter caseAddSignerIdTypeResponse(AddSignerIdTypeResponse object) {
				return createAddSignerIdTypeResponseAdapter();
			}
			@Override
			public Adapter caseAddSignerIdToConsent(AddSignerIdToConsent object) {
				return createAddSignerIdToConsentAdapter();
			}
			@Override
			public Adapter caseAddSignerIdToConsentResponse(AddSignerIdToConsentResponse object) {
				return createAddSignerIdToConsentResponseAdapter();
			}
			@Override
			public Adapter caseAddSignerIdToSignerId(AddSignerIdToSignerId object) {
				return createAddSignerIdToSignerIdAdapter();
			}
			@Override
			public Adapter caseAddSignerIdToSignerIdResponse(AddSignerIdToSignerIdResponse object) {
				return createAddSignerIdToSignerIdResponseAdapter();
			}
			@Override
			public Adapter caseAssignedModuleDTO(AssignedModuleDTO object) {
				return createAssignedModuleDTOAdapter();
			}
			@Override
			public Adapter caseAssignedPolicyDTO(AssignedPolicyDTO object) {
				return createAssignedPolicyDTOAdapter();
			}
			@Override
			public Adapter caseChildrenType(ChildrenType object) {
				return createChildrenTypeAdapter();
			}
			@Override
			public Adapter caseConsentDateValuesDTO(ConsentDateValuesDTO object) {
				return createConsentDateValuesDTOAdapter();
			}
			@Override
			public Adapter caseConsentDTO(ConsentDTO object) {
				return createConsentDTOAdapter();
			}
			@Override
			public Adapter caseConsentKeyDTO(ConsentKeyDTO object) {
				return createConsentKeyDTOAdapter();
			}
			@Override
			public Adapter caseConsentLightDTO(ConsentLightDTO object) {
				return createConsentLightDTOAdapter();
			}
			@Override
			public Adapter caseConsentScanDTO(ConsentScanDTO object) {
				return createConsentScanDTOAdapter();
			}
			@Override
			public Adapter caseConsentTemplateDTO(ConsentTemplateDTO object) {
				return createConsentTemplateDTOAdapter();
			}
			@Override
			public Adapter caseConsentTemplateKeyDTO(ConsentTemplateKeyDTO object) {
				return createConsentTemplateKeyDTOAdapter();
			}
			@Override
			public Adapter caseConsentTemplateStructureDTO(ConsentTemplateStructureDTO object) {
				return createConsentTemplateStructureDTOAdapter();
			}
			@Override
			public Adapter caseCountConsentsForDomainWithFilter(CountConsentsForDomainWithFilter object) {
				return createCountConsentsForDomainWithFilterAdapter();
			}
			@Override
			public Adapter caseCountConsentsForDomainWithFilterResponse(CountConsentsForDomainWithFilterResponse object) {
				return createCountConsentsForDomainWithFilterResponseAdapter();
			}
			@Override
			public Adapter caseCountSignedPolicies(CountSignedPolicies object) {
				return createCountSignedPoliciesAdapter();
			}
			@Override
			public Adapter caseCountSignedPoliciesResponse(CountSignedPoliciesResponse object) {
				return createCountSignedPoliciesResponseAdapter();
			}
			@Override
			public Adapter caseDeactivateAlias(DeactivateAlias object) {
				return createDeactivateAliasAdapter();
			}
			@Override
			public Adapter caseDeactivateAliasResponse(DeactivateAliasResponse object) {
				return createDeactivateAliasResponseAdapter();
			}
			@Override
			public Adapter caseDeleteConsentTemplate(DeleteConsentTemplate object) {
				return createDeleteConsentTemplateAdapter();
			}
			@Override
			public Adapter caseDeleteConsentTemplateResponse(DeleteConsentTemplateResponse object) {
				return createDeleteConsentTemplateResponseAdapter();
			}
			@Override
			public Adapter caseDeleteDomain(DeleteDomain object) {
				return createDeleteDomainAdapter();
			}
			@Override
			public Adapter caseDeleteDomainResponse(DeleteDomainResponse object) {
				return createDeleteDomainResponseAdapter();
			}
			@Override
			public Adapter caseDeleteModule(DeleteModule object) {
				return createDeleteModuleAdapter();
			}
			@Override
			public Adapter caseDeleteModuleResponse(DeleteModuleResponse object) {
				return createDeleteModuleResponseAdapter();
			}
			@Override
			public Adapter caseDeletePolicy(DeletePolicy object) {
				return createDeletePolicyAdapter();
			}
			@Override
			public Adapter caseDeletePolicyResponse(DeletePolicyResponse object) {
				return createDeletePolicyResponseAdapter();
			}
			@Override
			public Adapter caseDeleteSignerIdType(DeleteSignerIdType object) {
				return createDeleteSignerIdTypeAdapter();
			}
			@Override
			public Adapter caseDeleteSignerIdTypeResponse(DeleteSignerIdTypeResponse object) {
				return createDeleteSignerIdTypeResponseAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainDTO(DomainDTO object) {
				return createDomainDTOAdapter();
			}
			@Override
			public Adapter caseDuplicateEntryException(DuplicateEntryException object) {
				return createDuplicateEntryExceptionAdapter();
			}
			@Override
			public Adapter caseEntryType(EntryType object) {
				return createEntryTypeAdapter();
			}
			@Override
			public Adapter caseEntryType1(EntryType1 object) {
				return createEntryType1Adapter();
			}
			@Override
			public Adapter caseEntryType2(EntryType2 object) {
				return createEntryType2Adapter();
			}
			@Override
			public Adapter caseEntryType3(EntryType3 object) {
				return createEntryType3Adapter();
			}
			@Override
			public Adapter caseEntryType4(EntryType4 object) {
				return createEntryType4Adapter();
			}
			@Override
			public Adapter caseExpirationPropertiesDTO(ExpirationPropertiesDTO object) {
				return createExpirationPropertiesDTOAdapter();
			}
			@Override
			public Adapter caseFhirIdDTO(FhirIdDTO object) {
				return createFhirIdDTOAdapter();
			}
			@Override
			public Adapter caseFinaliseAllForDomain(FinaliseAllForDomain object) {
				return createFinaliseAllForDomainAdapter();
			}
			@Override
			public Adapter caseFinaliseAllForDomainResponse(FinaliseAllForDomainResponse object) {
				return createFinaliseAllForDomainResponseAdapter();
			}
			@Override
			public Adapter caseFinaliseDomain(FinaliseDomain object) {
				return createFinaliseDomainAdapter();
			}
			@Override
			public Adapter caseFinaliseDomainResponse(FinaliseDomainResponse object) {
				return createFinaliseDomainResponseAdapter();
			}
			@Override
			public Adapter caseFinaliseModule(FinaliseModule object) {
				return createFinaliseModuleAdapter();
			}
			@Override
			public Adapter caseFinaliseModuleResponse(FinaliseModuleResponse object) {
				return createFinaliseModuleResponseAdapter();
			}
			@Override
			public Adapter caseFinalisePolicy(FinalisePolicy object) {
				return createFinalisePolicyAdapter();
			}
			@Override
			public Adapter caseFinalisePolicyResponse(FinalisePolicyResponse object) {
				return createFinalisePolicyResponseAdapter();
			}
			@Override
			public Adapter caseFinaliseTemplate(FinaliseTemplate object) {
				return createFinaliseTemplateAdapter();
			}
			@Override
			public Adapter caseFinaliseTemplateResponse(FinaliseTemplateResponse object) {
				return createFinaliseTemplateResponseAdapter();
			}
			@Override
			public Adapter caseFreeTextConverterStringException(FreeTextConverterStringException object) {
				return createFreeTextConverterStringExceptionAdapter();
			}
			@Override
			public Adapter caseFreeTextDefDTO(FreeTextDefDTO object) {
				return createFreeTextDefDTOAdapter();
			}
			@Override
			public Adapter caseFreeTextValDTO(FreeTextValDTO object) {
				return createFreeTextValDTOAdapter();
			}
			@Override
			public Adapter caseGetAliasesForSignerId(GetAliasesForSignerId object) {
				return createGetAliasesForSignerIdAdapter();
			}
			@Override
			public Adapter caseGetAliasesForSignerIdResponse(GetAliasesForSignerIdResponse object) {
				return createGetAliasesForSignerIdResponseAdapter();
			}
			@Override
			public Adapter caseGetAliasesForSignerIds(GetAliasesForSignerIds object) {
				return createGetAliasesForSignerIdsAdapter();
			}
			@Override
			public Adapter caseGetAliasesForSignerIdsResponse(GetAliasesForSignerIdsResponse object) {
				return createGetAliasesForSignerIdsResponseAdapter();
			}
			@Override
			public Adapter caseGetAllConsentedIdsFor(GetAllConsentedIdsFor object) {
				return createGetAllConsentedIdsForAdapter();
			}
			@Override
			public Adapter caseGetAllConsentedIdsForResponse(GetAllConsentedIdsForResponse object) {
				return createGetAllConsentedIdsForResponseAdapter();
			}
			@Override
			public Adapter caseGetAllConsentsForConsentTemplate(GetAllConsentsForConsentTemplate object) {
				return createGetAllConsentsForConsentTemplateAdapter();
			}
			@Override
			public Adapter caseGetAllConsentsForConsentTemplateResponse(GetAllConsentsForConsentTemplateResponse object) {
				return createGetAllConsentsForConsentTemplateResponseAdapter();
			}
			@Override
			public Adapter caseGetAllConsentsForDomain(GetAllConsentsForDomain object) {
				return createGetAllConsentsForDomainAdapter();
			}
			@Override
			public Adapter caseGetAllConsentsForDomainResponse(GetAllConsentsForDomainResponse object) {
				return createGetAllConsentsForDomainResponseAdapter();
			}
			@Override
			public Adapter caseGetAllConsentsForDomainWithoutScan(GetAllConsentsForDomainWithoutScan object) {
				return createGetAllConsentsForDomainWithoutScanAdapter();
			}
			@Override
			public Adapter caseGetAllConsentsForDomainWithoutScanResponse(GetAllConsentsForDomainWithoutScanResponse object) {
				return createGetAllConsentsForDomainWithoutScanResponseAdapter();
			}
			@Override
			public Adapter caseGetAllConsentsForSignerIds(GetAllConsentsForSignerIds object) {
				return createGetAllConsentsForSignerIdsAdapter();
			}
			@Override
			public Adapter caseGetAllConsentsForSignerIdsResponse(GetAllConsentsForSignerIdsResponse object) {
				return createGetAllConsentsForSignerIdsResponseAdapter();
			}
			@Override
			public Adapter caseGetAllIdsForSignerIdType(GetAllIdsForSignerIdType object) {
				return createGetAllIdsForSignerIdTypeAdapter();
			}
			@Override
			public Adapter caseGetAllIdsForSignerIdTypeResponse(GetAllIdsForSignerIdTypeResponse object) {
				return createGetAllIdsForSignerIdTypeResponseAdapter();
			}
			@Override
			public Adapter caseGetConsent(GetConsent object) {
				return createGetConsentAdapter();
			}
			@Override
			public Adapter caseGetConsentDates(GetConsentDates object) {
				return createGetConsentDatesAdapter();
			}
			@Override
			public Adapter caseGetConsentDatesResponse(GetConsentDatesResponse object) {
				return createGetConsentDatesResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentLight(GetConsentLight object) {
				return createGetConsentLightAdapter();
			}
			@Override
			public Adapter caseGetConsentLightResponse(GetConsentLightResponse object) {
				return createGetConsentLightResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentResponse(GetConsentResponse object) {
				return createGetConsentResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentsForDomainPaginated(GetConsentsForDomainPaginated object) {
				return createGetConsentsForDomainPaginatedAdapter();
			}
			@Override
			public Adapter caseGetConsentsForDomainPaginatedResponse(GetConsentsForDomainPaginatedResponse object) {
				return createGetConsentsForDomainPaginatedResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusType(GetConsentStatusType object) {
				return createGetConsentStatusTypeAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeFromExcludingToExcluding(GetConsentStatusTypeFromExcludingToExcluding object) {
				return createGetConsentStatusTypeFromExcludingToExcludingAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeFromExcludingToExcludingResponse(GetConsentStatusTypeFromExcludingToExcludingResponse object) {
				return createGetConsentStatusTypeFromExcludingToExcludingResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeFromExcludingToIncluding(GetConsentStatusTypeFromExcludingToIncluding object) {
				return createGetConsentStatusTypeFromExcludingToIncludingAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeFromExcludingToIncludingResponse(GetConsentStatusTypeFromExcludingToIncludingResponse object) {
				return createGetConsentStatusTypeFromExcludingToIncludingResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeFromIncludingToExcluding(GetConsentStatusTypeFromIncludingToExcluding object) {
				return createGetConsentStatusTypeFromIncludingToExcludingAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeFromIncludingToExcludingResponse(GetConsentStatusTypeFromIncludingToExcludingResponse object) {
				return createGetConsentStatusTypeFromIncludingToExcludingResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeFromIncludingToIncluding(GetConsentStatusTypeFromIncludingToIncluding object) {
				return createGetConsentStatusTypeFromIncludingToIncludingAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeFromIncludingToIncludingResponse(GetConsentStatusTypeFromIncludingToIncludingResponse object) {
				return createGetConsentStatusTypeFromIncludingToIncludingResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentStatusTypeResponse(GetConsentStatusTypeResponse object) {
				return createGetConsentStatusTypeResponseAdapter();
			}
			@Override
			public Adapter caseGetConsentTemplate(GetConsentTemplate object) {
				return createGetConsentTemplateAdapter();
			}
			@Override
			public Adapter caseGetConsentTemplateResponse(GetConsentTemplateResponse object) {
				return createGetConsentTemplateResponseAdapter();
			}
			@Override
			public Adapter caseGetCurrentConsentForSignerIdsAndCT(GetCurrentConsentForSignerIdsAndCT object) {
				return createGetCurrentConsentForSignerIdsAndCTAdapter();
			}
			@Override
			public Adapter caseGetCurrentConsentForSignerIdsAndCTResponse(GetCurrentConsentForSignerIdsAndCTResponse object) {
				return createGetCurrentConsentForSignerIdsAndCTResponseAdapter();
			}
			@Override
			public Adapter caseGetCurrentConsentTemplate(GetCurrentConsentTemplate object) {
				return createGetCurrentConsentTemplateAdapter();
			}
			@Override
			public Adapter caseGetCurrentConsentTemplateResponse(GetCurrentConsentTemplateResponse object) {
				return createGetCurrentConsentTemplateResponseAdapter();
			}
			@Override
			public Adapter caseGetCurrentPolicyStatesForSignerIds(GetCurrentPolicyStatesForSignerIds object) {
				return createGetCurrentPolicyStatesForSignerIdsAdapter();
			}
			@Override
			public Adapter caseGetCurrentPolicyStatesForSignerIdsResponse(GetCurrentPolicyStatesForSignerIdsResponse object) {
				return createGetCurrentPolicyStatesForSignerIdsResponseAdapter();
			}
			@Override
			public Adapter caseGetDomain(GetDomain object) {
				return createGetDomainAdapter();
			}
			@Override
			public Adapter caseGetDomainResponse(GetDomainResponse object) {
				return createGetDomainResponseAdapter();
			}
			@Override
			public Adapter caseGetMappedTemplatesForSignerId(GetMappedTemplatesForSignerId object) {
				return createGetMappedTemplatesForSignerIdAdapter();
			}
			@Override
			public Adapter caseGetMappedTemplatesForSignerIdResponse(GetMappedTemplatesForSignerIdResponse object) {
				return createGetMappedTemplatesForSignerIdResponseAdapter();
			}
			@Override
			public Adapter caseGetModule(GetModule object) {
				return createGetModuleAdapter();
			}
			@Override
			public Adapter caseGetModuleResponse(GetModuleResponse object) {
				return createGetModuleResponseAdapter();
			}
			@Override
			public Adapter caseGetObjectByFhirID(GetObjectByFhirID object) {
				return createGetObjectByFhirIDAdapter();
			}
			@Override
			public Adapter caseGetObjectByFhirIDResponse(GetObjectByFhirIDResponse object) {
				return createGetObjectByFhirIDResponseAdapter();
			}
			@Override
			public Adapter caseGetPolicy(GetPolicy object) {
				return createGetPolicyAdapter();
			}
			@Override
			public Adapter caseGetPolicyResponse(GetPolicyResponse object) {
				return createGetPolicyResponseAdapter();
			}
			@Override
			public Adapter caseGetPolicyStatesForPolicyAndSignerIds(GetPolicyStatesForPolicyAndSignerIds object) {
				return createGetPolicyStatesForPolicyAndSignerIdsAdapter();
			}
			@Override
			public Adapter caseGetPolicyStatesForPolicyAndSignerIdsResponse(GetPolicyStatesForPolicyAndSignerIdsResponse object) {
				return createGetPolicyStatesForPolicyAndSignerIdsResponseAdapter();
			}
			@Override
			public Adapter caseGetPolicyStatesForPolicyNameAndSignerIds(GetPolicyStatesForPolicyNameAndSignerIds object) {
				return createGetPolicyStatesForPolicyNameAndSignerIdsAdapter();
			}
			@Override
			public Adapter caseGetPolicyStatesForPolicyNameAndSignerIdsResponse(GetPolicyStatesForPolicyNameAndSignerIdsResponse object) {
				return createGetPolicyStatesForPolicyNameAndSignerIdsResponseAdapter();
			}
			@Override
			public Adapter caseGetPolicyStatesForSignerIds(GetPolicyStatesForSignerIds object) {
				return createGetPolicyStatesForSignerIdsAdapter();
			}
			@Override
			public Adapter caseGetPolicyStatesForSignerIdsResponse(GetPolicyStatesForSignerIdsResponse object) {
				return createGetPolicyStatesForSignerIdsResponseAdapter();
			}
			@Override
			public Adapter caseGetQCHistoryForConsent(GetQCHistoryForConsent object) {
				return createGetQCHistoryForConsentAdapter();
			}
			@Override
			public Adapter caseGetQCHistoryForConsentResponse(GetQCHistoryForConsentResponse object) {
				return createGetQCHistoryForConsentResponseAdapter();
			}
			@Override
			public Adapter caseGetQCProblemHistoryForQCProblem(GetQCProblemHistoryForQCProblem object) {
				return createGetQCProblemHistoryForQCProblemAdapter();
			}
			@Override
			public Adapter caseGetQCProblemHistoryForQCProblemResponse(GetQCProblemHistoryForQCProblemResponse object) {
				return createGetQCProblemHistoryForQCProblemResponseAdapter();
			}
			@Override
			public Adapter caseGetSignerIdsForAlias(GetSignerIdsForAlias object) {
				return createGetSignerIdsForAliasAdapter();
			}
			@Override
			public Adapter caseGetSignerIdsForAliasResponse(GetSignerIdsForAliasResponse object) {
				return createGetSignerIdsForAliasResponseAdapter();
			}
			@Override
			public Adapter caseGetSignerIdType(GetSignerIdType object) {
				return createGetSignerIdTypeAdapter();
			}
			@Override
			public Adapter caseGetSignerIdTypeResponse(GetSignerIdTypeResponse object) {
				return createGetSignerIdTypeResponseAdapter();
			}
			@Override
			public Adapter caseGetTemplatesWithPolicies(GetTemplatesWithPolicies object) {
				return createGetTemplatesWithPoliciesAdapter();
			}
			@Override
			public Adapter caseGetTemplatesWithPoliciesResponse(GetTemplatesWithPoliciesResponse object) {
				return createGetTemplatesWithPoliciesResponseAdapter();
			}
			@Override
			public Adapter caseHashMap(HashMap object) {
				return createHashMapAdapter();
			}
			@Override
			public Adapter caseIllegalArgumentException(org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException object) {
				return createIllegalArgumentExceptionAdapter();
			}
			@Override
			public Adapter caseInconsistentStatusException(InconsistentStatusException object) {
				return createInconsistentStatusExceptionAdapter();
			}
			@Override
			public Adapter caseInternalException(InternalException object) {
				return createInternalExceptionAdapter();
			}
			@Override
			public Adapter caseIllegalCompositionException(IllegalCompositionException object) {
				return createIllegalCompositionExceptionAdapter();
			}
			@Override
			public Adapter caseInvalidFreeTextException(InvalidFreeTextException object) {
				return createInvalidFreeTextExceptionAdapter();
			}
			@Override
			public Adapter caseInvalidParameterException(InvalidParameterException object) {
				return createInvalidParameterExceptionAdapter();
			}
			@Override
			public Adapter caseInvalidPropertiesException(InvalidPropertiesException object) {
				return createInvalidPropertiesExceptionAdapter();
			}
			@Override
			public Adapter caseInvalidVersionException(InvalidVersionException object) {
				return createInvalidVersionExceptionAdapter();
			}
			@Override
			public Adapter caseIsConsented(IsConsented object) {
				return createIsConsentedAdapter();
			}
			@Override
			public Adapter caseIsConsentedFromExcludingToExcluding(IsConsentedFromExcludingToExcluding object) {
				return createIsConsentedFromExcludingToExcludingAdapter();
			}
			@Override
			public Adapter caseIsConsentedFromExcludingToExcludingResponse(IsConsentedFromExcludingToExcludingResponse object) {
				return createIsConsentedFromExcludingToExcludingResponseAdapter();
			}
			@Override
			public Adapter caseIsConsentedFromExcludingToIncluding(IsConsentedFromExcludingToIncluding object) {
				return createIsConsentedFromExcludingToIncludingAdapter();
			}
			@Override
			public Adapter caseIsConsentedFromExcludingToIncludingResponse(IsConsentedFromExcludingToIncludingResponse object) {
				return createIsConsentedFromExcludingToIncludingResponseAdapter();
			}
			@Override
			public Adapter caseIsConsentedFromIncludingToExcluding(IsConsentedFromIncludingToExcluding object) {
				return createIsConsentedFromIncludingToExcludingAdapter();
			}
			@Override
			public Adapter caseIsConsentedFromIncludingToExcludingResponse(IsConsentedFromIncludingToExcludingResponse object) {
				return createIsConsentedFromIncludingToExcludingResponseAdapter();
			}
			@Override
			public Adapter caseIsConsentedFromIncludingToIncluding(IsConsentedFromIncludingToIncluding object) {
				return createIsConsentedFromIncludingToIncludingAdapter();
			}
			@Override
			public Adapter caseIsConsentedFromIncludingToIncludingResponse(IsConsentedFromIncludingToIncludingResponse object) {
				return createIsConsentedFromIncludingToIncludingResponseAdapter();
			}
			@Override
			public Adapter caseIsConsentedResponse(IsConsentedResponse object) {
				return createIsConsentedResponseAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseListConsentTemplates(ListConsentTemplates object) {
				return createListConsentTemplatesAdapter();
			}
			@Override
			public Adapter caseListConsentTemplatesResponse(ListConsentTemplatesResponse object) {
				return createListConsentTemplatesResponseAdapter();
			}
			@Override
			public Adapter caseListCurrentConsentTemplates(ListCurrentConsentTemplates object) {
				return createListCurrentConsentTemplatesAdapter();
			}
			@Override
			public Adapter caseListCurrentConsentTemplatesResponse(ListCurrentConsentTemplatesResponse object) {
				return createListCurrentConsentTemplatesResponseAdapter();
			}
			@Override
			public Adapter caseListDomains(ListDomains object) {
				return createListDomainsAdapter();
			}
			@Override
			public Adapter caseListDomainsResponse(ListDomainsResponse object) {
				return createListDomainsResponseAdapter();
			}
			@Override
			public Adapter caseListModules(ListModules object) {
				return createListModulesAdapter();
			}
			@Override
			public Adapter caseListModulesResponse(ListModulesResponse object) {
				return createListModulesResponseAdapter();
			}
			@Override
			public Adapter caseListPolicies(ListPolicies object) {
				return createListPoliciesAdapter();
			}
			@Override
			public Adapter caseListPoliciesResponse(ListPoliciesResponse object) {
				return createListPoliciesResponseAdapter();
			}
			@Override
			public Adapter caseListSignerIdTypes(ListSignerIdTypes object) {
				return createListSignerIdTypesAdapter();
			}
			@Override
			public Adapter caseListSignerIdTypesResponse(ListSignerIdTypesResponse object) {
				return createListSignerIdTypesResponseAdapter();
			}
			@Override
			public Adapter caseMandatoryFieldsException(MandatoryFieldsException object) {
				return createMandatoryFieldsExceptionAdapter();
			}
			@Override
			public Adapter caseMissingRequiredObjectException(MissingRequiredObjectException object) {
				return createMissingRequiredObjectExceptionAdapter();
			}
			@Override
			public Adapter caseModuleDTO(ModuleDTO object) {
				return createModuleDTOAdapter();
			}
			@Override
			public Adapter caseModuleExpirationsType(ModuleExpirationsType object) {
				return createModuleExpirationsTypeAdapter();
			}
			@Override
			public Adapter caseModuleKeyDTO(ModuleKeyDTO object) {
				return createModuleKeyDTOAdapter();
			}
			@Override
			public Adapter caseModuleKeyDTOArray(ModuleKeyDTOArray object) {
				return createModuleKeyDTOArrayAdapter();
			}
			@Override
			public Adapter caseModuleStateDTO(ModuleStateDTO object) {
				return createModuleStateDTOAdapter();
			}
			@Override
			public Adapter caseModuleStatesType(ModuleStatesType object) {
				return createModuleStatesTypeAdapter();
			}
			@Override
			public Adapter caseObjectInUseException(ObjectInUseException object) {
				return createObjectInUseExceptionAdapter();
			}
			@Override
			public Adapter casePolicyDTO(PolicyDTO object) {
				return createPolicyDTOAdapter();
			}
			@Override
			public Adapter casePolicyExpirationsType(PolicyExpirationsType object) {
				return createPolicyExpirationsTypeAdapter();
			}
			@Override
			public Adapter casePolicyKeyDTO(PolicyKeyDTO object) {
				return createPolicyKeyDTOAdapter();
			}
			@Override
			public Adapter caseQcdto(Qcdto object) {
				return createQcdtoAdapter();
			}
			@Override
			public Adapter caseQcHistoryDTO(QcHistoryDTO object) {
				return createQcHistoryDTOAdapter();
			}
			@Override
			public Adapter caseQcProblemDTO(QcProblemDTO object) {
				return createQcProblemDTOAdapter();
			}
			@Override
			public Adapter caseQcProblemHistoryDTO(QcProblemHistoryDTO object) {
				return createQcProblemHistoryDTOAdapter();
			}
			@Override
			public Adapter caseQCProblemType(QCProblemType object) {
				return createQCProblemTypeAdapter();
			}
			@Override
			public Adapter caseQCProblemTypeAction(QCProblemTypeAction object) {
				return createQCProblemTypeActionAdapter();
			}
			@Override
			public Adapter caseQCType(QCType object) {
				return createQCTypeAdapter();
			}
			@Override
			public Adapter caseRefuseConsent(RefuseConsent object) {
				return createRefuseConsentAdapter();
			}
			@Override
			public Adapter caseRefuseConsentResponse(RefuseConsentResponse object) {
				return createRefuseConsentResponseAdapter();
			}
			@Override
			public Adapter caseRemoveScanFromConsent(RemoveScanFromConsent object) {
				return createRemoveScanFromConsentAdapter();
			}
			@Override
			public Adapter caseRemoveScanFromConsentResponse(RemoveScanFromConsentResponse object) {
				return createRemoveScanFromConsentResponseAdapter();
			}
			@Override
			public Adapter caseRequirementsNotFullfilledException(RequirementsNotFullfilledException object) {
				return createRequirementsNotFullfilledExceptionAdapter();
			}
			@Override
			public Adapter caseReturnType(ReturnType object) {
				return createReturnTypeAdapter();
			}
			@Override
			public Adapter caseReturnType1(ReturnType1 object) {
				return createReturnType1Adapter();
			}
			@Override
			public Adapter caseReturnType2(ReturnType2 object) {
				return createReturnType2Adapter();
			}
			@Override
			public Adapter caseReturnType3(ReturnType3 object) {
				return createReturnType3Adapter();
			}
			@Override
			public Adapter caseReturnType4(ReturnType4 object) {
				return createReturnType4Adapter();
			}
			@Override
			public Adapter caseReturnType5(ReturnType5 object) {
				return createReturnType5Adapter();
			}
			@Override
			public Adapter caseReturnType6(ReturnType6 object) {
				return createReturnType6Adapter();
			}
			@Override
			public Adapter caseReturnType7(ReturnType7 object) {
				return createReturnType7Adapter();
			}
			@Override
			public Adapter caseReturnType8(ReturnType8 object) {
				return createReturnType8Adapter();
			}
			@Override
			public Adapter caseReturnType9(ReturnType9 object) {
				return createReturnType9Adapter();
			}
			@Override
			public Adapter caseReturnType10(ReturnType10 object) {
				return createReturnType10Adapter();
			}
			@Override
			public Adapter caseReturnType11(ReturnType11 object) {
				return createReturnType11Adapter();
			}
			@Override
			public Adapter caseReturnType12(ReturnType12 object) {
				return createReturnType12Adapter();
			}
			@Override
			public Adapter caseReturnType13(ReturnType13 object) {
				return createReturnType13Adapter();
			}
			@Override
			public Adapter caseReturnType14(ReturnType14 object) {
				return createReturnType14Adapter();
			}
			@Override
			public Adapter caseReturnType15(ReturnType15 object) {
				return createReturnType15Adapter();
			}
			@Override
			public Adapter caseReturnType16(ReturnType16 object) {
				return createReturnType16Adapter();
			}
			@Override
			public Adapter caseReturnType17(ReturnType17 object) {
				return createReturnType17Adapter();
			}
			@Override
			public Adapter caseReturnType18(ReturnType18 object) {
				return createReturnType18Adapter();
			}
			@Override
			public Adapter caseReturnType19(ReturnType19 object) {
				return createReturnType19Adapter();
			}
			@Override
			public Adapter caseReturnType20(ReturnType20 object) {
				return createReturnType20Adapter();
			}
			@Override
			public Adapter caseReturnType21(ReturnType21 object) {
				return createReturnType21Adapter();
			}
			@Override
			public Adapter caseReturnType22(ReturnType22 object) {
				return createReturnType22Adapter();
			}
			@Override
			public Adapter caseReturnType23(ReturnType23 object) {
				return createReturnType23Adapter();
			}
			@Override
			public Adapter caseSetQCForConsent(SetQCForConsent object) {
				return createSetQCForConsentAdapter();
			}
			@Override
			public Adapter caseSetQCForConsentResponse(SetQCForConsentResponse object) {
				return createSetQCForConsentResponseAdapter();
			}
			@Override
			public Adapter caseSignedPolicyDTO(SignedPolicyDTO object) {
				return createSignedPolicyDTOAdapter();
			}
			@Override
			public Adapter caseSignerIdDTO(SignerIdDTO object) {
				return createSignerIdDTOAdapter();
			}
			@Override
			public Adapter caseSignerIdDTOArray(SignerIdDTOArray object) {
				return createSignerIdDTOArrayAdapter();
			}
			@Override
			public Adapter caseSignerIdTypeDTO(SignerIdTypeDTO object) {
				return createSignerIdTypeDTOAdapter();
			}
			@Override
			public Adapter caseUnknownAliasException(UnknownAliasException object) {
				return createUnknownAliasExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownConsentException(UnknownConsentException object) {
				return createUnknownConsentExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownConsentTemplateException(UnknownConsentTemplateException object) {
				return createUnknownConsentTemplateExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownDomainException(UnknownDomainException object) {
				return createUnknownDomainExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownFhirIdObjectException(UnknownFhirIdObjectException object) {
				return createUnknownFhirIdObjectExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownIDException(UnknownIDException object) {
				return createUnknownIDExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownModuleException(UnknownModuleException object) {
				return createUnknownModuleExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownPolicyException(UnknownPolicyException object) {
				return createUnknownPolicyExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownSignerIdException(UnknownSignerIdException object) {
				return createUnknownSignerIdExceptionAdapter();
			}
			@Override
			public Adapter caseUnknownSignerIdTypeException(UnknownSignerIdTypeException object) {
				return createUnknownSignerIdTypeExceptionAdapter();
			}
			@Override
			public Adapter caseUpdateConsentInUse(UpdateConsentInUse object) {
				return createUpdateConsentInUseAdapter();
			}
			@Override
			public Adapter caseUpdateConsentInUseResponse(UpdateConsentInUseResponse object) {
				return createUpdateConsentInUseResponseAdapter();
			}
			@Override
			public Adapter caseUpdateConsentTemplate(UpdateConsentTemplate object) {
				return createUpdateConsentTemplateAdapter();
			}
			@Override
			public Adapter caseUpdateConsentTemplateInUse(UpdateConsentTemplateInUse object) {
				return createUpdateConsentTemplateInUseAdapter();
			}
			@Override
			public Adapter caseUpdateConsentTemplateInUseResponse(UpdateConsentTemplateInUseResponse object) {
				return createUpdateConsentTemplateInUseResponseAdapter();
			}
			@Override
			public Adapter caseUpdateConsentTemplateResponse(UpdateConsentTemplateResponse object) {
				return createUpdateConsentTemplateResponseAdapter();
			}
			@Override
			public Adapter caseUpdateDomain(UpdateDomain object) {
				return createUpdateDomainAdapter();
			}
			@Override
			public Adapter caseUpdateDomainInUse(UpdateDomainInUse object) {
				return createUpdateDomainInUseAdapter();
			}
			@Override
			public Adapter caseUpdateDomainInUseResponse(UpdateDomainInUseResponse object) {
				return createUpdateDomainInUseResponseAdapter();
			}
			@Override
			public Adapter caseUpdateDomainResponse(UpdateDomainResponse object) {
				return createUpdateDomainResponseAdapter();
			}
			@Override
			public Adapter caseUpdateModule(UpdateModule object) {
				return createUpdateModuleAdapter();
			}
			@Override
			public Adapter caseUpdateModuleInUse(UpdateModuleInUse object) {
				return createUpdateModuleInUseAdapter();
			}
			@Override
			public Adapter caseUpdateModuleInUseResponse(UpdateModuleInUseResponse object) {
				return createUpdateModuleInUseResponseAdapter();
			}
			@Override
			public Adapter caseUpdateModuleResponse(UpdateModuleResponse object) {
				return createUpdateModuleResponseAdapter();
			}
			@Override
			public Adapter caseUpdatePolicy(UpdatePolicy object) {
				return createUpdatePolicyAdapter();
			}
			@Override
			public Adapter caseUpdatePolicyInUse(UpdatePolicyInUse object) {
				return createUpdatePolicyInUseAdapter();
			}
			@Override
			public Adapter caseUpdatePolicyInUseResponse(UpdatePolicyInUseResponse object) {
				return createUpdatePolicyInUseResponseAdapter();
			}
			@Override
			public Adapter caseUpdatePolicyResponse(UpdatePolicyResponse object) {
				return createUpdatePolicyResponseAdapter();
			}
			@Override
			public Adapter caseUpdateSignerIdType(UpdateSignerIdType object) {
				return createUpdateSignerIdTypeAdapter();
			}
			@Override
			public Adapter caseUpdateSignerIdTypeResponse(UpdateSignerIdTypeResponse object) {
				return createUpdateSignerIdTypeResponseAdapter();
			}
			@Override
			public Adapter caseValidateConsent(ValidateConsent object) {
				return createValidateConsentAdapter();
			}
			@Override
			public Adapter caseValidateConsentResponse(ValidateConsentResponse object) {
				return createValidateConsentResponseAdapter();
			}
			@Override
			public Adapter caseValidFromPropertiesDTO(ValidFromPropertiesDTO object) {
				return createValidFromPropertiesDTOAdapter();
			}
			@Override
			public Adapter caseVersionConverterClassException(VersionConverterClassException object) {
				return createVersionConverterClassExceptionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AbstractMap <em>Abstract Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AbstractMap
	 * @generated
	 */
	public Adapter createAbstractMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddAlias <em>Add Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddAlias
	 * @generated
	 */
	public Adapter createAddAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddAliasResponse <em>Add Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddAliasResponse
	 * @generated
	 */
	public Adapter createAddAliasResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsent <em>Add Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsent
	 * @generated
	 */
	public Adapter createAddConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut <em>Add Consent Opt Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOut
	 * @generated
	 */
	public Adapter createAddConsentOptOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse <em>Add Consent Opt Out Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse
	 * @generated
	 */
	public Adapter createAddConsentOptOutResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentResponse <em>Add Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentResponse
	 * @generated
	 */
	public Adapter createAddConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentTemplate <em>Add Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentTemplate
	 * @generated
	 */
	public Adapter createAddConsentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentTemplateResponse <em>Add Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddConsentTemplateResponse
	 * @generated
	 */
	public Adapter createAddConsentTemplateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddDomain <em>Add Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddDomain
	 * @generated
	 */
	public Adapter createAddDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddDomainResponse <em>Add Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddDomainResponse
	 * @generated
	 */
	public Adapter createAddDomainResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddModule <em>Add Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddModule
	 * @generated
	 */
	public Adapter createAddModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddModuleResponse <em>Add Module Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddModuleResponse
	 * @generated
	 */
	public Adapter createAddModuleResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddPolicy <em>Add Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddPolicy
	 * @generated
	 */
	public Adapter createAddPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddPolicyResponse <em>Add Policy Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddPolicyResponse
	 * @generated
	 */
	public Adapter createAddPolicyResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent <em>Add Scan To Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent
	 * @generated
	 */
	public Adapter createAddScanToConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsentResponse <em>Add Scan To Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsentResponse
	 * @generated
	 */
	public Adapter createAddScanToConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdType <em>Add Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdType
	 * @generated
	 */
	public Adapter createAddSignerIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdTypeResponse <em>Add Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdTypeResponse
	 * @generated
	 */
	public Adapter createAddSignerIdTypeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent <em>Add Signer Id To Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent
	 * @generated
	 */
	public Adapter createAddSignerIdToConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsentResponse <em>Add Signer Id To Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsentResponse
	 * @generated
	 */
	public Adapter createAddSignerIdToConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId <em>Add Signer Id To Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId
	 * @generated
	 */
	public Adapter createAddSignerIdToSignerIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerIdResponse <em>Add Signer Id To Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerIdResponse
	 * @generated
	 */
	public Adapter createAddSignerIdToSignerIdResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO <em>Assigned Module DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO
	 * @generated
	 */
	public Adapter createAssignedModuleDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO <em>Assigned Policy DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO
	 * @generated
	 */
	public Adapter createAssignedPolicyDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ChildrenType <em>Children Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ChildrenType
	 * @generated
	 */
	public Adapter createChildrenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO <em>Consent Date Values DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO
	 * @generated
	 */
	public Adapter createConsentDateValuesDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO <em>Consent DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO
	 * @generated
	 */
	public Adapter createConsentDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO <em>Consent Key DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO
	 * @generated
	 */
	public Adapter createConsentKeyDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO <em>Consent Light DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO
	 * @generated
	 */
	public Adapter createConsentLightDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO <em>Consent Scan DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO
	 * @generated
	 */
	public Adapter createConsentScanDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO <em>Consent Template DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO
	 * @generated
	 */
	public Adapter createConsentTemplateDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO <em>Consent Template Key DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO
	 * @generated
	 */
	public Adapter createConsentTemplateKeyDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO <em>Consent Template Structure DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO
	 * @generated
	 */
	public Adapter createConsentTemplateStructureDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter <em>Count Consents For Domain With Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilter
	 * @generated
	 */
	public Adapter createCountConsentsForDomainWithFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse <em>Count Consents For Domain With Filter Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse
	 * @generated
	 */
	public Adapter createCountConsentsForDomainWithFilterResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.CountSignedPolicies <em>Count Signed Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountSignedPolicies
	 * @generated
	 */
	public Adapter createCountSignedPoliciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.CountSignedPoliciesResponse <em>Count Signed Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.CountSignedPoliciesResponse
	 * @generated
	 */
	public Adapter createCountSignedPoliciesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias <em>Deactivate Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias
	 * @generated
	 */
	public Adapter createDeactivateAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeactivateAliasResponse <em>Deactivate Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeactivateAliasResponse
	 * @generated
	 */
	public Adapter createDeactivateAliasResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteConsentTemplate <em>Delete Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeleteConsentTemplate
	 * @generated
	 */
	public Adapter createDeleteConsentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteConsentTemplateResponse <em>Delete Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeleteConsentTemplateResponse
	 * @generated
	 */
	public Adapter createDeleteConsentTemplateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteDomain <em>Delete Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeleteDomain
	 * @generated
	 */
	public Adapter createDeleteDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteDomainResponse <em>Delete Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeleteDomainResponse
	 * @generated
	 */
	public Adapter createDeleteDomainResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteModule <em>Delete Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeleteModule
	 * @generated
	 */
	public Adapter createDeleteModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteModuleResponse <em>Delete Module Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeleteModuleResponse
	 * @generated
	 */
	public Adapter createDeleteModuleResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeletePolicy <em>Delete Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeletePolicy
	 * @generated
	 */
	public Adapter createDeletePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeletePolicyResponse <em>Delete Policy Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeletePolicyResponse
	 * @generated
	 */
	public Adapter createDeletePolicyResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteSignerIdType <em>Delete Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeleteSignerIdType
	 * @generated
	 */
	public Adapter createDeleteSignerIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteSignerIdTypeResponse <em>Delete Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DeleteSignerIdTypeResponse
	 * @generated
	 */
	public Adapter createDeleteSignerIdTypeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DomainDTO <em>Domain DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DomainDTO
	 * @generated
	 */
	public Adapter createDomainDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.DuplicateEntryException <em>Duplicate Entry Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.DuplicateEntryException
	 * @generated
	 */
	public Adapter createDuplicateEntryExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType1 <em>Entry Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType1
	 * @generated
	 */
	public Adapter createEntryType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType2 <em>Entry Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType2
	 * @generated
	 */
	public Adapter createEntryType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType3 <em>Entry Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType3
	 * @generated
	 */
	public Adapter createEntryType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType4 <em>Entry Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.EntryType4
	 * @generated
	 */
	public Adapter createEntryType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO <em>Expiration Properties DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO
	 * @generated
	 */
	public Adapter createExpirationPropertiesDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO <em>Fhir Id DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO
	 * @generated
	 */
	public Adapter createFhirIdDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinaliseAllForDomain <em>Finalise All For Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinaliseAllForDomain
	 * @generated
	 */
	public Adapter createFinaliseAllForDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinaliseAllForDomainResponse <em>Finalise All For Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinaliseAllForDomainResponse
	 * @generated
	 */
	public Adapter createFinaliseAllForDomainResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinaliseDomain <em>Finalise Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinaliseDomain
	 * @generated
	 */
	public Adapter createFinaliseDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinaliseDomainResponse <em>Finalise Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinaliseDomainResponse
	 * @generated
	 */
	public Adapter createFinaliseDomainResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinaliseModule <em>Finalise Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinaliseModule
	 * @generated
	 */
	public Adapter createFinaliseModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinaliseModuleResponse <em>Finalise Module Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinaliseModuleResponse
	 * @generated
	 */
	public Adapter createFinaliseModuleResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinalisePolicy <em>Finalise Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinalisePolicy
	 * @generated
	 */
	public Adapter createFinalisePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinalisePolicyResponse <em>Finalise Policy Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinalisePolicyResponse
	 * @generated
	 */
	public Adapter createFinalisePolicyResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinaliseTemplate <em>Finalise Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinaliseTemplate
	 * @generated
	 */
	public Adapter createFinaliseTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FinaliseTemplateResponse <em>Finalise Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FinaliseTemplateResponse
	 * @generated
	 */
	public Adapter createFinaliseTemplateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextConverterStringException <em>Free Text Converter String Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextConverterStringException
	 * @generated
	 */
	public Adapter createFreeTextConverterStringExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO <em>Free Text Def DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO
	 * @generated
	 */
	public Adapter createFreeTextDefDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO <em>Free Text Val DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO
	 * @generated
	 */
	public Adapter createFreeTextValDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId <em>Get Aliases For Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId
	 * @generated
	 */
	public Adapter createGetAliasesForSignerIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdResponse <em>Get Aliases For Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdResponse
	 * @generated
	 */
	public Adapter createGetAliasesForSignerIdResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds <em>Get Aliases For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds
	 * @generated
	 */
	public Adapter createGetAliasesForSignerIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse <em>Get Aliases For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse
	 * @generated
	 */
	public Adapter createGetAliasesForSignerIdsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor <em>Get All Consented Ids For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor
	 * @generated
	 */
	public Adapter createGetAllConsentedIdsForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse <em>Get All Consented Ids For Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse
	 * @generated
	 */
	public Adapter createGetAllConsentedIdsForResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplate <em>Get All Consents For Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplate
	 * @generated
	 */
	public Adapter createGetAllConsentsForConsentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse <em>Get All Consents For Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse
	 * @generated
	 */
	public Adapter createGetAllConsentsForConsentTemplateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomain <em>Get All Consents For Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomain
	 * @generated
	 */
	public Adapter createGetAllConsentsForDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainResponse <em>Get All Consents For Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainResponse
	 * @generated
	 */
	public Adapter createGetAllConsentsForDomainResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScan <em>Get All Consents For Domain Without Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScan
	 * @generated
	 */
	public Adapter createGetAllConsentsForDomainWithoutScanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScanResponse <em>Get All Consents For Domain Without Scan Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForDomainWithoutScanResponse
	 * @generated
	 */
	public Adapter createGetAllConsentsForDomainWithoutScanResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds <em>Get All Consents For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIds
	 * @generated
	 */
	public Adapter createGetAllConsentsForSignerIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIdsResponse <em>Get All Consents For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForSignerIdsResponse
	 * @generated
	 */
	public Adapter createGetAllConsentsForSignerIdsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType <em>Get All Ids For Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdType
	 * @generated
	 */
	public Adapter createGetAllIdsForSignerIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdTypeResponse <em>Get All Ids For Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetAllIdsForSignerIdTypeResponse
	 * @generated
	 */
	public Adapter createGetAllIdsForSignerIdTypeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsent <em>Get Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsent
	 * @generated
	 */
	public Adapter createGetConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentDates <em>Get Consent Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentDates
	 * @generated
	 */
	public Adapter createGetConsentDatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentDatesResponse <em>Get Consent Dates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentDatesResponse
	 * @generated
	 */
	public Adapter createGetConsentDatesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentLight <em>Get Consent Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentLight
	 * @generated
	 */
	public Adapter createGetConsentLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentLightResponse <em>Get Consent Light Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentLightResponse
	 * @generated
	 */
	public Adapter createGetConsentLightResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentResponse <em>Get Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentResponse
	 * @generated
	 */
	public Adapter createGetConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated <em>Get Consents For Domain Paginated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginated
	 * @generated
	 */
	public Adapter createGetConsentsForDomainPaginatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginatedResponse <em>Get Consents For Domain Paginated Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentsForDomainPaginatedResponse
	 * @generated
	 */
	public Adapter createGetConsentsForDomainPaginatedResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType <em>Get Consent Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding <em>Get Consent Status Type From Excluding To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeFromExcludingToExcludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcludingResponse <em>Get Consent Status Type From Excluding To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcludingResponse
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeFromExcludingToExcludingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding <em>Get Consent Status Type From Excluding To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeFromExcludingToIncludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncludingResponse <em>Get Consent Status Type From Excluding To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncludingResponse
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeFromExcludingToIncludingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding <em>Get Consent Status Type From Including To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcluding
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeFromIncludingToExcludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcludingResponse <em>Get Consent Status Type From Including To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToExcludingResponse
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeFromIncludingToExcludingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding <em>Get Consent Status Type From Including To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncluding
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeFromIncludingToIncludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncludingResponse <em>Get Consent Status Type From Including To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromIncludingToIncludingResponse
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeFromIncludingToIncludingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeResponse <em>Get Consent Status Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeResponse
	 * @generated
	 */
	public Adapter createGetConsentStatusTypeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate <em>Get Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate
	 * @generated
	 */
	public Adapter createGetConsentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplateResponse <em>Get Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplateResponse
	 * @generated
	 */
	public Adapter createGetConsentTemplateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT <em>Get Current Consent For Signer Ids And CT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT
	 * @generated
	 */
	public Adapter createGetCurrentConsentForSignerIdsAndCTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCTResponse <em>Get Current Consent For Signer Ids And CT Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCTResponse
	 * @generated
	 */
	public Adapter createGetCurrentConsentForSignerIdsAndCTResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate <em>Get Current Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate
	 * @generated
	 */
	public Adapter createGetCurrentConsentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse <em>Get Current Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse
	 * @generated
	 */
	public Adapter createGetCurrentConsentTemplateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds <em>Get Current Policy States For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds
	 * @generated
	 */
	public Adapter createGetCurrentPolicyStatesForSignerIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse <em>Get Current Policy States For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse
	 * @generated
	 */
	public Adapter createGetCurrentPolicyStatesForSignerIdsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetDomain <em>Get Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetDomain
	 * @generated
	 */
	public Adapter createGetDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetDomainResponse <em>Get Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetDomainResponse
	 * @generated
	 */
	public Adapter createGetDomainResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId <em>Get Mapped Templates For Signer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId
	 * @generated
	 */
	public Adapter createGetMappedTemplatesForSignerIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerIdResponse <em>Get Mapped Templates For Signer Id Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerIdResponse
	 * @generated
	 */
	public Adapter createGetMappedTemplatesForSignerIdResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetModule <em>Get Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetModule
	 * @generated
	 */
	public Adapter createGetModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetModuleResponse <em>Get Module Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetModuleResponse
	 * @generated
	 */
	public Adapter createGetModuleResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID <em>Get Object By Fhir ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID
	 * @generated
	 */
	public Adapter createGetObjectByFhirIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirIDResponse <em>Get Object By Fhir ID Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirIDResponse
	 * @generated
	 */
	public Adapter createGetObjectByFhirIDResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicy <em>Get Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicy
	 * @generated
	 */
	public Adapter createGetPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyResponse <em>Get Policy Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyResponse
	 * @generated
	 */
	public Adapter createGetPolicyResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds <em>Get Policy States For Policy And Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds
	 * @generated
	 */
	public Adapter createGetPolicyStatesForPolicyAndSignerIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIdsResponse <em>Get Policy States For Policy And Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIdsResponse
	 * @generated
	 */
	public Adapter createGetPolicyStatesForPolicyAndSignerIdsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds <em>Get Policy States For Policy Name And Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIds
	 * @generated
	 */
	public Adapter createGetPolicyStatesForPolicyNameAndSignerIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIdsResponse <em>Get Policy States For Policy Name And Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIdsResponse
	 * @generated
	 */
	public Adapter createGetPolicyStatesForPolicyNameAndSignerIdsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds <em>Get Policy States For Signer Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds
	 * @generated
	 */
	public Adapter createGetPolicyStatesForSignerIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIdsResponse <em>Get Policy States For Signer Ids Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIdsResponse
	 * @generated
	 */
	public Adapter createGetPolicyStatesForSignerIdsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsent <em>Get QC History For Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsent
	 * @generated
	 */
	public Adapter createGetQCHistoryForConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsentResponse <em>Get QC History For Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCHistoryForConsentResponse
	 * @generated
	 */
	public Adapter createGetQCHistoryForConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem <em>Get QC Problem History For QC Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem
	 * @generated
	 */
	public Adapter createGetQCProblemHistoryForQCProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblemResponse <em>Get QC Problem History For QC Problem Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblemResponse
	 * @generated
	 */
	public Adapter createGetQCProblemHistoryForQCProblemResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias <em>Get Signer Ids For Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAlias
	 * @generated
	 */
	public Adapter createGetSignerIdsForAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAliasResponse <em>Get Signer Ids For Alias Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdsForAliasResponse
	 * @generated
	 */
	public Adapter createGetSignerIdsForAliasResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType <em>Get Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdType
	 * @generated
	 */
	public Adapter createGetSignerIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdTypeResponse <em>Get Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetSignerIdTypeResponse
	 * @generated
	 */
	public Adapter createGetSignerIdTypeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPolicies <em>Get Templates With Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPolicies
	 * @generated
	 */
	public Adapter createGetTemplatesWithPoliciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPoliciesResponse <em>Get Templates With Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPoliciesResponse
	 * @generated
	 */
	public Adapter createGetTemplatesWithPoliciesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.HashMap <em>Hash Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.HashMap
	 * @generated
	 */
	public Adapter createHashMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException <em>Illegal Argument Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IllegalArgumentException
	 * @generated
	 */
	public Adapter createIllegalArgumentExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.InconsistentStatusException <em>Inconsistent Status Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InconsistentStatusException
	 * @generated
	 */
	public Adapter createInconsistentStatusExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.InternalException <em>Internal Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InternalException
	 * @generated
	 */
	public Adapter createInternalExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException <em>Illegal Composition Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException
	 * @generated
	 */
	public Adapter createIllegalCompositionExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidFreeTextException <em>Invalid Free Text Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidFreeTextException
	 * @generated
	 */
	public Adapter createInvalidFreeTextExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException <em>Invalid Parameter Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidParameterException
	 * @generated
	 */
	public Adapter createInvalidParameterExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidPropertiesException <em>Invalid Properties Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidPropertiesException
	 * @generated
	 */
	public Adapter createInvalidPropertiesExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.InvalidVersionException <em>Invalid Version Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.InvalidVersionException
	 * @generated
	 */
	public Adapter createInvalidVersionExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsented <em>Is Consented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsented
	 * @generated
	 */
	public Adapter createIsConsentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding <em>Is Consented From Excluding To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcluding
	 * @generated
	 */
	public Adapter createIsConsentedFromExcludingToExcludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse <em>Is Consented From Excluding To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse
	 * @generated
	 */
	public Adapter createIsConsentedFromExcludingToExcludingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding <em>Is Consented From Excluding To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncluding
	 * @generated
	 */
	public Adapter createIsConsentedFromExcludingToIncludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncludingResponse <em>Is Consented From Excluding To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToIncludingResponse
	 * @generated
	 */
	public Adapter createIsConsentedFromExcludingToIncludingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding <em>Is Consented From Including To Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcluding
	 * @generated
	 */
	public Adapter createIsConsentedFromIncludingToExcludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcludingResponse <em>Is Consented From Including To Excluding Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToExcludingResponse
	 * @generated
	 */
	public Adapter createIsConsentedFromIncludingToExcludingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding <em>Is Consented From Including To Including</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncluding
	 * @generated
	 */
	public Adapter createIsConsentedFromIncludingToIncludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncludingResponse <em>Is Consented From Including To Including Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromIncludingToIncludingResponse
	 * @generated
	 */
	public Adapter createIsConsentedFromIncludingToIncludingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedResponse <em>Is Consented Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.IsConsentedResponse
	 * @generated
	 */
	public Adapter createIsConsentedResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates <em>List Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates
	 * @generated
	 */
	public Adapter createListConsentTemplatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplatesResponse <em>List Consent Templates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplatesResponse
	 * @generated
	 */
	public Adapter createListConsentTemplatesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplates <em>List Current Consent Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplates
	 * @generated
	 */
	public Adapter createListCurrentConsentTemplatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplatesResponse <em>List Current Consent Templates Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListCurrentConsentTemplatesResponse
	 * @generated
	 */
	public Adapter createListCurrentConsentTemplatesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListDomains <em>List Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListDomains
	 * @generated
	 */
	public Adapter createListDomainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListDomainsResponse <em>List Domains Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListDomainsResponse
	 * @generated
	 */
	public Adapter createListDomainsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModules <em>List Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListModules
	 * @generated
	 */
	public Adapter createListModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse <em>List Modules Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse
	 * @generated
	 */
	public Adapter createListModulesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListPolicies <em>List Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListPolicies
	 * @generated
	 */
	public Adapter createListPoliciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListPoliciesResponse <em>List Policies Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListPoliciesResponse
	 * @generated
	 */
	public Adapter createListPoliciesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypes <em>List Signer Id Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypes
	 * @generated
	 */
	public Adapter createListSignerIdTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypesResponse <em>List Signer Id Types Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ListSignerIdTypesResponse
	 * @generated
	 */
	public Adapter createListSignerIdTypesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.MandatoryFieldsException <em>Mandatory Fields Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.MandatoryFieldsException
	 * @generated
	 */
	public Adapter createMandatoryFieldsExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.MissingRequiredObjectException <em>Missing Required Object Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.MissingRequiredObjectException
	 * @generated
	 */
	public Adapter createMissingRequiredObjectExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO <em>Module DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO
	 * @generated
	 */
	public Adapter createModuleDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleExpirationsType <em>Module Expirations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleExpirationsType
	 * @generated
	 */
	public Adapter createModuleExpirationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO <em>Module Key DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO
	 * @generated
	 */
	public Adapter createModuleKeyDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTOArray <em>Module Key DTO Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTOArray
	 * @generated
	 */
	public Adapter createModuleKeyDTOArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO <em>Module State DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO
	 * @generated
	 */
	public Adapter createModuleStateDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType <em>Module States Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType
	 * @generated
	 */
	public Adapter createModuleStatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ObjectInUseException <em>Object In Use Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ObjectInUseException
	 * @generated
	 */
	public Adapter createObjectInUseExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO <em>Policy DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO
	 * @generated
	 */
	public Adapter createPolicyDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyExpirationsType <em>Policy Expirations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyExpirationsType
	 * @generated
	 */
	public Adapter createPolicyExpirationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO <em>Policy Key DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO
	 * @generated
	 */
	public Adapter createPolicyKeyDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.Qcdto <em>Qcdto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Qcdto
	 * @generated
	 */
	public Adapter createQcdtoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO <em>Qc History DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO
	 * @generated
	 */
	public Adapter createQcHistoryDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO <em>Qc Problem DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO
	 * @generated
	 */
	public Adapter createQcProblemDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO <em>Qc Problem History DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO
	 * @generated
	 */
	public Adapter createQcProblemHistoryDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType <em>QC Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemType
	 * @generated
	 */
	public Adapter createQCProblemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction <em>QC Problem Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction
	 * @generated
	 */
	public Adapter createQCProblemTypeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.QCType <em>QC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QCType
	 * @generated
	 */
	public Adapter createQCTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent <em>Refuse Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent
	 * @generated
	 */
	public Adapter createRefuseConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.RefuseConsentResponse <em>Refuse Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RefuseConsentResponse
	 * @generated
	 */
	public Adapter createRefuseConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent <em>Remove Scan From Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent
	 * @generated
	 */
	public Adapter createRemoveScanFromConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsentResponse <em>Remove Scan From Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsentResponse
	 * @generated
	 */
	public Adapter createRemoveScanFromConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.RequirementsNotFullfilledException <em>Requirements Not Fullfilled Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.RequirementsNotFullfilledException
	 * @generated
	 */
	public Adapter createRequirementsNotFullfilledExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType1 <em>Return Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType1
	 * @generated
	 */
	public Adapter createReturnType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType2 <em>Return Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType2
	 * @generated
	 */
	public Adapter createReturnType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType3 <em>Return Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType3
	 * @generated
	 */
	public Adapter createReturnType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType4 <em>Return Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType4
	 * @generated
	 */
	public Adapter createReturnType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType5 <em>Return Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType5
	 * @generated
	 */
	public Adapter createReturnType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType6 <em>Return Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType6
	 * @generated
	 */
	public Adapter createReturnType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType7 <em>Return Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType7
	 * @generated
	 */
	public Adapter createReturnType7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType8 <em>Return Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType8
	 * @generated
	 */
	public Adapter createReturnType8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType9 <em>Return Type9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType9
	 * @generated
	 */
	public Adapter createReturnType9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType10 <em>Return Type10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType10
	 * @generated
	 */
	public Adapter createReturnType10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType11 <em>Return Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType11
	 * @generated
	 */
	public Adapter createReturnType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType12 <em>Return Type12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType12
	 * @generated
	 */
	public Adapter createReturnType12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType13 <em>Return Type13</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType13
	 * @generated
	 */
	public Adapter createReturnType13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType14 <em>Return Type14</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType14
	 * @generated
	 */
	public Adapter createReturnType14Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType15 <em>Return Type15</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType15
	 * @generated
	 */
	public Adapter createReturnType15Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType16 <em>Return Type16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType16
	 * @generated
	 */
	public Adapter createReturnType16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType17 <em>Return Type17</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType17
	 * @generated
	 */
	public Adapter createReturnType17Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType18 <em>Return Type18</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType18
	 * @generated
	 */
	public Adapter createReturnType18Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType19 <em>Return Type19</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType19
	 * @generated
	 */
	public Adapter createReturnType19Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType20 <em>Return Type20</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType20
	 * @generated
	 */
	public Adapter createReturnType20Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType21 <em>Return Type21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType21
	 * @generated
	 */
	public Adapter createReturnType21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType22 <em>Return Type22</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType22
	 * @generated
	 */
	public Adapter createReturnType22Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType23 <em>Return Type23</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ReturnType23
	 * @generated
	 */
	public Adapter createReturnType23Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent <em>Set QC For Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent
	 * @generated
	 */
	public Adapter createSetQCForConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsentResponse <em>Set QC For Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsentResponse
	 * @generated
	 */
	public Adapter createSetQCForConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO <em>Signed Policy DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO
	 * @generated
	 */
	public Adapter createSignedPolicyDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO <em>Signer Id DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO
	 * @generated
	 */
	public Adapter createSignerIdDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTOArray <em>Signer Id DTO Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTOArray
	 * @generated
	 */
	public Adapter createSignerIdDTOArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO <em>Signer Id Type DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO
	 * @generated
	 */
	public Adapter createSignerIdTypeDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownAliasException <em>Unknown Alias Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownAliasException
	 * @generated
	 */
	public Adapter createUnknownAliasExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentException <em>Unknown Consent Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentException
	 * @generated
	 */
	public Adapter createUnknownConsentExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentTemplateException <em>Unknown Consent Template Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownConsentTemplateException
	 * @generated
	 */
	public Adapter createUnknownConsentTemplateExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownDomainException <em>Unknown Domain Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownDomainException
	 * @generated
	 */
	public Adapter createUnknownDomainExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownFhirIdObjectException <em>Unknown Fhir Id Object Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownFhirIdObjectException
	 * @generated
	 */
	public Adapter createUnknownFhirIdObjectExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownIDException <em>Unknown ID Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownIDException
	 * @generated
	 */
	public Adapter createUnknownIDExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownModuleException <em>Unknown Module Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownModuleException
	 * @generated
	 */
	public Adapter createUnknownModuleExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownPolicyException <em>Unknown Policy Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownPolicyException
	 * @generated
	 */
	public Adapter createUnknownPolicyExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdException <em>Unknown Signer Id Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdException
	 * @generated
	 */
	public Adapter createUnknownSignerIdExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdTypeException <em>Unknown Signer Id Type Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UnknownSignerIdTypeException
	 * @generated
	 */
	public Adapter createUnknownSignerIdTypeExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse <em>Update Consent In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUse
	 * @generated
	 */
	public Adapter createUpdateConsentInUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUseResponse <em>Update Consent In Use Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentInUseResponse
	 * @generated
	 */
	public Adapter createUpdateConsentInUseResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplate <em>Update Consent Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplate
	 * @generated
	 */
	public Adapter createUpdateConsentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateInUse <em>Update Consent Template In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateInUse
	 * @generated
	 */
	public Adapter createUpdateConsentTemplateInUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateInUseResponse <em>Update Consent Template In Use Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateInUseResponse
	 * @generated
	 */
	public Adapter createUpdateConsentTemplateInUseResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateResponse <em>Update Consent Template Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateResponse
	 * @generated
	 */
	public Adapter createUpdateConsentTemplateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomain <em>Update Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateDomain
	 * @generated
	 */
	public Adapter createUpdateDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse <em>Update Domain In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse
	 * @generated
	 */
	public Adapter createUpdateDomainInUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUseResponse <em>Update Domain In Use Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUseResponse
	 * @generated
	 */
	public Adapter createUpdateDomainInUseResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainResponse <em>Update Domain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainResponse
	 * @generated
	 */
	public Adapter createUpdateDomainResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModule <em>Update Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateModule
	 * @generated
	 */
	public Adapter createUpdateModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse <em>Update Module In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse
	 * @generated
	 */
	public Adapter createUpdateModuleInUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUseResponse <em>Update Module In Use Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUseResponse
	 * @generated
	 */
	public Adapter createUpdateModuleInUseResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleResponse <em>Update Module Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleResponse
	 * @generated
	 */
	public Adapter createUpdateModuleResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicy <em>Update Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicy
	 * @generated
	 */
	public Adapter createUpdatePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse <em>Update Policy In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse
	 * @generated
	 */
	public Adapter createUpdatePolicyInUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUseResponse <em>Update Policy In Use Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUseResponse
	 * @generated
	 */
	public Adapter createUpdatePolicyInUseResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyResponse <em>Update Policy Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyResponse
	 * @generated
	 */
	public Adapter createUpdatePolicyResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType <em>Update Signer Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdType
	 * @generated
	 */
	public Adapter createUpdateSignerIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdTypeResponse <em>Update Signer Id Type Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.UpdateSignerIdTypeResponse
	 * @generated
	 */
	public Adapter createUpdateSignerIdTypeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent <em>Validate Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent
	 * @generated
	 */
	public Adapter createValidateConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidateConsentResponse <em>Validate Consent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidateConsentResponse
	 * @generated
	 */
	public Adapter createValidateConsentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO <em>Valid From Properties DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO
	 * @generated
	 */
	public Adapter createValidFromPropertiesDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emau.icmvc.ganimed.ttp.cm2.VersionConverterClassException <em>Version Converter Class Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.VersionConverterClassException
	 * @generated
	 */
	public Adapter createVersionConverterClassExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Cm2AdapterFactory
