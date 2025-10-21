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
import de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType;
import de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType1;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FirstStepTypeImpl#getFirstStepGroup <em>First Step Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FirstStepTypeImpl#getFirstStep <em>First Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirstStepTypeImpl extends MinimalEObjectImpl.Container implements FirstStepType {
	/**
	 * The cached value of the '{@link #getFirstStepGroup() <em>First Step Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstStepGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap firstStepGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstStepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getFirstStepType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFirstStepGroup() {
		if (firstStepGroup == null) {
			firstStepGroup = new BasicFeatureMap(this, AAAPackage.FIRST_STEP_TYPE__FIRST_STEP_GROUP);
		}
		return firstStepGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstStepType1 getFirstStep() {
		return (FirstStepType1)getFirstStepGroup().get(AAAPackage.eINSTANCE.getFirstStepType_FirstStep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstStep(FirstStepType1 newFirstStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getFirstStepGroup()).basicAdd(AAAPackage.eINSTANCE.getFirstStepType_FirstStep(), newFirstStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.FIRST_STEP_TYPE__FIRST_STEP_GROUP:
				return ((InternalEList<?>)getFirstStepGroup()).basicRemove(otherEnd, msgs);
			case AAAPackage.FIRST_STEP_TYPE__FIRST_STEP:
				return basicSetFirstStep(null, msgs);
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
			case AAAPackage.FIRST_STEP_TYPE__FIRST_STEP_GROUP:
				if (coreType) return getFirstStepGroup();
				return ((FeatureMap.Internal)getFirstStepGroup()).getWrapper();
			case AAAPackage.FIRST_STEP_TYPE__FIRST_STEP:
				return getFirstStep();
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
			case AAAPackage.FIRST_STEP_TYPE__FIRST_STEP_GROUP:
				((FeatureMap.Internal)getFirstStepGroup()).set(newValue);
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
			case AAAPackage.FIRST_STEP_TYPE__FIRST_STEP_GROUP:
				getFirstStepGroup().clear();
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
			case AAAPackage.FIRST_STEP_TYPE__FIRST_STEP_GROUP:
				return firstStepGroup != null && !firstStepGroup.isEmpty();
			case AAAPackage.FIRST_STEP_TYPE__FIRST_STEP:
				return getFirstStep() != null;
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
		result.append(" (firstStepGroup: ");
		result.append(firstStepGroup);
		result.append(')');
		return result.toString();
	}

} //FirstStepTypeImpl
