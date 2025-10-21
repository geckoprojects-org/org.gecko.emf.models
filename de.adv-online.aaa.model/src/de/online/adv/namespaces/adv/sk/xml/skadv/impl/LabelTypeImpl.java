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
import de.online.adv.namespaces.adv.sk.xml.skadv.LabelType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelTypeImpl#getPointLabelGroup <em>Point Label Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelTypeImpl#getPointLabel <em>Point Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelTypeImpl extends MinimalEObjectImpl.Container implements LabelType {
	/**
	 * The cached value of the '{@link #getPointLabelGroup() <em>Point Label Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointLabelGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap pointLabelGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getLabelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPointLabelGroup() {
		if (pointLabelGroup == null) {
			pointLabelGroup = new BasicFeatureMap(this, AAAPackage.LABEL_TYPE__POINT_LABEL_GROUP);
		}
		return pointLabelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointLabelType getPointLabel() {
		return (PointLabelType)getPointLabelGroup().get(AAAPackage.eINSTANCE.getLabelType_PointLabel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointLabel(PointLabelType newPointLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getPointLabelGroup()).basicAdd(AAAPackage.eINSTANCE.getLabelType_PointLabel(), newPointLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointLabel(PointLabelType newPointLabel) {
		((FeatureMap.Internal)getPointLabelGroup()).set(AAAPackage.eINSTANCE.getLabelType_PointLabel(), newPointLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.LABEL_TYPE__POINT_LABEL_GROUP:
				return ((InternalEList<?>)getPointLabelGroup()).basicRemove(otherEnd, msgs);
			case AAAPackage.LABEL_TYPE__POINT_LABEL:
				return basicSetPointLabel(null, msgs);
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
			case AAAPackage.LABEL_TYPE__POINT_LABEL_GROUP:
				if (coreType) return getPointLabelGroup();
				return ((FeatureMap.Internal)getPointLabelGroup()).getWrapper();
			case AAAPackage.LABEL_TYPE__POINT_LABEL:
				return getPointLabel();
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
			case AAAPackage.LABEL_TYPE__POINT_LABEL_GROUP:
				((FeatureMap.Internal)getPointLabelGroup()).set(newValue);
				return;
			case AAAPackage.LABEL_TYPE__POINT_LABEL:
				setPointLabel((PointLabelType)newValue);
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
			case AAAPackage.LABEL_TYPE__POINT_LABEL_GROUP:
				getPointLabelGroup().clear();
				return;
			case AAAPackage.LABEL_TYPE__POINT_LABEL:
				setPointLabel((PointLabelType)null);
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
			case AAAPackage.LABEL_TYPE__POINT_LABEL_GROUP:
				return pointLabelGroup != null && !pointLabelGroup.isEmpty();
			case AAAPackage.LABEL_TYPE__POINT_LABEL:
				return getPointLabel() != null;
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
		result.append(" (pointLabelGroup: ");
		result.append(pointLabelGroup);
		result.append(')');
		return result.toString();
	}

} //LabelTypeImpl
