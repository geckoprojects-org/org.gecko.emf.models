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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getMeasureScoreQuantity <em>Measure Score Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getMeasureScoreDateTime <em>Measure Score Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getMeasureScoreCodeableConcept <em>Measure Score Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getMeasureScorePeriod <em>Measure Score Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getMeasureScoreRange <em>Measure Score Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getMeasureScoreDuration <em>Measure Score Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getStratifier <em>Stratifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportGroupImpl extends BackboneElementImpl implements MeasureReportGroup {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String linkId;

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
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportPopulation> population;

	/**
	 * The cached value of the '{@link #getMeasureScoreQuantity() <em>Measure Score Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity measureScoreQuantity;

	/**
	 * The cached value of the '{@link #getMeasureScoreDateTime() <em>Measure Score Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime measureScoreDateTime;

	/**
	 * The cached value of the '{@link #getMeasureScoreCodeableConcept() <em>Measure Score Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept measureScoreCodeableConcept;

	/**
	 * The cached value of the '{@link #getMeasureScorePeriod() <em>Measure Score Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScorePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period measureScorePeriod;

	/**
	 * The cached value of the '{@link #getMeasureScoreRange() <em>Measure Score Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreRange()
	 * @generated
	 * @ordered
	 */
	protected Range measureScoreRange;

	/**
	 * The cached value of the '{@link #getMeasureScoreDuration() <em>Measure Score Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScoreDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration measureScoreDuration;

	/**
	 * The cached value of the '{@link #getStratifier() <em>Stratifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStratifier()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportStratifier> stratifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMeasureReportGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID, oldLinkId, newLinkId);
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
	public void setLinkId(org.hl7.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID, newLinkId, newLinkId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportPopulation> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MeasureReportPopulation>(MeasureReportPopulation.class, this, FHIRPackage.MEASURE_REPORT_GROUP__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMeasureScoreQuantity() {
		return measureScoreQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreQuantity(Quantity newMeasureScoreQuantity, NotificationChain msgs) {
		Quantity oldMeasureScoreQuantity = measureScoreQuantity;
		measureScoreQuantity = newMeasureScoreQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY, oldMeasureScoreQuantity, newMeasureScoreQuantity);
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
	public void setMeasureScoreQuantity(Quantity newMeasureScoreQuantity) {
		if (newMeasureScoreQuantity != measureScoreQuantity) {
			NotificationChain msgs = null;
			if (measureScoreQuantity != null)
				msgs = ((InternalEObject)measureScoreQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY, null, msgs);
			if (newMeasureScoreQuantity != null)
				msgs = ((InternalEObject)newMeasureScoreQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY, null, msgs);
			msgs = basicSetMeasureScoreQuantity(newMeasureScoreQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY, newMeasureScoreQuantity, newMeasureScoreQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getMeasureScoreDateTime() {
		return measureScoreDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreDateTime(DateTime newMeasureScoreDateTime, NotificationChain msgs) {
		DateTime oldMeasureScoreDateTime = measureScoreDateTime;
		measureScoreDateTime = newMeasureScoreDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME, oldMeasureScoreDateTime, newMeasureScoreDateTime);
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
	public void setMeasureScoreDateTime(DateTime newMeasureScoreDateTime) {
		if (newMeasureScoreDateTime != measureScoreDateTime) {
			NotificationChain msgs = null;
			if (measureScoreDateTime != null)
				msgs = ((InternalEObject)measureScoreDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME, null, msgs);
			if (newMeasureScoreDateTime != null)
				msgs = ((InternalEObject)newMeasureScoreDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME, null, msgs);
			msgs = basicSetMeasureScoreDateTime(newMeasureScoreDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME, newMeasureScoreDateTime, newMeasureScoreDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMeasureScoreCodeableConcept() {
		return measureScoreCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreCodeableConcept(CodeableConcept newMeasureScoreCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMeasureScoreCodeableConcept = measureScoreCodeableConcept;
		measureScoreCodeableConcept = newMeasureScoreCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT, oldMeasureScoreCodeableConcept, newMeasureScoreCodeableConcept);
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
	public void setMeasureScoreCodeableConcept(CodeableConcept newMeasureScoreCodeableConcept) {
		if (newMeasureScoreCodeableConcept != measureScoreCodeableConcept) {
			NotificationChain msgs = null;
			if (measureScoreCodeableConcept != null)
				msgs = ((InternalEObject)measureScoreCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT, null, msgs);
			if (newMeasureScoreCodeableConcept != null)
				msgs = ((InternalEObject)newMeasureScoreCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMeasureScoreCodeableConcept(newMeasureScoreCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT, newMeasureScoreCodeableConcept, newMeasureScoreCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getMeasureScorePeriod() {
		return measureScorePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScorePeriod(Period newMeasureScorePeriod, NotificationChain msgs) {
		Period oldMeasureScorePeriod = measureScorePeriod;
		measureScorePeriod = newMeasureScorePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD, oldMeasureScorePeriod, newMeasureScorePeriod);
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
	public void setMeasureScorePeriod(Period newMeasureScorePeriod) {
		if (newMeasureScorePeriod != measureScorePeriod) {
			NotificationChain msgs = null;
			if (measureScorePeriod != null)
				msgs = ((InternalEObject)measureScorePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD, null, msgs);
			if (newMeasureScorePeriod != null)
				msgs = ((InternalEObject)newMeasureScorePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD, null, msgs);
			msgs = basicSetMeasureScorePeriod(newMeasureScorePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD, newMeasureScorePeriod, newMeasureScorePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getMeasureScoreRange() {
		return measureScoreRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreRange(Range newMeasureScoreRange, NotificationChain msgs) {
		Range oldMeasureScoreRange = measureScoreRange;
		measureScoreRange = newMeasureScoreRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE, oldMeasureScoreRange, newMeasureScoreRange);
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
	public void setMeasureScoreRange(Range newMeasureScoreRange) {
		if (newMeasureScoreRange != measureScoreRange) {
			NotificationChain msgs = null;
			if (measureScoreRange != null)
				msgs = ((InternalEObject)measureScoreRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE, null, msgs);
			if (newMeasureScoreRange != null)
				msgs = ((InternalEObject)newMeasureScoreRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE, null, msgs);
			msgs = basicSetMeasureScoreRange(newMeasureScoreRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE, newMeasureScoreRange, newMeasureScoreRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getMeasureScoreDuration() {
		return measureScoreDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScoreDuration(Duration newMeasureScoreDuration, NotificationChain msgs) {
		Duration oldMeasureScoreDuration = measureScoreDuration;
		measureScoreDuration = newMeasureScoreDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION, oldMeasureScoreDuration, newMeasureScoreDuration);
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
	public void setMeasureScoreDuration(Duration newMeasureScoreDuration) {
		if (newMeasureScoreDuration != measureScoreDuration) {
			NotificationChain msgs = null;
			if (measureScoreDuration != null)
				msgs = ((InternalEObject)measureScoreDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION, null, msgs);
			if (newMeasureScoreDuration != null)
				msgs = ((InternalEObject)newMeasureScoreDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION, null, msgs);
			msgs = basicSetMeasureScoreDuration(newMeasureScoreDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION, newMeasureScoreDuration, newMeasureScoreDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportStratifier> getStratifier() {
		if (stratifier == null) {
			stratifier = new EObjectContainmentEList<MeasureReportStratifier>(MeasureReportStratifier.class, this, FHIRPackage.MEASURE_REPORT_GROUP__STRATIFIER);
		}
		return stratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY:
				return basicSetMeasureScoreQuantity(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME:
				return basicSetMeasureScoreDateTime(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT:
				return basicSetMeasureScoreCodeableConcept(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD:
				return basicSetMeasureScorePeriod(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE:
				return basicSetMeasureScoreRange(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION:
				return basicSetMeasureScoreDuration(null, msgs);
			case FHIRPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return ((InternalEList<?>)getStratifier()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID:
				return getLinkId();
			case FHIRPackage.MEASURE_REPORT_GROUP__CODE:
				return getCode();
			case FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT:
				return getSubject();
			case FHIRPackage.MEASURE_REPORT_GROUP__POPULATION:
				return getPopulation();
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY:
				return getMeasureScoreQuantity();
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME:
				return getMeasureScoreDateTime();
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT:
				return getMeasureScoreCodeableConcept();
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD:
				return getMeasureScorePeriod();
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE:
				return getMeasureScoreRange();
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION:
				return getMeasureScoreDuration();
			case FHIRPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return getStratifier();
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
			case FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MeasureReportPopulation>)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY:
				setMeasureScoreQuantity((Quantity)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME:
				setMeasureScoreDateTime((DateTime)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT:
				setMeasureScoreCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD:
				setMeasureScorePeriod((Period)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE:
				setMeasureScoreRange((Range)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION:
				setMeasureScoreDuration((Duration)newValue);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				getStratifier().clear();
				getStratifier().addAll((Collection<? extends MeasureReportStratifier>)newValue);
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
			case FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__POPULATION:
				getPopulation().clear();
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY:
				setMeasureScoreQuantity((Quantity)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME:
				setMeasureScoreDateTime((DateTime)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT:
				setMeasureScoreCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD:
				setMeasureScorePeriod((Period)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE:
				setMeasureScoreRange((Range)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION:
				setMeasureScoreDuration((Duration)null);
				return;
			case FHIRPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				getStratifier().clear();
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
			case FHIRPackage.MEASURE_REPORT_GROUP__LINK_ID:
				return linkId != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__CODE:
				return code != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__SUBJECT:
				return subject != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__POPULATION:
				return population != null && !population.isEmpty();
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_QUANTITY:
				return measureScoreQuantity != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DATE_TIME:
				return measureScoreDateTime != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_CODEABLE_CONCEPT:
				return measureScoreCodeableConcept != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_PERIOD:
				return measureScorePeriod != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_RANGE:
				return measureScoreRange != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE_DURATION:
				return measureScoreDuration != null;
			case FHIRPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return stratifier != null && !stratifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupImpl
