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

import net.opengis.ogc.FilterCapabilitiesType;

import net.opengis.ows.impl.CapabilitiesBaseTypeImpl;

import net.opengis.wfs.FeatureTypeListType;
import net.opengis.wfs.GMLObjectTypeListType;
import net.opengis.wfs.WFSCapabilitiesType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.WFSCapabilitiesTypeImpl#getFeatureTypeList <em>Feature Type List</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.WFSCapabilitiesTypeImpl#getServesGMLObjectTypeList <em>Serves GML Object Type List</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.WFSCapabilitiesTypeImpl#getSupportsGMLObjectTypeList <em>Supports GML Object Type List</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.WFSCapabilitiesTypeImpl#getFilterCapabilities <em>Filter Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WFSCapabilitiesTypeImpl extends CapabilitiesBaseTypeImpl implements WFSCapabilitiesType {
	/**
	 * The cached value of the '{@link #getFeatureTypeList() <em>Feature Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeList()
	 * @generated
	 * @ordered
	 */
	protected FeatureTypeListType featureTypeList;

	/**
	 * The cached value of the '{@link #getServesGMLObjectTypeList() <em>Serves GML Object Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServesGMLObjectTypeList()
	 * @generated
	 * @ordered
	 */
	protected GMLObjectTypeListType servesGMLObjectTypeList;

	/**
	 * The cached value of the '{@link #getSupportsGMLObjectTypeList() <em>Supports GML Object Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsGMLObjectTypeList()
	 * @generated
	 * @ordered
	 */
	protected GMLObjectTypeListType supportsGMLObjectTypeList;

	/**
	 * The cached value of the '{@link #getFilterCapabilities() <em>Filter Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterCapabilities()
	 * @generated
	 * @ordered
	 */
	protected FilterCapabilitiesType filterCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WFSCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.WFS_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureTypeListType getFeatureTypeList() {
		return featureTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureTypeList(FeatureTypeListType newFeatureTypeList, NotificationChain msgs) {
		FeatureTypeListType oldFeatureTypeList = featureTypeList;
		featureTypeList = newFeatureTypeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST, oldFeatureTypeList, newFeatureTypeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureTypeList(FeatureTypeListType newFeatureTypeList) {
		if (newFeatureTypeList != featureTypeList) {
			NotificationChain msgs = null;
			if (featureTypeList != null)
				msgs = ((InternalEObject)featureTypeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST, null, msgs);
			if (newFeatureTypeList != null)
				msgs = ((InternalEObject)newFeatureTypeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST, null, msgs);
			msgs = basicSetFeatureTypeList(newFeatureTypeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST, newFeatureTypeList, newFeatureTypeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMLObjectTypeListType getServesGMLObjectTypeList() {
		return servesGMLObjectTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServesGMLObjectTypeList(GMLObjectTypeListType newServesGMLObjectTypeList, NotificationChain msgs) {
		GMLObjectTypeListType oldServesGMLObjectTypeList = servesGMLObjectTypeList;
		servesGMLObjectTypeList = newServesGMLObjectTypeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST, oldServesGMLObjectTypeList, newServesGMLObjectTypeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServesGMLObjectTypeList(GMLObjectTypeListType newServesGMLObjectTypeList) {
		if (newServesGMLObjectTypeList != servesGMLObjectTypeList) {
			NotificationChain msgs = null;
			if (servesGMLObjectTypeList != null)
				msgs = ((InternalEObject)servesGMLObjectTypeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST, null, msgs);
			if (newServesGMLObjectTypeList != null)
				msgs = ((InternalEObject)newServesGMLObjectTypeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST, null, msgs);
			msgs = basicSetServesGMLObjectTypeList(newServesGMLObjectTypeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST, newServesGMLObjectTypeList, newServesGMLObjectTypeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMLObjectTypeListType getSupportsGMLObjectTypeList() {
		return supportsGMLObjectTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportsGMLObjectTypeList(GMLObjectTypeListType newSupportsGMLObjectTypeList, NotificationChain msgs) {
		GMLObjectTypeListType oldSupportsGMLObjectTypeList = supportsGMLObjectTypeList;
		supportsGMLObjectTypeList = newSupportsGMLObjectTypeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST, oldSupportsGMLObjectTypeList, newSupportsGMLObjectTypeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsGMLObjectTypeList(GMLObjectTypeListType newSupportsGMLObjectTypeList) {
		if (newSupportsGMLObjectTypeList != supportsGMLObjectTypeList) {
			NotificationChain msgs = null;
			if (supportsGMLObjectTypeList != null)
				msgs = ((InternalEObject)supportsGMLObjectTypeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST, null, msgs);
			if (newSupportsGMLObjectTypeList != null)
				msgs = ((InternalEObject)newSupportsGMLObjectTypeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST, null, msgs);
			msgs = basicSetSupportsGMLObjectTypeList(newSupportsGMLObjectTypeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST, newSupportsGMLObjectTypeList, newSupportsGMLObjectTypeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterCapabilitiesType getFilterCapabilities() {
		return filterCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterCapabilities(FilterCapabilitiesType newFilterCapabilities, NotificationChain msgs) {
		FilterCapabilitiesType oldFilterCapabilities = filterCapabilities;
		filterCapabilities = newFilterCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES, oldFilterCapabilities, newFilterCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterCapabilities(FilterCapabilitiesType newFilterCapabilities) {
		if (newFilterCapabilities != filterCapabilities) {
			NotificationChain msgs = null;
			if (filterCapabilities != null)
				msgs = ((InternalEObject)filterCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES, null, msgs);
			if (newFilterCapabilities != null)
				msgs = ((InternalEObject)newFilterCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES, null, msgs);
			msgs = basicSetFilterCapabilities(newFilterCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES, newFilterCapabilities, newFilterCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST:
				return basicSetFeatureTypeList(null, msgs);
			case WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST:
				return basicSetServesGMLObjectTypeList(null, msgs);
			case WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST:
				return basicSetSupportsGMLObjectTypeList(null, msgs);
			case WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES:
				return basicSetFilterCapabilities(null, msgs);
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
			case WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST:
				return getFeatureTypeList();
			case WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST:
				return getServesGMLObjectTypeList();
			case WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST:
				return getSupportsGMLObjectTypeList();
			case WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES:
				return getFilterCapabilities();
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
			case WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST:
				setFeatureTypeList((FeatureTypeListType)newValue);
				return;
			case WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST:
				setServesGMLObjectTypeList((GMLObjectTypeListType)newValue);
				return;
			case WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST:
				setSupportsGMLObjectTypeList((GMLObjectTypeListType)newValue);
				return;
			case WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES:
				setFilterCapabilities((FilterCapabilitiesType)newValue);
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
			case WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST:
				setFeatureTypeList((FeatureTypeListType)null);
				return;
			case WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST:
				setServesGMLObjectTypeList((GMLObjectTypeListType)null);
				return;
			case WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST:
				setSupportsGMLObjectTypeList((GMLObjectTypeListType)null);
				return;
			case WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES:
				setFilterCapabilities((FilterCapabilitiesType)null);
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
			case WFSPackage.WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST:
				return featureTypeList != null;
			case WFSPackage.WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST:
				return servesGMLObjectTypeList != null;
			case WFSPackage.WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST:
				return supportsGMLObjectTypeList != null;
			case WFSPackage.WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES:
				return filterCapabilities != null;
		}
		return super.eIsSet(featureID);
	}

} //WFSCapabilitiesTypeImpl
