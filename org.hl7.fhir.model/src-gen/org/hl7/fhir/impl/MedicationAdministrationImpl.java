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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationPerformer;
import org.hl7.fhir.MedicationAdministrationStatusCodes;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getOccurenceDateTime <em>Occurence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getOccurencePeriod <em>Occurence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getOccurenceTiming <em>Occurence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getIsSubPotent <em>Is Sub Potent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getSubPotentReason <em>Sub Potent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationAdministrationImpl extends DomainResourceImpl implements MedicationAdministration {
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
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministrationStatusCodes status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> statusReason;

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
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference medication;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getOccurenceDateTime() <em>Occurence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurencePeriod() <em>Occurence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurencePeriod;

	/**
	 * The cached value of the '{@link #getOccurenceTiming() <em>Occurence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurenceTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing occurenceTiming;

	/**
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected DateTime recorded;

	/**
	 * The cached value of the '{@link #getIsSubPotent() <em>Is Sub Potent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubPotent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isSubPotent;

	/**
	 * The cached value of the '{@link #getSubPotentReason() <em>Sub Potent Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPotentReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subPotentReason;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationAdministrationPerformer> performer;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> reason;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> device;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministrationDosage dosage;

	/**
	 * The cached value of the '{@link #getEventHistory() <em>Event History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> eventHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMedicationAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministrationStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationAdministrationStatusCodes newStatus, NotificationChain msgs) {
		MedicationAdministrationStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__STATUS, oldStatus, newStatus);
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
	public void setStatus(MedicationAdministrationStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getStatusReason() {
		if (statusReason == null) {
			statusReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__STATUS_REASON);
		}
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(CodeableReference newMedication, NotificationChain msgs) {
		CodeableReference oldMedication = medication;
		medication = newMedication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION, oldMedication, newMedication);
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
	public void setMedication(CodeableReference newMedication) {
		if (newMedication != medication) {
			NotificationChain msgs = null;
			if (medication != null)
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION, newMedication, newMedication));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, oldEncounter, newEncounter);
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
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getOccurenceDateTime() {
		return occurenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurenceDateTime(DateTime newOccurenceDateTime, NotificationChain msgs) {
		DateTime oldOccurenceDateTime = occurenceDateTime;
		occurenceDateTime = newOccurenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME, oldOccurenceDateTime, newOccurenceDateTime);
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
	public void setOccurenceDateTime(DateTime newOccurenceDateTime) {
		if (newOccurenceDateTime != occurenceDateTime) {
			NotificationChain msgs = null;
			if (occurenceDateTime != null)
				msgs = ((InternalEObject)occurenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME, null, msgs);
			if (newOccurenceDateTime != null)
				msgs = ((InternalEObject)newOccurenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurenceDateTime(newOccurenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME, newOccurenceDateTime, newOccurenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getOccurencePeriod() {
		return occurencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurencePeriod(Period newOccurencePeriod, NotificationChain msgs) {
		Period oldOccurencePeriod = occurencePeriod;
		occurencePeriod = newOccurencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD, oldOccurencePeriod, newOccurencePeriod);
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
	public void setOccurencePeriod(Period newOccurencePeriod) {
		if (newOccurencePeriod != occurencePeriod) {
			NotificationChain msgs = null;
			if (occurencePeriod != null)
				msgs = ((InternalEObject)occurencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD, null, msgs);
			if (newOccurencePeriod != null)
				msgs = ((InternalEObject)newOccurencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD, null, msgs);
			msgs = basicSetOccurencePeriod(newOccurencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD, newOccurencePeriod, newOccurencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getOccurenceTiming() {
		return occurenceTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurenceTiming(Timing newOccurenceTiming, NotificationChain msgs) {
		Timing oldOccurenceTiming = occurenceTiming;
		occurenceTiming = newOccurenceTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING, oldOccurenceTiming, newOccurenceTiming);
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
	public void setOccurenceTiming(Timing newOccurenceTiming) {
		if (newOccurenceTiming != occurenceTiming) {
			NotificationChain msgs = null;
			if (occurenceTiming != null)
				msgs = ((InternalEObject)occurenceTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING, null, msgs);
			if (newOccurenceTiming != null)
				msgs = ((InternalEObject)newOccurenceTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING, null, msgs);
			msgs = basicSetOccurenceTiming(newOccurenceTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING, newOccurenceTiming, newOccurenceTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorded(DateTime newRecorded, NotificationChain msgs) {
		DateTime oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED, oldRecorded, newRecorded);
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
	public void setRecorded(DateTime newRecorded) {
		if (newRecorded != recorded) {
			NotificationChain msgs = null;
			if (recorded != null)
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsSubPotent() {
		return isSubPotent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSubPotent(org.hl7.fhir.Boolean newIsSubPotent, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsSubPotent = isSubPotent;
		isSubPotent = newIsSubPotent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT, oldIsSubPotent, newIsSubPotent);
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
	public void setIsSubPotent(org.hl7.fhir.Boolean newIsSubPotent) {
		if (newIsSubPotent != isSubPotent) {
			NotificationChain msgs = null;
			if (isSubPotent != null)
				msgs = ((InternalEObject)isSubPotent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT, null, msgs);
			if (newIsSubPotent != null)
				msgs = ((InternalEObject)newIsSubPotent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT, null, msgs);
			msgs = basicSetIsSubPotent(newIsSubPotent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT, newIsSubPotent, newIsSubPotent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubPotentReason() {
		if (subPotentReason == null) {
			subPotentReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__SUB_POTENT_REASON);
		}
		return subPotentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationAdministrationPerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<MedicationAdministrationPerformer>(MedicationAdministrationPerformer.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST, oldRequest, newRequest);
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
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministrationDosage getDosage() {
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDosage(MedicationAdministrationDosage newDosage, NotificationChain msgs) {
		MedicationAdministrationDosage oldDosage = dosage;
		dosage = newDosage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE, oldDosage, newDosage);
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
	public void setDosage(MedicationAdministrationDosage newDosage) {
		if (newDosage != dosage) {
			NotificationChain msgs = null;
			if (dosage != null)
				msgs = ((InternalEObject)dosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			if (newDosage != null)
				msgs = ((InternalEObject)newDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			msgs = basicSetDosage(newDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE, newDosage, newDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEventHistory() {
		if (eventHistory == null) {
			eventHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY);
		}
		return eventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				return ((InternalEList<?>)getStatusReason()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				return basicSetMedication(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME:
				return basicSetOccurenceDateTime(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD:
				return basicSetOccurencePeriod(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING:
				return basicSetOccurenceTiming(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED:
				return basicSetRecorded(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT:
				return basicSetIsSubPotent(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUB_POTENT_REASON:
				return ((InternalEList<?>)getSubPotentReason()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST:
				return basicSetRequest(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return basicSetDosage(null, msgs);
			case FHIRPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
				return ((InternalEList<?>)getEventHistory()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.MEDICATION_ADMINISTRATION__BASED_ON:
				return getBasedOn();
			case FHIRPackage.MEDICATION_ADMINISTRATION__PART_OF:
				return getPartOf();
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS:
				return getStatus();
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				return getStatusReason();
			case FHIRPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				return getCategory();
			case FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				return getMedication();
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				return getSubject();
			case FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return getEncounter();
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME:
				return getOccurenceDateTime();
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD:
				return getOccurencePeriod();
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING:
				return getOccurenceTiming();
			case FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED:
				return getRecorded();
			case FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT:
				return getIsSubPotent();
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUB_POTENT_REASON:
				return getSubPotentReason();
			case FHIRPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return getPerformer();
			case FHIRPackage.MEDICATION_ADMINISTRATION__REASON:
				return getReason();
			case FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST:
				return getRequest();
			case FHIRPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return getDevice();
			case FHIRPackage.MEDICATION_ADMINISTRATION__NOTE:
				return getNote();
			case FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return getDosage();
			case FHIRPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
				return getEventHistory();
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
			case FHIRPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((MedicationAdministrationStatusCodes)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				getStatusReason().clear();
				getStatusReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				setMedication((CodeableReference)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME:
				setOccurenceDateTime((DateTime)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD:
				setOccurencePeriod((Period)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING:
				setOccurenceTiming((Timing)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED:
				setRecorded((DateTime)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT:
				setIsSubPotent((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUB_POTENT_REASON:
				getSubPotentReason().clear();
				getSubPotentReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends MedicationAdministrationPerformer>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)newValue);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
				getEventHistory().clear();
				getEventHistory().addAll((Collection<? extends Reference>)newValue);
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
			case FHIRPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__BASED_ON:
				getBasedOn().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__PART_OF:
				getPartOf().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((MedicationAdministrationStatusCodes)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				getStatusReason().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				getCategory().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				setMedication((CodeableReference)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME:
				setOccurenceDateTime((DateTime)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD:
				setOccurencePeriod((Period)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING:
				setOccurenceTiming((Timing)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED:
				setRecorded((DateTime)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT:
				setIsSubPotent((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUB_POTENT_REASON:
				getSubPotentReason().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				getPerformer().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__REASON:
				getReason().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST:
				setRequest((Reference)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevice().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__NOTE:
				getNote().clear();
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)null);
				return;
			case FHIRPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
				getEventHistory().clear();
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
			case FHIRPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS:
				return status != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				return statusReason != null && !statusReason.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				return category != null && !category.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__MEDICATION:
				return medication != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				return subject != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return encounter != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_DATE_TIME:
				return occurenceDateTime != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_PERIOD:
				return occurencePeriod != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__OCCURENCE_TIMING:
				return occurenceTiming != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__RECORDED:
				return recorded != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__IS_SUB_POTENT:
				return isSubPotent != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__SUB_POTENT_REASON:
				return subPotentReason != null && !subPotentReason.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__REASON:
				return reason != null && !reason.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__REQUEST:
				return request != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return device != null && !device.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__NOTE:
				return note != null && !note.isEmpty();
			case FHIRPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return dosage != null;
			case FHIRPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
				return eventHistory != null && !eventHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationAdministrationImpl
