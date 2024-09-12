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
package net.opengis.gml.impl;

import net.opengis.gml.DynamicFeatureType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.HistoryPropertyType;
import net.opengis.gml.StringOrRefType;
import net.opengis.gml.TimePrimitivePropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.DynamicFeatureTypeImpl#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DynamicFeatureTypeImpl#getHistoryGroup <em>History Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DynamicFeatureTypeImpl#getHistory <em>History</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DynamicFeatureTypeImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicFeatureTypeImpl extends AbstractFeatureTypeImpl implements DynamicFeatureType {
	/**
	 * The cached value of the '{@link #getValidTime() <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTime()
	 * @generated
	 * @ordered
	 */
	protected TimePrimitivePropertyType validTime;

	/**
	 * The cached value of the '{@link #getHistoryGroup() <em>History Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap historyGroup;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType dataSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDynamicFeatureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePrimitivePropertyType getValidTime() {
		return validTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTime(TimePrimitivePropertyType newValidTime, NotificationChain msgs) {
		TimePrimitivePropertyType oldValidTime = validTime;
		validTime = newValidTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME, oldValidTime, newValidTime);
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
	public void setValidTime(TimePrimitivePropertyType newValidTime) {
		if (newValidTime != validTime) {
			NotificationChain msgs = null;
			if (validTime != null)
				msgs = ((InternalEObject)validTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME, null, msgs);
			if (newValidTime != null)
				msgs = ((InternalEObject)newValidTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME, null, msgs);
			msgs = basicSetValidTime(newValidTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME, newValidTime, newValidTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getHistoryGroup() {
		if (historyGroup == null) {
			historyGroup = new BasicFeatureMap(this, GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY_GROUP);
		}
		return historyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryPropertyType getHistory() {
		return (HistoryPropertyType)getHistoryGroup().get(GMLPackage.eINSTANCE.getDynamicFeatureType_History(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(HistoryPropertyType newHistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getHistoryGroup()).basicAdd(GMLPackage.eINSTANCE.getDynamicFeatureType_History(), newHistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistory(HistoryPropertyType newHistory) {
		((FeatureMap.Internal)getHistoryGroup()).set(GMLPackage.eINSTANCE.getDynamicFeatureType_History(), newHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(StringOrRefType newDataSource, NotificationChain msgs) {
		StringOrRefType oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE, oldDataSource, newDataSource);
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
	public void setDataSource(StringOrRefType newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME:
				return basicSetValidTime(null, msgs);
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY_GROUP:
				return ((InternalEList<?>)getHistoryGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY:
				return basicSetHistory(null, msgs);
			case GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
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
			case GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME:
				return getValidTime();
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY_GROUP:
				if (coreType) return getHistoryGroup();
				return ((FeatureMap.Internal)getHistoryGroup()).getWrapper();
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY:
				return getHistory();
			case GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE:
				return getDataSource();
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
			case GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)newValue);
				return;
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY_GROUP:
				((FeatureMap.Internal)getHistoryGroup()).set(newValue);
				return;
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY:
				setHistory((HistoryPropertyType)newValue);
				return;
			case GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE:
				setDataSource((StringOrRefType)newValue);
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
			case GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)null);
				return;
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY_GROUP:
				getHistoryGroup().clear();
				return;
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY:
				setHistory((HistoryPropertyType)null);
				return;
			case GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE:
				setDataSource((StringOrRefType)null);
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
			case GMLPackage.DYNAMIC_FEATURE_TYPE__VALID_TIME:
				return validTime != null;
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY_GROUP:
				return historyGroup != null && !historyGroup.isEmpty();
			case GMLPackage.DYNAMIC_FEATURE_TYPE__HISTORY:
				return getHistory() != null;
			case GMLPackage.DYNAMIC_FEATURE_TYPE__DATA_SOURCE:
				return dataSource != null;
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
		result.append(" (historyGroup: ");
		result.append(historyGroup);
		result.append(')');
		return result.toString();
	}

} //DynamicFeatureTypeImpl
