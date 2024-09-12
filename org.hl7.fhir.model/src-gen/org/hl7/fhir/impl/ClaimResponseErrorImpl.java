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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getSubDetailSequence <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseErrorImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseErrorImpl extends BackboneElementImpl implements ClaimResponseError {
	/**
	 * The cached value of the '{@link #getItemSequence() <em>Item Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt itemSequence;

	/**
	 * The cached value of the '{@link #getDetailSequence() <em>Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt detailSequence;

	/**
	 * The cached value of the '{@link #getSubDetailSequence() <em>Sub Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetailSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt subDetailSequence;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getClaimResponseError();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getItemSequence() {
		return itemSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemSequence(PositiveInt newItemSequence, NotificationChain msgs) {
		PositiveInt oldItemSequence = itemSequence;
		itemSequence = newItemSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE, oldItemSequence, newItemSequence);
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
	public void setItemSequence(PositiveInt newItemSequence) {
		if (newItemSequence != itemSequence) {
			NotificationChain msgs = null;
			if (itemSequence != null)
				msgs = ((InternalEObject)itemSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE, null, msgs);
			if (newItemSequence != null)
				msgs = ((InternalEObject)newItemSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE, null, msgs);
			msgs = basicSetItemSequence(newItemSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE, newItemSequence, newItemSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getDetailSequence() {
		return detailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailSequence(PositiveInt newDetailSequence, NotificationChain msgs) {
		PositiveInt oldDetailSequence = detailSequence;
		detailSequence = newDetailSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE, oldDetailSequence, newDetailSequence);
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
	public void setDetailSequence(PositiveInt newDetailSequence) {
		if (newDetailSequence != detailSequence) {
			NotificationChain msgs = null;
			if (detailSequence != null)
				msgs = ((InternalEObject)detailSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE, null, msgs);
			if (newDetailSequence != null)
				msgs = ((InternalEObject)newDetailSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE, null, msgs);
			msgs = basicSetDetailSequence(newDetailSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE, newDetailSequence, newDetailSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSubDetailSequence() {
		return subDetailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubDetailSequence(PositiveInt newSubDetailSequence, NotificationChain msgs) {
		PositiveInt oldSubDetailSequence = subDetailSequence;
		subDetailSequence = newSubDetailSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE, oldSubDetailSequence, newSubDetailSequence);
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
	public void setSubDetailSequence(PositiveInt newSubDetailSequence) {
		if (newSubDetailSequence != subDetailSequence) {
			NotificationChain msgs = null;
			if (subDetailSequence != null)
				msgs = ((InternalEObject)subDetailSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE, null, msgs);
			if (newSubDetailSequence != null)
				msgs = ((InternalEObject)newSubDetailSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE, null, msgs);
			msgs = basicSetSubDetailSequence(newSubDetailSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE, newSubDetailSequence, newSubDetailSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ERROR__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ERROR__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ERROR__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ERROR__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getExpression() {
		if (expression == null) {
			expression = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.CLAIM_RESPONSE_ERROR__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				return basicSetItemSequence(null, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				return basicSetDetailSequence(null, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				return basicSetSubDetailSequence(null, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ERROR__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ERROR__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				return getItemSequence();
			case FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				return getDetailSequence();
			case FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				return getSubDetailSequence();
			case FHIRPackage.CLAIM_RESPONSE_ERROR__CODE:
				return getCode();
			case FHIRPackage.CLAIM_RESPONSE_ERROR__EXPRESSION:
				return getExpression();
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
			case FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				setItemSequence((PositiveInt)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				setDetailSequence((PositiveInt)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				setSubDetailSequence((PositiveInt)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				setItemSequence((PositiveInt)null);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				setDetailSequence((PositiveInt)null);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				setSubDetailSequence((PositiveInt)null);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__EXPRESSION:
				getExpression().clear();
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
			case FHIRPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				return itemSequence != null;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				return detailSequence != null;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				return subDetailSequence != null;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__CODE:
				return code != null;
			case FHIRPackage.CLAIM_RESPONSE_ERROR__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseErrorImpl
