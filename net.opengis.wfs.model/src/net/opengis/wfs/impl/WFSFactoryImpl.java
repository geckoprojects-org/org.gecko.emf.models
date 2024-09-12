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
			case WFSPackage.ACTION_TYPE: return createActionType();
			case WFSPackage.DELETE_ELEMENT_TYPE: return createDeleteElementType();
			case WFSPackage.DESCRIBE_FEATURE_TYPE_TYPE: return createDescribeFeatureTypeType();
			case WFSPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case WFSPackage.FEATURE_COLLECTION_TYPE: return createFeatureCollectionType();
			case WFSPackage.FEATURES_LOCKED_TYPE: return createFeaturesLockedType();
			case WFSPackage.FEATURES_NOT_LOCKED_TYPE: return createFeaturesNotLockedType();
			case WFSPackage.FEATURE_TYPE_LIST_TYPE: return createFeatureTypeListType();
			case WFSPackage.FEATURE_TYPE_TYPE: return createFeatureTypeType();
			case WFSPackage.GET_CAPABILITIES_TYPE: return createGetCapabilitiesType();
			case WFSPackage.GET_FEATURE_TYPE: return createGetFeatureType();
			case WFSPackage.GET_FEATURE_WITH_LOCK_TYPE: return createGetFeatureWithLockType();
			case WFSPackage.GET_GML_OBJECT_TYPE: return createGetGmlObjectType();
			case WFSPackage.GML_OBJECT_TYPE_LIST_TYPE: return createGMLObjectTypeListType();
			case WFSPackage.GML_OBJECT_TYPE_TYPE: return createGMLObjectTypeType();
			case WFSPackage.INSERTED_FEATURE_TYPE: return createInsertedFeatureType();
			case WFSPackage.INSERT_ELEMENT_TYPE: return createInsertElementType();
			case WFSPackage.INSERT_RESULTS_TYPE: return createInsertResultsType();
			case WFSPackage.LOCK_FEATURE_RESPONSE_TYPE: return createLockFeatureResponseType();
			case WFSPackage.LOCK_FEATURE_TYPE: return createLockFeatureType();
			case WFSPackage.LOCK_TYPE: return createLockType();
			case WFSPackage.METADATA_URL_TYPE: return createMetadataURLType();
			case WFSPackage.NATIVE_TYPE: return createNativeType();
			case WFSPackage.NO_SRS_TYPE: return createNoSRSType();
			case WFSPackage.OPERATIONS_TYPE: return createOperationsType();
			case WFSPackage.OUTPUT_FORMAT_LIST_TYPE: return createOutputFormatListType();
			case WFSPackage.PROPERTY_TYPE: return createPropertyType();
			case WFSPackage.QUERY_TYPE: return createQueryType();
			case WFSPackage.TRANSACTION_RESPONSE_TYPE: return createTransactionResponseType();
			case WFSPackage.TRANSACTION_RESULTS_TYPE: return createTransactionResultsType();
			case WFSPackage.TRANSACTION_SUMMARY_TYPE: return createTransactionSummaryType();
			case WFSPackage.TRANSACTION_TYPE: return createTransactionType();
			case WFSPackage.UPDATE_ELEMENT_TYPE: return createUpdateElementType();
			case WFSPackage.WFS_CAPABILITIES_TYPE: return createWFSCapabilitiesType();
			case WFSPackage.XLINK_PROPERTY_NAME_TYPE: return createXlinkPropertyNameType();
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
			case WFSPackage.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			case WFSPackage.IDENTIFIER_GENERATION_OPTION_TYPE:
				return createIdentifierGenerationOptionTypeFromString(eDataType, initialValue);
			case WFSPackage.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
			case WFSPackage.RESULT_TYPE_TYPE:
				return createResultTypeTypeFromString(eDataType, initialValue);
			case WFSPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case WFSPackage.ALL_SOME_TYPE_OBJECT:
				return createAllSomeTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.BASE_TYPE_NAME_LIST_TYPE:
				return createBaseTypeNameListTypeFromString(eDataType, initialValue);
			case WFSPackage.FORMAT_TYPE_OBJECT:
				return createFormatTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.IDENTIFIER_GENERATION_OPTION_TYPE_OBJECT:
				return createIdentifierGenerationOptionTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.OPERATION_TYPE_OBJECT:
				return createOperationTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.RESULT_TYPE_TYPE_OBJECT:
				return createResultTypeTypeObjectFromString(eDataType, initialValue);
			case WFSPackage.TYPE_NAME_LIST_TYPE:
				return createTypeNameListTypeFromString(eDataType, initialValue);
			case WFSPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
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
			case WFSPackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			case WFSPackage.IDENTIFIER_GENERATION_OPTION_TYPE:
				return convertIdentifierGenerationOptionTypeToString(eDataType, instanceValue);
			case WFSPackage.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
			case WFSPackage.RESULT_TYPE_TYPE:
				return convertResultTypeTypeToString(eDataType, instanceValue);
			case WFSPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case WFSPackage.ALL_SOME_TYPE_OBJECT:
				return convertAllSomeTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.BASE_TYPE_NAME_LIST_TYPE:
				return convertBaseTypeNameListTypeToString(eDataType, instanceValue);
			case WFSPackage.FORMAT_TYPE_OBJECT:
				return convertFormatTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.IDENTIFIER_GENERATION_OPTION_TYPE_OBJECT:
				return convertIdentifierGenerationOptionTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.OPERATION_TYPE_OBJECT:
				return convertOperationTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.RESULT_TYPE_TYPE_OBJECT:
				return convertResultTypeTypeObjectToString(eDataType, instanceValue);
			case WFSPackage.TYPE_NAME_LIST_TYPE:
				return convertTypeNameListTypeToString(eDataType, instanceValue);
			case WFSPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
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
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteElementType createDeleteElementType() {
		DeleteElementTypeImpl deleteElementType = new DeleteElementTypeImpl();
		return deleteElementType;
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
	public GetGmlObjectType createGetGmlObjectType() {
		GetGmlObjectTypeImpl getGmlObjectType = new GetGmlObjectTypeImpl();
		return getGmlObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMLObjectTypeListType createGMLObjectTypeListType() {
		GMLObjectTypeListTypeImpl gmlObjectTypeListType = new GMLObjectTypeListTypeImpl();
		return gmlObjectTypeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMLObjectTypeType createGMLObjectTypeType() {
		GMLObjectTypeTypeImpl gmlObjectTypeType = new GMLObjectTypeTypeImpl();
		return gmlObjectTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertedFeatureType createInsertedFeatureType() {
		InsertedFeatureTypeImpl insertedFeatureType = new InsertedFeatureTypeImpl();
		return insertedFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertElementType createInsertElementType() {
		InsertElementTypeImpl insertElementType = new InsertElementTypeImpl();
		return insertElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertResultsType createInsertResultsType() {
		InsertResultsTypeImpl insertResultsType = new InsertResultsTypeImpl();
		return insertResultsType;
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
	public LockType createLockType() {
		LockTypeImpl lockType = new LockTypeImpl();
		return lockType;
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
	public NoSRSType createNoSRSType() {
		NoSRSTypeImpl noSRSType = new NoSRSTypeImpl();
		return noSRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationsType createOperationsType() {
		OperationsTypeImpl operationsType = new OperationsTypeImpl();
		return operationsType;
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
	public TransactionResultsType createTransactionResultsType() {
		TransactionResultsTypeImpl transactionResultsType = new TransactionResultsTypeImpl();
		return transactionResultsType;
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
	public UpdateElementType createUpdateElementType() {
		UpdateElementTypeImpl updateElementType = new UpdateElementTypeImpl();
		return updateElementType;
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
	public XlinkPropertyNameType createXlinkPropertyNameType() {
		XlinkPropertyNameTypeImpl xlinkPropertyNameType = new XlinkPropertyNameTypeImpl();
		return xlinkPropertyNameType;
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
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierGenerationOptionType createIdentifierGenerationOptionTypeFromString(EDataType eDataType, String initialValue) {
		IdentifierGenerationOptionType result = IdentifierGenerationOptionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierGenerationOptionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		OperationType result = OperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
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
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
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
	public List<QName> createBaseTypeNameListTypeFromString(EDataType eDataType, String initialValue) {
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
	public String convertBaseTypeNameListTypeToString(EDataType eDataType, Object instanceValue) {
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
	public FormatType createFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFormatTypeFromString(WFSPackage.Literals.FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormatTypeToString(WFSPackage.Literals.FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierGenerationOptionType createIdentifierGenerationOptionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentifierGenerationOptionTypeFromString(WFSPackage.Literals.IDENTIFIER_GENERATION_OPTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierGenerationOptionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentifierGenerationOptionTypeToString(WFSPackage.Literals.IDENTIFIER_GENERATION_OPTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationTypeFromString(WFSPackage.Literals.OPERATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationTypeToString(WFSPackage.Literals.OPERATION_TYPE, instanceValue);
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
	public List<QName> createTypeNameListTypeFromString(EDataType eDataType, String initialValue) {
		return createBaseTypeNameListTypeFromString(WFSPackage.Literals.BASE_TYPE_NAME_LIST_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNameListTypeToString(EDataType eDataType, Object instanceValue) {
		return convertBaseTypeNameListTypeToString(WFSPackage.Literals.BASE_TYPE_NAME_LIST_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(WFSPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(WFSPackage.Literals.TYPE_TYPE, instanceValue);
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
