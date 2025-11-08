/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.AffirmationType;
import org.cyclonedx.schema.bom.AssessorsType;
import org.cyclonedx.schema.bom.AttestationsType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ClaimsType;
import org.cyclonedx.schema.bom.DeclarationsType;
import org.cyclonedx.schema.bom.EvidenceType1;
import org.cyclonedx.schema.bom.TargetsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl#getAssessors <em>Assessors</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl#getAttestations <em>Attestations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl#getClaims <em>Claims</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl#getAffirmation <em>Affirmation</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationsTypeImpl extends MinimalEObjectImpl.Container implements DeclarationsType {
	/**
	 * The cached value of the '{@link #getAssessors() <em>Assessors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessors()
	 * @generated
	 * @ordered
	 */
	protected AssessorsType assessors;

	/**
	 * The cached value of the '{@link #getAttestations() <em>Attestations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttestations()
	 * @generated
	 * @ordered
	 */
	protected AttestationsType attestations;

	/**
	 * The cached value of the '{@link #getClaims() <em>Claims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaims()
	 * @generated
	 * @ordered
	 */
	protected ClaimsType claims;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EvidenceType1 evidence;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected TargetsType targets;

	/**
	 * The cached value of the '{@link #getAffirmation() <em>Affirmation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffirmation()
	 * @generated
	 * @ordered
	 */
	protected AffirmationType affirmation;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getDeclarationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessorsType getAssessors() {
		return assessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessors(AssessorsType newAssessors, NotificationChain msgs) {
		AssessorsType oldAssessors = assessors;
		assessors = newAssessors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__ASSESSORS, oldAssessors, newAssessors);
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
	public void setAssessors(AssessorsType newAssessors) {
		if (newAssessors != assessors) {
			NotificationChain msgs = null;
			if (assessors != null)
				msgs = ((InternalEObject)assessors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__ASSESSORS, null, msgs);
			if (newAssessors != null)
				msgs = ((InternalEObject)newAssessors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__ASSESSORS, null, msgs);
			msgs = basicSetAssessors(newAssessors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__ASSESSORS, newAssessors, newAssessors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttestationsType getAttestations() {
		return attestations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttestations(AttestationsType newAttestations, NotificationChain msgs) {
		AttestationsType oldAttestations = attestations;
		attestations = newAttestations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS, oldAttestations, newAttestations);
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
	public void setAttestations(AttestationsType newAttestations) {
		if (newAttestations != attestations) {
			NotificationChain msgs = null;
			if (attestations != null)
				msgs = ((InternalEObject)attestations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS, null, msgs);
			if (newAttestations != null)
				msgs = ((InternalEObject)newAttestations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS, null, msgs);
			msgs = basicSetAttestations(newAttestations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS, newAttestations, newAttestations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimsType getClaims() {
		return claims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaims(ClaimsType newClaims, NotificationChain msgs) {
		ClaimsType oldClaims = claims;
		claims = newClaims;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__CLAIMS, oldClaims, newClaims);
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
	public void setClaims(ClaimsType newClaims) {
		if (newClaims != claims) {
			NotificationChain msgs = null;
			if (claims != null)
				msgs = ((InternalEObject)claims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__CLAIMS, null, msgs);
			if (newClaims != null)
				msgs = ((InternalEObject)newClaims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__CLAIMS, null, msgs);
			msgs = basicSetClaims(newClaims, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__CLAIMS, newClaims, newClaims));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceType1 getEvidence() {
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidence(EvidenceType1 newEvidence, NotificationChain msgs) {
		EvidenceType1 oldEvidence = evidence;
		evidence = newEvidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__EVIDENCE, oldEvidence, newEvidence);
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
	public void setEvidence(EvidenceType1 newEvidence) {
		if (newEvidence != evidence) {
			NotificationChain msgs = null;
			if (evidence != null)
				msgs = ((InternalEObject)evidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__EVIDENCE, null, msgs);
			if (newEvidence != null)
				msgs = ((InternalEObject)newEvidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__EVIDENCE, null, msgs);
			msgs = basicSetEvidence(newEvidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__EVIDENCE, newEvidence, newEvidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetsType getTargets() {
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargets(TargetsType newTargets, NotificationChain msgs) {
		TargetsType oldTargets = targets;
		targets = newTargets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__TARGETS, oldTargets, newTargets);
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
	public void setTargets(TargetsType newTargets) {
		if (newTargets != targets) {
			NotificationChain msgs = null;
			if (targets != null)
				msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__TARGETS, null, msgs);
			if (newTargets != null)
				msgs = ((InternalEObject)newTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__TARGETS, null, msgs);
			msgs = basicSetTargets(newTargets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__TARGETS, newTargets, newTargets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffirmationType getAffirmation() {
		return affirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffirmation(AffirmationType newAffirmation, NotificationChain msgs) {
		AffirmationType oldAffirmation = affirmation;
		affirmation = newAffirmation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__AFFIRMATION, oldAffirmation, newAffirmation);
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
	public void setAffirmation(AffirmationType newAffirmation) {
		if (newAffirmation != affirmation) {
			NotificationChain msgs = null;
			if (affirmation != null)
				msgs = ((InternalEObject)affirmation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__AFFIRMATION, null, msgs);
			if (newAffirmation != null)
				msgs = ((InternalEObject)newAffirmation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DECLARATIONS_TYPE__AFFIRMATION, null, msgs);
			msgs = basicSetAffirmation(newAffirmation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DECLARATIONS_TYPE__AFFIRMATION, newAffirmation, newAffirmation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.DECLARATIONS_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.DECLARATIONS_TYPE__ASSESSORS:
				return basicSetAssessors(null, msgs);
			case BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS:
				return basicSetAttestations(null, msgs);
			case BOMPackage.DECLARATIONS_TYPE__CLAIMS:
				return basicSetClaims(null, msgs);
			case BOMPackage.DECLARATIONS_TYPE__EVIDENCE:
				return basicSetEvidence(null, msgs);
			case BOMPackage.DECLARATIONS_TYPE__TARGETS:
				return basicSetTargets(null, msgs);
			case BOMPackage.DECLARATIONS_TYPE__AFFIRMATION:
				return basicSetAffirmation(null, msgs);
			case BOMPackage.DECLARATIONS_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.DECLARATIONS_TYPE__ASSESSORS:
				return getAssessors();
			case BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS:
				return getAttestations();
			case BOMPackage.DECLARATIONS_TYPE__CLAIMS:
				return getClaims();
			case BOMPackage.DECLARATIONS_TYPE__EVIDENCE:
				return getEvidence();
			case BOMPackage.DECLARATIONS_TYPE__TARGETS:
				return getTargets();
			case BOMPackage.DECLARATIONS_TYPE__AFFIRMATION:
				return getAffirmation();
			case BOMPackage.DECLARATIONS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case BOMPackage.DECLARATIONS_TYPE__ASSESSORS:
				setAssessors((AssessorsType)newValue);
				return;
			case BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS:
				setAttestations((AttestationsType)newValue);
				return;
			case BOMPackage.DECLARATIONS_TYPE__CLAIMS:
				setClaims((ClaimsType)newValue);
				return;
			case BOMPackage.DECLARATIONS_TYPE__EVIDENCE:
				setEvidence((EvidenceType1)newValue);
				return;
			case BOMPackage.DECLARATIONS_TYPE__TARGETS:
				setTargets((TargetsType)newValue);
				return;
			case BOMPackage.DECLARATIONS_TYPE__AFFIRMATION:
				setAffirmation((AffirmationType)newValue);
				return;
			case BOMPackage.DECLARATIONS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case BOMPackage.DECLARATIONS_TYPE__ASSESSORS:
				setAssessors((AssessorsType)null);
				return;
			case BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS:
				setAttestations((AttestationsType)null);
				return;
			case BOMPackage.DECLARATIONS_TYPE__CLAIMS:
				setClaims((ClaimsType)null);
				return;
			case BOMPackage.DECLARATIONS_TYPE__EVIDENCE:
				setEvidence((EvidenceType1)null);
				return;
			case BOMPackage.DECLARATIONS_TYPE__TARGETS:
				setTargets((TargetsType)null);
				return;
			case BOMPackage.DECLARATIONS_TYPE__AFFIRMATION:
				setAffirmation((AffirmationType)null);
				return;
			case BOMPackage.DECLARATIONS_TYPE__ANY:
				getAny().clear();
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
			case BOMPackage.DECLARATIONS_TYPE__ASSESSORS:
				return assessors != null;
			case BOMPackage.DECLARATIONS_TYPE__ATTESTATIONS:
				return attestations != null;
			case BOMPackage.DECLARATIONS_TYPE__CLAIMS:
				return claims != null;
			case BOMPackage.DECLARATIONS_TYPE__EVIDENCE:
				return evidence != null;
			case BOMPackage.DECLARATIONS_TYPE__TARGETS:
				return targets != null;
			case BOMPackage.DECLARATIONS_TYPE__AFFIRMATION:
				return affirmation != null;
			case BOMPackage.DECLARATIONS_TYPE__ANY:
				return any != null && !any.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //DeclarationsTypeImpl
