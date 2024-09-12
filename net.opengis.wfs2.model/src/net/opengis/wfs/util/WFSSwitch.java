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
package net.opengis.wfs.util;

import net.opengis.fes.AbstractAdhocQueryExpressionType;
import net.opengis.fes.AbstractQueryExpressionType;

import net.opengis.ows.CapabilitiesBaseType;

import net.opengis.wfs.*;

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
 * @see net.opengis.wfs.WFSPackage
 * @generated
 */
public class WFSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WFSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFSSwitch() {
		if (modelPackage == null) {
			modelPackage = WFSPackage.eINSTANCE;
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
			case WFSPackage.ABSTRACT_TRANSACTION_ACTION_TYPE: {
				AbstractTransactionActionType abstractTransactionActionType = (AbstractTransactionActionType)theEObject;
				T result = caseAbstractTransactionActionType(abstractTransactionActionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.ABSTRACT_TYPE: {
				AbstractType abstractType = (AbstractType)theEObject;
				T result = caseAbstractType(abstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.ACTION_RESULTS_TYPE: {
				ActionResultsType actionResultsType = (ActionResultsType)theEObject;
				T result = caseActionResultsType(actionResultsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE: {
				AdditionalObjectsType additionalObjectsType = (AdditionalObjectsType)theEObject;
				T result = caseAdditionalObjectsType(additionalObjectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.ADDITIONAL_VALUES_TYPE: {
				AdditionalValuesType additionalValuesType = (AdditionalValuesType)theEObject;
				T result = caseAdditionalValuesType(additionalValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.BASE_REQUEST_TYPE: {
				BaseRequestType baseRequestType = (BaseRequestType)theEObject;
				T result = caseBaseRequestType(baseRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.CREATED_OR_MODIFIED_FEATURE_TYPE: {
				CreatedOrModifiedFeatureType createdOrModifiedFeatureType = (CreatedOrModifiedFeatureType)theEObject;
				T result = caseCreatedOrModifiedFeatureType(createdOrModifiedFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.CREATE_STORED_QUERY_RESPONSE_TYPE: {
				CreateStoredQueryResponseType createStoredQueryResponseType = (CreateStoredQueryResponseType)theEObject;
				T result = caseCreateStoredQueryResponseType(createStoredQueryResponseType);
				if (result == null) result = caseExecutionStatusType(createStoredQueryResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.CREATE_STORED_QUERY_TYPE: {
				CreateStoredQueryType createStoredQueryType = (CreateStoredQueryType)theEObject;
				T result = caseCreateStoredQueryType(createStoredQueryType);
				if (result == null) result = caseBaseRequestType(createStoredQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.DELETE_TYPE: {
				DeleteType deleteType = (DeleteType)theEObject;
				T result = caseDeleteType(deleteType);
				if (result == null) result = caseAbstractTransactionActionType(deleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.DESCRIBE_FEATURE_TYPE_TYPE: {
				DescribeFeatureTypeType describeFeatureTypeType = (DescribeFeatureTypeType)theEObject;
				T result = caseDescribeFeatureTypeType(describeFeatureTypeType);
				if (result == null) result = caseBaseRequestType(describeFeatureTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE: {
				DescribeStoredQueriesResponseType describeStoredQueriesResponseType = (DescribeStoredQueriesResponseType)theEObject;
				T result = caseDescribeStoredQueriesResponseType(describeStoredQueriesResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.DESCRIBE_STORED_QUERIES_TYPE: {
				DescribeStoredQueriesType describeStoredQueriesType = (DescribeStoredQueriesType)theEObject;
				T result = caseDescribeStoredQueriesType(describeStoredQueriesType);
				if (result == null) result = caseBaseRequestType(describeStoredQueriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.DROP_STORED_QUERY_TYPE: {
				DropStoredQueryType dropStoredQueryType = (DropStoredQueryType)theEObject;
				T result = caseDropStoredQueryType(dropStoredQueryType);
				if (result == null) result = caseBaseRequestType(dropStoredQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.EMPTY_TYPE: {
				EmptyType emptyType = (EmptyType)theEObject;
				T result = caseEmptyType(emptyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.ENVELOPE_PROPERTY_TYPE: {
				EnvelopePropertyType envelopePropertyType = (EnvelopePropertyType)theEObject;
				T result = caseEnvelopePropertyType(envelopePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.EXECUTION_STATUS_TYPE: {
				ExecutionStatusType executionStatusType = (ExecutionStatusType)theEObject;
				T result = caseExecutionStatusType(executionStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.EXTENDED_DESCRIPTION_TYPE: {
				ExtendedDescriptionType extendedDescriptionType = (ExtendedDescriptionType)theEObject;
				T result = caseExtendedDescriptionType(extendedDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.FEATURE_COLLECTION_TYPE: {
				FeatureCollectionType featureCollectionType = (FeatureCollectionType)theEObject;
				T result = caseFeatureCollectionType(featureCollectionType);
				if (result == null) result = caseSimpleFeatureCollectionType(featureCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.FEATURES_LOCKED_TYPE: {
				FeaturesLockedType featuresLockedType = (FeaturesLockedType)theEObject;
				T result = caseFeaturesLockedType(featuresLockedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.FEATURES_NOT_LOCKED_TYPE: {
				FeaturesNotLockedType featuresNotLockedType = (FeaturesNotLockedType)theEObject;
				T result = caseFeaturesNotLockedType(featuresNotLockedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.FEATURE_TYPE_LIST_TYPE: {
				FeatureTypeListType featureTypeListType = (FeatureTypeListType)theEObject;
				T result = caseFeatureTypeListType(featureTypeListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.FEATURE_TYPE_TYPE: {
				FeatureTypeType featureTypeType = (FeatureTypeType)theEObject;
				T result = caseFeatureTypeType(featureTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.GET_CAPABILITIES_TYPE: {
				GetCapabilitiesType getCapabilitiesType = (GetCapabilitiesType)theEObject;
				T result = caseGetCapabilitiesType(getCapabilitiesType);
				if (result == null) result = caseOWS_GetCapabilitiesType(getCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.GET_FEATURE_TYPE: {
				GetFeatureType getFeatureType = (GetFeatureType)theEObject;
				T result = caseGetFeatureType(getFeatureType);
				if (result == null) result = caseBaseRequestType(getFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.GET_FEATURE_WITH_LOCK_TYPE: {
				GetFeatureWithLockType getFeatureWithLockType = (GetFeatureWithLockType)theEObject;
				T result = caseGetFeatureWithLockType(getFeatureWithLockType);
				if (result == null) result = caseGetFeatureType(getFeatureWithLockType);
				if (result == null) result = caseBaseRequestType(getFeatureWithLockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.GET_PROPERTY_VALUE_TYPE: {
				GetPropertyValueType getPropertyValueType = (GetPropertyValueType)theEObject;
				T result = caseGetPropertyValueType(getPropertyValueType);
				if (result == null) result = caseBaseRequestType(getPropertyValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.INSERT_TYPE: {
				InsertType insertType = (InsertType)theEObject;
				T result = caseInsertType(insertType);
				if (result == null) result = caseAbstractTransactionActionType(insertType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.LIST_STORED_QUERIES_RESPONSE_TYPE: {
				ListStoredQueriesResponseType listStoredQueriesResponseType = (ListStoredQueriesResponseType)theEObject;
				T result = caseListStoredQueriesResponseType(listStoredQueriesResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.LIST_STORED_QUERIES_TYPE: {
				ListStoredQueriesType listStoredQueriesType = (ListStoredQueriesType)theEObject;
				T result = caseListStoredQueriesType(listStoredQueriesType);
				if (result == null) result = caseBaseRequestType(listStoredQueriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.LOCK_FEATURE_RESPONSE_TYPE: {
				LockFeatureResponseType lockFeatureResponseType = (LockFeatureResponseType)theEObject;
				T result = caseLockFeatureResponseType(lockFeatureResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.LOCK_FEATURE_TYPE: {
				LockFeatureType lockFeatureType = (LockFeatureType)theEObject;
				T result = caseLockFeatureType(lockFeatureType);
				if (result == null) result = caseBaseRequestType(lockFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.MEMBER_PROPERTY_TYPE: {
				MemberPropertyType memberPropertyType = (MemberPropertyType)theEObject;
				T result = caseMemberPropertyType(memberPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.METADATA_URL_TYPE: {
				MetadataURLType metadataURLType = (MetadataURLType)theEObject;
				T result = caseMetadataURLType(metadataURLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.NATIVE_TYPE: {
				NativeType nativeType = (NativeType)theEObject;
				T result = caseNativeType(nativeType);
				if (result == null) result = caseAbstractTransactionActionType(nativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.NO_CRS_TYPE: {
				NoCRSType noCRSType = (NoCRSType)theEObject;
				T result = caseNoCRSType(noCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.OUTPUT_FORMAT_LIST_TYPE: {
				OutputFormatListType outputFormatListType = (OutputFormatListType)theEObject;
				T result = caseOutputFormatListType(outputFormatListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.PARAMETER_EXPRESSION_TYPE: {
				ParameterExpressionType parameterExpressionType = (ParameterExpressionType)theEObject;
				T result = caseParameterExpressionType(parameterExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.PROPERTY_NAME_TYPE: {
				PropertyNameType propertyNameType = (PropertyNameType)theEObject;
				T result = casePropertyNameType(propertyNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE: {
				QueryExpressionTextType queryExpressionTextType = (QueryExpressionTextType)theEObject;
				T result = caseQueryExpressionTextType(queryExpressionTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.QUERY_TYPE: {
				QueryType queryType = (QueryType)theEObject;
				T result = caseQueryType(queryType);
				if (result == null) result = caseAbstractAdhocQueryExpressionType(queryType);
				if (result == null) result = caseAbstractQueryExpressionType(queryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.REPLACE_TYPE: {
				ReplaceType replaceType = (ReplaceType)theEObject;
				T result = caseReplaceType(replaceType);
				if (result == null) result = caseAbstractTransactionActionType(replaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.SIMPLE_FEATURE_COLLECTION_TYPE: {
				SimpleFeatureCollectionType simpleFeatureCollectionType = (SimpleFeatureCollectionType)theEObject;
				T result = caseSimpleFeatureCollectionType(simpleFeatureCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.STORED_QUERY_DESCRIPTION_TYPE: {
				StoredQueryDescriptionType storedQueryDescriptionType = (StoredQueryDescriptionType)theEObject;
				T result = caseStoredQueryDescriptionType(storedQueryDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE: {
				StoredQueryListItemType storedQueryListItemType = (StoredQueryListItemType)theEObject;
				T result = caseStoredQueryListItemType(storedQueryListItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.STORED_QUERY_TYPE: {
				StoredQueryType storedQueryType = (StoredQueryType)theEObject;
				T result = caseStoredQueryType(storedQueryType);
				if (result == null) result = caseAbstractQueryExpressionType(storedQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.TRANSACTION_RESPONSE_TYPE: {
				TransactionResponseType transactionResponseType = (TransactionResponseType)theEObject;
				T result = caseTransactionResponseType(transactionResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.TRANSACTION_SUMMARY_TYPE: {
				TransactionSummaryType transactionSummaryType = (TransactionSummaryType)theEObject;
				T result = caseTransactionSummaryType(transactionSummaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.TRANSACTION_TYPE: {
				TransactionType transactionType = (TransactionType)theEObject;
				T result = caseTransactionType(transactionType);
				if (result == null) result = caseBaseRequestType(transactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.TRUNCATED_RESPONSE_TYPE: {
				TruncatedResponseType truncatedResponseType = (TruncatedResponseType)theEObject;
				T result = caseTruncatedResponseType(truncatedResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.TUPLE_TYPE: {
				TupleType tupleType = (TupleType)theEObject;
				T result = caseTupleType(tupleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.UPDATE_TYPE: {
				UpdateType updateType = (UpdateType)theEObject;
				T result = caseUpdateType(updateType);
				if (result == null) result = caseAbstractTransactionActionType(updateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.VALUE_COLLECTION_TYPE: {
				ValueCollectionType valueCollectionType = (ValueCollectionType)theEObject;
				T result = caseValueCollectionType(valueCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.VALUE_LIST_TYPE: {
				ValueListType valueListType = (ValueListType)theEObject;
				T result = caseValueListType(valueListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.VALUE_REFERENCE_TYPE: {
				ValueReferenceType valueReferenceType = (ValueReferenceType)theEObject;
				T result = caseValueReferenceType(valueReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.WFS_CAPABILITIES_TYPE: {
				WFSCapabilitiesType wfsCapabilitiesType = (WFSCapabilitiesType)theEObject;
				T result = caseWFSCapabilitiesType(wfsCapabilitiesType);
				if (result == null) result = caseCapabilitiesBaseType(wfsCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.WSDL_TYPE: {
				WSDLType wsdlType = (WSDLType)theEObject;
				T result = caseWSDLType(wsdlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transaction Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transaction Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransactionActionType(AbstractTransactionActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Results Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Results Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionResultsType(ActionResultsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Objects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Objects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalObjectsType(AdditionalObjectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalValuesType(AdditionalValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseRequestType(BaseRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Created Or Modified Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Created Or Modified Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatedOrModifiedFeatureType(CreatedOrModifiedFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Stored Query Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Stored Query Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateStoredQueryResponseType(CreateStoredQueryResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Stored Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Stored Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateStoredQueryType(CreateStoredQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteType(DeleteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describe Feature Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describe Feature Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribeFeatureTypeType(DescribeFeatureTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describe Stored Queries Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describe Stored Queries Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribeStoredQueriesResponseType(DescribeStoredQueriesResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describe Stored Queries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describe Stored Queries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribeStoredQueriesType(DescribeStoredQueriesType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Drop Stored Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Stored Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropStoredQueryType(DropStoredQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyType(EmptyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Envelope Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Envelope Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvelopePropertyType(EnvelopePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionStatusType(ExecutionStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedDescriptionType(ExtendedDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCollectionType(FeatureCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Features Locked Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Features Locked Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturesLockedType(FeaturesLockedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Features Not Locked Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Features Not Locked Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturesNotLockedType(FeaturesNotLockedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTypeListType(FeatureTypeListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTypeType(FeatureTypeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Get Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetFeatureType(GetFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Feature With Lock Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Feature With Lock Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetFeatureWithLockType(GetFeatureWithLockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Property Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Property Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPropertyValueType(GetPropertyValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertType(InsertType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Stored Queries Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Stored Queries Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStoredQueriesResponseType(ListStoredQueriesResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Stored Queries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Stored Queries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStoredQueriesType(ListStoredQueriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lock Feature Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock Feature Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLockFeatureResponseType(LockFeatureResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lock Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLockFeatureType(LockFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberPropertyType(MemberPropertyType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Native Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeType(NativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoCRSType(NoCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Format List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Format List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputFormatListType(OutputFormatListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterExpressionType(ParameterExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyNameType(PropertyNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Expression Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Expression Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryExpressionTextType(QueryExpressionTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryType(QueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceType(ReplaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Feature Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Feature Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleFeatureCollectionType(SimpleFeatureCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stored Query Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stored Query Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoredQueryDescriptionType(StoredQueryDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stored Query List Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stored Query List Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoredQueryListItemType(StoredQueryListItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stored Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stored Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoredQueryType(StoredQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleType(TitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionResponseType(TransactionResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Summary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Summary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionSummaryType(TransactionSummaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionType(TransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truncated Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truncated Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruncatedResponseType(TruncatedResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleType(TupleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueCollectionType(ValueCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueListType(ValueListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueReferenceType(ValueReferenceType object) {
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
	public T caseWFSCapabilitiesType(WFSCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSDL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSDL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSDLType(WSDLType object) {
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
	public T caseOWS_GetCapabilitiesType(net.opengis.ows.GetCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Query Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Query Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractQueryExpressionType(AbstractQueryExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Adhoc Query Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Adhoc Query Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAdhocQueryExpressionType(AbstractAdhocQueryExpressionType object) {
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

} //WFSSwitch
