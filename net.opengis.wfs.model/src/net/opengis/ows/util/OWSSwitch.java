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
package net.opengis.ows.util;

import net.opengis.ows.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see net.opengis.ows.OWSPackage
 * @generated
 */
public class OWSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OWSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWSSwitch() {
		if (modelPackage == null) {
			modelPackage = OWSPackage.eINSTANCE;
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
			case OWSPackage.ACCEPT_FORMATS_TYPE: {
				AcceptFormatsType acceptFormatsType = (AcceptFormatsType)theEObject;
				T result = caseAcceptFormatsType(acceptFormatsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.ACCEPT_VERSIONS_TYPE: {
				AcceptVersionsType acceptVersionsType = (AcceptVersionsType)theEObject;
				T result = caseAcceptVersionsType(acceptVersionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.BOUNDING_BOX_TYPE: {
				BoundingBoxType boundingBoxType = (BoundingBoxType)theEObject;
				T result = caseBoundingBoxType(boundingBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.CAPABILITIES_BASE_TYPE: {
				CapabilitiesBaseType capabilitiesBaseType = (CapabilitiesBaseType)theEObject;
				T result = caseCapabilitiesBaseType(capabilitiesBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.CODE_TYPE: {
				CodeType codeType = (CodeType)theEObject;
				T result = caseCodeType(codeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.CONTACT_TYPE: {
				ContactType contactType = (ContactType)theEObject;
				T result = caseContactType(contactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.DCP_TYPE: {
				DCPType dcpType = (DCPType)theEObject;
				T result = caseDCPType(dcpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.DOMAIN_TYPE: {
				DomainType domainType = (DomainType)theEObject;
				T result = caseDomainType(domainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.EXCEPTION_REPORT_TYPE: {
				ExceptionReportType exceptionReportType = (ExceptionReportType)theEObject;
				T result = caseExceptionReportType(exceptionReportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.EXCEPTION_TYPE: {
				ExceptionType exceptionType = (ExceptionType)theEObject;
				T result = caseExceptionType(exceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.GET_CAPABILITIES_TYPE: {
				GetCapabilitiesType getCapabilitiesType = (GetCapabilitiesType)theEObject;
				T result = caseGetCapabilitiesType(getCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.HTTP_TYPE: {
				HTTPType httpType = (HTTPType)theEObject;
				T result = caseHTTPType(httpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.IDENTIFICATION_TYPE: {
				IdentificationType identificationType = (IdentificationType)theEObject;
				T result = caseIdentificationType(identificationType);
				if (result == null) result = caseDescriptionType(identificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.KEYWORDS_TYPE: {
				KeywordsType keywordsType = (KeywordsType)theEObject;
				T result = caseKeywordsType(keywordsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.METADATA_TYPE: {
				MetadataType metadataType = (MetadataType)theEObject;
				T result = caseMetadataType(metadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.ONLINE_RESOURCE_TYPE: {
				OnlineResourceType onlineResourceType = (OnlineResourceType)theEObject;
				T result = caseOnlineResourceType(onlineResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.OPERATIONS_METADATA_TYPE: {
				OperationsMetadataType operationsMetadataType = (OperationsMetadataType)theEObject;
				T result = caseOperationsMetadataType(operationsMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.OPERATION_TYPE: {
				OperationType operationType = (OperationType)theEObject;
				T result = caseOperationType(operationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.REQUEST_METHOD_TYPE: {
				RequestMethodType requestMethodType = (RequestMethodType)theEObject;
				T result = caseRequestMethodType(requestMethodType);
				if (result == null) result = caseOnlineResourceType(requestMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.RESPONSIBLE_PARTY_SUBSET_TYPE: {
				ResponsiblePartySubsetType responsiblePartySubsetType = (ResponsiblePartySubsetType)theEObject;
				T result = caseResponsiblePartySubsetType(responsiblePartySubsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.RESPONSIBLE_PARTY_TYPE: {
				ResponsiblePartyType responsiblePartyType = (ResponsiblePartyType)theEObject;
				T result = caseResponsiblePartyType(responsiblePartyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.SECTIONS_TYPE: {
				SectionsType sectionsType = (SectionsType)theEObject;
				T result = caseSectionsType(sectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.SERVICE_IDENTIFICATION_TYPE: {
				ServiceIdentificationType serviceIdentificationType = (ServiceIdentificationType)theEObject;
				T result = caseServiceIdentificationType(serviceIdentificationType);
				if (result == null) result = caseDescriptionType(serviceIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.SERVICE_PROVIDER_TYPE: {
				ServiceProviderType serviceProviderType = (ServiceProviderType)theEObject;
				T result = caseServiceProviderType(serviceProviderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.TELEPHONE_TYPE: {
				TelephoneType telephoneType = (TelephoneType)theEObject;
				T result = caseTelephoneType(telephoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWSPackage.WGS84_BOUNDING_BOX_TYPE: {
				WGS84BoundingBoxType wgs84BoundingBoxType = (WGS84BoundingBoxType)theEObject;
				T result = caseWGS84BoundingBoxType(wgs84BoundingBoxType);
				if (result == null) result = caseBoundingBoxType(wgs84BoundingBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Formats Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Formats Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptFormatsType(AcceptFormatsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Versions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Versions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptVersionsType(AcceptVersionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingBoxType(BoundingBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilities Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilities Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilitiesBaseType(CapabilitiesBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeType(CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactType(ContactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCPType(DCPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionType(DescriptionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainType(DomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Report Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionReportType(ExceptionReportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionType(ExceptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCapabilitiesType(GetCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPType(HTTPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationType(IdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keywords Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keywords Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordsType(KeywordsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataType(MetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlineResourceType(OnlineResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationsMetadataType(OperationsMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationType(OperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestMethodType(RequestMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party Subset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party Subset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsiblePartySubsetType(ResponsiblePartySubsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsiblePartyType(ResponsiblePartyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionsType(SectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentificationType(ServiceIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Provider Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Provider Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProviderType(ServiceProviderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telephone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telephone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelephoneType(TelephoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WGS84 Bounding Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WGS84 Bounding Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWGS84BoundingBoxType(WGS84BoundingBoxType object) {
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

} //OWSSwitch
