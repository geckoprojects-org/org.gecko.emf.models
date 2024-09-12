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

import org.hl7.fhir.Coding;
import org.hl7.fhir.CommonLanguages;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.InventoryItemName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemNameImpl#getNameType <em>Name Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemNameImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemNameImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemNameImpl extends BackboneElementImpl implements InventoryItemName {
	/**
	 * The cached value of the '{@link #getNameType() <em>Name Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameType()
	 * @generated
	 * @ordered
	 */
	protected Coding nameType;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected CommonLanguages language;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getInventoryItemName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getNameType() {
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameType(Coding newNameType, NotificationChain msgs) {
		Coding oldNameType = nameType;
		nameType = newNameType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE, oldNameType, newNameType);
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
	public void setNameType(Coding newNameType) {
		if (newNameType != nameType) {
			NotificationChain msgs = null;
			if (nameType != null)
				msgs = ((InternalEObject)nameType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE, null, msgs);
			if (newNameType != null)
				msgs = ((InternalEObject)newNameType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE, null, msgs);
			msgs = basicSetNameType(newNameType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE, newNameType, newNameType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonLanguages getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(CommonLanguages newLanguage, NotificationChain msgs) {
		CommonLanguages oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(CommonLanguages newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM_NAME__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM_NAME__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM_NAME__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM_NAME__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE:
				return basicSetNameType(null, msgs);
			case FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME:
				return basicSetName(null, msgs);
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
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE:
				return getNameType();
			case FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE:
				return getLanguage();
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME:
				return getName();
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
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE:
				setNameType((Coding)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE:
				setLanguage((CommonLanguages)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME:
				setName((org.hl7.fhir.String)newValue);
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
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE:
				setNameType((Coding)null);
				return;
			case FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE:
				setLanguage((CommonLanguages)null);
				return;
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME:
				setName((org.hl7.fhir.String)null);
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
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME_TYPE:
				return nameType != null;
			case FHIRPackage.INVENTORY_ITEM_NAME__LANGUAGE:
				return language != null;
			case FHIRPackage.INVENTORY_ITEM_NAME__NAME:
				return name != null;
		}
		return super.eIsSet(featureID);
	}

} //InventoryItemNameImpl
