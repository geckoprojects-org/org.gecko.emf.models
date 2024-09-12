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
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageClass;
import org.hl7.fhir.CoverageCostToBeneficiary;
import org.hl7.fhir.CoveragePaymentBy;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Kind;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPaymentBy <em>Payment By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPolicyHolder <em>Policy Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getBeneficiary <em>Beneficiary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getCostToBeneficiary <em>Cost To Beneficiary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubrogation <em>Subrogation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getInsurancePlan <em>Insurance Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageImpl extends DomainResourceImpl implements Coverage {
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
	protected FinancialResourceStatusCodes status;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

	/**
	 * The cached value of the '{@link #getPaymentBy() <em>Payment By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentBy()
	 * @generated
	 * @ordered
	 */
	protected EList<CoveragePaymentBy> paymentBy;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getPolicyHolder() <em>Policy Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyHolder()
	 * @generated
	 * @ordered
	 */
	protected Reference policyHolder;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Reference subscriber;

	/**
	 * The cached value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> subscriberId;

	/**
	 * The cached value of the '{@link #getBeneficiary() <em>Beneficiary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected Reference beneficiary;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String dependent;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

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
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageClass> class_;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt order;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String network;

	/**
	 * The cached value of the '{@link #getCostToBeneficiary() <em>Cost To Beneficiary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostToBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageCostToBeneficiary> costToBeneficiary;

	/**
	 * The cached value of the '{@link #getSubrogation() <em>Subrogation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrogation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean subrogation;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contract;

	/**
	 * The cached value of the '{@link #getInsurancePlan() <em>Insurance Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancePlan()
	 * @generated
	 * @ordered
	 */
	protected Reference insurancePlan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.COVERAGE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialResourceStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(FinancialResourceStatusCodes newStatus, NotificationChain msgs) {
		FinancialResourceStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__STATUS, oldStatus, newStatus);
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
	public void setStatus(FinancialResourceStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(Kind newKind, NotificationChain msgs) {
		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__KIND, oldKind, newKind);
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
	public void setKind(Kind newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoveragePaymentBy> getPaymentBy() {
		if (paymentBy == null) {
			paymentBy = new EObjectContainmentEList<CoveragePaymentBy>(CoveragePaymentBy.class, this, FHIRPackage.COVERAGE__PAYMENT_BY);
		}
		return paymentBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPolicyHolder() {
		return policyHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyHolder(Reference newPolicyHolder, NotificationChain msgs) {
		Reference oldPolicyHolder = policyHolder;
		policyHolder = newPolicyHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__POLICY_HOLDER, oldPolicyHolder, newPolicyHolder);
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
	public void setPolicyHolder(Reference newPolicyHolder) {
		if (newPolicyHolder != policyHolder) {
			NotificationChain msgs = null;
			if (policyHolder != null)
				msgs = ((InternalEObject)policyHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__POLICY_HOLDER, null, msgs);
			if (newPolicyHolder != null)
				msgs = ((InternalEObject)newPolicyHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__POLICY_HOLDER, null, msgs);
			msgs = basicSetPolicyHolder(newPolicyHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__POLICY_HOLDER, newPolicyHolder, newPolicyHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriber(Reference newSubscriber, NotificationChain msgs) {
		Reference oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__SUBSCRIBER, oldSubscriber, newSubscriber);
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
	public void setSubscriber(Reference newSubscriber) {
		if (newSubscriber != subscriber) {
			NotificationChain msgs = null;
			if (subscriber != null)
				msgs = ((InternalEObject)subscriber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__SUBSCRIBER, null, msgs);
			if (newSubscriber != null)
				msgs = ((InternalEObject)newSubscriber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__SUBSCRIBER, null, msgs);
			msgs = basicSetSubscriber(newSubscriber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__SUBSCRIBER, newSubscriber, newSubscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getSubscriberId() {
		if (subscriberId == null) {
			subscriberId = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.COVERAGE__SUBSCRIBER_ID);
		}
		return subscriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getBeneficiary() {
		return beneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeneficiary(Reference newBeneficiary, NotificationChain msgs) {
		Reference oldBeneficiary = beneficiary;
		beneficiary = newBeneficiary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__BENEFICIARY, oldBeneficiary, newBeneficiary);
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
	public void setBeneficiary(Reference newBeneficiary) {
		if (newBeneficiary != beneficiary) {
			NotificationChain msgs = null;
			if (beneficiary != null)
				msgs = ((InternalEObject)beneficiary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__BENEFICIARY, null, msgs);
			if (newBeneficiary != null)
				msgs = ((InternalEObject)newBeneficiary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__BENEFICIARY, null, msgs);
			msgs = basicSetBeneficiary(newBeneficiary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__BENEFICIARY, newBeneficiary, newBeneficiary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependent(org.hl7.fhir.String newDependent, NotificationChain msgs) {
		org.hl7.fhir.String oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__DEPENDENT, oldDependent, newDependent);
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
	public void setDependent(org.hl7.fhir.String newDependent) {
		if (newDependent != dependent) {
			NotificationChain msgs = null;
			if (dependent != null)
				msgs = ((InternalEObject)dependent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__DEPENDENT, null, msgs);
			if (newDependent != null)
				msgs = ((InternalEObject)newDependent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__DEPENDENT, null, msgs);
			msgs = basicSetDependent(newDependent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__DEPENDENT, newDependent, newDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(CodeableConcept newRelationship, NotificationChain msgs) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(CodeableConcept newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__RELATIONSHIP, newRelationship, newRelationship));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInsurer() {
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurer(Reference newInsurer, NotificationChain msgs) {
		Reference oldInsurer = insurer;
		insurer = newInsurer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__INSURER, oldInsurer, newInsurer);
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
	public void setInsurer(Reference newInsurer) {
		if (newInsurer != insurer) {
			NotificationChain msgs = null;
			if (insurer != null)
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageClass> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<CoverageClass>(CoverageClass.class, this, FHIRPackage.COVERAGE__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(PositiveInt newOrder, NotificationChain msgs) {
		PositiveInt oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__ORDER, oldOrder, newOrder);
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
	public void setOrder(PositiveInt newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(org.hl7.fhir.String newNetwork, NotificationChain msgs) {
		org.hl7.fhir.String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__NETWORK, oldNetwork, newNetwork);
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
	public void setNetwork(org.hl7.fhir.String newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageCostToBeneficiary> getCostToBeneficiary() {
		if (costToBeneficiary == null) {
			costToBeneficiary = new EObjectContainmentEList<CoverageCostToBeneficiary>(CoverageCostToBeneficiary.class, this, FHIRPackage.COVERAGE__COST_TO_BENEFICIARY);
		}
		return costToBeneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getSubrogation() {
		return subrogation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubrogation(org.hl7.fhir.Boolean newSubrogation, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldSubrogation = subrogation;
		subrogation = newSubrogation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__SUBROGATION, oldSubrogation, newSubrogation);
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
	public void setSubrogation(org.hl7.fhir.Boolean newSubrogation) {
		if (newSubrogation != subrogation) {
			NotificationChain msgs = null;
			if (subrogation != null)
				msgs = ((InternalEObject)subrogation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__SUBROGATION, null, msgs);
			if (newSubrogation != null)
				msgs = ((InternalEObject)newSubrogation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__SUBROGATION, null, msgs);
			msgs = basicSetSubrogation(newSubrogation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__SUBROGATION, newSubrogation, newSubrogation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getContract() {
		if (contract == null) {
			contract = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.COVERAGE__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInsurancePlan() {
		return insurancePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurancePlan(Reference newInsurancePlan, NotificationChain msgs) {
		Reference oldInsurancePlan = insurancePlan;
		insurancePlan = newInsurancePlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__INSURANCE_PLAN, oldInsurancePlan, newInsurancePlan);
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
	public void setInsurancePlan(Reference newInsurancePlan) {
		if (newInsurancePlan != insurancePlan) {
			NotificationChain msgs = null;
			if (insurancePlan != null)
				msgs = ((InternalEObject)insurancePlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__INSURANCE_PLAN, null, msgs);
			if (newInsurancePlan != null)
				msgs = ((InternalEObject)newInsurancePlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE__INSURANCE_PLAN, null, msgs);
			msgs = basicSetInsurancePlan(newInsurancePlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE__INSURANCE_PLAN, newInsurancePlan, newInsurancePlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.COVERAGE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COVERAGE__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.COVERAGE__KIND:
				return basicSetKind(null, msgs);
			case FHIRPackage.COVERAGE__PAYMENT_BY:
				return ((InternalEList<?>)getPaymentBy()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COVERAGE__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.COVERAGE__POLICY_HOLDER:
				return basicSetPolicyHolder(null, msgs);
			case FHIRPackage.COVERAGE__SUBSCRIBER:
				return basicSetSubscriber(null, msgs);
			case FHIRPackage.COVERAGE__SUBSCRIBER_ID:
				return ((InternalEList<?>)getSubscriberId()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COVERAGE__BENEFICIARY:
				return basicSetBeneficiary(null, msgs);
			case FHIRPackage.COVERAGE__DEPENDENT:
				return basicSetDependent(null, msgs);
			case FHIRPackage.COVERAGE__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FHIRPackage.COVERAGE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FHIRPackage.COVERAGE__INSURER:
				return basicSetInsurer(null, msgs);
			case FHIRPackage.COVERAGE__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COVERAGE__ORDER:
				return basicSetOrder(null, msgs);
			case FHIRPackage.COVERAGE__NETWORK:
				return basicSetNetwork(null, msgs);
			case FHIRPackage.COVERAGE__COST_TO_BENEFICIARY:
				return ((InternalEList<?>)getCostToBeneficiary()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COVERAGE__SUBROGATION:
				return basicSetSubrogation(null, msgs);
			case FHIRPackage.COVERAGE__CONTRACT:
				return ((InternalEList<?>)getContract()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COVERAGE__INSURANCE_PLAN:
				return basicSetInsurancePlan(null, msgs);
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
			case FHIRPackage.COVERAGE__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.COVERAGE__STATUS:
				return getStatus();
			case FHIRPackage.COVERAGE__KIND:
				return getKind();
			case FHIRPackage.COVERAGE__PAYMENT_BY:
				return getPaymentBy();
			case FHIRPackage.COVERAGE__TYPE:
				return getType();
			case FHIRPackage.COVERAGE__POLICY_HOLDER:
				return getPolicyHolder();
			case FHIRPackage.COVERAGE__SUBSCRIBER:
				return getSubscriber();
			case FHIRPackage.COVERAGE__SUBSCRIBER_ID:
				return getSubscriberId();
			case FHIRPackage.COVERAGE__BENEFICIARY:
				return getBeneficiary();
			case FHIRPackage.COVERAGE__DEPENDENT:
				return getDependent();
			case FHIRPackage.COVERAGE__RELATIONSHIP:
				return getRelationship();
			case FHIRPackage.COVERAGE__PERIOD:
				return getPeriod();
			case FHIRPackage.COVERAGE__INSURER:
				return getInsurer();
			case FHIRPackage.COVERAGE__CLASS:
				return getClass_();
			case FHIRPackage.COVERAGE__ORDER:
				return getOrder();
			case FHIRPackage.COVERAGE__NETWORK:
				return getNetwork();
			case FHIRPackage.COVERAGE__COST_TO_BENEFICIARY:
				return getCostToBeneficiary();
			case FHIRPackage.COVERAGE__SUBROGATION:
				return getSubrogation();
			case FHIRPackage.COVERAGE__CONTRACT:
				return getContract();
			case FHIRPackage.COVERAGE__INSURANCE_PLAN:
				return getInsurancePlan();
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
			case FHIRPackage.COVERAGE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.COVERAGE__STATUS:
				setStatus((FinancialResourceStatusCodes)newValue);
				return;
			case FHIRPackage.COVERAGE__KIND:
				setKind((Kind)newValue);
				return;
			case FHIRPackage.COVERAGE__PAYMENT_BY:
				getPaymentBy().clear();
				getPaymentBy().addAll((Collection<? extends CoveragePaymentBy>)newValue);
				return;
			case FHIRPackage.COVERAGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.COVERAGE__POLICY_HOLDER:
				setPolicyHolder((Reference)newValue);
				return;
			case FHIRPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Reference)newValue);
				return;
			case FHIRPackage.COVERAGE__SUBSCRIBER_ID:
				getSubscriberId().clear();
				getSubscriberId().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.COVERAGE__BENEFICIARY:
				setBeneficiary((Reference)newValue);
				return;
			case FHIRPackage.COVERAGE__DEPENDENT:
				setDependent((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.COVERAGE__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case FHIRPackage.COVERAGE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FHIRPackage.COVERAGE__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FHIRPackage.COVERAGE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends CoverageClass>)newValue);
				return;
			case FHIRPackage.COVERAGE__ORDER:
				setOrder((PositiveInt)newValue);
				return;
			case FHIRPackage.COVERAGE__NETWORK:
				setNetwork((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.COVERAGE__COST_TO_BENEFICIARY:
				getCostToBeneficiary().clear();
				getCostToBeneficiary().addAll((Collection<? extends CoverageCostToBeneficiary>)newValue);
				return;
			case FHIRPackage.COVERAGE__SUBROGATION:
				setSubrogation((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.COVERAGE__CONTRACT:
				getContract().clear();
				getContract().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.COVERAGE__INSURANCE_PLAN:
				setInsurancePlan((Reference)newValue);
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
			case FHIRPackage.COVERAGE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.COVERAGE__STATUS:
				setStatus((FinancialResourceStatusCodes)null);
				return;
			case FHIRPackage.COVERAGE__KIND:
				setKind((Kind)null);
				return;
			case FHIRPackage.COVERAGE__PAYMENT_BY:
				getPaymentBy().clear();
				return;
			case FHIRPackage.COVERAGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.COVERAGE__POLICY_HOLDER:
				setPolicyHolder((Reference)null);
				return;
			case FHIRPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Reference)null);
				return;
			case FHIRPackage.COVERAGE__SUBSCRIBER_ID:
				getSubscriberId().clear();
				return;
			case FHIRPackage.COVERAGE__BENEFICIARY:
				setBeneficiary((Reference)null);
				return;
			case FHIRPackage.COVERAGE__DEPENDENT:
				setDependent((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.COVERAGE__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case FHIRPackage.COVERAGE__PERIOD:
				setPeriod((Period)null);
				return;
			case FHIRPackage.COVERAGE__INSURER:
				setInsurer((Reference)null);
				return;
			case FHIRPackage.COVERAGE__CLASS:
				getClass_().clear();
				return;
			case FHIRPackage.COVERAGE__ORDER:
				setOrder((PositiveInt)null);
				return;
			case FHIRPackage.COVERAGE__NETWORK:
				setNetwork((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.COVERAGE__COST_TO_BENEFICIARY:
				getCostToBeneficiary().clear();
				return;
			case FHIRPackage.COVERAGE__SUBROGATION:
				setSubrogation((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.COVERAGE__CONTRACT:
				getContract().clear();
				return;
			case FHIRPackage.COVERAGE__INSURANCE_PLAN:
				setInsurancePlan((Reference)null);
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
			case FHIRPackage.COVERAGE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.COVERAGE__STATUS:
				return status != null;
			case FHIRPackage.COVERAGE__KIND:
				return kind != null;
			case FHIRPackage.COVERAGE__PAYMENT_BY:
				return paymentBy != null && !paymentBy.isEmpty();
			case FHIRPackage.COVERAGE__TYPE:
				return type != null;
			case FHIRPackage.COVERAGE__POLICY_HOLDER:
				return policyHolder != null;
			case FHIRPackage.COVERAGE__SUBSCRIBER:
				return subscriber != null;
			case FHIRPackage.COVERAGE__SUBSCRIBER_ID:
				return subscriberId != null && !subscriberId.isEmpty();
			case FHIRPackage.COVERAGE__BENEFICIARY:
				return beneficiary != null;
			case FHIRPackage.COVERAGE__DEPENDENT:
				return dependent != null;
			case FHIRPackage.COVERAGE__RELATIONSHIP:
				return relationship != null;
			case FHIRPackage.COVERAGE__PERIOD:
				return period != null;
			case FHIRPackage.COVERAGE__INSURER:
				return insurer != null;
			case FHIRPackage.COVERAGE__CLASS:
				return class_ != null && !class_.isEmpty();
			case FHIRPackage.COVERAGE__ORDER:
				return order != null;
			case FHIRPackage.COVERAGE__NETWORK:
				return network != null;
			case FHIRPackage.COVERAGE__COST_TO_BENEFICIARY:
				return costToBeneficiary != null && !costToBeneficiary.isEmpty();
			case FHIRPackage.COVERAGE__SUBROGATION:
				return subrogation != null;
			case FHIRPackage.COVERAGE__CONTRACT:
				return contract != null && !contract.isEmpty();
			case FHIRPackage.COVERAGE__INSURANCE_PLAN:
				return insurancePlan != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageImpl
