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
package net.opengis.ows.impl;

import java.util.ArrayList;
import java.util.List;

import net.opengis.ows.*;

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
public class OWSFactoryImpl extends EFactoryImpl implements OWSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OWSFactory init() {
		try {
			OWSFactory theOWSFactory = (OWSFactory)EPackage.Registry.INSTANCE.getEFactory(OWSPackage.eNS_URI);
			if (theOWSFactory != null) {
				return theOWSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OWSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWSFactoryImpl() {
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
			case OWSPackage.ABSTRACT_REFERENCE_BASE_TYPE: return createAbstractReferenceBaseType();
			case OWSPackage.ACCEPT_FORMATS_TYPE: return createAcceptFormatsType();
			case OWSPackage.ACCEPT_VERSIONS_TYPE: return createAcceptVersionsType();
			case OWSPackage.ADDRESS_TYPE: return createAddressType();
			case OWSPackage.ALLOWED_VALUES_TYPE: return createAllowedValuesType();
			case OWSPackage.ANY_VALUE_TYPE: return createAnyValueType();
			case OWSPackage.BASIC_IDENTIFICATION_TYPE: return createBasicIdentificationType();
			case OWSPackage.BOUNDING_BOX_TYPE: return createBoundingBoxType();
			case OWSPackage.CAPABILITIES_BASE_TYPE: return createCapabilitiesBaseType();
			case OWSPackage.CODE_TYPE: return createCodeType();
			case OWSPackage.CONTACT_TYPE: return createContactType();
			case OWSPackage.CONTENTS_BASE_TYPE: return createContentsBaseType();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE: return createDatasetDescriptionSummaryBaseType();
			case OWSPackage.DCP_TYPE: return createDCPType();
			case OWSPackage.DESCRIPTION_TYPE: return createDescriptionType();
			case OWSPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OWSPackage.DOMAIN_METADATA_TYPE: return createDomainMetadataType();
			case OWSPackage.DOMAIN_TYPE: return createDomainType();
			case OWSPackage.EXCEPTION_REPORT_TYPE: return createExceptionReportType();
			case OWSPackage.EXCEPTION_TYPE: return createExceptionType();
			case OWSPackage.GET_CAPABILITIES_TYPE: return createGetCapabilitiesType();
			case OWSPackage.GET_RESOURCE_BY_ID_TYPE: return createGetResourceByIdType();
			case OWSPackage.HTTP_TYPE: return createHTTPType();
			case OWSPackage.IDENTIFICATION_TYPE: return createIdentificationType();
			case OWSPackage.KEYWORDS_TYPE: return createKeywordsType();
			case OWSPackage.LANGUAGE_STRING_TYPE: return createLanguageStringType();
			case OWSPackage.MANIFEST_TYPE: return createManifestType();
			case OWSPackage.METADATA_TYPE: return createMetadataType();
			case OWSPackage.NO_VALUES_TYPE: return createNoValuesType();
			case OWSPackage.ONLINE_RESOURCE_TYPE: return createOnlineResourceType();
			case OWSPackage.OPERATIONS_METADATA_TYPE: return createOperationsMetadataType();
			case OWSPackage.OPERATION_TYPE: return createOperationType();
			case OWSPackage.RANGE_TYPE: return createRangeType();
			case OWSPackage.REFERENCE_GROUP_TYPE: return createReferenceGroupType();
			case OWSPackage.REFERENCE_TYPE: return createReferenceType();
			case OWSPackage.REQUEST_METHOD_TYPE: return createRequestMethodType();
			case OWSPackage.RESPONSIBLE_PARTY_SUBSET_TYPE: return createResponsiblePartySubsetType();
			case OWSPackage.RESPONSIBLE_PARTY_TYPE: return createResponsiblePartyType();
			case OWSPackage.SECTIONS_TYPE: return createSectionsType();
			case OWSPackage.SERVICE_IDENTIFICATION_TYPE: return createServiceIdentificationType();
			case OWSPackage.SERVICE_PROVIDER_TYPE: return createServiceProviderType();
			case OWSPackage.SERVICE_REFERENCE_TYPE: return createServiceReferenceType();
			case OWSPackage.TELEPHONE_TYPE: return createTelephoneType();
			case OWSPackage.UN_NAMED_DOMAIN_TYPE: return createUnNamedDomainType();
			case OWSPackage.VALUES_REFERENCE_TYPE: return createValuesReferenceType();
			case OWSPackage.VALUE_TYPE: return createValueType();
			case OWSPackage.WGS84_BOUNDING_BOX_TYPE: return createWGS84BoundingBoxType();
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
			case OWSPackage.RANGE_CLOSURE_TYPE:
				return createRangeClosureTypeFromString(eDataType, initialValue);
			case OWSPackage.MIME_TYPE:
				return createMimeTypeFromString(eDataType, initialValue);
			case OWSPackage.POSITION_TYPE:
				return createPositionTypeFromString(eDataType, initialValue);
			case OWSPackage.POSITION_TYPE2_D:
				return createPositionType2DFromString(eDataType, initialValue);
			case OWSPackage.RANGE_CLOSURE_TYPE_OBJECT:
				return createRangeClosureTypeObjectFromString(eDataType, initialValue);
			case OWSPackage.SERVICE_TYPE:
				return createServiceTypeFromString(eDataType, initialValue);
			case OWSPackage.UPDATE_SEQUENCE_TYPE:
				return createUpdateSequenceTypeFromString(eDataType, initialValue);
			case OWSPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case OWSPackage.VERSION_TYPE1:
				return createVersionType1FromString(eDataType, initialValue);
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
			case OWSPackage.RANGE_CLOSURE_TYPE:
				return convertRangeClosureTypeToString(eDataType, instanceValue);
			case OWSPackage.MIME_TYPE:
				return convertMimeTypeToString(eDataType, instanceValue);
			case OWSPackage.POSITION_TYPE:
				return convertPositionTypeToString(eDataType, instanceValue);
			case OWSPackage.POSITION_TYPE2_D:
				return convertPositionType2DToString(eDataType, instanceValue);
			case OWSPackage.RANGE_CLOSURE_TYPE_OBJECT:
				return convertRangeClosureTypeObjectToString(eDataType, instanceValue);
			case OWSPackage.SERVICE_TYPE:
				return convertServiceTypeToString(eDataType, instanceValue);
			case OWSPackage.UPDATE_SEQUENCE_TYPE:
				return convertUpdateSequenceTypeToString(eDataType, instanceValue);
			case OWSPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case OWSPackage.VERSION_TYPE1:
				return convertVersionType1ToString(eDataType, instanceValue);
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
	public AbstractReferenceBaseType createAbstractReferenceBaseType() {
		AbstractReferenceBaseTypeImpl abstractReferenceBaseType = new AbstractReferenceBaseTypeImpl();
		return abstractReferenceBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptFormatsType createAcceptFormatsType() {
		AcceptFormatsTypeImpl acceptFormatsType = new AcceptFormatsTypeImpl();
		return acceptFormatsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptVersionsType createAcceptVersionsType() {
		AcceptVersionsTypeImpl acceptVersionsType = new AcceptVersionsTypeImpl();
		return acceptVersionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowedValuesType createAllowedValuesType() {
		AllowedValuesTypeImpl allowedValuesType = new AllowedValuesTypeImpl();
		return allowedValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyValueType createAnyValueType() {
		AnyValueTypeImpl anyValueType = new AnyValueTypeImpl();
		return anyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicIdentificationType createBasicIdentificationType() {
		BasicIdentificationTypeImpl basicIdentificationType = new BasicIdentificationTypeImpl();
		return basicIdentificationType;
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
	public CapabilitiesBaseType createCapabilitiesBaseType() {
		CapabilitiesBaseTypeImpl capabilitiesBaseType = new CapabilitiesBaseTypeImpl();
		return capabilitiesBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType createCodeType() {
		CodeTypeImpl codeType = new CodeTypeImpl();
		return codeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactType createContactType() {
		ContactTypeImpl contactType = new ContactTypeImpl();
		return contactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentsBaseType createContentsBaseType() {
		ContentsBaseTypeImpl contentsBaseType = new ContentsBaseTypeImpl();
		return contentsBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetDescriptionSummaryBaseType createDatasetDescriptionSummaryBaseType() {
		DatasetDescriptionSummaryBaseTypeImpl datasetDescriptionSummaryBaseType = new DatasetDescriptionSummaryBaseTypeImpl();
		return datasetDescriptionSummaryBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCPType createDCPType() {
		DCPTypeImpl dcpType = new DCPTypeImpl();
		return dcpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
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
	public DomainMetadataType createDomainMetadataType() {
		DomainMetadataTypeImpl domainMetadataType = new DomainMetadataTypeImpl();
		return domainMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainType createDomainType() {
		DomainTypeImpl domainType = new DomainTypeImpl();
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionReportType createExceptionReportType() {
		ExceptionReportTypeImpl exceptionReportType = new ExceptionReportTypeImpl();
		return exceptionReportType;
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
	public GetCapabilitiesType createGetCapabilitiesType() {
		GetCapabilitiesTypeImpl getCapabilitiesType = new GetCapabilitiesTypeImpl();
		return getCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetResourceByIdType createGetResourceByIdType() {
		GetResourceByIdTypeImpl getResourceByIdType = new GetResourceByIdTypeImpl();
		return getResourceByIdType;
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
	public IdentificationType createIdentificationType() {
		IdentificationTypeImpl identificationType = new IdentificationTypeImpl();
		return identificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordsType createKeywordsType() {
		KeywordsTypeImpl keywordsType = new KeywordsTypeImpl();
		return keywordsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageStringType createLanguageStringType() {
		LanguageStringTypeImpl languageStringType = new LanguageStringTypeImpl();
		return languageStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestType createManifestType() {
		ManifestTypeImpl manifestType = new ManifestTypeImpl();
		return manifestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataType createMetadataType() {
		MetadataTypeImpl metadataType = new MetadataTypeImpl();
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoValuesType createNoValuesType() {
		NoValuesTypeImpl noValuesType = new NoValuesTypeImpl();
		return noValuesType;
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
	public OperationsMetadataType createOperationsMetadataType() {
		OperationsMetadataTypeImpl operationsMetadataType = new OperationsMetadataTypeImpl();
		return operationsMetadataType;
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
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceGroupType createReferenceGroupType() {
		ReferenceGroupTypeImpl referenceGroupType = new ReferenceGroupTypeImpl();
		return referenceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestMethodType createRequestMethodType() {
		RequestMethodTypeImpl requestMethodType = new RequestMethodTypeImpl();
		return requestMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsiblePartySubsetType createResponsiblePartySubsetType() {
		ResponsiblePartySubsetTypeImpl responsiblePartySubsetType = new ResponsiblePartySubsetTypeImpl();
		return responsiblePartySubsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsiblePartyType createResponsiblePartyType() {
		ResponsiblePartyTypeImpl responsiblePartyType = new ResponsiblePartyTypeImpl();
		return responsiblePartyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionsType createSectionsType() {
		SectionsTypeImpl sectionsType = new SectionsTypeImpl();
		return sectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentificationType createServiceIdentificationType() {
		ServiceIdentificationTypeImpl serviceIdentificationType = new ServiceIdentificationTypeImpl();
		return serviceIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceProviderType createServiceProviderType() {
		ServiceProviderTypeImpl serviceProviderType = new ServiceProviderTypeImpl();
		return serviceProviderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceReferenceType createServiceReferenceType() {
		ServiceReferenceTypeImpl serviceReferenceType = new ServiceReferenceTypeImpl();
		return serviceReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelephoneType createTelephoneType() {
		TelephoneTypeImpl telephoneType = new TelephoneTypeImpl();
		return telephoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnNamedDomainType createUnNamedDomainType() {
		UnNamedDomainTypeImpl unNamedDomainType = new UnNamedDomainTypeImpl();
		return unNamedDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuesReferenceType createValuesReferenceType() {
		ValuesReferenceTypeImpl valuesReferenceType = new ValuesReferenceTypeImpl();
		return valuesReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WGS84BoundingBoxType createWGS84BoundingBoxType() {
		WGS84BoundingBoxTypeImpl wgs84BoundingBoxType = new WGS84BoundingBoxTypeImpl();
		return wgs84BoundingBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeClosureType createRangeClosureTypeFromString(EDataType eDataType, String initialValue) {
		RangeClosureType result = RangeClosureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeClosureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMimeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createPositionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createPositionType2DFromString(EDataType eDataType, String initialValue) {
		return createPositionTypeFromString(OWSPackage.Literals.POSITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType2DToString(EDataType eDataType, Object instanceValue) {
		return convertPositionTypeToString(OWSPackage.Literals.POSITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeClosureType createRangeClosureTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeClosureTypeFromString(OWSPackage.Literals.RANGE_CLOSURE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeClosureTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeClosureTypeToString(OWSPackage.Literals.RANGE_CLOSURE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUpdateSequenceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OWSPackage getOWSPackage() {
		return (OWSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OWSPackage getPackage() {
		return OWSPackage.eINSTANCE;
	}

} //OWSFactoryImpl
