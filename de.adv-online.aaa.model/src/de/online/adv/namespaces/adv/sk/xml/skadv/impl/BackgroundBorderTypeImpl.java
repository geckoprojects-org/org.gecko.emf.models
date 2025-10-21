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
import de.online.adv.namespaces.adv.sk.xml.skadv.BackgroundBorderType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background Border Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.BackgroundBorderTypeImpl#getSolidOrDashedStrokeGroup <em>Solid Or Dashed Stroke Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.BackgroundBorderTypeImpl#getSolidOrDashedStroke <em>Solid Or Dashed Stroke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackgroundBorderTypeImpl extends MinimalEObjectImpl.Container implements BackgroundBorderType {
	/**
	 * The cached value of the '{@link #getSolidOrDashedStrokeGroup() <em>Solid Or Dashed Stroke Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidOrDashedStrokeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap solidOrDashedStrokeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundBorderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getBackgroundBorderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSolidOrDashedStrokeGroup() {
		if (solidOrDashedStrokeGroup == null) {
			solidOrDashedStrokeGroup = new BasicFeatureMap(this, AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE_GROUP);
		}
		return solidOrDashedStrokeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidOrDashedStrokeType getSolidOrDashedStroke() {
		return (SolidOrDashedStrokeType)getSolidOrDashedStrokeGroup().get(AAAPackage.eINSTANCE.getBackgroundBorderType_SolidOrDashedStroke(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidOrDashedStroke(SolidOrDashedStrokeType newSolidOrDashedStroke, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSolidOrDashedStrokeGroup()).basicAdd(AAAPackage.eINSTANCE.getBackgroundBorderType_SolidOrDashedStroke(), newSolidOrDashedStroke, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE_GROUP:
				return ((InternalEList<?>)getSolidOrDashedStrokeGroup()).basicRemove(otherEnd, msgs);
			case AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE:
				return basicSetSolidOrDashedStroke(null, msgs);
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
			case AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE_GROUP:
				if (coreType) return getSolidOrDashedStrokeGroup();
				return ((FeatureMap.Internal)getSolidOrDashedStrokeGroup()).getWrapper();
			case AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE:
				return getSolidOrDashedStroke();
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
			case AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE_GROUP:
				((FeatureMap.Internal)getSolidOrDashedStrokeGroup()).set(newValue);
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
			case AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE_GROUP:
				getSolidOrDashedStrokeGroup().clear();
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
			case AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE_GROUP:
				return solidOrDashedStrokeGroup != null && !solidOrDashedStrokeGroup.isEmpty();
			case AAAPackage.BACKGROUND_BORDER_TYPE__SOLID_OR_DASHED_STROKE:
				return getSolidOrDashedStroke() != null;
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
		result.append(" (solidOrDashedStrokeGroup: ");
		result.append(solidOrDashedStrokeGroup);
		result.append(')');
		return result.toString();
	}

} //BackgroundBorderTypeImpl
