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
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.AccountBalance;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Money;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Balance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AccountBalanceImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountBalanceImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountBalanceImpl#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountBalanceImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountBalanceImpl extends BackboneElementImpl implements AccountBalance {
	/**
	 * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregate()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept aggregate;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept term;

	/**
	 * The cached value of the '{@link #getEstimate() <em>Estimate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean estimate;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Money amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountBalanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAccountBalance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAggregate() {
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(CodeableConcept newAggregate, NotificationChain msgs) {
		CodeableConcept oldAggregate = aggregate;
		aggregate = newAggregate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_BALANCE__AGGREGATE, oldAggregate, newAggregate);
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
	public void setAggregate(CodeableConcept newAggregate) {
		if (newAggregate != aggregate) {
			NotificationChain msgs = null;
			if (aggregate != null)
				msgs = ((InternalEObject)aggregate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_BALANCE__AGGREGATE, null, msgs);
			if (newAggregate != null)
				msgs = ((InternalEObject)newAggregate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_BALANCE__AGGREGATE, null, msgs);
			msgs = basicSetAggregate(newAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_BALANCE__AGGREGATE, newAggregate, newAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(CodeableConcept newTerm, NotificationChain msgs) {
		CodeableConcept oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_BALANCE__TERM, oldTerm, newTerm);
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
	public void setTerm(CodeableConcept newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_BALANCE__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_BALANCE__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_BALANCE__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getEstimate() {
		return estimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstimate(org.hl7.fhir.Boolean newEstimate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldEstimate = estimate;
		estimate = newEstimate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_BALANCE__ESTIMATE, oldEstimate, newEstimate);
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
	public void setEstimate(org.hl7.fhir.Boolean newEstimate) {
		if (newEstimate != estimate) {
			NotificationChain msgs = null;
			if (estimate != null)
				msgs = ((InternalEObject)estimate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_BALANCE__ESTIMATE, null, msgs);
			if (newEstimate != null)
				msgs = ((InternalEObject)newEstimate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_BALANCE__ESTIMATE, null, msgs);
			msgs = basicSetEstimate(newEstimate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_BALANCE__ESTIMATE, newEstimate, newEstimate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Money newAmount, NotificationChain msgs) {
		Money oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_BALANCE__AMOUNT, oldAmount, newAmount);
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
	public void setAmount(Money newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_BALANCE__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_BALANCE__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_BALANCE__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ACCOUNT_BALANCE__AGGREGATE:
				return basicSetAggregate(null, msgs);
			case FHIRPackage.ACCOUNT_BALANCE__TERM:
				return basicSetTerm(null, msgs);
			case FHIRPackage.ACCOUNT_BALANCE__ESTIMATE:
				return basicSetEstimate(null, msgs);
			case FHIRPackage.ACCOUNT_BALANCE__AMOUNT:
				return basicSetAmount(null, msgs);
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
			case FHIRPackage.ACCOUNT_BALANCE__AGGREGATE:
				return getAggregate();
			case FHIRPackage.ACCOUNT_BALANCE__TERM:
				return getTerm();
			case FHIRPackage.ACCOUNT_BALANCE__ESTIMATE:
				return getEstimate();
			case FHIRPackage.ACCOUNT_BALANCE__AMOUNT:
				return getAmount();
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
			case FHIRPackage.ACCOUNT_BALANCE__AGGREGATE:
				setAggregate((CodeableConcept)newValue);
				return;
			case FHIRPackage.ACCOUNT_BALANCE__TERM:
				setTerm((CodeableConcept)newValue);
				return;
			case FHIRPackage.ACCOUNT_BALANCE__ESTIMATE:
				setEstimate((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.ACCOUNT_BALANCE__AMOUNT:
				setAmount((Money)newValue);
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
			case FHIRPackage.ACCOUNT_BALANCE__AGGREGATE:
				setAggregate((CodeableConcept)null);
				return;
			case FHIRPackage.ACCOUNT_BALANCE__TERM:
				setTerm((CodeableConcept)null);
				return;
			case FHIRPackage.ACCOUNT_BALANCE__ESTIMATE:
				setEstimate((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.ACCOUNT_BALANCE__AMOUNT:
				setAmount((Money)null);
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
			case FHIRPackage.ACCOUNT_BALANCE__AGGREGATE:
				return aggregate != null;
			case FHIRPackage.ACCOUNT_BALANCE__TERM:
				return term != null;
			case FHIRPackage.ACCOUNT_BALANCE__ESTIMATE:
				return estimate != null;
			case FHIRPackage.ACCOUNT_BALANCE__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountBalanceImpl
