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
import org.hl7.fhir.Dosage;
import org.hl7.fhir.DosageDoseAndRate;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dosage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getAdditionalInstruction <em>Additional Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getAsNeeded <em>As Needed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getAsNeededFor <em>As Needed For</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getDoseAndRate <em>Dose And Rate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageImpl#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DosageImpl extends BackboneTypeImpl implements Dosage {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer sequence;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getAdditionalInstruction() <em>Additional Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalInstruction;

	/**
	 * The cached value of the '{@link #getPatientInstruction() <em>Patient Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String patientInstruction;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timing;

	/**
	 * The cached value of the '{@link #getAsNeeded() <em>As Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeeded()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean asNeeded;

	/**
	 * The cached value of the '{@link #getAsNeededFor() <em>As Needed For</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededFor()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> asNeededFor;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

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
	 * The cached value of the '{@link #getDoseAndRate() <em>Dose And Rate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseAndRate()
	 * @generated
	 * @ordered
	 */
	protected EList<DosageDoseAndRate> doseAndRate;

	/**
	 * The cached value of the '{@link #getMaxDosePerPeriod() <em>Max Dose Per Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<Ratio> maxDosePerPeriod;

	/**
	 * The cached value of the '{@link #getMaxDosePerAdministration() <em>Max Dose Per Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerAdministration()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxDosePerAdministration;

	/**
	 * The cached value of the '{@link #getMaxDosePerLifetime() <em>Max Dose Per Lifetime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerLifetime()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxDosePerLifetime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DosageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getDosage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(org.hl7.fhir.Integer newSequence, NotificationChain msgs) {
		org.hl7.fhir.Integer oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(org.hl7.fhir.Integer newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__TEXT, oldText, newText);
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
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAdditionalInstruction() {
		if (additionalInstruction == null) {
			additionalInstruction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.DOSAGE__ADDITIONAL_INSTRUCTION);
		}
		return additionalInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPatientInstruction() {
		return patientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientInstruction(org.hl7.fhir.String newPatientInstruction, NotificationChain msgs) {
		org.hl7.fhir.String oldPatientInstruction = patientInstruction;
		patientInstruction = newPatientInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__PATIENT_INSTRUCTION, oldPatientInstruction, newPatientInstruction);
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
	public void setPatientInstruction(org.hl7.fhir.String newPatientInstruction) {
		if (newPatientInstruction != patientInstruction) {
			NotificationChain msgs = null;
			if (patientInstruction != null)
				msgs = ((InternalEObject)patientInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__PATIENT_INSTRUCTION, null, msgs);
			if (newPatientInstruction != null)
				msgs = ((InternalEObject)newPatientInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__PATIENT_INSTRUCTION, null, msgs);
			msgs = basicSetPatientInstruction(newPatientInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__PATIENT_INSTRUCTION, newPatientInstruction, newPatientInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getTiming() {
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiming(Timing newTiming, NotificationChain msgs) {
		Timing oldTiming = timing;
		timing = newTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__TIMING, oldTiming, newTiming);
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
	public void setTiming(Timing newTiming) {
		if (newTiming != timing) {
			NotificationChain msgs = null;
			if (timing != null)
				msgs = ((InternalEObject)timing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__TIMING, null, msgs);
			if (newTiming != null)
				msgs = ((InternalEObject)newTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__TIMING, null, msgs);
			msgs = basicSetTiming(newTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__TIMING, newTiming, newTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAsNeeded() {
		return asNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeeded(org.hl7.fhir.Boolean newAsNeeded, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAsNeeded = asNeeded;
		asNeeded = newAsNeeded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__AS_NEEDED, oldAsNeeded, newAsNeeded);
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
	public void setAsNeeded(org.hl7.fhir.Boolean newAsNeeded) {
		if (newAsNeeded != asNeeded) {
			NotificationChain msgs = null;
			if (asNeeded != null)
				msgs = ((InternalEObject)asNeeded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__AS_NEEDED, null, msgs);
			if (newAsNeeded != null)
				msgs = ((InternalEObject)newAsNeeded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__AS_NEEDED, null, msgs);
			msgs = basicSetAsNeeded(newAsNeeded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__AS_NEEDED, newAsNeeded, newAsNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAsNeededFor() {
		if (asNeededFor == null) {
			asNeededFor = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.DOSAGE__AS_NEEDED_FOR);
		}
		return asNeededFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(CodeableConcept newSite, NotificationChain msgs) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__SITE, oldSite, newSite);
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
	public void setSite(CodeableConcept newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__ROUTE, oldRoute, newRoute);
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
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__ROUTE, newRoute, newRoute));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DosageDoseAndRate> getDoseAndRate() {
		if (doseAndRate == null) {
			doseAndRate = new EObjectContainmentEList<DosageDoseAndRate>(DosageDoseAndRate.class, this, FHIRPackage.DOSAGE__DOSE_AND_RATE);
		}
		return doseAndRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ratio> getMaxDosePerPeriod() {
		if (maxDosePerPeriod == null) {
			maxDosePerPeriod = new EObjectContainmentEList<Ratio>(Ratio.class, this, FHIRPackage.DOSAGE__MAX_DOSE_PER_PERIOD);
		}
		return maxDosePerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMaxDosePerAdministration() {
		return maxDosePerAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerAdministration(Quantity newMaxDosePerAdministration, NotificationChain msgs) {
		Quantity oldMaxDosePerAdministration = maxDosePerAdministration;
		maxDosePerAdministration = newMaxDosePerAdministration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION, oldMaxDosePerAdministration, newMaxDosePerAdministration);
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
	public void setMaxDosePerAdministration(Quantity newMaxDosePerAdministration) {
		if (newMaxDosePerAdministration != maxDosePerAdministration) {
			NotificationChain msgs = null;
			if (maxDosePerAdministration != null)
				msgs = ((InternalEObject)maxDosePerAdministration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION, null, msgs);
			if (newMaxDosePerAdministration != null)
				msgs = ((InternalEObject)newMaxDosePerAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION, null, msgs);
			msgs = basicSetMaxDosePerAdministration(newMaxDosePerAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION, newMaxDosePerAdministration, newMaxDosePerAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMaxDosePerLifetime() {
		return maxDosePerLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerLifetime(Quantity newMaxDosePerLifetime, NotificationChain msgs) {
		Quantity oldMaxDosePerLifetime = maxDosePerLifetime;
		maxDosePerLifetime = newMaxDosePerLifetime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME, oldMaxDosePerLifetime, newMaxDosePerLifetime);
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
	public void setMaxDosePerLifetime(Quantity newMaxDosePerLifetime) {
		if (newMaxDosePerLifetime != maxDosePerLifetime) {
			NotificationChain msgs = null;
			if (maxDosePerLifetime != null)
				msgs = ((InternalEObject)maxDosePerLifetime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME, null, msgs);
			if (newMaxDosePerLifetime != null)
				msgs = ((InternalEObject)newMaxDosePerLifetime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME, null, msgs);
			msgs = basicSetMaxDosePerLifetime(newMaxDosePerLifetime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME, newMaxDosePerLifetime, newMaxDosePerLifetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.DOSAGE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FHIRPackage.DOSAGE__TEXT:
				return basicSetText(null, msgs);
			case FHIRPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				return ((InternalEList<?>)getAdditionalInstruction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DOSAGE__PATIENT_INSTRUCTION:
				return basicSetPatientInstruction(null, msgs);
			case FHIRPackage.DOSAGE__TIMING:
				return basicSetTiming(null, msgs);
			case FHIRPackage.DOSAGE__AS_NEEDED:
				return basicSetAsNeeded(null, msgs);
			case FHIRPackage.DOSAGE__AS_NEEDED_FOR:
				return ((InternalEList<?>)getAsNeededFor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DOSAGE__SITE:
				return basicSetSite(null, msgs);
			case FHIRPackage.DOSAGE__ROUTE:
				return basicSetRoute(null, msgs);
			case FHIRPackage.DOSAGE__METHOD:
				return basicSetMethod(null, msgs);
			case FHIRPackage.DOSAGE__DOSE_AND_RATE:
				return ((InternalEList<?>)getDoseAndRate()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				return ((InternalEList<?>)getMaxDosePerPeriod()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				return basicSetMaxDosePerAdministration(null, msgs);
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				return basicSetMaxDosePerLifetime(null, msgs);
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
			case FHIRPackage.DOSAGE__SEQUENCE:
				return getSequence();
			case FHIRPackage.DOSAGE__TEXT:
				return getText();
			case FHIRPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				return getAdditionalInstruction();
			case FHIRPackage.DOSAGE__PATIENT_INSTRUCTION:
				return getPatientInstruction();
			case FHIRPackage.DOSAGE__TIMING:
				return getTiming();
			case FHIRPackage.DOSAGE__AS_NEEDED:
				return getAsNeeded();
			case FHIRPackage.DOSAGE__AS_NEEDED_FOR:
				return getAsNeededFor();
			case FHIRPackage.DOSAGE__SITE:
				return getSite();
			case FHIRPackage.DOSAGE__ROUTE:
				return getRoute();
			case FHIRPackage.DOSAGE__METHOD:
				return getMethod();
			case FHIRPackage.DOSAGE__DOSE_AND_RATE:
				return getDoseAndRate();
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				return getMaxDosePerPeriod();
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				return getMaxDosePerAdministration();
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				return getMaxDosePerLifetime();
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
			case FHIRPackage.DOSAGE__SEQUENCE:
				setSequence((org.hl7.fhir.Integer)newValue);
				return;
			case FHIRPackage.DOSAGE__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				getAdditionalInstruction().clear();
				getAdditionalInstruction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.DOSAGE__PATIENT_INSTRUCTION:
				setPatientInstruction((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DOSAGE__TIMING:
				setTiming((Timing)newValue);
				return;
			case FHIRPackage.DOSAGE__AS_NEEDED:
				setAsNeeded((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.DOSAGE__AS_NEEDED_FOR:
				getAsNeededFor().clear();
				getAsNeededFor().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.DOSAGE__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case FHIRPackage.DOSAGE__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FHIRPackage.DOSAGE__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FHIRPackage.DOSAGE__DOSE_AND_RATE:
				getDoseAndRate().clear();
				getDoseAndRate().addAll((Collection<? extends DosageDoseAndRate>)newValue);
				return;
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				getMaxDosePerPeriod().clear();
				getMaxDosePerPeriod().addAll((Collection<? extends Ratio>)newValue);
				return;
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				setMaxDosePerAdministration((Quantity)newValue);
				return;
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				setMaxDosePerLifetime((Quantity)newValue);
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
			case FHIRPackage.DOSAGE__SEQUENCE:
				setSequence((org.hl7.fhir.Integer)null);
				return;
			case FHIRPackage.DOSAGE__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				getAdditionalInstruction().clear();
				return;
			case FHIRPackage.DOSAGE__PATIENT_INSTRUCTION:
				setPatientInstruction((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DOSAGE__TIMING:
				setTiming((Timing)null);
				return;
			case FHIRPackage.DOSAGE__AS_NEEDED:
				setAsNeeded((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.DOSAGE__AS_NEEDED_FOR:
				getAsNeededFor().clear();
				return;
			case FHIRPackage.DOSAGE__SITE:
				setSite((CodeableConcept)null);
				return;
			case FHIRPackage.DOSAGE__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FHIRPackage.DOSAGE__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FHIRPackage.DOSAGE__DOSE_AND_RATE:
				getDoseAndRate().clear();
				return;
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				getMaxDosePerPeriod().clear();
				return;
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				setMaxDosePerAdministration((Quantity)null);
				return;
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				setMaxDosePerLifetime((Quantity)null);
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
			case FHIRPackage.DOSAGE__SEQUENCE:
				return sequence != null;
			case FHIRPackage.DOSAGE__TEXT:
				return text != null;
			case FHIRPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				return additionalInstruction != null && !additionalInstruction.isEmpty();
			case FHIRPackage.DOSAGE__PATIENT_INSTRUCTION:
				return patientInstruction != null;
			case FHIRPackage.DOSAGE__TIMING:
				return timing != null;
			case FHIRPackage.DOSAGE__AS_NEEDED:
				return asNeeded != null;
			case FHIRPackage.DOSAGE__AS_NEEDED_FOR:
				return asNeededFor != null && !asNeededFor.isEmpty();
			case FHIRPackage.DOSAGE__SITE:
				return site != null;
			case FHIRPackage.DOSAGE__ROUTE:
				return route != null;
			case FHIRPackage.DOSAGE__METHOD:
				return method != null;
			case FHIRPackage.DOSAGE__DOSE_AND_RATE:
				return doseAndRate != null && !doseAndRate.isEmpty();
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				return maxDosePerPeriod != null && !maxDosePerPeriod.isEmpty();
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				return maxDosePerAdministration != null;
			case FHIRPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				return maxDosePerLifetime != null;
		}
		return super.eIsSet(featureID);
	}

} //DosageImpl
