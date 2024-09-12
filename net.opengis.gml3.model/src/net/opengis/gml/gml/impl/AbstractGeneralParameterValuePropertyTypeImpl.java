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

import net.opengis.gml.gml.AbstractGeneralParameterValuePropertyType;
import net.opengis.gml.gml.AbstractGeneralParameterValueType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract General Parameter Value Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGeneralParameterValuePropertyTypeImpl#getAbstractGeneralParameterValueGroup <em>Abstract General Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGeneralParameterValuePropertyTypeImpl#getAbstractGeneralParameterValue <em>Abstract General Parameter Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractGeneralParameterValuePropertyTypeImpl extends MinimalEObjectImpl.Container implements AbstractGeneralParameterValuePropertyType {
	/**
	 * The cached value of the '{@link #getAbstractGeneralParameterValueGroup() <em>Abstract General Parameter Value Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractGeneralParameterValueGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractGeneralParameterValueGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGeneralParameterValuePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractGeneralParameterValuePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractGeneralParameterValueGroup() {
		if (abstractGeneralParameterValueGroup == null) {
			abstractGeneralParameterValueGroup = new BasicFeatureMap(this, GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE_GROUP);
		}
		return abstractGeneralParameterValueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralParameterValueType getAbstractGeneralParameterValue() {
		return (AbstractGeneralParameterValueType)getAbstractGeneralParameterValueGroup().get(GMLPackage.eINSTANCE.getAbstractGeneralParameterValuePropertyType_AbstractGeneralParameterValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeneralParameterValue(AbstractGeneralParameterValueType newAbstractGeneralParameterValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractGeneralParameterValueGroup()).basicAdd(GMLPackage.eINSTANCE.getAbstractGeneralParameterValuePropertyType_AbstractGeneralParameterValue(), newAbstractGeneralParameterValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE_GROUP:
				return ((InternalEList<?>)getAbstractGeneralParameterValueGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE:
				return basicSetAbstractGeneralParameterValue(null, msgs);
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
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE_GROUP:
				if (coreType) return getAbstractGeneralParameterValueGroup();
				return ((FeatureMap.Internal)getAbstractGeneralParameterValueGroup()).getWrapper();
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE:
				return getAbstractGeneralParameterValue();
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
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE_GROUP:
				((FeatureMap.Internal)getAbstractGeneralParameterValueGroup()).set(newValue);
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
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE_GROUP:
				getAbstractGeneralParameterValueGroup().clear();
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
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE_GROUP:
				return abstractGeneralParameterValueGroup != null && !abstractGeneralParameterValueGroup.isEmpty();
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE__ABSTRACT_GENERAL_PARAMETER_VALUE:
				return getAbstractGeneralParameterValue() != null;
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
		result.append(" (abstractGeneralParameterValueGroup: ");
		result.append(abstractGeneralParameterValueGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractGeneralParameterValuePropertyTypeImpl
