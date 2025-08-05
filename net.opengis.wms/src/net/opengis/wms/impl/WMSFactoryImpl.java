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
package net.opengis.wms.impl;

import net.opengis.wms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WMSFactoryImpl extends EFactoryImpl implements WMSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WMSFactory init() {
		try {
			WMSFactory theWMSFactory = (WMSFactory)EPackage.Registry.INSTANCE.getEFactory(WMSPackage.eNS_URI);
			if (theWMSFactory != null) {
				return theWMSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WMSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMSFactoryImpl() {
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
			case WMSPackage.ATTRIBUTION_TYPE: return createAttributionType();
			case WMSPackage.AUTHORITY_URL_TYPE: return createAuthorityURLType();
			case WMSPackage.BOUNDING_BOX_TYPE: return createBoundingBoxType();
			case WMSPackage.CAPABILITY_TYPE: return createCapabilityType();
			case WMSPackage.CONTACT_ADDRESS_TYPE: return createContactAddressType();
			case WMSPackage.CONTACT_INFORMATION_TYPE: return createContactInformationType();
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE: return createContactPersonPrimaryType();
			case WMSPackage.DATA_URL_TYPE: return createDataURLType();
			case WMSPackage.DCP_TYPE_TYPE: return createDCPTypeType();
			case WMSPackage.DIMENSION_TYPE: return createDimensionType();
			case WMSPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case WMSPackage.EXCEPTION_TYPE: return createExceptionType();
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE: return createEXGeographicBoundingBoxType();
			case WMSPackage.FEATURE_LIST_URL_TYPE: return createFeatureListURLType();
			case WMSPackage.GET_TYPE: return createGetType();
			case WMSPackage.HTTP_TYPE: return createHTTPType();
			case WMSPackage.IDENTIFIER_TYPE: return createIdentifierType();
			case WMSPackage.KEYWORD_LIST_TYPE: return createKeywordListType();
			case WMSPackage.KEYWORD_TYPE: return createKeywordType();
			case WMSPackage.LAYER_TYPE: return createLayerType();
			case WMSPackage.LEGEND_URL_TYPE: return createLegendURLType();
			case WMSPackage.LOGO_URL_TYPE: return createLogoURLType();
			case WMSPackage.METADATA_URL_TYPE: return createMetadataURLType();
			case WMSPackage.ONLINE_RESOURCE_TYPE: return createOnlineResourceType();
			case WMSPackage.OPERATION_TYPE: return createOperationType();
			case WMSPackage.POST_TYPE: return createPostType();
			case WMSPackage.REQUEST_TYPE: return createRequestType();
			case WMSPackage.SERVICE_TYPE: return createServiceType();
			case WMSPackage.STYLE_SHEET_URL_TYPE: return createStyleSheetURLType();
			case WMSPackage.STYLE_TYPE: return createStyleType();
			case WMSPackage.STYLE_URL_TYPE: return createStyleURLType();
			case WMSPackage.WMS_CAPABILITIES_TYPE: return createWMSCapabilitiesType();
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
			case WMSPackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case WMSPackage.LATITUDE_TYPE:
				return createLatitudeTypeFromString(eDataType, initialValue);
			case WMSPackage.LATITUDE_TYPE_OBJECT:
				return createLatitudeTypeObjectFromString(eDataType, initialValue);
			case WMSPackage.LONGITUDE_TYPE:
				return createLongitudeTypeFromString(eDataType, initialValue);
			case WMSPackage.LONGITUDE_TYPE_OBJECT:
				return createLongitudeTypeObjectFromString(eDataType, initialValue);
			case WMSPackage.NAME_TYPE_OBJECT:
				return createNameTypeObjectFromString(eDataType, initialValue);
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
			case WMSPackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case WMSPackage.LATITUDE_TYPE:
				return convertLatitudeTypeToString(eDataType, instanceValue);
			case WMSPackage.LATITUDE_TYPE_OBJECT:
				return convertLatitudeTypeObjectToString(eDataType, instanceValue);
			case WMSPackage.LONGITUDE_TYPE:
				return convertLongitudeTypeToString(eDataType, instanceValue);
			case WMSPackage.LONGITUDE_TYPE_OBJECT:
				return convertLongitudeTypeObjectToString(eDataType, instanceValue);
			case WMSPackage.NAME_TYPE_OBJECT:
				return convertNameTypeObjectToString(eDataType, instanceValue);
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
	public AttributionType createAttributionType() {
		AttributionTypeImpl attributionType = new AttributionTypeImpl();
		return attributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorityURLType createAuthorityURLType() {
		AuthorityURLTypeImpl authorityURLType = new AuthorityURLTypeImpl();
		return authorityURLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBoxType createBoundingBoxType() {
		BoundingBoxTypeImpl boundingBoxType = new BoundingBoxTypeImpl();
		return boundingBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityType createCapabilityType() {
		CapabilityTypeImpl capabilityType = new CapabilityTypeImpl();
		return capabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactAddressType createContactAddressType() {
		ContactAddressTypeImpl contactAddressType = new ContactAddressTypeImpl();
		return contactAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactInformationType createContactInformationType() {
		ContactInformationTypeImpl contactInformationType = new ContactInformationTypeImpl();
		return contactInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPersonPrimaryType createContactPersonPrimaryType() {
		ContactPersonPrimaryTypeImpl contactPersonPrimaryType = new ContactPersonPrimaryTypeImpl();
		return contactPersonPrimaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataURLType createDataURLType() {
		DataURLTypeImpl dataURLType = new DataURLTypeImpl();
		return dataURLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCPTypeType createDCPTypeType() {
		DCPTypeTypeImpl dcpTypeType = new DCPTypeTypeImpl();
		return dcpTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DimensionType createDimensionType() {
		DimensionTypeImpl dimensionType = new DimensionTypeImpl();
		return dimensionType;
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
	public ExceptionType createExceptionType() {
		ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicBoundingBoxType createEXGeographicBoundingBoxType() {
		EXGeographicBoundingBoxTypeImpl exGeographicBoundingBoxType = new EXGeographicBoundingBoxTypeImpl();
		return exGeographicBoundingBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureListURLType createFeatureListURLType() {
		FeatureListURLTypeImpl featureListURLType = new FeatureListURLTypeImpl();
		return featureListURLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetType createGetType() {
		GetTypeImpl getType = new GetTypeImpl();
		return getType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTTPType createHTTPType() {
		HTTPTypeImpl httpType = new HTTPTypeImpl();
		return httpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierType createIdentifierType() {
		IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
		return identifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordListType createKeywordListType() {
		KeywordListTypeImpl keywordListType = new KeywordListTypeImpl();
		return keywordListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordType createKeywordType() {
		KeywordTypeImpl keywordType = new KeywordTypeImpl();
		return keywordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerType createLayerType() {
		LayerTypeImpl layerType = new LayerTypeImpl();
		return layerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegendURLType createLegendURLType() {
		LegendURLTypeImpl legendURLType = new LegendURLTypeImpl();
		return legendURLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogoURLType createLogoURLType() {
		LogoURLTypeImpl logoURLType = new LogoURLTypeImpl();
		return logoURLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataURLType createMetadataURLType() {
		MetadataURLTypeImpl metadataURLType = new MetadataURLTypeImpl();
		return metadataURLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnlineResourceType createOnlineResourceType() {
		OnlineResourceTypeImpl onlineResourceType = new OnlineResourceTypeImpl();
		return onlineResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType createOperationType() {
		OperationTypeImpl operationType = new OperationTypeImpl();
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostType createPostType() {
		PostTypeImpl postType = new PostTypeImpl();
		return postType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestType createRequestType() {
		RequestTypeImpl requestType = new RequestTypeImpl();
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleSheetURLType createStyleSheetURLType() {
		StyleSheetURLTypeImpl styleSheetURLType = new StyleSheetURLTypeImpl();
		return styleSheetURLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleType createStyleType() {
		StyleTypeImpl styleType = new StyleTypeImpl();
		return styleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleURLType createStyleURLType() {
		StyleURLTypeImpl styleURLType = new StyleURLTypeImpl();
		return styleURLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMSCapabilitiesType createWMSCapabilitiesType() {
		WMSCapabilitiesTypeImpl wmsCapabilitiesType = new WMSCapabilitiesTypeImpl();
		return wmsCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameTypeFromString(EDataType eDataType, String initialValue) {
		NameType result = NameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLatitudeTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatitudeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLatitudeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLatitudeTypeFromString(WMSPackage.Literals.LATITUDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatitudeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLatitudeTypeToString(WMSPackage.Literals.LATITUDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLongitudeTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongitudeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLongitudeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLongitudeTypeFromString(WMSPackage.Literals.LONGITUDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongitudeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLongitudeTypeToString(WMSPackage.Literals.LONGITUDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameTypeFromString(WMSPackage.Literals.NAME_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameTypeToString(WMSPackage.Literals.NAME_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMSPackage getWMSPackage() {
		return (WMSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WMSPackage getPackage() {
		return WMSPackage.eINSTANCE;
	}

} //WMSFactoryImpl
