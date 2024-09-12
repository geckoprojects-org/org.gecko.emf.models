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
import org.hl7.fhir.Attachment;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.ObservationTriggeredBy;
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getInstantiatesReference <em>Instantiates Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getEffectiveTiming <em>Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getEffectiveInstant <em>Effective Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueSampledData <em>Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getBodyStructure <em>Body Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getReferenceRange <em>Reference Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getHasMember <em>Has Member</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationImpl extends DomainResourceImpl implements Observation {
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
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesReference() <em>Instantiates Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesReference()
	 * @generated
	 * @ordered
	 */
	protected Reference instantiatesReference;

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
	 * The cached value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationTriggeredBy> triggeredBy;

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
	protected ObservationStatus status;

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
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> focus;

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
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDateTime;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getEffectiveTiming() <em>Effective Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing effectiveTiming;

	/**
	 * The cached value of the '{@link #getEffectiveInstant() <em>Effective Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant effectiveInstant;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Instant issued;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performer;

	/**
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity valueQuantity;

	/**
	 * The cached value of the '{@link #getValueCodeableConcept() <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept valueCodeableConcept;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueString;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean valueBoolean;

	/**
	 * The cached value of the '{@link #getValueInteger() <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer valueInteger;

	/**
	 * The cached value of the '{@link #getValueRange() <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected Range valueRange;

	/**
	 * The cached value of the '{@link #getValueRatio() <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio valueRatio;

	/**
	 * The cached value of the '{@link #getValueSampledData() <em>Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData valueSampledData;

	/**
	 * The cached value of the '{@link #getValueTime() <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time valueTime;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueDateTime;

	/**
	 * The cached value of the '{@link #getValuePeriod() <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period valuePeriod;

	/**
	 * The cached value of the '{@link #getValueAttachment() <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment valueAttachment;

	/**
	 * The cached value of the '{@link #getValueReference() <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueReference;

	/**
	 * The cached value of the '{@link #getDataAbsentReason() <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAbsentReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dataAbsentReason;

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> interpretation;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getBodyStructure() <em>Body Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyStructure()
	 * @generated
	 * @ordered
	 */
	protected Reference bodyStructure;

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
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Reference specimen;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

	/**
	 * The cached value of the '{@link #getReferenceRange() <em>Reference Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRange()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationReferenceRange> referenceRange;

	/**
	 * The cached value of the '{@link #getHasMember() <em>Has Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> hasMember;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> derivedFrom;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationComponent> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.OBSERVATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getInstantiatesCanonical() {
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesCanonical(Canonical newInstantiatesCanonical, NotificationChain msgs) {
		Canonical oldInstantiatesCanonical = instantiatesCanonical;
		instantiatesCanonical = newInstantiatesCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL, oldInstantiatesCanonical, newInstantiatesCanonical);
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
	public void setInstantiatesCanonical(Canonical newInstantiatesCanonical) {
		if (newInstantiatesCanonical != instantiatesCanonical) {
			NotificationChain msgs = null;
			if (instantiatesCanonical != null)
				msgs = ((InternalEObject)instantiatesCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL, null, msgs);
			if (newInstantiatesCanonical != null)
				msgs = ((InternalEObject)newInstantiatesCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL, null, msgs);
			msgs = basicSetInstantiatesCanonical(newInstantiatesCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL, newInstantiatesCanonical, newInstantiatesCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInstantiatesReference() {
		return instantiatesReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesReference(Reference newInstantiatesReference, NotificationChain msgs) {
		Reference oldInstantiatesReference = instantiatesReference;
		instantiatesReference = newInstantiatesReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE, oldInstantiatesReference, newInstantiatesReference);
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
	public void setInstantiatesReference(Reference newInstantiatesReference) {
		if (newInstantiatesReference != instantiatesReference) {
			NotificationChain msgs = null;
			if (instantiatesReference != null)
				msgs = ((InternalEObject)instantiatesReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE, null, msgs);
			if (newInstantiatesReference != null)
				msgs = ((InternalEObject)newInstantiatesReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE, null, msgs);
			msgs = basicSetInstantiatesReference(newInstantiatesReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE, newInstantiatesReference, newInstantiatesReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.OBSERVATION__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationTriggeredBy> getTriggeredBy() {
		if (triggeredBy == null) {
			triggeredBy = new EObjectContainmentEList<ObservationTriggeredBy>(ObservationTriggeredBy.class, this, FHIRPackage.OBSERVATION__TRIGGERED_BY);
		}
		return triggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.OBSERVATION__PART_OF);
		}
		return partOf;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.OBSERVATION__CATEGORY);
		}
		return category;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getFocus() {
		if (focus == null) {
			focus = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.OBSERVATION__FOCUS);
		}
		return focus;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDateTime(DateTime newEffectiveDateTime, NotificationChain msgs) {
		DateTime oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
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
	public void setEffectiveDateTime(DateTime newEffectiveDateTime) {
		if (newEffectiveDateTime != effectiveDateTime) {
			NotificationChain msgs = null;
			if (effectiveDateTime != null)
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getEffectiveTiming() {
		return effectiveTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveTiming(Timing newEffectiveTiming, NotificationChain msgs) {
		Timing oldEffectiveTiming = effectiveTiming;
		effectiveTiming = newEffectiveTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__EFFECTIVE_TIMING, oldEffectiveTiming, newEffectiveTiming);
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
	public void setEffectiveTiming(Timing newEffectiveTiming) {
		if (newEffectiveTiming != effectiveTiming) {
			NotificationChain msgs = null;
			if (effectiveTiming != null)
				msgs = ((InternalEObject)effectiveTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__EFFECTIVE_TIMING, null, msgs);
			if (newEffectiveTiming != null)
				msgs = ((InternalEObject)newEffectiveTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__EFFECTIVE_TIMING, null, msgs);
			msgs = basicSetEffectiveTiming(newEffectiveTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__EFFECTIVE_TIMING, newEffectiveTiming, newEffectiveTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getEffectiveInstant() {
		return effectiveInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveInstant(Instant newEffectiveInstant, NotificationChain msgs) {
		Instant oldEffectiveInstant = effectiveInstant;
		effectiveInstant = newEffectiveInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT, oldEffectiveInstant, newEffectiveInstant);
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
	public void setEffectiveInstant(Instant newEffectiveInstant) {
		if (newEffectiveInstant != effectiveInstant) {
			NotificationChain msgs = null;
			if (effectiveInstant != null)
				msgs = ((InternalEObject)effectiveInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT, null, msgs);
			if (newEffectiveInstant != null)
				msgs = ((InternalEObject)newEffectiveInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT, null, msgs);
			msgs = basicSetEffectiveInstant(newEffectiveInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT, newEffectiveInstant, newEffectiveInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(Instant newIssued, NotificationChain msgs) {
		Instant oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__ISSUED, oldIssued, newIssued);
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
	public void setIssued(Instant newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.OBSERVATION__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getValueQuantity() {
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueQuantity(Quantity newValueQuantity, NotificationChain msgs) {
		Quantity oldValueQuantity = valueQuantity;
		valueQuantity = newValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
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
	public void setValueQuantity(Quantity newValueQuantity) {
		if (newValueQuantity != valueQuantity) {
			NotificationChain msgs = null;
			if (valueQuantity != null)
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getValueCodeableConcept() {
		return valueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCodeableConcept(CodeableConcept newValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldValueCodeableConcept = valueCodeableConcept;
		valueCodeableConcept = newValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
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
	public void setValueCodeableConcept(CodeableConcept newValueCodeableConcept) {
		if (newValueCodeableConcept != valueCodeableConcept) {
			NotificationChain msgs = null;
			if (valueCodeableConcept != null)
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueString(org.hl7.fhir.String newValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_STRING, oldValueString, newValueString);
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
	public void setValueString(org.hl7.fhir.String newValueString) {
		if (newValueString != valueString) {
			NotificationChain msgs = null;
			if (valueString != null)
				msgs = ((InternalEObject)valueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_STRING, null, msgs);
			if (newValueString != null)
				msgs = ((InternalEObject)newValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_STRING, null, msgs);
			msgs = basicSetValueString(newValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_STRING, newValueString, newValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBoolean(org.hl7.fhir.Boolean newValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
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
	public void setValueBoolean(org.hl7.fhir.Boolean newValueBoolean) {
		if (newValueBoolean != valueBoolean) {
			NotificationChain msgs = null;
			if (valueBoolean != null)
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getValueInteger() {
		return valueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInteger(org.hl7.fhir.Integer newValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldValueInteger = valueInteger;
		valueInteger = newValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_INTEGER, oldValueInteger, newValueInteger);
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
	public void setValueInteger(org.hl7.fhir.Integer newValueInteger) {
		if (newValueInteger != valueInteger) {
			NotificationChain msgs = null;
			if (valueInteger != null)
				msgs = ((InternalEObject)valueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_INTEGER, null, msgs);
			if (newValueInteger != null)
				msgs = ((InternalEObject)newValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_INTEGER, null, msgs);
			msgs = basicSetValueInteger(newValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_INTEGER, newValueInteger, newValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getValueRange() {
		return valueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRange(Range newValueRange, NotificationChain msgs) {
		Range oldValueRange = valueRange;
		valueRange = newValueRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_RANGE, oldValueRange, newValueRange);
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
	public void setValueRange(Range newValueRange) {
		if (newValueRange != valueRange) {
			NotificationChain msgs = null;
			if (valueRange != null)
				msgs = ((InternalEObject)valueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_RANGE, null, msgs);
			if (newValueRange != null)
				msgs = ((InternalEObject)newValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_RANGE, null, msgs);
			msgs = basicSetValueRange(newValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_RANGE, newValueRange, newValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getValueRatio() {
		return valueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRatio(Ratio newValueRatio, NotificationChain msgs) {
		Ratio oldValueRatio = valueRatio;
		valueRatio = newValueRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_RATIO, oldValueRatio, newValueRatio);
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
	public void setValueRatio(Ratio newValueRatio) {
		if (newValueRatio != valueRatio) {
			NotificationChain msgs = null;
			if (valueRatio != null)
				msgs = ((InternalEObject)valueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_RATIO, null, msgs);
			if (newValueRatio != null)
				msgs = ((InternalEObject)newValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_RATIO, null, msgs);
			msgs = basicSetValueRatio(newValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_RATIO, newValueRatio, newValueRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampledData getValueSampledData() {
		return valueSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSampledData(SampledData newValueSampledData, NotificationChain msgs) {
		SampledData oldValueSampledData = valueSampledData;
		valueSampledData = newValueSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA, oldValueSampledData, newValueSampledData);
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
	public void setValueSampledData(SampledData newValueSampledData) {
		if (newValueSampledData != valueSampledData) {
			NotificationChain msgs = null;
			if (valueSampledData != null)
				msgs = ((InternalEObject)valueSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA, null, msgs);
			if (newValueSampledData != null)
				msgs = ((InternalEObject)newValueSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA, null, msgs);
			msgs = basicSetValueSampledData(newValueSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA, newValueSampledData, newValueSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getValueTime() {
		return valueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueTime(Time newValueTime, NotificationChain msgs) {
		Time oldValueTime = valueTime;
		valueTime = newValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_TIME, oldValueTime, newValueTime);
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
	public void setValueTime(Time newValueTime) {
		if (newValueTime != valueTime) {
			NotificationChain msgs = null;
			if (valueTime != null)
				msgs = ((InternalEObject)valueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_TIME, null, msgs);
			if (newValueTime != null)
				msgs = ((InternalEObject)newValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_TIME, null, msgs);
			msgs = basicSetValueTime(newValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_TIME, newValueTime, newValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDateTime(DateTime newValueDateTime, NotificationChain msgs) {
		DateTime oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_DATE_TIME, oldValueDateTime, newValueDateTime);
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
	public void setValueDateTime(DateTime newValueDateTime) {
		if (newValueDateTime != valueDateTime) {
			NotificationChain msgs = null;
			if (valueDateTime != null)
				msgs = ((InternalEObject)valueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_DATE_TIME, null, msgs);
			if (newValueDateTime != null)
				msgs = ((InternalEObject)newValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_DATE_TIME, null, msgs);
			msgs = basicSetValueDateTime(newValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_DATE_TIME, newValueDateTime, newValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getValuePeriod() {
		return valuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePeriod(Period newValuePeriod, NotificationChain msgs) {
		Period oldValuePeriod = valuePeriod;
		valuePeriod = newValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_PERIOD, oldValuePeriod, newValuePeriod);
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
	public void setValuePeriod(Period newValuePeriod) {
		if (newValuePeriod != valuePeriod) {
			NotificationChain msgs = null;
			if (valuePeriod != null)
				msgs = ((InternalEObject)valuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_PERIOD, null, msgs);
			if (newValuePeriod != null)
				msgs = ((InternalEObject)newValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_PERIOD, null, msgs);
			msgs = basicSetValuePeriod(newValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_PERIOD, newValuePeriod, newValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getValueAttachment() {
		return valueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAttachment(Attachment newValueAttachment, NotificationChain msgs) {
		Attachment oldValueAttachment = valueAttachment;
		valueAttachment = newValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_ATTACHMENT, oldValueAttachment, newValueAttachment);
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
	public void setValueAttachment(Attachment newValueAttachment) {
		if (newValueAttachment != valueAttachment) {
			NotificationChain msgs = null;
			if (valueAttachment != null)
				msgs = ((InternalEObject)valueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_ATTACHMENT, null, msgs);
			if (newValueAttachment != null)
				msgs = ((InternalEObject)newValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetValueAttachment(newValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_ATTACHMENT, newValueAttachment, newValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getValueReference() {
		return valueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueReference(Reference newValueReference, NotificationChain msgs) {
		Reference oldValueReference = valueReference;
		valueReference = newValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_REFERENCE, oldValueReference, newValueReference);
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
	public void setValueReference(Reference newValueReference) {
		if (newValueReference != valueReference) {
			NotificationChain msgs = null;
			if (valueReference != null)
				msgs = ((InternalEObject)valueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_REFERENCE, null, msgs);
			if (newValueReference != null)
				msgs = ((InternalEObject)newValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__VALUE_REFERENCE, null, msgs);
			msgs = basicSetValueReference(newValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__VALUE_REFERENCE, newValueReference, newValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDataAbsentReason() {
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAbsentReason(CodeableConcept newDataAbsentReason, NotificationChain msgs) {
		CodeableConcept oldDataAbsentReason = dataAbsentReason;
		dataAbsentReason = newDataAbsentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__DATA_ABSENT_REASON, oldDataAbsentReason, newDataAbsentReason);
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
	public void setDataAbsentReason(CodeableConcept newDataAbsentReason) {
		if (newDataAbsentReason != dataAbsentReason) {
			NotificationChain msgs = null;
			if (dataAbsentReason != null)
				msgs = ((InternalEObject)dataAbsentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__DATA_ABSENT_REASON, null, msgs);
			if (newDataAbsentReason != null)
				msgs = ((InternalEObject)newDataAbsentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__DATA_ABSENT_REASON, null, msgs);
			msgs = basicSetDataAbsentReason(newDataAbsentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__DATA_ABSENT_REASON, newDataAbsentReason, newDataAbsentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getInterpretation() {
		if (interpretation == null) {
			interpretation = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.OBSERVATION__INTERPRETATION);
		}
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.OBSERVATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__BODY_SITE, oldBodySite, newBodySite);
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
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getBodyStructure() {
		return bodyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyStructure(Reference newBodyStructure, NotificationChain msgs) {
		Reference oldBodyStructure = bodyStructure;
		bodyStructure = newBodyStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__BODY_STRUCTURE, oldBodyStructure, newBodyStructure);
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
	public void setBodyStructure(Reference newBodyStructure) {
		if (newBodyStructure != bodyStructure) {
			NotificationChain msgs = null;
			if (bodyStructure != null)
				msgs = ((InternalEObject)bodyStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__BODY_STRUCTURE, null, msgs);
			if (newBodyStructure != null)
				msgs = ((InternalEObject)newBodyStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__BODY_STRUCTURE, null, msgs);
			msgs = basicSetBodyStructure(newBodyStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__BODY_STRUCTURE, newBodyStructure, newBodyStructure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Reference newSpecimen, NotificationChain msgs) {
		Reference oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__SPECIMEN, oldSpecimen, newSpecimen);
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
	public void setSpecimen(Reference newSpecimen) {
		if (newSpecimen != specimen) {
			NotificationChain msgs = null;
			if (specimen != null)
				msgs = ((InternalEObject)specimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__SPECIMEN, null, msgs);
			if (newSpecimen != null)
				msgs = ((InternalEObject)newSpecimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__SPECIMEN, null, msgs);
			msgs = basicSetSpecimen(newSpecimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__SPECIMEN, newSpecimen, newSpecimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__DEVICE, oldDevice, newDevice);
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
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationReferenceRange> getReferenceRange() {
		if (referenceRange == null) {
			referenceRange = new EObjectContainmentEList<ObservationReferenceRange>(ObservationReferenceRange.class, this, FHIRPackage.OBSERVATION__REFERENCE_RANGE);
		}
		return referenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getHasMember() {
		if (hasMember == null) {
			hasMember = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.OBSERVATION__HAS_MEMBER);
		}
		return hasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.OBSERVATION__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ObservationComponent>(ObservationComponent.class, this, FHIRPackage.OBSERVATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.OBSERVATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL:
				return basicSetInstantiatesCanonical(null, msgs);
			case FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE:
				return basicSetInstantiatesReference(null, msgs);
			case FHIRPackage.OBSERVATION__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__TRIGGERED_BY:
				return ((InternalEList<?>)getTriggeredBy()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.OBSERVATION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.OBSERVATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.OBSERVATION__FOCUS:
				return ((InternalEList<?>)getFocus()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FHIRPackage.OBSERVATION__EFFECTIVE_TIMING:
				return basicSetEffectiveTiming(null, msgs);
			case FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT:
				return basicSetEffectiveInstant(null, msgs);
			case FHIRPackage.OBSERVATION__ISSUED:
				return basicSetIssued(null, msgs);
			case FHIRPackage.OBSERVATION__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_STRING:
				return basicSetValueString(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_INTEGER:
				return basicSetValueInteger(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_RANGE:
				return basicSetValueRange(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_RATIO:
				return basicSetValueRatio(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				return basicSetValueSampledData(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_TIME:
				return basicSetValueTime(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_DATE_TIME:
				return basicSetValueDateTime(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_PERIOD:
				return basicSetValuePeriod(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_ATTACHMENT:
				return basicSetValueAttachment(null, msgs);
			case FHIRPackage.OBSERVATION__VALUE_REFERENCE:
				return basicSetValueReference(null, msgs);
			case FHIRPackage.OBSERVATION__DATA_ABSENT_REASON:
				return basicSetDataAbsentReason(null, msgs);
			case FHIRPackage.OBSERVATION__INTERPRETATION:
				return ((InternalEList<?>)getInterpretation()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FHIRPackage.OBSERVATION__BODY_STRUCTURE:
				return basicSetBodyStructure(null, msgs);
			case FHIRPackage.OBSERVATION__METHOD:
				return basicSetMethod(null, msgs);
			case FHIRPackage.OBSERVATION__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case FHIRPackage.OBSERVATION__DEVICE:
				return basicSetDevice(null, msgs);
			case FHIRPackage.OBSERVATION__REFERENCE_RANGE:
				return ((InternalEList<?>)getReferenceRange()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__HAS_MEMBER:
				return ((InternalEList<?>)getHasMember()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.OBSERVATION__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE:
				return getInstantiatesReference();
			case FHIRPackage.OBSERVATION__BASED_ON:
				return getBasedOn();
			case FHIRPackage.OBSERVATION__TRIGGERED_BY:
				return getTriggeredBy();
			case FHIRPackage.OBSERVATION__PART_OF:
				return getPartOf();
			case FHIRPackage.OBSERVATION__STATUS:
				return getStatus();
			case FHIRPackage.OBSERVATION__CATEGORY:
				return getCategory();
			case FHIRPackage.OBSERVATION__CODE:
				return getCode();
			case FHIRPackage.OBSERVATION__SUBJECT:
				return getSubject();
			case FHIRPackage.OBSERVATION__FOCUS:
				return getFocus();
			case FHIRPackage.OBSERVATION__ENCOUNTER:
				return getEncounter();
			case FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FHIRPackage.OBSERVATION__EFFECTIVE_TIMING:
				return getEffectiveTiming();
			case FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT:
				return getEffectiveInstant();
			case FHIRPackage.OBSERVATION__ISSUED:
				return getIssued();
			case FHIRPackage.OBSERVATION__PERFORMER:
				return getPerformer();
			case FHIRPackage.OBSERVATION__VALUE_QUANTITY:
				return getValueQuantity();
			case FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
			case FHIRPackage.OBSERVATION__VALUE_STRING:
				return getValueString();
			case FHIRPackage.OBSERVATION__VALUE_BOOLEAN:
				return getValueBoolean();
			case FHIRPackage.OBSERVATION__VALUE_INTEGER:
				return getValueInteger();
			case FHIRPackage.OBSERVATION__VALUE_RANGE:
				return getValueRange();
			case FHIRPackage.OBSERVATION__VALUE_RATIO:
				return getValueRatio();
			case FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				return getValueSampledData();
			case FHIRPackage.OBSERVATION__VALUE_TIME:
				return getValueTime();
			case FHIRPackage.OBSERVATION__VALUE_DATE_TIME:
				return getValueDateTime();
			case FHIRPackage.OBSERVATION__VALUE_PERIOD:
				return getValuePeriod();
			case FHIRPackage.OBSERVATION__VALUE_ATTACHMENT:
				return getValueAttachment();
			case FHIRPackage.OBSERVATION__VALUE_REFERENCE:
				return getValueReference();
			case FHIRPackage.OBSERVATION__DATA_ABSENT_REASON:
				return getDataAbsentReason();
			case FHIRPackage.OBSERVATION__INTERPRETATION:
				return getInterpretation();
			case FHIRPackage.OBSERVATION__NOTE:
				return getNote();
			case FHIRPackage.OBSERVATION__BODY_SITE:
				return getBodySite();
			case FHIRPackage.OBSERVATION__BODY_STRUCTURE:
				return getBodyStructure();
			case FHIRPackage.OBSERVATION__METHOD:
				return getMethod();
			case FHIRPackage.OBSERVATION__SPECIMEN:
				return getSpecimen();
			case FHIRPackage.OBSERVATION__DEVICE:
				return getDevice();
			case FHIRPackage.OBSERVATION__REFERENCE_RANGE:
				return getReferenceRange();
			case FHIRPackage.OBSERVATION__HAS_MEMBER:
				return getHasMember();
			case FHIRPackage.OBSERVATION__DERIVED_FROM:
				return getDerivedFrom();
			case FHIRPackage.OBSERVATION__COMPONENT:
				return getComponent();
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
			case FHIRPackage.OBSERVATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Canonical)newValue);
				return;
			case FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE:
				setInstantiatesReference((Reference)newValue);
				return;
			case FHIRPackage.OBSERVATION__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.OBSERVATION__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends ObservationTriggeredBy>)newValue);
				return;
			case FHIRPackage.OBSERVATION__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.OBSERVATION__STATUS:
				setStatus((ObservationStatus)newValue);
				return;
			case FHIRPackage.OBSERVATION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.OBSERVATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.OBSERVATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.OBSERVATION__FOCUS:
				getFocus().clear();
				getFocus().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.OBSERVATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FHIRPackage.OBSERVATION__EFFECTIVE_TIMING:
				setEffectiveTiming((Timing)newValue);
				return;
			case FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT:
				setEffectiveInstant((Instant)newValue);
				return;
			case FHIRPackage.OBSERVATION__ISSUED:
				setIssued((Instant)newValue);
				return;
			case FHIRPackage.OBSERVATION__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_STRING:
				setValueString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_RANGE:
				setValueRange((Range)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_RATIO:
				setValueRatio((Ratio)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				setValueSampledData((SampledData)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_TIME:
				setValueTime((Time)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_DATE_TIME:
				setValueDateTime((DateTime)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_PERIOD:
				setValuePeriod((Period)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)newValue);
				return;
			case FHIRPackage.OBSERVATION__VALUE_REFERENCE:
				setValueReference((Reference)newValue);
				return;
			case FHIRPackage.OBSERVATION__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)newValue);
				return;
			case FHIRPackage.OBSERVATION__INTERPRETATION:
				getInterpretation().clear();
				getInterpretation().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.OBSERVATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FHIRPackage.OBSERVATION__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case FHIRPackage.OBSERVATION__BODY_STRUCTURE:
				setBodyStructure((Reference)newValue);
				return;
			case FHIRPackage.OBSERVATION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FHIRPackage.OBSERVATION__SPECIMEN:
				setSpecimen((Reference)newValue);
				return;
			case FHIRPackage.OBSERVATION__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FHIRPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRange().clear();
				getReferenceRange().addAll((Collection<? extends ObservationReferenceRange>)newValue);
				return;
			case FHIRPackage.OBSERVATION__HAS_MEMBER:
				getHasMember().clear();
				getHasMember().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.OBSERVATION__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.OBSERVATION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ObservationComponent>)newValue);
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
			case FHIRPackage.OBSERVATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Canonical)null);
				return;
			case FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE:
				setInstantiatesReference((Reference)null);
				return;
			case FHIRPackage.OBSERVATION__BASED_ON:
				getBasedOn().clear();
				return;
			case FHIRPackage.OBSERVATION__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case FHIRPackage.OBSERVATION__PART_OF:
				getPartOf().clear();
				return;
			case FHIRPackage.OBSERVATION__STATUS:
				setStatus((ObservationStatus)null);
				return;
			case FHIRPackage.OBSERVATION__CATEGORY:
				getCategory().clear();
				return;
			case FHIRPackage.OBSERVATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.OBSERVATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.OBSERVATION__FOCUS:
				getFocus().clear();
				return;
			case FHIRPackage.OBSERVATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FHIRPackage.OBSERVATION__EFFECTIVE_TIMING:
				setEffectiveTiming((Timing)null);
				return;
			case FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT:
				setEffectiveInstant((Instant)null);
				return;
			case FHIRPackage.OBSERVATION__ISSUED:
				setIssued((Instant)null);
				return;
			case FHIRPackage.OBSERVATION__PERFORMER:
				getPerformer().clear();
				return;
			case FHIRPackage.OBSERVATION__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_STRING:
				setValueString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_RANGE:
				setValueRange((Range)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_RATIO:
				setValueRatio((Ratio)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				setValueSampledData((SampledData)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_TIME:
				setValueTime((Time)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_DATE_TIME:
				setValueDateTime((DateTime)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_PERIOD:
				setValuePeriod((Period)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)null);
				return;
			case FHIRPackage.OBSERVATION__VALUE_REFERENCE:
				setValueReference((Reference)null);
				return;
			case FHIRPackage.OBSERVATION__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)null);
				return;
			case FHIRPackage.OBSERVATION__INTERPRETATION:
				getInterpretation().clear();
				return;
			case FHIRPackage.OBSERVATION__NOTE:
				getNote().clear();
				return;
			case FHIRPackage.OBSERVATION__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case FHIRPackage.OBSERVATION__BODY_STRUCTURE:
				setBodyStructure((Reference)null);
				return;
			case FHIRPackage.OBSERVATION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FHIRPackage.OBSERVATION__SPECIMEN:
				setSpecimen((Reference)null);
				return;
			case FHIRPackage.OBSERVATION__DEVICE:
				setDevice((Reference)null);
				return;
			case FHIRPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRange().clear();
				return;
			case FHIRPackage.OBSERVATION__HAS_MEMBER:
				getHasMember().clear();
				return;
			case FHIRPackage.OBSERVATION__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case FHIRPackage.OBSERVATION__COMPONENT:
				getComponent().clear();
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
			case FHIRPackage.OBSERVATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.OBSERVATION__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null;
			case FHIRPackage.OBSERVATION__INSTANTIATES_REFERENCE:
				return instantiatesReference != null;
			case FHIRPackage.OBSERVATION__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FHIRPackage.OBSERVATION__TRIGGERED_BY:
				return triggeredBy != null && !triggeredBy.isEmpty();
			case FHIRPackage.OBSERVATION__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FHIRPackage.OBSERVATION__STATUS:
				return status != null;
			case FHIRPackage.OBSERVATION__CATEGORY:
				return category != null && !category.isEmpty();
			case FHIRPackage.OBSERVATION__CODE:
				return code != null;
			case FHIRPackage.OBSERVATION__SUBJECT:
				return subject != null;
			case FHIRPackage.OBSERVATION__FOCUS:
				return focus != null && !focus.isEmpty();
			case FHIRPackage.OBSERVATION__ENCOUNTER:
				return encounter != null;
			case FHIRPackage.OBSERVATION__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FHIRPackage.OBSERVATION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FHIRPackage.OBSERVATION__EFFECTIVE_TIMING:
				return effectiveTiming != null;
			case FHIRPackage.OBSERVATION__EFFECTIVE_INSTANT:
				return effectiveInstant != null;
			case FHIRPackage.OBSERVATION__ISSUED:
				return issued != null;
			case FHIRPackage.OBSERVATION__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FHIRPackage.OBSERVATION__VALUE_QUANTITY:
				return valueQuantity != null;
			case FHIRPackage.OBSERVATION__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
			case FHIRPackage.OBSERVATION__VALUE_STRING:
				return valueString != null;
			case FHIRPackage.OBSERVATION__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FHIRPackage.OBSERVATION__VALUE_INTEGER:
				return valueInteger != null;
			case FHIRPackage.OBSERVATION__VALUE_RANGE:
				return valueRange != null;
			case FHIRPackage.OBSERVATION__VALUE_RATIO:
				return valueRatio != null;
			case FHIRPackage.OBSERVATION__VALUE_SAMPLED_DATA:
				return valueSampledData != null;
			case FHIRPackage.OBSERVATION__VALUE_TIME:
				return valueTime != null;
			case FHIRPackage.OBSERVATION__VALUE_DATE_TIME:
				return valueDateTime != null;
			case FHIRPackage.OBSERVATION__VALUE_PERIOD:
				return valuePeriod != null;
			case FHIRPackage.OBSERVATION__VALUE_ATTACHMENT:
				return valueAttachment != null;
			case FHIRPackage.OBSERVATION__VALUE_REFERENCE:
				return valueReference != null;
			case FHIRPackage.OBSERVATION__DATA_ABSENT_REASON:
				return dataAbsentReason != null;
			case FHIRPackage.OBSERVATION__INTERPRETATION:
				return interpretation != null && !interpretation.isEmpty();
			case FHIRPackage.OBSERVATION__NOTE:
				return note != null && !note.isEmpty();
			case FHIRPackage.OBSERVATION__BODY_SITE:
				return bodySite != null;
			case FHIRPackage.OBSERVATION__BODY_STRUCTURE:
				return bodyStructure != null;
			case FHIRPackage.OBSERVATION__METHOD:
				return method != null;
			case FHIRPackage.OBSERVATION__SPECIMEN:
				return specimen != null;
			case FHIRPackage.OBSERVATION__DEVICE:
				return device != null;
			case FHIRPackage.OBSERVATION__REFERENCE_RANGE:
				return referenceRange != null && !referenceRange.isEmpty();
			case FHIRPackage.OBSERVATION__HAS_MEMBER:
				return hasMember != null && !hasMember.isEmpty();
			case FHIRPackage.OBSERVATION__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case FHIRPackage.OBSERVATION__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationImpl
