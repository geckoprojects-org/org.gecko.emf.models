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
package net.opengis.gml.gml.impl;

import java.util.Collection;

import net.opengis.gml.gml.AbstractGeneralParameterValuePropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.OperationParameterGroupPropertyType;
import net.opengis.gml.gml.ParameterValueGroupType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueGroupTypeImpl#getParameterValueGroup <em>Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueGroupTypeImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueGroupTypeImpl#getGroupGroup <em>Group Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueGroupTypeImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueGroupTypeImpl extends AbstractGeneralParameterValueTypeImpl implements ParameterValueGroupType {
	/**
	 * The cached value of the '{@link #getParameterValueGroup() <em>Parameter Value Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValueGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap parameterValueGroup;

	/**
	 * The cached value of the '{@link #getGroupGroup() <em>Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap groupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getParameterValueGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getParameterValueGroup() {
		if (parameterValueGroup == null) {
			parameterValueGroup = new BasicFeatureMap(this, GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE_GROUP);
		}
		return parameterValueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeneralParameterValuePropertyType> getParameterValue() {
		return getParameterValueGroup().list(GMLPackage.eINSTANCE.getParameterValueGroupType_ParameterValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroupGroup() {
		if (groupGroup == null) {
			groupGroup = new BasicFeatureMap(this, GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP);
		}
		return groupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterGroupPropertyType getGroup() {
		return (OperationParameterGroupPropertyType)getGroupGroup().get(GMLPackage.eINSTANCE.getParameterValueGroupType_Group(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(OperationParameterGroupPropertyType newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGroupGroup()).basicAdd(GMLPackage.eINSTANCE.getParameterValueGroupType_Group(), newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(OperationParameterGroupPropertyType newGroup) {
		((FeatureMap.Internal)getGroupGroup()).set(GMLPackage.eINSTANCE.getParameterValueGroupType_Group(), newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE_GROUP:
				return ((InternalEList<?>)getParameterValueGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				return ((InternalEList<?>)getParameterValue()).basicRemove(otherEnd, msgs);
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				return ((InternalEList<?>)getGroupGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				return basicSetGroup(null, msgs);
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
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE_GROUP:
				if (coreType) return getParameterValueGroup();
				return ((FeatureMap.Internal)getParameterValueGroup()).getWrapper();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				return getParameterValue();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				if (coreType) return getGroupGroup();
				return ((FeatureMap.Internal)getGroupGroup()).getWrapper();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				return getGroup();
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
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE_GROUP:
				((FeatureMap.Internal)getParameterValueGroup()).set(newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				getParameterValue().clear();
				getParameterValue().addAll((Collection<? extends AbstractGeneralParameterValuePropertyType>)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				((FeatureMap.Internal)getGroupGroup()).set(newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				setGroup((OperationParameterGroupPropertyType)newValue);
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
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE_GROUP:
				getParameterValueGroup().clear();
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				getParameterValue().clear();
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				getGroupGroup().clear();
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				setGroup((OperationParameterGroupPropertyType)null);
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
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE_GROUP:
				return parameterValueGroup != null && !parameterValueGroup.isEmpty();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				return !getParameterValue().isEmpty();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				return groupGroup != null && !groupGroup.isEmpty();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				return getGroup() != null;
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
		result.append(" (parameterValueGroup: ");
		result.append(parameterValueGroup);
		result.append(", groupGroup: ");
		result.append(groupGroup);
		result.append(')');
		return result.toString();
	}

} //ParameterValueGroupTypeImpl
