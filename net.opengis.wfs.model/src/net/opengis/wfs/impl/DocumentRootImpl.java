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

import net.opengis.wfs.DeleteElementType;
import net.opengis.wfs.DescribeFeatureTypeType;
import net.opengis.wfs.DocumentRoot;
import net.opengis.wfs.FeatureCollectionType;
import net.opengis.wfs.FeatureTypeListType;
import net.opengis.wfs.GMLObjectTypeListType;
import net.opengis.wfs.GetCapabilitiesType;
import net.opengis.wfs.GetFeatureType;
import net.opengis.wfs.GetFeatureWithLockType;
import net.opengis.wfs.GetGmlObjectType;
import net.opengis.wfs.InsertElementType;
import net.opengis.wfs.LockFeatureResponseType;
import net.opengis.wfs.LockFeatureType;
import net.opengis.wfs.NativeType;
import net.opengis.wfs.PropertyType;
import net.opengis.wfs.QueryType;
import net.opengis.wfs.TransactionResponseType;
import net.opengis.wfs.TransactionType;
import net.opengis.wfs.UpdateElementType;
import net.opengis.wfs.WFSCapabilitiesType;
import net.opengis.wfs.WFSPackage;
import net.opengis.wfs.XlinkPropertyNameType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getDescribeFeatureType <em>Describe Feature Type</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getFeatureCollection <em>Feature Collection</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getFeatureTypeList <em>Feature Type List</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getGetFeature <em>Get Feature</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getGetFeatureWithLock <em>Get Feature With Lock</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getGetGmlObject <em>Get Gml Object</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getLockFeature <em>Lock Feature</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getLockFeatureResponse <em>Lock Feature Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getLockId <em>Lock Id</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getNative <em>Native</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getServesGMLObjectTypeList <em>Serves GML Object Type List</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getSupportsGMLObjectTypeList <em>Supports GML Object Type List</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getTransactionResponse <em>Transaction Response</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getWFSCapabilities <em>WFS Capabilities</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.DocumentRootImpl#getXlinkPropertyName <em>Xlink Property Name</em>}</li>
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
	 * The default value of the '{@link #getLockId() <em>Lock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCK_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

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
	public DeleteElementType getDelete() {
		return (DeleteElementType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__DELETE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(DeleteElementType newDelete, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__DELETE, newDelete, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelete(DeleteElementType newDelete) {
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
	public GetGmlObjectType getGetGmlObject() {
		return (GetGmlObjectType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__GET_GML_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetGmlObject(GetGmlObjectType newGetGmlObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__GET_GML_OBJECT, newGetGmlObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetGmlObject(GetGmlObjectType newGetGmlObject) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__GET_GML_OBJECT, newGetGmlObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertElementType getInsert() {
		return (InsertElementType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__INSERT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsert(InsertElementType newInsert, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__INSERT, newInsert, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsert(InsertElementType newInsert) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__INSERT, newInsert);
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
	public String getLockId() {
		return (String)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__LOCK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockId(String newLockId) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__LOCK_ID, newLockId);
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
	public String getPropertyName() {
		return (String)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__PROPERTY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyName(String newPropertyName) {
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
	public GMLObjectTypeListType getServesGMLObjectTypeList() {
		return (GMLObjectTypeListType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServesGMLObjectTypeList(GMLObjectTypeListType newServesGMLObjectTypeList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST, newServesGMLObjectTypeList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServesGMLObjectTypeList(GMLObjectTypeListType newServesGMLObjectTypeList) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST, newServesGMLObjectTypeList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMLObjectTypeListType getSupportsGMLObjectTypeList() {
		return (GMLObjectTypeListType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportsGMLObjectTypeList(GMLObjectTypeListType newSupportsGMLObjectTypeList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST, newSupportsGMLObjectTypeList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsGMLObjectTypeList(GMLObjectTypeListType newSupportsGMLObjectTypeList) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST, newSupportsGMLObjectTypeList);
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
	public UpdateElementType getUpdate() {
		return (UpdateElementType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate(UpdateElementType newUpdate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__UPDATE, newUpdate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdate(UpdateElementType newUpdate) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__UPDATE, newUpdate);
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
	public XlinkPropertyNameType getXlinkPropertyName() {
		return (XlinkPropertyNameType)getMixed().get(WFSPackage.Literals.DOCUMENT_ROOT__XLINK_PROPERTY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXlinkPropertyName(XlinkPropertyNameType newXlinkPropertyName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WFSPackage.Literals.DOCUMENT_ROOT__XLINK_PROPERTY_NAME, newXlinkPropertyName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXlinkPropertyName(XlinkPropertyNameType newXlinkPropertyName) {
		((FeatureMap.Internal)getMixed()).set(WFSPackage.Literals.DOCUMENT_ROOT__XLINK_PROPERTY_NAME, newXlinkPropertyName);
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
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				return basicSetDelete(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				return basicSetDescribeFeatureType(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return basicSetFeatureCollection(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__FEATURE_TYPE_LIST:
				return basicSetFeatureTypeList(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return basicSetGetCapabilities(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE:
				return basicSetGetFeature(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK:
				return basicSetGetFeatureWithLock(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__GET_GML_OBJECT:
				return basicSetGetGmlObject(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				return basicSetInsert(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				return basicSetLockFeature(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				return basicSetLockFeatureResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				return basicSetNative(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				return basicSetQuery(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST:
				return basicSetServesGMLObjectTypeList(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST:
				return basicSetSupportsGMLObjectTypeList(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				return basicSetTransactionResponse(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				return basicSetUpdate(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				return basicSetWFSCapabilities(null, msgs);
			case WFSPackage.DOCUMENT_ROOT__XLINK_PROPERTY_NAME:
				return basicSetXlinkPropertyName(null, msgs);
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
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				return getDelete();
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				return getDescribeFeatureType();
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return getFeatureCollection();
			case WFSPackage.DOCUMENT_ROOT__FEATURE_TYPE_LIST:
				return getFeatureTypeList();
			case WFSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return getGetCapabilities();
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE:
				return getGetFeature();
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK:
				return getGetFeatureWithLock();
			case WFSPackage.DOCUMENT_ROOT__GET_GML_OBJECT:
				return getGetGmlObject();
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				return getInsert();
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				return getLockFeature();
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				return getLockFeatureResponse();
			case WFSPackage.DOCUMENT_ROOT__LOCK_ID:
				return getLockId();
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				return getNative();
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return getPropertyName();
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				return getQuery();
			case WFSPackage.DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST:
				return getServesGMLObjectTypeList();
			case WFSPackage.DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST:
				return getSupportsGMLObjectTypeList();
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction();
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				return getTransactionResponse();
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				return getUpdate();
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				return getWFSCapabilities();
			case WFSPackage.DOCUMENT_ROOT__XLINK_PROPERTY_NAME:
				return getXlinkPropertyName();
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
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteElementType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				setDescribeFeatureType((DescribeFeatureTypeType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				setFeatureCollection((FeatureCollectionType)newValue);
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
			case WFSPackage.DOCUMENT_ROOT__GET_GML_OBJECT:
				setGetGmlObject((GetGmlObjectType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				setInsert((InsertElementType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				setLockFeature((LockFeatureType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				setLockFeatureResponse((LockFeatureResponseType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_ID:
				setLockId((String)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				setNative((NativeType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				setQuery((QueryType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST:
				setServesGMLObjectTypeList((GMLObjectTypeListType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST:
				setSupportsGMLObjectTypeList((GMLObjectTypeListType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((TransactionType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				setTransactionResponse((TransactionResponseType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateElementType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				setWFSCapabilities((WFSCapabilitiesType)newValue);
				return;
			case WFSPackage.DOCUMENT_ROOT__XLINK_PROPERTY_NAME:
				setXlinkPropertyName((XlinkPropertyNameType)newValue);
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
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteElementType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				setDescribeFeatureType((DescribeFeatureTypeType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				setFeatureCollection((FeatureCollectionType)null);
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
			case WFSPackage.DOCUMENT_ROOT__GET_GML_OBJECT:
				setGetGmlObject((GetGmlObjectType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				setInsert((InsertElementType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				setLockFeature((LockFeatureType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				setLockFeatureResponse((LockFeatureResponseType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__LOCK_ID:
				setLockId(LOCK_ID_EDEFAULT);
				return;
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				setNative((NativeType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				setQuery((QueryType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST:
				setServesGMLObjectTypeList((GMLObjectTypeListType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST:
				setSupportsGMLObjectTypeList((GMLObjectTypeListType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((TransactionType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				setTransactionResponse((TransactionResponseType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateElementType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				setWFSCapabilities((WFSCapabilitiesType)null);
				return;
			case WFSPackage.DOCUMENT_ROOT__XLINK_PROPERTY_NAME:
				setXlinkPropertyName((XlinkPropertyNameType)null);
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
			case WFSPackage.DOCUMENT_ROOT__DELETE:
				return getDelete() != null;
			case WFSPackage.DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE:
				return getDescribeFeatureType() != null;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return getFeatureCollection() != null;
			case WFSPackage.DOCUMENT_ROOT__FEATURE_TYPE_LIST:
				return getFeatureTypeList() != null;
			case WFSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return getGetCapabilities() != null;
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE:
				return getGetFeature() != null;
			case WFSPackage.DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK:
				return getGetFeatureWithLock() != null;
			case WFSPackage.DOCUMENT_ROOT__GET_GML_OBJECT:
				return getGetGmlObject() != null;
			case WFSPackage.DOCUMENT_ROOT__INSERT:
				return getInsert() != null;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE:
				return getLockFeature() != null;
			case WFSPackage.DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE:
				return getLockFeatureResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__LOCK_ID:
				return LOCK_ID_EDEFAULT == null ? getLockId() != null : !LOCK_ID_EDEFAULT.equals(getLockId());
			case WFSPackage.DOCUMENT_ROOT__NATIVE:
				return getNative() != null;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case WFSPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? getPropertyName() != null : !PROPERTY_NAME_EDEFAULT.equals(getPropertyName());
			case WFSPackage.DOCUMENT_ROOT__QUERY:
				return getQuery() != null;
			case WFSPackage.DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST:
				return getServesGMLObjectTypeList() != null;
			case WFSPackage.DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST:
				return getSupportsGMLObjectTypeList() != null;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction() != null;
			case WFSPackage.DOCUMENT_ROOT__TRANSACTION_RESPONSE:
				return getTransactionResponse() != null;
			case WFSPackage.DOCUMENT_ROOT__UPDATE:
				return getUpdate() != null;
			case WFSPackage.DOCUMENT_ROOT__WFS_CAPABILITIES:
				return getWFSCapabilities() != null;
			case WFSPackage.DOCUMENT_ROOT__XLINK_PROPERTY_NAME:
				return getXlinkPropertyName() != null;
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
