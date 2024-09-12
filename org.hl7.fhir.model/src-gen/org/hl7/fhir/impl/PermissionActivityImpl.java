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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PermissionActivity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PermissionActivityImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionActivityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionActivityImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionActivityImpl extends BackboneElementImpl implements PermissionActivity {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> actor;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> action;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> purpose;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getPermissionActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.PERMISSION_ACTIVITY__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.PERMISSION_ACTIVITY__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPurpose() {
		if (purpose == null) {
			purpose = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.PERMISSION_ACTIVITY__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.PERMISSION_ACTIVITY__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PERMISSION_ACTIVITY__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PERMISSION_ACTIVITY__PURPOSE:
				return ((InternalEList<?>)getPurpose()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.PERMISSION_ACTIVITY__ACTOR:
				return getActor();
			case FHIRPackage.PERMISSION_ACTIVITY__ACTION:
				return getAction();
			case FHIRPackage.PERMISSION_ACTIVITY__PURPOSE:
				return getPurpose();
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
			case FHIRPackage.PERMISSION_ACTIVITY__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.PERMISSION_ACTIVITY__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.PERMISSION_ACTIVITY__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FHIRPackage.PERMISSION_ACTIVITY__ACTOR:
				getActor().clear();
				return;
			case FHIRPackage.PERMISSION_ACTIVITY__ACTION:
				getAction().clear();
				return;
			case FHIRPackage.PERMISSION_ACTIVITY__PURPOSE:
				getPurpose().clear();
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
			case FHIRPackage.PERMISSION_ACTIVITY__ACTOR:
				return actor != null && !actor.isEmpty();
			case FHIRPackage.PERMISSION_ACTIVITY__ACTION:
				return action != null && !action.isEmpty();
			case FHIRPackage.PERMISSION_ACTIVITY__PURPOSE:
				return purpose != null && !purpose.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PermissionActivityImpl
