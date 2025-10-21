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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.VendorSpecificType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ElementType1Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ElementType1Impl#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ElementType1Impl#getVendorSpecific <em>Vendor Specific</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ElementType1Impl#getId <em>Id</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ElementType1Impl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementType1Impl extends MinimalEObjectImpl.Container implements ElementType1 {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynopsis() <em>Synopsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynopsis()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNOPSIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSynopsis() <em>Synopsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynopsis()
	 * @generated
	 * @ordered
	 */
	protected String synopsis = SYNOPSIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendorSpecific() <em>Vendor Specific</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorSpecific()
	 * @generated
	 * @ordered
	 */
	protected VendorSpecificType vendorSpecific;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getElementType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.ELEMENT_TYPE1__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynopsis(String newSynopsis) {
		String oldSynopsis = synopsis;
		synopsis = newSynopsis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.ELEMENT_TYPE1__SYNOPSIS, oldSynopsis, synopsis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VendorSpecificType getVendorSpecific() {
		return vendorSpecific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorSpecific(VendorSpecificType newVendorSpecific, NotificationChain msgs) {
		VendorSpecificType oldVendorSpecific = vendorSpecific;
		vendorSpecific = newVendorSpecific;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC, oldVendorSpecific, newVendorSpecific);
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
	public void setVendorSpecific(VendorSpecificType newVendorSpecific) {
		if (newVendorSpecific != vendorSpecific) {
			NotificationChain msgs = null;
			if (vendorSpecific != null)
				msgs = ((InternalEObject)vendorSpecific).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC, null, msgs);
			if (newVendorSpecific != null)
				msgs = ((InternalEObject)newVendorSpecific).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC, null, msgs);
			msgs = basicSetVendorSpecific(newVendorSpecific, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC, newVendorSpecific, newVendorSpecific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.ELEMENT_TYPE1__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.ELEMENT_TYPE1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC:
				return basicSetVendorSpecific(null, msgs);
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
			case AAAPackage.ELEMENT_TYPE1__DESCRIPTION:
				return getDescription();
			case AAAPackage.ELEMENT_TYPE1__SYNOPSIS:
				return getSynopsis();
			case AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC:
				return getVendorSpecific();
			case AAAPackage.ELEMENT_TYPE1__ID:
				return getId();
			case AAAPackage.ELEMENT_TYPE1__NAME:
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
			case AAAPackage.ELEMENT_TYPE1__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AAAPackage.ELEMENT_TYPE1__SYNOPSIS:
				setSynopsis((String)newValue);
				return;
			case AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC:
				setVendorSpecific((VendorSpecificType)newValue);
				return;
			case AAAPackage.ELEMENT_TYPE1__ID:
				setId((String)newValue);
				return;
			case AAAPackage.ELEMENT_TYPE1__NAME:
				setName((String)newValue);
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
			case AAAPackage.ELEMENT_TYPE1__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AAAPackage.ELEMENT_TYPE1__SYNOPSIS:
				setSynopsis(SYNOPSIS_EDEFAULT);
				return;
			case AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC:
				setVendorSpecific((VendorSpecificType)null);
				return;
			case AAAPackage.ELEMENT_TYPE1__ID:
				setId(ID_EDEFAULT);
				return;
			case AAAPackage.ELEMENT_TYPE1__NAME:
				setName(NAME_EDEFAULT);
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
			case AAAPackage.ELEMENT_TYPE1__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AAAPackage.ELEMENT_TYPE1__SYNOPSIS:
				return SYNOPSIS_EDEFAULT == null ? synopsis != null : !SYNOPSIS_EDEFAULT.equals(synopsis);
			case AAAPackage.ELEMENT_TYPE1__VENDOR_SPECIFIC:
				return vendorSpecific != null;
			case AAAPackage.ELEMENT_TYPE1__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AAAPackage.ELEMENT_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", synopsis: ");
		result.append(synopsis);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementType1Impl
