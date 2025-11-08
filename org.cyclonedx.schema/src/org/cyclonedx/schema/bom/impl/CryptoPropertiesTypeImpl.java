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

import org.cyclonedx.schema.bom.AlgorithmPropertiesType;
import org.cyclonedx.schema.bom.AssetTypeType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CertificatePropertiesType;
import org.cyclonedx.schema.bom.CryptoPropertiesType;
import org.cyclonedx.schema.bom.ProtocolPropertiesType;
import org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crypto Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CryptoPropertiesTypeImpl#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CryptoPropertiesTypeImpl#getAlgorithmProperties <em>Algorithm Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CryptoPropertiesTypeImpl#getCertificateProperties <em>Certificate Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CryptoPropertiesTypeImpl#getRelatedCryptoMaterialProperties <em>Related Crypto Material Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CryptoPropertiesTypeImpl#getProtocolProperties <em>Protocol Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CryptoPropertiesTypeImpl#getOid <em>Oid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CryptoPropertiesTypeImpl extends MinimalEObjectImpl.Container implements CryptoPropertiesType {
	/**
	 * The default value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected static final AssetTypeType ASSET_TYPE_EDEFAULT = AssetTypeType.ALGORITHM;

	/**
	 * The cached value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected AssetTypeType assetType = ASSET_TYPE_EDEFAULT;

	/**
	 * This is true if the Asset Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean assetTypeESet;

	/**
	 * The cached value of the '{@link #getAlgorithmProperties() <em>Algorithm Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmProperties()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmPropertiesType algorithmProperties;

	/**
	 * The cached value of the '{@link #getCertificateProperties() <em>Certificate Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateProperties()
	 * @generated
	 * @ordered
	 */
	protected CertificatePropertiesType certificateProperties;

	/**
	 * The cached value of the '{@link #getRelatedCryptoMaterialProperties() <em>Related Crypto Material Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedCryptoMaterialProperties()
	 * @generated
	 * @ordered
	 */
	protected RelatedCryptoMaterialPropertiesType relatedCryptoMaterialProperties;

	/**
	 * The cached value of the '{@link #getProtocolProperties() <em>Protocol Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolProperties()
	 * @generated
	 * @ordered
	 */
	protected ProtocolPropertiesType protocolProperties;

	/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final String OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected String oid = OID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CryptoPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getCryptoPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetTypeType getAssetType() {
		return assetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetType(AssetTypeType newAssetType) {
		AssetTypeType oldAssetType = assetType;
		assetType = newAssetType == null ? ASSET_TYPE_EDEFAULT : newAssetType;
		boolean oldAssetTypeESet = assetTypeESet;
		assetTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__ASSET_TYPE, oldAssetType, assetType, !oldAssetTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAssetType() {
		AssetTypeType oldAssetType = assetType;
		boolean oldAssetTypeESet = assetTypeESet;
		assetType = ASSET_TYPE_EDEFAULT;
		assetTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.CRYPTO_PROPERTIES_TYPE__ASSET_TYPE, oldAssetType, ASSET_TYPE_EDEFAULT, oldAssetTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAssetType() {
		return assetTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmPropertiesType getAlgorithmProperties() {
		return algorithmProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithmProperties(AlgorithmPropertiesType newAlgorithmProperties, NotificationChain msgs) {
		AlgorithmPropertiesType oldAlgorithmProperties = algorithmProperties;
		algorithmProperties = newAlgorithmProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES, oldAlgorithmProperties, newAlgorithmProperties);
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
	public void setAlgorithmProperties(AlgorithmPropertiesType newAlgorithmProperties) {
		if (newAlgorithmProperties != algorithmProperties) {
			NotificationChain msgs = null;
			if (algorithmProperties != null)
				msgs = ((InternalEObject)algorithmProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES, null, msgs);
			if (newAlgorithmProperties != null)
				msgs = ((InternalEObject)newAlgorithmProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES, null, msgs);
			msgs = basicSetAlgorithmProperties(newAlgorithmProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES, newAlgorithmProperties, newAlgorithmProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertificatePropertiesType getCertificateProperties() {
		return certificateProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificateProperties(CertificatePropertiesType newCertificateProperties, NotificationChain msgs) {
		CertificatePropertiesType oldCertificateProperties = certificateProperties;
		certificateProperties = newCertificateProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES, oldCertificateProperties, newCertificateProperties);
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
	public void setCertificateProperties(CertificatePropertiesType newCertificateProperties) {
		if (newCertificateProperties != certificateProperties) {
			NotificationChain msgs = null;
			if (certificateProperties != null)
				msgs = ((InternalEObject)certificateProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES, null, msgs);
			if (newCertificateProperties != null)
				msgs = ((InternalEObject)newCertificateProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES, null, msgs);
			msgs = basicSetCertificateProperties(newCertificateProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES, newCertificateProperties, newCertificateProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedCryptoMaterialPropertiesType getRelatedCryptoMaterialProperties() {
		return relatedCryptoMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedCryptoMaterialProperties(RelatedCryptoMaterialPropertiesType newRelatedCryptoMaterialProperties, NotificationChain msgs) {
		RelatedCryptoMaterialPropertiesType oldRelatedCryptoMaterialProperties = relatedCryptoMaterialProperties;
		relatedCryptoMaterialProperties = newRelatedCryptoMaterialProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES, oldRelatedCryptoMaterialProperties, newRelatedCryptoMaterialProperties);
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
	public void setRelatedCryptoMaterialProperties(RelatedCryptoMaterialPropertiesType newRelatedCryptoMaterialProperties) {
		if (newRelatedCryptoMaterialProperties != relatedCryptoMaterialProperties) {
			NotificationChain msgs = null;
			if (relatedCryptoMaterialProperties != null)
				msgs = ((InternalEObject)relatedCryptoMaterialProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES, null, msgs);
			if (newRelatedCryptoMaterialProperties != null)
				msgs = ((InternalEObject)newRelatedCryptoMaterialProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES, null, msgs);
			msgs = basicSetRelatedCryptoMaterialProperties(newRelatedCryptoMaterialProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES, newRelatedCryptoMaterialProperties, newRelatedCryptoMaterialProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolPropertiesType getProtocolProperties() {
		return protocolProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocolProperties(ProtocolPropertiesType newProtocolProperties, NotificationChain msgs) {
		ProtocolPropertiesType oldProtocolProperties = protocolProperties;
		protocolProperties = newProtocolProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES, oldProtocolProperties, newProtocolProperties);
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
	public void setProtocolProperties(ProtocolPropertiesType newProtocolProperties) {
		if (newProtocolProperties != protocolProperties) {
			NotificationChain msgs = null;
			if (protocolProperties != null)
				msgs = ((InternalEObject)protocolProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES, null, msgs);
			if (newProtocolProperties != null)
				msgs = ((InternalEObject)newProtocolProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES, null, msgs);
			msgs = basicSetProtocolProperties(newProtocolProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES, newProtocolProperties, newProtocolProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOid() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOid(String newOid) {
		String oldOid = oid;
		oid = newOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CRYPTO_PROPERTIES_TYPE__OID, oldOid, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES:
				return basicSetAlgorithmProperties(null, msgs);
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES:
				return basicSetCertificateProperties(null, msgs);
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES:
				return basicSetRelatedCryptoMaterialProperties(null, msgs);
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES:
				return basicSetProtocolProperties(null, msgs);
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
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ASSET_TYPE:
				return getAssetType();
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES:
				return getAlgorithmProperties();
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES:
				return getCertificateProperties();
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES:
				return getRelatedCryptoMaterialProperties();
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES:
				return getProtocolProperties();
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__OID:
				return getOid();
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
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ASSET_TYPE:
				setAssetType((AssetTypeType)newValue);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES:
				setAlgorithmProperties((AlgorithmPropertiesType)newValue);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES:
				setCertificateProperties((CertificatePropertiesType)newValue);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES:
				setRelatedCryptoMaterialProperties((RelatedCryptoMaterialPropertiesType)newValue);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES:
				setProtocolProperties((ProtocolPropertiesType)newValue);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__OID:
				setOid((String)newValue);
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
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ASSET_TYPE:
				unsetAssetType();
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES:
				setAlgorithmProperties((AlgorithmPropertiesType)null);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES:
				setCertificateProperties((CertificatePropertiesType)null);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES:
				setRelatedCryptoMaterialProperties((RelatedCryptoMaterialPropertiesType)null);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES:
				setProtocolProperties((ProtocolPropertiesType)null);
				return;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__OID:
				setOid(OID_EDEFAULT);
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
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ASSET_TYPE:
				return isSetAssetType();
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES:
				return algorithmProperties != null;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES:
				return certificateProperties != null;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES:
				return relatedCryptoMaterialProperties != null;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES:
				return protocolProperties != null;
			case BOMPackage.CRYPTO_PROPERTIES_TYPE__OID:
				return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT.equals(oid);
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
		result.append(" (assetType: ");
		if (assetTypeESet) result.append(assetType); else result.append("<unset>");
		result.append(", oid: ");
		result.append(oid);
		result.append(')');
		return result.toString();
	}

} //CryptoPropertiesTypeImpl
