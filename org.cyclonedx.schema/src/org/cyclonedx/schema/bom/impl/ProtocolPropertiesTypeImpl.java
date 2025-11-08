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
import org.cyclonedx.schema.bom.CipherSuitesType;
import org.cyclonedx.schema.bom.Ikev2TransformTypesType;
import org.cyclonedx.schema.bom.ProtocolPropertiesType;
import org.cyclonedx.schema.bom.TypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ProtocolPropertiesTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ProtocolPropertiesTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ProtocolPropertiesTypeImpl#getCipherSuites <em>Cipher Suites</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ProtocolPropertiesTypeImpl#getIkev2TransformTypes <em>Ikev2 Transform Types</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ProtocolPropertiesTypeImpl#getCryptoRef <em>Crypto Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolPropertiesTypeImpl extends MinimalEObjectImpl.Container implements ProtocolPropertiesType {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.TLS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	 * The cached value of the '{@link #getCipherSuites() <em>Cipher Suites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherSuites()
	 * @generated
	 * @ordered
	 */
	protected CipherSuitesType cipherSuites;

	/**
	 * The cached value of the '{@link #getIkev2TransformTypes() <em>Ikev2 Transform Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIkev2TransformTypes()
	 * @generated
	 * @ordered
	 */
	protected Ikev2TransformTypesType ikev2TransformTypes;

	/**
	 * The cached value of the '{@link #getCryptoRef() <em>Crypto Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoRef()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cryptoRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getProtocolPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PROTOCOL_PROPERTIES_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.PROTOCOL_PROPERTIES_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PROTOCOL_PROPERTIES_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherSuitesType getCipherSuites() {
		return cipherSuites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCipherSuites(CipherSuitesType newCipherSuites, NotificationChain msgs) {
		CipherSuitesType oldCipherSuites = cipherSuites;
		cipherSuites = newCipherSuites;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES, oldCipherSuites, newCipherSuites);
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
	public void setCipherSuites(CipherSuitesType newCipherSuites) {
		if (newCipherSuites != cipherSuites) {
			NotificationChain msgs = null;
			if (cipherSuites != null)
				msgs = ((InternalEObject)cipherSuites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES, null, msgs);
			if (newCipherSuites != null)
				msgs = ((InternalEObject)newCipherSuites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES, null, msgs);
			msgs = basicSetCipherSuites(newCipherSuites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES, newCipherSuites, newCipherSuites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ikev2TransformTypesType getIkev2TransformTypes() {
		return ikev2TransformTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIkev2TransformTypes(Ikev2TransformTypesType newIkev2TransformTypes, NotificationChain msgs) {
		Ikev2TransformTypesType oldIkev2TransformTypes = ikev2TransformTypes;
		ikev2TransformTypes = newIkev2TransformTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES, oldIkev2TransformTypes, newIkev2TransformTypes);
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
	public void setIkev2TransformTypes(Ikev2TransformTypesType newIkev2TransformTypes) {
		if (newIkev2TransformTypes != ikev2TransformTypes) {
			NotificationChain msgs = null;
			if (ikev2TransformTypes != null)
				msgs = ((InternalEObject)ikev2TransformTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES, null, msgs);
			if (newIkev2TransformTypes != null)
				msgs = ((InternalEObject)newIkev2TransformTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES, null, msgs);
			msgs = basicSetIkev2TransformTypes(newIkev2TransformTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES, newIkev2TransformTypes, newIkev2TransformTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCryptoRef() {
		if (cryptoRef == null) {
			cryptoRef = new EDataTypeEList<String>(String.class, this, BOMPackage.PROTOCOL_PROPERTIES_TYPE__CRYPTO_REF);
		}
		return cryptoRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES:
				return basicSetCipherSuites(null, msgs);
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES:
				return basicSetIkev2TransformTypes(null, msgs);
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
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__TYPE:
				return getType();
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__VERSION:
				return getVersion();
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES:
				return getCipherSuites();
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES:
				return getIkev2TransformTypes();
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CRYPTO_REF:
				return getCryptoRef();
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
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES:
				setCipherSuites((CipherSuitesType)newValue);
				return;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES:
				setIkev2TransformTypes((Ikev2TransformTypesType)newValue);
				return;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CRYPTO_REF:
				getCryptoRef().clear();
				getCryptoRef().addAll((Collection<? extends String>)newValue);
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
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__TYPE:
				unsetType();
				return;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES:
				setCipherSuites((CipherSuitesType)null);
				return;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES:
				setIkev2TransformTypes((Ikev2TransformTypesType)null);
				return;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CRYPTO_REF:
				getCryptoRef().clear();
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
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__TYPE:
				return isSetType();
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES:
				return cipherSuites != null;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES:
				return ikev2TransformTypes != null;
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE__CRYPTO_REF:
				return cryptoRef != null && !cryptoRef.isEmpty();
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
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", version: ");
		result.append(version);
		result.append(", cryptoRef: ");
		result.append(cryptoRef);
		result.append(')');
		return result.toString();
	}

} //ProtocolPropertiesTypeImpl
