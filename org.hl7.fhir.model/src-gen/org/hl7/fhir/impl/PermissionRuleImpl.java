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
import org.hl7.fhir.ConsentProvisionType;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PermissionActivity;
import org.hl7.fhir.PermissionData;
import org.hl7.fhir.PermissionRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PermissionRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionRuleImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionRuleImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionRuleImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionRuleImpl extends BackboneElementImpl implements PermissionRule {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConsentProvisionType type;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<PermissionData> data;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<PermissionActivity> activity;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> limit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getPermissionRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentProvisionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ConsentProvisionType newType, NotificationChain msgs) {
		ConsentProvisionType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PERMISSION_RULE__TYPE, oldType, newType);
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
	public void setType(ConsentProvisionType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PERMISSION_RULE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PERMISSION_RULE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PERMISSION_RULE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<PermissionData>(PermissionData.class, this, FHIRPackage.PERMISSION_RULE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionActivity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<PermissionActivity>(PermissionActivity.class, this, FHIRPackage.PERMISSION_RULE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLimit() {
		if (limit == null) {
			limit = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.PERMISSION_RULE__LIMIT);
		}
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.PERMISSION_RULE__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.PERMISSION_RULE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PERMISSION_RULE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PERMISSION_RULE__LIMIT:
				return ((InternalEList<?>)getLimit()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.PERMISSION_RULE__TYPE:
				return getType();
			case FHIRPackage.PERMISSION_RULE__DATA:
				return getData();
			case FHIRPackage.PERMISSION_RULE__ACTIVITY:
				return getActivity();
			case FHIRPackage.PERMISSION_RULE__LIMIT:
				return getLimit();
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
			case FHIRPackage.PERMISSION_RULE__TYPE:
				setType((ConsentProvisionType)newValue);
				return;
			case FHIRPackage.PERMISSION_RULE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends PermissionData>)newValue);
				return;
			case FHIRPackage.PERMISSION_RULE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends PermissionActivity>)newValue);
				return;
			case FHIRPackage.PERMISSION_RULE__LIMIT:
				getLimit().clear();
				getLimit().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FHIRPackage.PERMISSION_RULE__TYPE:
				setType((ConsentProvisionType)null);
				return;
			case FHIRPackage.PERMISSION_RULE__DATA:
				getData().clear();
				return;
			case FHIRPackage.PERMISSION_RULE__ACTIVITY:
				getActivity().clear();
				return;
			case FHIRPackage.PERMISSION_RULE__LIMIT:
				getLimit().clear();
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
			case FHIRPackage.PERMISSION_RULE__TYPE:
				return type != null;
			case FHIRPackage.PERMISSION_RULE__DATA:
				return data != null && !data.isEmpty();
			case FHIRPackage.PERMISSION_RULE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case FHIRPackage.PERMISSION_RULE__LIMIT:
				return limit != null && !limit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PermissionRuleImpl
