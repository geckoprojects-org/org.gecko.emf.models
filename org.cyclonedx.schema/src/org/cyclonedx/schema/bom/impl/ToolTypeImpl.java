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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ExternalReferences;
import org.cyclonedx.schema.bom.HashesType2;
import org.cyclonedx.schema.bom.ToolType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolTypeImpl#getHashes <em>Hashes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolTypeImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ToolTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolTypeImpl extends MinimalEObjectImpl.Container implements ToolType {
	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHashes() <em>Hashes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashes()
	 * @generated
	 * @ordered
	 */
	protected HashesType2 hashes;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferences externalReferences;

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
	protected ToolTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getToolType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TOOL_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TOOL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TOOL_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashesType2 getHashes() {
		return hashes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHashes(HashesType2 newHashes, NotificationChain msgs) {
		HashesType2 oldHashes = hashes;
		hashes = newHashes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TOOL_TYPE__HASHES, oldHashes, newHashes);
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
	public void setHashes(HashesType2 newHashes) {
		if (newHashes != hashes) {
			NotificationChain msgs = null;
			if (hashes != null)
				msgs = ((InternalEObject)hashes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TOOL_TYPE__HASHES, null, msgs);
			if (newHashes != null)
				msgs = ((InternalEObject)newHashes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TOOL_TYPE__HASHES, null, msgs);
			msgs = basicSetHashes(newHashes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TOOL_TYPE__HASHES, newHashes, newHashes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReferences getExternalReferences() {
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalReferences(ExternalReferences newExternalReferences, NotificationChain msgs) {
		ExternalReferences oldExternalReferences = externalReferences;
		externalReferences = newExternalReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES, oldExternalReferences, newExternalReferences);
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
	public void setExternalReferences(ExternalReferences newExternalReferences) {
		if (newExternalReferences != externalReferences) {
			NotificationChain msgs = null;
			if (externalReferences != null)
				msgs = ((InternalEObject)externalReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES, null, msgs);
			if (newExternalReferences != null)
				msgs = ((InternalEObject)newExternalReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES, null, msgs);
			msgs = basicSetExternalReferences(newExternalReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES, newExternalReferences, newExternalReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.TOOL_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.TOOL_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.TOOL_TYPE__HASHES:
				return basicSetHashes(null, msgs);
			case BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES:
				return basicSetExternalReferences(null, msgs);
			case BOMPackage.TOOL_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.TOOL_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.TOOL_TYPE__VENDOR:
				return getVendor();
			case BOMPackage.TOOL_TYPE__NAME:
				return getName();
			case BOMPackage.TOOL_TYPE__VERSION:
				return getVersion();
			case BOMPackage.TOOL_TYPE__HASHES:
				return getHashes();
			case BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BOMPackage.TOOL_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.TOOL_TYPE__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.TOOL_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case BOMPackage.TOOL_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.TOOL_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case BOMPackage.TOOL_TYPE__HASHES:
				setHashes((HashesType2)newValue);
				return;
			case BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)newValue);
				return;
			case BOMPackage.TOOL_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.TOOL_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.TOOL_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case BOMPackage.TOOL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.TOOL_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BOMPackage.TOOL_TYPE__HASHES:
				setHashes((HashesType2)null);
				return;
			case BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)null);
				return;
			case BOMPackage.TOOL_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.TOOL_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.TOOL_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case BOMPackage.TOOL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.TOOL_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BOMPackage.TOOL_TYPE__HASHES:
				return hashes != null;
			case BOMPackage.TOOL_TYPE__EXTERNAL_REFERENCES:
				return externalReferences != null;
			case BOMPackage.TOOL_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.TOOL_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (vendor: ");
		result.append(vendor);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", any: ");
		result.append(any);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ToolTypeImpl
