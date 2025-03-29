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
package org.omg.spec.cmmn.casemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TCaseParameter;
import org.omg.spec.cmmn.casemodel.TTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TTaskImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TTaskImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TTaskImpl#isIsBlocking <em>Is Blocking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TTaskImpl extends TPlanItemDefinitionImpl implements TTask {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<TCaseParameter> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TCaseParameter> output;

	/**
	 * The default value of the '{@link #isIsBlocking() <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBlocking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BLOCKING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsBlocking() <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBlocking()
	 * @generated
	 * @ordered
	 */
	protected boolean isBlocking = IS_BLOCKING_EDEFAULT;

	/**
	 * This is true if the Is Blocking attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBlockingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TTASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCaseParameter> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<TCaseParameter>(TCaseParameter.class, this, CaseModelPackage.TTASK__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCaseParameter> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<TCaseParameter>(TCaseParameter.class, this, CaseModelPackage.TTASK__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsBlocking() {
		return isBlocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBlocking(boolean newIsBlocking) {
		boolean oldIsBlocking = isBlocking;
		isBlocking = newIsBlocking;
		boolean oldIsBlockingESet = isBlockingESet;
		isBlockingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TTASK__IS_BLOCKING, oldIsBlocking, isBlocking, !oldIsBlockingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsBlocking() {
		boolean oldIsBlocking = isBlocking;
		boolean oldIsBlockingESet = isBlockingESet;
		isBlocking = IS_BLOCKING_EDEFAULT;
		isBlockingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CaseModelPackage.TTASK__IS_BLOCKING, oldIsBlocking, IS_BLOCKING_EDEFAULT, oldIsBlockingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsBlocking() {
		return isBlockingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TTASK__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TTASK__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case CaseModelPackage.TTASK__INPUT:
				return getInput();
			case CaseModelPackage.TTASK__OUTPUT:
				return getOutput();
			case CaseModelPackage.TTASK__IS_BLOCKING:
				return isIsBlocking();
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
			case CaseModelPackage.TTASK__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends TCaseParameter>)newValue);
				return;
			case CaseModelPackage.TTASK__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends TCaseParameter>)newValue);
				return;
			case CaseModelPackage.TTASK__IS_BLOCKING:
				setIsBlocking((Boolean)newValue);
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
			case CaseModelPackage.TTASK__INPUT:
				getInput().clear();
				return;
			case CaseModelPackage.TTASK__OUTPUT:
				getOutput().clear();
				return;
			case CaseModelPackage.TTASK__IS_BLOCKING:
				unsetIsBlocking();
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
			case CaseModelPackage.TTASK__INPUT:
				return input != null && !input.isEmpty();
			case CaseModelPackage.TTASK__OUTPUT:
				return output != null && !output.isEmpty();
			case CaseModelPackage.TTASK__IS_BLOCKING:
				return isSetIsBlocking();
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
		result.append(" (isBlocking: ");
		if (isBlockingESet) result.append(isBlocking); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TTaskImpl
