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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openmicroscopy.ome.BinaryOnlyType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Only Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.BinaryOnlyTypeImpl#getMetadataFile <em>Metadata File</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.BinaryOnlyTypeImpl#getUUID <em>UUID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryOnlyTypeImpl extends MinimalEObjectImpl.Container implements BinaryOnlyType {
	/**
	 * The default value of the '{@link #getMetadataFile() <em>Metadata File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFile()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadataFile() <em>Metadata File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFile()
	 * @generated
	 * @ordered
	 */
	protected String metadataFile = METADATA_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected String uUID = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOnlyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getBinaryOnlyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetadataFile() {
		return metadataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadataFile(String newMetadataFile) {
		String oldMetadataFile = metadataFile;
		metadataFile = newMetadataFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_ONLY_TYPE__METADATA_FILE, oldMetadataFile, metadataFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUUID() {
		return uUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUUID(String newUUID) {
		String oldUUID = uUID;
		uUID = newUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_ONLY_TYPE__UUID, oldUUID, uUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.BINARY_ONLY_TYPE__METADATA_FILE:
				return getMetadataFile();
			case OMEPackage.BINARY_ONLY_TYPE__UUID:
				return getUUID();
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
			case OMEPackage.BINARY_ONLY_TYPE__METADATA_FILE:
				setMetadataFile((String)newValue);
				return;
			case OMEPackage.BINARY_ONLY_TYPE__UUID:
				setUUID((String)newValue);
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
			case OMEPackage.BINARY_ONLY_TYPE__METADATA_FILE:
				setMetadataFile(METADATA_FILE_EDEFAULT);
				return;
			case OMEPackage.BINARY_ONLY_TYPE__UUID:
				setUUID(UUID_EDEFAULT);
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
			case OMEPackage.BINARY_ONLY_TYPE__METADATA_FILE:
				return METADATA_FILE_EDEFAULT == null ? metadataFile != null : !METADATA_FILE_EDEFAULT.equals(metadataFile);
			case OMEPackage.BINARY_ONLY_TYPE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
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
		result.append(" (metadataFile: ");
		result.append(metadataFile);
		result.append(", uUID: ");
		result.append(uUID);
		result.append(')');
		return result.toString();
	}

} //BinaryOnlyTypeImpl
