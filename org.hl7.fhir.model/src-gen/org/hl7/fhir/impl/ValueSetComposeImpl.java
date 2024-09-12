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

import org.hl7.fhir.Date;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetInclude;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Compose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetComposeImpl#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetComposeImpl#getInactive <em>Inactive</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetComposeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetComposeImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetComposeImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetComposeImpl extends BackboneElementImpl implements ValueSetCompose {
	/**
	 * The cached value of the '{@link #getLockedDate() <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lockedDate;

	/**
	 * The cached value of the '{@link #getInactive() <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean inactive;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetInclude> include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetInclude> exclude;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetComposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getValueSetCompose();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLockedDate() {
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockedDate(Date newLockedDate, NotificationChain msgs) {
		Date oldLockedDate = lockedDate;
		lockedDate = newLockedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE, oldLockedDate, newLockedDate);
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
	public void setLockedDate(Date newLockedDate) {
		if (newLockedDate != lockedDate) {
			NotificationChain msgs = null;
			if (lockedDate != null)
				msgs = ((InternalEObject)lockedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE, null, msgs);
			if (newLockedDate != null)
				msgs = ((InternalEObject)newLockedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE, null, msgs);
			msgs = basicSetLockedDate(newLockedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE, newLockedDate, newLockedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getInactive() {
		return inactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInactive(org.hl7.fhir.Boolean newInactive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldInactive = inactive;
		inactive = newInactive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_COMPOSE__INACTIVE, oldInactive, newInactive);
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
	public void setInactive(org.hl7.fhir.Boolean newInactive) {
		if (newInactive != inactive) {
			NotificationChain msgs = null;
			if (inactive != null)
				msgs = ((InternalEObject)inactive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_COMPOSE__INACTIVE, null, msgs);
			if (newInactive != null)
				msgs = ((InternalEObject)newInactive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_COMPOSE__INACTIVE, null, msgs);
			msgs = basicSetInactive(newInactive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_COMPOSE__INACTIVE, newInactive, newInactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSetInclude> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<ValueSetInclude>(ValueSetInclude.class, this, FHIRPackage.VALUE_SET_COMPOSE__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSetInclude> getExclude() {
		if (exclude == null) {
			exclude = new EObjectContainmentEList<ValueSetInclude>(ValueSetInclude.class, this, FHIRPackage.VALUE_SET_COMPOSE__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.VALUE_SET_COMPOSE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				return basicSetLockedDate(null, msgs);
			case FHIRPackage.VALUE_SET_COMPOSE__INACTIVE:
				return basicSetInactive(null, msgs);
			case FHIRPackage.VALUE_SET_COMPOSE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case FHIRPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return ((InternalEList<?>)getExclude()).basicRemove(otherEnd, msgs);
			case FHIRPackage.VALUE_SET_COMPOSE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				return getLockedDate();
			case FHIRPackage.VALUE_SET_COMPOSE__INACTIVE:
				return getInactive();
			case FHIRPackage.VALUE_SET_COMPOSE__INCLUDE:
				return getInclude();
			case FHIRPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return getExclude();
			case FHIRPackage.VALUE_SET_COMPOSE__PROPERTY:
				return getProperty();
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
			case FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				setLockedDate((Date)newValue);
				return;
			case FHIRPackage.VALUE_SET_COMPOSE__INACTIVE:
				setInactive((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.VALUE_SET_COMPOSE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends ValueSetInclude>)newValue);
				return;
			case FHIRPackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends ValueSetInclude>)newValue);
				return;
			case FHIRPackage.VALUE_SET_COMPOSE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				setLockedDate((Date)null);
				return;
			case FHIRPackage.VALUE_SET_COMPOSE__INACTIVE:
				setInactive((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.VALUE_SET_COMPOSE__INCLUDE:
				getInclude().clear();
				return;
			case FHIRPackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExclude().clear();
				return;
			case FHIRPackage.VALUE_SET_COMPOSE__PROPERTY:
				getProperty().clear();
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
			case FHIRPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				return lockedDate != null;
			case FHIRPackage.VALUE_SET_COMPOSE__INACTIVE:
				return inactive != null;
			case FHIRPackage.VALUE_SET_COMPOSE__INCLUDE:
				return include != null && !include.isEmpty();
			case FHIRPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case FHIRPackage.VALUE_SET_COMPOSE__PROPERTY:
				return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetComposeImpl
