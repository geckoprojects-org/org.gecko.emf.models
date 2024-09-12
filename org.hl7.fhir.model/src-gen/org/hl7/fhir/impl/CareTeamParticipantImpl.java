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

import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getCoveragePeriod <em>Coverage Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getCoverageTiming <em>Coverage Timing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CareTeamParticipantImpl extends BackboneElementImpl implements CareTeamParticipant {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected Reference member;

	/**
	 * The cached value of the '{@link #getOnBehalfOf() <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOf()
	 * @generated
	 * @ordered
	 */
	protected Reference onBehalfOf;

	/**
	 * The cached value of the '{@link #getCoveragePeriod() <em>Coverage Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveragePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period coveragePeriod;

	/**
	 * The cached value of the '{@link #getCoverageTiming() <em>Coverage Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing coverageTiming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getCareTeamParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE, oldRole, newRole);
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
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(Reference newMember, NotificationChain msgs) {
		Reference oldMember = member;
		member = newMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER, oldMember, newMember);
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
	public void setMember(Reference newMember) {
		if (newMember != member) {
			NotificationChain msgs = null;
			if (member != null)
				msgs = ((InternalEObject)member).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER, null, msgs);
			if (newMember != null)
				msgs = ((InternalEObject)newMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER, null, msgs);
			msgs = basicSetMember(newMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER, newMember, newMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOnBehalfOf() {
		return onBehalfOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOf(Reference newOnBehalfOf, NotificationChain msgs) {
		Reference oldOnBehalfOf = onBehalfOf;
		onBehalfOf = newOnBehalfOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF, oldOnBehalfOf, newOnBehalfOf);
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
	public void setOnBehalfOf(Reference newOnBehalfOf) {
		if (newOnBehalfOf != onBehalfOf) {
			NotificationChain msgs = null;
			if (onBehalfOf != null)
				msgs = ((InternalEObject)onBehalfOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF, null, msgs);
			if (newOnBehalfOf != null)
				msgs = ((InternalEObject)newOnBehalfOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF, null, msgs);
			msgs = basicSetOnBehalfOf(newOnBehalfOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF, newOnBehalfOf, newOnBehalfOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getCoveragePeriod() {
		return coveragePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoveragePeriod(Period newCoveragePeriod, NotificationChain msgs) {
		Period oldCoveragePeriod = coveragePeriod;
		coveragePeriod = newCoveragePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD, oldCoveragePeriod, newCoveragePeriod);
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
	public void setCoveragePeriod(Period newCoveragePeriod) {
		if (newCoveragePeriod != coveragePeriod) {
			NotificationChain msgs = null;
			if (coveragePeriod != null)
				msgs = ((InternalEObject)coveragePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD, null, msgs);
			if (newCoveragePeriod != null)
				msgs = ((InternalEObject)newCoveragePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD, null, msgs);
			msgs = basicSetCoveragePeriod(newCoveragePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD, newCoveragePeriod, newCoveragePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getCoverageTiming() {
		return coverageTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageTiming(Timing newCoverageTiming, NotificationChain msgs) {
		Timing oldCoverageTiming = coverageTiming;
		coverageTiming = newCoverageTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING, oldCoverageTiming, newCoverageTiming);
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
	public void setCoverageTiming(Timing newCoverageTiming) {
		if (newCoverageTiming != coverageTiming) {
			NotificationChain msgs = null;
			if (coverageTiming != null)
				msgs = ((InternalEObject)coverageTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING, null, msgs);
			if (newCoverageTiming != null)
				msgs = ((InternalEObject)newCoverageTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING, null, msgs);
			msgs = basicSetCoverageTiming(newCoverageTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING, newCoverageTiming, newCoverageTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE:
				return basicSetRole(null, msgs);
			case FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				return basicSetMember(null, msgs);
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				return basicSetOnBehalfOf(null, msgs);
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD:
				return basicSetCoveragePeriod(null, msgs);
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING:
				return basicSetCoverageTiming(null, msgs);
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
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE:
				return getRole();
			case FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				return getMember();
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				return getOnBehalfOf();
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD:
				return getCoveragePeriod();
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING:
				return getCoverageTiming();
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
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				setMember((Reference)newValue);
				return;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				setOnBehalfOf((Reference)newValue);
				return;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD:
				setCoveragePeriod((Period)newValue);
				return;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING:
				setCoverageTiming((Timing)newValue);
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
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				setMember((Reference)null);
				return;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				setOnBehalfOf((Reference)null);
				return;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD:
				setCoveragePeriod((Period)null);
				return;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING:
				setCoverageTiming((Timing)null);
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
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ROLE:
				return role != null;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				return member != null;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				return onBehalfOf != null;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_PERIOD:
				return coveragePeriod != null;
			case FHIRPackage.CARE_TEAM_PARTICIPANT__COVERAGE_TIMING:
				return coverageTiming != null;
		}
		return super.eIsSet(featureID);
	}

} //CareTeamParticipantImpl
