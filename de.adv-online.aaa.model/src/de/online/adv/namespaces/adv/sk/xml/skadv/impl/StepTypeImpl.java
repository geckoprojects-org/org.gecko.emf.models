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
import de.online.adv.namespaces.adv.sk.xml.skadv.PredicateType;
import de.online.adv.namespaces.adv.sk.xml.skadv.StepType;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StepTypeImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StepTypeImpl#isIsAttr <em>Is Attr</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StepTypeImpl#getStepName <em>Step Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepTypeImpl extends MinimalEObjectImpl.Container implements StepType {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected PredicateType predicate;

	/**
	 * The default value of the '{@link #isIsAttr() <em>Is Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ATTR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAttr() <em>Is Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAttr()
	 * @generated
	 * @ordered
	 */
	protected boolean isAttr = IS_ATTR_EDEFAULT;

	/**
	 * This is true if the Is Attr attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAttrESet;

	/**
	 * The default value of the '{@link #getStepName() <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepName()
	 * @generated
	 * @ordered
	 */
	protected static final QName STEP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepName() <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepName()
	 * @generated
	 * @ordered
	 */
	protected QName stepName = STEP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getStepType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateType getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(PredicateType newPredicate, NotificationChain msgs) {
		PredicateType oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.STEP_TYPE__PREDICATE, oldPredicate, newPredicate);
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
	public void setPredicate(PredicateType newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.STEP_TYPE__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.STEP_TYPE__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.STEP_TYPE__PREDICATE, newPredicate, newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAttr() {
		return isAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAttr(boolean newIsAttr) {
		boolean oldIsAttr = isAttr;
		isAttr = newIsAttr;
		boolean oldIsAttrESet = isAttrESet;
		isAttrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.STEP_TYPE__IS_ATTR, oldIsAttr, isAttr, !oldIsAttrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsAttr() {
		boolean oldIsAttr = isAttr;
		boolean oldIsAttrESet = isAttrESet;
		isAttr = IS_ATTR_EDEFAULT;
		isAttrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.STEP_TYPE__IS_ATTR, oldIsAttr, IS_ATTR_EDEFAULT, oldIsAttrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsAttr() {
		return isAttrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getStepName() {
		return stepName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepName(QName newStepName) {
		QName oldStepName = stepName;
		stepName = newStepName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.STEP_TYPE__STEP_NAME, oldStepName, stepName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.STEP_TYPE__PREDICATE:
				return basicSetPredicate(null, msgs);
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
			case AAAPackage.STEP_TYPE__PREDICATE:
				return getPredicate();
			case AAAPackage.STEP_TYPE__IS_ATTR:
				return isIsAttr();
			case AAAPackage.STEP_TYPE__STEP_NAME:
				return getStepName();
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
			case AAAPackage.STEP_TYPE__PREDICATE:
				setPredicate((PredicateType)newValue);
				return;
			case AAAPackage.STEP_TYPE__IS_ATTR:
				setIsAttr((Boolean)newValue);
				return;
			case AAAPackage.STEP_TYPE__STEP_NAME:
				setStepName((QName)newValue);
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
			case AAAPackage.STEP_TYPE__PREDICATE:
				setPredicate((PredicateType)null);
				return;
			case AAAPackage.STEP_TYPE__IS_ATTR:
				unsetIsAttr();
				return;
			case AAAPackage.STEP_TYPE__STEP_NAME:
				setStepName(STEP_NAME_EDEFAULT);
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
			case AAAPackage.STEP_TYPE__PREDICATE:
				return predicate != null;
			case AAAPackage.STEP_TYPE__IS_ATTR:
				return isSetIsAttr();
			case AAAPackage.STEP_TYPE__STEP_NAME:
				return STEP_NAME_EDEFAULT == null ? stepName != null : !STEP_NAME_EDEFAULT.equals(stepName);
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
		result.append(" (isAttr: ");
		if (isAttrESet) result.append(isAttr); else result.append("<unset>");
		result.append(", stepName: ");
		result.append(stepName);
		result.append(')');
		return result.toString();
	}

} //StepTypeImpl
