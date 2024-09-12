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

import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.ClaimCareTeam;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimEvent;
import org.hl7.fhir.ClaimInsurance;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimSupportingInfo;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getDiagnosisRelatedGroup <em>Diagnosis Related Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPatientPaid <em>Patient Paid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getTotal <em>Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimImpl extends DomainResourceImpl implements Claim {
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
	 * The cached value of the '{@link #getTraceNumber() <em>Trace Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> traceNumber;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subType;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Use use;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getBillablePeriod() <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillablePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period billablePeriod;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Reference enterer;

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
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getFundsReserve() <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundsReserve()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fundsReserve;

	/**
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimRelated> related;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference prescription;

	/**
	 * The cached value of the '{@link #getOriginalPrescription() <em>Original Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference originalPrescription;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected ClaimPayee payee;

	/**
	 * The cached value of the '{@link #getReferral() <em>Referral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected Reference referral;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> encounter;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Reference facility;

	/**
	 * The cached value of the '{@link #getDiagnosisRelatedGroup() <em>Diagnosis Related Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisRelatedGroup()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diagnosisRelatedGroup;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimEvent> event;

	/**
	 * The cached value of the '{@link #getCareTeam() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimCareTeam> careTeam;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimSupportingInfo> supportingInfo;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimProcedure> procedure;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimInsurance> insurance;

	/**
	 * The cached value of the '{@link #getAccident() <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected ClaimAccident accident;

	/**
	 * The cached value of the '{@link #getPatientPaid() <em>Patient Paid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPaid()
	 * @generated
	 * @ordered
	 */
	protected Money patientPaid;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimItem> item;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected Money total;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getClaim();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.CLAIM__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getTraceNumber() {
		if (traceNumber == null) {
			traceNumber = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.CLAIM__TRACE_NUMBER);
		}
		return traceNumber;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubType(CodeableConcept newSubType, NotificationChain msgs) {
		CodeableConcept oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__SUB_TYPE, oldSubType, newSubType);
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
	public void setSubType(CodeableConcept newSubType) {
		if (newSubType != subType) {
			NotificationChain msgs = null;
			if (subType != null)
				msgs = ((InternalEObject)subType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__SUB_TYPE, null, msgs);
			if (newSubType != null)
				msgs = ((InternalEObject)newSubType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__SUB_TYPE, null, msgs);
			msgs = basicSetSubType(newSubType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__SUB_TYPE, newSubType, newSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Use getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Use newUse, NotificationChain msgs) {
		Use oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__USE, oldUse, newUse);
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
	public void setUse(Use newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getBillablePeriod() {
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillablePeriod(Period newBillablePeriod, NotificationChain msgs) {
		Period oldBillablePeriod = billablePeriod;
		billablePeriod = newBillablePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__BILLABLE_PERIOD, oldBillablePeriod, newBillablePeriod);
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
	public void setBillablePeriod(Period newBillablePeriod) {
		if (newBillablePeriod != billablePeriod) {
			NotificationChain msgs = null;
			if (billablePeriod != null)
				msgs = ((InternalEObject)billablePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__BILLABLE_PERIOD, null, msgs);
			if (newBillablePeriod != null)
				msgs = ((InternalEObject)newBillablePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__BILLABLE_PERIOD, null, msgs);
			msgs = basicSetBillablePeriod(newBillablePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__BILLABLE_PERIOD, newBillablePeriod, newBillablePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__CREATED, oldCreated, newCreated);
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
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterer(Reference newEnterer, NotificationChain msgs) {
		Reference oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__ENTERER, oldEnterer, newEnterer);
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
	public void setEnterer(Reference newEnterer) {
		if (newEnterer != enterer) {
			NotificationChain msgs = null;
			if (enterer != null)
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__ENTERER, newEnterer, newEnterer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__INSURER, oldInsurer, newInsurer);
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
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PROVIDER, oldProvider, newProvider);
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
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFundsReserve() {
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundsReserve(CodeableConcept newFundsReserve, NotificationChain msgs) {
		CodeableConcept oldFundsReserve = fundsReserve;
		fundsReserve = newFundsReserve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__FUNDS_RESERVE, oldFundsReserve, newFundsReserve);
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
	public void setFundsReserve(CodeableConcept newFundsReserve) {
		if (newFundsReserve != fundsReserve) {
			NotificationChain msgs = null;
			if (fundsReserve != null)
				msgs = ((InternalEObject)fundsReserve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__FUNDS_RESERVE, null, msgs);
			if (newFundsReserve != null)
				msgs = ((InternalEObject)newFundsReserve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__FUNDS_RESERVE, null, msgs);
			msgs = basicSetFundsReserve(newFundsReserve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__FUNDS_RESERVE, newFundsReserve, newFundsReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimRelated> getRelated() {
		if (related == null) {
			related = new EObjectContainmentEList<ClaimRelated>(ClaimRelated.class, this, FHIRPackage.CLAIM__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(Reference newPrescription, NotificationChain msgs) {
		Reference oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PRESCRIPTION, oldPrescription, newPrescription);
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
	public void setPrescription(Reference newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject)prescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PRESCRIPTION, null, msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject)newPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PRESCRIPTION, null, msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PRESCRIPTION, newPrescription, newPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOriginalPrescription() {
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPrescription(Reference newOriginalPrescription, NotificationChain msgs) {
		Reference oldOriginalPrescription = originalPrescription;
		originalPrescription = newOriginalPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, newOriginalPrescription);
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
	public void setOriginalPrescription(Reference newOriginalPrescription) {
		if (newOriginalPrescription != originalPrescription) {
			NotificationChain msgs = null;
			if (originalPrescription != null)
				msgs = ((InternalEObject)originalPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION, null, msgs);
			if (newOriginalPrescription != null)
				msgs = ((InternalEObject)newOriginalPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION, null, msgs);
			msgs = basicSetOriginalPrescription(newOriginalPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION, newOriginalPrescription, newOriginalPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ClaimPayee newPayee, NotificationChain msgs) {
		ClaimPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PAYEE, oldPayee, newPayee);
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
	public void setPayee(ClaimPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReferral() {
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferral(Reference newReferral, NotificationChain msgs) {
		Reference oldReferral = referral;
		referral = newReferral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__REFERRAL, oldReferral, newReferral);
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
	public void setReferral(Reference newReferral) {
		if (newReferral != referral) {
			NotificationChain msgs = null;
			if (referral != null)
				msgs = ((InternalEObject)referral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__REFERRAL, null, msgs);
			if (newReferral != null)
				msgs = ((InternalEObject)newReferral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__REFERRAL, null, msgs);
			msgs = basicSetReferral(newReferral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__REFERRAL, newReferral, newReferral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEncounter() {
		if (encounter == null) {
			encounter = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CLAIM__ENCOUNTER);
		}
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacility(Reference newFacility, NotificationChain msgs) {
		Reference oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__FACILITY, oldFacility, newFacility);
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
	public void setFacility(Reference newFacility) {
		if (newFacility != facility) {
			NotificationChain msgs = null;
			if (facility != null)
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDiagnosisRelatedGroup() {
		return diagnosisRelatedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosisRelatedGroup(CodeableConcept newDiagnosisRelatedGroup, NotificationChain msgs) {
		CodeableConcept oldDiagnosisRelatedGroup = diagnosisRelatedGroup;
		diagnosisRelatedGroup = newDiagnosisRelatedGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP, oldDiagnosisRelatedGroup, newDiagnosisRelatedGroup);
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
	public void setDiagnosisRelatedGroup(CodeableConcept newDiagnosisRelatedGroup) {
		if (newDiagnosisRelatedGroup != diagnosisRelatedGroup) {
			NotificationChain msgs = null;
			if (diagnosisRelatedGroup != null)
				msgs = ((InternalEObject)diagnosisRelatedGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP, null, msgs);
			if (newDiagnosisRelatedGroup != null)
				msgs = ((InternalEObject)newDiagnosisRelatedGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP, null, msgs);
			msgs = basicSetDiagnosisRelatedGroup(newDiagnosisRelatedGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP, newDiagnosisRelatedGroup, newDiagnosisRelatedGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<ClaimEvent>(ClaimEvent.class, this, FHIRPackage.CLAIM__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimCareTeam> getCareTeam() {
		if (careTeam == null) {
			careTeam = new EObjectContainmentEList<ClaimCareTeam>(ClaimCareTeam.class, this, FHIRPackage.CLAIM__CARE_TEAM);
		}
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimSupportingInfo> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<ClaimSupportingInfo>(ClaimSupportingInfo.class, this, FHIRPackage.CLAIM__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ClaimDiagnosis>(ClaimDiagnosis.class, this, FHIRPackage.CLAIM__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimProcedure> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<ClaimProcedure>(ClaimProcedure.class, this, FHIRPackage.CLAIM__PROCEDURE);
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimInsurance> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<ClaimInsurance>(ClaimInsurance.class, this, FHIRPackage.CLAIM__INSURANCE);
		}
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimAccident getAccident() {
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccident(ClaimAccident newAccident, NotificationChain msgs) {
		ClaimAccident oldAccident = accident;
		accident = newAccident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__ACCIDENT, oldAccident, newAccident);
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
	public void setAccident(ClaimAccident newAccident) {
		if (newAccident != accident) {
			NotificationChain msgs = null;
			if (accident != null)
				msgs = ((InternalEObject)accident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__ACCIDENT, null, msgs);
			if (newAccident != null)
				msgs = ((InternalEObject)newAccident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__ACCIDENT, null, msgs);
			msgs = basicSetAccident(newAccident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__ACCIDENT, newAccident, newAccident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getPatientPaid() {
		return patientPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientPaid(Money newPatientPaid, NotificationChain msgs) {
		Money oldPatientPaid = patientPaid;
		patientPaid = newPatientPaid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PATIENT_PAID, oldPatientPaid, newPatientPaid);
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
	public void setPatientPaid(Money newPatientPaid) {
		if (newPatientPaid != patientPaid) {
			NotificationChain msgs = null;
			if (patientPaid != null)
				msgs = ((InternalEObject)patientPaid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PATIENT_PAID, null, msgs);
			if (newPatientPaid != null)
				msgs = ((InternalEObject)newPatientPaid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__PATIENT_PAID, null, msgs);
			msgs = basicSetPatientPaid(newPatientPaid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__PATIENT_PAID, newPatientPaid, newPatientPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ClaimItem>(ClaimItem.class, this, FHIRPackage.CLAIM__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotal(Money newTotal, NotificationChain msgs) {
		Money oldTotal = total;
		total = newTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__TOTAL, oldTotal, newTotal);
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
	public void setTotal(Money newTotal) {
		if (newTotal != total) {
			NotificationChain msgs = null;
			if (total != null)
				msgs = ((InternalEObject)total).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__TOTAL, null, msgs);
			if (newTotal != null)
				msgs = ((InternalEObject)newTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM__TOTAL, null, msgs);
			msgs = basicSetTotal(newTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM__TOTAL, newTotal, newTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CLAIM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__TRACE_NUMBER:
				return ((InternalEList<?>)getTraceNumber()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.CLAIM__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.CLAIM__SUB_TYPE:
				return basicSetSubType(null, msgs);
			case FHIRPackage.CLAIM__USE:
				return basicSetUse(null, msgs);
			case FHIRPackage.CLAIM__PATIENT:
				return basicSetPatient(null, msgs);
			case FHIRPackage.CLAIM__BILLABLE_PERIOD:
				return basicSetBillablePeriod(null, msgs);
			case FHIRPackage.CLAIM__CREATED:
				return basicSetCreated(null, msgs);
			case FHIRPackage.CLAIM__ENTERER:
				return basicSetEnterer(null, msgs);
			case FHIRPackage.CLAIM__INSURER:
				return basicSetInsurer(null, msgs);
			case FHIRPackage.CLAIM__PROVIDER:
				return basicSetProvider(null, msgs);
			case FHIRPackage.CLAIM__PRIORITY:
				return basicSetPriority(null, msgs);
			case FHIRPackage.CLAIM__FUNDS_RESERVE:
				return basicSetFundsReserve(null, msgs);
			case FHIRPackage.CLAIM__RELATED:
				return ((InternalEList<?>)getRelated()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__PRESCRIPTION:
				return basicSetPrescription(null, msgs);
			case FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				return basicSetOriginalPrescription(null, msgs);
			case FHIRPackage.CLAIM__PAYEE:
				return basicSetPayee(null, msgs);
			case FHIRPackage.CLAIM__REFERRAL:
				return basicSetReferral(null, msgs);
			case FHIRPackage.CLAIM__ENCOUNTER:
				return ((InternalEList<?>)getEncounter()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__FACILITY:
				return basicSetFacility(null, msgs);
			case FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP:
				return basicSetDiagnosisRelatedGroup(null, msgs);
			case FHIRPackage.CLAIM__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__CARE_TEAM:
				return ((InternalEList<?>)getCareTeam()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__ACCIDENT:
				return basicSetAccident(null, msgs);
			case FHIRPackage.CLAIM__PATIENT_PAID:
				return basicSetPatientPaid(null, msgs);
			case FHIRPackage.CLAIM__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM__TOTAL:
				return basicSetTotal(null, msgs);
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
			case FHIRPackage.CLAIM__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.CLAIM__TRACE_NUMBER:
				return getTraceNumber();
			case FHIRPackage.CLAIM__STATUS:
				return getStatus();
			case FHIRPackage.CLAIM__TYPE:
				return getType();
			case FHIRPackage.CLAIM__SUB_TYPE:
				return getSubType();
			case FHIRPackage.CLAIM__USE:
				return getUse();
			case FHIRPackage.CLAIM__PATIENT:
				return getPatient();
			case FHIRPackage.CLAIM__BILLABLE_PERIOD:
				return getBillablePeriod();
			case FHIRPackage.CLAIM__CREATED:
				return getCreated();
			case FHIRPackage.CLAIM__ENTERER:
				return getEnterer();
			case FHIRPackage.CLAIM__INSURER:
				return getInsurer();
			case FHIRPackage.CLAIM__PROVIDER:
				return getProvider();
			case FHIRPackage.CLAIM__PRIORITY:
				return getPriority();
			case FHIRPackage.CLAIM__FUNDS_RESERVE:
				return getFundsReserve();
			case FHIRPackage.CLAIM__RELATED:
				return getRelated();
			case FHIRPackage.CLAIM__PRESCRIPTION:
				return getPrescription();
			case FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				return getOriginalPrescription();
			case FHIRPackage.CLAIM__PAYEE:
				return getPayee();
			case FHIRPackage.CLAIM__REFERRAL:
				return getReferral();
			case FHIRPackage.CLAIM__ENCOUNTER:
				return getEncounter();
			case FHIRPackage.CLAIM__FACILITY:
				return getFacility();
			case FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP:
				return getDiagnosisRelatedGroup();
			case FHIRPackage.CLAIM__EVENT:
				return getEvent();
			case FHIRPackage.CLAIM__CARE_TEAM:
				return getCareTeam();
			case FHIRPackage.CLAIM__SUPPORTING_INFO:
				return getSupportingInfo();
			case FHIRPackage.CLAIM__DIAGNOSIS:
				return getDiagnosis();
			case FHIRPackage.CLAIM__PROCEDURE:
				return getProcedure();
			case FHIRPackage.CLAIM__INSURANCE:
				return getInsurance();
			case FHIRPackage.CLAIM__ACCIDENT:
				return getAccident();
			case FHIRPackage.CLAIM__PATIENT_PAID:
				return getPatientPaid();
			case FHIRPackage.CLAIM__ITEM:
				return getItem();
			case FHIRPackage.CLAIM__TOTAL:
				return getTotal();
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
			case FHIRPackage.CLAIM__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.CLAIM__TRACE_NUMBER:
				getTraceNumber().clear();
				getTraceNumber().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.CLAIM__STATUS:
				setStatus((FinancialResourceStatusCodes)newValue);
				return;
			case FHIRPackage.CLAIM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM__SUB_TYPE:
				setSubType((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM__USE:
				setUse((Use)newValue);
				return;
			case FHIRPackage.CLAIM__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FHIRPackage.CLAIM__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case FHIRPackage.CLAIM__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FHIRPackage.CLAIM__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case FHIRPackage.CLAIM__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FHIRPackage.CLAIM__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FHIRPackage.CLAIM__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends ClaimRelated>)newValue);
				return;
			case FHIRPackage.CLAIM__PRESCRIPTION:
				setPrescription((Reference)newValue);
				return;
			case FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((Reference)newValue);
				return;
			case FHIRPackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)newValue);
				return;
			case FHIRPackage.CLAIM__REFERRAL:
				setReferral((Reference)newValue);
				return;
			case FHIRPackage.CLAIM__ENCOUNTER:
				getEncounter().clear();
				getEncounter().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CLAIM__FACILITY:
				setFacility((Reference)newValue);
				return;
			case FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP:
				setDiagnosisRelatedGroup((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends ClaimEvent>)newValue);
				return;
			case FHIRPackage.CLAIM__CARE_TEAM:
				getCareTeam().clear();
				getCareTeam().addAll((Collection<? extends ClaimCareTeam>)newValue);
				return;
			case FHIRPackage.CLAIM__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends ClaimSupportingInfo>)newValue);
				return;
			case FHIRPackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ClaimDiagnosis>)newValue);
				return;
			case FHIRPackage.CLAIM__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ClaimProcedure>)newValue);
				return;
			case FHIRPackage.CLAIM__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends ClaimInsurance>)newValue);
				return;
			case FHIRPackage.CLAIM__ACCIDENT:
				setAccident((ClaimAccident)newValue);
				return;
			case FHIRPackage.CLAIM__PATIENT_PAID:
				setPatientPaid((Money)newValue);
				return;
			case FHIRPackage.CLAIM__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ClaimItem>)newValue);
				return;
			case FHIRPackage.CLAIM__TOTAL:
				setTotal((Money)newValue);
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
			case FHIRPackage.CLAIM__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.CLAIM__TRACE_NUMBER:
				getTraceNumber().clear();
				return;
			case FHIRPackage.CLAIM__STATUS:
				setStatus((FinancialResourceStatusCodes)null);
				return;
			case FHIRPackage.CLAIM__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM__SUB_TYPE:
				setSubType((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM__USE:
				setUse((Use)null);
				return;
			case FHIRPackage.CLAIM__PATIENT:
				setPatient((Reference)null);
				return;
			case FHIRPackage.CLAIM__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case FHIRPackage.CLAIM__CREATED:
				setCreated((DateTime)null);
				return;
			case FHIRPackage.CLAIM__ENTERER:
				setEnterer((Reference)null);
				return;
			case FHIRPackage.CLAIM__INSURER:
				setInsurer((Reference)null);
				return;
			case FHIRPackage.CLAIM__PROVIDER:
				setProvider((Reference)null);
				return;
			case FHIRPackage.CLAIM__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM__RELATED:
				getRelated().clear();
				return;
			case FHIRPackage.CLAIM__PRESCRIPTION:
				setPrescription((Reference)null);
				return;
			case FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((Reference)null);
				return;
			case FHIRPackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)null);
				return;
			case FHIRPackage.CLAIM__REFERRAL:
				setReferral((Reference)null);
				return;
			case FHIRPackage.CLAIM__ENCOUNTER:
				getEncounter().clear();
				return;
			case FHIRPackage.CLAIM__FACILITY:
				setFacility((Reference)null);
				return;
			case FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP:
				setDiagnosisRelatedGroup((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM__EVENT:
				getEvent().clear();
				return;
			case FHIRPackage.CLAIM__CARE_TEAM:
				getCareTeam().clear();
				return;
			case FHIRPackage.CLAIM__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FHIRPackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FHIRPackage.CLAIM__PROCEDURE:
				getProcedure().clear();
				return;
			case FHIRPackage.CLAIM__INSURANCE:
				getInsurance().clear();
				return;
			case FHIRPackage.CLAIM__ACCIDENT:
				setAccident((ClaimAccident)null);
				return;
			case FHIRPackage.CLAIM__PATIENT_PAID:
				setPatientPaid((Money)null);
				return;
			case FHIRPackage.CLAIM__ITEM:
				getItem().clear();
				return;
			case FHIRPackage.CLAIM__TOTAL:
				setTotal((Money)null);
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
			case FHIRPackage.CLAIM__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.CLAIM__TRACE_NUMBER:
				return traceNumber != null && !traceNumber.isEmpty();
			case FHIRPackage.CLAIM__STATUS:
				return status != null;
			case FHIRPackage.CLAIM__TYPE:
				return type != null;
			case FHIRPackage.CLAIM__SUB_TYPE:
				return subType != null;
			case FHIRPackage.CLAIM__USE:
				return use != null;
			case FHIRPackage.CLAIM__PATIENT:
				return patient != null;
			case FHIRPackage.CLAIM__BILLABLE_PERIOD:
				return billablePeriod != null;
			case FHIRPackage.CLAIM__CREATED:
				return created != null;
			case FHIRPackage.CLAIM__ENTERER:
				return enterer != null;
			case FHIRPackage.CLAIM__INSURER:
				return insurer != null;
			case FHIRPackage.CLAIM__PROVIDER:
				return provider != null;
			case FHIRPackage.CLAIM__PRIORITY:
				return priority != null;
			case FHIRPackage.CLAIM__FUNDS_RESERVE:
				return fundsReserve != null;
			case FHIRPackage.CLAIM__RELATED:
				return related != null && !related.isEmpty();
			case FHIRPackage.CLAIM__PRESCRIPTION:
				return prescription != null;
			case FHIRPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				return originalPrescription != null;
			case FHIRPackage.CLAIM__PAYEE:
				return payee != null;
			case FHIRPackage.CLAIM__REFERRAL:
				return referral != null;
			case FHIRPackage.CLAIM__ENCOUNTER:
				return encounter != null && !encounter.isEmpty();
			case FHIRPackage.CLAIM__FACILITY:
				return facility != null;
			case FHIRPackage.CLAIM__DIAGNOSIS_RELATED_GROUP:
				return diagnosisRelatedGroup != null;
			case FHIRPackage.CLAIM__EVENT:
				return event != null && !event.isEmpty();
			case FHIRPackage.CLAIM__CARE_TEAM:
				return careTeam != null && !careTeam.isEmpty();
			case FHIRPackage.CLAIM__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FHIRPackage.CLAIM__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FHIRPackage.CLAIM__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case FHIRPackage.CLAIM__INSURANCE:
				return insurance != null && !insurance.isEmpty();
			case FHIRPackage.CLAIM__ACCIDENT:
				return accident != null;
			case FHIRPackage.CLAIM__PATIENT_PAID:
				return patientPaid != null;
			case FHIRPackage.CLAIM__ITEM:
				return item != null && !item.isEmpty();
			case FHIRPackage.CLAIM__TOTAL:
				return total != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
