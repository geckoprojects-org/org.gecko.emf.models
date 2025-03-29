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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TAuthorityRequirement;
import org.omg.spec.dmn.dmn.TDMNElementReference;
import org.omg.spec.dmn.dmn.TKnowledgeSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TKnowledge Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TKnowledgeSourceImpl#getAuthorityRequirement <em>Authority Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TKnowledgeSourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TKnowledgeSourceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TKnowledgeSourceImpl#getLocationURI <em>Location URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TKnowledgeSourceImpl extends TDRGElementImpl implements TKnowledgeSource {
	/**
	 * The cached value of the '{@link #getAuthorityRequirement() <em>Authority Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TAuthorityRequirement> authorityRequirement;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected TDMNElementReference owner;

	/**
	 * The default value of the '{@link #getLocationURI() <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationURI() <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationURI()
	 * @generated
	 * @ordered
	 */
	protected String locationURI = LOCATION_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TKnowledgeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TKNOWLEDGE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAuthorityRequirement> getAuthorityRequirement() {
		if (authorityRequirement == null) {
			authorityRequirement = new EObjectContainmentEList<TAuthorityRequirement>(TAuthorityRequirement.class, this, DMNPackage.TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT);
		}
		return authorityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TKNOWLEDGE_SOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElementReference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(TDMNElementReference newOwner, NotificationChain msgs) {
		TDMNElementReference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TKNOWLEDGE_SOURCE__OWNER, oldOwner, newOwner);
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
	public void setOwner(TDMNElementReference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TKNOWLEDGE_SOURCE__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TKNOWLEDGE_SOURCE__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TKNOWLEDGE_SOURCE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationURI() {
		return locationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationURI(String newLocationURI) {
		String oldLocationURI = locationURI;
		locationURI = newLocationURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TKNOWLEDGE_SOURCE__LOCATION_URI, oldLocationURI, locationURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT:
				return ((InternalEList<?>)getAuthorityRequirement()).basicRemove(otherEnd, msgs);
			case DMNPackage.TKNOWLEDGE_SOURCE__OWNER:
				return basicSetOwner(null, msgs);
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
			case DMNPackage.TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT:
				return getAuthorityRequirement();
			case DMNPackage.TKNOWLEDGE_SOURCE__TYPE:
				return getType();
			case DMNPackage.TKNOWLEDGE_SOURCE__OWNER:
				return getOwner();
			case DMNPackage.TKNOWLEDGE_SOURCE__LOCATION_URI:
				return getLocationURI();
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
			case DMNPackage.TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT:
				getAuthorityRequirement().clear();
				getAuthorityRequirement().addAll((Collection<? extends TAuthorityRequirement>)newValue);
				return;
			case DMNPackage.TKNOWLEDGE_SOURCE__TYPE:
				setType((String)newValue);
				return;
			case DMNPackage.TKNOWLEDGE_SOURCE__OWNER:
				setOwner((TDMNElementReference)newValue);
				return;
			case DMNPackage.TKNOWLEDGE_SOURCE__LOCATION_URI:
				setLocationURI((String)newValue);
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
			case DMNPackage.TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT:
				getAuthorityRequirement().clear();
				return;
			case DMNPackage.TKNOWLEDGE_SOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DMNPackage.TKNOWLEDGE_SOURCE__OWNER:
				setOwner((TDMNElementReference)null);
				return;
			case DMNPackage.TKNOWLEDGE_SOURCE__LOCATION_URI:
				setLocationURI(LOCATION_URI_EDEFAULT);
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
			case DMNPackage.TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT:
				return authorityRequirement != null && !authorityRequirement.isEmpty();
			case DMNPackage.TKNOWLEDGE_SOURCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DMNPackage.TKNOWLEDGE_SOURCE__OWNER:
				return owner != null;
			case DMNPackage.TKNOWLEDGE_SOURCE__LOCATION_URI:
				return LOCATION_URI_EDEFAULT == null ? locationURI != null : !LOCATION_URI_EDEFAULT.equals(locationURI);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", locationURI: ");
		result.append(locationURI);
		result.append(')');
		return result.toString();
	}

} //TKnowledgeSourceImpl
