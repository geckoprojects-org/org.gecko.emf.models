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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentPolicyBasis;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.ConsentProvisionType;
import org.hl7.fhir.ConsentState;
import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.Date;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getGrantor <em>Grantor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getGrantee <em>Grantee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getController <em>Controller</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceAttachment <em>Source Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getRegulatoryBasis <em>Regulatory Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPolicyBasis <em>Policy Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPolicyText <em>Policy Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getVerification <em>Verification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentImpl extends DomainResourceImpl implements Consent {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConsentState status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getGrantor() <em>Grantor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> grantor;

	/**
	 * The cached value of the '{@link #getGrantee() <em>Grantee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantee()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> grantee;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manager;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> controller;

	/**
	 * The cached value of the '{@link #getSourceAttachment() <em>Source Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> sourceAttachment;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sourceReference;

	/**
	 * The cached value of the '{@link #getRegulatoryBasis() <em>Regulatory Basis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryBasis()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> regulatoryBasis;

	/**
	 * The cached value of the '{@link #getPolicyBasis() <em>Policy Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyBasis()
	 * @generated
	 * @ordered
	 */
	protected ConsentPolicyBasis policyBasis;

	/**
	 * The cached value of the '{@link #getPolicyText() <em>Policy Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyText()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> policyText;

	/**
	 * The cached value of the '{@link #getVerification() <em>Verification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerification()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentVerification> verification;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected ConsentProvisionType decision;

	/**
	 * The cached value of the '{@link #getProvision() <em>Provision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvision()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentProvision> provision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.CONSENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentState getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConsentState newStatus, NotificationChain msgs) {
		ConsentState oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__STATUS, oldStatus, newStatus);
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
	public void setStatus(ConsentState newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CONSENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__DATE, oldDate, newDate);
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
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getGrantor() {
		if (grantor == null) {
			grantor = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CONSENT__GRANTOR);
		}
		return grantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getGrantee() {
		if (grantee == null) {
			grantee = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CONSENT__GRANTEE);
		}
		return grantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManager() {
		if (manager == null) {
			manager = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CONSENT__MANAGER);
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CONSENT__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getSourceAttachment() {
		if (sourceAttachment == null) {
			sourceAttachment = new EObjectContainmentEList<Attachment>(Attachment.class, this, FHIRPackage.CONSENT__SOURCE_ATTACHMENT);
		}
		return sourceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSourceReference() {
		if (sourceReference == null) {
			sourceReference = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CONSENT__SOURCE_REFERENCE);
		}
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRegulatoryBasis() {
		if (regulatoryBasis == null) {
			regulatoryBasis = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CONSENT__REGULATORY_BASIS);
		}
		return regulatoryBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentPolicyBasis getPolicyBasis() {
		return policyBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyBasis(ConsentPolicyBasis newPolicyBasis, NotificationChain msgs) {
		ConsentPolicyBasis oldPolicyBasis = policyBasis;
		policyBasis = newPolicyBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__POLICY_BASIS, oldPolicyBasis, newPolicyBasis);
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
	public void setPolicyBasis(ConsentPolicyBasis newPolicyBasis) {
		if (newPolicyBasis != policyBasis) {
			NotificationChain msgs = null;
			if (policyBasis != null)
				msgs = ((InternalEObject)policyBasis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__POLICY_BASIS, null, msgs);
			if (newPolicyBasis != null)
				msgs = ((InternalEObject)newPolicyBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__POLICY_BASIS, null, msgs);
			msgs = basicSetPolicyBasis(newPolicyBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__POLICY_BASIS, newPolicyBasis, newPolicyBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPolicyText() {
		if (policyText == null) {
			policyText = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CONSENT__POLICY_TEXT);
		}
		return policyText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentVerification> getVerification() {
		if (verification == null) {
			verification = new EObjectContainmentEList<ConsentVerification>(ConsentVerification.class, this, FHIRPackage.CONSENT__VERIFICATION);
		}
		return verification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentProvisionType getDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(ConsentProvisionType newDecision, NotificationChain msgs) {
		ConsentProvisionType oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__DECISION, oldDecision, newDecision);
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
	public void setDecision(ConsentProvisionType newDecision) {
		if (newDecision != decision) {
			NotificationChain msgs = null;
			if (decision != null)
				msgs = ((InternalEObject)decision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__DECISION, null, msgs);
			if (newDecision != null)
				msgs = ((InternalEObject)newDecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT__DECISION, null, msgs);
			msgs = basicSetDecision(newDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT__DECISION, newDecision, newDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentProvision> getProvision() {
		if (provision == null) {
			provision = new EObjectContainmentEList<ConsentProvision>(ConsentProvision.class, this, FHIRPackage.CONSENT__PROVISION);
		}
		return provision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CONSENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.CONSENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.CONSENT__DATE:
				return basicSetDate(null, msgs);
			case FHIRPackage.CONSENT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FHIRPackage.CONSENT__GRANTOR:
				return ((InternalEList<?>)getGrantor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__GRANTEE:
				return ((InternalEList<?>)getGrantee()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__MANAGER:
				return ((InternalEList<?>)getManager()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__CONTROLLER:
				return ((InternalEList<?>)getController()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__SOURCE_ATTACHMENT:
				return ((InternalEList<?>)getSourceAttachment()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__SOURCE_REFERENCE:
				return ((InternalEList<?>)getSourceReference()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__REGULATORY_BASIS:
				return ((InternalEList<?>)getRegulatoryBasis()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__POLICY_BASIS:
				return basicSetPolicyBasis(null, msgs);
			case FHIRPackage.CONSENT__POLICY_TEXT:
				return ((InternalEList<?>)getPolicyText()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__VERIFICATION:
				return ((InternalEList<?>)getVerification()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT__DECISION:
				return basicSetDecision(null, msgs);
			case FHIRPackage.CONSENT__PROVISION:
				return ((InternalEList<?>)getProvision()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CONSENT__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.CONSENT__STATUS:
				return getStatus();
			case FHIRPackage.CONSENT__CATEGORY:
				return getCategory();
			case FHIRPackage.CONSENT__SUBJECT:
				return getSubject();
			case FHIRPackage.CONSENT__DATE:
				return getDate();
			case FHIRPackage.CONSENT__PERIOD:
				return getPeriod();
			case FHIRPackage.CONSENT__GRANTOR:
				return getGrantor();
			case FHIRPackage.CONSENT__GRANTEE:
				return getGrantee();
			case FHIRPackage.CONSENT__MANAGER:
				return getManager();
			case FHIRPackage.CONSENT__CONTROLLER:
				return getController();
			case FHIRPackage.CONSENT__SOURCE_ATTACHMENT:
				return getSourceAttachment();
			case FHIRPackage.CONSENT__SOURCE_REFERENCE:
				return getSourceReference();
			case FHIRPackage.CONSENT__REGULATORY_BASIS:
				return getRegulatoryBasis();
			case FHIRPackage.CONSENT__POLICY_BASIS:
				return getPolicyBasis();
			case FHIRPackage.CONSENT__POLICY_TEXT:
				return getPolicyText();
			case FHIRPackage.CONSENT__VERIFICATION:
				return getVerification();
			case FHIRPackage.CONSENT__DECISION:
				return getDecision();
			case FHIRPackage.CONSENT__PROVISION:
				return getProvision();
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
			case FHIRPackage.CONSENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.CONSENT__STATUS:
				setStatus((ConsentState)newValue);
				return;
			case FHIRPackage.CONSENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CONSENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.CONSENT__DATE:
				setDate((Date)newValue);
				return;
			case FHIRPackage.CONSENT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FHIRPackage.CONSENT__GRANTOR:
				getGrantor().clear();
				getGrantor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CONSENT__GRANTEE:
				getGrantee().clear();
				getGrantee().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CONSENT__MANAGER:
				getManager().clear();
				getManager().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CONSENT__CONTROLLER:
				getController().clear();
				getController().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CONSENT__SOURCE_ATTACHMENT:
				getSourceAttachment().clear();
				getSourceAttachment().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FHIRPackage.CONSENT__SOURCE_REFERENCE:
				getSourceReference().clear();
				getSourceReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CONSENT__REGULATORY_BASIS:
				getRegulatoryBasis().clear();
				getRegulatoryBasis().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CONSENT__POLICY_BASIS:
				setPolicyBasis((ConsentPolicyBasis)newValue);
				return;
			case FHIRPackage.CONSENT__POLICY_TEXT:
				getPolicyText().clear();
				getPolicyText().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CONSENT__VERIFICATION:
				getVerification().clear();
				getVerification().addAll((Collection<? extends ConsentVerification>)newValue);
				return;
			case FHIRPackage.CONSENT__DECISION:
				setDecision((ConsentProvisionType)newValue);
				return;
			case FHIRPackage.CONSENT__PROVISION:
				getProvision().clear();
				getProvision().addAll((Collection<? extends ConsentProvision>)newValue);
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
			case FHIRPackage.CONSENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.CONSENT__STATUS:
				setStatus((ConsentState)null);
				return;
			case FHIRPackage.CONSENT__CATEGORY:
				getCategory().clear();
				return;
			case FHIRPackage.CONSENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.CONSENT__DATE:
				setDate((Date)null);
				return;
			case FHIRPackage.CONSENT__PERIOD:
				setPeriod((Period)null);
				return;
			case FHIRPackage.CONSENT__GRANTOR:
				getGrantor().clear();
				return;
			case FHIRPackage.CONSENT__GRANTEE:
				getGrantee().clear();
				return;
			case FHIRPackage.CONSENT__MANAGER:
				getManager().clear();
				return;
			case FHIRPackage.CONSENT__CONTROLLER:
				getController().clear();
				return;
			case FHIRPackage.CONSENT__SOURCE_ATTACHMENT:
				getSourceAttachment().clear();
				return;
			case FHIRPackage.CONSENT__SOURCE_REFERENCE:
				getSourceReference().clear();
				return;
			case FHIRPackage.CONSENT__REGULATORY_BASIS:
				getRegulatoryBasis().clear();
				return;
			case FHIRPackage.CONSENT__POLICY_BASIS:
				setPolicyBasis((ConsentPolicyBasis)null);
				return;
			case FHIRPackage.CONSENT__POLICY_TEXT:
				getPolicyText().clear();
				return;
			case FHIRPackage.CONSENT__VERIFICATION:
				getVerification().clear();
				return;
			case FHIRPackage.CONSENT__DECISION:
				setDecision((ConsentProvisionType)null);
				return;
			case FHIRPackage.CONSENT__PROVISION:
				getProvision().clear();
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
			case FHIRPackage.CONSENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.CONSENT__STATUS:
				return status != null;
			case FHIRPackage.CONSENT__CATEGORY:
				return category != null && !category.isEmpty();
			case FHIRPackage.CONSENT__SUBJECT:
				return subject != null;
			case FHIRPackage.CONSENT__DATE:
				return date != null;
			case FHIRPackage.CONSENT__PERIOD:
				return period != null;
			case FHIRPackage.CONSENT__GRANTOR:
				return grantor != null && !grantor.isEmpty();
			case FHIRPackage.CONSENT__GRANTEE:
				return grantee != null && !grantee.isEmpty();
			case FHIRPackage.CONSENT__MANAGER:
				return manager != null && !manager.isEmpty();
			case FHIRPackage.CONSENT__CONTROLLER:
				return controller != null && !controller.isEmpty();
			case FHIRPackage.CONSENT__SOURCE_ATTACHMENT:
				return sourceAttachment != null && !sourceAttachment.isEmpty();
			case FHIRPackage.CONSENT__SOURCE_REFERENCE:
				return sourceReference != null && !sourceReference.isEmpty();
			case FHIRPackage.CONSENT__REGULATORY_BASIS:
				return regulatoryBasis != null && !regulatoryBasis.isEmpty();
			case FHIRPackage.CONSENT__POLICY_BASIS:
				return policyBasis != null;
			case FHIRPackage.CONSENT__POLICY_TEXT:
				return policyText != null && !policyText.isEmpty();
			case FHIRPackage.CONSENT__VERIFICATION:
				return verification != null && !verification.isEmpty();
			case FHIRPackage.CONSENT__DECISION:
				return decision != null;
			case FHIRPackage.CONSENT__PROVISION:
				return provision != null && !provision.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentImpl
