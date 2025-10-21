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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PropertyType;
import de.online.adv.namespaces.adv.sk.xml.skadv.StepType1;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PropertyTypeImpl#getFirstStep <em>First Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PropertyTypeImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyTypeImpl extends ExpressionType1Impl implements PropertyType {
	/**
	 * The cached value of the '{@link #getFirstStep() <em>First Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstStep()
	 * @generated
	 * @ordered
	 */
	protected FirstStepType firstStep;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<StepType1> step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstStepType getFirstStep() {
		return firstStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstStep(FirstStepType newFirstStep, NotificationChain msgs) {
		FirstStepType oldFirstStep = firstStep;
		firstStep = newFirstStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.PROPERTY_TYPE__FIRST_STEP, oldFirstStep, newFirstStep);
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
	public void setFirstStep(FirstStepType newFirstStep) {
		if (newFirstStep != firstStep) {
			NotificationChain msgs = null;
			if (firstStep != null)
				msgs = ((InternalEObject)firstStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.PROPERTY_TYPE__FIRST_STEP, null, msgs);
			if (newFirstStep != null)
				msgs = ((InternalEObject)newFirstStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.PROPERTY_TYPE__FIRST_STEP, null, msgs);
			msgs = basicSetFirstStep(newFirstStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.PROPERTY_TYPE__FIRST_STEP, newFirstStep, newFirstStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StepType1> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<StepType1>(StepType1.class, this, AAAPackage.PROPERTY_TYPE__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.PROPERTY_TYPE__FIRST_STEP:
				return basicSetFirstStep(null, msgs);
			case AAAPackage.PROPERTY_TYPE__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
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
			case AAAPackage.PROPERTY_TYPE__FIRST_STEP:
				return getFirstStep();
			case AAAPackage.PROPERTY_TYPE__STEP:
				return getStep();
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
			case AAAPackage.PROPERTY_TYPE__FIRST_STEP:
				setFirstStep((FirstStepType)newValue);
				return;
			case AAAPackage.PROPERTY_TYPE__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends StepType1>)newValue);
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
			case AAAPackage.PROPERTY_TYPE__FIRST_STEP:
				setFirstStep((FirstStepType)null);
				return;
			case AAAPackage.PROPERTY_TYPE__STEP:
				getStep().clear();
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
			case AAAPackage.PROPERTY_TYPE__FIRST_STEP:
				return firstStep != null;
			case AAAPackage.PROPERTY_TYPE__STEP:
				return step != null && !step.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyTypeImpl
