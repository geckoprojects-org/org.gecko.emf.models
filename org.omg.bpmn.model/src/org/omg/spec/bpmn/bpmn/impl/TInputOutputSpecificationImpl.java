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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TDataInput;
import org.omg.spec.bpmn.bpmn.TDataOutput;
import org.omg.spec.bpmn.bpmn.TInputOutputSpecification;
import org.omg.spec.bpmn.bpmn.TInputSet;
import org.omg.spec.bpmn.bpmn.TOutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInput Output Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputSpecificationImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputSpecificationImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputSpecificationImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputSpecificationImpl#getOutputSet <em>Output Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TInputOutputSpecificationImpl extends TBaseElementImpl implements TInputOutputSpecification {
	/**
	 * The cached value of the '{@link #getDataInput() <em>Data Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInput()
	 * @generated
	 * @ordered
	 */
	protected EList<TDataInput> dataInput;

	/**
	 * The cached value of the '{@link #getDataOutput() <em>Data Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TDataOutput> dataOutput;

	/**
	 * The cached value of the '{@link #getInputSet() <em>Input Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSet()
	 * @generated
	 * @ordered
	 */
	protected EList<TInputSet> inputSet;

	/**
	 * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSet()
	 * @generated
	 * @ordered
	 */
	protected EList<TOutputSet> outputSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInputOutputSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTInputOutputSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDataInput> getDataInput() {
		if (dataInput == null) {
			dataInput = new EObjectContainmentEList<TDataInput>(TDataInput.class, this, BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_INPUT);
		}
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDataOutput> getDataOutput() {
		if (dataOutput == null) {
			dataOutput = new EObjectContainmentEList<TDataOutput>(TDataOutput.class, this, BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT);
		}
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInputSet> getInputSet() {
		if (inputSet == null) {
			inputSet = new EObjectContainmentEList<TInputSet>(TInputSet.class, this, BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__INPUT_SET);
		}
		return inputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOutputSet> getOutputSet() {
		if (outputSet == null) {
			outputSet = new EObjectContainmentEList<TOutputSet>(TOutputSet.class, this, BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__OUTPUT_SET);
		}
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
				return ((InternalEList<?>)getDataInput()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
				return ((InternalEList<?>)getDataOutput()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__INPUT_SET:
				return ((InternalEList<?>)getInputSet()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
				return ((InternalEList<?>)getOutputSet()).basicRemove(otherEnd, msgs);
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
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
				return getDataInput();
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
				return getDataOutput();
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__INPUT_SET:
				return getInputSet();
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
				return getOutputSet();
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
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
				getDataInput().clear();
				getDataInput().addAll((Collection<? extends TDataInput>)newValue);
				return;
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
				getDataOutput().clear();
				getDataOutput().addAll((Collection<? extends TDataOutput>)newValue);
				return;
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__INPUT_SET:
				getInputSet().clear();
				getInputSet().addAll((Collection<? extends TInputSet>)newValue);
				return;
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
				getOutputSet().clear();
				getOutputSet().addAll((Collection<? extends TOutputSet>)newValue);
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
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
				getDataInput().clear();
				return;
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
				getDataOutput().clear();
				return;
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__INPUT_SET:
				getInputSet().clear();
				return;
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
				getOutputSet().clear();
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
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
				return dataInput != null && !dataInput.isEmpty();
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
				return dataOutput != null && !dataOutput.isEmpty();
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__INPUT_SET:
				return inputSet != null && !inputSet.isEmpty();
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
				return outputSet != null && !outputSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TInputOutputSpecificationImpl
