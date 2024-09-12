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

import net.opengis.gml.AbstractFeatureCollectionType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;

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
			case WFSPackage.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				T result = caseActionType(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.BASE_REQUEST_TYPE: {
				BaseRequestType baseRequestType = (BaseRequestType)theEObject;
				T result = caseBaseRequestType(baseRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.DELETE_ELEMENT_TYPE: {
				DeleteElementType deleteElementType = (DeleteElementType)theEObject;
				T result = caseDeleteElementType(deleteElementType);
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
			case WFSPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.FEATURE_COLLECTION_TYPE: {
				FeatureCollectionType featureCollectionType = (FeatureCollectionType)theEObject;
				T result = caseFeatureCollectionType(featureCollectionType);
				if (result == null) result = caseAbstractFeatureCollectionType(featureCollectionType);
				if (result == null) result = caseAbstractFeatureType(featureCollectionType);
				if (result == null) result = caseAbstractGMLType(featureCollectionType);
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
				if (result == null) result = caseBaseRequestType(getFeatureWithLockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.GET_GML_OBJECT_TYPE: {
				GetGmlObjectType getGmlObjectType = (GetGmlObjectType)theEObject;
				T result = caseGetGmlObjectType(getGmlObjectType);
				if (result == null) result = caseBaseRequestType(getGmlObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.GML_OBJECT_TYPE_LIST_TYPE: {
				GMLObjectTypeListType gmlObjectTypeListType = (GMLObjectTypeListType)theEObject;
				T result = caseGMLObjectTypeListType(gmlObjectTypeListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.GML_OBJECT_TYPE_TYPE: {
				GMLObjectTypeType gmlObjectTypeType = (GMLObjectTypeType)theEObject;
				T result = caseGMLObjectTypeType(gmlObjectTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.INSERTED_FEATURE_TYPE: {
				InsertedFeatureType insertedFeatureType = (InsertedFeatureType)theEObject;
				T result = caseInsertedFeatureType(insertedFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.INSERT_ELEMENT_TYPE: {
				InsertElementType insertElementType = (InsertElementType)theEObject;
				T result = caseInsertElementType(insertElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.INSERT_RESULTS_TYPE: {
				InsertResultsType insertResultsType = (InsertResultsType)theEObject;
				T result = caseInsertResultsType(insertResultsType);
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
			case WFSPackage.LOCK_TYPE: {
				LockType lockType = (LockType)theEObject;
				T result = caseLockType(lockType);
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.NO_SRS_TYPE: {
				NoSRSType noSRSType = (NoSRSType)theEObject;
				T result = caseNoSRSType(noSRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.OPERATIONS_TYPE: {
				OperationsType operationsType = (OperationsType)theEObject;
				T result = caseOperationsType(operationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.OUTPUT_FORMAT_LIST_TYPE: {
				OutputFormatListType outputFormatListType = (OutputFormatListType)theEObject;
				T result = caseOutputFormatListType(outputFormatListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.QUERY_TYPE: {
				QueryType queryType = (QueryType)theEObject;
				T result = caseQueryType(queryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.TRANSACTION_RESPONSE_TYPE: {
				TransactionResponseType transactionResponseType = (TransactionResponseType)theEObject;
				T result = caseTransactionResponseType(transactionResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WFSPackage.TRANSACTION_RESULTS_TYPE: {
				TransactionResultsType transactionResultsType = (TransactionResultsType)theEObject;
				T result = caseTransactionResultsType(transactionResultsType);
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
			case WFSPackage.UPDATE_ELEMENT_TYPE: {
				UpdateElementType updateElementType = (UpdateElementType)theEObject;
				T result = caseUpdateElementType(updateElementType);
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
			case WFSPackage.XLINK_PROPERTY_NAME_TYPE: {
				XlinkPropertyNameType xlinkPropertyNameType = (XlinkPropertyNameType)theEObject;
				T result = caseXlinkPropertyNameType(xlinkPropertyNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionType(ActionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Delete Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteElementType(DeleteElementType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Get Gml Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Gml Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetGmlObjectType(GetGmlObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GML Object Type List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GML Object Type List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMLObjectTypeListType(GMLObjectTypeListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GML Object Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GML Object Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMLObjectTypeType(GMLObjectTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inserted Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inserted Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertedFeatureType(InsertedFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertElementType(InsertElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Results Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Results Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertResultsType(InsertResultsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Lock Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLockType(LockType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>No SRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No SRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoSRSType(NoSRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationsType(OperationsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Results Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Results Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionResultsType(TransactionResultsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Update Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateElementType(UpdateElementType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Xlink Property Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xlink Property Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXlinkPropertyNameType(XlinkPropertyNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGMLType(AbstractGMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureType(AbstractFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureCollectionType(AbstractFeatureCollectionType object) {
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
