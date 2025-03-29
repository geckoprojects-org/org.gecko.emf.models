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
package org.omg.spec.bpmn.bpmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TGlobalTask;
import org.omg.spec.bpmn.bpmn.TResourceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGlobal Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TGlobalTaskImpl#getResourceRoleGroup <em>Resource Role Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TGlobalTaskImpl#getResourceRole <em>Resource Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TGlobalTaskImpl extends TCallableElementImpl implements TGlobalTask {
	/**
	 * The cached value of the '{@link #getResourceRoleGroup() <em>Resource Role Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRoleGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap resourceRoleGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGlobalTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTGlobalTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getResourceRoleGroup() {
		if (resourceRoleGroup == null) {
			resourceRoleGroup = new BasicFeatureMap(this, BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE_GROUP);
		}
		return resourceRoleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TResourceRole> getResourceRole() {
		return getResourceRoleGroup().list(BPMNPackage.eINSTANCE.getTGlobalTask_ResourceRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE_GROUP:
				return ((InternalEList<?>)getResourceRoleGroup()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE:
				return ((InternalEList<?>)getResourceRole()).basicRemove(otherEnd, msgs);
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
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE_GROUP:
				if (coreType) return getResourceRoleGroup();
				return ((FeatureMap.Internal)getResourceRoleGroup()).getWrapper();
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE:
				return getResourceRole();
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
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE_GROUP:
				((FeatureMap.Internal)getResourceRoleGroup()).set(newValue);
				return;
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE:
				getResourceRole().clear();
				getResourceRole().addAll((Collection<? extends TResourceRole>)newValue);
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
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE_GROUP:
				getResourceRoleGroup().clear();
				return;
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE:
				getResourceRole().clear();
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
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE_GROUP:
				return resourceRoleGroup != null && !resourceRoleGroup.isEmpty();
			case BPMNPackage.TGLOBAL_TASK__RESOURCE_ROLE:
				return !getResourceRole().isEmpty();
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
		result.append(" (resourceRoleGroup: ");
		result.append(resourceRoleGroup);
		result.append(')');
		return result.toString();
	}

} //TGlobalTaskImpl
