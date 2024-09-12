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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EvidenceVariableTimeFromEvent;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable Time From Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableTimeFromEventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableTimeFromEventImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableTimeFromEventImpl#getEventCodeableConcept <em>Event Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableTimeFromEventImpl#getEventReference <em>Event Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableTimeFromEventImpl#getEventDateTime <em>Event Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableTimeFromEventImpl#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableTimeFromEventImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableTimeFromEventImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableTimeFromEventImpl extends BackboneElementImpl implements EvidenceVariableTimeFromEvent {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

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
	 * The cached value of the '{@link #getEventCodeableConcept() <em>Event Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept eventCodeableConcept;

	/**
	 * The cached value of the '{@link #getEventReference() <em>Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventReference()
	 * @generated
	 * @ordered
	 */
	protected Reference eventReference;

	/**
	 * The cached value of the '{@link #getEventDateTime() <em>Event Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime eventDateTime;

	/**
	 * The cached value of the '{@link #getEventId() <em>Event Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventId()
	 * @generated
	 * @ordered
	 */
	protected Id eventId;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableTimeFromEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getEvidenceVariableTimeFromEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getEventCodeableConcept() {
		return eventCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventCodeableConcept(CodeableConcept newEventCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldEventCodeableConcept = eventCodeableConcept;
		eventCodeableConcept = newEventCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT, oldEventCodeableConcept, newEventCodeableConcept);
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
	public void setEventCodeableConcept(CodeableConcept newEventCodeableConcept) {
		if (newEventCodeableConcept != eventCodeableConcept) {
			NotificationChain msgs = null;
			if (eventCodeableConcept != null)
				msgs = ((InternalEObject)eventCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT, null, msgs);
			if (newEventCodeableConcept != null)
				msgs = ((InternalEObject)newEventCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetEventCodeableConcept(newEventCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT, newEventCodeableConcept, newEventCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEventReference() {
		return eventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventReference(Reference newEventReference, NotificationChain msgs) {
		Reference oldEventReference = eventReference;
		eventReference = newEventReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE, oldEventReference, newEventReference);
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
	public void setEventReference(Reference newEventReference) {
		if (newEventReference != eventReference) {
			NotificationChain msgs = null;
			if (eventReference != null)
				msgs = ((InternalEObject)eventReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE, null, msgs);
			if (newEventReference != null)
				msgs = ((InternalEObject)newEventReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE, null, msgs);
			msgs = basicSetEventReference(newEventReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE, newEventReference, newEventReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getEventDateTime() {
		return eventDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDateTime(DateTime newEventDateTime, NotificationChain msgs) {
		DateTime oldEventDateTime = eventDateTime;
		eventDateTime = newEventDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME, oldEventDateTime, newEventDateTime);
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
	public void setEventDateTime(DateTime newEventDateTime) {
		if (newEventDateTime != eventDateTime) {
			NotificationChain msgs = null;
			if (eventDateTime != null)
				msgs = ((InternalEObject)eventDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME, null, msgs);
			if (newEventDateTime != null)
				msgs = ((InternalEObject)newEventDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME, null, msgs);
			msgs = basicSetEventDateTime(newEventDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME, newEventDateTime, newEventDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getEventId() {
		return eventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventId(Id newEventId, NotificationChain msgs) {
		Id oldEventId = eventId;
		eventId = newEventId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID, oldEventId, newEventId);
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
	public void setEventId(Id newEventId) {
		if (newEventId != eventId) {
			NotificationChain msgs = null;
			if (eventId != null)
				msgs = ((InternalEObject)eventId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID, null, msgs);
			if (newEventId != null)
				msgs = ((InternalEObject)newEventId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID, null, msgs);
			msgs = basicSetEventId(newEventId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID, newEventId, newEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE, oldRange, newRange);
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
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT:
				return basicSetEventCodeableConcept(null, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE:
				return basicSetEventReference(null, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME:
				return basicSetEventDateTime(null, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID:
				return basicSetEventId(null, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE:
				return basicSetRange(null, msgs);
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
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION:
				return getDescription();
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__NOTE:
				return getNote();
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT:
				return getEventCodeableConcept();
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE:
				return getEventReference();
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME:
				return getEventDateTime();
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID:
				return getEventId();
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY:
				return getQuantity();
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE:
				return getRange();
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
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT:
				setEventCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE:
				setEventReference((Reference)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME:
				setEventDateTime((DateTime)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID:
				setEventId((Id)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE:
				setRange((Range)newValue);
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
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__NOTE:
				getNote().clear();
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT:
				setEventCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE:
				setEventReference((Reference)null);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME:
				setEventDateTime((DateTime)null);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID:
				setEventId((Id)null);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE:
				setRange((Range)null);
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
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__DESCRIPTION:
				return description != null;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__NOTE:
				return note != null && !note.isEmpty();
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_CODEABLE_CONCEPT:
				return eventCodeableConcept != null;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_REFERENCE:
				return eventReference != null;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_DATE_TIME:
				return eventDateTime != null;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__EVENT_ID:
				return eventId != null;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__QUANTITY:
				return quantity != null;
			case FHIRPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableTimeFromEventImpl
