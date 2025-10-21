/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.FillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.InteriorType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interior Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.InteriorTypeImpl#getFillGroup <em>Fill Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.InteriorTypeImpl#getFill <em>Fill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteriorTypeImpl extends MinimalEObjectImpl.Container implements InteriorType {
	/**
	 * The cached value of the '{@link #getFillGroup() <em>Fill Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap fillGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteriorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getInteriorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFillGroup() {
		if (fillGroup == null) {
			fillGroup = new BasicFeatureMap(this, AAAPackage.INTERIOR_TYPE__FILL_GROUP);
		}
		return fillGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FillType getFill() {
		return (FillType)getFillGroup().get(AAAPackage.eINSTANCE.getInteriorType_Fill(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFill(FillType newFill, NotificationChain msgs) {
		return ((FeatureMap.Internal)getFillGroup()).basicAdd(AAAPackage.eINSTANCE.getInteriorType_Fill(), newFill, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.INTERIOR_TYPE__FILL_GROUP:
				return ((InternalEList<?>)getFillGroup()).basicRemove(otherEnd, msgs);
			case AAAPackage.INTERIOR_TYPE__FILL:
				return basicSetFill(null, msgs);
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
			case AAAPackage.INTERIOR_TYPE__FILL_GROUP:
				if (coreType) return getFillGroup();
				return ((FeatureMap.Internal)getFillGroup()).getWrapper();
			case AAAPackage.INTERIOR_TYPE__FILL:
				return getFill();
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
			case AAAPackage.INTERIOR_TYPE__FILL_GROUP:
				((FeatureMap.Internal)getFillGroup()).set(newValue);
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
			case AAAPackage.INTERIOR_TYPE__FILL_GROUP:
				getFillGroup().clear();
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
			case AAAPackage.INTERIOR_TYPE__FILL_GROUP:
				return fillGroup != null && !fillGroup.isEmpty();
			case AAAPackage.INTERIOR_TYPE__FILL:
				return getFill() != null;
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
		result.append(" (fillGroup: ");
		result.append(fillGroup);
		result.append(')');
		return result.toString();
	}

} //InteriorTypeImpl
