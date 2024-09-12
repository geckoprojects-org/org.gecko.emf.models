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
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Ingredient;
import org.hl7.fhir.IngredientManufacturer;
import org.hl7.fhir.IngredientSubstance;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getAllergenicIndicator <em>Allergenic Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.IngredientImpl#getSubstance <em>Substance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngredientImpl extends DomainResourceImpl implements Ingredient {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> for_;

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
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> function;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept group;

	/**
	 * The cached value of the '{@link #getAllergenicIndicator() <em>Allergenic Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergenicIndicator()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean allergenicIndicator;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Markdown comment;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<IngredientManufacturer> manufacturer;

	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected IngredientSubstance substance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__STATUS, oldStatus, newStatus);
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
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getFor() {
		if (for_ == null) {
			for_ = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.INGREDIENT__FOR);
		}
		return for_;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__ROLE, oldRole, newRole);
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
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.INGREDIENT__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(CodeableConcept newGroup, NotificationChain msgs) {
		CodeableConcept oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__GROUP, oldGroup, newGroup);
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
	public void setGroup(CodeableConcept newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAllergenicIndicator() {
		return allergenicIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllergenicIndicator(org.hl7.fhir.Boolean newAllergenicIndicator, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAllergenicIndicator = allergenicIndicator;
		allergenicIndicator = newAllergenicIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR, oldAllergenicIndicator, newAllergenicIndicator);
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
	public void setAllergenicIndicator(org.hl7.fhir.Boolean newAllergenicIndicator) {
		if (newAllergenicIndicator != allergenicIndicator) {
			NotificationChain msgs = null;
			if (allergenicIndicator != null)
				msgs = ((InternalEObject)allergenicIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR, null, msgs);
			if (newAllergenicIndicator != null)
				msgs = ((InternalEObject)newAllergenicIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR, null, msgs);
			msgs = basicSetAllergenicIndicator(newAllergenicIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR, newAllergenicIndicator, newAllergenicIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Markdown newComment, NotificationChain msgs) {
		Markdown oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__COMMENT, oldComment, newComment);
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
	public void setComment(Markdown newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IngredientManufacturer> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<IngredientManufacturer>(IngredientManufacturer.class, this, FHIRPackage.INGREDIENT__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IngredientSubstance getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(IngredientSubstance newSubstance, NotificationChain msgs) {
		IngredientSubstance oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__SUBSTANCE, oldSubstance, newSubstance);
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
	public void setSubstance(IngredientSubstance newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INGREDIENT__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INGREDIENT__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.INGREDIENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FHIRPackage.INGREDIENT__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.INGREDIENT__FOR:
				return ((InternalEList<?>)getFor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INGREDIENT__ROLE:
				return basicSetRole(null, msgs);
			case FHIRPackage.INGREDIENT__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INGREDIENT__GROUP:
				return basicSetGroup(null, msgs);
			case FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR:
				return basicSetAllergenicIndicator(null, msgs);
			case FHIRPackage.INGREDIENT__COMMENT:
				return basicSetComment(null, msgs);
			case FHIRPackage.INGREDIENT__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INGREDIENT__SUBSTANCE:
				return basicSetSubstance(null, msgs);
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
			case FHIRPackage.INGREDIENT__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.INGREDIENT__STATUS:
				return getStatus();
			case FHIRPackage.INGREDIENT__FOR:
				return getFor();
			case FHIRPackage.INGREDIENT__ROLE:
				return getRole();
			case FHIRPackage.INGREDIENT__FUNCTION:
				return getFunction();
			case FHIRPackage.INGREDIENT__GROUP:
				return getGroup();
			case FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR:
				return getAllergenicIndicator();
			case FHIRPackage.INGREDIENT__COMMENT:
				return getComment();
			case FHIRPackage.INGREDIENT__MANUFACTURER:
				return getManufacturer();
			case FHIRPackage.INGREDIENT__SUBSTANCE:
				return getSubstance();
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
			case FHIRPackage.INGREDIENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FHIRPackage.INGREDIENT__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FHIRPackage.INGREDIENT__FOR:
				getFor().clear();
				getFor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.INGREDIENT__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FHIRPackage.INGREDIENT__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.INGREDIENT__GROUP:
				setGroup((CodeableConcept)newValue);
				return;
			case FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR:
				setAllergenicIndicator((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.INGREDIENT__COMMENT:
				setComment((Markdown)newValue);
				return;
			case FHIRPackage.INGREDIENT__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends IngredientManufacturer>)newValue);
				return;
			case FHIRPackage.INGREDIENT__SUBSTANCE:
				setSubstance((IngredientSubstance)newValue);
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
			case FHIRPackage.INGREDIENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FHIRPackage.INGREDIENT__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FHIRPackage.INGREDIENT__FOR:
				getFor().clear();
				return;
			case FHIRPackage.INGREDIENT__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FHIRPackage.INGREDIENT__FUNCTION:
				getFunction().clear();
				return;
			case FHIRPackage.INGREDIENT__GROUP:
				setGroup((CodeableConcept)null);
				return;
			case FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR:
				setAllergenicIndicator((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.INGREDIENT__COMMENT:
				setComment((Markdown)null);
				return;
			case FHIRPackage.INGREDIENT__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FHIRPackage.INGREDIENT__SUBSTANCE:
				setSubstance((IngredientSubstance)null);
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
			case FHIRPackage.INGREDIENT__IDENTIFIER:
				return identifier != null;
			case FHIRPackage.INGREDIENT__STATUS:
				return status != null;
			case FHIRPackage.INGREDIENT__FOR:
				return for_ != null && !for_.isEmpty();
			case FHIRPackage.INGREDIENT__ROLE:
				return role != null;
			case FHIRPackage.INGREDIENT__FUNCTION:
				return function != null && !function.isEmpty();
			case FHIRPackage.INGREDIENT__GROUP:
				return group != null;
			case FHIRPackage.INGREDIENT__ALLERGENIC_INDICATOR:
				return allergenicIndicator != null;
			case FHIRPackage.INGREDIENT__COMMENT:
				return comment != null;
			case FHIRPackage.INGREDIENT__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FHIRPackage.INGREDIENT__SUBSTANCE:
				return substance != null;
		}
		return super.eIsSet(featureID);
	}

} //IngredientImpl
