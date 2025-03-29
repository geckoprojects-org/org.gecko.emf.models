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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TDMNElementReference;
import org.omg.spec.dmn.dmn.TDecisionService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDecision Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionServiceImpl#getOutputDecision <em>Output Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionServiceImpl#getEncapsulatedDecision <em>Encapsulated Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionServiceImpl#getInputDecision <em>Input Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionServiceImpl#getInputData <em>Input Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDecisionServiceImpl extends TInvocableImpl implements TDecisionService {
	/**
	 * The cached value of the '{@link #getOutputDecision() <em>Output Decision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> outputDecision;

	/**
	 * The cached value of the '{@link #getEncapsulatedDecision() <em>Encapsulated Decision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> encapsulatedDecision;

	/**
	 * The cached value of the '{@link #getInputDecision() <em>Input Decision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> inputDecision;

	/**
	 * The cached value of the '{@link #getInputData() <em>Input Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputData()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> inputData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDecisionServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TDECISION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getOutputDecision() {
		if (outputDecision == null) {
			outputDecision = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION_SERVICE__OUTPUT_DECISION);
		}
		return outputDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getEncapsulatedDecision() {
		if (encapsulatedDecision == null) {
			encapsulatedDecision = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION_SERVICE__ENCAPSULATED_DECISION);
		}
		return encapsulatedDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getInputDecision() {
		if (inputDecision == null) {
			inputDecision = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION_SERVICE__INPUT_DECISION);
		}
		return inputDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getInputData() {
		if (inputData == null) {
			inputData = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION_SERVICE__INPUT_DATA);
		}
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TDECISION_SERVICE__OUTPUT_DECISION:
				return ((InternalEList<?>)getOutputDecision()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION_SERVICE__ENCAPSULATED_DECISION:
				return ((InternalEList<?>)getEncapsulatedDecision()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION_SERVICE__INPUT_DECISION:
				return ((InternalEList<?>)getInputDecision()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION_SERVICE__INPUT_DATA:
				return ((InternalEList<?>)getInputData()).basicRemove(otherEnd, msgs);
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
			case DMNPackage.TDECISION_SERVICE__OUTPUT_DECISION:
				return getOutputDecision();
			case DMNPackage.TDECISION_SERVICE__ENCAPSULATED_DECISION:
				return getEncapsulatedDecision();
			case DMNPackage.TDECISION_SERVICE__INPUT_DECISION:
				return getInputDecision();
			case DMNPackage.TDECISION_SERVICE__INPUT_DATA:
				return getInputData();
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
			case DMNPackage.TDECISION_SERVICE__OUTPUT_DECISION:
				getOutputDecision().clear();
				getOutputDecision().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION_SERVICE__ENCAPSULATED_DECISION:
				getEncapsulatedDecision().clear();
				getEncapsulatedDecision().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION_SERVICE__INPUT_DECISION:
				getInputDecision().clear();
				getInputDecision().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION_SERVICE__INPUT_DATA:
				getInputData().clear();
				getInputData().addAll((Collection<? extends TDMNElementReference>)newValue);
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
			case DMNPackage.TDECISION_SERVICE__OUTPUT_DECISION:
				getOutputDecision().clear();
				return;
			case DMNPackage.TDECISION_SERVICE__ENCAPSULATED_DECISION:
				getEncapsulatedDecision().clear();
				return;
			case DMNPackage.TDECISION_SERVICE__INPUT_DECISION:
				getInputDecision().clear();
				return;
			case DMNPackage.TDECISION_SERVICE__INPUT_DATA:
				getInputData().clear();
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
			case DMNPackage.TDECISION_SERVICE__OUTPUT_DECISION:
				return outputDecision != null && !outputDecision.isEmpty();
			case DMNPackage.TDECISION_SERVICE__ENCAPSULATED_DECISION:
				return encapsulatedDecision != null && !encapsulatedDecision.isEmpty();
			case DMNPackage.TDECISION_SERVICE__INPUT_DECISION:
				return inputDecision != null && !inputDecision.isEmpty();
			case DMNPackage.TDECISION_SERVICE__INPUT_DATA:
				return inputData != null && !inputData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TDecisionServiceImpl
