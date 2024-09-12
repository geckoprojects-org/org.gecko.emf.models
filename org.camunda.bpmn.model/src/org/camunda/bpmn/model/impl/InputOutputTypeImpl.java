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
import org.camunda.bpmn.model.InputOutputType;
import org.camunda.bpmn.model.ParameterType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.impl.InputOutputTypeImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.InputOutputTypeImpl#getOutputParameters <em>Output Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputOutputTypeImpl extends EObjectImpl implements InputOutputType {
	/**
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> inputParameters;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> outputParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.INPUT_OUTPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterType> getInputParameters() {
		if (inputParameters == null) {
			inputParameters = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, CamundaPackage.INPUT_OUTPUT_TYPE__INPUT_PARAMETERS);
		}
		return inputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterType> getOutputParameters() {
		if (outputParameters == null) {
			outputParameters = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, CamundaPackage.INPUT_OUTPUT_TYPE__OUTPUT_PARAMETERS);
		}
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamundaPackage.INPUT_OUTPUT_TYPE__INPUT_PARAMETERS:
				return ((InternalEList<?>)getInputParameters()).basicRemove(otherEnd, msgs);
			case CamundaPackage.INPUT_OUTPUT_TYPE__OUTPUT_PARAMETERS:
				return ((InternalEList<?>)getOutputParameters()).basicRemove(otherEnd, msgs);
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
			case CamundaPackage.INPUT_OUTPUT_TYPE__INPUT_PARAMETERS:
				return getInputParameters();
			case CamundaPackage.INPUT_OUTPUT_TYPE__OUTPUT_PARAMETERS:
				return getOutputParameters();
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
			case CamundaPackage.INPUT_OUTPUT_TYPE__INPUT_PARAMETERS:
				getInputParameters().clear();
				getInputParameters().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case CamundaPackage.INPUT_OUTPUT_TYPE__OUTPUT_PARAMETERS:
				getOutputParameters().clear();
				getOutputParameters().addAll((Collection<? extends ParameterType>)newValue);
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
			case CamundaPackage.INPUT_OUTPUT_TYPE__INPUT_PARAMETERS:
				getInputParameters().clear();
				return;
			case CamundaPackage.INPUT_OUTPUT_TYPE__OUTPUT_PARAMETERS:
				getOutputParameters().clear();
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
			case CamundaPackage.INPUT_OUTPUT_TYPE__INPUT_PARAMETERS:
				return inputParameters != null && !inputParameters.isEmpty();
			case CamundaPackage.INPUT_OUTPUT_TYPE__OUTPUT_PARAMETERS:
				return outputParameters != null && !outputParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputOutputTypeImpl
