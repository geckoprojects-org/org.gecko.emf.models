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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DocumentReferenceAttester;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference Attester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceAttesterImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceAttesterImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceAttesterImpl#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceAttesterImpl extends BackboneElementImpl implements DocumentReferenceAttester {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept mode;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime time;

	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected Reference party;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceAttesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getDocumentReferenceAttester();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(CodeableConcept newMode, NotificationChain msgs) {
		CodeableConcept oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE, oldMode, newMode);
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
	public void setMode(CodeableConcept newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(DateTime newTime, NotificationChain msgs) {
		DateTime oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME, oldTime, newTime);
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
	public void setTime(DateTime newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getParty() {
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParty(Reference newParty, NotificationChain msgs) {
		Reference oldParty = party;
		party = newParty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY, oldParty, newParty);
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
	public void setParty(Reference newParty) {
		if (newParty != party) {
			NotificationChain msgs = null;
			if (party != null)
				msgs = ((InternalEObject)party).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY, null, msgs);
			if (newParty != null)
				msgs = ((InternalEObject)newParty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY, null, msgs);
			msgs = basicSetParty(newParty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY, newParty, newParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE:
				return basicSetMode(null, msgs);
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME:
				return basicSetTime(null, msgs);
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY:
				return basicSetParty(null, msgs);
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
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE:
				return getMode();
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME:
				return getTime();
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY:
				return getParty();
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
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE:
				setMode((CodeableConcept)newValue);
				return;
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME:
				setTime((DateTime)newValue);
				return;
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY:
				setParty((Reference)newValue);
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
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE:
				setMode((CodeableConcept)null);
				return;
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME:
				setTime((DateTime)null);
				return;
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY:
				setParty((Reference)null);
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
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__MODE:
				return mode != null;
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__TIME:
				return time != null;
			case FHIRPackage.DOCUMENT_REFERENCE_ATTESTER__PARTY:
				return party != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceAttesterImpl
