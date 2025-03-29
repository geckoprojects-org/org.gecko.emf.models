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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TExpression;
import org.omg.spec.cmmn.casemodel.TStartTrigger;
import org.omg.spec.cmmn.casemodel.TTimerEventListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTimer Event Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TTimerEventListenerImpl#getTimerExpression <em>Timer Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TTimerEventListenerImpl#getTimerStartGroup <em>Timer Start Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TTimerEventListenerImpl#getTimerStart <em>Timer Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TTimerEventListenerImpl extends TEventListenerImpl implements TTimerEventListener {
	/**
	 * The cached value of the '{@link #getTimerExpression() <em>Timer Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerExpression()
	 * @generated
	 * @ordered
	 */
	protected TExpression timerExpression;

	/**
	 * The cached value of the '{@link #getTimerStartGroup() <em>Timer Start Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerStartGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap timerStartGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTimerEventListenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TTIMER_EVENT_LISTENER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getTimerExpression() {
		return timerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerExpression(TExpression newTimerExpression, NotificationChain msgs) {
		TExpression oldTimerExpression = timerExpression;
		timerExpression = newTimerExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION, oldTimerExpression, newTimerExpression);
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
	public void setTimerExpression(TExpression newTimerExpression) {
		if (newTimerExpression != timerExpression) {
			NotificationChain msgs = null;
			if (timerExpression != null)
				msgs = ((InternalEObject)timerExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION, null, msgs);
			if (newTimerExpression != null)
				msgs = ((InternalEObject)newTimerExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION, null, msgs);
			msgs = basicSetTimerExpression(newTimerExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION, newTimerExpression, newTimerExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTimerStartGroup() {
		if (timerStartGroup == null) {
			timerStartGroup = new BasicFeatureMap(this, CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START_GROUP);
		}
		return timerStartGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStartTrigger getTimerStart() {
		return (TStartTrigger)getTimerStartGroup().get(CaseModelPackage.Literals.TTIMER_EVENT_LISTENER__TIMER_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerStart(TStartTrigger newTimerStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getTimerStartGroup()).basicAdd(CaseModelPackage.Literals.TTIMER_EVENT_LISTENER__TIMER_START, newTimerStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimerStart(TStartTrigger newTimerStart) {
		((FeatureMap.Internal)getTimerStartGroup()).set(CaseModelPackage.Literals.TTIMER_EVENT_LISTENER__TIMER_START, newTimerStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION:
				return basicSetTimerExpression(null, msgs);
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START_GROUP:
				return ((InternalEList<?>)getTimerStartGroup()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START:
				return basicSetTimerStart(null, msgs);
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
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION:
				return getTimerExpression();
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START_GROUP:
				if (coreType) return getTimerStartGroup();
				return ((FeatureMap.Internal)getTimerStartGroup()).getWrapper();
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START:
				return getTimerStart();
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
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION:
				setTimerExpression((TExpression)newValue);
				return;
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START_GROUP:
				((FeatureMap.Internal)getTimerStartGroup()).set(newValue);
				return;
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START:
				setTimerStart((TStartTrigger)newValue);
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
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION:
				setTimerExpression((TExpression)null);
				return;
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START_GROUP:
				getTimerStartGroup().clear();
				return;
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START:
				setTimerStart((TStartTrigger)null);
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
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_EXPRESSION:
				return timerExpression != null;
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START_GROUP:
				return timerStartGroup != null && !timerStartGroup.isEmpty();
			case CaseModelPackage.TTIMER_EVENT_LISTENER__TIMER_START:
				return getTimerStart() != null;
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
		result.append(" (timerStartGroup: ");
		result.append(timerStartGroup);
		result.append(')');
		return result.toString();
	}

} //TTimerEventListenerImpl
