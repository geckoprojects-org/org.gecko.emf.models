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
import org.omg.spec.dmn.dmn.TKnowledgeRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TKnowledge Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TKnowledgeRequirementImpl#getRequiredKnowledge <em>Required Knowledge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TKnowledgeRequirementImpl extends TDMNElementImpl implements TKnowledgeRequirement {
	/**
	 * The cached value of the '{@link #getRequiredKnowledge() <em>Required Knowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredKnowledge()
	 * @generated
	 * @ordered
	 */
	protected TDMNElementReference requiredKnowledge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TKnowledgeRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TKNOWLEDGE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElementReference getRequiredKnowledge() {
		return requiredKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredKnowledge(TDMNElementReference newRequiredKnowledge, NotificationChain msgs) {
		TDMNElementReference oldRequiredKnowledge = requiredKnowledge;
		requiredKnowledge = newRequiredKnowledge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE, oldRequiredKnowledge, newRequiredKnowledge);
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
	public void setRequiredKnowledge(TDMNElementReference newRequiredKnowledge) {
		if (newRequiredKnowledge != requiredKnowledge) {
			NotificationChain msgs = null;
			if (requiredKnowledge != null)
				msgs = ((InternalEObject)requiredKnowledge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE, null, msgs);
			if (newRequiredKnowledge != null)
				msgs = ((InternalEObject)newRequiredKnowledge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE, null, msgs);
			msgs = basicSetRequiredKnowledge(newRequiredKnowledge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE, newRequiredKnowledge, newRequiredKnowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE:
				return basicSetRequiredKnowledge(null, msgs);
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
			case DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE:
				return getRequiredKnowledge();
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
			case DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE:
				setRequiredKnowledge((TDMNElementReference)newValue);
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
			case DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE:
				setRequiredKnowledge((TDMNElementReference)null);
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
			case DMNPackage.TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE:
				return requiredKnowledge != null;
		}
		return super.eIsSet(featureID);
	}

} //TKnowledgeRequirementImpl
