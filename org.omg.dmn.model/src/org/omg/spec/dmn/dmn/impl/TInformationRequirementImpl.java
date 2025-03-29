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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TDMNElementReference;
import org.omg.spec.dmn.dmn.TInformationRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInformation Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TInformationRequirementImpl#getRequiredDecision <em>Required Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TInformationRequirementImpl#getRequiredInput <em>Required Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TInformationRequirementImpl extends TDMNElementImpl implements TInformationRequirement {
	/**
	 * The cached value of the '{@link #getRequiredDecision() <em>Required Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredDecision()
	 * @generated
	 * @ordered
	 */
	protected TDMNElementReference requiredDecision;

	/**
	 * The cached value of the '{@link #getRequiredInput() <em>Required Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInput()
	 * @generated
	 * @ordered
	 */
	protected TDMNElementReference requiredInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInformationRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TINFORMATION_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElementReference getRequiredDecision() {
		return requiredDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredDecision(TDMNElementReference newRequiredDecision, NotificationChain msgs) {
		TDMNElementReference oldRequiredDecision = requiredDecision;
		requiredDecision = newRequiredDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION, oldRequiredDecision, newRequiredDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredDecision(TDMNElementReference newRequiredDecision) {
		if (newRequiredDecision != requiredDecision) {
			NotificationChain msgs = null;
			if (requiredDecision != null)
				msgs = ((InternalEObject)requiredDecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION, null, msgs);
			if (newRequiredDecision != null)
				msgs = ((InternalEObject)newRequiredDecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION, null, msgs);
			msgs = basicSetRequiredDecision(newRequiredDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION, newRequiredDecision, newRequiredDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElementReference getRequiredInput() {
		return requiredInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredInput(TDMNElementReference newRequiredInput, NotificationChain msgs) {
		TDMNElementReference oldRequiredInput = requiredInput;
		requiredInput = newRequiredInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT, oldRequiredInput, newRequiredInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredInput(TDMNElementReference newRequiredInput) {
		if (newRequiredInput != requiredInput) {
			NotificationChain msgs = null;
			if (requiredInput != null)
				msgs = ((InternalEObject)requiredInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT, null, msgs);
			if (newRequiredInput != null)
				msgs = ((InternalEObject)newRequiredInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT, null, msgs);
			msgs = basicSetRequiredInput(newRequiredInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT, newRequiredInput, newRequiredInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION:
				return basicSetRequiredDecision(null, msgs);
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT:
				return basicSetRequiredInput(null, msgs);
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
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION:
				return getRequiredDecision();
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT:
				return getRequiredInput();
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
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION:
				setRequiredDecision((TDMNElementReference)newValue);
				return;
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT:
				setRequiredInput((TDMNElementReference)newValue);
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
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION:
				setRequiredDecision((TDMNElementReference)null);
				return;
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT:
				setRequiredInput((TDMNElementReference)null);
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
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_DECISION:
				return requiredDecision != null;
			case DMNPackage.TINFORMATION_REQUIREMENT__REQUIRED_INPUT:
				return requiredInput != null;
		}
		return super.eIsSet(featureID);
	}

} //TInformationRequirementImpl
