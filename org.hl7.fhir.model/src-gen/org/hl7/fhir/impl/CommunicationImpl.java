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
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getInResponseTo <em>In Response To</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getAbout <em>About</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSent <em>Sent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getReceived <em>Received</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends DomainResourceImpl implements Communication {
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
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

	/**
	 * The cached value of the '{@link #getInResponseTo() <em>In Response To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInResponseTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> inResponseTo;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EventStatus status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected RequestPriority priority;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> medium;

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
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept topic;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> about;

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
	 * The cached value of the '{@link #getSent() <em>Sent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSent()
	 * @generated
	 * @ordered
	 */
	protected DateTime sent;

	/**
	 * The cached value of the '{@link #getReceived() <em>Received</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceived()
	 * @generated
	 * @ordered
	 */
	protected DateTime received;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipient;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Reference sender;

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
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationPayload> payload;

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
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getCommunication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.COMMUNICATION__IDENTIFIER);
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
			instantiatesCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.COMMUNICATION__INSTANTIATES_CANONICAL);
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
			instantiatesUri = new EObjectContainmentEList<Uri>(Uri.class, this, FHIRPackage.COMMUNICATION__INSTANTIATES_URI);
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
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.COMMUNICATION__BASED_ON);
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
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.COMMUNICATION__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getInResponseTo() {
		if (inResponseTo == null) {
			inResponseTo = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.COMMUNICATION__IN_RESPONSE_TO);
		}
		return inResponseTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EventStatus newStatus, NotificationChain msgs) {
		EventStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__STATUS, oldStatus, newStatus);
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
	public void setStatus(EventStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(CodeableConcept newStatusReason, NotificationChain msgs) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__STATUS_REASON, oldStatusReason, newStatusReason);
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
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.COMMUNICATION__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(RequestPriority newPriority, NotificationChain msgs) {
		RequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(RequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getMedium() {
		if (medium == null) {
			medium = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.COMMUNICATION__MEDIUM);
		}
		return medium;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(CodeableConcept newTopic, NotificationChain msgs) {
		CodeableConcept oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__TOPIC, oldTopic, newTopic);
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
	public void setTopic(CodeableConcept newTopic) {
		if (newTopic != topic) {
			NotificationChain msgs = null;
			if (topic != null)
				msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__TOPIC, null, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__TOPIC, null, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__TOPIC, newTopic, newTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAbout() {
		if (about == null) {
			about = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.COMMUNICATION__ABOUT);
		}
		return about;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getSent() {
		return sent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSent(DateTime newSent, NotificationChain msgs) {
		DateTime oldSent = sent;
		sent = newSent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__SENT, oldSent, newSent);
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
	public void setSent(DateTime newSent) {
		if (newSent != sent) {
			NotificationChain msgs = null;
			if (sent != null)
				msgs = ((InternalEObject)sent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__SENT, null, msgs);
			if (newSent != null)
				msgs = ((InternalEObject)newSent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__SENT, null, msgs);
			msgs = basicSetSent(newSent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__SENT, newSent, newSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getReceived() {
		return received;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceived(DateTime newReceived, NotificationChain msgs) {
		DateTime oldReceived = received;
		received = newReceived;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__RECEIVED, oldReceived, newReceived);
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
	public void setReceived(DateTime newReceived) {
		if (newReceived != received) {
			NotificationChain msgs = null;
			if (received != null)
				msgs = ((InternalEObject)received).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__RECEIVED, null, msgs);
			if (newReceived != null)
				msgs = ((InternalEObject)newReceived).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__RECEIVED, null, msgs);
			msgs = basicSetReceived(newReceived, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__RECEIVED, newReceived, newReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.COMMUNICATION__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Reference newSender, NotificationChain msgs) {
		Reference oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__SENDER, oldSender, newSender);
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
	public void setSender(Reference newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMMUNICATION__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMMUNICATION__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.COMMUNICATION__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationPayload> getPayload() {
		if (payload == null) {
			payload = new EObjectContainmentEList<CommunicationPayload>(CommunicationPayload.class, this, FHIRPackage.COMMUNICATION__PAYLOAD);
		}
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.COMMUNICATION__NOTE);
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
			case FHIRPackage.COMMUNICATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonical()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUri()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__IN_RESPONSE_TO:
				return ((InternalEList<?>)getInResponseTo()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.COMMUNICATION__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FHIRPackage.COMMUNICATION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__PRIORITY:
				return basicSetPriority(null, msgs);
			case FHIRPackage.COMMUNICATION__MEDIUM:
				return ((InternalEList<?>)getMedium()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.COMMUNICATION__TOPIC:
				return basicSetTopic(null, msgs);
			case FHIRPackage.COMMUNICATION__ABOUT:
				return ((InternalEList<?>)getAbout()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FHIRPackage.COMMUNICATION__SENT:
				return basicSetSent(null, msgs);
			case FHIRPackage.COMMUNICATION__RECEIVED:
				return basicSetReceived(null, msgs);
			case FHIRPackage.COMMUNICATION__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__SENDER:
				return basicSetSender(null, msgs);
			case FHIRPackage.COMMUNICATION__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__PAYLOAD:
				return ((InternalEList<?>)getPayload()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMMUNICATION__NOTE:
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
			case FHIRPackage.COMMUNICATION__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.COMMUNICATION__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FHIRPackage.COMMUNICATION__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FHIRPackage.COMMUNICATION__BASED_ON:
				return getBasedOn();
			case FHIRPackage.COMMUNICATION__PART_OF:
				return getPartOf();
			case FHIRPackage.COMMUNICATION__IN_RESPONSE_TO:
				return getInResponseTo();
			case FHIRPackage.COMMUNICATION__STATUS:
				return getStatus();
			case FHIRPackage.COMMUNICATION__STATUS_REASON:
				return getStatusReason();
			case FHIRPackage.COMMUNICATION__CATEGORY:
				return getCategory();
			case FHIRPackage.COMMUNICATION__PRIORITY:
				return getPriority();
			case FHIRPackage.COMMUNICATION__MEDIUM:
				return getMedium();
			case FHIRPackage.COMMUNICATION__SUBJECT:
				return getSubject();
			case FHIRPackage.COMMUNICATION__TOPIC:
				return getTopic();
			case FHIRPackage.COMMUNICATION__ABOUT:
				return getAbout();
			case FHIRPackage.COMMUNICATION__ENCOUNTER:
				return getEncounter();
			case FHIRPackage.COMMUNICATION__SENT:
				return getSent();
			case FHIRPackage.COMMUNICATION__RECEIVED:
				return getReceived();
			case FHIRPackage.COMMUNICATION__RECIPIENT:
				return getRecipient();
			case FHIRPackage.COMMUNICATION__SENDER:
				return getSender();
			case FHIRPackage.COMMUNICATION__REASON:
				return getReason();
			case FHIRPackage.COMMUNICATION__PAYLOAD:
				return getPayload();
			case FHIRPackage.COMMUNICATION__NOTE:
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
			case FHIRPackage.COMMUNICATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				getInstantiatesCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				getInstantiatesUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__IN_RESPONSE_TO:
				getInResponseTo().clear();
				getInResponseTo().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__STATUS:
				setStatus((EventStatus)newValue);
				return;
			case FHIRPackage.COMMUNICATION__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FHIRPackage.COMMUNICATION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__PRIORITY:
				setPriority((RequestPriority)newValue);
				return;
			case FHIRPackage.COMMUNICATION__MEDIUM:
				getMedium().clear();
				getMedium().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.COMMUNICATION__TOPIC:
				setTopic((CodeableConcept)newValue);
				return;
			case FHIRPackage.COMMUNICATION__ABOUT:
				getAbout().clear();
				getAbout().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FHIRPackage.COMMUNICATION__SENT:
				setSent((DateTime)newValue);
				return;
			case FHIRPackage.COMMUNICATION__RECEIVED:
				setReceived((DateTime)newValue);
				return;
			case FHIRPackage.COMMUNICATION__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__SENDER:
				setSender((Reference)newValue);
				return;
			case FHIRPackage.COMMUNICATION__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends CommunicationPayload>)newValue);
				return;
			case FHIRPackage.COMMUNICATION__NOTE:
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
			case FHIRPackage.COMMUNICATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.COMMUNICATION__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				return;
			case FHIRPackage.COMMUNICATION__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				return;
			case FHIRPackage.COMMUNICATION__BASED_ON:
				getBasedOn().clear();
				return;
			case FHIRPackage.COMMUNICATION__PART_OF:
				getPartOf().clear();
				return;
			case FHIRPackage.COMMUNICATION__IN_RESPONSE_TO:
				getInResponseTo().clear();
				return;
			case FHIRPackage.COMMUNICATION__STATUS:
				setStatus((EventStatus)null);
				return;
			case FHIRPackage.COMMUNICATION__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FHIRPackage.COMMUNICATION__CATEGORY:
				getCategory().clear();
				return;
			case FHIRPackage.COMMUNICATION__PRIORITY:
				setPriority((RequestPriority)null);
				return;
			case FHIRPackage.COMMUNICATION__MEDIUM:
				getMedium().clear();
				return;
			case FHIRPackage.COMMUNICATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.COMMUNICATION__TOPIC:
				setTopic((CodeableConcept)null);
				return;
			case FHIRPackage.COMMUNICATION__ABOUT:
				getAbout().clear();
				return;
			case FHIRPackage.COMMUNICATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FHIRPackage.COMMUNICATION__SENT:
				setSent((DateTime)null);
				return;
			case FHIRPackage.COMMUNICATION__RECEIVED:
				setReceived((DateTime)null);
				return;
			case FHIRPackage.COMMUNICATION__RECIPIENT:
				getRecipient().clear();
				return;
			case FHIRPackage.COMMUNICATION__SENDER:
				setSender((Reference)null);
				return;
			case FHIRPackage.COMMUNICATION__REASON:
				getReason().clear();
				return;
			case FHIRPackage.COMMUNICATION__PAYLOAD:
				getPayload().clear();
				return;
			case FHIRPackage.COMMUNICATION__NOTE:
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
			case FHIRPackage.COMMUNICATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.COMMUNICATION__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null && !instantiatesCanonical.isEmpty();
			case FHIRPackage.COMMUNICATION__INSTANTIATES_URI:
				return instantiatesUri != null && !instantiatesUri.isEmpty();
			case FHIRPackage.COMMUNICATION__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FHIRPackage.COMMUNICATION__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FHIRPackage.COMMUNICATION__IN_RESPONSE_TO:
				return inResponseTo != null && !inResponseTo.isEmpty();
			case FHIRPackage.COMMUNICATION__STATUS:
				return status != null;
			case FHIRPackage.COMMUNICATION__STATUS_REASON:
				return statusReason != null;
			case FHIRPackage.COMMUNICATION__CATEGORY:
				return category != null && !category.isEmpty();
			case FHIRPackage.COMMUNICATION__PRIORITY:
				return priority != null;
			case FHIRPackage.COMMUNICATION__MEDIUM:
				return medium != null && !medium.isEmpty();
			case FHIRPackage.COMMUNICATION__SUBJECT:
				return subject != null;
			case FHIRPackage.COMMUNICATION__TOPIC:
				return topic != null;
			case FHIRPackage.COMMUNICATION__ABOUT:
				return about != null && !about.isEmpty();
			case FHIRPackage.COMMUNICATION__ENCOUNTER:
				return encounter != null;
			case FHIRPackage.COMMUNICATION__SENT:
				return sent != null;
			case FHIRPackage.COMMUNICATION__RECEIVED:
				return received != null;
			case FHIRPackage.COMMUNICATION__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FHIRPackage.COMMUNICATION__SENDER:
				return sender != null;
			case FHIRPackage.COMMUNICATION__REASON:
				return reason != null && !reason.isEmpty();
			case FHIRPackage.COMMUNICATION__PAYLOAD:
				return payload != null && !payload.isEmpty();
			case FHIRPackage.COMMUNICATION__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationImpl
