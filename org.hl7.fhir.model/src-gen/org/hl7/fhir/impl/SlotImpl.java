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
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getOverbooked <em>Overbooked</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends DomainResourceImpl implements Slot {
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
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceCategory;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> serviceType;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialty;

	/**
	 * The cached value of the '{@link #getAppointmentType() <em>Appointment Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> appointmentType;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Reference schedule;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SlotStatus status;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getOverbooked() <em>Overbooked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverbooked()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean overbooked;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSlot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.SLOT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getServiceCategory() {
		if (serviceCategory == null) {
			serviceCategory = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.SLOT__SERVICE_CATEGORY);
		}
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getServiceType() {
		if (serviceType == null) {
			serviceType = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.SLOT__SERVICE_TYPE);
		}
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.SLOT__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAppointmentType() {
		if (appointmentType == null) {
			appointmentType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.SLOT__APPOINTMENT_TYPE);
		}
		return appointmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Reference newSchedule, NotificationChain msgs) {
		Reference oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__SCHEDULE, oldSchedule, newSchedule);
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
	public void setSchedule(Reference newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlotStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(SlotStatus newStatus, NotificationChain msgs) {
		SlotStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__STATUS, oldStatus, newStatus);
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
	public void setStatus(SlotStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Instant newStart, NotificationChain msgs) {
		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__START, oldStart, newStart);
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
	public void setStart(Instant newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__END, oldEnd, newEnd);
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
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getOverbooked() {
		return overbooked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverbooked(org.hl7.fhir.Boolean newOverbooked, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldOverbooked = overbooked;
		overbooked = newOverbooked;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__OVERBOOKED, oldOverbooked, newOverbooked);
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
	public void setOverbooked(org.hl7.fhir.Boolean newOverbooked) {
		if (newOverbooked != overbooked) {
			NotificationChain msgs = null;
			if (overbooked != null)
				msgs = ((InternalEObject)overbooked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__OVERBOOKED, null, msgs);
			if (newOverbooked != null)
				msgs = ((InternalEObject)newOverbooked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__OVERBOOKED, null, msgs);
			msgs = basicSetOverbooked(newOverbooked, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__OVERBOOKED, newOverbooked, newOverbooked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__COMMENT, oldComment, newComment);
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
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SLOT__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SLOT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SLOT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SLOT__SERVICE_CATEGORY:
				return ((InternalEList<?>)getServiceCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SLOT__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SLOT__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SLOT__APPOINTMENT_TYPE:
				return ((InternalEList<?>)getAppointmentType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SLOT__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FHIRPackage.SLOT__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.SLOT__START:
				return basicSetStart(null, msgs);
			case FHIRPackage.SLOT__END:
				return basicSetEnd(null, msgs);
			case FHIRPackage.SLOT__OVERBOOKED:
				return basicSetOverbooked(null, msgs);
			case FHIRPackage.SLOT__COMMENT:
				return basicSetComment(null, msgs);
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
			case FHIRPackage.SLOT__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.SLOT__SERVICE_CATEGORY:
				return getServiceCategory();
			case FHIRPackage.SLOT__SERVICE_TYPE:
				return getServiceType();
			case FHIRPackage.SLOT__SPECIALTY:
				return getSpecialty();
			case FHIRPackage.SLOT__APPOINTMENT_TYPE:
				return getAppointmentType();
			case FHIRPackage.SLOT__SCHEDULE:
				return getSchedule();
			case FHIRPackage.SLOT__STATUS:
				return getStatus();
			case FHIRPackage.SLOT__START:
				return getStart();
			case FHIRPackage.SLOT__END:
				return getEnd();
			case FHIRPackage.SLOT__OVERBOOKED:
				return getOverbooked();
			case FHIRPackage.SLOT__COMMENT:
				return getComment();
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
			case FHIRPackage.SLOT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.SLOT__SERVICE_CATEGORY:
				getServiceCategory().clear();
				getServiceCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.SLOT__SERVICE_TYPE:
				getServiceType().clear();
				getServiceType().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.SLOT__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.SLOT__APPOINTMENT_TYPE:
				getAppointmentType().clear();
				getAppointmentType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.SLOT__SCHEDULE:
				setSchedule((Reference)newValue);
				return;
			case FHIRPackage.SLOT__STATUS:
				setStatus((SlotStatus)newValue);
				return;
			case FHIRPackage.SLOT__START:
				setStart((Instant)newValue);
				return;
			case FHIRPackage.SLOT__END:
				setEnd((Instant)newValue);
				return;
			case FHIRPackage.SLOT__OVERBOOKED:
				setOverbooked((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.SLOT__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
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
			case FHIRPackage.SLOT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.SLOT__SERVICE_CATEGORY:
				getServiceCategory().clear();
				return;
			case FHIRPackage.SLOT__SERVICE_TYPE:
				getServiceType().clear();
				return;
			case FHIRPackage.SLOT__SPECIALTY:
				getSpecialty().clear();
				return;
			case FHIRPackage.SLOT__APPOINTMENT_TYPE:
				getAppointmentType().clear();
				return;
			case FHIRPackage.SLOT__SCHEDULE:
				setSchedule((Reference)null);
				return;
			case FHIRPackage.SLOT__STATUS:
				setStatus((SlotStatus)null);
				return;
			case FHIRPackage.SLOT__START:
				setStart((Instant)null);
				return;
			case FHIRPackage.SLOT__END:
				setEnd((Instant)null);
				return;
			case FHIRPackage.SLOT__OVERBOOKED:
				setOverbooked((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.SLOT__COMMENT:
				setComment((org.hl7.fhir.String)null);
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
			case FHIRPackage.SLOT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.SLOT__SERVICE_CATEGORY:
				return serviceCategory != null && !serviceCategory.isEmpty();
			case FHIRPackage.SLOT__SERVICE_TYPE:
				return serviceType != null && !serviceType.isEmpty();
			case FHIRPackage.SLOT__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FHIRPackage.SLOT__APPOINTMENT_TYPE:
				return appointmentType != null && !appointmentType.isEmpty();
			case FHIRPackage.SLOT__SCHEDULE:
				return schedule != null;
			case FHIRPackage.SLOT__STATUS:
				return status != null;
			case FHIRPackage.SLOT__START:
				return start != null;
			case FHIRPackage.SLOT__END:
				return end != null;
			case FHIRPackage.SLOT__OVERBOOKED:
				return overbooked != null;
			case FHIRPackage.SLOT__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //SlotImpl
