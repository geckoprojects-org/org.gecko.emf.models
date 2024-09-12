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
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanImpl extends DomainResourceImpl implements CarePlan {
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
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUri;

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
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> replaces;

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
	protected RequestStatus status;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected CarePlanIntent intent;

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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

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
	 * The cached value of the '{@link #getCustodian() <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected Reference custodian;

	/**
	 * The cached value of the '{@link #getContributor() <em>Contributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contributor;

	/**
	 * The cached value of the '{@link #getCareTeam() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> careTeam;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> addresses;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInfo;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> goal;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<CarePlanActivity> activity;

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
	protected CarePlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getCarePlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.CARE_PLAN__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getInstantiatesCanonical() {
		if (instantiatesCanonical == null) {
			instantiatesCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.CARE_PLAN__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getInstantiatesUri() {
		if (instantiatesUri == null) {
			instantiatesUri = new EObjectContainmentEList<Uri>(Uri.class, this, FHIRPackage.CARE_PLAN__INSTANTIATES_URI);
		}
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CARE_PLAN__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReplaces() {
		if (replaces == null) {
			replaces = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CARE_PLAN__REPLACES);
		}
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CARE_PLAN__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(RequestStatus newStatus, NotificationChain msgs) {
		RequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__STATUS, oldStatus, newStatus);
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
	public void setStatus(RequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanIntent getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(CarePlanIntent newIntent, NotificationChain msgs) {
		CarePlanIntent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__INTENT, oldIntent, newIntent);
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
	public void setIntent(CarePlanIntent newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CARE_PLAN__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__ENCOUNTER, newEncounter, newEncounter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__PERIOD, newPeriod, newPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCustodian() {
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustodian(Reference newCustodian, NotificationChain msgs) {
		Reference oldCustodian = custodian;
		custodian = newCustodian;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__CUSTODIAN, oldCustodian, newCustodian);
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
	public void setCustodian(Reference newCustodian) {
		if (newCustodian != custodian) {
			NotificationChain msgs = null;
			if (custodian != null)
				msgs = ((InternalEObject)custodian).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__CUSTODIAN, null, msgs);
			if (newCustodian != null)
				msgs = ((InternalEObject)newCustodian).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_PLAN__CUSTODIAN, null, msgs);
			msgs = basicSetCustodian(newCustodian, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_PLAN__CUSTODIAN, newCustodian, newCustodian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getContributor() {
		if (contributor == null) {
			contributor = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CARE_PLAN__CONTRIBUTOR);
		}
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getCareTeam() {
		if (careTeam == null) {
			careTeam = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CARE_PLAN__CARE_TEAM);
		}
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.CARE_PLAN__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CARE_PLAN__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CARE_PLAN__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CarePlanActivity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<CarePlanActivity>(CarePlanActivity.class, this, FHIRPackage.CARE_PLAN__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.CARE_PLAN__NOTE);
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
			case FHIRPackage.CARE_PLAN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonical()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUri()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__REPLACES:
				return ((InternalEList<?>)getReplaces()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.CARE_PLAN__INTENT:
				return basicSetIntent(null, msgs);
			case FHIRPackage.CARE_PLAN__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__TITLE:
				return basicSetTitle(null, msgs);
			case FHIRPackage.CARE_PLAN__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.CARE_PLAN__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.CARE_PLAN__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FHIRPackage.CARE_PLAN__PERIOD:
				return basicSetPeriod(null, msgs);
			case FHIRPackage.CARE_PLAN__CREATED:
				return basicSetCreated(null, msgs);
			case FHIRPackage.CARE_PLAN__CUSTODIAN:
				return basicSetCustodian(null, msgs);
			case FHIRPackage.CARE_PLAN__CONTRIBUTOR:
				return ((InternalEList<?>)getContributor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__CARE_TEAM:
				return ((InternalEList<?>)getCareTeam()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CARE_PLAN__NOTE:
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
			case FHIRPackage.CARE_PLAN__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.CARE_PLAN__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FHIRPackage.CARE_PLAN__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FHIRPackage.CARE_PLAN__BASED_ON:
				return getBasedOn();
			case FHIRPackage.CARE_PLAN__REPLACES:
				return getReplaces();
			case FHIRPackage.CARE_PLAN__PART_OF:
				return getPartOf();
			case FHIRPackage.CARE_PLAN__STATUS:
				return getStatus();
			case FHIRPackage.CARE_PLAN__INTENT:
				return getIntent();
			case FHIRPackage.CARE_PLAN__CATEGORY:
				return getCategory();
			case FHIRPackage.CARE_PLAN__TITLE:
				return getTitle();
			case FHIRPackage.CARE_PLAN__DESCRIPTION:
				return getDescription();
			case FHIRPackage.CARE_PLAN__SUBJECT:
				return getSubject();
			case FHIRPackage.CARE_PLAN__ENCOUNTER:
				return getEncounter();
			case FHIRPackage.CARE_PLAN__PERIOD:
				return getPeriod();
			case FHIRPackage.CARE_PLAN__CREATED:
				return getCreated();
			case FHIRPackage.CARE_PLAN__CUSTODIAN:
				return getCustodian();
			case FHIRPackage.CARE_PLAN__CONTRIBUTOR:
				return getContributor();
			case FHIRPackage.CARE_PLAN__CARE_TEAM:
				return getCareTeam();
			case FHIRPackage.CARE_PLAN__ADDRESSES:
				return getAddresses();
			case FHIRPackage.CARE_PLAN__SUPPORTING_INFO:
				return getSupportingInfo();
			case FHIRPackage.CARE_PLAN__GOAL:
				return getGoal();
			case FHIRPackage.CARE_PLAN__ACTIVITY:
				return getActivity();
			case FHIRPackage.CARE_PLAN__NOTE:
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
			case FHIRPackage.CARE_PLAN__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				getInstantiatesCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				getInstantiatesUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__STATUS:
				setStatus((RequestStatus)newValue);
				return;
			case FHIRPackage.CARE_PLAN__INTENT:
				setIntent((CarePlanIntent)newValue);
				return;
			case FHIRPackage.CARE_PLAN__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.CARE_PLAN__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.CARE_PLAN__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.CARE_PLAN__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FHIRPackage.CARE_PLAN__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FHIRPackage.CARE_PLAN__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FHIRPackage.CARE_PLAN__CUSTODIAN:
				setCustodian((Reference)newValue);
				return;
			case FHIRPackage.CARE_PLAN__CONTRIBUTOR:
				getContributor().clear();
				getContributor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__CARE_TEAM:
				getCareTeam().clear();
				getCareTeam().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends CarePlanActivity>)newValue);
				return;
			case FHIRPackage.CARE_PLAN__NOTE:
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
			case FHIRPackage.CARE_PLAN__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.CARE_PLAN__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				return;
			case FHIRPackage.CARE_PLAN__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				return;
			case FHIRPackage.CARE_PLAN__BASED_ON:
				getBasedOn().clear();
				return;
			case FHIRPackage.CARE_PLAN__REPLACES:
				getReplaces().clear();
				return;
			case FHIRPackage.CARE_PLAN__PART_OF:
				getPartOf().clear();
				return;
			case FHIRPackage.CARE_PLAN__STATUS:
				setStatus((RequestStatus)null);
				return;
			case FHIRPackage.CARE_PLAN__INTENT:
				setIntent((CarePlanIntent)null);
				return;
			case FHIRPackage.CARE_PLAN__CATEGORY:
				getCategory().clear();
				return;
			case FHIRPackage.CARE_PLAN__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.CARE_PLAN__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.CARE_PLAN__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.CARE_PLAN__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FHIRPackage.CARE_PLAN__PERIOD:
				setPeriod((Period)null);
				return;
			case FHIRPackage.CARE_PLAN__CREATED:
				setCreated((DateTime)null);
				return;
			case FHIRPackage.CARE_PLAN__CUSTODIAN:
				setCustodian((Reference)null);
				return;
			case FHIRPackage.CARE_PLAN__CONTRIBUTOR:
				getContributor().clear();
				return;
			case FHIRPackage.CARE_PLAN__CARE_TEAM:
				getCareTeam().clear();
				return;
			case FHIRPackage.CARE_PLAN__ADDRESSES:
				getAddresses().clear();
				return;
			case FHIRPackage.CARE_PLAN__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FHIRPackage.CARE_PLAN__GOAL:
				getGoal().clear();
				return;
			case FHIRPackage.CARE_PLAN__ACTIVITY:
				getActivity().clear();
				return;
			case FHIRPackage.CARE_PLAN__NOTE:
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
			case FHIRPackage.CARE_PLAN__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.CARE_PLAN__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null && !instantiatesCanonical.isEmpty();
			case FHIRPackage.CARE_PLAN__INSTANTIATES_URI:
				return instantiatesUri != null && !instantiatesUri.isEmpty();
			case FHIRPackage.CARE_PLAN__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FHIRPackage.CARE_PLAN__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case FHIRPackage.CARE_PLAN__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FHIRPackage.CARE_PLAN__STATUS:
				return status != null;
			case FHIRPackage.CARE_PLAN__INTENT:
				return intent != null;
			case FHIRPackage.CARE_PLAN__CATEGORY:
				return category != null && !category.isEmpty();
			case FHIRPackage.CARE_PLAN__TITLE:
				return title != null;
			case FHIRPackage.CARE_PLAN__DESCRIPTION:
				return description != null;
			case FHIRPackage.CARE_PLAN__SUBJECT:
				return subject != null;
			case FHIRPackage.CARE_PLAN__ENCOUNTER:
				return encounter != null;
			case FHIRPackage.CARE_PLAN__PERIOD:
				return period != null;
			case FHIRPackage.CARE_PLAN__CREATED:
				return created != null;
			case FHIRPackage.CARE_PLAN__CUSTODIAN:
				return custodian != null;
			case FHIRPackage.CARE_PLAN__CONTRIBUTOR:
				return contributor != null && !contributor.isEmpty();
			case FHIRPackage.CARE_PLAN__CARE_TEAM:
				return careTeam != null && !careTeam.isEmpty();
			case FHIRPackage.CARE_PLAN__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case FHIRPackage.CARE_PLAN__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FHIRPackage.CARE_PLAN__GOAL:
				return goal != null && !goal.isEmpty();
			case FHIRPackage.CARE_PLAN__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case FHIRPackage.CARE_PLAN__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarePlanImpl
