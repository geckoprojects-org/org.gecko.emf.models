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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DatePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDMaintenanceFrequencyCodePropertyType;
import org.isotc211._2005.gmd.MDMaintenanceInformationType;
import org.isotc211._2005.gmd.MDScopeCodePropertyType;
import org.isotc211._2005.gmd.MDScopeDescriptionPropertyType;

import org.isotc211._2005.gts.TMPeriodDurationPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Maintenance Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceInformationTypeImpl#getMaintenanceAndUpdateFrequency <em>Maintenance And Update Frequency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceInformationTypeImpl#getDateOfNextUpdate <em>Date Of Next Update</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceInformationTypeImpl#getUserDefinedMaintenanceFrequency <em>User Defined Maintenance Frequency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceInformationTypeImpl#getUpdateScope <em>Update Scope</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceInformationTypeImpl#getUpdateScopeDescription <em>Update Scope Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceInformationTypeImpl#getMaintenanceNote <em>Maintenance Note</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceInformationTypeImpl#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDMaintenanceInformationTypeImpl extends AbstractObjectTypeImpl implements MDMaintenanceInformationType {
	/**
	 * The cached value of the '{@link #getMaintenanceAndUpdateFrequency() <em>Maintenance And Update Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceAndUpdateFrequency()
	 * @generated
	 * @ordered
	 */
	protected MDMaintenanceFrequencyCodePropertyType maintenanceAndUpdateFrequency;

	/**
	 * The cached value of the '{@link #getDateOfNextUpdate() <em>Date Of Next Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfNextUpdate()
	 * @generated
	 * @ordered
	 */
	protected DatePropertyType dateOfNextUpdate;

	/**
	 * The cached value of the '{@link #getUserDefinedMaintenanceFrequency() <em>User Defined Maintenance Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedMaintenanceFrequency()
	 * @generated
	 * @ordered
	 */
	protected TMPeriodDurationPropertyType userDefinedMaintenanceFrequency;

	/**
	 * The cached value of the '{@link #getUpdateScope() <em>Update Scope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateScope()
	 * @generated
	 * @ordered
	 */
	protected EList<MDScopeCodePropertyType> updateScope;

	/**
	 * The cached value of the '{@link #getUpdateScopeDescription() <em>Update Scope Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateScopeDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<MDScopeDescriptionPropertyType> updateScopeDescription;

	/**
	 * The cached value of the '{@link #getMaintenanceNote() <em>Maintenance Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceNote()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> maintenanceNote;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<CIResponsiblePartyPropertyType> contact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDMaintenanceInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDMaintenanceInformationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMaintenanceFrequencyCodePropertyType getMaintenanceAndUpdateFrequency() {
		return maintenanceAndUpdateFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaintenanceAndUpdateFrequency(MDMaintenanceFrequencyCodePropertyType newMaintenanceAndUpdateFrequency, NotificationChain msgs) {
		MDMaintenanceFrequencyCodePropertyType oldMaintenanceAndUpdateFrequency = maintenanceAndUpdateFrequency;
		maintenanceAndUpdateFrequency = newMaintenanceAndUpdateFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY, oldMaintenanceAndUpdateFrequency, newMaintenanceAndUpdateFrequency);
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
	public void setMaintenanceAndUpdateFrequency(MDMaintenanceFrequencyCodePropertyType newMaintenanceAndUpdateFrequency) {
		if (newMaintenanceAndUpdateFrequency != maintenanceAndUpdateFrequency) {
			NotificationChain msgs = null;
			if (maintenanceAndUpdateFrequency != null)
				msgs = ((InternalEObject)maintenanceAndUpdateFrequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY, null, msgs);
			if (newMaintenanceAndUpdateFrequency != null)
				msgs = ((InternalEObject)newMaintenanceAndUpdateFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY, null, msgs);
			msgs = basicSetMaintenanceAndUpdateFrequency(newMaintenanceAndUpdateFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY, newMaintenanceAndUpdateFrequency, newMaintenanceAndUpdateFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatePropertyType getDateOfNextUpdate() {
		return dateOfNextUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateOfNextUpdate(DatePropertyType newDateOfNextUpdate, NotificationChain msgs) {
		DatePropertyType oldDateOfNextUpdate = dateOfNextUpdate;
		dateOfNextUpdate = newDateOfNextUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE, oldDateOfNextUpdate, newDateOfNextUpdate);
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
	public void setDateOfNextUpdate(DatePropertyType newDateOfNextUpdate) {
		if (newDateOfNextUpdate != dateOfNextUpdate) {
			NotificationChain msgs = null;
			if (dateOfNextUpdate != null)
				msgs = ((InternalEObject)dateOfNextUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE, null, msgs);
			if (newDateOfNextUpdate != null)
				msgs = ((InternalEObject)newDateOfNextUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE, null, msgs);
			msgs = basicSetDateOfNextUpdate(newDateOfNextUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE, newDateOfNextUpdate, newDateOfNextUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMPeriodDurationPropertyType getUserDefinedMaintenanceFrequency() {
		return userDefinedMaintenanceFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedMaintenanceFrequency(TMPeriodDurationPropertyType newUserDefinedMaintenanceFrequency, NotificationChain msgs) {
		TMPeriodDurationPropertyType oldUserDefinedMaintenanceFrequency = userDefinedMaintenanceFrequency;
		userDefinedMaintenanceFrequency = newUserDefinedMaintenanceFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY, oldUserDefinedMaintenanceFrequency, newUserDefinedMaintenanceFrequency);
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
	public void setUserDefinedMaintenanceFrequency(TMPeriodDurationPropertyType newUserDefinedMaintenanceFrequency) {
		if (newUserDefinedMaintenanceFrequency != userDefinedMaintenanceFrequency) {
			NotificationChain msgs = null;
			if (userDefinedMaintenanceFrequency != null)
				msgs = ((InternalEObject)userDefinedMaintenanceFrequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY, null, msgs);
			if (newUserDefinedMaintenanceFrequency != null)
				msgs = ((InternalEObject)newUserDefinedMaintenanceFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY, null, msgs);
			msgs = basicSetUserDefinedMaintenanceFrequency(newUserDefinedMaintenanceFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY, newUserDefinedMaintenanceFrequency, newUserDefinedMaintenanceFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDScopeCodePropertyType> getUpdateScope() {
		if (updateScope == null) {
			updateScope = new EObjectContainmentEList<MDScopeCodePropertyType>(MDScopeCodePropertyType.class, this, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE);
		}
		return updateScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDScopeDescriptionPropertyType> getUpdateScopeDescription() {
		if (updateScopeDescription == null) {
			updateScopeDescription = new EObjectContainmentEList<MDScopeDescriptionPropertyType>(MDScopeDescriptionPropertyType.class, this, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE_DESCRIPTION);
		}
		return updateScopeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getMaintenanceNote() {
		if (maintenanceNote == null) {
			maintenanceNote = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_NOTE);
		}
		return maintenanceNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIResponsiblePartyPropertyType> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<CIResponsiblePartyPropertyType>(CIResponsiblePartyPropertyType.class, this, GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY:
				return basicSetMaintenanceAndUpdateFrequency(null, msgs);
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE:
				return basicSetDateOfNextUpdate(null, msgs);
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY:
				return basicSetUserDefinedMaintenanceFrequency(null, msgs);
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE:
				return ((InternalEList<?>)getUpdateScope()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE_DESCRIPTION:
				return ((InternalEList<?>)getUpdateScopeDescription()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_NOTE:
				return ((InternalEList<?>)getMaintenanceNote()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY:
				return getMaintenanceAndUpdateFrequency();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE:
				return getDateOfNextUpdate();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY:
				return getUserDefinedMaintenanceFrequency();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE:
				return getUpdateScope();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE_DESCRIPTION:
				return getUpdateScopeDescription();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_NOTE:
				return getMaintenanceNote();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__CONTACT:
				return getContact();
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
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY:
				setMaintenanceAndUpdateFrequency((MDMaintenanceFrequencyCodePropertyType)newValue);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE:
				setDateOfNextUpdate((DatePropertyType)newValue);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY:
				setUserDefinedMaintenanceFrequency((TMPeriodDurationPropertyType)newValue);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE:
				getUpdateScope().clear();
				getUpdateScope().addAll((Collection<? extends MDScopeCodePropertyType>)newValue);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE_DESCRIPTION:
				getUpdateScopeDescription().clear();
				getUpdateScopeDescription().addAll((Collection<? extends MDScopeDescriptionPropertyType>)newValue);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_NOTE:
				getMaintenanceNote().clear();
				getMaintenanceNote().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends CIResponsiblePartyPropertyType>)newValue);
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
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY:
				setMaintenanceAndUpdateFrequency((MDMaintenanceFrequencyCodePropertyType)null);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE:
				setDateOfNextUpdate((DatePropertyType)null);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY:
				setUserDefinedMaintenanceFrequency((TMPeriodDurationPropertyType)null);
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE:
				getUpdateScope().clear();
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE_DESCRIPTION:
				getUpdateScopeDescription().clear();
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_NOTE:
				getMaintenanceNote().clear();
				return;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__CONTACT:
				getContact().clear();
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
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_AND_UPDATE_FREQUENCY:
				return maintenanceAndUpdateFrequency != null;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__DATE_OF_NEXT_UPDATE:
				return dateOfNextUpdate != null;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__USER_DEFINED_MAINTENANCE_FREQUENCY:
				return userDefinedMaintenanceFrequency != null;
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE:
				return updateScope != null && !updateScope.isEmpty();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__UPDATE_SCOPE_DESCRIPTION:
				return updateScopeDescription != null && !updateScopeDescription.isEmpty();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__MAINTENANCE_NOTE:
				return maintenanceNote != null && !maintenanceNote.isEmpty();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE__CONTACT:
				return contact != null && !contact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDMaintenanceInformationTypeImpl
