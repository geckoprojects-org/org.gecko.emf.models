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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SpecimenCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getCollectedDateTime <em>Collected Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getCollectedPeriod <em>Collected Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getFastingStatusCodeableConcept <em>Fasting Status Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenCollectionImpl#getFastingStatusDuration <em>Fasting Status Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenCollectionImpl extends BackboneElementImpl implements SpecimenCollection {
	/**
	 * The cached value of the '{@link #getCollector() <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollector()
	 * @generated
	 * @ordered
	 */
	protected Reference collector;

	/**
	 * The cached value of the '{@link #getCollectedDateTime() <em>Collected Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime collectedDateTime;

	/**
	 * The cached value of the '{@link #getCollectedPeriod() <em>Collected Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period collectedPeriod;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration;

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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference device;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Reference procedure;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference bodySite;

	/**
	 * The cached value of the '{@link #getFastingStatusCodeableConcept() <em>Fasting Status Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatusCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fastingStatusCodeableConcept;

	/**
	 * The cached value of the '{@link #getFastingStatusDuration() <em>Fasting Status Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatusDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration fastingStatusDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSpecimenCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCollector() {
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollector(Reference newCollector, NotificationChain msgs) {
		Reference oldCollector = collector;
		collector = newCollector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR, oldCollector, newCollector);
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
	public void setCollector(Reference newCollector) {
		if (newCollector != collector) {
			NotificationChain msgs = null;
			if (collector != null)
				msgs = ((InternalEObject)collector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR, null, msgs);
			if (newCollector != null)
				msgs = ((InternalEObject)newCollector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR, null, msgs);
			msgs = basicSetCollector(newCollector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR, newCollector, newCollector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCollectedDateTime() {
		return collectedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectedDateTime(DateTime newCollectedDateTime, NotificationChain msgs) {
		DateTime oldCollectedDateTime = collectedDateTime;
		collectedDateTime = newCollectedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME, oldCollectedDateTime, newCollectedDateTime);
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
	public void setCollectedDateTime(DateTime newCollectedDateTime) {
		if (newCollectedDateTime != collectedDateTime) {
			NotificationChain msgs = null;
			if (collectedDateTime != null)
				msgs = ((InternalEObject)collectedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME, null, msgs);
			if (newCollectedDateTime != null)
				msgs = ((InternalEObject)newCollectedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME, null, msgs);
			msgs = basicSetCollectedDateTime(newCollectedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME, newCollectedDateTime, newCollectedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getCollectedPeriod() {
		return collectedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectedPeriod(Period newCollectedPeriod, NotificationChain msgs) {
		Period oldCollectedPeriod = collectedPeriod;
		collectedPeriod = newCollectedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD, oldCollectedPeriod, newCollectedPeriod);
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
	public void setCollectedPeriod(Period newCollectedPeriod) {
		if (newCollectedPeriod != collectedPeriod) {
			NotificationChain msgs = null;
			if (collectedPeriod != null)
				msgs = ((InternalEObject)collectedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD, null, msgs);
			if (newCollectedPeriod != null)
				msgs = ((InternalEObject)newCollectedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD, null, msgs);
			msgs = basicSetCollectedPeriod(newCollectedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD, newCollectedPeriod, newCollectedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Duration newDuration, NotificationChain msgs) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__DURATION, oldDuration, newDuration);
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
	public void setDuration(Duration newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__DURATION, newDuration, newDuration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__QUANTITY, newQuantity, newQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(CodeableReference newDevice, NotificationChain msgs) {
		CodeableReference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__DEVICE, oldDevice, newDevice);
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
	public void setDevice(CodeableReference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Reference newProcedure, NotificationChain msgs) {
		Reference oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE, oldProcedure, newProcedure);
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
	public void setProcedure(Reference newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableReference newBodySite, NotificationChain msgs) {
		CodeableReference oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE, oldBodySite, newBodySite);
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
	public void setBodySite(CodeableReference newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFastingStatusCodeableConcept() {
		return fastingStatusCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFastingStatusCodeableConcept(CodeableConcept newFastingStatusCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldFastingStatusCodeableConcept = fastingStatusCodeableConcept;
		fastingStatusCodeableConcept = newFastingStatusCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT, oldFastingStatusCodeableConcept, newFastingStatusCodeableConcept);
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
	public void setFastingStatusCodeableConcept(CodeableConcept newFastingStatusCodeableConcept) {
		if (newFastingStatusCodeableConcept != fastingStatusCodeableConcept) {
			NotificationChain msgs = null;
			if (fastingStatusCodeableConcept != null)
				msgs = ((InternalEObject)fastingStatusCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT, null, msgs);
			if (newFastingStatusCodeableConcept != null)
				msgs = ((InternalEObject)newFastingStatusCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetFastingStatusCodeableConcept(newFastingStatusCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT, newFastingStatusCodeableConcept, newFastingStatusCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getFastingStatusDuration() {
		return fastingStatusDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFastingStatusDuration(Duration newFastingStatusDuration, NotificationChain msgs) {
		Duration oldFastingStatusDuration = fastingStatusDuration;
		fastingStatusDuration = newFastingStatusDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION, oldFastingStatusDuration, newFastingStatusDuration);
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
	public void setFastingStatusDuration(Duration newFastingStatusDuration) {
		if (newFastingStatusDuration != fastingStatusDuration) {
			NotificationChain msgs = null;
			if (fastingStatusDuration != null)
				msgs = ((InternalEObject)fastingStatusDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION, null, msgs);
			if (newFastingStatusDuration != null)
				msgs = ((InternalEObject)newFastingStatusDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION, null, msgs);
			msgs = basicSetFastingStatusDuration(newFastingStatusDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION, newFastingStatusDuration, newFastingStatusDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return basicSetCollector(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				return basicSetCollectedDateTime(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				return basicSetCollectedPeriod(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__DURATION:
				return basicSetDuration(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__METHOD:
				return basicSetMethod(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__DEVICE:
				return basicSetDevice(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT:
				return basicSetFastingStatusCodeableConcept(null, msgs);
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION:
				return basicSetFastingStatusDuration(null, msgs);
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
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return getCollector();
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				return getCollectedDateTime();
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				return getCollectedPeriod();
			case FHIRPackage.SPECIMEN_COLLECTION__DURATION:
				return getDuration();
			case FHIRPackage.SPECIMEN_COLLECTION__QUANTITY:
				return getQuantity();
			case FHIRPackage.SPECIMEN_COLLECTION__METHOD:
				return getMethod();
			case FHIRPackage.SPECIMEN_COLLECTION__DEVICE:
				return getDevice();
			case FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE:
				return getProcedure();
			case FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE:
				return getBodySite();
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT:
				return getFastingStatusCodeableConcept();
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION:
				return getFastingStatusDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR:
				setCollector((Reference)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				setCollectedDateTime((DateTime)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				setCollectedPeriod((Period)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__DURATION:
				setDuration((Duration)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__DEVICE:
				setDevice((CodeableReference)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE:
				setProcedure((Reference)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE:
				setBodySite((CodeableReference)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT:
				setFastingStatusCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION:
				setFastingStatusDuration((Duration)newValue);
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
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR:
				setCollector((Reference)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				setCollectedDateTime((DateTime)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				setCollectedPeriod((Period)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__DURATION:
				setDuration((Duration)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__DEVICE:
				setDevice((CodeableReference)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE:
				setProcedure((Reference)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE:
				setBodySite((CodeableReference)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT:
				setFastingStatusCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION:
				setFastingStatusDuration((Duration)null);
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
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return collector != null;
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_DATE_TIME:
				return collectedDateTime != null;
			case FHIRPackage.SPECIMEN_COLLECTION__COLLECTED_PERIOD:
				return collectedPeriod != null;
			case FHIRPackage.SPECIMEN_COLLECTION__DURATION:
				return duration != null;
			case FHIRPackage.SPECIMEN_COLLECTION__QUANTITY:
				return quantity != null;
			case FHIRPackage.SPECIMEN_COLLECTION__METHOD:
				return method != null;
			case FHIRPackage.SPECIMEN_COLLECTION__DEVICE:
				return device != null;
			case FHIRPackage.SPECIMEN_COLLECTION__PROCEDURE:
				return procedure != null;
			case FHIRPackage.SPECIMEN_COLLECTION__BODY_SITE:
				return bodySite != null;
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_CODEABLE_CONCEPT:
				return fastingStatusCodeableConcept != null;
			case FHIRPackage.SPECIMEN_COLLECTION__FASTING_STATUS_DURATION:
				return fastingStatusDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenCollectionImpl
