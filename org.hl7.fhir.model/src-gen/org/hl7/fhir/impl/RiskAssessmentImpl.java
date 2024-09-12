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
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getPrediction <em>Prediction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getMitigation <em>Mitigation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskAssessmentImpl extends DomainResourceImpl implements RiskAssessment {
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
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected Reference basedOn;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Reference parent;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ObservationStatus status;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

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
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrencePeriod() <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurrencePeriod;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Reference condition;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

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
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basis;

	/**
	 * The cached value of the '{@link #getPrediction() <em>Prediction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrediction()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskAssessmentPrediction> prediction;

	/**
	 * The cached value of the '{@link #getMitigation() <em>Mitigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String mitigation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getRiskAssessment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.RISK_ASSESSMENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getBasedOn() {
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasedOn(Reference newBasedOn, NotificationChain msgs) {
		Reference oldBasedOn = basedOn;
		basedOn = newBasedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__BASED_ON, oldBasedOn, newBasedOn);
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
	public void setBasedOn(Reference newBasedOn) {
		if (newBasedOn != basedOn) {
			NotificationChain msgs = null;
			if (basedOn != null)
				msgs = ((InternalEObject)basedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__BASED_ON, null, msgs);
			if (newBasedOn != null)
				msgs = ((InternalEObject)newBasedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__BASED_ON, null, msgs);
			msgs = basicSetBasedOn(newBasedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__BASED_ON, newBasedOn, newBasedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Reference newParent, NotificationChain msgs) {
		Reference oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__PARENT, oldParent, newParent);
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
	public void setParent(Reference newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ObservationStatus newStatus, NotificationChain msgs) {
		ObservationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__STATUS, oldStatus, newStatus);
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
	public void setStatus(ObservationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__METHOD, oldMethod, newMethod);
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
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__METHOD, newMethod, newMethod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
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
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getOccurrencePeriod() {
		return occurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencePeriod(Period newOccurrencePeriod, NotificationChain msgs) {
		Period oldOccurrencePeriod = occurrencePeriod;
		occurrencePeriod = newOccurrencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
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
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Reference newCondition, NotificationChain msgs) {
		Reference oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Reference newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__PERFORMER, oldPerformer, newPerformer);
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
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.RISK_ASSESSMENT__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasis() {
		if (basis == null) {
			basis = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.RISK_ASSESSMENT__BASIS);
		}
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RiskAssessmentPrediction> getPrediction() {
		if (prediction == null) {
			prediction = new EObjectContainmentEList<RiskAssessmentPrediction>(RiskAssessmentPrediction.class, this, FHIRPackage.RISK_ASSESSMENT__PREDICTION);
		}
		return prediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMitigation() {
		return mitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMitigation(org.hl7.fhir.String newMitigation, NotificationChain msgs) {
		org.hl7.fhir.String oldMitigation = mitigation;
		mitigation = newMitigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__MITIGATION, oldMitigation, newMitigation);
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
	public void setMitigation(org.hl7.fhir.String newMitigation) {
		if (newMitigation != mitigation) {
			NotificationChain msgs = null;
			if (mitigation != null)
				msgs = ((InternalEObject)mitigation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__MITIGATION, null, msgs);
			if (newMitigation != null)
				msgs = ((InternalEObject)newMitigation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT__MITIGATION, null, msgs);
			msgs = basicSetMitigation(newMitigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT__MITIGATION, newMitigation, newMitigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.RISK_ASSESSMENT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.RISK_ASSESSMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RISK_ASSESSMENT__BASED_ON:
				return basicSetBasedOn(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__PARENT:
				return basicSetParent(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__METHOD:
				return basicSetMethod(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RISK_ASSESSMENT__BASIS:
				return ((InternalEList<?>)getBasis()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RISK_ASSESSMENT__PREDICTION:
				return ((InternalEList<?>)getPrediction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RISK_ASSESSMENT__MITIGATION:
				return basicSetMitigation(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.RISK_ASSESSMENT__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.RISK_ASSESSMENT__BASED_ON:
				return getBasedOn();
			case FHIRPackage.RISK_ASSESSMENT__PARENT:
				return getParent();
			case FHIRPackage.RISK_ASSESSMENT__STATUS:
				return getStatus();
			case FHIRPackage.RISK_ASSESSMENT__METHOD:
				return getMethod();
			case FHIRPackage.RISK_ASSESSMENT__CODE:
				return getCode();
			case FHIRPackage.RISK_ASSESSMENT__SUBJECT:
				return getSubject();
			case FHIRPackage.RISK_ASSESSMENT__ENCOUNTER:
				return getEncounter();
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FHIRPackage.RISK_ASSESSMENT__CONDITION:
				return getCondition();
			case FHIRPackage.RISK_ASSESSMENT__PERFORMER:
				return getPerformer();
			case FHIRPackage.RISK_ASSESSMENT__REASON:
				return getReason();
			case FHIRPackage.RISK_ASSESSMENT__BASIS:
				return getBasis();
			case FHIRPackage.RISK_ASSESSMENT__PREDICTION:
				return getPrediction();
			case FHIRPackage.RISK_ASSESSMENT__MITIGATION:
				return getMitigation();
			case FHIRPackage.RISK_ASSESSMENT__NOTE:
				return getNote();
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
			case FHIRPackage.RISK_ASSESSMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__BASED_ON:
				setBasedOn((Reference)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__PARENT:
				setParent((Reference)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__STATUS:
				setStatus((ObservationStatus)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__CONDITION:
				setCondition((Reference)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__BASIS:
				getBasis().clear();
				getBasis().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__PREDICTION:
				getPrediction().clear();
				getPrediction().addAll((Collection<? extends RiskAssessmentPrediction>)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__MITIGATION:
				setMitigation((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FHIRPackage.RISK_ASSESSMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.RISK_ASSESSMENT__BASED_ON:
				setBasedOn((Reference)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__PARENT:
				setParent((Reference)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__STATUS:
				setStatus((ObservationStatus)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__CONDITION:
				setCondition((Reference)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__REASON:
				getReason().clear();
				return;
			case FHIRPackage.RISK_ASSESSMENT__BASIS:
				getBasis().clear();
				return;
			case FHIRPackage.RISK_ASSESSMENT__PREDICTION:
				getPrediction().clear();
				return;
			case FHIRPackage.RISK_ASSESSMENT__MITIGATION:
				setMitigation((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT__NOTE:
				getNote().clear();
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
			case FHIRPackage.RISK_ASSESSMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.RISK_ASSESSMENT__BASED_ON:
				return basedOn != null;
			case FHIRPackage.RISK_ASSESSMENT__PARENT:
				return parent != null;
			case FHIRPackage.RISK_ASSESSMENT__STATUS:
				return status != null;
			case FHIRPackage.RISK_ASSESSMENT__METHOD:
				return method != null;
			case FHIRPackage.RISK_ASSESSMENT__CODE:
				return code != null;
			case FHIRPackage.RISK_ASSESSMENT__SUBJECT:
				return subject != null;
			case FHIRPackage.RISK_ASSESSMENT__ENCOUNTER:
				return encounter != null;
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FHIRPackage.RISK_ASSESSMENT__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FHIRPackage.RISK_ASSESSMENT__CONDITION:
				return condition != null;
			case FHIRPackage.RISK_ASSESSMENT__PERFORMER:
				return performer != null;
			case FHIRPackage.RISK_ASSESSMENT__REASON:
				return reason != null && !reason.isEmpty();
			case FHIRPackage.RISK_ASSESSMENT__BASIS:
				return basis != null && !basis.isEmpty();
			case FHIRPackage.RISK_ASSESSMENT__PREDICTION:
				return prediction != null && !prediction.isEmpty();
			case FHIRPackage.RISK_ASSESSMENT__MITIGATION:
				return mitigation != null;
			case FHIRPackage.RISK_ASSESSMENT__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskAssessmentImpl
