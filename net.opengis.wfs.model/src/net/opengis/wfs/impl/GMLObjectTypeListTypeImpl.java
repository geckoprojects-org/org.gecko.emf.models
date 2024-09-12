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

import net.opengis.wfs.GMLObjectTypeListType;
import net.opengis.wfs.GMLObjectTypeType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GML Object Type List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.GMLObjectTypeListTypeImpl#getGMLObjectType <em>GML Object Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GMLObjectTypeListTypeImpl extends MinimalEObjectImpl.Container implements GMLObjectTypeListType {
	/**
	 * The cached value of the '{@link #getGMLObjectType() <em>GML Object Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGMLObjectType()
	 * @generated
	 * @ordered
	 */
	protected EList<GMLObjectTypeType> gMLObjectType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMLObjectTypeListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.GML_OBJECT_TYPE_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GMLObjectTypeType> getGMLObjectType() {
		if (gMLObjectType == null) {
			gMLObjectType = new EObjectContainmentEList<GMLObjectTypeType>(GMLObjectTypeType.class, this, WFSPackage.GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE);
		}
		return gMLObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE:
				return ((InternalEList<?>)getGMLObjectType()).basicRemove(otherEnd, msgs);
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
			case WFSPackage.GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE:
				return getGMLObjectType();
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
			case WFSPackage.GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE:
				getGMLObjectType().clear();
				getGMLObjectType().addAll((Collection<? extends GMLObjectTypeType>)newValue);
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
			case WFSPackage.GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE:
				getGMLObjectType().clear();
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
			case WFSPackage.GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE:
				return gMLObjectType != null && !gMLObjectType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GMLObjectTypeListTypeImpl
