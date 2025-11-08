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

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.OrganizationalContact;
import org.cyclonedx.schema.bom.OrganizationalEntity;
import org.cyclonedx.schema.bom.PostalAddressType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organizational Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationalEntityImpl extends MinimalEObjectImpl.Container implements OrganizationalEntity {
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
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected PostalAddressType address;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected EList<String> url;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationalContact> contact;

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
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationalEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getOrganizationalEntity();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ORGANIZATIONAL_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddressType getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(PostalAddressType newAddress, NotificationChain msgs) {
		PostalAddressType oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS, oldAddress, newAddress);
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
	public void setAddress(PostalAddressType newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUrl() {
		if (url == null) {
			url = new EDataTypeEList<String>(String.class, this, BOMPackage.ORGANIZATIONAL_ENTITY__URL);
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrganizationalContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<OrganizationalContact>(OrganizationalContact.class, this, BOMPackage.ORGANIZATIONAL_ENTITY__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.ORGANIZATIONAL_ENTITY__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ORGANIZATIONAL_ENTITY__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.ORGANIZATIONAL_ENTITY__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS:
				return basicSetAddress(null, msgs);
			case BOMPackage.ORGANIZATIONAL_ENTITY__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.ORGANIZATIONAL_ENTITY__NAME:
				return getName();
			case BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS:
				return getAddress();
			case BOMPackage.ORGANIZATIONAL_ENTITY__URL:
				return getUrl();
			case BOMPackage.ORGANIZATIONAL_ENTITY__CONTACT:
				return getContact();
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.ORGANIZATIONAL_ENTITY__BOM_REF:
				return getBomRef();
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case BOMPackage.ORGANIZATIONAL_ENTITY__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS:
				setAddress((PostalAddressType)newValue);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__URL:
				getUrl().clear();
				getUrl().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends OrganizationalContact>)newValue);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case BOMPackage.ORGANIZATIONAL_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS:
				setAddress((PostalAddressType)null);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__URL:
				getUrl().clear();
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__CONTACT:
				getContact().clear();
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY:
				getAny().clear();
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case BOMPackage.ORGANIZATIONAL_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.ORGANIZATIONAL_ENTITY__ADDRESS:
				return address != null;
			case BOMPackage.ORGANIZATIONAL_ENTITY__URL:
				return url != null && !url.isEmpty();
			case BOMPackage.ORGANIZATIONAL_ENTITY__CONTACT:
				return contact != null && !contact.isEmpty();
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.ORGANIZATIONAL_ENTITY__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.ORGANIZATIONAL_ENTITY__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(", any: ");
		result.append(any);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //OrganizationalEntityImpl
