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

import org.camunda.bpmn.model.CamundaPackage;
import org.camunda.bpmn.model.ListType;
import org.camunda.bpmn.model.MapType;
import org.camunda.bpmn.model.ParameterType;
import org.camunda.bpmn.model.ScriptType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.impl.ParameterTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ParameterTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ParameterTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ParameterTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ParameterTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.ParameterTypeImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterTypeImpl extends EObjectImpl implements ParameterType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.PARAMETER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.PARAMETER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CamundaPackage.PARAMETER_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptType getScript() {
		return (ScriptType)getMixed().get(CamundaPackage.Literals.PARAMETER_TYPE__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(ScriptType newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.PARAMETER_TYPE__SCRIPT, newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(ScriptType newScript) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.PARAMETER_TYPE__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapType getMap() {
		return (MapType)getMixed().get(CamundaPackage.Literals.PARAMETER_TYPE__MAP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(MapType newMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.PARAMETER_TYPE__MAP, newMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMap(MapType newMap) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.PARAMETER_TYPE__MAP, newMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType getList() {
		return (ListType)getMixed().get(CamundaPackage.Literals.PARAMETER_TYPE__LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(ListType newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.PARAMETER_TYPE__LIST, newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setList(ListType newList) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.PARAMETER_TYPE__LIST, newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		// TODO: implement this method to return the 'Text' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		// TODO: implement this method to set the 'Text' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamundaPackage.PARAMETER_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CamundaPackage.PARAMETER_TYPE__SCRIPT:
				return basicSetScript(null, msgs);
			case CamundaPackage.PARAMETER_TYPE__MAP:
				return basicSetMap(null, msgs);
			case CamundaPackage.PARAMETER_TYPE__LIST:
				return basicSetList(null, msgs);
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
			case CamundaPackage.PARAMETER_TYPE__NAME:
				return getName();
			case CamundaPackage.PARAMETER_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CamundaPackage.PARAMETER_TYPE__SCRIPT:
				return getScript();
			case CamundaPackage.PARAMETER_TYPE__MAP:
				return getMap();
			case CamundaPackage.PARAMETER_TYPE__LIST:
				return getList();
			case CamundaPackage.PARAMETER_TYPE__TEXT:
				return getText();
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
			case CamundaPackage.PARAMETER_TYPE__NAME:
				setName((String)newValue);
				return;
			case CamundaPackage.PARAMETER_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CamundaPackage.PARAMETER_TYPE__SCRIPT:
				setScript((ScriptType)newValue);
				return;
			case CamundaPackage.PARAMETER_TYPE__MAP:
				setMap((MapType)newValue);
				return;
			case CamundaPackage.PARAMETER_TYPE__LIST:
				setList((ListType)newValue);
				return;
			case CamundaPackage.PARAMETER_TYPE__TEXT:
				setText((String)newValue);
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
			case CamundaPackage.PARAMETER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CamundaPackage.PARAMETER_TYPE__MIXED:
				getMixed().clear();
				return;
			case CamundaPackage.PARAMETER_TYPE__SCRIPT:
				setScript((ScriptType)null);
				return;
			case CamundaPackage.PARAMETER_TYPE__MAP:
				setMap((MapType)null);
				return;
			case CamundaPackage.PARAMETER_TYPE__LIST:
				setList((ListType)null);
				return;
			case CamundaPackage.PARAMETER_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
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
			case CamundaPackage.PARAMETER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CamundaPackage.PARAMETER_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CamundaPackage.PARAMETER_TYPE__SCRIPT:
				return getScript() != null;
			case CamundaPackage.PARAMETER_TYPE__MAP:
				return getMap() != null;
			case CamundaPackage.PARAMETER_TYPE__LIST:
				return getList() != null;
			case CamundaPackage.PARAMETER_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //ParameterTypeImpl
