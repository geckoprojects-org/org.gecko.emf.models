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
package org.open.oasis.docs.odata.ns.edmx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.odata.ns.edmx.EdmxPackage;
import org.open.oasis.docs.odata.ns.edmx.TDataServices;
import org.open.oasis.docs.odata.ns.edmx.TEdmx;
import org.open.oasis.docs.odata.ns.edmx.TReference;
import org.open.oasis.docs.odata.ns.edmx.TVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEdmx</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TEdmxImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TEdmxImpl#getDataServices <em>Data Services</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TEdmxImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TEdmxImpl extends MinimalEObjectImpl.Container implements TEdmx {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<TReference> reference;

	/**
	 * The cached value of the '{@link #getDataServices() <em>Data Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataServices()
	 * @generated
	 * @ordered
	 */
	protected TDataServices dataServices;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final TVersion VERSION_EDEFAULT = TVersion._40;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected TVersion version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEdmxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmxPackage.Literals.TEDMX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TReference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<TReference>(TReference.class, this, EdmxPackage.TEDMX__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataServices getDataServices() {
		return dataServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataServices(TDataServices newDataServices, NotificationChain msgs) {
		TDataServices oldDataServices = dataServices;
		dataServices = newDataServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmxPackage.TEDMX__DATA_SERVICES, oldDataServices, newDataServices);
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
	public void setDataServices(TDataServices newDataServices) {
		if (newDataServices != dataServices) {
			NotificationChain msgs = null;
			if (dataServices != null)
				msgs = ((InternalEObject)dataServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmxPackage.TEDMX__DATA_SERVICES, null, msgs);
			if (newDataServices != null)
				msgs = ((InternalEObject)newDataServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmxPackage.TEDMX__DATA_SERVICES, null, msgs);
			msgs = basicSetDataServices(newDataServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmxPackage.TEDMX__DATA_SERVICES, newDataServices, newDataServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TVersion getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(TVersion newVersion) {
		TVersion oldVersion = version;
		version = newVersion == null ? VERSION_EDEFAULT : newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmxPackage.TEDMX__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		TVersion oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmxPackage.TEDMX__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmxPackage.TEDMX__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case EdmxPackage.TEDMX__DATA_SERVICES:
				return basicSetDataServices(null, msgs);
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
			case EdmxPackage.TEDMX__REFERENCE:
				return getReference();
			case EdmxPackage.TEDMX__DATA_SERVICES:
				return getDataServices();
			case EdmxPackage.TEDMX__VERSION:
				return getVersion();
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
			case EdmxPackage.TEDMX__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends TReference>)newValue);
				return;
			case EdmxPackage.TEDMX__DATA_SERVICES:
				setDataServices((TDataServices)newValue);
				return;
			case EdmxPackage.TEDMX__VERSION:
				setVersion((TVersion)newValue);
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
			case EdmxPackage.TEDMX__REFERENCE:
				getReference().clear();
				return;
			case EdmxPackage.TEDMX__DATA_SERVICES:
				setDataServices((TDataServices)null);
				return;
			case EdmxPackage.TEDMX__VERSION:
				unsetVersion();
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
			case EdmxPackage.TEDMX__REFERENCE:
				return reference != null && !reference.isEmpty();
			case EdmxPackage.TEDMX__DATA_SERVICES:
				return dataServices != null;
			case EdmxPackage.TEDMX__VERSION:
				return isSetVersion();
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
		result.append(" (version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TEdmxImpl
