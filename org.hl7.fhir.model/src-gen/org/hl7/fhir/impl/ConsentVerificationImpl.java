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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentVerificationImpl#getVerified <em>Verified</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentVerificationImpl#getVerificationType <em>Verification Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentVerificationImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentVerificationImpl#getVerifiedWith <em>Verified With</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentVerificationImpl#getVerificationDate <em>Verification Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentVerificationImpl extends BackboneElementImpl implements ConsentVerification {
	/**
	 * The cached value of the '{@link #getVerified() <em>Verified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerified()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean verified;

	/**
	 * The cached value of the '{@link #getVerificationType() <em>Verification Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept verificationType;

	/**
	 * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected Reference verifiedBy;

	/**
	 * The cached value of the '{@link #getVerifiedWith() <em>Verified With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedWith()
	 * @generated
	 * @ordered
	 */
	protected Reference verifiedWith;

	/**
	 * The cached value of the '{@link #getVerificationDate() <em>Verification Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateTime> verificationDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentVerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getConsentVerification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getVerified() {
		return verified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerified(org.hl7.fhir.Boolean newVerified, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldVerified = verified;
		verified = newVerified;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_VERIFICATION__VERIFIED, oldVerified, newVerified);
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
	public void setVerified(org.hl7.fhir.Boolean newVerified) {
		if (newVerified != verified) {
			NotificationChain msgs = null;
			if (verified != null)
				msgs = ((InternalEObject)verified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_VERIFICATION__VERIFIED, null, msgs);
			if (newVerified != null)
				msgs = ((InternalEObject)newVerified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_VERIFICATION__VERIFIED, null, msgs);
			msgs = basicSetVerified(newVerified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_VERIFICATION__VERIFIED, newVerified, newVerified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getVerificationType() {
		return verificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationType(CodeableConcept newVerificationType, NotificationChain msgs) {
		CodeableConcept oldVerificationType = verificationType;
		verificationType = newVerificationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE, oldVerificationType, newVerificationType);
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
	public void setVerificationType(CodeableConcept newVerificationType) {
		if (newVerificationType != verificationType) {
			NotificationChain msgs = null;
			if (verificationType != null)
				msgs = ((InternalEObject)verificationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE, null, msgs);
			if (newVerificationType != null)
				msgs = ((InternalEObject)newVerificationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE, null, msgs);
			msgs = basicSetVerificationType(newVerificationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE, newVerificationType, newVerificationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getVerifiedBy() {
		return verifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerifiedBy(Reference newVerifiedBy, NotificationChain msgs) {
		Reference oldVerifiedBy = verifiedBy;
		verifiedBy = newVerifiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY, oldVerifiedBy, newVerifiedBy);
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
	public void setVerifiedBy(Reference newVerifiedBy) {
		if (newVerifiedBy != verifiedBy) {
			NotificationChain msgs = null;
			if (verifiedBy != null)
				msgs = ((InternalEObject)verifiedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY, null, msgs);
			if (newVerifiedBy != null)
				msgs = ((InternalEObject)newVerifiedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY, null, msgs);
			msgs = basicSetVerifiedBy(newVerifiedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY, newVerifiedBy, newVerifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getVerifiedWith() {
		return verifiedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerifiedWith(Reference newVerifiedWith, NotificationChain msgs) {
		Reference oldVerifiedWith = verifiedWith;
		verifiedWith = newVerifiedWith;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH, oldVerifiedWith, newVerifiedWith);
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
	public void setVerifiedWith(Reference newVerifiedWith) {
		if (newVerifiedWith != verifiedWith) {
			NotificationChain msgs = null;
			if (verifiedWith != null)
				msgs = ((InternalEObject)verifiedWith).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH, null, msgs);
			if (newVerifiedWith != null)
				msgs = ((InternalEObject)newVerifiedWith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH, null, msgs);
			msgs = basicSetVerifiedWith(newVerifiedWith, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH, newVerifiedWith, newVerifiedWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateTime> getVerificationDate() {
		if (verificationDate == null) {
			verificationDate = new EObjectContainmentEList<DateTime>(DateTime.class, this, FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_DATE);
		}
		return verificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED:
				return basicSetVerified(null, msgs);
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE:
				return basicSetVerificationType(null, msgs);
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY:
				return basicSetVerifiedBy(null, msgs);
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				return basicSetVerifiedWith(null, msgs);
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				return ((InternalEList<?>)getVerificationDate()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED:
				return getVerified();
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE:
				return getVerificationType();
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY:
				return getVerifiedBy();
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				return getVerifiedWith();
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				return getVerificationDate();
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
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED:
				setVerified((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE:
				setVerificationType((CodeableConcept)newValue);
				return;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY:
				setVerifiedBy((Reference)newValue);
				return;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				setVerifiedWith((Reference)newValue);
				return;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				getVerificationDate().clear();
				getVerificationDate().addAll((Collection<? extends DateTime>)newValue);
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
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED:
				setVerified((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE:
				setVerificationType((CodeableConcept)null);
				return;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY:
				setVerifiedBy((Reference)null);
				return;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				setVerifiedWith((Reference)null);
				return;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				getVerificationDate().clear();
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
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED:
				return verified != null;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_TYPE:
				return verificationType != null;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_BY:
				return verifiedBy != null;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				return verifiedWith != null;
			case FHIRPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				return verificationDate != null && !verificationDate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentVerificationImpl
