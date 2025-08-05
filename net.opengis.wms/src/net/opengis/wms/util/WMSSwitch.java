/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms.util;

import net.opengis.wms.*;

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
 * @see net.opengis.wms.WMSPackage
 * @generated
 */
public class WMSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WMSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMSSwitch() {
		if (modelPackage == null) {
			modelPackage = WMSPackage.eINSTANCE;
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
			case WMSPackage.ATTRIBUTION_TYPE: {
				AttributionType attributionType = (AttributionType)theEObject;
				T result = caseAttributionType(attributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.AUTHORITY_URL_TYPE: {
				AuthorityURLType authorityURLType = (AuthorityURLType)theEObject;
				T result = caseAuthorityURLType(authorityURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.BOUNDING_BOX_TYPE: {
				BoundingBoxType boundingBoxType = (BoundingBoxType)theEObject;
				T result = caseBoundingBoxType(boundingBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.CAPABILITY_TYPE: {
				CapabilityType capabilityType = (CapabilityType)theEObject;
				T result = caseCapabilityType(capabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.CONTACT_ADDRESS_TYPE: {
				ContactAddressType contactAddressType = (ContactAddressType)theEObject;
				T result = caseContactAddressType(contactAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.CONTACT_INFORMATION_TYPE: {
				ContactInformationType contactInformationType = (ContactInformationType)theEObject;
				T result = caseContactInformationType(contactInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE: {
				ContactPersonPrimaryType contactPersonPrimaryType = (ContactPersonPrimaryType)theEObject;
				T result = caseContactPersonPrimaryType(contactPersonPrimaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.DATA_URL_TYPE: {
				DataURLType dataURLType = (DataURLType)theEObject;
				T result = caseDataURLType(dataURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.DCP_TYPE_TYPE: {
				DCPTypeType dcpTypeType = (DCPTypeType)theEObject;
				T result = caseDCPTypeType(dcpTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.DIMENSION_TYPE: {
				DimensionType dimensionType = (DimensionType)theEObject;
				T result = caseDimensionType(dimensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.EXCEPTION_TYPE: {
				ExceptionType exceptionType = (ExceptionType)theEObject;
				T result = caseExceptionType(exceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE: {
				EXGeographicBoundingBoxType exGeographicBoundingBoxType = (EXGeographicBoundingBoxType)theEObject;
				T result = caseEXGeographicBoundingBoxType(exGeographicBoundingBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.FEATURE_LIST_URL_TYPE: {
				FeatureListURLType featureListURLType = (FeatureListURLType)theEObject;
				T result = caseFeatureListURLType(featureListURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.GET_TYPE: {
				GetType getType = (GetType)theEObject;
				T result = caseGetType(getType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.HTTP_TYPE: {
				HTTPType httpType = (HTTPType)theEObject;
				T result = caseHTTPType(httpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.IDENTIFIER_TYPE: {
				IdentifierType identifierType = (IdentifierType)theEObject;
				T result = caseIdentifierType(identifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.KEYWORD_LIST_TYPE: {
				KeywordListType keywordListType = (KeywordListType)theEObject;
				T result = caseKeywordListType(keywordListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.KEYWORD_TYPE: {
				KeywordType keywordType = (KeywordType)theEObject;
				T result = caseKeywordType(keywordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.LAYER_TYPE: {
				LayerType layerType = (LayerType)theEObject;
				T result = caseLayerType(layerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.LEGEND_URL_TYPE: {
				LegendURLType legendURLType = (LegendURLType)theEObject;
				T result = caseLegendURLType(legendURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.LOGO_URL_TYPE: {
				LogoURLType logoURLType = (LogoURLType)theEObject;
				T result = caseLogoURLType(logoURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.METADATA_URL_TYPE: {
				MetadataURLType metadataURLType = (MetadataURLType)theEObject;
				T result = caseMetadataURLType(metadataURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.ONLINE_RESOURCE_TYPE: {
				OnlineResourceType onlineResourceType = (OnlineResourceType)theEObject;
				T result = caseOnlineResourceType(onlineResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.OPERATION_TYPE: {
				OperationType operationType = (OperationType)theEObject;
				T result = caseOperationType(operationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.POST_TYPE: {
				PostType postType = (PostType)theEObject;
				T result = casePostType(postType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.REQUEST_TYPE: {
				RequestType requestType = (RequestType)theEObject;
				T result = caseRequestType(requestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				T result = caseServiceType(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.STYLE_SHEET_URL_TYPE: {
				StyleSheetURLType styleSheetURLType = (StyleSheetURLType)theEObject;
				T result = caseStyleSheetURLType(styleSheetURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.STYLE_TYPE: {
				StyleType styleType = (StyleType)theEObject;
				T result = caseStyleType(styleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.STYLE_URL_TYPE: {
				StyleURLType styleURLType = (StyleURLType)theEObject;
				T result = caseStyleURLType(styleURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WMSPackage.WMS_CAPABILITIES_TYPE: {
				WMSCapabilitiesType wmsCapabilitiesType = (WMSCapabilitiesType)theEObject;
				T result = caseWMSCapabilitiesType(wmsCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributionType(AttributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authority URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authority URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorityURLType(AuthorityURLType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Capability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityType(CapabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactAddressType(ContactAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactInformationType(ContactInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Person Primary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Person Primary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPersonPrimaryType(ContactPersonPrimaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataURLType(DataURLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCP Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCP Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCPTypeType(DCPTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionType(DimensionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EX Geographic Bounding Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Geographic Bounding Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXGeographicBoundingBoxType(EXGeographicBoundingBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature List URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature List URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureListURLType(FeatureListURLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetType(GetType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierType(IdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordListType(KeywordListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordType(KeywordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerType(LayerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legend URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legend URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegendURLType(LegendURLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logo URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logo URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogoURLType(LogoURLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataURLType(MetadataURLType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Post Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostType(PostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestType(RequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Sheet URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Sheet URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleSheetURLType(StyleSheetURLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleType(StyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleURLType(StyleURLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMSCapabilitiesType(WMSCapabilitiesType object) {
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

} //WMSSwitch
