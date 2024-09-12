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

import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponseReviewOutcome;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseItemImpl#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseItemImpl#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseItemImpl#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseItemImpl#getReviewOutcome <em>Review Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseItemImpl#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseItemImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseItemImpl extends BackboneElementImpl implements ClaimResponseItem {
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
	 * The cached value of the '{@link #getTraceNumber() <em>Trace Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> traceNumber;

	/**
	 * The cached value of the '{@link #getNoteNumber() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumber;

	/**
	 * The cached value of the '{@link #getReviewOutcome() <em>Review Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOutcome()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponseReviewOutcome reviewOutcome;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAdjudication> adjudication;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseDetail> detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getClaimResponseItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE, oldItemSequence, newItemSequence);
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
				msgs = ((InternalEObject)itemSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE, null, msgs);
			if (newItemSequence != null)
				msgs = ((InternalEObject)newItemSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE, null, msgs);
			msgs = basicSetItemSequence(newItemSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE, newItemSequence, newItemSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getTraceNumber() {
		if (traceNumber == null) {
			traceNumber = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.CLAIM_RESPONSE_ITEM__TRACE_NUMBER);
		}
		return traceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getNoteNumber() {
		if (noteNumber == null) {
			noteNumber = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FHIRPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER);
		}
		return noteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseReviewOutcome getReviewOutcome() {
		return reviewOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewOutcome(ClaimResponseReviewOutcome newReviewOutcome, NotificationChain msgs) {
		ClaimResponseReviewOutcome oldReviewOutcome = reviewOutcome;
		reviewOutcome = newReviewOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME, oldReviewOutcome, newReviewOutcome);
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
	public void setReviewOutcome(ClaimResponseReviewOutcome newReviewOutcome) {
		if (newReviewOutcome != reviewOutcome) {
			NotificationChain msgs = null;
			if (reviewOutcome != null)
				msgs = ((InternalEObject)reviewOutcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME, null, msgs);
			if (newReviewOutcome != null)
				msgs = ((InternalEObject)newReviewOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME, null, msgs);
			msgs = basicSetReviewOutcome(newReviewOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME, newReviewOutcome, newReviewOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseAdjudication> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ClaimResponseAdjudication>(ClaimResponseAdjudication.class, this, FHIRPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<ClaimResponseDetail>(ClaimResponseDetail.class, this, FHIRPackage.CLAIM_RESPONSE_ITEM__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				return basicSetItemSequence(null, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ITEM__TRACE_NUMBER:
				return ((InternalEList<?>)getTraceNumber()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumber()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME:
				return basicSetReviewOutcome(null, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				return getItemSequence();
			case FHIRPackage.CLAIM_RESPONSE_ITEM__TRACE_NUMBER:
				return getTraceNumber();
			case FHIRPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				return getNoteNumber();
			case FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME:
				return getReviewOutcome();
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				return getAdjudication();
			case FHIRPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				return getDetail();
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
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				setItemSequence((PositiveInt)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__TRACE_NUMBER:
				getTraceNumber().clear();
				getTraceNumber().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				getNoteNumber().clear();
				getNoteNumber().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME:
				setReviewOutcome((ClaimResponseReviewOutcome)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ClaimResponseAdjudication>)newValue);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends ClaimResponseDetail>)newValue);
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
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				setItemSequence((PositiveInt)null);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__TRACE_NUMBER:
				getTraceNumber().clear();
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				getNoteNumber().clear();
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME:
				setReviewOutcome((ClaimResponseReviewOutcome)null);
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				getAdjudication().clear();
				return;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				getDetail().clear();
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
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				return itemSequence != null;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__TRACE_NUMBER:
				return traceNumber != null && !traceNumber.isEmpty();
			case FHIRPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				return noteNumber != null && !noteNumber.isEmpty();
			case FHIRPackage.CLAIM_RESPONSE_ITEM__REVIEW_OUTCOME:
				return reviewOutcome != null;
			case FHIRPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
			case FHIRPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				return detail != null && !detail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseItemImpl
