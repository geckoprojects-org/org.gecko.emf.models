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
package net.opengis.wfs.impl;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import net.opengis.wfs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WFSFactoryImpl extends EFactoryImpl implements WFSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WFSFactory init() {
		try {
			WFSFactory theWFSFactory = (WFSFactory)EPackage.Registry.INSTANCE.getEFactory(WFSPackage.eNS_URI);
			if (theWFSFactory != null) {
				return theWFSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WFSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFSFactoryImpl() {
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
			case WFSPackage.ABSTRACT_TYPE: return createAbstractType();
			case WFSPackage.ACTION_RESULTS_TYPE: return createActionResultsType();
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE: return createAdditionalObjectsType();
			case WFSPackage.ADDITIONAL_VALUES_TYPE: return createAdditionalValuesType();
			case WFSPackage.CREATED_OR_MODIFIED_FEATURE_TYPE: return createCreatedOrModifiedFeatureType();
			case WFSPackage.CREATE_STORED_QUERY_RESPONSE_TYPE: return createCreateStoredQueryResponseType();
			case WFSPackage.CREATE_STORED_QUERY_TYPE: return createCreateStoredQueryType();
			case WFSPackage.DELETE_TYPE: return createDeleteType();
			case WFSPackage.DESCRIBE_FEATURE_TYPE_TYPE: return createDescribeFeatureTypeType();
			case WFSPackage.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE: return createDescribeStoredQueriesResponseType();
			case WFSPackage.DESCRIBE_STORED_QUERIES_TYPE: return createDescribeStoredQueriesType();
			case WFSPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case WFSPackage.DROP_STORED_QUERY_TYPE: return createDropStoredQueryType();
			case WFSPackage.ELEMENT_TYPE: return createElementType();
			case WFSPackage.EMPTY_TYPE: return createEmptyType();
			case WFSPackage.ENVELOPE_PROPERTY_TYPE: return createEnvelopePropertyType();
			case WFSPackage.EXECUTION_STATUS_TYPE: return createExecutionStatusType();
			case WFSPackage.EXTENDED_DESCRIPTION_TYPE: return createExtendedDescriptionType();
			case WFSPackage.FEATURE_COLLECTION_TYPE: return createFeatureCollectionType();
			case WFSPackage.FEATURES_LOCKED_TYPE: return createFeaturesLockedType();
			case WFSPackage.FEATURES_NOT_LOCKED_TYPE: return createFeaturesNotLockedType();
			case WFSPackage.FEATURE_TYPE_LIST_TYPE: return createFeatureTypeListType();
			case WFSPackage.FEATURE_TYPE_TYPE: return createFeatureTypeType();
			case WFSPackage.GET_CAPABILITIES_TYPE: return createGetCapabilitiesType();
			case WFSPackage.GET_FEATURE_TYPE: return createGetFeatureType();
			case WFSPackage.GET_FEATURE_WITH_LOCK_TYPE: return createGetFeatureWithLockType();
			case WFSPackage.GET_PROPERTY_VALUE_TYPE: return createGetPropertyValueType();
			case WFSPackage.INSERT_TYPE: return createInsertType();
			case WFSPackage.LIST_STORED_QUERIES_RESPONSE_TYPE: return createListStoredQueriesResponseType();
			case WFSPackage.LIST_STORED_QUERIES_TYPE: return createListStoredQueriesType();
			case WFSPackage.LOCK_FEATURE_RESPONSE_TYPE: return createLockFeatureResponseType();
			case WFSPackage.LOCK_FEATURE_TYPE: return createLockFeatureType();
			case WFSPackage.MEMBER_PROPERTY_TYPE: return createMemberPropertyType();
			case WFSPackage.METADATA_URL_TYPE: return createMetadataURLType();
			case WFSPackage.NATIVE_TYPE: return createNativeType();
			case WFSPackage.NO_CRS_TYPE: return createNoCRSType();
			case WFSPackage.OUTPUT_FORMAT_LIST_TYPE: return createOutputFormatListType();
			case WFSPackage.PARAMETER_EXPRESSION_TYPE: return createParameterExpressionType();
			case WFSPackage.PARAMETER_TYPE: return createParameterType();
			case WFSPackage.PROPERTY_NAME_TYPE: return createPropertyNameType();
			case WFSPackage.PROPERTY_TYPE: return createPropertyType();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE: return createQueryExpressionTextType();
			case WFSPackage.QUERY_TYPE: return createQueryType();
			case WFSPackage.REPLACE_TYPE: return createReplaceType();
			case WFSPackage.SIMPLE_FEATURE_COLLECTION_TYPE: return createSimpleFeatureCollectionType();
			case WFSPackage.STORED_QUERY_DESCRIPTION_TYPE: return createStoredQueryDescriptionType();
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE: return createStoredQueryListItemType();
			case WFSPackage.STORED_QUERY_TYPE: return createStoredQueryType();
			case WFSPackage.TITLE_TYPE: return createTitleType();
			case WFSPackage.TRANSACTION_RESPONSE_TYPE: return createTransactionResponseType();
			case WFSPackage.TRANSACTION_SUMMARY_TYPE: return createTransactionSummaryType();
			case WFSPackage.TRANSACTION_TYPE: return createTransactionType();
			case WFSPackage.TRUNCATED_RESPONSE_TYPE: return createTruncatedResponseType();
			case WFSPackage.TUPLE_TYPE: return createTupleType();
			case WFSPackage.UPDATE_TYPE: return createUpdateType();
			case WFSPackage.VALUE_COLLECTION_TYPE: return createValueCollectionType();
			case WFSPackage.VALUE_LIST_TYPE: return createValueListType();
			case WFSPackage.VALUE_REFERENCE_TYPE: return createValueReferenceType();
			case WFSPackage.WFS_CAPABILITIES_TYPE: return createWFSCapabilitiesType();
			case WFSPackage.WSDL_TYPE: return createWSDLType();
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
			case WFSPackage.ALL_SOME_TYPE:
				return createAllSomeTypeFromString(eDataType, initialValue);
			case WFSPackage.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0:
				return createNonNegativeIntegerOrUnknownMember0FromString(eDataType, initialValue);
			case WFSPackage.RESOLVE_VALUE_TYPE:
				return createResolveValueTypeFromString(eDataType, initialValue);
			case WFSPackage.RESULT_TYPE_TYPE:
				return createResultTypeTypeFromString(eDataType, initialValue);
			case WFSPackage.STAR_STRING_TYPE:
				return createStarStringTypeFromString(eDataType, initialValue);
			case WFSPackage.STATE_VALUE_TYPE_MEMBER0:
				return createStateValueTypeMember0FromString(eDataType, initialValue);
			case WFSPackage.UPDATE_ACTION_TYPE:
				return createUpdateActionTypeFromString(eDataType, initialValue);
			case WFSPackage.ALL_SOME_TYPE_OBJECT:
				return createAllSomeTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.NON_NEGATIVE_INTEGER_OR_UNKNOWN:
				return createNonNegativeIntegerOrUnknownFromString(eDataType, initialValue);
			case WFSPackage.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0_OBJECT:
				return createNonNegativeIntegerOrUnknownMember0ObjectFromString(eDataType, initialValue);
			case WFSPackage.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER1:
				return createNonNegativeIntegerOrUnknownMember1FromString(eDataType, initialValue);
			case WFSPackage.POSITIVE_INTEGER_WITH_STAR:
				return createPositiveIntegerWithStarFromString(eDataType, initialValue);
			case WFSPackage.RESOLVE_VALUE_TYPE_OBJECT:
				return createResolveValueTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.RESULT_TYPE_TYPE_OBJECT:
				return createResultTypeTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.RETURN_FEATURE_TYPES_LIST_TYPE:
				return createReturnFeatureTypesListTypeFromString(eDataType, initialValue);
			case WFSPackage.STAR_STRING_TYPE_OBJECT:
				return createStarStringTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.STATE_VALUE_TYPE:
				return createStateValueTypeFromString(eDataType, initialValue);
			case WFSPackage.STATE_VALUE_TYPE_MEMBER0_OBJECT:
				return createStateValueTypeMember0ObjectFromString(eDataType, initialValue);
			case WFSPackage.STATE_VALUE_TYPE_MEMBER1:
				return createStateValueTypeMember1FromString(eDataType, initialValue);
			case WFSPackage.UPDATE_ACTION_TYPE_OBJECT:
				return createUpdateActionTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.VERSION_STRING_TYPE:
				return createVersionStringTypeFromString(eDataType, initialValue);
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
			case WFSPackage.ALL_SOME_TYPE:
				return convertAllSomeTypeToString(eDataType, instanceValue);
			case WFSPackage.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0:
				return convertNonNegativeIntegerOrUnknownMember0ToString(eDataType, instanceValue);
			case WFSPackage.RESOLVE_VALUE_TYPE:
				return convertResolveValueTypeToString(eDataType, instanceValue);
			case WFSPackage.RESULT_TYPE_TYPE:
				return convertResultTypeTypeToString(eDataType, instanceValue);
			case WFSPackage.STAR_STRING_TYPE:
				return convertStarStringTypeToString(eDataType, instanceValue);
			case WFSPackage.STATE_VALUE_TYPE_MEMBER0:
				return convertStateValueTypeMember0ToString(eDataType, instanceValue);
			case WFSPackage.UPDATE_ACTION_TYPE:
				return convertUpdateActionTypeToString(eDataType, instanceValue);
			case WFSPackage.ALL_SOME_TYPE_OBJECT:
				return convertAllSomeTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.NON_NEGATIVE_INTEGER_OR_UNKNOWN:
				return convertNonNegativeIntegerOrUnknownToString(eDataType, instanceValue);
			case WFSPackage.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0_OBJECT:
				return convertNonNegativeIntegerOrUnknownMember0ObjectToString(eDataType, instanceValue);
			case WFSPackage.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER1:
				return convertNonNegativeIntegerOrUnknownMember1ToString(eDataType, instanceValue);
			case WFSPackage.POSITIVE_INTEGER_WITH_STAR:
				return convertPositiveIntegerWithStarToString(eDataType, instanceValue);
			case WFSPackage.RESOLVE_VALUE_TYPE_OBJECT:
				return convertResolveValueTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.RESULT_TYPE_TYPE_OBJECT:
				return convertResultTypeTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.RETURN_FEATURE_TYPES_LIST_TYPE:
				return convertReturnFeatureTypesListTypeToString(eDataType, instanceValue);
			case WFSPackage.STAR_STRING_TYPE_OBJECT:
				return convertStarStringTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.STATE_VALUE_TYPE:
				return convertStateValueTypeToString(eDataType, instanceValue);
			case WFSPackage.STATE_VALUE_TYPE_MEMBER0_OBJECT:
				return convertStateValueTypeMember0ObjectToString(eDataType, instanceValue);
			case WFSPackage.STATE_VALUE_TYPE_MEMBER1:
				return convertStateValueTypeMember1ToString(eDataType, instanceValue);
			case WFSPackage.UPDATE_ACTION_TYPE_OBJECT:
				return convertUpdateActionTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.VERSION_STRING_TYPE:
				return convertVersionStringTypeToString(eDataType, instanceValue);
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
	public AbstractType createAbstractType() {
		AbstractTypeImpl abstractType = new AbstractTypeImpl();
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionResultsType createActionResultsType() {
		ActionResultsTypeImpl actionResultsType = new ActionResultsTypeImpl();
		return actionResultsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalObjectsType createAdditionalObjectsType() {
		AdditionalObjectsTypeImpl additionalObjectsType = new AdditionalObjectsTypeImpl();
		return additionalObjectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalValuesType createAdditionalValuesType() {
		AdditionalValuesTypeImpl additionalValuesType = new AdditionalValuesTypeImpl();
		return additionalValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreatedOrModifiedFeatureType createCreatedOrModifiedFeatureType() {
		CreatedOrModifiedFeatureTypeImpl createdOrModifiedFeatureType = new CreatedOrModifiedFeatureTypeImpl();
		return createdOrModifiedFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateStoredQueryResponseType createCreateStoredQueryResponseType() {
		CreateStoredQueryResponseTypeImpl createStoredQueryResponseType = new CreateStoredQueryResponseTypeImpl();
		return createStoredQueryResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateStoredQueryType createCreateStoredQueryType() {
		CreateStoredQueryTypeImpl createStoredQueryType = new CreateStoredQueryTypeImpl();
		return createStoredQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteType createDeleteType() {
		DeleteTypeImpl deleteType = new DeleteTypeImpl();
		return deleteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescribeFeatureTypeType createDescribeFeatureTypeType() {
		DescribeFeatureTypeTypeImpl describeFeatureTypeType = new DescribeFeatureTypeTypeImpl();
		return describeFeatureTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescribeStoredQueriesResponseType createDescribeStoredQueriesResponseType() {
		DescribeStoredQueriesResponseTypeImpl describeStoredQueriesResponseType = new DescribeStoredQueriesResponseTypeImpl();
		return describeStoredQueriesResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescribeStoredQueriesType createDescribeStoredQueriesType() {
		DescribeStoredQueriesTypeImpl describeStoredQueriesType = new DescribeStoredQueriesTypeImpl();
		return describeStoredQueriesType;
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
	public DropStoredQueryType createDropStoredQueryType() {
		DropStoredQueryTypeImpl dropStoredQueryType = new DropStoredQueryTypeImpl();
		return dropStoredQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyType createEmptyType() {
		EmptyTypeImpl emptyType = new EmptyTypeImpl();
		return emptyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvelopePropertyType createEnvelopePropertyType() {
		EnvelopePropertyTypeImpl envelopePropertyType = new EnvelopePropertyTypeImpl();
		return envelopePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionStatusType createExecutionStatusType() {
		ExecutionStatusTypeImpl executionStatusType = new ExecutionStatusTypeImpl();
		return executionStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendedDescriptionType createExtendedDescriptionType() {
		ExtendedDescriptionTypeImpl extendedDescriptionType = new ExtendedDescriptionTypeImpl();
		return extendedDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCollectionType createFeatureCollectionType() {
		FeatureCollectionTypeImpl featureCollectionType = new FeatureCollectionTypeImpl();
		return featureCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturesLockedType createFeaturesLockedType() {
		FeaturesLockedTypeImpl featuresLockedType = new FeaturesLockedTypeImpl();
		return featuresLockedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturesNotLockedType createFeaturesNotLockedType() {
		FeaturesNotLockedTypeImpl featuresNotLockedType = new FeaturesNotLockedTypeImpl();
		return featuresNotLockedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureTypeListType createFeatureTypeListType() {
		FeatureTypeListTypeImpl featureTypeListType = new FeatureTypeListTypeImpl();
		return featureTypeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureTypeType createFeatureTypeType() {
		FeatureTypeTypeImpl featureTypeType = new FeatureTypeTypeImpl();
		return featureTypeType;
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
	public GetFeatureType createGetFeatureType() {
		GetFeatureTypeImpl getFeatureType = new GetFeatureTypeImpl();
		return getFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetFeatureWithLockType createGetFeatureWithLockType() {
		GetFeatureWithLockTypeImpl getFeatureWithLockType = new GetFeatureWithLockTypeImpl();
		return getFeatureWithLockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPropertyValueType createGetPropertyValueType() {
		GetPropertyValueTypeImpl getPropertyValueType = new GetPropertyValueTypeImpl();
		return getPropertyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertType createInsertType() {
		InsertTypeImpl insertType = new InsertTypeImpl();
		return insertType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStoredQueriesResponseType createListStoredQueriesResponseType() {
		ListStoredQueriesResponseTypeImpl listStoredQueriesResponseType = new ListStoredQueriesResponseTypeImpl();
		return listStoredQueriesResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStoredQueriesType createListStoredQueriesType() {
		ListStoredQueriesTypeImpl listStoredQueriesType = new ListStoredQueriesTypeImpl();
		return listStoredQueriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LockFeatureResponseType createLockFeatureResponseType() {
		LockFeatureResponseTypeImpl lockFeatureResponseType = new LockFeatureResponseTypeImpl();
		return lockFeatureResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LockFeatureType createLockFeatureType() {
		LockFeatureTypeImpl lockFeatureType = new LockFeatureTypeImpl();
		return lockFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberPropertyType createMemberPropertyType() {
		MemberPropertyTypeImpl memberPropertyType = new MemberPropertyTypeImpl();
		return memberPropertyType;
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
	public NativeType createNativeType() {
		NativeTypeImpl nativeType = new NativeTypeImpl();
		return nativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoCRSType createNoCRSType() {
		NoCRSTypeImpl noCRSType = new NoCRSTypeImpl();
		return noCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputFormatListType createOutputFormatListType() {
		OutputFormatListTypeImpl outputFormatListType = new OutputFormatListTypeImpl();
		return outputFormatListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterExpressionType createParameterExpressionType() {
		ParameterExpressionTypeImpl parameterExpressionType = new ParameterExpressionTypeImpl();
		return parameterExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyNameType createPropertyNameType() {
		PropertyNameTypeImpl propertyNameType = new PropertyNameTypeImpl();
		return propertyNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryExpressionTextType createQueryExpressionTextType() {
		QueryExpressionTextTypeImpl queryExpressionTextType = new QueryExpressionTextTypeImpl();
		return queryExpressionTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryType createQueryType() {
		QueryTypeImpl queryType = new QueryTypeImpl();
		return queryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplaceType createReplaceType() {
		ReplaceTypeImpl replaceType = new ReplaceTypeImpl();
		return replaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleFeatureCollectionType createSimpleFeatureCollectionType() {
		SimpleFeatureCollectionTypeImpl simpleFeatureCollectionType = new SimpleFeatureCollectionTypeImpl();
		return simpleFeatureCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoredQueryDescriptionType createStoredQueryDescriptionType() {
		StoredQueryDescriptionTypeImpl storedQueryDescriptionType = new StoredQueryDescriptionTypeImpl();
		return storedQueryDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoredQueryListItemType createStoredQueryListItemType() {
		StoredQueryListItemTypeImpl storedQueryListItemType = new StoredQueryListItemTypeImpl();
		return storedQueryListItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoredQueryType createStoredQueryType() {
		StoredQueryTypeImpl storedQueryType = new StoredQueryTypeImpl();
		return storedQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionResponseType createTransactionResponseType() {
		TransactionResponseTypeImpl transactionResponseType = new TransactionResponseTypeImpl();
		return transactionResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionSummaryType createTransactionSummaryType() {
		TransactionSummaryTypeImpl transactionSummaryType = new TransactionSummaryTypeImpl();
		return transactionSummaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionType createTransactionType() {
		TransactionTypeImpl transactionType = new TransactionTypeImpl();
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TruncatedResponseType createTruncatedResponseType() {
		TruncatedResponseTypeImpl truncatedResponseType = new TruncatedResponseTypeImpl();
		return truncatedResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType createUpdateType() {
		UpdateTypeImpl updateType = new UpdateTypeImpl();
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueCollectionType createValueCollectionType() {
		ValueCollectionTypeImpl valueCollectionType = new ValueCollectionTypeImpl();
		return valueCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueListType createValueListType() {
		ValueListTypeImpl valueListType = new ValueListTypeImpl();
		return valueListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueReferenceType createValueReferenceType() {
		ValueReferenceTypeImpl valueReferenceType = new ValueReferenceTypeImpl();
		return valueReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFSCapabilitiesType createWFSCapabilitiesType() {
		WFSCapabilitiesTypeImpl wfsCapabilitiesType = new WFSCapabilitiesTypeImpl();
		return wfsCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSDLType createWSDLType() {
		WSDLTypeImpl wsdlType = new WSDLTypeImpl();
		return wsdlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllSomeType createAllSomeTypeFromString(EDataType eDataType, String initialValue) {
		AllSomeType result = AllSomeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllSomeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerOrUnknownMember0 createNonNegativeIntegerOrUnknownMember0FromString(EDataType eDataType, String initialValue) {
		NonNegativeIntegerOrUnknownMember0 result = NonNegativeIntegerOrUnknownMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntegerOrUnknownMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveValueType createResolveValueTypeFromString(EDataType eDataType, String initialValue) {
		ResolveValueType result = ResolveValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeType createResultTypeTypeFromString(EDataType eDataType, String initialValue) {
		ResultTypeType result = ResultTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StarStringType createStarStringTypeFromString(EDataType eDataType, String initialValue) {
		StarStringType result = StarStringType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStarStringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateValueTypeMember0 createStateValueTypeMember0FromString(EDataType eDataType, String initialValue) {
		StateValueTypeMember0 result = StateValueTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateValueTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateActionType createUpdateActionTypeFromString(EDataType eDataType, String initialValue) {
		UpdateActionType result = UpdateActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllSomeType createAllSomeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAllSomeTypeFromString(WFSPackage.Literals.ALL_SOME_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllSomeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllSomeTypeToString(WFSPackage.Literals.ALL_SOME_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNonNegativeIntegerOrUnknownFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNonNegativeIntegerOrUnknownMember0FromString(WFSPackage.Literals.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonNegativeIntegerOrUnknownMember1FromString(WFSPackage.Literals.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntegerOrUnknownToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (WFSPackage.Literals.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertNonNegativeIntegerOrUnknownMember0ToString(WFSPackage.Literals.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (WFSPackage.Literals.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertNonNegativeIntegerOrUnknownMember1ToString(WFSPackage.Literals.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerOrUnknownMember0 createNonNegativeIntegerOrUnknownMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeIntegerOrUnknownMember0FromString(WFSPackage.Literals.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntegerOrUnknownMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeIntegerOrUnknownMember0ToString(WFSPackage.Literals.NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNonNegativeIntegerOrUnknownMember1FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntegerOrUnknownMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPositiveIntegerWithStarFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStarStringTypeFromString(WFSPackage.Literals.STAR_STRING_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerWithStarToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.POSITIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (WFSPackage.Literals.STAR_STRING_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertStarStringTypeToString(WFSPackage.Literals.STAR_STRING_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveValueType createResolveValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResolveValueTypeFromString(WFSPackage.Literals.RESOLVE_VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResolveValueTypeToString(WFSPackage.Literals.RESOLVE_VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeType createResultTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResultTypeTypeFromString(WFSPackage.Literals.RESULT_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResultTypeTypeToString(WFSPackage.Literals.RESULT_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> createReturnFeatureTypesListTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<QName> result = new ArrayList<QName>();
		for (String item : split(initialValue)) {
			result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnFeatureTypesListTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StarStringType createStarStringTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStarStringTypeFromString(WFSPackage.Literals.STAR_STRING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStarStringTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStarStringTypeToString(WFSPackage.Literals.STAR_STRING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStateValueTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createStateValueTypeMember0FromString(WFSPackage.Literals.STATE_VALUE_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStateValueTypeMember1FromString(WFSPackage.Literals.STATE_VALUE_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateValueTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (WFSPackage.Literals.STATE_VALUE_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertStateValueTypeMember0ToString(WFSPackage.Literals.STATE_VALUE_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (WFSPackage.Literals.STATE_VALUE_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertStateValueTypeMember1ToString(WFSPackage.Literals.STATE_VALUE_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateValueTypeMember0 createStateValueTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createStateValueTypeMember0FromString(WFSPackage.Literals.STATE_VALUE_TYPE_MEMBER0, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateValueTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStateValueTypeMember0ToString(WFSPackage.Literals.STATE_VALUE_TYPE_MEMBER0, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStateValueTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateValueTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateActionType createUpdateActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateActionTypeFromString(WFSPackage.Literals.UPDATE_ACTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateActionTypeToString(WFSPackage.Literals.UPDATE_ACTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionStringTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionStringTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFSPackage getWFSPackage() {
		return (WFSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WFSPackage getPackage() {
		return WFSPackage.eINSTANCE;
	}

} //WFSFactoryImpl
