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
import org.hl7.fhir.InventoryItem;
import org.hl7.fhir.InventoryItemAssociation;
import org.hl7.fhir.InventoryItemCharacteristic;
import org.hl7.fhir.InventoryItemDescription;
import org.hl7.fhir.InventoryItemInstance;
import org.hl7.fhir.InventoryItemName;
import org.hl7.fhir.InventoryItemResponsibleOrganization;
import org.hl7.fhir.InventoryItemStatusCodes;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getResponsibleOrganization <em>Responsible Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getInventoryStatus <em>Inventory Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getNetContent <em>Net Content</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InventoryItemImpl#getProductReference <em>Product Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemImpl extends DomainResourceImpl implements InventoryItem {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected InventoryItemStatusCodes status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> code;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryItemName> name;

	/**
	 * The cached value of the '{@link #getResponsibleOrganization() <em>Responsible Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryItemResponsibleOrganization> responsibleOrganization;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected InventoryItemDescription description;

	/**
	 * The cached value of the '{@link #getInventoryStatus() <em>Inventory Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> inventoryStatus;

	/**
	 * The cached value of the '{@link #getBaseUnit() <em>Base Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept baseUnit;

	/**
	 * The cached value of the '{@link #getNetContent() <em>Net Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetContent()
	 * @generated
	 * @ordered
	 */
	protected Quantity netContent;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryItemAssociation> association;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryItemCharacteristic> characteristic;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected InventoryItemInstance instance;

	/**
	 * The cached value of the '{@link #getProductReference() <em>Product Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReference()
	 * @generated
	 * @ordered
	 */
	protected Reference productReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getInventoryItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.INVENTORY_ITEM__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(InventoryItemStatusCodes newStatus, NotificationChain msgs) {
		InventoryItemStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__STATUS, oldStatus, newStatus);
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
	public void setStatus(InventoryItemStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.INVENTORY_ITEM__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.INVENTORY_ITEM__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InventoryItemName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<InventoryItemName>(InventoryItemName.class, this, FHIRPackage.INVENTORY_ITEM__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InventoryItemResponsibleOrganization> getResponsibleOrganization() {
		if (responsibleOrganization == null) {
			responsibleOrganization = new EObjectContainmentEList<InventoryItemResponsibleOrganization>(InventoryItemResponsibleOrganization.class, this, FHIRPackage.INVENTORY_ITEM__RESPONSIBLE_ORGANIZATION);
		}
		return responsibleOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemDescription getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(InventoryItemDescription newDescription, NotificationChain msgs) {
		InventoryItemDescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(InventoryItemDescription newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getInventoryStatus() {
		if (inventoryStatus == null) {
			inventoryStatus = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.INVENTORY_ITEM__INVENTORY_STATUS);
		}
		return inventoryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBaseUnit() {
		return baseUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseUnit(CodeableConcept newBaseUnit, NotificationChain msgs) {
		CodeableConcept oldBaseUnit = baseUnit;
		baseUnit = newBaseUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__BASE_UNIT, oldBaseUnit, newBaseUnit);
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
	public void setBaseUnit(CodeableConcept newBaseUnit) {
		if (newBaseUnit != baseUnit) {
			NotificationChain msgs = null;
			if (baseUnit != null)
				msgs = ((InternalEObject)baseUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__BASE_UNIT, null, msgs);
			if (newBaseUnit != null)
				msgs = ((InternalEObject)newBaseUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__BASE_UNIT, null, msgs);
			msgs = basicSetBaseUnit(newBaseUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__BASE_UNIT, newBaseUnit, newBaseUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getNetContent() {
		return netContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetContent(Quantity newNetContent, NotificationChain msgs) {
		Quantity oldNetContent = netContent;
		netContent = newNetContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__NET_CONTENT, oldNetContent, newNetContent);
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
	public void setNetContent(Quantity newNetContent) {
		if (newNetContent != netContent) {
			NotificationChain msgs = null;
			if (netContent != null)
				msgs = ((InternalEObject)netContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__NET_CONTENT, null, msgs);
			if (newNetContent != null)
				msgs = ((InternalEObject)newNetContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__NET_CONTENT, null, msgs);
			msgs = basicSetNetContent(newNetContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__NET_CONTENT, newNetContent, newNetContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InventoryItemAssociation> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<InventoryItemAssociation>(InventoryItemAssociation.class, this, FHIRPackage.INVENTORY_ITEM__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InventoryItemCharacteristic> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<InventoryItemCharacteristic>(InventoryItemCharacteristic.class, this, FHIRPackage.INVENTORY_ITEM__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemInstance getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(InventoryItemInstance newInstance, NotificationChain msgs) {
		InventoryItemInstance oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__INSTANCE, oldInstance, newInstance);
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
	public void setInstance(InventoryItemInstance newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProductReference() {
		return productReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductReference(Reference newProductReference, NotificationChain msgs) {
		Reference oldProductReference = productReference;
		productReference = newProductReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE, oldProductReference, newProductReference);
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
	public void setProductReference(Reference newProductReference) {
		if (newProductReference != productReference) {
			NotificationChain msgs = null;
			if (productReference != null)
				msgs = ((InternalEObject)productReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE, null, msgs);
			if (newProductReference != null)
				msgs = ((InternalEObject)newProductReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE, null, msgs);
			msgs = basicSetProductReference(newProductReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE, newProductReference, newProductReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.INVENTORY_ITEM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVENTORY_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.INVENTORY_ITEM__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVENTORY_ITEM__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVENTORY_ITEM__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVENTORY_ITEM__RESPONSIBLE_ORGANIZATION:
				return ((InternalEList<?>)getResponsibleOrganization()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVENTORY_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.INVENTORY_ITEM__INVENTORY_STATUS:
				return ((InternalEList<?>)getInventoryStatus()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVENTORY_ITEM__BASE_UNIT:
				return basicSetBaseUnit(null, msgs);
			case FHIRPackage.INVENTORY_ITEM__NET_CONTENT:
				return basicSetNetContent(null, msgs);
			case FHIRPackage.INVENTORY_ITEM__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVENTORY_ITEM__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVENTORY_ITEM__INSTANCE:
				return basicSetInstance(null, msgs);
			case FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE:
				return basicSetProductReference(null, msgs);
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
			case FHIRPackage.INVENTORY_ITEM__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.INVENTORY_ITEM__STATUS:
				return getStatus();
			case FHIRPackage.INVENTORY_ITEM__CATEGORY:
				return getCategory();
			case FHIRPackage.INVENTORY_ITEM__CODE:
				return getCode();
			case FHIRPackage.INVENTORY_ITEM__NAME:
				return getName();
			case FHIRPackage.INVENTORY_ITEM__RESPONSIBLE_ORGANIZATION:
				return getResponsibleOrganization();
			case FHIRPackage.INVENTORY_ITEM__DESCRIPTION:
				return getDescription();
			case FHIRPackage.INVENTORY_ITEM__INVENTORY_STATUS:
				return getInventoryStatus();
			case FHIRPackage.INVENTORY_ITEM__BASE_UNIT:
				return getBaseUnit();
			case FHIRPackage.INVENTORY_ITEM__NET_CONTENT:
				return getNetContent();
			case FHIRPackage.INVENTORY_ITEM__ASSOCIATION:
				return getAssociation();
			case FHIRPackage.INVENTORY_ITEM__CHARACTERISTIC:
				return getCharacteristic();
			case FHIRPackage.INVENTORY_ITEM__INSTANCE:
				return getInstance();
			case FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE:
				return getProductReference();
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
			case FHIRPackage.INVENTORY_ITEM__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__STATUS:
				setStatus((InventoryItemStatusCodes)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__NAME:
				getName().clear();
				getName().addAll((Collection<? extends InventoryItemName>)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__RESPONSIBLE_ORGANIZATION:
				getResponsibleOrganization().clear();
				getResponsibleOrganization().addAll((Collection<? extends InventoryItemResponsibleOrganization>)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__DESCRIPTION:
				setDescription((InventoryItemDescription)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__INVENTORY_STATUS:
				getInventoryStatus().clear();
				getInventoryStatus().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__BASE_UNIT:
				setBaseUnit((CodeableConcept)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__NET_CONTENT:
				setNetContent((Quantity)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends InventoryItemAssociation>)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends InventoryItemCharacteristic>)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__INSTANCE:
				setInstance((InventoryItemInstance)newValue);
				return;
			case FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE:
				setProductReference((Reference)newValue);
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
			case FHIRPackage.INVENTORY_ITEM__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.INVENTORY_ITEM__STATUS:
				setStatus((InventoryItemStatusCodes)null);
				return;
			case FHIRPackage.INVENTORY_ITEM__CATEGORY:
				getCategory().clear();
				return;
			case FHIRPackage.INVENTORY_ITEM__CODE:
				getCode().clear();
				return;
			case FHIRPackage.INVENTORY_ITEM__NAME:
				getName().clear();
				return;
			case FHIRPackage.INVENTORY_ITEM__RESPONSIBLE_ORGANIZATION:
				getResponsibleOrganization().clear();
				return;
			case FHIRPackage.INVENTORY_ITEM__DESCRIPTION:
				setDescription((InventoryItemDescription)null);
				return;
			case FHIRPackage.INVENTORY_ITEM__INVENTORY_STATUS:
				getInventoryStatus().clear();
				return;
			case FHIRPackage.INVENTORY_ITEM__BASE_UNIT:
				setBaseUnit((CodeableConcept)null);
				return;
			case FHIRPackage.INVENTORY_ITEM__NET_CONTENT:
				setNetContent((Quantity)null);
				return;
			case FHIRPackage.INVENTORY_ITEM__ASSOCIATION:
				getAssociation().clear();
				return;
			case FHIRPackage.INVENTORY_ITEM__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case FHIRPackage.INVENTORY_ITEM__INSTANCE:
				setInstance((InventoryItemInstance)null);
				return;
			case FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE:
				setProductReference((Reference)null);
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
			case FHIRPackage.INVENTORY_ITEM__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.INVENTORY_ITEM__STATUS:
				return status != null;
			case FHIRPackage.INVENTORY_ITEM__CATEGORY:
				return category != null && !category.isEmpty();
			case FHIRPackage.INVENTORY_ITEM__CODE:
				return code != null && !code.isEmpty();
			case FHIRPackage.INVENTORY_ITEM__NAME:
				return name != null && !name.isEmpty();
			case FHIRPackage.INVENTORY_ITEM__RESPONSIBLE_ORGANIZATION:
				return responsibleOrganization != null && !responsibleOrganization.isEmpty();
			case FHIRPackage.INVENTORY_ITEM__DESCRIPTION:
				return description != null;
			case FHIRPackage.INVENTORY_ITEM__INVENTORY_STATUS:
				return inventoryStatus != null && !inventoryStatus.isEmpty();
			case FHIRPackage.INVENTORY_ITEM__BASE_UNIT:
				return baseUnit != null;
			case FHIRPackage.INVENTORY_ITEM__NET_CONTENT:
				return netContent != null;
			case FHIRPackage.INVENTORY_ITEM__ASSOCIATION:
				return association != null && !association.isEmpty();
			case FHIRPackage.INVENTORY_ITEM__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case FHIRPackage.INVENTORY_ITEM__INSTANCE:
				return instance != null;
			case FHIRPackage.INVENTORY_ITEM__PRODUCT_REFERENCE:
				return productReference != null;
		}
		return super.eIsSet(featureID);
	}

} //InventoryItemImpl
