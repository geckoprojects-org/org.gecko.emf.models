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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TInputOutputBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInput Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputBindingImpl#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputBindingImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputBindingImpl#getOutputDataRef <em>Output Data Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TInputOutputBindingImpl extends TBaseElementImpl implements TInputOutputBinding {
	/**
	 * The default value of the '{@link #getInputDataRef() <em>Input Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataRef()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_DATA_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputDataRef() <em>Input Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataRef()
	 * @generated
	 * @ordered
	 */
	protected String inputDataRef = INPUT_DATA_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationRef() <em>Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName OPERATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRef()
	 * @generated
	 * @ordered
	 */
	protected QName operationRef = OPERATION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputDataRef() <em>Output Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataRef()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_DATA_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputDataRef() <em>Output Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataRef()
	 * @generated
	 * @ordered
	 */
	protected String outputDataRef = OUTPUT_DATA_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInputOutputBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTInputOutputBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputDataRef() {
		return inputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputDataRef(String newInputDataRef) {
		String oldInputDataRef = inputDataRef;
		inputDataRef = newInputDataRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TINPUT_OUTPUT_BINDING__INPUT_DATA_REF, oldInputDataRef, inputDataRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getOperationRef() {
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationRef(QName newOperationRef) {
		QName oldOperationRef = operationRef;
		operationRef = newOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TINPUT_OUTPUT_BINDING__OPERATION_REF, oldOperationRef, operationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputDataRef() {
		return outputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDataRef(String newOutputDataRef) {
		String oldOutputDataRef = outputDataRef;
		outputDataRef = newOutputDataRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TINPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, oldOutputDataRef, outputDataRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TINPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				return getInputDataRef();
			case BPMNPackage.TINPUT_OUTPUT_BINDING__OPERATION_REF:
				return getOperationRef();
			case BPMNPackage.TINPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				return getOutputDataRef();
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
			case BPMNPackage.TINPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				setInputDataRef((String)newValue);
				return;
			case BPMNPackage.TINPUT_OUTPUT_BINDING__OPERATION_REF:
				setOperationRef((QName)newValue);
				return;
			case BPMNPackage.TINPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				setOutputDataRef((String)newValue);
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
			case BPMNPackage.TINPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				setInputDataRef(INPUT_DATA_REF_EDEFAULT);
				return;
			case BPMNPackage.TINPUT_OUTPUT_BINDING__OPERATION_REF:
				setOperationRef(OPERATION_REF_EDEFAULT);
				return;
			case BPMNPackage.TINPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				setOutputDataRef(OUTPUT_DATA_REF_EDEFAULT);
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
			case BPMNPackage.TINPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				return INPUT_DATA_REF_EDEFAULT == null ? inputDataRef != null : !INPUT_DATA_REF_EDEFAULT.equals(inputDataRef);
			case BPMNPackage.TINPUT_OUTPUT_BINDING__OPERATION_REF:
				return OPERATION_REF_EDEFAULT == null ? operationRef != null : !OPERATION_REF_EDEFAULT.equals(operationRef);
			case BPMNPackage.TINPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				return OUTPUT_DATA_REF_EDEFAULT == null ? outputDataRef != null : !OUTPUT_DATA_REF_EDEFAULT.equals(outputDataRef);
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
		result.append(" (inputDataRef: ");
		result.append(inputDataRef);
		result.append(", operationRef: ");
		result.append(operationRef);
		result.append(", outputDataRef: ");
		result.append(outputDataRef);
		result.append(')');
		return result.toString();
	}

} //TInputOutputBindingImpl
