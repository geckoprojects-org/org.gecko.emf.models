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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getEventCoding <em>Event Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getEventCanonical <em>Event Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageHeaderImpl extends DomainResourceImpl implements MessageHeader {
	/**
	 * The cached value of the '{@link #getEventCoding() <em>Event Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding eventCoding;

	/**
	 * The cached value of the '{@link #getEventCanonical() <em>Event Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical eventCanonical;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageHeaderDestination> destination;

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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MessageHeaderSource source;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Reference responsible;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected MessageHeaderResponse response;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> focus;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Canonical definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMessageHeader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getEventCoding() {
		return eventCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventCoding(Coding newEventCoding, NotificationChain msgs) {
		Coding oldEventCoding = eventCoding;
		eventCoding = newEventCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__EVENT_CODING, oldEventCoding, newEventCoding);
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
	public void setEventCoding(Coding newEventCoding) {
		if (newEventCoding != eventCoding) {
			NotificationChain msgs = null;
			if (eventCoding != null)
				msgs = ((InternalEObject)eventCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__EVENT_CODING, null, msgs);
			if (newEventCoding != null)
				msgs = ((InternalEObject)newEventCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__EVENT_CODING, null, msgs);
			msgs = basicSetEventCoding(newEventCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__EVENT_CODING, newEventCoding, newEventCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getEventCanonical() {
		return eventCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventCanonical(Canonical newEventCanonical, NotificationChain msgs) {
		Canonical oldEventCanonical = eventCanonical;
		eventCanonical = newEventCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL, oldEventCanonical, newEventCanonical);
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
	public void setEventCanonical(Canonical newEventCanonical) {
		if (newEventCanonical != eventCanonical) {
			NotificationChain msgs = null;
			if (eventCanonical != null)
				msgs = ((InternalEObject)eventCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL, null, msgs);
			if (newEventCanonical != null)
				msgs = ((InternalEObject)newEventCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL, null, msgs);
			msgs = basicSetEventCanonical(newEventCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL, newEventCanonical, newEventCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MessageHeaderDestination> getDestination() {
		if (destination == null) {
			destination = new EObjectContainmentEList<MessageHeaderDestination>(MessageHeaderDestination.class, this, FHIRPackage.MESSAGE_HEADER__DESTINATION);
		}
		return destination;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__SENDER, oldSender, newSender);
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
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeaderSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(MessageHeaderSource newSource, NotificationChain msgs) {
		MessageHeaderSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__SOURCE, oldSource, newSource);
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
	public void setSource(MessageHeaderSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(Reference newResponsible, NotificationChain msgs) {
		Reference oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__RESPONSIBLE, oldResponsible, newResponsible);
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
	public void setResponsible(Reference newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__REASON, oldReason, newReason);
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
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeaderResponse getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(MessageHeaderResponse newResponse, NotificationChain msgs) {
		MessageHeaderResponse oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__RESPONSE, oldResponse, newResponse);
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
	public void setResponse(MessageHeaderResponse newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getFocus() {
		if (focus == null) {
			focus = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.MESSAGE_HEADER__FOCUS);
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Canonical newDefinition, NotificationChain msgs) {
		Canonical oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__DEFINITION, oldDefinition, newDefinition);
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
	public void setDefinition(Canonical newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MESSAGE_HEADER__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MESSAGE_HEADER__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MESSAGE_HEADER__EVENT_CODING:
				return basicSetEventCoding(null, msgs);
			case FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL:
				return basicSetEventCanonical(null, msgs);
			case FHIRPackage.MESSAGE_HEADER__DESTINATION:
				return ((InternalEList<?>)getDestination()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MESSAGE_HEADER__SENDER:
				return basicSetSender(null, msgs);
			case FHIRPackage.MESSAGE_HEADER__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FHIRPackage.MESSAGE_HEADER__SOURCE:
				return basicSetSource(null, msgs);
			case FHIRPackage.MESSAGE_HEADER__RESPONSIBLE:
				return basicSetResponsible(null, msgs);
			case FHIRPackage.MESSAGE_HEADER__REASON:
				return basicSetReason(null, msgs);
			case FHIRPackage.MESSAGE_HEADER__RESPONSE:
				return basicSetResponse(null, msgs);
			case FHIRPackage.MESSAGE_HEADER__FOCUS:
				return ((InternalEList<?>)getFocus()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MESSAGE_HEADER__DEFINITION:
				return basicSetDefinition(null, msgs);
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
			case FHIRPackage.MESSAGE_HEADER__EVENT_CODING:
				return getEventCoding();
			case FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL:
				return getEventCanonical();
			case FHIRPackage.MESSAGE_HEADER__DESTINATION:
				return getDestination();
			case FHIRPackage.MESSAGE_HEADER__SENDER:
				return getSender();
			case FHIRPackage.MESSAGE_HEADER__AUTHOR:
				return getAuthor();
			case FHIRPackage.MESSAGE_HEADER__SOURCE:
				return getSource();
			case FHIRPackage.MESSAGE_HEADER__RESPONSIBLE:
				return getResponsible();
			case FHIRPackage.MESSAGE_HEADER__REASON:
				return getReason();
			case FHIRPackage.MESSAGE_HEADER__RESPONSE:
				return getResponse();
			case FHIRPackage.MESSAGE_HEADER__FOCUS:
				return getFocus();
			case FHIRPackage.MESSAGE_HEADER__DEFINITION:
				return getDefinition();
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
			case FHIRPackage.MESSAGE_HEADER__EVENT_CODING:
				setEventCoding((Coding)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL:
				setEventCanonical((Canonical)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__DESTINATION:
				getDestination().clear();
				getDestination().addAll((Collection<? extends MessageHeaderDestination>)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__SENDER:
				setSender((Reference)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__SOURCE:
				setSource((MessageHeaderSource)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__RESPONSIBLE:
				setResponsible((Reference)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__RESPONSE:
				setResponse((MessageHeaderResponse)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__FOCUS:
				getFocus().clear();
				getFocus().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.MESSAGE_HEADER__DEFINITION:
				setDefinition((Canonical)newValue);
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
			case FHIRPackage.MESSAGE_HEADER__EVENT_CODING:
				setEventCoding((Coding)null);
				return;
			case FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL:
				setEventCanonical((Canonical)null);
				return;
			case FHIRPackage.MESSAGE_HEADER__DESTINATION:
				getDestination().clear();
				return;
			case FHIRPackage.MESSAGE_HEADER__SENDER:
				setSender((Reference)null);
				return;
			case FHIRPackage.MESSAGE_HEADER__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FHIRPackage.MESSAGE_HEADER__SOURCE:
				setSource((MessageHeaderSource)null);
				return;
			case FHIRPackage.MESSAGE_HEADER__RESPONSIBLE:
				setResponsible((Reference)null);
				return;
			case FHIRPackage.MESSAGE_HEADER__REASON:
				setReason((CodeableConcept)null);
				return;
			case FHIRPackage.MESSAGE_HEADER__RESPONSE:
				setResponse((MessageHeaderResponse)null);
				return;
			case FHIRPackage.MESSAGE_HEADER__FOCUS:
				getFocus().clear();
				return;
			case FHIRPackage.MESSAGE_HEADER__DEFINITION:
				setDefinition((Canonical)null);
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
			case FHIRPackage.MESSAGE_HEADER__EVENT_CODING:
				return eventCoding != null;
			case FHIRPackage.MESSAGE_HEADER__EVENT_CANONICAL:
				return eventCanonical != null;
			case FHIRPackage.MESSAGE_HEADER__DESTINATION:
				return destination != null && !destination.isEmpty();
			case FHIRPackage.MESSAGE_HEADER__SENDER:
				return sender != null;
			case FHIRPackage.MESSAGE_HEADER__AUTHOR:
				return author != null;
			case FHIRPackage.MESSAGE_HEADER__SOURCE:
				return source != null;
			case FHIRPackage.MESSAGE_HEADER__RESPONSIBLE:
				return responsible != null;
			case FHIRPackage.MESSAGE_HEADER__REASON:
				return reason != null;
			case FHIRPackage.MESSAGE_HEADER__RESPONSE:
				return response != null;
			case FHIRPackage.MESSAGE_HEADER__FOCUS:
				return focus != null && !focus.isEmpty();
			case FHIRPackage.MESSAGE_HEADER__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageHeaderImpl
