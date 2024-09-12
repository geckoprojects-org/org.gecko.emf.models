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
import org.hl7.fhir.Date;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalLifecycleStatus;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getAchievementStatus <em>Achievement Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getContinuous <em>Continuous</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStartCodeableConcept <em>Start Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getOutcome <em>Outcome</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends DomainResourceImpl implements Goal {
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
	 * The cached value of the '{@link #getLifecycleStatus() <em>Lifecycle Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleStatus()
	 * @generated
	 * @ordered
	 */
	protected GoalLifecycleStatus lifecycleStatus;

	/**
	 * The cached value of the '{@link #getAchievementStatus() <em>Achievement Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAchievementStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept achievementStatus;

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
	 * The cached value of the '{@link #getContinuous() <em>Continuous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuous()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean continuous;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept description;

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
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate;

	/**
	 * The cached value of the '{@link #getStartCodeableConcept() <em>Start Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept startCodeableConcept;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalTarget> target;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String statusReason;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> addresses;

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
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> outcome;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getGoal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.GOAL__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalLifecycleStatus getLifecycleStatus() {
		return lifecycleStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycleStatus(GoalLifecycleStatus newLifecycleStatus, NotificationChain msgs) {
		GoalLifecycleStatus oldLifecycleStatus = lifecycleStatus;
		lifecycleStatus = newLifecycleStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__LIFECYCLE_STATUS, oldLifecycleStatus, newLifecycleStatus);
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
	public void setLifecycleStatus(GoalLifecycleStatus newLifecycleStatus) {
		if (newLifecycleStatus != lifecycleStatus) {
			NotificationChain msgs = null;
			if (lifecycleStatus != null)
				msgs = ((InternalEObject)lifecycleStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__LIFECYCLE_STATUS, null, msgs);
			if (newLifecycleStatus != null)
				msgs = ((InternalEObject)newLifecycleStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__LIFECYCLE_STATUS, null, msgs);
			msgs = basicSetLifecycleStatus(newLifecycleStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__LIFECYCLE_STATUS, newLifecycleStatus, newLifecycleStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAchievementStatus() {
		return achievementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAchievementStatus(CodeableConcept newAchievementStatus, NotificationChain msgs) {
		CodeableConcept oldAchievementStatus = achievementStatus;
		achievementStatus = newAchievementStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__ACHIEVEMENT_STATUS, oldAchievementStatus, newAchievementStatus);
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
	public void setAchievementStatus(CodeableConcept newAchievementStatus) {
		if (newAchievementStatus != achievementStatus) {
			NotificationChain msgs = null;
			if (achievementStatus != null)
				msgs = ((InternalEObject)achievementStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__ACHIEVEMENT_STATUS, null, msgs);
			if (newAchievementStatus != null)
				msgs = ((InternalEObject)newAchievementStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__ACHIEVEMENT_STATUS, null, msgs);
			msgs = basicSetAchievementStatus(newAchievementStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__ACHIEVEMENT_STATUS, newAchievementStatus, newAchievementStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.GOAL__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getContinuous() {
		return continuous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuous(org.hl7.fhir.Boolean newContinuous, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldContinuous = continuous;
		continuous = newContinuous;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__CONTINUOUS, oldContinuous, newContinuous);
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
	public void setContinuous(org.hl7.fhir.Boolean newContinuous) {
		if (newContinuous != continuous) {
			NotificationChain msgs = null;
			if (continuous != null)
				msgs = ((InternalEObject)continuous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__CONTINUOUS, null, msgs);
			if (newContinuous != null)
				msgs = ((InternalEObject)newContinuous).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__CONTINUOUS, null, msgs);
			msgs = basicSetContinuous(newContinuous, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__CONTINUOUS, newContinuous, newContinuous));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(CodeableConcept newDescription, NotificationChain msgs) {
		CodeableConcept oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(CodeableConcept newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartDate(Date newStartDate, NotificationChain msgs) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__START_DATE, oldStartDate, newStartDate);
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
	public void setStartDate(Date newStartDate) {
		if (newStartDate != startDate) {
			NotificationChain msgs = null;
			if (startDate != null)
				msgs = ((InternalEObject)startDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__START_DATE, null, msgs);
			if (newStartDate != null)
				msgs = ((InternalEObject)newStartDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__START_DATE, null, msgs);
			msgs = basicSetStartDate(newStartDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__START_DATE, newStartDate, newStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStartCodeableConcept() {
		return startCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartCodeableConcept(CodeableConcept newStartCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldStartCodeableConcept = startCodeableConcept;
		startCodeableConcept = newStartCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__START_CODEABLE_CONCEPT, oldStartCodeableConcept, newStartCodeableConcept);
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
	public void setStartCodeableConcept(CodeableConcept newStartCodeableConcept) {
		if (newStartCodeableConcept != startCodeableConcept) {
			NotificationChain msgs = null;
			if (startCodeableConcept != null)
				msgs = ((InternalEObject)startCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__START_CODEABLE_CONCEPT, null, msgs);
			if (newStartCodeableConcept != null)
				msgs = ((InternalEObject)newStartCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__START_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetStartCodeableConcept(newStartCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__START_CODEABLE_CONCEPT, newStartCodeableConcept, newStartCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GoalTarget> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<GoalTarget>(GoalTarget.class, this, FHIRPackage.GOAL__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDate(Date newStatusDate, NotificationChain msgs) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__STATUS_DATE, oldStatusDate, newStatusDate);
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
	public void setStatusDate(Date newStatusDate) {
		if (newStatusDate != statusDate) {
			NotificationChain msgs = null;
			if (statusDate != null)
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__STATUS_DATE, newStatusDate, newStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(org.hl7.fhir.String newStatusReason, NotificationChain msgs) {
		org.hl7.fhir.String oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__STATUS_REASON, oldStatusReason, newStatusReason);
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
	public void setStatusReason(org.hl7.fhir.String newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__SOURCE, oldSource, newSource);
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
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GOAL__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GOAL__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.GOAL__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.GOAL__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getOutcome() {
		if (outcome == null) {
			outcome = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.GOAL__OUTCOME);
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.GOAL__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.GOAL__LIFECYCLE_STATUS:
				return basicSetLifecycleStatus(null, msgs);
			case FHIRPackage.GOAL__ACHIEVEMENT_STATUS:
				return basicSetAchievementStatus(null, msgs);
			case FHIRPackage.GOAL__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.GOAL__CONTINUOUS:
				return basicSetContinuous(null, msgs);
			case FHIRPackage.GOAL__PRIORITY:
				return basicSetPriority(null, msgs);
			case FHIRPackage.GOAL__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.GOAL__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.GOAL__START_DATE:
				return basicSetStartDate(null, msgs);
			case FHIRPackage.GOAL__START_CODEABLE_CONCEPT:
				return basicSetStartCodeableConcept(null, msgs);
			case FHIRPackage.GOAL__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case FHIRPackage.GOAL__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case FHIRPackage.GOAL__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FHIRPackage.GOAL__SOURCE:
				return basicSetSource(null, msgs);
			case FHIRPackage.GOAL__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case FHIRPackage.GOAL__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FHIRPackage.GOAL__OUTCOME:
				return ((InternalEList<?>)getOutcome()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.GOAL__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.GOAL__LIFECYCLE_STATUS:
				return getLifecycleStatus();
			case FHIRPackage.GOAL__ACHIEVEMENT_STATUS:
				return getAchievementStatus();
			case FHIRPackage.GOAL__CATEGORY:
				return getCategory();
			case FHIRPackage.GOAL__CONTINUOUS:
				return getContinuous();
			case FHIRPackage.GOAL__PRIORITY:
				return getPriority();
			case FHIRPackage.GOAL__DESCRIPTION:
				return getDescription();
			case FHIRPackage.GOAL__SUBJECT:
				return getSubject();
			case FHIRPackage.GOAL__START_DATE:
				return getStartDate();
			case FHIRPackage.GOAL__START_CODEABLE_CONCEPT:
				return getStartCodeableConcept();
			case FHIRPackage.GOAL__TARGET:
				return getTarget();
			case FHIRPackage.GOAL__STATUS_DATE:
				return getStatusDate();
			case FHIRPackage.GOAL__STATUS_REASON:
				return getStatusReason();
			case FHIRPackage.GOAL__SOURCE:
				return getSource();
			case FHIRPackage.GOAL__ADDRESSES:
				return getAddresses();
			case FHIRPackage.GOAL__NOTE:
				return getNote();
			case FHIRPackage.GOAL__OUTCOME:
				return getOutcome();
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
			case FHIRPackage.GOAL__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.GOAL__LIFECYCLE_STATUS:
				setLifecycleStatus((GoalLifecycleStatus)newValue);
				return;
			case FHIRPackage.GOAL__ACHIEVEMENT_STATUS:
				setAchievementStatus((CodeableConcept)newValue);
				return;
			case FHIRPackage.GOAL__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.GOAL__CONTINUOUS:
				setContinuous((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.GOAL__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FHIRPackage.GOAL__DESCRIPTION:
				setDescription((CodeableConcept)newValue);
				return;
			case FHIRPackage.GOAL__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.GOAL__START_DATE:
				setStartDate((Date)newValue);
				return;
			case FHIRPackage.GOAL__START_CODEABLE_CONCEPT:
				setStartCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.GOAL__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends GoalTarget>)newValue);
				return;
			case FHIRPackage.GOAL__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case FHIRPackage.GOAL__STATUS_REASON:
				setStatusReason((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.GOAL__SOURCE:
				setSource((Reference)newValue);
				return;
			case FHIRPackage.GOAL__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.GOAL__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FHIRPackage.GOAL__OUTCOME:
				getOutcome().clear();
				getOutcome().addAll((Collection<? extends CodeableReference>)newValue);
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
			case FHIRPackage.GOAL__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.GOAL__LIFECYCLE_STATUS:
				setLifecycleStatus((GoalLifecycleStatus)null);
				return;
			case FHIRPackage.GOAL__ACHIEVEMENT_STATUS:
				setAchievementStatus((CodeableConcept)null);
				return;
			case FHIRPackage.GOAL__CATEGORY:
				getCategory().clear();
				return;
			case FHIRPackage.GOAL__CONTINUOUS:
				setContinuous((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.GOAL__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FHIRPackage.GOAL__DESCRIPTION:
				setDescription((CodeableConcept)null);
				return;
			case FHIRPackage.GOAL__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.GOAL__START_DATE:
				setStartDate((Date)null);
				return;
			case FHIRPackage.GOAL__START_CODEABLE_CONCEPT:
				setStartCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.GOAL__TARGET:
				getTarget().clear();
				return;
			case FHIRPackage.GOAL__STATUS_DATE:
				setStatusDate((Date)null);
				return;
			case FHIRPackage.GOAL__STATUS_REASON:
				setStatusReason((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.GOAL__SOURCE:
				setSource((Reference)null);
				return;
			case FHIRPackage.GOAL__ADDRESSES:
				getAddresses().clear();
				return;
			case FHIRPackage.GOAL__NOTE:
				getNote().clear();
				return;
			case FHIRPackage.GOAL__OUTCOME:
				getOutcome().clear();
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
			case FHIRPackage.GOAL__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.GOAL__LIFECYCLE_STATUS:
				return lifecycleStatus != null;
			case FHIRPackage.GOAL__ACHIEVEMENT_STATUS:
				return achievementStatus != null;
			case FHIRPackage.GOAL__CATEGORY:
				return category != null && !category.isEmpty();
			case FHIRPackage.GOAL__CONTINUOUS:
				return continuous != null;
			case FHIRPackage.GOAL__PRIORITY:
				return priority != null;
			case FHIRPackage.GOAL__DESCRIPTION:
				return description != null;
			case FHIRPackage.GOAL__SUBJECT:
				return subject != null;
			case FHIRPackage.GOAL__START_DATE:
				return startDate != null;
			case FHIRPackage.GOAL__START_CODEABLE_CONCEPT:
				return startCodeableConcept != null;
			case FHIRPackage.GOAL__TARGET:
				return target != null && !target.isEmpty();
			case FHIRPackage.GOAL__STATUS_DATE:
				return statusDate != null;
			case FHIRPackage.GOAL__STATUS_REASON:
				return statusReason != null;
			case FHIRPackage.GOAL__SOURCE:
				return source != null;
			case FHIRPackage.GOAL__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case FHIRPackage.GOAL__NOTE:
				return note != null && !note.isEmpty();
			case FHIRPackage.GOAL__OUTCOME:
				return outcome != null && !outcome.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
