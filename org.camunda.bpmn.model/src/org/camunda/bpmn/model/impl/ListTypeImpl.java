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
package org.camunda.bpmn.model.impl;

import java.util.Collection;

import org.camunda.bpmn.model.CamundaPackage;
import org.camunda.bpmn.model.ListType;
import org.camunda.bpmn.model.MapType;
import org.camunda.bpmn.model.ScriptType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.impl.ListTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ListTypeImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ListTypeImpl#getMaps <em>Maps</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ListTypeImpl#getLists <em>Lists</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ListTypeImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListTypeImpl extends EObjectImpl implements ListType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamundaPackage.LIST_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScriptType> getScripts() {
		return getGroup().list(CamundaPackage.Literals.LIST_TYPE__SCRIPTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapType> getMaps() {
		return getGroup().list(CamundaPackage.Literals.LIST_TYPE__MAPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getLists() {
		return getGroup().list(CamundaPackage.Literals.LIST_TYPE__LISTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValues() {
		return getGroup().list(CamundaPackage.Literals.LIST_TYPE__VALUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamundaPackage.LIST_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamundaPackage.LIST_TYPE__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
			case CamundaPackage.LIST_TYPE__MAPS:
				return ((InternalEList<?>)getMaps()).basicRemove(otherEnd, msgs);
			case CamundaPackage.LIST_TYPE__LISTS:
				return ((InternalEList<?>)getLists()).basicRemove(otherEnd, msgs);
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
			case CamundaPackage.LIST_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamundaPackage.LIST_TYPE__SCRIPTS:
				return getScripts();
			case CamundaPackage.LIST_TYPE__MAPS:
				return getMaps();
			case CamundaPackage.LIST_TYPE__LISTS:
				return getLists();
			case CamundaPackage.LIST_TYPE__VALUES:
				return getValues();
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
			case CamundaPackage.LIST_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamundaPackage.LIST_TYPE__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case CamundaPackage.LIST_TYPE__MAPS:
				getMaps().clear();
				getMaps().addAll((Collection<? extends MapType>)newValue);
				return;
			case CamundaPackage.LIST_TYPE__LISTS:
				getLists().clear();
				getLists().addAll((Collection<? extends ListType>)newValue);
				return;
			case CamundaPackage.LIST_TYPE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
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
			case CamundaPackage.LIST_TYPE__GROUP:
				getGroup().clear();
				return;
			case CamundaPackage.LIST_TYPE__SCRIPTS:
				getScripts().clear();
				return;
			case CamundaPackage.LIST_TYPE__MAPS:
				getMaps().clear();
				return;
			case CamundaPackage.LIST_TYPE__LISTS:
				getLists().clear();
				return;
			case CamundaPackage.LIST_TYPE__VALUES:
				getValues().clear();
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
			case CamundaPackage.LIST_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CamundaPackage.LIST_TYPE__SCRIPTS:
				return !getScripts().isEmpty();
			case CamundaPackage.LIST_TYPE__MAPS:
				return !getMaps().isEmpty();
			case CamundaPackage.LIST_TYPE__LISTS:
				return !getLists().isEmpty();
			case CamundaPackage.LIST_TYPE__VALUES:
				return !getValues().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ListTypeImpl
