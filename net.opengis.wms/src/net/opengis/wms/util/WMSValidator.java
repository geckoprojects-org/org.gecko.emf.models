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

import java.util.Map;

import net.opengis.wms.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.opengis.wms.WMSPackage
 * @generated
 */
public class WMSValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WMSValidator INSTANCE = new WMSValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.wms";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMSValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WMSPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WMSPackage.ATTRIBUTION_TYPE:
				return validateAttributionType((AttributionType)value, diagnostics, context);
			case WMSPackage.AUTHORITY_URL_TYPE:
				return validateAuthorityURLType((AuthorityURLType)value, diagnostics, context);
			case WMSPackage.BOUNDING_BOX_TYPE:
				return validateBoundingBoxType((BoundingBoxType)value, diagnostics, context);
			case WMSPackage.CAPABILITY_TYPE:
				return validateCapabilityType((CapabilityType)value, diagnostics, context);
			case WMSPackage.CONTACT_ADDRESS_TYPE:
				return validateContactAddressType((ContactAddressType)value, diagnostics, context);
			case WMSPackage.CONTACT_INFORMATION_TYPE:
				return validateContactInformationType((ContactInformationType)value, diagnostics, context);
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE:
				return validateContactPersonPrimaryType((ContactPersonPrimaryType)value, diagnostics, context);
			case WMSPackage.DATA_URL_TYPE:
				return validateDataURLType((DataURLType)value, diagnostics, context);
			case WMSPackage.DCP_TYPE_TYPE:
				return validateDCPTypeType((DCPTypeType)value, diagnostics, context);
			case WMSPackage.DIMENSION_TYPE:
				return validateDimensionType((DimensionType)value, diagnostics, context);
			case WMSPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case WMSPackage.EXCEPTION_TYPE:
				return validateExceptionType((ExceptionType)value, diagnostics, context);
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE:
				return validateEXGeographicBoundingBoxType((EXGeographicBoundingBoxType)value, diagnostics, context);
			case WMSPackage.FEATURE_LIST_URL_TYPE:
				return validateFeatureListURLType((FeatureListURLType)value, diagnostics, context);
			case WMSPackage.GET_TYPE:
				return validateGetType((GetType)value, diagnostics, context);
			case WMSPackage.HTTP_TYPE:
				return validateHTTPType((HTTPType)value, diagnostics, context);
			case WMSPackage.IDENTIFIER_TYPE:
				return validateIdentifierType((IdentifierType)value, diagnostics, context);
			case WMSPackage.KEYWORD_LIST_TYPE:
				return validateKeywordListType((KeywordListType)value, diagnostics, context);
			case WMSPackage.KEYWORD_TYPE:
				return validateKeywordType((KeywordType)value, diagnostics, context);
			case WMSPackage.LAYER_TYPE:
				return validateLayerType((LayerType)value, diagnostics, context);
			case WMSPackage.LEGEND_URL_TYPE:
				return validateLegendURLType((LegendURLType)value, diagnostics, context);
			case WMSPackage.LOGO_URL_TYPE:
				return validateLogoURLType((LogoURLType)value, diagnostics, context);
			case WMSPackage.METADATA_URL_TYPE:
				return validateMetadataURLType((MetadataURLType)value, diagnostics, context);
			case WMSPackage.ONLINE_RESOURCE_TYPE:
				return validateOnlineResourceType((OnlineResourceType)value, diagnostics, context);
			case WMSPackage.OPERATION_TYPE:
				return validateOperationType((OperationType)value, diagnostics, context);
			case WMSPackage.POST_TYPE:
				return validatePostType((PostType)value, diagnostics, context);
			case WMSPackage.REQUEST_TYPE:
				return validateRequestType((RequestType)value, diagnostics, context);
			case WMSPackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case WMSPackage.STYLE_SHEET_URL_TYPE:
				return validateStyleSheetURLType((StyleSheetURLType)value, diagnostics, context);
			case WMSPackage.STYLE_TYPE:
				return validateStyleType((StyleType)value, diagnostics, context);
			case WMSPackage.STYLE_URL_TYPE:
				return validateStyleURLType((StyleURLType)value, diagnostics, context);
			case WMSPackage.WMS_CAPABILITIES_TYPE:
				return validateWMSCapabilitiesType((WMSCapabilitiesType)value, diagnostics, context);
			case WMSPackage.NAME_TYPE:
				return validateNameType((NameType)value, diagnostics, context);
			case WMSPackage.LATITUDE_TYPE:
				return validateLatitudeType((Double)value, diagnostics, context);
			case WMSPackage.LATITUDE_TYPE_OBJECT:
				return validateLatitudeTypeObject((Double)value, diagnostics, context);
			case WMSPackage.LONGITUDE_TYPE:
				return validateLongitudeType((Double)value, diagnostics, context);
			case WMSPackage.LONGITUDE_TYPE_OBJECT:
				return validateLongitudeTypeObject((Double)value, diagnostics, context);
			case WMSPackage.NAME_TYPE_OBJECT:
				return validateNameTypeObject((NameType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributionType(AttributionType attributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorityURLType(AuthorityURLType authorityURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorityURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundingBoxType(BoundingBoxType boundingBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundingBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityType(CapabilityType capabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactAddressType(ContactAddressType contactAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactInformationType(ContactInformationType contactInformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactInformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPersonPrimaryType(ContactPersonPrimaryType contactPersonPrimaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPersonPrimaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataURLType(DataURLType dataURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDCPTypeType(DCPTypeType dcpTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dcpTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionType(DimensionType dimensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionType(ExceptionType exceptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exceptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXGeographicBoundingBoxType(EXGeographicBoundingBoxType exGeographicBoundingBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exGeographicBoundingBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureListURLType(FeatureListURLType featureListURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureListURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetType(GetType getType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPType(HTTPType httpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierType(IdentifierType identifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeywordListType(KeywordListType keywordListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keywordListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeywordType(KeywordType keywordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keywordType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayerType(LayerType layerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendURLType(LegendURLType legendURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legendURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogoURLType(LogoURLType logoURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logoURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadataURLType(MetadataURLType metadataURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadataURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineResourceType(OnlineResourceType onlineResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onlineResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostType(PostType postType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestType(RequestType requestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSheetURLType(StyleSheetURLType styleSheetURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSheetURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleType(StyleType styleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleURLType(StyleURLType styleURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWMSCapabilitiesType(WMSCapabilitiesType wmsCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wmsCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(NameType nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeType(double latitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLatitudeType_Min(latitudeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatitudeType_Max(latitudeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLatitudeType_Min
	 */
	public static final double LATITUDE_TYPE__MIN__VALUE = -90.0;

	/**
	 * Validates the Min constraint of '<em>Latitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeType_Min(double latitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = latitudeType >= LATITUDE_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(WMSPackage.Literals.LATITUDE_TYPE, latitudeType, LATITUDE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLatitudeType_Max
	 */
	public static final double LATITUDE_TYPE__MAX__VALUE = 90.0;

	/**
	 * Validates the Max constraint of '<em>Latitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeType_Max(double latitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = latitudeType <= LATITUDE_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(WMSPackage.Literals.LATITUDE_TYPE, latitudeType, LATITUDE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeTypeObject(Double latitudeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLatitudeType_Min(latitudeTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatitudeType_Max(latitudeTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeType(double longitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLongitudeType_Min(longitudeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLongitudeType_Max(longitudeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLongitudeType_Min
	 */
	public static final double LONGITUDE_TYPE__MIN__VALUE = -180.0;

	/**
	 * Validates the Min constraint of '<em>Longitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeType_Min(double longitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = longitudeType >= LONGITUDE_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(WMSPackage.Literals.LONGITUDE_TYPE, longitudeType, LONGITUDE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLongitudeType_Max
	 */
	public static final double LONGITUDE_TYPE__MAX__VALUE = 180.0;

	/**
	 * Validates the Max constraint of '<em>Longitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeType_Max(double longitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = longitudeType <= LONGITUDE_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(WMSPackage.Literals.LONGITUDE_TYPE, longitudeType, LONGITUDE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeTypeObject(Double longitudeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLongitudeType_Min(longitudeTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLongitudeType_Max(longitudeTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameTypeObject(NameType nameTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WMSValidator
