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

import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PlanDefinitionParticipant;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionParticipantImpl#getActorId <em>Actor Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionParticipantImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionParticipantImpl#getTypeCanonical <em>Type Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionParticipantImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionParticipantImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionParticipantImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanDefinitionParticipantImpl extends BackboneElementImpl implements PlanDefinitionParticipant {
	/**
	 * The cached value of the '{@link #getActorId() <em>Actor Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String actorId;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActionParticipantType type;

	/**
	 * The cached value of the '{@link #getTypeCanonical() <em>Type Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical typeCanonical;

	/**
	 * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReference()
	 * @generated
	 * @ordered
	 */
	protected Reference typeReference;

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
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getPlanDefinitionParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getActorId() {
		return actorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActorId(org.hl7.fhir.String newActorId, NotificationChain msgs) {
		org.hl7.fhir.String oldActorId = actorId;
		actorId = newActorId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID, oldActorId, newActorId);
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
	public void setActorId(org.hl7.fhir.String newActorId) {
		if (newActorId != actorId) {
			NotificationChain msgs = null;
			if (actorId != null)
				msgs = ((InternalEObject)actorId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID, null, msgs);
			if (newActorId != null)
				msgs = ((InternalEObject)newActorId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID, null, msgs);
			msgs = basicSetActorId(newActorId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID, newActorId, newActorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionParticipantType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ActionParticipantType newType, NotificationChain msgs) {
		ActionParticipantType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE, oldType, newType);
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
	public void setType(ActionParticipantType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getTypeCanonical() {
		return typeCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeCanonical(Canonical newTypeCanonical, NotificationChain msgs) {
		Canonical oldTypeCanonical = typeCanonical;
		typeCanonical = newTypeCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL, oldTypeCanonical, newTypeCanonical);
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
	public void setTypeCanonical(Canonical newTypeCanonical) {
		if (newTypeCanonical != typeCanonical) {
			NotificationChain msgs = null;
			if (typeCanonical != null)
				msgs = ((InternalEObject)typeCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL, null, msgs);
			if (newTypeCanonical != null)
				msgs = ((InternalEObject)newTypeCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL, null, msgs);
			msgs = basicSetTypeCanonical(newTypeCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL, newTypeCanonical, newTypeCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getTypeReference() {
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeReference(Reference newTypeReference, NotificationChain msgs) {
		Reference oldTypeReference = typeReference;
		typeReference = newTypeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
	public void setTypeReference(Reference newTypeReference) {
		if (newTypeReference != typeReference) {
			NotificationChain msgs = null;
			if (typeReference != null)
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE, newTypeReference, newTypeReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE, oldRole, newRole);
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
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(CodeableConcept newFunction, NotificationChain msgs) {
		CodeableConcept oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION, oldFunction, newFunction);
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
	public void setFunction(CodeableConcept newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID:
				return basicSetActorId(null, msgs);
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL:
				return basicSetTypeCanonical(null, msgs);
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE:
				return basicSetRole(null, msgs);
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION:
				return basicSetFunction(null, msgs);
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
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID:
				return getActorId();
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE:
				return getType();
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL:
				return getTypeCanonical();
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE:
				return getTypeReference();
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE:
				return getRole();
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION:
				return getFunction();
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
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID:
				setActorId((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE:
				setType((ActionParticipantType)newValue);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL:
				setTypeCanonical((Canonical)newValue);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE:
				setTypeReference((Reference)newValue);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION:
				setFunction((CodeableConcept)newValue);
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
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID:
				setActorId((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE:
				setType((ActionParticipantType)null);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL:
				setTypeCanonical((Canonical)null);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE:
				setTypeReference((Reference)null);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION:
				setFunction((CodeableConcept)null);
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
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ACTOR_ID:
				return actorId != null;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE:
				return type != null;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_CANONICAL:
				return typeCanonical != null;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__TYPE_REFERENCE:
				return typeReference != null;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__ROLE:
				return role != null;
			case FHIRPackage.PLAN_DEFINITION_PARTICIPANT__FUNCTION:
				return function != null;
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionParticipantImpl
