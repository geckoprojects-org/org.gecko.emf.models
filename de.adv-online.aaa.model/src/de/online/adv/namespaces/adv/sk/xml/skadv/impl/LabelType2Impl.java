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
import de.online.adv.namespaces.adv.sk.xml.skadv.LabelType2;
import de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType2Impl#getLabelGroup <em>Label Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType2Impl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelType2Impl extends MinimalEObjectImpl.Container implements LabelType2 {
	/**
	 * The cached value of the '{@link #getLabelGroup() <em>Label Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap labelGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getLabelType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLabelGroup() {
		if (labelGroup == null) {
			labelGroup = new BasicFeatureMap(this, AAAPackage.LABEL_TYPE2__LABEL_GROUP);
		}
		return labelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType3 getLabel() {
		return (LabelType3)getLabelGroup().get(AAAPackage.eINSTANCE.getLabelType2_Label(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType3 newLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLabelGroup()).basicAdd(AAAPackage.eINSTANCE.getLabelType2_Label(), newLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(LabelType3 newLabel) {
		((FeatureMap.Internal)getLabelGroup()).set(AAAPackage.eINSTANCE.getLabelType2_Label(), newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.LABEL_TYPE2__LABEL_GROUP:
				return ((InternalEList<?>)getLabelGroup()).basicRemove(otherEnd, msgs);
			case AAAPackage.LABEL_TYPE2__LABEL:
				return basicSetLabel(null, msgs);
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
			case AAAPackage.LABEL_TYPE2__LABEL_GROUP:
				if (coreType) return getLabelGroup();
				return ((FeatureMap.Internal)getLabelGroup()).getWrapper();
			case AAAPackage.LABEL_TYPE2__LABEL:
				return getLabel();
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
			case AAAPackage.LABEL_TYPE2__LABEL_GROUP:
				((FeatureMap.Internal)getLabelGroup()).set(newValue);
				return;
			case AAAPackage.LABEL_TYPE2__LABEL:
				setLabel((LabelType3)newValue);
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
			case AAAPackage.LABEL_TYPE2__LABEL_GROUP:
				getLabelGroup().clear();
				return;
			case AAAPackage.LABEL_TYPE2__LABEL:
				setLabel((LabelType3)null);
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
			case AAAPackage.LABEL_TYPE2__LABEL_GROUP:
				return labelGroup != null && !labelGroup.isEmpty();
			case AAAPackage.LABEL_TYPE2__LABEL:
				return getLabel() != null;
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
		result.append(" (labelGroup: ");
		result.append(labelGroup);
		result.append(')');
		return result.toString();
	}

} //LabelType2Impl
