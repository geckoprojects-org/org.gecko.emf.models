/*
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

import net.opengis.wfs.AbstractTransactionActionType;
import net.opengis.wfs.AbstractType;
import net.opengis.wfs.AdditionalObjectsType;
import net.opengis.wfs.AdditionalValuesType;
import net.opengis.wfs.CreateStoredQueryResponseType;
import net.opengis.wfs.CreateStoredQueryType;
import net.opengis.wfs.DeleteType;
import net.opengis.wfs.DescribeFeatureTypeType;
import net.opengis.wfs.DescribeStoredQueriesResponseType;
import net.opengis.wfs.DescribeStoredQueriesType;
import net.opengis.wfs.DocumentRoot;
import net.opengis.wfs.DropStoredQueryType;
import net.opengis.wfs.ElementType;
import net.opengis.wfs.EnvelopePropertyType;
import net.opengis.wfs.ExecutionStatusType;
import net.opengis.wfs.FeatureCollectionType;
import net.opengis.wfs.FeatureTypeListType;
import net.opengis.wfs.GetCapabilitiesType;
import net.opengis.wfs.GetFeatureType;
import net.opengis.wfs.GetFeatureWithLockType;
import net.opengis.wfs.GetPropertyValueType;
import net.opengis.wfs.InsertType;
import net.opengis.wfs.ListStoredQueriesResponseType;
import net.opengis.wfs.ListStoredQueriesType;
import net.opengis.wfs.LockFeatureResponseType;
import net.opengis.wfs.LockFeatureType;
import net.opengis.wfs.MemberPropertyType;
import net.opengis.wfs.NativeType;
import net.opengis.wfs.PropertyNameType;
import net.opengis.wfs.PropertyType;
import net.opengis.wfs.QueryType;
import net.opengis.wfs.ReplaceType;
import net.opengis.wfs.SimpleFeatureCollectionType;
import net.opengis.wfs.StoredQueryType;
import net.opengis.wfs.TitleType;
import net.opengis.wfs.TransactionResponseType;
import net.opengis.wfs.TransactionType;
import net.opengis.wfs.TruncatedResponseType;
import net.opengis.wfs.TupleType;
import net.opengis.wfs.UpdateType;
import net.opengis.wfs.ValueCollectionType;
import net.opengis.wfs.ValueListType;
import net.opengis.wfs.WFSCapabilitiesType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getAbstractTransactionAction <em>Abstract Transaction Action</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getAdditionalObjects <em>Additional Objects</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getAdditionalValues <em>Additional Values</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getBoundedBy <em>Bounded By</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getCreateStoredQuery <em>Create Stored Query</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getCreateStoredQueryResponse <em>Create Stored Query Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getDescribeFeatureType <em>Describe Feature Type</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getDescribeStoredQueries <em>Describe Stored Queries</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getDescribeStoredQueriesResponse <em>Describe Stored Queries Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getDropStoredQuery <em>Drop Stored Query</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getDropStoredQueryResponse <em>Drop Stored Query Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getElement <em>Element</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getFeatureCollection <em>Feature Collection</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getSimpleFeatureCollection <em>Simple Feature Collection</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getFeatureTypeList <em>Feature Type List</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getGetFeature <em>Get Feature</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getGetFeatureWithLock <em>Get Feature With Lock</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getGetPropertyValue <em>Get Property Value</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getListStoredQueries <em>List Stored Queries</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getListStoredQueriesResponse <em>List Stored Queries Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getLockFeature <em>Lock Feature</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getLockFeatureResponse <em>Lock Feature Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getNative <em>Native</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getReplace <em>Replace</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getStoredQuery <em>Stored Query</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getTransactionResponse <em>Transaction Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getTruncatedResponse <em>Truncated Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getTuple <em>Tuple</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getValueCollection <em>Value Collection</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getWFSCapabilities <em>WFS Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, WFSPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, WFSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, WFSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractType getAbstract() {
		return (AbstractType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(AbstractType newAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(AbstractType newAbstract) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTransactionActionType getAbstractTransactionAction() {
		return (AbstractTransactionActionType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTransactionAction(AbstractTransactionActionType newAbstractTransactionAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_ACTION, newAbstractTransactionAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalObjectsType getAdditionalObjects() {
		return (AdditionalObjectsType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__ADDITIONAL_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalObjects(AdditionalObjectsType newAdditionalObjects, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__ADDITIONAL_OBJECTS, newAdditionalObjects, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalObjects(AdditionalObjectsType newAdditionalObjects) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__ADDITIONAL_OBJECTS, newAdditionalObjects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalValuesType getAdditionalValues() {
		return (AdditionalValuesType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__ADDITIONAL_VALUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalValues(AdditionalValuesType newAdditionalValues, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__ADDITIONAL_VALUES, newAdditionalValues, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalValues(AdditionalValuesType newAdditionalValues) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__ADDITIONAL_VALUES, newAdditionalValues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvelopePropertyType getBoundedBy() {
		return (EnvelopePropertyType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__BOUNDED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundedBy(EnvelopePropertyType newBoundedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__BOUNDED_BY, newBoundedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundedBy(EnvelopePropertyType newBoundedBy) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__BOUNDED_BY, newBoundedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateStoredQueryType getCreateStoredQuery() {
		return (CreateStoredQueryType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__CREATE_STORED_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateStoredQuery(CreateStoredQueryType newCreateStoredQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__CREATE_STORED_QUERY, newCreateStoredQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateStoredQuery(CreateStoredQueryType newCreateStoredQuery) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__CREATE_STORED_QUERY, newCreateStoredQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateStoredQueryResponseType getCreateStoredQueryResponse() {
		return (CreateStoredQueryResponseType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateStoredQueryResponse(CreateStoredQueryResponseType newCreateStoredQueryResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE, newCreateStoredQueryResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateStoredQueryResponse(CreateStoredQueryResponseType newCreateStoredQueryResponse) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE, newCreateStoredQueryResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteType getDelete() {
		return (DeleteType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__DELETE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(DeleteType newDelete, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__DELETE, newDelete, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelete(DeleteType newDelete) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__DELETE, newDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescribeFeatureTypeType getDescribeFeatureType() {
		return (DescribeFeatureTypeType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribeFeatureType(DescribeFeatureTypeType newDescribeFeatureType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE, newDescribeFeatureType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescribeFeatureType(DescribeFeatureTypeType newDescribeFeatureType) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE, newDescribeFeatureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescribeStoredQueriesType getDescribeStoredQueries() {
		return (DescribeStoredQueriesType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribeStoredQueries(DescribeStoredQueriesType newDescribeStoredQueries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES, newDescribeStoredQueries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescribeStoredQueries(DescribeStoredQueriesType newDescribeStoredQueries) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES, newDescribeStoredQueries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescribeStoredQueriesResponseType getDescribeStoredQueriesResponse() {
		return (DescribeStoredQueriesResponseType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribeStoredQueriesResponse(DescribeStoredQueriesResponseType newDescribeStoredQueriesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE, newDescribeStoredQueriesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescribeStoredQueriesResponse(DescribeStoredQueriesResponseType newDescribeStoredQueriesResponse) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE, newDescribeStoredQueriesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropStoredQueryType getDropStoredQuery() {
		return (DropStoredQueryType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__DROP_STORED_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropStoredQuery(DropStoredQueryType newDropStoredQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__DROP_STORED_QUERY, newDropStoredQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDropStoredQuery(DropStoredQueryType newDropStoredQuery) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__DROP_STORED_QUERY, newDropStoredQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionStatusType getDropStoredQueryResponse() {
		return (ExecutionStatusType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropStoredQueryResponse(ExecutionStatusType newDropStoredQueryResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE, newDropStoredQueryResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDropStoredQueryResponse(ExecutionStatusType newDropStoredQueryResponse) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE, newDropStoredQueryResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementType getElement() {
		return (ElementType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(ElementType newElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__ELEMENT, newElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(ElementType newElement) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__ELEMENT, newElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCollectionType getFeatureCollection() {
		return (FeatureCollectionType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__FEATURE_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureCollection(FeatureCollectionType newFeatureCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__FEATURE_COLLECTION, newFeatureCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureCollection(FeatureCollectionType newFeatureCollection) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__FEATURE_COLLECTION, newFeatureCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleFeatureCollectionType getSimpleFeatureCollection() {
		return (SimpleFeatureCollectionType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleFeatureCollection(SimpleFeatureCollectionType newSimpleFeatureCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION, newSimpleFeatureCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpleFeatureCollection(SimpleFeatureCollectionType newSimpleFeatureCollection) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION, newSimpleFeatureCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureTypeListType getFeatureTypeList() {
		return (FeatureTypeListType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__FEATURE_TYPE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureTypeList(FeatureTypeListType newFeatureTypeList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__FEATURE_TYPE_LIST, newFeatureTypeList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureTypeList(FeatureTypeListType newFeatureTypeList) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__FEATURE_TYPE_LIST, newFeatureTypeList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCapabilitiesType getGetCapabilities() {
		return (GetCapabilitiesType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCapabilities(GetCapabilitiesType newGetCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, newGetCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCapabilities(GetCapabilitiesType newGetCapabilities) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, newGetCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetFeatureType getGetFeature() {
		return (GetFeatureType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetFeature(GetFeatureType newGetFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE, newGetFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetFeature(GetFeatureType newGetFeature) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE, newGetFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetFeatureWithLockType getGetFeatureWithLock() {
		return (GetFeatureWithLockType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetFeatureWithLock(GetFeatureWithLockType newGetFeatureWithLock, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK, newGetFeatureWithLock, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetFeatureWithLock(GetFeatureWithLockType newGetFeatureWithLock) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK, newGetFeatureWithLock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetPropertyValueType getGetPropertyValue() {
		return (GetPropertyValueType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__GET_PROPERTY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetPropertyValue(GetPropertyValueType newGetPropertyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__GET_PROPERTY_VALUE, newGetPropertyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetPropertyValue(GetPropertyValueType newGetPropertyValue) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__GET_PROPERTY_VALUE, newGetPropertyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertType getInsert() {
		return (InsertType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__INSERT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsert(InsertType newInsert, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__INSERT, newInsert, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsert(InsertType newInsert) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__INSERT, newInsert);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStoredQueriesType getListStoredQueries() {
		return (ListStoredQueriesType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__LIST_STORED_QUERIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStoredQueries(ListStoredQueriesType newListStoredQueries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__LIST_STORED_QUERIES, newListStoredQueries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListStoredQueries(ListStoredQueriesType newListStoredQueries) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__LIST_STORED_QUERIES, newListStoredQueries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStoredQueriesResponseType getListStoredQueriesResponse() {
		return (ListStoredQueriesResponseType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStoredQueriesResponse(ListStoredQueriesResponseType newListStoredQueriesResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE, newListStoredQueriesResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListStoredQueriesResponse(ListStoredQueriesResponseType newListStoredQueriesResponse) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE, newListStoredQueriesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LockFeatureType getLockFeature() {
		return (LockFeatureType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__LOCK_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockFeature(LockFeatureType newLockFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__LOCK_FEATURE, newLockFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockFeature(LockFeatureType newLockFeature) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__LOCK_FEATURE, newLockFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LockFeatureResponseType getLockFeatureResponse() {
		return (LockFeatureResponseType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockFeatureResponse(LockFeatureResponseType newLockFeatureResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE, newLockFeatureResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockFeatureResponse(LockFeatureResponseType newLockFeatureResponse) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE, newLockFeatureResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberPropertyType getMember() {
		return (MemberPropertyType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(MemberPropertyType newMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__MEMBER, newMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMember(MemberPropertyType newMember) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__MEMBER, newMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NativeType getNative() {
		return (NativeType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__NATIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNative(NativeType newNative, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__NATIVE, newNative, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNative(NativeType newNative) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__NATIVE, newNative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getProperty() {
		return (PropertyType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(PropertyType newProperty) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyNameType getPropertyName() {
		return (PropertyNameType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__PROPERTY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyName(PropertyNameType newPropertyName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__PROPERTY_NAME, newPropertyName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyName(PropertyNameType newPropertyName) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__PROPERTY_NAME, newPropertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryType getQuery() {
		return (QueryType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(QueryType newQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__QUERY, newQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(QueryType newQuery) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__QUERY, newQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplaceType getReplace() {
		return (ReplaceType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__REPLACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplace(ReplaceType newReplace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__REPLACE, newReplace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplace(ReplaceType newReplace) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__REPLACE, newReplace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoredQueryType getStoredQuery() {
		return (StoredQueryType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__STORED_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoredQuery(StoredQueryType newStoredQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__STORED_QUERY, newStoredQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoredQuery(StoredQueryType newStoredQuery) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__STORED_QUERY, newStoredQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return (TitleType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionType getTransaction() {
		return (TransactionType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(TransactionType newTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__TRANSACTION, newTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransaction(TransactionType newTransaction) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__TRANSACTION, newTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionResponseType getTransactionResponse() {
		return (TransactionResponseType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__TRANSACTION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionResponse(TransactionResponseType newTransactionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__TRANSACTION_RESPONSE, newTransactionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionResponse(TransactionResponseType newTransactionResponse) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__TRANSACTION_RESPONSE, newTransactionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TruncatedResponseType getTruncatedResponse() {
		return (TruncatedResponseType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__TRUNCATED_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruncatedResponse(TruncatedResponseType newTruncatedResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__TRUNCATED_RESPONSE, newTruncatedResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTruncatedResponse(TruncatedResponseType newTruncatedResponse) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__TRUNCATED_RESPONSE, newTruncatedResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TupleType getTuple() {
		return (TupleType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__TUPLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTuple(TupleType newTuple, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__TUPLE, newTuple, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTuple(TupleType newTuple) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__TUPLE, newTuple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType getUpdate() {
		return (UpdateType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate(UpdateType newUpdate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__UPDATE, newUpdate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdate(UpdateType newUpdate) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__UPDATE, newUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getValue() {
		return (EObject)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__VALUE, newValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(EObject newValue) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueCollectionType getValueCollection() {
		return (ValueCollectionType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__VALUE_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCollection(ValueCollectionType newValueCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__VALUE_COLLECTION, newValueCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueCollection(ValueCollectionType newValueCollection) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__VALUE_COLLECTION, newValueCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueListType getValueList() {
		return (ValueListType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__VALUE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueList(ValueListType newValueList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__VALUE_LIST, newValueList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueList(ValueListType newValueList) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__VALUE_LIST, newValueList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFSCapabilitiesType getWFSCapabilities() {
		return (WFSCapabilitiesType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__WFS_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWFSCapabilities(WFSCapabilitiesType newWFSCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__WFS_CAPABILITIES, newWFSCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWFSCapabilities(WFSCapabilitiesType newWFSCapabilities) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__WFS_CAPABILITIES, newWFSCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case WFSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case WFSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case WFSPackage.DOCUMENT_ROOT__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_ACTION:
				return basicSetAbstractTransactionAction(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_OBJECTS:
				return basicSetAdditionalObjects(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_VALUES:
				return basicSetAdditionalValues(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__BOUNDED_BY:
				return basicSetBoundedBy(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY:
				return basicSetCreateStoredQuery(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE:
				return basicSetCreateStoredQueryResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				return basicSetDelete(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				return basicSetDescribeFeatureType(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES:
				return basicSetDescribeStoredQueries(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE:
				return basicSetDescribeStoredQueriesResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY:
				return basicSetDropStoredQuery(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE:
				return basicSetDropStoredQueryResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__ELEMENT:
				return basicSetElement(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return basicSetFeatureCollection(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION:
				return basicSetSimpleFeatureCollection(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__FEATURE_TYPE_LIST:
				return basicSetFeatureTypeList(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return basicSetGetCapabilities(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE:
				return basicSetGetFeature(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK:
				return basicSetGetFeatureWithLock(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__GET_PROPERTY_VALUE:
				return basicSetGetPropertyValue(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				return basicSetInsert(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES:
				return basicSetListStoredQueries(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE:
				return basicSetListStoredQueriesResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				return basicSetLockFeature(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				return basicSetLockFeatureResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__MEMBER:
				return basicSetMember(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				return basicSetNative(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return basicSetPropertyName(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				return basicSetQuery(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__REPLACE:
				return basicSetReplace(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__STORED_QUERY:
				return basicSetStoredQuery(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				return basicSetTransactionResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__TRUNCATED_RESPONSE:
				return basicSetTruncatedResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__TUPLE:
				return basicSetTuple(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				return basicSetUpdate(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__VALUE:
				return basicSetValue(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__VALUE_COLLECTION:
				return basicSetValueCollection(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__VALUE_LIST:
				return basicSetValueList(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				return basicSetWFSCapabilities(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WFSPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case WFSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case WFSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case WFSPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract();
			case WFSPackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_ACTION:
				return getAbstractTransactionAction();
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_OBJECTS:
				return getAdditionalObjects();
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_VALUES:
				return getAdditionalValues();
			case WFSPackage.DOCUMENT_ROOT__BOUNDED_BY:
				return getBoundedBy();
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY:
				return getCreateStoredQuery();
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE:
				return getCreateStoredQueryResponse();
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				return getDelete();
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				return getDescribeFeatureType();
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES:
				return getDescribeStoredQueries();
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE:
				return getDescribeStoredQueriesResponse();
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY:
				return getDropStoredQuery();
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE:
				return getDropStoredQueryResponse();
			case WFSPackage.DOCUMENT_ROOT__ELEMENT:
				return getElement();
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return getFeatureCollection();
			case WFSPackage.DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION:
				return getSimpleFeatureCollection();
			case WFSPackage.DOCUMENT_ROOT__FEATURE_TYPE_LIST:
				return getFeatureTypeList();
			case WFSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return getGetCapabilities();
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE:
				return getGetFeature();
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK:
				return getGetFeatureWithLock();
			case WFSPackage.DOCUMENT_ROOT__GET_PROPERTY_VALUE:
				return getGetPropertyValue();
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				return getInsert();
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES:
				return getListStoredQueries();
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE:
				return getListStoredQueriesResponse();
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				return getLockFeature();
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				return getLockFeatureResponse();
			case WFSPackage.DOCUMENT_ROOT__MEMBER:
				return getMember();
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				return getNative();
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return getPropertyName();
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				return getQuery();
			case WFSPackage.DOCUMENT_ROOT__REPLACE:
				return getReplace();
			case WFSPackage.DOCUMENT_ROOT__STORED_QUERY:
				return getStoredQuery();
			case WFSPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction();
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				return getTransactionResponse();
			case WFSPackage.DOCUMENT_ROOT__TRUNCATED_RESPONSE:
				return getTruncatedResponse();
			case WFSPackage.DOCUMENT_ROOT__TUPLE:
				return getTuple();
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				return getUpdate();
			case WFSPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case WFSPackage.DOCUMENT_ROOT__VALUE_COLLECTION:
				return getValueCollection();
			case WFSPackage.DOCUMENT_ROOT__VALUE_LIST:
				return getValueList();
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				return getWFSCapabilities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WFSPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_OBJECTS:
				setAdditionalObjects((AdditionalObjectsType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_VALUES:
				setAdditionalValues((AdditionalValuesType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__BOUNDED_BY:
				setBoundedBy((EnvelopePropertyType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY:
				setCreateStoredQuery((CreateStoredQueryType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE:
				setCreateStoredQueryResponse((CreateStoredQueryResponseType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				setDescribeFeatureType((DescribeFeatureTypeType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES:
				setDescribeStoredQueries((DescribeStoredQueriesType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE:
				setDescribeStoredQueriesResponse((DescribeStoredQueriesResponseType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY:
				setDropStoredQuery((DropStoredQueryType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE:
				setDropStoredQueryResponse((ExecutionStatusType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__ELEMENT:
				setElement((ElementType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				setFeatureCollection((FeatureCollectionType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION:
				setSimpleFeatureCollection((SimpleFeatureCollectionType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_TYPE_LIST:
				setFeatureTypeList((FeatureTypeListType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				setGetCapabilities((GetCapabilitiesType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE:
				setGetFeature((GetFeatureType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK:
				setGetFeatureWithLock((GetFeatureWithLockType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__GET_PROPERTY_VALUE:
				setGetPropertyValue((GetPropertyValueType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				setInsert((InsertType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES:
				setListStoredQueries((ListStoredQueriesType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE:
				setListStoredQueriesResponse((ListStoredQueriesResponseType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				setLockFeature((LockFeatureType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				setLockFeatureResponse((LockFeatureResponseType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__MEMBER:
				setMember((MemberPropertyType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				setNative((NativeType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName((PropertyNameType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				setQuery((QueryType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__REPLACE:
				setReplace((ReplaceType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__STORED_QUERY:
				setStoredQuery((StoredQueryType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((TransactionType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				setTransactionResponse((TransactionResponseType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRUNCATED_RESPONSE:
				setTruncatedResponse((TruncatedResponseType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__TUPLE:
				setTuple((TupleType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__VALUE:
				setValue((EObject)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__VALUE_COLLECTION:
				setValueCollection((ValueCollectionType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__VALUE_LIST:
				setValueList((ValueListType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				setWFSCapabilities((WFSCapabilitiesType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WFSPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case WFSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case WFSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case WFSPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_OBJECTS:
				setAdditionalObjects((AdditionalObjectsType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_VALUES:
				setAdditionalValues((AdditionalValuesType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__BOUNDED_BY:
				setBoundedBy((EnvelopePropertyType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY:
				setCreateStoredQuery((CreateStoredQueryType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE:
				setCreateStoredQueryResponse((CreateStoredQueryResponseType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				setDescribeFeatureType((DescribeFeatureTypeType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES:
				setDescribeStoredQueries((DescribeStoredQueriesType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE:
				setDescribeStoredQueriesResponse((DescribeStoredQueriesResponseType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY:
				setDropStoredQuery((DropStoredQueryType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE:
				setDropStoredQueryResponse((ExecutionStatusType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__ELEMENT:
				setElement((ElementType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				setFeatureCollection((FeatureCollectionType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION:
				setSimpleFeatureCollection((SimpleFeatureCollectionType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_TYPE_LIST:
				setFeatureTypeList((FeatureTypeListType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				setGetCapabilities((GetCapabilitiesType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE:
				setGetFeature((GetFeatureType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK:
				setGetFeatureWithLock((GetFeatureWithLockType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__GET_PROPERTY_VALUE:
				setGetPropertyValue((GetPropertyValueType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				setInsert((InsertType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES:
				setListStoredQueries((ListStoredQueriesType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE:
				setListStoredQueriesResponse((ListStoredQueriesResponseType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				setLockFeature((LockFeatureType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				setLockFeatureResponse((LockFeatureResponseType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__MEMBER:
				setMember((MemberPropertyType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				setNative((NativeType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName((PropertyNameType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				setQuery((QueryType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__REPLACE:
				setReplace((ReplaceType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__STORED_QUERY:
				setStoredQuery((StoredQueryType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((TransactionType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				setTransactionResponse((TransactionResponseType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRUNCATED_RESPONSE:
				setTruncatedResponse((TruncatedResponseType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__TUPLE:
				setTuple((TupleType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__VALUE:
				setValue((EObject)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__VALUE_COLLECTION:
				setValueCollection((ValueCollectionType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__VALUE_LIST:
				setValueList((ValueListType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				setWFSCapabilities((WFSCapabilitiesType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WFSPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case WFSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case WFSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case WFSPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract() != null;
			case WFSPackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_ACTION:
				return getAbstractTransactionAction() != null;
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_OBJECTS:
				return getAdditionalObjects() != null;
			case WFSPackage.DOCUMENT_ROOT__ADDITIONAL_VALUES:
				return getAdditionalValues() != null;
			case WFSPackage.DOCUMENT_ROOT__BOUNDED_BY:
				return getBoundedBy() != null;
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY:
				return getCreateStoredQuery() != null;
			case WFSPackage.DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE:
				return getCreateStoredQueryResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				return getDelete() != null;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				return getDescribeFeatureType() != null;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES:
				return getDescribeStoredQueries() != null;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE:
				return getDescribeStoredQueriesResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY:
				return getDropStoredQuery() != null;
			case WFSPackage.DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE:
				return getDropStoredQueryResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__ELEMENT:
				return getElement() != null;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return getFeatureCollection() != null;
			case WFSPackage.DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION:
				return getSimpleFeatureCollection() != null;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_TYPE_LIST:
				return getFeatureTypeList() != null;
			case WFSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return getGetCapabilities() != null;
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE:
				return getGetFeature() != null;
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK:
				return getGetFeatureWithLock() != null;
			case WFSPackage.DOCUMENT_ROOT__GET_PROPERTY_VALUE:
				return getGetPropertyValue() != null;
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				return getInsert() != null;
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES:
				return getListStoredQueries() != null;
			case WFSPackage.DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE:
				return getListStoredQueriesResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				return getLockFeature() != null;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				return getLockFeatureResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__MEMBER:
				return getMember() != null;
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				return getNative() != null;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return getPropertyName() != null;
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				return getQuery() != null;
			case WFSPackage.DOCUMENT_ROOT__REPLACE:
				return getReplace() != null;
			case WFSPackage.DOCUMENT_ROOT__STORED_QUERY:
				return getStoredQuery() != null;
			case WFSPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction() != null;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				return getTransactionResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__TRUNCATED_RESPONSE:
				return getTruncatedResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__TUPLE:
				return getTuple() != null;
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				return getUpdate() != null;
			case WFSPackage.DOCUMENT_ROOT__VALUE:
				return getValue() != null;
			case WFSPackage.DOCUMENT_ROOT__VALUE_COLLECTION:
				return getValueCollection() != null;
			case WFSPackage.DOCUMENT_ROOT__VALUE_LIST:
				return getValueList() != null;
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				return getWFSCapabilities() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
