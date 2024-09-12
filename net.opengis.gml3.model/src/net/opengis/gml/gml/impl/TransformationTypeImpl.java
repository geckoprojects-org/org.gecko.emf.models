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
import net.opengis.gml.gml.OperationMethodPropertyType;
import net.opengis.gml.gml.TransformationType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.TransformationTypeImpl#getMethodGroup <em>Method Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TransformationTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TransformationTypeImpl#getParameterValueGroup <em>Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TransformationTypeImpl#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationTypeImpl extends AbstractGeneralTransformationTypeImpl implements TransformationType {
	/**
	 * The cached value of the '{@link #getMethodGroup() <em>Method Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap methodGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTransformationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMethodGroup() {
		if (methodGroup == null) {
			methodGroup = new BasicFeatureMap(this, GMLPackage.TRANSFORMATION_TYPE__METHOD_GROUP);
		}
		return methodGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationMethodPropertyType getMethod() {
		return (OperationMethodPropertyType)getMethodGroup().get(GMLPackage.eINSTANCE.getTransformationType_Method(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(OperationMethodPropertyType newMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMethodGroup()).basicAdd(GMLPackage.eINSTANCE.getTransformationType_Method(), newMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(OperationMethodPropertyType newMethod) {
		((FeatureMap.Internal)getMethodGroup()).set(GMLPackage.eINSTANCE.getTransformationType_Method(), newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getParameterValueGroup() {
		if (parameterValueGroup == null) {
			parameterValueGroup = new BasicFeatureMap(this, GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE_GROUP);
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
		return getParameterValueGroup().list(GMLPackage.eINSTANCE.getTransformationType_ParameterValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TRANSFORMATION_TYPE__METHOD_GROUP:
				return ((InternalEList<?>)getMethodGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TRANSFORMATION_TYPE__METHOD:
				return basicSetMethod(null, msgs);
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE_GROUP:
				return ((InternalEList<?>)getParameterValueGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE:
				return ((InternalEList<?>)getParameterValue()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.TRANSFORMATION_TYPE__METHOD_GROUP:
				if (coreType) return getMethodGroup();
				return ((FeatureMap.Internal)getMethodGroup()).getWrapper();
			case GMLPackage.TRANSFORMATION_TYPE__METHOD:
				return getMethod();
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE_GROUP:
				if (coreType) return getParameterValueGroup();
				return ((FeatureMap.Internal)getParameterValueGroup()).getWrapper();
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE:
				return getParameterValue();
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
			case GMLPackage.TRANSFORMATION_TYPE__METHOD_GROUP:
				((FeatureMap.Internal)getMethodGroup()).set(newValue);
				return;
			case GMLPackage.TRANSFORMATION_TYPE__METHOD:
				setMethod((OperationMethodPropertyType)newValue);
				return;
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE_GROUP:
				((FeatureMap.Internal)getParameterValueGroup()).set(newValue);
				return;
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE:
				getParameterValue().clear();
				getParameterValue().addAll((Collection<? extends AbstractGeneralParameterValuePropertyType>)newValue);
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
			case GMLPackage.TRANSFORMATION_TYPE__METHOD_GROUP:
				getMethodGroup().clear();
				return;
			case GMLPackage.TRANSFORMATION_TYPE__METHOD:
				setMethod((OperationMethodPropertyType)null);
				return;
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE_GROUP:
				getParameterValueGroup().clear();
				return;
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE:
				getParameterValue().clear();
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
			case GMLPackage.TRANSFORMATION_TYPE__METHOD_GROUP:
				return methodGroup != null && !methodGroup.isEmpty();
			case GMLPackage.TRANSFORMATION_TYPE__METHOD:
				return getMethod() != null;
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE_GROUP:
				return parameterValueGroup != null && !parameterValueGroup.isEmpty();
			case GMLPackage.TRANSFORMATION_TYPE__PARAMETER_VALUE:
				return !getParameterValue().isEmpty();
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
		result.append(" (methodGroup: ");
		result.append(methodGroup);
		result.append(", parameterValueGroup: ");
		result.append(parameterValueGroup);
		result.append(')');
		return result.toString();
	}

} //TransformationTypeImpl
