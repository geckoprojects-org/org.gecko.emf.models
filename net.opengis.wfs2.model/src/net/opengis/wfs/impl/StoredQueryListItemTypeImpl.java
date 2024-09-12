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

import java.util.Collection;

import javax.xml.namespace.QName;

import net.opengis.wfs.StoredQueryListItemType;
import net.opengis.wfs.TitleType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stored Query List Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.StoredQueryListItemTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.StoredQueryListItemTypeImpl#getReturnFeatureType <em>Return Feature Type</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.StoredQueryListItemTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoredQueryListItemTypeImpl extends MinimalEObjectImpl.Container implements StoredQueryListItemType {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<TitleType> title;

	/**
	 * The cached value of the '{@link #getReturnFeatureType() <em>Return Feature Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnFeatureType()
	 * @generated
	 * @ordered
	 */
	protected EList<QName> returnFeatureType;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoredQueryListItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.STORED_QUERY_LIST_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleType> getTitle() {
		if (title == null) {
			title = new EObjectContainmentEList<TitleType>(TitleType.class, this, WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__TITLE);
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QName> getReturnFeatureType() {
		if (returnFeatureType == null) {
			returnFeatureType = new EDataTypeEList<QName>(QName.class, this, WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__RETURN_FEATURE_TYPE);
		}
		return returnFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
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
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__TITLE:
				return getTitle();
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__RETURN_FEATURE_TYPE:
				return getReturnFeatureType();
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__RETURN_FEATURE_TYPE:
				getReturnFeatureType().clear();
				getReturnFeatureType().addAll((Collection<? extends QName>)newValue);
				return;
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__ID:
				setId((String)newValue);
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
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__TITLE:
				getTitle().clear();
				return;
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__RETURN_FEATURE_TYPE:
				getReturnFeatureType().clear();
				return;
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__TITLE:
				return title != null && !title.isEmpty();
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__RETURN_FEATURE_TYPE:
				return returnFeatureType != null && !returnFeatureType.isEmpty();
			case WFSPackage.STORED_QUERY_LIST_ITEM_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (returnFeatureType: ");
		result.append(returnFeatureType);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //StoredQueryListItemTypeImpl
