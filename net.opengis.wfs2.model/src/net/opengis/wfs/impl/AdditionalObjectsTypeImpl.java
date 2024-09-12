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

import net.opengis.wfs.AdditionalObjectsType;
import net.opengis.wfs.SimpleFeatureCollectionType;
import net.opengis.wfs.ValueCollectionType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Objects Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.AdditionalObjectsTypeImpl#getValueCollection <em>Value Collection</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.AdditionalObjectsTypeImpl#getSimpleFeatureCollectionGroup <em>Simple Feature Collection Group</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.AdditionalObjectsTypeImpl#getSimpleFeatureCollection <em>Simple Feature Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalObjectsTypeImpl extends MinimalEObjectImpl.Container implements AdditionalObjectsType {
	/**
	 * The cached value of the '{@link #getValueCollection() <em>Value Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCollection()
	 * @generated
	 * @ordered
	 */
	protected ValueCollectionType valueCollection;

	/**
	 * The cached value of the '{@link #getSimpleFeatureCollectionGroup() <em>Simple Feature Collection Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleFeatureCollectionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap simpleFeatureCollectionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalObjectsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.ADDITIONAL_OBJECTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueCollectionType getValueCollection() {
		return valueCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCollection(ValueCollectionType newValueCollection, NotificationChain msgs) {
		ValueCollectionType oldValueCollection = valueCollection;
		valueCollection = newValueCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION, oldValueCollection, newValueCollection);
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
	public void setValueCollection(ValueCollectionType newValueCollection) {
		if (newValueCollection != valueCollection) {
			NotificationChain msgs = null;
			if (valueCollection != null)
				msgs = ((InternalEObject)valueCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION, null, msgs);
			if (newValueCollection != null)
				msgs = ((InternalEObject)newValueCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION, null, msgs);
			msgs = basicSetValueCollection(newValueCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION, newValueCollection, newValueCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSimpleFeatureCollectionGroup() {
		if (simpleFeatureCollectionGroup == null) {
			simpleFeatureCollectionGroup = new BasicFeatureMap(this, WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP);
		}
		return simpleFeatureCollectionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleFeatureCollectionType getSimpleFeatureCollection() {
		return (SimpleFeatureCollectionType)getSimpleFeatureCollectionGroup().get(WFSPackage.Literals.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleFeatureCollection(SimpleFeatureCollectionType newSimpleFeatureCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSimpleFeatureCollectionGroup()).basicAdd(WFSPackage.Literals.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION, newSimpleFeatureCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpleFeatureCollection(SimpleFeatureCollectionType newSimpleFeatureCollection) {
		((FeatureMap.Internal)getSimpleFeatureCollectionGroup()).set(WFSPackage.Literals.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION, newSimpleFeatureCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION:
				return basicSetValueCollection(null, msgs);
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP:
				return ((InternalEList<?>)getSimpleFeatureCollectionGroup()).basicRemove(otherEnd, msgs);
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION:
				return basicSetSimpleFeatureCollection(null, msgs);
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
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION:
				return getValueCollection();
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP:
				if (coreType) return getSimpleFeatureCollectionGroup();
				return ((FeatureMap.Internal)getSimpleFeatureCollectionGroup()).getWrapper();
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION:
				return getSimpleFeatureCollection();
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
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION:
				setValueCollection((ValueCollectionType)newValue);
				return;
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP:
				((FeatureMap.Internal)getSimpleFeatureCollectionGroup()).set(newValue);
				return;
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION:
				setSimpleFeatureCollection((SimpleFeatureCollectionType)newValue);
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
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION:
				setValueCollection((ValueCollectionType)null);
				return;
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP:
				getSimpleFeatureCollectionGroup().clear();
				return;
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION:
				setSimpleFeatureCollection((SimpleFeatureCollectionType)null);
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
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION:
				return valueCollection != null;
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP:
				return simpleFeatureCollectionGroup != null && !simpleFeatureCollectionGroup.isEmpty();
			case WFSPackage.ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION:
				return getSimpleFeatureCollection() != null;
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
		result.append(" (simpleFeatureCollectionGroup: ");
		result.append(simpleFeatureCollectionGroup);
		result.append(')');
		return result.toString();
	}

} //AdditionalObjectsTypeImpl
