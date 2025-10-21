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
import de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType2;
import de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StrokeType2Impl#getStrokeGroup <em>Stroke Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StrokeType2Impl#getStroke <em>Stroke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrokeType2Impl extends MinimalEObjectImpl.Container implements StrokeType2 {
	/**
	 * The cached value of the '{@link #getStrokeGroup() <em>Stroke Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap strokeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrokeType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getStrokeType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStrokeGroup() {
		if (strokeGroup == null) {
			strokeGroup = new BasicFeatureMap(this, AAAPackage.STROKE_TYPE2__STROKE_GROUP);
		}
		return strokeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokeType5 getStroke() {
		return (StrokeType5)getStrokeGroup().get(AAAPackage.eINSTANCE.getStrokeType2_Stroke(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStroke(StrokeType5 newStroke, NotificationChain msgs) {
		return ((FeatureMap.Internal)getStrokeGroup()).basicAdd(AAAPackage.eINSTANCE.getStrokeType2_Stroke(), newStroke, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.STROKE_TYPE2__STROKE_GROUP:
				return ((InternalEList<?>)getStrokeGroup()).basicRemove(otherEnd, msgs);
			case AAAPackage.STROKE_TYPE2__STROKE:
				return basicSetStroke(null, msgs);
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
			case AAAPackage.STROKE_TYPE2__STROKE_GROUP:
				if (coreType) return getStrokeGroup();
				return ((FeatureMap.Internal)getStrokeGroup()).getWrapper();
			case AAAPackage.STROKE_TYPE2__STROKE:
				return getStroke();
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
			case AAAPackage.STROKE_TYPE2__STROKE_GROUP:
				((FeatureMap.Internal)getStrokeGroup()).set(newValue);
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
			case AAAPackage.STROKE_TYPE2__STROKE_GROUP:
				getStrokeGroup().clear();
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
			case AAAPackage.STROKE_TYPE2__STROKE_GROUP:
				return strokeGroup != null && !strokeGroup.isEmpty();
			case AAAPackage.STROKE_TYPE2__STROKE:
				return getStroke() != null;
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
		result.append(" (strokeGroup: ");
		result.append(strokeGroup);
		result.append(')');
		return result.toString();
	}

} //StrokeType2Impl
